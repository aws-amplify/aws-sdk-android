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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes an organizational unit (OU) from a root or another OU. You must first
 * remove all accounts and child OUs from the OU that you want to delete.
 * </p>
 * <p>
 * This operation can be called only from the organization's master account.
 * </p>
 */
public class DeleteOrganizationalUnitRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the organizational unit that you want to
     * delete. You can get the ID from the
     * <a>ListOrganizationalUnitsForParent</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * organizational unit ID string requires "ou-" followed by from 4 to 32
     * lowercase letters or digits (the ID of the root that contains the OU).
     * This string is followed by a second "-" dash and from 8 to 32 additional
     * lowercase letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 68<br/>
     * <b>Pattern: </b>^ou-[0-9a-z]{4,32}-[a-z0-9]{8,32}$<br/>
     */
    private String organizationalUnitId;

    /**
     * <p>
     * The unique identifier (ID) of the organizational unit that you want to
     * delete. You can get the ID from the
     * <a>ListOrganizationalUnitsForParent</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * organizational unit ID string requires "ou-" followed by from 4 to 32
     * lowercase letters or digits (the ID of the root that contains the OU).
     * This string is followed by a second "-" dash and from 8 to 32 additional
     * lowercase letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 68<br/>
     * <b>Pattern: </b>^ou-[0-9a-z]{4,32}-[a-z0-9]{8,32}$<br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the organizational unit that you
     *         want to delete. You can get the ID from the
     *         <a>ListOrganizationalUnitsForParent</a> operation.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for an organizational unit ID string requires "ou-" followed by
     *         from 4 to 32 lowercase letters or digits (the ID of the root that
     *         contains the OU). This string is followed by a second "-" dash
     *         and from 8 to 32 additional lowercase letters or digits.
     *         </p>
     */
    public String getOrganizationalUnitId() {
        return organizationalUnitId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the organizational unit that you want to
     * delete. You can get the ID from the
     * <a>ListOrganizationalUnitsForParent</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * organizational unit ID string requires "ou-" followed by from 4 to 32
     * lowercase letters or digits (the ID of the root that contains the OU).
     * This string is followed by a second "-" dash and from 8 to 32 additional
     * lowercase letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 68<br/>
     * <b>Pattern: </b>^ou-[0-9a-z]{4,32}-[a-z0-9]{8,32}$<br/>
     *
     * @param organizationalUnitId <p>
     *            The unique identifier (ID) of the organizational unit that you
     *            want to delete. You can get the ID from the
     *            <a>ListOrganizationalUnitsForParent</a> operation.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for an organizational unit ID string requires
     *            "ou-" followed by from 4 to 32 lowercase letters or digits
     *            (the ID of the root that contains the OU). This string is
     *            followed by a second "-" dash and from 8 to 32 additional
     *            lowercase letters or digits.
     *            </p>
     */
    public void setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the organizational unit that you want to
     * delete. You can get the ID from the
     * <a>ListOrganizationalUnitsForParent</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * organizational unit ID string requires "ou-" followed by from 4 to 32
     * lowercase letters or digits (the ID of the root that contains the OU).
     * This string is followed by a second "-" dash and from 8 to 32 additional
     * lowercase letters or digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 68<br/>
     * <b>Pattern: </b>^ou-[0-9a-z]{4,32}-[a-z0-9]{8,32}$<br/>
     *
     * @param organizationalUnitId <p>
     *            The unique identifier (ID) of the organizational unit that you
     *            want to delete. You can get the ID from the
     *            <a>ListOrganizationalUnitsForParent</a> operation.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for an organizational unit ID string requires
     *            "ou-" followed by from 4 to 32 lowercase letters or digits
     *            (the ID of the root that contains the OU). This string is
     *            followed by a second "-" dash and from 8 to 32 additional
     *            lowercase letters or digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteOrganizationalUnitRequest withOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
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
        if (getOrganizationalUnitId() != null)
            sb.append("OrganizationalUnitId: " + getOrganizationalUnitId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOrganizationalUnitId() == null) ? 0 : getOrganizationalUnitId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteOrganizationalUnitRequest == false)
            return false;
        DeleteOrganizationalUnitRequest other = (DeleteOrganizationalUnitRequest) obj;

        if (other.getOrganizationalUnitId() == null ^ this.getOrganizationalUnitId() == null)
            return false;
        if (other.getOrganizationalUnitId() != null
                && other.getOrganizationalUnitId().equals(this.getOrganizationalUnitId()) == false)
            return false;
        return true;
    }
}
