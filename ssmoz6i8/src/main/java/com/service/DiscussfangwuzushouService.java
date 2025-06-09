package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfangwuzushouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfangwuzushouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfangwuzushouView;


/**
 * 房屋租售评论表
 *
 * @author 
 * @email 
 * @date 2021-01-20 17:37:56
 */
public interface DiscussfangwuzushouService extends IService<DiscussfangwuzushouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfangwuzushouVO> selectListVO(Wrapper<DiscussfangwuzushouEntity> wrapper);
   	
   	DiscussfangwuzushouVO selectVO(@Param("ew") Wrapper<DiscussfangwuzushouEntity> wrapper);
   	
   	List<DiscussfangwuzushouView> selectListView(Wrapper<DiscussfangwuzushouEntity> wrapper);
   	
   	DiscussfangwuzushouView selectView(@Param("ew") Wrapper<DiscussfangwuzushouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfangwuzushouEntity> wrapper);
   	
}

