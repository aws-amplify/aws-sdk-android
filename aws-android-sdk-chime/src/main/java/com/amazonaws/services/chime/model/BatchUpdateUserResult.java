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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

public class BatchUpdateUserResult implements Serializable {
    /**
     * <p>
     * If the <a>BatchUpdateUser</a> action fails for one or more of the user
     * IDs in the request, a list of the user IDs is returned, along with error
     * codes and error messages.
     * </p>
     */
    private java.util.List<UserError> userErrors;

    /**
     * <p>
     * If the <a>BatchUpdateUser</a> action fails for one or more of the user
     * IDs in the request, a list of the user IDs is returned, along with error
     * codes and error messages.
     * </p>
     *
     * @return <p>
     *         If the <a>BatchUpdateUser</a> action fails for one or more of the
     *         user IDs in the request, a list of the user IDs is returned,
     *         along with error codes and error messages.
     *         </p>
     */
    public java.util.List<UserError> getUserErrors() {
        return userErrors;
    }

    /**
     * <p>
     * If the <a>BatchUpdateUser</a> action fails for one or more of the user
     * IDs in the request, a list of the user IDs is returned, along with error
     * codes and error messages.
     * </p>
     *
     * @param userErrors <p>
     *            If the <a>BatchUpdateUser</a> action fails for one or more of
     *            the user IDs in the request, a list of the user IDs is
     *            returned, along with error codes and error messages.
     *            </p>
     */
    public void setUserErrors(java.util.Collection<UserError> userErrors) {
        if (userErrors == null) {
            this.userErrors = null;
            return;
        }

        this.userErrors = new java.util.ArrayList<UserError>(userErrors);
    }

    /**
     * <p>
     * If the <a>BatchUpdateUser</a> action fails for one or more of the user
     * IDs in the request, a list of the user IDs is returned, along with error
     * codes and error messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userErrors <p>
     *            If the <a>BatchUpdateUser</a> action fails for one or more of
     *            the user IDs in the request, a list of the user IDs is
     *            returned, along with error codes and error messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateUserResult withUserErrors(UserError... userErrors) {
        if (getUserErrors() == null) {
            this.userErrors = new java.util.ArrayList<UserError>(userErrors.length);
        }
        for (UserError value : userErrors) {
            this.userErrors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If the <a>BatchUpdateUser</a> action fails for one or more of the user
     * IDs in the request, a list of the user IDs is returned, along with error
     * codes and error messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userErrors <p>
     *            If the <a>BatchUpdateUser</a> action fails for one or more of
     *            the user IDs in the request, a list of the user IDs is
     *            returned, along with error codes and error messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateUserResult withUserErrors(java.util.Collection<UserError> userErrors) {
        setUserErrors(userErrors);
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
        if (getUserErrors() != null)
            sb.append("UserErrors: " + getUserErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserErrors() == null) ? 0 : getUserErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateUserResult == false)
            return false;
        BatchUpdateUserResult other = (BatchUpdateUserResult) obj;

        if (other.getUserErrors() == null ^ this.getUserErrors() == null)
            return false;
        if (other.getUserErrors() != null
                && other.getUserErrors().equals(this.getUserErrors()) == false)
            return false;
        return true;
    }
}
