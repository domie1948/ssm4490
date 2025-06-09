package com.dao;

import com.entity.ZushouhetongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZushouhetongVO;
import com.entity.view.ZushouhetongView;


/**
 * 租售合同
 * 
 * @author 
 * @email 
 * @date 2021-01-20 17:37:56
 */
public interface ZushouhetongDao extends BaseMapper<ZushouhetongEntity> {
	
	List<ZushouhetongVO> selectListVO(@Param("ew") Wrapper<ZushouhetongEntity> wrapper);
	
	ZushouhetongVO selectVO(@Param("ew") Wrapper<ZushouhetongEntity> wrapper);
	
	List<ZushouhetongView> selectListView(@Param("ew") Wrapper<ZushouhetongEntity> wrapper);

	List<ZushouhetongView> selectListView(Pagination page,@Param("ew") Wrapper<ZushouhetongEntity> wrapper);
	
	ZushouhetongView selectView(@Param("ew") Wrapper<ZushouhetongEntity> wrapper);
	
}
