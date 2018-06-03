package pers.weisg.site.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pers.weisg.site.entity.User;


/** 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author WEISANGNG   
 * @date 2018年2月15日   
 */
@RestController
public class HelloController {
	
	//@Autowired
	
	@RequestMapping(value="/admin/demo1",method = RequestMethod.GET)
	public Map<String, Object> demo1(String mobile){
		Map<String, Object> retMap = new HashMap<String, Object>();
		
		retMap.put("mobile", mobile);
		return retMap;
	}
	@RequestMapping(value="/admin/demo11",method = RequestMethod.POST)
	public Map<String, Object> demo11(Map<String, Object> params){
		Map<String, Object> retMap = new HashMap<String, Object>();
		
		
		return retMap;
	}
	
	@RequestMapping(value="/admin/demo2",method = RequestMethod.POST)
	public Map<String, Object> demo2(@RequestBody Map<String, Object> params){
		Map<String, Object> retMap = new HashMap<String, Object>();
		
		
		return retMap;
	}
	
	@RequestMapping(value="/admin/demo3",method = RequestMethod.POST)
	public Map<String, Object> demo3(@RequestBody User user){
		Map<String, Object> retMap = new HashMap<String, Object>();
		
		
		return retMap;
	}
	
	@RequestMapping(value="/admin/demo4",method = RequestMethod.GET)
	public Map<String, Object> demo4(@RequestParam Map<String, Object> params){
		Map<String, Object> retMap = new HashMap<String, Object>();
		
		
		return retMap;
	}
	
	@RequestMapping(value="/admin/demo5",method = RequestMethod.GET)
	public Map<String, Object> demo5(@RequestParam Map<String, Object> params){
		Map<String, Object> retMap = new HashMap<String, Object>();
		
		
		return retMap;
	}
	
	@RequestMapping(value="/admin/demo6",method = RequestMethod.GET)
	public Map<String, Object> demo6(@RequestParam Map<String, Object> params){
		Map<String, Object> retMap = new HashMap<String, Object>();
		
		
		return retMap;
	}
	
	@RequestMapping(value="/admin/demo7",method = RequestMethod.GET)
	public Map<String, Object> demo7(@RequestParam Map<String, Object> params){
		Map<String, Object> retMap = new HashMap<String, Object>();
		
		
		return retMap;
	}
	
	@RequestMapping(value="/admin/demo8",method = RequestMethod.GET)
	public Map<String, Object> demo8(@RequestParam Map<String, Object> params){
		Map<String, Object> retMap = new HashMap<String, Object>();
		
		
		return retMap;
	}
	
	@RequestMapping(value="/admin/demo9",method = RequestMethod.GET)
	public Map<String, Object> demo9(@RequestParam Map<String, Object> params){
		Map<String, Object> retMap = new HashMap<String, Object>();
		
		
		return retMap;
	}
	
	@RequestMapping(value="/admin/demo10",method = RequestMethod.GET)
	public Map<String, Object> demo10(@RequestParam Map<String, Object> params){
		Map<String, Object> retMap = new HashMap<String, Object>();
		
		
		return retMap;
	}
	
	@RequestMapping(value="/admin/sayHello",method = RequestMethod.POST)
	public Map<String, Object> sayHello(@RequestParam Map<String, Object> params){
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("key1", "values1");
		retMap.putAll(params);
		return retMap;
	}
	
}
