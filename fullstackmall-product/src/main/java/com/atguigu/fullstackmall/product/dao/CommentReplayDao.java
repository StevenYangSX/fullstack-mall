package com.atguigu.fullstackmall.product.dao;

import com.atguigu.fullstackmall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author steven
 * @email steven@gmail.com
 * @date 2023-05-25 14:32:03
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
