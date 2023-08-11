/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The response from the request to list users.
 * </p>
 */
public class ListUsersResult implements Serializable {
    /**
     * <p>
     * A list of the user pool users, and their attributes, that match your
     * query.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito creates a profile in your user pool for each native user
     * in your user pool, and each unique user ID from your third-party identity
     * providers (IdPs). When you link users with the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminLinkProviderForUser.html"
     * >AdminLinkProviderForUser</a> API operation, the output of
     * <code>ListUsers</code> displays both the IdP user and the native user
     * that you linked. You can identify IdP users in the <code>Users</code>
     * object of this API response by the IdP prefix that Amazon Cognito appends
     * to <code>Username</code>.
     * </p>
     * </note>
     */
    private java.util.List<UserType> users;

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String paginationToken;

    /**
     * <p>
     * A list of the user pool users, and their attributes, that match your
     * query.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito creates a profile in your user pool for each native user
     * in your user pool, and each unique user ID from your third-party identity
     * providers (IdPs). When you link users with the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminLinkProviderForUser.html"
     * >AdminLinkProviderForUser</a> API operation, the output of
     * <code>ListUsers</code> displays both the IdP user and the native user
     * that you linked. You can identify IdP users in the <code>Users</code>
     * object of this API response by the IdP prefix that Amazon Cognito appends
     * to <code>Username</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         A list of the user pool users, and their attributes, that match
     *         your query.
     *         </p>
     *         <note>
     *         <p>
     *         Amazon Cognito creates a profile in your user pool for each
     *         native user in your user pool, and each unique user ID from your
     *         third-party identity providers (IdPs). When you link users with
     *         the <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminLinkProviderForUser.html"
     *         >AdminLinkProviderForUser</a> API operation, the output of
     *         <code>ListUsers</code> displays both the IdP user and the native
     *         user that you linked. You can identify IdP users in the
     *         <code>Users</code> object of this API response by the IdP prefix
     *         that Amazon Cognito appends to <code>Username</code>.
     *         </p>
     *         </note>
     */
    public java.util.List<UserType> getUsers() {
        return users;
    }

    /**
     * <p>
     * A list of the user pool users, and their attributes, that match your
     * query.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito creates a profile in your user pool for each native user
     * in your user pool, and each unique user ID from your third-party identity
     * providers (IdPs). When you link users with the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminLinkProviderForUser.html"
     * >AdminLinkProviderForUser</a> API operation, the output of
     * <code>ListUsers</code> displays both the IdP user and the native user
     * that you linked. You can identify IdP users in the <code>Users</code>
     * object of this API response by the IdP prefix that Amazon Cognito appends
     * to <code>Username</code>.
     * </p>
     * </note>
     *
     * @param users <p>
     *            A list of the user pool users, and their attributes, that
     *            match your query.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon Cognito creates a profile in your user pool for each
     *            native user in your user pool, and each unique user ID from
     *            your third-party identity providers (IdPs). When you link
     *            users with the <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminLinkProviderForUser.html"
     *            >AdminLinkProviderForUser</a> API operation, the output of
     *            <code>ListUsers</code> displays both the IdP user and the
     *            native user that you linked. You can identify IdP users in the
     *            <code>Users</code> object of this API response by the IdP
     *            prefix that Amazon Cognito appends to <code>Username</code>.
     *            </p>
     *            </note>
     */
    public void setUsers(java.util.Collection<UserType> users) {
        if (users == null) {
            this.users = null;
            return;
        }

        this.users = new java.util.ArrayList<UserType>(users);
    }

    /**
     * <p>
     * A list of the user pool users, and their attributes, that match your
     * query.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito creates a profile in your user pool for each native user
     * in your user pool, and each unique user ID from your third-party identity
     * providers (IdPs). When you link users with the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminLinkProviderForUser.html"
     * >AdminLinkProviderForUser</a> API operation, the output of
     * <code>ListUsers</code> displays both the IdP user and the native user
     * that you linked. You can identify IdP users in the <code>Users</code>
     * object of this API response by the IdP prefix that Amazon Cognito appends
     * to <code>Username</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param users <p>
     *            A list of the user pool users, and their attributes, that
     *            match your query.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon Cognito creates a profile in your user pool for each
     *            native user in your user pool, and each unique user ID from
     *            your third-party identity providers (IdPs). When you link
     *            users with the <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminLinkProviderForUser.html"
     *            >AdminLinkProviderForUser</a> API operation, the output of
     *            <code>ListUsers</code> displays both the IdP user and the
     *            native user that you linked. You can identify IdP users in the
     *            <code>Users</code> object of this API response by the IdP
     *            prefix that Amazon Cognito appends to <code>Username</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersResult withUsers(UserType... users) {
        if (getUsers() == null) {
            this.users = new java.util.ArrayList<UserType>(users.length);
        }
        for (UserType value : users) {
            this.users.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the user pool users, and their attributes, that match your
     * query.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito creates a profile in your user pool for each native user
     * in your user pool, and each unique user ID from your third-party identity
     * providers (IdPs). When you link users with the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminLinkProviderForUser.html"
     * >AdminLinkProviderForUser</a> API operation, the output of
     * <code>ListUsers</code> displays both the IdP user and the native user
     * that you linked. You can identify IdP users in the <code>Users</code>
     * object of this API response by the IdP prefix that Amazon Cognito appends
     * to <code>Username</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param users <p>
     *            A list of the user pool users, and their attributes, that
     *            match your query.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon Cognito creates a profile in your user pool for each
     *            native user in your user pool, and each unique user ID from
     *            your third-party identity providers (IdPs). When you link
     *            users with the <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminLinkProviderForUser.html"
     *            >AdminLinkProviderForUser</a> API operation, the output of
     *            <code>ListUsers</code> displays both the IdP user and the
     *            native user that you linked. You can identify IdP users in the
     *            <code>Users</code> object of this API response by the IdP
     *            prefix that Amazon Cognito appends to <code>Username</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersResult withUsers(java.util.Collection<UserType> users) {
        setUsers(users);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return <p>
     *         An identifier that was returned from the previous call to this
     *         operation, which can be used to return the next set of items in
     *         the list.
     *         </p>
     */
    public String getPaginationToken() {
        return paginationToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param paginationToken <p>
     *            An identifier that was returned from the previous call to this
     *            operation, which can be used to return the next set of items
     *            in the list.
     *            </p>
     */
    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param paginationToken <p>
     *            An identifier that was returned from the previous call to this
     *            operation, which can be used to return the next set of items
     *            in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersResult withPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
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
        if (getUsers() != null)
            sb.append("Users: " + getUsers() + ",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: " + getPaginationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsers() == null) ? 0 : getUsers().hashCode());
        hashCode = prime * hashCode
                + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUsersResult == false)
            return false;
        ListUsersResult other = (ListUsersResult) obj;

        if (other.getUsers() == null ^ this.getUsers() == null)
            return false;
        if (other.getUsers() != null && other.getUsers().equals(this.getUsers()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null
                && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        return true;
    }
}
