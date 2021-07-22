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
 * Updates the specified properties of a given geofence collection.
 * </p>
 */
public class UpdateGeofenceCollectionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the geofence collection to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String collectionName;

    /**
     * <p>
     * Updates the description for the geofence collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * Updates the pricing plan for the geofence collection.
     * </p>
     * <p>
     * For more information about each pricing plan option restrictions, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service
     * pricing</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     */
    private String pricingPlan;

    /**
     * <p>
     * Updates the data provider for the geofence collection.
     * </p>
     * <p>
     * A required value for the following pricing plans:
     * <code>MobileAssetTracking</code>| <code>MobileAssetManagement</code>
     * </p>
     * <p>
     * For more information about <a
     * href="https://aws.amazon.com/location/data-providers/">data providers</a>
     * and <a href="https://aws.amazon.com/location/pricing/">pricing plans</a>,
     * see the Amazon Location Service product page.
     * </p>
     * <note>
     * <p>
     * This can only be updated when updating the <code>PricingPlan</code> in
     * the same request.
     * </p>
     * <p>
     * Amazon Location Service uses <code>PricingPlanDataSource</code> to
     * calculate billing for your geofence collection. Your data won't be shared
     * with the data provider, and will remain in your AWS account and Region
     * unless you move it.
     * </p>
     * </note>
     */
    private String pricingPlanDataSource;

    /**
     * <p>
     * The name of the geofence collection to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The name of the geofence collection to update.
     *         </p>
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * <p>
     * The name of the geofence collection to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param collectionName <p>
     *            The name of the geofence collection to update.
     *            </p>
     */
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The name of the geofence collection to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param collectionName <p>
     *            The name of the geofence collection to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGeofenceCollectionRequest withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    /**
     * <p>
     * Updates the description for the geofence collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         Updates the description for the geofence collection.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Updates the description for the geofence collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            Updates the description for the geofence collection.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Updates the description for the geofence collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            Updates the description for the geofence collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGeofenceCollectionRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Updates the pricing plan for the geofence collection.
     * </p>
     * <p>
     * For more information about each pricing plan option restrictions, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service
     * pricing</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @return <p>
     *         Updates the pricing plan for the geofence collection.
     *         </p>
     *         <p>
     *         For more information about each pricing plan option restrictions,
     *         see <a href="https://aws.amazon.com/location/pricing/">Amazon
     *         Location Service pricing</a>.
     *         </p>
     * @see PricingPlan
     */
    public String getPricingPlan() {
        return pricingPlan;
    }

    /**
     * <p>
     * Updates the pricing plan for the geofence collection.
     * </p>
     * <p>
     * For more information about each pricing plan option restrictions, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service
     * pricing</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            Updates the pricing plan for the geofence collection.
     *            </p>
     *            <p>
     *            For more information about each pricing plan option
     *            restrictions, see <a
     *            href="https://aws.amazon.com/location/pricing/">Amazon
     *            Location Service pricing</a>.
     *            </p>
     * @see PricingPlan
     */
    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * <p>
     * Updates the pricing plan for the geofence collection.
     * </p>
     * <p>
     * For more information about each pricing plan option restrictions, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service
     * pricing</a>.
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
     *            Updates the pricing plan for the geofence collection.
     *            </p>
     *            <p>
     *            For more information about each pricing plan option
     *            restrictions, see <a
     *            href="https://aws.amazon.com/location/pricing/">Amazon
     *            Location Service pricing</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PricingPlan
     */
    public UpdateGeofenceCollectionRequest withPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
        return this;
    }

    /**
     * <p>
     * Updates the pricing plan for the geofence collection.
     * </p>
     * <p>
     * For more information about each pricing plan option restrictions, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service
     * pricing</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            Updates the pricing plan for the geofence collection.
     *            </p>
     *            <p>
     *            For more information about each pricing plan option
     *            restrictions, see <a
     *            href="https://aws.amazon.com/location/pricing/">Amazon
     *            Location Service pricing</a>.
     *            </p>
     * @see PricingPlan
     */
    public void setPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
    }

    /**
     * <p>
     * Updates the pricing plan for the geofence collection.
     * </p>
     * <p>
     * For more information about each pricing plan option restrictions, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service
     * pricing</a>.
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
     *            Updates the pricing plan for the geofence collection.
     *            </p>
     *            <p>
     *            For more information about each pricing plan option
     *            restrictions, see <a
     *            href="https://aws.amazon.com/location/pricing/">Amazon
     *            Location Service pricing</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PricingPlan
     */
    public UpdateGeofenceCollectionRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * Updates the data provider for the geofence collection.
     * </p>
     * <p>
     * A required value for the following pricing plans:
     * <code>MobileAssetTracking</code>| <code>MobileAssetManagement</code>
     * </p>
     * <p>
     * For more information about <a
     * href="https://aws.amazon.com/location/data-providers/">data providers</a>
     * and <a href="https://aws.amazon.com/location/pricing/">pricing plans</a>,
     * see the Amazon Location Service product page.
     * </p>
     * <note>
     * <p>
     * This can only be updated when updating the <code>PricingPlan</code> in
     * the same request.
     * </p>
     * <p>
     * Amazon Location Service uses <code>PricingPlanDataSource</code> to
     * calculate billing for your geofence collection. Your data won't be shared
     * with the data provider, and will remain in your AWS account and Region
     * unless you move it.
     * </p>
     * </note>
     *
     * @return <p>
     *         Updates the data provider for the geofence collection.
     *         </p>
     *         <p>
     *         A required value for the following pricing plans:
     *         <code>MobileAssetTracking</code>|
     *         <code>MobileAssetManagement</code>
     *         </p>
     *         <p>
     *         For more information about <a
     *         href="https://aws.amazon.com/location/data-providers/">data
     *         providers</a> and <a
     *         href="https://aws.amazon.com/location/pricing/">pricing
     *         plans</a>, see the Amazon Location Service product page.
     *         </p>
     *         <note>
     *         <p>
     *         This can only be updated when updating the
     *         <code>PricingPlan</code> in the same request.
     *         </p>
     *         <p>
     *         Amazon Location Service uses <code>PricingPlanDataSource</code>
     *         to calculate billing for your geofence collection. Your data
     *         won't be shared with the data provider, and will remain in your
     *         AWS account and Region unless you move it.
     *         </p>
     *         </note>
     */
    public String getPricingPlanDataSource() {
        return pricingPlanDataSource;
    }

    /**
     * <p>
     * Updates the data provider for the geofence collection.
     * </p>
     * <p>
     * A required value for the following pricing plans:
     * <code>MobileAssetTracking</code>| <code>MobileAssetManagement</code>
     * </p>
     * <p>
     * For more information about <a
     * href="https://aws.amazon.com/location/data-providers/">data providers</a>
     * and <a href="https://aws.amazon.com/location/pricing/">pricing plans</a>,
     * see the Amazon Location Service product page.
     * </p>
     * <note>
     * <p>
     * This can only be updated when updating the <code>PricingPlan</code> in
     * the same request.
     * </p>
     * <p>
     * Amazon Location Service uses <code>PricingPlanDataSource</code> to
     * calculate billing for your geofence collection. Your data won't be shared
     * with the data provider, and will remain in your AWS account and Region
     * unless you move it.
     * </p>
     * </note>
     *
     * @param pricingPlanDataSource <p>
     *            Updates the data provider for the geofence collection.
     *            </p>
     *            <p>
     *            A required value for the following pricing plans:
     *            <code>MobileAssetTracking</code>|
     *            <code>MobileAssetManagement</code>
     *            </p>
     *            <p>
     *            For more information about <a
     *            href="https://aws.amazon.com/location/data-providers/">data
     *            providers</a> and <a
     *            href="https://aws.amazon.com/location/pricing/">pricing
     *            plans</a>, see the Amazon Location Service product page.
     *            </p>
     *            <note>
     *            <p>
     *            This can only be updated when updating the
     *            <code>PricingPlan</code> in the same request.
     *            </p>
     *            <p>
     *            Amazon Location Service uses
     *            <code>PricingPlanDataSource</code> to calculate billing for
     *            your geofence collection. Your data won't be shared with the
     *            data provider, and will remain in your AWS account and Region
     *            unless you move it.
     *            </p>
     *            </note>
     */
    public void setPricingPlanDataSource(String pricingPlanDataSource) {
        this.pricingPlanDataSource = pricingPlanDataSource;
    }

    /**
     * <p>
     * Updates the data provider for the geofence collection.
     * </p>
     * <p>
     * A required value for the following pricing plans:
     * <code>MobileAssetTracking</code>| <code>MobileAssetManagement</code>
     * </p>
     * <p>
     * For more information about <a
     * href="https://aws.amazon.com/location/data-providers/">data providers</a>
     * and <a href="https://aws.amazon.com/location/pricing/">pricing plans</a>,
     * see the Amazon Location Service product page.
     * </p>
     * <note>
     * <p>
     * This can only be updated when updating the <code>PricingPlan</code> in
     * the same request.
     * </p>
     * <p>
     * Amazon Location Service uses <code>PricingPlanDataSource</code> to
     * calculate billing for your geofence collection. Your data won't be shared
     * with the data provider, and will remain in your AWS account and Region
     * unless you move it.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pricingPlanDataSource <p>
     *            Updates the data provider for the geofence collection.
     *            </p>
     *            <p>
     *            A required value for the following pricing plans:
     *            <code>MobileAssetTracking</code>|
     *            <code>MobileAssetManagement</code>
     *            </p>
     *            <p>
     *            For more information about <a
     *            href="https://aws.amazon.com/location/data-providers/">data
     *            providers</a> and <a
     *            href="https://aws.amazon.com/location/pricing/">pricing
     *            plans</a>, see the Amazon Location Service product page.
     *            </p>
     *            <note>
     *            <p>
     *            This can only be updated when updating the
     *            <code>PricingPlan</code> in the same request.
     *            </p>
     *            <p>
     *            Amazon Location Service uses
     *            <code>PricingPlanDataSource</code> to calculate billing for
     *            your geofence collection. Your data won't be shared with the
     *            data provider, and will remain in your AWS account and Region
     *            unless you move it.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGeofenceCollectionRequest withPricingPlanDataSource(String pricingPlanDataSource) {
        this.pricingPlanDataSource = pricingPlanDataSource;
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
            sb.append("PricingPlan: " + getPricingPlan() + ",");
        if (getPricingPlanDataSource() != null)
            sb.append("PricingPlanDataSource: " + getPricingPlanDataSource());
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
        hashCode = prime
                * hashCode
                + ((getPricingPlanDataSource() == null) ? 0 : getPricingPlanDataSource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGeofenceCollectionRequest == false)
            return false;
        UpdateGeofenceCollectionRequest other = (UpdateGeofenceCollectionRequest) obj;

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
        if (other.getPricingPlanDataSource() == null ^ this.getPricingPlanDataSource() == null)
            return false;
        if (other.getPricingPlanDataSource() != null
                && other.getPricingPlanDataSource().equals(this.getPricingPlanDataSource()) == false)
            return false;
        return true;
    }
}
