/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates a geofence collection, which manages and stores geofences.
 * </p>
 */
public class CreateGeofenceCollectionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A custom name for the geofence collection.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0-9), hyphens (-), and
     * underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique geofence collection name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleGeofenceCollection</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String collectionName;

    /**
     * <p>
     * An optional description for the geofence collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * Specifies the pricing plan for your geofence collection. There's three
     * pricing plan options:
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
     * A custom name for the geofence collection.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0-9), hyphens (-), and
     * underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique geofence collection name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleGeofenceCollection</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         A custom name for the geofence collection.
     *         </p>
     *         <p>
     *         Requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only alphanumeric characters (A–Z, a–z, 0-9), hyphens
     *         (-), and underscores (_).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be a unique geofence collection name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         No spaces allowed. For example,
     *         <code>ExampleGeofenceCollection</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * <p>
     * A custom name for the geofence collection.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0-9), hyphens (-), and
     * underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique geofence collection name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleGeofenceCollection</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param collectionName <p>
     *            A custom name for the geofence collection.
     *            </p>
     *            <p>
     *            Requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Contain only alphanumeric characters (A–Z, a–z, 0-9), hyphens
     *            (-), and underscores (_).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be a unique geofence collection name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed. For example,
     *            <code>ExampleGeofenceCollection</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * A custom name for the geofence collection.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0-9), hyphens (-), and
     * underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique geofence collection name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleGeofenceCollection</code>.
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
     * @param collectionName <p>
     *            A custom name for the geofence collection.
     *            </p>
     *            <p>
     *            Requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Contain only alphanumeric characters (A–Z, a–z, 0-9), hyphens
     *            (-), and underscores (_).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be a unique geofence collection name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed. For example,
     *            <code>ExampleGeofenceCollection</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGeofenceCollectionRequest withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    /**
     * <p>
     * An optional description for the geofence collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         An optional description for the geofence collection.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * An optional description for the geofence collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            An optional description for the geofence collection.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the geofence collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            An optional description for the geofence collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGeofenceCollectionRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for your geofence collection. There's three
     * pricing plan options:
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
     *         Specifies the pricing plan for your geofence collection. There's
     *         three pricing plan options:
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
     * Specifies the pricing plan for your geofence collection. There's three
     * pricing plan options:
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
     *            Specifies the pricing plan for your geofence collection.
     *            There's three pricing plan options:
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
     * Specifies the pricing plan for your geofence collection. There's three
     * pricing plan options:
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
     *            Specifies the pricing plan for your geofence collection.
     *            There's three pricing plan options:
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
    public CreateGeofenceCollectionRequest withPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for your geofence collection. There's three
     * pricing plan options:
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
     *            Specifies the pricing plan for your geofence collection.
     *            There's three pricing plan options:
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
     * Specifies the pricing plan for your geofence collection. There's three
     * pricing plan options:
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
     *            Specifies the pricing plan for your geofence collection.
     *            There's three pricing plan options:
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
    public CreateGeofenceCollectionRequest withPricingPlan(PricingPlan pricingPlan) {
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
        if (getCollectionName() != null)
            sb.append("CollectionName: " + getCollectionName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
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
                + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
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

        if (obj instanceof CreateGeofenceCollectionRequest == false)
            return false;
        CreateGeofenceCollectionRequest other = (CreateGeofenceCollectionRequest) obj;

        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null
                && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null
                && other.getPricingPlan().equals(this.getPricingPlan()) == false)
            return false;
        return true;
    }
}
