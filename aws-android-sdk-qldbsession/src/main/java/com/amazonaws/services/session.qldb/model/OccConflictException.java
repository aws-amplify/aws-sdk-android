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

package com.amazonaws.services.session.qldb.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Returned when a transaction cannot be written to the journal due to a failure
 * in the verification phase of <i>optimistic concurrency control</i> (OCC).
 * </p>
 */
public class OccConflictException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new OccConflictException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public OccConflictException(String message) {
        super(message);
    }
}
