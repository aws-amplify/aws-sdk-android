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

package com.amazonaws.services.elasticache.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The requested cache node offering does not exist.
 * </p>
 */
public class ReservedCacheNodesOfferingNotFoundException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ReservedCacheNodesOfferingNotFoundException with the
     * specified error message.
     *
     * @param message Describes the error encountered.
     */
    public ReservedCacheNodesOfferingNotFoundException(String message) {
        super(message);
    }
}
