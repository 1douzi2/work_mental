package io.renren.modules.proxyApi.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
* 沙盘场景维护
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-12-28
*/
@Data
@ApiModel(value = "沙盘场景维护")
public class RcpSandSceneDTO implements Serializable {
    private static final long serialVersionUID = 1L;
@TableId(type = IdType.AUTO)
    private Integer id;
    @ApiModelProperty(value = "场景名称")
    private String sceneName;
    @ApiModelProperty(value = "场景图片")
    private String scenePic;

    @ApiModelProperty(value="添加人")
    private String person;
    @ApiModelProperty(value="详情")
    private String details;


}