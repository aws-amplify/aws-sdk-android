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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListDimensionsResult implements Serializable {
    /**
     * <p>
     * A list of the names of the defined dimensions. Use
     * <code>DescribeDimension</code> to get details for a dimension.
     * </p>
     */
    private java.util.List<String> dimensionNames;

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the names of the defined dimensions. Use
     * <code>DescribeDimension</code> to get details for a dimension.
     * </p>
     *
     * @return <p>
     *         A list of the names of the defined dimensions. Use
     *         <code>DescribeDimension</code> to get details for a dimension.
     *         </p>
     */
    public java.util.List<String> getDimensionNames() {
        return dimensionNames;
    }

    /**
     * <p>
     * A list of the names of the defined dimensions. Use
     * <code>DescribeDimension</code> to get details for a dimension.
     * </p>
     *
     * @param dimensionNames <p>
     *            A list of the names of the defined dimensions. Use
     *            <code>DescribeDimension</code> to get details for a dimension.
     *            </p>
     */
    public void setDimensionNames(java.util.Collection<String> dimensionNames) {
        if (dimensionNames == null) {
            this.dimensionNames = null;
            return;
        }

        this.dimensionNames = new java.util.ArrayList<String>(dimensionNames);
    }

    /**
     * <p>
     * A list of the names of the defined dimensions. Use
     * <code>DescribeDimension</code> to get details for a dimension.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensionNames <p>
     *            A list of the names of the defined dimensions. Use
     *            <code>DescribeDimension</code> to get details for a dimension.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDimensionsResult withDimensionNames(String... dimensionNames) {
        if (getDimensionNames() == null) {
            this.dimensionNames = new java.util.ArrayList<String>(dimensionNames.length);
        }
        for (String value : dimensionNames) {
            this.dimensionNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the names of the defined dimensions. Use
     * <code>DescribeDimension</code> to get details for a dimension.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensionNames <p>
     *            A list of the names of the defined dimensions. Use
     *            <code>DescribeDimension</code> to get details for a dimension.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDimensionsResult withDimensionNames(java.util.Collection<String> dimensionNames) {
        setDimensionNames(dimensionNames);
        return this;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     *
     * @return <p>
     *         A token that can be used to retrieve the next set of results, or
     *         <code>null</code> if there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            A token that can be used to retrieve the next set of results,
     *            or <code>null</code> if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token that can be used to retrieve the next set of results,
     *            or <code>null</code> if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDimensionsResult withNextToken(String nextToken) {
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
        if (getDimensionNames() != null)
            sb.append("dimensionNames: " + getDimensionNames() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDimensionNames() == null) ? 0 : getDimensionNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDimensionsResult == false)
            return false;
        ListDimensionsResult other = (ListDimensionsResult) obj;

        if (other.getDimensionNames() == null ^ this.getDimensionNames() == null)
            return false;
        if (other.getDimensionNames() != null
                && other.getDimensionNames().equals(this.getDimensionNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
