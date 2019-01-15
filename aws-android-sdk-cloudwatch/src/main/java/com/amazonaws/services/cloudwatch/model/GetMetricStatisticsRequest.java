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
 * Gets statistics for the specified metric.
 * </p>
 * <p>
 * The maximum number of data points that can be queried is 50,850, whereas the
 * maximum number of data points returned from a single
 * <code>GetMetricStatistics</code> request is 1,440. If you make a request that
 * generates more than 1,440 data points, Amazon CloudWatch returns an error. In
 * such a case, you can alter the request by narrowing the specified time range
 * or increasing the specified period. Alternatively, you can make multiple
 * requests across adjacent time ranges. <code>GetMetricStatistics</code> does
 * not return the data in chronological order.
 * </p>
 * <p>
 * Amazon CloudWatch aggregates data points based on the length of the
 * <code>period</code> that you specify. For example, if you request statistics
 * with a one-minute granularity, Amazon CloudWatch aggregates data points with
 * time stamps that fall within the same one-minute period. In such a case, the
 * data points queried can greatly outnumber the data points returned.
 * </p>
 * <p>
 * The following examples show various statistics allowed by the data point
 * query maximum of 50,850 when you call <code>GetMetricStatistics</code> on
 * Amazon EC2 instances with detailed (one-minute) monitoring enabled:
 * </p>
 * <ul>
 * <li>Statistics for up to 400 instances for a span of one hour</li>
 * <li>Statistics for up to 35 instances over a span of 24 hours</li>
 * <li>Statistics for up to 2 instances over a span of 2 weeks</li>
 * </ul>
 * <p>
 * For information about the namespace, metric names, and dimensions that other
 * Amazon Web Services products use to send metrics to CloudWatch, go to <a
 * href=
 * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
 * >Amazon CloudWatch Metrics, Namespaces, and Dimensions Reference</a> in the
 * <i>Amazon CloudWatch Developer Guide</i>.
 * </p>
 */
public class GetMetricStatisticsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The namespace of the metric, with or without spaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     */
    private String namespace;

    /**
     * <p>
     * The name of the metric, with or without spaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String metricName;

    /**
     * <p>
     * A list of dimensions describing qualities of the metric.
     * </p>
     */
    private java.util.List<Dimension> dimensions = new java.util.ArrayList<Dimension>();

    /**
     * <p>
     * The time stamp to use for determining the first datapoint to return. The
     * value specified is inclusive; results include datapoints with the time
     * stamp specified. The time stamp must be in ISO 8601 UTC format (e.g.,
     * 2014-09-03T23:00:00Z).
     * </p>
     * <note> The specified start time is rounded down to the nearest value.
     * Datapoints are returned for start times up to two weeks in the past.
     * Specified start times that are more than two weeks in the past will not
     * return datapoints for metrics that are older than two weeks.
     * <p>
     * Data that is timestamped 24 hours or more in the past may take in excess
     * of 48 hours to become available from submission time using
     * <code>GetMetricStatistics</code>.
     * </p>
     * </note>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The time stamp to use for determining the last datapoint to return. The
     * value specified is exclusive; results will include datapoints up to the
     * time stamp specified. The time stamp must be in ISO 8601 UTC format
     * (e.g., 2014-09-03T23:00:00Z).
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The granularity, in seconds, of the returned datapoints.
     * <code>Period</code> must be at least 60 seconds and must be a multiple of
     * 60. The default value is 60.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     */
    private Integer period;

    /**
     * <p>
     * The metric statistics to return. For information about specific
     * statistics returned by GetMetricStatistics, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic"
     * >Statistics</a> in the <i>Amazon CloudWatch Developer Guide</i>.
     * </p>
     */
    private java.util.List<String> statistics = new java.util.ArrayList<String>();

    /**
     * <p>
     * The unit for the metric.
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
     * The namespace of the metric, with or without spaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @return <p>
     *         The namespace of the metric, with or without spaces.
     *         </p>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p>
     * The namespace of the metric, with or without spaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^:].*<br/>
     *
     * @param namespace <p>
     *            The namespace of the metric, with or without spaces.
     *            </p>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the metric, with or without spaces.
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
     *            The namespace of the metric, with or without spaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricStatisticsRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * <p>
     * The name of the metric, with or without spaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the metric, with or without spaces.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The name of the metric, with or without spaces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName <p>
     *            The name of the metric, with or without spaces.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric, with or without spaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param metricName <p>
     *            The name of the metric, with or without spaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricStatisticsRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * A list of dimensions describing qualities of the metric.
     * </p>
     *
     * @return <p>
     *         A list of dimensions describing qualities of the metric.
     *         </p>
     */
    public java.util.List<Dimension> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * A list of dimensions describing qualities of the metric.
     * </p>
     *
     * @param dimensions <p>
     *            A list of dimensions describing qualities of the metric.
     *            </p>
     */
    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<Dimension>(dimensions);
    }

    /**
     * <p>
     * A list of dimensions describing qualities of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            A list of dimensions describing qualities of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricStatisticsRequest withDimensions(Dimension... dimensions) {
        if (getDimensions() == null) {
            this.dimensions = new java.util.ArrayList<Dimension>(dimensions.length);
        }
        for (Dimension value : dimensions) {
            this.dimensions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of dimensions describing qualities of the metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            A list of dimensions describing qualities of the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricStatisticsRequest withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The time stamp to use for determining the first datapoint to return. The
     * value specified is inclusive; results include datapoints with the time
     * stamp specified. The time stamp must be in ISO 8601 UTC format (e.g.,
     * 2014-09-03T23:00:00Z).
     * </p>
     * <note> The specified start time is rounded down to the nearest value.
     * Datapoints are returned for start times up to two weeks in the past.
     * Specified start times that are more than two weeks in the past will not
     * return datapoints for metrics that are older than two weeks.
     * <p>
     * Data that is timestamped 24 hours or more in the past may take in excess
     * of 48 hours to become available from submission time using
     * <code>GetMetricStatistics</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         The time stamp to use for determining the first datapoint to
     *         return. The value specified is inclusive; results include
     *         datapoints with the time stamp specified. The time stamp must be
     *         in ISO 8601 UTC format (e.g., 2014-09-03T23:00:00Z).
     *         </p>
     *         <note> The specified start time is rounded down to the nearest
     *         value. Datapoints are returned for start times up to two weeks in
     *         the past. Specified start times that are more than two weeks in
     *         the past will not return datapoints for metrics that are older
     *         than two weeks.
     *         <p>
     *         Data that is timestamped 24 hours or more in the past may take in
     *         excess of 48 hours to become available from submission time using
     *         <code>GetMetricStatistics</code>.
     *         </p>
     *         </note>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The time stamp to use for determining the first datapoint to return. The
     * value specified is inclusive; results include datapoints with the time
     * stamp specified. The time stamp must be in ISO 8601 UTC format (e.g.,
     * 2014-09-03T23:00:00Z).
     * </p>
     * <note> The specified start time is rounded down to the nearest value.
     * Datapoints are returned for start times up to two weeks in the past.
     * Specified start times that are more than two weeks in the past will not
     * return datapoints for metrics that are older than two weeks.
     * <p>
     * Data that is timestamped 24 hours or more in the past may take in excess
     * of 48 hours to become available from submission time using
     * <code>GetMetricStatistics</code>.
     * </p>
     * </note>
     *
     * @param startTime <p>
     *            The time stamp to use for determining the first datapoint to
     *            return. The value specified is inclusive; results include
     *            datapoints with the time stamp specified. The time stamp must
     *            be in ISO 8601 UTC format (e.g., 2014-09-03T23:00:00Z).
     *            </p>
     *            <note> The specified start time is rounded down to the nearest
     *            value. Datapoints are returned for start times up to two weeks
     *            in the past. Specified start times that are more than two
     *            weeks in the past will not return datapoints for metrics that
     *            are older than two weeks.
     *            <p>
     *            Data that is timestamped 24 hours or more in the past may take
     *            in excess of 48 hours to become available from submission time
     *            using <code>GetMetricStatistics</code>.
     *            </p>
     *            </note>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time stamp to use for determining the first datapoint to return. The
     * value specified is inclusive; results include datapoints with the time
     * stamp specified. The time stamp must be in ISO 8601 UTC format (e.g.,
     * 2014-09-03T23:00:00Z).
     * </p>
     * <note> The specified start time is rounded down to the nearest value.
     * Datapoints are returned for start times up to two weeks in the past.
     * Specified start times that are more than two weeks in the past will not
     * return datapoints for metrics that are older than two weeks.
     * <p>
     * Data that is timestamped 24 hours or more in the past may take in excess
     * of 48 hours to become available from submission time using
     * <code>GetMetricStatistics</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The time stamp to use for determining the first datapoint to
     *            return. The value specified is inclusive; results include
     *            datapoints with the time stamp specified. The time stamp must
     *            be in ISO 8601 UTC format (e.g., 2014-09-03T23:00:00Z).
     *            </p>
     *            <note> The specified start time is rounded down to the nearest
     *            value. Datapoints are returned for start times up to two weeks
     *            in the past. Specified start times that are more than two
     *            weeks in the past will not return datapoints for metrics that
     *            are older than two weeks.
     *            <p>
     *            Data that is timestamped 24 hours or more in the past may take
     *            in excess of 48 hours to become available from submission time
     *            using <code>GetMetricStatistics</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricStatisticsRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The time stamp to use for determining the last datapoint to return. The
     * value specified is exclusive; results will include datapoints up to the
     * time stamp specified. The time stamp must be in ISO 8601 UTC format
     * (e.g., 2014-09-03T23:00:00Z).
     * </p>
     *
     * @return <p>
     *         The time stamp to use for determining the last datapoint to
     *         return. The value specified is exclusive; results will include
     *         datapoints up to the time stamp specified. The time stamp must be
     *         in ISO 8601 UTC format (e.g., 2014-09-03T23:00:00Z).
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The time stamp to use for determining the last datapoint to return. The
     * value specified is exclusive; results will include datapoints up to the
     * time stamp specified. The time stamp must be in ISO 8601 UTC format
     * (e.g., 2014-09-03T23:00:00Z).
     * </p>
     *
     * @param endTime <p>
     *            The time stamp to use for determining the last datapoint to
     *            return. The value specified is exclusive; results will include
     *            datapoints up to the time stamp specified. The time stamp must
     *            be in ISO 8601 UTC format (e.g., 2014-09-03T23:00:00Z).
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time stamp to use for determining the last datapoint to return. The
     * value specified is exclusive; results will include datapoints up to the
     * time stamp specified. The time stamp must be in ISO 8601 UTC format
     * (e.g., 2014-09-03T23:00:00Z).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The time stamp to use for determining the last datapoint to
     *            return. The value specified is exclusive; results will include
     *            datapoints up to the time stamp specified. The time stamp must
     *            be in ISO 8601 UTC format (e.g., 2014-09-03T23:00:00Z).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricStatisticsRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned datapoints.
     * <code>Period</code> must be at least 60 seconds and must be a multiple of
     * 60. The default value is 60.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @return <p>
     *         The granularity, in seconds, of the returned datapoints.
     *         <code>Period</code> must be at least 60 seconds and must be a
     *         multiple of 60. The default value is 60.
     *         </p>
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned datapoints.
     * <code>Period</code> must be at least 60 seconds and must be a multiple of
     * 60. The default value is 60.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @param period <p>
     *            The granularity, in seconds, of the returned datapoints.
     *            <code>Period</code> must be at least 60 seconds and must be a
     *            multiple of 60. The default value is 60.
     *            </p>
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned datapoints.
     * <code>Period</code> must be at least 60 seconds and must be a multiple of
     * 60. The default value is 60.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - <br/>
     *
     * @param period <p>
     *            The granularity, in seconds, of the returned datapoints.
     *            <code>Period</code> must be at least 60 seconds and must be a
     *            multiple of 60. The default value is 60.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricStatisticsRequest withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * <p>
     * The metric statistics to return. For information about specific
     * statistics returned by GetMetricStatistics, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic"
     * >Statistics</a> in the <i>Amazon CloudWatch Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The metric statistics to return. For information about specific
     *         statistics returned by GetMetricStatistics, see <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic"
     *         >Statistics</a> in the <i>Amazon CloudWatch Developer Guide</i>.
     *         </p>
     */
    public java.util.List<String> getStatistics() {
        return statistics;
    }

    /**
     * <p>
     * The metric statistics to return. For information about specific
     * statistics returned by GetMetricStatistics, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic"
     * >Statistics</a> in the <i>Amazon CloudWatch Developer Guide</i>.
     * </p>
     *
     * @param statistics <p>
     *            The metric statistics to return. For information about
     *            specific statistics returned by GetMetricStatistics, see <a
     *            href=
     *            "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic"
     *            >Statistics</a> in the <i>Amazon CloudWatch Developer
     *            Guide</i>.
     *            </p>
     */
    public void setStatistics(java.util.Collection<String> statistics) {
        if (statistics == null) {
            this.statistics = null;
            return;
        }

        this.statistics = new java.util.ArrayList<String>(statistics);
    }

    /**
     * <p>
     * The metric statistics to return. For information about specific
     * statistics returned by GetMetricStatistics, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic"
     * >Statistics</a> in the <i>Amazon CloudWatch Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statistics <p>
     *            The metric statistics to return. For information about
     *            specific statistics returned by GetMetricStatistics, see <a
     *            href=
     *            "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic"
     *            >Statistics</a> in the <i>Amazon CloudWatch Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricStatisticsRequest withStatistics(String... statistics) {
        if (getStatistics() == null) {
            this.statistics = new java.util.ArrayList<String>(statistics.length);
        }
        for (String value : statistics) {
            this.statistics.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The metric statistics to return. For information about specific
     * statistics returned by GetMetricStatistics, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic"
     * >Statistics</a> in the <i>Amazon CloudWatch Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statistics <p>
     *            The metric statistics to return. For information about
     *            specific statistics returned by GetMetricStatistics, see <a
     *            href=
     *            "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Statistic"
     *            >Statistics</a> in the <i>Amazon CloudWatch Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricStatisticsRequest withStatistics(java.util.Collection<String> statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * The unit for the metric.
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
     *         The unit for the metric.
     *         </p>
     * @see StandardUnit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The unit for the metric.
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
     *            The unit for the metric.
     *            </p>
     * @see StandardUnit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit for the metric.
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
     *            The unit for the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StandardUnit
     */
    public GetMetricStatisticsRequest withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * The unit for the metric.
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
     *            The unit for the metric.
     *            </p>
     * @see StandardUnit
     */
    public void setUnit(StandardUnit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * The unit for the metric.
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
     *            The unit for the metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StandardUnit
     */
    public GetMetricStatisticsRequest withUnit(StandardUnit unit) {
        this.unit = unit.toString();
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
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getPeriod() != null)
            sb.append("Period: " + getPeriod() + ",");
        if (getStatistics() != null)
            sb.append("Statistics: " + getStatistics() + ",");
        if (getUnit() != null)
            sb.append("Unit: " + getUnit());
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
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMetricStatisticsRequest == false)
            return false;
        GetMetricStatisticsRequest other = (GetMetricStatisticsRequest) obj;

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
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null
                && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }
}
