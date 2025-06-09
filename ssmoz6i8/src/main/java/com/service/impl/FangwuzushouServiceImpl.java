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


import com.dao.FangwuzushouDao;
import com.entity.FangwuzushouEntity;
import com.service.FangwuzushouService;
import com.entity.vo.FangwuzushouVO;
import com.entity.view.FangwuzushouView;

@Service("fangwuzushouService")
public class FangwuzushouServiceImpl extends ServiceImpl<FangwuzushouDao, FangwuzushouEntity> implements FangwuzushouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangwuzushouEntity> page = this.selectPage(
                new Query<FangwuzushouEntity>(params).getPage(),
                new EntityWrapper<FangwuzushouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangwuzushouEntity> wrapper) {
		  Page<FangwuzushouView> page =new Query<FangwuzushouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangwuzushouVO> selectListVO(Wrapper<FangwuzushouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangwuzushouVO selectVO(Wrapper<FangwuzushouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangwuzushouView> selectListView(Wrapper<FangwuzushouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangwuzushouView selectView(Wrapper<FangwuzushouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
