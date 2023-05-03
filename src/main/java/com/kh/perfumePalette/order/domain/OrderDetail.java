package com.kh.perfumePalette.order.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDetail {
	

	// ORDER_DETAIL_TBL
	
	private String 		orderNo;
	private int 		perfumeNo;
	
	private int			orderQuantity;
	private int			perfumePrice;
	
	private int 		reviewStatus;
	
	
	public OrderDetail() {}
	public OrderDetail(
			String orderNo
			, int perfumeNo
			, int orderQuantity
			, int perfumePrice
			, int reviewStatus) {
		
		super();
		this.orderNo = orderNo;
		this.perfumeNo = perfumeNo;
		this.orderQuantity = orderQuantity;
		this.perfumePrice = perfumePrice;
		this.reviewStatus = reviewStatus;
	}


	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public int getPerfumeNo() {
		return perfumeNo;
	}

	public void setPerfumeNo(int perfumeNo) {
		this.perfumeNo = perfumeNo;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public int getPerfumePrice() {
		return perfumePrice;
	}

	public void setPerfumePrice(int perfumePrice) {
		this.perfumePrice = perfumePrice;
	}
	
	public int getReviewStatus() {
		return reviewStatus;
	}
	
	public void setReviewStatus(int reviewStatus) {
		this.reviewStatus = reviewStatus;
	}
	@Override
	public String toString() {
		return "OrderDetail [orderNo=" + orderNo + ", perfumeNo=" + perfumeNo + ", orderQuantity=" + orderQuantity
				+ ", perfumePrice=" + perfumePrice + ", reviewStatus=" + reviewStatus + "]";
	}
	
	

}
