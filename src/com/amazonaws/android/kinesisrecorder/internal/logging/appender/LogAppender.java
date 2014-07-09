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
package com.amazonaws.android.kinesisrecorder.internal.logging.appender;
 
public class LogAppender {
	public void d(String tag, String msg) {
		//no-op
	}
	public void d(String tag, String msg, Throwable tr) {
		//no-op
	}
	public void devd(String tag, String msg) {
		//no-op
	}
	public void devd(String tag, String msg, Throwable tr) {
		//no-op
	}
	public void v(String tag, String msg) {
		//no-op
	}
	public void v(String tag, String msg, Throwable tr) {
		//no-op
	}
	public void devv(String tag, String msg) {
		//no-op
	}
	public void devv(String tag, String msg, Throwable tr) {
		//no-op
	}
	public void i(String tag, String msg) {
		//no-op
	}
	public void i(String tag, String msg, Throwable tr) {
		//no-op
	}
	public void devi(String tag, String msg) {
		//no-op
	}
	public void devi(String tag, String msg, Throwable tr) {
		//no-op
	}
	public void w(String tag, String msg) {
		//no-op
	}
	public void w(String tag, Throwable tr) {
		//no-op
	}
	public void w(String tag, String msg, Throwable tr) {
		//no-op
	}
	public void devw(String tag, String msg) {
		//no-op
	}
	public void devw(String tag, Throwable tr) {
		//no-op
	}
	public void devw(String tag, String msg, Throwable tr) {
		//no-op
	}
	public void e(String tag, String msg) {
		//no-op
	}
	public void e(String tag, String msg, Throwable tr) {
		//no-op
	}
	public void deve(String tag, String msg) {
		//no-op
	}
	public void deve(String tag, String msg, Throwable tr) {
		//no-op
	}
	
	public String decorateMessage(Class<?> clz, final String msg) {
		return msg;
	}
}
