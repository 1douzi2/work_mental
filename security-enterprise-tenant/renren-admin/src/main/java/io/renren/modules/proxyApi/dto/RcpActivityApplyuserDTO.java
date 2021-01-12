package io.renren.modules.proxyApi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 报名用户
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-24
*/
@Data
@ApiModel(value = "报名用户")
public class RcpActivityApplyuserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
    private Long id;
    @ApiModelProperty(value = "用户名称")
    private String username;
    @ApiModelProperty(value = "手机号")
    private String phone;
    @ApiModelProperty(value = "签到状态")
    private String status;
    @ApiModelProperty(value = "报名时间")
    private Date applyTime;
    private Long tenantCode;
    @ApiModelProperty(value = "创建者")
    private String creator;
    @ApiModelProperty(value = "创建时间")
    private Date createDate;
    @ApiModelProperty(value = "更新者")
    private String updater;
    @ApiModelProperty(value = "更新时间")
    private Date updateDate;

}