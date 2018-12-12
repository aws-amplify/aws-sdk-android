/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.http;

import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.SDKInfo;

/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public final class SDKInfoHandler extends RequestHandler2 {
    static final String CLIENT_SDK_VERSION_HEADER_NAME = "x-amzn-ClientSDKVersion";

    private final SDKInfo sdkInfo;

    public SDKInfoHandler(final SDKInfo sdkInfo) {
        this.sdkInfo = sdkInfo;
    }

    @Override
    public void afterError(Request<?> arg0, Response<?> arg1, Exception arg2) {
    }

    @Override
    public void afterResponse(Request<?> arg0, Response<?> arg1) {
    }

    @Override
    public void beforeRequest(Request<?> request) {
        if (null != request) {
            request.addHeader(CLIENT_SDK_VERSION_HEADER_NAME,
                    String.format("%s", sdkInfo.toString()));
        }

    }

}
