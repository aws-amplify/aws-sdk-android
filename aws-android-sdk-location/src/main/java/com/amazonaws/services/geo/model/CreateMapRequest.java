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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a map resource in your AWS account, which provides map tiles of
 * different styles sourced from global location data providers.
 * </p>
 * <note>
 * <p>
 * By using Maps, you agree that AWS may transmit your API queries to your
 * selected third party provider for processing, which may be outside the AWS
 * region you are currently using. For more information, see the <a
 * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for Amazon
 * Location Service.
 * </p>
 * </note>
 */
public class CreateMapRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     */
    private MapConfiguration configuration;

    /**
     * <p>
     * An optional description for the map resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * The name for the map resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-),
     * and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique map resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleMap</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String mapName;

    /**
     * <p>
     * Specifies the pricing plan for your map resource. There's three pricing
     * plan options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestBasedUsage</code> — Selects the "Request-Based Usage"
     * pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetTracking</code> — Selects the "Mobile Asset Tracking"
     * pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetManagement</code> — Selects the
     * "Mobile Asset Management" pricing plan.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details and restrictions on each pricing plan option, see
     * the <a href="https://aws.amazon.com/location/pricing/">Amazon Location
     * Service pricing page</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     */
    private String pricingPlan;

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     *
     * @return <p>
     *         Specifies the map style selected from an available data provider.
     *         </p>
     */
    public MapConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     *
     * @param configuration <p>
     *            Specifies the map style selected from an available data
     *            provider.
     *            </p>
     */
    public void setConfiguration(MapConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Specifies the map style selected from an available data provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configuration <p>
     *            Specifies the map style selected from an available data
     *            provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMapRequest withConfiguration(MapConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * <p>
     * An optional description for the map resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         An optional description for the map resource.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * An optional description for the map resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            An optional description for the map resource.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the map resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            An optional description for the map resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMapRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The name for the map resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-),
     * and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique map resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleMap</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The name for the map resource.
     *         </p>
     *         <p>
     *         Requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain only alphanumeric characters (A–Z, a–z, 0–9),
     *         hyphens (-), and underscores (_).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be a unique map resource name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         No spaces allowed. For example, <code>ExampleMap</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getMapName() {
        return mapName;
    }

    /**
     * <p>
     * The name for the map resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-),
     * and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique map resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleMap</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param mapName <p>
     *            The name for the map resource.
     *            </p>
     *            <p>
     *            Requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain only alphanumeric characters (A–Z, a–z, 0–9),
     *            hyphens (-), and underscores (_).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be a unique map resource name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed. For example, <code>ExampleMap</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    /**
     * <p>
     * The name for the map resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-),
     * and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique map resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleMap</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param mapName <p>
     *            The name for the map resource.
     *            </p>
     *            <p>
     *            Requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain only alphanumeric characters (A–Z, a–z, 0–9),
     *            hyphens (-), and underscores (_).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be a unique map resource name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed. For example, <code>ExampleMap</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMapRequest withMapName(String mapName) {
        this.mapName = mapName;
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for your map resource. There's three pricing
     * plan options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestBasedUsage</code> — Selects the "Request-Based Usage"
     * pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetTracking</code> — Selects the "Mobile Asset Tracking"
     * pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetManagement</code> — Selects the
     * "Mobile Asset Management" pricing plan.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details and restrictions on each pricing plan option, see
     * the <a href="https://aws.amazon.com/location/pricing/">Amazon Location
     * Service pricing page</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @return <p>
     *         Specifies the pricing plan for your map resource. There's three
     *         pricing plan options:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RequestBasedUsage</code> — Selects the
     *         "Request-Based Usage" pricing plan.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MobileAssetTracking</code> — Selects the
     *         "Mobile Asset Tracking" pricing plan.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MobileAssetManagement</code> — Selects the
     *         "Mobile Asset Management" pricing plan.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For additional details and restrictions on each pricing plan
     *         option, see the <a
     *         href="https://aws.amazon.com/location/pricing/">Amazon Location
     *         Service pricing page</a>.
     *         </p>
     * @see PricingPlan
     */
    public String getPricingPlan() {
        return pricingPlan;
    }

    /**
     * <p>
     * Specifies the pricing plan for your map resource. There's three pricing
     * plan options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestBasedUsage</code> — Selects the "Request-Based Usage"
     * pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetTracking</code> — Selects the "Mobile Asset Tracking"
     * pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetManagement</code> — Selects the
     * "Mobile Asset Management" pricing plan.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details and restrictions on each pricing plan option, see
     * the <a href="https://aws.amazon.com/location/pricing/">Amazon Location
     * Service pricing page</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            Specifies the pricing plan for your map resource. There's
     *            three pricing plan options:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RequestBasedUsage</code> — Selects the
     *            "Request-Based Usage" pricing plan.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MobileAssetTracking</code> — Selects the
     *            "Mobile Asset Tracking" pricing plan.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MobileAssetManagement</code> — Selects the
     *            "Mobile Asset Management" pricing plan.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For additional details and restrictions on each pricing plan
     *            option, see the <a
     *            href="https://aws.amazon.com/location/pricing/">Amazon
     *            Location Service pricing page</a>.
     *            </p>
     * @see PricingPlan
     */
    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * <p>
     * Specifies the pricing plan for your map resource. There's three pricing
     * plan options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestBasedUsage</code> — Selects the "Request-Based Usage"
     * pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetTracking</code> — Selects the "Mobile Asset Tracking"
     * pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetManagement</code> — Selects the
     * "Mobile Asset Management" pricing plan.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details and restrictions on each pricing plan option, see
     * the <a href="https://aws.amazon.com/location/pricing/">Amazon Location
     * Service pricing page</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            Specifies the pricing plan for your map resource. There's
     *            three pricing plan options:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RequestBasedUsage</code> — Selects the
     *            "Request-Based Usage" pricing plan.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MobileAssetTracking</code> — Selects the
     *            "Mobile Asset Tracking" pricing plan.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MobileAssetManagement</code> — Selects the
     *            "Mobile Asset Management" pricing plan.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For additional details and restrictions on each pricing plan
     *            option, see the <a
     *            href="https://aws.amazon.com/location/pricing/">Amazon
     *            Location Service pricing page</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PricingPlan
     */
    public CreateMapRequest withPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for your map resource. There's three pricing
     * plan options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestBasedUsage</code> — Selects the "Request-Based Usage"
     * pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetTracking</code> — Selects the "Mobile Asset Tracking"
     * pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetManagement</code> — Selects the
     * "Mobile Asset Management" pricing plan.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details and restrictions on each pricing plan option, see
     * the <a href="https://aws.amazon.com/location/pricing/">Amazon Location
     * Service pricing page</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            Specifies the pricing plan for your map resource. There's
     *            three pricing plan options:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RequestBasedUsage</code> — Selects the
     *            "Request-Based Usage" pricing plan.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MobileAssetTracking</code> — Selects the
     *            "Mobile Asset Tracking" pricing plan.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MobileAssetManagement</code> — Selects the
     *            "Mobile Asset Management" pricing plan.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For additional details and restrictions on each pricing plan
     *            option, see the <a
     *            href="https://aws.amazon.com/location/pricing/">Amazon
     *            Location Service pricing page</a>.
     *            </p>
     * @see PricingPlan
     */
    public void setPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
    }

    /**
     * <p>
     * Specifies the pricing plan for your map resource. There's three pricing
     * plan options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestBasedUsage</code> — Selects the "Request-Based Usage"
     * pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetTracking</code> — Selects the "Mobile Asset Tracking"
     * pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetManagement</code> — Selects the
     * "Mobile Asset Management" pricing plan.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details and restrictions on each pricing plan option, see
     * the <a href="https://aws.amazon.com/location/pricing/">Amazon Location
     * Service pricing page</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            Specifies the pricing plan for your map resource. There's
     *            three pricing plan options:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RequestBasedUsage</code> — Selects the
     *            "Request-Based Usage" pricing plan.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MobileAssetTracking</code> — Selects the
     *            "Mobile Asset Tracking" pricing plan.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MobileAssetManagement</code> — Selects the
     *            "Mobile Asset Management" pricing plan.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For additional details and restrictions on each pricing plan
     *            option, see the <a
     *            href="https://aws.amazon.com/location/pricing/">Amazon
     *            Location Service pricing page</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PricingPlan
     */
    public CreateMapRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
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
        if (getConfiguration() != null)
            sb.append("Configuration: " + getConfiguration() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getMapName() != null)
            sb.append("MapName: " + getMapName() + ",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: " + getPricingPlan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMapName() == null) ? 0 : getMapName().hashCode());
        hashCode = prime * hashCode
                + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMapRequest == false)
            return false;
        CreateMapRequest other = (CreateMapRequest) obj;

        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null
                && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMapName() == null ^ this.getMapName() == null)
            return false;
        if (other.getMapName() != null && other.getMapName().equals(this.getMapName()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null
                && other.getPricingPlan().equals(this.getPricingPlan()) == false)
            return false;
        return true;
    }
}
