package io.renren.modules.proxyApi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 阳光热线-档案管理-来访者管理
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-26
*/
@Data
@ApiModel(value = "阳光热线-档案管理-来访者管理")
public class RcpLinevisitorslistDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;
    @ApiModelProperty(value = "来访者姓名")
    private String name;
    @ApiModelProperty(value = "开始访问时间")
    private Date starttime;
    @ApiModelProperty(value = "结束访问时间")
    private Date endtime;
    @ApiModelProperty(value = "客服工号")
    private String servicenum;
    @ApiModelProperty(value = "状态0正常 1异常")
    private Integer status;
    @ApiModelProperty(value = "创建者")
    private String creator;
    @ApiModelProperty(value = "创建时间")
    private Date createDate;
    @ApiModelProperty(value = "更新者")
    private String updater;
    @ApiModelProperty(value = "更新时间")
    private Date updateDate;
    private Long tenantCode;

}