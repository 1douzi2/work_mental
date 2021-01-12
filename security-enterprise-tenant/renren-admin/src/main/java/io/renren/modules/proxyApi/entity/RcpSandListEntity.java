package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
import java.util.Date;

/**
 * 沙盘列表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2021-01-09
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_sand_list")
public class RcpSandListEntity {
	private static final long serialVersionUID = 1L;

	@TableId
	private Integer id;
	/**
	* 添加人
	*/
	private String person;
	/**
	* 预警图标
	*/
	private String warningIcon;
	/**
	* 预警等级
	*/
	private String warningLevel;
	/**
	* 状态
	*/
	private String state;
	/**
	* 创建时间
	*/
	private Date time;
	/**
	* 排序
	*/
	private Integer sort;
	/**
	 * 玩具的数量
	 */
	private Integer toysNum ;
	/**
	 * 移动的次数
	 */
	private Integer moveNum ;
	/**
	 * 视频
	 */
	private String mvUrl;
	/**
	 * 使用时间
	 */
	private String usedTime;
	@TableField(fill = FieldFill.INSERT)
	private Long tenantCode;
}