package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
import java.util.Date;

/**
 * 阳关热线-坐席管理
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-26
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_lineseat")
public class RcpLineseatEntity {
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
	* 工号
	*/
	private String worknum;
	/**
	* 状态
1通话中 2空闲中 3危机求助 4督导求助 5在线沟通 
6语音通话
	*/
	private Integer status;
	/**
	* 员工头像
	*/
	private String headimg;
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