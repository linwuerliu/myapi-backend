package com.myapi.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.myapi.myapicommon.model.entity.InterfaceInfo;

/**
 *
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
