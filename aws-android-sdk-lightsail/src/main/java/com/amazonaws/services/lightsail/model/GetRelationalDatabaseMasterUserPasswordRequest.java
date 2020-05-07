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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the current, previous, or pending versions of the master user
 * password for a Lightsail database.
 * </p>
 * <p>
 * The <code>GetRelationalDatabaseMasterUserPassword</code> operation supports
 * tag-based access control via resource tags applied to the resource identified
 * by relationalDatabaseName.
 * </p>
 */
public class GetRelationalDatabaseMasterUserPasswordRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The name of your database for which to get the master user password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String relationalDatabaseName;

    /**
     * <p>
     * The password version to return.
     * </p>
     * <p>
     * Specifying <code>CURRENT</code> or <code>PREVIOUS</code> returns the
     * current or previous passwords respectively. Specifying
     * <code>PENDING</code> returns the newest version of the password that will
     * rotate to <code>CURRENT</code>. After the <code>PENDING</code> password
     * rotates to <code>CURRENT</code>, the <code>PENDING</code> password is no
     * longer available.
     * </p>
     * <p>
     * Default: <code>CURRENT</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CURRENT, PREVIOUS, PENDING
     */
    private String passwordVersion;

    /**
     * <p>
     * The name of your database for which to get the master user password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of your database for which to get the master user
     *         password.
     *         </p>
     */
    public String getRelationalDatabaseName() {
        return relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database for which to get the master user password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param relationalDatabaseName <p>
     *            The name of your database for which to get the master user
     *            password.
     *            </p>
     */
    public void setRelationalDatabaseName(String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
    }

    /**
     * <p>
     * The name of your database for which to get the master user password.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param relationalDatabaseName <p>
     *            The name of your database for which to get the master user
     *            password.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseMasterUserPasswordRequest withRelationalDatabaseName(
            String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
        return this;
    }

    /**
     * <p>
     * The password version to return.
     * </p>
     * <p>
     * Specifying <code>CURRENT</code> or <code>PREVIOUS</code> returns the
     * current or previous passwords respectively. Specifying
     * <code>PENDING</code> returns the newest version of the password that will
     * rotate to <code>CURRENT</code>. After the <code>PENDING</code> password
     * rotates to <code>CURRENT</code>, the <code>PENDING</code> password is no
     * longer available.
     * </p>
     * <p>
     * Default: <code>CURRENT</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CURRENT, PREVIOUS, PENDING
     *
     * @return <p>
     *         The password version to return.
     *         </p>
     *         <p>
     *         Specifying <code>CURRENT</code> or <code>PREVIOUS</code> returns
     *         the current or previous passwords respectively. Specifying
     *         <code>PENDING</code> returns the newest version of the password
     *         that will rotate to <code>CURRENT</code>. After the
     *         <code>PENDING</code> password rotates to <code>CURRENT</code>,
     *         the <code>PENDING</code> password is no longer available.
     *         </p>
     *         <p>
     *         Default: <code>CURRENT</code>
     *         </p>
     * @see RelationalDatabasePasswordVersion
     */
    public String getPasswordVersion() {
        return passwordVersion;
    }

    /**
     * <p>
     * The password version to return.
     * </p>
     * <p>
     * Specifying <code>CURRENT</code> or <code>PREVIOUS</code> returns the
     * current or previous passwords respectively. Specifying
     * <code>PENDING</code> returns the newest version of the password that will
     * rotate to <code>CURRENT</code>. After the <code>PENDING</code> password
     * rotates to <code>CURRENT</code>, the <code>PENDING</code> password is no
     * longer available.
     * </p>
     * <p>
     * Default: <code>CURRENT</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CURRENT, PREVIOUS, PENDING
     *
     * @param passwordVersion <p>
     *            The password version to return.
     *            </p>
     *            <p>
     *            Specifying <code>CURRENT</code> or <code>PREVIOUS</code>
     *            returns the current or previous passwords respectively.
     *            Specifying <code>PENDING</code> returns the newest version of
     *            the password that will rotate to <code>CURRENT</code>. After
     *            the <code>PENDING</code> password rotates to
     *            <code>CURRENT</code>, the <code>PENDING</code> password is no
     *            longer available.
     *            </p>
     *            <p>
     *            Default: <code>CURRENT</code>
     *            </p>
     * @see RelationalDatabasePasswordVersion
     */
    public void setPasswordVersion(String passwordVersion) {
        this.passwordVersion = passwordVersion;
    }

    /**
     * <p>
     * The password version to return.
     * </p>
     * <p>
     * Specifying <code>CURRENT</code> or <code>PREVIOUS</code> returns the
     * current or previous passwords respectively. Specifying
     * <code>PENDING</code> returns the newest version of the password that will
     * rotate to <code>CURRENT</code>. After the <code>PENDING</code> password
     * rotates to <code>CURRENT</code>, the <code>PENDING</code> password is no
     * longer available.
     * </p>
     * <p>
     * Default: <code>CURRENT</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CURRENT, PREVIOUS, PENDING
     *
     * @param passwordVersion <p>
     *            The password version to return.
     *            </p>
     *            <p>
     *            Specifying <code>CURRENT</code> or <code>PREVIOUS</code>
     *            returns the current or previous passwords respectively.
     *            Specifying <code>PENDING</code> returns the newest version of
     *            the password that will rotate to <code>CURRENT</code>. After
     *            the <code>PENDING</code> password rotates to
     *            <code>CURRENT</code>, the <code>PENDING</code> password is no
     *            longer available.
     *            </p>
     *            <p>
     *            Default: <code>CURRENT</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelationalDatabasePasswordVersion
     */
    public GetRelationalDatabaseMasterUserPasswordRequest withPasswordVersion(String passwordVersion) {
        this.passwordVersion = passwordVersion;
        return this;
    }

    /**
     * <p>
     * The password version to return.
     * </p>
     * <p>
     * Specifying <code>CURRENT</code> or <code>PREVIOUS</code> returns the
     * current or previous passwords respectively. Specifying
     * <code>PENDING</code> returns the newest version of the password that will
     * rotate to <code>CURRENT</code>. After the <code>PENDING</code> password
     * rotates to <code>CURRENT</code>, the <code>PENDING</code> password is no
     * longer available.
     * </p>
     * <p>
     * Default: <code>CURRENT</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CURRENT, PREVIOUS, PENDING
     *
     * @param passwordVersion <p>
     *            The password version to return.
     *            </p>
     *            <p>
     *            Specifying <code>CURRENT</code> or <code>PREVIOUS</code>
     *            returns the current or previous passwords respectively.
     *            Specifying <code>PENDING</code> returns the newest version of
     *            the password that will rotate to <code>CURRENT</code>. After
     *            the <code>PENDING</code> password rotates to
     *            <code>CURRENT</code>, the <code>PENDING</code> password is no
     *            longer available.
     *            </p>
     *            <p>
     *            Default: <code>CURRENT</code>
     *            </p>
     * @see RelationalDatabasePasswordVersion
     */
    public void setPasswordVersion(RelationalDatabasePasswordVersion passwordVersion) {
        this.passwordVersion = passwordVersion.toString();
    }

    /**
     * <p>
     * The password version to return.
     * </p>
     * <p>
     * Specifying <code>CURRENT</code> or <code>PREVIOUS</code> returns the
     * current or previous passwords respectively. Specifying
     * <code>PENDING</code> returns the newest version of the password that will
     * rotate to <code>CURRENT</code>. After the <code>PENDING</code> password
     * rotates to <code>CURRENT</code>, the <code>PENDING</code> password is no
     * longer available.
     * </p>
     * <p>
     * Default: <code>CURRENT</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CURRENT, PREVIOUS, PENDING
     *
     * @param passwordVersion <p>
     *            The password version to return.
     *            </p>
     *            <p>
     *            Specifying <code>CURRENT</code> or <code>PREVIOUS</code>
     *            returns the current or previous passwords respectively.
     *            Specifying <code>PENDING</code> returns the newest version of
     *            the password that will rotate to <code>CURRENT</code>. After
     *            the <code>PENDING</code> password rotates to
     *            <code>CURRENT</code>, the <code>PENDING</code> password is no
     *            longer available.
     *            </p>
     *            <p>
     *            Default: <code>CURRENT</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelationalDatabasePasswordVersion
     */
    public GetRelationalDatabaseMasterUserPasswordRequest withPasswordVersion(
            RelationalDatabasePasswordVersion passwordVersion) {
        this.passwordVersion = passwordVersion.toString();
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
        if (getRelationalDatabaseName() != null)
            sb.append("relationalDatabaseName: " + getRelationalDatabaseName() + ",");
        if (getPasswordVersion() != null)
            sb.append("passwordVersion: " + getPasswordVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRelationalDatabaseName() == null) ? 0 : getRelationalDatabaseName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPasswordVersion() == null) ? 0 : getPasswordVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseMasterUserPasswordRequest == false)
            return false;
        GetRelationalDatabaseMasterUserPasswordRequest other = (GetRelationalDatabaseMasterUserPasswordRequest) obj;

        if (other.getRelationalDatabaseName() == null ^ this.getRelationalDatabaseName() == null)
            return false;
        if (other.getRelationalDatabaseName() != null
                && other.getRelationalDatabaseName().equals(this.getRelationalDatabaseName()) == false)
            return false;
        if (other.getPasswordVersion() == null ^ this.getPasswordVersion() == null)
            return false;
        if (other.getPasswordVersion() != null
                && other.getPasswordVersion().equals(this.getPasswordVersion()) == false)
            return false;
        return true;
    }
}
