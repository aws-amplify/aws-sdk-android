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

package com.amazonaws.services.awsresourceaccessmanager.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the resource shares that you own or the resource shares that are shared
 * with you.
 * </p>
 */
public class GetResourceSharesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     */
    private java.util.List<String> resourceShareArns;

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, ACTIVE, FAILED, DELETING, DELETED
     */
    private String resourceShareStatus;

    /**
     * <p>
     * The type of owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF, OTHER-ACCOUNTS
     */
    private String resourceOwner;

    /**
     * <p>
     * The name of the resource share.
     * </p>
     */
    private String name;

    /**
     * <p>
     * One or more tag filters.
     * </p>
     */
    private java.util.List<TagFilter> tagFilters;

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARN) of the resource shares.
     *         </p>
     */
    public java.util.List<String> getResourceShareArns() {
        return resourceShareArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     *
     * @param resourceShareArns <p>
     *            The Amazon Resource Names (ARN) of the resource shares.
     *            </p>
     */
    public void setResourceShareArns(java.util.Collection<String> resourceShareArns) {
        if (resourceShareArns == null) {
            this.resourceShareArns = null;
            return;
        }

        this.resourceShareArns = new java.util.ArrayList<String>(resourceShareArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareArns <p>
     *            The Amazon Resource Names (ARN) of the resource shares.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceSharesRequest withResourceShareArns(String... resourceShareArns) {
        if (getResourceShareArns() == null) {
            this.resourceShareArns = new java.util.ArrayList<String>(resourceShareArns.length);
        }
        for (String value : resourceShareArns) {
            this.resourceShareArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareArns <p>
     *            The Amazon Resource Names (ARN) of the resource shares.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceSharesRequest withResourceShareArns(
            java.util.Collection<String> resourceShareArns) {
        setResourceShareArns(resourceShareArns);
        return this;
    }

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, ACTIVE, FAILED, DELETING, DELETED
     *
     * @return <p>
     *         The status of the resource share.
     *         </p>
     * @see ResourceShareStatus
     */
    public String getResourceShareStatus() {
        return resourceShareStatus;
    }

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, ACTIVE, FAILED, DELETING, DELETED
     *
     * @param resourceShareStatus <p>
     *            The status of the resource share.
     *            </p>
     * @see ResourceShareStatus
     */
    public void setResourceShareStatus(String resourceShareStatus) {
        this.resourceShareStatus = resourceShareStatus;
    }

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, ACTIVE, FAILED, DELETING, DELETED
     *
     * @param resourceShareStatus <p>
     *            The status of the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceShareStatus
     */
    public GetResourceSharesRequest withResourceShareStatus(String resourceShareStatus) {
        this.resourceShareStatus = resourceShareStatus;
        return this;
    }

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, ACTIVE, FAILED, DELETING, DELETED
     *
     * @param resourceShareStatus <p>
     *            The status of the resource share.
     *            </p>
     * @see ResourceShareStatus
     */
    public void setResourceShareStatus(ResourceShareStatus resourceShareStatus) {
        this.resourceShareStatus = resourceShareStatus.toString();
    }

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, ACTIVE, FAILED, DELETING, DELETED
     *
     * @param resourceShareStatus <p>
     *            The status of the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceShareStatus
     */
    public GetResourceSharesRequest withResourceShareStatus(ResourceShareStatus resourceShareStatus) {
        this.resourceShareStatus = resourceShareStatus.toString();
        return this;
    }

    /**
     * <p>
     * The type of owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF, OTHER-ACCOUNTS
     *
     * @return <p>
     *         The type of owner.
     *         </p>
     * @see ResourceOwner
     */
    public String getResourceOwner() {
        return resourceOwner;
    }

    /**
     * <p>
     * The type of owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF, OTHER-ACCOUNTS
     *
     * @param resourceOwner <p>
     *            The type of owner.
     *            </p>
     * @see ResourceOwner
     */
    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * The type of owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF, OTHER-ACCOUNTS
     *
     * @param resourceOwner <p>
     *            The type of owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceOwner
     */
    public GetResourceSharesRequest withResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }

    /**
     * <p>
     * The type of owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF, OTHER-ACCOUNTS
     *
     * @param resourceOwner <p>
     *            The type of owner.
     *            </p>
     * @see ResourceOwner
     */
    public void setResourceOwner(ResourceOwner resourceOwner) {
        this.resourceOwner = resourceOwner.toString();
    }

    /**
     * <p>
     * The type of owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF, OTHER-ACCOUNTS
     *
     * @param resourceOwner <p>
     *            The type of owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceOwner
     */
    public GetResourceSharesRequest withResourceOwner(ResourceOwner resourceOwner) {
        this.resourceOwner = resourceOwner.toString();
        return this;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     *
     * @return <p>
     *         The name of the resource share.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     *
     * @param name <p>
     *            The name of the resource share.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceSharesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * One or more tag filters.
     * </p>
     *
     * @return <p>
     *         One or more tag filters.
     *         </p>
     */
    public java.util.List<TagFilter> getTagFilters() {
        return tagFilters;
    }

    /**
     * <p>
     * One or more tag filters.
     * </p>
     *
     * @param tagFilters <p>
     *            One or more tag filters.
     *            </p>
     */
    public void setTagFilters(java.util.Collection<TagFilter> tagFilters) {
        if (tagFilters == null) {
            this.tagFilters = null;
            return;
        }

        this.tagFilters = new java.util.ArrayList<TagFilter>(tagFilters);
    }

    /**
     * <p>
     * One or more tag filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagFilters <p>
     *            One or more tag filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceSharesRequest withTagFilters(TagFilter... tagFilters) {
        if (getTagFilters() == null) {
            this.tagFilters = new java.util.ArrayList<TagFilter>(tagFilters.length);
        }
        for (TagFilter value : tagFilters) {
            this.tagFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more tag filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagFilters <p>
     *            One or more tag filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceSharesRequest withTagFilters(java.util.Collection<TagFilter> tagFilters) {
        setTagFilters(tagFilters);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     *
     * @return <p>
     *         The token for the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceSharesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @return <p>
     *         The maximum number of results to return with a single call. To
     *         retrieve the remaining results, make another call with the
     *         returned <code>nextToken</code> value.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceSharesRequest withMaxResults(Integer maxResults) {
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
        if (getResourceShareArns() != null)
            sb.append("resourceShareArns: " + getResourceShareArns() + ",");
        if (getResourceShareStatus() != null)
            sb.append("resourceShareStatus: " + getResourceShareStatus() + ",");
        if (getResourceOwner() != null)
            sb.append("resourceOwner: " + getResourceOwner() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getTagFilters() != null)
            sb.append("tagFilters: " + getTagFilters() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceShareArns() == null) ? 0 : getResourceShareArns().hashCode());
        hashCode = prime * hashCode
                + ((getResourceShareStatus() == null) ? 0 : getResourceShareStatus().hashCode());
        hashCode = prime * hashCode
                + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTagFilters() == null) ? 0 : getTagFilters().hashCode());
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

        if (obj instanceof GetResourceSharesRequest == false)
            return false;
        GetResourceSharesRequest other = (GetResourceSharesRequest) obj;

        if (other.getResourceShareArns() == null ^ this.getResourceShareArns() == null)
            return false;
        if (other.getResourceShareArns() != null
                && other.getResourceShareArns().equals(this.getResourceShareArns()) == false)
            return false;
        if (other.getResourceShareStatus() == null ^ this.getResourceShareStatus() == null)
            return false;
        if (other.getResourceShareStatus() != null
                && other.getResourceShareStatus().equals(this.getResourceShareStatus()) == false)
            return false;
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null
                && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTagFilters() == null ^ this.getTagFilters() == null)
            return false;
        if (other.getTagFilters() != null
                && other.getTagFilters().equals(this.getTagFilters()) == false)
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
