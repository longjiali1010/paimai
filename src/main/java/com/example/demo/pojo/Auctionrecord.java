package com.example.demo.pojo;

/**
 * 記錄表
 * @author ASUS
 *
 */
public class Auctionrecord {
	private int id;
	private int userId;
	private int auctionId;
	private String auctionTime;
	private float auctionPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getAuctionId() {
		return auctionId;
	}
	public void setAuctionId(int auctionId) {
		this.auctionId = auctionId;
	}
	public String getAuctionTime() {
		return auctionTime;
	}
	public void setAuctionTime(String auctionTime) {
		this.auctionTime = auctionTime;
	}
	public float getAuctionPrice() {
		return auctionPrice;
	}
	public void setAuctionPrice(float auctionPrice) {
		this.auctionPrice = auctionPrice;
	}
	public Auctionrecord(int id, int userId, int auctionId, String auctionTime, float auctionPrice) {
		super();
		this.id = id;
		this.userId = userId;
		this.auctionId = auctionId;
		this.auctionTime = auctionTime;
		this.auctionPrice = auctionPrice;
	}
	public Auctionrecord() {
		super();
	}
	@Override
	public String toString() {
		return "Auctionrecord [id=" + id + ", userId=" + userId + ", auctionId=" + auctionId + ", auctionTime="
				+ auctionTime + ", auctionPrice=" + auctionPrice + "]";
	}
}
