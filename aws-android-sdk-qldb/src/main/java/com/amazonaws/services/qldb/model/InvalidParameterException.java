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

package com.amazonaws.services.qldb.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * One or more parameters in the request aren't valid.
 * </p>
 */
public class InvalidParameterException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The name of the invalid parameter.
     * </p>
     */
    private String parameterName;

    /**
     * Constructs a new InvalidParameterException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidParameterException(String message) {
        super(message);
    }

    /**
     * <p>
     * The name of the invalid parameter.
     * </p>
     *
     * @return <p>
     *         The name of the invalid parameter.
     *         </p>
     */
    public String getParameterName() {
        return parameterName;
    }

    /**
     * <p>
     * The name of the invalid parameter.
     * </p>
     *
     * @param parameterName <p>
     *            The name of the invalid parameter.
     *            </p>
     */
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }
}
