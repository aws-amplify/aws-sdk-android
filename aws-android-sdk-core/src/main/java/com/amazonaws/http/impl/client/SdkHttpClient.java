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

package com.amazonaws.http.impl.client;

import com.amazonaws.http.conn.ClientConnectionManagerFactory;
import com.amazonaws.http.protocol.SdkHttpRequestExecutor;

import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpRequestExecutor;

/**
 * SDK HTTP client class.
 */
public class SdkHttpClient extends DefaultHttpClient {

    /**
     * Constructor.
     * @param conman the client connection manager.
     * @param params the HTTP parameters.
     */
    public SdkHttpClient(
            final ClientConnectionManager conman,
            final HttpParams params) {
        super(ClientConnectionManagerFactory.wrap(conman), params);
    }

    @Override
    protected HttpRequestExecutor createRequestExecutor() {
        return new SdkHttpRequestExecutor();
    }

}
