package com.ld.spring.transaction.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ld
 * @create 2019年10月31日:下午4:26:23
 * @desc 
 */
@Service
//@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
public class BuyService {
	
	@Autowired
	private BuyDao buyDao;
	
	/**
	 * 买书操作
	 * @param userId 用户标识
	 * @param bookId 书标识
	 */
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
	public void buy(int userId,int bookId) {
		//如果在方法中把异常处理了，就不会进行回滚
//		try {
		//1、减少库存
		buyDao.updateCount(bookId);
		//2、减少余额
		buyDao.updateBalance(userId, bookId);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
	}

}
