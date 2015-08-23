//package io.sample.batch.service;
//
//import java.util.Map;
//
//import org.apache.commons.dbcp.BasicDataSource;
//import org.mybatis.spring.SqlSessionFactoryBean;
//
//public class SqlSessionMultiFactoryBean extends SqlSessionFactoryBean {
//
//	protected static int INT_DB_NUM = 0;
//
//	private Map<String, BasicDataSource> mapSelectedDb;
//
//	public void setSelectedDb(Map<String, BasicDataSource> mapSelectedDb) {
//
//		BasicDataSource dispersionDb = null;
//
//		INT_DB_NUM = INT_DB_NUM + 1;
//		INT_DB_NUM = INT_DB_NUM % mapSelectedDb.size();
//		dispersionDb = (BasicDataSource)mapSelectedDb.get(INT_DB_NUM);
//
//		System.out.println("cnd = " + INT_DB_NUM);
//		setDataSource(dispersionDb);
//		
//		this.mapSelectedDb = mapSelectedDb;
//	}
//
//}