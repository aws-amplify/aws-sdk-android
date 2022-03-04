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

package com.amazonaws.services.securitytoken.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The request was rejected because the total packed size of the session
 * policies and session tags combined was too large. An Amazon Web Services
 * conversion compresses the session policy document, session policy ARNs, and
 * session tags into a packed binary format that has a separate limit. The error
 * message indicates by percentage how close the policies and tags are to the
 * upper size limit. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
 * >Passing Session Tags in STS</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * You could receive this error even though you meet other defined session
 * policy and session tag limits. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-limits-entity-length"
 * >IAM and STS Entity Character Limits</a> in the <i>IAM User Guide</i>.
 * </p>
 */
public class PackedPolicyTooLargeException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new PackedPolicyTooLargeException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public PackedPolicyTooLargeException(String message) {
        super(message);
    }
}
