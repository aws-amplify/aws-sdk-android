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

/**
 * <p>
 * Represents the response from the server that lists user pool clients.
 * </p>
 */
public class ListUserPoolClientsResult implements Serializable {
    /**
     * <p>
     * The user pool clients in the response that lists user pool clients.
     * </p>
     */
    private java.util.List<UserPoolClientDescription> userPoolClients;

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
    private String nextToken;

    /**
     * <p>
     * The user pool clients in the response that lists user pool clients.
     * </p>
     *
     * @return <p>
     *         The user pool clients in the response that lists user pool
     *         clients.
     *         </p>
     */
    public java.util.List<UserPoolClientDescription> getUserPoolClients() {
        return userPoolClients;
    }

    /**
     * <p>
     * The user pool clients in the response that lists user pool clients.
     * </p>
     *
     * @param userPoolClients <p>
     *            The user pool clients in the response that lists user pool
     *            clients.
     *            </p>
     */
    public void setUserPoolClients(java.util.Collection<UserPoolClientDescription> userPoolClients) {
        if (userPoolClients == null) {
            this.userPoolClients = null;
            return;
        }

        this.userPoolClients = new java.util.ArrayList<UserPoolClientDescription>(userPoolClients);
    }

    /**
     * <p>
     * The user pool clients in the response that lists user pool clients.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userPoolClients <p>
     *            The user pool clients in the response that lists user pool
     *            clients.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUserPoolClientsResult withUserPoolClients(
            UserPoolClientDescription... userPoolClients) {
        if (getUserPoolClients() == null) {
            this.userPoolClients = new java.util.ArrayList<UserPoolClientDescription>(
                    userPoolClients.length);
        }
        for (UserPoolClientDescription value : userPoolClients) {
            this.userPoolClients.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The user pool clients in the response that lists user pool clients.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userPoolClients <p>
     *            The user pool clients in the response that lists user pool
     *            clients.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUserPoolClientsResult withUserPoolClients(
            java.util.Collection<UserPoolClientDescription> userPoolClients) {
        setUserPoolClients(userPoolClients);
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
    public String getNextToken() {
        return nextToken;
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
     * @param nextToken <p>
     *            An identifier that was returned from the previous call to this
     *            operation, which can be used to return the next set of items
     *            in the list.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
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
     * @param nextToken <p>
     *            An identifier that was returned from the previous call to this
     *            operation, which can be used to return the next set of items
     *            in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUserPoolClientsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getUserPoolClients() != null)
            sb.append("UserPoolClients: " + getUserPoolClients() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserPoolClients() == null) ? 0 : getUserPoolClients().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUserPoolClientsResult == false)
            return false;
        ListUserPoolClientsResult other = (ListUserPoolClientsResult) obj;

        if (other.getUserPoolClients() == null ^ this.getUserPoolClients() == null)
            return false;
        if (other.getUserPoolClients() != null
                && other.getUserPoolClients().equals(this.getUserPoolClients()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
