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

package com.amazonaws.services.amazonroute53domains.model;

import java.io.Serializable;

public class GetDomainSuggestionsResult implements Serializable {
    /**
     * <p>
     * A list of possible domain names. If you specified <code>true</code> for
     * <code>OnlyAvailable</code> in the request, the list contains only domains
     * that are available for registration.
     * </p>
     */
    private java.util.List<DomainSuggestion> suggestionsList;

    /**
     * <p>
     * A list of possible domain names. If you specified <code>true</code> for
     * <code>OnlyAvailable</code> in the request, the list contains only domains
     * that are available for registration.
     * </p>
     *
     * @return <p>
     *         A list of possible domain names. If you specified
     *         <code>true</code> for <code>OnlyAvailable</code> in the request,
     *         the list contains only domains that are available for
     *         registration.
     *         </p>
     */
    public java.util.List<DomainSuggestion> getSuggestionsList() {
        return suggestionsList;
    }

    /**
     * <p>
     * A list of possible domain names. If you specified <code>true</code> for
     * <code>OnlyAvailable</code> in the request, the list contains only domains
     * that are available for registration.
     * </p>
     *
     * @param suggestionsList <p>
     *            A list of possible domain names. If you specified
     *            <code>true</code> for <code>OnlyAvailable</code> in the
     *            request, the list contains only domains that are available for
     *            registration.
     *            </p>
     */
    public void setSuggestionsList(java.util.Collection<DomainSuggestion> suggestionsList) {
        if (suggestionsList == null) {
            this.suggestionsList = null;
            return;
        }

        this.suggestionsList = new java.util.ArrayList<DomainSuggestion>(suggestionsList);
    }

    /**
     * <p>
     * A list of possible domain names. If you specified <code>true</code> for
     * <code>OnlyAvailable</code> in the request, the list contains only domains
     * that are available for registration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param suggestionsList <p>
     *            A list of possible domain names. If you specified
     *            <code>true</code> for <code>OnlyAvailable</code> in the
     *            request, the list contains only domains that are available for
     *            registration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainSuggestionsResult withSuggestionsList(DomainSuggestion... suggestionsList) {
        if (getSuggestionsList() == null) {
            this.suggestionsList = new java.util.ArrayList<DomainSuggestion>(suggestionsList.length);
        }
        for (DomainSuggestion value : suggestionsList) {
            this.suggestionsList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of possible domain names. If you specified <code>true</code> for
     * <code>OnlyAvailable</code> in the request, the list contains only domains
     * that are available for registration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param suggestionsList <p>
     *            A list of possible domain names. If you specified
     *            <code>true</code> for <code>OnlyAvailable</code> in the
     *            request, the list contains only domains that are available for
     *            registration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDomainSuggestionsResult withSuggestionsList(
            java.util.Collection<DomainSuggestion> suggestionsList) {
        setSuggestionsList(suggestionsList);
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
        if (getSuggestionsList() != null)
            sb.append("SuggestionsList: " + getSuggestionsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSuggestionsList() == null) ? 0 : getSuggestionsList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDomainSuggestionsResult == false)
            return false;
        GetDomainSuggestionsResult other = (GetDomainSuggestionsResult) obj;

        if (other.getSuggestionsList() == null ^ this.getSuggestionsList() == null)
            return false;
        if (other.getSuggestionsList() != null
                && other.getSuggestionsList().equals(this.getSuggestionsList()) == false)
            return false;
        return true;
    }
}
