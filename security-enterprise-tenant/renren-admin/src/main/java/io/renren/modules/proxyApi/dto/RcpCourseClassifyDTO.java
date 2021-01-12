package io.renren.modules.proxyApi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 视频课程分类
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-25
*/
@Data
@ApiModel(value = "视频课程分类")
public class RcpCourseClassifyDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    @ApiModelProperty(value = "分类图标")
    private String img;
    @ApiModelProperty(value = "分类名称")
    private String categoryName;
    private Date createDate;
    @ApiModelProperty(value = "是否显示")
    private Integer isShow;
    @ApiModelProperty(value = "分类排序")
    private Integer sortNum;
    private String creator;
    private String updater;
    private Date updateDate;
    private Long tenantCode;

}