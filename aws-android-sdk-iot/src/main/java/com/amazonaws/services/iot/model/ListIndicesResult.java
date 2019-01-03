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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListIndicesResult implements Serializable {
    /**
     * <p>
     * The index names.
     * </p>
     */
    private java.util.List<String> indexNames;

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The index names.
     * </p>
     *
     * @return <p>
     *         The index names.
     *         </p>
     */
    public java.util.List<String> getIndexNames() {
        return indexNames;
    }

    /**
     * <p>
     * The index names.
     * </p>
     *
     * @param indexNames <p>
     *            The index names.
     *            </p>
     */
    public void setIndexNames(java.util.Collection<String> indexNames) {
        if (indexNames == null) {
            this.indexNames = null;
            return;
        }

        this.indexNames = new java.util.ArrayList<String>(indexNames);
    }

    /**
     * <p>
     * The index names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param indexNames <p>
     *            The index names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIndicesResult withIndexNames(String... indexNames) {
        if (getIndexNames() == null) {
            this.indexNames = new java.util.ArrayList<String>(indexNames.length);
        }
        for (String value : indexNames) {
            this.indexNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The index names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param indexNames <p>
     *            The index names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIndicesResult withIndexNames(java.util.Collection<String> indexNames) {
        setIndexNames(indexNames);
        return this;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     *
     * @return <p>
     *         The token used to get the next set of results, or <b>null</b> if
     *         there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            The token used to get the next set of results, or <b>null</b>
     *            if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token used to get the next set of results, or <b>null</b>
     *            if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIndicesResult withNextToken(String nextToken) {
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
        if (getIndexNames() != null)
            sb.append("indexNames: " + getIndexNames() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexNames() == null) ? 0 : getIndexNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIndicesResult == false)
            return false;
        ListIndicesResult other = (ListIndicesResult) obj;

        if (other.getIndexNames() == null ^ this.getIndexNames() == null)
            return false;
        if (other.getIndexNames() != null
                && other.getIndexNames().equals(this.getIndexNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
