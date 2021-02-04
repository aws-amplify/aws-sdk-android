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
 * Thing group indexing configuration.
 * </p>
 */
public class ThingGroupIndexingConfiguration implements Serializable {
    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     */
    private String thingGroupIndexingMode;

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the
     * Fleet Indexing service.
     * </p>
     */
    private java.util.List<Field> managedFields;

    /**
     * <p>
     * A list of thing group fields to index. This list cannot contain any
     * managed fields. Use the GetIndexingConfiguration API to get a list of
     * managed fields.
     * </p>
     * <p>
     * Contains custom field names and their data type.
     * </p>
     */
    private java.util.List<Field> customFields;

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @return <p>
     *         Thing group indexing mode.
     *         </p>
     * @see ThingGroupIndexingMode
     */
    public String getThingGroupIndexingMode() {
        return thingGroupIndexingMode;
    }

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @param thingGroupIndexingMode <p>
     *            Thing group indexing mode.
     *            </p>
     * @see ThingGroupIndexingMode
     */
    public void setThingGroupIndexingMode(String thingGroupIndexingMode) {
        this.thingGroupIndexingMode = thingGroupIndexingMode;
    }

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @param thingGroupIndexingMode <p>
     *            Thing group indexing mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThingGroupIndexingMode
     */
    public ThingGroupIndexingConfiguration withThingGroupIndexingMode(String thingGroupIndexingMode) {
        this.thingGroupIndexingMode = thingGroupIndexingMode;
        return this;
    }

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @param thingGroupIndexingMode <p>
     *            Thing group indexing mode.
     *            </p>
     * @see ThingGroupIndexingMode
     */
    public void setThingGroupIndexingMode(ThingGroupIndexingMode thingGroupIndexingMode) {
        this.thingGroupIndexingMode = thingGroupIndexingMode.toString();
    }

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @param thingGroupIndexingMode <p>
     *            Thing group indexing mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThingGroupIndexingMode
     */
    public ThingGroupIndexingConfiguration withThingGroupIndexingMode(
            ThingGroupIndexingMode thingGroupIndexingMode) {
        this.thingGroupIndexingMode = thingGroupIndexingMode.toString();
        return this;
    }

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the
     * Fleet Indexing service.
     * </p>
     *
     * @return <p>
     *         Contains fields that are indexed and whose types are already
     *         known by the Fleet Indexing service.
     *         </p>
     */
    public java.util.List<Field> getManagedFields() {
        return managedFields;
    }

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the
     * Fleet Indexing service.
     * </p>
     *
     * @param managedFields <p>
     *            Contains fields that are indexed and whose types are already
     *            known by the Fleet Indexing service.
     *            </p>
     */
    public void setManagedFields(java.util.Collection<Field> managedFields) {
        if (managedFields == null) {
            this.managedFields = null;
            return;
        }

        this.managedFields = new java.util.ArrayList<Field>(managedFields);
    }

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the
     * Fleet Indexing service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param managedFields <p>
     *            Contains fields that are indexed and whose types are already
     *            known by the Fleet Indexing service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingGroupIndexingConfiguration withManagedFields(Field... managedFields) {
        if (getManagedFields() == null) {
            this.managedFields = new java.util.ArrayList<Field>(managedFields.length);
        }
        for (Field value : managedFields) {
            this.managedFields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the
     * Fleet Indexing service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param managedFields <p>
     *            Contains fields that are indexed and whose types are already
     *            known by the Fleet Indexing service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingGroupIndexingConfiguration withManagedFields(
            java.util.Collection<Field> managedFields) {
        setManagedFields(managedFields);
        return this;
    }

    /**
     * <p>
     * A list of thing group fields to index. This list cannot contain any
     * managed fields. Use the GetIndexingConfiguration API to get a list of
     * managed fields.
     * </p>
     * <p>
     * Contains custom field names and their data type.
     * </p>
     *
     * @return <p>
     *         A list of thing group fields to index. This list cannot contain
     *         any managed fields. Use the GetIndexingConfiguration API to get a
     *         list of managed fields.
     *         </p>
     *         <p>
     *         Contains custom field names and their data type.
     *         </p>
     */
    public java.util.List<Field> getCustomFields() {
        return customFields;
    }

    /**
     * <p>
     * A list of thing group fields to index. This list cannot contain any
     * managed fields. Use the GetIndexingConfiguration API to get a list of
     * managed fields.
     * </p>
     * <p>
     * Contains custom field names and their data type.
     * </p>
     *
     * @param customFields <p>
     *            A list of thing group fields to index. This list cannot
     *            contain any managed fields. Use the GetIndexingConfiguration
     *            API to get a list of managed fields.
     *            </p>
     *            <p>
     *            Contains custom field names and their data type.
     *            </p>
     */
    public void setCustomFields(java.util.Collection<Field> customFields) {
        if (customFields == null) {
            this.customFields = null;
            return;
        }

        this.customFields = new java.util.ArrayList<Field>(customFields);
    }

    /**
     * <p>
     * A list of thing group fields to index. This list cannot contain any
     * managed fields. Use the GetIndexingConfiguration API to get a list of
     * managed fields.
     * </p>
     * <p>
     * Contains custom field names and their data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customFields <p>
     *            A list of thing group fields to index. This list cannot
     *            contain any managed fields. Use the GetIndexingConfiguration
     *            API to get a list of managed fields.
     *            </p>
     *            <p>
     *            Contains custom field names and their data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingGroupIndexingConfiguration withCustomFields(Field... customFields) {
        if (getCustomFields() == null) {
            this.customFields = new java.util.ArrayList<Field>(customFields.length);
        }
        for (Field value : customFields) {
            this.customFields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of thing group fields to index. This list cannot contain any
     * managed fields. Use the GetIndexingConfiguration API to get a list of
     * managed fields.
     * </p>
     * <p>
     * Contains custom field names and their data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customFields <p>
     *            A list of thing group fields to index. This list cannot
     *            contain any managed fields. Use the GetIndexingConfiguration
     *            API to get a list of managed fields.
     *            </p>
     *            <p>
     *            Contains custom field names and their data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingGroupIndexingConfiguration withCustomFields(java.util.Collection<Field> customFields) {
        setCustomFields(customFields);
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
        if (getThingGroupIndexingMode() != null)
            sb.append("thingGroupIndexingMode: " + getThingGroupIndexingMode() + ",");
        if (getManagedFields() != null)
            sb.append("managedFields: " + getManagedFields() + ",");
        if (getCustomFields() != null)
            sb.append("customFields: " + getCustomFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getThingGroupIndexingMode() == null) ? 0 : getThingGroupIndexingMode()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getManagedFields() == null) ? 0 : getManagedFields().hashCode());
        hashCode = prime * hashCode
                + ((getCustomFields() == null) ? 0 : getCustomFields().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingGroupIndexingConfiguration == false)
            return false;
        ThingGroupIndexingConfiguration other = (ThingGroupIndexingConfiguration) obj;

        if (other.getThingGroupIndexingMode() == null ^ this.getThingGroupIndexingMode() == null)
            return false;
        if (other.getThingGroupIndexingMode() != null
                && other.getThingGroupIndexingMode().equals(this.getThingGroupIndexingMode()) == false)
            return false;
        if (other.getManagedFields() == null ^ this.getManagedFields() == null)
            return false;
        if (other.getManagedFields() != null
                && other.getManagedFields().equals(this.getManagedFields()) == false)
            return false;
        if (other.getCustomFields() == null ^ this.getCustomFields() == null)
            return false;
        if (other.getCustomFields() != null
                && other.getCustomFields().equals(this.getCustomFields()) == false)
            return false;
        return true;
    }
}
