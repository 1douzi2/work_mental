package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpFacilitieslistDao;
import io.renren.modules.proxyApi.dto.RcpFacilitieslistDTO;
import io.renren.modules.proxyApi.entity.RcpFacilitieslistEntity;
import io.renren.modules.proxyApi.service.RcpFacilitieslistService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import io.renren.common.context.TenantContext;
import java.util.Map;

/**
 * 设备列表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Service
public class RcpFacilitieslistServiceImpl extends CrudServiceImpl<RcpFacilitieslistDao, RcpFacilitieslistEntity, RcpFacilitieslistDTO> implements RcpFacilitieslistService {

    @Override
    public QueryWrapper<RcpFacilitieslistEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpFacilitieslistEntity> wrapper = new QueryWrapper<>();












        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));

        return wrapper;
    }


}
