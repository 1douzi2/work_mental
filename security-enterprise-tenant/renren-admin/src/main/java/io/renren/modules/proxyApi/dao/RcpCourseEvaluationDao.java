package io.renren.modules.proxyApi.dao;

import io.renren.common.dao.BaseDao;
import io.renren.modules.proxyApi.entity.RcpCourseEvaluationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 课程评论
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2020-11-25
*/
@Mapper
public interface RcpCourseEvaluationDao extends BaseDao<RcpCourseEvaluationEntity> {
	
}