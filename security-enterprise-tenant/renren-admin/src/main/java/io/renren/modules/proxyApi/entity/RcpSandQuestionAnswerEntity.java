package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
import java.util.Date;

/**
 * 问题的回答表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2021-01-11
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_sand_question_answer")
public class RcpSandQuestionAnswerEntity {
	private static final long serialVersionUID = 1L;

	@TableId
	private Integer id;
	private String answer;
	private Date time;
	private String name;
	private Integer rcpSandQuestionId;

	private RcpSandQuestionEntity rcpSandQuestionEntity;
}