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
 * The role name can't contain invalid characters. Also verify that you
 * specified an IAM role for notifications that includes the required trust
 * policy. For information about configuring the IAM role for Run Command
 * notifications, see <a href=
 * "https://docs.aws.amazon.com/systems-manager/latest/userguide/rc-sns-notifications.html"
 * >Configuring Amazon SNS Notifications for Run Command</a> in the <i>AWS
 * Systems Manager User Guide</i>.
 * </p>
 */
public class InvalidRoleException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidRoleException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidRoleException(String message) {
        super(message);
    }
}
