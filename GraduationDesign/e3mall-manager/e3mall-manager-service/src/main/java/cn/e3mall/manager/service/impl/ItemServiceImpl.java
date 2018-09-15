package cn.e3mall.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.e3mall.common.utils.DatagridPageBean;
import cn.e3mall.manager.service.ItemService;
import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper tbItemMapper;
	
	@Override
	public TbItem findItemById(Long id) {
		TbItem item = tbItemMapper.selectByPrimaryKey(id);
		return item;
	}

	@Override
	public DatagridPageBean findItemListByPage(Integer page, Integer rows) {
		
		TbItemExample example = new TbItemExample();
		PageHelper.startPage(page, rows);
		List<TbItem> list = tbItemMapper.selectByExample(example);
		
		DatagridPageBean pageBean = new DatagridPageBean();
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		pageBean.setRows(list);
		pageBean.setTotal(pageInfo.getTotal());
		
		return pageBean;
	}

}
