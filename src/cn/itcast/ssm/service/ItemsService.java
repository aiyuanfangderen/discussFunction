package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;

/**
 * 商品管理service
 * @author ch928
 *
 */
public interface ItemsService 
{
	
   
    
    //主要用于评论功能的实现
    public List<ItemsCustom> findmyItems() throws Exception;
    
    //主要用于商品的分页功能的实现
    public List<ItemsCustom> findItems() throws Exception;
}
