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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns details about the IAM user or role whose credentials are used to call
 * the operation.
 * </p>
 * <note>
 * <p>
 * No permissions are required to perform this operation. If an administrator
 * adds a policy to your IAM user or role that explicitly denies access to the
 * <code>sts:GetCallerIdentity</code> action, you can still perform this
 * operation. Permissions are not required because the same information is
 * returned when an IAM user or role is denied access. To view an example
 * response, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_access-denied-delete-mfa"
 * >I Am Not Authorized to Perform: iam:DeleteVirtualMFADevice</a> in the <i>IAM
 * User Guide</i>.
 * </p>
 * </note>
 */
public class GetCallerIdentityRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCallerIdentityRequest == false)
            return false;
        GetCallerIdentityRequest other = (GetCallerIdentityRequest) obj;

        return true;
    }
}
