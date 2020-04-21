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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Enables you to customize recommendations across two attributes. You can
 * choose to view recommendations for instances within the same instance
 * families or across different instance families. You can also choose to view
 * your estimated savings associated with recommendations with consideration of
 * existing Savings Plans or RI benefits, or niether.
 * </p>
 */
public class RightsizingRecommendationConfiguration implements Serializable {
    /**
     * <p>
     * The option to see recommendations within the same instance family, or
     * recommendations for instances across other families. The default value is
     * <code>SAME_INSTANCE_FAMILY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAME_INSTANCE_FAMILY, CROSS_INSTANCE_FAMILY
     */
    private String recommendationTarget;

    /**
     * <p>
     * The option to consider RI or Savings Plans discount benefits in your
     * savings calculation. The default value is <code>TRUE</code>.
     * </p>
     */
    private Boolean benefitsConsidered;

    /**
     * <p>
     * The option to see recommendations within the same instance family, or
     * recommendations for instances across other families. The default value is
     * <code>SAME_INSTANCE_FAMILY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAME_INSTANCE_FAMILY, CROSS_INSTANCE_FAMILY
     *
     * @return <p>
     *         The option to see recommendations within the same instance
     *         family, or recommendations for instances across other families.
     *         The default value is <code>SAME_INSTANCE_FAMILY</code>.
     *         </p>
     * @see RecommendationTarget
     */
    public String getRecommendationTarget() {
        return recommendationTarget;
    }

    /**
     * <p>
     * The option to see recommendations within the same instance family, or
     * recommendations for instances across other families. The default value is
     * <code>SAME_INSTANCE_FAMILY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAME_INSTANCE_FAMILY, CROSS_INSTANCE_FAMILY
     *
     * @param recommendationTarget <p>
     *            The option to see recommendations within the same instance
     *            family, or recommendations for instances across other
     *            families. The default value is
     *            <code>SAME_INSTANCE_FAMILY</code>.
     *            </p>
     * @see RecommendationTarget
     */
    public void setRecommendationTarget(String recommendationTarget) {
        this.recommendationTarget = recommendationTarget;
    }

    /**
     * <p>
     * The option to see recommendations within the same instance family, or
     * recommendations for instances across other families. The default value is
     * <code>SAME_INSTANCE_FAMILY</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAME_INSTANCE_FAMILY, CROSS_INSTANCE_FAMILY
     *
     * @param recommendationTarget <p>
     *            The option to see recommendations within the same instance
     *            family, or recommendations for instances across other
     *            families. The default value is
     *            <code>SAME_INSTANCE_FAMILY</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecommendationTarget
     */
    public RightsizingRecommendationConfiguration withRecommendationTarget(
            String recommendationTarget) {
        this.recommendationTarget = recommendationTarget;
        return this;
    }

    /**
     * <p>
     * The option to see recommendations within the same instance family, or
     * recommendations for instances across other families. The default value is
     * <code>SAME_INSTANCE_FAMILY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAME_INSTANCE_FAMILY, CROSS_INSTANCE_FAMILY
     *
     * @param recommendationTarget <p>
     *            The option to see recommendations within the same instance
     *            family, or recommendations for instances across other
     *            families. The default value is
     *            <code>SAME_INSTANCE_FAMILY</code>.
     *            </p>
     * @see RecommendationTarget
     */
    public void setRecommendationTarget(RecommendationTarget recommendationTarget) {
        this.recommendationTarget = recommendationTarget.toString();
    }

    /**
     * <p>
     * The option to see recommendations within the same instance family, or
     * recommendations for instances across other families. The default value is
     * <code>SAME_INSTANCE_FAMILY</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAME_INSTANCE_FAMILY, CROSS_INSTANCE_FAMILY
     *
     * @param recommendationTarget <p>
     *            The option to see recommendations within the same instance
     *            family, or recommendations for instances across other
     *            families. The default value is
     *            <code>SAME_INSTANCE_FAMILY</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecommendationTarget
     */
    public RightsizingRecommendationConfiguration withRecommendationTarget(
            RecommendationTarget recommendationTarget) {
        this.recommendationTarget = recommendationTarget.toString();
        return this;
    }

    /**
     * <p>
     * The option to consider RI or Savings Plans discount benefits in your
     * savings calculation. The default value is <code>TRUE</code>.
     * </p>
     *
     * @return <p>
     *         The option to consider RI or Savings Plans discount benefits in
     *         your savings calculation. The default value is <code>TRUE</code>.
     *         </p>
     */
    public Boolean isBenefitsConsidered() {
        return benefitsConsidered;
    }

    /**
     * <p>
     * The option to consider RI or Savings Plans discount benefits in your
     * savings calculation. The default value is <code>TRUE</code>.
     * </p>
     *
     * @return <p>
     *         The option to consider RI or Savings Plans discount benefits in
     *         your savings calculation. The default value is <code>TRUE</code>.
     *         </p>
     */
    public Boolean getBenefitsConsidered() {
        return benefitsConsidered;
    }

    /**
     * <p>
     * The option to consider RI or Savings Plans discount benefits in your
     * savings calculation. The default value is <code>TRUE</code>.
     * </p>
     *
     * @param benefitsConsidered <p>
     *            The option to consider RI or Savings Plans discount benefits
     *            in your savings calculation. The default value is
     *            <code>TRUE</code>.
     *            </p>
     */
    public void setBenefitsConsidered(Boolean benefitsConsidered) {
        this.benefitsConsidered = benefitsConsidered;
    }

    /**
     * <p>
     * The option to consider RI or Savings Plans discount benefits in your
     * savings calculation. The default value is <code>TRUE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param benefitsConsidered <p>
     *            The option to consider RI or Savings Plans discount benefits
     *            in your savings calculation. The default value is
     *            <code>TRUE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RightsizingRecommendationConfiguration withBenefitsConsidered(Boolean benefitsConsidered) {
        this.benefitsConsidered = benefitsConsidered;
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
        if (getRecommendationTarget() != null)
            sb.append("RecommendationTarget: " + getRecommendationTarget() + ",");
        if (getBenefitsConsidered() != null)
            sb.append("BenefitsConsidered: " + getBenefitsConsidered());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRecommendationTarget() == null) ? 0 : getRecommendationTarget().hashCode());
        hashCode = prime * hashCode
                + ((getBenefitsConsidered() == null) ? 0 : getBenefitsConsidered().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RightsizingRecommendationConfiguration == false)
            return false;
        RightsizingRecommendationConfiguration other = (RightsizingRecommendationConfiguration) obj;

        if (other.getRecommendationTarget() == null ^ this.getRecommendationTarget() == null)
            return false;
        if (other.getRecommendationTarget() != null
                && other.getRecommendationTarget().equals(this.getRecommendationTarget()) == false)
            return false;
        if (other.getBenefitsConsidered() == null ^ this.getBenefitsConsidered() == null)
            return false;
        if (other.getBenefitsConsidered() != null
                && other.getBenefitsConsidered().equals(this.getBenefitsConsidered()) == false)
            return false;
        return true;
    }
}
