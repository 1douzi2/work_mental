package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
import java.util.Date;

/**
 * 课程评论
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_course_evaluation")
public class RcpCourseEvaluationEntity {
	private static final long serialVersionUID = 1L;

	@TableId
	private Integer id;
	/**
	* 昵称
	*/
	private String userNickname;
	/**
	* 用户名
	*/
	private String userName;
	/**
	* 订单编号
	*/
	private Integer orderNum;
	/**
	* 课程名称
	*/
	private String courseName;
	/**
	* 课程分类
	*/
	private String courseCategory;
	/**
	* 评价
	*/
	private Double evaluation;
	/**
	* ip地址
	*/
	private String ipAddress;
	/**
	* 评论时间
	*/
	@TableField(fill = FieldFill.INSERT)
	private Date createDate;
	/**
	* 是否显示
	*/
	private Integer isShow;
	@TableField(fill = FieldFill.INSERT)
	private String creator;
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private String updater;
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date updateDate;
	@TableField(fill = FieldFill.INSERT)
	private Long tenantCode;
}