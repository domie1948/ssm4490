package com.entity.view;

import com.entity.ChuzudingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 出租订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-20 17:37:56
 */
@TableName("chuzudingdan")
public class ChuzudingdanView  extends ChuzudingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChuzudingdanView(){
	}
 
 	public ChuzudingdanView(ChuzudingdanEntity chuzudingdanEntity){
 	try {
			BeanUtils.copyProperties(this, chuzudingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
