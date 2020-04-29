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

package com.amazonaws.services.awscloudmap.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The operation is already in progress.
 * </p>
 */
public class DuplicateRequestException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The ID of the operation that is already in progress.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String duplicateOperationId;

    /**
     * Constructs a new DuplicateRequestException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public DuplicateRequestException(String message) {
        super(message);
    }

    /**
     * <p>
     * The ID of the operation that is already in progress.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The ID of the operation that is already in progress.
     *         </p>
     */
    public String getDuplicateOperationId() {
        return duplicateOperationId;
    }

    /**
     * <p>
     * The ID of the operation that is already in progress.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param duplicateOperationId <p>
     *            The ID of the operation that is already in progress.
     *            </p>
     */
    public void setDuplicateOperationId(String duplicateOperationId) {
        this.duplicateOperationId = duplicateOperationId;
    }
}
