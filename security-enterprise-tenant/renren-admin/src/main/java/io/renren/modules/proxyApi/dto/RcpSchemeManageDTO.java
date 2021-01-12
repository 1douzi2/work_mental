package io.renren.modules.proxyApi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 方案管理
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-25
*/
@Data
@ApiModel(value = "方案管理")
public class RcpSchemeManageDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;
    @ApiModelProperty(value = "方案名称")
    private String name;
    @ApiModelProperty(value = "用户id")
    private Long userid;
    @ApiModelProperty(value = "用户名称")
    private String username;
    @ApiModelProperty(value = "训练次数")
    private Integer traintimes;
    @ApiModelProperty(value = "创建者")
    private String creator;
    @ApiModelProperty(value = "创建时间")
    private Date createDate;
    @ApiModelProperty(value = "更新者")
    private String updater;
    @ApiModelProperty(value = "更新日期")
    private Date updateDate;
    private Long tenantCode;

}