package yt.pojo;

public class QueryVo {

	
	private String cust_name;
	private Integer cust_source;
	private Integer cust_industry;
	private Integer cust_level;
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public Integer getCust_source() {
		return cust_source;
	}
	public void setCust_source(Integer cust_source) {
		this.cust_source = cust_source;
	}
	public Integer getCust_industry() {
		return cust_industry;
	}
	public void setCust_industry(Integer cust_industry) {
		this.cust_industry = cust_industry;
	}
	public Integer getCust_level() {
		return cust_level;
	}
	public void setCust_level(Integer cust_level) {
		this.cust_level = cust_level;
	}
	@Override
	public String toString() {
		return "QueryVo [cust_name=" + cust_name + ", cust_source=" + cust_source + ", cust_industry=" + cust_industry
				+ ", cust_level=" + cust_level + "]";
	}
	
	
	
	
}
