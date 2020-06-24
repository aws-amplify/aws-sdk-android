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

package com.amazonaws.services.fsx.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * An error indicating that a particular service limit was exceeded. You can
 * increase some service limits by contacting AWS Support.
 * </p>
 */
public class ServiceLimitExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Enumeration of the service limit that was exceeded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE_SYSTEM_COUNT, TOTAL_THROUGHPUT_CAPACITY,
     * TOTAL_STORAGE, TOTAL_USER_INITIATED_BACKUPS
     */
    private String limit;

    /**
     * Constructs a new ServiceLimitExceededException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ServiceLimitExceededException(String message) {
        super(message);
    }

    /**
     * <p>
     * Enumeration of the service limit that was exceeded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE_SYSTEM_COUNT, TOTAL_THROUGHPUT_CAPACITY,
     * TOTAL_STORAGE, TOTAL_USER_INITIATED_BACKUPS
     *
     * @return <p>
     *         Enumeration of the service limit that was exceeded.
     *         </p>
     * @see ServiceLimit
     */
    public String getLimit() {
        return limit;
    }

    /**
     * <p>
     * Enumeration of the service limit that was exceeded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE_SYSTEM_COUNT, TOTAL_THROUGHPUT_CAPACITY,
     * TOTAL_STORAGE, TOTAL_USER_INITIATED_BACKUPS
     *
     * @param limit <p>
     *            Enumeration of the service limit that was exceeded.
     *            </p>
     * @see ServiceLimit
     */
    public void setLimit(String limit) {
        this.limit = limit;
    }
}
