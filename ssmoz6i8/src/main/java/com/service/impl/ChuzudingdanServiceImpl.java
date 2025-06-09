package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChuzudingdanDao;
import com.entity.ChuzudingdanEntity;
import com.service.ChuzudingdanService;
import com.entity.vo.ChuzudingdanVO;
import com.entity.view.ChuzudingdanView;

@Service("chuzudingdanService")
public class ChuzudingdanServiceImpl extends ServiceImpl<ChuzudingdanDao, ChuzudingdanEntity> implements ChuzudingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuzudingdanEntity> page = this.selectPage(
                new Query<ChuzudingdanEntity>(params).getPage(),
                new EntityWrapper<ChuzudingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuzudingdanEntity> wrapper) {
		  Page<ChuzudingdanView> page =new Query<ChuzudingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuzudingdanVO> selectListVO(Wrapper<ChuzudingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuzudingdanVO selectVO(Wrapper<ChuzudingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuzudingdanView> selectListView(Wrapper<ChuzudingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuzudingdanView selectView(Wrapper<ChuzudingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
