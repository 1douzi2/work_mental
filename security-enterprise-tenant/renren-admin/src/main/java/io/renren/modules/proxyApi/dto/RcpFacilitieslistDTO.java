package io.renren.modules.proxyApi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 设备列表
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-25
*/
@Data
@ApiModel(value = "设备列表")
public class RcpFacilitieslistDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;
    @ApiModelProperty(value = "设备名称")
    private String name;
    @ApiModelProperty(value = "设备图片")
    private String image;
    @ApiModelProperty(value = "设备类型")
    private Integer type;
    @ApiModelProperty(value = "联接租户")
    private Integer connectuser;
    @ApiModelProperty(value = "在线设备")
    private Integer online;
    @ApiModelProperty(value = "状态")
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
