package io.renren.modules.proxyApi.service;

import io.renren.common.service.CrudService;
import io.renren.modules.proxyApi.dto.RcpSandModelChooseDTO;
import io.renren.modules.proxyApi.entity.RcpSandModelChooseEntity;
import io.renren.modules.proxyApi.entity.RcpSandQuestionAnswerEntity;

import java.util.List;
import java.util.Set;

/**
 * 沙具模型选择
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2021-01-12
 */
public interface RcpSandModelChooseService extends CrudService<RcpSandModelChooseEntity, RcpSandModelChooseDTO> {
    List<RcpSandModelChooseEntity> sandmodelchoose(String userName);
}