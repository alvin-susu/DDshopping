package com.d.ddmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.d.common.utils.PageUtils;
import com.d.ddmall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author sudi
 * @email alvinsudi@163.com
 * @date 2020-10-29 21:05:20
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

