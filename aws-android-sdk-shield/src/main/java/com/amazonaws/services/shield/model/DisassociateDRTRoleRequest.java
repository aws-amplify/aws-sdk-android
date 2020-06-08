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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes the DDoS Response Team's (DRT) access to your AWS account.
 * </p>
 * <p>
 * To make a <code>DisassociateDRTRole</code> request, you must be subscribed to
 * the <a
 * href="https://aws.amazon.com/premiumsupport/business-support/">Business
 * Support plan</a> or the <a
 * href="https://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise
 * Support plan</a>. However, if you are not subscribed to one of these support
 * plans, but had been previously and had granted the DRT access to your
 * account, you can submit a <code>DisassociateDRTRole</code> request to remove
 * this access.
 * </p>
 */
public class DisassociateDRTRoleRequest extends AmazonWebServiceRequest implements Serializable {
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

        if (obj instanceof DisassociateDRTRoleRequest == false)
            return false;
        DisassociateDRTRoleRequest other = (DisassociateDRTRoleRequest) obj;

        return true;
    }
}
