package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;

/**
 * 沙盘模型
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-12-28
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_sand_table_model")
public class RcpSandTableModelEntity {
	private static final long serialVersionUID = 1L;

	@TableId(type = IdType.AUTO)
	private Integer id;
	/**
	* 沙盘模型分类id
	*/
	private Integer sendTypeId;
	/**
	* 沙盘模型名称
	*/
	private String modelName;
	/**
	* 沙盘模型图片
	*/
	private String modelImg;
	/**
	* 是否启用(1 启用，2禁止)
	*/
	private boolean enble;
	/**
	* 意义
	*/
	private String significance;
	/**
	 * 添加人
	 */
	private String addPeople;
//	private RcpSandTypeEntity sandType;
	private String sandTypeName;
}