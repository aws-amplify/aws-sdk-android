/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the response from the server from a request to describe the user
 * pool client.
 * </p>
 */
public class DescribeUserPoolClientResult implements Serializable {
    /**
     * <p>
     * The user pool client from a server response to describe the user pool
     * client.
     * </p>
     */
    private UserPoolClientType userPoolClient;

    /**
     * <p>
     * The user pool client from a server response to describe the user pool
     * client.
     * </p>
     *
     * @return <p>
     *         The user pool client from a server response to describe the user
     *         pool client.
     *         </p>
     */
    public UserPoolClientType getUserPoolClient() {
        return userPoolClient;
    }

    /**
     * <p>
     * The user pool client from a server response to describe the user pool
     * client.
     * </p>
     *
     * @param userPoolClient <p>
     *            The user pool client from a server response to describe the
     *            user pool client.
     *            </p>
     */
    public void setUserPoolClient(UserPoolClientType userPoolClient) {
        this.userPoolClient = userPoolClient;
    }

    /**
     * <p>
     * The user pool client from a server response to describe the user pool
     * client.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userPoolClient <p>
     *            The user pool client from a server response to describe the
     *            user pool client.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeUserPoolClientResult withUserPoolClient(UserPoolClientType userPoolClient) {
        this.userPoolClient = userPoolClient;
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
        if (getUserPoolClient() != null)
            sb.append("UserPoolClient: " + getUserPoolClient());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserPoolClient() == null) ? 0 : getUserPoolClient().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUserPoolClientResult == false)
            return false;
        DescribeUserPoolClientResult other = (DescribeUserPoolClientResult) obj;

        if (other.getUserPoolClient() == null ^ this.getUserPoolClient() == null)
            return false;
        if (other.getUserPoolClient() != null
                && other.getUserPoolClient().equals(this.getUserPoolClient()) == false)
            return false;
        return true;
    }
}
