/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of valid metrics stored for the AWS account owner. Returned
 * metrics can be used with <a>GetMetricStatistics</a> to obtain statistical
 * data for a given metric.
 * </p>
 * <note> Up to 500 results are returned for any one call. To retrieve further
 * results, use returned <code>NextToken</code> values with subsequent
 * <code>ListMetrics</code> operations. </note> <note> If you create a metric
 * with the <a>PutMetricData</a> action, allow up to fifteen minutes for the
 * metric to appear in calls to the <code>ListMetrics</code> action. Statistics
 * about the metric, however, are available sooner using
 * <a>GetMetricStatistics</a>. </note>
 */
public class ListMetricsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The namespace to filter against.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     */
    private String namespace;

    /**
     * <p>
     * The name of the metric to filter against.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String metricName;

    /**
     * <p>
     * A list of dimensions to filter against.
     * </p>
     */
    private java.util.List<DimensionFilter> dimensions = new java.util.ArrayList<DimensionFilter>();

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data
     * available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The namespace to filter against.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @return <p>
     *         The namespace to filter against.
     *         </p>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p>
     * The namespace to filter against.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace <p>
     *            The namespace to filter against.
     *            </p>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace to filter against.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace <p>
     *            The namespace to filter against.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMetricsRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * <p>
     * The name of the metric to filter against.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the metric to filter against.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The name of the metric to filter against.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName <p>
     *            The name of the metric to filter against.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric to filter against.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName <p>
     *            The name of the metric to filter against.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMetricsRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * A list of dimensions to filter against.
     * </p>
     *
     * @return <p>
     *         A list of dimensions to filter against.
     *         </p>
     */
    public java.util.List<DimensionFilter> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * A list of dimensions to filter against.
     * </p>
     *
     * @param dimensions <p>
     *            A list of dimensions to filter against.
     *            </p>
     */
    public void setDimensions(java.util.Collection<DimensionFilter> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<DimensionFilter>(dimensions);
    }

    /**
     * <p>
     * A list of dimensions to filter against.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            A list of dimensions to filter against.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMetricsRequest withDimensions(DimensionFilter... dimensions) {
        if (getDimensions() == null) {
            this.dimensions = new java.util.ArrayList<DimensionFilter>(dimensions.length);
        }
        for (DimensionFilter value : dimensions) {
            this.dimensions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of dimensions to filter against.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            A list of dimensions to filter against.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMetricsRequest withDimensions(java.util.Collection<DimensionFilter> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data
     * available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         The token returned by a previous call to indicate that there is
     *         more data available.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data
     * available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param nextToken <p>
     *            The token returned by a previous call to indicate that there
     *            is more data available.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data
     * available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param nextToken <p>
     *            The token returned by a previous call to indicate that there
     *            is more data available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMetricsRequest withNextToken(String nextToken) {
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
        if (getNamespace() != null)
            sb.append("Namespace: " + getNamespace() + ",");
        if (getMetricName() != null)
            sb.append("MetricName: " + getMetricName() + ",");
        if (getDimensions() != null)
            sb.append("Dimensions: " + getDimensions() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMetricsRequest == false)
            return false;
        ListMetricsRequest other = (ListMetricsRequest) obj;

        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null
                && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null
                && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
