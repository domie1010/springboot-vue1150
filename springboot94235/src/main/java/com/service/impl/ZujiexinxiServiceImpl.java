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


import com.dao.ZujiexinxiDao;
import com.entity.ZujiexinxiEntity;
import com.service.ZujiexinxiService;
import com.entity.vo.ZujiexinxiVO;
import com.entity.view.ZujiexinxiView;

@Service("zujiexinxiService")
public class ZujiexinxiServiceImpl extends ServiceImpl<ZujiexinxiDao, ZujiexinxiEntity> implements ZujiexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZujiexinxiEntity> page = this.selectPage(
                new Query<ZujiexinxiEntity>(params).getPage(),
                new EntityWrapper<ZujiexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZujiexinxiEntity> wrapper) {
		  Page<ZujiexinxiView> page =new Query<ZujiexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZujiexinxiVO> selectListVO(Wrapper<ZujiexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZujiexinxiVO selectVO(Wrapper<ZujiexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZujiexinxiView> selectListView(Wrapper<ZujiexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZujiexinxiView selectView(Wrapper<ZujiexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
