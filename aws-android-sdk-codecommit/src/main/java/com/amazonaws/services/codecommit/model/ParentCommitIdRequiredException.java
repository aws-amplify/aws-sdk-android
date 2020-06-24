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
 * A parent commit ID is required. To view the full commit ID of a branch in a
 * repository, use <a>GetBranch</a> or a Git command (for example, git pull or
 * git log).
 * </p>
 */
public class ParentCommitIdRequiredException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ParentCommitIdRequiredException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ParentCommitIdRequiredException(String message) {
        super(message);
    }
}
