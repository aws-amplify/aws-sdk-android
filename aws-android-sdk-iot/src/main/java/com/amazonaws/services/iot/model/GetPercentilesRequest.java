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
 * Groups the aggregated values that match the query into percentile groupings.
 * The default percentile groupings are: 1,5,25,50,75,95,99, although you can
 * specify your own when you call <code>GetPercentiles</code>. This function
 * returns a value for each percentile group specified (or the default
 * percentile groupings). The percentile group "1" contains the aggregated field
 * value that occurs in approximately one percent of the values that match the
 * query. The percentile group "5" contains the aggregated field value that
 * occurs in approximately five percent of the values that match the query, and
 * so on. The result is an approximation, the more values that match the query,
 * the more accurate the percentile values.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >GetPercentiles</a> action.
 * </p>
 */
public class GetPercentilesRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The field to aggregate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String aggregationField;

    /**
     * <p>
     * The query version.
     * </p>
     */
    private String queryVersion;

    /**
     * <p>
     * The percentile groups returned.
     * </p>
     */
    private java.util.List<Double> percents;

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
    public GetPercentilesRequest withIndexName(String indexName) {
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
    public GetPercentilesRequest withQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * <p>
     * The field to aggregate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The field to aggregate.
     *         </p>
     */
    public String getAggregationField() {
        return aggregationField;
    }

    /**
     * <p>
     * The field to aggregate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param aggregationField <p>
     *            The field to aggregate.
     *            </p>
     */
    public void setAggregationField(String aggregationField) {
        this.aggregationField = aggregationField;
    }

    /**
     * <p>
     * The field to aggregate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param aggregationField <p>
     *            The field to aggregate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPercentilesRequest withAggregationField(String aggregationField) {
        this.aggregationField = aggregationField;
        return this;
    }

    /**
     * <p>
     * The query version.
     * </p>
     *
     * @return <p>
     *         The query version.
     *         </p>
     */
    public String getQueryVersion() {
        return queryVersion;
    }

    /**
     * <p>
     * The query version.
     * </p>
     *
     * @param queryVersion <p>
     *            The query version.
     *            </p>
     */
    public void setQueryVersion(String queryVersion) {
        this.queryVersion = queryVersion;
    }

    /**
     * <p>
     * The query version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryVersion <p>
     *            The query version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPercentilesRequest withQueryVersion(String queryVersion) {
        this.queryVersion = queryVersion;
        return this;
    }

    /**
     * <p>
     * The percentile groups returned.
     * </p>
     *
     * @return <p>
     *         The percentile groups returned.
     *         </p>
     */
    public java.util.List<Double> getPercents() {
        return percents;
    }

    /**
     * <p>
     * The percentile groups returned.
     * </p>
     *
     * @param percents <p>
     *            The percentile groups returned.
     *            </p>
     */
    public void setPercents(java.util.Collection<Double> percents) {
        if (percents == null) {
            this.percents = null;
            return;
        }

        this.percents = new java.util.ArrayList<Double>(percents);
    }

    /**
     * <p>
     * The percentile groups returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param percents <p>
     *            The percentile groups returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPercentilesRequest withPercents(Double... percents) {
        if (getPercents() == null) {
            this.percents = new java.util.ArrayList<Double>(percents.length);
        }
        for (Double value : percents) {
            this.percents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The percentile groups returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param percents <p>
     *            The percentile groups returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPercentilesRequest withPercents(java.util.Collection<Double> percents) {
        setPercents(percents);
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
        if (getPercents() != null)
            sb.append("percents: " + getPercents());
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
        hashCode = prime * hashCode + ((getPercents() == null) ? 0 : getPercents().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPercentilesRequest == false)
            return false;
        GetPercentilesRequest other = (GetPercentilesRequest) obj;

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
        if (other.getPercents() == null ^ this.getPercents() == null)
            return false;
        if (other.getPercents() != null && other.getPercents().equals(this.getPercents()) == false)
            return false;
        return true;
    }
}
