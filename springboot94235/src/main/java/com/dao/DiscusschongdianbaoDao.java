package com.dao;

import com.entity.DiscusschongdianbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschongdianbaoVO;
import com.entity.view.DiscusschongdianbaoView;


/**
 * 充电宝评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-05 19:52:14
 */
public interface DiscusschongdianbaoDao extends BaseMapper<DiscusschongdianbaoEntity> {
	
	List<DiscusschongdianbaoVO> selectListVO(@Param("ew") Wrapper<DiscusschongdianbaoEntity> wrapper);
	
	DiscusschongdianbaoVO selectVO(@Param("ew") Wrapper<DiscusschongdianbaoEntity> wrapper);
	
	List<DiscusschongdianbaoView> selectListView(@Param("ew") Wrapper<DiscusschongdianbaoEntity> wrapper);

	List<DiscusschongdianbaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongdianbaoEntity> wrapper);

	
	DiscusschongdianbaoView selectView(@Param("ew") Wrapper<DiscusschongdianbaoEntity> wrapper);
	

}
