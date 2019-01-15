/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the autoscaling settings for a global table or global secondary
 * index.
 * </p>
 */
public class AutoScalingSettingsDescription implements Serializable {
    /**
     * <p>
     * The minimum capacity units that a global table or global secondary index
     * should be scaled down to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long minimumUnits;

    /**
     * <p>
     * The maximum capacity units that a global table or global secondary index
     * should be scaled up to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long maximumUnits;

    /**
     * <p>
     * Disabled autoscaling for this global table or global secondary index.
     * </p>
     */
    private Boolean autoScalingDisabled;

    /**
     * <p>
     * Role ARN used for configuring autoScaling policy.
     * </p>
     */
    private String autoScalingRoleArn;

    /**
     * <p>
     * Information about the scaling policies.
     * </p>
     */
    private java.util.List<AutoScalingPolicyDescription> scalingPolicies;

    /**
     * <p>
     * The minimum capacity units that a global table or global secondary index
     * should be scaled down to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The minimum capacity units that a global table or global
     *         secondary index should be scaled down to.
     *         </p>
     */
    public Long getMinimumUnits() {
        return minimumUnits;
    }

    /**
     * <p>
     * The minimum capacity units that a global table or global secondary index
     * should be scaled down to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param minimumUnits <p>
     *            The minimum capacity units that a global table or global
     *            secondary index should be scaled down to.
     *            </p>
     */
    public void setMinimumUnits(Long minimumUnits) {
        this.minimumUnits = minimumUnits;
    }

    /**
     * <p>
     * The minimum capacity units that a global table or global secondary index
     * should be scaled down to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param minimumUnits <p>
     *            The minimum capacity units that a global table or global
     *            secondary index should be scaled down to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingSettingsDescription withMinimumUnits(Long minimumUnits) {
        this.minimumUnits = minimumUnits;
        return this;
    }

    /**
     * <p>
     * The maximum capacity units that a global table or global secondary index
     * should be scaled up to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum capacity units that a global table or global
     *         secondary index should be scaled up to.
     *         </p>
     */
    public Long getMaximumUnits() {
        return maximumUnits;
    }

    /**
     * <p>
     * The maximum capacity units that a global table or global secondary index
     * should be scaled up to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maximumUnits <p>
     *            The maximum capacity units that a global table or global
     *            secondary index should be scaled up to.
     *            </p>
     */
    public void setMaximumUnits(Long maximumUnits) {
        this.maximumUnits = maximumUnits;
    }

    /**
     * <p>
     * The maximum capacity units that a global table or global secondary index
     * should be scaled up to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maximumUnits <p>
     *            The maximum capacity units that a global table or global
     *            secondary index should be scaled up to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingSettingsDescription withMaximumUnits(Long maximumUnits) {
        this.maximumUnits = maximumUnits;
        return this;
    }

    /**
     * <p>
     * Disabled autoscaling for this global table or global secondary index.
     * </p>
     *
     * @return <p>
     *         Disabled autoscaling for this global table or global secondary
     *         index.
     *         </p>
     */
    public Boolean isAutoScalingDisabled() {
        return autoScalingDisabled;
    }

    /**
     * <p>
     * Disabled autoscaling for this global table or global secondary index.
     * </p>
     *
     * @return <p>
     *         Disabled autoscaling for this global table or global secondary
     *         index.
     *         </p>
     */
    public Boolean getAutoScalingDisabled() {
        return autoScalingDisabled;
    }

    /**
     * <p>
     * Disabled autoscaling for this global table or global secondary index.
     * </p>
     *
     * @param autoScalingDisabled <p>
     *            Disabled autoscaling for this global table or global secondary
     *            index.
     *            </p>
     */
    public void setAutoScalingDisabled(Boolean autoScalingDisabled) {
        this.autoScalingDisabled = autoScalingDisabled;
    }

    /**
     * <p>
     * Disabled autoscaling for this global table or global secondary index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingDisabled <p>
     *            Disabled autoscaling for this global table or global secondary
     *            index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingSettingsDescription withAutoScalingDisabled(Boolean autoScalingDisabled) {
        this.autoScalingDisabled = autoScalingDisabled;
        return this;
    }

    /**
     * <p>
     * Role ARN used for configuring autoScaling policy.
     * </p>
     *
     * @return <p>
     *         Role ARN used for configuring autoScaling policy.
     *         </p>
     */
    public String getAutoScalingRoleArn() {
        return autoScalingRoleArn;
    }

    /**
     * <p>
     * Role ARN used for configuring autoScaling policy.
     * </p>
     *
     * @param autoScalingRoleArn <p>
     *            Role ARN used for configuring autoScaling policy.
     *            </p>
     */
    public void setAutoScalingRoleArn(String autoScalingRoleArn) {
        this.autoScalingRoleArn = autoScalingRoleArn;
    }

    /**
     * <p>
     * Role ARN used for configuring autoScaling policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingRoleArn <p>
     *            Role ARN used for configuring autoScaling policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingSettingsDescription withAutoScalingRoleArn(String autoScalingRoleArn) {
        this.autoScalingRoleArn = autoScalingRoleArn;
        return this;
    }

    /**
     * <p>
     * Information about the scaling policies.
     * </p>
     *
     * @return <p>
     *         Information about the scaling policies.
     *         </p>
     */
    public java.util.List<AutoScalingPolicyDescription> getScalingPolicies() {
        return scalingPolicies;
    }

    /**
     * <p>
     * Information about the scaling policies.
     * </p>
     *
     * @param scalingPolicies <p>
     *            Information about the scaling policies.
     *            </p>
     */
    public void setScalingPolicies(
            java.util.Collection<AutoScalingPolicyDescription> scalingPolicies) {
        if (scalingPolicies == null) {
            this.scalingPolicies = null;
            return;
        }

        this.scalingPolicies = new java.util.ArrayList<AutoScalingPolicyDescription>(
                scalingPolicies);
    }

    /**
     * <p>
     * Information about the scaling policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scalingPolicies <p>
     *            Information about the scaling policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingSettingsDescription withScalingPolicies(
            AutoScalingPolicyDescription... scalingPolicies) {
        if (getScalingPolicies() == null) {
            this.scalingPolicies = new java.util.ArrayList<AutoScalingPolicyDescription>(
                    scalingPolicies.length);
        }
        for (AutoScalingPolicyDescription value : scalingPolicies) {
            this.scalingPolicies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the scaling policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scalingPolicies <p>
     *            Information about the scaling policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingSettingsDescription withScalingPolicies(
            java.util.Collection<AutoScalingPolicyDescription> scalingPolicies) {
        setScalingPolicies(scalingPolicies);
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
        if (getMinimumUnits() != null)
            sb.append("MinimumUnits: " + getMinimumUnits() + ",");
        if (getMaximumUnits() != null)
            sb.append("MaximumUnits: " + getMaximumUnits() + ",");
        if (getAutoScalingDisabled() != null)
            sb.append("AutoScalingDisabled: " + getAutoScalingDisabled() + ",");
        if (getAutoScalingRoleArn() != null)
            sb.append("AutoScalingRoleArn: " + getAutoScalingRoleArn() + ",");
        if (getScalingPolicies() != null)
            sb.append("ScalingPolicies: " + getScalingPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMinimumUnits() == null) ? 0 : getMinimumUnits().hashCode());
        hashCode = prime * hashCode
                + ((getMaximumUnits() == null) ? 0 : getMaximumUnits().hashCode());
        hashCode = prime * hashCode
                + ((getAutoScalingDisabled() == null) ? 0 : getAutoScalingDisabled().hashCode());
        hashCode = prime * hashCode
                + ((getAutoScalingRoleArn() == null) ? 0 : getAutoScalingRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getScalingPolicies() == null) ? 0 : getScalingPolicies().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingSettingsDescription == false)
            return false;
        AutoScalingSettingsDescription other = (AutoScalingSettingsDescription) obj;

        if (other.getMinimumUnits() == null ^ this.getMinimumUnits() == null)
            return false;
        if (other.getMinimumUnits() != null
                && other.getMinimumUnits().equals(this.getMinimumUnits()) == false)
            return false;
        if (other.getMaximumUnits() == null ^ this.getMaximumUnits() == null)
            return false;
        if (other.getMaximumUnits() != null
                && other.getMaximumUnits().equals(this.getMaximumUnits()) == false)
            return false;
        if (other.getAutoScalingDisabled() == null ^ this.getAutoScalingDisabled() == null)
            return false;
        if (other.getAutoScalingDisabled() != null
                && other.getAutoScalingDisabled().equals(this.getAutoScalingDisabled()) == false)
            return false;
        if (other.getAutoScalingRoleArn() == null ^ this.getAutoScalingRoleArn() == null)
            return false;
        if (other.getAutoScalingRoleArn() != null
                && other.getAutoScalingRoleArn().equals(this.getAutoScalingRoleArn()) == false)
            return false;
        if (other.getScalingPolicies() == null ^ this.getScalingPolicies() == null)
            return false;
        if (other.getScalingPolicies() != null
                && other.getScalingPolicies().equals(this.getScalingPolicies()) == false)
            return false;
        return true;
    }
}
