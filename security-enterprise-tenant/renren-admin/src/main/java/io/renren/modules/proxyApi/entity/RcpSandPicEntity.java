package io.renren.modules.proxyApi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;

/**
 * 图片
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2021-01-11
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("rcp_sand_pic")
public class RcpSandPicEntity {
	private static final long serialVersionUID = 1L;

	@TableId
	private Integer id;
	private String picUrl;
	private Integer sort;
	private String userName;
}