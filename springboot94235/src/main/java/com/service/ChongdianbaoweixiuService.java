package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongdianbaoweixiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongdianbaoweixiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongdianbaoweixiuView;


/**
 * 充电宝维修
 *
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
public interface ChongdianbaoweixiuService extends IService<ChongdianbaoweixiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongdianbaoweixiuVO> selectListVO(Wrapper<ChongdianbaoweixiuEntity> wrapper);
   	
   	ChongdianbaoweixiuVO selectVO(@Param("ew") Wrapper<ChongdianbaoweixiuEntity> wrapper);
   	
   	List<ChongdianbaoweixiuView> selectListView(Wrapper<ChongdianbaoweixiuEntity> wrapper);
   	
   	ChongdianbaoweixiuView selectView(@Param("ew") Wrapper<ChongdianbaoweixiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongdianbaoweixiuEntity> wrapper);

   	

}

