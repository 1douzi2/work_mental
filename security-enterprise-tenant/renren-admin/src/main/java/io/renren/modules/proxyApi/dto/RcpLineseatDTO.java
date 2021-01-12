package io.renren.modules.proxyApi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 阳关热线-坐席管理
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-26
*/
@Data
@ApiModel(value = "阳关热线-坐席管理")
public class RcpLineseatDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "工号")
    private String worknum;
    @ApiModelProperty(value = "状态")
    private Integer status;
    @ApiModelProperty(value = "员工头像")
    private String headimg;
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
