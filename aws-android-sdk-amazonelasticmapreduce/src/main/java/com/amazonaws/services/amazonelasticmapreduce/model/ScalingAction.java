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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The type of adjustment the automatic scaling activity makes when triggered,
 * and the periodicity of the adjustment.
 * </p>
 */
public class ScalingAction implements Serializable {
    /**
     * <p>
     * Not available for instance groups. Instance groups use the market type
     * specified for the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     */
    private String market;

    /**
     * <p>
     * The type of adjustment the automatic scaling activity makes when
     * triggered, and the periodicity of the adjustment.
     * </p>
     */
    private SimpleScalingPolicyConfiguration simpleScalingPolicyConfiguration;

    /**
     * <p>
     * Not available for instance groups. Instance groups use the market type
     * specified for the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @return <p>
     *         Not available for instance groups. Instance groups use the market
     *         type specified for the group.
     *         </p>
     * @see MarketType
     */
    public String getMarket() {
        return market;
    }

    /**
     * <p>
     * Not available for instance groups. Instance groups use the market type
     * specified for the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market <p>
     *            Not available for instance groups. Instance groups use the
     *            market type specified for the group.
     *            </p>
     * @see MarketType
     */
    public void setMarket(String market) {
        this.market = market;
    }

    /**
     * <p>
     * Not available for instance groups. Instance groups use the market type
     * specified for the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market <p>
     *            Not available for instance groups. Instance groups use the
     *            market type specified for the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MarketType
     */
    public ScalingAction withMarket(String market) {
        this.market = market;
        return this;
    }

    /**
     * <p>
     * Not available for instance groups. Instance groups use the market type
     * specified for the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market <p>
     *            Not available for instance groups. Instance groups use the
     *            market type specified for the group.
     *            </p>
     * @see MarketType
     */
    public void setMarket(MarketType market) {
        this.market = market.toString();
    }

    /**
     * <p>
     * Not available for instance groups. Instance groups use the market type
     * specified for the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, SPOT
     *
     * @param market <p>
     *            Not available for instance groups. Instance groups use the
     *            market type specified for the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MarketType
     */
    public ScalingAction withMarket(MarketType market) {
        this.market = market.toString();
        return this;
    }

    /**
     * <p>
     * The type of adjustment the automatic scaling activity makes when
     * triggered, and the periodicity of the adjustment.
     * </p>
     *
     * @return <p>
     *         The type of adjustment the automatic scaling activity makes when
     *         triggered, and the periodicity of the adjustment.
     *         </p>
     */
    public SimpleScalingPolicyConfiguration getSimpleScalingPolicyConfiguration() {
        return simpleScalingPolicyConfiguration;
    }

    /**
     * <p>
     * The type of adjustment the automatic scaling activity makes when
     * triggered, and the periodicity of the adjustment.
     * </p>
     *
     * @param simpleScalingPolicyConfiguration <p>
     *            The type of adjustment the automatic scaling activity makes
     *            when triggered, and the periodicity of the adjustment.
     *            </p>
     */
    public void setSimpleScalingPolicyConfiguration(
            SimpleScalingPolicyConfiguration simpleScalingPolicyConfiguration) {
        this.simpleScalingPolicyConfiguration = simpleScalingPolicyConfiguration;
    }

    /**
     * <p>
     * The type of adjustment the automatic scaling activity makes when
     * triggered, and the periodicity of the adjustment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param simpleScalingPolicyConfiguration <p>
     *            The type of adjustment the automatic scaling activity makes
     *            when triggered, and the periodicity of the adjustment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingAction withSimpleScalingPolicyConfiguration(
            SimpleScalingPolicyConfiguration simpleScalingPolicyConfiguration) {
        this.simpleScalingPolicyConfiguration = simpleScalingPolicyConfiguration;
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
        if (getMarket() != null)
            sb.append("Market: " + getMarket() + ",");
        if (getSimpleScalingPolicyConfiguration() != null)
            sb.append("SimpleScalingPolicyConfiguration: " + getSimpleScalingPolicyConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarket() == null) ? 0 : getMarket().hashCode());
        hashCode = prime
                * hashCode
                + ((getSimpleScalingPolicyConfiguration() == null) ? 0
                        : getSimpleScalingPolicyConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingAction == false)
            return false;
        ScalingAction other = (ScalingAction) obj;

        if (other.getMarket() == null ^ this.getMarket() == null)
            return false;
        if (other.getMarket() != null && other.getMarket().equals(this.getMarket()) == false)
            return false;
        if (other.getSimpleScalingPolicyConfiguration() == null
                ^ this.getSimpleScalingPolicyConfiguration() == null)
            return false;
        if (other.getSimpleScalingPolicyConfiguration() != null
                && other.getSimpleScalingPolicyConfiguration().equals(
                        this.getSimpleScalingPolicyConfiguration()) == false)
            return false;
        return true;
    }
}
