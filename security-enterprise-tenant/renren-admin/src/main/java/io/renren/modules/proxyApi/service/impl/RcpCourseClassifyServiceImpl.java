package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpCourseClassifyDao;
import io.renren.modules.proxyApi.dto.RcpCourseClassifyDTO;
import io.renren.modules.proxyApi.entity.RcpCourseClassifyEntity;
import io.renren.modules.proxyApi.service.RcpCourseClassifyService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import io.renren.common.context.TenantContext;

import java.util.Map;

/**
 * 视频课程分类
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Service
public class RcpCourseClassifyServiceImpl extends CrudServiceImpl<RcpCourseClassifyDao, RcpCourseClassifyEntity, RcpCourseClassifyDTO> implements RcpCourseClassifyService {

    @Override
    public QueryWrapper<RcpCourseClassifyEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpCourseClassifyEntity> wrapper = new QueryWrapper<>();











        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));

        return wrapper;
    }


}
