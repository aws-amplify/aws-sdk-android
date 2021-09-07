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
 * The thing indexing configuration. For more information, see <a href=
 * "https://docs.aws.amazon.com/iot/latest/developerguide/managing-index.html"
 * >Managing Thing Indexing</a>.
 * </p>
 */
public class ThingIndexingConfiguration implements Serializable {
    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, REGISTRY, REGISTRY_AND_SHADOW
     */
    private String thingIndexingMode;

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing
     * connectivity indexing, <i>thingIndexMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, STATUS
     */
    private String thingConnectivityIndexingMode;

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the
     * Fleet Indexing service.
     * </p>
     */
    private java.util.List<Field> managedFields;

    /**
     * <p>
     * Contains custom field names and their data type.
     * </p>
     */
    private java.util.List<Field> customFields;

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, REGISTRY, REGISTRY_AND_SHADOW
     *
     * @return <p>
     *         Thing indexing mode. Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         REGISTRY – Your thing index contains registry data only.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REGISTRY_AND_SHADOW - Your thing index contains registry and
     *         shadow data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OFF - Thing indexing is disabled.
     *         </p>
     *         </li>
     *         </ul>
     * @see ThingIndexingMode
     */
    public String getThingIndexingMode() {
        return thingIndexingMode;
    }

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, REGISTRY, REGISTRY_AND_SHADOW
     *
     * @param thingIndexingMode <p>
     *            Thing indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            REGISTRY – Your thing index contains registry data only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGISTRY_AND_SHADOW - Your thing index contains registry and
     *            shadow data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Thing indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @see ThingIndexingMode
     */
    public void setThingIndexingMode(String thingIndexingMode) {
        this.thingIndexingMode = thingIndexingMode;
    }

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, REGISTRY, REGISTRY_AND_SHADOW
     *
     * @param thingIndexingMode <p>
     *            Thing indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            REGISTRY – Your thing index contains registry data only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGISTRY_AND_SHADOW - Your thing index contains registry and
     *            shadow data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Thing indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThingIndexingMode
     */
    public ThingIndexingConfiguration withThingIndexingMode(String thingIndexingMode) {
        this.thingIndexingMode = thingIndexingMode;
        return this;
    }

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, REGISTRY, REGISTRY_AND_SHADOW
     *
     * @param thingIndexingMode <p>
     *            Thing indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            REGISTRY – Your thing index contains registry data only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGISTRY_AND_SHADOW - Your thing index contains registry and
     *            shadow data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Thing indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @see ThingIndexingMode
     */
    public void setThingIndexingMode(ThingIndexingMode thingIndexingMode) {
        this.thingIndexingMode = thingIndexingMode.toString();
    }

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, REGISTRY, REGISTRY_AND_SHADOW
     *
     * @param thingIndexingMode <p>
     *            Thing indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            REGISTRY – Your thing index contains registry data only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGISTRY_AND_SHADOW - Your thing index contains registry and
     *            shadow data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Thing indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThingIndexingMode
     */
    public ThingIndexingConfiguration withThingIndexingMode(ThingIndexingMode thingIndexingMode) {
        this.thingIndexingMode = thingIndexingMode.toString();
        return this;
    }

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing
     * connectivity indexing, <i>thingIndexMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, STATUS
     *
     * @return <p>
     *         Thing connectivity indexing mode. Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         STATUS – Your thing index contains connectivity status. To enable
     *         thing connectivity indexing, <i>thingIndexMode</i> must not be
     *         set to OFF.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OFF - Thing connectivity status indexing is disabled.
     *         </p>
     *         </li>
     *         </ul>
     * @see ThingConnectivityIndexingMode
     */
    public String getThingConnectivityIndexingMode() {
        return thingConnectivityIndexingMode;
    }

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing
     * connectivity indexing, <i>thingIndexMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, STATUS
     *
     * @param thingConnectivityIndexingMode <p>
     *            Thing connectivity indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            STATUS – Your thing index contains connectivity status. To
     *            enable thing connectivity indexing, <i>thingIndexMode</i> must
     *            not be set to OFF.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Thing connectivity status indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @see ThingConnectivityIndexingMode
     */
    public void setThingConnectivityIndexingMode(String thingConnectivityIndexingMode) {
        this.thingConnectivityIndexingMode = thingConnectivityIndexingMode;
    }

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing
     * connectivity indexing, <i>thingIndexMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, STATUS
     *
     * @param thingConnectivityIndexingMode <p>
     *            Thing connectivity indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            STATUS – Your thing index contains connectivity status. To
     *            enable thing connectivity indexing, <i>thingIndexMode</i> must
     *            not be set to OFF.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Thing connectivity status indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThingConnectivityIndexingMode
     */
    public ThingIndexingConfiguration withThingConnectivityIndexingMode(
            String thingConnectivityIndexingMode) {
        this.thingConnectivityIndexingMode = thingConnectivityIndexingMode;
        return this;
    }

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing
     * connectivity indexing, <i>thingIndexMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, STATUS
     *
     * @param thingConnectivityIndexingMode <p>
     *            Thing connectivity indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            STATUS – Your thing index contains connectivity status. To
     *            enable thing connectivity indexing, <i>thingIndexMode</i> must
     *            not be set to OFF.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Thing connectivity status indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @see ThingConnectivityIndexingMode
     */
    public void setThingConnectivityIndexingMode(
            ThingConnectivityIndexingMode thingConnectivityIndexingMode) {
        this.thingConnectivityIndexingMode = thingConnectivityIndexingMode.toString();
    }

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing
     * connectivity indexing, <i>thingIndexMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, STATUS
     *
     * @param thingConnectivityIndexingMode <p>
     *            Thing connectivity indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            STATUS – Your thing index contains connectivity status. To
     *            enable thing connectivity indexing, <i>thingIndexMode</i> must
     *            not be set to OFF.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Thing connectivity status indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThingConnectivityIndexingMode
     */
    public ThingIndexingConfiguration withThingConnectivityIndexingMode(
            ThingConnectivityIndexingMode thingConnectivityIndexingMode) {
        this.thingConnectivityIndexingMode = thingConnectivityIndexingMode.toString();
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
    public ThingIndexingConfiguration withManagedFields(Field... managedFields) {
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
    public ThingIndexingConfiguration withManagedFields(java.util.Collection<Field> managedFields) {
        setManagedFields(managedFields);
        return this;
    }

    /**
     * <p>
     * Contains custom field names and their data type.
     * </p>
     *
     * @return <p>
     *         Contains custom field names and their data type.
     *         </p>
     */
    public java.util.List<Field> getCustomFields() {
        return customFields;
    }

    /**
     * <p>
     * Contains custom field names and their data type.
     * </p>
     *
     * @param customFields <p>
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
     * Contains custom field names and their data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customFields <p>
     *            Contains custom field names and their data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingIndexingConfiguration withCustomFields(Field... customFields) {
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
     * Contains custom field names and their data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customFields <p>
     *            Contains custom field names and their data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingIndexingConfiguration withCustomFields(java.util.Collection<Field> customFields) {
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
        if (getThingIndexingMode() != null)
            sb.append("thingIndexingMode: " + getThingIndexingMode() + ",");
        if (getThingConnectivityIndexingMode() != null)
            sb.append("thingConnectivityIndexingMode: " + getThingConnectivityIndexingMode() + ",");
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

        hashCode = prime * hashCode
                + ((getThingIndexingMode() == null) ? 0 : getThingIndexingMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getThingConnectivityIndexingMode() == null) ? 0
                        : getThingConnectivityIndexingMode().hashCode());
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

        if (obj instanceof ThingIndexingConfiguration == false)
            return false;
        ThingIndexingConfiguration other = (ThingIndexingConfiguration) obj;

        if (other.getThingIndexingMode() == null ^ this.getThingIndexingMode() == null)
            return false;
        if (other.getThingIndexingMode() != null
                && other.getThingIndexingMode().equals(this.getThingIndexingMode()) == false)
            return false;
        if (other.getThingConnectivityIndexingMode() == null
                ^ this.getThingConnectivityIndexingMode() == null)
            return false;
        if (other.getThingConnectivityIndexingMode() != null
                && other.getThingConnectivityIndexingMode().equals(
                        this.getThingConnectivityIndexingMode()) == false)
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
