/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates a tracker resource in your Amazon Web Services account, which lets
 * you retrieve current and historical location of devices.
 * </p>
 */
public class CreateTrackerRequest extends AmazonWebServiceRequest implements Serializable {
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
     * <b>Pattern: </b>[-._\w]+<br/>
     */
    private String trackerName;

    /**
     * <p>
     * No longer used. If included, the only allowed value is
     * <code>RequestBasedUsage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     */
    private String pricingPlan;

    /**
     * <p>
     * A key identifier for an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >Amazon Web Services KMS customer managed key</a>. Enter a key ID, key
     * ARN, alias name, or alias ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * This parameter is no longer used.
     * </p>
     */
    private String pricingPlanDataSource;

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
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> tags;

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
     * ft), location updates are ignored. Location updates within this area are
     * neither evaluated against linked geofence collections, nor stored. This
     * helps control costs by reducing the number of geofence evaluations and
     * historical device positions to paginate through. Distance-based filtering
     * can also reduce the effects of GPS noise when displaying device
     * trajectories on a map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccuracyBased</code> - If the device has moved less than the
     * measured accuracy, location updates are ignored. For example, if two
     * consecutive updates from a device have a horizontal accuracy of 5 m and
     * 10 m, the second update is ignored if the device has moved less than 15
     * m. Ignored location updates are neither evaluated against linked geofence
     * collections, nor stored. This can reduce the effects of GPS noise when
     * displaying device trajectories on a map, and can help control your costs
     * by reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This field is optional. If not specified, the default value is
     * <code>TimeBased</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased, AccuracyBased
     */
    private String positionFiltering;

    /**
     * <p>
     * Whether to enable position <code>UPDATE</code> events from this tracker
     * to be sent to EventBridge.
     * </p>
     * <note>
     * <p>
     * You do not need enable this feature to get <code>ENTER</code> and
     * <code>EXIT</code> events for geofences with this tracker. Those events
     * are always sent to EventBridge.
     * </p>
     * </note>
     */
    private Boolean eventBridgeEnabled;

    /**
     * <p>
     * Enables <code>GeospatialQueries</code> for a tracker that uses a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >Amazon Web Services KMS customer managed key</a>.
     * </p>
     * <p>
     * This parameter is only used if you are using a KMS customer managed key.
     * </p>
     * <note>
     * <p>
     * If you wish to encrypt your data using your own KMS customer managed key,
     * then the Bounding Polygon Queries feature will be disabled by default.
     * This is because by using this feature, a representation of your device
     * positions will not be encrypted using the your KMS managed key. The exact
     * device position, however; is still encrypted using your managed key.
     * </p>
     * <p>
     * You can choose to opt-in to the Bounding Polygon Quseries feature. This
     * is done by setting the <code>KmsKeyEnableGeospatialQueries</code>
     * parameter to true when creating or updating a Tracker.
     * </p>
     * </note>
     */
    private Boolean kmsKeyEnableGeospatialQueries;

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
     * <b>Pattern: </b>[-._\w]+<br/>
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
     * <b>Pattern: </b>[-._\w]+<br/>
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
     * <b>Pattern: </b>[-._\w]+<br/>
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
     * <p>
     * No longer used. If included, the only allowed value is
     * <code>RequestBasedUsage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @return <p>
     *         No longer used. If included, the only allowed value is
     *         <code>RequestBasedUsage</code>.
     *         </p>
     * @see PricingPlan
     */
    public String getPricingPlan() {
        return pricingPlan;
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is
     * <code>RequestBasedUsage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            No longer used. If included, the only allowed value is
     *            <code>RequestBasedUsage</code>.
     *            </p>
     * @see PricingPlan
     */
    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is
     * <code>RequestBasedUsage</code>.
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
     *            No longer used. If included, the only allowed value is
     *            <code>RequestBasedUsage</code>.
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
     * No longer used. If included, the only allowed value is
     * <code>RequestBasedUsage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            No longer used. If included, the only allowed value is
     *            <code>RequestBasedUsage</code>.
     *            </p>
     * @see PricingPlan
     */
    public void setPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is
     * <code>RequestBasedUsage</code>.
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
     *            No longer used. If included, the only allowed value is
     *            <code>RequestBasedUsage</code>.
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
     * A key identifier for an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >Amazon Web Services KMS customer managed key</a>. Enter a key ID, key
     * ARN, alias name, or alias ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         A key identifier for an <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     *         >Amazon Web Services KMS customer managed key</a>. Enter a key
     *         ID, key ARN, alias name, or alias ARN.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * A key identifier for an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >Amazon Web Services KMS customer managed key</a>. Enter a key ID, key
     * ARN, alias name, or alias ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param kmsKeyId <p>
     *            A key identifier for an <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     *            >Amazon Web Services KMS customer managed key</a>. Enter a key
     *            ID, key ARN, alias name, or alias ARN.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * A key identifier for an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >Amazon Web Services KMS customer managed key</a>. Enter a key ID, key
     * ARN, alias name, or alias ARN.
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
     *            >Amazon Web Services KMS customer managed key</a>. Enter a key
     *            ID, key ARN, alias name, or alias ARN.
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
     * This parameter is no longer used.
     * </p>
     *
     * @return <p>
     *         This parameter is no longer used.
     *         </p>
     */
    public String getPricingPlanDataSource() {
        return pricingPlanDataSource;
    }

    /**
     * <p>
     * This parameter is no longer used.
     * </p>
     *
     * @param pricingPlanDataSource <p>
     *            This parameter is no longer used.
     *            </p>
     */
    public void setPricingPlanDataSource(String pricingPlanDataSource) {
        this.pricingPlanDataSource = pricingPlanDataSource;
    }

    /**
     * <p>
     * This parameter is no longer used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pricingPlanDataSource <p>
     *            This parameter is no longer used.
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
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
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
     *         <li>
     *         <p>
     *         Cannot use "aws:" as a prefix for a key.
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
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
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
     *            <li>
     *            <p>
     *            Cannot use "aws:" as a prefix for a key.
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
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
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
     *            <li>
     *            <p>
     *            Cannot use "aws:" as a prefix for a key.
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
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
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
     * ft), location updates are ignored. Location updates within this area are
     * neither evaluated against linked geofence collections, nor stored. This
     * helps control costs by reducing the number of geofence evaluations and
     * historical device positions to paginate through. Distance-based filtering
     * can also reduce the effects of GPS noise when displaying device
     * trajectories on a map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccuracyBased</code> - If the device has moved less than the
     * measured accuracy, location updates are ignored. For example, if two
     * consecutive updates from a device have a horizontal accuracy of 5 m and
     * 10 m, the second update is ignored if the device has moved less than 15
     * m. Ignored location updates are neither evaluated against linked geofence
     * collections, nor stored. This can reduce the effects of GPS noise when
     * displaying device trajectories on a map, and can help control your costs
     * by reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This field is optional. If not specified, the default value is
     * <code>TimeBased</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased, AccuracyBased
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
     *         within this area are neither evaluated against linked geofence
     *         collections, nor stored. This helps control costs by reducing the
     *         number of geofence evaluations and historical device positions to
     *         paginate through. Distance-based filtering can also reduce the
     *         effects of GPS noise when displaying device trajectories on a
     *         map.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AccuracyBased</code> - If the device has moved less than
     *         the measured accuracy, location updates are ignored. For example,
     *         if two consecutive updates from a device have a horizontal
     *         accuracy of 5 m and 10 m, the second update is ignored if the
     *         device has moved less than 15 m. Ignored location updates are
     *         neither evaluated against linked geofence collections, nor
     *         stored. This can reduce the effects of GPS noise when displaying
     *         device trajectories on a map, and can help control your costs by
     *         reducing the number of geofence evaluations.
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
     * ft), location updates are ignored. Location updates within this area are
     * neither evaluated against linked geofence collections, nor stored. This
     * helps control costs by reducing the number of geofence evaluations and
     * historical device positions to paginate through. Distance-based filtering
     * can also reduce the effects of GPS noise when displaying device
     * trajectories on a map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccuracyBased</code> - If the device has moved less than the
     * measured accuracy, location updates are ignored. For example, if two
     * consecutive updates from a device have a horizontal accuracy of 5 m and
     * 10 m, the second update is ignored if the device has moved less than 15
     * m. Ignored location updates are neither evaluated against linked geofence
     * collections, nor stored. This can reduce the effects of GPS noise when
     * displaying device trajectories on a map, and can help control your costs
     * by reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This field is optional. If not specified, the default value is
     * <code>TimeBased</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased, AccuracyBased
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
     *            within this area are neither evaluated against linked geofence
     *            collections, nor stored. This helps control costs by reducing
     *            the number of geofence evaluations and historical device
     *            positions to paginate through. Distance-based filtering can
     *            also reduce the effects of GPS noise when displaying device
     *            trajectories on a map.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AccuracyBased</code> - If the device has moved less than
     *            the measured accuracy, location updates are ignored. For
     *            example, if two consecutive updates from a device have a
     *            horizontal accuracy of 5 m and 10 m, the second update is
     *            ignored if the device has moved less than 15 m. Ignored
     *            location updates are neither evaluated against linked geofence
     *            collections, nor stored. This can reduce the effects of GPS
     *            noise when displaying device trajectories on a map, and can
     *            help control your costs by reducing the number of geofence
     *            evaluations.
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
     * ft), location updates are ignored. Location updates within this area are
     * neither evaluated against linked geofence collections, nor stored. This
     * helps control costs by reducing the number of geofence evaluations and
     * historical device positions to paginate through. Distance-based filtering
     * can also reduce the effects of GPS noise when displaying device
     * trajectories on a map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccuracyBased</code> - If the device has moved less than the
     * measured accuracy, location updates are ignored. For example, if two
     * consecutive updates from a device have a horizontal accuracy of 5 m and
     * 10 m, the second update is ignored if the device has moved less than 15
     * m. Ignored location updates are neither evaluated against linked geofence
     * collections, nor stored. This can reduce the effects of GPS noise when
     * displaying device trajectories on a map, and can help control your costs
     * by reducing the number of geofence evaluations.
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
     * <b>Allowed Values: </b>TimeBased, DistanceBased, AccuracyBased
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
     *            within this area are neither evaluated against linked geofence
     *            collections, nor stored. This helps control costs by reducing
     *            the number of geofence evaluations and historical device
     *            positions to paginate through. Distance-based filtering can
     *            also reduce the effects of GPS noise when displaying device
     *            trajectories on a map.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AccuracyBased</code> - If the device has moved less than
     *            the measured accuracy, location updates are ignored. For
     *            example, if two consecutive updates from a device have a
     *            horizontal accuracy of 5 m and 10 m, the second update is
     *            ignored if the device has moved less than 15 m. Ignored
     *            location updates are neither evaluated against linked geofence
     *            collections, nor stored. This can reduce the effects of GPS
     *            noise when displaying device trajectories on a map, and can
     *            help control your costs by reducing the number of geofence
     *            evaluations.
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
     * ft), location updates are ignored. Location updates within this area are
     * neither evaluated against linked geofence collections, nor stored. This
     * helps control costs by reducing the number of geofence evaluations and
     * historical device positions to paginate through. Distance-based filtering
     * can also reduce the effects of GPS noise when displaying device
     * trajectories on a map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccuracyBased</code> - If the device has moved less than the
     * measured accuracy, location updates are ignored. For example, if two
     * consecutive updates from a device have a horizontal accuracy of 5 m and
     * 10 m, the second update is ignored if the device has moved less than 15
     * m. Ignored location updates are neither evaluated against linked geofence
     * collections, nor stored. This can reduce the effects of GPS noise when
     * displaying device trajectories on a map, and can help control your costs
     * by reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This field is optional. If not specified, the default value is
     * <code>TimeBased</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased, AccuracyBased
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
     *            within this area are neither evaluated against linked geofence
     *            collections, nor stored. This helps control costs by reducing
     *            the number of geofence evaluations and historical device
     *            positions to paginate through. Distance-based filtering can
     *            also reduce the effects of GPS noise when displaying device
     *            trajectories on a map.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AccuracyBased</code> - If the device has moved less than
     *            the measured accuracy, location updates are ignored. For
     *            example, if two consecutive updates from a device have a
     *            horizontal accuracy of 5 m and 10 m, the second update is
     *            ignored if the device has moved less than 15 m. Ignored
     *            location updates are neither evaluated against linked geofence
     *            collections, nor stored. This can reduce the effects of GPS
     *            noise when displaying device trajectories on a map, and can
     *            help control your costs by reducing the number of geofence
     *            evaluations.
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
     * ft), location updates are ignored. Location updates within this area are
     * neither evaluated against linked geofence collections, nor stored. This
     * helps control costs by reducing the number of geofence evaluations and
     * historical device positions to paginate through. Distance-based filtering
     * can also reduce the effects of GPS noise when displaying device
     * trajectories on a map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccuracyBased</code> - If the device has moved less than the
     * measured accuracy, location updates are ignored. For example, if two
     * consecutive updates from a device have a horizontal accuracy of 5 m and
     * 10 m, the second update is ignored if the device has moved less than 15
     * m. Ignored location updates are neither evaluated against linked geofence
     * collections, nor stored. This can reduce the effects of GPS noise when
     * displaying device trajectories on a map, and can help control your costs
     * by reducing the number of geofence evaluations.
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
     * <b>Allowed Values: </b>TimeBased, DistanceBased, AccuracyBased
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
     *            within this area are neither evaluated against linked geofence
     *            collections, nor stored. This helps control costs by reducing
     *            the number of geofence evaluations and historical device
     *            positions to paginate through. Distance-based filtering can
     *            also reduce the effects of GPS noise when displaying device
     *            trajectories on a map.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AccuracyBased</code> - If the device has moved less than
     *            the measured accuracy, location updates are ignored. For
     *            example, if two consecutive updates from a device have a
     *            horizontal accuracy of 5 m and 10 m, the second update is
     *            ignored if the device has moved less than 15 m. Ignored
     *            location updates are neither evaluated against linked geofence
     *            collections, nor stored. This can reduce the effects of GPS
     *            noise when displaying device trajectories on a map, and can
     *            help control your costs by reducing the number of geofence
     *            evaluations.
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
     * Whether to enable position <code>UPDATE</code> events from this tracker
     * to be sent to EventBridge.
     * </p>
     * <note>
     * <p>
     * You do not need enable this feature to get <code>ENTER</code> and
     * <code>EXIT</code> events for geofences with this tracker. Those events
     * are always sent to EventBridge.
     * </p>
     * </note>
     *
     * @return <p>
     *         Whether to enable position <code>UPDATE</code> events from this
     *         tracker to be sent to EventBridge.
     *         </p>
     *         <note>
     *         <p>
     *         You do not need enable this feature to get <code>ENTER</code> and
     *         <code>EXIT</code> events for geofences with this tracker. Those
     *         events are always sent to EventBridge.
     *         </p>
     *         </note>
     */
    public Boolean isEventBridgeEnabled() {
        return eventBridgeEnabled;
    }

    /**
     * <p>
     * Whether to enable position <code>UPDATE</code> events from this tracker
     * to be sent to EventBridge.
     * </p>
     * <note>
     * <p>
     * You do not need enable this feature to get <code>ENTER</code> and
     * <code>EXIT</code> events for geofences with this tracker. Those events
     * are always sent to EventBridge.
     * </p>
     * </note>
     *
     * @return <p>
     *         Whether to enable position <code>UPDATE</code> events from this
     *         tracker to be sent to EventBridge.
     *         </p>
     *         <note>
     *         <p>
     *         You do not need enable this feature to get <code>ENTER</code> and
     *         <code>EXIT</code> events for geofences with this tracker. Those
     *         events are always sent to EventBridge.
     *         </p>
     *         </note>
     */
    public Boolean getEventBridgeEnabled() {
        return eventBridgeEnabled;
    }

    /**
     * <p>
     * Whether to enable position <code>UPDATE</code> events from this tracker
     * to be sent to EventBridge.
     * </p>
     * <note>
     * <p>
     * You do not need enable this feature to get <code>ENTER</code> and
     * <code>EXIT</code> events for geofences with this tracker. Those events
     * are always sent to EventBridge.
     * </p>
     * </note>
     *
     * @param eventBridgeEnabled <p>
     *            Whether to enable position <code>UPDATE</code> events from
     *            this tracker to be sent to EventBridge.
     *            </p>
     *            <note>
     *            <p>
     *            You do not need enable this feature to get <code>ENTER</code>
     *            and <code>EXIT</code> events for geofences with this tracker.
     *            Those events are always sent to EventBridge.
     *            </p>
     *            </note>
     */
    public void setEventBridgeEnabled(Boolean eventBridgeEnabled) {
        this.eventBridgeEnabled = eventBridgeEnabled;
    }

    /**
     * <p>
     * Whether to enable position <code>UPDATE</code> events from this tracker
     * to be sent to EventBridge.
     * </p>
     * <note>
     * <p>
     * You do not need enable this feature to get <code>ENTER</code> and
     * <code>EXIT</code> events for geofences with this tracker. Those events
     * are always sent to EventBridge.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventBridgeEnabled <p>
     *            Whether to enable position <code>UPDATE</code> events from
     *            this tracker to be sent to EventBridge.
     *            </p>
     *            <note>
     *            <p>
     *            You do not need enable this feature to get <code>ENTER</code>
     *            and <code>EXIT</code> events for geofences with this tracker.
     *            Those events are always sent to EventBridge.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrackerRequest withEventBridgeEnabled(Boolean eventBridgeEnabled) {
        this.eventBridgeEnabled = eventBridgeEnabled;
        return this;
    }

    /**
     * <p>
     * Enables <code>GeospatialQueries</code> for a tracker that uses a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >Amazon Web Services KMS customer managed key</a>.
     * </p>
     * <p>
     * This parameter is only used if you are using a KMS customer managed key.
     * </p>
     * <note>
     * <p>
     * If you wish to encrypt your data using your own KMS customer managed key,
     * then the Bounding Polygon Queries feature will be disabled by default.
     * This is because by using this feature, a representation of your device
     * positions will not be encrypted using the your KMS managed key. The exact
     * device position, however; is still encrypted using your managed key.
     * </p>
     * <p>
     * You can choose to opt-in to the Bounding Polygon Quseries feature. This
     * is done by setting the <code>KmsKeyEnableGeospatialQueries</code>
     * parameter to true when creating or updating a Tracker.
     * </p>
     * </note>
     *
     * @return <p>
     *         Enables <code>GeospatialQueries</code> for a tracker that uses a
     *         <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     *         >Amazon Web Services KMS customer managed key</a>.
     *         </p>
     *         <p>
     *         This parameter is only used if you are using a KMS customer
     *         managed key.
     *         </p>
     *         <note>
     *         <p>
     *         If you wish to encrypt your data using your own KMS customer
     *         managed key, then the Bounding Polygon Queries feature will be
     *         disabled by default. This is because by using this feature, a
     *         representation of your device positions will not be encrypted
     *         using the your KMS managed key. The exact device position,
     *         however; is still encrypted using your managed key.
     *         </p>
     *         <p>
     *         You can choose to opt-in to the Bounding Polygon Quseries
     *         feature. This is done by setting the
     *         <code>KmsKeyEnableGeospatialQueries</code> parameter to true when
     *         creating or updating a Tracker.
     *         </p>
     *         </note>
     */
    public Boolean isKmsKeyEnableGeospatialQueries() {
        return kmsKeyEnableGeospatialQueries;
    }

    /**
     * <p>
     * Enables <code>GeospatialQueries</code> for a tracker that uses a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >Amazon Web Services KMS customer managed key</a>.
     * </p>
     * <p>
     * This parameter is only used if you are using a KMS customer managed key.
     * </p>
     * <note>
     * <p>
     * If you wish to encrypt your data using your own KMS customer managed key,
     * then the Bounding Polygon Queries feature will be disabled by default.
     * This is because by using this feature, a representation of your device
     * positions will not be encrypted using the your KMS managed key. The exact
     * device position, however; is still encrypted using your managed key.
     * </p>
     * <p>
     * You can choose to opt-in to the Bounding Polygon Quseries feature. This
     * is done by setting the <code>KmsKeyEnableGeospatialQueries</code>
     * parameter to true when creating or updating a Tracker.
     * </p>
     * </note>
     *
     * @return <p>
     *         Enables <code>GeospatialQueries</code> for a tracker that uses a
     *         <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     *         >Amazon Web Services KMS customer managed key</a>.
     *         </p>
     *         <p>
     *         This parameter is only used if you are using a KMS customer
     *         managed key.
     *         </p>
     *         <note>
     *         <p>
     *         If you wish to encrypt your data using your own KMS customer
     *         managed key, then the Bounding Polygon Queries feature will be
     *         disabled by default. This is because by using this feature, a
     *         representation of your device positions will not be encrypted
     *         using the your KMS managed key. The exact device position,
     *         however; is still encrypted using your managed key.
     *         </p>
     *         <p>
     *         You can choose to opt-in to the Bounding Polygon Quseries
     *         feature. This is done by setting the
     *         <code>KmsKeyEnableGeospatialQueries</code> parameter to true when
     *         creating or updating a Tracker.
     *         </p>
     *         </note>
     */
    public Boolean getKmsKeyEnableGeospatialQueries() {
        return kmsKeyEnableGeospatialQueries;
    }

    /**
     * <p>
     * Enables <code>GeospatialQueries</code> for a tracker that uses a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >Amazon Web Services KMS customer managed key</a>.
     * </p>
     * <p>
     * This parameter is only used if you are using a KMS customer managed key.
     * </p>
     * <note>
     * <p>
     * If you wish to encrypt your data using your own KMS customer managed key,
     * then the Bounding Polygon Queries feature will be disabled by default.
     * This is because by using this feature, a representation of your device
     * positions will not be encrypted using the your KMS managed key. The exact
     * device position, however; is still encrypted using your managed key.
     * </p>
     * <p>
     * You can choose to opt-in to the Bounding Polygon Quseries feature. This
     * is done by setting the <code>KmsKeyEnableGeospatialQueries</code>
     * parameter to true when creating or updating a Tracker.
     * </p>
     * </note>
     *
     * @param kmsKeyEnableGeospatialQueries <p>
     *            Enables <code>GeospatialQueries</code> for a tracker that uses
     *            a <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     *            >Amazon Web Services KMS customer managed key</a>.
     *            </p>
     *            <p>
     *            This parameter is only used if you are using a KMS customer
     *            managed key.
     *            </p>
     *            <note>
     *            <p>
     *            If you wish to encrypt your data using your own KMS customer
     *            managed key, then the Bounding Polygon Queries feature will be
     *            disabled by default. This is because by using this feature, a
     *            representation of your device positions will not be encrypted
     *            using the your KMS managed key. The exact device position,
     *            however; is still encrypted using your managed key.
     *            </p>
     *            <p>
     *            You can choose to opt-in to the Bounding Polygon Quseries
     *            feature. This is done by setting the
     *            <code>KmsKeyEnableGeospatialQueries</code> parameter to true
     *            when creating or updating a Tracker.
     *            </p>
     *            </note>
     */
    public void setKmsKeyEnableGeospatialQueries(Boolean kmsKeyEnableGeospatialQueries) {
        this.kmsKeyEnableGeospatialQueries = kmsKeyEnableGeospatialQueries;
    }

    /**
     * <p>
     * Enables <code>GeospatialQueries</code> for a tracker that uses a <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >Amazon Web Services KMS customer managed key</a>.
     * </p>
     * <p>
     * This parameter is only used if you are using a KMS customer managed key.
     * </p>
     * <note>
     * <p>
     * If you wish to encrypt your data using your own KMS customer managed key,
     * then the Bounding Polygon Queries feature will be disabled by default.
     * This is because by using this feature, a representation of your device
     * positions will not be encrypted using the your KMS managed key. The exact
     * device position, however; is still encrypted using your managed key.
     * </p>
     * <p>
     * You can choose to opt-in to the Bounding Polygon Quseries feature. This
     * is done by setting the <code>KmsKeyEnableGeospatialQueries</code>
     * parameter to true when creating or updating a Tracker.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyEnableGeospatialQueries <p>
     *            Enables <code>GeospatialQueries</code> for a tracker that uses
     *            a <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     *            >Amazon Web Services KMS customer managed key</a>.
     *            </p>
     *            <p>
     *            This parameter is only used if you are using a KMS customer
     *            managed key.
     *            </p>
     *            <note>
     *            <p>
     *            If you wish to encrypt your data using your own KMS customer
     *            managed key, then the Bounding Polygon Queries feature will be
     *            disabled by default. This is because by using this feature, a
     *            representation of your device positions will not be encrypted
     *            using the your KMS managed key. The exact device position,
     *            however; is still encrypted using your managed key.
     *            </p>
     *            <p>
     *            You can choose to opt-in to the Bounding Polygon Quseries
     *            feature. This is done by setting the
     *            <code>KmsKeyEnableGeospatialQueries</code> parameter to true
     *            when creating or updating a Tracker.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrackerRequest withKmsKeyEnableGeospatialQueries(
            Boolean kmsKeyEnableGeospatialQueries) {
        this.kmsKeyEnableGeospatialQueries = kmsKeyEnableGeospatialQueries;
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
        if (getTrackerName() != null)
            sb.append("TrackerName: " + getTrackerName() + ",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: " + getPricingPlan() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getPricingPlanDataSource() != null)
            sb.append("PricingPlanDataSource: " + getPricingPlanDataSource() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getPositionFiltering() != null)
            sb.append("PositionFiltering: " + getPositionFiltering() + ",");
        if (getEventBridgeEnabled() != null)
            sb.append("EventBridgeEnabled: " + getEventBridgeEnabled() + ",");
        if (getKmsKeyEnableGeospatialQueries() != null)
            sb.append("KmsKeyEnableGeospatialQueries: " + getKmsKeyEnableGeospatialQueries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        hashCode = prime * hashCode
                + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getPricingPlanDataSource() == null) ? 0 : getPricingPlanDataSource().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getPositionFiltering() == null) ? 0 : getPositionFiltering().hashCode());
        hashCode = prime * hashCode
                + ((getEventBridgeEnabled() == null) ? 0 : getEventBridgeEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getKmsKeyEnableGeospatialQueries() == null) ? 0
                        : getKmsKeyEnableGeospatialQueries().hashCode());
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

        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null
                && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null
                && other.getPricingPlan().equals(this.getPricingPlan()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPricingPlanDataSource() == null ^ this.getPricingPlanDataSource() == null)
            return false;
        if (other.getPricingPlanDataSource() != null
                && other.getPricingPlanDataSource().equals(this.getPricingPlanDataSource()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPositionFiltering() == null ^ this.getPositionFiltering() == null)
            return false;
        if (other.getPositionFiltering() != null
                && other.getPositionFiltering().equals(this.getPositionFiltering()) == false)
            return false;
        if (other.getEventBridgeEnabled() == null ^ this.getEventBridgeEnabled() == null)
            return false;
        if (other.getEventBridgeEnabled() != null
                && other.getEventBridgeEnabled().equals(this.getEventBridgeEnabled()) == false)
            return false;
        if (other.getKmsKeyEnableGeospatialQueries() == null
                ^ this.getKmsKeyEnableGeospatialQueries() == null)
            return false;
        if (other.getKmsKeyEnableGeospatialQueries() != null
                && other.getKmsKeyEnableGeospatialQueries().equals(
                        this.getKmsKeyEnableGeospatialQueries()) == false)
            return false;
        return true;
    }
}
