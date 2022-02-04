package com.te.prototype;

public class ComplexObjectClass2 implements Cloneable {
	private int remoteSensorData01;
	private int remoteSensorData02;
	private int remoteSensorData03;
	private int remoteSensorData04;
	private int remoteSensorData05;
	private int remoteSensorData06;
	
	private long geoLocationCoordinates01;
	private long geoLocationCoordinates02;
	private long geoLocationCoordinates03;
	private long geoLocationCoordinates04;
	
	public ComplexObjectClass2(int remoteSensorData01, int remoteSensorData02, int remoteSensorData03,
			int remoteSensorData04, int remoteSensorData05, int remoteSensorData06, long geoLocationCoordinates01,
			long geoLocationCoordinates02, long geoLocationCoordinates03, long geoLocationCoordinates04) {
		super();
		this.remoteSensorData01 = remoteSensorData01;
		this.remoteSensorData02 = remoteSensorData02;
		this.remoteSensorData03 = remoteSensorData03;
		this.remoteSensorData04 = remoteSensorData04;
		this.remoteSensorData05 = remoteSensorData05;
		this.remoteSensorData06 = remoteSensorData06;
		this.geoLocationCoordinates01 = geoLocationCoordinates01;
		this.geoLocationCoordinates02 = geoLocationCoordinates02;
		this.geoLocationCoordinates03 = geoLocationCoordinates03;
		this.geoLocationCoordinates04 = geoLocationCoordinates04;
	}
	public int getRemoteSensorData01() {
		return remoteSensorData01;
	}
	public void setRemoteSensorData01(int remoteSensorData01) {
		this.remoteSensorData01 = remoteSensorData01;
	}
	public int getRemoteSensorData02() {
		return remoteSensorData02;
	}
	public void setRemoteSensorData02(int remoteSensorData02) {
		this.remoteSensorData02 = remoteSensorData02;
	}
	public int getRemoteSensorData03() {
		return remoteSensorData03;
	}
	public void setRemoteSensorData03(int remoteSensorData03) {
		this.remoteSensorData03 = remoteSensorData03;
	}
	public int getRemoteSensorData04() {
		return remoteSensorData04;
	}
	public void setRemoteSensorData04(int remoteSensorData04) {
		this.remoteSensorData04 = remoteSensorData04;
	}
	public int getRemoteSensorData05() {
		return remoteSensorData05;
	}
	public void setRemoteSensorData05(int remoteSensorData05) {
		this.remoteSensorData05 = remoteSensorData05;
	}
	public int getRemoteSensorData06() {
		return remoteSensorData06;
	}
	public void setRemoteSensorData06(int remoteSensorData06) {
		this.remoteSensorData06 = remoteSensorData06;
	}
	public long getGeoLocationCoordinates01() {
		return geoLocationCoordinates01;
	}
	public void setGeoLocationCoordinates01(long geoLocationCoordinates01) {
		this.geoLocationCoordinates01 = geoLocationCoordinates01;
	}
	public long getGeoLocationCoordinates02() {
		return geoLocationCoordinates02;
	}
	public void setGeoLocationCoordinates02(long geoLocationCoordinates02) {
		this.geoLocationCoordinates02 = geoLocationCoordinates02;
	}
	public long getGeoLocationCoordinates03() {
		return geoLocationCoordinates03;
	}
	public void setGeoLocationCoordinates03(long geoLocationCoordinates03) {
		this.geoLocationCoordinates03 = geoLocationCoordinates03;
	}
	public long getGeoLocationCoordinates04() {
		return geoLocationCoordinates04;
	}
	public void setGeoLocationCoordinates04(long geoLocationCoordinates04) {
		this.geoLocationCoordinates04 = geoLocationCoordinates04;
	}
	@Override
	public String toString() {
		return "ComplexObjectClass [remoteSensorData01=" + remoteSensorData01 + ", remoteSensorData02="
				+ remoteSensorData02 + ", remoteSensorData03=" + remoteSensorData03 + ", remoteSensorData04="
				+ remoteSensorData04 + ", remoteSensorData05=" + remoteSensorData05 + ", remoteSensorData06="
				+ remoteSensorData06 + ", geoLocationCoordinates01=" + geoLocationCoordinates01
				+ ", geoLocationCoordinates02=" + geoLocationCoordinates02 + ", geoLocationCoordinates03="
				+ geoLocationCoordinates03 + ", geoLocationCoordinates04=" + geoLocationCoordinates04 + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
