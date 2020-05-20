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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a <code>ListGitHubAccountTokenNames</code>
 * operation.
 * </p>
 */
public class ListGitHubAccountTokenNamesResult implements Serializable {
    /**
     * <p>
     * A list of names of connections to GitHub accounts.
     * </p>
     */
    private java.util.List<String> tokenNameList;

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent
     * <code>ListGitHubAccountTokenNames</code> call to return the next set of
     * names in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of names of connections to GitHub accounts.
     * </p>
     *
     * @return <p>
     *         A list of names of connections to GitHub accounts.
     *         </p>
     */
    public java.util.List<String> getTokenNameList() {
        return tokenNameList;
    }

    /**
     * <p>
     * A list of names of connections to GitHub accounts.
     * </p>
     *
     * @param tokenNameList <p>
     *            A list of names of connections to GitHub accounts.
     *            </p>
     */
    public void setTokenNameList(java.util.Collection<String> tokenNameList) {
        if (tokenNameList == null) {
            this.tokenNameList = null;
            return;
        }

        this.tokenNameList = new java.util.ArrayList<String>(tokenNameList);
    }

    /**
     * <p>
     * A list of names of connections to GitHub accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tokenNameList <p>
     *            A list of names of connections to GitHub accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGitHubAccountTokenNamesResult withTokenNameList(String... tokenNameList) {
        if (getTokenNameList() == null) {
            this.tokenNameList = new java.util.ArrayList<String>(tokenNameList.length);
        }
        for (String value : tokenNameList) {
            this.tokenNameList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of connections to GitHub accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tokenNameList <p>
     *            A list of names of connections to GitHub accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGitHubAccountTokenNamesResult withTokenNameList(
            java.util.Collection<String> tokenNameList) {
        setTokenNameList(tokenNameList);
        return this;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent
     * <code>ListGitHubAccountTokenNames</code> call to return the next set of
     * names in the list.
     * </p>
     *
     * @return <p>
     *         If a large amount of information is returned, an identifier is
     *         also returned. It can be used in a subsequent
     *         <code>ListGitHubAccountTokenNames</code> call to return the next
     *         set of names in the list.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent
     * <code>ListGitHubAccountTokenNames</code> call to return the next set of
     * names in the list.
     * </p>
     *
     * @param nextToken <p>
     *            If a large amount of information is returned, an identifier is
     *            also returned. It can be used in a subsequent
     *            <code>ListGitHubAccountTokenNames</code> call to return the
     *            next set of names in the list.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also
     * returned. It can be used in a subsequent
     * <code>ListGitHubAccountTokenNames</code> call to return the next set of
     * names in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If a large amount of information is returned, an identifier is
     *            also returned. It can be used in a subsequent
     *            <code>ListGitHubAccountTokenNames</code> call to return the
     *            next set of names in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGitHubAccountTokenNamesResult withNextToken(String nextToken) {
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
        if (getTokenNameList() != null)
            sb.append("tokenNameList: " + getTokenNameList() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTokenNameList() == null) ? 0 : getTokenNameList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGitHubAccountTokenNamesResult == false)
            return false;
        ListGitHubAccountTokenNamesResult other = (ListGitHubAccountTokenNamesResult) obj;

        if (other.getTokenNameList() == null ^ this.getTokenNameList() == null)
            return false;
        if (other.getTokenNameList() != null
                && other.getTokenNameList().equals(this.getTokenNameList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
