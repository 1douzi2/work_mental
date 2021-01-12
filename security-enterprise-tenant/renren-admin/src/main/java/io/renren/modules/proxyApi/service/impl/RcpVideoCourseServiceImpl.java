package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpVideoCourseDao;
import io.renren.modules.proxyApi.dto.RcpVideoCourseDTO;
import io.renren.modules.proxyApi.entity.RcpVideoCourseEntity;
import io.renren.modules.proxyApi.service.RcpVideoCourseService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import io.renren.common.context.TenantContext;

import java.util.Map;

/**
 * 视频课程
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Service
public class RcpVideoCourseServiceImpl extends CrudServiceImpl<RcpVideoCourseDao, RcpVideoCourseEntity, RcpVideoCourseDTO> implements RcpVideoCourseService {

    @Override
    public QueryWrapper<RcpVideoCourseEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpVideoCourseEntity> wrapper = new QueryWrapper<>();



















        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));

        return wrapper;
    }


}
