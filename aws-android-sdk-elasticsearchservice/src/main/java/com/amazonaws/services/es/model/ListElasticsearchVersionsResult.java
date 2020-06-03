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
 * Container for the parameters for response received from
 * <code> <a>ListElasticsearchVersions</a> </code> operation.
 * </p>
 */
public class ListElasticsearchVersionsResult implements Serializable {
    /**
     * <p>
     * List of supported elastic search versions.
     * </p>
     */
    private java.util.List<String> elasticsearchVersions;

    /**
     * <p>
     * Paginated APIs accepts NextToken input to returns next page results and
     * provides a NextToken output in the response which can be used by the
     * client to retrieve more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of supported elastic search versions.
     * </p>
     *
     * @return <p>
     *         List of supported elastic search versions.
     *         </p>
     */
    public java.util.List<String> getElasticsearchVersions() {
        return elasticsearchVersions;
    }

    /**
     * <p>
     * List of supported elastic search versions.
     * </p>
     *
     * @param elasticsearchVersions <p>
     *            List of supported elastic search versions.
     *            </p>
     */
    public void setElasticsearchVersions(java.util.Collection<String> elasticsearchVersions) {
        if (elasticsearchVersions == null) {
            this.elasticsearchVersions = null;
            return;
        }

        this.elasticsearchVersions = new java.util.ArrayList<String>(elasticsearchVersions);
    }

    /**
     * <p>
     * List of supported elastic search versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticsearchVersions <p>
     *            List of supported elastic search versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListElasticsearchVersionsResult withElasticsearchVersions(
            String... elasticsearchVersions) {
        if (getElasticsearchVersions() == null) {
            this.elasticsearchVersions = new java.util.ArrayList<String>(
                    elasticsearchVersions.length);
        }
        for (String value : elasticsearchVersions) {
            this.elasticsearchVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of supported elastic search versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticsearchVersions <p>
     *            List of supported elastic search versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListElasticsearchVersionsResult withElasticsearchVersions(
            java.util.Collection<String> elasticsearchVersions) {
        setElasticsearchVersions(elasticsearchVersions);
        return this;
    }

    /**
     * <p>
     * Paginated APIs accepts NextToken input to returns next page results and
     * provides a NextToken output in the response which can be used by the
     * client to retrieve more results.
     * </p>
     *
     * @return <p>
     *         Paginated APIs accepts NextToken input to returns next page
     *         results and provides a NextToken output in the response which can
     *         be used by the client to retrieve more results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Paginated APIs accepts NextToken input to returns next page results and
     * provides a NextToken output in the response which can be used by the
     * client to retrieve more results.
     * </p>
     *
     * @param nextToken <p>
     *            Paginated APIs accepts NextToken input to returns next page
     *            results and provides a NextToken output in the response which
     *            can be used by the client to retrieve more results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Paginated APIs accepts NextToken input to returns next page results and
     * provides a NextToken output in the response which can be used by the
     * client to retrieve more results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            Paginated APIs accepts NextToken input to returns next page
     *            results and provides a NextToken output in the response which
     *            can be used by the client to retrieve more results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListElasticsearchVersionsResult withNextToken(String nextToken) {
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
        if (getElasticsearchVersions() != null)
            sb.append("ElasticsearchVersions: " + getElasticsearchVersions() + ",");
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
                + ((getElasticsearchVersions() == null) ? 0 : getElasticsearchVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListElasticsearchVersionsResult == false)
            return false;
        ListElasticsearchVersionsResult other = (ListElasticsearchVersionsResult) obj;

        if (other.getElasticsearchVersions() == null ^ this.getElasticsearchVersions() == null)
            return false;
        if (other.getElasticsearchVersions() != null
                && other.getElasticsearchVersions().equals(this.getElasticsearchVersions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
