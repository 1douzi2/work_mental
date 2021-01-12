package io.renren.modules.proxyApi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 问题的回答表
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2021-01-11
*/
@Data
@ApiModel(value = "问题的回答表")
public class RcpSandQuestionAnswerDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String answer;
    private Date time;
    private String name;
    private Integer rcpSandQuestionId;

}