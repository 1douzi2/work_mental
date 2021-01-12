package io.renren.modules.proxyApi.dao;

import io.renren.common.dao.BaseDao;
import io.renren.modules.proxyApi.entity.RcpCourseClassifyEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 视频课程分类
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-25
*/
@Mapper
public interface RcpCourseClassifyDao extends BaseDao<RcpCourseClassifyEntity> {
	
}