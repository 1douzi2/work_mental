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
import io.renren.modules.proxyApi.dto.RcpSandQuestionAnswerDTO;
import io.renren.modules.proxyApi.excel.RcpSandQuestionAnswerExcel;
import io.renren.modules.proxyApi.service.RcpSandQuestionAnswerService;
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
* 问题的回答表
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2021-01-11
*/
@RestController
@RequestMapping("proxyApi/rcpsandquestionanswer")
@Api(tags="问题的回答表")
public class RcpSandQuestionAnswerController {
    @Autowired
    private RcpSandQuestionAnswerService rcpSandQuestionAnswerService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("proxyApi:rcpsandquestionanswer:page")
    public Result<PageData<RcpSandQuestionAnswerDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<RcpSandQuestionAnswerDTO> page = rcpSandQuestionAnswerService.page(params);

        return new Result<PageData<RcpSandQuestionAnswerDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("proxyApi:rcpsandquestionanswer:info")
    public Result<RcpSandQuestionAnswerDTO> get(@PathVariable("id") Long id){
        RcpSandQuestionAnswerDTO data = rcpSandQuestionAnswerService.get(id);

        return new Result<RcpSandQuestionAnswerDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("proxyApi:rcpsandquestionanswer:save")
    public Result save(@RequestBody RcpSandQuestionAnswerDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        rcpSandQuestionAnswerService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("proxyApi:rcpsandquestionanswer:update")
    public Result update(@RequestBody RcpSandQuestionAnswerDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        rcpSandQuestionAnswerService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("proxyApi:rcpsandquestionanswer:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        rcpSandQuestionAnswerService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("proxyApi:rcpsandquestionanswer:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<RcpSandQuestionAnswerDTO> list = rcpSandQuestionAnswerService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "问题的回答表", list, RcpSandQuestionAnswerExcel.class);
    }

}