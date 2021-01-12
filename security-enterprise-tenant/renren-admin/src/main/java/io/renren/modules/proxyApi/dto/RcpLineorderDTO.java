package io.renren.modules.proxyApi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 阳光热线-工单管理
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-26
*/
@Data
@ApiModel(value = "阳光热线-工单管理")
public class RcpLineorderDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "年龄")
    private Integer age;
    @ApiModelProperty(value = "性别 0男 1女")
    private Integer sex;
    @ApiModelProperty(value = "手机号")
    private String telephone;
    @ApiModelProperty(value = "详情描述")
    private String desciption;
    @ApiModelProperty(value = "工单类型")
    private String type;
    @ApiModelProperty(value = "负责人姓名")
    private String chargename;
    @ApiModelProperty(value = "受理人工号")
    private String acceptnum;
    @ApiModelProperty(value = "工单状态 0未处理 1已处理")
    private Integer status;
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