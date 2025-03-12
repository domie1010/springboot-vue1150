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

import com.entity.ChongdianbaoEntity;
import com.entity.view.ChongdianbaoView;

import com.service.ChongdianbaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;

/**
 * 充电宝 
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
@RestController
@RequestMapping("/chongdianbao")
public class ChongdianbaoController {
    @Autowired
    private ChongdianbaoService chongdianbaoService;





    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongdianbaoEntity chongdianbao, 
		HttpServletRequest request){

        EntityWrapper<ChongdianbaoEntity> ew = new EntityWrapper<ChongdianbaoEntity>();


		PageUtils page = chongdianbaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongdianbao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongdianbaoEntity chongdianbao, 
		HttpServletRequest request){
        EntityWrapper<ChongdianbaoEntity> ew = new EntityWrapper<ChongdianbaoEntity>();

		PageUtils page = chongdianbaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongdianbao), params), params));
        return R.ok().put("data", page);
    }


	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongdianbaoEntity chongdianbao){
       	EntityWrapper<ChongdianbaoEntity> ew = new EntityWrapper<ChongdianbaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongdianbao, "chongdianbao")); 
        return R.ok().put("data", chongdianbaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongdianbaoEntity chongdianbao){
        EntityWrapper< ChongdianbaoEntity> ew = new EntityWrapper< ChongdianbaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongdianbao, "chongdianbao")); 
		ChongdianbaoView chongdianbaoView =  chongdianbaoService.selectView(ew);
		return R.ok("查询充电宝成功").put("data", chongdianbaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongdianbaoEntity chongdianbao = chongdianbaoService.selectById(id);
        chongdianbao = chongdianbaoService.selectView(new EntityWrapper<ChongdianbaoEntity>().eq("id", id));
        return R.ok().put("data", chongdianbao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongdianbaoEntity chongdianbao = chongdianbaoService.selectById(id);
        chongdianbao = chongdianbaoService.selectView(new EntityWrapper<ChongdianbaoEntity>().eq("id", id));
        return R.ok().put("data", chongdianbao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongdianbaoEntity chongdianbao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongdianbao);

        chongdianbaoService.insert(chongdianbao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongdianbaoEntity chongdianbao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongdianbao);

        chongdianbaoService.insert(chongdianbao);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongdianbaoEntity chongdianbao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongdianbao);
        chongdianbaoService.updateById(chongdianbao);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongdianbaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
