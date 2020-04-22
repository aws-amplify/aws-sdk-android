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
 * Container for the parameters returned by
 * <code> <a>ListElasticsearchInstanceTypes</a> </code> operation.
 * </p>
 */
public class ListElasticsearchInstanceTypesResult implements Serializable {
    /**
     * <p>
     * List of instance types supported by Amazon Elasticsearch service for
     * given <code> <a>ElasticsearchVersion</a> </code>
     * </p>
     */
    private java.util.List<String> elasticsearchInstanceTypes;

    /**
     * <p>
     * In case if there are more results available NextToken would be present,
     * make further request to the same API with received NextToken to paginate
     * remaining results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of instance types supported by Amazon Elasticsearch service for
     * given <code> <a>ElasticsearchVersion</a> </code>
     * </p>
     *
     * @return <p>
     *         List of instance types supported by Amazon Elasticsearch service
     *         for given <code> <a>ElasticsearchVersion</a> </code>
     *         </p>
     */
    public java.util.List<String> getElasticsearchInstanceTypes() {
        return elasticsearchInstanceTypes;
    }

    /**
     * <p>
     * List of instance types supported by Amazon Elasticsearch service for
     * given <code> <a>ElasticsearchVersion</a> </code>
     * </p>
     *
     * @param elasticsearchInstanceTypes <p>
     *            List of instance types supported by Amazon Elasticsearch
     *            service for given <code> <a>ElasticsearchVersion</a> </code>
     *            </p>
     */
    public void setElasticsearchInstanceTypes(
            java.util.Collection<String> elasticsearchInstanceTypes) {
        if (elasticsearchInstanceTypes == null) {
            this.elasticsearchInstanceTypes = null;
            return;
        }

        this.elasticsearchInstanceTypes = new java.util.ArrayList<String>(
                elasticsearchInstanceTypes);
    }

    /**
     * <p>
     * List of instance types supported by Amazon Elasticsearch service for
     * given <code> <a>ElasticsearchVersion</a> </code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticsearchInstanceTypes <p>
     *            List of instance types supported by Amazon Elasticsearch
     *            service for given <code> <a>ElasticsearchVersion</a> </code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListElasticsearchInstanceTypesResult withElasticsearchInstanceTypes(
            String... elasticsearchInstanceTypes) {
        if (getElasticsearchInstanceTypes() == null) {
            this.elasticsearchInstanceTypes = new java.util.ArrayList<String>(
                    elasticsearchInstanceTypes.length);
        }
        for (String value : elasticsearchInstanceTypes) {
            this.elasticsearchInstanceTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of instance types supported by Amazon Elasticsearch service for
     * given <code> <a>ElasticsearchVersion</a> </code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticsearchInstanceTypes <p>
     *            List of instance types supported by Amazon Elasticsearch
     *            service for given <code> <a>ElasticsearchVersion</a> </code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListElasticsearchInstanceTypesResult withElasticsearchInstanceTypes(
            java.util.Collection<String> elasticsearchInstanceTypes) {
        setElasticsearchInstanceTypes(elasticsearchInstanceTypes);
        return this;
    }

    /**
     * <p>
     * In case if there are more results available NextToken would be present,
     * make further request to the same API with received NextToken to paginate
     * remaining results.
     * </p>
     *
     * @return <p>
     *         In case if there are more results available NextToken would be
     *         present, make further request to the same API with received
     *         NextToken to paginate remaining results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * In case if there are more results available NextToken would be present,
     * make further request to the same API with received NextToken to paginate
     * remaining results.
     * </p>
     *
     * @param nextToken <p>
     *            In case if there are more results available NextToken would be
     *            present, make further request to the same API with received
     *            NextToken to paginate remaining results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * In case if there are more results available NextToken would be present,
     * make further request to the same API with received NextToken to paginate
     * remaining results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            In case if there are more results available NextToken would be
     *            present, make further request to the same API with received
     *            NextToken to paginate remaining results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListElasticsearchInstanceTypesResult withNextToken(String nextToken) {
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
        if (getElasticsearchInstanceTypes() != null)
            sb.append("ElasticsearchInstanceTypes: " + getElasticsearchInstanceTypes() + ",");
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
                + ((getElasticsearchInstanceTypes() == null) ? 0 : getElasticsearchInstanceTypes()
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

        if (obj instanceof ListElasticsearchInstanceTypesResult == false)
            return false;
        ListElasticsearchInstanceTypesResult other = (ListElasticsearchInstanceTypesResult) obj;

        if (other.getElasticsearchInstanceTypes() == null
                ^ this.getElasticsearchInstanceTypes() == null)
            return false;
        if (other.getElasticsearchInstanceTypes() != null
                && other.getElasticsearchInstanceTypes().equals(
                        this.getElasticsearchInstanceTypes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
