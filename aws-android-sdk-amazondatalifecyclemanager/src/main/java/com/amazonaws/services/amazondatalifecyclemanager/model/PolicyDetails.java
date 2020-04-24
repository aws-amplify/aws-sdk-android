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

/**
 * <p>
 * Specifies the configuration of a lifecycle policy.
 * </p>
 */
public class PolicyDetails implements Serializable {
    /**
     * <p>
     * The valid target resource types and actions a policy can manage. The
     * default is EBS_SNAPSHOT_MANAGEMENT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EBS_SNAPSHOT_MANAGEMENT
     */
    private String policyType;

    /**
     * <p>
     * The resource type.
     * </p>
     */
    private java.util.List<String> resourceTypes;

    /**
     * <p>
     * The single tag that identifies targeted resources for this policy.
     * </p>
     */
    private java.util.List<Tag> targetTags;

    /**
     * <p>
     * The schedule of policy-defined actions.
     * </p>
     */
    private java.util.List<Schedule> schedules;

    /**
     * <p>
     * A set of optional parameters for the policy.
     * </p>
     */
    private Parameters parameters;

    /**
     * <p>
     * The valid target resource types and actions a policy can manage. The
     * default is EBS_SNAPSHOT_MANAGEMENT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EBS_SNAPSHOT_MANAGEMENT
     *
     * @return <p>
     *         The valid target resource types and actions a policy can manage.
     *         The default is EBS_SNAPSHOT_MANAGEMENT.
     *         </p>
     * @see PolicyTypeValues
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * <p>
     * The valid target resource types and actions a policy can manage. The
     * default is EBS_SNAPSHOT_MANAGEMENT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EBS_SNAPSHOT_MANAGEMENT
     *
     * @param policyType <p>
     *            The valid target resource types and actions a policy can
     *            manage. The default is EBS_SNAPSHOT_MANAGEMENT.
     *            </p>
     * @see PolicyTypeValues
     */
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The valid target resource types and actions a policy can manage. The
     * default is EBS_SNAPSHOT_MANAGEMENT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EBS_SNAPSHOT_MANAGEMENT
     *
     * @param policyType <p>
     *            The valid target resource types and actions a policy can
     *            manage. The default is EBS_SNAPSHOT_MANAGEMENT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyTypeValues
     */
    public PolicyDetails withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * <p>
     * The valid target resource types and actions a policy can manage. The
     * default is EBS_SNAPSHOT_MANAGEMENT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EBS_SNAPSHOT_MANAGEMENT
     *
     * @param policyType <p>
     *            The valid target resource types and actions a policy can
     *            manage. The default is EBS_SNAPSHOT_MANAGEMENT.
     *            </p>
     * @see PolicyTypeValues
     */
    public void setPolicyType(PolicyTypeValues policyType) {
        this.policyType = policyType.toString();
    }

    /**
     * <p>
     * The valid target resource types and actions a policy can manage. The
     * default is EBS_SNAPSHOT_MANAGEMENT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EBS_SNAPSHOT_MANAGEMENT
     *
     * @param policyType <p>
     *            The valid target resource types and actions a policy can
     *            manage. The default is EBS_SNAPSHOT_MANAGEMENT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyTypeValues
     */
    public PolicyDetails withPolicyType(PolicyTypeValues policyType) {
        this.policyType = policyType.toString();
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
    public PolicyDetails withResourceTypes(String... resourceTypes) {
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
    public PolicyDetails withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The single tag that identifies targeted resources for this policy.
     * </p>
     *
     * @return <p>
     *         The single tag that identifies targeted resources for this
     *         policy.
     *         </p>
     */
    public java.util.List<Tag> getTargetTags() {
        return targetTags;
    }

    /**
     * <p>
     * The single tag that identifies targeted resources for this policy.
     * </p>
     *
     * @param targetTags <p>
     *            The single tag that identifies targeted resources for this
     *            policy.
     *            </p>
     */
    public void setTargetTags(java.util.Collection<Tag> targetTags) {
        if (targetTags == null) {
            this.targetTags = null;
            return;
        }

        this.targetTags = new java.util.ArrayList<Tag>(targetTags);
    }

    /**
     * <p>
     * The single tag that identifies targeted resources for this policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetTags <p>
     *            The single tag that identifies targeted resources for this
     *            policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyDetails withTargetTags(Tag... targetTags) {
        if (getTargetTags() == null) {
            this.targetTags = new java.util.ArrayList<Tag>(targetTags.length);
        }
        for (Tag value : targetTags) {
            this.targetTags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The single tag that identifies targeted resources for this policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetTags <p>
     *            The single tag that identifies targeted resources for this
     *            policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyDetails withTargetTags(java.util.Collection<Tag> targetTags) {
        setTargetTags(targetTags);
        return this;
    }

    /**
     * <p>
     * The schedule of policy-defined actions.
     * </p>
     *
     * @return <p>
     *         The schedule of policy-defined actions.
     *         </p>
     */
    public java.util.List<Schedule> getSchedules() {
        return schedules;
    }

    /**
     * <p>
     * The schedule of policy-defined actions.
     * </p>
     *
     * @param schedules <p>
     *            The schedule of policy-defined actions.
     *            </p>
     */
    public void setSchedules(java.util.Collection<Schedule> schedules) {
        if (schedules == null) {
            this.schedules = null;
            return;
        }

        this.schedules = new java.util.ArrayList<Schedule>(schedules);
    }

    /**
     * <p>
     * The schedule of policy-defined actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedules <p>
     *            The schedule of policy-defined actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyDetails withSchedules(Schedule... schedules) {
        if (getSchedules() == null) {
            this.schedules = new java.util.ArrayList<Schedule>(schedules.length);
        }
        for (Schedule value : schedules) {
            this.schedules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The schedule of policy-defined actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedules <p>
     *            The schedule of policy-defined actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyDetails withSchedules(java.util.Collection<Schedule> schedules) {
        setSchedules(schedules);
        return this;
    }

    /**
     * <p>
     * A set of optional parameters for the policy.
     * </p>
     *
     * @return <p>
     *         A set of optional parameters for the policy.
     *         </p>
     */
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A set of optional parameters for the policy.
     * </p>
     *
     * @param parameters <p>
     *            A set of optional parameters for the policy.
     *            </p>
     */
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A set of optional parameters for the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A set of optional parameters for the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyDetails withParameters(Parameters parameters) {
        this.parameters = parameters;
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
        if (getPolicyType() != null)
            sb.append("PolicyType: " + getPolicyType() + ",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: " + getResourceTypes() + ",");
        if (getTargetTags() != null)
            sb.append("TargetTags: " + getTargetTags() + ",");
        if (getSchedules() != null)
            sb.append("Schedules: " + getSchedules() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode
                + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getTargetTags() == null) ? 0 : getTargetTags().hashCode());
        hashCode = prime * hashCode + ((getSchedules() == null) ? 0 : getSchedules().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyDetails == false)
            return false;
        PolicyDetails other = (PolicyDetails) obj;

        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null
                && other.getPolicyType().equals(this.getPolicyType()) == false)
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
        if (other.getSchedules() == null ^ this.getSchedules() == null)
            return false;
        if (other.getSchedules() != null
                && other.getSchedules().equals(this.getSchedules()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }
}
