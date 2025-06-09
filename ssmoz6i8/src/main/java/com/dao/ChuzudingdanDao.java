package com.dao;

import com.entity.ChuzudingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuzudingdanVO;
import com.entity.view.ChuzudingdanView;


/**
 * 出租订单
 * 
 * @author 
 * @email 
 * @date 2021-01-20 17:37:56
 */
public interface ChuzudingdanDao extends BaseMapper<ChuzudingdanEntity> {
	
	List<ChuzudingdanVO> selectListVO(@Param("ew") Wrapper<ChuzudingdanEntity> wrapper);
	
	ChuzudingdanVO selectVO(@Param("ew") Wrapper<ChuzudingdanEntity> wrapper);
	
	List<ChuzudingdanView> selectListView(@Param("ew") Wrapper<ChuzudingdanEntity> wrapper);

	List<ChuzudingdanView> selectListView(Pagination page,@Param("ew") Wrapper<ChuzudingdanEntity> wrapper);
	
	ChuzudingdanView selectView(@Param("ew") Wrapper<ChuzudingdanEntity> wrapper);
	
}
