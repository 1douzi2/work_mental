package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
import java.util.Date;

/**
 * 视频课程分类
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_course_classify")
public class RcpCourseClassifyEntity {
	private static final long serialVersionUID = 1L;

	@TableId
	private Integer id;
	/**
	* 分类图标
	*/
	private String img;
	/**
	* 分类名称
	*/
	private String categoryName;
	@TableField(fill = FieldFill.INSERT)
	private Date createDate;
	/**
	* 是否显示
	*/
	private Integer isShow;
	/**
	* 分类排序
	*/
	private Integer sortNum;
	@TableField(fill = FieldFill.INSERT)
	private String creator;
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private String updater;
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date updateDate;
	@TableField(fill = FieldFill.INSERT)
	private Long tenantCode;
}