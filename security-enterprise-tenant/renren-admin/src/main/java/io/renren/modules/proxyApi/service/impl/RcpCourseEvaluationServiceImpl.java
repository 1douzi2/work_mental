package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpCourseEvaluationDao;
import io.renren.modules.proxyApi.dto.RcpCourseEvaluationDTO;
import io.renren.modules.proxyApi.entity.RcpCourseEvaluationEntity;
import io.renren.modules.proxyApi.service.RcpCourseEvaluationService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import io.renren.common.context.TenantContext;

import java.util.Map;

/**
 * 课程评论
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Service
public class RcpCourseEvaluationServiceImpl extends CrudServiceImpl<RcpCourseEvaluationDao, RcpCourseEvaluationEntity, RcpCourseEvaluationDTO> implements RcpCourseEvaluationService {

    @Override
    public QueryWrapper<RcpCourseEvaluationEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpCourseEvaluationEntity> wrapper = new QueryWrapper<>();















        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));

        return wrapper;
    }


}
