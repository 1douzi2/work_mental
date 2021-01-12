package io.renren.modules.proxyApi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
* 图片
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2021-01-11
*/
@Data
@ApiModel(value = "图片")
public class RcpSandPicDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String picUrl;
    private Integer sort;
    private String userName;

}