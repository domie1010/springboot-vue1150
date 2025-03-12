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

import com.entity.ChongdianbaoweixiuEntity;
import com.entity.view.ChongdianbaoweixiuView;

import com.service.ChongdianbaoweixiuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;

/**
 * 充电宝维修 
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
@RestController
@RequestMapping("/chongdianbaoweixiu")
public class ChongdianbaoweixiuController {
    @Autowired
    private ChongdianbaoweixiuService chongdianbaoweixiuService;





    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongdianbaoweixiuEntity chongdianbaoweixiu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			chongdianbaoweixiu.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("weixiurenyuan")) {
			chongdianbaoweixiu.setRenyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ChongdianbaoweixiuEntity> ew = new EntityWrapper<ChongdianbaoweixiuEntity>();


		PageUtils page = chongdianbaoweixiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongdianbaoweixiu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongdianbaoweixiuEntity chongdianbaoweixiu, 
		HttpServletRequest request){
        EntityWrapper<ChongdianbaoweixiuEntity> ew = new EntityWrapper<ChongdianbaoweixiuEntity>();

		PageUtils page = chongdianbaoweixiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongdianbaoweixiu), params), params));
        return R.ok().put("data", page);
    }


	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongdianbaoweixiuEntity chongdianbaoweixiu){
       	EntityWrapper<ChongdianbaoweixiuEntity> ew = new EntityWrapper<ChongdianbaoweixiuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongdianbaoweixiu, "chongdianbaoweixiu")); 
        return R.ok().put("data", chongdianbaoweixiuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongdianbaoweixiuEntity chongdianbaoweixiu){
        EntityWrapper< ChongdianbaoweixiuEntity> ew = new EntityWrapper< ChongdianbaoweixiuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongdianbaoweixiu, "chongdianbaoweixiu")); 
		ChongdianbaoweixiuView chongdianbaoweixiuView =  chongdianbaoweixiuService.selectView(ew);
		return R.ok("查询充电宝维修成功").put("data", chongdianbaoweixiuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongdianbaoweixiuEntity chongdianbaoweixiu = chongdianbaoweixiuService.selectById(id);
        chongdianbaoweixiu = chongdianbaoweixiuService.selectView(new EntityWrapper<ChongdianbaoweixiuEntity>().eq("id", id));
        return R.ok().put("data", chongdianbaoweixiu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongdianbaoweixiuEntity chongdianbaoweixiu = chongdianbaoweixiuService.selectById(id);
        chongdianbaoweixiu = chongdianbaoweixiuService.selectView(new EntityWrapper<ChongdianbaoweixiuEntity>().eq("id", id));
        return R.ok().put("data", chongdianbaoweixiu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongdianbaoweixiuEntity chongdianbaoweixiu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongdianbaoweixiu);

        chongdianbaoweixiuService.insert(chongdianbaoweixiu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongdianbaoweixiuEntity chongdianbaoweixiu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongdianbaoweixiu);

        chongdianbaoweixiuService.insert(chongdianbaoweixiu);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongdianbaoweixiuEntity chongdianbaoweixiu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongdianbaoweixiu);
        chongdianbaoweixiuService.updateById(chongdianbaoweixiu);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongdianbaoweixiuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
