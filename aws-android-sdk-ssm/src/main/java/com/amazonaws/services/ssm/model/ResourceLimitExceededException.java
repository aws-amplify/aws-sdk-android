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

package com.amazonaws.services.ssm.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Error returned when the caller has exceeded the default resource quotas. For
 * example, too many maintenance windows or patch baselines have been created.
 * </p>
 * <p>
 * For information about resource quotas in Systems Manager, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm"
 * >Systems Manager service quotas</a> in the <i>AWS General Reference</i>.
 * </p>
 */
public class ResourceLimitExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ResourceLimitExceededException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ResourceLimitExceededException(String message) {
        super(message);
    }
}
