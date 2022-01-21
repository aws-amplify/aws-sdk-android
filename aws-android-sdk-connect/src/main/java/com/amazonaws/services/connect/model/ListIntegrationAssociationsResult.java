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

public class ListIntegrationAssociationsResult implements Serializable {
    /**
     * <p>
     * The associations.
     * </p>
     */
    private java.util.List<IntegrationAssociationSummary> integrationAssociationSummaryList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The associations.
     * </p>
     *
     * @return <p>
     *         The associations.
     *         </p>
     */
    public java.util.List<IntegrationAssociationSummary> getIntegrationAssociationSummaryList() {
        return integrationAssociationSummaryList;
    }

    /**
     * <p>
     * The associations.
     * </p>
     *
     * @param integrationAssociationSummaryList <p>
     *            The associations.
     *            </p>
     */
    public void setIntegrationAssociationSummaryList(
            java.util.Collection<IntegrationAssociationSummary> integrationAssociationSummaryList) {
        if (integrationAssociationSummaryList == null) {
            this.integrationAssociationSummaryList = null;
            return;
        }

        this.integrationAssociationSummaryList = new java.util.ArrayList<IntegrationAssociationSummary>(
                integrationAssociationSummaryList);
    }

    /**
     * <p>
     * The associations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integrationAssociationSummaryList <p>
     *            The associations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIntegrationAssociationsResult withIntegrationAssociationSummaryList(
            IntegrationAssociationSummary... integrationAssociationSummaryList) {
        if (getIntegrationAssociationSummaryList() == null) {
            this.integrationAssociationSummaryList = new java.util.ArrayList<IntegrationAssociationSummary>(
                    integrationAssociationSummaryList.length);
        }
        for (IntegrationAssociationSummary value : integrationAssociationSummaryList) {
            this.integrationAssociationSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The associations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integrationAssociationSummaryList <p>
     *            The associations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIntegrationAssociationsResult withIntegrationAssociationSummaryList(
            java.util.Collection<IntegrationAssociationSummary> integrationAssociationSummaryList) {
        setIntegrationAssociationSummaryList(integrationAssociationSummaryList);
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
    public ListIntegrationAssociationsResult withNextToken(String nextToken) {
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
        if (getIntegrationAssociationSummaryList() != null)
            sb.append("IntegrationAssociationSummaryList: "
                    + getIntegrationAssociationSummaryList() + ",");
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
                + ((getIntegrationAssociationSummaryList() == null) ? 0
                        : getIntegrationAssociationSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIntegrationAssociationsResult == false)
            return false;
        ListIntegrationAssociationsResult other = (ListIntegrationAssociationsResult) obj;

        if (other.getIntegrationAssociationSummaryList() == null
                ^ this.getIntegrationAssociationSummaryList() == null)
            return false;
        if (other.getIntegrationAssociationSummaryList() != null
                && other.getIntegrationAssociationSummaryList().equals(
                        this.getIntegrationAssociationSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
