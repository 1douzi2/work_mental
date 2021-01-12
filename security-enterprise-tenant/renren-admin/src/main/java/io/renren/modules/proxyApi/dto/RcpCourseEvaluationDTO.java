package io.renren.modules.proxyApi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 课程评论
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-25
*/
@Data
@ApiModel(value = "课程评论")
public class RcpCourseEvaluationDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    @ApiModelProperty(value = "昵称")
    private String userNickname;
    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "订单编号")
    private Integer orderNum;
    @ApiModelProperty(value = "课程名称")
    private String courseName;
    @ApiModelProperty(value = "课程分类")
    private String courseCategory;
    @ApiModelProperty(value = "评价")
    private Double evaluation;
    @ApiModelProperty(value = "ip地址")
    private String ipAddress;
    @ApiModelProperty(value = "评论时间")
    private Date createDate;
    @ApiModelProperty(value = "是否显示")
    private Integer isShow;
    private String creator;
    private String updater;
    private Date updateDate;
    private Long tenantCode;

}