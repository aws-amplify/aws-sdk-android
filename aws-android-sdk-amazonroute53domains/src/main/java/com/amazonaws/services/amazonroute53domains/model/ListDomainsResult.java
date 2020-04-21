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

package com.amazonaws.services.amazonroute53domains.model;

import java.io.Serializable;

/**
 * <p>
 * The ListDomains response includes the following elements.
 * </p>
 */
public class ListDomainsResult implements Serializable {
    /**
     * <p>
     * A summary of domains.
     * </p>
     */
    private java.util.List<DomainSummary> domains;

    /**
     * <p>
     * If there are more domains than you specified for <code>MaxItems</code> in
     * the request, submit another request and include the value of
     * <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String nextPageMarker;

    /**
     * <p>
     * A summary of domains.
     * </p>
     *
     * @return <p>
     *         A summary of domains.
     *         </p>
     */
    public java.util.List<DomainSummary> getDomains() {
        return domains;
    }

    /**
     * <p>
     * A summary of domains.
     * </p>
     *
     * @param domains <p>
     *            A summary of domains.
     *            </p>
     */
    public void setDomains(java.util.Collection<DomainSummary> domains) {
        if (domains == null) {
            this.domains = null;
            return;
        }

        this.domains = new java.util.ArrayList<DomainSummary>(domains);
    }

    /**
     * <p>
     * A summary of domains.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domains <p>
     *            A summary of domains.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDomainsResult withDomains(DomainSummary... domains) {
        if (getDomains() == null) {
            this.domains = new java.util.ArrayList<DomainSummary>(domains.length);
        }
        for (DomainSummary value : domains) {
            this.domains.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A summary of domains.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domains <p>
     *            A summary of domains.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDomainsResult withDomains(java.util.Collection<DomainSummary> domains) {
        setDomains(domains);
        return this;
    }

    /**
     * <p>
     * If there are more domains than you specified for <code>MaxItems</code> in
     * the request, submit another request and include the value of
     * <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @return <p>
     *         If there are more domains than you specified for
     *         <code>MaxItems</code> in the request, submit another request and
     *         include the value of <code>NextPageMarker</code> in the value of
     *         <code>Marker</code>.
     *         </p>
     */
    public String getNextPageMarker() {
        return nextPageMarker;
    }

    /**
     * <p>
     * If there are more domains than you specified for <code>MaxItems</code> in
     * the request, submit another request and include the value of
     * <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param nextPageMarker <p>
     *            If there are more domains than you specified for
     *            <code>MaxItems</code> in the request, submit another request
     *            and include the value of <code>NextPageMarker</code> in the
     *            value of <code>Marker</code>.
     *            </p>
     */
    public void setNextPageMarker(String nextPageMarker) {
        this.nextPageMarker = nextPageMarker;
    }

    /**
     * <p>
     * If there are more domains than you specified for <code>MaxItems</code> in
     * the request, submit another request and include the value of
     * <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param nextPageMarker <p>
     *            If there are more domains than you specified for
     *            <code>MaxItems</code> in the request, submit another request
     *            and include the value of <code>NextPageMarker</code> in the
     *            value of <code>Marker</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDomainsResult withNextPageMarker(String nextPageMarker) {
        this.nextPageMarker = nextPageMarker;
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
        if (getDomains() != null)
            sb.append("Domains: " + getDomains() + ",");
        if (getNextPageMarker() != null)
            sb.append("NextPageMarker: " + getNextPageMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomains() == null) ? 0 : getDomains().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageMarker() == null) ? 0 : getNextPageMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDomainsResult == false)
            return false;
        ListDomainsResult other = (ListDomainsResult) obj;

        if (other.getDomains() == null ^ this.getDomains() == null)
            return false;
        if (other.getDomains() != null && other.getDomains().equals(this.getDomains()) == false)
            return false;
        if (other.getNextPageMarker() == null ^ this.getNextPageMarker() == null)
            return false;
        if (other.getNextPageMarker() != null
                && other.getNextPageMarker().equals(this.getNextPageMarker()) == false)
            return false;
        return true;
    }
}
