package io.renren.modules.proxyApi.controller;

import io.renren.common.annotation.LogOperation;
import io.renren.common.constant.Constant;
import io.renren.common.page.PageData;
import io.renren.common.utils.ExcelUtils;
import io.renren.common.utils.Result;
import io.renren.common.validator.AssertUtils;
import io.renren.common.validator.ValidatorUtils;
import io.renren.common.validator.group.AddGroup;
import io.renren.common.validator.group.DefaultGroup;
import io.renren.common.validator.group.UpdateGroup;
import io.renren.modules.proxyApi.dto.RcpCourseEvaluationDTO;
import io.renren.modules.proxyApi.excel.RcpCourseEvaluationExcel;
import io.renren.modules.proxyApi.service.RcpCourseEvaluationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
* 课程评论
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-25
*/
@RestController
@RequestMapping("proxyApi/rcpcourseevaluation")
@Api(tags="课程评论")
public class RcpCourseEvaluationController {
    @Autowired
    private RcpCourseEvaluationService rcpCourseEvaluationService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("proxyApi:rcpcourseevaluation:page")
    public Result<PageData<RcpCourseEvaluationDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<RcpCourseEvaluationDTO> page = rcpCourseEvaluationService.page(params);

        return new Result<PageData<RcpCourseEvaluationDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("proxyApi:rcpcourseevaluation:info")
    public Result<RcpCourseEvaluationDTO> get(@PathVariable("id") Long id){
        RcpCourseEvaluationDTO data = rcpCourseEvaluationService.get(id);

        return new Result<RcpCourseEvaluationDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("proxyApi:rcpcourseevaluation:save")
    public Result save(@RequestBody RcpCourseEvaluationDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        rcpCourseEvaluationService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("proxyApi:rcpcourseevaluation:update")
    public Result update(@RequestBody RcpCourseEvaluationDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        rcpCourseEvaluationService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("proxyApi:rcpcourseevaluation:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        rcpCourseEvaluationService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("proxyApi:rcpcourseevaluation:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<RcpCourseEvaluationDTO> list = rcpCourseEvaluationService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "课程评论", list, RcpCourseEvaluationExcel.class);
    }

}