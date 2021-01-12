package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpCourseReportDao;
import io.renren.modules.proxyApi.dto.RcpCourseReportDTO;
import io.renren.modules.proxyApi.entity.RcpCourseReportEntity;
import io.renren.modules.proxyApi.service.RcpCourseReportService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import io.renren.common.context.TenantContext;

import java.util.Map;

/**
 * 课程举报
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Service
public class RcpCourseReportServiceImpl extends CrudServiceImpl<RcpCourseReportDao, RcpCourseReportEntity, RcpCourseReportDTO> implements RcpCourseReportService {

    @Override
    public QueryWrapper<RcpCourseReportEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpCourseReportEntity> wrapper = new QueryWrapper<>();
















        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));

        return wrapper;
    }


}
