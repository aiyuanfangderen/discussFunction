package cn.itcast.ssm.po;

/**
 * ��Ʒ�İ�װ����
 * @author ch928
 *
 */
public class ItemsQueryVo 
{
    //��Ʒ��Ϣ
	private Items items;
	
	
    //���۵���Ϣ
	private Discuss discuss;
	
	//�ظ�����Ϣ
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
