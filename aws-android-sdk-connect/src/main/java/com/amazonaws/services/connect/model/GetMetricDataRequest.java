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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The <code>GetMetricData</code> operation retrieves historical metrics data
 * from your Amazon Connect instance.
 * </p>
 * <p>
 * If you are using an IAM account, it must have permission to the
 * <code>connect:GetMetricData</code> action.
 * </p>
 */
public class GetMetricDataRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format, at which to start the reporting
     * interval for the retrieval of historical metrics data. The time must be
     * specified using a multiple of 5 minutes, such as 10:05, 10:10, 10:15.
     * </p>
     * <p>
     * <code>StartTime</code> cannot be earlier than 24 hours before the time of
     * the request. Historical metrics are available in Amazon Connect only for
     * 24 hours.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format, at which to end the reporting
     * interval for the retrieval of historical metrics data. The time must be
     * specified using an interval of 5 minutes, such as 11:00, 11:05, 11:10,
     * and must be later than the <code>StartTime</code> timestamp.
     * </p>
     * <p>
     * The time range between <code>StartTime</code> and <code>EndTime</code>
     * must be less than 24 hours.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * A <code>Filters</code> object that contains a list of queue IDs or queue
     * ARNs, up to 100, or a list of Channels to use to filter the metrics
     * returned in the response. Metric data is retrieved only for the resources
     * associated with the IDs, ARNs, or Channels included in the filter. You
     * can use both IDs and ARNs together in a request. Only VOICE is supported
     * for Channel.
     * </p>
     * <p>
     * To find the ARN for a queue, open the queue you want to use in the Amazon
     * Connect Queue editor. The ARN for the queue is displayed in the address
     * bar as part of the URL. For example, the queue ARN is the set of
     * characters at the end of the URL, after 'id=' such as
     * <code>arn:aws:connect:us-east-1:270923740243:instance/78fb859d-1b7d-44b1-8aa3-12f0835c5855/queue/1d1a4575-9618-40ab-bbeb-81e45795fe61</code>
     * . The queue ID is also included in the URL, and is the string after
     * 'queue/'.
     * </p>
     */
    private Filters filters;

    /**
     * <p>
     * The grouping applied to the metrics returned. For example, when results
     * are grouped by queueId, the metrics returned are grouped by queue. The
     * values returned apply to the metrics for each queue rather than
     * aggregated for all queues.
     * </p>
     * <p>
     * The current version supports grouping by Queue
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of
     * <code>HistoricalMetrics</code> for all queues is returned.
     * </p>
     */
    private java.util.List<String> groupings;

    /**
     * <p>
     * A list of <code>HistoricalMetric</code> objects that contain the metrics
     * to retrieve with the request.
     * </p>
     * <p>
     * A <code>HistoricalMetric</code> object contains:
     * <code>HistoricalMetricName</code>, <code>Statistic</code>,
     * <code>Threshold</code>, and <code>Unit</code>.
     * </p>
     * <p>
     * You must list each metric to retrieve data for in the request. For each
     * historical metric you include in the request, you must include a
     * <code>Unit</code> and a <code>Statistic</code>.
     * </p>
     * <p>
     * The following historical metrics are available:
     * </p>
     * <dl>
     * <dt>CONTACTS_QUEUED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistic: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_ABANDONED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_CONSULTED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_AGENT_HUNG_UP_FIRST</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HANDLED_INCOMING</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HANDLED_OUTBOUND</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HOLD_ABANDONS</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_IN</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_IN_FROM_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_FROM_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CALLBACK_CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CALLBACK_CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>API_CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_MISSED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>OCCUPANCY</dt>
     * <dd>
     * <p>
     * Unit: PERCENT
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>HANDLE_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>AFTER_CONTACT_WORK_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>QUEUED_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: MAX
     * </p>
     * </dd>
     * <dt>ABANDON_TIME</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>QUEUE_ANSWER_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>INTERACTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>INTERACTION_AND_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>SERVICE_LEVEL</dt>
     * <dd>
     * <p>
     * Unit: PERCENT
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * <p>
     * Threshold: Only "Less than" comparisons are supported, with the following
     * service level thresholds: 15, 20, 25, 30, 45, 60, 90, 120, 180, 240, 300,
     * 600
     * </p>
     * </dd>
     * </dl>
     */
    private java.util.List<HistoricalMetric> historicalMetrics;

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Indicates the maximum number of results to return per page in the
     * response, between 1-100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier for your Amazon Connect instance. To find the ID
     *         of your instance, open the AWS console and select Amazon Connect.
     *         Select the alias of the instance in the Instance alias column.
     *         The instance ID is displayed in the Overview section of your
     *         instance settings. For example, the instance ID is the set of
     *         characters at the end of the instance ARN, after instance/, such
     *         as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier for your Amazon Connect instance. To find the
     *            ID of your instance, open the AWS console and select Amazon
     *            Connect. Select the alias of the instance in the Instance
     *            alias column. The instance ID is displayed in the Overview
     *            section of your instance settings. For example, the instance
     *            ID is the set of characters at the end of the instance ARN,
     *            after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier for your Amazon Connect instance. To find the
     *            ID of your instance, open the AWS console and select Amazon
     *            Connect. Select the alias of the instance in the Instance
     *            alias column. The instance ID is displayed in the Overview
     *            section of your instance settings. For example, the instance
     *            ID is the set of characters at the end of the instance ARN,
     *            after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format, at which to start the reporting
     * interval for the retrieval of historical metrics data. The time must be
     * specified using a multiple of 5 minutes, such as 10:05, 10:10, 10:15.
     * </p>
     * <p>
     * <code>StartTime</code> cannot be earlier than 24 hours before the time of
     * the request. Historical metrics are available in Amazon Connect only for
     * 24 hours.
     * </p>
     *
     * @return <p>
     *         The timestamp, in UNIX Epoch time format, at which to start the
     *         reporting interval for the retrieval of historical metrics data.
     *         The time must be specified using a multiple of 5 minutes, such as
     *         10:05, 10:10, 10:15.
     *         </p>
     *         <p>
     *         <code>StartTime</code> cannot be earlier than 24 hours before the
     *         time of the request. Historical metrics are available in Amazon
     *         Connect only for 24 hours.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format, at which to start the reporting
     * interval for the retrieval of historical metrics data. The time must be
     * specified using a multiple of 5 minutes, such as 10:05, 10:10, 10:15.
     * </p>
     * <p>
     * <code>StartTime</code> cannot be earlier than 24 hours before the time of
     * the request. Historical metrics are available in Amazon Connect only for
     * 24 hours.
     * </p>
     *
     * @param startTime <p>
     *            The timestamp, in UNIX Epoch time format, at which to start
     *            the reporting interval for the retrieval of historical metrics
     *            data. The time must be specified using a multiple of 5
     *            minutes, such as 10:05, 10:10, 10:15.
     *            </p>
     *            <p>
     *            <code>StartTime</code> cannot be earlier than 24 hours before
     *            the time of the request. Historical metrics are available in
     *            Amazon Connect only for 24 hours.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format, at which to start the reporting
     * interval for the retrieval of historical metrics data. The time must be
     * specified using a multiple of 5 minutes, such as 10:05, 10:10, 10:15.
     * </p>
     * <p>
     * <code>StartTime</code> cannot be earlier than 24 hours before the time of
     * the request. Historical metrics are available in Amazon Connect only for
     * 24 hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The timestamp, in UNIX Epoch time format, at which to start
     *            the reporting interval for the retrieval of historical metrics
     *            data. The time must be specified using a multiple of 5
     *            minutes, such as 10:05, 10:10, 10:15.
     *            </p>
     *            <p>
     *            <code>StartTime</code> cannot be earlier than 24 hours before
     *            the time of the request. Historical metrics are available in
     *            Amazon Connect only for 24 hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format, at which to end the reporting
     * interval for the retrieval of historical metrics data. The time must be
     * specified using an interval of 5 minutes, such as 11:00, 11:05, 11:10,
     * and must be later than the <code>StartTime</code> timestamp.
     * </p>
     * <p>
     * The time range between <code>StartTime</code> and <code>EndTime</code>
     * must be less than 24 hours.
     * </p>
     *
     * @return <p>
     *         The timestamp, in UNIX Epoch time format, at which to end the
     *         reporting interval for the retrieval of historical metrics data.
     *         The time must be specified using an interval of 5 minutes, such
     *         as 11:00, 11:05, 11:10, and must be later than the
     *         <code>StartTime</code> timestamp.
     *         </p>
     *         <p>
     *         The time range between <code>StartTime</code> and
     *         <code>EndTime</code> must be less than 24 hours.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format, at which to end the reporting
     * interval for the retrieval of historical metrics data. The time must be
     * specified using an interval of 5 minutes, such as 11:00, 11:05, 11:10,
     * and must be later than the <code>StartTime</code> timestamp.
     * </p>
     * <p>
     * The time range between <code>StartTime</code> and <code>EndTime</code>
     * must be less than 24 hours.
     * </p>
     *
     * @param endTime <p>
     *            The timestamp, in UNIX Epoch time format, at which to end the
     *            reporting interval for the retrieval of historical metrics
     *            data. The time must be specified using an interval of 5
     *            minutes, such as 11:00, 11:05, 11:10, and must be later than
     *            the <code>StartTime</code> timestamp.
     *            </p>
     *            <p>
     *            The time range between <code>StartTime</code> and
     *            <code>EndTime</code> must be less than 24 hours.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format, at which to end the reporting
     * interval for the retrieval of historical metrics data. The time must be
     * specified using an interval of 5 minutes, such as 11:00, 11:05, 11:10,
     * and must be later than the <code>StartTime</code> timestamp.
     * </p>
     * <p>
     * The time range between <code>StartTime</code> and <code>EndTime</code>
     * must be less than 24 hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The timestamp, in UNIX Epoch time format, at which to end the
     *            reporting interval for the retrieval of historical metrics
     *            data. The time must be specified using an interval of 5
     *            minutes, such as 11:00, 11:05, 11:10, and must be later than
     *            the <code>StartTime</code> timestamp.
     *            </p>
     *            <p>
     *            The time range between <code>StartTime</code> and
     *            <code>EndTime</code> must be less than 24 hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * A <code>Filters</code> object that contains a list of queue IDs or queue
     * ARNs, up to 100, or a list of Channels to use to filter the metrics
     * returned in the response. Metric data is retrieved only for the resources
     * associated with the IDs, ARNs, or Channels included in the filter. You
     * can use both IDs and ARNs together in a request. Only VOICE is supported
     * for Channel.
     * </p>
     * <p>
     * To find the ARN for a queue, open the queue you want to use in the Amazon
     * Connect Queue editor. The ARN for the queue is displayed in the address
     * bar as part of the URL. For example, the queue ARN is the set of
     * characters at the end of the URL, after 'id=' such as
     * <code>arn:aws:connect:us-east-1:270923740243:instance/78fb859d-1b7d-44b1-8aa3-12f0835c5855/queue/1d1a4575-9618-40ab-bbeb-81e45795fe61</code>
     * . The queue ID is also included in the URL, and is the string after
     * 'queue/'.
     * </p>
     *
     * @return <p>
     *         A <code>Filters</code> object that contains a list of queue IDs
     *         or queue ARNs, up to 100, or a list of Channels to use to filter
     *         the metrics returned in the response. Metric data is retrieved
     *         only for the resources associated with the IDs, ARNs, or Channels
     *         included in the filter. You can use both IDs and ARNs together in
     *         a request. Only VOICE is supported for Channel.
     *         </p>
     *         <p>
     *         To find the ARN for a queue, open the queue you want to use in
     *         the Amazon Connect Queue editor. The ARN for the queue is
     *         displayed in the address bar as part of the URL. For example, the
     *         queue ARN is the set of characters at the end of the URL, after
     *         'id=' such as
     *         <code>arn:aws:connect:us-east-1:270923740243:instance/78fb859d-1b7d-44b1-8aa3-12f0835c5855/queue/1d1a4575-9618-40ab-bbeb-81e45795fe61</code>
     *         . The queue ID is also included in the URL, and is the string
     *         after 'queue/'.
     *         </p>
     */
    public Filters getFilters() {
        return filters;
    }

    /**
     * <p>
     * A <code>Filters</code> object that contains a list of queue IDs or queue
     * ARNs, up to 100, or a list of Channels to use to filter the metrics
     * returned in the response. Metric data is retrieved only for the resources
     * associated with the IDs, ARNs, or Channels included in the filter. You
     * can use both IDs and ARNs together in a request. Only VOICE is supported
     * for Channel.
     * </p>
     * <p>
     * To find the ARN for a queue, open the queue you want to use in the Amazon
     * Connect Queue editor. The ARN for the queue is displayed in the address
     * bar as part of the URL. For example, the queue ARN is the set of
     * characters at the end of the URL, after 'id=' such as
     * <code>arn:aws:connect:us-east-1:270923740243:instance/78fb859d-1b7d-44b1-8aa3-12f0835c5855/queue/1d1a4575-9618-40ab-bbeb-81e45795fe61</code>
     * . The queue ID is also included in the URL, and is the string after
     * 'queue/'.
     * </p>
     *
     * @param filters <p>
     *            A <code>Filters</code> object that contains a list of queue
     *            IDs or queue ARNs, up to 100, or a list of Channels to use to
     *            filter the metrics returned in the response. Metric data is
     *            retrieved only for the resources associated with the IDs,
     *            ARNs, or Channels included in the filter. You can use both IDs
     *            and ARNs together in a request. Only VOICE is supported for
     *            Channel.
     *            </p>
     *            <p>
     *            To find the ARN for a queue, open the queue you want to use in
     *            the Amazon Connect Queue editor. The ARN for the queue is
     *            displayed in the address bar as part of the URL. For example,
     *            the queue ARN is the set of characters at the end of the URL,
     *            after 'id=' such as
     *            <code>arn:aws:connect:us-east-1:270923740243:instance/78fb859d-1b7d-44b1-8aa3-12f0835c5855/queue/1d1a4575-9618-40ab-bbeb-81e45795fe61</code>
     *            . The queue ID is also included in the URL, and is the string
     *            after 'queue/'.
     *            </p>
     */
    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * A <code>Filters</code> object that contains a list of queue IDs or queue
     * ARNs, up to 100, or a list of Channels to use to filter the metrics
     * returned in the response. Metric data is retrieved only for the resources
     * associated with the IDs, ARNs, or Channels included in the filter. You
     * can use both IDs and ARNs together in a request. Only VOICE is supported
     * for Channel.
     * </p>
     * <p>
     * To find the ARN for a queue, open the queue you want to use in the Amazon
     * Connect Queue editor. The ARN for the queue is displayed in the address
     * bar as part of the URL. For example, the queue ARN is the set of
     * characters at the end of the URL, after 'id=' such as
     * <code>arn:aws:connect:us-east-1:270923740243:instance/78fb859d-1b7d-44b1-8aa3-12f0835c5855/queue/1d1a4575-9618-40ab-bbeb-81e45795fe61</code>
     * . The queue ID is also included in the URL, and is the string after
     * 'queue/'.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            A <code>Filters</code> object that contains a list of queue
     *            IDs or queue ARNs, up to 100, or a list of Channels to use to
     *            filter the metrics returned in the response. Metric data is
     *            retrieved only for the resources associated with the IDs,
     *            ARNs, or Channels included in the filter. You can use both IDs
     *            and ARNs together in a request. Only VOICE is supported for
     *            Channel.
     *            </p>
     *            <p>
     *            To find the ARN for a queue, open the queue you want to use in
     *            the Amazon Connect Queue editor. The ARN for the queue is
     *            displayed in the address bar as part of the URL. For example,
     *            the queue ARN is the set of characters at the end of the URL,
     *            after 'id=' such as
     *            <code>arn:aws:connect:us-east-1:270923740243:instance/78fb859d-1b7d-44b1-8aa3-12f0835c5855/queue/1d1a4575-9618-40ab-bbeb-81e45795fe61</code>
     *            . The queue ID is also included in the URL, and is the string
     *            after 'queue/'.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataRequest withFilters(Filters filters) {
        this.filters = filters;
        return this;
    }

    /**
     * <p>
     * The grouping applied to the metrics returned. For example, when results
     * are grouped by queueId, the metrics returned are grouped by queue. The
     * values returned apply to the metrics for each queue rather than
     * aggregated for all queues.
     * </p>
     * <p>
     * The current version supports grouping by Queue
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of
     * <code>HistoricalMetrics</code> for all queues is returned.
     * </p>
     *
     * @return <p>
     *         The grouping applied to the metrics returned. For example, when
     *         results are grouped by queueId, the metrics returned are grouped
     *         by queue. The values returned apply to the metrics for each queue
     *         rather than aggregated for all queues.
     *         </p>
     *         <p>
     *         The current version supports grouping by Queue
     *         </p>
     *         <p>
     *         If no <code>Grouping</code> is included in the request, a summary
     *         of <code>HistoricalMetrics</code> for all queues is returned.
     *         </p>
     */
    public java.util.List<String> getGroupings() {
        return groupings;
    }

    /**
     * <p>
     * The grouping applied to the metrics returned. For example, when results
     * are grouped by queueId, the metrics returned are grouped by queue. The
     * values returned apply to the metrics for each queue rather than
     * aggregated for all queues.
     * </p>
     * <p>
     * The current version supports grouping by Queue
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of
     * <code>HistoricalMetrics</code> for all queues is returned.
     * </p>
     *
     * @param groupings <p>
     *            The grouping applied to the metrics returned. For example,
     *            when results are grouped by queueId, the metrics returned are
     *            grouped by queue. The values returned apply to the metrics for
     *            each queue rather than aggregated for all queues.
     *            </p>
     *            <p>
     *            The current version supports grouping by Queue
     *            </p>
     *            <p>
     *            If no <code>Grouping</code> is included in the request, a
     *            summary of <code>HistoricalMetrics</code> for all queues is
     *            returned.
     *            </p>
     */
    public void setGroupings(java.util.Collection<String> groupings) {
        if (groupings == null) {
            this.groupings = null;
            return;
        }

        this.groupings = new java.util.ArrayList<String>(groupings);
    }

    /**
     * <p>
     * The grouping applied to the metrics returned. For example, when results
     * are grouped by queueId, the metrics returned are grouped by queue. The
     * values returned apply to the metrics for each queue rather than
     * aggregated for all queues.
     * </p>
     * <p>
     * The current version supports grouping by Queue
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of
     * <code>HistoricalMetrics</code> for all queues is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupings <p>
     *            The grouping applied to the metrics returned. For example,
     *            when results are grouped by queueId, the metrics returned are
     *            grouped by queue. The values returned apply to the metrics for
     *            each queue rather than aggregated for all queues.
     *            </p>
     *            <p>
     *            The current version supports grouping by Queue
     *            </p>
     *            <p>
     *            If no <code>Grouping</code> is included in the request, a
     *            summary of <code>HistoricalMetrics</code> for all queues is
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataRequest withGroupings(String... groupings) {
        if (getGroupings() == null) {
            this.groupings = new java.util.ArrayList<String>(groupings.length);
        }
        for (String value : groupings) {
            this.groupings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The grouping applied to the metrics returned. For example, when results
     * are grouped by queueId, the metrics returned are grouped by queue. The
     * values returned apply to the metrics for each queue rather than
     * aggregated for all queues.
     * </p>
     * <p>
     * The current version supports grouping by Queue
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of
     * <code>HistoricalMetrics</code> for all queues is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupings <p>
     *            The grouping applied to the metrics returned. For example,
     *            when results are grouped by queueId, the metrics returned are
     *            grouped by queue. The values returned apply to the metrics for
     *            each queue rather than aggregated for all queues.
     *            </p>
     *            <p>
     *            The current version supports grouping by Queue
     *            </p>
     *            <p>
     *            If no <code>Grouping</code> is included in the request, a
     *            summary of <code>HistoricalMetrics</code> for all queues is
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataRequest withGroupings(java.util.Collection<String> groupings) {
        setGroupings(groupings);
        return this;
    }

    /**
     * <p>
     * A list of <code>HistoricalMetric</code> objects that contain the metrics
     * to retrieve with the request.
     * </p>
     * <p>
     * A <code>HistoricalMetric</code> object contains:
     * <code>HistoricalMetricName</code>, <code>Statistic</code>,
     * <code>Threshold</code>, and <code>Unit</code>.
     * </p>
     * <p>
     * You must list each metric to retrieve data for in the request. For each
     * historical metric you include in the request, you must include a
     * <code>Unit</code> and a <code>Statistic</code>.
     * </p>
     * <p>
     * The following historical metrics are available:
     * </p>
     * <dl>
     * <dt>CONTACTS_QUEUED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistic: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_ABANDONED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_CONSULTED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_AGENT_HUNG_UP_FIRST</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HANDLED_INCOMING</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HANDLED_OUTBOUND</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HOLD_ABANDONS</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_IN</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_IN_FROM_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_FROM_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CALLBACK_CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CALLBACK_CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>API_CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_MISSED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>OCCUPANCY</dt>
     * <dd>
     * <p>
     * Unit: PERCENT
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>HANDLE_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>AFTER_CONTACT_WORK_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>QUEUED_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: MAX
     * </p>
     * </dd>
     * <dt>ABANDON_TIME</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>QUEUE_ANSWER_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>INTERACTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>INTERACTION_AND_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>SERVICE_LEVEL</dt>
     * <dd>
     * <p>
     * Unit: PERCENT
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * <p>
     * Threshold: Only "Less than" comparisons are supported, with the following
     * service level thresholds: 15, 20, 25, 30, 45, 60, 90, 120, 180, 240, 300,
     * 600
     * </p>
     * </dd>
     * </dl>
     *
     * @return <p>
     *         A list of <code>HistoricalMetric</code> objects that contain the
     *         metrics to retrieve with the request.
     *         </p>
     *         <p>
     *         A <code>HistoricalMetric</code> object contains:
     *         <code>HistoricalMetricName</code>, <code>Statistic</code>,
     *         <code>Threshold</code>, and <code>Unit</code>.
     *         </p>
     *         <p>
     *         You must list each metric to retrieve data for in the request.
     *         For each historical metric you include in the request, you must
     *         include a <code>Unit</code> and a <code>Statistic</code>.
     *         </p>
     *         <p>
     *         The following historical metrics are available:
     *         </p>
     *         <dl>
     *         <dt>CONTACTS_QUEUED</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Statistic: SUM
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_HANDLED</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Statistics: SUM
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_ABANDONED</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Statistics: SUM
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_CONSULTED</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Statistics: SUM
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_AGENT_HUNG_UP_FIRST</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Statistics: SUM
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_HANDLED_INCOMING</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Statistics: SUM
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_HANDLED_OUTBOUND</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Statistics: SUM
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_HOLD_ABANDONS</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Statistics: SUM
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_TRANSFERRED_IN</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Statistics: SUM
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_TRANSFERRED_OUT</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Statistics: SUM
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_TRANSFERRED_IN_FROM_QUEUE</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Statistics: SUM
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_TRANSFERRED_OUT_FROM_QUEUE</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Statistics: SUM
     *         </p>
     *         </dd>
     *         <dt>CALLBACK_CONTACTS_HANDLED</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Statistics: SUM
     *         </p>
     *         </dd>
     *         <dt>CALLBACK_CONTACTS_HANDLED</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Statistics: SUM
     *         </p>
     *         </dd>
     *         <dt>API_CONTACTS_HANDLED</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Statistics: SUM
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_MISSED</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Statistics: SUM
     *         </p>
     *         </dd>
     *         <dt>OCCUPANCY</dt>
     *         <dd>
     *         <p>
     *         Unit: PERCENT
     *         </p>
     *         <p>
     *         Statistics: AVG
     *         </p>
     *         </dd>
     *         <dt>HANDLE_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: SECONDS
     *         </p>
     *         <p>
     *         Statistics: AVG
     *         </p>
     *         </dd>
     *         <dt>AFTER_CONTACT_WORK_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: SECONDS
     *         </p>
     *         <p>
     *         Statistics: AVG
     *         </p>
     *         </dd>
     *         <dt>QUEUED_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: SECONDS
     *         </p>
     *         <p>
     *         Statistics: MAX
     *         </p>
     *         </dd>
     *         <dt>ABANDON_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Statistics: SUM
     *         </p>
     *         </dd>
     *         <dt>QUEUE_ANSWER_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: SECONDS
     *         </p>
     *         <p>
     *         Statistics: AVG
     *         </p>
     *         </dd>
     *         <dt>HOLD_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: SECONDS
     *         </p>
     *         <p>
     *         Statistics: AVG
     *         </p>
     *         </dd>
     *         <dt>INTERACTION_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: SECONDS
     *         </p>
     *         <p>
     *         Statistics: AVG
     *         </p>
     *         </dd>
     *         <dt>INTERACTION_AND_HOLD_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: SECONDS
     *         </p>
     *         <p>
     *         Statistics: AVG
     *         </p>
     *         </dd>
     *         <dt>SERVICE_LEVEL</dt>
     *         <dd>
     *         <p>
     *         Unit: PERCENT
     *         </p>
     *         <p>
     *         Statistics: AVG
     *         </p>
     *         <p>
     *         Threshold: Only "Less than" comparisons are supported, with the
     *         following service level thresholds: 15, 20, 25, 30, 45, 60, 90,
     *         120, 180, 240, 300, 600
     *         </p>
     *         </dd>
     *         </dl>
     */
    public java.util.List<HistoricalMetric> getHistoricalMetrics() {
        return historicalMetrics;
    }

    /**
     * <p>
     * A list of <code>HistoricalMetric</code> objects that contain the metrics
     * to retrieve with the request.
     * </p>
     * <p>
     * A <code>HistoricalMetric</code> object contains:
     * <code>HistoricalMetricName</code>, <code>Statistic</code>,
     * <code>Threshold</code>, and <code>Unit</code>.
     * </p>
     * <p>
     * You must list each metric to retrieve data for in the request. For each
     * historical metric you include in the request, you must include a
     * <code>Unit</code> and a <code>Statistic</code>.
     * </p>
     * <p>
     * The following historical metrics are available:
     * </p>
     * <dl>
     * <dt>CONTACTS_QUEUED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistic: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_ABANDONED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_CONSULTED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_AGENT_HUNG_UP_FIRST</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HANDLED_INCOMING</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HANDLED_OUTBOUND</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HOLD_ABANDONS</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_IN</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_IN_FROM_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_FROM_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CALLBACK_CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CALLBACK_CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>API_CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_MISSED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>OCCUPANCY</dt>
     * <dd>
     * <p>
     * Unit: PERCENT
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>HANDLE_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>AFTER_CONTACT_WORK_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>QUEUED_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: MAX
     * </p>
     * </dd>
     * <dt>ABANDON_TIME</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>QUEUE_ANSWER_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>INTERACTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>INTERACTION_AND_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>SERVICE_LEVEL</dt>
     * <dd>
     * <p>
     * Unit: PERCENT
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * <p>
     * Threshold: Only "Less than" comparisons are supported, with the following
     * service level thresholds: 15, 20, 25, 30, 45, 60, 90, 120, 180, 240, 300,
     * 600
     * </p>
     * </dd>
     * </dl>
     *
     * @param historicalMetrics <p>
     *            A list of <code>HistoricalMetric</code> objects that contain
     *            the metrics to retrieve with the request.
     *            </p>
     *            <p>
     *            A <code>HistoricalMetric</code> object contains:
     *            <code>HistoricalMetricName</code>, <code>Statistic</code>,
     *            <code>Threshold</code>, and <code>Unit</code>.
     *            </p>
     *            <p>
     *            You must list each metric to retrieve data for in the request.
     *            For each historical metric you include in the request, you
     *            must include a <code>Unit</code> and a <code>Statistic</code>.
     *            </p>
     *            <p>
     *            The following historical metrics are available:
     *            </p>
     *            <dl>
     *            <dt>CONTACTS_QUEUED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistic: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_HANDLED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_ABANDONED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_CONSULTED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_AGENT_HUNG_UP_FIRST</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_HANDLED_INCOMING</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_HANDLED_OUTBOUND</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_HOLD_ABANDONS</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_IN</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_IN_FROM_QUEUE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT_FROM_QUEUE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CALLBACK_CONTACTS_HANDLED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CALLBACK_CONTACTS_HANDLED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>API_CONTACTS_HANDLED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_MISSED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>OCCUPANCY</dt>
     *            <dd>
     *            <p>
     *            Unit: PERCENT
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>HANDLE_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>AFTER_CONTACT_WORK_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>QUEUED_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: MAX
     *            </p>
     *            </dd>
     *            <dt>ABANDON_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>QUEUE_ANSWER_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>HOLD_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>INTERACTION_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>INTERACTION_AND_HOLD_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>SERVICE_LEVEL</dt>
     *            <dd>
     *            <p>
     *            Unit: PERCENT
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            <p>
     *            Threshold: Only "Less than" comparisons are supported, with
     *            the following service level thresholds: 15, 20, 25, 30, 45,
     *            60, 90, 120, 180, 240, 300, 600
     *            </p>
     *            </dd>
     *            </dl>
     */
    public void setHistoricalMetrics(java.util.Collection<HistoricalMetric> historicalMetrics) {
        if (historicalMetrics == null) {
            this.historicalMetrics = null;
            return;
        }

        this.historicalMetrics = new java.util.ArrayList<HistoricalMetric>(historicalMetrics);
    }

    /**
     * <p>
     * A list of <code>HistoricalMetric</code> objects that contain the metrics
     * to retrieve with the request.
     * </p>
     * <p>
     * A <code>HistoricalMetric</code> object contains:
     * <code>HistoricalMetricName</code>, <code>Statistic</code>,
     * <code>Threshold</code>, and <code>Unit</code>.
     * </p>
     * <p>
     * You must list each metric to retrieve data for in the request. For each
     * historical metric you include in the request, you must include a
     * <code>Unit</code> and a <code>Statistic</code>.
     * </p>
     * <p>
     * The following historical metrics are available:
     * </p>
     * <dl>
     * <dt>CONTACTS_QUEUED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistic: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_ABANDONED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_CONSULTED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_AGENT_HUNG_UP_FIRST</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HANDLED_INCOMING</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HANDLED_OUTBOUND</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HOLD_ABANDONS</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_IN</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_IN_FROM_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_FROM_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CALLBACK_CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CALLBACK_CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>API_CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_MISSED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>OCCUPANCY</dt>
     * <dd>
     * <p>
     * Unit: PERCENT
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>HANDLE_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>AFTER_CONTACT_WORK_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>QUEUED_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: MAX
     * </p>
     * </dd>
     * <dt>ABANDON_TIME</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>QUEUE_ANSWER_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>INTERACTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>INTERACTION_AND_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>SERVICE_LEVEL</dt>
     * <dd>
     * <p>
     * Unit: PERCENT
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * <p>
     * Threshold: Only "Less than" comparisons are supported, with the following
     * service level thresholds: 15, 20, 25, 30, 45, 60, 90, 120, 180, 240, 300,
     * 600
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param historicalMetrics <p>
     *            A list of <code>HistoricalMetric</code> objects that contain
     *            the metrics to retrieve with the request.
     *            </p>
     *            <p>
     *            A <code>HistoricalMetric</code> object contains:
     *            <code>HistoricalMetricName</code>, <code>Statistic</code>,
     *            <code>Threshold</code>, and <code>Unit</code>.
     *            </p>
     *            <p>
     *            You must list each metric to retrieve data for in the request.
     *            For each historical metric you include in the request, you
     *            must include a <code>Unit</code> and a <code>Statistic</code>.
     *            </p>
     *            <p>
     *            The following historical metrics are available:
     *            </p>
     *            <dl>
     *            <dt>CONTACTS_QUEUED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistic: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_HANDLED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_ABANDONED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_CONSULTED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_AGENT_HUNG_UP_FIRST</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_HANDLED_INCOMING</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_HANDLED_OUTBOUND</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_HOLD_ABANDONS</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_IN</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_IN_FROM_QUEUE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT_FROM_QUEUE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CALLBACK_CONTACTS_HANDLED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CALLBACK_CONTACTS_HANDLED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>API_CONTACTS_HANDLED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_MISSED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>OCCUPANCY</dt>
     *            <dd>
     *            <p>
     *            Unit: PERCENT
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>HANDLE_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>AFTER_CONTACT_WORK_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>QUEUED_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: MAX
     *            </p>
     *            </dd>
     *            <dt>ABANDON_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>QUEUE_ANSWER_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>HOLD_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>INTERACTION_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>INTERACTION_AND_HOLD_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>SERVICE_LEVEL</dt>
     *            <dd>
     *            <p>
     *            Unit: PERCENT
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            <p>
     *            Threshold: Only "Less than" comparisons are supported, with
     *            the following service level thresholds: 15, 20, 25, 30, 45,
     *            60, 90, 120, 180, 240, 300, 600
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataRequest withHistoricalMetrics(HistoricalMetric... historicalMetrics) {
        if (getHistoricalMetrics() == null) {
            this.historicalMetrics = new java.util.ArrayList<HistoricalMetric>(
                    historicalMetrics.length);
        }
        for (HistoricalMetric value : historicalMetrics) {
            this.historicalMetrics.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>HistoricalMetric</code> objects that contain the metrics
     * to retrieve with the request.
     * </p>
     * <p>
     * A <code>HistoricalMetric</code> object contains:
     * <code>HistoricalMetricName</code>, <code>Statistic</code>,
     * <code>Threshold</code>, and <code>Unit</code>.
     * </p>
     * <p>
     * You must list each metric to retrieve data for in the request. For each
     * historical metric you include in the request, you must include a
     * <code>Unit</code> and a <code>Statistic</code>.
     * </p>
     * <p>
     * The following historical metrics are available:
     * </p>
     * <dl>
     * <dt>CONTACTS_QUEUED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistic: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_ABANDONED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_CONSULTED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_AGENT_HUNG_UP_FIRST</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HANDLED_INCOMING</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HANDLED_OUTBOUND</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_HOLD_ABANDONS</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_IN</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_IN_FROM_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_FROM_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CALLBACK_CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CALLBACK_CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>API_CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>CONTACTS_MISSED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>OCCUPANCY</dt>
     * <dd>
     * <p>
     * Unit: PERCENT
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>HANDLE_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>AFTER_CONTACT_WORK_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>QUEUED_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: MAX
     * </p>
     * </dd>
     * <dt>ABANDON_TIME</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Statistics: SUM
     * </p>
     * </dd>
     * <dt>QUEUE_ANSWER_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>INTERACTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>INTERACTION_AND_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * </dd>
     * <dt>SERVICE_LEVEL</dt>
     * <dd>
     * <p>
     * Unit: PERCENT
     * </p>
     * <p>
     * Statistics: AVG
     * </p>
     * <p>
     * Threshold: Only "Less than" comparisons are supported, with the following
     * service level thresholds: 15, 20, 25, 30, 45, 60, 90, 120, 180, 240, 300,
     * 600
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param historicalMetrics <p>
     *            A list of <code>HistoricalMetric</code> objects that contain
     *            the metrics to retrieve with the request.
     *            </p>
     *            <p>
     *            A <code>HistoricalMetric</code> object contains:
     *            <code>HistoricalMetricName</code>, <code>Statistic</code>,
     *            <code>Threshold</code>, and <code>Unit</code>.
     *            </p>
     *            <p>
     *            You must list each metric to retrieve data for in the request.
     *            For each historical metric you include in the request, you
     *            must include a <code>Unit</code> and a <code>Statistic</code>.
     *            </p>
     *            <p>
     *            The following historical metrics are available:
     *            </p>
     *            <dl>
     *            <dt>CONTACTS_QUEUED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistic: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_HANDLED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_ABANDONED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_CONSULTED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_AGENT_HUNG_UP_FIRST</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_HANDLED_INCOMING</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_HANDLED_OUTBOUND</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_HOLD_ABANDONS</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_IN</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_IN_FROM_QUEUE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT_FROM_QUEUE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CALLBACK_CONTACTS_HANDLED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CALLBACK_CONTACTS_HANDLED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>API_CONTACTS_HANDLED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_MISSED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>OCCUPANCY</dt>
     *            <dd>
     *            <p>
     *            Unit: PERCENT
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>HANDLE_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>AFTER_CONTACT_WORK_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>QUEUED_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: MAX
     *            </p>
     *            </dd>
     *            <dt>ABANDON_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Statistics: SUM
     *            </p>
     *            </dd>
     *            <dt>QUEUE_ANSWER_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>HOLD_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>INTERACTION_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>INTERACTION_AND_HOLD_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            </dd>
     *            <dt>SERVICE_LEVEL</dt>
     *            <dd>
     *            <p>
     *            Unit: PERCENT
     *            </p>
     *            <p>
     *            Statistics: AVG
     *            </p>
     *            <p>
     *            Threshold: Only "Less than" comparisons are supported, with
     *            the following service level thresholds: 15, 20, 25, 30, 45,
     *            60, 90, 120, 180, 240, 300, 600
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataRequest withHistoricalMetrics(
            java.util.Collection<HistoricalMetric> historicalMetrics) {
        setHistoricalMetrics(historicalMetrics);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results. Use the value returned in
     *         the previous response in the next request to retrieve the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Indicates the maximum number of results to return per page in the
     * response, between 1-100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         Indicates the maximum number of results to return per page in the
     *         response, between 1-100.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Indicates the maximum number of results to return per page in the
     * response, between 1-100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            Indicates the maximum number of results to return per page in
     *            the response, between 1-100.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Indicates the maximum number of results to return per page in the
     * response, between 1-100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            Indicates the maximum number of results to return per page in
     *            the response, between 1-100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getGroupings() != null)
            sb.append("Groupings: " + getGroupings() + ",");
        if (getHistoricalMetrics() != null)
            sb.append("HistoricalMetrics: " + getHistoricalMetrics() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getGroupings() == null) ? 0 : getGroupings().hashCode());
        hashCode = prime * hashCode
                + ((getHistoricalMetrics() == null) ? 0 : getHistoricalMetrics().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMetricDataRequest == false)
            return false;
        GetMetricDataRequest other = (GetMetricDataRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
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
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getGroupings() == null ^ this.getGroupings() == null)
            return false;
        if (other.getGroupings() != null
                && other.getGroupings().equals(this.getGroupings()) == false)
            return false;
        if (other.getHistoricalMetrics() == null ^ this.getHistoricalMetrics() == null)
            return false;
        if (other.getHistoricalMetrics() != null
                && other.getHistoricalMetrics().equals(this.getHistoricalMetrics()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
