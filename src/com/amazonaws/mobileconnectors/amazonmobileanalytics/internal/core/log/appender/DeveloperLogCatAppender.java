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
package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.log.appender;

import android.util.Log;

public class DeveloperLogCatAppender extends LogAppender {

	@Override
	public void devd(String tag, String msg) {
		Log.d(tag, msg);
	}

	@Override
	public void devd(String tag, String msg, Throwable tr) {
		Log.d(tag, msg, tr);
	}

	@Override
	public void devv(String tag, String msg) {
		Log.v(tag, msg);
	}

	@Override
	public void devv(String tag, String msg, Throwable tr) {
		Log.v(tag, msg, tr);
	}

	@Override
	public void devi(String tag, String msg) {
		Log.i(tag, msg);
	}

	@Override
	public void devi(String tag, String msg, Throwable tr) {
		Log.i(tag, msg, tr);
	}

	@Override
	public void devw(String tag, String msg) {
		Log.w(tag, msg);
	}

	@Override
	public void devw(String tag, Throwable tr) {
		Log.w(tag, tr);
	}

	@Override
	public void devw(String tag, String msg, Throwable tr) {
		Log.w(tag, msg, tr);
	}

	@Override
	public void deve(String tag, String msg) {
		Log.e(tag, msg);
	}

	@Override
	public void deve(String tag, String msg, Throwable tr) {
		Log.e(tag, msg, tr);
	}
}
