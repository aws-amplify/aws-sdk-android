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
 * The thing group search index document.
 * </p>
 */
public class ThingGroupDocument implements Serializable {
    /**
     * <p>
     * The thing group name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingGroupName;

    /**
     * <p>
     * The thing group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     */
    private String thingGroupId;

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
     * The thing group attributes.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * Parent group names.
     * </p>
     */
    private java.util.List<String> parentGroupNames;

    /**
     * <p>
     * The thing group name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The thing group name.
     *         </p>
     */
    public String getThingGroupName() {
        return thingGroupName;
    }

    /**
     * <p>
     * The thing group name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingGroupName <p>
     *            The thing group name.
     *            </p>
     */
    public void setThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
    }

    /**
     * <p>
     * The thing group name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingGroupName <p>
     *            The thing group name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingGroupDocument withThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
        return this;
    }

    /**
     * <p>
     * The thing group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @return <p>
     *         The thing group ID.
     *         </p>
     */
    public String getThingGroupId() {
        return thingGroupId;
    }

    /**
     * <p>
     * The thing group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param thingGroupId <p>
     *            The thing group ID.
     *            </p>
     */
    public void setThingGroupId(String thingGroupId) {
        this.thingGroupId = thingGroupId;
    }

    /**
     * <p>
     * The thing group ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param thingGroupId <p>
     *            The thing group ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingGroupDocument withThingGroupId(String thingGroupId) {
        this.thingGroupId = thingGroupId;
        return this;
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
    public ThingGroupDocument withThingGroupDescription(String thingGroupDescription) {
        this.thingGroupDescription = thingGroupDescription;
        return this;
    }

    /**
     * <p>
     * The thing group attributes.
     * </p>
     *
     * @return <p>
     *         The thing group attributes.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The thing group attributes.
     * </p>
     *
     * @param attributes <p>
     *            The thing group attributes.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The thing group attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The thing group attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingGroupDocument withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * The thing group attributes.
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
    public ThingGroupDocument addattributesEntry(String key, String value) {
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
    public ThingGroupDocument clearattributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Parent group names.
     * </p>
     *
     * @return <p>
     *         Parent group names.
     *         </p>
     */
    public java.util.List<String> getParentGroupNames() {
        return parentGroupNames;
    }

    /**
     * <p>
     * Parent group names.
     * </p>
     *
     * @param parentGroupNames <p>
     *            Parent group names.
     *            </p>
     */
    public void setParentGroupNames(java.util.Collection<String> parentGroupNames) {
        if (parentGroupNames == null) {
            this.parentGroupNames = null;
            return;
        }

        this.parentGroupNames = new java.util.ArrayList<String>(parentGroupNames);
    }

    /**
     * <p>
     * Parent group names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parentGroupNames <p>
     *            Parent group names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingGroupDocument withParentGroupNames(String... parentGroupNames) {
        if (getParentGroupNames() == null) {
            this.parentGroupNames = new java.util.ArrayList<String>(parentGroupNames.length);
        }
        for (String value : parentGroupNames) {
            this.parentGroupNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Parent group names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parentGroupNames <p>
     *            Parent group names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingGroupDocument withParentGroupNames(java.util.Collection<String> parentGroupNames) {
        setParentGroupNames(parentGroupNames);
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
        if (getThingGroupName() != null)
            sb.append("thingGroupName: " + getThingGroupName() + ",");
        if (getThingGroupId() != null)
            sb.append("thingGroupId: " + getThingGroupId() + ",");
        if (getThingGroupDescription() != null)
            sb.append("thingGroupDescription: " + getThingGroupDescription() + ",");
        if (getAttributes() != null)
            sb.append("attributes: " + getAttributes() + ",");
        if (getParentGroupNames() != null)
            sb.append("parentGroupNames: " + getParentGroupNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getThingGroupName() == null) ? 0 : getThingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getThingGroupId() == null) ? 0 : getThingGroupId().hashCode());
        hashCode = prime
                * hashCode
                + ((getThingGroupDescription() == null) ? 0 : getThingGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getParentGroupNames() == null) ? 0 : getParentGroupNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingGroupDocument == false)
            return false;
        ThingGroupDocument other = (ThingGroupDocument) obj;

        if (other.getThingGroupName() == null ^ this.getThingGroupName() == null)
            return false;
        if (other.getThingGroupName() != null
                && other.getThingGroupName().equals(this.getThingGroupName()) == false)
            return false;
        if (other.getThingGroupId() == null ^ this.getThingGroupId() == null)
            return false;
        if (other.getThingGroupId() != null
                && other.getThingGroupId().equals(this.getThingGroupId()) == false)
            return false;
        if (other.getThingGroupDescription() == null ^ this.getThingGroupDescription() == null)
            return false;
        if (other.getThingGroupDescription() != null
                && other.getThingGroupDescription().equals(this.getThingGroupDescription()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getParentGroupNames() == null ^ this.getParentGroupNames() == null)
            return false;
        if (other.getParentGroupNames() != null
                && other.getParentGroupNames().equals(this.getParentGroupNames()) == false)
            return false;
        return true;
    }
}
