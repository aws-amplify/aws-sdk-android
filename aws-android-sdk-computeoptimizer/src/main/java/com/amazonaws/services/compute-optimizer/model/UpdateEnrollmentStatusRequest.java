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
package com.amazonaws.services.compute-optimizer.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Updates the enrollment (opt in) status of an account to the AWS Compute Optimizer service.</p> <p>If the account is a master account of an organization, this action can also be used to enroll member accounts within the organization.</p>
 */
public class UpdateEnrollmentStatusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The new enrollment status of the account.</p> <p>Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if <code>Pending</code> or <code>Failed</code> are specified.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive, Pending, Failed
     */
    private String status;

    /**
     * <p>Indicates whether to enroll member accounts of the organization if the your account is the master account of an organization.</p>
     */
    private Boolean includeMemberAccounts;

    /**
     * <p>The new enrollment status of the account.</p> <p>Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if <code>Pending</code> or <code>Failed</code> are specified.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive, Pending, Failed
     *
     * @return <p>The new enrollment status of the account.</p> <p>Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if <code>Pending</code> or <code>Failed</code> are specified.</p>
     *
     * @see Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The new enrollment status of the account.</p> <p>Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if <code>Pending</code> or <code>Failed</code> are specified.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive, Pending, Failed
     *
     * @param status <p>The new enrollment status of the account.</p> <p>Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if <code>Pending</code> or <code>Failed</code> are specified.</p>
     *
     * @see Status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The new enrollment status of the account.</p> <p>Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if <code>Pending</code> or <code>Failed</code> are specified.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive, Pending, Failed
     *
     * @param status <p>The new enrollment status of the account.</p> <p>Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if <code>Pending</code> or <code>Failed</code> are specified.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see Status
     */
    public UpdateEnrollmentStatusRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>The new enrollment status of the account.</p> <p>Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if <code>Pending</code> or <code>Failed</code> are specified.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive, Pending, Failed
     *
     * @param status <p>The new enrollment status of the account.</p> <p>Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if <code>Pending</code> or <code>Failed</code> are specified.</p>
     *
     * @see Status
     */
    public void setStatus(Status status) {
        this.status = status.toString();
    }

    /**
     * <p>The new enrollment status of the account.</p> <p>Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if <code>Pending</code> or <code>Failed</code> are specified.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive, Pending, Failed
     *
     * @param status <p>The new enrollment status of the account.</p> <p>Accepted options are <code>Active</code> or <code>Inactive</code>. You will get an error if <code>Pending</code> or <code>Failed</code> are specified.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see Status
     */
    public UpdateEnrollmentStatusRequest withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>Indicates whether to enroll member accounts of the organization if the your account is the master account of an organization.</p>
     *
     * @return <p>Indicates whether to enroll member accounts of the organization if the your account is the master account of an organization.</p>
     */
    public Boolean isIncludeMemberAccounts() {
        return includeMemberAccounts;
    }

    /**
     * <p>Indicates whether to enroll member accounts of the organization if the your account is the master account of an organization.</p>
     *
     * @return <p>Indicates whether to enroll member accounts of the organization if the your account is the master account of an organization.</p>
     */
    public Boolean getIncludeMemberAccounts() {
        return includeMemberAccounts;
    }

    /**
     * <p>Indicates whether to enroll member accounts of the organization if the your account is the master account of an organization.</p>
     *
     * @param includeMemberAccounts <p>Indicates whether to enroll member accounts of the organization if the your account is the master account of an organization.</p>
     */
    public void setIncludeMemberAccounts(Boolean includeMemberAccounts) {
        this.includeMemberAccounts = includeMemberAccounts;
    }

    /**
     * <p>Indicates whether to enroll member accounts of the organization if the your account is the master account of an organization.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includeMemberAccounts <p>Indicates whether to enroll member accounts of the organization if the your account is the master account of an organization.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateEnrollmentStatusRequest withIncludeMemberAccounts(Boolean includeMemberAccounts) {
        this.includeMemberAccounts = includeMemberAccounts;
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
        if (getStatus() != null) sb.append("status: " + getStatus() + ",");
        if (getIncludeMemberAccounts() != null) sb.append("includeMemberAccounts: " + getIncludeMemberAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getIncludeMemberAccounts() == null) ? 0 : getIncludeMemberAccounts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateEnrollmentStatusRequest == false) return false;
        UpdateEnrollmentStatusRequest other = (UpdateEnrollmentStatusRequest)obj;

        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        if (other.getIncludeMemberAccounts() == null ^ this.getIncludeMemberAccounts() == null) return false;
        if (other.getIncludeMemberAccounts() != null && other.getIncludeMemberAccounts().equals(this.getIncludeMemberAccounts()) == false) return false;
        return true;
    }
}
