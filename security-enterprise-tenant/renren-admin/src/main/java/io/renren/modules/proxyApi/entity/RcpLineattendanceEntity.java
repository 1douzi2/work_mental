package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
import java.util.Date;

/**
 * 阳光热线-考勤记录
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-26
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_lineattendance")
public class RcpLineattendanceEntity {
	private static final long serialVersionUID = 1L;

	/**
	* 异常原因
	*/
	@TableId
	private Long id;
	/**
	* 签到时间
	*/
	private Date checktime;
	/**
	* 异常日期
	*/
	private Date unusualdate;
	/**
	* 异常原因
	*/
	private String reason;
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