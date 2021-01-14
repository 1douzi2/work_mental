package io.renren.modules.proxyApi.dao;

import io.renren.common.dao.BaseDao;
import io.renren.modules.proxyApi.entity.RcpSandPicEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* 图片
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2021-01-11
*/
@Mapper
public interface RcpSandPicDao extends BaseDao<RcpSandPicEntity> {
//	String name="admin";
	List<RcpSandPicEntity> selectPic(String userName);


}