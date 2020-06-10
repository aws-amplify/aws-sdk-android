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
 * Summary information about a lifecycle policy.
 * </p>
 */
public class LifecyclePolicySummary implements Serializable {
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
     * The tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

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
    public LifecyclePolicySummary withPolicyId(String policyId) {
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
    public LifecyclePolicySummary withDescription(String description) {
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
    public LifecyclePolicySummary withState(String state) {
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
    public LifecyclePolicySummary withState(GettablePolicyStateValues state) {
        this.state = state.toString();
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
    public LifecyclePolicySummary withTags(java.util.Map<String, String> tags) {
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
    public LifecyclePolicySummary addTagsEntry(String key, String value) {
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
    public LifecyclePolicySummary clearTagsEntries() {
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
        if (getPolicyId() != null)
            sb.append("PolicyId: " + getPolicyId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicySummary == false)
            return false;
        LifecyclePolicySummary other = (LifecyclePolicySummary) obj;

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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
