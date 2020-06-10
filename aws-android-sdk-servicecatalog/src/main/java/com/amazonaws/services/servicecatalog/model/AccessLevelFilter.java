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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * The access level to use to filter results.
 * </p>
 */
public class AccessLevelFilter implements Serializable {
    /**
     * <p>
     * The access level.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Account</code> - Filter results based on the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Role</code> - Filter results based on the federated role of the
     * specified user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>User</code> - Filter results based on the specified user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Account, Role, User
     */
    private String key;

    /**
     * <p>
     * The user to which the access level applies. The only supported value is
     * <code>Self</code>.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The access level.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Account</code> - Filter results based on the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Role</code> - Filter results based on the federated role of the
     * specified user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>User</code> - Filter results based on the specified user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Account, Role, User
     *
     * @return <p>
     *         The access level.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Account</code> - Filter results based on the account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Role</code> - Filter results based on the federated role of
     *         the specified user.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>User</code> - Filter results based on the specified user.
     *         </p>
     *         </li>
     *         </ul>
     * @see AccessLevelFilterKey
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The access level.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Account</code> - Filter results based on the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Role</code> - Filter results based on the federated role of the
     * specified user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>User</code> - Filter results based on the specified user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Account, Role, User
     *
     * @param key <p>
     *            The access level.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Account</code> - Filter results based on the account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Role</code> - Filter results based on the federated role
     *            of the specified user.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>User</code> - Filter results based on the specified
     *            user.
     *            </p>
     *            </li>
     *            </ul>
     * @see AccessLevelFilterKey
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The access level.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Account</code> - Filter results based on the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Role</code> - Filter results based on the federated role of the
     * specified user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>User</code> - Filter results based on the specified user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Account, Role, User
     *
     * @param key <p>
     *            The access level.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Account</code> - Filter results based on the account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Role</code> - Filter results based on the federated role
     *            of the specified user.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>User</code> - Filter results based on the specified
     *            user.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccessLevelFilterKey
     */
    public AccessLevelFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The access level.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Account</code> - Filter results based on the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Role</code> - Filter results based on the federated role of the
     * specified user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>User</code> - Filter results based on the specified user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Account, Role, User
     *
     * @param key <p>
     *            The access level.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Account</code> - Filter results based on the account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Role</code> - Filter results based on the federated role
     *            of the specified user.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>User</code> - Filter results based on the specified
     *            user.
     *            </p>
     *            </li>
     *            </ul>
     * @see AccessLevelFilterKey
     */
    public void setKey(AccessLevelFilterKey key) {
        this.key = key.toString();
    }

    /**
     * <p>
     * The access level.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Account</code> - Filter results based on the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Role</code> - Filter results based on the federated role of the
     * specified user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>User</code> - Filter results based on the specified user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Account, Role, User
     *
     * @param key <p>
     *            The access level.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Account</code> - Filter results based on the account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Role</code> - Filter results based on the federated role
     *            of the specified user.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>User</code> - Filter results based on the specified
     *            user.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccessLevelFilterKey
     */
    public AccessLevelFilter withKey(AccessLevelFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * The user to which the access level applies. The only supported value is
     * <code>Self</code>.
     * </p>
     *
     * @return <p>
     *         The user to which the access level applies. The only supported
     *         value is <code>Self</code>.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The user to which the access level applies. The only supported value is
     * <code>Self</code>.
     * </p>
     *
     * @param value <p>
     *            The user to which the access level applies. The only supported
     *            value is <code>Self</code>.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The user to which the access level applies. The only supported value is
     * <code>Self</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The user to which the access level applies. The only supported
     *            value is <code>Self</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessLevelFilter withValue(String value) {
        this.value = value;
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessLevelFilter == false)
            return false;
        AccessLevelFilter other = (AccessLevelFilter) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
