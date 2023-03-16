/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The request was rejected because the specified CloudHSM cluster is already
 * associated with an CloudHSM key store in the account, or it shares a backup
 * history with an CloudHSM key store in the account. Each CloudHSM key store in
 * the account must be associated with a different CloudHSM cluster.
 * </p>
 * <p>
 * CloudHSM clusters that share a backup history have the same cluster
 * certificate. To view the cluster certificate of an CloudHSM cluster, use the
 * <a href=
 * "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
 * >DescribeClusters</a> operation.
 * </p>
 */
public class CloudHsmClusterInUseException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new CloudHsmClusterInUseException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public CloudHsmClusterInUseException(String message) {
        super(message);
    }
}
