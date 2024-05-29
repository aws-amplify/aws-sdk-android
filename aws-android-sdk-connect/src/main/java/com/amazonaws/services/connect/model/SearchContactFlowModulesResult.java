/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class SearchContactFlowModulesResult implements Serializable {
    /**
     * <p>
     * The search criteria to be used to return contact flow modules.
     * </p>
     */
    private java.util.List<ContactFlowModule> contactFlowModules;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The total number of contact flows which matched your search query.
     * </p>
     */
    private Long approximateTotalCount;

    /**
     * <p>
     * The search criteria to be used to return contact flow modules.
     * </p>
     *
     * @return <p>
     *         The search criteria to be used to return contact flow modules.
     *         </p>
     */
    public java.util.List<ContactFlowModule> getContactFlowModules() {
        return contactFlowModules;
    }

    /**
     * <p>
     * The search criteria to be used to return contact flow modules.
     * </p>
     *
     * @param contactFlowModules <p>
     *            The search criteria to be used to return contact flow modules.
     *            </p>
     */
    public void setContactFlowModules(java.util.Collection<ContactFlowModule> contactFlowModules) {
        if (contactFlowModules == null) {
            this.contactFlowModules = null;
            return;
        }

        this.contactFlowModules = new java.util.ArrayList<ContactFlowModule>(contactFlowModules);
    }

    /**
     * <p>
     * The search criteria to be used to return contact flow modules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contactFlowModules <p>
     *            The search criteria to be used to return contact flow modules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchContactFlowModulesResult withContactFlowModules(
            ContactFlowModule... contactFlowModules) {
        if (getContactFlowModules() == null) {
            this.contactFlowModules = new java.util.ArrayList<ContactFlowModule>(
                    contactFlowModules.length);
        }
        for (ContactFlowModule value : contactFlowModules) {
            this.contactFlowModules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The search criteria to be used to return contact flow modules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contactFlowModules <p>
     *            The search criteria to be used to return contact flow modules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchContactFlowModulesResult withContactFlowModules(
            java.util.Collection<ContactFlowModule> contactFlowModules) {
        setContactFlowModules(contactFlowModules);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchContactFlowModulesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The total number of contact flows which matched your search query.
     * </p>
     *
     * @return <p>
     *         The total number of contact flows which matched your search
     *         query.
     *         </p>
     */
    public Long getApproximateTotalCount() {
        return approximateTotalCount;
    }

    /**
     * <p>
     * The total number of contact flows which matched your search query.
     * </p>
     *
     * @param approximateTotalCount <p>
     *            The total number of contact flows which matched your search
     *            query.
     *            </p>
     */
    public void setApproximateTotalCount(Long approximateTotalCount) {
        this.approximateTotalCount = approximateTotalCount;
    }

    /**
     * <p>
     * The total number of contact flows which matched your search query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approximateTotalCount <p>
     *            The total number of contact flows which matched your search
     *            query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchContactFlowModulesResult withApproximateTotalCount(Long approximateTotalCount) {
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
        if (getContactFlowModules() != null)
            sb.append("ContactFlowModules: " + getContactFlowModules() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getApproximateTotalCount() != null)
            sb.append("ApproximateTotalCount: " + getApproximateTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContactFlowModules() == null) ? 0 : getContactFlowModules().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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

        if (obj instanceof SearchContactFlowModulesResult == false)
            return false;
        SearchContactFlowModulesResult other = (SearchContactFlowModulesResult) obj;

        if (other.getContactFlowModules() == null ^ this.getContactFlowModules() == null)
            return false;
        if (other.getContactFlowModules() != null
                && other.getContactFlowModules().equals(this.getContactFlowModules()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getApproximateTotalCount() == null ^ this.getApproximateTotalCount() == null)
            return false;
        if (other.getApproximateTotalCount() != null
                && other.getApproximateTotalCount().equals(this.getApproximateTotalCount()) == false)
            return false;
        return true;
    }
}
