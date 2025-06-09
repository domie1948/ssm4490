package com.entity.view;

import com.entity.FangxingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 房型信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-20 17:37:56
 */
@TableName("fangxingxinxi")
public class FangxingxinxiView  extends FangxingxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangxingxinxiView(){
	}
 
 	public FangxingxinxiView(FangxingxinxiEntity fangxingxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, fangxingxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
