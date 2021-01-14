package io.renren.modules.proxyApi.dao;

import io.renren.common.dao.BaseDao;
import io.renren.modules.proxyApi.entity.RcpSandListEntity;
import io.renren.modules.proxyApi.entity.RcpSandPicEntity;
import io.renren.modules.proxyApi.entity.RcpSandTableModelEntity;
import io.renren.modules.sys.entity.SysDictDataEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* 沙盘列表
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2021-01-09
*/
@Mapper
public interface RcpSandListDao extends BaseDao<RcpSandListEntity> {
    List<SysDictDataEntity> selectType();
    List<SysDictDataEntity> selectState();
}