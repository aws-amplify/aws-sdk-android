/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a predefined attribute.
 * </p>
 */
public class PredefinedAttribute implements Serializable {
    /**
     * <p>
     * The name of the predefined attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String name;

    /**
     * <p>
     * The values of the predefined attribute.
     * </p>
     */
    private PredefinedAttributeValues values;

    /**
     * <p>
     * Last modified time.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * Last modified region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     */
    private String lastModifiedRegion;

    /**
     * <p>
     * The name of the predefined attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The name of the predefined attribute.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the predefined attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            The name of the predefined attribute.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the predefined attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            The name of the predefined attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PredefinedAttribute withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The values of the predefined attribute.
     * </p>
     *
     * @return <p>
     *         The values of the predefined attribute.
     *         </p>
     */
    public PredefinedAttributeValues getValues() {
        return values;
    }

    /**
     * <p>
     * The values of the predefined attribute.
     * </p>
     *
     * @param values <p>
     *            The values of the predefined attribute.
     *            </p>
     */
    public void setValues(PredefinedAttributeValues values) {
        this.values = values;
    }

    /**
     * <p>
     * The values of the predefined attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The values of the predefined attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PredefinedAttribute withValues(PredefinedAttributeValues values) {
        this.values = values;
        return this;
    }

    /**
     * <p>
     * Last modified time.
     * </p>
     *
     * @return <p>
     *         Last modified time.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * Last modified time.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            Last modified time.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Last modified time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            Last modified time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PredefinedAttribute withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * Last modified region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @return <p>
     *         Last modified region.
     *         </p>
     */
    public String getLastModifiedRegion() {
        return lastModifiedRegion;
    }

    /**
     * <p>
     * Last modified region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @param lastModifiedRegion <p>
     *            Last modified region.
     *            </p>
     */
    public void setLastModifiedRegion(String lastModifiedRegion) {
        this.lastModifiedRegion = lastModifiedRegion;
    }

    /**
     * <p>
     * Last modified region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @param lastModifiedRegion <p>
     *            Last modified region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PredefinedAttribute withLastModifiedRegion(String lastModifiedRegion) {
        this.lastModifiedRegion = lastModifiedRegion;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getValues() != null)
            sb.append("Values: " + getValues() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getLastModifiedRegion() != null)
            sb.append("LastModifiedRegion: " + getLastModifiedRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedRegion() == null) ? 0 : getLastModifiedRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredefinedAttribute == false)
            return false;
        PredefinedAttribute other = (PredefinedAttribute) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedRegion() == null ^ this.getLastModifiedRegion() == null)
            return false;
        if (other.getLastModifiedRegion() != null
                && other.getLastModifiedRegion().equals(this.getLastModifiedRegion()) == false)
            return false;
        return true;
    }
}
