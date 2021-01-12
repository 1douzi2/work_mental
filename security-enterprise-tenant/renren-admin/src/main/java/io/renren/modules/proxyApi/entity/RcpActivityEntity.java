package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
import java.util.Date;

/**
 * 活动列表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_activity")
public class RcpActivityEntity {
	private static final long serialVersionUID = 1L;

	/**
	* id
	*/
	@TableId
	private Long id;
	/**
	* 活动名称
	*/
	private String name;
	/**
	* 分类id
	*/
	private String classifyId;
	/**
	* 活动状态
	*/
	private String actStatus;
	/**
	* 报名状态
	*/
	private String applyStatus;
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
	/**
	* 报名人数
	*/
	private Integer applyNum;
	/**
	* 浏览人数
	*/
	private Integer visitorNum;
	/**
	* 活动开始时间
	*/
	private Date actStartTime;
	/**
	* 活动结束时间
	*/
	private Date actEndTime;
	/**
	* 报名开始时间
	*/
	private Date applyStartTime;
	/**
	* 报名结束时间
	*/
	private Date applyEndTime;
	/**
	* 详细描述
	*/
	private String description;
	@TableField(fill = FieldFill.INSERT)
	private Long tenantCode;
	/**
	* 活动海报
	*/
	private String image;
	/**
	* 参与专家团队
	*/
	private String expertTeam;
	/**
	* 省
	*/
	private String province;
	/**
	* 市
	*/
	private String city;
	/**
	* 区
	*/
	private String area;
	/**
	* 详细地址
	*/
	private String detailedLocation;
}