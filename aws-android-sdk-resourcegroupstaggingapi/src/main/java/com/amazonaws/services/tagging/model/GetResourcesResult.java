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

package com.amazonaws.services.tagging.model;

import java.io.Serializable;

public class GetResourcesResult implements Serializable {
    /**
     * <p>
     * A string that indicates that the response contains more data than can be
     * returned in a single response. To receive additional data, specify this
     * string for the <code>PaginationToken</code> value in a subsequent
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String paginationToken;

    /**
     * <p>
     * A list of resource ARNs and the tags (keys and values) associated with
     * each.
     * </p>
     */
    private java.util.List<ResourceTagMapping> resourceTagMappingList;

    /**
     * <p>
     * A string that indicates that the response contains more data than can be
     * returned in a single response. To receive additional data, specify this
     * string for the <code>PaginationToken</code> value in a subsequent
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         A string that indicates that the response contains more data than
     *         can be returned in a single response. To receive additional data,
     *         specify this string for the <code>PaginationToken</code> value in
     *         a subsequent request.
     *         </p>
     */
    public String getPaginationToken() {
        return paginationToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more data than can be
     * returned in a single response. To receive additional data, specify this
     * string for the <code>PaginationToken</code> value in a subsequent
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param paginationToken <p>
     *            A string that indicates that the response contains more data
     *            than can be returned in a single response. To receive
     *            additional data, specify this string for the
     *            <code>PaginationToken</code> value in a subsequent request.
     *            </p>
     */
    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more data than can be
     * returned in a single response. To receive additional data, specify this
     * string for the <code>PaginationToken</code> value in a subsequent
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param paginationToken <p>
     *            A string that indicates that the response contains more data
     *            than can be returned in a single response. To receive
     *            additional data, specify this string for the
     *            <code>PaginationToken</code> value in a subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourcesResult withPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
        return this;
    }

    /**
     * <p>
     * A list of resource ARNs and the tags (keys and values) associated with
     * each.
     * </p>
     *
     * @return <p>
     *         A list of resource ARNs and the tags (keys and values) associated
     *         with each.
     *         </p>
     */
    public java.util.List<ResourceTagMapping> getResourceTagMappingList() {
        return resourceTagMappingList;
    }

    /**
     * <p>
     * A list of resource ARNs and the tags (keys and values) associated with
     * each.
     * </p>
     *
     * @param resourceTagMappingList <p>
     *            A list of resource ARNs and the tags (keys and values)
     *            associated with each.
     *            </p>
     */
    public void setResourceTagMappingList(
            java.util.Collection<ResourceTagMapping> resourceTagMappingList) {
        if (resourceTagMappingList == null) {
            this.resourceTagMappingList = null;
            return;
        }

        this.resourceTagMappingList = new java.util.ArrayList<ResourceTagMapping>(
                resourceTagMappingList);
    }

    /**
     * <p>
     * A list of resource ARNs and the tags (keys and values) associated with
     * each.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTagMappingList <p>
     *            A list of resource ARNs and the tags (keys and values)
     *            associated with each.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourcesResult withResourceTagMappingList(
            ResourceTagMapping... resourceTagMappingList) {
        if (getResourceTagMappingList() == null) {
            this.resourceTagMappingList = new java.util.ArrayList<ResourceTagMapping>(
                    resourceTagMappingList.length);
        }
        for (ResourceTagMapping value : resourceTagMappingList) {
            this.resourceTagMappingList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource ARNs and the tags (keys and values) associated with
     * each.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTagMappingList <p>
     *            A list of resource ARNs and the tags (keys and values)
     *            associated with each.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourcesResult withResourceTagMappingList(
            java.util.Collection<ResourceTagMapping> resourceTagMappingList) {
        setResourceTagMappingList(resourceTagMappingList);
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
        if (getPaginationToken() != null)
            sb.append("PaginationToken: " + getPaginationToken() + ",");
        if (getResourceTagMappingList() != null)
            sb.append("ResourceTagMappingList: " + getResourceTagMappingList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceTagMappingList() == null) ? 0 : getResourceTagMappingList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourcesResult == false)
            return false;
        GetResourcesResult other = (GetResourcesResult) obj;

        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null
                && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        if (other.getResourceTagMappingList() == null ^ this.getResourceTagMappingList() == null)
            return false;
        if (other.getResourceTagMappingList() != null
                && other.getResourceTagMappingList().equals(this.getResourceTagMappingList()) == false)
            return false;
        return true;
    }
}
