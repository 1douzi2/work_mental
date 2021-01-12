package io.renren.modules.proxyApi.dao;

import io.renren.common.dao.BaseDao;
import io.renren.modules.proxyApi.entity.RcpActivityEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 活动列表
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-25
*/
@Mapper
public interface RcpActivityDao extends BaseDao<RcpActivityEntity> {
	
}