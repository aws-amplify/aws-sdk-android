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

package com.amazonaws.services.workmail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes a member from the resource's set of delegates.
 * </p>
 */
public class DisassociateDelegateFromResourceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier for the organization under which the resource exists.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     */
    private String organizationId;

    /**
     * <p>
     * The identifier of the resource from which delegates' set members are
     * removed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^r-[0-9a-f]{32}$<br/>
     */
    private String resourceId;

    /**
     * <p>
     * The identifier for the member (user, group) to be removed from the
     * resource's delegates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     */
    private String entityId;

    /**
     * <p>
     * The identifier for the organization under which the resource exists.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @return <p>
     *         The identifier for the organization under which the resource
     *         exists.
     *         </p>
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * <p>
     * The identifier for the organization under which the resource exists.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The identifier for the organization under which the resource
     *            exists.
     *            </p>
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier for the organization under which the resource exists.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The identifier for the organization under which the resource
     *            exists.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateDelegateFromResourceRequest withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * <p>
     * The identifier of the resource from which delegates' set members are
     * removed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^r-[0-9a-f]{32}$<br/>
     *
     * @return <p>
     *         The identifier of the resource from which delegates' set members
     *         are removed.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The identifier of the resource from which delegates' set members are
     * removed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^r-[0-9a-f]{32}$<br/>
     *
     * @param resourceId <p>
     *            The identifier of the resource from which delegates' set
     *            members are removed.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the resource from which delegates' set members are
     * removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^r-[0-9a-f]{32}$<br/>
     *
     * @param resourceId <p>
     *            The identifier of the resource from which delegates' set
     *            members are removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateDelegateFromResourceRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * The identifier for the member (user, group) to be removed from the
     * resource's delegates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @return <p>
     *         The identifier for the member (user, group) to be removed from
     *         the resource's delegates.
     *         </p>
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * <p>
     * The identifier for the member (user, group) to be removed from the
     * resource's delegates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @param entityId <p>
     *            The identifier for the member (user, group) to be removed from
     *            the resource's delegates.
     *            </p>
     */
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The identifier for the member (user, group) to be removed from the
     * resource's delegates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @param entityId <p>
     *            The identifier for the member (user, group) to be removed from
     *            the resource's delegates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateDelegateFromResourceRequest withEntityId(String entityId) {
        this.entityId = entityId;
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: " + getOrganizationId() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getEntityId() != null)
            sb.append("EntityId: " + getEntityId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateDelegateFromResourceRequest == false)
            return false;
        DisassociateDelegateFromResourceRequest other = (DisassociateDelegateFromResourceRequest) obj;

        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null
                && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        return true;
    }
}
