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
 * The thing search index document.
 * </p>
 */
public class ThingDocument implements Serializable {
    /**
     * <p>
     * The thing name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingName;

    /**
     * <p>
     * The thing ID.
     * </p>
     */
    private String thingId;

    /**
     * <p>
     * The thing type name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingTypeName;

    /**
     * <p>
     * Thing group names.
     * </p>
     */
    private java.util.List<String> thingGroupNames;

    /**
     * <p>
     * The attributes.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The shadow.
     * </p>
     */
    private String shadow;

    /**
     * <p>
     * Indicates whether or not the thing is connected to the AWS IoT service.
     * </p>
     */
    private ThingConnectivity connectivity;

    /**
     * <p>
     * The thing name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The thing name.
     *         </p>
     */
    public String getThingName() {
        return thingName;
    }

    /**
     * <p>
     * The thing name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The thing name.
     *            </p>
     */
    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The thing name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The thing name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingDocument withThingName(String thingName) {
        this.thingName = thingName;
        return this;
    }

    /**
     * <p>
     * The thing ID.
     * </p>
     *
     * @return <p>
     *         The thing ID.
     *         </p>
     */
    public String getThingId() {
        return thingId;
    }

    /**
     * <p>
     * The thing ID.
     * </p>
     *
     * @param thingId <p>
     *            The thing ID.
     *            </p>
     */
    public void setThingId(String thingId) {
        this.thingId = thingId;
    }

    /**
     * <p>
     * The thing ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingId <p>
     *            The thing ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingDocument withThingId(String thingId) {
        this.thingId = thingId;
        return this;
    }

    /**
     * <p>
     * The thing type name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The thing type name.
     *         </p>
     */
    public String getThingTypeName() {
        return thingTypeName;
    }

    /**
     * <p>
     * The thing type name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingTypeName <p>
     *            The thing type name.
     *            </p>
     */
    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * <p>
     * The thing type name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingTypeName <p>
     *            The thing type name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingDocument withThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
        return this;
    }

    /**
     * <p>
     * Thing group names.
     * </p>
     *
     * @return <p>
     *         Thing group names.
     *         </p>
     */
    public java.util.List<String> getThingGroupNames() {
        return thingGroupNames;
    }

    /**
     * <p>
     * Thing group names.
     * </p>
     *
     * @param thingGroupNames <p>
     *            Thing group names.
     *            </p>
     */
    public void setThingGroupNames(java.util.Collection<String> thingGroupNames) {
        if (thingGroupNames == null) {
            this.thingGroupNames = null;
            return;
        }

        this.thingGroupNames = new java.util.ArrayList<String>(thingGroupNames);
    }

    /**
     * <p>
     * Thing group names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroupNames <p>
     *            Thing group names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingDocument withThingGroupNames(String... thingGroupNames) {
        if (getThingGroupNames() == null) {
            this.thingGroupNames = new java.util.ArrayList<String>(thingGroupNames.length);
        }
        for (String value : thingGroupNames) {
            this.thingGroupNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Thing group names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingGroupNames <p>
     *            Thing group names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingDocument withThingGroupNames(java.util.Collection<String> thingGroupNames) {
        setThingGroupNames(thingGroupNames);
        return this;
    }

    /**
     * <p>
     * The attributes.
     * </p>
     *
     * @return <p>
     *         The attributes.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attributes.
     * </p>
     *
     * @param attributes <p>
     *            The attributes.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingDocument withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * The attributes.
     * </p>
     * <p>
     * The method adds a new key-value pair into attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into attributes.
     * @param value The corresponding value of the entry to be added into
     *            attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingDocument addattributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ThingDocument clearattributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The shadow.
     * </p>
     *
     * @return <p>
     *         The shadow.
     *         </p>
     */
    public String getShadow() {
        return shadow;
    }

    /**
     * <p>
     * The shadow.
     * </p>
     *
     * @param shadow <p>
     *            The shadow.
     *            </p>
     */
    public void setShadow(String shadow) {
        this.shadow = shadow;
    }

    /**
     * <p>
     * The shadow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shadow <p>
     *            The shadow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingDocument withShadow(String shadow) {
        this.shadow = shadow;
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the thing is connected to the AWS IoT service.
     * </p>
     *
     * @return <p>
     *         Indicates whether or not the thing is connected to the AWS IoT
     *         service.
     *         </p>
     */
    public ThingConnectivity getConnectivity() {
        return connectivity;
    }

    /**
     * <p>
     * Indicates whether or not the thing is connected to the AWS IoT service.
     * </p>
     *
     * @param connectivity <p>
     *            Indicates whether or not the thing is connected to the AWS IoT
     *            service.
     *            </p>
     */
    public void setConnectivity(ThingConnectivity connectivity) {
        this.connectivity = connectivity;
    }

    /**
     * <p>
     * Indicates whether or not the thing is connected to the AWS IoT service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectivity <p>
     *            Indicates whether or not the thing is connected to the AWS IoT
     *            service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingDocument withConnectivity(ThingConnectivity connectivity) {
        this.connectivity = connectivity;
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
        if (getThingName() != null)
            sb.append("thingName: " + getThingName() + ",");
        if (getThingId() != null)
            sb.append("thingId: " + getThingId() + ",");
        if (getThingTypeName() != null)
            sb.append("thingTypeName: " + getThingTypeName() + ",");
        if (getThingGroupNames() != null)
            sb.append("thingGroupNames: " + getThingGroupNames() + ",");
        if (getAttributes() != null)
            sb.append("attributes: " + getAttributes() + ",");
        if (getShadow() != null)
            sb.append("shadow: " + getShadow() + ",");
        if (getConnectivity() != null)
            sb.append("connectivity: " + getConnectivity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getThingId() == null) ? 0 : getThingId().hashCode());
        hashCode = prime * hashCode
                + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        hashCode = prime * hashCode
                + ((getThingGroupNames() == null) ? 0 : getThingGroupNames().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getShadow() == null) ? 0 : getShadow().hashCode());
        hashCode = prime * hashCode
                + ((getConnectivity() == null) ? 0 : getConnectivity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingDocument == false)
            return false;
        ThingDocument other = (ThingDocument) obj;

        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null
                && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getThingId() == null ^ this.getThingId() == null)
            return false;
        if (other.getThingId() != null && other.getThingId().equals(this.getThingId()) == false)
            return false;
        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null
                && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        if (other.getThingGroupNames() == null ^ this.getThingGroupNames() == null)
            return false;
        if (other.getThingGroupNames() != null
                && other.getThingGroupNames().equals(this.getThingGroupNames()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getShadow() == null ^ this.getShadow() == null)
            return false;
        if (other.getShadow() != null && other.getShadow().equals(this.getShadow()) == false)
            return false;
        if (other.getConnectivity() == null ^ this.getConnectivity() == null)
            return false;
        if (other.getConnectivity() != null
                && other.getConnectivity().equals(this.getConnectivity()) == false)
            return false;
        return true;
    }
}
