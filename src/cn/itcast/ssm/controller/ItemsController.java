package cn.itcast.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.itcast.ssm.po.Items;
import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;
import cn.itcast.ssm.service.ItemsService;

/**
 * ��Ʒ��Controller
 * @author ch928
 *
 */
@Controller
//Ϊ�˶�url���з���������������ﶨ���·��
//���磺��Ʒ�б�/items/queryItems.action
@RequestMapping("/items")
public class ItemsController 
{
	@Autowired
	private ItemsService itemsService;
   
	
      //��ѯ��Ʒ����Ϣ�����۲���
			@RequestMapping("/query")
			public String query(HttpServletRequest request) throws Exception
			{

				 List<ItemsCustom> itemsList=itemsService.findmyItems();
				 System.out.println(itemsList);
				 request.setAttribute("itemsList", itemsList);
//				 return "success";
				return "items/show";

			}
	
		//��ҳ����
		@RequestMapping("/emps")
		public String getEms(HttpServletRequest request,@RequestParam(value="pn",defaultValue="1")Integer pn) throws Exception
		{
			//����PageHelper�ķ�ҳ���
			//��ѯ֮ǰֻ��Ҫ��Ͱ������ҳ�룬�Լ�ÿҳ�Ĵ�С
			PageHelper.startPage(pn,5);
			//startPage��������Ĳ�ѯ����һ����ҳ�Ĳ�ѯ
			 List<ItemsCustom> itemsList=itemsService.findItems();
			//ʹ��pageinfo��װ��ѯ��Ľ����ֻ��Ҫ��pageinfo����ҳ�������
			 
			PageInfo page=new PageInfo(itemsList);
			request.setAttribute("pageInfo", page);
			return "items/list";
		}
		
		
}
