package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.context.TenantContext;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpLineblacklistDao;
import io.renren.modules.proxyApi.dto.RcpLineblacklistDTO;
import io.renren.modules.proxyApi.entity.RcpLineblacklistEntity;
import io.renren.modules.proxyApi.service.RcpLineblacklistService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 阳光热线-黑名单管理
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-26
 */
@Service
public class RcpLineblacklistServiceImpl extends CrudServiceImpl<RcpLineblacklistDao, RcpLineblacklistEntity, RcpLineblacklistDTO> implements RcpLineblacklistService {

    @Override
    public QueryWrapper<RcpLineblacklistEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpLineblacklistEntity> wrapper = new QueryWrapper<>();










        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));

        return wrapper;
    }


}
