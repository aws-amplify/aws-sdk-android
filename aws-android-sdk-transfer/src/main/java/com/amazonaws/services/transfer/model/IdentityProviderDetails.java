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

package com.amazonaws.services.transfer.model;

import java.io.Serializable;

/**
 * <p>
 * Returns information related to the type of user authentication that is in use
 * for a file transfer protocol-enabled server's users. A server can have only
 * one method of authentication.
 * </p>
 */
public class IdentityProviderDetails implements Serializable {
    /**
     * <p>
     * Provides the location of the service endpoint used to authenticate users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String url;

    /**
     * <p>
     * Provides the type of <code>InvocationRole</code> used to authenticate the
     * user account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     */
    private String invocationRole;

    /**
     * <p>
     * Provides the location of the service endpoint used to authenticate users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         Provides the location of the service endpoint used to
     *         authenticate users.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * Provides the location of the service endpoint used to authenticate users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param url <p>
     *            Provides the location of the service endpoint used to
     *            authenticate users.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * Provides the location of the service endpoint used to authenticate users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param url <p>
     *            Provides the location of the service endpoint used to
     *            authenticate users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IdentityProviderDetails withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * <p>
     * Provides the type of <code>InvocationRole</code> used to authenticate the
     * user account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     *
     * @return <p>
     *         Provides the type of <code>InvocationRole</code> used to
     *         authenticate the user account.
     *         </p>
     */
    public String getInvocationRole() {
        return invocationRole;
    }

    /**
     * <p>
     * Provides the type of <code>InvocationRole</code> used to authenticate the
     * user account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     *
     * @param invocationRole <p>
     *            Provides the type of <code>InvocationRole</code> used to
     *            authenticate the user account.
     *            </p>
     */
    public void setInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
    }

    /**
     * <p>
     * Provides the type of <code>InvocationRole</code> used to authenticate the
     * user account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     *
     * @param invocationRole <p>
     *            Provides the type of <code>InvocationRole</code> used to
     *            authenticate the user account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IdentityProviderDetails withInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
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
        if (getUrl() != null)
            sb.append("Url: " + getUrl() + ",");
        if (getInvocationRole() != null)
            sb.append("InvocationRole: " + getInvocationRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode
                + ((getInvocationRole() == null) ? 0 : getInvocationRole().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityProviderDetails == false)
            return false;
        IdentityProviderDetails other = (IdentityProviderDetails) obj;

        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getInvocationRole() == null ^ this.getInvocationRole() == null)
            return false;
        if (other.getInvocationRole() != null
                && other.getInvocationRole().equals(this.getInvocationRole()) == false)
            return false;
        return true;
    }
}
