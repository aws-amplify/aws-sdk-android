/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The request was rejected because the AWS CloudHSM cluster that is associated
 * with the custom key store is not active. Initialize and activate the cluster
 * and try the command again. For detailed instructions, see <a href=
 * "https://docs.aws.amazon.com/cloudhsm/latest/userguide/getting-started.html"
 * >Getting Started</a> in the <i>AWS CloudHSM User Guide</i>.
 * </p>
 */
public class CloudHsmClusterNotActiveException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new CloudHsmClusterNotActiveException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public CloudHsmClusterNotActiveException(String message) {
        super(message);
    }
}
