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


public class GetEnrollmentStatusResult implements Serializable {
    /**
     * <p>The enrollment status of the account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive, Pending, Failed
     */
    private String status;

    /**
     * <p>The reason for the enrollment status of the account.</p> <p>For example, an account might show a status of <code>Pending</code> because member accounts of an organization require more time to be enrolled in the service.</p>
     */
    private String statusReason;

    /**
     * <p>Confirms the enrollment status of member accounts within the organization, if the account is a master account of an organization.</p>
     */
    private Boolean memberAccountsEnrolled;

    /**
     * <p>The enrollment status of the account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive, Pending, Failed
     *
     * @return <p>The enrollment status of the account.</p>
     *
     * @see Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The enrollment status of the account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive, Pending, Failed
     *
     * @param status <p>The enrollment status of the account.</p>
     *
     * @see Status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The enrollment status of the account.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive, Pending, Failed
     *
     * @param status <p>The enrollment status of the account.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see Status
     */
    public GetEnrollmentStatusResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>The enrollment status of the account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive, Pending, Failed
     *
     * @param status <p>The enrollment status of the account.</p>
     *
     * @see Status
     */
    public void setStatus(Status status) {
        this.status = status.toString();
    }

    /**
     * <p>The enrollment status of the account.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive, Pending, Failed
     *
     * @param status <p>The enrollment status of the account.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see Status
     */
    public GetEnrollmentStatusResult withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>The reason for the enrollment status of the account.</p> <p>For example, an account might show a status of <code>Pending</code> because member accounts of an organization require more time to be enrolled in the service.</p>
     *
     * @return <p>The reason for the enrollment status of the account.</p> <p>For example, an account might show a status of <code>Pending</code> because member accounts of an organization require more time to be enrolled in the service.</p>
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * <p>The reason for the enrollment status of the account.</p> <p>For example, an account might show a status of <code>Pending</code> because member accounts of an organization require more time to be enrolled in the service.</p>
     *
     * @param statusReason <p>The reason for the enrollment status of the account.</p> <p>For example, an account might show a status of <code>Pending</code> because member accounts of an organization require more time to be enrolled in the service.</p>
     */
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>The reason for the enrollment status of the account.</p> <p>For example, an account might show a status of <code>Pending</code> because member accounts of an organization require more time to be enrolled in the service.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusReason <p>The reason for the enrollment status of the account.</p> <p>For example, an account might show a status of <code>Pending</code> because member accounts of an organization require more time to be enrolled in the service.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEnrollmentStatusResult withStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * <p>Confirms the enrollment status of member accounts within the organization, if the account is a master account of an organization.</p>
     *
     * @return <p>Confirms the enrollment status of member accounts within the organization, if the account is a master account of an organization.</p>
     */
    public Boolean isMemberAccountsEnrolled() {
        return memberAccountsEnrolled;
    }

    /**
     * <p>Confirms the enrollment status of member accounts within the organization, if the account is a master account of an organization.</p>
     *
     * @return <p>Confirms the enrollment status of member accounts within the organization, if the account is a master account of an organization.</p>
     */
    public Boolean getMemberAccountsEnrolled() {
        return memberAccountsEnrolled;
    }

    /**
     * <p>Confirms the enrollment status of member accounts within the organization, if the account is a master account of an organization.</p>
     *
     * @param memberAccountsEnrolled <p>Confirms the enrollment status of member accounts within the organization, if the account is a master account of an organization.</p>
     */
    public void setMemberAccountsEnrolled(Boolean memberAccountsEnrolled) {
        this.memberAccountsEnrolled = memberAccountsEnrolled;
    }

    /**
     * <p>Confirms the enrollment status of member accounts within the organization, if the account is a master account of an organization.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param memberAccountsEnrolled <p>Confirms the enrollment status of member accounts within the organization, if the account is a master account of an organization.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetEnrollmentStatusResult withMemberAccountsEnrolled(Boolean memberAccountsEnrolled) {
        this.memberAccountsEnrolled = memberAccountsEnrolled;
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
        if (getStatusReason() != null) sb.append("statusReason: " + getStatusReason() + ",");
        if (getMemberAccountsEnrolled() != null) sb.append("memberAccountsEnrolled: " + getMemberAccountsEnrolled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getMemberAccountsEnrolled() == null) ? 0 : getMemberAccountsEnrolled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetEnrollmentStatusResult == false) return false;
        GetEnrollmentStatusResult other = (GetEnrollmentStatusResult)obj;

        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null) return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false) return false;
        if (other.getMemberAccountsEnrolled() == null ^ this.getMemberAccountsEnrolled() == null) return false;
        if (other.getMemberAccountsEnrolled() != null && other.getMemberAccountsEnrolled().equals(this.getMemberAccountsEnrolled()) == false) return false;
        return true;
    }
}
