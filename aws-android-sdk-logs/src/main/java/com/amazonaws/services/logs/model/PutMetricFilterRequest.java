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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates or updates a metric filter and associates it with the specified log
 * group. Metric filters allow you to configure rules to extract metric data
 * from log events ingested through <a>PutLogEvents</a>.
 * </p>
 * <p>
 * The maximum number of metric filters that can be associated with a log group
 * is 100.
 * </p>
 */
public class PutMetricFilterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     */
    private String logGroupName;

    /**
     * <p>
     * A name for the metric filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String filterName;

    /**
     * <p>
     * A filter pattern for extracting metric data out of ingested log events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String filterPattern;

    /**
     * <p>
     * A collection of information that defines how metric data gets emitted.
     * </p>
     */
    private java.util.List<MetricTransformation> metricTransformations;

    /**
     * Default constructor for PutMetricFilterRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public PutMetricFilterRequest() {
    }

    /**
     * Constructs a new PutMetricFilterRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param logGroupName <p>
     *            The name of the log group.
     *            </p>
     * @param filterName <p>
     *            A name for the metric filter.
     *            </p>
     * @param filterPattern <p>
     *            A filter pattern for extracting metric data out of ingested
     *            log events.
     *            </p>
     * @param metricTransformations <p>
     *            A collection of information that defines how metric data gets
     *            emitted.
     *            </p>
     */
    public PutMetricFilterRequest(String logGroupName, String filterName, String filterPattern,
            java.util.List<MetricTransformation> metricTransformations) {
        setLogGroupName(logGroupName);
        setFilterName(filterName);
        setFilterPattern(filterPattern);
        setMetricTransformations(metricTransformations);
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return <p>
     *         The name of the log group.
     *         </p>
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            The name of the log group.
     *            </p>
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            The name of the log group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricFilterRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * <p>
     * A name for the metric filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return <p>
     *         A name for the metric filter.
     *         </p>
     */
    public String getFilterName() {
        return filterName;
    }

    /**
     * <p>
     * A name for the metric filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param filterName <p>
     *            A name for the metric filter.
     *            </p>
     */
    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * <p>
     * A name for the metric filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param filterName <p>
     *            A name for the metric filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricFilterRequest withFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }

    /**
     * <p>
     * A filter pattern for extracting metric data out of ingested log events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         A filter pattern for extracting metric data out of ingested log
     *         events.
     *         </p>
     */
    public String getFilterPattern() {
        return filterPattern;
    }

    /**
     * <p>
     * A filter pattern for extracting metric data out of ingested log events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param filterPattern <p>
     *            A filter pattern for extracting metric data out of ingested
     *            log events.
     *            </p>
     */
    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }

    /**
     * <p>
     * A filter pattern for extracting metric data out of ingested log events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param filterPattern <p>
     *            A filter pattern for extracting metric data out of ingested
     *            log events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricFilterRequest withFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }

    /**
     * <p>
     * A collection of information that defines how metric data gets emitted.
     * </p>
     *
     * @return <p>
     *         A collection of information that defines how metric data gets
     *         emitted.
     *         </p>
     */
    public java.util.List<MetricTransformation> getMetricTransformations() {
        return metricTransformations;
    }

    /**
     * <p>
     * A collection of information that defines how metric data gets emitted.
     * </p>
     *
     * @param metricTransformations <p>
     *            A collection of information that defines how metric data gets
     *            emitted.
     *            </p>
     */
    public void setMetricTransformations(
            java.util.Collection<MetricTransformation> metricTransformations) {
        if (metricTransformations == null) {
            this.metricTransformations = null;
            return;
        }

        this.metricTransformations = new java.util.ArrayList<MetricTransformation>(
                metricTransformations);
    }

    /**
     * <p>
     * A collection of information that defines how metric data gets emitted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricTransformations <p>
     *            A collection of information that defines how metric data gets
     *            emitted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricFilterRequest withMetricTransformations(
            MetricTransformation... metricTransformations) {
        if (getMetricTransformations() == null) {
            this.metricTransformations = new java.util.ArrayList<MetricTransformation>(
                    metricTransformations.length);
        }
        for (MetricTransformation value : metricTransformations) {
            this.metricTransformations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A collection of information that defines how metric data gets emitted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricTransformations <p>
     *            A collection of information that defines how metric data gets
     *            emitted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutMetricFilterRequest withMetricTransformations(
            java.util.Collection<MetricTransformation> metricTransformations) {
        setMetricTransformations(metricTransformations);
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
        if (getLogGroupName() != null)
            sb.append("logGroupName: " + getLogGroupName() + ",");
        if (getFilterName() != null)
            sb.append("filterName: " + getFilterName() + ",");
        if (getFilterPattern() != null)
            sb.append("filterPattern: " + getFilterPattern() + ",");
        if (getMetricTransformations() != null)
            sb.append("metricTransformations: " + getMetricTransformations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode());
        hashCode = prime * hashCode
                + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode());
        hashCode = prime
                * hashCode
                + ((getMetricTransformations() == null) ? 0 : getMetricTransformations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMetricFilterRequest == false)
            return false;
        PutMetricFilterRequest other = (PutMetricFilterRequest) obj;

        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getFilterName() == null ^ this.getFilterName() == null)
            return false;
        if (other.getFilterName() != null
                && other.getFilterName().equals(this.getFilterName()) == false)
            return false;
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null)
            return false;
        if (other.getFilterPattern() != null
                && other.getFilterPattern().equals(this.getFilterPattern()) == false)
            return false;
        if (other.getMetricTransformations() == null ^ this.getMetricTransformations() == null)
            return false;
        if (other.getMetricTransformations() != null
                && other.getMetricTransformations().equals(this.getMetricTransformations()) == false)
            return false;
        return true;
    }
}
