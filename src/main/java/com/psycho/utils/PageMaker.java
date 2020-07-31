package com.psycho.utils;

public class PageMaker {

	private Criteria cri;
	private int totalCnt;
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	private int displayPageNum = 10;
	
	Criteria getCri() {
		return cri;
	}

	void setCri(Criteria cri) {
		this.cri = cri;
	}
	
	int getTotalCnt() {
		return totalCnt;
	}
	
	void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
		calcData();
	}
	
	private void calcData() {
		System.out.println("-----------------calcPage-----------------");
		endPage = (int) (Math.ceil(cri.getPage() / (double) displayPageNum) * displayPageNum);
		
		startPage = (displayPageNum - endPage) + 1;
		if(startPage <= 1) startPage = 1;
		
		prev = startPage == 1 ? false : true;
		next = endPage * cri.getPerPageNum() < totalCnt ? true : false;
	}

	int getStartPage() {
		return startPage;
	}

	void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	int getEndPage() {
		return endPage;
	}

	void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	boolean isPrev() {
		return prev;
	}

	void setPrev(boolean prev) {
		this.prev = prev;
	}

	boolean isNext() {
		return next;
	}

	void setNext(boolean next) {
		this.next = next;
	}

	int getDisplayPageNum() {
		return displayPageNum;
	}

	void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}
}
