package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongdianbaoguzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongdianbaoguzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongdianbaoguzhangView;


/**
 * 充电宝故障
 *
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
public interface ChongdianbaoguzhangService extends IService<ChongdianbaoguzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongdianbaoguzhangVO> selectListVO(Wrapper<ChongdianbaoguzhangEntity> wrapper);
   	
   	ChongdianbaoguzhangVO selectVO(@Param("ew") Wrapper<ChongdianbaoguzhangEntity> wrapper);
   	
   	List<ChongdianbaoguzhangView> selectListView(Wrapper<ChongdianbaoguzhangEntity> wrapper);
   	
   	ChongdianbaoguzhangView selectView(@Param("ew") Wrapper<ChongdianbaoguzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongdianbaoguzhangEntity> wrapper);

   	

}

