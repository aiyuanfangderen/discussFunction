package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.Items;
import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsExample;
import cn.itcast.ssm.po.ItemsQueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemsMapperCustom 
{
    
	//查询商品，主要用于评论功能的测试
	public List<ItemsCustom> querymyitems() throws Exception;
	
	//主要用于分页的操作
	public List<ItemsCustom> queryitems() throws Exception;
	
}