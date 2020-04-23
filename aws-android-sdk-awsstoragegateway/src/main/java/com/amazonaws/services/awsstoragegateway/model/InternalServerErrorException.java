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

package com.amazonaws.services.awsstoragegateway.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * An internal server error has occurred during the request. For more
 * information, see the error and message fields.
 * </p>
 */
public class InternalServerErrorException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * A <a>StorageGatewayError</a> that provides more information about the
     * cause of the error.
     * </p>
     */
    private StorageGatewayError error;

    /**
     * Constructs a new InternalServerErrorException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InternalServerErrorException(String message) {
        super(message);
    }

    /**
     * <p>
     * A <a>StorageGatewayError</a> that provides more information about the
     * cause of the error.
     * </p>
     *
     * @return <p>
     *         A <a>StorageGatewayError</a> that provides more information about
     *         the cause of the error.
     *         </p>
     */
    public StorageGatewayError getError() {
        return error;
    }

    /**
     * <p>
     * A <a>StorageGatewayError</a> that provides more information about the
     * cause of the error.
     * </p>
     *
     * @param error <p>
     *            A <a>StorageGatewayError</a> that provides more information
     *            about the cause of the error.
     *            </p>
     */
    public void setError(StorageGatewayError error) {
        this.error = error;
    }
}
