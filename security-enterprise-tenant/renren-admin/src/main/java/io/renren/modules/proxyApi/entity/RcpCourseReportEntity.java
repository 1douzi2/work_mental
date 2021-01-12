package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
import java.util.Date;
import io.renren.common.entity.BaseEntity;

/**
 * 课程举报
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_course_report")
public class RcpCourseReportEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

	/**
	* 举报人
	*/
	private String reporter;
	/**
	* 举报对象
	*/
	private String reportTarget;
	/**
	* 状态
	*/
	private Integer status;
	/**
	* 处理结果
	*/
	private String result;
	/**
	* 举报内容
	*/
	private String content;
	/**
	* 联系电话
	*/
	private String phone;
	/**
	* 处理人
	*/
	private String dealer;
	/**
	* 处理时间
	*/
	private Date dealTime;
	/**
	* 处理备注
	*/
	private String remark;
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private String updater;
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date updateDate;
	@TableField(fill = FieldFill.INSERT)
	private Long tenantCode;
}