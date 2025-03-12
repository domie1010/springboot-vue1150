package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongdianbaoleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongdianbaoleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongdianbaoleixingView;


/**
 * 充电宝类型
 *
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
public interface ChongdianbaoleixingService extends IService<ChongdianbaoleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongdianbaoleixingVO> selectListVO(Wrapper<ChongdianbaoleixingEntity> wrapper);
   	
   	ChongdianbaoleixingVO selectVO(@Param("ew") Wrapper<ChongdianbaoleixingEntity> wrapper);
   	
   	List<ChongdianbaoleixingView> selectListView(Wrapper<ChongdianbaoleixingEntity> wrapper);
   	
   	ChongdianbaoleixingView selectView(@Param("ew") Wrapper<ChongdianbaoleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongdianbaoleixingEntity> wrapper);

   	

}

