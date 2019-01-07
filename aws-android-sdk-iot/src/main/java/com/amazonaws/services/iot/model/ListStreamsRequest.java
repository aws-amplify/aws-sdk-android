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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists all of the streams in your AWS account.
 * </p>
 */
public class ListStreamsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The maximum number of results to return at a time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A token used to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Set to true to return the list of streams in ascending order.
     * </p>
     */
    private Boolean ascendingOrder;

    /**
     * <p>
     * The maximum number of results to return at a time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @return <p>
     *         The maximum number of results to return at a time.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at a time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at a time.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at a time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at a time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStreamsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A token used to get the next set of results.
     * </p>
     *
     * @return <p>
     *         A token used to get the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token used to get the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            A token used to get the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used to get the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token used to get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStreamsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Set to true to return the list of streams in ascending order.
     * </p>
     *
     * @return <p>
     *         Set to true to return the list of streams in ascending order.
     *         </p>
     */
    public Boolean isAscendingOrder() {
        return ascendingOrder;
    }

    /**
     * <p>
     * Set to true to return the list of streams in ascending order.
     * </p>
     *
     * @return <p>
     *         Set to true to return the list of streams in ascending order.
     *         </p>
     */
    public Boolean getAscendingOrder() {
        return ascendingOrder;
    }

    /**
     * <p>
     * Set to true to return the list of streams in ascending order.
     * </p>
     *
     * @param ascendingOrder <p>
     *            Set to true to return the list of streams in ascending order.
     *            </p>
     */
    public void setAscendingOrder(Boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder;
    }

    /**
     * <p>
     * Set to true to return the list of streams in ascending order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ascendingOrder <p>
     *            Set to true to return the list of streams in ascending order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStreamsRequest withAscendingOrder(Boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder;
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
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getAscendingOrder() != null)
            sb.append("ascendingOrder: " + getAscendingOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getAscendingOrder() == null) ? 0 : getAscendingOrder().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStreamsRequest == false)
            return false;
        ListStreamsRequest other = (ListStreamsRequest) obj;

        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getAscendingOrder() == null ^ this.getAscendingOrder() == null)
            return false;
        if (other.getAscendingOrder() != null
                && other.getAscendingOrder().equals(this.getAscendingOrder()) == false)
            return false;
        return true;
    }
}
