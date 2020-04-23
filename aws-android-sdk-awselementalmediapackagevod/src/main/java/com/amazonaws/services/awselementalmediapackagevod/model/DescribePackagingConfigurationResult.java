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

package com.amazonaws.services.awselementalmediapackagevod.model;

import java.io.Serializable;

public class DescribePackagingConfigurationResult implements Serializable {
    /**
     * The ARN of the PackagingConfiguration.
     */
    private String arn;

    /**
     * A CMAF packaging configuration.
     */
    private CmafPackage cmafPackage;

    /**
     * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
     */
    private DashPackage dashPackage;

    /**
     * An HTTP Live Streaming (HLS) packaging configuration.
     */
    private HlsPackage hlsPackage;

    /**
     * The ID of the PackagingConfiguration.
     */
    private String id;

    /**
     * A Microsoft Smooth Streaming (MSS) PackagingConfiguration.
     */
    private MssPackage mssPackage;

    /**
     * The ID of a PackagingGroup.
     */
    private String packagingGroupId;

    /**
     * A collection of tags associated with a resource
     */
    private java.util.Map<String, String> tags;

    /**
     * The ARN of the PackagingConfiguration.
     *
     * @return The ARN of the PackagingConfiguration.
     */
    public String getArn() {
        return arn;
    }

    /**
     * The ARN of the PackagingConfiguration.
     *
     * @param arn The ARN of the PackagingConfiguration.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The ARN of the PackagingConfiguration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn The ARN of the PackagingConfiguration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagingConfigurationResult withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * A CMAF packaging configuration.
     *
     * @return A CMAF packaging configuration.
     */
    public CmafPackage getCmafPackage() {
        return cmafPackage;
    }

    /**
     * A CMAF packaging configuration.
     *
     * @param cmafPackage A CMAF packaging configuration.
     */
    public void setCmafPackage(CmafPackage cmafPackage) {
        this.cmafPackage = cmafPackage;
    }

    /**
     * A CMAF packaging configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cmafPackage A CMAF packaging configuration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagingConfigurationResult withCmafPackage(CmafPackage cmafPackage) {
        this.cmafPackage = cmafPackage;
        return this;
    }

    /**
     * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
     *
     * @return A Dynamic Adaptive Streaming over HTTP (DASH) packaging
     *         configuration.
     */
    public DashPackage getDashPackage() {
        return dashPackage;
    }

    /**
     * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
     *
     * @param dashPackage A Dynamic Adaptive Streaming over HTTP (DASH)
     *            packaging configuration.
     */
    public void setDashPackage(DashPackage dashPackage) {
        this.dashPackage = dashPackage;
    }

    /**
     * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dashPackage A Dynamic Adaptive Streaming over HTTP (DASH)
     *            packaging configuration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagingConfigurationResult withDashPackage(DashPackage dashPackage) {
        this.dashPackage = dashPackage;
        return this;
    }

    /**
     * An HTTP Live Streaming (HLS) packaging configuration.
     *
     * @return An HTTP Live Streaming (HLS) packaging configuration.
     */
    public HlsPackage getHlsPackage() {
        return hlsPackage;
    }

    /**
     * An HTTP Live Streaming (HLS) packaging configuration.
     *
     * @param hlsPackage An HTTP Live Streaming (HLS) packaging configuration.
     */
    public void setHlsPackage(HlsPackage hlsPackage) {
        this.hlsPackage = hlsPackage;
    }

    /**
     * An HTTP Live Streaming (HLS) packaging configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hlsPackage An HTTP Live Streaming (HLS) packaging configuration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagingConfigurationResult withHlsPackage(HlsPackage hlsPackage) {
        this.hlsPackage = hlsPackage;
        return this;
    }

    /**
     * The ID of the PackagingConfiguration.
     *
     * @return The ID of the PackagingConfiguration.
     */
    public String getId() {
        return id;
    }

    /**
     * The ID of the PackagingConfiguration.
     *
     * @param id The ID of the PackagingConfiguration.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The ID of the PackagingConfiguration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id The ID of the PackagingConfiguration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagingConfigurationResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A Microsoft Smooth Streaming (MSS) PackagingConfiguration.
     *
     * @return A Microsoft Smooth Streaming (MSS) PackagingConfiguration.
     */
    public MssPackage getMssPackage() {
        return mssPackage;
    }

    /**
     * A Microsoft Smooth Streaming (MSS) PackagingConfiguration.
     *
     * @param mssPackage A Microsoft Smooth Streaming (MSS)
     *            PackagingConfiguration.
     */
    public void setMssPackage(MssPackage mssPackage) {
        this.mssPackage = mssPackage;
    }

    /**
     * A Microsoft Smooth Streaming (MSS) PackagingConfiguration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mssPackage A Microsoft Smooth Streaming (MSS)
     *            PackagingConfiguration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagingConfigurationResult withMssPackage(MssPackage mssPackage) {
        this.mssPackage = mssPackage;
        return this;
    }

    /**
     * The ID of a PackagingGroup.
     *
     * @return The ID of a PackagingGroup.
     */
    public String getPackagingGroupId() {
        return packagingGroupId;
    }

    /**
     * The ID of a PackagingGroup.
     *
     * @param packagingGroupId The ID of a PackagingGroup.
     */
    public void setPackagingGroupId(String packagingGroupId) {
        this.packagingGroupId = packagingGroupId;
    }

    /**
     * The ID of a PackagingGroup.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param packagingGroupId The ID of a PackagingGroup.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagingConfigurationResult withPackagingGroupId(String packagingGroupId) {
        this.packagingGroupId = packagingGroupId;
        return this;
    }

    /**
     * A collection of tags associated with a resource
     *
     * @return A collection of tags associated with a resource
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * A collection of tags associated with a resource
     *
     * @param tags A collection of tags associated with a resource
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * A collection of tags associated with a resource
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags A collection of tags associated with a resource
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagingConfigurationResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * A collection of tags associated with a resource
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagingConfigurationResult addTagsEntry(String key, String value) {
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
    public DescribePackagingConfigurationResult clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getCmafPackage() != null)
            sb.append("CmafPackage: " + getCmafPackage() + ",");
        if (getDashPackage() != null)
            sb.append("DashPackage: " + getDashPackage() + ",");
        if (getHlsPackage() != null)
            sb.append("HlsPackage: " + getHlsPackage() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getMssPackage() != null)
            sb.append("MssPackage: " + getMssPackage() + ",");
        if (getPackagingGroupId() != null)
            sb.append("PackagingGroupId: " + getPackagingGroupId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getCmafPackage() == null) ? 0 : getCmafPackage().hashCode());
        hashCode = prime * hashCode
                + ((getDashPackage() == null) ? 0 : getDashPackage().hashCode());
        hashCode = prime * hashCode + ((getHlsPackage() == null) ? 0 : getHlsPackage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMssPackage() == null) ? 0 : getMssPackage().hashCode());
        hashCode = prime * hashCode
                + ((getPackagingGroupId() == null) ? 0 : getPackagingGroupId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePackagingConfigurationResult == false)
            return false;
        DescribePackagingConfigurationResult other = (DescribePackagingConfigurationResult) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCmafPackage() == null ^ this.getCmafPackage() == null)
            return false;
        if (other.getCmafPackage() != null
                && other.getCmafPackage().equals(this.getCmafPackage()) == false)
            return false;
        if (other.getDashPackage() == null ^ this.getDashPackage() == null)
            return false;
        if (other.getDashPackage() != null
                && other.getDashPackage().equals(this.getDashPackage()) == false)
            return false;
        if (other.getHlsPackage() == null ^ this.getHlsPackage() == null)
            return false;
        if (other.getHlsPackage() != null
                && other.getHlsPackage().equals(this.getHlsPackage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMssPackage() == null ^ this.getMssPackage() == null)
            return false;
        if (other.getMssPackage() != null
                && other.getMssPackage().equals(this.getMssPackage()) == false)
            return false;
        if (other.getPackagingGroupId() == null ^ this.getPackagingGroupId() == null)
            return false;
        if (other.getPackagingGroupId() != null
                && other.getPackagingGroupId().equals(this.getPackagingGroupId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
