package io.renren.modules.proxyApi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
* 沙具模型选择
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2021-01-12
*/
@Data
@ApiModel(value = "沙具模型选择")
public class RcpSandModelChooseDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private Integer sort;
    private Integer rcpSandTableModelId;

}