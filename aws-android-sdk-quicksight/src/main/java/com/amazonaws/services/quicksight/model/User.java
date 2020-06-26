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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * A registered user of Amazon QuickSight. Currently, an Amazon QuickSight
 * subscription can't contain more than 20 million users.
 * </p>
 */
public class User implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the user.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The user's user name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String userName;

    /**
     * <p>
     * The user's email address.
     * </p>
     */
    private String email;

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the
     * following:.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets,
     * analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon
     * QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR,
     * RESTRICTED_READER
     */
    private String role;

    /**
     * <p>
     * The type of identity authentication used by the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM, QUICKSIGHT
     */
    private String identityType;

    /**
     * <p>
     * The active status of user. When you create an Amazon QuickSight user
     * that’s not an IAM user or an Active Directory user, that user is inactive
     * until they sign in and provide a password.
     * </p>
     */
    private Boolean active;

    /**
     * <p>
     * The principal ID of the user.
     * </p>
     */
    private String principalId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the user.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the user.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the user.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) for the user.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The user's user name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The user's user name.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The user's user name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param userName <p>
     *            The user's user name.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The user's user name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param userName <p>
     *            The user's user name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The user's email address.
     * </p>
     *
     * @return <p>
     *         The user's email address.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The user's email address.
     * </p>
     *
     * @param email <p>
     *            The user's email address.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The user's email address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param email <p>
     *            The user's email address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the
     * following:.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets,
     * analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon
     * QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR,
     * RESTRICTED_READER
     *
     * @return <p>
     *         The Amazon QuickSight role for the user. The user role can be one
     *         of the following:.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>READER</code>: A user who has read-only access to
     *         dashboards.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AUTHOR</code>: A user who can create data sources,
     *         datasets, analyses, and dashboards.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ADMIN</code>: A user who is an author, who can also manage
     *         Amazon QuickSight settings.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESTRICTED_READER</code>: This role isn't currently
     *         available for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESTRICTED_AUTHOR</code>: This role isn't currently
     *         available for use.
     *         </p>
     *         </li>
     *         </ul>
     * @see UserRole
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the
     * following:.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets,
     * analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon
     * QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR,
     * RESTRICTED_READER
     *
     * @param role <p>
     *            The Amazon QuickSight role for the user. The user role can be
     *            one of the following:.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>READER</code>: A user who has read-only access to
     *            dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AUTHOR</code>: A user who can create data sources,
     *            datasets, analyses, and dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ADMIN</code>: A user who is an author, who can also
     *            manage Amazon QuickSight settings.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESTRICTED_READER</code>: This role isn't currently
     *            available for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESTRICTED_AUTHOR</code>: This role isn't currently
     *            available for use.
     *            </p>
     *            </li>
     *            </ul>
     * @see UserRole
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the
     * following:.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets,
     * analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon
     * QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR,
     * RESTRICTED_READER
     *
     * @param role <p>
     *            The Amazon QuickSight role for the user. The user role can be
     *            one of the following:.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>READER</code>: A user who has read-only access to
     *            dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AUTHOR</code>: A user who can create data sources,
     *            datasets, analyses, and dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ADMIN</code>: A user who is an author, who can also
     *            manage Amazon QuickSight settings.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESTRICTED_READER</code>: This role isn't currently
     *            available for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESTRICTED_AUTHOR</code>: This role isn't currently
     *            available for use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserRole
     */
    public User withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the
     * following:.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets,
     * analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon
     * QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR,
     * RESTRICTED_READER
     *
     * @param role <p>
     *            The Amazon QuickSight role for the user. The user role can be
     *            one of the following:.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>READER</code>: A user who has read-only access to
     *            dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AUTHOR</code>: A user who can create data sources,
     *            datasets, analyses, and dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ADMIN</code>: A user who is an author, who can also
     *            manage Amazon QuickSight settings.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESTRICTED_READER</code>: This role isn't currently
     *            available for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESTRICTED_AUTHOR</code>: This role isn't currently
     *            available for use.
     *            </p>
     *            </li>
     *            </ul>
     * @see UserRole
     */
    public void setRole(UserRole role) {
        this.role = role.toString();
    }

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the
     * following:.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets,
     * analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon
     * QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR,
     * RESTRICTED_READER
     *
     * @param role <p>
     *            The Amazon QuickSight role for the user. The user role can be
     *            one of the following:.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>READER</code>: A user who has read-only access to
     *            dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AUTHOR</code>: A user who can create data sources,
     *            datasets, analyses, and dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ADMIN</code>: A user who is an author, who can also
     *            manage Amazon QuickSight settings.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESTRICTED_READER</code>: This role isn't currently
     *            available for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESTRICTED_AUTHOR</code>: This role isn't currently
     *            available for use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserRole
     */
    public User withRole(UserRole role) {
        this.role = role.toString();
        return this;
    }

    /**
     * <p>
     * The type of identity authentication used by the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM, QUICKSIGHT
     *
     * @return <p>
     *         The type of identity authentication used by the user.
     *         </p>
     * @see IdentityType
     */
    public String getIdentityType() {
        return identityType;
    }

    /**
     * <p>
     * The type of identity authentication used by the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM, QUICKSIGHT
     *
     * @param identityType <p>
     *            The type of identity authentication used by the user.
     *            </p>
     * @see IdentityType
     */
    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * <p>
     * The type of identity authentication used by the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM, QUICKSIGHT
     *
     * @param identityType <p>
     *            The type of identity authentication used by the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IdentityType
     */
    public User withIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }

    /**
     * <p>
     * The type of identity authentication used by the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM, QUICKSIGHT
     *
     * @param identityType <p>
     *            The type of identity authentication used by the user.
     *            </p>
     * @see IdentityType
     */
    public void setIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
    }

    /**
     * <p>
     * The type of identity authentication used by the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM, QUICKSIGHT
     *
     * @param identityType <p>
     *            The type of identity authentication used by the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IdentityType
     */
    public User withIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
        return this;
    }

    /**
     * <p>
     * The active status of user. When you create an Amazon QuickSight user
     * that’s not an IAM user or an Active Directory user, that user is inactive
     * until they sign in and provide a password.
     * </p>
     *
     * @return <p>
     *         The active status of user. When you create an Amazon QuickSight
     *         user that’s not an IAM user or an Active Directory user, that
     *         user is inactive until they sign in and provide a password.
     *         </p>
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * <p>
     * The active status of user. When you create an Amazon QuickSight user
     * that’s not an IAM user or an Active Directory user, that user is inactive
     * until they sign in and provide a password.
     * </p>
     *
     * @return <p>
     *         The active status of user. When you create an Amazon QuickSight
     *         user that’s not an IAM user or an Active Directory user, that
     *         user is inactive until they sign in and provide a password.
     *         </p>
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * <p>
     * The active status of user. When you create an Amazon QuickSight user
     * that’s not an IAM user or an Active Directory user, that user is inactive
     * until they sign in and provide a password.
     * </p>
     *
     * @param active <p>
     *            The active status of user. When you create an Amazon
     *            QuickSight user that’s not an IAM user or an Active Directory
     *            user, that user is inactive until they sign in and provide a
     *            password.
     *            </p>
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * The active status of user. When you create an Amazon QuickSight user
     * that’s not an IAM user or an Active Directory user, that user is inactive
     * until they sign in and provide a password.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param active <p>
     *            The active status of user. When you create an Amazon
     *            QuickSight user that’s not an IAM user or an Active Directory
     *            user, that user is inactive until they sign in and provide a
     *            password.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * <p>
     * The principal ID of the user.
     * </p>
     *
     * @return <p>
     *         The principal ID of the user.
     *         </p>
     */
    public String getPrincipalId() {
        return principalId;
    }

    /**
     * <p>
     * The principal ID of the user.
     * </p>
     *
     * @param principalId <p>
     *            The principal ID of the user.
     *            </p>
     */
    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The principal ID of the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principalId <p>
     *            The principal ID of the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withPrincipalId(String principalId) {
        this.principalId = principalId;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getEmail() != null)
            sb.append("Email: " + getEmail() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole() + ",");
        if (getIdentityType() != null)
            sb.append("IdentityType: " + getIdentityType() + ",");
        if (getActive() != null)
            sb.append("Active: " + getActive() + ",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: " + getPrincipalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode
                + ((getIdentityType() == null) ? 0 : getIdentityType().hashCode());
        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        hashCode = prime * hashCode
                + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof User == false)
            return false;
        User other = (User) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getIdentityType() == null ^ this.getIdentityType() == null)
            return false;
        if (other.getIdentityType() != null
                && other.getIdentityType().equals(this.getIdentityType()) == false)
            return false;
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null
                && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        return true;
    }
}
