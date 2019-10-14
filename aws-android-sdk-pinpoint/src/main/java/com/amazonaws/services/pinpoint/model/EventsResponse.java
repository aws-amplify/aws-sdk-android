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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about endpoints and the events that they're associated
 * with.
 * </p>
 */
public class EventsResponse implements Serializable {
    /**
     * <p>
     * A map that contains a multipart response for each endpoint. For each item
     * in this object, the endpoint ID is the key and the item response is the
     * value. If no item response exists, the value can also be one of the
     * following: 202, the request was processed successfully; or 400, the
     * payload wasn't valid or required fields were missing.
     * </p>
     */
    private java.util.Map<String, ItemResponse> results;

    /**
     * <p>
     * A map that contains a multipart response for each endpoint. For each item
     * in this object, the endpoint ID is the key and the item response is the
     * value. If no item response exists, the value can also be one of the
     * following: 202, the request was processed successfully; or 400, the
     * payload wasn't valid or required fields were missing.
     * </p>
     *
     * @return <p>
     *         A map that contains a multipart response for each endpoint. For
     *         each item in this object, the endpoint ID is the key and the item
     *         response is the value. If no item response exists, the value can
     *         also be one of the following: 202, the request was processed
     *         successfully; or 400, the payload wasn't valid or required fields
     *         were missing.
     *         </p>
     */
    public java.util.Map<String, ItemResponse> getResults() {
        return results;
    }

    /**
     * <p>
     * A map that contains a multipart response for each endpoint. For each item
     * in this object, the endpoint ID is the key and the item response is the
     * value. If no item response exists, the value can also be one of the
     * following: 202, the request was processed successfully; or 400, the
     * payload wasn't valid or required fields were missing.
     * </p>
     *
     * @param results <p>
     *            A map that contains a multipart response for each endpoint.
     *            For each item in this object, the endpoint ID is the key and
     *            the item response is the value. If no item response exists,
     *            the value can also be one of the following: 202, the request
     *            was processed successfully; or 400, the payload wasn't valid
     *            or required fields were missing.
     *            </p>
     */
    public void setResults(java.util.Map<String, ItemResponse> results) {
        this.results = results;
    }

    /**
     * <p>
     * A map that contains a multipart response for each endpoint. For each item
     * in this object, the endpoint ID is the key and the item response is the
     * value. If no item response exists, the value can also be one of the
     * following: 202, the request was processed successfully; or 400, the
     * payload wasn't valid or required fields were missing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param results <p>
     *            A map that contains a multipart response for each endpoint.
     *            For each item in this object, the endpoint ID is the key and
     *            the item response is the value. If no item response exists,
     *            the value can also be one of the following: 202, the request
     *            was processed successfully; or 400, the payload wasn't valid
     *            or required fields were missing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventsResponse withResults(java.util.Map<String, ItemResponse> results) {
        this.results = results;
        return this;
    }

    /**
     * <p>
     * A map that contains a multipart response for each endpoint. For each item
     * in this object, the endpoint ID is the key and the item response is the
     * value. If no item response exists, the value can also be one of the
     * following: 202, the request was processed successfully; or 400, the
     * payload wasn't valid or required fields were missing.
     * </p>
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
