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

public class DescribeTrackerResult implements Serializable {
    /**
     * <p>
     * The name of the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     */
    private String trackerName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the tracker resource. Used when you
     * need to specify a resource across all Amazon Web Services.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example:
     * <code>arn:aws:geo:region:account-id:tracker/ExampleTracker</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-9
     * ]+)*)?){2}:([^/].*)?<br/>
     */
    private String trackerArn;

    /**
     * <p>
     * The optional description for the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * Always returns <code>RequestBasedUsage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     */
    private String pricingPlan;

    /**
     * <p>
     * No longer used. Always returns an empty string.
     * </p>
     */
    private String pricingPlanDataSource;

    /**
     * <p>
     * The tags associated with the tracker resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The timestamp for when the tracker resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The timestamp for when the tracker resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * A key identifier for an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >Amazon Web Services KMS customer managed key</a> assigned to the Amazon
     * Location resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The position filtering method of the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased, AccuracyBased
     */
    private String positionFiltering;

    /**
     * <p>
     * Whether <code>UPDATE</code> events from this tracker in EventBridge are
     * enabled. If set to <code>true</code> these events will be sent to
     * EventBridge.
     * </p>
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
     * The name of the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @return <p>
     *         The name of the tracker resource.
     *         </p>
     */
    public String getTrackerName() {
        return trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param trackerName <p>
     *            The name of the tracker resource.
     *            </p>
     */
    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param trackerName <p>
     *            The name of the tracker resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrackerResult withTrackerName(String trackerName) {
        this.trackerName = trackerName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the tracker resource. Used when you
     * need to specify a resource across all Amazon Web Services.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example:
     * <code>arn:aws:geo:region:account-id:tracker/ExampleTracker</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-9
     * ]+)*)?){2}:([^/].*)?<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the tracker resource. Used
     *         when you need to specify a resource across all Amazon Web
     *         Services.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format example:
     *         <code>arn:aws:geo:region:account-id:tracker/ExampleTracker</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getTrackerArn() {
        return trackerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the tracker resource. Used when you
     * need to specify a resource across all Amazon Web Services.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example:
     * <code>arn:aws:geo:region:account-id:tracker/ExampleTracker</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-9
     * ]+)*)?){2}:([^/].*)?<br/>
     *
     * @param trackerArn <p>
     *            The Amazon Resource Name (ARN) for the tracker resource. Used
     *            when you need to specify a resource across all Amazon Web
     *            Services.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Format example:
     *            <code>arn:aws:geo:region:account-id:tracker/ExampleTracker</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTrackerArn(String trackerArn) {
        this.trackerArn = trackerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the tracker resource. Used when you
     * need to specify a resource across all Amazon Web Services.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example:
     * <code>arn:aws:geo:region:account-id:tracker/ExampleTracker</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-9
     * ]+)*)?){2}:([^/].*)?<br/>
     *
     * @param trackerArn <p>
     *            The Amazon Resource Name (ARN) for the tracker resource. Used
     *            when you need to specify a resource across all Amazon Web
     *            Services.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Format example:
     *            <code>arn:aws:geo:region:account-id:tracker/ExampleTracker</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrackerResult withTrackerArn(String trackerArn) {
        this.trackerArn = trackerArn;
        return this;
    }

    /**
     * <p>
     * The optional description for the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         The optional description for the tracker resource.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The optional description for the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            The optional description for the tracker resource.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description for the tracker resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            The optional description for the tracker resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrackerResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Always returns <code>RequestBasedUsage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @return <p>
     *         Always returns <code>RequestBasedUsage</code>.
     *         </p>
     * @see PricingPlan
     */
    public String getPricingPlan() {
        return pricingPlan;
    }

    /**
     * <p>
     * Always returns <code>RequestBasedUsage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            Always returns <code>RequestBasedUsage</code>.
     *            </p>
     * @see PricingPlan
     */
    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * <p>
     * Always returns <code>RequestBasedUsage</code>.
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
     *            Always returns <code>RequestBasedUsage</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PricingPlan
     */
    public DescribeTrackerResult withPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
        return this;
    }

    /**
     * <p>
     * Always returns <code>RequestBasedUsage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RequestBasedUsage, MobileAssetTracking,
     * MobileAssetManagement
     *
     * @param pricingPlan <p>
     *            Always returns <code>RequestBasedUsage</code>.
     *            </p>
     * @see PricingPlan
     */
    public void setPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
    }

    /**
     * <p>
     * Always returns <code>RequestBasedUsage</code>.
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
     *            Always returns <code>RequestBasedUsage</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PricingPlan
     */
    public DescribeTrackerResult withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * No longer used. Always returns an empty string.
     * </p>
     *
     * @return <p>
     *         No longer used. Always returns an empty string.
     *         </p>
     */
    public String getPricingPlanDataSource() {
        return pricingPlanDataSource;
    }

    /**
     * <p>
     * No longer used. Always returns an empty string.
     * </p>
     *
     * @param pricingPlanDataSource <p>
     *            No longer used. Always returns an empty string.
     *            </p>
     */
    public void setPricingPlanDataSource(String pricingPlanDataSource) {
        this.pricingPlanDataSource = pricingPlanDataSource;
    }

    /**
     * <p>
     * No longer used. Always returns an empty string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pricingPlanDataSource <p>
     *            No longer used. Always returns an empty string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrackerResult withPricingPlanDataSource(String pricingPlanDataSource) {
        this.pricingPlanDataSource = pricingPlanDataSource;
        return this;
    }

    /**
     * <p>
     * The tags associated with the tracker resource.
     * </p>
     *
     * @return <p>
     *         The tags associated with the tracker resource.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the tracker resource.
     * </p>
     *
     * @param tags <p>
     *            The tags associated with the tracker resource.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags associated with the tracker resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with the tracker resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrackerResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags associated with the tracker resource.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrackerResult addTagsEntry(String key, String value) {
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
    public DescribeTrackerResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the tracker resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @return <p>
     *         The timestamp for when the tracker resource was created in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *         ISO 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The timestamp for when the tracker resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @param createTime <p>
     *            The timestamp for when the tracker resource was created in <a
     *            href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *            ISO 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp for when the tracker resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The timestamp for when the tracker resource was created in <a
     *            href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *            ISO 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrackerResult withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the tracker resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @return <p>
     *         The timestamp for when the tracker resource was last updated in
     *         <a href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *         ISO 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *         </p>
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    /**
     * <p>
     * The timestamp for when the tracker resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @param updateTime <p>
     *            The timestamp for when the tracker resource was last updated
     *            in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The timestamp for when the tracker resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateTime <p>
     *            The timestamp for when the tracker resource was last updated
     *            in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrackerResult withUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * <p>
     * A key identifier for an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >Amazon Web Services KMS customer managed key</a> assigned to the Amazon
     * Location resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         A key identifier for an <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     *         >Amazon Web Services KMS customer managed key</a> assigned to the
     *         Amazon Location resource.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * A key identifier for an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >Amazon Web Services KMS customer managed key</a> assigned to the Amazon
     * Location resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param kmsKeyId <p>
     *            A key identifier for an <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     *            >Amazon Web Services KMS customer managed key</a> assigned to
     *            the Amazon Location resource.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * A key identifier for an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html"
     * >Amazon Web Services KMS customer managed key</a> assigned to the Amazon
     * Location resource.
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
     *            >Amazon Web Services KMS customer managed key</a> assigned to
     *            the Amazon Location resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrackerResult withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The position filtering method of the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased, AccuracyBased
     *
     * @return <p>
     *         The position filtering method of the tracker resource.
     *         </p>
     * @see PositionFiltering
     */
    public String getPositionFiltering() {
        return positionFiltering;
    }

    /**
     * <p>
     * The position filtering method of the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased, AccuracyBased
     *
     * @param positionFiltering <p>
     *            The position filtering method of the tracker resource.
     *            </p>
     * @see PositionFiltering
     */
    public void setPositionFiltering(String positionFiltering) {
        this.positionFiltering = positionFiltering;
    }

    /**
     * <p>
     * The position filtering method of the tracker resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased, AccuracyBased
     *
     * @param positionFiltering <p>
     *            The position filtering method of the tracker resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PositionFiltering
     */
    public DescribeTrackerResult withPositionFiltering(String positionFiltering) {
        this.positionFiltering = positionFiltering;
        return this;
    }

    /**
     * <p>
     * The position filtering method of the tracker resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased, AccuracyBased
     *
     * @param positionFiltering <p>
     *            The position filtering method of the tracker resource.
     *            </p>
     * @see PositionFiltering
     */
    public void setPositionFiltering(PositionFiltering positionFiltering) {
        this.positionFiltering = positionFiltering.toString();
    }

    /**
     * <p>
     * The position filtering method of the tracker resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TimeBased, DistanceBased, AccuracyBased
     *
     * @param positionFiltering <p>
     *            The position filtering method of the tracker resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PositionFiltering
     */
    public DescribeTrackerResult withPositionFiltering(PositionFiltering positionFiltering) {
        this.positionFiltering = positionFiltering.toString();
        return this;
    }

    /**
     * <p>
     * Whether <code>UPDATE</code> events from this tracker in EventBridge are
     * enabled. If set to <code>true</code> these events will be sent to
     * EventBridge.
     * </p>
     *
     * @return <p>
     *         Whether <code>UPDATE</code> events from this tracker in
     *         EventBridge are enabled. If set to <code>true</code> these events
     *         will be sent to EventBridge.
     *         </p>
     */
    public Boolean isEventBridgeEnabled() {
        return eventBridgeEnabled;
    }

    /**
     * <p>
     * Whether <code>UPDATE</code> events from this tracker in EventBridge are
     * enabled. If set to <code>true</code> these events will be sent to
     * EventBridge.
     * </p>
     *
     * @return <p>
     *         Whether <code>UPDATE</code> events from this tracker in
     *         EventBridge are enabled. If set to <code>true</code> these events
     *         will be sent to EventBridge.
     *         </p>
     */
    public Boolean getEventBridgeEnabled() {
        return eventBridgeEnabled;
    }

    /**
     * <p>
     * Whether <code>UPDATE</code> events from this tracker in EventBridge are
     * enabled. If set to <code>true</code> these events will be sent to
     * EventBridge.
     * </p>
     *
     * @param eventBridgeEnabled <p>
     *            Whether <code>UPDATE</code> events from this tracker in
     *            EventBridge are enabled. If set to <code>true</code> these
     *            events will be sent to EventBridge.
     *            </p>
     */
    public void setEventBridgeEnabled(Boolean eventBridgeEnabled) {
        this.eventBridgeEnabled = eventBridgeEnabled;
    }

    /**
     * <p>
     * Whether <code>UPDATE</code> events from this tracker in EventBridge are
     * enabled. If set to <code>true</code> these events will be sent to
     * EventBridge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventBridgeEnabled <p>
     *            Whether <code>UPDATE</code> events from this tracker in
     *            EventBridge are enabled. If set to <code>true</code> these
     *            events will be sent to EventBridge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrackerResult withEventBridgeEnabled(Boolean eventBridgeEnabled) {
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
    public DescribeTrackerResult withKmsKeyEnableGeospatialQueries(
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
        if (getTrackerArn() != null)
            sb.append("TrackerArn: " + getTrackerArn() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: " + getPricingPlan() + ",");
        if (getPricingPlanDataSource() != null)
            sb.append("PricingPlanDataSource: " + getPricingPlanDataSource() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: " + getUpdateTime() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
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
        hashCode = prime * hashCode + ((getTrackerArn() == null) ? 0 : getTrackerArn().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime
                * hashCode
                + ((getPricingPlanDataSource() == null) ? 0 : getPricingPlanDataSource().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
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

        if (obj instanceof DescribeTrackerResult == false)
            return false;
        DescribeTrackerResult other = (DescribeTrackerResult) obj;

        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null
                && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        if (other.getTrackerArn() == null ^ this.getTrackerArn() == null)
            return false;
        if (other.getTrackerArn() != null
                && other.getTrackerArn().equals(this.getTrackerArn()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null
                && other.getUpdateTime().equals(this.getUpdateTime()) == false)
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
