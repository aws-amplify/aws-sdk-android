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

package com.amazonaws.services.simpleemail.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Indicates that the custom domain to be used for open and click tracking
 * redirects is invalid. This error appears most often in the following
 * situations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * When the tracking domain you specified is not verified in Amazon SES.
 * </p>
 * </li>
 * <li>
 * <p>
 * When the tracking domain you specified is not a valid domain or subdomain.
 * </p>
 * </li>
 * </ul>
 */
public class InvalidTrackingOptionsException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidTrackingOptionsException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidTrackingOptionsException(String message) {
        super(message);
    }
}
