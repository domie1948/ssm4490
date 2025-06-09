package com.entity.vo;

import com.entity.ZushouhetongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 租售合同
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-20 17:37:56
 */
public class ZushouhetongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 租售类型
	 */
	
	private String zushouleixing;
		
	/**
	 * 合同名称
	 */
	
	private String hetongmingcheng;
		
	/**
	 * 合同
	 */
	
	private String hetong;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：租售类型
	 */
	 
	public void setZushouleixing(String zushouleixing) {
		this.zushouleixing = zushouleixing;
	}
	
	/**
	 * 获取：租售类型
	 */
	public String getZushouleixing() {
		return zushouleixing;
	}
				
	
	/**
	 * 设置：合同名称
	 */
	 
	public void setHetongmingcheng(String hetongmingcheng) {
		this.hetongmingcheng = hetongmingcheng;
	}
	
	/**
	 * 获取：合同名称
	 */
	public String getHetongmingcheng() {
		return hetongmingcheng;
	}
				
	
	/**
	 * 设置：合同
	 */
	 
	public void setHetong(String hetong) {
		this.hetong = hetong;
	}
	
	/**
	 * 获取：合同
	 */
	public String getHetong() {
		return hetong;
	}
			
}
