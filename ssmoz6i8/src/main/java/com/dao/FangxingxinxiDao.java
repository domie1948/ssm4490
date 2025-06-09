package com.dao;

import com.entity.FangxingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangxingxinxiVO;
import com.entity.view.FangxingxinxiView;


/**
 * 房型信息
 * 
 * @author 
 * @email 
 * @date 2021-01-20 17:37:56
 */
public interface FangxingxinxiDao extends BaseMapper<FangxingxinxiEntity> {
	
	List<FangxingxinxiVO> selectListVO(@Param("ew") Wrapper<FangxingxinxiEntity> wrapper);
	
	FangxingxinxiVO selectVO(@Param("ew") Wrapper<FangxingxinxiEntity> wrapper);
	
	List<FangxingxinxiView> selectListView(@Param("ew") Wrapper<FangxingxinxiEntity> wrapper);

	List<FangxingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FangxingxinxiEntity> wrapper);
	
	FangxingxinxiView selectView(@Param("ew") Wrapper<FangxingxinxiEntity> wrapper);
	
}
