/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

public class SearchPlaceIndexForTextResult implements Serializable {
    /**
     * <p>
     * A list of Places matching the input text. Each result contains additional
     * information about the specific point of interest.
     * </p>
     */
    private java.util.List<SearchForTextResult> results;

    /**
     * <p>
     * Contains a summary of the request. Echoes the input values for
     * <code>BiasPosition</code>, <code>FilterBBox</code>,
     * <code>FilterCountries</code>, <code>Language</code>,
     * <code>MaxResults</code>, and <code>Text</code>. Also includes the
     * <code>DataSource</code> of the place index and the bounding box,
     * <code>ResultBBox</code>, which surrounds the search results.
     * </p>
     */
    private SearchPlaceIndexForTextSummary summary;

    /**
     * <p>
     * A list of Places matching the input text. Each result contains additional
     * information about the specific point of interest.
     * </p>
     *
     * @return <p>
     *         A list of Places matching the input text. Each result contains
     *         additional information about the specific point of interest.
     *         </p>
     */
    public java.util.List<SearchForTextResult> getResults() {
        return results;
    }

    /**
     * <p>
     * A list of Places matching the input text. Each result contains additional
     * information about the specific point of interest.
     * </p>
     *
     * @param results <p>
     *            A list of Places matching the input text. Each result contains
     *            additional information about the specific point of interest.
     *            </p>
     */
    public void setResults(java.util.Collection<SearchForTextResult> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<SearchForTextResult>(results);
    }

    /**
     * <p>
     * A list of Places matching the input text. Each result contains additional
     * information about the specific point of interest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param results <p>
     *            A list of Places matching the input text. Each result contains
     *            additional information about the specific point of interest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextResult withResults(SearchForTextResult... results) {
        if (getResults() == null) {
            this.results = new java.util.ArrayList<SearchForTextResult>(results.length);
        }
        for (SearchForTextResult value : results) {
            this.results.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of Places matching the input text. Each result contains additional
     * information about the specific point of interest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param results <p>
     *            A list of Places matching the input text. Each result contains
     *            additional information about the specific point of interest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextResult withResults(
            java.util.Collection<SearchForTextResult> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * Contains a summary of the request. Echoes the input values for
     * <code>BiasPosition</code>, <code>FilterBBox</code>,
     * <code>FilterCountries</code>, <code>Language</code>,
     * <code>MaxResults</code>, and <code>Text</code>. Also includes the
     * <code>DataSource</code> of the place index and the bounding box,
     * <code>ResultBBox</code>, which surrounds the search results.
     * </p>
     *
     * @return <p>
     *         Contains a summary of the request. Echoes the input values for
     *         <code>BiasPosition</code>, <code>FilterBBox</code>,
     *         <code>FilterCountries</code>, <code>Language</code>,
     *         <code>MaxResults</code>, and <code>Text</code>. Also includes the
     *         <code>DataSource</code> of the place index and the bounding box,
     *         <code>ResultBBox</code>, which surrounds the search results.
     *         </p>
     */
    public SearchPlaceIndexForTextSummary getSummary() {
        return summary;
    }

    /**
     * <p>
     * Contains a summary of the request. Echoes the input values for
     * <code>BiasPosition</code>, <code>FilterBBox</code>,
     * <code>FilterCountries</code>, <code>Language</code>,
     * <code>MaxResults</code>, and <code>Text</code>. Also includes the
     * <code>DataSource</code> of the place index and the bounding box,
     * <code>ResultBBox</code>, which surrounds the search results.
     * </p>
     *
     * @param summary <p>
     *            Contains a summary of the request. Echoes the input values for
     *            <code>BiasPosition</code>, <code>FilterBBox</code>,
     *            <code>FilterCountries</code>, <code>Language</code>,
     *            <code>MaxResults</code>, and <code>Text</code>. Also includes
     *            the <code>DataSource</code> of the place index and the
     *            bounding box, <code>ResultBBox</code>, which surrounds the
     *            search results.
     *            </p>
     */
    public void setSummary(SearchPlaceIndexForTextSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * Contains a summary of the request. Echoes the input values for
     * <code>BiasPosition</code>, <code>FilterBBox</code>,
     * <code>FilterCountries</code>, <code>Language</code>,
     * <code>MaxResults</code>, and <code>Text</code>. Also includes the
     * <code>DataSource</code> of the place index and the bounding box,
     * <code>ResultBBox</code>, which surrounds the search results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summary <p>
     *            Contains a summary of the request. Echoes the input values for
     *            <code>BiasPosition</code>, <code>FilterBBox</code>,
     *            <code>FilterCountries</code>, <code>Language</code>,
     *            <code>MaxResults</code>, and <code>Text</code>. Also includes
     *            the <code>DataSource</code> of the place index and the
     *            bounding box, <code>ResultBBox</code>, which surrounds the
     *            search results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPlaceIndexForTextResult withSummary(SearchPlaceIndexForTextSummary summary) {
        this.summary = summary;
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
        if (getResults() != null)
            sb.append("Results: " + getResults() + ",");
        if (getSummary() != null)
            sb.append("Summary: " + getSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchPlaceIndexForTextResult == false)
            return false;
        SearchPlaceIndexForTextResult other = (SearchPlaceIndexForTextResult) obj;

        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        return true;
    }
}
