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

package com.amazonaws.services.dlm.model;

import java.io.Serializable;

/**
 * <p>
 * Detailed information about a lifecycle policy.
 * </p>
 */
public class LifecyclePolicy implements Serializable {
    /**
     * <p>
     * The identifier of the lifecycle policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     * <b>Pattern: </b>policy-[A-Za-z0-9]+<br/>
     */
    private String policyId;

    /**
     * <p>
     * The description of the lifecycle policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[0-9A-Za-z _-]+<br/>
     */
    private String description;

    /**
     * <p>
     * The activation state of the lifecycle policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, ERROR
     */
    private String state;

    /**
     * <p>
     * The description of the status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[\p{all}]*<br/>
     */
    private String statusMessage;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations
     * specified by the lifecycle policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[a-z]{1,3}){0,2}:iam::\d+:role/.*<br/>
     */
    private String executionRoleArn;

    /**
     * <p>
     * The local date and time when the lifecycle policy was created.
     * </p>
     */
    private java.util.Date dateCreated;

    /**
     * <p>
     * The local date and time when the lifecycle policy was last modified.
     * </p>
     */
    private java.util.Date dateModified;

    /**
     * <p>
     * The configuration of the lifecycle policy
     * </p>
     */
    private PolicyDetails policyDetails;

    /**
     * <p>
     * The tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^arn:aws(-[a-z]{1,3}){0,2}:dlm:[A-Za-z0-
     * 9_/.-]{0,63}:\d+:policy/[0-9A-Za-z_-]{1,128}$<br/>
     */
    private String policyArn;

    /**
     * <p>
     * The identifier of the lifecycle policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     * <b>Pattern: </b>policy-[A-Za-z0-9]+<br/>
     *
     * @return <p>
     *         The identifier of the lifecycle policy.
     *         </p>
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * <p>
     * The identifier of the lifecycle policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     * <b>Pattern: </b>policy-[A-Za-z0-9]+<br/>
     *
     * @param policyId <p>
     *            The identifier of the lifecycle policy.
     *            </p>
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The identifier of the lifecycle policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     * <b>Pattern: </b>policy-[A-Za-z0-9]+<br/>
     *
     * @param policyId <p>
     *            The identifier of the lifecycle policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecyclePolicy withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * <p>
     * The description of the lifecycle policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[0-9A-Za-z _-]+<br/>
     *
     * @return <p>
     *         The description of the lifecycle policy.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the lifecycle policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[0-9A-Za-z _-]+<br/>
     *
     * @param description <p>
     *            The description of the lifecycle policy.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the lifecycle policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[0-9A-Za-z _-]+<br/>
     *
     * @param description <p>
     *            The description of the lifecycle policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecyclePolicy withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The activation state of the lifecycle policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, ERROR
     *
     * @return <p>
     *         The activation state of the lifecycle policy.
     *         </p>
     * @see GettablePolicyStateValues
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The activation state of the lifecycle policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, ERROR
     *
     * @param state <p>
     *            The activation state of the lifecycle policy.
     *            </p>
     * @see GettablePolicyStateValues
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The activation state of the lifecycle policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, ERROR
     *
     * @param state <p>
     *            The activation state of the lifecycle policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GettablePolicyStateValues
     */
    public LifecyclePolicy withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The activation state of the lifecycle policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, ERROR
     *
     * @param state <p>
     *            The activation state of the lifecycle policy.
     *            </p>
     * @see GettablePolicyStateValues
     */
    public void setState(GettablePolicyStateValues state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The activation state of the lifecycle policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, ERROR
     *
     * @param state <p>
     *            The activation state of the lifecycle policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GettablePolicyStateValues
     */
    public LifecyclePolicy withState(GettablePolicyStateValues state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The description of the status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[\p{all}]*<br/>
     *
     * @return <p>
     *         The description of the status.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * The description of the status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[\p{all}]*<br/>
     *
     * @param statusMessage <p>
     *            The description of the status.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The description of the status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[\p{all}]*<br/>
     *
     * @param statusMessage <p>
     *            The description of the status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecyclePolicy withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations
     * specified by the lifecycle policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[a-z]{1,3}){0,2}:iam::\d+:role/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role used to run the
     *         operations specified by the lifecycle policy.
     *         </p>
     */
    public String getExecutionRoleArn() {
        return executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations
     * specified by the lifecycle policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[a-z]{1,3}){0,2}:iam::\d+:role/.*<br/>
     *
     * @param executionRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role used to run the
     *            operations specified by the lifecycle policy.
     *            </p>
     */
    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations
     * specified by the lifecycle policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[a-z]{1,3}){0,2}:iam::\d+:role/.*<br/>
     *
     * @param executionRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role used to run the
     *            operations specified by the lifecycle policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecyclePolicy withExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }

    /**
     * <p>
     * The local date and time when the lifecycle policy was created.
     * </p>
     *
     * @return <p>
     *         The local date and time when the lifecycle policy was created.
     *         </p>
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /**
     * <p>
     * The local date and time when the lifecycle policy was created.
     * </p>
     *
     * @param dateCreated <p>
     *            The local date and time when the lifecycle policy was created.
     *            </p>
     */
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The local date and time when the lifecycle policy was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateCreated <p>
     *            The local date and time when the lifecycle policy was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecyclePolicy withDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * <p>
     * The local date and time when the lifecycle policy was last modified.
     * </p>
     *
     * @return <p>
     *         The local date and time when the lifecycle policy was last
     *         modified.
     *         </p>
     */
    public java.util.Date getDateModified() {
        return dateModified;
    }

    /**
     * <p>
     * The local date and time when the lifecycle policy was last modified.
     * </p>
     *
     * @param dateModified <p>
     *            The local date and time when the lifecycle policy was last
     *            modified.
     *            </p>
     */
    public void setDateModified(java.util.Date dateModified) {
        this.dateModified = dateModified;
    }

    /**
     * <p>
     * The local date and time when the lifecycle policy was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateModified <p>
     *            The local date and time when the lifecycle policy was last
     *            modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecyclePolicy withDateModified(java.util.Date dateModified) {
        this.dateModified = dateModified;
        return this;
    }

    /**
     * <p>
     * The configuration of the lifecycle policy
     * </p>
     *
     * @return <p>
     *         The configuration of the lifecycle policy
     *         </p>
     */
    public PolicyDetails getPolicyDetails() {
        return policyDetails;
    }

    /**
     * <p>
     * The configuration of the lifecycle policy
     * </p>
     *
     * @param policyDetails <p>
     *            The configuration of the lifecycle policy
     *            </p>
     */
    public void setPolicyDetails(PolicyDetails policyDetails) {
        this.policyDetails = policyDetails;
    }

    /**
     * <p>
     * The configuration of the lifecycle policy
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyDetails <p>
     *            The configuration of the lifecycle policy
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecyclePolicy withPolicyDetails(PolicyDetails policyDetails) {
        this.policyDetails = policyDetails;
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     *
     * @return <p>
     *         The tags.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     *
     * @param tags <p>
     *            The tags.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecyclePolicy withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecyclePolicy addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public LifecyclePolicy clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^arn:aws(-[a-z]{1,3}){0,2}:dlm:[A-Za-z0-
     * 9_/.-]{0,63}:\d+:policy/[0-9A-Za-z_-]{1,128}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the policy.
     *         </p>
     */
    public String getPolicyArn() {
        return policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^arn:aws(-[a-z]{1,3}){0,2}:dlm:[A-Za-z0-
     * 9_/.-]{0,63}:\d+:policy/[0-9A-Za-z_-]{1,128}$<br/>
     *
     * @param policyArn <p>
     *            The Amazon Resource Name (ARN) of the policy.
     *            </p>
     */
    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^arn:aws(-[a-z]{1,3}){0,2}:dlm:[A-Za-z0-
     * 9_/.-]{0,63}:\d+:policy/[0-9A-Za-z_-]{1,128}$<br/>
     *
     * @param policyArn <p>
     *            The Amazon Resource Name (ARN) of the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecyclePolicy withPolicyArn(String policyArn) {
        this.policyArn = policyArn;
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
        if (getPolicyId() != null)
            sb.append("PolicyId: " + getPolicyId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: " + getExecutionRoleArn() + ",");
        if (getDateCreated() != null)
            sb.append("DateCreated: " + getDateCreated() + ",");
        if (getDateModified() != null)
            sb.append("DateModified: " + getDateModified() + ",");
        if (getPolicyDetails() != null)
            sb.append("PolicyDetails: " + getPolicyDetails() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: " + getPolicyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode
                + ((getDateModified() == null) ? 0 : getDateModified().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyDetails() == null) ? 0 : getPolicyDetails().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicy == false)
            return false;
        LifecyclePolicy other = (LifecyclePolicy) obj;

        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null
                && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null
                && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateModified() == null ^ this.getDateModified() == null)
            return false;
        if (other.getDateModified() != null
                && other.getDateModified().equals(this.getDateModified()) == false)
            return false;
        if (other.getPolicyDetails() == null ^ this.getPolicyDetails() == null)
            return false;
        if (other.getPolicyDetails() != null
                && other.getPolicyDetails().equals(this.getPolicyDetails()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null
                && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        return true;
    }
}
