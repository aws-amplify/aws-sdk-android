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
 * Remove one or more specified aliases from a set of aliases for a given user.
 * </p>
 */
public class DeleteAliasRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier for the organization under which the user exists.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     */
    private String organizationId;

    /**
     * <p>
     * The identifier for the member (user or group) from which to have the
     * aliases removed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     */
    private String entityId;

    /**
     * <p>
     * The aliases to be removed from the user's set of aliases. Duplicate
     * entries in the list are collapsed into single entries (the list is
     * transformed into a set).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 254<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}<br/>
     */
    private String alias;

    /**
     * <p>
     * The identifier for the organization under which the user exists.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @return <p>
     *         The identifier for the organization under which the user exists.
     *         </p>
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * <p>
     * The identifier for the organization under which the user exists.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The identifier for the organization under which the user
     *            exists.
     *            </p>
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier for the organization under which the user exists.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The identifier for the organization under which the user
     *            exists.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAliasRequest withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * <p>
     * The identifier for the member (user or group) from which to have the
     * aliases removed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @return <p>
     *         The identifier for the member (user or group) from which to have
     *         the aliases removed.
     *         </p>
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * <p>
     * The identifier for the member (user or group) from which to have the
     * aliases removed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @param entityId <p>
     *            The identifier for the member (user or group) from which to
     *            have the aliases removed.
     *            </p>
     */
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The identifier for the member (user or group) from which to have the
     * aliases removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @param entityId <p>
     *            The identifier for the member (user or group) from which to
     *            have the aliases removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAliasRequest withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * <p>
     * The aliases to be removed from the user's set of aliases. Duplicate
     * entries in the list are collapsed into single entries (the list is
     * transformed into a set).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 254<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}<br/>
     *
     * @return <p>
     *         The aliases to be removed from the user's set of aliases.
     *         Duplicate entries in the list are collapsed into single entries
     *         (the list is transformed into a set).
     *         </p>
     */
    public String getAlias() {
        return alias;
    }

    /**
     * <p>
     * The aliases to be removed from the user's set of aliases. Duplicate
     * entries in the list are collapsed into single entries (the list is
     * transformed into a set).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 254<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}<br/>
     *
     * @param alias <p>
     *            The aliases to be removed from the user's set of aliases.
     *            Duplicate entries in the list are collapsed into single
     *            entries (the list is transformed into a set).
     *            </p>
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The aliases to be removed from the user's set of aliases. Duplicate
     * entries in the list are collapsed into single entries (the list is
     * transformed into a set).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 254<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}<br/>
     *
     * @param alias <p>
     *            The aliases to be removed from the user's set of aliases.
     *            Duplicate entries in the list are collapsed into single
     *            entries (the list is transformed into a set).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAliasRequest withAlias(String alias) {
        this.alias = alias;
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
        if (getEntityId() != null)
            sb.append("EntityId: " + getEntityId() + ",");
        if (getAlias() != null)
            sb.append("Alias: " + getAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAliasRequest == false)
            return false;
        DeleteAliasRequest other = (DeleteAliasRequest) obj;

        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null
                && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        return true;
    }
}
