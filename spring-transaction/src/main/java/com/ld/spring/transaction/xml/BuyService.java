package com.ld.spring.transaction.xml;

/**
 * @author ld
 * @create 2019年10月31日:下午4:26:23
 * @desc 
 */
public class BuyService {
	
	private BuyDao buyDao;
	
	public BuyDao getBuyDao() {
		return buyDao;
	}



	public void setBuyDao(BuyDao buyDao) {
		this.buyDao = buyDao;
	}



	/**
	 * 买书操作
	 * @param userId 用户标识
	 * @param bookId 书标识
	 */
	public void buy(int userId,int bookId) {
		//1、减少库存
		buyDao.updateCount(bookId);
		//2、减少余额
		buyDao.updateBalance(userId, bookId);
	}

}
