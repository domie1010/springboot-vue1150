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


import com.dao.ChongdianbaoguzhangDao;
import com.entity.ChongdianbaoguzhangEntity;
import com.service.ChongdianbaoguzhangService;
import com.entity.vo.ChongdianbaoguzhangVO;
import com.entity.view.ChongdianbaoguzhangView;

@Service("chongdianbaoguzhangService")
public class ChongdianbaoguzhangServiceImpl extends ServiceImpl<ChongdianbaoguzhangDao, ChongdianbaoguzhangEntity> implements ChongdianbaoguzhangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongdianbaoguzhangEntity> page = this.selectPage(
                new Query<ChongdianbaoguzhangEntity>(params).getPage(),
                new EntityWrapper<ChongdianbaoguzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongdianbaoguzhangEntity> wrapper) {
		  Page<ChongdianbaoguzhangView> page =new Query<ChongdianbaoguzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChongdianbaoguzhangVO> selectListVO(Wrapper<ChongdianbaoguzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongdianbaoguzhangVO selectVO(Wrapper<ChongdianbaoguzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongdianbaoguzhangView> selectListView(Wrapper<ChongdianbaoguzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongdianbaoguzhangView selectView(Wrapper<ChongdianbaoguzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
