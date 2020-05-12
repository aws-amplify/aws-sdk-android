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
 * Sets permissions for a user, group, or resource. This replaces any
 * pre-existing permissions.
 * </p>
 */
public class PutMailboxPermissionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the organization under which the user, group, or
     * resource exists.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     */
    private String organizationId;

    /**
     * <p>
     * The identifier of the user, group, or resource for which to update
     * mailbox permissions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     */
    private String entityId;

    /**
     * <p>
     * The identifier of the user, group, or resource to which to grant the
     * permissions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     */
    private String granteeId;

    /**
     * <p>
     * The permissions granted to the grantee. SEND_AS allows the grantee to
     * send email as the owner of the mailbox (the grantee is not mentioned on
     * these emails). SEND_ON_BEHALF allows the grantee to send email on behalf
     * of the owner of the mailbox (the grantee is not mentioned as the physical
     * sender of these emails). FULL_ACCESS allows the grantee full access to
     * the mailbox, irrespective of other folder-level permissions set on the
     * mailbox.
     * </p>
     */
    private java.util.List<String> permissionValues;

    /**
     * <p>
     * The identifier of the organization under which the user, group, or
     * resource exists.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @return <p>
     *         The identifier of the organization under which the user, group,
     *         or resource exists.
     *         </p>
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * <p>
     * The identifier of the organization under which the user, group, or
     * resource exists.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The identifier of the organization under which the user,
     *            group, or resource exists.
     *            </p>
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier of the organization under which the user, group, or
     * resource exists.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The identifier of the organization under which the user,
     *            group, or resource exists.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMailboxPermissionsRequest withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * <p>
     * The identifier of the user, group, or resource for which to update
     * mailbox permissions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @return <p>
     *         The identifier of the user, group, or resource for which to
     *         update mailbox permissions.
     *         </p>
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * <p>
     * The identifier of the user, group, or resource for which to update
     * mailbox permissions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @param entityId <p>
     *            The identifier of the user, group, or resource for which to
     *            update mailbox permissions.
     *            </p>
     */
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The identifier of the user, group, or resource for which to update
     * mailbox permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @param entityId <p>
     *            The identifier of the user, group, or resource for which to
     *            update mailbox permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMailboxPermissionsRequest withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * <p>
     * The identifier of the user, group, or resource to which to grant the
     * permissions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @return <p>
     *         The identifier of the user, group, or resource to which to grant
     *         the permissions.
     *         </p>
     */
    public String getGranteeId() {
        return granteeId;
    }

    /**
     * <p>
     * The identifier of the user, group, or resource to which to grant the
     * permissions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @param granteeId <p>
     *            The identifier of the user, group, or resource to which to
     *            grant the permissions.
     *            </p>
     */
    public void setGranteeId(String granteeId) {
        this.granteeId = granteeId;
    }

    /**
     * <p>
     * The identifier of the user, group, or resource to which to grant the
     * permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @param granteeId <p>
     *            The identifier of the user, group, or resource to which to
     *            grant the permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMailboxPermissionsRequest withGranteeId(String granteeId) {
        this.granteeId = granteeId;
        return this;
    }

    /**
     * <p>
     * The permissions granted to the grantee. SEND_AS allows the grantee to
     * send email as the owner of the mailbox (the grantee is not mentioned on
     * these emails). SEND_ON_BEHALF allows the grantee to send email on behalf
     * of the owner of the mailbox (the grantee is not mentioned as the physical
     * sender of these emails). FULL_ACCESS allows the grantee full access to
     * the mailbox, irrespective of other folder-level permissions set on the
     * mailbox.
     * </p>
     *
     * @return <p>
     *         The permissions granted to the grantee. SEND_AS allows the
     *         grantee to send email as the owner of the mailbox (the grantee is
     *         not mentioned on these emails). SEND_ON_BEHALF allows the grantee
     *         to send email on behalf of the owner of the mailbox (the grantee
     *         is not mentioned as the physical sender of these emails).
     *         FULL_ACCESS allows the grantee full access to the mailbox,
     *         irrespective of other folder-level permissions set on the
     *         mailbox.
     *         </p>
     */
    public java.util.List<String> getPermissionValues() {
        return permissionValues;
    }

    /**
     * <p>
     * The permissions granted to the grantee. SEND_AS allows the grantee to
     * send email as the owner of the mailbox (the grantee is not mentioned on
     * these emails). SEND_ON_BEHALF allows the grantee to send email on behalf
     * of the owner of the mailbox (the grantee is not mentioned as the physical
     * sender of these emails). FULL_ACCESS allows the grantee full access to
     * the mailbox, irrespective of other folder-level permissions set on the
     * mailbox.
     * </p>
     *
     * @param permissionValues <p>
     *            The permissions granted to the grantee. SEND_AS allows the
     *            grantee to send email as the owner of the mailbox (the grantee
     *            is not mentioned on these emails). SEND_ON_BEHALF allows the
     *            grantee to send email on behalf of the owner of the mailbox
     *            (the grantee is not mentioned as the physical sender of these
     *            emails). FULL_ACCESS allows the grantee full access to the
     *            mailbox, irrespective of other folder-level permissions set on
     *            the mailbox.
     *            </p>
     */
    public void setPermissionValues(java.util.Collection<String> permissionValues) {
        if (permissionValues == null) {
            this.permissionValues = null;
            return;
        }

        this.permissionValues = new java.util.ArrayList<String>(permissionValues);
    }

    /**
     * <p>
     * The permissions granted to the grantee. SEND_AS allows the grantee to
     * send email as the owner of the mailbox (the grantee is not mentioned on
     * these emails). SEND_ON_BEHALF allows the grantee to send email on behalf
     * of the owner of the mailbox (the grantee is not mentioned as the physical
     * sender of these emails). FULL_ACCESS allows the grantee full access to
     * the mailbox, irrespective of other folder-level permissions set on the
     * mailbox.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissionValues <p>
     *            The permissions granted to the grantee. SEND_AS allows the
     *            grantee to send email as the owner of the mailbox (the grantee
     *            is not mentioned on these emails). SEND_ON_BEHALF allows the
     *            grantee to send email on behalf of the owner of the mailbox
     *            (the grantee is not mentioned as the physical sender of these
     *            emails). FULL_ACCESS allows the grantee full access to the
     *            mailbox, irrespective of other folder-level permissions set on
     *            the mailbox.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMailboxPermissionsRequest withPermissionValues(String... permissionValues) {
        if (getPermissionValues() == null) {
            this.permissionValues = new java.util.ArrayList<String>(permissionValues.length);
        }
        for (String value : permissionValues) {
            this.permissionValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The permissions granted to the grantee. SEND_AS allows the grantee to
     * send email as the owner of the mailbox (the grantee is not mentioned on
     * these emails). SEND_ON_BEHALF allows the grantee to send email on behalf
     * of the owner of the mailbox (the grantee is not mentioned as the physical
     * sender of these emails). FULL_ACCESS allows the grantee full access to
     * the mailbox, irrespective of other folder-level permissions set on the
     * mailbox.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissionValues <p>
     *            The permissions granted to the grantee. SEND_AS allows the
     *            grantee to send email as the owner of the mailbox (the grantee
     *            is not mentioned on these emails). SEND_ON_BEHALF allows the
     *            grantee to send email on behalf of the owner of the mailbox
     *            (the grantee is not mentioned as the physical sender of these
     *            emails). FULL_ACCESS allows the grantee full access to the
     *            mailbox, irrespective of other folder-level permissions set on
     *            the mailbox.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMailboxPermissionsRequest withPermissionValues(
            java.util.Collection<String> permissionValues) {
        setPermissionValues(permissionValues);
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
        if (getGranteeId() != null)
            sb.append("GranteeId: " + getGranteeId() + ",");
        if (getPermissionValues() != null)
            sb.append("PermissionValues: " + getPermissionValues());
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
        hashCode = prime * hashCode + ((getGranteeId() == null) ? 0 : getGranteeId().hashCode());
        hashCode = prime * hashCode
                + ((getPermissionValues() == null) ? 0 : getPermissionValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMailboxPermissionsRequest == false)
            return false;
        PutMailboxPermissionsRequest other = (PutMailboxPermissionsRequest) obj;

        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null
                && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getGranteeId() == null ^ this.getGranteeId() == null)
            return false;
        if (other.getGranteeId() != null
                && other.getGranteeId().equals(this.getGranteeId()) == false)
            return false;
        if (other.getPermissionValues() == null ^ this.getPermissionValues() == null)
            return false;
        if (other.getPermissionValues() != null
                && other.getPermissionValues().equals(this.getPermissionValues()) == false)
            return false;
        return true;
    }
}
