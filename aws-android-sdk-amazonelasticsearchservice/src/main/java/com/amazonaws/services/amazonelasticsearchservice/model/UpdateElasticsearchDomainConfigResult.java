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
 * The result of an <code>UpdateElasticsearchDomain</code> request. Contains the
 * status of the Elasticsearch domain being updated.
 * </p>
 */
public class UpdateElasticsearchDomainConfigResult implements Serializable {
    /**
     * <p>
     * The status of the updated Elasticsearch domain.
     * </p>
     */
    private ElasticsearchDomainConfig domainConfig;

    /**
     * <p>
     * The status of the updated Elasticsearch domain.
     * </p>
     *
     * @return <p>
     *         The status of the updated Elasticsearch domain.
     *         </p>
     */
    public ElasticsearchDomainConfig getDomainConfig() {
        return domainConfig;
    }

    /**
     * <p>
     * The status of the updated Elasticsearch domain.
     * </p>
     *
     * @param domainConfig <p>
     *            The status of the updated Elasticsearch domain.
     *            </p>
     */
    public void setDomainConfig(ElasticsearchDomainConfig domainConfig) {
        this.domainConfig = domainConfig;
    }

    /**
     * <p>
     * The status of the updated Elasticsearch domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainConfig <p>
     *            The status of the updated Elasticsearch domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateElasticsearchDomainConfigResult withDomainConfig(
            ElasticsearchDomainConfig domainConfig) {
        this.domainConfig = domainConfig;
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
        if (getDomainConfig() != null)
            sb.append("DomainConfig: " + getDomainConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDomainConfig() == null) ? 0 : getDomainConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateElasticsearchDomainConfigResult == false)
            return false;
        UpdateElasticsearchDomainConfigResult other = (UpdateElasticsearchDomainConfigResult) obj;

        if (other.getDomainConfig() == null ^ this.getDomainConfig() == null)
            return false;
        if (other.getDomainConfig() != null
                && other.getDomainConfig().equals(this.getDomainConfig()) == false)
            return false;
        return true;
    }
}
