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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>The specified target instance for the session is not fully configured for use with Session Manager. For more information, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/session-manager-getting-started.html">Getting started with Session Manager</a> in the <i>AWS Systems Manager User Guide</i>. This error is also returned if you attempt to start a session on an instance that is located in a different account or Region</p>
 */
public class TargetNotConnectedException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TargetNotConnectedException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public TargetNotConnectedException(String message) {
        super(message);
    }
}
