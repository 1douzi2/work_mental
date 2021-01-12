package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.context.TenantContext;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpSchemeConfigDao;
import io.renren.modules.proxyApi.dto.RcpSchemeConfigDTO;
import io.renren.modules.proxyApi.entity.RcpSchemeConfigEntity;
import io.renren.modules.proxyApi.service.RcpSchemeConfigService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 方案配置
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Service
public class RcpSchemeConfigServiceImpl extends CrudServiceImpl<RcpSchemeConfigDao, RcpSchemeConfigEntity, RcpSchemeConfigDTO> implements RcpSchemeConfigService {

    @Override
    public QueryWrapper<RcpSchemeConfigEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpSchemeConfigEntity> wrapper = new QueryWrapper<>();










        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));

        return wrapper;
    }


}
