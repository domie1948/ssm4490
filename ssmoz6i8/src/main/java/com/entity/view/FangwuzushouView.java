package com.entity.view;

import com.entity.FangwuzushouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 房屋租售
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-20 17:37:56
 */
@TableName("fangwuzushou")
public class FangwuzushouView  extends FangwuzushouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangwuzushouView(){
	}
 
 	public FangwuzushouView(FangwuzushouEntity fangwuzushouEntity){
 	try {
			BeanUtils.copyProperties(this, fangwuzushouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
