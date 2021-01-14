package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;

/**
 * 沙具模型选择
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_sand_model_choose")
public class RcpSandModelChooseEntity {
	private static final long serialVersionUID = 1L;

	@TableId
	private Integer id;
	private String name;
	private Integer sort;
	private Integer rcpSandTableModelId;
	private RcpSandTableModelEntity rcpSandTableModelEntity;
}