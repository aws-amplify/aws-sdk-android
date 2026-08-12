/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists all adapters that match the specified filtration criteria.
 * </p>
 */
public class ListAdaptersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the lower bound for the ListAdapters operation. Ensures
     * ListAdapters returns only adapters created after the specified creation
     * time.
     * </p>
     */
    private java.util.Date afterCreationTime;

    /**
     * <p>
     * Specifies the upper bound for the ListAdapters operation. Ensures
     * ListAdapters returns only adapters created before the specified creation
     * time.
     * </p>
     */
    private java.util.Date beforeCreationTime;

    /**
     * <p>
     * The maximum number of results to return when listing adapters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Identifies the next page of results to return when listing adapters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies the lower bound for the ListAdapters operation. Ensures
     * ListAdapters returns only adapters created after the specified creation
     * time.
     * </p>
     *
     * @return <p>
     *         Specifies the lower bound for the ListAdapters operation. Ensures
     *         ListAdapters returns only adapters created after the specified
     *         creation time.
     *         </p>
     */
    public java.util.Date getAfterCreationTime() {
        return afterCreationTime;
    }

    /**
     * <p>
     * Specifies the lower bound for the ListAdapters operation. Ensures
     * ListAdapters returns only adapters created after the specified creation
     * time.
     * </p>
     *
     * @param afterCreationTime <p>
     *            Specifies the lower bound for the ListAdapters operation.
     *            Ensures ListAdapters returns only adapters created after the
     *            specified creation time.
     *            </p>
     */
    public void setAfterCreationTime(java.util.Date afterCreationTime) {
        this.afterCreationTime = afterCreationTime;
    }

    /**
     * <p>
     * Specifies the lower bound for the ListAdapters operation. Ensures
     * ListAdapters returns only adapters created after the specified creation
     * time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param afterCreationTime <p>
     *            Specifies the lower bound for the ListAdapters operation.
     *            Ensures ListAdapters returns only adapters created after the
     *            specified creation time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAdaptersRequest withAfterCreationTime(java.util.Date afterCreationTime) {
        this.afterCreationTime = afterCreationTime;
        return this;
    }

    /**
     * <p>
     * Specifies the upper bound for the ListAdapters operation. Ensures
     * ListAdapters returns only adapters created before the specified creation
     * time.
     * </p>
     *
     * @return <p>
     *         Specifies the upper bound for the ListAdapters operation. Ensures
     *         ListAdapters returns only adapters created before the specified
     *         creation time.
     *         </p>
     */
    public java.util.Date getBeforeCreationTime() {
        return beforeCreationTime;
    }

    /**
     * <p>
     * Specifies the upper bound for the ListAdapters operation. Ensures
     * ListAdapters returns only adapters created before the specified creation
     * time.
     * </p>
     *
     * @param beforeCreationTime <p>
     *            Specifies the upper bound for the ListAdapters operation.
     *            Ensures ListAdapters returns only adapters created before the
     *            specified creation time.
     *            </p>
     */
    public void setBeforeCreationTime(java.util.Date beforeCreationTime) {
        this.beforeCreationTime = beforeCreationTime;
    }

    /**
     * <p>
     * Specifies the upper bound for the ListAdapters operation. Ensures
     * ListAdapters returns only adapters created before the specified creation
     * time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beforeCreationTime <p>
     *            Specifies the upper bound for the ListAdapters operation.
     *            Ensures ListAdapters returns only adapters created before the
     *            specified creation time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAdaptersRequest withBeforeCreationTime(java.util.Date beforeCreationTime) {
        this.beforeCreationTime = beforeCreationTime;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return when listing adapters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of results to return when listing adapters.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return when listing adapters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return when listing adapters.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return when listing adapters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return when listing adapters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAdaptersRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return when listing adapters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Identifies the next page of results to return when listing
     *         adapters.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return when listing adapters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextToken <p>
     *            Identifies the next page of results to return when listing
     *            adapters.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return when listing adapters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextToken <p>
     *            Identifies the next page of results to return when listing
     *            adapters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAdaptersRequest withNextToken(String nextToken) {
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
        if (getAfterCreationTime() != null)
            sb.append("AfterCreationTime: " + getAfterCreationTime() + ",");
        if (getBeforeCreationTime() != null)
            sb.append("BeforeCreationTime: " + getBeforeCreationTime() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAfterCreationTime() == null) ? 0 : getAfterCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getBeforeCreationTime() == null) ? 0 : getBeforeCreationTime().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAdaptersRequest == false)
            return false;
        ListAdaptersRequest other = (ListAdaptersRequest) obj;

        if (other.getAfterCreationTime() == null ^ this.getAfterCreationTime() == null)
            return false;
        if (other.getAfterCreationTime() != null
                && other.getAfterCreationTime().equals(this.getAfterCreationTime()) == false)
            return false;
        if (other.getBeforeCreationTime() == null ^ this.getBeforeCreationTime() == null)
            return false;
        if (other.getBeforeCreationTime() != null
                && other.getBeforeCreationTime().equals(this.getBeforeCreationTime()) == false)
            return false;
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
        return true;
    }
}
