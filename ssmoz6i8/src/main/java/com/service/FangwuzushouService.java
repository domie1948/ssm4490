package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangwuzushouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangwuzushouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangwuzushouView;


/**
 * 房屋租售
 *
 * @author 
 * @email 
 * @date 2021-01-20 17:37:56
 */
public interface FangwuzushouService extends IService<FangwuzushouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangwuzushouVO> selectListVO(Wrapper<FangwuzushouEntity> wrapper);
   	
   	FangwuzushouVO selectVO(@Param("ew") Wrapper<FangwuzushouEntity> wrapper);
   	
   	List<FangwuzushouView> selectListView(Wrapper<FangwuzushouEntity> wrapper);
   	
   	FangwuzushouView selectView(@Param("ew") Wrapper<FangwuzushouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangwuzushouEntity> wrapper);
   	
}

