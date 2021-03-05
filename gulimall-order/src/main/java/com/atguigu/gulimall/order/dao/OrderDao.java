package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author felix
 * @email felix@gmail.com
 * @date 2021-03-05 22:15:25
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
