package cn.e3mall.manager.service;

import cn.e3mall.common.utils.DatagridPageBean;
import cn.e3mall.pojo.TbItem;

public interface ItemService {
	
	public TbItem findItemById(Long id);
	
	public DatagridPageBean findItemListByPage(Integer page, Integer rows);

}
