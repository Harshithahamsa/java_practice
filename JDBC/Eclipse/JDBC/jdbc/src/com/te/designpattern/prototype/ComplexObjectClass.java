package com.te.designpattern.prototype;

public class ComplexObjectClass implements Cloneable{
	private int remoteSensonData01;
	private int remoteSensonData02;
	private int remoteSensonData03;
	private int remoteSensonData04;
	private int remoteSensonData05;
	private int remoteSensonData066;
	
	private long geoLocatioCordinates01;
	private long geoLocatioCordinates02;
	private long geoLocatioCordinates03;
	private long geoLocatioCordinates04;
	public ComplexObjectClass(int remoteSensonData01, int remoteSensonData02, int remoteSensonData03,
			int remoteSensonData04, int remoteSensonData05, int remoteSensonData066, long geoLocatioCordinates01,
			long geoLocatioCordinates02, long geoLocatioCordinates03, long geoLocatioCordinates04) {
		super();
		this.remoteSensonData01 = remoteSensonData01;
		this.remoteSensonData02 = remoteSensonData02;
		this.remoteSensonData03 = remoteSensonData03;
		this.remoteSensonData04 = remoteSensonData04;
		this.remoteSensonData05 = remoteSensonData05;
		this.remoteSensonData066 = remoteSensonData066;
		this.geoLocatioCordinates01 = geoLocatioCordinates01;
		this.geoLocatioCordinates02 = geoLocatioCordinates02;
		this.geoLocatioCordinates03 = geoLocatioCordinates03;
		this.geoLocatioCordinates04 = geoLocatioCordinates04;
		
		
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public int getRemoteSensonData01() {
		return remoteSensonData01;
	}
	public void setRemoteSensonData01(int remoteSensonData01) {
		this.remoteSensonData01 = remoteSensonData01;
	}
	public int getRemoteSensonData02() {
		return remoteSensonData02;
	}
	public void setRemoteSensonData02(int remoteSensonData02) {
		this.remoteSensonData02 = remoteSensonData02;
	}
	public int getRemoteSensonData03() {
		return remoteSensonData03;
	}
	public void setRemoteSensonData03(int remoteSensonData03) {
		this.remoteSensonData03 = remoteSensonData03;
	}
	public int getRemoteSensonData04() {
		return remoteSensonData04;
	}
	public void setRemoteSensonData04(int remoteSensonData04) {
		this.remoteSensonData04 = remoteSensonData04;
	}
	public int getRemoteSensonData05() {
		return remoteSensonData05;
	}
	public void setRemoteSensonData05(int remoteSensonData05) {
		this.remoteSensonData05 = remoteSensonData05;
	}
	public int getRemoteSensonData066() {
		return remoteSensonData066;
	}
	public void setRemoteSensonData066(int remoteSensonData066) {
		this.remoteSensonData066 = remoteSensonData066;
	}
	public long getGeoLocatioCordinates01() {
		return geoLocatioCordinates01;
	}
	public void setGeoLocatioCordinates01(long geoLocatioCordinates01) {
		this.geoLocatioCordinates01 = geoLocatioCordinates01;
	}
	public long getGeoLocatioCordinates02() {
		return geoLocatioCordinates02;
	}
	public void setGeoLocatioCordinates02(long geoLocatioCordinates02) {
		this.geoLocatioCordinates02 = geoLocatioCordinates02;
	}
	public long getGeoLocatioCordinates03() {
		return geoLocatioCordinates03;
	}
	public void setGeoLocatioCordinates03(long geoLocatioCordinates03) {
		this.geoLocatioCordinates03 = geoLocatioCordinates03;
	}
	public long getGeoLocatioCordinates04() {
		return geoLocatioCordinates04;
	}
	public void setGeoLocatioCordinates04(long geoLocatioCordinates04) {
		this.geoLocatioCordinates04 = geoLocatioCordinates04;
	}
	@Override
	public String toString() {
		return "ComplexObjectClass [remoteSensonData01=" + remoteSensonData01 + ", remoteSensonData02="
				+ remoteSensonData02 + ", remoteSensonData03=" + remoteSensonData03 + ", remoteSensonData04="
				+ remoteSensonData04 + ", remoteSensonData05=" + remoteSensonData05 + ", remoteSensonData066="
				+ remoteSensonData066 + ", geoLocatioCordinates01=" + geoLocatioCordinates01
				+ ", geoLocatioCordinates02=" + geoLocatioCordinates02 + ", geoLocatioCordinates03="
				+ geoLocatioCordinates03 + ", geoLocatioCordinates04=" + geoLocatioCordinates04 + "]";
	}
}
