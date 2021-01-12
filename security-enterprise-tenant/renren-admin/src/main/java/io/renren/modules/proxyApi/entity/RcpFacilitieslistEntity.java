package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
import java.util.Date;

/**
 * 设备列表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_facilitieslist")
public class RcpFacilitieslistEntity {
	private static final long serialVersionUID = 1L;

	/**
	* id
	*/
	@TableId
	private Long id;
	/**
	* 设备名称
	*/
	private String name;

  /**
   * 设备图片
   */
  private String image;
	/**
	* 设备类型
	*/
	private Integer type;
	/**
	* 联接租户
	*/
	private Integer connectuser;
	/**
	* 在线设备
	*/
	private Integer online;
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
