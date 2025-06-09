package com.dao;

import com.entity.DiscussfangwuzushouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfangwuzushouVO;
import com.entity.view.DiscussfangwuzushouView;


/**
 * 房屋租售评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-20 17:37:56
 */
public interface DiscussfangwuzushouDao extends BaseMapper<DiscussfangwuzushouEntity> {
	
	List<DiscussfangwuzushouVO> selectListVO(@Param("ew") Wrapper<DiscussfangwuzushouEntity> wrapper);
	
	DiscussfangwuzushouVO selectVO(@Param("ew") Wrapper<DiscussfangwuzushouEntity> wrapper);
	
	List<DiscussfangwuzushouView> selectListView(@Param("ew") Wrapper<DiscussfangwuzushouEntity> wrapper);

	List<DiscussfangwuzushouView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfangwuzushouEntity> wrapper);
	
	DiscussfangwuzushouView selectView(@Param("ew") Wrapper<DiscussfangwuzushouEntity> wrapper);
	
}
