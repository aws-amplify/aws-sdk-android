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

package com.amazonaws.services.lexrts.internal;

import com.amazonaws.Request;
import com.amazonaws.auth.AWS4Signer;

import java.net.URI;

public class AmazonLexV4Signer extends AWS4Signer {

    private static final String STREAM_PAYLOAD = "UNSIGNED-PAYLOAD";

    private static final String TEXT_REQUEST = "/text";

    private static final String SERVICE_NAME_SCOPE = "lex";

    public AmazonLexV4Signer() {
        super(true);
    }

    @Override
    protected String extractServiceName(URI endpoint) {
        return SERVICE_NAME_SCOPE;
    }

    @Override
    protected String calculateContentHash(Request<?> request) {
        if (request.getResourcePath().endsWith(TEXT_REQUEST)) {
            return super.calculateContentHash(request);
        } else {
            request.addHeader("x-amz-content-sha256", STREAM_PAYLOAD);
            return STREAM_PAYLOAD;
        }
    }
}