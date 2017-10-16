package com.pifutan.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
//	private static Logger log = LogManager.getLogger("TAG");// 获取日志记录器
	private static Logger log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

	public static void trace(Object object) {
		log.trace(object);
	}

	public static void debug(Object object) {
		log.debug(object);
	}

	public static void info(Object object) {
		log.info(object);
	}

	public static void warn(Object object) {
		log.warn(object);
	}

	public static void error(Object object) {
		log.error(object);
	}

	public static void fatal(Object object) {
		log.fatal(object);
	}

	public static void main(String... arg0) {
//		Logger logger = LogManager.getLogger(Log.class);
//		Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
		Logger logger = LogManager.getLogger();
		logger.trace("trace level");
		logger.debug("debug level");
		logger.info("info level");
		logger.warn("warn level");
		logger.error("error level");
		logger.fatal("fatal level");
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			logger.error("log输出" + i);
		}
		long time = System.currentTimeMillis() - start;
		logger.info("所用时间" + time);
	}
}
