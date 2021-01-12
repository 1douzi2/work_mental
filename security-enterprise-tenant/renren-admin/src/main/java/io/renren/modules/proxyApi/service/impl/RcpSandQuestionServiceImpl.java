package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import io.renren.common.context.TenantContext;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.modules.proxyApi.dao.RcpSandQuestionDao;
import io.renren.modules.proxyApi.dto.RcpSandQuestionDTO;
import io.renren.modules.proxyApi.entity.RcpSandQuestionEntity;
import io.renren.modules.proxyApi.service.RcpSandQuestionService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

/**
 * 沙盘问题描述
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-12-28
 */
@Service
@Component
public class RcpSandQuestionServiceImpl extends CrudServiceImpl<RcpSandQuestionDao, RcpSandQuestionEntity, RcpSandQuestionDTO> implements RcpSandQuestionService {

    @Override
    public QueryWrapper<RcpSandQuestionEntity> getWrapper(Map<String, Object> params){
//        QueryWrapper<RcpSandQuestionEntity> wrapper = new QueryWrapper<>();
        String question=(String)params.get("question");
        QueryWrapper<RcpSandQuestionEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(question),"question",question);


        wrapper.eq("tenant_code", TenantContext.getTenantCode(SecurityUser.getUser()));
        return wrapper;
    }


//    @Override
//    public void insertFill(MetaObject metaObject) {
//        this.setFieldValByName("time",new Date(),metaObject);
//    }
//
//    @Override
//    public void updateFill(MetaObject metaObject) {
//
//    }
}