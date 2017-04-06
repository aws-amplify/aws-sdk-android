/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for AWS Security Token
 * Service.
 */
public enum SecurityTokenServiceActions implements Action {
    /** Represents any action executed on AWS Security Token Service. */
    AllSecurityTokenServiceActions("sts:*"),

    /** Action for the AssumeRole operation. */
    AssumeRole("sts:AssumeRole"),

    /** Action for the AssumeRoleWithWebIdentity operation. */
    AssumeRoleWithWebIdentity("sts:AssumeRoleWithWebIdentity"),

    /** Action for the GetCallerIdentity operation. */
    GetCallerIdentity("sts:GetCallerIdentity"),

    /** Action for the GetFederationToken operation. */
    GetFederationToken("sts:GetFederationToken"),

    /** Action for the GetSessionToken operation. */
    GetSessionToken("sts:GetSessionToken");

    private final String action;

    private SecurityTokenServiceActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
