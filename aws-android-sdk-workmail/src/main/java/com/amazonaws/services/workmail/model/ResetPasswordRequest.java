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
 * Allows the administrator to reset the password for a user.
 * </p>
 */
public class ResetPasswordRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the organization that contains the user for which the
     * password is reset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     */
    private String organizationId;

    /**
     * <p>
     * The identifier of the user for whom the password is reset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     */
    private String userId;

    /**
     * <p>
     * The new password for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String password;

    /**
     * <p>
     * The identifier of the organization that contains the user for which the
     * password is reset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @return <p>
     *         The identifier of the organization that contains the user for
     *         which the password is reset.
     *         </p>
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * <p>
     * The identifier of the organization that contains the user for which the
     * password is reset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The identifier of the organization that contains the user for
     *            which the password is reset.
     *            </p>
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier of the organization that contains the user for which the
     * password is reset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The identifier of the organization that contains the user for
     *            which the password is reset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetPasswordRequest withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * <p>
     * The identifier of the user for whom the password is reset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @return <p>
     *         The identifier of the user for whom the password is reset.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The identifier of the user for whom the password is reset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @param userId <p>
     *            The identifier of the user for whom the password is reset.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier of the user for whom the password is reset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 256<br/>
     *
     * @param userId <p>
     *            The identifier of the user for whom the password is reset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetPasswordRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * The new password for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The new password for the user.
     *         </p>
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>
     * The new password for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param password <p>
     *            The new password for the user.
     *            </p>
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The new password for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param password <p>
     *            The new password for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetPasswordRequest withPassword(String password) {
        this.password = password;
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
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetPasswordRequest == false)
            return false;
        ResetPasswordRequest other = (ResetPasswordRequest) obj;

        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null
                && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        return true;
    }
}
