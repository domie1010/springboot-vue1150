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


import com.dao.DiscusschongdianbaoDao;
import com.entity.DiscusschongdianbaoEntity;
import com.service.DiscusschongdianbaoService;
import com.entity.vo.DiscusschongdianbaoVO;
import com.entity.view.DiscusschongdianbaoView;

@Service("discusschongdianbaoService")
public class DiscusschongdianbaoServiceImpl extends ServiceImpl<DiscusschongdianbaoDao, DiscusschongdianbaoEntity> implements DiscusschongdianbaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongdianbaoEntity> page = this.selectPage(
                new Query<DiscusschongdianbaoEntity>(params).getPage(),
                new EntityWrapper<DiscusschongdianbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongdianbaoEntity> wrapper) {
		  Page<DiscusschongdianbaoView> page =new Query<DiscusschongdianbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscusschongdianbaoVO> selectListVO(Wrapper<DiscusschongdianbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschongdianbaoVO selectVO(Wrapper<DiscusschongdianbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschongdianbaoView> selectListView(Wrapper<DiscusschongdianbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongdianbaoView selectView(Wrapper<DiscusschongdianbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
