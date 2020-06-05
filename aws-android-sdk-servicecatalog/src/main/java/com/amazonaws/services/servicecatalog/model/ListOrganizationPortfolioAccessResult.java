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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

public class ListOrganizationPortfolioAccessResult implements Serializable {
    /**
     * <p>
     * Displays information about the organization nodes.
     * </p>
     */
    private java.util.List<OrganizationNode> organizationNodes;

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     */
    private String nextPageToken;

    /**
     * <p>
     * Displays information about the organization nodes.
     * </p>
     *
     * @return <p>
     *         Displays information about the organization nodes.
     *         </p>
     */
    public java.util.List<OrganizationNode> getOrganizationNodes() {
        return organizationNodes;
    }

    /**
     * <p>
     * Displays information about the organization nodes.
     * </p>
     *
     * @param organizationNodes <p>
     *            Displays information about the organization nodes.
     *            </p>
     */
    public void setOrganizationNodes(java.util.Collection<OrganizationNode> organizationNodes) {
        if (organizationNodes == null) {
            this.organizationNodes = null;
            return;
        }

        this.organizationNodes = new java.util.ArrayList<OrganizationNode>(organizationNodes);
    }

    /**
     * <p>
     * Displays information about the organization nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param organizationNodes <p>
     *            Displays information about the organization nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOrganizationPortfolioAccessResult withOrganizationNodes(
            OrganizationNode... organizationNodes) {
        if (getOrganizationNodes() == null) {
            this.organizationNodes = new java.util.ArrayList<OrganizationNode>(
                    organizationNodes.length);
        }
        for (OrganizationNode value : organizationNodes) {
            this.organizationNodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Displays information about the organization nodes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param organizationNodes <p>
     *            Displays information about the organization nodes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOrganizationPortfolioAccessResult withOrganizationNodes(
            java.util.Collection<OrganizationNode> organizationNodes) {
        setOrganizationNodes(organizationNodes);
        return this;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @return <p>
     *         The page token to use to retrieve the next set of results. If
     *         there are no additional results, this value is null.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param nextPageToken <p>
     *            The page token to use to retrieve the next set of results. If
     *            there are no additional results, this value is null.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are
     * no additional results, this value is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param nextPageToken <p>
     *            The page token to use to retrieve the next set of results. If
     *            there are no additional results, this value is null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOrganizationPortfolioAccessResult withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getOrganizationNodes() != null)
            sb.append("OrganizationNodes: " + getOrganizationNodes() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOrganizationNodes() == null) ? 0 : getOrganizationNodes().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOrganizationPortfolioAccessResult == false)
            return false;
        ListOrganizationPortfolioAccessResult other = (ListOrganizationPortfolioAccessResult) obj;

        if (other.getOrganizationNodes() == null ^ this.getOrganizationNodes() == null)
            return false;
        if (other.getOrganizationNodes() != null
                && other.getOrganizationNodes().equals(this.getOrganizationNodes()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
