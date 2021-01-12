package io.renren.modules.proxyApi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 阳光热线-档案管理-档案列表
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-26
*/
@Data
@ApiModel(value = "阳光热线-档案管理-档案列表")
public class RcpLinefilelistDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;
    @ApiModelProperty(value = "客户姓名")
    private String name;
    @ApiModelProperty(value = "手机号")
    private String telephone;
    @ApiModelProperty(value = "客服工号")
    private String servicenum;
    @ApiModelProperty(value = "状态 0正常1异常")
    private Integer status;
    @ApiModelProperty(value = "创建人")
    private String creator;
    @ApiModelProperty(value = "创建时间")
    private Date createDate;
    @ApiModelProperty(value = "更新人")
    private String updater;
    @ApiModelProperty(value = "更新时间")
    private Date updateDate;
    private Long tenantCode;

}