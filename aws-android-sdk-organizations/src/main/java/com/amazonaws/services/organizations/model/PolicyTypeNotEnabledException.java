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

package com.amazonaws.services.organizations.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The specified policy type isn't currently enabled in this root. You can't
 * attach policies of the specified type to entities in a root until you enable
 * that type in the root. For more information, see <a href=
 * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
 * >Enabling All Features in Your Organization</a> in the <i>AWS Organizations
 * User Guide.</i>
 * </p>
 */
public class PolicyTypeNotEnabledException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new PolicyTypeNotEnabledException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public PolicyTypeNotEnabledException(String message) {
        super(message);
    }
}
