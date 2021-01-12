package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.context.TenantContext;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpLinefilelistDao;
import io.renren.modules.proxyApi.dto.RcpLinefilelistDTO;
import io.renren.modules.proxyApi.entity.RcpLinefilelistEntity;
import io.renren.modules.proxyApi.service.RcpLinefilelistService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 阳光热线-档案管理-档案列表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-26
 */
@Service
public class RcpLinefilelistServiceImpl extends CrudServiceImpl<RcpLinefilelistDao, RcpLinefilelistEntity, RcpLinefilelistDTO> implements RcpLinefilelistService {

    @Override
    public QueryWrapper<RcpLinefilelistEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpLinefilelistEntity> wrapper = new QueryWrapper<>();











        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));

        return wrapper;
    }


}
