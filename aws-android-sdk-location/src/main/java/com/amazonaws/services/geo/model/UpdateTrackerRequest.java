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
 * Updates the specified properties of a given tracker resource.
 * </p>
 */
public class UpdateTrackerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Updates the description for the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked
     * geofence collections, but not every location update is stored. If your
     * update frequency is more often than 30 seconds, only one update per 30
     * seconds is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4
     * ft), location updates are ignored. Location updates within this distance
     * are neither evaluated against linked geofence collections, nor stored.
     * This helps control costs by reducing the number of geofence evaluations
     * and device positions to retrieve. Distance-based filtering can also
     * reduce the jitter effect when displaying device trajectory on a map.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased
     */
    private String positionFiltering;

    /**
     * <p>
     * Updates the pricing plan for the tracker resource.
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
     * Updates the data provider for the tracker resource.
     * </p>
     * <p>
     * A required value for the following pricing plans:
     * <code>MobileAssetTracking</code>| <code>MobileAssetManagement</code>
     * </p>
     * <p>
     * For more information about <a
     * href="https://aws.amazon.com/location/data-providers/">data providers</a>
     * and <a href="https://aws.amazon.com/location/pricing/">pricing plans</a>,
     * see the Amazon Location Service product page
     * </p>
     * <note>
     * <p>
     * This can only be updated when updating the <code>PricingPlan</code> in
     * the same request.
     * </p>
     * <p>
     * Amazon Location Service uses <code>PricingPlanDataSource</code> to
     * calculate billing for your tracker resource. Your data won't be shared
     * with the data provider, and will remain in your AWS account and Region
     * unless you move it.
     * </p>
     * </note>
     */
    private String pricingPlanDataSource;

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String trackerName;

    /**
     * <p>
     * Updates the description for the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         Updates the description for the tracker resource.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Updates the description for the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            Updates the description for the tracker resource.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Updates the description for the tracker resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            Updates the description for the tracker resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrackerRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked
     * geofence collections, but not every location update is stored. If your
     * update frequency is more often than 30 seconds, only one update per 30
     * seconds is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4
     * ft), location updates are ignored. Location updates within this distance
     * are neither evaluated against linked geofence collections, nor stored.
     * This helps control costs by reducing the number of geofence evaluations
     * and device positions to retrieve. Distance-based filtering can also
     * reduce the jitter effect when displaying device trajectory on a map.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased
     *
     * @return <p>
     *         Updates the position filtering for the tracker resource.
     *         </p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TimeBased</code> - Location updates are evaluated against
     *         linked geofence collections, but not every location update is
     *         stored. If your update frequency is more often than 30 seconds,
     *         only one update per 30 seconds is stored for each unique device
     *         ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DistanceBased</code> - If the device has moved less than 30
     *         m (98.4 ft), location updates are ignored. Location updates
     *         within this distance are neither evaluated against linked
     *         geofence collections, nor stored. This helps control costs by
     *         reducing the number of geofence evaluations and device positions
     *         to retrieve. Distance-based filtering can also reduce the jitter
     *         effect when displaying device trajectory on a map.
     *         </p>
     *         </li>
     *         </ul>
     * @see PositionFiltering
     */
    public String getPositionFiltering() {
        return positionFiltering;
    }

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked
     * geofence collections, but not every location update is stored. If your
     * update frequency is more often than 30 seconds, only one update per 30
     * seconds is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4
     * ft), location updates are ignored. Location updates within this distance
     * are neither evaluated against linked geofence collections, nor stored.
     * This helps control costs by reducing the number of geofence evaluations
     * and device positions to retrieve. Distance-based filtering can also
     * reduce the jitter effect when displaying device trajectory on a map.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased
     *
     * @param positionFiltering <p>
     *            Updates the position filtering for the tracker resource.
     *            </p>
     *            <p>
     *            Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TimeBased</code> - Location updates are evaluated
     *            against linked geofence collections, but not every location
     *            update is stored. If your update frequency is more often than
     *            30 seconds, only one update per 30 seconds is stored for each
     *            unique device ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DistanceBased</code> - If the device has moved less than
     *            30 m (98.4 ft), location updates are ignored. Location updates
     *            within this distance are neither evaluated against linked
     *            geofence collections, nor stored. This helps control costs by
     *            reducing the number of geofence evaluations and device
     *            positions to retrieve. Distance-based filtering can also
     *            reduce the jitter effect when displaying device trajectory on
     *            a map.
     *            </p>
     *            </li>
     *            </ul>
     * @see PositionFiltering
     */
    public void setPositionFiltering(String positionFiltering) {
        this.positionFiltering = positionFiltering;
    }

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked
     * geofence collections, but not every location update is stored. If your
     * update frequency is more often than 30 seconds, only one update per 30
     * seconds is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4
     * ft), location updates are ignored. Location updates within this distance
     * are neither evaluated against linked geofence collections, nor stored.
     * This helps control costs by reducing the number of geofence evaluations
     * and device positions to retrieve. Distance-based filtering can also
     * reduce the jitter effect when displaying device trajectory on a map.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased
     *
     * @param positionFiltering <p>
     *            Updates the position filtering for the tracker resource.
     *            </p>
     *            <p>
     *            Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TimeBased</code> - Location updates are evaluated
     *            against linked geofence collections, but not every location
     *            update is stored. If your update frequency is more often than
     *            30 seconds, only one update per 30 seconds is stored for each
     *            unique device ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DistanceBased</code> - If the device has moved less than
     *            30 m (98.4 ft), location updates are ignored. Location updates
     *            within this distance are neither evaluated against linked
     *            geofence collections, nor stored. This helps control costs by
     *            reducing the number of geofence evaluations and device
     *            positions to retrieve. Distance-based filtering can also
     *            reduce the jitter effect when displaying device trajectory on
     *            a map.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PositionFiltering
     */
    public UpdateTrackerRequest withPositionFiltering(String positionFiltering) {
        this.positionFiltering = positionFiltering;
        return this;
    }

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked
     * geofence collections, but not every location update is stored. If your
     * update frequency is more often than 30 seconds, only one update per 30
     * seconds is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4
     * ft), location updates are ignored. Location updates within this distance
     * are neither evaluated against linked geofence collections, nor stored.
     * This helps control costs by reducing the number of geofence evaluations
     * and device positions to retrieve. Distance-based filtering can also
     * reduce the jitter effect when displaying device trajectory on a map.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased
     *
     * @param positionFiltering <p>
     *            Updates the position filtering for the tracker resource.
     *            </p>
     *            <p>
     *            Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TimeBased</code> - Location updates are evaluated
     *            against linked geofence collections, but not every location
     *            update is stored. If your update frequency is more often than
     *            30 seconds, only one update per 30 seconds is stored for each
     *            unique device ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DistanceBased</code> - If the device has moved less than
     *            30 m (98.4 ft), location updates are ignored. Location updates
     *            within this distance are neither evaluated against linked
     *            geofence collections, nor stored. This helps control costs by
     *            reducing the number of geofence evaluations and device
     *            positions to retrieve. Distance-based filtering can also
     *            reduce the jitter effect when displaying device trajectory on
     *            a map.
     *            </p>
     *            </li>
     *            </ul>
     * @see PositionFiltering
     */
    public void setPositionFiltering(PositionFiltering positionFiltering) {
        this.positionFiltering = positionFiltering.toString();
    }

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked
     * geofence collections, but not every location update is stored. If your
     * update frequency is more often than 30 seconds, only one update per 30
     * seconds is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4
     * ft), location updates are ignored. Location updates within this distance
     * are neither evaluated against linked geofence collections, nor stored.
     * This helps control costs by reducing the number of geofence evaluations
     * and device positions to retrieve. Distance-based filtering can also
     * reduce the jitter effect when displaying device trajectory on a map.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased
     *
     * @param positionFiltering <p>
     *            Updates the position filtering for the tracker resource.
     *            </p>
     *            <p>
     *            Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TimeBased</code> - Location updates are evaluated
     *            against linked geofence collections, but not every location
     *            update is stored. If your update frequency is more often than
     *            30 seconds, only one update per 30 seconds is stored for each
     *            unique device ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DistanceBased</code> - If the device has moved less than
     *            30 m (98.4 ft), location updates are ignored. Location updates
     *            within this distance are neither evaluated against linked
     *            geofence collections, nor stored. This helps control costs by
     *            reducing the number of geofence evaluations and device
     *            positions to retrieve. Distance-based filtering can also
     *            reduce the jitter effect when displaying device trajectory on
     *            a map.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PositionFiltering
     */
    public UpdateTrackerRequest withPositionFiltering(PositionFiltering positionFiltering) {
        this.positionFiltering = positionFiltering.toString();
        return this;
    }

    /**
     * <p>
     * Updates the pricing plan for the tracker resource.
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
     *         Updates the pricing plan for the tracker resource.
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
     * Updates the pricing plan for the tracker resource.
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
     *            Updates the pricing plan for the tracker resource.
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
     * Updates the pricing plan for the tracker resource.
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
     *            Updates the pricing plan for the tracker resource.
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
    public UpdateTrackerRequest withPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
        return this;
    }

    /**
     * <p>
     * Updates the pricing plan for the tracker resource.
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
     *            Updates the pricing plan for the tracker resource.
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
     * Updates the pricing plan for the tracker resource.
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
     *            Updates the pricing plan for the tracker resource.
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
    public UpdateTrackerRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * Updates the data provider for the tracker resource.
     * </p>
     * <p>
     * A required value for the following pricing plans:
     * <code>MobileAssetTracking</code>| <code>MobileAssetManagement</code>
     * </p>
     * <p>
     * For more information about <a
     * href="https://aws.amazon.com/location/data-providers/">data providers</a>
     * and <a href="https://aws.amazon.com/location/pricing/">pricing plans</a>,
     * see the Amazon Location Service product page
     * </p>
     * <note>
     * <p>
     * This can only be updated when updating the <code>PricingPlan</code> in
     * the same request.
     * </p>
     * <p>
     * Amazon Location Service uses <code>PricingPlanDataSource</code> to
     * calculate billing for your tracker resource. Your data won't be shared
     * with the data provider, and will remain in your AWS account and Region
     * unless you move it.
     * </p>
     * </note>
     *
     * @return <p>
     *         Updates the data provider for the tracker resource.
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
     *         plans</a>, see the Amazon Location Service product page
     *         </p>
     *         <note>
     *         <p>
     *         This can only be updated when updating the
     *         <code>PricingPlan</code> in the same request.
     *         </p>
     *         <p>
     *         Amazon Location Service uses <code>PricingPlanDataSource</code>
     *         to calculate billing for your tracker resource. Your data won't
     *         be shared with the data provider, and will remain in your AWS
     *         account and Region unless you move it.
     *         </p>
     *         </note>
     */
    public String getPricingPlanDataSource() {
        return pricingPlanDataSource;
    }

    /**
     * <p>
     * Updates the data provider for the tracker resource.
     * </p>
     * <p>
     * A required value for the following pricing plans:
     * <code>MobileAssetTracking</code>| <code>MobileAssetManagement</code>
     * </p>
     * <p>
     * For more information about <a
     * href="https://aws.amazon.com/location/data-providers/">data providers</a>
     * and <a href="https://aws.amazon.com/location/pricing/">pricing plans</a>,
     * see the Amazon Location Service product page
     * </p>
     * <note>
     * <p>
     * This can only be updated when updating the <code>PricingPlan</code> in
     * the same request.
     * </p>
     * <p>
     * Amazon Location Service uses <code>PricingPlanDataSource</code> to
     * calculate billing for your tracker resource. Your data won't be shared
     * with the data provider, and will remain in your AWS account and Region
     * unless you move it.
     * </p>
     * </note>
     *
     * @param pricingPlanDataSource <p>
     *            Updates the data provider for the tracker resource.
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
     *            plans</a>, see the Amazon Location Service product page
     *            </p>
     *            <note>
     *            <p>
     *            This can only be updated when updating the
     *            <code>PricingPlan</code> in the same request.
     *            </p>
     *            <p>
     *            Amazon Location Service uses
     *            <code>PricingPlanDataSource</code> to calculate billing for
     *            your tracker resource. Your data won't be shared with the data
     *            provider, and will remain in your AWS account and Region
     *            unless you move it.
     *            </p>
     *            </note>
     */
    public void setPricingPlanDataSource(String pricingPlanDataSource) {
        this.pricingPlanDataSource = pricingPlanDataSource;
    }

    /**
     * <p>
     * Updates the data provider for the tracker resource.
     * </p>
     * <p>
     * A required value for the following pricing plans:
     * <code>MobileAssetTracking</code>| <code>MobileAssetManagement</code>
     * </p>
     * <p>
     * For more information about <a
     * href="https://aws.amazon.com/location/data-providers/">data providers</a>
     * and <a href="https://aws.amazon.com/location/pricing/">pricing plans</a>,
     * see the Amazon Location Service product page
     * </p>
     * <note>
     * <p>
     * This can only be updated when updating the <code>PricingPlan</code> in
     * the same request.
     * </p>
     * <p>
     * Amazon Location Service uses <code>PricingPlanDataSource</code> to
     * calculate billing for your tracker resource. Your data won't be shared
     * with the data provider, and will remain in your AWS account and Region
     * unless you move it.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pricingPlanDataSource <p>
     *            Updates the data provider for the tracker resource.
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
     *            plans</a>, see the Amazon Location Service product page
     *            </p>
     *            <note>
     *            <p>
     *            This can only be updated when updating the
     *            <code>PricingPlan</code> in the same request.
     *            </p>
     *            <p>
     *            Amazon Location Service uses
     *            <code>PricingPlanDataSource</code> to calculate billing for
     *            your tracker resource. Your data won't be shared with the data
     *            provider, and will remain in your AWS account and Region
     *            unless you move it.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrackerRequest withPricingPlanDataSource(String pricingPlanDataSource) {
        this.pricingPlanDataSource = pricingPlanDataSource;
        return this;
    }

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The name of the tracker resource to update.
     *         </p>
     */
    public String getTrackerName() {
        return trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param trackerName <p>
     *            The name of the tracker resource to update.
     *            </p>
     */
    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param trackerName <p>
     *            The name of the tracker resource to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrackerRequest withTrackerName(String trackerName) {
        this.trackerName = trackerName;
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getPositionFiltering() != null)
            sb.append("PositionFiltering: " + getPositionFiltering() + ",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: " + getPricingPlan() + ",");
        if (getPricingPlanDataSource() != null)
            sb.append("PricingPlanDataSource: " + getPricingPlanDataSource() + ",");
        if (getTrackerName() != null)
            sb.append("TrackerName: " + getTrackerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getPositionFiltering() == null) ? 0 : getPositionFiltering().hashCode());
        hashCode = prime * hashCode
                + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime
                * hashCode
                + ((getPricingPlanDataSource() == null) ? 0 : getPricingPlanDataSource().hashCode());
        hashCode = prime * hashCode
                + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrackerRequest == false)
            return false;
        UpdateTrackerRequest other = (UpdateTrackerRequest) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPositionFiltering() == null ^ this.getPositionFiltering() == null)
            return false;
        if (other.getPositionFiltering() != null
                && other.getPositionFiltering().equals(this.getPositionFiltering()) == false)
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
        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null
                && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        return true;
    }
}
