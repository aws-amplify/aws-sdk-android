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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Changes the Amazon Identity and Access Management (IAM) role that is assigned to the on-premises instance or virtual machines (VM). IAM roles are first assigned to these hybrid instances during the activation process. For more information, see <a>CreateActivation</a>.</p>
 */
public class UpdateManagedInstanceRoleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The ID of the managed instance where you want to update the role.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^mi-[0-9a-f]{17}$<br/>
     */
    private String instanceId;

    /**
     * <p>The IAM role you want to assign or change.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String iamRole;

    /**
     * <p>The ID of the managed instance where you want to update the role.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^mi-[0-9a-f]{17}$<br/>
     *
     * @return <p>The ID of the managed instance where you want to update the role.</p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>The ID of the managed instance where you want to update the role.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^mi-[0-9a-f]{17}$<br/>
     *
     * @param instanceId <p>The ID of the managed instance where you want to update the role.</p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>The ID of the managed instance where you want to update the role.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^mi-[0-9a-f]{17}$<br/>
     *
     * @param instanceId <p>The ID of the managed instance where you want to update the role.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateManagedInstanceRoleRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>The IAM role you want to assign or change.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>The IAM role you want to assign or change.</p>
     */
    public String getIamRole() {
        return iamRole;
    }

    /**
     * <p>The IAM role you want to assign or change.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param iamRole <p>The IAM role you want to assign or change.</p>
     */
    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>The IAM role you want to assign or change.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param iamRole <p>The IAM role you want to assign or change.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateManagedInstanceRoleRequest withIamRole(String iamRole) {
        this.iamRole = iamRole;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getIamRole() != null) sb.append("IamRole: " + getIamRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateManagedInstanceRoleRequest == false) return false;
        UpdateManagedInstanceRoleRequest other = (UpdateManagedInstanceRoleRequest)obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null) return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false) return false;
        return true;
    }
}
