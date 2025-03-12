package com.entity.view;

import com.entity.ChongdianbaoguzhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 充电宝故障
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
@TableName("chongdianbaoguzhang")
public class ChongdianbaoguzhangView  extends ChongdianbaoguzhangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongdianbaoguzhangView(){
	}
 
 	public ChongdianbaoguzhangView(ChongdianbaoguzhangEntity chongdianbaoguzhangEntity){
 	try {
			BeanUtils.copyProperties(this, chongdianbaoguzhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
