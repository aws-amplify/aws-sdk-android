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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a policy to manage the lifecycle of the specified AWS resources. You
 * can create up to 100 lifecycle policies.
 * </p>
 */
public class CreateLifecyclePolicyRequest extends AmazonWebServiceRequest implements Serializable {
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
     * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$
     * are supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[0-9A-Za-z _-]+<br/>
     */
    private String description;

    /**
     * <p>
     * The desired activation state of the lifecycle policy after creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String state;

    /**
     * <p>
     * The configuration details of the lifecycle policy.
     * </p>
     */
    private PolicyDetails policyDetails;

    /**
     * <p>
     * The tags to apply to the lifecycle policy during creation.
     * </p>
     */
    private java.util.Map<String, String> tags;

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
    public CreateLifecyclePolicyRequest withExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }

    /**
     * <p>
     * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$
     * are supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[0-9A-Za-z _-]+<br/>
     *
     * @return <p>
     *         A description of the lifecycle policy. The characters ^[0-9A-Za-z
     *         _-]+$ are supported.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$
     * are supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[0-9A-Za-z _-]+<br/>
     *
     * @param description <p>
     *            A description of the lifecycle policy. The characters
     *            ^[0-9A-Za-z _-]+$ are supported.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$
     * are supported.
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
     *            A description of the lifecycle policy. The characters
     *            ^[0-9A-Za-z _-]+$ are supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLifecyclePolicyRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The desired activation state of the lifecycle policy after creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         The desired activation state of the lifecycle policy after
     *         creation.
     *         </p>
     * @see SettablePolicyStateValues
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The desired activation state of the lifecycle policy after creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The desired activation state of the lifecycle policy after
     *            creation.
     *            </p>
     * @see SettablePolicyStateValues
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The desired activation state of the lifecycle policy after creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The desired activation state of the lifecycle policy after
     *            creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SettablePolicyStateValues
     */
    public CreateLifecyclePolicyRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The desired activation state of the lifecycle policy after creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The desired activation state of the lifecycle policy after
     *            creation.
     *            </p>
     * @see SettablePolicyStateValues
     */
    public void setState(SettablePolicyStateValues state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The desired activation state of the lifecycle policy after creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The desired activation state of the lifecycle policy after
     *            creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SettablePolicyStateValues
     */
    public CreateLifecyclePolicyRequest withState(SettablePolicyStateValues state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The configuration details of the lifecycle policy.
     * </p>
     *
     * @return <p>
     *         The configuration details of the lifecycle policy.
     *         </p>
     */
    public PolicyDetails getPolicyDetails() {
        return policyDetails;
    }

    /**
     * <p>
     * The configuration details of the lifecycle policy.
     * </p>
     *
     * @param policyDetails <p>
     *            The configuration details of the lifecycle policy.
     *            </p>
     */
    public void setPolicyDetails(PolicyDetails policyDetails) {
        this.policyDetails = policyDetails;
    }

    /**
     * <p>
     * The configuration details of the lifecycle policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyDetails <p>
     *            The configuration details of the lifecycle policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLifecyclePolicyRequest withPolicyDetails(PolicyDetails policyDetails) {
        this.policyDetails = policyDetails;
        return this;
    }

    /**
     * <p>
     * The tags to apply to the lifecycle policy during creation.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the lifecycle policy during creation.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to apply to the lifecycle policy during creation.
     * </p>
     *
     * @param tags <p>
     *            The tags to apply to the lifecycle policy during creation.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to apply to the lifecycle policy during creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to apply to the lifecycle policy during creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLifecyclePolicyRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags to apply to the lifecycle policy during creation.
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
    public CreateLifecyclePolicyRequest addTagsEntry(String key, String value) {
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
    public CreateLifecyclePolicyRequest clearTagsEntries() {
        this.tags = null;
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
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: " + getExecutionRoleArn() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getPolicyDetails() != null)
            sb.append("PolicyDetails: " + getPolicyDetails() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyDetails() == null) ? 0 : getPolicyDetails().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLifecyclePolicyRequest == false)
            return false;
        CreateLifecyclePolicyRequest other = (CreateLifecyclePolicyRequest) obj;

        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null
                && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
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
        if (other.getPolicyDetails() == null ^ this.getPolicyDetails() == null)
            return false;
        if (other.getPolicyDetails() != null
                && other.getPolicyDetails().equals(this.getPolicyDetails()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
