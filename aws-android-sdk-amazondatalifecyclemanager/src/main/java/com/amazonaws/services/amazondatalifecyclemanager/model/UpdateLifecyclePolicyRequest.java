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

package com.amazonaws.services.amazondatalifecyclemanager.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the specified lifecycle policy.
 * </p>
 */
public class UpdateLifecyclePolicyRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The desired activation state of the lifecycle policy after creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String state;

    /**
     * <p>
     * A description of the lifecycle policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[0-9A-Za-z _-]+<br/>
     */
    private String description;

    /**
     * <p>
     * The configuration of the lifecycle policy. You cannot update the policy
     * type or the resource type.
     * </p>
     */
    private PolicyDetails policyDetails;

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
    public UpdateLifecyclePolicyRequest withPolicyId(String policyId) {
        this.policyId = policyId;
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
    public UpdateLifecyclePolicyRequest withExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
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
    public UpdateLifecyclePolicyRequest withState(String state) {
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
    public UpdateLifecyclePolicyRequest withState(SettablePolicyStateValues state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A description of the lifecycle policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[0-9A-Za-z _-]+<br/>
     *
     * @return <p>
     *         A description of the lifecycle policy.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the lifecycle policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[0-9A-Za-z _-]+<br/>
     *
     * @param description <p>
     *            A description of the lifecycle policy.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the lifecycle policy.
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
     *            A description of the lifecycle policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateLifecyclePolicyRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The configuration of the lifecycle policy. You cannot update the policy
     * type or the resource type.
     * </p>
     *
     * @return <p>
     *         The configuration of the lifecycle policy. You cannot update the
     *         policy type or the resource type.
     *         </p>
     */
    public PolicyDetails getPolicyDetails() {
        return policyDetails;
    }

    /**
     * <p>
     * The configuration of the lifecycle policy. You cannot update the policy
     * type or the resource type.
     * </p>
     *
     * @param policyDetails <p>
     *            The configuration of the lifecycle policy. You cannot update
     *            the policy type or the resource type.
     *            </p>
     */
    public void setPolicyDetails(PolicyDetails policyDetails) {
        this.policyDetails = policyDetails;
    }

    /**
     * <p>
     * The configuration of the lifecycle policy. You cannot update the policy
     * type or the resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyDetails <p>
     *            The configuration of the lifecycle policy. You cannot update
     *            the policy type or the resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateLifecyclePolicyRequest withPolicyDetails(PolicyDetails policyDetails) {
        this.policyDetails = policyDetails;
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
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: " + getExecutionRoleArn() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getPolicyDetails() != null)
            sb.append("PolicyDetails: " + getPolicyDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyDetails() == null) ? 0 : getPolicyDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLifecyclePolicyRequest == false)
            return false;
        UpdateLifecyclePolicyRequest other = (UpdateLifecyclePolicyRequest) obj;

        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null
                && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPolicyDetails() == null ^ this.getPolicyDetails() == null)
            return false;
        if (other.getPolicyDetails() != null
                && other.getPolicyDetails().equals(this.getPolicyDetails()) == false)
            return false;
        return true;
    }
}
