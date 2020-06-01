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
 * The error returned when a second request is received with the same client
 * request token but different parameters settings. A client request token
 * should always uniquely identify a single request.
 * </p>
 */
public class IncompatibleParameterErrorException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * A parameter that is incompatible with the earlier request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String parameter;

    /**
     * Constructs a new IncompatibleParameterErrorException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public IncompatibleParameterErrorException(String message) {
        super(message);
    }

    /**
     * <p>
     * A parameter that is incompatible with the earlier request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         A parameter that is incompatible with the earlier request.
     *         </p>
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * <p>
     * A parameter that is incompatible with the earlier request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param parameter <p>
     *            A parameter that is incompatible with the earlier request.
     *            </p>
     */
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }
}
