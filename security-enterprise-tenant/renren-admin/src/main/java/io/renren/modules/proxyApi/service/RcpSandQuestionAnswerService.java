package io.renren.modules.proxyApi.service;

import io.renren.common.service.CrudService;
import io.renren.modules.proxyApi.dto.RcpSandQuestionAnswerDTO;
import io.renren.modules.proxyApi.entity.RcpSandQuestionAnswerEntity;

import java.util.List;

/**
 * 问题的回答表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2021-01-11
 */
public interface RcpSandQuestionAnswerService extends CrudService<RcpSandQuestionAnswerEntity, RcpSandQuestionAnswerDTO> {
        List<RcpSandQuestionAnswerEntity> sandQuestionAnswer();
}