package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author felix
 * @email felix@gmail.com
 * @date 2021-03-05 19:00:57
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
