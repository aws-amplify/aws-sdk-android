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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * An asset property value entry containing the following information.
 * </p>
 */
public class PutAssetPropertyValueEntry implements Serializable {
    /**
     * <p>
     * Optional. A unique identifier for this entry that you can define to
     * better track which message caused an error in case of failure. Accepts
     * substitution templates. Defaults to a new UUID.
     * </p>
     */
    private String entryId;

    /**
     * <p>
     * The ID of the IoT SiteWise asset. You must specify either a
     * <code>propertyAlias</code> or both an <code>aliasId</code> and a
     * <code>propertyId</code>. Accepts substitution templates.
     * </p>
     */
    private String assetId;

    /**
     * <p>
     * The ID of the asset's property. You must specify either a
     * <code>propertyAlias</code> or both an <code>aliasId</code> and a
     * <code>propertyId</code>. Accepts substitution templates.
     * </p>
     */
    private String propertyId;

    /**
     * <p>
     * The name of the property alias associated with your asset property. You
     * must specify either a <code>propertyAlias</code> or both an
     * <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution
     * templates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String propertyAlias;

    /**
     * <p>
     * A list of property values to insert that each contain timestamp, quality,
     * and value (TQV) information.
     * </p>
     */
    private java.util.List<AssetPropertyValue> propertyValues;

    /**
     * <p>
     * Optional. A unique identifier for this entry that you can define to
     * better track which message caused an error in case of failure. Accepts
     * substitution templates. Defaults to a new UUID.
     * </p>
     *
     * @return <p>
     *         Optional. A unique identifier for this entry that you can define
     *         to better track which message caused an error in case of failure.
     *         Accepts substitution templates. Defaults to a new UUID.
     *         </p>
     */
    public String getEntryId() {
        return entryId;
    }

    /**
     * <p>
     * Optional. A unique identifier for this entry that you can define to
     * better track which message caused an error in case of failure. Accepts
     * substitution templates. Defaults to a new UUID.
     * </p>
     *
     * @param entryId <p>
     *            Optional. A unique identifier for this entry that you can
     *            define to better track which message caused an error in case
     *            of failure. Accepts substitution templates. Defaults to a new
     *            UUID.
     *            </p>
     */
    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * <p>
     * Optional. A unique identifier for this entry that you can define to
     * better track which message caused an error in case of failure. Accepts
     * substitution templates. Defaults to a new UUID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entryId <p>
     *            Optional. A unique identifier for this entry that you can
     *            define to better track which message caused an error in case
     *            of failure. Accepts substitution templates. Defaults to a new
     *            UUID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAssetPropertyValueEntry withEntryId(String entryId) {
        this.entryId = entryId;
        return this;
    }

    /**
     * <p>
     * The ID of the IoT SiteWise asset. You must specify either a
     * <code>propertyAlias</code> or both an <code>aliasId</code> and a
     * <code>propertyId</code>. Accepts substitution templates.
     * </p>
     *
     * @return <p>
     *         The ID of the IoT SiteWise asset. You must specify either a
     *         <code>propertyAlias</code> or both an <code>aliasId</code> and a
     *         <code>propertyId</code>. Accepts substitution templates.
     *         </p>
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * <p>
     * The ID of the IoT SiteWise asset. You must specify either a
     * <code>propertyAlias</code> or both an <code>aliasId</code> and a
     * <code>propertyId</code>. Accepts substitution templates.
     * </p>
     *
     * @param assetId <p>
     *            The ID of the IoT SiteWise asset. You must specify either a
     *            <code>propertyAlias</code> or both an <code>aliasId</code> and
     *            a <code>propertyId</code>. Accepts substitution templates.
     *            </p>
     */
    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the IoT SiteWise asset. You must specify either a
     * <code>propertyAlias</code> or both an <code>aliasId</code> and a
     * <code>propertyId</code>. Accepts substitution templates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetId <p>
     *            The ID of the IoT SiteWise asset. You must specify either a
     *            <code>propertyAlias</code> or both an <code>aliasId</code> and
     *            a <code>propertyId</code>. Accepts substitution templates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAssetPropertyValueEntry withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * <p>
     * The ID of the asset's property. You must specify either a
     * <code>propertyAlias</code> or both an <code>aliasId</code> and a
     * <code>propertyId</code>. Accepts substitution templates.
     * </p>
     *
     * @return <p>
     *         The ID of the asset's property. You must specify either a
     *         <code>propertyAlias</code> or both an <code>aliasId</code> and a
     *         <code>propertyId</code>. Accepts substitution templates.
     *         </p>
     */
    public String getPropertyId() {
        return propertyId;
    }

    /**
     * <p>
     * The ID of the asset's property. You must specify either a
     * <code>propertyAlias</code> or both an <code>aliasId</code> and a
     * <code>propertyId</code>. Accepts substitution templates.
     * </p>
     *
     * @param propertyId <p>
     *            The ID of the asset's property. You must specify either a
     *            <code>propertyAlias</code> or both an <code>aliasId</code> and
     *            a <code>propertyId</code>. Accepts substitution templates.
     *            </p>
     */
    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * <p>
     * The ID of the asset's property. You must specify either a
     * <code>propertyAlias</code> or both an <code>aliasId</code> and a
     * <code>propertyId</code>. Accepts substitution templates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propertyId <p>
     *            The ID of the asset's property. You must specify either a
     *            <code>propertyAlias</code> or both an <code>aliasId</code> and
     *            a <code>propertyId</code>. Accepts substitution templates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAssetPropertyValueEntry withPropertyId(String propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    /**
     * <p>
     * The name of the property alias associated with your asset property. You
     * must specify either a <code>propertyAlias</code> or both an
     * <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution
     * templates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The name of the property alias associated with your asset
     *         property. You must specify either a <code>propertyAlias</code> or
     *         both an <code>aliasId</code> and a <code>propertyId</code>.
     *         Accepts substitution templates.
     *         </p>
     */
    public String getPropertyAlias() {
        return propertyAlias;
    }

    /**
     * <p>
     * The name of the property alias associated with your asset property. You
     * must specify either a <code>propertyAlias</code> or both an
     * <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution
     * templates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param propertyAlias <p>
     *            The name of the property alias associated with your asset
     *            property. You must specify either a <code>propertyAlias</code>
     *            or both an <code>aliasId</code> and a <code>propertyId</code>.
     *            Accepts substitution templates.
     *            </p>
     */
    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    /**
     * <p>
     * The name of the property alias associated with your asset property. You
     * must specify either a <code>propertyAlias</code> or both an
     * <code>aliasId</code> and a <code>propertyId</code>. Accepts substitution
     * templates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param propertyAlias <p>
     *            The name of the property alias associated with your asset
     *            property. You must specify either a <code>propertyAlias</code>
     *            or both an <code>aliasId</code> and a <code>propertyId</code>.
     *            Accepts substitution templates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAssetPropertyValueEntry withPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
        return this;
    }

    /**
     * <p>
     * A list of property values to insert that each contain timestamp, quality,
     * and value (TQV) information.
     * </p>
     *
     * @return <p>
     *         A list of property values to insert that each contain timestamp,
     *         quality, and value (TQV) information.
     *         </p>
     */
    public java.util.List<AssetPropertyValue> getPropertyValues() {
        return propertyValues;
    }

    /**
     * <p>
     * A list of property values to insert that each contain timestamp, quality,
     * and value (TQV) information.
     * </p>
     *
     * @param propertyValues <p>
     *            A list of property values to insert that each contain
     *            timestamp, quality, and value (TQV) information.
     *            </p>
     */
    public void setPropertyValues(java.util.Collection<AssetPropertyValue> propertyValues) {
        if (propertyValues == null) {
            this.propertyValues = null;
            return;
        }

        this.propertyValues = new java.util.ArrayList<AssetPropertyValue>(propertyValues);
    }

    /**
     * <p>
     * A list of property values to insert that each contain timestamp, quality,
     * and value (TQV) information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propertyValues <p>
     *            A list of property values to insert that each contain
     *            timestamp, quality, and value (TQV) information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAssetPropertyValueEntry withPropertyValues(AssetPropertyValue... propertyValues) {
        if (getPropertyValues() == null) {
            this.propertyValues = new java.util.ArrayList<AssetPropertyValue>(propertyValues.length);
        }
        for (AssetPropertyValue value : propertyValues) {
            this.propertyValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of property values to insert that each contain timestamp, quality,
     * and value (TQV) information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propertyValues <p>
     *            A list of property values to insert that each contain
     *            timestamp, quality, and value (TQV) information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAssetPropertyValueEntry withPropertyValues(
            java.util.Collection<AssetPropertyValue> propertyValues) {
        setPropertyValues(propertyValues);
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
        if (getEntryId() != null)
            sb.append("entryId: " + getEntryId() + ",");
        if (getAssetId() != null)
            sb.append("assetId: " + getAssetId() + ",");
        if (getPropertyId() != null)
            sb.append("propertyId: " + getPropertyId() + ",");
        if (getPropertyAlias() != null)
            sb.append("propertyAlias: " + getPropertyAlias() + ",");
        if (getPropertyValues() != null)
            sb.append("propertyValues: " + getPropertyValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryId() == null) ? 0 : getEntryId().hashCode());
        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        hashCode = prime * hashCode
                + ((getPropertyAlias() == null) ? 0 : getPropertyAlias().hashCode());
        hashCode = prime * hashCode
                + ((getPropertyValues() == null) ? 0 : getPropertyValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAssetPropertyValueEntry == false)
            return false;
        PutAssetPropertyValueEntry other = (PutAssetPropertyValueEntry) obj;

        if (other.getEntryId() == null ^ this.getEntryId() == null)
            return false;
        if (other.getEntryId() != null && other.getEntryId().equals(this.getEntryId()) == false)
            return false;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getPropertyId() == null ^ this.getPropertyId() == null)
            return false;
        if (other.getPropertyId() != null
                && other.getPropertyId().equals(this.getPropertyId()) == false)
            return false;
        if (other.getPropertyAlias() == null ^ this.getPropertyAlias() == null)
            return false;
        if (other.getPropertyAlias() != null
                && other.getPropertyAlias().equals(this.getPropertyAlias()) == false)
            return false;
        if (other.getPropertyValues() == null ^ this.getPropertyValues() == null)
            return false;
        if (other.getPropertyValues() != null
                && other.getPropertyValues().equals(this.getPropertyValues()) == false)
            return false;
        return true;
    }
}
