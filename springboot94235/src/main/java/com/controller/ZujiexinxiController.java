package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZujiexinxiEntity;
import com.entity.view.ZujiexinxiView;

import com.service.ZujiexinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;

/**
 * 租借信息 
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
@RestController
@RequestMapping("/zujiexinxi")
public class ZujiexinxiController {
    @Autowired
    private ZujiexinxiService zujiexinxiService;





    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZujiexinxiEntity zujiexinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zujiexinxi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZujiexinxiEntity> ew = new EntityWrapper<ZujiexinxiEntity>();


		PageUtils page = zujiexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zujiexinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZujiexinxiEntity zujiexinxi, 
		HttpServletRequest request){
        EntityWrapper<ZujiexinxiEntity> ew = new EntityWrapper<ZujiexinxiEntity>();

		PageUtils page = zujiexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zujiexinxi), params), params));
        return R.ok().put("data", page);
    }


	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZujiexinxiEntity zujiexinxi){
       	EntityWrapper<ZujiexinxiEntity> ew = new EntityWrapper<ZujiexinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zujiexinxi, "zujiexinxi")); 
        return R.ok().put("data", zujiexinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZujiexinxiEntity zujiexinxi){
        EntityWrapper< ZujiexinxiEntity> ew = new EntityWrapper< ZujiexinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zujiexinxi, "zujiexinxi")); 
		ZujiexinxiView zujiexinxiView =  zujiexinxiService.selectView(ew);
		return R.ok("查询租借信息成功").put("data", zujiexinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZujiexinxiEntity zujiexinxi = zujiexinxiService.selectById(id);
        zujiexinxi = zujiexinxiService.selectView(new EntityWrapper<ZujiexinxiEntity>().eq("id", id));
        return R.ok().put("data", zujiexinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZujiexinxiEntity zujiexinxi = zujiexinxiService.selectById(id);
        zujiexinxi = zujiexinxiService.selectView(new EntityWrapper<ZujiexinxiEntity>().eq("id", id));
        return R.ok().put("data", zujiexinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZujiexinxiEntity zujiexinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zujiexinxi);

        zujiexinxiService.insert(zujiexinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZujiexinxiEntity zujiexinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zujiexinxi);

        zujiexinxiService.insert(zujiexinxi);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZujiexinxiEntity zujiexinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zujiexinxi);
        zujiexinxiService.updateById(zujiexinxi);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zujiexinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
