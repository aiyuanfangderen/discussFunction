package cn.itcast.ssm.po;

public class Discuss {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column discuss.id
     *
     * @mbggenerated Sun Apr 29 19:11:51 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column discuss.contens
     *
     * @mbggenerated Sun Apr 29 19:11:51 CST 2018
     */
    private String contens;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column discuss.itemsid
     *
     * @mbggenerated Sun Apr 29 19:11:51 CST 2018
     */
    private Integer itemsid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discuss.id
     *
     * @return the value of discuss.id
     *
     * @mbggenerated Sun Apr 29 19:11:51 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discuss.id
     *
     * @param id the value for discuss.id
     *
     * @mbggenerated Sun Apr 29 19:11:51 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discuss.contens
     *
     * @return the value of discuss.contens
     *
     * @mbggenerated Sun Apr 29 19:11:51 CST 2018
     */
    public String getContens() {
        return contens;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discuss.contens
     *
     * @param contens the value for discuss.contens
     *
     * @mbggenerated Sun Apr 29 19:11:51 CST 2018
     */
    public void setContens(String contens) {
        this.contens = contens == null ? null : contens.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column discuss.itemsid
     *
     * @return the value of discuss.itemsid
     *
     * @mbggenerated Sun Apr 29 19:11:51 CST 2018
     */
    public Integer getItemsid() {
        return itemsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column discuss.itemsid
     *
     * @param itemsid the value for discuss.itemsid
     *
     * @mbggenerated Sun Apr 29 19:11:51 CST 2018
     */
    public void setItemsid(Integer itemsid) {
        this.itemsid = itemsid;
    }
}