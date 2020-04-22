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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * Container for response parameters to
 * <code> <a>ListDomainsForPackage</a> </code> operation.
 * </p>
 */
public class ListDomainsForPackageResult implements Serializable {
    /**
     * <p>
     * List of <code>DomainPackageDetails</code> objects.
     * </p>
     */
    private java.util.List<DomainPackageDetails> domainPackageDetailsList;

    /**
     * The new value for the nextToken property for this object.
     */
    private String nextToken;

    /**
     * <p>
     * List of <code>DomainPackageDetails</code> objects.
     * </p>
     *
     * @return <p>
     *         List of <code>DomainPackageDetails</code> objects.
     *         </p>
     */
    public java.util.List<DomainPackageDetails> getDomainPackageDetailsList() {
        return domainPackageDetailsList;
    }

    /**
     * <p>
     * List of <code>DomainPackageDetails</code> objects.
     * </p>
     *
     * @param domainPackageDetailsList <p>
     *            List of <code>DomainPackageDetails</code> objects.
     *            </p>
     */
    public void setDomainPackageDetailsList(
            java.util.Collection<DomainPackageDetails> domainPackageDetailsList) {
        if (domainPackageDetailsList == null) {
            this.domainPackageDetailsList = null;
            return;
        }

        this.domainPackageDetailsList = new java.util.ArrayList<DomainPackageDetails>(
                domainPackageDetailsList);
    }

    /**
     * <p>
     * List of <code>DomainPackageDetails</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainPackageDetailsList <p>
     *            List of <code>DomainPackageDetails</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDomainsForPackageResult withDomainPackageDetailsList(
            DomainPackageDetails... domainPackageDetailsList) {
        if (getDomainPackageDetailsList() == null) {
            this.domainPackageDetailsList = new java.util.ArrayList<DomainPackageDetails>(
                    domainPackageDetailsList.length);
        }
        for (DomainPackageDetails value : domainPackageDetailsList) {
            this.domainPackageDetailsList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of <code>DomainPackageDetails</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainPackageDetailsList <p>
     *            List of <code>DomainPackageDetails</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDomainsForPackageResult withDomainPackageDetailsList(
            java.util.Collection<DomainPackageDetails> domainPackageDetailsList) {
        setDomainPackageDetailsList(domainPackageDetailsList);
        return this;
    }

    /**
     * Returns the value of the nextToken property for this object.
     *
     * @return The value of the nextToken property for this object.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Sets the value of nextToken
     *
     * @param nextToken The new value for the nextToken property for this
     *            object.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Sets the value of the nextToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken The new value for the nextToken property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDomainsForPackageResult withNextToken(String nextToken) {
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
        if (getDomainPackageDetailsList() != null)
            sb.append("DomainPackageDetailsList: " + getDomainPackageDetailsList() + ",");
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
                + ((getDomainPackageDetailsList() == null) ? 0 : getDomainPackageDetailsList()
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

        if (obj instanceof ListDomainsForPackageResult == false)
            return false;
        ListDomainsForPackageResult other = (ListDomainsForPackageResult) obj;

        if (other.getDomainPackageDetailsList() == null
                ^ this.getDomainPackageDetailsList() == null)
            return false;
        if (other.getDomainPackageDetailsList() != null
                && other.getDomainPackageDetailsList().equals(this.getDomainPackageDetailsList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
