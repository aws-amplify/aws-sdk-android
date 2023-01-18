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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class GetCurrentUserDataResult implements Serializable {
    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the user data that is returned.
     * </p>
     */
    private java.util.List<UserData> userDataList;

    /**
     * <p>
     * The total count of the result, regardless of the current page size.
     * </p>
     */
    private Long approximateTotalCount;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCurrentUserDataResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A list of the user data that is returned.
     * </p>
     *
     * @return <p>
     *         A list of the user data that is returned.
     *         </p>
     */
    public java.util.List<UserData> getUserDataList() {
        return userDataList;
    }

    /**
     * <p>
     * A list of the user data that is returned.
     * </p>
     *
     * @param userDataList <p>
     *            A list of the user data that is returned.
     *            </p>
     */
    public void setUserDataList(java.util.Collection<UserData> userDataList) {
        if (userDataList == null) {
            this.userDataList = null;
            return;
        }

        this.userDataList = new java.util.ArrayList<UserData>(userDataList);
    }

    /**
     * <p>
     * A list of the user data that is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userDataList <p>
     *            A list of the user data that is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCurrentUserDataResult withUserDataList(UserData... userDataList) {
        if (getUserDataList() == null) {
            this.userDataList = new java.util.ArrayList<UserData>(userDataList.length);
        }
        for (UserData value : userDataList) {
            this.userDataList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the user data that is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userDataList <p>
     *            A list of the user data that is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCurrentUserDataResult withUserDataList(java.util.Collection<UserData> userDataList) {
        setUserDataList(userDataList);
        return this;
    }

    /**
     * <p>
     * The total count of the result, regardless of the current page size.
     * </p>
     *
     * @return <p>
     *         The total count of the result, regardless of the current page
     *         size.
     *         </p>
     */
    public Long getApproximateTotalCount() {
        return approximateTotalCount;
    }

    /**
     * <p>
     * The total count of the result, regardless of the current page size.
     * </p>
     *
     * @param approximateTotalCount <p>
     *            The total count of the result, regardless of the current page
     *            size.
     *            </p>
     */
    public void setApproximateTotalCount(Long approximateTotalCount) {
        this.approximateTotalCount = approximateTotalCount;
    }

    /**
     * <p>
     * The total count of the result, regardless of the current page size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approximateTotalCount <p>
     *            The total count of the result, regardless of the current page
     *            size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCurrentUserDataResult withApproximateTotalCount(Long approximateTotalCount) {
        this.approximateTotalCount = approximateTotalCount;
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getUserDataList() != null)
            sb.append("UserDataList: " + getUserDataList() + ",");
        if (getApproximateTotalCount() != null)
            sb.append("ApproximateTotalCount: " + getApproximateTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getUserDataList() == null) ? 0 : getUserDataList().hashCode());
        hashCode = prime
                * hashCode
                + ((getApproximateTotalCount() == null) ? 0 : getApproximateTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCurrentUserDataResult == false)
            return false;
        GetCurrentUserDataResult other = (GetCurrentUserDataResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getUserDataList() == null ^ this.getUserDataList() == null)
            return false;
        if (other.getUserDataList() != null
                && other.getUserDataList().equals(this.getUserDataList()) == false)
            return false;
        if (other.getApproximateTotalCount() == null ^ this.getApproximateTotalCount() == null)
            return false;
        if (other.getApproximateTotalCount() != null
                && other.getApproximateTotalCount().equals(this.getApproximateTotalCount()) == false)
            return false;
        return true;
    }
}
