/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Aggregates on indexed data with search queries pertaining to particular
 * fields.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >GetBucketsAggregation</a> action.
 * </p>
 */
public class GetBucketsAggregationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the index to search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String indexName;

    /**
     * <p>
     * The search query string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String queryString;

    /**
     * <p>
     * The aggregation field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String aggregationField;

    /**
     * <p>
     * The version of the query.
     * </p>
     */
    private String queryVersion;

    /**
     * <p>
     * The basic control of the response shape and the bucket aggregation type
     * to perform.
     * </p>
     */
    private BucketsAggregationType bucketsAggregationType;

    /**
     * <p>
     * The name of the index to search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the index to search.
     *         </p>
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * <p>
     * The name of the index to search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param indexName <p>
     *            The name of the index to search.
     *            </p>
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the index to search.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param indexName <p>
     *            The name of the index to search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketsAggregationRequest withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * The search query string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The search query string.
     *         </p>
     */
    public String getQueryString() {
        return queryString;
    }

    /**
     * <p>
     * The search query string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param queryString <p>
     *            The search query string.
     *            </p>
     */
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The search query string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param queryString <p>
     *            The search query string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketsAggregationRequest withQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * <p>
     * The aggregation field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The aggregation field.
     *         </p>
     */
    public String getAggregationField() {
        return aggregationField;
    }

    /**
     * <p>
     * The aggregation field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param aggregationField <p>
     *            The aggregation field.
     *            </p>
     */
    public void setAggregationField(String aggregationField) {
        this.aggregationField = aggregationField;
    }

    /**
     * <p>
     * The aggregation field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param aggregationField <p>
     *            The aggregation field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketsAggregationRequest withAggregationField(String aggregationField) {
        this.aggregationField = aggregationField;
        return this;
    }

    /**
     * <p>
     * The version of the query.
     * </p>
     *
     * @return <p>
     *         The version of the query.
     *         </p>
     */
    public String getQueryVersion() {
        return queryVersion;
    }

    /**
     * <p>
     * The version of the query.
     * </p>
     *
     * @param queryVersion <p>
     *            The version of the query.
     *            </p>
     */
    public void setQueryVersion(String queryVersion) {
        this.queryVersion = queryVersion;
    }

    /**
     * <p>
     * The version of the query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryVersion <p>
     *            The version of the query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketsAggregationRequest withQueryVersion(String queryVersion) {
        this.queryVersion = queryVersion;
        return this;
    }

    /**
     * <p>
     * The basic control of the response shape and the bucket aggregation type
     * to perform.
     * </p>
     *
     * @return <p>
     *         The basic control of the response shape and the bucket
     *         aggregation type to perform.
     *         </p>
     */
    public BucketsAggregationType getBucketsAggregationType() {
        return bucketsAggregationType;
    }

    /**
     * <p>
     * The basic control of the response shape and the bucket aggregation type
     * to perform.
     * </p>
     *
     * @param bucketsAggregationType <p>
     *            The basic control of the response shape and the bucket
     *            aggregation type to perform.
     *            </p>
     */
    public void setBucketsAggregationType(BucketsAggregationType bucketsAggregationType) {
        this.bucketsAggregationType = bucketsAggregationType;
    }

    /**
     * <p>
     * The basic control of the response shape and the bucket aggregation type
     * to perform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketsAggregationType <p>
     *            The basic control of the response shape and the bucket
     *            aggregation type to perform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketsAggregationRequest withBucketsAggregationType(
            BucketsAggregationType bucketsAggregationType) {
        this.bucketsAggregationType = bucketsAggregationType;
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
        if (getIndexName() != null)
            sb.append("indexName: " + getIndexName() + ",");
        if (getQueryString() != null)
            sb.append("queryString: " + getQueryString() + ",");
        if (getAggregationField() != null)
            sb.append("aggregationField: " + getAggregationField() + ",");
        if (getQueryVersion() != null)
            sb.append("queryVersion: " + getQueryVersion() + ",");
        if (getBucketsAggregationType() != null)
            sb.append("bucketsAggregationType: " + getBucketsAggregationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode
                + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode
                + ((getAggregationField() == null) ? 0 : getAggregationField().hashCode());
        hashCode = prime * hashCode
                + ((getQueryVersion() == null) ? 0 : getQueryVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getBucketsAggregationType() == null) ? 0 : getBucketsAggregationType()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketsAggregationRequest == false)
            return false;
        GetBucketsAggregationRequest other = (GetBucketsAggregationRequest) obj;

        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null
                && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getAggregationField() == null ^ this.getAggregationField() == null)
            return false;
        if (other.getAggregationField() != null
                && other.getAggregationField().equals(this.getAggregationField()) == false)
            return false;
        if (other.getQueryVersion() == null ^ this.getQueryVersion() == null)
            return false;
        if (other.getQueryVersion() != null
                && other.getQueryVersion().equals(this.getQueryVersion()) == false)
            return false;
        if (other.getBucketsAggregationType() == null ^ this.getBucketsAggregationType() == null)
            return false;
        if (other.getBucketsAggregationType() != null
                && other.getBucketsAggregationType().equals(this.getBucketsAggregationType()) == false)
            return false;
        return true;
    }
}
