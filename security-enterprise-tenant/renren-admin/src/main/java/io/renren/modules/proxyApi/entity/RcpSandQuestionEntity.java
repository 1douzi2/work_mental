package io.renren.modules.proxyApi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 沙盘问题描述
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-12-28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_sand_question")
public class RcpSandQuestionEntity {
	private static final long serialVersionUID = 1L;
	@TableId(type = IdType.AUTO)

	private Integer id;
	private String question;
	private String person;
	private String remarks;
	@TableField(fill = FieldFill.INSERT)
	private Date time;
	private Integer sort;
}