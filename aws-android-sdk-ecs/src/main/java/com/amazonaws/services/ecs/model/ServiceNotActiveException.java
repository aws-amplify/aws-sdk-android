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

package com.amazonaws.services.ecs.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The specified service is not active. You can't update a service that is
 * inactive. If you have previously deleted a service, you can re-create it with
 * <a>CreateService</a>.
 * </p>
 */
public class ServiceNotActiveException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ServiceNotActiveException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ServiceNotActiveException(String message) {
        super(message);
    }
}
