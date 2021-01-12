package io.renren.modules.proxyApi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 活动列表
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-25
*/
@Data
@ApiModel(value = "活动列表")
public class RcpActivityDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;
    @ApiModelProperty(value = "活动名称")
    private String name;
    @ApiModelProperty(value = "分类id")
    private String classifyId;
    @ApiModelProperty(value = "活动状态")
    private String actStatus;
    @ApiModelProperty(value = "报名状态")
    private String applyStatus;
    @ApiModelProperty(value = "创建者")
    private String creator;
    @ApiModelProperty(value = "创建时间")
    private Date createDate;
    @ApiModelProperty(value = "更新者")
    private String updater;
    @ApiModelProperty(value = "更新时间")
    private Date updateDate;
    @ApiModelProperty(value = "报名人数")
    private Integer applyNum;
    @ApiModelProperty(value = "浏览人数")
    private Integer visitorNum;
    @ApiModelProperty(value = "活动开始时间")
    private Date actStartTime;
    @ApiModelProperty(value = "活动结束时间")
    private Date actEndTime;
    @ApiModelProperty(value = "报名开始时间")
    private Date applyStartTime;
    @ApiModelProperty(value = "报名结束时间")
    private Date applyEndTime;
    @ApiModelProperty(value = "详细描述")
    private String description;
    private Long tenantCode;
    @ApiModelProperty(value = "活动海报")
    private String image;
    @ApiModelProperty(value = "参与专家团队")
    private String expertTeam;
    @ApiModelProperty(value = "省")
    private String province;
    @ApiModelProperty(value = "市")
    private String city;
    @ApiModelProperty(value = "区")
    private String area;
    @ApiModelProperty(value = "详细地址")
    private String detailedLocation;

}