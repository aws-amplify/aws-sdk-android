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
 * Creates a tracker resource in your AWS account, which lets you retrieve
 * current and historical location of devices.
 * </p>
 */
public class CreateTrackerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An optional description for the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * A key identifier for an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >AWS KMS customer managed key</a>. Enter a key ID, key ARN, alias name,
     * or alias ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Specifies the position filtering for the tracker resource.
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
     * This field is optional. If not specified, the default value is
     * <code>TimeBased</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased
     */
    private String positionFiltering;

    /**
     * <p>
     * Specifies the pricing plan for the tracker resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see
     * <a href="https://aws.amazon.com/location/pricing/">Amazon Location
     * Service pricing</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     */
    private String pricingPlan;

    /**
     * <p>
     * Specifies the data provider for the tracker resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required value for the following pricing plans:
     * <code>MobileAssetTracking </code>| <code>MobileAssetManagement</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about <a
     * href="https://aws.amazon.com/location/data-providers/">Data
     * Providers</a>, and <a
     * href="https://aws.amazon.com/location/pricing/">Pricing plans</a>, see
     * the Amazon Location Service product page.
     * </p>
     * <note>
     * <p>
     * Amazon Location Service only uses <code>PricingPlanDataSource</code> to
     * calculate billing for your tracker resource. Your data will not be shared
     * with the data provider, and will remain in your AWS account or Region
     * unless you move it.
     * </p>
     * </note>
     * <p>
     * Valid values: <code>Esri</code> | <code>Here</code>
     * </p>
     */
    private String pricingPlanDataSource;

    /**
     * <p>
     * Applies one or more tags to the tracker resource. A tag is a key-value
     * pair helps manage, identify, search, and filter your resources by
     * labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name for the tracker resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-),
     * periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique tracker resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleTracker</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String trackerName;

    /**
     * <p>
     * An optional description for the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         An optional description for the tracker resource.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * An optional description for the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            An optional description for the tracker resource.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the tracker resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            An optional description for the tracker resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrackerRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A key identifier for an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >AWS KMS customer managed key</a>. Enter a key ID, key ARN, alias name,
     * or alias ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         A key identifier for an <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     *         >AWS KMS customer managed key</a>. Enter a key ID, key ARN, alias
     *         name, or alias ARN.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * A key identifier for an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >AWS KMS customer managed key</a>. Enter a key ID, key ARN, alias name,
     * or alias ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param kmsKeyId <p>
     *            A key identifier for an <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     *            >AWS KMS customer managed key</a>. Enter a key ID, key ARN,
     *            alias name, or alias ARN.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * A key identifier for an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >AWS KMS customer managed key</a>. Enter a key ID, key ARN, alias name,
     * or alias ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param kmsKeyId <p>
     *            A key identifier for an <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     *            >AWS KMS customer managed key</a>. Enter a key ID, key ARN,
     *            alias name, or alias ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrackerRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * Specifies the position filtering for the tracker resource.
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
     * This field is optional. If not specified, the default value is
     * <code>TimeBased</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased
     *
     * @return <p>
     *         Specifies the position filtering for the tracker resource.
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
     *         <p>
     *         This field is optional. If not specified, the default value is
     *         <code>TimeBased</code>.
     *         </p>
     * @see PositionFiltering
     */
    public String getPositionFiltering() {
        return positionFiltering;
    }

    /**
     * <p>
     * Specifies the position filtering for the tracker resource.
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
     * This field is optional. If not specified, the default value is
     * <code>TimeBased</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased
     *
     * @param positionFiltering <p>
     *            Specifies the position filtering for the tracker resource.
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
     *            <p>
     *            This field is optional. If not specified, the default value is
     *            <code>TimeBased</code>.
     *            </p>
     * @see PositionFiltering
     */
    public void setPositionFiltering(String positionFiltering) {
        this.positionFiltering = positionFiltering;
    }

    /**
     * <p>
     * Specifies the position filtering for the tracker resource.
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
     * This field is optional. If not specified, the default value is
     * <code>TimeBased</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased
     *
     * @param positionFiltering <p>
     *            Specifies the position filtering for the tracker resource.
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
     *            <p>
     *            This field is optional. If not specified, the default value is
     *            <code>TimeBased</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PositionFiltering
     */
    public CreateTrackerRequest withPositionFiltering(String positionFiltering) {
        this.positionFiltering = positionFiltering;
        return this;
    }

    /**
     * <p>
     * Specifies the position filtering for the tracker resource.
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
     * This field is optional. If not specified, the default value is
     * <code>TimeBased</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased
     *
     * @param positionFiltering <p>
     *            Specifies the position filtering for the tracker resource.
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
     *            <p>
     *            This field is optional. If not specified, the default value is
     *            <code>TimeBased</code>.
     *            </p>
     * @see PositionFiltering
     */
    public void setPositionFiltering(PositionFiltering positionFiltering) {
        this.positionFiltering = positionFiltering.toString();
    }

    /**
     * <p>
     * Specifies the position filtering for the tracker resource.
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
     * This field is optional. If not specified, the default value is
     * <code>TimeBased</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased
     *
     * @param positionFiltering <p>
     *            Specifies the position filtering for the tracker resource.
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
     *            <p>
     *            This field is optional. If not specified, the default value is
     *            <code>TimeBased</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PositionFiltering
     */
    public CreateTrackerRequest withPositionFiltering(PositionFiltering positionFiltering) {
        this.positionFiltering = positionFiltering.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for the tracker resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see
     * <a href="https://aws.amazon.com/location/pricing/">Amazon Location
     * Service pricing</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @return <p>
     *         Specifies the pricing plan for the tracker resource.
     *         </p>
     *         <p>
     *         For additional details and restrictions on each pricing plan
     *         option, see <a
     *         href="https://aws.amazon.com/location/pricing/">Amazon Location
     *         Service pricing</a>.
     *         </p>
     * @see PricingPlan
     */
    public String getPricingPlan() {
        return pricingPlan;
    }

    /**
     * <p>
     * Specifies the pricing plan for the tracker resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see
     * <a href="https://aws.amazon.com/location/pricing/">Amazon Location
     * Service pricing</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            Specifies the pricing plan for the tracker resource.
     *            </p>
     *            <p>
     *            For additional details and restrictions on each pricing plan
     *            option, see <a
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
     * Specifies the pricing plan for the tracker resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see
     * <a href="https://aws.amazon.com/location/pricing/">Amazon Location
     * Service pricing</a>.
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
     *            Specifies the pricing plan for the tracker resource.
     *            </p>
     *            <p>
     *            For additional details and restrictions on each pricing plan
     *            option, see <a
     *            href="https://aws.amazon.com/location/pricing/">Amazon
     *            Location Service pricing</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PricingPlan
     */
    public CreateTrackerRequest withPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for the tracker resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see
     * <a href="https://aws.amazon.com/location/pricing/">Amazon Location
     * Service pricing</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            Specifies the pricing plan for the tracker resource.
     *            </p>
     *            <p>
     *            For additional details and restrictions on each pricing plan
     *            option, see <a
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
     * Specifies the pricing plan for the tracker resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see
     * <a href="https://aws.amazon.com/location/pricing/">Amazon Location
     * Service pricing</a>.
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
     *            Specifies the pricing plan for the tracker resource.
     *            </p>
     *            <p>
     *            For additional details and restrictions on each pricing plan
     *            option, see <a
     *            href="https://aws.amazon.com/location/pricing/">Amazon
     *            Location Service pricing</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PricingPlan
     */
    public CreateTrackerRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the data provider for the tracker resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required value for the following pricing plans:
     * <code>MobileAssetTracking </code>| <code>MobileAssetManagement</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about <a
     * href="https://aws.amazon.com/location/data-providers/">Data
     * Providers</a>, and <a
     * href="https://aws.amazon.com/location/pricing/">Pricing plans</a>, see
     * the Amazon Location Service product page.
     * </p>
     * <note>
     * <p>
     * Amazon Location Service only uses <code>PricingPlanDataSource</code> to
     * calculate billing for your tracker resource. Your data will not be shared
     * with the data provider, and will remain in your AWS account or Region
     * unless you move it.
     * </p>
     * </note>
     * <p>
     * Valid values: <code>Esri</code> | <code>Here</code>
     * </p>
     *
     * @return <p>
     *         Specifies the data provider for the tracker resource.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Required value for the following pricing plans:
     *         <code>MobileAssetTracking </code>|
     *         <code>MobileAssetManagement</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about <a
     *         href="https://aws.amazon.com/location/data-providers/">Data
     *         Providers</a>, and <a
     *         href="https://aws.amazon.com/location/pricing/">Pricing
     *         plans</a>, see the Amazon Location Service product page.
     *         </p>
     *         <note>
     *         <p>
     *         Amazon Location Service only uses
     *         <code>PricingPlanDataSource</code> to calculate billing for your
     *         tracker resource. Your data will not be shared with the data
     *         provider, and will remain in your AWS account or Region unless
     *         you move it.
     *         </p>
     *         </note>
     *         <p>
     *         Valid values: <code>Esri</code> | <code>Here</code>
     *         </p>
     */
    public String getPricingPlanDataSource() {
        return pricingPlanDataSource;
    }

    /**
     * <p>
     * Specifies the data provider for the tracker resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required value for the following pricing plans:
     * <code>MobileAssetTracking </code>| <code>MobileAssetManagement</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about <a
     * href="https://aws.amazon.com/location/data-providers/">Data
     * Providers</a>, and <a
     * href="https://aws.amazon.com/location/pricing/">Pricing plans</a>, see
     * the Amazon Location Service product page.
     * </p>
     * <note>
     * <p>
     * Amazon Location Service only uses <code>PricingPlanDataSource</code> to
     * calculate billing for your tracker resource. Your data will not be shared
     * with the data provider, and will remain in your AWS account or Region
     * unless you move it.
     * </p>
     * </note>
     * <p>
     * Valid values: <code>Esri</code> | <code>Here</code>
     * </p>
     *
     * @param pricingPlanDataSource <p>
     *            Specifies the data provider for the tracker resource.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Required value for the following pricing plans:
     *            <code>MobileAssetTracking </code>|
     *            <code>MobileAssetManagement</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about <a
     *            href="https://aws.amazon.com/location/data-providers/">Data
     *            Providers</a>, and <a
     *            href="https://aws.amazon.com/location/pricing/">Pricing
     *            plans</a>, see the Amazon Location Service product page.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon Location Service only uses
     *            <code>PricingPlanDataSource</code> to calculate billing for
     *            your tracker resource. Your data will not be shared with the
     *            data provider, and will remain in your AWS account or Region
     *            unless you move it.
     *            </p>
     *            </note>
     *            <p>
     *            Valid values: <code>Esri</code> | <code>Here</code>
     *            </p>
     */
    public void setPricingPlanDataSource(String pricingPlanDataSource) {
        this.pricingPlanDataSource = pricingPlanDataSource;
    }

    /**
     * <p>
     * Specifies the data provider for the tracker resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required value for the following pricing plans:
     * <code>MobileAssetTracking </code>| <code>MobileAssetManagement</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about <a
     * href="https://aws.amazon.com/location/data-providers/">Data
     * Providers</a>, and <a
     * href="https://aws.amazon.com/location/pricing/">Pricing plans</a>, see
     * the Amazon Location Service product page.
     * </p>
     * <note>
     * <p>
     * Amazon Location Service only uses <code>PricingPlanDataSource</code> to
     * calculate billing for your tracker resource. Your data will not be shared
     * with the data provider, and will remain in your AWS account or Region
     * unless you move it.
     * </p>
     * </note>
     * <p>
     * Valid values: <code>Esri</code> | <code>Here</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pricingPlanDataSource <p>
     *            Specifies the data provider for the tracker resource.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Required value for the following pricing plans:
     *            <code>MobileAssetTracking </code>|
     *            <code>MobileAssetManagement</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about <a
     *            href="https://aws.amazon.com/location/data-providers/">Data
     *            Providers</a>, and <a
     *            href="https://aws.amazon.com/location/pricing/">Pricing
     *            plans</a>, see the Amazon Location Service product page.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon Location Service only uses
     *            <code>PricingPlanDataSource</code> to calculate billing for
     *            your tracker resource. Your data will not be shared with the
     *            data provider, and will remain in your AWS account or Region
     *            unless you move it.
     *            </p>
     *            </note>
     *            <p>
     *            Valid values: <code>Esri</code> | <code>Here</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrackerRequest withPricingPlanDataSource(String pricingPlanDataSource) {
        this.pricingPlanDataSource = pricingPlanDataSource;
        return this;
    }

    /**
     * <p>
     * Applies one or more tags to the tracker resource. A tag is a key-value
     * pair helps manage, identify, search, and filter your resources by
     * labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Applies one or more tags to the tracker resource. A tag is a
     *         key-value pair helps manage, identify, search, and filter your
     *         resources by labelling them.
     *         </p>
     *         <p>
     *         Format: <code>"key" : "value"</code>
     *         </p>
     *         <p>
     *         Restrictions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum 50 tags per resource
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each resource tag must be unique with a maximum of one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length: 128 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length: 256 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can use alphanumeric characters (A–Z, a–z, 0–9), and the
     *         following characters: + - = . _ : / @.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Applies one or more tags to the tracker resource. A tag is a key-value
     * pair helps manage, identify, search, and filter your resources by
     * labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     *
     * @param tags <p>
     *            Applies one or more tags to the tracker resource. A tag is a
     *            key-value pair helps manage, identify, search, and filter your
     *            resources by labelling them.
     *            </p>
     *            <p>
     *            Format: <code>"key" : "value"</code>
     *            </p>
     *            <p>
     *            Restrictions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum 50 tags per resource
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each resource tag must be unique with a maximum of one value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length: 128 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length: 256 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can use alphanumeric characters (A–Z, a–z, 0–9), and the
     *            following characters: + - = . _ : / @.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Applies one or more tags to the tracker resource. A tag is a key-value
     * pair helps manage, identify, search, and filter your resources by
     * labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Applies one or more tags to the tracker resource. A tag is a
     *            key-value pair helps manage, identify, search, and filter your
     *            resources by labelling them.
     *            </p>
     *            <p>
     *            Format: <code>"key" : "value"</code>
     *            </p>
     *            <p>
     *            Restrictions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum 50 tags per resource
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each resource tag must be unique with a maximum of one value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length: 128 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length: 256 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can use alphanumeric characters (A–Z, a–z, 0–9), and the
     *            following characters: + - = . _ : / @.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrackerRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * Applies one or more tags to the tracker resource. A tag is a key-value
     * pair helps manage, identify, search, and filter your resources by
     * labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrackerRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateTrackerRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The name for the tracker resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-),
     * periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique tracker resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleTracker</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The name for the tracker resource.
     *         </p>
     *         <p>
     *         Requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens
     *         (-), periods (.), and underscores (_).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be a unique tracker resource name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         No spaces allowed. For example, <code>ExampleTracker</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getTrackerName() {
        return trackerName;
    }

    /**
     * <p>
     * The name for the tracker resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-),
     * periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique tracker resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleTracker</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param trackerName <p>
     *            The name for the tracker resource.
     *            </p>
     *            <p>
     *            Requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens
     *            (-), periods (.), and underscores (_).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be a unique tracker resource name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed. For example, <code>ExampleTracker</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The name for the tracker resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-),
     * periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique tracker resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleTracker</code>.
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
     * @param trackerName <p>
     *            The name for the tracker resource.
     *            </p>
     *            <p>
     *            Requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens
     *            (-), periods (.), and underscores (_).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be a unique tracker resource name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed. For example, <code>ExampleTracker</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrackerRequest withTrackerName(String trackerName) {
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getPositionFiltering() != null)
            sb.append("PositionFiltering: " + getPositionFiltering() + ",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: " + getPricingPlan() + ",");
        if (getPricingPlanDataSource() != null)
            sb.append("PricingPlanDataSource: " + getPricingPlanDataSource() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
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
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getPositionFiltering() == null) ? 0 : getPositionFiltering().hashCode());
        hashCode = prime * hashCode
                + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime
                * hashCode
                + ((getPricingPlanDataSource() == null) ? 0 : getPricingPlanDataSource().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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

        if (obj instanceof CreateTrackerRequest == false)
            return false;
        CreateTrackerRequest other = (CreateTrackerRequest) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null
                && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        return true;
    }
}
