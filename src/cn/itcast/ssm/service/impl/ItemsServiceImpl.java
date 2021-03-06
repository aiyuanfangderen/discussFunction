package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.ItemsMapper;
import cn.itcast.ssm.mapper.ItemsMapperCustom;
import cn.itcast.ssm.po.Items;
import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;
import cn.itcast.ssm.service.ItemsService;

/**
 * 商品的管理实现类
 * @author ch928
 *
 */
public class ItemsServiceImpl implements ItemsService
{
	@Autowired
	private ItemsMapperCustom itemsMapperCustom;

	
	
	@Autowired
	private ItemsMapper itemsMapper;
	
	

	

	

	@Override
	public List<ItemsCustom> findItems() throws Exception {
		
		return itemsMapperCustom.queryitems();
	}

	@Override
	public List<ItemsCustom> findmyItems() throws Exception {
		
		return itemsMapperCustom.querymyitems();
	}

}
