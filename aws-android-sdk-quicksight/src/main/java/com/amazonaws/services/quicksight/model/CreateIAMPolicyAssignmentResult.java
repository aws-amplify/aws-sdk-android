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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

public class CreateIAMPolicyAssignmentResult implements Serializable {
    /**
     * <p>
     * The name of the assignment. This name must be unique within the AWS
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     */
    private String assignmentName;

    /**
     * <p>
     * The ID for the assignment.
     * </p>
     */
    private String assignmentId;

    /**
     * <p>
     * The status of the assignment. Possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - Anything specified in this assignment is used when
     * creating the data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - This assignment isn't used when creating the data
     * source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAFT</code> - This assignment is an unfinished draft and isn't
     * used when creating the data source.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DRAFT, DISABLED
     */
    private String assignmentStatus;

    /**
     * <p>
     * The ARN for the IAM policy that is applied to the QuickSight users and
     * groups specified in this assignment.
     * </p>
     */
    private String policyArn;

    /**
     * <p>
     * The QuickSight users, groups, or both that the IAM policy is assigned to.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> identities;

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The name of the assignment. This name must be unique within the AWS
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     *
     * @return <p>
     *         The name of the assignment. This name must be unique within the
     *         AWS account.
     *         </p>
     */
    public String getAssignmentName() {
        return assignmentName;
    }

    /**
     * <p>
     * The name of the assignment. This name must be unique within the AWS
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     *
     * @param assignmentName <p>
     *            The name of the assignment. This name must be unique within
     *            the AWS account.
     *            </p>
     */
    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    /**
     * <p>
     * The name of the assignment. This name must be unique within the AWS
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     *
     * @param assignmentName <p>
     *            The name of the assignment. This name must be unique within
     *            the AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIAMPolicyAssignmentResult withAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
        return this;
    }

    /**
     * <p>
     * The ID for the assignment.
     * </p>
     *
     * @return <p>
     *         The ID for the assignment.
     *         </p>
     */
    public String getAssignmentId() {
        return assignmentId;
    }

    /**
     * <p>
     * The ID for the assignment.
     * </p>
     *
     * @param assignmentId <p>
     *            The ID for the assignment.
     *            </p>
     */
    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    /**
     * <p>
     * The ID for the assignment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assignmentId <p>
     *            The ID for the assignment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIAMPolicyAssignmentResult withAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
        return this;
    }

    /**
     * <p>
     * The status of the assignment. Possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - Anything specified in this assignment is used when
     * creating the data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - This assignment isn't used when creating the data
     * source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAFT</code> - This assignment is an unfinished draft and isn't
     * used when creating the data source.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DRAFT, DISABLED
     *
     * @return <p>
     *         The status of the assignment. Possible values are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> - Anything specified in this assignment is
     *         used when creating the data source.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> - This assignment isn't used when creating
     *         the data source.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DRAFT</code> - This assignment is an unfinished draft and
     *         isn't used when creating the data source.
     *         </p>
     *         </li>
     *         </ul>
     * @see AssignmentStatus
     */
    public String getAssignmentStatus() {
        return assignmentStatus;
    }

    /**
     * <p>
     * The status of the assignment. Possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - Anything specified in this assignment is used when
     * creating the data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - This assignment isn't used when creating the data
     * source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAFT</code> - This assignment is an unfinished draft and isn't
     * used when creating the data source.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DRAFT, DISABLED
     *
     * @param assignmentStatus <p>
     *            The status of the assignment. Possible values are as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLED</code> - Anything specified in this assignment
     *            is used when creating the data source.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code> - This assignment isn't used when
     *            creating the data source.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DRAFT</code> - This assignment is an unfinished draft
     *            and isn't used when creating the data source.
     *            </p>
     *            </li>
     *            </ul>
     * @see AssignmentStatus
     */
    public void setAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    /**
     * <p>
     * The status of the assignment. Possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - Anything specified in this assignment is used when
     * creating the data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - This assignment isn't used when creating the data
     * source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAFT</code> - This assignment is an unfinished draft and isn't
     * used when creating the data source.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DRAFT, DISABLED
     *
     * @param assignmentStatus <p>
     *            The status of the assignment. Possible values are as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLED</code> - Anything specified in this assignment
     *            is used when creating the data source.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code> - This assignment isn't used when
     *            creating the data source.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DRAFT</code> - This assignment is an unfinished draft
     *            and isn't used when creating the data source.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssignmentStatus
     */
    public CreateIAMPolicyAssignmentResult withAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
        return this;
    }

    /**
     * <p>
     * The status of the assignment. Possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - Anything specified in this assignment is used when
     * creating the data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - This assignment isn't used when creating the data
     * source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAFT</code> - This assignment is an unfinished draft and isn't
     * used when creating the data source.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DRAFT, DISABLED
     *
     * @param assignmentStatus <p>
     *            The status of the assignment. Possible values are as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLED</code> - Anything specified in this assignment
     *            is used when creating the data source.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code> - This assignment isn't used when
     *            creating the data source.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DRAFT</code> - This assignment is an unfinished draft
     *            and isn't used when creating the data source.
     *            </p>
     *            </li>
     *            </ul>
     * @see AssignmentStatus
     */
    public void setAssignmentStatus(AssignmentStatus assignmentStatus) {
        this.assignmentStatus = assignmentStatus.toString();
    }

    /**
     * <p>
     * The status of the assignment. Possible values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - Anything specified in this assignment is used when
     * creating the data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - This assignment isn't used when creating the data
     * source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DRAFT</code> - This assignment is an unfinished draft and isn't
     * used when creating the data source.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DRAFT, DISABLED
     *
     * @param assignmentStatus <p>
     *            The status of the assignment. Possible values are as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLED</code> - Anything specified in this assignment
     *            is used when creating the data source.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DISABLED</code> - This assignment isn't used when
     *            creating the data source.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DRAFT</code> - This assignment is an unfinished draft
     *            and isn't used when creating the data source.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssignmentStatus
     */
    public CreateIAMPolicyAssignmentResult withAssignmentStatus(AssignmentStatus assignmentStatus) {
        this.assignmentStatus = assignmentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ARN for the IAM policy that is applied to the QuickSight users and
     * groups specified in this assignment.
     * </p>
     *
     * @return <p>
     *         The ARN for the IAM policy that is applied to the QuickSight
     *         users and groups specified in this assignment.
     *         </p>
     */
    public String getPolicyArn() {
        return policyArn;
    }

    /**
     * <p>
     * The ARN for the IAM policy that is applied to the QuickSight users and
     * groups specified in this assignment.
     * </p>
     *
     * @param policyArn <p>
     *            The ARN for the IAM policy that is applied to the QuickSight
     *            users and groups specified in this assignment.
     *            </p>
     */
    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The ARN for the IAM policy that is applied to the QuickSight users and
     * groups specified in this assignment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyArn <p>
     *            The ARN for the IAM policy that is applied to the QuickSight
     *            users and groups specified in this assignment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIAMPolicyAssignmentResult withPolicyArn(String policyArn) {
        this.policyArn = policyArn;
        return this;
    }

    /**
     * <p>
     * The QuickSight users, groups, or both that the IAM policy is assigned to.
     * </p>
     *
     * @return <p>
     *         The QuickSight users, groups, or both that the IAM policy is
     *         assigned to.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getIdentities() {
        return identities;
    }

    /**
     * <p>
     * The QuickSight users, groups, or both that the IAM policy is assigned to.
     * </p>
     *
     * @param identities <p>
     *            The QuickSight users, groups, or both that the IAM policy is
     *            assigned to.
     *            </p>
     */
    public void setIdentities(java.util.Map<String, java.util.List<String>> identities) {
        this.identities = identities;
    }

    /**
     * <p>
     * The QuickSight users, groups, or both that the IAM policy is assigned to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identities <p>
     *            The QuickSight users, groups, or both that the IAM policy is
     *            assigned to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIAMPolicyAssignmentResult withIdentities(
            java.util.Map<String, java.util.List<String>> identities) {
        this.identities = identities;
        return this;
    }

    /**
     * <p>
     * The QuickSight users, groups, or both that the IAM policy is assigned to.
     * </p>
     * <p>
     * The method adds a new key-value pair into Identities parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Identities.
     * @param value The corresponding value of the entry to be added into
     *            Identities.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIAMPolicyAssignmentResult addIdentitiesEntry(String key,
            java.util.List<String> value) {
        if (null == this.identities) {
            this.identities = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.identities.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.identities.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Identities.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateIAMPolicyAssignmentResult clearIdentitiesEntries() {
        this.identities = null;
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     *
     * @return <p>
     *         The AWS request ID for this operation.
     *         </p>
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     *
     * @param requestId <p>
     *            The AWS request ID for this operation.
     *            </p>
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId <p>
     *            The AWS request ID for this operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIAMPolicyAssignmentResult withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     *
     * @return <p>
     *         The HTTP status of the request.
     *         </p>
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     *
     * @param status <p>
     *            The HTTP status of the request.
     *            </p>
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The HTTP status of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIAMPolicyAssignmentResult withStatus(Integer status) {
        this.status = status;
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
        if (getAssignmentName() != null)
            sb.append("AssignmentName: " + getAssignmentName() + ",");
        if (getAssignmentId() != null)
            sb.append("AssignmentId: " + getAssignmentId() + ",");
        if (getAssignmentStatus() != null)
            sb.append("AssignmentStatus: " + getAssignmentStatus() + ",");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: " + getPolicyArn() + ",");
        if (getIdentities() != null)
            sb.append("Identities: " + getIdentities() + ",");
        if (getRequestId() != null)
            sb.append("RequestId: " + getRequestId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssignmentName() == null) ? 0 : getAssignmentName().hashCode());
        hashCode = prime * hashCode
                + ((getAssignmentId() == null) ? 0 : getAssignmentId().hashCode());
        hashCode = prime * hashCode
                + ((getAssignmentStatus() == null) ? 0 : getAssignmentStatus().hashCode());
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getIdentities() == null) ? 0 : getIdentities().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIAMPolicyAssignmentResult == false)
            return false;
        CreateIAMPolicyAssignmentResult other = (CreateIAMPolicyAssignmentResult) obj;

        if (other.getAssignmentName() == null ^ this.getAssignmentName() == null)
            return false;
        if (other.getAssignmentName() != null
                && other.getAssignmentName().equals(this.getAssignmentName()) == false)
            return false;
        if (other.getAssignmentId() == null ^ this.getAssignmentId() == null)
            return false;
        if (other.getAssignmentId() != null
                && other.getAssignmentId().equals(this.getAssignmentId()) == false)
            return false;
        if (other.getAssignmentStatus() == null ^ this.getAssignmentStatus() == null)
            return false;
        if (other.getAssignmentStatus() != null
                && other.getAssignmentStatus().equals(this.getAssignmentStatus()) == false)
            return false;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null
                && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getIdentities() == null ^ this.getIdentities() == null)
            return false;
        if (other.getIdentities() != null
                && other.getIdentities().equals(this.getIdentities()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
