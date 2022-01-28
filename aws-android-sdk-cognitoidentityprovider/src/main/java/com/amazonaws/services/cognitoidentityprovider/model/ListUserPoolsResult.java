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
 * Represents the response to list user pools.
 * </p>
 */
public class ListUserPoolsResult implements Serializable {
    /**
     * <p>
     * The user pools from the response to list users.
     * </p>
     */
    private java.util.List<UserPoolDescriptionType> userPools;

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
     * The user pools from the response to list users.
     * </p>
     *
     * @return <p>
     *         The user pools from the response to list users.
     *         </p>
     */
    public java.util.List<UserPoolDescriptionType> getUserPools() {
        return userPools;
    }

    /**
     * <p>
     * The user pools from the response to list users.
     * </p>
     *
     * @param userPools <p>
     *            The user pools from the response to list users.
     *            </p>
     */
    public void setUserPools(java.util.Collection<UserPoolDescriptionType> userPools) {
        if (userPools == null) {
            this.userPools = null;
            return;
        }

        this.userPools = new java.util.ArrayList<UserPoolDescriptionType>(userPools);
    }

    /**
     * <p>
     * The user pools from the response to list users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userPools <p>
     *            The user pools from the response to list users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUserPoolsResult withUserPools(UserPoolDescriptionType... userPools) {
        if (getUserPools() == null) {
            this.userPools = new java.util.ArrayList<UserPoolDescriptionType>(userPools.length);
        }
        for (UserPoolDescriptionType value : userPools) {
            this.userPools.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The user pools from the response to list users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userPools <p>
     *            The user pools from the response to list users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUserPoolsResult withUserPools(java.util.Collection<UserPoolDescriptionType> userPools) {
        setUserPools(userPools);
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
    public ListUserPoolsResult withNextToken(String nextToken) {
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
        if (getUserPools() != null)
            sb.append("UserPools: " + getUserPools() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPools() == null) ? 0 : getUserPools().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUserPoolsResult == false)
            return false;
        ListUserPoolsResult other = (ListUserPoolsResult) obj;

        if (other.getUserPools() == null ^ this.getUserPools() == null)
            return false;
        if (other.getUserPools() != null
                && other.getUserPools().equals(this.getUserPools()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
