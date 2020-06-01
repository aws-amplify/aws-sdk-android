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

package com.amazonaws.services.athena.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Indicates that something is wrong with the input to the request. For example,
 * a required parameter may be missing or out of range.
 * </p>
 */
public class InvalidRequestException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The error code returned when the query execution failed to process, or
     * when the processing request for the named query failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String athenaErrorCode;

    /**
     * Constructs a new InvalidRequestException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidRequestException(String message) {
        super(message);
    }

    /**
     * <p>
     * The error code returned when the query execution failed to process, or
     * when the processing request for the named query failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The error code returned when the query execution failed to
     *         process, or when the processing request for the named query
     *         failed.
     *         </p>
     */
    public String getAthenaErrorCode() {
        return athenaErrorCode;
    }

    /**
     * <p>
     * The error code returned when the query execution failed to process, or
     * when the processing request for the named query failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param athenaErrorCode <p>
     *            The error code returned when the query execution failed to
     *            process, or when the processing request for the named query
     *            failed.
     *            </p>
     */
    public void setAthenaErrorCode(String athenaErrorCode) {
        this.athenaErrorCode = athenaErrorCode;
    }
}
