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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an assignment with one specified IAM policy, identified by its Amazon
 * Resource Name (ARN). This policy will be assigned to specified groups or
 * users of Amazon QuickSight. The users and groups need to be in the same
 * namespace.
 * </p>
 */
public class CreateIAMPolicyAssignmentRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the AWS account where you want to assign an IAM policy to
     * QuickSight users or groups.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String awsAccountId;

    /**
     * <p>
     * The name of the assignment. It must be unique within an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     */
    private String assignmentName;

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
     * The ARN for the IAM policy to apply to the QuickSight users and groups
     * specified in this assignment.
     * </p>
     */
    private String policyArn;

    /**
     * <p>
     * The QuickSight users, groups, or both that you want to assign the policy
     * to.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> identities;

    /**
     * <p>
     * The namespace that contains the assignment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     */
    private String namespace;

    /**
     * <p>
     * The ID of the AWS account where you want to assign an IAM policy to
     * QuickSight users or groups.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The ID of the AWS account where you want to assign an IAM policy
     *         to QuickSight users or groups.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account where you want to assign an IAM policy to
     * QuickSight users or groups.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID of the AWS account where you want to assign an IAM
     *            policy to QuickSight users or groups.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account where you want to assign an IAM policy to
     * QuickSight users or groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID of the AWS account where you want to assign an IAM
     *            policy to QuickSight users or groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIAMPolicyAssignmentRequest withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * The name of the assignment. It must be unique within an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     *
     * @return <p>
     *         The name of the assignment. It must be unique within an AWS
     *         account.
     *         </p>
     */
    public String getAssignmentName() {
        return assignmentName;
    }

    /**
     * <p>
     * The name of the assignment. It must be unique within an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     *
     * @param assignmentName <p>
     *            The name of the assignment. It must be unique within an AWS
     *            account.
     *            </p>
     */
    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    /**
     * <p>
     * The name of the assignment. It must be unique within an AWS account.
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
     *            The name of the assignment. It must be unique within an AWS
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIAMPolicyAssignmentRequest withAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
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
    public CreateIAMPolicyAssignmentRequest withAssignmentStatus(String assignmentStatus) {
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
    public CreateIAMPolicyAssignmentRequest withAssignmentStatus(AssignmentStatus assignmentStatus) {
        this.assignmentStatus = assignmentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ARN for the IAM policy to apply to the QuickSight users and groups
     * specified in this assignment.
     * </p>
     *
     * @return <p>
     *         The ARN for the IAM policy to apply to the QuickSight users and
     *         groups specified in this assignment.
     *         </p>
     */
    public String getPolicyArn() {
        return policyArn;
    }

    /**
     * <p>
     * The ARN for the IAM policy to apply to the QuickSight users and groups
     * specified in this assignment.
     * </p>
     *
     * @param policyArn <p>
     *            The ARN for the IAM policy to apply to the QuickSight users
     *            and groups specified in this assignment.
     *            </p>
     */
    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The ARN for the IAM policy to apply to the QuickSight users and groups
     * specified in this assignment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyArn <p>
     *            The ARN for the IAM policy to apply to the QuickSight users
     *            and groups specified in this assignment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIAMPolicyAssignmentRequest withPolicyArn(String policyArn) {
        this.policyArn = policyArn;
        return this;
    }

    /**
     * <p>
     * The QuickSight users, groups, or both that you want to assign the policy
     * to.
     * </p>
     *
     * @return <p>
     *         The QuickSight users, groups, or both that you want to assign the
     *         policy to.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getIdentities() {
        return identities;
    }

    /**
     * <p>
     * The QuickSight users, groups, or both that you want to assign the policy
     * to.
     * </p>
     *
     * @param identities <p>
     *            The QuickSight users, groups, or both that you want to assign
     *            the policy to.
     *            </p>
     */
    public void setIdentities(java.util.Map<String, java.util.List<String>> identities) {
        this.identities = identities;
    }

    /**
     * <p>
     * The QuickSight users, groups, or both that you want to assign the policy
     * to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identities <p>
     *            The QuickSight users, groups, or both that you want to assign
     *            the policy to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIAMPolicyAssignmentRequest withIdentities(
            java.util.Map<String, java.util.List<String>> identities) {
        this.identities = identities;
        return this;
    }

    /**
     * <p>
     * The QuickSight users, groups, or both that you want to assign the policy
     * to.
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
    public CreateIAMPolicyAssignmentRequest addIdentitiesEntry(String key,
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
    public CreateIAMPolicyAssignmentRequest clearIdentitiesEntries() {
        this.identities = null;
        return this;
    }

    /**
     * <p>
     * The namespace that contains the assignment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     *
     * @return <p>
     *         The namespace that contains the assignment.
     *         </p>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p>
     * The namespace that contains the assignment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     *
     * @param namespace <p>
     *            The namespace that contains the assignment.
     *            </p>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace that contains the assignment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     *
     * @param namespace <p>
     *            The namespace that contains the assignment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIAMPolicyAssignmentRequest withNamespace(String namespace) {
        this.namespace = namespace;
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: " + getAwsAccountId() + ",");
        if (getAssignmentName() != null)
            sb.append("AssignmentName: " + getAssignmentName() + ",");
        if (getAssignmentStatus() != null)
            sb.append("AssignmentStatus: " + getAssignmentStatus() + ",");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: " + getPolicyArn() + ",");
        if (getIdentities() != null)
            sb.append("Identities: " + getIdentities() + ",");
        if (getNamespace() != null)
            sb.append("Namespace: " + getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getAssignmentName() == null) ? 0 : getAssignmentName().hashCode());
        hashCode = prime * hashCode
                + ((getAssignmentStatus() == null) ? 0 : getAssignmentStatus().hashCode());
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getIdentities() == null) ? 0 : getIdentities().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIAMPolicyAssignmentRequest == false)
            return false;
        CreateIAMPolicyAssignmentRequest other = (CreateIAMPolicyAssignmentRequest) obj;

        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAssignmentName() == null ^ this.getAssignmentName() == null)
            return false;
        if (other.getAssignmentName() != null
                && other.getAssignmentName().equals(this.getAssignmentName()) == false)
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
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null
                && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }
}
