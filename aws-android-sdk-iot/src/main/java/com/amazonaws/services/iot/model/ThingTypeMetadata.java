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
 * The ThingTypeMetadata contains additional information about the thing type
 * including: creation date and time, a value indicating whether the thing type
 * is deprecated, and a date and time when time was deprecated.
 * </p>
 */
public class ThingTypeMetadata implements Serializable {
    /**
     * <p>
     * Whether the thing type is deprecated. If <b>true</b>, no new things could
     * be associated with this type.
     * </p>
     */
    private Boolean deprecated;

    /**
     * <p>
     * The date and time when the thing type was deprecated.
     * </p>
     */
    private java.util.Date deprecationDate;

    /**
     * <p>
     * The date and time when the thing type was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * Whether the thing type is deprecated. If <b>true</b>, no new things could
     * be associated with this type.
     * </p>
     *
     * @return <p>
     *         Whether the thing type is deprecated. If <b>true</b>, no new
     *         things could be associated with this type.
     *         </p>
     */
    public Boolean isDeprecated() {
        return deprecated;
    }

    /**
     * <p>
     * Whether the thing type is deprecated. If <b>true</b>, no new things could
     * be associated with this type.
     * </p>
     *
     * @return <p>
     *         Whether the thing type is deprecated. If <b>true</b>, no new
     *         things could be associated with this type.
     *         </p>
     */
    public Boolean getDeprecated() {
        return deprecated;
    }

    /**
     * <p>
     * Whether the thing type is deprecated. If <b>true</b>, no new things could
     * be associated with this type.
     * </p>
     *
     * @param deprecated <p>
     *            Whether the thing type is deprecated. If <b>true</b>, no new
     *            things could be associated with this type.
     *            </p>
     */
    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    /**
     * <p>
     * Whether the thing type is deprecated. If <b>true</b>, no new things could
     * be associated with this type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deprecated <p>
     *            Whether the thing type is deprecated. If <b>true</b>, no new
     *            things could be associated with this type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingTypeMetadata withDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
        return this;
    }

    /**
     * <p>
     * The date and time when the thing type was deprecated.
     * </p>
     *
     * @return <p>
     *         The date and time when the thing type was deprecated.
     *         </p>
     */
    public java.util.Date getDeprecationDate() {
        return deprecationDate;
    }

    /**
     * <p>
     * The date and time when the thing type was deprecated.
     * </p>
     *
     * @param deprecationDate <p>
     *            The date and time when the thing type was deprecated.
     *            </p>
     */
    public void setDeprecationDate(java.util.Date deprecationDate) {
        this.deprecationDate = deprecationDate;
    }

    /**
     * <p>
     * The date and time when the thing type was deprecated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deprecationDate <p>
     *            The date and time when the thing type was deprecated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingTypeMetadata withDeprecationDate(java.util.Date deprecationDate) {
        this.deprecationDate = deprecationDate;
        return this;
    }

    /**
     * <p>
     * The date and time when the thing type was created.
     * </p>
     *
     * @return <p>
     *         The date and time when the thing type was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date and time when the thing type was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time when the thing type was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the thing type was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time when the thing type was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingTypeMetadata withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
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
        if (getDeprecated() != null)
            sb.append("deprecated: " + getDeprecated() + ",");
        if (getDeprecationDate() != null)
            sb.append("deprecationDate: " + getDeprecationDate() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeprecated() == null) ? 0 : getDeprecated().hashCode());
        hashCode = prime * hashCode
                + ((getDeprecationDate() == null) ? 0 : getDeprecationDate().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingTypeMetadata == false)
            return false;
        ThingTypeMetadata other = (ThingTypeMetadata) obj;

        if (other.getDeprecated() == null ^ this.getDeprecated() == null)
            return false;
        if (other.getDeprecated() != null
                && other.getDeprecated().equals(this.getDeprecated()) == false)
            return false;
        if (other.getDeprecationDate() == null ^ this.getDeprecationDate() == null)
            return false;
        if (other.getDeprecationDate() != null
                && other.getDeprecationDate().equals(this.getDeprecationDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }
}
