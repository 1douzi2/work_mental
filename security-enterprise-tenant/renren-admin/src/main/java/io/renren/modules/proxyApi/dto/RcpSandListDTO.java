package io.renren.modules.proxyApi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 沙盘列表
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2021-01-09
*/
@Data
@ApiModel(value = "沙盘列表")
public class RcpSandListDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    @ApiModelProperty(value = "添加人")
    private String person;
    @ApiModelProperty(value = "预警图标")
    private String warningIcon;
    @ApiModelProperty(value = "预警等级")
    private String warningLevel;
    @ApiModelProperty(value = "状态")
    private String state;
    @ApiModelProperty(value = "创建时间")
    private Date time;
    @ApiModelProperty(value = "排序")
    private Integer sort;
    @ApiModelProperty(value = "使用时间")
    private String usedTime;
    @ApiModelProperty(value = "沙具数量")
    private Integer toysNum ;
    @ApiModelProperty(value = "视频地址")
    private String mvUrl;
    @ApiModelProperty(value = "移动次数")
    private Integer moveNum ;
    private Long tenantCode;

}