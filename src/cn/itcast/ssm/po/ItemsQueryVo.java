package cn.itcast.ssm.po;

/**
 * 商品的包装对象
 * @author ch928
 *
 */
public class ItemsQueryVo 
{
    //商品信息
	private Items items;
	
	
    //评论的信息
	private Discuss discuss;
	
	//回复的信息
	private Reply reply;
	
	
	public Discuss getDiscuss() {
		return discuss;
	}

	public void setDiscuss(Discuss discuss) {
		this.discuss = discuss;
	}

	public Reply getReply() {
		return reply;
	}

	public void setReply(Reply reply) {
		this.reply = reply;
	}

	

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	

	
	
	
}
