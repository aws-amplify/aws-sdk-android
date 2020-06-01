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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

public class GetSearchSuggestionsResult implements Serializable {
    /**
     * <p>
     * A list of property names for a <code>Resource</code> that match a
     * <code>SuggestionQuery</code>.
     * </p>
     */
    private java.util.List<PropertyNameSuggestion> propertyNameSuggestions;

    /**
     * <p>
     * A list of property names for a <code>Resource</code> that match a
     * <code>SuggestionQuery</code>.
     * </p>
     *
     * @return <p>
     *         A list of property names for a <code>Resource</code> that match a
     *         <code>SuggestionQuery</code>.
     *         </p>
     */
    public java.util.List<PropertyNameSuggestion> getPropertyNameSuggestions() {
        return propertyNameSuggestions;
    }

    /**
     * <p>
     * A list of property names for a <code>Resource</code> that match a
     * <code>SuggestionQuery</code>.
     * </p>
     *
     * @param propertyNameSuggestions <p>
     *            A list of property names for a <code>Resource</code> that
     *            match a <code>SuggestionQuery</code>.
     *            </p>
     */
    public void setPropertyNameSuggestions(
            java.util.Collection<PropertyNameSuggestion> propertyNameSuggestions) {
        if (propertyNameSuggestions == null) {
            this.propertyNameSuggestions = null;
            return;
        }

        this.propertyNameSuggestions = new java.util.ArrayList<PropertyNameSuggestion>(
                propertyNameSuggestions);
    }

    /**
     * <p>
     * A list of property names for a <code>Resource</code> that match a
     * <code>SuggestionQuery</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propertyNameSuggestions <p>
     *            A list of property names for a <code>Resource</code> that
     *            match a <code>SuggestionQuery</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSearchSuggestionsResult withPropertyNameSuggestions(
            PropertyNameSuggestion... propertyNameSuggestions) {
        if (getPropertyNameSuggestions() == null) {
            this.propertyNameSuggestions = new java.util.ArrayList<PropertyNameSuggestion>(
                    propertyNameSuggestions.length);
        }
        for (PropertyNameSuggestion value : propertyNameSuggestions) {
            this.propertyNameSuggestions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of property names for a <code>Resource</code> that match a
     * <code>SuggestionQuery</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propertyNameSuggestions <p>
     *            A list of property names for a <code>Resource</code> that
     *            match a <code>SuggestionQuery</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSearchSuggestionsResult withPropertyNameSuggestions(
            java.util.Collection<PropertyNameSuggestion> propertyNameSuggestions) {
        setPropertyNameSuggestions(propertyNameSuggestions);
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
        if (getPropertyNameSuggestions() != null)
            sb.append("PropertyNameSuggestions: " + getPropertyNameSuggestions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPropertyNameSuggestions() == null) ? 0 : getPropertyNameSuggestions()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSearchSuggestionsResult == false)
            return false;
        GetSearchSuggestionsResult other = (GetSearchSuggestionsResult) obj;

        if (other.getPropertyNameSuggestions() == null ^ this.getPropertyNameSuggestions() == null)
            return false;
        if (other.getPropertyNameSuggestions() != null
                && other.getPropertyNameSuggestions().equals(this.getPropertyNameSuggestions()) == false)
            return false;
        return true;
    }
}
