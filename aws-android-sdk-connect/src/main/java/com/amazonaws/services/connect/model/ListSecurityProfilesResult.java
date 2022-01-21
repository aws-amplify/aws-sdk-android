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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class ListSecurityProfilesResult implements Serializable {
    /**
     * <p>
     * Information about the security profiles.
     * </p>
     */
    private java.util.List<SecurityProfileSummary> securityProfileSummaryList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the security profiles.
     * </p>
     *
     * @return <p>
     *         Information about the security profiles.
     *         </p>
     */
    public java.util.List<SecurityProfileSummary> getSecurityProfileSummaryList() {
        return securityProfileSummaryList;
    }

    /**
     * <p>
     * Information about the security profiles.
     * </p>
     *
     * @param securityProfileSummaryList <p>
     *            Information about the security profiles.
     *            </p>
     */
    public void setSecurityProfileSummaryList(
            java.util.Collection<SecurityProfileSummary> securityProfileSummaryList) {
        if (securityProfileSummaryList == null) {
            this.securityProfileSummaryList = null;
            return;
        }

        this.securityProfileSummaryList = new java.util.ArrayList<SecurityProfileSummary>(
                securityProfileSummaryList);
    }

    /**
     * <p>
     * Information about the security profiles.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileSummaryList <p>
     *            Information about the security profiles.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSecurityProfilesResult withSecurityProfileSummaryList(
            SecurityProfileSummary... securityProfileSummaryList) {
        if (getSecurityProfileSummaryList() == null) {
            this.securityProfileSummaryList = new java.util.ArrayList<SecurityProfileSummary>(
                    securityProfileSummaryList.length);
        }
        for (SecurityProfileSummary value : securityProfileSummaryList) {
            this.securityProfileSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the security profiles.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileSummaryList <p>
     *            Information about the security profiles.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSecurityProfilesResult withSecurityProfileSummaryList(
            java.util.Collection<SecurityProfileSummary> securityProfileSummaryList) {
        setSecurityProfileSummaryList(securityProfileSummaryList);
        return this;
    }

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
    public ListSecurityProfilesResult withNextToken(String nextToken) {
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
        if (getSecurityProfileSummaryList() != null)
            sb.append("SecurityProfileSummaryList: " + getSecurityProfileSummaryList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSecurityProfileSummaryList() == null) ? 0 : getSecurityProfileSummaryList()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSecurityProfilesResult == false)
            return false;
        ListSecurityProfilesResult other = (ListSecurityProfilesResult) obj;

        if (other.getSecurityProfileSummaryList() == null
                ^ this.getSecurityProfileSummaryList() == null)
            return false;
        if (other.getSecurityProfileSummaryList() != null
                && other.getSecurityProfileSummaryList().equals(
                        this.getSecurityProfileSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
