package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
import java.util.Date;

/**
 * 报名用户
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-24
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_activity_applyuser")
public class RcpActivityApplyuserEntity {
	private static final long serialVersionUID = 1L;

	/**
	* 编号
	*/
	@TableId
	private Long id;
	/**
	* 用户名称
	*/
	private String username;
	/**
	* 手机号
	*/
	private String phone;
	/**
	* 签到状态
	*/
	private String status;
	/**
	* 报名时间
	*/
	private Date applyTime;
	@TableField(fill = FieldFill.INSERT)
	private Long tenantCode;
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
}