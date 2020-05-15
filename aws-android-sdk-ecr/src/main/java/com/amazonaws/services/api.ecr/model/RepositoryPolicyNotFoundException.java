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

package com.amazonaws.services.api.ecr.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The specified repository and registry combination does not have an associated
 * repository policy.
 * </p>
 */
public class RepositoryPolicyNotFoundException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new RepositoryPolicyNotFoundException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public RepositoryPolicyNotFoundException(String message) {
        super(message);
    }
}
