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


import com.dao.FangxingxinxiDao;
import com.entity.FangxingxinxiEntity;
import com.service.FangxingxinxiService;
import com.entity.vo.FangxingxinxiVO;
import com.entity.view.FangxingxinxiView;

@Service("fangxingxinxiService")
public class FangxingxinxiServiceImpl extends ServiceImpl<FangxingxinxiDao, FangxingxinxiEntity> implements FangxingxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangxingxinxiEntity> page = this.selectPage(
                new Query<FangxingxinxiEntity>(params).getPage(),
                new EntityWrapper<FangxingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangxingxinxiEntity> wrapper) {
		  Page<FangxingxinxiView> page =new Query<FangxingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangxingxinxiVO> selectListVO(Wrapper<FangxingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangxingxinxiVO selectVO(Wrapper<FangxingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangxingxinxiView> selectListView(Wrapper<FangxingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangxingxinxiView selectView(Wrapper<FangxingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
