package com.d.ddmall.coupon.dao;

import com.d.ddmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author sudi
 * @email alvinsudi@163.com
 * @date 2020-10-29 20:47:26
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
