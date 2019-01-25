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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets a list of the properties of all entity recognizers that you created,
 * including recognizers currently in training. Allows you to filter the list of
 * recognizers based on criteria such as status and submission time. This call
 * returns up to 500 entity recognizers in the list, with a default number of
 * 100 recognizers in the list.
 * </p>
 * <p>
 * The results of this list are not in any particular order. Please get the list
 * and sort locally if needed.
 * </p>
 */
public class ListEntityRecognizersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Filters the list of entities returned. You can filter on
     * <code>Status</code>, <code>SubmitTimeBefore</code>, or
     * <code>SubmitTimeAfter</code>. You can only set one filter at a time.
     * </p>
     */
    private EntityRecognizerFilter filter;

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return on each page. The default is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Filters the list of entities returned. You can filter on
     * <code>Status</code>, <code>SubmitTimeBefore</code>, or
     * <code>SubmitTimeAfter</code>. You can only set one filter at a time.
     * </p>
     *
     * @return <p>
     *         Filters the list of entities returned. You can filter on
     *         <code>Status</code>, <code>SubmitTimeBefore</code>, or
     *         <code>SubmitTimeAfter</code>. You can only set one filter at a
     *         time.
     *         </p>
     */
    public EntityRecognizerFilter getFilter() {
        return filter;
    }

    /**
     * <p>
     * Filters the list of entities returned. You can filter on
     * <code>Status</code>, <code>SubmitTimeBefore</code>, or
     * <code>SubmitTimeAfter</code>. You can only set one filter at a time.
     * </p>
     *
     * @param filter <p>
     *            Filters the list of entities returned. You can filter on
     *            <code>Status</code>, <code>SubmitTimeBefore</code>, or
     *            <code>SubmitTimeAfter</code>. You can only set one filter at a
     *            time.
     *            </p>
     */
    public void setFilter(EntityRecognizerFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Filters the list of entities returned. You can filter on
     * <code>Status</code>, <code>SubmitTimeBefore</code>, or
     * <code>SubmitTimeAfter</code>. You can only set one filter at a time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            Filters the list of entities returned. You can filter on
     *            <code>Status</code>, <code>SubmitTimeBefore</code>, or
     *            <code>SubmitTimeAfter</code>. You can only set one filter at a
     *            time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntityRecognizersRequest withFilter(EntityRecognizerFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Identifies the next page of results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            Identifies the next page of results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            Identifies the next page of results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntityRecognizersRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return on each page. The default is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @return <p>
     *         The maximum number of results to return on each page. The default
     *         is 100.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return on each page. The default is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return on each page. The
     *            default is 100.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return on each page. The default is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return on each page. The
     *            default is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEntityRecognizersRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEntityRecognizersRequest == false)
            return false;
        ListEntityRecognizersRequest other = (ListEntityRecognizersRequest) obj;

        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
