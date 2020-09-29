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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Returns a list of the tags assigned to the specified resource.</p>
 */
public class ListTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>Returns a list of tags for a specific resource type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Document, ManagedInstance, MaintenanceWindow, Parameter, PatchBaseline, OpsItem
     */
    private String resourceType;

    /**
     * <p>The resource ID for which you want to see a list of tags.</p>
     */
    private String resourceId;

    /**
     * <p>Returns a list of tags for a specific resource type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Document, ManagedInstance, MaintenanceWindow, Parameter, PatchBaseline, OpsItem
     *
     * @return <p>Returns a list of tags for a specific resource type.</p>
     *
     * @see ResourceTypeForTagging
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>Returns a list of tags for a specific resource type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Document, ManagedInstance, MaintenanceWindow, Parameter, PatchBaseline, OpsItem
     *
     * @param resourceType <p>Returns a list of tags for a specific resource type.</p>
     *
     * @see ResourceTypeForTagging
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>Returns a list of tags for a specific resource type.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Document, ManagedInstance, MaintenanceWindow, Parameter, PatchBaseline, OpsItem
     *
     * @param resourceType <p>Returns a list of tags for a specific resource type.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ResourceTypeForTagging
     */
    public ListTagsForResourceRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>Returns a list of tags for a specific resource type.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Document, ManagedInstance, MaintenanceWindow, Parameter, PatchBaseline, OpsItem
     *
     * @param resourceType <p>Returns a list of tags for a specific resource type.</p>
     *
     * @see ResourceTypeForTagging
     */
    public void setResourceType(ResourceTypeForTagging resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>Returns a list of tags for a specific resource type.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Document, ManagedInstance, MaintenanceWindow, Parameter, PatchBaseline, OpsItem
     *
     * @param resourceType <p>Returns a list of tags for a specific resource type.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ResourceTypeForTagging
     */
    public ListTagsForResourceRequest withResourceType(ResourceTypeForTagging resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>The resource ID for which you want to see a list of tags.</p>
     *
     * @return <p>The resource ID for which you want to see a list of tags.</p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>The resource ID for which you want to see a list of tags.</p>
     *
     * @param resourceId <p>The resource ID for which you want to see a list of tags.</p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>The resource ID for which you want to see a list of tags.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceId <p>The resource ID for which you want to see a list of tags.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
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
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTagsForResourceRequest == false) return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest)obj;

        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false;
        return true;
    }
}
