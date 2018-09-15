package cn.e3mall.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.e3mall.common.utils.DatagridPageBean;
import cn.e3mall.manager.service.ItemService;
import cn.e3mall.pojo.TbItem;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;

	@RequestMapping("/item/{itemId}")
	public TbItem findItemById(@PathVariable Long itemId){
		TbItem tbItem = itemService.findItemById(itemId);
		return tbItem;
	}
	
	@RequestMapping("/item/list")
	public DatagridPageBean findItemListByPage(@RequestParam(defaultValue="1")Integer page, @RequestParam(defaultValue="30")Integer rows){
		DatagridPageBean findItemListByPage = itemService.findItemListByPage(page, rows);
		return findItemListByPage;
	}
}
