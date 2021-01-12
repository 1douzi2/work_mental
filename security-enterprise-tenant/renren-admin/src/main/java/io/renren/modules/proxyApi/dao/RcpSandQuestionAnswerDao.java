package io.renren.modules.proxyApi.dao;

import io.renren.common.dao.BaseDao;
import io.renren.modules.proxyApi.entity.RcpSandQuestionAnswerEntity;
import io.renren.modules.proxyApi.entity.RcpSandQuestionEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* 问题的回答表
*
* @author Mark sunlightcs@gmail.com
* @since 3.0 2021-01-11
*/
@Mapper
public interface RcpSandQuestionAnswerDao extends BaseDao<RcpSandQuestionAnswerEntity> {
    List<RcpSandQuestionAnswerEntity> selectAnsewr();
}