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
import io.renren.modules.proxyApi.dto.RcpActivityApplyuserDTO;
import io.renren.modules.proxyApi.excel.RcpActivityApplyuserExcel;
import io.renren.modules.proxyApi.service.RcpActivityApplyuserService;
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
* 报名用户
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-24
*/
@RestController
@RequestMapping("proxyApi/rcpactivityapplyuser")
@Api(tags="报名用户")
public class RcpActivityApplyuserController {
    @Autowired
    private RcpActivityApplyuserService rcpActivityApplyuserService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("proxyApi:rcpactivityapplyuser:page")
    public Result<PageData<RcpActivityApplyuserDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<RcpActivityApplyuserDTO> page = rcpActivityApplyuserService.page(params);

        return new Result<PageData<RcpActivityApplyuserDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("proxyApi:rcpactivityapplyuser:info")
    public Result<RcpActivityApplyuserDTO> get(@PathVariable("id") Long id){
        RcpActivityApplyuserDTO data = rcpActivityApplyuserService.get(id);

        return new Result<RcpActivityApplyuserDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("proxyApi:rcpactivityapplyuser:save")
    public Result save(@RequestBody RcpActivityApplyuserDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        rcpActivityApplyuserService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("proxyApi:rcpactivityapplyuser:update")
    public Result update(@RequestBody RcpActivityApplyuserDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        rcpActivityApplyuserService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("proxyApi:rcpactivityapplyuser:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        rcpActivityApplyuserService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("proxyApi:rcpactivityapplyuser:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<RcpActivityApplyuserDTO> list = rcpActivityApplyuserService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "报名用户", list, RcpActivityApplyuserExcel.class);
    }

}