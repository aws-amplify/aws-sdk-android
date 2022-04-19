/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The request was rejected because the associated CloudHSM cluster did not meet
 * the configuration requirements for a custom key store.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The cluster must be configured with private subnets in at least two different
 * Availability Zones in the Region.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <a href=
 * "https://docs.aws.amazon.com/cloudhsm/latest/userguide/configure-sg.html"
 * >security group for the cluster</a>
 * (cloudhsm-cluster-<i>&lt;cluster-id&gt;</i>-sg) must include inbound rules
 * and outbound rules that allow TCP traffic on ports 2223-2225. The
 * <b>Source</b> in the inbound rules and the <b>Destination</b> in the outbound
 * rules must match the security group ID. These rules are set by default when
 * you create the cluster. Do not delete or change them. To get information
 * about a particular security group, use the <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html"
 * >DescribeSecurityGroups</a> operation.
 * </p>
 * </li>
 * <li>
 * <p>
 * The cluster must contain at least as many HSMs as the operation requires. To
 * add HSMs, use the CloudHSM <a href=
 * "https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_CreateHsm.html"
 * >CreateHsm</a> operation.
 * </p>
 * <p>
 * For the <a>CreateCustomKeyStore</a>, <a>UpdateCustomKeyStore</a>, and
 * <a>CreateKey</a> operations, the CloudHSM cluster must have at least two
 * active HSMs, each in a different Availability Zone. For the
 * <a>ConnectCustomKeyStore</a> operation, the CloudHSM must contain at least
 * one active HSM.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about the requirements for an CloudHSM cluster that is
 * associated with a custom key store, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
 * >Assemble the Prerequisites</a> in the <i>Key Management Service Developer
 * Guide</i>. For information about creating a private subnet for an CloudHSM
 * cluster, see <a href=
 * "https://docs.aws.amazon.com/cloudhsm/latest/userguide/create-subnets.html"
 * >Create a Private Subnet</a> in the <i>CloudHSM User Guide</i>. For
 * information about cluster security groups, see <a href=
 * "https://docs.aws.amazon.com/cloudhsm/latest/userguide/configure-sg.html"
 * >Configure a Default Security Group</a> in the <i> <i>CloudHSM User Guide</i>
 * </i>.
 * </p>
 */
public class CloudHsmClusterInvalidConfigurationException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new CloudHsmClusterInvalidConfigurationException with the
     * specified error message.
     *
     * @param message Describes the error encountered.
     */
    public CloudHsmClusterInvalidConfigurationException(String message) {
        super(message);
    }
}
