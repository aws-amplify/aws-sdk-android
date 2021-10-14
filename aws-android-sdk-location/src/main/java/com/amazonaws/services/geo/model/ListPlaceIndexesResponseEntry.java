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

/**
 * <p>
 * A place index resource listed in your AWS account.
 * </p>
 */
public class ListPlaceIndexesResponseEntry implements Serializable {
    /**
     * <p>
     * The timestamp for when the place index resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The data provider of geospatial data. Indicates one of the available
     * providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details on data providers, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Amazon Location Service data providers</a>.
     * </p>
     */
    private String dataSource;

    /**
     * <p>
     * The optional description for the place index resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * The name of the place index resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String indexName;

    /**
     * <p>
     * The pricing plan for the specified place index resource.
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
     * The timestamp for when the place index resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The timestamp for when the place index resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @return <p>
     *         The timestamp for when the place index resource was created in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *         8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The timestamp for when the place index resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @param createTime <p>
     *            The timestamp for when the place index resource was created in
     *            <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp for when the place index resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The timestamp for when the place index resource was created in
     *            <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlaceIndexesResponseEntry withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The data provider of geospatial data. Indicates one of the available
     * providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details on data providers, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Amazon Location Service data providers</a>.
     * </p>
     *
     * @return <p>
     *         The data provider of geospatial data. Indicates one of the
     *         available providers:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Esri</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Here</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For additional details on data providers, see <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     *         >Amazon Location Service data providers</a>.
     *         </p>
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * <p>
     * The data provider of geospatial data. Indicates one of the available
     * providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details on data providers, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Amazon Location Service data providers</a>.
     * </p>
     *
     * @param dataSource <p>
     *            The data provider of geospatial data. Indicates one of the
     *            available providers:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Esri</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Here</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For additional details on data providers, see <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     *            >Amazon Location Service data providers</a>.
     *            </p>
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The data provider of geospatial data. Indicates one of the available
     * providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details on data providers, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Amazon Location Service data providers</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSource <p>
     *            The data provider of geospatial data. Indicates one of the
     *            available providers:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Esri</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Here</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For additional details on data providers, see <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     *            >Amazon Location Service data providers</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlaceIndexesResponseEntry withDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * <p>
     * The optional description for the place index resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         The optional description for the place index resource.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The optional description for the place index resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            The optional description for the place index resource.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description for the place index resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            The optional description for the place index resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlaceIndexesResponseEntry withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The name of the place index resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The name of the place index resource.
     *         </p>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * The name of the place index resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param indexName <p>
     *            The name of the place index resource.
     *            </p>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the place index resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param indexName <p>
     *            The name of the place index resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlaceIndexesResponseEntry withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * The pricing plan for the specified place index resource.
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
     *         The pricing plan for the specified place index resource.
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
     * The pricing plan for the specified place index resource.
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
     *            The pricing plan for the specified place index resource.
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
     * The pricing plan for the specified place index resource.
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
     *            The pricing plan for the specified place index resource.
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
    public ListPlaceIndexesResponseEntry withPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
        return this;
    }

    /**
     * <p>
     * The pricing plan for the specified place index resource.
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
     *            The pricing plan for the specified place index resource.
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
     * The pricing plan for the specified place index resource.
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
     *            The pricing plan for the specified place index resource.
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
    public ListPlaceIndexesResponseEntry withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp for when the place index resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @return <p>
     *         The timestamp for when the place index resource was last updated
     *         in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *         8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *         </p>
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    /**
     * <p>
     * The timestamp for when the place index resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @param updateTime <p>
     *            The timestamp for when the place index resource was last
     *            updated in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The timestamp for when the place index resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateTime <p>
     *            The timestamp for when the place index resource was last
     *            updated in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlaceIndexesResponseEntry withUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
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
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getDataSource() != null)
            sb.append("DataSource: " + getDataSource() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getIndexName() != null)
            sb.append("IndexName: " + getIndexName() + ",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: " + getPricingPlan() + ",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: " + getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode
                + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPlaceIndexesResponseEntry == false)
            return false;
        ListPlaceIndexesResponseEntry other = (ListPlaceIndexesResponseEntry) obj;

        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null
                && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null
                && other.getPricingPlan().equals(this.getPricingPlan()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null
                && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }
}
