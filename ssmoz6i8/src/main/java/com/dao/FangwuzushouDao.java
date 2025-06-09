package com.dao;

import com.entity.FangwuzushouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangwuzushouVO;
import com.entity.view.FangwuzushouView;


/**
 * 房屋租售
 * 
 * @author 
 * @email 
 * @date 2021-01-20 17:37:56
 */
public interface FangwuzushouDao extends BaseMapper<FangwuzushouEntity> {
	
	List<FangwuzushouVO> selectListVO(@Param("ew") Wrapper<FangwuzushouEntity> wrapper);
	
	FangwuzushouVO selectVO(@Param("ew") Wrapper<FangwuzushouEntity> wrapper);
	
	List<FangwuzushouView> selectListView(@Param("ew") Wrapper<FangwuzushouEntity> wrapper);

	List<FangwuzushouView> selectListView(Pagination page,@Param("ew") Wrapper<FangwuzushouEntity> wrapper);
	
	FangwuzushouView selectView(@Param("ew") Wrapper<FangwuzushouEntity> wrapper);
	
}
