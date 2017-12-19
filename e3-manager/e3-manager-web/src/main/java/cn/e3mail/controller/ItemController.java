package cn.e3mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mail.pojo.TbItem;
import cn.e3mail.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	private ItemService service;
	
	@RequestMapping("/item/{id}")
	@ResponseBody
	public TbItem getItemById(@PathVariable int id){
	
		return service.getItemById(id);
		
	}
}
