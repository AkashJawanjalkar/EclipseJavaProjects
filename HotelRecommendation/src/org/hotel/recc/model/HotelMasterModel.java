package org.hotel.recc.model;

public class HotelMasterModel {

	private int Hid;
	private String Hname;
	private String Htype;
	private String address;
	private int aid;
	private int cityid;
	private int Price;


	public HotelMasterModel()
	{
		
	}


	public int getHid() {
		return Hid;
	}


	public void setHid(int hid) {
		Hid = hid;
	}


	public String getHname() {
		return Hname;
	}


	public void setHname(String hname) {
		Hname = hname;
	}


	public String getHtype() {
		return Htype;
	}


	public void setHtype(String htype) {
		Htype = htype;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAid() {
		return aid;
	}


	public void setAid(int aid) {
		this.aid = aid;
	}


	public int getCityid() {
		return cityid;
	}


	public void setCityid(int cityid) {
		this.cityid = cityid;
	}


	public int getPrice() {
		return Price;
	}


	public void setPrice(int price) {
		Price = price;
	}
}