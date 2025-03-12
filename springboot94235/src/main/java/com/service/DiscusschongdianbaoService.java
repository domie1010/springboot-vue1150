package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschongdianbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschongdianbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschongdianbaoView;


/**
 * 充电宝评论表
 *
 * @author 
 * @email 
 * @date 2024-03-05 19:52:14
 */
public interface DiscusschongdianbaoService extends IService<DiscusschongdianbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongdianbaoVO> selectListVO(Wrapper<DiscusschongdianbaoEntity> wrapper);
   	
   	DiscusschongdianbaoVO selectVO(@Param("ew") Wrapper<DiscusschongdianbaoEntity> wrapper);
   	
   	List<DiscusschongdianbaoView> selectListView(Wrapper<DiscusschongdianbaoEntity> wrapper);
   	
   	DiscusschongdianbaoView selectView(@Param("ew") Wrapper<DiscusschongdianbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongdianbaoEntity> wrapper);

   	

}

