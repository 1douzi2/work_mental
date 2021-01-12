package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
import java.util.Date;

/**
 * 阳光热线-档案管理-档案列表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-26
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_linefilelist")
public class RcpLinefilelistEntity {
	private static final long serialVersionUID = 1L;

	/**
	* id
	*/
	@TableId
	private Long id;
	/**
	* 客户姓名
	*/
	private String name;
	/**
	* 手机号
	*/
	private String telephone;
	/**
	* 客服工号
	*/
	private String servicenum;
	/**
	* 状态 0正常1异常
	*/
	private Integer status;
	/**
	* 创建人
	*/
	@TableField(fill = FieldFill.INSERT)
	private String creator;
	/**
	* 创建时间
	*/
	@TableField(fill = FieldFill.INSERT)
	private Date createDate;
	/**
	* 更新人
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