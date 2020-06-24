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

package com.amazonaws.services.iam.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The request was rejected because only the service that depends on the
 * service-linked role can modify or delete the role on your behalf. The error
 * message includes the name of the service that depends on this service-linked
 * role. You must request the change through that service.
 * </p>
 */
public class UnmodifiableEntityException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new UnmodifiableEntityException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public UnmodifiableEntityException(String message) {
        super(message);
    }
}
