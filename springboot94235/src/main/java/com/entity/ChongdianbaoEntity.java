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
 * 充电宝
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
@TableName("chongdianbao")
public class ChongdianbaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongdianbaoEntity() {
		
	}
	
	public ChongdianbaoEntity(T t) {
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
	 * 充电宝编号
	 */
					
	private String chongdianbaobianhao;
	
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
	 * 品牌
	 */
					
	private String pinpai;
	
	/**
	 * 损耗
	 */
					
	private String sunhao;
	
	/**
	 * 小时费用
	 */
					
	private Double xiaoshifeiyong;
	
	/**
	 * 剩余电量
	 */
					
	private Double shengyudianliang;
	
	/**
	 * 投放地点
	 */
					
	private String toufangdidian;
	
	/**
	 * 投放时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date toufangshijian;
	
	/**
	 * 充电宝简介
	 */
					
	private String chongdianbaojianjie;
	
	/**
	 * 评论数
	 */
					
	private Integer discussnum;
	
	
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
	 * 设置：充电宝编号
	 */
	public void setChongdianbaobianhao(String chongdianbaobianhao) {
		this.chongdianbaobianhao = chongdianbaobianhao;
	}
	/**
	 * 获取：充电宝编号
	 */
	public String getChongdianbaobianhao() {
		return chongdianbaobianhao;
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
	 * 设置：品牌
	 */
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
	/**
	 * 设置：损耗
	 */
	public void setSunhao(String sunhao) {
		this.sunhao = sunhao;
	}
	/**
	 * 获取：损耗
	 */
	public String getSunhao() {
		return sunhao;
	}
	/**
	 * 设置：小时费用
	 */
	public void setXiaoshifeiyong(Double xiaoshifeiyong) {
		this.xiaoshifeiyong = xiaoshifeiyong;
	}
	/**
	 * 获取：小时费用
	 */
	public Double getXiaoshifeiyong() {
		return xiaoshifeiyong;
	}
	/**
	 * 设置：剩余电量
	 */
	public void setShengyudianliang(Double shengyudianliang) {
		this.shengyudianliang = shengyudianliang;
	}
	/**
	 * 获取：剩余电量
	 */
	public Double getShengyudianliang() {
		return shengyudianliang;
	}
	/**
	 * 设置：投放地点
	 */
	public void setToufangdidian(String toufangdidian) {
		this.toufangdidian = toufangdidian;
	}
	/**
	 * 获取：投放地点
	 */
	public String getToufangdidian() {
		return toufangdidian;
	}
	/**
	 * 设置：投放时间
	 */
	public void setToufangshijian(Date toufangshijian) {
		this.toufangshijian = toufangshijian;
	}
	/**
	 * 获取：投放时间
	 */
	public Date getToufangshijian() {
		return toufangshijian;
	}
	/**
	 * 设置：充电宝简介
	 */
	public void setChongdianbaojianjie(String chongdianbaojianjie) {
		this.chongdianbaojianjie = chongdianbaojianjie;
	}
	/**
	 * 获取：充电宝简介
	 */
	public String getChongdianbaojianjie() {
		return chongdianbaojianjie;
	}
	/**
	 * 设置：评论数
	 */
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}

}
