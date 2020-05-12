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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

/**
 * <p>
 * Contains a list of value updates for an asset property in the list of asset
 * entries consumed by the <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchPutAssetPropertyValue.html"
 * >BatchPutAssetPropertyValue</a> API.
 * </p>
 */
public class PutAssetPropertyValueEntry implements Serializable {
    /**
     * <p>
     * The user specified ID for the entry. You can use this ID to identify
     * which entries failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     */
    private String entryId;

    /**
     * <p>
     * The ID of the asset to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String assetId;

    /**
     * <p>
     * The ID of the asset property for this entry.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String propertyId;

    /**
     * <p>
     * The property alias that identifies the property, such as an OPC-UA server
     * data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     * >Mapping Industrial Data Streams to Asset Properties</a> in the <i>AWS
     * IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String propertyAlias;

    /**
     * <p>
     * The list of property values to upload. You can specify up to 10
     * <code>propertyValues</code> array elements.
     * </p>
     */
    private java.util.List<AssetPropertyValue> propertyValues;

    /**
     * <p>
     * The user specified ID for the entry. You can use this ID to identify
     * which entries failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     *
     * @return <p>
     *         The user specified ID for the entry. You can use this ID to
     *         identify which entries failed.
     *         </p>
     */
    public String getEntryId() {
        return entryId;
    }

    /**
     * <p>
     * The user specified ID for the entry. You can use this ID to identify
     * which entries failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     *
     * @param entryId <p>
     *            The user specified ID for the entry. You can use this ID to
     *            identify which entries failed.
     *            </p>
     */
    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * <p>
     * The user specified ID for the entry. You can use this ID to identify
     * which entries failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     *
     * @param entryId <p>
     *            The user specified ID for the entry. You can use this ID to
     *            identify which entries failed.
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
     * The ID of the asset to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset to update.
     *         </p>
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * <p>
     * The ID of the asset to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param assetId <p>
     *            The ID of the asset to update.
     *            </p>
     */
    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param assetId <p>
     *            The ID of the asset to update.
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
     * The ID of the asset property for this entry.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the asset property for this entry.
     *         </p>
     */
    public String getPropertyId() {
        return propertyId;
    }

    /**
     * <p>
     * The ID of the asset property for this entry.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param propertyId <p>
     *            The ID of the asset property for this entry.
     *            </p>
     */
    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * <p>
     * The ID of the asset property for this entry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param propertyId <p>
     *            The ID of the asset property for this entry.
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
     * The property alias that identifies the property, such as an OPC-UA server
     * data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     * >Mapping Industrial Data Streams to Asset Properties</a> in the <i>AWS
     * IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         The property alias that identifies the property, such as an
     *         OPC-UA server data stream path (for example,
     *         <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     *         >Mapping Industrial Data Streams to Asset Properties</a> in the
     *         <i>AWS IoT SiteWise User Guide</i>.
     *         </p>
     */
    public String getPropertyAlias() {
        return propertyAlias;
    }

    /**
     * <p>
     * The property alias that identifies the property, such as an OPC-UA server
     * data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     * >Mapping Industrial Data Streams to Asset Properties</a> in the <i>AWS
     * IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param propertyAlias <p>
     *            The property alias that identifies the property, such as an
     *            OPC-UA server data stream path (for example,
     *            <code>/company/windfarm/3/turbine/7/temperature</code>). For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     *            >Mapping Industrial Data Streams to Asset Properties</a> in
     *            the <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     */
    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    /**
     * <p>
     * The property alias that identifies the property, such as an OPC-UA server
     * data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     * >Mapping Industrial Data Streams to Asset Properties</a> in the <i>AWS
     * IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param propertyAlias <p>
     *            The property alias that identifies the property, such as an
     *            OPC-UA server data stream path (for example,
     *            <code>/company/windfarm/3/turbine/7/temperature</code>). For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html"
     *            >Mapping Industrial Data Streams to Asset Properties</a> in
     *            the <i>AWS IoT SiteWise User Guide</i>.
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
     * The list of property values to upload. You can specify up to 10
     * <code>propertyValues</code> array elements.
     * </p>
     *
     * @return <p>
     *         The list of property values to upload. You can specify up to 10
     *         <code>propertyValues</code> array elements.
     *         </p>
     */
    public java.util.List<AssetPropertyValue> getPropertyValues() {
        return propertyValues;
    }

    /**
     * <p>
     * The list of property values to upload. You can specify up to 10
     * <code>propertyValues</code> array elements.
     * </p>
     *
     * @param propertyValues <p>
     *            The list of property values to upload. You can specify up to
     *            10 <code>propertyValues</code> array elements.
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
     * The list of property values to upload. You can specify up to 10
     * <code>propertyValues</code> array elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propertyValues <p>
     *            The list of property values to upload. You can specify up to
     *            10 <code>propertyValues</code> array elements.
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
     * The list of property values to upload. You can specify up to 10
     * <code>propertyValues</code> array elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propertyValues <p>
     *            The list of property values to upload. You can specify up to
     *            10 <code>propertyValues</code> array elements.
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
