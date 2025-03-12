package com.dao;

import com.entity.ChongdianbaoweixiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongdianbaoweixiuVO;
import com.entity.view.ChongdianbaoweixiuView;


/**
 * 充电宝维修
 * 
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
public interface ChongdianbaoweixiuDao extends BaseMapper<ChongdianbaoweixiuEntity> {
	
	List<ChongdianbaoweixiuVO> selectListVO(@Param("ew") Wrapper<ChongdianbaoweixiuEntity> wrapper);
	
	ChongdianbaoweixiuVO selectVO(@Param("ew") Wrapper<ChongdianbaoweixiuEntity> wrapper);
	
	List<ChongdianbaoweixiuView> selectListView(@Param("ew") Wrapper<ChongdianbaoweixiuEntity> wrapper);

	List<ChongdianbaoweixiuView> selectListView(Pagination page,@Param("ew") Wrapper<ChongdianbaoweixiuEntity> wrapper);

	
	ChongdianbaoweixiuView selectView(@Param("ew") Wrapper<ChongdianbaoweixiuEntity> wrapper);
	

}
