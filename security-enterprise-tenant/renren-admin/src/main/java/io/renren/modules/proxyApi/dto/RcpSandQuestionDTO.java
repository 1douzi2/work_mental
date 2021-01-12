package io.renren.modules.proxyApi.dto;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
* 沙盘问题描述
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-12-28
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "沙盘问题描述")
public class RcpSandQuestionDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.AUTO)
    private Integer id;
    @ApiModelProperty(value = "问题")
    private String question;
    @ApiModelProperty(value = "添加人")
    private String person;
    @ApiModelProperty(value = "意义")
    private String remarks;
    @ApiModelProperty(value = "添加时间")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Date time;
    @ApiModelProperty(value = "排序")
    private Integer sort;

}