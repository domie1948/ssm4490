package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 房屋租售
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-20 17:37:56
 */
@TableName("fangwuzushou")
public class FangwuzushouEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FangwuzushouEntity() {
		
	}
	
	public FangwuzushouEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 房屋编号
	 */
					
	private String fangwubianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：房屋编号
	 */
	public void setFangwubianhao(String fangwubianhao) {
		this.fangwubianhao = fangwubianhao;
	}
	/**
	 * 获取：房屋编号
	 */
	public String getFangwubianhao() {
		return fangwubianhao;
	}
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
