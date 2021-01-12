package io.renren.modules.proxyApi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 阳光热线-考勤记录
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-26
*/
@Data
@ApiModel(value = "阳光热线-考勤记录")
public class RcpLineattendanceDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "异常原因")
    private Long id;
    @ApiModelProperty(value = "签到时间")
    private Date checktime;
    @ApiModelProperty(value = "异常日期")
    private Date unusualdate;
    @ApiModelProperty(value = "异常原因")
    private String reason;
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