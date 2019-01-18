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
 * List the thing groups in your account.
 * </p>
 */
public class ListThingGroupsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A filter that limits the results to those with the specified parent
     * group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String parentGroup;

    /**
     * <p>
     * A filter that limits the results to those with the specified name prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String namePrefixFilter;

    /**
     * <p>
     * If true, return child groups as well.
     * </p>
     */
    private Boolean recursive;

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     *
     * @return <p>
     *         The token to retrieve the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to retrieve the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to retrieve the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingGroupsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @return <p>
     *         The maximum number of results to return at one time.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at one time.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at one time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingGroupsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A filter that limits the results to those with the specified parent
     * group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         A filter that limits the results to those with the specified
     *         parent group.
     *         </p>
     */
    public String getParentGroup() {
        return parentGroup;
    }

    /**
     * <p>
     * A filter that limits the results to those with the specified parent
     * group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param parentGroup <p>
     *            A filter that limits the results to those with the specified
     *            parent group.
     *            </p>
     */
    public void setParentGroup(String parentGroup) {
        this.parentGroup = parentGroup;
    }

    /**
     * <p>
     * A filter that limits the results to those with the specified parent
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param parentGroup <p>
     *            A filter that limits the results to those with the specified
     *            parent group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingGroupsRequest withParentGroup(String parentGroup) {
        this.parentGroup = parentGroup;
        return this;
    }

    /**
     * <p>
     * A filter that limits the results to those with the specified name prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         A filter that limits the results to those with the specified name
     *         prefix.
     *         </p>
     */
    public String getNamePrefixFilter() {
        return namePrefixFilter;
    }

    /**
     * <p>
     * A filter that limits the results to those with the specified name prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param namePrefixFilter <p>
     *            A filter that limits the results to those with the specified
     *            name prefix.
     *            </p>
     */
    public void setNamePrefixFilter(String namePrefixFilter) {
        this.namePrefixFilter = namePrefixFilter;
    }

    /**
     * <p>
     * A filter that limits the results to those with the specified name prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param namePrefixFilter <p>
     *            A filter that limits the results to those with the specified
     *            name prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingGroupsRequest withNamePrefixFilter(String namePrefixFilter) {
        this.namePrefixFilter = namePrefixFilter;
        return this;
    }

    /**
     * <p>
     * If true, return child groups as well.
     * </p>
     *
     * @return <p>
     *         If true, return child groups as well.
     *         </p>
     */
    public Boolean isRecursive() {
        return recursive;
    }

    /**
     * <p>
     * If true, return child groups as well.
     * </p>
     *
     * @return <p>
     *         If true, return child groups as well.
     *         </p>
     */
    public Boolean getRecursive() {
        return recursive;
    }

    /**
     * <p>
     * If true, return child groups as well.
     * </p>
     *
     * @param recursive <p>
     *            If true, return child groups as well.
     *            </p>
     */
    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }

    /**
     * <p>
     * If true, return child groups as well.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recursive <p>
     *            If true, return child groups as well.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingGroupsRequest withRecursive(Boolean recursive) {
        this.recursive = recursive;
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
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getParentGroup() != null)
            sb.append("parentGroup: " + getParentGroup() + ",");
        if (getNamePrefixFilter() != null)
            sb.append("namePrefixFilter: " + getNamePrefixFilter() + ",");
        if (getRecursive() != null)
            sb.append("recursive: " + getRecursive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getParentGroup() == null) ? 0 : getParentGroup().hashCode());
        hashCode = prime * hashCode
                + ((getNamePrefixFilter() == null) ? 0 : getNamePrefixFilter().hashCode());
        hashCode = prime * hashCode + ((getRecursive() == null) ? 0 : getRecursive().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListThingGroupsRequest == false)
            return false;
        ListThingGroupsRequest other = (ListThingGroupsRequest) obj;

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
        if (other.getParentGroup() == null ^ this.getParentGroup() == null)
            return false;
        if (other.getParentGroup() != null
                && other.getParentGroup().equals(this.getParentGroup()) == false)
            return false;
        if (other.getNamePrefixFilter() == null ^ this.getNamePrefixFilter() == null)
            return false;
        if (other.getNamePrefixFilter() != null
                && other.getNamePrefixFilter().equals(this.getNamePrefixFilter()) == false)
            return false;
        if (other.getRecursive() == null ^ this.getRecursive() == null)
            return false;
        if (other.getRecursive() != null
                && other.getRecursive().equals(this.getRecursive()) == false)
            return false;
        return true;
    }
}
