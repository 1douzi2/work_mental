package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
import java.util.Date;

/**
 * 阳光热线-工单管理
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-26
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_lineorder")
public class RcpLineorderEntity {
	private static final long serialVersionUID = 1L;

	/**
	* id
	*/
	@TableId
	private Long id;
	/**
	* 姓名
	*/
	private String name;
	/**
	* 年龄
	*/
	private Integer age;
	/**
	* 性别 0男 1女
	*/
	private Integer sex;
	/**
	* 手机号
	*/
	private String telephone;
	/**
	* 详情描述
	*/
	private String desciption;
	/**
	* 工单类型
	*/
	private String type;
	/**
	* 负责人姓名
	*/
	private String chargename;
	/**
	* 受理人工号
	*/
	private String acceptnum;
	/**
	* 工单状态 0未处理 1已处理
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