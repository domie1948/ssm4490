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


import com.dao.DiscussfangwuzushouDao;
import com.entity.DiscussfangwuzushouEntity;
import com.service.DiscussfangwuzushouService;
import com.entity.vo.DiscussfangwuzushouVO;
import com.entity.view.DiscussfangwuzushouView;

@Service("discussfangwuzushouService")
public class DiscussfangwuzushouServiceImpl extends ServiceImpl<DiscussfangwuzushouDao, DiscussfangwuzushouEntity> implements DiscussfangwuzushouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfangwuzushouEntity> page = this.selectPage(
                new Query<DiscussfangwuzushouEntity>(params).getPage(),
                new EntityWrapper<DiscussfangwuzushouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfangwuzushouEntity> wrapper) {
		  Page<DiscussfangwuzushouView> page =new Query<DiscussfangwuzushouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfangwuzushouVO> selectListVO(Wrapper<DiscussfangwuzushouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfangwuzushouVO selectVO(Wrapper<DiscussfangwuzushouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfangwuzushouView> selectListView(Wrapper<DiscussfangwuzushouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfangwuzushouView selectView(Wrapper<DiscussfangwuzushouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
