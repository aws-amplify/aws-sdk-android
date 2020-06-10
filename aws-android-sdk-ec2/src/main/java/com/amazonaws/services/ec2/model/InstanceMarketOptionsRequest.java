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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the market (purchasing) option for the instances.
 * </p>
 */
public class InstanceMarketOptionsRequest implements Serializable {
    /**
     * <p>
     * The market type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot
     */
    private String marketType;

    /**
     * <p>
     * The options for Spot Instances.
     * </p>
     */
    private SpotMarketOptions spotOptions;

    /**
     * <p>
     * The market type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot
     *
     * @return <p>
     *         The market type.
     *         </p>
     * @see MarketType
     */
    public String getMarketType() {
        return marketType;
    }

    /**
     * <p>
     * The market type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot
     *
     * @param marketType <p>
     *            The market type.
     *            </p>
     * @see MarketType
     */
    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    /**
     * <p>
     * The market type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot
     *
     * @param marketType <p>
     *            The market type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MarketType
     */
    public InstanceMarketOptionsRequest withMarketType(String marketType) {
        this.marketType = marketType;
        return this;
    }

    /**
     * <p>
     * The market type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot
     *
     * @param marketType <p>
     *            The market type.
     *            </p>
     * @see MarketType
     */
    public void setMarketType(MarketType marketType) {
        this.marketType = marketType.toString();
    }

    /**
     * <p>
     * The market type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot
     *
     * @param marketType <p>
     *            The market type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MarketType
     */
    public InstanceMarketOptionsRequest withMarketType(MarketType marketType) {
        this.marketType = marketType.toString();
        return this;
    }

    /**
     * <p>
     * The options for Spot Instances.
     * </p>
     *
     * @return <p>
     *         The options for Spot Instances.
     *         </p>
     */
    public SpotMarketOptions getSpotOptions() {
        return spotOptions;
    }

    /**
     * <p>
     * The options for Spot Instances.
     * </p>
     *
     * @param spotOptions <p>
     *            The options for Spot Instances.
     *            </p>
     */
    public void setSpotOptions(SpotMarketOptions spotOptions) {
        this.spotOptions = spotOptions;
    }

    /**
     * <p>
     * The options for Spot Instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotOptions <p>
     *            The options for Spot Instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceMarketOptionsRequest withSpotOptions(SpotMarketOptions spotOptions) {
        this.spotOptions = spotOptions;
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
        if (getMarketType() != null)
            sb.append("MarketType: " + getMarketType() + ",");
        if (getSpotOptions() != null)
            sb.append("SpotOptions: " + getSpotOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarketType() == null) ? 0 : getMarketType().hashCode());
        hashCode = prime * hashCode
                + ((getSpotOptions() == null) ? 0 : getSpotOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceMarketOptionsRequest == false)
            return false;
        InstanceMarketOptionsRequest other = (InstanceMarketOptionsRequest) obj;

        if (other.getMarketType() == null ^ this.getMarketType() == null)
            return false;
        if (other.getMarketType() != null
                && other.getMarketType().equals(this.getMarketType()) == false)
            return false;
        if (other.getSpotOptions() == null ^ this.getSpotOptions() == null)
            return false;
        if (other.getSpotOptions() != null
                && other.getSpotOptions().equals(this.getSpotOptions()) == false)
            return false;
        return true;
    }
}
