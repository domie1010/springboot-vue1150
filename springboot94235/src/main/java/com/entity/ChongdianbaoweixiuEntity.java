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
 * 充电宝维修
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
@TableName("chongdianbaoweixiu")
public class ChongdianbaoweixiuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongdianbaoweixiuEntity() {
		
	}
	
	public ChongdianbaoweixiuEntity(T t) {
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
    @TableId(type = IdType.AUTO)
	private Long id;
	/**
	 * 报障编号
	 */
					
	private String baozhangbianhao;
	
	/**
	 * 充电宝名称
	 */
					
	private String chongdianbaomingcheng;
	
	/**
	 * 充电宝类型
	 */
					
	private String chongdianbaoleixing;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 维修时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date weixiushijian;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 人员账号
	 */
					
	private String renyuanzhanghao;
	
	/**
	 * 人员姓名
	 */
					
	private String renyuanxingming;
	
	
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
	 * 设置：报障编号
	 */
	public void setBaozhangbianhao(String baozhangbianhao) {
		this.baozhangbianhao = baozhangbianhao;
	}
	/**
	 * 获取：报障编号
	 */
	public String getBaozhangbianhao() {
		return baozhangbianhao;
	}
	/**
	 * 设置：充电宝名称
	 */
	public void setChongdianbaomingcheng(String chongdianbaomingcheng) {
		this.chongdianbaomingcheng = chongdianbaomingcheng;
	}
	/**
	 * 获取：充电宝名称
	 */
	public String getChongdianbaomingcheng() {
		return chongdianbaomingcheng;
	}
	/**
	 * 设置：充电宝类型
	 */
	public void setChongdianbaoleixing(String chongdianbaoleixing) {
		this.chongdianbaoleixing = chongdianbaoleixing;
	}
	/**
	 * 获取：充电宝类型
	 */
	public String getChongdianbaoleixing() {
		return chongdianbaoleixing;
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
	 * 设置：维修时间
	 */
	public void setWeixiushijian(Date weixiushijian) {
		this.weixiushijian = weixiushijian;
	}
	/**
	 * 获取：维修时间
	 */
	public Date getWeixiushijian() {
		return weixiushijian;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：人员账号
	 */
	public void setRenyuanzhanghao(String renyuanzhanghao) {
		this.renyuanzhanghao = renyuanzhanghao;
	}
	/**
	 * 获取：人员账号
	 */
	public String getRenyuanzhanghao() {
		return renyuanzhanghao;
	}
	/**
	 * 设置：人员姓名
	 */
	public void setRenyuanxingming(String renyuanxingming) {
		this.renyuanxingming = renyuanxingming;
	}
	/**
	 * 获取：人员姓名
	 */
	public String getRenyuanxingming() {
		return renyuanxingming;
	}

}
