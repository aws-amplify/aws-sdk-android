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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for CreateInputSecurityGroupResponse
 */
public class CreateInputSecurityGroupResult implements Serializable {
    /**
     * An Input Security Group
     */
    private InputSecurityGroup securityGroup;

    /**
     * An Input Security Group
     *
     * @return An Input Security Group
     */
    public InputSecurityGroup getSecurityGroup() {
        return securityGroup;
    }

    /**
     * An Input Security Group
     *
     * @param securityGroup An Input Security Group
     */
    public void setSecurityGroup(InputSecurityGroup securityGroup) {
        this.securityGroup = securityGroup;
    }

    /**
     * An Input Security Group
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroup An Input Security Group
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInputSecurityGroupResult withSecurityGroup(InputSecurityGroup securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

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
        if (getSecurityGroup() != null)
            sb.append("SecurityGroup: " + getSecurityGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSecurityGroup() == null) ? 0 : getSecurityGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInputSecurityGroupResult == false)
            return false;
        CreateInputSecurityGroupResult other = (CreateInputSecurityGroupResult) obj;

        if (other.getSecurityGroup() == null ^ this.getSecurityGroup() == null)
            return false;
        if (other.getSecurityGroup() != null
                && other.getSecurityGroup().equals(this.getSecurityGroup()) == false)
            return false;
        return true;
    }
}
