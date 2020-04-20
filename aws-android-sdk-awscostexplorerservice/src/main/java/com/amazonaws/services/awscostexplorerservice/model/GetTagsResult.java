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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

public class GetTagsResult implements Serializable {
    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String nextPageToken;

    /**
     * <p>
     * The tags that match your request.
     * </p>
     */
    private java.util.List<String> tags;

    /**
     * <p>
     * The number of query results that AWS returns at a time.
     * </p>
     */
    private Integer returnSize;

    /**
     * <p>
     * The total number of query results.
     * </p>
     */
    private Integer totalSize;

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The token for the next set of retrievable results. AWS provides
     *         the token when the response from a previous call has more results
     *         than the maximum page size.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The token for the next set of retrievable results. AWS
     *            provides the token when the response from a previous call has
     *            more results than the maximum page size.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The token for the next set of retrievable results. AWS
     *            provides the token when the response from a previous call has
     *            more results than the maximum page size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTagsResult withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    /**
     * <p>
     * The tags that match your request.
     * </p>
     *
     * @return <p>
     *         The tags that match your request.
     *         </p>
     */
    public java.util.List<String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that match your request.
     * </p>
     *
     * @param tags <p>
     *            The tags that match your request.
     *            </p>
     */
    public void setTags(java.util.Collection<String> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<String>(tags);
    }

    /**
     * <p>
     * The tags that match your request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags that match your request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTagsResult withTags(String... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<String>(tags.length);
        }
        for (String value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags that match your request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags that match your request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTagsResult withTags(java.util.Collection<String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The number of query results that AWS returns at a time.
     * </p>
     *
     * @return <p>
     *         The number of query results that AWS returns at a time.
     *         </p>
     */
    public Integer getReturnSize() {
        return returnSize;
    }

    /**
     * <p>
     * The number of query results that AWS returns at a time.
     * </p>
     *
     * @param returnSize <p>
     *            The number of query results that AWS returns at a time.
     *            </p>
     */
    public void setReturnSize(Integer returnSize) {
        this.returnSize = returnSize;
    }

    /**
     * <p>
     * The number of query results that AWS returns at a time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param returnSize <p>
     *            The number of query results that AWS returns at a time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTagsResult withReturnSize(Integer returnSize) {
        this.returnSize = returnSize;
        return this;
    }

    /**
     * <p>
     * The total number of query results.
     * </p>
     *
     * @return <p>
     *         The total number of query results.
     *         </p>
     */
    public Integer getTotalSize() {
        return totalSize;
    }

    /**
     * <p>
     * The total number of query results.
     * </p>
     *
     * @param totalSize <p>
     *            The total number of query results.
     *            </p>
     */
    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    /**
     * <p>
     * The total number of query results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalSize <p>
     *            The total number of query results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTagsResult withTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
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
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getReturnSize() != null)
            sb.append("ReturnSize: " + getReturnSize() + ",");
        if (getTotalSize() != null)
            sb.append("TotalSize: " + getTotalSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getReturnSize() == null) ? 0 : getReturnSize().hashCode());
        hashCode = prime * hashCode + ((getTotalSize() == null) ? 0 : getTotalSize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTagsResult == false)
            return false;
        GetTagsResult other = (GetTagsResult) obj;

        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getReturnSize() == null ^ this.getReturnSize() == null)
            return false;
        if (other.getReturnSize() != null
                && other.getReturnSize().equals(this.getReturnSize()) == false)
            return false;
        if (other.getTotalSize() == null ^ this.getTotalSize() == null)
            return false;
        if (other.getTotalSize() != null
                && other.getTotalSize().equals(this.getTotalSize()) == false)
            return false;
        return true;
    }
}
