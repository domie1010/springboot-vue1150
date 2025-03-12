package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZujiexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZujiexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZujiexinxiView;


/**
 * 租借信息
 *
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
public interface ZujiexinxiService extends IService<ZujiexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZujiexinxiVO> selectListVO(Wrapper<ZujiexinxiEntity> wrapper);
   	
   	ZujiexinxiVO selectVO(@Param("ew") Wrapper<ZujiexinxiEntity> wrapper);
   	
   	List<ZujiexinxiView> selectListView(Wrapper<ZujiexinxiEntity> wrapper);
   	
   	ZujiexinxiView selectView(@Param("ew") Wrapper<ZujiexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZujiexinxiEntity> wrapper);

   	

}

