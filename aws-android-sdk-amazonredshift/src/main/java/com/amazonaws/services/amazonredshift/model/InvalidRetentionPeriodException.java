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

package com.amazonaws.services.amazonredshift.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The retention period specified is either in the past or is not a valid value.
 * </p>
 * <p>
 * The value must be either -1 or an integer between 1 and 3,653.
 * </p>
 */
public class InvalidRetentionPeriodException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidRetentionPeriodException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidRetentionPeriodException(String message) {
        super(message);
    }
}
