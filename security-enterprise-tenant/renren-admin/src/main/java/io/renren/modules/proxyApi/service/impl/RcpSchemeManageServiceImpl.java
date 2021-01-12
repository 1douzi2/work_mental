package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.context.TenantContext;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpSchemeManageDao;
import io.renren.modules.proxyApi.dto.RcpSchemeManageDTO;
import io.renren.modules.proxyApi.entity.RcpSchemeManageEntity;
import io.renren.modules.proxyApi.service.RcpSchemeManageService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 方案管理
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Service
public class RcpSchemeManageServiceImpl extends CrudServiceImpl<RcpSchemeManageDao, RcpSchemeManageEntity, RcpSchemeManageDTO> implements RcpSchemeManageService {

    @Override
    public QueryWrapper<RcpSchemeManageEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpSchemeManageEntity> wrapper = new QueryWrapper<>();











        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));

        return wrapper;
    }


}
