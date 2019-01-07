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
 * The properties of the thing, including thing name, thing type name, and a
 * list of thing attributes.
 * </p>
 */
public class ThingAttribute implements Serializable {
    /**
     * <p>
     * The name of the thing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingName;

    /**
     * <p>
     * The name of the thing type, if the thing has been associated with a type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingTypeName;

    /**
     * <p>
     * The thing ARN.
     * </p>
     */
    private String thingArn;

    /**
     * <p>
     * A list of thing attributes which are name-value pairs.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The version of the thing record in the registry.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * The name of the thing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the thing.
     *         </p>
     */
    public String getThingName() {
        return thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The name of the thing.
     *            </p>
     */
    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing.
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
     *            The name of the thing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingAttribute withThingName(String thingName) {
        this.thingName = thingName;
        return this;
    }

    /**
     * <p>
     * The name of the thing type, if the thing has been associated with a type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the thing type, if the thing has been associated with
     *         a type.
     *         </p>
     */
    public String getThingTypeName() {
        return thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type, if the thing has been associated with a type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingTypeName <p>
     *            The name of the thing type, if the thing has been associated
     *            with a type.
     *            </p>
     */
    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type, if the thing has been associated with a type.
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
     *            The name of the thing type, if the thing has been associated
     *            with a type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingAttribute withThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
        return this;
    }

    /**
     * <p>
     * The thing ARN.
     * </p>
     *
     * @return <p>
     *         The thing ARN.
     *         </p>
     */
    public String getThingArn() {
        return thingArn;
    }

    /**
     * <p>
     * The thing ARN.
     * </p>
     *
     * @param thingArn <p>
     *            The thing ARN.
     *            </p>
     */
    public void setThingArn(String thingArn) {
        this.thingArn = thingArn;
    }

    /**
     * <p>
     * The thing ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingArn <p>
     *            The thing ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingAttribute withThingArn(String thingArn) {
        this.thingArn = thingArn;
        return this;
    }

    /**
     * <p>
     * A list of thing attributes which are name-value pairs.
     * </p>
     *
     * @return <p>
     *         A list of thing attributes which are name-value pairs.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A list of thing attributes which are name-value pairs.
     * </p>
     *
     * @param attributes <p>
     *            A list of thing attributes which are name-value pairs.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A list of thing attributes which are name-value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A list of thing attributes which are name-value pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingAttribute withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * A list of thing attributes which are name-value pairs.
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
    public ThingAttribute addattributesEntry(String key, String value) {
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
    public ThingAttribute clearattributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The version of the thing record in the registry.
     * </p>
     *
     * @return <p>
     *         The version of the thing record in the registry.
     *         </p>
     */
    public Long getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the thing record in the registry.
     * </p>
     *
     * @param version <p>
     *            The version of the thing record in the registry.
     *            </p>
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the thing record in the registry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version of the thing record in the registry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingAttribute withVersion(Long version) {
        this.version = version;
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
        if (getThingTypeName() != null)
            sb.append("thingTypeName: " + getThingTypeName() + ",");
        if (getThingArn() != null)
            sb.append("thingArn: " + getThingArn() + ",");
        if (getAttributes() != null)
            sb.append("attributes: " + getAttributes() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode
                + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        hashCode = prime * hashCode + ((getThingArn() == null) ? 0 : getThingArn().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingAttribute == false)
            return false;
        ThingAttribute other = (ThingAttribute) obj;

        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null
                && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null
                && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        if (other.getThingArn() == null ^ this.getThingArn() == null)
            return false;
        if (other.getThingArn() != null && other.getThingArn().equals(this.getThingArn()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}
