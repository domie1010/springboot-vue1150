package com.entity.view;

import com.entity.ChongdianbaoweixiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 充电宝维修
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
@TableName("chongdianbaoweixiu")
public class ChongdianbaoweixiuView  extends ChongdianbaoweixiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongdianbaoweixiuView(){
	}
 
 	public ChongdianbaoweixiuView(ChongdianbaoweixiuEntity chongdianbaoweixiuEntity){
 	try {
			BeanUtils.copyProperties(this, chongdianbaoweixiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
