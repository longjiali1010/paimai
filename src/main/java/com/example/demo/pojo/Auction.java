package com.example.demo.pojo;
/**
 * 拍賣表
 * @author ASUS
 *
 */
public class Auction {
	private int auctionId;
	private String auctionName;
	private float auctionStartPrice;
	private float auctionUpset;
	private String auctionStartTime;
	private String auctionEndTime;
	private String auctionPic;
	private String auctionPicType;
	private String auctionDesc;
	public int getAuctionId() {
		return auctionId;
	}
	public void setAuctionId(int auctionId) {
		this.auctionId = auctionId;
	}
	public String getAuctionName() {
		return auctionName;
	}
	public void setAuctionName(String auctionName) {
		this.auctionName = auctionName;
	}
	public float getAuctionStartPrice() {
		return auctionStartPrice;
	}
	public void setAuctionStartPrice(float auctionStartPrice) {
		this.auctionStartPrice = auctionStartPrice;
	}
	public float getAuctionUpset() {
		return auctionUpset;
	}
	public void setAuctionUpset(float auctionUpset) {
		this.auctionUpset = auctionUpset;
	}
	public String getAuctionStartTime() {
		return auctionStartTime;
	}
	public void setAuctionStartTime(String auctionStartTime) {
		this.auctionStartTime = auctionStartTime;
	}
	public String getAuctionEndTime() {
		return auctionEndTime;
	}
	public void setAuctionEndTime(String auctionEndTime) {
		this.auctionEndTime = auctionEndTime;
	}
	public String getAuctionPic() {
		return auctionPic;
	}
	public void setAuctionPic(String auctionPic) {
		this.auctionPic = auctionPic;
	}
	public String getAuctionPicType() {
		return auctionPicType;
	}
	public void setAuctionPicType(String auctionPicType) {
		this.auctionPicType = auctionPicType;
	}
	public String getAuctionDesc() {
		return auctionDesc;
	}
	public void setAuctionDesc(String auctionDesc) {
		this.auctionDesc = auctionDesc;
	}
	public Auction(int auctionId, String auctionName, float auctionStartPrice, float auctionUpset,
			String auctionStartTime, String auctionEndTime, String auctionPic, String auctionPicType,
			String auctionDesc) {
		super();
		this.auctionId = auctionId;
		this.auctionName = auctionName;
		this.auctionStartPrice = auctionStartPrice;
		this.auctionUpset = auctionUpset;
		this.auctionStartTime = auctionStartTime;
		this.auctionEndTime = auctionEndTime;
		this.auctionPic = auctionPic;
		this.auctionPicType = auctionPicType;
		this.auctionDesc = auctionDesc;
	}
	public Auction() {
		super();
	}
	@Override
	public String toString() {
		return "Auction [auctionId=" + auctionId + ", auctionName=" + auctionName + ", auctionStartPrice="
				+ auctionStartPrice + ", auctionUpset=" + auctionUpset + ", auctionStartTime=" + auctionStartTime
				+ ", auctionEndTime=" + auctionEndTime + ", auctionPic=" + auctionPic + ", auctionPicType="
				+ auctionPicType + ", auctionDesc=" + auctionDesc + "]";
	}
}
