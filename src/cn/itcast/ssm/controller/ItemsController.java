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
 * 商品的Controller
 * @author ch928
 *
 */
@Controller
//为了对url进行分类管理，可以在这里定义根路径
//比如：商品列表：/items/queryItems.action
@RequestMapping("/items")
public class ItemsController 
{
	@Autowired
	private ItemsService itemsService;
   
	
      //查询商品的信息，评论测试
			@RequestMapping("/query")
			public String query(HttpServletRequest request) throws Exception
			{

				 List<ItemsCustom> itemsList=itemsService.findmyItems();
				 System.out.println(itemsList);
				 request.setAttribute("itemsList", itemsList);
//				 return "success";
				return "items/show";

			}
	
		//分页测试
		@RequestMapping("/emps")
		public String getEms(HttpServletRequest request,@RequestParam(value="pn",defaultValue="1")Integer pn) throws Exception
		{
			//引入PageHelper的分页插件
			//查询之前只需要吊桶，传入页码，以及每页的大小
			PageHelper.startPage(pn,5);
			//startPage后面紧跟的查询就是一个分页的查询
			 List<ItemsCustom> itemsList=itemsService.findItems();
			//使用pageinfo包装查询后的结果，只需要将pageinfo交给页面就行了
			 
			PageInfo page=new PageInfo(itemsList);
			request.setAttribute("pageInfo", page);
			return "items/list";
		}
		
		
}
