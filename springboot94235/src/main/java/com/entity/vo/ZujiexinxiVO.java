package com.entity.vo;

import com.entity.ZujiexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 租借信息
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
public class ZujiexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 充电宝名称
	 */
	
	private String chongdianbaomingcheng;
		
	/**
	 * 充电宝类型
	 */
	
	private String chongdianbaoleixing;
		
	/**
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 剩余电量
	 */
	
	private Double shengyudianliang;
		
	/**
	 * 小时费用
	 */
	
	private Double xiaoshifeiyong;
		
	/**
	 * 租借时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zujieshijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 电话号码
	 */
	
	private String dianhuahaoma;
				
	
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
	 * 设置：租借时间
	 */
	 
	public void setZujieshijian(Date zujieshijian) {
		this.zujieshijian = zujieshijian;
	}
	
	/**
	 * 获取：租借时间
	 */
	public Date getZujieshijian() {
		return zujieshijian;
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
	 * 设置：电话号码
	 */
	 
	public void setDianhuahaoma(String dianhuahaoma) {
		this.dianhuahaoma = dianhuahaoma;
	}
	
	/**
	 * 获取：电话号码
	 */
	public String getDianhuahaoma() {
		return dianhuahaoma;
	}
			
}
