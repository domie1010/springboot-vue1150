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


import com.dao.ChongdianbaoDao;
import com.entity.ChongdianbaoEntity;
import com.service.ChongdianbaoService;
import com.entity.vo.ChongdianbaoVO;
import com.entity.view.ChongdianbaoView;

@Service("chongdianbaoService")
public class ChongdianbaoServiceImpl extends ServiceImpl<ChongdianbaoDao, ChongdianbaoEntity> implements ChongdianbaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongdianbaoEntity> page = this.selectPage(
                new Query<ChongdianbaoEntity>(params).getPage(),
                new EntityWrapper<ChongdianbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongdianbaoEntity> wrapper) {
		  Page<ChongdianbaoView> page =new Query<ChongdianbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChongdianbaoVO> selectListVO(Wrapper<ChongdianbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongdianbaoVO selectVO(Wrapper<ChongdianbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongdianbaoView> selectListView(Wrapper<ChongdianbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongdianbaoView selectView(Wrapper<ChongdianbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
