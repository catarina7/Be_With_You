package com.bwy.util;

public class PageMaker {
	private int startRowNum;
	private int lastRowNum;
	private int curBlock;
	private int totalBlock;
	private int startNum;
	private int lastNum;
	private int curPage;
	private int perPage;
	
	//startRowNum
	
	public void makeRow(){
		this.startRowNum = (curPage-1)*perPage+1;
		this.lastRowNum = curPage*perPage;
	}
	
	//pageing 
	
	public void makePage(int totalCount){
		//1. 전체 게시물의 수를 구하기 - 매개변수로 선언 
		
		//2. 전체 페이지 수
		int totalPage = 0;
		if(totalCount%perPage == 0){
			totalPage = totalCount/perPage;
		}else {
			totalPage = totalCount/perPage+1;
		}
		
		//3. 전체 블록 수 
		int perBlock = 5;
		this.totalBlock = 0;
		if(totalPage%perBlock == 0){
			totalBlock = totalPage/perBlock;
		}else{
			totalBlock = totalPage/perBlock+1;
		}
		
		//4. curBlock
		this.curBlock = 0;
		if(curPage%perBlock == 0){
			curBlock = curPage/perBlock;
		}else{
			curBlock = curPage/perBlock+1;
		}
		
		//5. startNum, lastNum
		startNum = (curBlock-1)*perBlock+1;
		lastNum = curBlock*perBlock;
		
		//
		if(curPage==totalBlock){
			lastNum = totalPage;
		}
	}
	
	
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public int getStartRowNum() {
		return startRowNum;
	}
	public void setStartRowNum(int startRowNum) {
		this.startRowNum = startRowNum;
	}
	public int getLastRowNum() {
		return lastRowNum;
	}
	public void setLastRowNum(int lastRowNum) {
		this.lastRowNum = lastRowNum;
	}
	public int getCurBlock() {
		return curBlock;
	}
	public void setCurBlock(int curBlock) {
		this.curBlock = curBlock;
	}
	public int getTotalBlock() {
		return totalBlock;
	}
	public void setTotalBlock(int totalBlock) {
		this.totalBlock = totalBlock;
	}
	public int getStartNum() {
		return startNum;
	}
	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}
	public int getLastNum() {
		return lastNum;
	}
	public void setLastNum(int lastNum) {
		this.lastNum = lastNum;
	}
	
}
