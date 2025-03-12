package com.dao;

import com.entity.ChongdianbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongdianbaoVO;
import com.entity.view.ChongdianbaoView;


/**
 * 充电宝
 * 
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
public interface ChongdianbaoDao extends BaseMapper<ChongdianbaoEntity> {
	
	List<ChongdianbaoVO> selectListVO(@Param("ew") Wrapper<ChongdianbaoEntity> wrapper);
	
	ChongdianbaoVO selectVO(@Param("ew") Wrapper<ChongdianbaoEntity> wrapper);
	
	List<ChongdianbaoView> selectListView(@Param("ew") Wrapper<ChongdianbaoEntity> wrapper);

	List<ChongdianbaoView> selectListView(Pagination page,@Param("ew") Wrapper<ChongdianbaoEntity> wrapper);

	
	ChongdianbaoView selectView(@Param("ew") Wrapper<ChongdianbaoEntity> wrapper);
	

}
