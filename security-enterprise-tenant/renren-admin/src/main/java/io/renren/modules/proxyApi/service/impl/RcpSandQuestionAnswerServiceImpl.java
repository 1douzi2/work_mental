package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpSandQuestionAnswerDao;
import io.renren.modules.proxyApi.dto.RcpSandQuestionAnswerDTO;
import io.renren.modules.proxyApi.entity.RcpSandQuestionAnswerEntity;
import io.renren.modules.proxyApi.service.RcpSandQuestionAnswerService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 问题的回答表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2021-01-11
 */
@Service
public class RcpSandQuestionAnswerServiceImpl extends CrudServiceImpl<RcpSandQuestionAnswerDao, RcpSandQuestionAnswerEntity, RcpSandQuestionAnswerDTO> implements RcpSandQuestionAnswerService {
    @Autowired
    private RcpSandQuestionAnswerDao rcpSandQuestionAnswerDao;
    @Override
    public QueryWrapper<RcpSandQuestionAnswerEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpSandQuestionAnswerEntity> wrapper = new QueryWrapper<>();







        return wrapper;
    }


    @Override
    public List<RcpSandQuestionAnswerEntity> sandQuestionAnswer(String userName) {
        List<RcpSandQuestionAnswerEntity> answer=rcpSandQuestionAnswerDao.selectAnsewr(userName);
        return answer;
    }
}