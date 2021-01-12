package io.renren.modules.proxyApi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 沙盘详情(关联等级、图片、问题)
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2021-01-11
*/
@Data
@ApiModel(value = "沙盘详情(关联等级、图片、问题)")
public class RcpSandDetailDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer tenantCode;
    private Integer person;
    @ApiModelProperty(value = "创作时间")
    private Date createTime;
    @ApiModelProperty(value = "所用时间")
    private String usedTime;
    @ApiModelProperty(value = "沙具数量")
    private Integer toysNum;
    @ApiModelProperty(value = "移动次数")
    private Integer moveNum;
    @ApiModelProperty(value = "视频地址")
    private String mvUrl;


}