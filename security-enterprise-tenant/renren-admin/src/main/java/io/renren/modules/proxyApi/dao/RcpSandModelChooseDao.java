package io.renren.modules.proxyApi.dao;

import io.renren.common.dao.BaseDao;
import io.renren.modules.proxyApi.entity.RcpSandModelChooseEntity;
import io.renren.modules.sys.entity.SysDictDataEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Set;

/**
* 沙具模型选择
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2021-01-12
*/
@Mapper
public interface RcpSandModelChooseDao extends BaseDao<RcpSandModelChooseEntity> {
	List<RcpSandModelChooseEntity> selectModel(String userName);
	List<SysDictDataEntity> selectType();
}