package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.context.TenantContext;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpSandSceneDao;
import io.renren.modules.proxyApi.dto.RcpSandSceneDTO;
import io.renren.modules.proxyApi.entity.RcpSandSceneEntity;
import io.renren.modules.proxyApi.service.RcpSandSceneService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 沙盘场景维护
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-12-28
 */
@Service
public class RcpSandSceneServiceImpl extends CrudServiceImpl<RcpSandSceneDao, RcpSandSceneEntity, RcpSandSceneDTO> implements RcpSandSceneService {

    @Override
    public QueryWrapper<RcpSandSceneEntity> getWrapper(Map<String, Object> params){
    //        QueryWrapper<RcpSandSceneEntity> wrapper = new QueryWrapper<>();

        String sceneName=(String)params.get("sceneName");
        QueryWrapper<RcpSandSceneEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(sceneName),"scene_name",sceneName);

        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));
        return wrapper;
    }


}