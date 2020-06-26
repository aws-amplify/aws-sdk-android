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

/**
 * <p>
 * An IAM policy assignment.
 * </p>
 */
public class IAMPolicyAssignment implements Serializable {
    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String awsAccountId;

    /**
     * <p>
     * Assignment ID.
     * </p>
     */
    private String assignmentId;

    /**
     * <p>
     * Assignment name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     */
    private String assignmentName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM policy.
     * </p>
     */
    private String policyArn;

    /**
     * <p>
     * Identities.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> identities;

    /**
     * <p>
     * Assignment status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DRAFT, DISABLED
     */
    private String assignmentStatus;

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The AWS account ID.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The AWS account ID.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
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
     *            The AWS account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IAMPolicyAssignment withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * Assignment ID.
     * </p>
     *
     * @return <p>
     *         Assignment ID.
     *         </p>
     */
    public String getAssignmentId() {
        return assignmentId;
    }

    /**
     * <p>
     * Assignment ID.
     * </p>
     *
     * @param assignmentId <p>
     *            Assignment ID.
     *            </p>
     */
    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    /**
     * <p>
     * Assignment ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assignmentId <p>
     *            Assignment ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IAMPolicyAssignment withAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
        return this;
    }

    /**
     * <p>
     * Assignment name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     *
     * @return <p>
     *         Assignment name.
     *         </p>
     */
    public String getAssignmentName() {
        return assignmentName;
    }

    /**
     * <p>
     * Assignment name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>(?=^.{2,256}$)(?!.*\s)[0-9a-zA-Z-_.:=+@]*$<br/>
     *
     * @param assignmentName <p>
     *            Assignment name.
     *            </p>
     */
    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    /**
     * <p>
     * Assignment name.
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
     *            Assignment name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IAMPolicyAssignment withAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM policy.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the IAM policy.
     *         </p>
     */
    public String getPolicyArn() {
        return policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM policy.
     * </p>
     *
     * @param policyArn <p>
     *            The Amazon Resource Name (ARN) for the IAM policy.
     *            </p>
     */
    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyArn <p>
     *            The Amazon Resource Name (ARN) for the IAM policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IAMPolicyAssignment withPolicyArn(String policyArn) {
        this.policyArn = policyArn;
        return this;
    }

    /**
     * <p>
     * Identities.
     * </p>
     *
     * @return <p>
     *         Identities.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getIdentities() {
        return identities;
    }

    /**
     * <p>
     * Identities.
     * </p>
     *
     * @param identities <p>
     *            Identities.
     *            </p>
     */
    public void setIdentities(java.util.Map<String, java.util.List<String>> identities) {
        this.identities = identities;
    }

    /**
     * <p>
     * Identities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identities <p>
     *            Identities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IAMPolicyAssignment withIdentities(
            java.util.Map<String, java.util.List<String>> identities) {
        this.identities = identities;
        return this;
    }

    /**
     * <p>
     * Identities.
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
    public IAMPolicyAssignment addIdentitiesEntry(String key, java.util.List<String> value) {
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
    public IAMPolicyAssignment clearIdentitiesEntries() {
        this.identities = null;
        return this;
    }

    /**
     * <p>
     * Assignment status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DRAFT, DISABLED
     *
     * @return <p>
     *         Assignment status.
     *         </p>
     * @see AssignmentStatus
     */
    public String getAssignmentStatus() {
        return assignmentStatus;
    }

    /**
     * <p>
     * Assignment status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DRAFT, DISABLED
     *
     * @param assignmentStatus <p>
     *            Assignment status.
     *            </p>
     * @see AssignmentStatus
     */
    public void setAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    /**
     * <p>
     * Assignment status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DRAFT, DISABLED
     *
     * @param assignmentStatus <p>
     *            Assignment status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssignmentStatus
     */
    public IAMPolicyAssignment withAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
        return this;
    }

    /**
     * <p>
     * Assignment status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DRAFT, DISABLED
     *
     * @param assignmentStatus <p>
     *            Assignment status.
     *            </p>
     * @see AssignmentStatus
     */
    public void setAssignmentStatus(AssignmentStatus assignmentStatus) {
        this.assignmentStatus = assignmentStatus.toString();
    }

    /**
     * <p>
     * Assignment status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DRAFT, DISABLED
     *
     * @param assignmentStatus <p>
     *            Assignment status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssignmentStatus
     */
    public IAMPolicyAssignment withAssignmentStatus(AssignmentStatus assignmentStatus) {
        this.assignmentStatus = assignmentStatus.toString();
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
        if (getAssignmentId() != null)
            sb.append("AssignmentId: " + getAssignmentId() + ",");
        if (getAssignmentName() != null)
            sb.append("AssignmentName: " + getAssignmentName() + ",");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: " + getPolicyArn() + ",");
        if (getIdentities() != null)
            sb.append("Identities: " + getIdentities() + ",");
        if (getAssignmentStatus() != null)
            sb.append("AssignmentStatus: " + getAssignmentStatus());
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
                + ((getAssignmentId() == null) ? 0 : getAssignmentId().hashCode());
        hashCode = prime * hashCode
                + ((getAssignmentName() == null) ? 0 : getAssignmentName().hashCode());
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getIdentities() == null) ? 0 : getIdentities().hashCode());
        hashCode = prime * hashCode
                + ((getAssignmentStatus() == null) ? 0 : getAssignmentStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IAMPolicyAssignment == false)
            return false;
        IAMPolicyAssignment other = (IAMPolicyAssignment) obj;

        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAssignmentId() == null ^ this.getAssignmentId() == null)
            return false;
        if (other.getAssignmentId() != null
                && other.getAssignmentId().equals(this.getAssignmentId()) == false)
            return false;
        if (other.getAssignmentName() == null ^ this.getAssignmentName() == null)
            return false;
        if (other.getAssignmentName() != null
                && other.getAssignmentName().equals(this.getAssignmentName()) == false)
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
        if (other.getAssignmentStatus() == null ^ this.getAssignmentStatus() == null)
            return false;
        if (other.getAssignmentStatus() != null
                && other.getAssignmentStatus().equals(this.getAssignmentStatus()) == false)
            return false;
        return true;
    }
}
