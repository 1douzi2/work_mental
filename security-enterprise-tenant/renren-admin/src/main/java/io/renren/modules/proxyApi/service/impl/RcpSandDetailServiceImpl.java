package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.context.TenantContext;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpSandDetailDao;
import io.renren.modules.proxyApi.dto.RcpSandDetailDTO;
import io.renren.modules.proxyApi.entity.RcpSandDetailEntity;
import io.renren.modules.proxyApi.service.RcpSandDetailService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 沙盘详情(关联等级、图片、问题)
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2021-01-11
 */
@Service
public class RcpSandDetailServiceImpl extends CrudServiceImpl<RcpSandDetailDao, RcpSandDetailEntity, RcpSandDetailDTO> implements RcpSandDetailService {

    @Override
    public QueryWrapper<RcpSandDetailEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpSandDetailEntity> wrapper = new QueryWrapper<>();



        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));







        return wrapper;
    }


}