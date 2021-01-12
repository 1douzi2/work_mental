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
import io.renren.modules.proxyApi.dto.RcpLinefilelistDTO;
import io.renren.modules.proxyApi.excel.RcpLinefilelistExcel;
import io.renren.modules.proxyApi.service.RcpLinefilelistService;
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
* 阳光热线-档案管理-档案列表
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-26
*/
@RestController
@RequestMapping("proxyApi/rcplinefilelist")
@Api(tags="阳光热线-档案管理-档案列表")
public class RcpLinefilelistController {
    @Autowired
    private RcpLinefilelistService rcpLinefilelistService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("proxyApi:rcplinefilelist:page")
    public Result<PageData<RcpLinefilelistDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<RcpLinefilelistDTO> page = rcpLinefilelistService.page(params);

        return new Result<PageData<RcpLinefilelistDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("proxyApi:rcplinefilelist:info")
    public Result<RcpLinefilelistDTO> get(@PathVariable("id") Long id){
        RcpLinefilelistDTO data = rcpLinefilelistService.get(id);

        return new Result<RcpLinefilelistDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("proxyApi:rcplinefilelist:save")
    public Result save(@RequestBody RcpLinefilelistDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        rcpLinefilelistService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("proxyApi:rcplinefilelist:update")
    public Result update(@RequestBody RcpLinefilelistDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        rcpLinefilelistService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("proxyApi:rcplinefilelist:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        rcpLinefilelistService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("proxyApi:rcplinefilelist:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<RcpLinefilelistDTO> list = rcpLinefilelistService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "阳光热线-档案管理-档案列表", list, RcpLinefilelistExcel.class);
    }

}