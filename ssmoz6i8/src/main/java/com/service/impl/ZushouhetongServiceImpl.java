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


import com.dao.ZushouhetongDao;
import com.entity.ZushouhetongEntity;
import com.service.ZushouhetongService;
import com.entity.vo.ZushouhetongVO;
import com.entity.view.ZushouhetongView;

@Service("zushouhetongService")
public class ZushouhetongServiceImpl extends ServiceImpl<ZushouhetongDao, ZushouhetongEntity> implements ZushouhetongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZushouhetongEntity> page = this.selectPage(
                new Query<ZushouhetongEntity>(params).getPage(),
                new EntityWrapper<ZushouhetongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZushouhetongEntity> wrapper) {
		  Page<ZushouhetongView> page =new Query<ZushouhetongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZushouhetongVO> selectListVO(Wrapper<ZushouhetongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZushouhetongVO selectVO(Wrapper<ZushouhetongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZushouhetongView> selectListView(Wrapper<ZushouhetongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZushouhetongView selectView(Wrapper<ZushouhetongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
