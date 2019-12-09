package spring.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TableParam {
	private Integer offset;//请求参数偏移量
	private Integer limit;//显示的行数
	private String sort;
	private String order;
	@DateTimeFormat(pattern ="yyyy-MM-dd HH:mm:ss")
	private Date startTime;
	@DateTimeFormat(pattern ="yyyy-MM-dd HH:mm:ss")
	private Date endTime;
	private Integer userId;

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
//	private Integer total;
//	private List<T> rows;

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}
}
