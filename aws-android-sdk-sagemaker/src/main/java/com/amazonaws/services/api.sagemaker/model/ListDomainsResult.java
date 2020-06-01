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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

public class ListDomainsResult implements Serializable {
    /**
     * <p>
     * The list of domains.
     * </p>
     */
    private java.util.List<DomainDetails> domains;

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The list of domains.
     * </p>
     *
     * @return <p>
     *         The list of domains.
     *         </p>
     */
    public java.util.List<DomainDetails> getDomains() {
        return domains;
    }

    /**
     * <p>
     * The list of domains.
     * </p>
     *
     * @param domains <p>
     *            The list of domains.
     *            </p>
     */
    public void setDomains(java.util.Collection<DomainDetails> domains) {
        if (domains == null) {
            this.domains = null;
            return;
        }

        this.domains = new java.util.ArrayList<DomainDetails>(domains);
    }

    /**
     * <p>
     * The list of domains.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domains <p>
     *            The list of domains.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDomainsResult withDomains(DomainDetails... domains) {
        if (getDomains() == null) {
            this.domains = new java.util.ArrayList<DomainDetails>(domains.length);
        }
        for (DomainDetails value : domains) {
            this.domains.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of domains.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domains <p>
     *            The list of domains.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDomainsResult withDomains(java.util.Collection<DomainDetails> domains) {
        setDomains(domains);
        return this;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the previous response was truncated, you will receive this
     *         token. Use it in your next request to receive the next set of
     *         results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the previous response was truncated, you will receive this
     *            token. Use it in your next request to receive the next set of
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the previous response was truncated, you will receive this
     *            token. Use it in your next request to receive the next set of
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDomainsResult withNextToken(String nextToken) {
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
        if (getDomains() != null)
            sb.append("Domains: " + getDomains() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomains() == null) ? 0 : getDomains().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
