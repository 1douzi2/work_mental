package io.renren.modules.proxyApi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.constant.Constant;
import io.renren.modules.proxyApi.dao.RcpSandPicDao;
import io.renren.modules.proxyApi.dto.RcpSandPicDTO;
import io.renren.modules.proxyApi.entity.RcpSandPicEntity;
import io.renren.modules.proxyApi.service.RcpSandPicService;
import io.renren.modules.security.user.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 图片
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2021-01-11
 */
@Service
public class RcpSandPicServiceImpl extends CrudServiceImpl<RcpSandPicDao, RcpSandPicEntity, RcpSandPicDTO> implements RcpSandPicService {
@Autowired
  private RcpSandPicDao rcpSandPicDao;
    @Override
    public QueryWrapper<RcpSandPicEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<RcpSandPicEntity> wrapper = new QueryWrapper<>();






        return wrapper;
    }

//添加的照片
    @Override
    public List<RcpSandPicEntity> rcpSandPic() {
        List<RcpSandPicEntity> rcpSandPicEntities =rcpSandPicDao.selectPic();
        return rcpSandPicEntities;
    }
}