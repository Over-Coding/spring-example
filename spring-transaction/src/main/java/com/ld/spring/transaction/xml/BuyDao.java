package com.ld.spring.transaction.xml;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author ld
 * @create 2019年10月31日:下午4:36:58
 * @desc 
 */
public class BuyDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * 更新库存
	 * @param bookId
	 */
	public void updateCount(int bookId) {
		//1、判断库存是否足够
		String sql = "select count from count where book_id = ?";
		Integer total = jdbcTemplate.queryForObject(sql, Integer.class, bookId);
		
		if(total <= 0) {
			throw new RuntimeException("库存不足。。。");
		}
		
		//2、更新库存
		sql = "update count set count = count - 1 where book_id = ?";
		jdbcTemplate.update(sql, bookId);
	}
	
	/**
	 * 更新余额
	 * @param userId
	 * @param bookId
	 */
	public void updateBalance(int userId,int bookId) {
		//1、查询书价格
		String sql = "select book_price from book where book_id = ?";
		Double price = jdbcTemplate.queryForObject(sql, Double.class, bookId);
		//2、判断余额是否足够
		sql = "select balance from user where user_id = ?";
		Double balance = jdbcTemplate.queryForObject(sql, Double.class, userId);
		
		if(balance < price) {
			throw new RuntimeException("余额不足。。。");
		}
		//3、更新余额
		balance = balance - price;
		sql = "update user set balance = ? where user_id = ?";
		jdbcTemplate.update(sql, balance,userId);
	}

}
