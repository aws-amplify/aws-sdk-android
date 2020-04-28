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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists tags for one health check or hosted zone.
 * </p>
 * <p>
 * For information about using tags for cost allocation, see <a href=
 * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html"
 * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
 * User Guide</i>.
 * </p>
 */
public class ListTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The type of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck, hostedzone
     */
    private String resourceType;

    /**
     * <p>
     * The ID of the resource for which you want to retrieve tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String resourceId;

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck, hostedzone
     *
     * @return <p>
     *         The type of the resource.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The resource type for health checks is <code>healthcheck</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The resource type for hosted zones is <code>hostedzone</code>.
     *         </p>
     *         </li>
     *         </ul>
     * @see TagResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck, hostedzone
     *
     * @param resourceType <p>
     *            The type of the resource.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The resource type for health checks is
     *            <code>healthcheck</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The resource type for hosted zones is <code>hostedzone</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see TagResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck, hostedzone
     *
     * @param resourceType <p>
     *            The type of the resource.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The resource type for health checks is
     *            <code>healthcheck</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The resource type for hosted zones is <code>hostedzone</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TagResourceType
     */
    public ListTagsForResourceRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck, hostedzone
     *
     * @param resourceType <p>
     *            The type of the resource.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The resource type for health checks is
     *            <code>healthcheck</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The resource type for hosted zones is <code>hostedzone</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see TagResourceType
     */
    public void setResourceType(TagResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck, hostedzone
     *
     * @param resourceType <p>
     *            The type of the resource.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The resource type for health checks is
     *            <code>healthcheck</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The resource type for hosted zones is <code>hostedzone</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TagResourceType
     */
    public ListTagsForResourceRequest withResourceType(TagResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the resource for which you want to retrieve tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The ID of the resource for which you want to retrieve tags.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The ID of the resource for which you want to retrieve tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param resourceId <p>
     *            The ID of the resource for which you want to retrieve tags.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource for which you want to retrieve tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param resourceId <p>
     *            The ID of the resource for which you want to retrieve tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
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
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;

        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        return true;
    }
}
