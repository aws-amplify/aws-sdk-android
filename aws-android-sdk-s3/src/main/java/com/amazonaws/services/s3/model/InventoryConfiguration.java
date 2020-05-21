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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the inventory configuration for an Amazon S3 bucket. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html"
 * >GET Bucket inventory</a> in the <i>Amazon Simple Storage Service API
 * Reference</i>.
 * </p>
 */
public class InventoryConfiguration implements Serializable {
    /**
     * <p>
     * Contains information about where to publish the inventory results.
     * </p>
     */
    private InventoryDestination destination;

    /**
     * <p>
     * Specifies whether the inventory is enabled or disabled. If set to
     * <code>True</code>, an inventory list is generated. If set to
     * <code>False</code>, no inventory list is generated.
     * </p>
     */
    private Boolean isEnabled;

    /**
     * <p>
     * Specifies an inventory filter. The inventory only includes objects that
     * meet the filter's criteria.
     * </p>
     */
    private InventoryFilter filter;

    /**
     * <p>
     * The ID used to identify the inventory configuration.
     * </p>
     */
    private String id;

    /**
     * <p>
     * Object versions to include in the inventory list. If set to
     * <code>All</code>, the list includes all the object versions, which adds
     * the version-related fields <code>VersionId</code>, <code>IsLatest</code>,
     * and <code>DeleteMarker</code> to the list. If set to <code>Current</code>
     * , the list does not contain these version-related fields.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>All, Current
     */
    private String includedObjectVersions;

    /**
     * <p>
     * Contains the optional fields that are included in the inventory results.
     * </p>
     */
    private java.util.List<String> optionalFields;

    /**
     * <p>
     * Specifies the schedule for generating inventory results.
     * </p>
     */
    private InventorySchedule schedule;

    /**
     * <p>
     * Contains information about where to publish the inventory results.
     * </p>
     *
     * @return <p>
     *         Contains information about where to publish the inventory
     *         results.
     *         </p>
     */
    public InventoryDestination getDestination() {
        return destination;
    }

    /**
     * <p>
     * Contains information about where to publish the inventory results.
     * </p>
     *
     * @param destination <p>
     *            Contains information about where to publish the inventory
     *            results.
     *            </p>
     */
    public void setDestination(InventoryDestination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * Contains information about where to publish the inventory results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destination <p>
     *            Contains information about where to publish the inventory
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryConfiguration withDestination(InventoryDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * <p>
     * Specifies whether the inventory is enabled or disabled. If set to
     * <code>True</code>, an inventory list is generated. If set to
     * <code>False</code>, no inventory list is generated.
     * </p>
     *
     * @return <p>
     *         Specifies whether the inventory is enabled or disabled. If set to
     *         <code>True</code>, an inventory list is generated. If set to
     *         <code>False</code>, no inventory list is generated.
     *         </p>
     */
    public Boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * <p>
     * Specifies whether the inventory is enabled or disabled. If set to
     * <code>True</code>, an inventory list is generated. If set to
     * <code>False</code>, no inventory list is generated.
     * </p>
     *
     * @return <p>
     *         Specifies whether the inventory is enabled or disabled. If set to
     *         <code>True</code>, an inventory list is generated. If set to
     *         <code>False</code>, no inventory list is generated.
     *         </p>
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * <p>
     * Specifies whether the inventory is enabled or disabled. If set to
     * <code>True</code>, an inventory list is generated. If set to
     * <code>False</code>, no inventory list is generated.
     * </p>
     *
     * @param isEnabled <p>
     *            Specifies whether the inventory is enabled or disabled. If set
     *            to <code>True</code>, an inventory list is generated. If set
     *            to <code>False</code>, no inventory list is generated.
     *            </p>
     */
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * <p>
     * Specifies whether the inventory is enabled or disabled. If set to
     * <code>True</code>, an inventory list is generated. If set to
     * <code>False</code>, no inventory list is generated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isEnabled <p>
     *            Specifies whether the inventory is enabled or disabled. If set
     *            to <code>True</code>, an inventory list is generated. If set
     *            to <code>False</code>, no inventory list is generated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryConfiguration withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * <p>
     * Specifies an inventory filter. The inventory only includes objects that
     * meet the filter's criteria.
     * </p>
     *
     * @return <p>
     *         Specifies an inventory filter. The inventory only includes
     *         objects that meet the filter's criteria.
     *         </p>
     */
    public InventoryFilter getFilter() {
        return filter;
    }

    /**
     * <p>
     * Specifies an inventory filter. The inventory only includes objects that
     * meet the filter's criteria.
     * </p>
     *
     * @param filter <p>
     *            Specifies an inventory filter. The inventory only includes
     *            objects that meet the filter's criteria.
     *            </p>
     */
    public void setFilter(InventoryFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Specifies an inventory filter. The inventory only includes objects that
     * meet the filter's criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            Specifies an inventory filter. The inventory only includes
     *            objects that meet the filter's criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryConfiguration withFilter(InventoryFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * The ID used to identify the inventory configuration.
     * </p>
     *
     * @return <p>
     *         The ID used to identify the inventory configuration.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID used to identify the inventory configuration.
     * </p>
     *
     * @param id <p>
     *            The ID used to identify the inventory configuration.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID used to identify the inventory configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The ID used to identify the inventory configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryConfiguration withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * Object versions to include in the inventory list. If set to
     * <code>All</code>, the list includes all the object versions, which adds
     * the version-related fields <code>VersionId</code>, <code>IsLatest</code>,
     * and <code>DeleteMarker</code> to the list. If set to <code>Current</code>
     * , the list does not contain these version-related fields.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>All, Current
     *
     * @return <p>
     *         Object versions to include in the inventory list. If set to
     *         <code>All</code>, the list includes all the object versions,
     *         which adds the version-related fields <code>VersionId</code>,
     *         <code>IsLatest</code>, and <code>DeleteMarker</code> to the list.
     *         If set to <code>Current</code>, the list does not contain these
     *         version-related fields.
     *         </p>
     * @see InventoryIncludedObjectVersions
     */
    public String getIncludedObjectVersions() {
        return includedObjectVersions;
    }

    /**
     * <p>
     * Object versions to include in the inventory list. If set to
     * <code>All</code>, the list includes all the object versions, which adds
     * the version-related fields <code>VersionId</code>, <code>IsLatest</code>,
     * and <code>DeleteMarker</code> to the list. If set to <code>Current</code>
     * , the list does not contain these version-related fields.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>All, Current
     *
     * @param includedObjectVersions <p>
     *            Object versions to include in the inventory list. If set to
     *            <code>All</code>, the list includes all the object versions,
     *            which adds the version-related fields <code>VersionId</code>,
     *            <code>IsLatest</code>, and <code>DeleteMarker</code> to the
     *            list. If set to <code>Current</code>, the list does not
     *            contain these version-related fields.
     *            </p>
     * @see InventoryIncludedObjectVersions
     */
    public void setIncludedObjectVersions(String includedObjectVersions) {
        this.includedObjectVersions = includedObjectVersions;
    }

    /**
     * <p>
     * Object versions to include in the inventory list. If set to
     * <code>All</code>, the list includes all the object versions, which adds
     * the version-related fields <code>VersionId</code>, <code>IsLatest</code>,
     * and <code>DeleteMarker</code> to the list. If set to <code>Current</code>
     * , the list does not contain these version-related fields.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>All, Current
     *
     * @param includedObjectVersions <p>
     *            Object versions to include in the inventory list. If set to
     *            <code>All</code>, the list includes all the object versions,
     *            which adds the version-related fields <code>VersionId</code>,
     *            <code>IsLatest</code>, and <code>DeleteMarker</code> to the
     *            list. If set to <code>Current</code>, the list does not
     *            contain these version-related fields.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InventoryIncludedObjectVersions
     */
    public InventoryConfiguration withIncludedObjectVersions(String includedObjectVersions) {
        this.includedObjectVersions = includedObjectVersions;
        return this;
    }

    /**
     * <p>
     * Object versions to include in the inventory list. If set to
     * <code>All</code>, the list includes all the object versions, which adds
     * the version-related fields <code>VersionId</code>, <code>IsLatest</code>,
     * and <code>DeleteMarker</code> to the list. If set to <code>Current</code>
     * , the list does not contain these version-related fields.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>All, Current
     *
     * @param includedObjectVersions <p>
     *            Object versions to include in the inventory list. If set to
     *            <code>All</code>, the list includes all the object versions,
     *            which adds the version-related fields <code>VersionId</code>,
     *            <code>IsLatest</code>, and <code>DeleteMarker</code> to the
     *            list. If set to <code>Current</code>, the list does not
     *            contain these version-related fields.
     *            </p>
     * @see InventoryIncludedObjectVersions
     */
    public void setIncludedObjectVersions(InventoryIncludedObjectVersions includedObjectVersions) {
        this.includedObjectVersions = includedObjectVersions.toString();
    }

    /**
     * <p>
     * Object versions to include in the inventory list. If set to
     * <code>All</code>, the list includes all the object versions, which adds
     * the version-related fields <code>VersionId</code>, <code>IsLatest</code>,
     * and <code>DeleteMarker</code> to the list. If set to <code>Current</code>
     * , the list does not contain these version-related fields.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>All, Current
     *
     * @param includedObjectVersions <p>
     *            Object versions to include in the inventory list. If set to
     *            <code>All</code>, the list includes all the object versions,
     *            which adds the version-related fields <code>VersionId</code>,
     *            <code>IsLatest</code>, and <code>DeleteMarker</code> to the
     *            list. If set to <code>Current</code>, the list does not
     *            contain these version-related fields.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InventoryIncludedObjectVersions
     */
    public InventoryConfiguration withIncludedObjectVersions(
            InventoryIncludedObjectVersions includedObjectVersions) {
        this.includedObjectVersions = includedObjectVersions.toString();
        return this;
    }

    /**
     * <p>
     * Contains the optional fields that are included in the inventory results.
     * </p>
     *
     * @return <p>
     *         Contains the optional fields that are included in the inventory
     *         results.
     *         </p>
     */
    public java.util.List<String> getOptionalFields() {
        return optionalFields;
    }

    /**
     * <p>
     * Contains the optional fields that are included in the inventory results.
     * </p>
     *
     * @param optionalFields <p>
     *            Contains the optional fields that are included in the
     *            inventory results.
     *            </p>
     */
    public void setOptionalFields(java.util.Collection<String> optionalFields) {
        if (optionalFields == null) {
            this.optionalFields = null;
            return;
        }

        this.optionalFields = new java.util.ArrayList<String>(optionalFields);
    }

    /**
     * <p>
     * Contains the optional fields that are included in the inventory results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionalFields <p>
     *            Contains the optional fields that are included in the
     *            inventory results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryConfiguration withOptionalFields(String... optionalFields) {
        if (getOptionalFields() == null) {
            this.optionalFields = new java.util.ArrayList<String>(optionalFields.length);
        }
        for (String value : optionalFields) {
            this.optionalFields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains the optional fields that are included in the inventory results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionalFields <p>
     *            Contains the optional fields that are included in the
     *            inventory results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryConfiguration withOptionalFields(java.util.Collection<String> optionalFields) {
        setOptionalFields(optionalFields);
        return this;
    }

    /**
     * <p>
     * Specifies the schedule for generating inventory results.
     * </p>
     *
     * @return <p>
     *         Specifies the schedule for generating inventory results.
     *         </p>
     */
    public InventorySchedule getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * Specifies the schedule for generating inventory results.
     * </p>
     *
     * @param schedule <p>
     *            Specifies the schedule for generating inventory results.
     *            </p>
     */
    public void setSchedule(InventorySchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * Specifies the schedule for generating inventory results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedule <p>
     *            Specifies the schedule for generating inventory results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryConfiguration withSchedule(InventorySchedule schedule) {
        this.schedule = schedule;
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
        if (getDestination() != null)
            sb.append("Destination: " + getDestination() + ",");
        if (getIsEnabled() != null)
            sb.append("IsEnabled: " + getIsEnabled() + ",");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getIncludedObjectVersions() != null)
            sb.append("IncludedObjectVersions: " + getIncludedObjectVersions() + ",");
        if (getOptionalFields() != null)
            sb.append("OptionalFields: " + getOptionalFields() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getIsEnabled() == null) ? 0 : getIsEnabled().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludedObjectVersions() == null) ? 0 : getIncludedObjectVersions()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getOptionalFields() == null) ? 0 : getOptionalFields().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryConfiguration == false)
            return false;
        InventoryConfiguration other = (InventoryConfiguration) obj;

        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getIsEnabled() == null ^ this.getIsEnabled() == null)
            return false;
        if (other.getIsEnabled() != null
                && other.getIsEnabled().equals(this.getIsEnabled()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIncludedObjectVersions() == null ^ this.getIncludedObjectVersions() == null)
            return false;
        if (other.getIncludedObjectVersions() != null
                && other.getIncludedObjectVersions().equals(this.getIncludedObjectVersions()) == false)
            return false;
        if (other.getOptionalFields() == null ^ this.getOptionalFields() == null)
            return false;
        if (other.getOptionalFields() != null
                && other.getOptionalFields().equals(this.getOptionalFields()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        return true;
    }
}
