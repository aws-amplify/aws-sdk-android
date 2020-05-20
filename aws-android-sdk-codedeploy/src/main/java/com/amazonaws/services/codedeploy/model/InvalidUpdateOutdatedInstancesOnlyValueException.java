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

package com.amazonaws.services.codedeploy.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The UpdateOutdatedInstancesOnly value is invalid. For AWS Lambda deployments,
 * <code>false</code> is expected. For EC2/On-premises deployments,
 * <code>true</code> or <code>false</code> is expected.
 * </p>
 */
public class InvalidUpdateOutdatedInstancesOnlyValueException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidUpdateOutdatedInstancesOnlyValueException with
     * the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidUpdateOutdatedInstancesOnlyValueException(String message) {
        super(message);
    }
}
