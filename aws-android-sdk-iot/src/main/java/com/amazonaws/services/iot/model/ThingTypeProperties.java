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
 * The ThingTypeProperties contains information about the thing type including:
 * a thing type description, and a list of searchable thing attribute names.
 * </p>
 */
public class ThingTypeProperties implements Serializable {
    /**
     * <p>
     * The description of the thing type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     */
    private String thingTypeDescription;

    /**
     * <p>
     * A list of searchable thing attribute names.
     * </p>
     */
    private java.util.List<String> searchableAttributes;

    /**
     * <p>
     * The description of the thing type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @return <p>
     *         The description of the thing type.
     *         </p>
     */
    public String getThingTypeDescription() {
        return thingTypeDescription;
    }

    /**
     * <p>
     * The description of the thing type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param thingTypeDescription <p>
     *            The description of the thing type.
     *            </p>
     */
    public void setThingTypeDescription(String thingTypeDescription) {
        this.thingTypeDescription = thingTypeDescription;
    }

    /**
     * <p>
     * The description of the thing type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param thingTypeDescription <p>
     *            The description of the thing type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingTypeProperties withThingTypeDescription(String thingTypeDescription) {
        this.thingTypeDescription = thingTypeDescription;
        return this;
    }

    /**
     * <p>
     * A list of searchable thing attribute names.
     * </p>
     *
     * @return <p>
     *         A list of searchable thing attribute names.
     *         </p>
     */
    public java.util.List<String> getSearchableAttributes() {
        return searchableAttributes;
    }

    /**
     * <p>
     * A list of searchable thing attribute names.
     * </p>
     *
     * @param searchableAttributes <p>
     *            A list of searchable thing attribute names.
     *            </p>
     */
    public void setSearchableAttributes(java.util.Collection<String> searchableAttributes) {
        if (searchableAttributes == null) {
            this.searchableAttributes = null;
            return;
        }

        this.searchableAttributes = new java.util.ArrayList<String>(searchableAttributes);
    }

    /**
     * <p>
     * A list of searchable thing attribute names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param searchableAttributes <p>
     *            A list of searchable thing attribute names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingTypeProperties withSearchableAttributes(String... searchableAttributes) {
        if (getSearchableAttributes() == null) {
            this.searchableAttributes = new java.util.ArrayList<String>(searchableAttributes.length);
        }
        for (String value : searchableAttributes) {
            this.searchableAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of searchable thing attribute names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param searchableAttributes <p>
     *            A list of searchable thing attribute names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingTypeProperties withSearchableAttributes(
            java.util.Collection<String> searchableAttributes) {
        setSearchableAttributes(searchableAttributes);
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
        if (getThingTypeDescription() != null)
            sb.append("thingTypeDescription: " + getThingTypeDescription() + ",");
        if (getSearchableAttributes() != null)
            sb.append("searchableAttributes: " + getSearchableAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getThingTypeDescription() == null) ? 0 : getThingTypeDescription().hashCode());
        hashCode = prime * hashCode
                + ((getSearchableAttributes() == null) ? 0 : getSearchableAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingTypeProperties == false)
            return false;
        ThingTypeProperties other = (ThingTypeProperties) obj;

        if (other.getThingTypeDescription() == null ^ this.getThingTypeDescription() == null)
            return false;
        if (other.getThingTypeDescription() != null
                && other.getThingTypeDescription().equals(this.getThingTypeDescription()) == false)
            return false;
        if (other.getSearchableAttributes() == null ^ this.getSearchableAttributes() == null)
            return false;
        if (other.getSearchableAttributes() != null
                && other.getSearchableAttributes().equals(this.getSearchableAttributes()) == false)
            return false;
        return true;
    }
}
