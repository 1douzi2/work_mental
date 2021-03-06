package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
import java.util.Date;

/**
 * 方案配置
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_scheme_config")
public class RcpSchemeConfigEntity {
	private static final long serialVersionUID = 1L;

	/**
	* id
	*/
	@TableId
	private Long id;
	/**
	* 方案名称
	*/
	private String name;
	/**
	* 关联设备
	*/
	private String associateEquip;
	/**
	* 状态
	*/
	private Integer status;
	/**
	* 创建者
	*/
	@TableField(fill = FieldFill.INSERT)
	private String creator;
	/**
	* 创建时间
	*/
	@TableField(fill = FieldFill.INSERT)
	private Date createDate;
	/**
	* 更新者
	*/
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private String updater;
	/**
	* 更新时间
	*/
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date updateDate;
	@TableField(fill = FieldFill.INSERT)
	private Long tenantCode;
}