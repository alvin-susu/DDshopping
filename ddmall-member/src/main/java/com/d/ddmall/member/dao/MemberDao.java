package com.d.ddmall.member.dao;

import com.d.ddmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author sudi
 * @email alvinsudi@163.com
 * @date 2020-10-29 20:57:16
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
