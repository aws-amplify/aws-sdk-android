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

public class DescribeFleetMetricResult implements Serializable {
    /**
     * <p>
     * The name of the fleet metric to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-\.]+<br/>
     */
    private String metricName;

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
     * The type of the aggregation query.
     * </p>
     */
    private AggregationType aggregationType;

    /**
     * <p>
     * The time in seconds between fleet metric emissions. Range [60(1 min),
     * 86400(1 day)] and must be multiple of 60.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     */
    private Integer period;

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
     * The fleet metric description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     */
    private String description;

    /**
     * <p>
     * The query version.
     * </p>
     */
    private String queryVersion;

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
     * The date when the fleet metric is created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date when the fleet metric is last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * Used to support unit transformation such as milliseconds to seconds. The
     * unit must be supported by <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     * >CW metric</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     */
    private String unit;

    /**
     * <p>
     * The version of the fleet metric.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * The ARN of the fleet metric to describe.
     * </p>
     */
    private String metricArn;

    /**
     * <p>
     * The name of the fleet metric to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-\.]+<br/>
     *
     * @return <p>
     *         The name of the fleet metric to describe.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The name of the fleet metric to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-\.]+<br/>
     *
     * @param metricName <p>
     *            The name of the fleet metric to describe.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the fleet metric to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-\.]+<br/>
     *
     * @param metricName <p>
     *            The name of the fleet metric to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetMetricResult withMetricName(String metricName) {
        this.metricName = metricName;
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
    public DescribeFleetMetricResult withQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * <p>
     * The type of the aggregation query.
     * </p>
     *
     * @return <p>
     *         The type of the aggregation query.
     *         </p>
     */
    public AggregationType getAggregationType() {
        return aggregationType;
    }

    /**
     * <p>
     * The type of the aggregation query.
     * </p>
     *
     * @param aggregationType <p>
     *            The type of the aggregation query.
     *            </p>
     */
    public void setAggregationType(AggregationType aggregationType) {
        this.aggregationType = aggregationType;
    }

    /**
     * <p>
     * The type of the aggregation query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aggregationType <p>
     *            The type of the aggregation query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetMetricResult withAggregationType(AggregationType aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * <p>
     * The time in seconds between fleet metric emissions. Range [60(1 min),
     * 86400(1 day)] and must be multiple of 60.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     *
     * @return <p>
     *         The time in seconds between fleet metric emissions. Range [60(1
     *         min), 86400(1 day)] and must be multiple of 60.
     *         </p>
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * <p>
     * The time in seconds between fleet metric emissions. Range [60(1 min),
     * 86400(1 day)] and must be multiple of 60.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     *
     * @param period <p>
     *            The time in seconds between fleet metric emissions. Range
     *            [60(1 min), 86400(1 day)] and must be multiple of 60.
     *            </p>
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The time in seconds between fleet metric emissions. Range [60(1 min),
     * 86400(1 day)] and must be multiple of 60.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     *
     * @param period <p>
     *            The time in seconds between fleet metric emissions. Range
     *            [60(1 min), 86400(1 day)] and must be multiple of 60.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetMetricResult withPeriod(Integer period) {
        this.period = period;
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
    public DescribeFleetMetricResult withAggregationField(String aggregationField) {
        this.aggregationField = aggregationField;
        return this;
    }

    /**
     * <p>
     * The fleet metric description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @return <p>
     *         The fleet metric description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The fleet metric description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param description <p>
     *            The fleet metric description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The fleet metric description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param description <p>
     *            The fleet metric description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetMetricResult withDescription(String description) {
        this.description = description;
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
    public DescribeFleetMetricResult withQueryVersion(String queryVersion) {
        this.queryVersion = queryVersion;
        return this;
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
    public DescribeFleetMetricResult withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * <p>
     * The date when the fleet metric is created.
     * </p>
     *
     * @return <p>
     *         The date when the fleet metric is created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date when the fleet metric is created.
     * </p>
     *
     * @param creationDate <p>
     *            The date when the fleet metric is created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when the fleet metric is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date when the fleet metric is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetMetricResult withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date when the fleet metric is last modified.
     * </p>
     *
     * @return <p>
     *         The date when the fleet metric is last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date when the fleet metric is last modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date when the fleet metric is last modified.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date when the fleet metric is last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date when the fleet metric is last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetMetricResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * Used to support unit transformation such as milliseconds to seconds. The
     * unit must be supported by <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     * >CW metric</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @return <p>
     *         Used to support unit transformation such as milliseconds to
     *         seconds. The unit must be supported by <a href=
     *         "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     *         >CW metric</a>.
     *         </p>
     * @see FleetMetricUnit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * Used to support unit transformation such as milliseconds to seconds. The
     * unit must be supported by <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     * >CW metric</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @param unit <p>
     *            Used to support unit transformation such as milliseconds to
     *            seconds. The unit must be supported by <a href=
     *            "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     *            >CW metric</a>.
     *            </p>
     * @see FleetMetricUnit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * Used to support unit transformation such as milliseconds to seconds. The
     * unit must be supported by <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     * >CW metric</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @param unit <p>
     *            Used to support unit transformation such as milliseconds to
     *            seconds. The unit must be supported by <a href=
     *            "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     *            >CW metric</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetMetricUnit
     */
    public DescribeFleetMetricResult withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * Used to support unit transformation such as milliseconds to seconds. The
     * unit must be supported by <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     * >CW metric</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @param unit <p>
     *            Used to support unit transformation such as milliseconds to
     *            seconds. The unit must be supported by <a href=
     *            "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     *            >CW metric</a>.
     *            </p>
     * @see FleetMetricUnit
     */
    public void setUnit(FleetMetricUnit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * Used to support unit transformation such as milliseconds to seconds. The
     * unit must be supported by <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     * >CW metric</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @param unit <p>
     *            Used to support unit transformation such as milliseconds to
     *            seconds. The unit must be supported by <a href=
     *            "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html"
     *            >CW metric</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetMetricUnit
     */
    public DescribeFleetMetricResult withUnit(FleetMetricUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * The version of the fleet metric.
     * </p>
     *
     * @return <p>
     *         The version of the fleet metric.
     *         </p>
     */
    public Long getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the fleet metric.
     * </p>
     *
     * @param version <p>
     *            The version of the fleet metric.
     *            </p>
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the fleet metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version of the fleet metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetMetricResult withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The ARN of the fleet metric to describe.
     * </p>
     *
     * @return <p>
     *         The ARN of the fleet metric to describe.
     *         </p>
     */
    public String getMetricArn() {
        return metricArn;
    }

    /**
     * <p>
     * The ARN of the fleet metric to describe.
     * </p>
     *
     * @param metricArn <p>
     *            The ARN of the fleet metric to describe.
     *            </p>
     */
    public void setMetricArn(String metricArn) {
        this.metricArn = metricArn;
    }

    /**
     * <p>
     * The ARN of the fleet metric to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricArn <p>
     *            The ARN of the fleet metric to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetMetricResult withMetricArn(String metricArn) {
        this.metricArn = metricArn;
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
        if (getMetricName() != null)
            sb.append("metricName: " + getMetricName() + ",");
        if (getQueryString() != null)
            sb.append("queryString: " + getQueryString() + ",");
        if (getAggregationType() != null)
            sb.append("aggregationType: " + getAggregationType() + ",");
        if (getPeriod() != null)
            sb.append("period: " + getPeriod() + ",");
        if (getAggregationField() != null)
            sb.append("aggregationField: " + getAggregationField() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getQueryVersion() != null)
            sb.append("queryVersion: " + getQueryVersion() + ",");
        if (getIndexName() != null)
            sb.append("indexName: " + getIndexName() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null)
            sb.append("lastModifiedDate: " + getLastModifiedDate() + ",");
        if (getUnit() != null)
            sb.append("unit: " + getUnit() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getMetricArn() != null)
            sb.append("metricArn: " + getMetricArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode
                + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode
                + ((getAggregationType() == null) ? 0 : getAggregationType().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode
                + ((getAggregationField() == null) ? 0 : getAggregationField().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getQueryVersion() == null) ? 0 : getQueryVersion().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getMetricArn() == null) ? 0 : getMetricArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFleetMetricResult == false)
            return false;
        DescribeFleetMetricResult other = (DescribeFleetMetricResult) obj;

        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null
                && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getAggregationType() == null ^ this.getAggregationType() == null)
            return false;
        if (other.getAggregationType() != null
                && other.getAggregationType().equals(this.getAggregationType()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getAggregationField() == null ^ this.getAggregationField() == null)
            return false;
        if (other.getAggregationField() != null
                && other.getAggregationField().equals(this.getAggregationField()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getQueryVersion() == null ^ this.getQueryVersion() == null)
            return false;
        if (other.getQueryVersion() != null
                && other.getQueryVersion().equals(this.getQueryVersion()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getMetricArn() == null ^ this.getMetricArn() == null)
            return false;
        if (other.getMetricArn() != null
                && other.getMetricArn().equals(this.getMetricArn()) == false)
            return false;
        return true;
    }
}
