package com.dao;

import com.entity.ChongdianbaoleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongdianbaoleixingVO;
import com.entity.view.ChongdianbaoleixingView;


/**
 * 充电宝类型
 * 
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
public interface ChongdianbaoleixingDao extends BaseMapper<ChongdianbaoleixingEntity> {
	
	List<ChongdianbaoleixingVO> selectListVO(@Param("ew") Wrapper<ChongdianbaoleixingEntity> wrapper);
	
	ChongdianbaoleixingVO selectVO(@Param("ew") Wrapper<ChongdianbaoleixingEntity> wrapper);
	
	List<ChongdianbaoleixingView> selectListView(@Param("ew") Wrapper<ChongdianbaoleixingEntity> wrapper);

	List<ChongdianbaoleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ChongdianbaoleixingEntity> wrapper);

	
	ChongdianbaoleixingView selectView(@Param("ew") Wrapper<ChongdianbaoleixingEntity> wrapper);
	

}
