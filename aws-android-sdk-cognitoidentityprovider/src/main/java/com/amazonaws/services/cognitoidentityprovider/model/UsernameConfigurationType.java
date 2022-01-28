/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The username configuration type.
 * </p>
 */
public class UsernameConfigurationType implements Serializable {
    /**
     * <p>
     * Specifies whether username case sensitivity will be applied for all users
     * in the user pool through Amazon Cognito APIs.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>True</code> </b>: Enables case sensitivity for all username
     * input. When this option is set to <code>True</code>, users must sign in
     * using the exact capitalization of their given username, such as
     * “UserName”. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>False</code> </b>: Enables case insensitivity for all username
     * input. For example, when this option is set to <code>False</code>, users
     * can sign in using either "username" or "Username". This option also
     * enables both <code>preferred_username</code> and <code>email</code> alias
     * to be case insensitive, in addition to the <code>username</code>
     * attribute.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean caseSensitive;

    /**
     * <p>
     * Specifies whether username case sensitivity will be applied for all users
     * in the user pool through Amazon Cognito APIs.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>True</code> </b>: Enables case sensitivity for all username
     * input. When this option is set to <code>True</code>, users must sign in
     * using the exact capitalization of their given username, such as
     * “UserName”. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>False</code> </b>: Enables case insensitivity for all username
     * input. For example, when this option is set to <code>False</code>, users
     * can sign in using either "username" or "Username". This option also
     * enables both <code>preferred_username</code> and <code>email</code> alias
     * to be case insensitive, in addition to the <code>username</code>
     * attribute.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Specifies whether username case sensitivity will be applied for
     *         all users in the user pool through Amazon Cognito APIs.
     *         </p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>True</code> </b>: Enables case sensitivity for all
     *         username input. When this option is set to <code>True</code>,
     *         users must sign in using the exact capitalization of their given
     *         username, such as “UserName”. This is the default value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>False</code> </b>: Enables case insensitivity for all
     *         username input. For example, when this option is set to
     *         <code>False</code>, users can sign in using either "username" or
     *         "Username". This option also enables both
     *         <code>preferred_username</code> and <code>email</code> alias to
     *         be case insensitive, in addition to the <code>username</code>
     *         attribute.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean isCaseSensitive() {
        return caseSensitive;
    }

    /**
     * <p>
     * Specifies whether username case sensitivity will be applied for all users
     * in the user pool through Amazon Cognito APIs.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>True</code> </b>: Enables case sensitivity for all username
     * input. When this option is set to <code>True</code>, users must sign in
     * using the exact capitalization of their given username, such as
     * “UserName”. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>False</code> </b>: Enables case insensitivity for all username
     * input. For example, when this option is set to <code>False</code>, users
     * can sign in using either "username" or "Username". This option also
     * enables both <code>preferred_username</code> and <code>email</code> alias
     * to be case insensitive, in addition to the <code>username</code>
     * attribute.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Specifies whether username case sensitivity will be applied for
     *         all users in the user pool through Amazon Cognito APIs.
     *         </p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>True</code> </b>: Enables case sensitivity for all
     *         username input. When this option is set to <code>True</code>,
     *         users must sign in using the exact capitalization of their given
     *         username, such as “UserName”. This is the default value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>False</code> </b>: Enables case insensitivity for all
     *         username input. For example, when this option is set to
     *         <code>False</code>, users can sign in using either "username" or
     *         "Username". This option also enables both
     *         <code>preferred_username</code> and <code>email</code> alias to
     *         be case insensitive, in addition to the <code>username</code>
     *         attribute.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean getCaseSensitive() {
        return caseSensitive;
    }

    /**
     * <p>
     * Specifies whether username case sensitivity will be applied for all users
     * in the user pool through Amazon Cognito APIs.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>True</code> </b>: Enables case sensitivity for all username
     * input. When this option is set to <code>True</code>, users must sign in
     * using the exact capitalization of their given username, such as
     * “UserName”. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>False</code> </b>: Enables case insensitivity for all username
     * input. For example, when this option is set to <code>False</code>, users
     * can sign in using either "username" or "Username". This option also
     * enables both <code>preferred_username</code> and <code>email</code> alias
     * to be case insensitive, in addition to the <code>username</code>
     * attribute.
     * </p>
     * </li>
     * </ul>
     *
     * @param caseSensitive <p>
     *            Specifies whether username case sensitivity will be applied
     *            for all users in the user pool through Amazon Cognito APIs.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>True</code> </b>: Enables case sensitivity for all
     *            username input. When this option is set to <code>True</code>,
     *            users must sign in using the exact capitalization of their
     *            given username, such as “UserName”. This is the default value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>False</code> </b>: Enables case insensitivity for
     *            all username input. For example, when this option is set to
     *            <code>False</code>, users can sign in using either "username"
     *            or "Username". This option also enables both
     *            <code>preferred_username</code> and <code>email</code> alias
     *            to be case insensitive, in addition to the
     *            <code>username</code> attribute.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    /**
     * <p>
     * Specifies whether username case sensitivity will be applied for all users
     * in the user pool through Amazon Cognito APIs.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>True</code> </b>: Enables case sensitivity for all username
     * input. When this option is set to <code>True</code>, users must sign in
     * using the exact capitalization of their given username, such as
     * “UserName”. This is the default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>False</code> </b>: Enables case insensitivity for all username
     * input. For example, when this option is set to <code>False</code>, users
     * can sign in using either "username" or "Username". This option also
     * enables both <code>preferred_username</code> and <code>email</code> alias
     * to be case insensitive, in addition to the <code>username</code>
     * attribute.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param caseSensitive <p>
     *            Specifies whether username case sensitivity will be applied
     *            for all users in the user pool through Amazon Cognito APIs.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>True</code> </b>: Enables case sensitivity for all
     *            username input. When this option is set to <code>True</code>,
     *            users must sign in using the exact capitalization of their
     *            given username, such as “UserName”. This is the default value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>False</code> </b>: Enables case insensitivity for
     *            all username input. For example, when this option is set to
     *            <code>False</code>, users can sign in using either "username"
     *            or "Username". This option also enables both
     *            <code>preferred_username</code> and <code>email</code> alias
     *            to be case insensitive, in addition to the
     *            <code>username</code> attribute.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsernameConfigurationType withCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
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
        if (getCaseSensitive() != null)
            sb.append("CaseSensitive: " + getCaseSensitive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCaseSensitive() == null) ? 0 : getCaseSensitive().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsernameConfigurationType == false)
            return false;
        UsernameConfigurationType other = (UsernameConfigurationType) obj;

        if (other.getCaseSensitive() == null ^ this.getCaseSensitive() == null)
            return false;
        if (other.getCaseSensitive() != null
                && other.getCaseSensitive().equals(this.getCaseSensitive()) == false)
            return false;
        return true;
    }
}
