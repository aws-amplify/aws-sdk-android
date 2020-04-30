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

package com.amazonaws.services.schemas.model;

import com.amazonaws.AmazonServiceException;

/**
 * 
 */
public class UnauthorizedException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The error code.
     * </p>
     */
    private String code;

    /**
     * Constructs a new UnauthorizedException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public UnauthorizedException(String message) {
        super(message);
    }

    /**
     * <p>
     * The error code.
     * </p>
     *
     * @return <p>
     *         The error code.
     *         </p>
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * The error code.
     * </p>
     *
     * @param code <p>
     *            The error code.
     *            </p>
     */
    public void setCode(String code) {
        this.code = code;
    }
}
