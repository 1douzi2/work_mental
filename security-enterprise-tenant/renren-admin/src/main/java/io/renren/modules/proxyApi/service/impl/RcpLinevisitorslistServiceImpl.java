package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.common.context.TenantContext;
import io.renren.modules.proxyApi.dao.RcpLinevisitorslistDao;
import io.renren.modules.proxyApi.dto.RcpLinevisitorslistDTO;
import io.renren.modules.proxyApi.entity.RcpLinevisitorslistEntity;
import io.renren.modules.proxyApi.service.RcpLinevisitorslistService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 阳光热线-档案管理-来访者管理
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-26
 */
@Service
public class RcpLinevisitorslistServiceImpl extends CrudServiceImpl<RcpLinevisitorslistDao, RcpLinevisitorslistEntity, RcpLinevisitorslistDTO> implements RcpLinevisitorslistService {

    @Override
    public QueryWrapper<RcpLinevisitorslistEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpLinevisitorslistEntity> wrapper = new QueryWrapper<>();












        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));

        return wrapper;
    }


}
