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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deprecates a thing type. You can not associate new things with deprecated
 * thing type.
 * </p>
 */
public class DeprecateThingTypeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the thing type to deprecate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingTypeName;

    /**
     * <p>
     * Whether to undeprecate a deprecated thing type. If <b>true</b>, the thing
     * type will not be deprecated anymore and you can associate it with things.
     * </p>
     */
    private Boolean undoDeprecate;

    /**
     * <p>
     * The name of the thing type to deprecate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the thing type to deprecate.
     *         </p>
     */
    public String getThingTypeName() {
        return thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type to deprecate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingTypeName <p>
     *            The name of the thing type to deprecate.
     *            </p>
     */
    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type to deprecate.
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
     *            The name of the thing type to deprecate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeprecateThingTypeRequest withThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
        return this;
    }

    /**
     * <p>
     * Whether to undeprecate a deprecated thing type. If <b>true</b>, the thing
     * type will not be deprecated anymore and you can associate it with things.
     * </p>
     *
     * @return <p>
     *         Whether to undeprecate a deprecated thing type. If <b>true</b>,
     *         the thing type will not be deprecated anymore and you can
     *         associate it with things.
     *         </p>
     */
    public Boolean isUndoDeprecate() {
        return undoDeprecate;
    }

    /**
     * <p>
     * Whether to undeprecate a deprecated thing type. If <b>true</b>, the thing
     * type will not be deprecated anymore and you can associate it with things.
     * </p>
     *
     * @return <p>
     *         Whether to undeprecate a deprecated thing type. If <b>true</b>,
     *         the thing type will not be deprecated anymore and you can
     *         associate it with things.
     *         </p>
     */
    public Boolean getUndoDeprecate() {
        return undoDeprecate;
    }

    /**
     * <p>
     * Whether to undeprecate a deprecated thing type. If <b>true</b>, the thing
     * type will not be deprecated anymore and you can associate it with things.
     * </p>
     *
     * @param undoDeprecate <p>
     *            Whether to undeprecate a deprecated thing type. If
     *            <b>true</b>, the thing type will not be deprecated anymore and
     *            you can associate it with things.
     *            </p>
     */
    public void setUndoDeprecate(Boolean undoDeprecate) {
        this.undoDeprecate = undoDeprecate;
    }

    /**
     * <p>
     * Whether to undeprecate a deprecated thing type. If <b>true</b>, the thing
     * type will not be deprecated anymore and you can associate it with things.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param undoDeprecate <p>
     *            Whether to undeprecate a deprecated thing type. If
     *            <b>true</b>, the thing type will not be deprecated anymore and
     *            you can associate it with things.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeprecateThingTypeRequest withUndoDeprecate(Boolean undoDeprecate) {
        this.undoDeprecate = undoDeprecate;
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
        if (getUndoDeprecate() != null)
            sb.append("undoDeprecate: " + getUndoDeprecate());
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
                + ((getUndoDeprecate() == null) ? 0 : getUndoDeprecate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeprecateThingTypeRequest == false)
            return false;
        DeprecateThingTypeRequest other = (DeprecateThingTypeRequest) obj;

        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null
                && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        if (other.getUndoDeprecate() == null ^ this.getUndoDeprecate() == null)
            return false;
        if (other.getUndoDeprecate() != null
                && other.getUndoDeprecate().equals(this.getUndoDeprecate()) == false)
            return false;
        return true;
    }
}
