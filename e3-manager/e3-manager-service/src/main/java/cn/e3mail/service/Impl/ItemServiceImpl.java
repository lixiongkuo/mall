package cn.e3mail.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mail.mapper.TbItemMapper;
import cn.e3mail.pojo.TbItem;
import cn.e3mail.service.ItemService;
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	public TbItem getItemById(long id) {
		
		TbItem item = itemMapper.selectByPrimaryKey(id);
		
		return item;
	}

}
