package com.atguigu.fullstackmall.product.dao;

import com.atguigu.fullstackmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author steven
 * @email steven@gmail.com
 * @date 2023-05-25 14:32:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
