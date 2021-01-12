package io.renren.modules.proxyApi.dao;

import io.renren.common.dao.BaseDao;
import io.renren.modules.proxyApi.entity.RcpLineorderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 阳光热线-工单管理
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-26
*/
@Mapper
public interface RcpLineorderDao extends BaseDao<RcpLineorderEntity> {
	
}