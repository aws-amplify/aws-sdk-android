/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.amazonroute53.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * If Amazon Route 53 can't process a request before the next request arrives,
 * it will reject subsequent requests for the same hosted zone and return an
 * <code>HTTP 400 error</code> (<code>Bad request</code>). If Route 53 returns
 * this error repeatedly for the same request, we recommend that you wait, in
 * intervals of increasing duration, before you try the request again.
 * </p>
 */
public class PriorRequestNotCompleteException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new PriorRequestNotCompleteException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public PriorRequestNotCompleteException(String message) {
        super(message);
    }
}
