package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussfangwuzushouEntity;
import com.entity.view.DiscussfangwuzushouView;

import com.service.DiscussfangwuzushouService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 房屋租售评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-20 17:37:56
 */
@RestController
@RequestMapping("/discussfangwuzushou")
public class DiscussfangwuzushouController {
    @Autowired
    private DiscussfangwuzushouService discussfangwuzushouService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussfangwuzushouEntity discussfangwuzushou, HttpServletRequest request){

        EntityWrapper<DiscussfangwuzushouEntity> ew = new EntityWrapper<DiscussfangwuzushouEntity>();
		PageUtils page = discussfangwuzushouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussfangwuzushou), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussfangwuzushouEntity discussfangwuzushou, HttpServletRequest request){
        EntityWrapper<DiscussfangwuzushouEntity> ew = new EntityWrapper<DiscussfangwuzushouEntity>();
		PageUtils page = discussfangwuzushouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussfangwuzushou), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussfangwuzushouEntity discussfangwuzushou){
       	EntityWrapper<DiscussfangwuzushouEntity> ew = new EntityWrapper<DiscussfangwuzushouEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussfangwuzushou, "discussfangwuzushou")); 
        return R.ok().put("data", discussfangwuzushouService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussfangwuzushouEntity discussfangwuzushou){
        EntityWrapper< DiscussfangwuzushouEntity> ew = new EntityWrapper< DiscussfangwuzushouEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussfangwuzushou, "discussfangwuzushou")); 
		DiscussfangwuzushouView discussfangwuzushouView =  discussfangwuzushouService.selectView(ew);
		return R.ok("查询房屋租售评论表成功").put("data", discussfangwuzushouView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussfangwuzushouEntity discussfangwuzushou = discussfangwuzushouService.selectById(id);
        return R.ok().put("data", discussfangwuzushou);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussfangwuzushouEntity discussfangwuzushou = discussfangwuzushouService.selectById(id);
        return R.ok().put("data", discussfangwuzushou);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussfangwuzushouEntity discussfangwuzushou, HttpServletRequest request){
    	discussfangwuzushou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussfangwuzushou);

        discussfangwuzushouService.insert(discussfangwuzushou);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussfangwuzushouEntity discussfangwuzushou, HttpServletRequest request){
    	discussfangwuzushou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussfangwuzushou);

        discussfangwuzushouService.insert(discussfangwuzushou);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussfangwuzushouEntity discussfangwuzushou, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussfangwuzushou);
        discussfangwuzushouService.updateById(discussfangwuzushou);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussfangwuzushouService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussfangwuzushouEntity> wrapper = new EntityWrapper<DiscussfangwuzushouEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussfangwuzushouService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
