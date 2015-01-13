/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.log;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.log.appender.DeveloperLogCatAppender;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.log.appender.LogAppender;

public class Logger {
	public static final String TAG = "AmazonMobileAnalyticsSDK";
	
	private static LogLevel globalLevel = LogLevel.WARN;
	private static Map<Class<?>, LogAppender> appenders = new ConcurrentHashMap<Class<?>, LogAppender>();
	private static Map<Class<?>, Logger> loggers = new ConcurrentHashMap<Class<?>, Logger>();
	
	private LogLevel classLevel = null;
	private Class<?> cls = null;
	private String tag = TAG;
	
	public static enum LogLevel {
		VERBOSE,
		DEBUG,
		INFO,
		WARN,
		ERROR,
		OFF
	}

	public Logger(final String tag, final Class<?> cls) {
		assert cls != null;
		this.cls = cls;
		this.tag = tag;
	}

	public synchronized boolean isLoggingEnabled(final LogLevel requestedLevel) {
		boolean isEnabled = false;
		if(requestedLevel.compareTo(this.getLogLevel()) >= 0) {
			isEnabled = true;
		}
		return isEnabled;
	}
	
	synchronized LogLevel getLogLevel() {
		LogLevel level = LogLevel.OFF;
		if(null != classLevel) {
			level = this.classLevel;
		} else {
			level = getGlobalLevel();
		}
		return level;
	}
	
	public static synchronized void setGlobalLevel(final LogLevel level) {
		globalLevel = level;
	}
	
	public static LogLevel getGlobalLevel() {
		return globalLevel;
	}
	
	public synchronized void setLevel(final LogLevel level) {
		classLevel = level;
	}

	public static void attachLogAppender(LogAppender appender) {
		attachAppender(appender);
	}
	
	public static void detachLogAppender(LogAppender appender) {
		detachAppender(appender);
	}
	
	public static Collection<LogAppender> getLogAppenders() {
		return getAppenders();
	}
	
	public static Logger getLogger(Class<?> cls) {
		return getClassLogger(cls);
	}
	
	static synchronized Logger getClassLogger(Class<?> cls) {
		if(null == cls) {
			cls = Logger.class;
		}
		if(loggers.containsKey(cls)) {
			return loggers.get(cls);
		} else {
			Logger logger = new Logger(TAG, cls);

			//put the logger in the logger registry so it can be re-acquired and updated later if necessary
			loggers.put(cls, logger);
			return logger;
		}
	}
	
	public static void attachAppender(LogAppender appender) {
		if(null == appender) {
			return;
		}
		
		if(!appenders.containsKey(appender.getClass())) {
			appenders.put(appender.getClass(), appender);
		}
	}
	
	public static void detachAppender(LogAppender appender) {
		if(null == appender) {
			return;
		}
		
		if(appenders.containsKey(appender.getClass())) {
			appenders.remove(appender.getClass());
		}
	}

	public static Collection<LogAppender> getAppenders() {
		return appenders.values();
	}

	Class<?> getLogClass() {
		return this.cls;
	}
	
	String getTag() {
		return tag;
	}
	
	public void d(final String msg) {
		if(isLoggingEnabled(LogLevel.DEBUG)) {
			for(final LogAppender appender : getLogAppenders()) {
				appender.d(this.getTag(), appender.decorateMessage(this.cls, msg));
			}
		}
	}
	
	public void d(final String msg, final Throwable tr) {
		if(isLoggingEnabled(LogLevel.DEBUG)) {
			for(final LogAppender appender : getLogAppenders()) {
				appender.d(this.getTag(), appender.decorateMessage(this.cls, msg), tr);
			}
		}
	}
	
	public void devd(final String msg) {
		for(final LogAppender appender : getLogAppenders()) {
			appender.devd(this.getTag(), appender.decorateMessage(this.cls, msg));
		}
	}

	public void devd(final String msg, final Throwable tr) {
		for(final LogAppender appender : getLogAppenders()) {
			appender.devd(this.getTag(), appender.decorateMessage(this.cls, msg), tr);
		}
	}
	
	public void v(final String msg) {
		if(isLoggingEnabled(LogLevel.VERBOSE)) {
			for(final LogAppender appender : getLogAppenders()) {
				appender.v(this.getTag(), appender.decorateMessage(this.cls, msg));
			}
		}
	}
	
	public void v(final String msg, final Throwable tr) {
		if(isLoggingEnabled(LogLevel.VERBOSE)) {
			for(final LogAppender appender : getLogAppenders()) {
				appender.v(this.getTag(), appender.decorateMessage(this.cls, msg), tr);
			}
		}
	}
	
	public void devv(final String msg) {
		for(final LogAppender appender : getLogAppenders()) {
			appender.devv(this.getTag(), appender.decorateMessage(this.cls, msg));
		}
	}
	
	public void devv(final String msg, final Throwable tr) {
		for(final LogAppender appender : getLogAppenders()) {
			appender.devv(this.getTag(), appender.decorateMessage(this.cls, msg), tr);
		}
	}
	
	public void i(final String msg) {
		if(isLoggingEnabled(LogLevel.INFO)) {
			for(final LogAppender appender : getLogAppenders()) {
				appender.i(this.getTag(), appender.decorateMessage(this.cls, msg));
			}
		}
	}
	
	public void i(final String msg, final Throwable tr) {
		if(isLoggingEnabled(LogLevel.INFO)) {
			for(final LogAppender appender : getLogAppenders()) {
				appender.i(this.getTag(), appender.decorateMessage(this.cls, msg), tr);
			}
		}
	}
	
	public void devi(final String msg) {
		for(final LogAppender appender : getLogAppenders()) {
			appender.devi(this.getTag(), appender.decorateMessage(this.cls, msg));
		}
	}
	
	public void devi(final String msg, final Throwable tr) {
		for(final LogAppender appender : getLogAppenders()) {
			appender.devi(this.getTag(), appender.decorateMessage(this.cls, msg), tr);
		}
	}
	
	public void w(final String msg) {
		if(isLoggingEnabled(LogLevel.WARN)) {
			for(final LogAppender appender : getLogAppenders()) {
				appender.w(this.getTag(), appender.decorateMessage(this.cls, msg));
			}
		}
	}
	
	public void w(final Throwable tr) {
		if(isLoggingEnabled(LogLevel.WARN)) {
			for(final LogAppender appender : getLogAppenders()) {
				appender.w(this.getTag(), tr);
			}
		}
	}
	
	public void w(final String msg, final Throwable tr) {
		if(isLoggingEnabled(LogLevel.WARN)) {
			for(final LogAppender appender : getLogAppenders()) {
				appender.w(this.getTag(), appender.decorateMessage(this.cls, msg), tr);
			}
		}
	}
	
	public void devw(final String msg) {
		for(final LogAppender appender : getLogAppenders()) {
			appender.devw(this.getTag(), appender.decorateMessage(this.cls, msg));
		}
	}
	
	public void devw(final Throwable tr) {
		for(final LogAppender appender : getLogAppenders()) {
			appender.devw(this.getTag(), tr);
		}
	}
	
	public void devw(final String msg, final Throwable tr) {
		for(final LogAppender appender : getLogAppenders()) {
			appender.devw(this.getTag(), appender.decorateMessage(this.cls, msg), tr);
		}
	}

	public void e(final String msg) {
		if(isLoggingEnabled(LogLevel.ERROR)) {
			for(final LogAppender appender : getLogAppenders()) {
				appender.e(tag, appender.decorateMessage(this.cls, msg));
			}
		}
	}
	
	public void e(final String msg, final Throwable tr) {
		if(isLoggingEnabled(LogLevel.ERROR)) {
			for(final LogAppender appender : getLogAppenders()) {
				appender.e(tag, appender.decorateMessage(this.cls, msg), tr);
			}
		}
	}
	
	public void deve(final String msg) {
		for(final LogAppender appender : getLogAppenders()) {
			appender.deve(tag, appender.decorateMessage(this.cls, msg));
		}
	}
	
	public void deve(final String msg, final Throwable tr) {
		for(final LogAppender appender : getLogAppenders()) {
			appender.deve(tag, appender.decorateMessage(this.cls, msg), tr);
		}
	}
	
	private static boolean initialized = false;
	
	public synchronized static void tryInitialize() {
		if(!initialized) {
			tryInitialize(new LogInitializer() {
				@Override
				public void tryInitialize() {
					Logger.setGlobalLevel(LogLevel.WARN);
					Logger.attachAppender(new DeveloperLogCatAppender());
				}
			});
		}
	}
	
	public synchronized static void tryInitialize(final LogInitializer initializer) {
		if(!initialized && initializer != null) {
			initializer.tryInitialize();
			initialized = true;
		}
	}
}
