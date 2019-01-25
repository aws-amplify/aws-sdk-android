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
 * Publishes metric data points to Amazon CloudWatch. Amazon CloudWatch
 * associates the data points with the specified metric. If the specified metric
 * does not exist, Amazon CloudWatch creates the metric. When Amazon CloudWatch
 * creates a metric, it can take up to fifteen minutes for the metric to appear
 * in calls to the <a>ListMetrics</a> action.
 * </p>
 * <p>
 * Each <code>PutMetricData</code> request is limited to 8 KB in size for HTTP
 * GET requests and is limited to 40 KB in size for HTTP POST requests.
 * </p>
 * <important>Although the <code>Value</code> parameter accepts numbers of type
 * <code>Double</code>, Amazon CloudWatch rejects values that are either too
 * small or too large. Values must be in the range of 8.515920e-109 to
 * 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2). In addition, special
 * values (e.g., NaN, +Infinity, -Infinity) are not supported. </important>
 * <p>
 * Data that is timestamped 24 hours or more in the past may take in excess of
 * 48 hours to become available from submission time using
 * <code>GetMetricStatistics</code>.
 * </p>
 */
public class PutMetricDataRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The namespace for the metric data.
     * </p>
     * <note> You cannot specify a namespace that begins with "AWS/". Namespaces
     * that begin with "AWS/" are reserved for other Amazon Web Services
     * products that send metrics to Amazon CloudWatch. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     */
    private String namespace;

    /**
     * <p>
     * A list of data describing the metric.
     * </p>
     */
    private java.util.List<MetricDatum> metricData = new java.util.ArrayList<MetricDatum>();

    /**
     * <p>
     * The namespace for the metric data.
     * </p>
     * <note> You cannot specify a namespace that begins with "AWS/". Namespaces
     * that begin with "AWS/" are reserved for other Amazon Web Services
     * products that send metrics to Amazon CloudWatch. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @return <p>
     *         The namespace for the metric data.
     *         </p>
     *         <note> You cannot specify a namespace that begins with "AWS/".
     *         Namespaces that begin with "AWS/" are reserved for other Amazon
     *         Web Services products that send metrics to Amazon CloudWatch.
     *         </note>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p>
     * The namespace for the metric data.
     * </p>
     * <note> You cannot specify a namespace that begins with "AWS/". Namespaces
     * that begin with "AWS/" are reserved for other Amazon Web Services
     * products that send metrics to Amazon CloudWatch. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace <p>
     *            The namespace for the metric data.
     *            </p>
     *            <note> You cannot specify a namespace that begins with "AWS/".
     *            Namespaces that begin with "AWS/" are reserved for other
     *            Amazon Web Services products that send metrics to Amazon
     *            CloudWatch. </note>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace for the metric data.
     * </p>
     * <note> You cannot specify a namespace that begins with "AWS/". Namespaces
     * that begin with "AWS/" are reserved for other Amazon Web Services
     * products that send metrics to Amazon CloudWatch. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace <p>
     *            The namespace for the metric data.
     *            </p>
     *            <note> You cannot specify a namespace that begins with "AWS/".
     *            Namespaces that begin with "AWS/" are reserved for other
     *            Amazon Web Services products that send metrics to Amazon
     *            CloudWatch. </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricDataRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * <p>
     * A list of data describing the metric.
     * </p>
     *
     * @return <p>
     *         A list of data describing the metric.
     *         </p>
     */
    public java.util.List<MetricDatum> getMetricData() {
        return metricData;
    }

    /**
     * <p>
     * A list of data describing the metric.
     * </p>
     *
     * @param metricData <p>
     *            A list of data describing the metric.
     *            </p>
     */
    public void setMetricData(java.util.Collection<MetricDatum> metricData) {
        if (metricData == null) {
            this.metricData = null;
            return;
        }

        this.metricData = new java.util.ArrayList<MetricDatum>(metricData);
    }

    /**
     * <p>
     * A list of data describing the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricData <p>
     *            A list of data describing the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricDataRequest withMetricData(MetricDatum... metricData) {
        if (getMetricData() == null) {
            this.metricData = new java.util.ArrayList<MetricDatum>(metricData.length);
        }
        for (MetricDatum value : metricData) {
            this.metricData.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of data describing the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricData <p>
     *            A list of data describing the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricDataRequest withMetricData(java.util.Collection<MetricDatum> metricData) {
        setMetricData(metricData);
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
        if (getMetricData() != null)
            sb.append("MetricData: " + getMetricData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getMetricData() == null) ? 0 : getMetricData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMetricDataRequest == false)
            return false;
        PutMetricDataRequest other = (PutMetricDataRequest) obj;

        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null
                && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getMetricData() == null ^ this.getMetricData() == null)
            return false;
        if (other.getMetricData() != null
                && other.getMetricData().equals(this.getMetricData()) == false)
            return false;
        return true;
    }
}
