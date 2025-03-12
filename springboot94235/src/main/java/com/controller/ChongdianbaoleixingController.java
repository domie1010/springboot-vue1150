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

import com.entity.ChongdianbaoleixingEntity;
import com.entity.view.ChongdianbaoleixingView;

import com.service.ChongdianbaoleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;

/**
 * 充电宝类型 
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
@RestController
@RequestMapping("/chongdianbaoleixing")
public class ChongdianbaoleixingController {
    @Autowired
    private ChongdianbaoleixingService chongdianbaoleixingService;





    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongdianbaoleixingEntity chongdianbaoleixing, 
		HttpServletRequest request){

        EntityWrapper<ChongdianbaoleixingEntity> ew = new EntityWrapper<ChongdianbaoleixingEntity>();


		PageUtils page = chongdianbaoleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongdianbaoleixing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongdianbaoleixingEntity chongdianbaoleixing, 
		HttpServletRequest request){
        EntityWrapper<ChongdianbaoleixingEntity> ew = new EntityWrapper<ChongdianbaoleixingEntity>();

		PageUtils page = chongdianbaoleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongdianbaoleixing), params), params));
        return R.ok().put("data", page);
    }


	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongdianbaoleixingEntity chongdianbaoleixing){
       	EntityWrapper<ChongdianbaoleixingEntity> ew = new EntityWrapper<ChongdianbaoleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongdianbaoleixing, "chongdianbaoleixing")); 
        return R.ok().put("data", chongdianbaoleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongdianbaoleixingEntity chongdianbaoleixing){
        EntityWrapper< ChongdianbaoleixingEntity> ew = new EntityWrapper< ChongdianbaoleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongdianbaoleixing, "chongdianbaoleixing")); 
		ChongdianbaoleixingView chongdianbaoleixingView =  chongdianbaoleixingService.selectView(ew);
		return R.ok("查询充电宝类型成功").put("data", chongdianbaoleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongdianbaoleixingEntity chongdianbaoleixing = chongdianbaoleixingService.selectById(id);
        chongdianbaoleixing = chongdianbaoleixingService.selectView(new EntityWrapper<ChongdianbaoleixingEntity>().eq("id", id));
        return R.ok().put("data", chongdianbaoleixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongdianbaoleixingEntity chongdianbaoleixing = chongdianbaoleixingService.selectById(id);
        chongdianbaoleixing = chongdianbaoleixingService.selectView(new EntityWrapper<ChongdianbaoleixingEntity>().eq("id", id));
        return R.ok().put("data", chongdianbaoleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongdianbaoleixingEntity chongdianbaoleixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongdianbaoleixing);

        chongdianbaoleixingService.insert(chongdianbaoleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongdianbaoleixingEntity chongdianbaoleixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongdianbaoleixing);

        chongdianbaoleixingService.insert(chongdianbaoleixing);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongdianbaoleixingEntity chongdianbaoleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongdianbaoleixing);
        chongdianbaoleixingService.updateById(chongdianbaoleixing);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongdianbaoleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
