/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a domain for a user pool.
 * </p>
 */
public class DeleteUserPoolDomainRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The domain string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     */
    private String domain;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The domain string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     *
     * @return <p>
     *         The domain string.
     *         </p>
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p>
     * The domain string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     *
     * @param domain <p>
     *            The domain string.
     *            </p>
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     *
     * @param domain <p>
     *            The domain string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteUserPoolDomainRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteUserPoolDomainRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
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
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteUserPoolDomainRequest == false)
            return false;
        DeleteUserPoolDomainRequest other = (DeleteUserPoolDomainRequest) obj;

        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        return true;
    }
}
