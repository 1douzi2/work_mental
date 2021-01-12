package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpActivityApplyuserDao;
import io.renren.modules.proxyApi.dto.RcpActivityApplyuserDTO;
import io.renren.modules.proxyApi.entity.RcpActivityApplyuserEntity;
import io.renren.modules.proxyApi.service.RcpActivityApplyuserService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import io.renren.common.context.TenantContext;
import java.util.Map;

/**
 * 报名用户
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-24
 */
@Service
public class RcpActivityApplyuserServiceImpl extends CrudServiceImpl<RcpActivityApplyuserDao, RcpActivityApplyuserEntity, RcpActivityApplyuserDTO> implements RcpActivityApplyuserService {

    @Override
    public QueryWrapper<RcpActivityApplyuserEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpActivityApplyuserEntity> wrapper = new QueryWrapper<>();







        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));





        return wrapper;
    }


}
