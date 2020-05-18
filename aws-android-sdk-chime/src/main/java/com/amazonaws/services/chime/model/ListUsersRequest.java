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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the users that belong to the specified Amazon Chime account. You can
 * specify an email address to list only the user that the email address belongs
 * to.
 * </p>
 */
public class ListUsersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String accountId;

    /**
     * <p>
     * Optional. The user email address used to filter results. Maximum 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.+@.+\..+<br/>
     */
    private String userEmail;

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     */
    private String userType;

    /**
     * <p>
     * The maximum number of results to return in a single call. Defaults to
     * 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 200<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Chime account ID.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param accountId <p>
     *            The Amazon Chime account ID.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param accountId <p>
     *            The Amazon Chime account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * Optional. The user email address used to filter results. Maximum 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.+@.+\..+<br/>
     *
     * @return <p>
     *         Optional. The user email address used to filter results. Maximum
     *         1.
     *         </p>
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * <p>
     * Optional. The user email address used to filter results. Maximum 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.+@.+\..+<br/>
     *
     * @param userEmail <p>
     *            Optional. The user email address used to filter results.
     *            Maximum 1.
     *            </p>
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * <p>
     * Optional. The user email address used to filter results. Maximum 1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.+@.+\..+<br/>
     *
     * @param userEmail <p>
     *            Optional. The user email address used to filter results.
     *            Maximum 1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersRequest withUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @return <p>
     *         The user type.
     *         </p>
     * @see UserType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @param userType <p>
     *            The user type.
     *            </p>
     * @see UserType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @param userType <p>
     *            The user type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserType
     */
    public ListUsersRequest withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @param userType <p>
     *            The user type.
     *            </p>
     * @see UserType
     */
    public void setUserType(UserType userType) {
        this.userType = userType.toString();
    }

    /**
     * <p>
     * The user type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PrivateUser, SharedDevice
     *
     * @param userType <p>
     *            The user type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserType
     */
    public ListUsersRequest withUserType(UserType userType) {
        this.userType = userType.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Defaults to
     * 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 200<br/>
     *
     * @return <p>
     *         The maximum number of results to return in a single call.
     *         Defaults to 100.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Defaults to
     * 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 200<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call.
     *            Defaults to 100.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Defaults to
     * 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 200<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call.
     *            Defaults to 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersRequest withNextToken(String nextToken) {
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
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getUserEmail() != null)
            sb.append("UserEmail: " + getUserEmail() + ",");
        if (getUserType() != null)
            sb.append("UserType: " + getUserType() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        hashCode = prime * hashCode + ((getUserType() == null) ? 0 : getUserType().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUsersRequest == false)
            return false;
        ListUsersRequest other = (ListUsersRequest) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getUserEmail() == null ^ this.getUserEmail() == null)
            return false;
        if (other.getUserEmail() != null
                && other.getUserEmail().equals(this.getUserEmail()) == false)
            return false;
        if (other.getUserType() == null ^ this.getUserType() == null)
            return false;
        if (other.getUserType() != null && other.getUserType().equals(this.getUserType()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
