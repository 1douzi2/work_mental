package io.renren.modules.proxyApi.dao;

import io.renren.common.dao.BaseDao;
import io.renren.modules.proxyApi.entity.RcpSandDetailEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 沙盘详情(关联等级、图片、问题)
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2021-01-11
*/
@Mapper
public interface RcpSandDetailDao extends BaseDao<RcpSandDetailEntity> {
	
}