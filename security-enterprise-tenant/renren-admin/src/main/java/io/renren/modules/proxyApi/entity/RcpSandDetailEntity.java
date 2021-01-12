package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
import java.util.Date;

/**
 * 沙盘详情(关联等级、图片、问题)
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2021-01-11
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_sand_detail")
public class RcpSandDetailEntity {
	private static final long serialVersionUID = 1L;

	@TableId
	private Integer id;
	@TableField(fill = FieldFill.INSERT)
	private Integer tenantCode;
	private Integer person;
	/**
	* 创作时间
	*/
	private Date createTime;
	/**
	* 所用时间
	*/
	private String usedTime;
	/**
	* 沙具数量
	*/
	private Integer toysNum;
	/**
	* 移动次数
	*/
	private Integer moveNum;
	/**
	* 视频地址
	*/
	private String mvUrl;
}