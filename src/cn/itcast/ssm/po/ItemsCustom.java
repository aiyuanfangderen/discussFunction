package cn.itcast.ssm.po;
/**
 * 商品信息的扩展类
 * @author ch928
 *
 */
public class ItemsCustom extends Items
{
   //添加商品信息的扩展属性
	private String contens;
	
	private String details;

	

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getContens() {
		return contens;
	}

	public void setContens(String contens) {
		this.contens = contens;
	}
	
	

}
