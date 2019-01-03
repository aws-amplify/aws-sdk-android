/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Thing group properties.
 * </p>
 */
public class ThingGroupProperties implements Serializable {
    /**
     * <p>
     * The thing group description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     */
    private String thingGroupDescription;

    /**
     * <p>
     * The thing group attributes in JSON format.
     * </p>
     */
    private AttributePayload attributePayload;

    /**
     * <p>
     * The thing group description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @return <p>
     *         The thing group description.
     *         </p>
     */
    public String getThingGroupDescription() {
        return thingGroupDescription;
    }

    /**
     * <p>
     * The thing group description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param thingGroupDescription <p>
     *            The thing group description.
     *            </p>
     */
    public void setThingGroupDescription(String thingGroupDescription) {
        this.thingGroupDescription = thingGroupDescription;
    }

    /**
     * <p>
     * The thing group description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param thingGroupDescription <p>
     *            The thing group description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingGroupProperties withThingGroupDescription(String thingGroupDescription) {
        this.thingGroupDescription = thingGroupDescription;
        return this;
    }

    /**
     * <p>
     * The thing group attributes in JSON format.
     * </p>
     *
     * @return <p>
     *         The thing group attributes in JSON format.
     *         </p>
     */
    public AttributePayload getAttributePayload() {
        return attributePayload;
    }

    /**
     * <p>
     * The thing group attributes in JSON format.
     * </p>
     *
     * @param attributePayload <p>
     *            The thing group attributes in JSON format.
     *            </p>
     */
    public void setAttributePayload(AttributePayload attributePayload) {
        this.attributePayload = attributePayload;
    }

    /**
     * <p>
     * The thing group attributes in JSON format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributePayload <p>
     *            The thing group attributes in JSON format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingGroupProperties withAttributePayload(AttributePayload attributePayload) {
        this.attributePayload = attributePayload;
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
        if (getThingGroupDescription() != null)
            sb.append("thingGroupDescription: " + getThingGroupDescription() + ",");
        if (getAttributePayload() != null)
            sb.append("attributePayload: " + getAttributePayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getThingGroupDescription() == null) ? 0 : getThingGroupDescription().hashCode());
        hashCode = prime * hashCode
                + ((getAttributePayload() == null) ? 0 : getAttributePayload().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingGroupProperties == false)
            return false;
        ThingGroupProperties other = (ThingGroupProperties) obj;

        if (other.getThingGroupDescription() == null ^ this.getThingGroupDescription() == null)
            return false;
        if (other.getThingGroupDescription() != null
                && other.getThingGroupDescription().equals(this.getThingGroupDescription()) == false)
            return false;
        if (other.getAttributePayload() == null ^ this.getAttributePayload() == null)
            return false;
        if (other.getAttributePayload() != null
                && other.getAttributePayload().equals(this.getAttributePayload()) == false)
            return false;
        return true;
    }
}
