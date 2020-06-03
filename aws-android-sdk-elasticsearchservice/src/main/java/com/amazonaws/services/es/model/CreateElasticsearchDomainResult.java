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
 * The result of a <code>CreateElasticsearchDomain</code> operation. Contains
 * the status of the newly created Elasticsearch domain.
 * </p>
 */
public class CreateElasticsearchDomainResult implements Serializable {
    /**
     * <p>
     * The status of the newly created Elasticsearch domain.
     * </p>
     */
    private ElasticsearchDomainStatus domainStatus;

    /**
     * <p>
     * The status of the newly created Elasticsearch domain.
     * </p>
     *
     * @return <p>
     *         The status of the newly created Elasticsearch domain.
     *         </p>
     */
    public ElasticsearchDomainStatus getDomainStatus() {
        return domainStatus;
    }

    /**
     * <p>
     * The status of the newly created Elasticsearch domain.
     * </p>
     *
     * @param domainStatus <p>
     *            The status of the newly created Elasticsearch domain.
     *            </p>
     */
    public void setDomainStatus(ElasticsearchDomainStatus domainStatus) {
        this.domainStatus = domainStatus;
    }

    /**
     * <p>
     * The status of the newly created Elasticsearch domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainStatus <p>
     *            The status of the newly created Elasticsearch domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateElasticsearchDomainResult withDomainStatus(ElasticsearchDomainStatus domainStatus) {
        this.domainStatus = domainStatus;
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
        if (getDomainStatus() != null)
            sb.append("DomainStatus: " + getDomainStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDomainStatus() == null) ? 0 : getDomainStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateElasticsearchDomainResult == false)
            return false;
        CreateElasticsearchDomainResult other = (CreateElasticsearchDomainResult) obj;

        if (other.getDomainStatus() == null ^ this.getDomainStatus() == null)
            return false;
        if (other.getDomainStatus() != null
                && other.getDomainStatus().equals(this.getDomainStatus()) == false)
            return false;
        return true;
    }
}
