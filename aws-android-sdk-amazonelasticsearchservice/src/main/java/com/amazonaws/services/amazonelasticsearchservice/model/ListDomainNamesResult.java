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
 * The result of a <code>ListDomainNames</code> operation. Contains the names of
 * all Elasticsearch domains owned by this account.
 * </p>
 */
public class ListDomainNamesResult implements Serializable {
    /**
     * <p>
     * List of Elasticsearch domain names.
     * </p>
     */
    private java.util.List<DomainInfo> domainNames;

    /**
     * <p>
     * List of Elasticsearch domain names.
     * </p>
     *
     * @return <p>
     *         List of Elasticsearch domain names.
     *         </p>
     */
    public java.util.List<DomainInfo> getDomainNames() {
        return domainNames;
    }

    /**
     * <p>
     * List of Elasticsearch domain names.
     * </p>
     *
     * @param domainNames <p>
     *            List of Elasticsearch domain names.
     *            </p>
     */
    public void setDomainNames(java.util.Collection<DomainInfo> domainNames) {
        if (domainNames == null) {
            this.domainNames = null;
            return;
        }

        this.domainNames = new java.util.ArrayList<DomainInfo>(domainNames);
    }

    /**
     * <p>
     * List of Elasticsearch domain names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainNames <p>
     *            List of Elasticsearch domain names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDomainNamesResult withDomainNames(DomainInfo... domainNames) {
        if (getDomainNames() == null) {
            this.domainNames = new java.util.ArrayList<DomainInfo>(domainNames.length);
        }
        for (DomainInfo value : domainNames) {
            this.domainNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of Elasticsearch domain names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainNames <p>
     *            List of Elasticsearch domain names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDomainNamesResult withDomainNames(java.util.Collection<DomainInfo> domainNames) {
        setDomainNames(domainNames);
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
        if (getDomainNames() != null)
            sb.append("DomainNames: " + getDomainNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDomainNames() == null) ? 0 : getDomainNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDomainNamesResult == false)
            return false;
        ListDomainNamesResult other = (ListDomainNamesResult) obj;

        if (other.getDomainNames() == null ^ this.getDomainNames() == null)
            return false;
        if (other.getDomainNames() != null
                && other.getDomainNames().equals(this.getDomainNames()) == false)
            return false;
        return true;
    }
}
