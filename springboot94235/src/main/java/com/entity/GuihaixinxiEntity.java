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
 * 归还信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
@TableName("guihaixinxi")
public class GuihaixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GuihaixinxiEntity() {
		
	}
	
	public GuihaixinxiEntity(T t) {
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
	 * 归还编号
	 */
					
	private String guihaibianhao;
	
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
	 * 租借时间
	 */
					
	private String zujieshijian;
	
	/**
	 * 归还时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date guihaishijian;
	
	/**
	 * 时长
	 */
					
	private Double shizhang;
	
	/**
	 * 小时费用
	 */
					
	private Double xiaoshifeiyong;
	
	/**
	 * 订单状态
	 */
					
	private String dingdanzhuangtai;
	
	/**
	 * 总金额
	 */
					
	private Double jine;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 金额
	 */
					
	private Double yonghuyue;
	
	
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
	 * 设置：归还编号
	 */
	public void setGuihaibianhao(String guihaibianhao) {
		this.guihaibianhao = guihaibianhao;
	}
	/**
	 * 获取：归还编号
	 */
	public String getGuihaibianhao() {
		return guihaibianhao;
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
	 * 设置：租借时间
	 */
	public void setZujieshijian(String zujieshijian) {
		this.zujieshijian = zujieshijian;
	}
	/**
	 * 获取：租借时间
	 */
	public String getZujieshijian() {
		return zujieshijian;
	}
	/**
	 * 设置：归还时间
	 */
	public void setGuihaishijian(Date guihaishijian) {
		this.guihaishijian = guihaishijian;
	}
	/**
	 * 获取：归还时间
	 */
	public Date getGuihaishijian() {
		return guihaishijian;
	}
	/**
	 * 设置：时长
	 */
	public void setShizhang(Double shizhang) {
		this.shizhang = shizhang;
	}
	/**
	 * 获取：时长
	 */
	public Double getShizhang() {
		return shizhang;
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
	 * 设置：订单状态
	 */
	public void setDingdanzhuangtai(String dingdanzhuangtai) {
		this.dingdanzhuangtai = dingdanzhuangtai;
	}
	/**
	 * 获取：订单状态
	 */
	public String getDingdanzhuangtai() {
		return dingdanzhuangtai;
	}
	/**
	 * 设置：总金额
	 */
	public void setJine(Double jine) {
		this.jine = jine;
	}
	/**
	 * 获取：总金额
	 */
	public Double getJine() {
		return jine;
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
	 * 设置：金额
	 */
	public void setYonghuyue(Double yonghuyue) {
		this.yonghuyue = yonghuyue;
	}
	/**
	 * 获取：金额
	 */
	public Double getYonghuyue() {
		return yonghuyue;
	}

}
