/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new thing type.
 * </p>
 */
public class CreateThingTypeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the thing type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingTypeName;

    /**
     * <p>
     * The ThingTypeProperties for the thing type to create. It contains
     * information about the new thing type including a description, and a list
     * of searchable thing attribute names.
     * </p>
     */
    private ThingTypeProperties thingTypeProperties;

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the thing type.
     *         </p>
     */
    public String getThingTypeName() {
        return thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingTypeName <p>
     *            The name of the thing type.
     *            </p>
     */
    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type.
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
     *            The name of the thing type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateThingTypeRequest withThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
        return this;
    }

    /**
     * <p>
     * The ThingTypeProperties for the thing type to create. It contains
     * information about the new thing type including a description, and a list
     * of searchable thing attribute names.
     * </p>
     *
     * @return <p>
     *         The ThingTypeProperties for the thing type to create. It contains
     *         information about the new thing type including a description, and
     *         a list of searchable thing attribute names.
     *         </p>
     */
    public ThingTypeProperties getThingTypeProperties() {
        return thingTypeProperties;
    }

    /**
     * <p>
     * The ThingTypeProperties for the thing type to create. It contains
     * information about the new thing type including a description, and a list
     * of searchable thing attribute names.
     * </p>
     *
     * @param thingTypeProperties <p>
     *            The ThingTypeProperties for the thing type to create. It
     *            contains information about the new thing type including a
     *            description, and a list of searchable thing attribute names.
     *            </p>
     */
    public void setThingTypeProperties(ThingTypeProperties thingTypeProperties) {
        this.thingTypeProperties = thingTypeProperties;
    }

    /**
     * <p>
     * The ThingTypeProperties for the thing type to create. It contains
     * information about the new thing type including a description, and a list
     * of searchable thing attribute names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingTypeProperties <p>
     *            The ThingTypeProperties for the thing type to create. It
     *            contains information about the new thing type including a
     *            description, and a list of searchable thing attribute names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateThingTypeRequest withThingTypeProperties(ThingTypeProperties thingTypeProperties) {
        this.thingTypeProperties = thingTypeProperties;
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
        if (getThingTypeName() != null)
            sb.append("thingTypeName: " + getThingTypeName() + ",");
        if (getThingTypeProperties() != null)
            sb.append("thingTypeProperties: " + getThingTypeProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        hashCode = prime * hashCode
                + ((getThingTypeProperties() == null) ? 0 : getThingTypeProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateThingTypeRequest == false)
            return false;
        CreateThingTypeRequest other = (CreateThingTypeRequest) obj;

        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null
                && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        if (other.getThingTypeProperties() == null ^ this.getThingTypeProperties() == null)
            return false;
        if (other.getThingTypeProperties() != null
                && other.getThingTypeProperties().equals(this.getThingTypeProperties()) == false)
            return false;
        return true;
    }
}
