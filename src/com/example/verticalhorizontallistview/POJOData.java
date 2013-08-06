package com.example.verticalhorizontallistview;

import java.util.List;

public class POJOData {

	private List<String> mList;
	private int index;
	private int offSet;
	
	public POJOData(List<String> mList, int index, int offSet) {
		this.mList = mList;
		this.index = index;
		this.offSet = offSet;
	}
	
	public List<String> getmList() {
		return mList;
	}
	public void setmList(List<String> mList) {
		this.mList = mList;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getOffSet() {
		return offSet;
	}
	public void setOffSet(int offSet) {
		this.offSet = offSet;
	}
	
	
}
