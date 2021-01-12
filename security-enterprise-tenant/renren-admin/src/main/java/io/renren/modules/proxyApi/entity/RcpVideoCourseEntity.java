package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 视频课程
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_video_course")
public class RcpVideoCourseEntity {
	private static final long serialVersionUID = 1L;

	@TableId
	private Integer id;
	/**
	* 课程主题
	*/
	private String title;
	/**
	* 副标题
	*/
	private String secondTitle;
	/**
	* 封面图片
	*/
	private String imgUrl;
	/**
	* 分类id
	*/
	private Integer categoryId;
	/**
	* 是否推荐
	*/
	private Integer isRecommend;
	/**
	* 是否显示
	*/
	private Integer isShow;
	/**
	* 视频地址
	*/
	private String videoUrl;
	/**
	* 上架状态
	*/
	private Integer shelfStatus;
	/**
	* 价格
	*/
	private BigDecimal price;
	/**
	* 目录
	*/
	private String menu;
	/**
	* 详情
	*/
	private String detail;
	/**
	* 分类名称
	*/
	private String categoryName;
	@TableField(fill = FieldFill.INSERT)
	private Date createDate;
	@TableField(fill = FieldFill.INSERT)
	private String creator;
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private String updater;
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date updateDate;
	@TableField(fill = FieldFill.INSERT)
	private Long tenantCode;
}