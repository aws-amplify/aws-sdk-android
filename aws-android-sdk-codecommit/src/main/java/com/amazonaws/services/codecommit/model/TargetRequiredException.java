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

package com.amazonaws.services.codecommit.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * A pull request target is required. It cannot be empty or null. A pull request
 * target must contain the full values for the repository name, source branch,
 * and destination branch for the pull request.
 * </p>
 */
public class TargetRequiredException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TargetRequiredException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public TargetRequiredException(String message) {
        super(message);
    }
}
