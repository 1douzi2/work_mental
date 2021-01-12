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
import io.renren.modules.proxyApi.dto.RcpSandListDTO;
import io.renren.modules.proxyApi.dto.RcpSandPicDTO;
import io.renren.modules.proxyApi.entity.RcpSandPicEntity;
import io.renren.modules.proxyApi.entity.RcpSandQuestionAnswerEntity;
import io.renren.modules.proxyApi.excel.RcpSandListExcel;
import io.renren.modules.proxyApi.service.RcpSandListService;
import io.renren.modules.proxyApi.service.RcpSandPicService;
import io.renren.modules.proxyApi.service.RcpSandQuestionAnswerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.velocity.runtime.directive.Foreach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
* 沙盘列表
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2021-01-09
*/
@RestController
@RequestMapping("proxyApi/rcpsandlist")
@Api(tags="沙盘列表")
public class RcpSandListController {
    @Autowired
    private RcpSandListService rcpSandListService;
    @Autowired
    private RcpSandPicService rcpSandPicService;
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
    @RequiresPermissions("proxyApi:rcpsandlist:page")
    public Result<PageData<RcpSandListDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<RcpSandListDTO> page = rcpSandListService.page(params);

        return new Result<PageData<RcpSandListDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("proxyApi:rcpsandlist:info")
    public Result<RcpSandListDTO> get(@PathVariable("id") Long id){
        RcpSandListDTO data = rcpSandListService.get(id);

        return new Result<RcpSandListDTO>().ok(data);
    }
//
    @GetMapping("getPic")
    public List<RcpSandPicEntity> getPic()
    {
       List<RcpSandPicEntity> pic=rcpSandPicService.rcpSandPic();
        return pic;
    }

//
    @GetMapping("getAnswer")
    public List<RcpSandQuestionAnswerEntity> getAnwser()
    {
        List<RcpSandQuestionAnswerEntity> answer=rcpSandQuestionAnswerService.sandQuestionAnswer();
       StringBuffer sb=new StringBuffer();
        for (RcpSandQuestionAnswerEntity r:answer
             ) {sb.append(r.getAnswer());

        }
        return answer;
    }
//
//    @GetMapping("getSand")
//    public List<rcpsand>
//

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("proxyApi:rcpsandlist:save")
    public Result save(@RequestBody RcpSandListDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        rcpSandListService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("proxyApi:rcpsandlist:update")
    public Result update(@RequestBody RcpSandListDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        rcpSandListService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("proxyApi:rcpsandlist:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        rcpSandListService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("proxyApi:rcpsandlist:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<RcpSandListDTO> list = rcpSandListService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "沙盘列表", list, RcpSandListExcel.class);
    }

}