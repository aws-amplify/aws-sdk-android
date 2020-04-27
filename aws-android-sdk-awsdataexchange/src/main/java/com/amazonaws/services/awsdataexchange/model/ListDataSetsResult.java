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

package com.amazonaws.services.awsdataexchange.model;

import java.io.Serializable;

public class ListDataSetsResult implements Serializable {
    /**
     * <p>
     * The data set objects listed by the request.
     * </p>
     */
    private java.util.List<DataSetEntry> dataSets;

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The data set objects listed by the request.
     * </p>
     *
     * @return <p>
     *         The data set objects listed by the request.
     *         </p>
     */
    public java.util.List<DataSetEntry> getDataSets() {
        return dataSets;
    }

    /**
     * <p>
     * The data set objects listed by the request.
     * </p>
     *
     * @param dataSets <p>
     *            The data set objects listed by the request.
     *            </p>
     */
    public void setDataSets(java.util.Collection<DataSetEntry> dataSets) {
        if (dataSets == null) {
            this.dataSets = null;
            return;
        }

        this.dataSets = new java.util.ArrayList<DataSetEntry>(dataSets);
    }

    /**
     * <p>
     * The data set objects listed by the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSets <p>
     *            The data set objects listed by the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSetsResult withDataSets(DataSetEntry... dataSets) {
        if (getDataSets() == null) {
            this.dataSets = new java.util.ArrayList<DataSetEntry>(dataSets.length);
        }
        for (DataSetEntry value : dataSets) {
            this.dataSets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The data set objects listed by the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSets <p>
     *            The data set objects listed by the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSetsResult withDataSets(java.util.Collection<DataSetEntry> dataSets) {
        setDataSets(dataSets);
        return this;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of
     * results.
     * </p>
     *
     * @return <p>
     *         The token value retrieved from a previous call to access the next
     *         page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            The token value retrieved from a previous call to access the
     *            next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token value retrieved from a previous call to access the
     *            next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSetsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getDataSets() != null)
            sb.append("DataSets: " + getDataSets() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSets() == null) ? 0 : getDataSets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDataSetsResult == false)
            return false;
        ListDataSetsResult other = (ListDataSetsResult) obj;

        if (other.getDataSets() == null ^ this.getDataSets() == null)
            return false;
        if (other.getDataSets() != null && other.getDataSets().equals(this.getDataSets()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
