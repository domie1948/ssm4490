package com.entity.model;

import com.entity.FangwuzushouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 房屋租售
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-20 17:37:56
 */
public class FangwuzushouModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 标题
	 */
	
	private String biaoti;
		
	/**
	 * 房型
	 */
	
	private String fangxing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 出租定金
	 */
	
	private String chuzudingjin;
		
	/**
	 * 出租价格
	 */
	
	private String chuzujiage;
		
	/**
	 * 出售价格
	 */
	
	private String chushoujiage;
		
	/**
	 * 出售定金
	 */
	
	private String chushoudingjin;
		
	/**
	 * 房屋设施
	 */
	
	private String fangwusheshi;
		
	/**
	 * 房屋介绍
	 */
	
	private String fangwujieshao;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
				
	
	/**
	 * 设置：标题
	 */
	 
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
				
	
	/**
	 * 设置：房型
	 */
	 
	public void setFangxing(String fangxing) {
		this.fangxing = fangxing;
	}
	
	/**
	 * 获取：房型
	 */
	public String getFangxing() {
		return fangxing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：出租定金
	 */
	 
	public void setChuzudingjin(String chuzudingjin) {
		this.chuzudingjin = chuzudingjin;
	}
	
	/**
	 * 获取：出租定金
	 */
	public String getChuzudingjin() {
		return chuzudingjin;
	}
				
	
	/**
	 * 设置：出租价格
	 */
	 
	public void setChuzujiage(String chuzujiage) {
		this.chuzujiage = chuzujiage;
	}
	
	/**
	 * 获取：出租价格
	 */
	public String getChuzujiage() {
		return chuzujiage;
	}
				
	
	/**
	 * 设置：出售价格
	 */
	 
	public void setChushoujiage(String chushoujiage) {
		this.chushoujiage = chushoujiage;
	}
	
	/**
	 * 获取：出售价格
	 */
	public String getChushoujiage() {
		return chushoujiage;
	}
				
	
	/**
	 * 设置：出售定金
	 */
	 
	public void setChushoudingjin(String chushoudingjin) {
		this.chushoudingjin = chushoudingjin;
	}
	
	/**
	 * 获取：出售定金
	 */
	public String getChushoudingjin() {
		return chushoudingjin;
	}
				
	
	/**
	 * 设置：房屋设施
	 */
	 
	public void setFangwusheshi(String fangwusheshi) {
		this.fangwusheshi = fangwusheshi;
	}
	
	/**
	 * 获取：房屋设施
	 */
	public String getFangwusheshi() {
		return fangwusheshi;
	}
				
	
	/**
	 * 设置：房屋介绍
	 */
	 
	public void setFangwujieshao(String fangwujieshao) {
		this.fangwujieshao = fangwujieshao;
	}
	
	/**
	 * 获取：房屋介绍
	 */
	public String getFangwujieshao() {
		return fangwujieshao;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
			
}
