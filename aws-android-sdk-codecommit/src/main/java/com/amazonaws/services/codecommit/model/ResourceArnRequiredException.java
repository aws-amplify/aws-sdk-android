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
 * A valid Amazon Resource Name (ARN) for an AWS CodeCommit resource is
 * required. For a list of valid resources in AWS CodeCommit, see <a href=
 * "https://docs.aws.amazon.com/codecommit/latest/userguide/auth-and-access-control-iam-access-control-identity-based.html#arn-formats"
 * >CodeCommit Resources and Operations</a> in the AWS CodeCommit User Guide.
 * </p>
 */
public class ResourceArnRequiredException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ResourceArnRequiredException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ResourceArnRequiredException(String message) {
        super(message);
    }
}
