package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpSandModelChooseDao;
import io.renren.modules.proxyApi.dto.RcpSandModelChooseDTO;
import io.renren.modules.proxyApi.entity.RcpSandModelChooseEntity;
import io.renren.modules.proxyApi.service.RcpSandModelChooseService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 沙具模型选择
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2021-01-12
 */
@Service
public class RcpSandModelChooseServiceImpl extends CrudServiceImpl<RcpSandModelChooseDao, RcpSandModelChooseEntity, RcpSandModelChooseDTO> implements RcpSandModelChooseService {
@Autowired
 private RcpSandModelChooseDao rcpSandModelChooseDao;
    @Override
    public QueryWrapper<RcpSandModelChooseEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpSandModelChooseEntity> wrapper = new QueryWrapper<>();






        return wrapper;
    }


    @Override
    public List<RcpSandModelChooseEntity> sandmodelchoose(String userName) {
        List<RcpSandModelChooseEntity> rcpSandModelChooseEntities=rcpSandModelChooseDao.selectModel(userName);
        return rcpSandModelChooseEntities;
    }
}