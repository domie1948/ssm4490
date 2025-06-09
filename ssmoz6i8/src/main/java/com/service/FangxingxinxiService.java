package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangxingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangxingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangxingxinxiView;


/**
 * 房型信息
 *
 * @author 
 * @email 
 * @date 2021-01-20 17:37:56
 */
public interface FangxingxinxiService extends IService<FangxingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangxingxinxiVO> selectListVO(Wrapper<FangxingxinxiEntity> wrapper);
   	
   	FangxingxinxiVO selectVO(@Param("ew") Wrapper<FangxingxinxiEntity> wrapper);
   	
   	List<FangxingxinxiView> selectListView(Wrapper<FangxingxinxiEntity> wrapper);
   	
   	FangxingxinxiView selectView(@Param("ew") Wrapper<FangxingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangxingxinxiEntity> wrapper);
   	
}

