package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuzudingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuzudingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuzudingdanView;


/**
 * 出租订单
 *
 * @author 
 * @email 
 * @date 2021-01-20 17:37:56
 */
public interface ChuzudingdanService extends IService<ChuzudingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuzudingdanVO> selectListVO(Wrapper<ChuzudingdanEntity> wrapper);
   	
   	ChuzudingdanVO selectVO(@Param("ew") Wrapper<ChuzudingdanEntity> wrapper);
   	
   	List<ChuzudingdanView> selectListView(Wrapper<ChuzudingdanEntity> wrapper);
   	
   	ChuzudingdanView selectView(@Param("ew") Wrapper<ChuzudingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuzudingdanEntity> wrapper);
   	
}

