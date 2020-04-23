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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * <code>Capacity</code> isn't a valid Aurora Serverless DB cluster capacity.
 * Valid capacity values are <code>2</code>, <code>4</code>, <code>8</code>,
 * <code>16</code>, <code>32</code>, <code>64</code>, <code>128</code>, and
 * <code>256</code>.
 * </p>
 */
public class InvalidDBClusterCapacityException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidDBClusterCapacityException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidDBClusterCapacityException(String message) {
        super(message);
    }
}
