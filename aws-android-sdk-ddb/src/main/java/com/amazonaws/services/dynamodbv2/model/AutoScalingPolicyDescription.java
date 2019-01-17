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
 * Represents the properties of the scaling policy.
 * </p>
 */
public class AutoScalingPolicyDescription implements Serializable {
    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>\p{Print}+<br/>
     */
    private String policyName;

    /**
     * <p>
     * Represents a target tracking scaling policy configuration.
     * </p>
     */
    private AutoScalingTargetTrackingScalingPolicyConfigurationDescription targetTrackingScalingPolicyConfiguration;

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>\p{Print}+<br/>
     *
     * @return <p>
     *         The name of the scaling policy.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>\p{Print}+<br/>
     *
     * @param policyName <p>
     *            The name of the scaling policy.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>\p{Print}+<br/>
     *
     * @param policyName <p>
     *            The name of the scaling policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingPolicyDescription withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * Represents a target tracking scaling policy configuration.
     * </p>
     *
     * @return <p>
     *         Represents a target tracking scaling policy configuration.
     *         </p>
     */
    public AutoScalingTargetTrackingScalingPolicyConfigurationDescription getTargetTrackingScalingPolicyConfiguration() {
        return targetTrackingScalingPolicyConfiguration;
    }

    /**
     * <p>
     * Represents a target tracking scaling policy configuration.
     * </p>
     *
     * @param targetTrackingScalingPolicyConfiguration <p>
     *            Represents a target tracking scaling policy configuration.
     *            </p>
     */
    public void setTargetTrackingScalingPolicyConfiguration(
            AutoScalingTargetTrackingScalingPolicyConfigurationDescription targetTrackingScalingPolicyConfiguration) {
        this.targetTrackingScalingPolicyConfiguration = targetTrackingScalingPolicyConfiguration;
    }

    /**
     * <p>
     * Represents a target tracking scaling policy configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetTrackingScalingPolicyConfiguration <p>
     *            Represents a target tracking scaling policy configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingPolicyDescription withTargetTrackingScalingPolicyConfiguration(
            AutoScalingTargetTrackingScalingPolicyConfigurationDescription targetTrackingScalingPolicyConfiguration) {
        this.targetTrackingScalingPolicyConfiguration = targetTrackingScalingPolicyConfiguration;
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
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getTargetTrackingScalingPolicyConfiguration() != null)
            sb.append("TargetTrackingScalingPolicyConfiguration: "
                    + getTargetTrackingScalingPolicyConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetTrackingScalingPolicyConfiguration() == null) ? 0
                        : getTargetTrackingScalingPolicyConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingPolicyDescription == false)
            return false;
        AutoScalingPolicyDescription other = (AutoScalingPolicyDescription) obj;

        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getTargetTrackingScalingPolicyConfiguration() == null
                ^ this.getTargetTrackingScalingPolicyConfiguration() == null)
            return false;
        if (other.getTargetTrackingScalingPolicyConfiguration() != null
                && other.getTargetTrackingScalingPolicyConfiguration().equals(
                        this.getTargetTrackingScalingPolicyConfiguration()) == false)
            return false;
        return true;
    }
}
