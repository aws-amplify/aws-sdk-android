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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * The results from processing a put events request
 */
public class EventsResponse implements Serializable {
    /**
     * A map containing a multi part response for each endpoint, with the
     * endpoint id as the key and item response as the value
     */
    private java.util.Map<String, ItemResponse> results;

    /**
     * A map containing a multi part response for each endpoint, with the
     * endpoint id as the key and item response as the value
     *
     * @return A map containing a multi part response for each endpoint, with
     *         the endpoint id as the key and item response as the value
     */
    public java.util.Map<String, ItemResponse> getResults() {
        return results;
    }

    /**
     * A map containing a multi part response for each endpoint, with the
     * endpoint id as the key and item response as the value
     *
     * @param results A map containing a multi part response for each endpoint,
     *            with the endpoint id as the key and item response as the value
     */
    public void setResults(java.util.Map<String, ItemResponse> results) {
        this.results = results;
    }

    /**
     * A map containing a multi part response for each endpoint, with the
     * endpoint id as the key and item response as the value
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param results A map containing a multi part response for each endpoint,
     *            with the endpoint id as the key and item response as the value
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventsResponse withResults(java.util.Map<String, ItemResponse> results) {
        this.results = results;
        return this;
    }

    /**
     * A map containing a multi part response for each endpoint, with the
     * endpoint id as the key and item response as the value
     * <p>
     * The method adds a new key-value pair into Results parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Results.
     * @param value The corresponding value of the entry to be added into
     *            Results.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventsResponse addResultsEntry(String key, ItemResponse value) {
        if (null == this.results) {
            this.results = new java.util.HashMap<String, ItemResponse>();
        }
        if (this.results.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.results.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Results.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public EventsResponse clearResultsEntries() {
        this.results = null;
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
            sb.append("Results: " + getResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventsResponse == false)
            return false;
        EventsResponse other = (EventsResponse) obj;

        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        return true;
    }
}
