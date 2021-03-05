package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author felix
 * @email felix@gmail.com
 * @date 2021-03-05 16:03:49
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
