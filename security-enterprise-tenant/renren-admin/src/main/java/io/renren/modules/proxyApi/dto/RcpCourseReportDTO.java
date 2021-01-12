package io.renren.modules.proxyApi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 课程举报
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-25
*/
@Data
@ApiModel(value = "课程举报")
public class RcpCourseReportDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    @ApiModelProperty(value = "举报人")
    private String reporter;
    private Date createDate;
    @ApiModelProperty(value = "举报对象")
    private String reportTarget;
    @ApiModelProperty(value = "状态")
    private Integer status;
    @ApiModelProperty(value = "处理结果")
    private String result;
    @ApiModelProperty(value = "举报内容")
    private String content;
    @ApiModelProperty(value = "联系电话")
    private String phone;
    @ApiModelProperty(value = "处理人")
    private String dealer;
    @ApiModelProperty(value = "处理时间")
    private Date dealTime;
    @ApiModelProperty(value = "处理备注")
    private String remark;
    private String creator;
    private String updater;
    private Date updateDate;
    private Long tenantCode;

}