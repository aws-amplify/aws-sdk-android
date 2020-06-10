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
 * Gets summary information about all or the specified data lifecycle policies.
 * </p>
 * <p>
 * To get complete information about a policy, use <a>GetLifecyclePolicy</a>.
 * </p>
 */
public class GetLifecyclePoliciesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifiers of the data lifecycle policies.
     * </p>
     */
    private java.util.List<String> policyIds;

    /**
     * <p>
     * The activation state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, ERROR
     */
    private String state;

    /**
     * <p>
     * The resource type.
     * </p>
     */
    private java.util.List<String> resourceTypes;

    /**
     * <p>
     * The target tag for a policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     */
    private java.util.List<String> targetTags;

    /**
     * <p>
     * The tags to add to objects created by the policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     * <p>
     * These user-defined tags are added in addition to the AWS-added lifecycle
     * tags.
     * </p>
     */
    private java.util.List<String> tagsToAdd;

    /**
     * <p>
     * The identifiers of the data lifecycle policies.
     * </p>
     *
     * @return <p>
     *         The identifiers of the data lifecycle policies.
     *         </p>
     */
    public java.util.List<String> getPolicyIds() {
        return policyIds;
    }

    /**
     * <p>
     * The identifiers of the data lifecycle policies.
     * </p>
     *
     * @param policyIds <p>
     *            The identifiers of the data lifecycle policies.
     *            </p>
     */
    public void setPolicyIds(java.util.Collection<String> policyIds) {
        if (policyIds == null) {
            this.policyIds = null;
            return;
        }

        this.policyIds = new java.util.ArrayList<String>(policyIds);
    }

    /**
     * <p>
     * The identifiers of the data lifecycle policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyIds <p>
     *            The identifiers of the data lifecycle policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLifecyclePoliciesRequest withPolicyIds(String... policyIds) {
        if (getPolicyIds() == null) {
            this.policyIds = new java.util.ArrayList<String>(policyIds.length);
        }
        for (String value : policyIds) {
            this.policyIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the data lifecycle policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyIds <p>
     *            The identifiers of the data lifecycle policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLifecyclePoliciesRequest withPolicyIds(java.util.Collection<String> policyIds) {
        setPolicyIds(policyIds);
        return this;
    }

    /**
     * <p>
     * The activation state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, ERROR
     *
     * @return <p>
     *         The activation state.
     *         </p>
     * @see GettablePolicyStateValues
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The activation state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, ERROR
     *
     * @param state <p>
     *            The activation state.
     *            </p>
     * @see GettablePolicyStateValues
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The activation state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, ERROR
     *
     * @param state <p>
     *            The activation state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GettablePolicyStateValues
     */
    public GetLifecyclePoliciesRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The activation state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, ERROR
     *
     * @param state <p>
     *            The activation state.
     *            </p>
     * @see GettablePolicyStateValues
     */
    public void setState(GettablePolicyStateValues state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The activation state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, ERROR
     *
     * @param state <p>
     *            The activation state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GettablePolicyStateValues
     */
    public GetLifecyclePoliciesRequest withState(GettablePolicyStateValues state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     *
     * @return <p>
     *         The resource type.
     *         </p>
     */
    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     *
     * @param resourceTypes <p>
     *            The resource type.
     *            </p>
     */
    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<String>(resourceTypes);
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypes <p>
     *            The resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLifecyclePoliciesRequest withResourceTypes(String... resourceTypes) {
        if (getResourceTypes() == null) {
            this.resourceTypes = new java.util.ArrayList<String>(resourceTypes.length);
        }
        for (String value : resourceTypes) {
            this.resourceTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypes <p>
     *            The resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLifecyclePoliciesRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The target tag for a policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     *
     * @return <p>
     *         The target tag for a policy.
     *         </p>
     *         <p>
     *         Tags are strings in the format <code>key=value</code>.
     *         </p>
     */
    public java.util.List<String> getTargetTags() {
        return targetTags;
    }

    /**
     * <p>
     * The target tag for a policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     *
     * @param targetTags <p>
     *            The target tag for a policy.
     *            </p>
     *            <p>
     *            Tags are strings in the format <code>key=value</code>.
     *            </p>
     */
    public void setTargetTags(java.util.Collection<String> targetTags) {
        if (targetTags == null) {
            this.targetTags = null;
            return;
        }

        this.targetTags = new java.util.ArrayList<String>(targetTags);
    }

    /**
     * <p>
     * The target tag for a policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetTags <p>
     *            The target tag for a policy.
     *            </p>
     *            <p>
     *            Tags are strings in the format <code>key=value</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLifecyclePoliciesRequest withTargetTags(String... targetTags) {
        if (getTargetTags() == null) {
            this.targetTags = new java.util.ArrayList<String>(targetTags.length);
        }
        for (String value : targetTags) {
            this.targetTags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The target tag for a policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetTags <p>
     *            The target tag for a policy.
     *            </p>
     *            <p>
     *            Tags are strings in the format <code>key=value</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLifecyclePoliciesRequest withTargetTags(java.util.Collection<String> targetTags) {
        setTargetTags(targetTags);
        return this;
    }

    /**
     * <p>
     * The tags to add to objects created by the policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     * <p>
     * These user-defined tags are added in addition to the AWS-added lifecycle
     * tags.
     * </p>
     *
     * @return <p>
     *         The tags to add to objects created by the policy.
     *         </p>
     *         <p>
     *         Tags are strings in the format <code>key=value</code>.
     *         </p>
     *         <p>
     *         These user-defined tags are added in addition to the AWS-added
     *         lifecycle tags.
     *         </p>
     */
    public java.util.List<String> getTagsToAdd() {
        return tagsToAdd;
    }

    /**
     * <p>
     * The tags to add to objects created by the policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     * <p>
     * These user-defined tags are added in addition to the AWS-added lifecycle
     * tags.
     * </p>
     *
     * @param tagsToAdd <p>
     *            The tags to add to objects created by the policy.
     *            </p>
     *            <p>
     *            Tags are strings in the format <code>key=value</code>.
     *            </p>
     *            <p>
     *            These user-defined tags are added in addition to the AWS-added
     *            lifecycle tags.
     *            </p>
     */
    public void setTagsToAdd(java.util.Collection<String> tagsToAdd) {
        if (tagsToAdd == null) {
            this.tagsToAdd = null;
            return;
        }

        this.tagsToAdd = new java.util.ArrayList<String>(tagsToAdd);
    }

    /**
     * <p>
     * The tags to add to objects created by the policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     * <p>
     * These user-defined tags are added in addition to the AWS-added lifecycle
     * tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagsToAdd <p>
     *            The tags to add to objects created by the policy.
     *            </p>
     *            <p>
     *            Tags are strings in the format <code>key=value</code>.
     *            </p>
     *            <p>
     *            These user-defined tags are added in addition to the AWS-added
     *            lifecycle tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLifecyclePoliciesRequest withTagsToAdd(String... tagsToAdd) {
        if (getTagsToAdd() == null) {
            this.tagsToAdd = new java.util.ArrayList<String>(tagsToAdd.length);
        }
        for (String value : tagsToAdd) {
            this.tagsToAdd.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to add to objects created by the policy.
     * </p>
     * <p>
     * Tags are strings in the format <code>key=value</code>.
     * </p>
     * <p>
     * These user-defined tags are added in addition to the AWS-added lifecycle
     * tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagsToAdd <p>
     *            The tags to add to objects created by the policy.
     *            </p>
     *            <p>
     *            Tags are strings in the format <code>key=value</code>.
     *            </p>
     *            <p>
     *            These user-defined tags are added in addition to the AWS-added
     *            lifecycle tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLifecyclePoliciesRequest withTagsToAdd(java.util.Collection<String> tagsToAdd) {
        setTagsToAdd(tagsToAdd);
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
        if (getPolicyIds() != null)
            sb.append("PolicyIds: " + getPolicyIds() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: " + getResourceTypes() + ",");
        if (getTargetTags() != null)
            sb.append("TargetTags: " + getTargetTags() + ",");
        if (getTagsToAdd() != null)
            sb.append("TagsToAdd: " + getTagsToAdd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyIds() == null) ? 0 : getPolicyIds().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getTargetTags() == null) ? 0 : getTargetTags().hashCode());
        hashCode = prime * hashCode + ((getTagsToAdd() == null) ? 0 : getTagsToAdd().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLifecyclePoliciesRequest == false)
            return false;
        GetLifecyclePoliciesRequest other = (GetLifecyclePoliciesRequest) obj;

        if (other.getPolicyIds() == null ^ this.getPolicyIds() == null)
            return false;
        if (other.getPolicyIds() != null
                && other.getPolicyIds().equals(this.getPolicyIds()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null
                && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getTargetTags() == null ^ this.getTargetTags() == null)
            return false;
        if (other.getTargetTags() != null
                && other.getTargetTags().equals(this.getTargetTags()) == false)
            return false;
        if (other.getTagsToAdd() == null ^ this.getTagsToAdd() == null)
            return false;
        if (other.getTagsToAdd() != null
                && other.getTagsToAdd().equals(this.getTagsToAdd()) == false)
            return false;
        return true;
    }
}
