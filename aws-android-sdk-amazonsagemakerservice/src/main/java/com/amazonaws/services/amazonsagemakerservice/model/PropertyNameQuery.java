/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Part of the <code>SuggestionQuery</code> type. Specifies a hint for
 * retrieving property names that begin with the specified text.
 * </p>
 */
public class PropertyNameQuery implements Serializable {
    /**
     * <p>
     * Text that begins a property's name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String propertyNameHint;

    /**
     * <p>
     * Text that begins a property's name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         Text that begins a property's name.
     *         </p>
     */
    public String getPropertyNameHint() {
        return propertyNameHint;
    }

    /**
     * <p>
     * Text that begins a property's name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param propertyNameHint <p>
     *            Text that begins a property's name.
     *            </p>
     */
    public void setPropertyNameHint(String propertyNameHint) {
        this.propertyNameHint = propertyNameHint;
    }

    /**
     * <p>
     * Text that begins a property's name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param propertyNameHint <p>
     *            Text that begins a property's name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PropertyNameQuery withPropertyNameHint(String propertyNameHint) {
        this.propertyNameHint = propertyNameHint;
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
        if (getPropertyNameHint() != null)
            sb.append("PropertyNameHint: " + getPropertyNameHint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPropertyNameHint() == null) ? 0 : getPropertyNameHint().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyNameQuery == false)
            return false;
        PropertyNameQuery other = (PropertyNameQuery) obj;

        if (other.getPropertyNameHint() == null ^ this.getPropertyNameHint() == null)
            return false;
        if (other.getPropertyNameHint() != null
                && other.getPropertyNameHint().equals(this.getPropertyNameHint()) == false)
            return false;
        return true;
    }
}
