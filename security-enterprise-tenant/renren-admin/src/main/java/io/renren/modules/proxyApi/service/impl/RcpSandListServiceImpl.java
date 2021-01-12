package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.context.TenantContext;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpSandListDao;
import io.renren.modules.proxyApi.dto.RcpSandListDTO;
import io.renren.modules.proxyApi.entity.RcpSandListEntity;
import io.renren.modules.proxyApi.service.RcpSandListService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 沙盘列表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2021-01-09
 */
@Service
public class RcpSandListServiceImpl extends CrudServiceImpl<RcpSandListDao, RcpSandListEntity, RcpSandListDTO> implements RcpSandListService {

    @Override
    public QueryWrapper<RcpSandListEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpSandListEntity> wrapper = new QueryWrapper<>();









        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));

        return wrapper;
    }


}