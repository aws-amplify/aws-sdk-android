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

public class ListContactFlowModulesResult implements Serializable {
    /**
     * <p>
     * Information about the contact flow module.
     * </p>
     */
    private java.util.List<ContactFlowModuleSummary> contactFlowModulesSummaryList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the contact flow module.
     * </p>
     *
     * @return <p>
     *         Information about the contact flow module.
     *         </p>
     */
    public java.util.List<ContactFlowModuleSummary> getContactFlowModulesSummaryList() {
        return contactFlowModulesSummaryList;
    }

    /**
     * <p>
     * Information about the contact flow module.
     * </p>
     *
     * @param contactFlowModulesSummaryList <p>
     *            Information about the contact flow module.
     *            </p>
     */
    public void setContactFlowModulesSummaryList(
            java.util.Collection<ContactFlowModuleSummary> contactFlowModulesSummaryList) {
        if (contactFlowModulesSummaryList == null) {
            this.contactFlowModulesSummaryList = null;
            return;
        }

        this.contactFlowModulesSummaryList = new java.util.ArrayList<ContactFlowModuleSummary>(
                contactFlowModulesSummaryList);
    }

    /**
     * <p>
     * Information about the contact flow module.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contactFlowModulesSummaryList <p>
     *            Information about the contact flow module.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContactFlowModulesResult withContactFlowModulesSummaryList(
            ContactFlowModuleSummary... contactFlowModulesSummaryList) {
        if (getContactFlowModulesSummaryList() == null) {
            this.contactFlowModulesSummaryList = new java.util.ArrayList<ContactFlowModuleSummary>(
                    contactFlowModulesSummaryList.length);
        }
        for (ContactFlowModuleSummary value : contactFlowModulesSummaryList) {
            this.contactFlowModulesSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the contact flow module.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contactFlowModulesSummaryList <p>
     *            Information about the contact flow module.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContactFlowModulesResult withContactFlowModulesSummaryList(
            java.util.Collection<ContactFlowModuleSummary> contactFlowModulesSummaryList) {
        setContactFlowModulesSummaryList(contactFlowModulesSummaryList);
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
    public ListContactFlowModulesResult withNextToken(String nextToken) {
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
        if (getContactFlowModulesSummaryList() != null)
            sb.append("ContactFlowModulesSummaryList: " + getContactFlowModulesSummaryList() + ",");
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
                + ((getContactFlowModulesSummaryList() == null) ? 0
                        : getContactFlowModulesSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListContactFlowModulesResult == false)
            return false;
        ListContactFlowModulesResult other = (ListContactFlowModulesResult) obj;

        if (other.getContactFlowModulesSummaryList() == null
                ^ this.getContactFlowModulesSummaryList() == null)
            return false;
        if (other.getContactFlowModulesSummaryList() != null
                && other.getContactFlowModulesSummaryList().equals(
                        this.getContactFlowModulesSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
