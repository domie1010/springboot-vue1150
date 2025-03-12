package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongdianbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongdianbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongdianbaoView;


/**
 * 充电宝
 *
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
public interface ChongdianbaoService extends IService<ChongdianbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongdianbaoVO> selectListVO(Wrapper<ChongdianbaoEntity> wrapper);
   	
   	ChongdianbaoVO selectVO(@Param("ew") Wrapper<ChongdianbaoEntity> wrapper);
   	
   	List<ChongdianbaoView> selectListView(Wrapper<ChongdianbaoEntity> wrapper);
   	
   	ChongdianbaoView selectView(@Param("ew") Wrapper<ChongdianbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongdianbaoEntity> wrapper);

   	

}

