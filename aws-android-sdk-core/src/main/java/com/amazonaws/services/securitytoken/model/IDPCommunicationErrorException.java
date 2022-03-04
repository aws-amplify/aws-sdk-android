/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.securitytoken.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The request could not be fulfilled because the identity provider (IDP) that
 * was asked to verify the incoming identity token could not be reached. This is
 * often a transient error caused by network conditions. Retry the request a
 * limited number of times so that you don't exceed the request rate. If the
 * error persists, the identity provider might be down or not responding.
 * </p>
 */
public class IDPCommunicationErrorException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new IDPCommunicationErrorException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public IDPCommunicationErrorException(String message) {
        super(message);
    }
}
