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
import io.renren.modules.proxyApi.dto.RcpSandSceneDTO;
import io.renren.modules.proxyApi.excel.RcpSandSceneExcel;
import io.renren.modules.proxyApi.service.RcpSandSceneService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.*;


/**
* 沙盘场景维护
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-12-28
*/
@RestController
@RequestMapping("proxyApi/rcpsandscene")
@Api(tags="沙盘场景维护")
public class RcpSandSceneController {
    @Autowired
    private RcpSandSceneService rcpSandSceneService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("proxyApi:rcpsandscene:page")
    public Result<PageData<RcpSandSceneDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<RcpSandSceneDTO> page = rcpSandSceneService.page(params);
//        Collection search=params.values();
//        List search1= new ArrayList(search);
//        String name= (String) search1.get(4);

//        System.out.println("----------------------------"+ name);

        return new Result<PageData<RcpSandSceneDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("proxyApi:rcpsandscene:info")
    public Result<RcpSandSceneDTO> get(@PathVariable("id") Long id){
        RcpSandSceneDTO data = rcpSandSceneService.get(id);

        return new Result<RcpSandSceneDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("proxyApi:rcpsandscene:save")
    public Result save(@RequestBody RcpSandSceneDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        rcpSandSceneService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("proxyApi:rcpsandscene:update")
    public Result update(@RequestBody RcpSandSceneDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        rcpSandSceneService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("proxyApi:rcpsandscene:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        rcpSandSceneService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("proxyApi:rcpsandscene:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<RcpSandSceneDTO> list = rcpSandSceneService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "沙盘场景维护", list, RcpSandSceneExcel.class);
    }

}