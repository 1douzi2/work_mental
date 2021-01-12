package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.common.context.TenantContext;
import io.renren.modules.proxyApi.dao.RcpLineseatDao;
import io.renren.modules.proxyApi.dto.RcpLineseatDTO;
import io.renren.modules.proxyApi.entity.RcpLineseatEntity;
import io.renren.modules.proxyApi.service.RcpLineseatService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 阳关热线-坐席管理
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-26
 */
@Service
public class RcpLineseatServiceImpl extends CrudServiceImpl<RcpLineseatDao, RcpLineseatEntity, RcpLineseatDTO> implements RcpLineseatService {

    @Override
    public QueryWrapper<RcpLineseatEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpLineseatEntity> wrapper = new QueryWrapper<>();











        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));

        return wrapper;
    }


}
