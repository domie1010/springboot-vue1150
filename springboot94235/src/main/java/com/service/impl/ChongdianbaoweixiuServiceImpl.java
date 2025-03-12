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


import com.dao.ChongdianbaoweixiuDao;
import com.entity.ChongdianbaoweixiuEntity;
import com.service.ChongdianbaoweixiuService;
import com.entity.vo.ChongdianbaoweixiuVO;
import com.entity.view.ChongdianbaoweixiuView;

@Service("chongdianbaoweixiuService")
public class ChongdianbaoweixiuServiceImpl extends ServiceImpl<ChongdianbaoweixiuDao, ChongdianbaoweixiuEntity> implements ChongdianbaoweixiuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongdianbaoweixiuEntity> page = this.selectPage(
                new Query<ChongdianbaoweixiuEntity>(params).getPage(),
                new EntityWrapper<ChongdianbaoweixiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongdianbaoweixiuEntity> wrapper) {
		  Page<ChongdianbaoweixiuView> page =new Query<ChongdianbaoweixiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChongdianbaoweixiuVO> selectListVO(Wrapper<ChongdianbaoweixiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongdianbaoweixiuVO selectVO(Wrapper<ChongdianbaoweixiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongdianbaoweixiuView> selectListView(Wrapper<ChongdianbaoweixiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongdianbaoweixiuView selectView(Wrapper<ChongdianbaoweixiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
