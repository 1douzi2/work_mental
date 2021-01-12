package io.renren.modules.proxyApi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
* 视频课程
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-25
*/
@Data
@ApiModel(value = "视频课程")
public class RcpVideoCourseDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    @ApiModelProperty(value = "课程主题")
    private String title;
    @ApiModelProperty(value = "副标题")
    private String secondTitle;
    @ApiModelProperty(value = "封面图片")
    private String imgUrl;
    @ApiModelProperty(value = "分类id")
    private Integer categoryId;
    @ApiModelProperty(value = "是否推荐")
    private Integer isRecommend;
    @ApiModelProperty(value = "是否显示")
    private Integer isShow;
    @ApiModelProperty(value = "视频地址")
    private String videoUrl;
    @ApiModelProperty(value = "上架状态")
    private Integer shelfStatus;
    @ApiModelProperty(value = "价格")
    private BigDecimal price;
    @ApiModelProperty(value = "目录")
    private String menu;
    @ApiModelProperty(value = "详情")
    private String detail;
    @ApiModelProperty(value = "分类名称")
    private String categoryName;
    private Date createDate;
    private String creator;
    private String updater;
    private Date updateDate;
    private Long tenantCode;

}