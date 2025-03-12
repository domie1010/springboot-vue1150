package com.dao;

import com.entity.ZujiexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZujiexinxiVO;
import com.entity.view.ZujiexinxiView;


/**
 * 租借信息
 * 
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
public interface ZujiexinxiDao extends BaseMapper<ZujiexinxiEntity> {
	
	List<ZujiexinxiVO> selectListVO(@Param("ew") Wrapper<ZujiexinxiEntity> wrapper);
	
	ZujiexinxiVO selectVO(@Param("ew") Wrapper<ZujiexinxiEntity> wrapper);
	
	List<ZujiexinxiView> selectListView(@Param("ew") Wrapper<ZujiexinxiEntity> wrapper);

	List<ZujiexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZujiexinxiEntity> wrapper);

	
	ZujiexinxiView selectView(@Param("ew") Wrapper<ZujiexinxiEntity> wrapper);
	

}
