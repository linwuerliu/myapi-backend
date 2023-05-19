package com.myapi.project.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myapi.myapicommon.model.entity.InterfaceInfo;
import com.myapi.project.common.ErrorCode;
import com.myapi.project.exception.BusinessException;
import com.myapi.project.mapper.InterfaceInfoMapper;
import com.myapi.project.service.InterfaceInfoService;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        Long id = interfaceInfo.getId();
        String name = interfaceInfo.getName();
        String description = interfaceInfo.getDescription();
        String url = interfaceInfo.getUrl();
        String method = interfaceInfo.getMethod();
        Long userid = interfaceInfo.getUserId();
        // 创建时，所有参数必须非空
        if (add) {
            if (StringUtils.isAnyBlank(name, description, url, method) || ObjectUtils.anyNull(id, userid)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
    }
}




