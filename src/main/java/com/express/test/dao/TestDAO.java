package com.express.test.dao;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAO {
	 Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired protected SqlSession sqlSession;
	protected String mapperNamespace = this.getClass().getName() + ".";
	
	/** 목록 조회 */
	public String getListAll() {
		logger.info("test");
		return sqlSession.selectOne("test." + "testone");
	}
	
//	
//	private static final List<String> NOT_USER_METHODS = Arrays.asList("getStackTrace", "getCurrentMethodName", "getStackTraceMethodName");
//
//	
//	public static String getStackTraceMethodName(final int upperDepth) {
//		final StackTraceElement[] steList = Thread.currentThread().getStackTrace();
//		int length = steList.length;
//		int startIndex = 0;
//		for (int i=0; i<length; i++) {
//			String methodName = steList[i].getMethodName();
//			if(NOT_USER_METHODS.contains(methodName)) {
//				startIndex++;
//			} else {
//				break;
//			}
//		}
//	
//		return steList[startIndex + upperDepth].getMethodName();
//	}
	
	
}
