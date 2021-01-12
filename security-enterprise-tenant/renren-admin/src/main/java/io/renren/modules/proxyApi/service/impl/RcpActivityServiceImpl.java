package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.context.TenantContext;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpActivityDao;
import io.renren.modules.proxyApi.dto.RcpActivityDTO;
import io.renren.modules.proxyApi.entity.RcpActivityEntity;
import io.renren.modules.proxyApi.service.RcpActivityService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 活动列表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Service
public class RcpActivityServiceImpl extends CrudServiceImpl<RcpActivityDao, RcpActivityEntity, RcpActivityDTO> implements RcpActivityService {

    @Override
    public QueryWrapper<RcpActivityEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpActivityEntity> wrapper = new QueryWrapper<>();


















        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));







        return wrapper;
    }


}
