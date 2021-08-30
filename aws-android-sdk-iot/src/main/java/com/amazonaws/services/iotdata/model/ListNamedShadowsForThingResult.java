/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iotdata.model;

import java.io.Serializable;

public class ListNamedShadowsForThingResult implements Serializable {
    /**
     * <p>
     * The list of shadows for the specified thing.
     * </p>
     */
    private java.util.List<String> results;

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Epoch date and time the response was generated by IoT.
     * </p>
     */
    private Long timestamp;

    /**
     * <p>
     * The list of shadows for the specified thing.
     * </p>
     *
     * @return <p>
     *         The list of shadows for the specified thing.
     *         </p>
     */
    public java.util.List<String> getResults() {
        return results;
    }

    /**
     * <p>
     * The list of shadows for the specified thing.
     * </p>
     *
     * @param results <p>
     *            The list of shadows for the specified thing.
     *            </p>
     */
    public void setResults(java.util.Collection<String> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<String>(results);
    }

    /**
     * <p>
     * The list of shadows for the specified thing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param results <p>
     *            The list of shadows for the specified thing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNamedShadowsForThingResult withResults(String... results) {
        if (getResults() == null) {
            this.results = new java.util.ArrayList<String>(results.length);
        }
        for (String value : results) {
            this.results.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of shadows for the specified thing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param results <p>
     *            The list of shadows for the specified thing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNamedShadowsForThingResult withResults(java.util.Collection<String> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     *
     * @return <p>
     *         The token to use to get the next set of results, or <b>null</b>
     *         if there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to get the next set of results, or
     *            <b>null</b> if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to get the next set of results, or
     *            <b>null</b> if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNamedShadowsForThingResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The Epoch date and time the response was generated by IoT.
     * </p>
     *
     * @return <p>
     *         The Epoch date and time the response was generated by IoT.
     *         </p>
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The Epoch date and time the response was generated by IoT.
     * </p>
     *
     * @param timestamp <p>
     *            The Epoch date and time the response was generated by IoT.
     *            </p>
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The Epoch date and time the response was generated by IoT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The Epoch date and time the response was generated by IoT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNamedShadowsForThingResult withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
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
            sb.append("results: " + getResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getTimestamp() != null)
            sb.append("timestamp: " + getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNamedShadowsForThingResult == false)
            return false;
        ListNamedShadowsForThingResult other = (ListNamedShadowsForThingResult) obj;

        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }
}
