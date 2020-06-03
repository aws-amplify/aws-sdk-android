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

package com.amazonaws.services.es.model;

import java.io.Serializable;

/**
 * <p>
 * The result of a <code>DescribeElasticsearchDomains</code> request. Contains
 * the status of the specified domains or all domains owned by the account.
 * </p>
 */
public class DescribeElasticsearchDomainsResult implements Serializable {
    /**
     * <p>
     * The status of the domains requested in the
     * <code>DescribeElasticsearchDomains</code> request.
     * </p>
     */
    private java.util.List<ElasticsearchDomainStatus> domainStatusList;

    /**
     * <p>
     * The status of the domains requested in the
     * <code>DescribeElasticsearchDomains</code> request.
     * </p>
     *
     * @return <p>
     *         The status of the domains requested in the
     *         <code>DescribeElasticsearchDomains</code> request.
     *         </p>
     */
    public java.util.List<ElasticsearchDomainStatus> getDomainStatusList() {
        return domainStatusList;
    }

    /**
     * <p>
     * The status of the domains requested in the
     * <code>DescribeElasticsearchDomains</code> request.
     * </p>
     *
     * @param domainStatusList <p>
     *            The status of the domains requested in the
     *            <code>DescribeElasticsearchDomains</code> request.
     *            </p>
     */
    public void setDomainStatusList(java.util.Collection<ElasticsearchDomainStatus> domainStatusList) {
        if (domainStatusList == null) {
            this.domainStatusList = null;
            return;
        }

        this.domainStatusList = new java.util.ArrayList<ElasticsearchDomainStatus>(domainStatusList);
    }

    /**
     * <p>
     * The status of the domains requested in the
     * <code>DescribeElasticsearchDomains</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainStatusList <p>
     *            The status of the domains requested in the
     *            <code>DescribeElasticsearchDomains</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeElasticsearchDomainsResult withDomainStatusList(
            ElasticsearchDomainStatus... domainStatusList) {
        if (getDomainStatusList() == null) {
            this.domainStatusList = new java.util.ArrayList<ElasticsearchDomainStatus>(
                    domainStatusList.length);
        }
        for (ElasticsearchDomainStatus value : domainStatusList) {
            this.domainStatusList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The status of the domains requested in the
     * <code>DescribeElasticsearchDomains</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainStatusList <p>
     *            The status of the domains requested in the
     *            <code>DescribeElasticsearchDomains</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeElasticsearchDomainsResult withDomainStatusList(
            java.util.Collection<ElasticsearchDomainStatus> domainStatusList) {
        setDomainStatusList(domainStatusList);
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
        if (getDomainStatusList() != null)
            sb.append("DomainStatusList: " + getDomainStatusList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDomainStatusList() == null) ? 0 : getDomainStatusList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeElasticsearchDomainsResult == false)
            return false;
        DescribeElasticsearchDomainsResult other = (DescribeElasticsearchDomainsResult) obj;

        if (other.getDomainStatusList() == null ^ this.getDomainStatusList() == null)
            return false;
        if (other.getDomainStatusList() != null
                && other.getDomainStatusList().equals(this.getDomainStatusList()) == false)
            return false;
        return true;
    }
}
