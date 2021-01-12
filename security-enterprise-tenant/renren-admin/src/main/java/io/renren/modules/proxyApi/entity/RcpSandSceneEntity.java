package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;

/**
 * 沙盘场景维护
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-12-28
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_sand_scene")
public class RcpSandSceneEntity {
	private static final long serialVersionUID = 1L;

	@TableId(type = IdType.AUTO)

	private Integer id;
	/**
	* 场景名称
	*/
	private String sceneName;
	/**
	* 场景图片
	*/
	private String scenePic;
	/**
	* 状态
	*/

	/*
	* 添加人
	* */
	private String person;
	/*
	*详情
	* */
	private String details;

}