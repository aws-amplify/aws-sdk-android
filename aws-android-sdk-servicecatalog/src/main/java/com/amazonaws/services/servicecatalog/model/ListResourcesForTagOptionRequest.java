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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the resources associated with the specified TagOption.
 * </p>
 */
public class ListResourcesForTagOptionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The TagOption identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String tagOptionId;

    /**
     * <p>
     * The resource type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Portfolio</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Product</code>
     * </p>
     * </li>
     * </ul>
     */
    private String resourceType;

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 20<br/>
     */
    private Integer pageSize;

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     */
    private String pageToken;

    /**
     * <p>
     * The TagOption identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The TagOption identifier.
     *         </p>
     */
    public String getTagOptionId() {
        return tagOptionId;
    }

    /**
     * <p>
     * The TagOption identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param tagOptionId <p>
     *            The TagOption identifier.
     *            </p>
     */
    public void setTagOptionId(String tagOptionId) {
        this.tagOptionId = tagOptionId;
    }

    /**
     * <p>
     * The TagOption identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param tagOptionId <p>
     *            The TagOption identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourcesForTagOptionRequest withTagOptionId(String tagOptionId) {
        this.tagOptionId = tagOptionId;
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Portfolio</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Product</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The resource type.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Portfolio</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Product</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Portfolio</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Product</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param resourceType <p>
     *            The resource type.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Portfolio</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Product</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Portfolio</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Product</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceType <p>
     *            The resource type.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Portfolio</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Product</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourcesForTagOptionRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 20<br/>
     *
     * @return <p>
     *         The maximum number of items to return with this call.
     *         </p>
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 20<br/>
     *
     * @param pageSize <p>
     *            The maximum number of items to return with this call.
     *            </p>
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 20<br/>
     *
     * @param pageSize <p>
     *            The maximum number of items to return with this call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourcesForTagOptionRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @return <p>
     *         The page token for the next set of results. To retrieve the first
     *         set of results, use null.
     *         </p>
     */
    public String getPageToken() {
        return pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param pageToken <p>
     *            The page token for the next set of results. To retrieve the
     *            first set of results, use null.
     *            </p>
     */
    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param pageToken <p>
     *            The page token for the next set of results. To retrieve the
     *            first set of results, use null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListResourcesForTagOptionRequest withPageToken(String pageToken) {
        this.pageToken = pageToken;
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
        if (getTagOptionId() != null)
            sb.append("TagOptionId: " + getTagOptionId() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getPageSize() != null)
            sb.append("PageSize: " + getPageSize() + ",");
        if (getPageToken() != null)
            sb.append("PageToken: " + getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTagOptionId() == null) ? 0 : getTagOptionId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourcesForTagOptionRequest == false)
            return false;
        ListResourcesForTagOptionRequest other = (ListResourcesForTagOptionRequest) obj;

        if (other.getTagOptionId() == null ^ this.getTagOptionId() == null)
            return false;
        if (other.getTagOptionId() != null
                && other.getTagOptionId().equals(this.getTagOptionId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null
                && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }
}
