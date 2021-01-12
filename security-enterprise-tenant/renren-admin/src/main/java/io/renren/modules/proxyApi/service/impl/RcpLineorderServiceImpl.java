package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.common.context.TenantContext;
import io.renren.modules.proxyApi.dao.RcpLineorderDao;
import io.renren.modules.proxyApi.dto.RcpLineorderDTO;
import io.renren.modules.proxyApi.entity.RcpLineorderEntity;
import io.renren.modules.proxyApi.service.RcpLineorderService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 阳光热线-工单管理
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-26
 */
@Service
public class RcpLineorderServiceImpl extends CrudServiceImpl<RcpLineorderDao, RcpLineorderEntity, RcpLineorderDTO> implements RcpLineorderService {

    @Override
    public QueryWrapper<RcpLineorderEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpLineorderEntity> wrapper = new QueryWrapper<>();
















        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));

        return wrapper;
    }


}
