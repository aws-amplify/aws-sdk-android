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

package com.amazonaws.services.cloudfront.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * This operation requires the HTTPS protocol. Ensure that you specify the HTTPS
 * protocol in your request, or omit the <code>RequiredProtocols</code> element
 * from your distribution configuration.
 * </p>
 */
public class InvalidRequiredProtocolException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidRequiredProtocolException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidRequiredProtocolException(String message) {
        super(message);
    }
}
