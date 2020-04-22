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
 * The request cannot be completed because a dependent service is throttling
 * requests made by Amazon Redshift on your behalf. Wait and retry the request.
 * </p>
 */
public class DependentServiceRequestThrottlingException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new DependentServiceRequestThrottlingException with the
     * specified error message.
     *
     * @param message Describes the error encountered.
     */
    public DependentServiceRequestThrottlingException(String message) {
        super(message);
    }
}
