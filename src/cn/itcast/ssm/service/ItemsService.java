package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;

/**
 * ��Ʒ����service
 * @author ch928
 *
 */
public interface ItemsService 
{
	
   
    
    //��Ҫ�������۹��ܵ�ʵ��
    public List<ItemsCustom> findmyItems() throws Exception;
    
    //��Ҫ������Ʒ�ķ�ҳ���ܵ�ʵ��
    public List<ItemsCustom> findItems() throws Exception;
}
