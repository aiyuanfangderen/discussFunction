package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.Items;
import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsExample;
import cn.itcast.ssm.po.ItemsQueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemsMapperCustom 
{
    
	//��ѯ��Ʒ����Ҫ�������۹��ܵĲ���
	public List<ItemsCustom> querymyitems() throws Exception;
	
	//��Ҫ���ڷ�ҳ�Ĳ���
	public List<ItemsCustom> queryitems() throws Exception;
	
}