/*
 * Copyright 2016-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.Headers;

/**
 * Header handler to pull the {@link Headers#REQUESTER_CHARGED_HEADER} header
 * out of the response. This header is required for requests with
 * {@link Headers#REQUESTER_PAYS_HEADER} header.
 * @param <T> class type.
 */
public class S3RequesterChargedHeaderHandler<T extends S3RequesterChargedResult>
        implements HeaderHandler<T> {

    /*
     * (non-Javadoc)
     * @see
     * com.amazonaws.services.s3.internal.HeaderHandler#handle(java.lang.Object,
     * com.amazonaws.http.HttpResponse)
     */
    @Override
    public void handle(T result, HttpResponse response) {
        result.setRequesterCharged(
                response.getHeaders().get(Headers.REQUESTER_CHARGED_HEADER) != null);
    }
}
