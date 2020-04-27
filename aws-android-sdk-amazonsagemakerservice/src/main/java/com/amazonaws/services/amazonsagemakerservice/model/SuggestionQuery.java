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
 * Specified in the <a>GetSearchSuggestions</a> request. Limits the property
 * names that are included in the response.
 * </p>
 */
public class SuggestionQuery implements Serializable {
    /**
     * <p>
     * Defines a property name hint. Only property names that begin with the
     * specified hint are included in the response.
     * </p>
     */
    private PropertyNameQuery propertyNameQuery;

    /**
     * <p>
     * Defines a property name hint. Only property names that begin with the
     * specified hint are included in the response.
     * </p>
     *
     * @return <p>
     *         Defines a property name hint. Only property names that begin with
     *         the specified hint are included in the response.
     *         </p>
     */
    public PropertyNameQuery getPropertyNameQuery() {
        return propertyNameQuery;
    }

    /**
     * <p>
     * Defines a property name hint. Only property names that begin with the
     * specified hint are included in the response.
     * </p>
     *
     * @param propertyNameQuery <p>
     *            Defines a property name hint. Only property names that begin
     *            with the specified hint are included in the response.
     *            </p>
     */
    public void setPropertyNameQuery(PropertyNameQuery propertyNameQuery) {
        this.propertyNameQuery = propertyNameQuery;
    }

    /**
     * <p>
     * Defines a property name hint. Only property names that begin with the
     * specified hint are included in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propertyNameQuery <p>
     *            Defines a property name hint. Only property names that begin
     *            with the specified hint are included in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SuggestionQuery withPropertyNameQuery(PropertyNameQuery propertyNameQuery) {
        this.propertyNameQuery = propertyNameQuery;
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
        if (getPropertyNameQuery() != null)
            sb.append("PropertyNameQuery: " + getPropertyNameQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPropertyNameQuery() == null) ? 0 : getPropertyNameQuery().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuggestionQuery == false)
            return false;
        SuggestionQuery other = (SuggestionQuery) obj;

        if (other.getPropertyNameQuery() == null ^ this.getPropertyNameQuery() == null)
            return false;
        if (other.getPropertyNameQuery() != null
                && other.getPropertyNameQuery().equals(this.getPropertyNameQuery()) == false)
            return false;
        return true;
    }
}
