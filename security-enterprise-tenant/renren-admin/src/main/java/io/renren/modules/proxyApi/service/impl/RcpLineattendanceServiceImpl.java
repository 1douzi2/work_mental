package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.context.TenantContext;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpLineattendanceDao;
import io.renren.modules.proxyApi.dto.RcpLineattendanceDTO;
import io.renren.modules.proxyApi.entity.RcpLineattendanceEntity;
import io.renren.modules.proxyApi.service.RcpLineattendanceService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 阳光热线-考勤记录
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-26
 */
@Service
public class RcpLineattendanceServiceImpl extends CrudServiceImpl<RcpLineattendanceDao, RcpLineattendanceEntity, RcpLineattendanceDTO> implements RcpLineattendanceService {

    @Override
    public QueryWrapper<RcpLineattendanceEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpLineattendanceEntity> wrapper = new QueryWrapper<>();










        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));

        return wrapper;
    }


}
