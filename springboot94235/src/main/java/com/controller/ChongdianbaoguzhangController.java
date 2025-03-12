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

import com.entity.ChongdianbaoguzhangEntity;
import com.entity.view.ChongdianbaoguzhangView;

import com.service.ChongdianbaoguzhangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;

/**
 * 充电宝故障 
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 19:52:13
 */
@RestController
@RequestMapping("/chongdianbaoguzhang")
public class ChongdianbaoguzhangController {
    @Autowired
    private ChongdianbaoguzhangService chongdianbaoguzhangService;





    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongdianbaoguzhangEntity chongdianbaoguzhang, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			chongdianbaoguzhang.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("weixiurenyuan")) {
			chongdianbaoguzhang.setRenyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ChongdianbaoguzhangEntity> ew = new EntityWrapper<ChongdianbaoguzhangEntity>();


		PageUtils page = chongdianbaoguzhangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongdianbaoguzhang), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongdianbaoguzhangEntity chongdianbaoguzhang, 
		HttpServletRequest request){
        EntityWrapper<ChongdianbaoguzhangEntity> ew = new EntityWrapper<ChongdianbaoguzhangEntity>();

		PageUtils page = chongdianbaoguzhangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongdianbaoguzhang), params), params));
        return R.ok().put("data", page);
    }


	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongdianbaoguzhangEntity chongdianbaoguzhang){
       	EntityWrapper<ChongdianbaoguzhangEntity> ew = new EntityWrapper<ChongdianbaoguzhangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongdianbaoguzhang, "chongdianbaoguzhang")); 
        return R.ok().put("data", chongdianbaoguzhangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongdianbaoguzhangEntity chongdianbaoguzhang){
        EntityWrapper< ChongdianbaoguzhangEntity> ew = new EntityWrapper< ChongdianbaoguzhangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongdianbaoguzhang, "chongdianbaoguzhang")); 
		ChongdianbaoguzhangView chongdianbaoguzhangView =  chongdianbaoguzhangService.selectView(ew);
		return R.ok("查询充电宝故障成功").put("data", chongdianbaoguzhangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongdianbaoguzhangEntity chongdianbaoguzhang = chongdianbaoguzhangService.selectById(id);
        chongdianbaoguzhang = chongdianbaoguzhangService.selectView(new EntityWrapper<ChongdianbaoguzhangEntity>().eq("id", id));
        return R.ok().put("data", chongdianbaoguzhang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongdianbaoguzhangEntity chongdianbaoguzhang = chongdianbaoguzhangService.selectById(id);
        chongdianbaoguzhang = chongdianbaoguzhangService.selectView(new EntityWrapper<ChongdianbaoguzhangEntity>().eq("id", id));
        return R.ok().put("data", chongdianbaoguzhang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongdianbaoguzhangEntity chongdianbaoguzhang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongdianbaoguzhang);

        chongdianbaoguzhangService.insert(chongdianbaoguzhang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongdianbaoguzhangEntity chongdianbaoguzhang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chongdianbaoguzhang);

        chongdianbaoguzhangService.insert(chongdianbaoguzhang);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongdianbaoguzhangEntity chongdianbaoguzhang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongdianbaoguzhang);
        chongdianbaoguzhangService.updateById(chongdianbaoguzhang);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<ChongdianbaoguzhangEntity> list = new ArrayList<ChongdianbaoguzhangEntity>();
        for(Long id : ids) {
            ChongdianbaoguzhangEntity chongdianbaoguzhang = chongdianbaoguzhangService.selectById(id);
            chongdianbaoguzhang.setSfsh(sfsh);
            chongdianbaoguzhang.setShhf(shhf);
            list.add(chongdianbaoguzhang);
        }
        chongdianbaoguzhangService.updateBatchById(list);
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongdianbaoguzhangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
