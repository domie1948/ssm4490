package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZushouhetongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZushouhetongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZushouhetongView;


/**
 * 租售合同
 *
 * @author 
 * @email 
 * @date 2021-01-20 17:37:56
 */
public interface ZushouhetongService extends IService<ZushouhetongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZushouhetongVO> selectListVO(Wrapper<ZushouhetongEntity> wrapper);
   	
   	ZushouhetongVO selectVO(@Param("ew") Wrapper<ZushouhetongEntity> wrapper);
   	
   	List<ZushouhetongView> selectListView(Wrapper<ZushouhetongEntity> wrapper);
   	
   	ZushouhetongView selectView(@Param("ew") Wrapper<ZushouhetongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZushouhetongEntity> wrapper);
   	
}

