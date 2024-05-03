/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class SearchPredefinedAttributesResult implements Serializable {
    /**
     * <p>
     * Predefined attributes matched by the search criteria.
     * </p>
     */
    private java.util.List<PredefinedAttribute> predefinedAttributes;

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The approximate number of predefined attributes which matched your search
     * query.
     * </p>
     */
    private Long approximateTotalCount;

    /**
     * <p>
     * Predefined attributes matched by the search criteria.
     * </p>
     *
     * @return <p>
     *         Predefined attributes matched by the search criteria.
     *         </p>
     */
    public java.util.List<PredefinedAttribute> getPredefinedAttributes() {
        return predefinedAttributes;
    }

    /**
     * <p>
     * Predefined attributes matched by the search criteria.
     * </p>
     *
     * @param predefinedAttributes <p>
     *            Predefined attributes matched by the search criteria.
     *            </p>
     */
    public void setPredefinedAttributes(
            java.util.Collection<PredefinedAttribute> predefinedAttributes) {
        if (predefinedAttributes == null) {
            this.predefinedAttributes = null;
            return;
        }

        this.predefinedAttributes = new java.util.ArrayList<PredefinedAttribute>(
                predefinedAttributes);
    }

    /**
     * <p>
     * Predefined attributes matched by the search criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param predefinedAttributes <p>
     *            Predefined attributes matched by the search criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPredefinedAttributesResult withPredefinedAttributes(
            PredefinedAttribute... predefinedAttributes) {
        if (getPredefinedAttributes() == null) {
            this.predefinedAttributes = new java.util.ArrayList<PredefinedAttribute>(
                    predefinedAttributes.length);
        }
        for (PredefinedAttribute value : predefinedAttributes) {
            this.predefinedAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Predefined attributes matched by the search criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param predefinedAttributes <p>
     *            Predefined attributes matched by the search criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPredefinedAttributesResult withPredefinedAttributes(
            java.util.Collection<PredefinedAttribute> predefinedAttributes) {
        setPredefinedAttributes(predefinedAttributes);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     *
     * @return <p>
     *         The token for the next set of results. Use the value returned in
     *         the previous response in the next request to retrieve the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPredefinedAttributesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The approximate number of predefined attributes which matched your search
     * query.
     * </p>
     *
     * @return <p>
     *         The approximate number of predefined attributes which matched
     *         your search query.
     *         </p>
     */
    public Long getApproximateTotalCount() {
        return approximateTotalCount;
    }

    /**
     * <p>
     * The approximate number of predefined attributes which matched your search
     * query.
     * </p>
     *
     * @param approximateTotalCount <p>
     *            The approximate number of predefined attributes which matched
     *            your search query.
     *            </p>
     */
    public void setApproximateTotalCount(Long approximateTotalCount) {
        this.approximateTotalCount = approximateTotalCount;
    }

    /**
     * <p>
     * The approximate number of predefined attributes which matched your search
     * query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approximateTotalCount <p>
     *            The approximate number of predefined attributes which matched
     *            your search query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchPredefinedAttributesResult withApproximateTotalCount(Long approximateTotalCount) {
        this.approximateTotalCount = approximateTotalCount;
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
        if (getPredefinedAttributes() != null)
            sb.append("PredefinedAttributes: " + getPredefinedAttributes() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getApproximateTotalCount() != null)
            sb.append("ApproximateTotalCount: " + getApproximateTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPredefinedAttributes() == null) ? 0 : getPredefinedAttributes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getApproximateTotalCount() == null) ? 0 : getApproximateTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchPredefinedAttributesResult == false)
            return false;
        SearchPredefinedAttributesResult other = (SearchPredefinedAttributesResult) obj;

        if (other.getPredefinedAttributes() == null ^ this.getPredefinedAttributes() == null)
            return false;
        if (other.getPredefinedAttributes() != null
                && other.getPredefinedAttributes().equals(this.getPredefinedAttributes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getApproximateTotalCount() == null ^ this.getApproximateTotalCount() == null)
            return false;
        if (other.getApproximateTotalCount() != null
                && other.getApproximateTotalCount().equals(this.getApproximateTotalCount()) == false)
            return false;
        return true;
    }
}
