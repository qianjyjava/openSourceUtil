package com.qjy.open.entity.common;

public class BaseVo {
	private int start;
	private int size;
	public int getStart() {
		if(this.start<=0){
			this.start=0;
		}
		return start;
	}
	public void setStart(int start) {
		if(start<=0){
			start=0;
		}
		this.start = start;
	}
	public int getSize() {
		if(this.size==0){
			this.size=10;
		}
		return size;
	}
	public void setSize(int size) {
		if(size==0){
			size=10;
		}
		this.size = size;
	}
	
	
}
