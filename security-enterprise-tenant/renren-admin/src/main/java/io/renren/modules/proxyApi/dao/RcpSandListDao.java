package io.renren.modules.proxyApi.dao;

import io.renren.common.dao.BaseDao;
import io.renren.modules.proxyApi.entity.RcpSandListEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 沙盘列表
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2021-01-09
*/
@Mapper
public interface RcpSandListDao extends BaseDao<RcpSandListEntity> {
	
}