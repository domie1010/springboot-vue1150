package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChongdianbaoleixingDao;
import com.entity.ChongdianbaoleixingEntity;
import com.service.ChongdianbaoleixingService;
import com.entity.vo.ChongdianbaoleixingVO;
import com.entity.view.ChongdianbaoleixingView;

@Service("chongdianbaoleixingService")
public class ChongdianbaoleixingServiceImpl extends ServiceImpl<ChongdianbaoleixingDao, ChongdianbaoleixingEntity> implements ChongdianbaoleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongdianbaoleixingEntity> page = this.selectPage(
                new Query<ChongdianbaoleixingEntity>(params).getPage(),
                new EntityWrapper<ChongdianbaoleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongdianbaoleixingEntity> wrapper) {
		  Page<ChongdianbaoleixingView> page =new Query<ChongdianbaoleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChongdianbaoleixingVO> selectListVO(Wrapper<ChongdianbaoleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongdianbaoleixingVO selectVO(Wrapper<ChongdianbaoleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongdianbaoleixingView> selectListView(Wrapper<ChongdianbaoleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongdianbaoleixingView selectView(Wrapper<ChongdianbaoleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
