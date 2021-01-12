package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.context.TenantContext;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpActivityClassifyDao;
import io.renren.modules.proxyApi.dto.RcpActivityClassifyDTO;
import io.renren.modules.proxyApi.entity.RcpActivityClassifyEntity;
import io.renren.modules.proxyApi.service.RcpActivityClassifyService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 活动分类
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Service
public class RcpActivityClassifyServiceImpl extends CrudServiceImpl<RcpActivityClassifyDao, RcpActivityClassifyEntity, RcpActivityClassifyDTO> implements RcpActivityClassifyService {

    @Override
    public QueryWrapper<RcpActivityClassifyEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpActivityClassifyEntity> wrapper = new QueryWrapper<>();










        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));

        return wrapper;
    }


}
