package com.dao;

import com.entity.ChongdianbaoguzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongdianbaoguzhangVO;
import com.entity.view.ChongdianbaoguzhangView;


/**
 * 充电宝故障
 * 
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
public interface ChongdianbaoguzhangDao extends BaseMapper<ChongdianbaoguzhangEntity> {
	
	List<ChongdianbaoguzhangVO> selectListVO(@Param("ew") Wrapper<ChongdianbaoguzhangEntity> wrapper);
	
	ChongdianbaoguzhangVO selectVO(@Param("ew") Wrapper<ChongdianbaoguzhangEntity> wrapper);
	
	List<ChongdianbaoguzhangView> selectListView(@Param("ew") Wrapper<ChongdianbaoguzhangEntity> wrapper);

	List<ChongdianbaoguzhangView> selectListView(Pagination page,@Param("ew") Wrapper<ChongdianbaoguzhangEntity> wrapper);

	
	ChongdianbaoguzhangView selectView(@Param("ew") Wrapper<ChongdianbaoguzhangEntity> wrapper);
	

}
