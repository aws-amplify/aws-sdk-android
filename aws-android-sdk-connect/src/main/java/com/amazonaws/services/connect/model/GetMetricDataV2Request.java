/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Gets metric data from the specified Amazon Connect instance.
 * </p>
 * <p>
 * <code>GetMetricDataV2</code> offers more features than <a href=
 * "https://docs.aws.amazon.com/connect/latest/APIReference/API_GetMetricData.html"
 * >GetMetricData</a>, the previous version of this API. It has new metrics,
 * offers filtering at a metric level, and offers the ability to filter and
 * group data by channels, queues, routing profiles, agents, and agent hierarchy
 * levels. It can retrieve historical data for the last 3 months, at varying
 * intervals.
 * </p>
 * <p>
 * For a description of the historical metrics that are supported by
 * <code>GetMetricDataV2</code> and <code>GetMetricData</code>, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
 * >Historical metrics definitions</a> in the <i>Amazon Connect Administrator's
 * Guide</i>.
 * </p>
 */
public class GetMetricDataV2Request extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource. This includes the
     * <code>instanceId</code> an Amazon Connect instance.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format, at which to start the reporting
     * interval for the retrieval of historical metrics data. The time must be
     * before the end time timestamp. The start and end time depends on the
     * <code>IntervalPeriod</code> selected. By default the time range between
     * start and end time is 35 days. Historical metrics are available for 3
     * months.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format, at which to end the reporting
     * interval for the retrieval of historical metrics data. The time must be
     * later than the start time timestamp. It cannot be later than the current
     * timestamp.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The interval period and timezone to apply to returned metrics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IntervalPeriod</code>: An aggregated grouping applied to request
     * metrics. Valid <code>IntervalPeriod</code> values are:
     * <code>FIFTEEN_MIN</code> | <code>THIRTY_MIN</code> | <code>HOUR</code> |
     * <code>DAY</code> | <code>WEEK</code> | <code>TOTAL</code>.
     * </p>
     * <p>
     * For example, if <code>IntervalPeriod</code> is selected
     * <code>THIRTY_MIN</code>, <code>StartTime</code> and <code>EndTime</code>
     * differs by 1 day, then Amazon Connect returns 48 results in the response.
     * Each result is aggregated by the THIRTY_MIN period. By default Amazon
     * Connect aggregates results based on the <code>TOTAL</code> interval
     * period.
     * </p>
     * <p>
     * The following list describes restrictions on <code>StartTime</code> and
     * <code>EndTime</code> based on which <code>IntervalPeriod</code> is
     * requested.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIFTEEN_MIN</code>: The difference between <code>StartTime</code>
     * and <code>EndTime</code> must be less than 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIRTY_MIN</code>: The difference between <code>StartTime</code>
     * and <code>EndTime</code> must be less than 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOUR</code>: The difference between <code>StartTime</code> and
     * <code>EndTime</code> must be less than 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAY</code>: The difference between <code>StartTime</code> and
     * <code>EndTime</code> must be less than 35 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WEEK</code>: The difference between <code>StartTime</code> and
     * <code>EndTime</code> must be less than 35 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code>: The difference between <code>StartTime</code> and
     * <code>EndTime</code> must be less than 35 days.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>TimeZone</code>: The timezone applied to requested metrics.
     * </p>
     * </li>
     * </ul>
     */
    private IntervalDetails interval;

    /**
     * <p>
     * The filters to apply to returned metrics. You can filter on the following
     * resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Queues
     * </p>
     * </li>
     * <li>
     * <p>
     * Routing profiles
     * </p>
     * </li>
     * <li>
     * <p>
     * Agents
     * </p>
     * </li>
     * <li>
     * <p>
     * Channels
     * </p>
     * </li>
     * <li>
     * <p>
     * User hierarchy groups
     * </p>
     * </li>
     * <li>
     * <p>
     * Feature
     * </p>
     * </li>
     * <li>
     * <p>
     * Routing step expression
     * </p>
     * </li>
     * </ul>
     * <p>
     * At least one filter must be passed from queues, routing profiles, agents,
     * or user hierarchy groups.
     * </p>
     * <p>
     * To filter by phone number, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-historical-metrics-report.html"
     * >Create a historical metrics report</a> in the <i>Amazon Connect
     * Administrator's Guide</i>.
     * </p>
     * <p>
     * Note the following limits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Filter keys</b>: A maximum of 5 filter keys are supported in a single
     * request. Valid filter keys: <code>QUEUE</code> |
     * <code>ROUTING_PROFILE</code> | <code>AGENT</code> | <code>CHANNEL</code>
     * | <code>AGENT_HIERARCHY_LEVEL_ONE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_TWO</code> |
     * <code>AGENT_HIERARCHY_LEVEL_THREE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FOUR</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FIVE</code> | <code>FEATURE</code> |
     * <code>contact/segmentAttributes/connect:Subtype</code> |
     * <code>ROUTING_STEP_EXPRESSION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Filter values</b>: A maximum of 100 filter values are supported in a
     * single request. VOICE, CHAT, and TASK are valid <code>filterValue</code>
     * for the CHANNEL filter key. They do not count towards limitation of 100
     * filter values. For example, a GetMetricDataV2 request can filter by 50
     * queues, 35 agents, and 15 routing profiles for a total of 100 filter
     * values, along with 3 channel filters.
     * </p>
     * <p>
     * <code>contact_lens_conversational_analytics</code> is a valid filterValue
     * for the <code>FEATURE</code> filter key. It is available only to contacts
     * analyzed by Contact Lens conversational analytics.
     * </p>
     * <p>
     * <code>connect:Chat</code>, <code>connect:SMS</code>,
     * <code>connect:Telephony</code>, and <code>connect:WebRTC</code> are valid
     * <code>filterValue</code> examples (not exhaustive) for the
     * <code>contact/segmentAttributes/connect:Subtype filter</code> key.
     * </p>
     * <p>
     * <code>ROUTING_STEP_EXPRESSION</code> is a valid filter key with a filter
     * value up to 3000 length. This filter is case and order sensitive. JSON
     * string fields must be sorted in ascending order and JSON array order
     * should be kept as is.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<FilterV2> filters;

    /**
     * <p>
     * The grouping applied to the metrics that are returned. For example, when
     * results are grouped by queue, the metrics returned are grouped by queue.
     * The values that are returned apply to the metrics for each queue. They
     * are not aggregated for all queues.
     * </p>
     * <p>
     * If no grouping is specified, a summary of all metrics is returned.
     * </p>
     * <p>
     * Valid grouping keys: <code>QUEUE</code> | <code>ROUTING_PROFILE</code> |
     * <code>AGENT</code> | <code>CHANNEL</code> |
     * <code>AGENT_HIERARCHY_LEVEL_ONE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_TWO</code> |
     * <code>AGENT_HIERARCHY_LEVEL_THREE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FOUR</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FIVE</code>,
     * <code>contact/segmentAttributes/connect:Subtype</code> |
     * <code>ROUTING_STEP_EXPRESSION</code>
     * </p>
     */
    private java.util.List<String> groupings;

    /**
     * <p>
     * The metrics to retrieve. Specify the name, groupings, and filters for
     * each metric. The following historical metrics are available. For a
     * description of each metric, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
     * >Historical metrics definitions</a> in the <i>Amazon Connect
     * Administrator's Guide</i>.
     * </p>
     * <dl>
     * <dt>ABANDONMENT_RATE</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AGENT_ADHERENT_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only in Amazon Web Services Regions where <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     * >Forecasting, capacity planning, and scheduling</a> is available.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_ANSWER_RATE</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_NON_ADHERENT_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_NON_RESPONSE</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_NON_RESPONSE_WITHOUT_CUSTOMER_ABANDONS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * <p>
     * Data for this metric is available starting from October 1, 2023 0:00:00
     * GMT.
     * </p>
     * </dd>
     * <dt>AGENT_OCCUPANCY</dt>
     * <dd>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_SCHEDULE_ADHERENCE</dt>
     * <dd>
     * <p>
     * This metric is available only in Amazon Web Services Regions where <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     * >Forecasting, capacity planning, and scheduling</a> is available.
     * </p>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_SCHEDULED_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only in Amazon Web Services Regions where <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     * >Forecasting, capacity planning, and scheduling</a> is available.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AVG_ABANDON_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_ACTIVE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AVG_AFTER_CONTACT_WORK_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_AGENT_CONNECTING_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>. For now, this
     * metric only supports the following as <code>INITIATION_METHOD</code>:
     * <code>INBOUND</code> | <code>OUTBOUND</code> | <code>CALLBACK</code> |
     * <code>API</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * <note>
     * <p>
     * The <code>Negate</code> key in Metric Level Filters is not applicable for
     * this metric.
     * </p>
     * </note></dd>
     * <dt>AVG_AGENT_PAUSE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AVG_CONTACT_DURATION</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_CONVERSATION_DURATION</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_GREETING_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_HANDLE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype,
     * RoutingStepExpression
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_HOLD_TIME_ALL_CONTACTS</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_HOLDS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_INTERACTION_AND_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_INTERACTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Feature,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_INTERRUPTIONS_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_INTERRUPTION_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_NON_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_QUEUE_ANSWER_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Feature,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_RESOLUTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_TALK_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_TALK_TIME_CUSTOMER</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_ABANDONED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype,
     * RoutingStepExpression
     * </p>
     * </dd>
     * <dt>CONTACTS_CREATED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Feature,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>,
     * <code>DISCONNECT_REASON</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype,
     * RoutingStepExpression
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>CONTACTS_HANDLED_BY_CONNECTED_TO_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Agent, Agent Hierarchy,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_HOLD_ABANDONS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_ON_HOLD_AGENT_DISCONNECT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_ON_HOLD_CUSTOMER_DISCONNECT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_PUT_ON_HOLD</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_EXTERNAL</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_INTERNAL</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_QUEUED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_QUEUED_BY_ENQUEUE</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Agent, Agent Hierarchy,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_RESOLVED_IN_X</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code> enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_BY_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_FROM_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>MAX_QUEUED_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_CONTACTS_STEP_EXPIRED</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, RoutingStepExpression
     * </p>
     * </dd>
     * <dt>PERCENT_CONTACTS_STEP_JOINED</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, RoutingStepExpression
     * </p>
     * </dd>
     * <dt>PERCENT_NON_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_TALK_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_TALK_TIME_CUSTOMER</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>SERVICE_LEVEL</dt>
     * <dd>
     * <p>
     * You can include up to 20 SERVICE_LEVEL metrics in a request.
     * </p>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code>, enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>STEP_CONTACTS_QUEUED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, RoutingStepExpression
     * </p>
     * </dd>
     * <dt>SUM_AFTER_CONTACT_WORK_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_CONNECTING_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>. This metric only
     * supports the following filter keys as <code>INITIATION_METHOD</code>:
     * <code>INBOUND</code> | <code>OUTBOUND</code> | <code>CALLBACK</code> |
     * <code>API</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * <note>
     * <p>
     * The <code>Negate</code> key in Metric Level Filters is not applicable for
     * this metric.
     * </p>
     * </note></dd>
     * <dt>SUM_CONTACT_FLOW_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_CONTACT_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_CONTACTS_ANSWERED_IN_X</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code>, enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>SUM_CONTACTS_ABANDONED_IN_X</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code>, enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>SUM_CONTACTS_DISCONNECTED</dt>
     * <dd>
     * <p>
     * Valid metric filter key: <code>DISCONNECT_REASON</code>
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>SUM_ERROR_STATUS_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_HANDLE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_IDLE_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_INTERACTION_AND_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_INTERACTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_NON_PRODUCTIVE_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_ONLINE_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_RETRY_CALLBACK_ATTEMPTS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * </dl>
     */
    private java.util.List<MetricV2> metrics;

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource. This includes the
     * <code>instanceId</code> an Amazon Connect instance.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource. This includes the
     *         <code>instanceId</code> an Amazon Connect instance.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource. This includes the
     * <code>instanceId</code> an Amazon Connect instance.
     * </p>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resource. This includes
     *            the <code>instanceId</code> an Amazon Connect instance.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource. This includes the
     * <code>instanceId</code> an Amazon Connect instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resource. This includes
     *            the <code>instanceId</code> an Amazon Connect instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataV2Request withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format, at which to start the reporting
     * interval for the retrieval of historical metrics data. The time must be
     * before the end time timestamp. The start and end time depends on the
     * <code>IntervalPeriod</code> selected. By default the time range between
     * start and end time is 35 days. Historical metrics are available for 3
     * months.
     * </p>
     *
     * @return <p>
     *         The timestamp, in UNIX Epoch time format, at which to start the
     *         reporting interval for the retrieval of historical metrics data.
     *         The time must be before the end time timestamp. The start and end
     *         time depends on the <code>IntervalPeriod</code> selected. By
     *         default the time range between start and end time is 35 days.
     *         Historical metrics are available for 3 months.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format, at which to start the reporting
     * interval for the retrieval of historical metrics data. The time must be
     * before the end time timestamp. The start and end time depends on the
     * <code>IntervalPeriod</code> selected. By default the time range between
     * start and end time is 35 days. Historical metrics are available for 3
     * months.
     * </p>
     *
     * @param startTime <p>
     *            The timestamp, in UNIX Epoch time format, at which to start
     *            the reporting interval for the retrieval of historical metrics
     *            data. The time must be before the end time timestamp. The
     *            start and end time depends on the <code>IntervalPeriod</code>
     *            selected. By default the time range between start and end time
     *            is 35 days. Historical metrics are available for 3 months.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format, at which to start the reporting
     * interval for the retrieval of historical metrics data. The time must be
     * before the end time timestamp. The start and end time depends on the
     * <code>IntervalPeriod</code> selected. By default the time range between
     * start and end time is 35 days. Historical metrics are available for 3
     * months.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The timestamp, in UNIX Epoch time format, at which to start
     *            the reporting interval for the retrieval of historical metrics
     *            data. The time must be before the end time timestamp. The
     *            start and end time depends on the <code>IntervalPeriod</code>
     *            selected. By default the time range between start and end time
     *            is 35 days. Historical metrics are available for 3 months.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataV2Request withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format, at which to end the reporting
     * interval for the retrieval of historical metrics data. The time must be
     * later than the start time timestamp. It cannot be later than the current
     * timestamp.
     * </p>
     *
     * @return <p>
     *         The timestamp, in UNIX Epoch time format, at which to end the
     *         reporting interval for the retrieval of historical metrics data.
     *         The time must be later than the start time timestamp. It cannot
     *         be later than the current timestamp.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format, at which to end the reporting
     * interval for the retrieval of historical metrics data. The time must be
     * later than the start time timestamp. It cannot be later than the current
     * timestamp.
     * </p>
     *
     * @param endTime <p>
     *            The timestamp, in UNIX Epoch time format, at which to end the
     *            reporting interval for the retrieval of historical metrics
     *            data. The time must be later than the start time timestamp. It
     *            cannot be later than the current timestamp.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format, at which to end the reporting
     * interval for the retrieval of historical metrics data. The time must be
     * later than the start time timestamp. It cannot be later than the current
     * timestamp.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The timestamp, in UNIX Epoch time format, at which to end the
     *            reporting interval for the retrieval of historical metrics
     *            data. The time must be later than the start time timestamp. It
     *            cannot be later than the current timestamp.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataV2Request withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The interval period and timezone to apply to returned metrics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IntervalPeriod</code>: An aggregated grouping applied to request
     * metrics. Valid <code>IntervalPeriod</code> values are:
     * <code>FIFTEEN_MIN</code> | <code>THIRTY_MIN</code> | <code>HOUR</code> |
     * <code>DAY</code> | <code>WEEK</code> | <code>TOTAL</code>.
     * </p>
     * <p>
     * For example, if <code>IntervalPeriod</code> is selected
     * <code>THIRTY_MIN</code>, <code>StartTime</code> and <code>EndTime</code>
     * differs by 1 day, then Amazon Connect returns 48 results in the response.
     * Each result is aggregated by the THIRTY_MIN period. By default Amazon
     * Connect aggregates results based on the <code>TOTAL</code> interval
     * period.
     * </p>
     * <p>
     * The following list describes restrictions on <code>StartTime</code> and
     * <code>EndTime</code> based on which <code>IntervalPeriod</code> is
     * requested.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIFTEEN_MIN</code>: The difference between <code>StartTime</code>
     * and <code>EndTime</code> must be less than 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIRTY_MIN</code>: The difference between <code>StartTime</code>
     * and <code>EndTime</code> must be less than 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOUR</code>: The difference between <code>StartTime</code> and
     * <code>EndTime</code> must be less than 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAY</code>: The difference between <code>StartTime</code> and
     * <code>EndTime</code> must be less than 35 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WEEK</code>: The difference between <code>StartTime</code> and
     * <code>EndTime</code> must be less than 35 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code>: The difference between <code>StartTime</code> and
     * <code>EndTime</code> must be less than 35 days.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>TimeZone</code>: The timezone applied to requested metrics.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The interval period and timezone to apply to returned metrics.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IntervalPeriod</code>: An aggregated grouping applied to
     *         request metrics. Valid <code>IntervalPeriod</code> values are:
     *         <code>FIFTEEN_MIN</code> | <code>THIRTY_MIN</code> |
     *         <code>HOUR</code> | <code>DAY</code> | <code>WEEK</code> |
     *         <code>TOTAL</code>.
     *         </p>
     *         <p>
     *         For example, if <code>IntervalPeriod</code> is selected
     *         <code>THIRTY_MIN</code>, <code>StartTime</code> and
     *         <code>EndTime</code> differs by 1 day, then Amazon Connect
     *         returns 48 results in the response. Each result is aggregated by
     *         the THIRTY_MIN period. By default Amazon Connect aggregates
     *         results based on the <code>TOTAL</code> interval period.
     *         </p>
     *         <p>
     *         The following list describes restrictions on
     *         <code>StartTime</code> and <code>EndTime</code> based on which
     *         <code>IntervalPeriod</code> is requested.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FIFTEEN_MIN</code>: The difference between
     *         <code>StartTime</code> and <code>EndTime</code> must be less than
     *         3 days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>THIRTY_MIN</code>: The difference between
     *         <code>StartTime</code> and <code>EndTime</code> must be less than
     *         3 days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HOUR</code>: The difference between <code>StartTime</code>
     *         and <code>EndTime</code> must be less than 3 days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DAY</code>: The difference between <code>StartTime</code>
     *         and <code>EndTime</code> must be less than 35 days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WEEK</code>: The difference between <code>StartTime</code>
     *         and <code>EndTime</code> must be less than 35 days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TOTAL</code>: The difference between <code>StartTime</code>
     *         and <code>EndTime</code> must be less than 35 days.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TimeZone</code>: The timezone applied to requested metrics.
     *         </p>
     *         </li>
     *         </ul>
     */
    public IntervalDetails getInterval() {
        return interval;
    }

    /**
     * <p>
     * The interval period and timezone to apply to returned metrics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IntervalPeriod</code>: An aggregated grouping applied to request
     * metrics. Valid <code>IntervalPeriod</code> values are:
     * <code>FIFTEEN_MIN</code> | <code>THIRTY_MIN</code> | <code>HOUR</code> |
     * <code>DAY</code> | <code>WEEK</code> | <code>TOTAL</code>.
     * </p>
     * <p>
     * For example, if <code>IntervalPeriod</code> is selected
     * <code>THIRTY_MIN</code>, <code>StartTime</code> and <code>EndTime</code>
     * differs by 1 day, then Amazon Connect returns 48 results in the response.
     * Each result is aggregated by the THIRTY_MIN period. By default Amazon
     * Connect aggregates results based on the <code>TOTAL</code> interval
     * period.
     * </p>
     * <p>
     * The following list describes restrictions on <code>StartTime</code> and
     * <code>EndTime</code> based on which <code>IntervalPeriod</code> is
     * requested.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIFTEEN_MIN</code>: The difference between <code>StartTime</code>
     * and <code>EndTime</code> must be less than 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIRTY_MIN</code>: The difference between <code>StartTime</code>
     * and <code>EndTime</code> must be less than 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOUR</code>: The difference between <code>StartTime</code> and
     * <code>EndTime</code> must be less than 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAY</code>: The difference between <code>StartTime</code> and
     * <code>EndTime</code> must be less than 35 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WEEK</code>: The difference between <code>StartTime</code> and
     * <code>EndTime</code> must be less than 35 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code>: The difference between <code>StartTime</code> and
     * <code>EndTime</code> must be less than 35 days.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>TimeZone</code>: The timezone applied to requested metrics.
     * </p>
     * </li>
     * </ul>
     *
     * @param interval <p>
     *            The interval period and timezone to apply to returned metrics.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IntervalPeriod</code>: An aggregated grouping applied to
     *            request metrics. Valid <code>IntervalPeriod</code> values are:
     *            <code>FIFTEEN_MIN</code> | <code>THIRTY_MIN</code> |
     *            <code>HOUR</code> | <code>DAY</code> | <code>WEEK</code> |
     *            <code>TOTAL</code>.
     *            </p>
     *            <p>
     *            For example, if <code>IntervalPeriod</code> is selected
     *            <code>THIRTY_MIN</code>, <code>StartTime</code> and
     *            <code>EndTime</code> differs by 1 day, then Amazon Connect
     *            returns 48 results in the response. Each result is aggregated
     *            by the THIRTY_MIN period. By default Amazon Connect aggregates
     *            results based on the <code>TOTAL</code> interval period.
     *            </p>
     *            <p>
     *            The following list describes restrictions on
     *            <code>StartTime</code> and <code>EndTime</code> based on which
     *            <code>IntervalPeriod</code> is requested.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FIFTEEN_MIN</code>: The difference between
     *            <code>StartTime</code> and <code>EndTime</code> must be less
     *            than 3 days.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>THIRTY_MIN</code>: The difference between
     *            <code>StartTime</code> and <code>EndTime</code> must be less
     *            than 3 days.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HOUR</code>: The difference between
     *            <code>StartTime</code> and <code>EndTime</code> must be less
     *            than 3 days.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DAY</code>: The difference between
     *            <code>StartTime</code> and <code>EndTime</code> must be less
     *            than 35 days.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>WEEK</code>: The difference between
     *            <code>StartTime</code> and <code>EndTime</code> must be less
     *            than 35 days.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TOTAL</code>: The difference between
     *            <code>StartTime</code> and <code>EndTime</code> must be less
     *            than 35 days.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TimeZone</code>: The timezone applied to requested
     *            metrics.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setInterval(IntervalDetails interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The interval period and timezone to apply to returned metrics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IntervalPeriod</code>: An aggregated grouping applied to request
     * metrics. Valid <code>IntervalPeriod</code> values are:
     * <code>FIFTEEN_MIN</code> | <code>THIRTY_MIN</code> | <code>HOUR</code> |
     * <code>DAY</code> | <code>WEEK</code> | <code>TOTAL</code>.
     * </p>
     * <p>
     * For example, if <code>IntervalPeriod</code> is selected
     * <code>THIRTY_MIN</code>, <code>StartTime</code> and <code>EndTime</code>
     * differs by 1 day, then Amazon Connect returns 48 results in the response.
     * Each result is aggregated by the THIRTY_MIN period. By default Amazon
     * Connect aggregates results based on the <code>TOTAL</code> interval
     * period.
     * </p>
     * <p>
     * The following list describes restrictions on <code>StartTime</code> and
     * <code>EndTime</code> based on which <code>IntervalPeriod</code> is
     * requested.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIFTEEN_MIN</code>: The difference between <code>StartTime</code>
     * and <code>EndTime</code> must be less than 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIRTY_MIN</code>: The difference between <code>StartTime</code>
     * and <code>EndTime</code> must be less than 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOUR</code>: The difference between <code>StartTime</code> and
     * <code>EndTime</code> must be less than 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAY</code>: The difference between <code>StartTime</code> and
     * <code>EndTime</code> must be less than 35 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WEEK</code>: The difference between <code>StartTime</code> and
     * <code>EndTime</code> must be less than 35 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code>: The difference between <code>StartTime</code> and
     * <code>EndTime</code> must be less than 35 days.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>TimeZone</code>: The timezone applied to requested metrics.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param interval <p>
     *            The interval period and timezone to apply to returned metrics.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IntervalPeriod</code>: An aggregated grouping applied to
     *            request metrics. Valid <code>IntervalPeriod</code> values are:
     *            <code>FIFTEEN_MIN</code> | <code>THIRTY_MIN</code> |
     *            <code>HOUR</code> | <code>DAY</code> | <code>WEEK</code> |
     *            <code>TOTAL</code>.
     *            </p>
     *            <p>
     *            For example, if <code>IntervalPeriod</code> is selected
     *            <code>THIRTY_MIN</code>, <code>StartTime</code> and
     *            <code>EndTime</code> differs by 1 day, then Amazon Connect
     *            returns 48 results in the response. Each result is aggregated
     *            by the THIRTY_MIN period. By default Amazon Connect aggregates
     *            results based on the <code>TOTAL</code> interval period.
     *            </p>
     *            <p>
     *            The following list describes restrictions on
     *            <code>StartTime</code> and <code>EndTime</code> based on which
     *            <code>IntervalPeriod</code> is requested.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FIFTEEN_MIN</code>: The difference between
     *            <code>StartTime</code> and <code>EndTime</code> must be less
     *            than 3 days.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>THIRTY_MIN</code>: The difference between
     *            <code>StartTime</code> and <code>EndTime</code> must be less
     *            than 3 days.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HOUR</code>: The difference between
     *            <code>StartTime</code> and <code>EndTime</code> must be less
     *            than 3 days.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DAY</code>: The difference between
     *            <code>StartTime</code> and <code>EndTime</code> must be less
     *            than 35 days.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>WEEK</code>: The difference between
     *            <code>StartTime</code> and <code>EndTime</code> must be less
     *            than 35 days.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TOTAL</code>: The difference between
     *            <code>StartTime</code> and <code>EndTime</code> must be less
     *            than 35 days.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TimeZone</code>: The timezone applied to requested
     *            metrics.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataV2Request withInterval(IntervalDetails interval) {
        this.interval = interval;
        return this;
    }

    /**
     * <p>
     * The filters to apply to returned metrics. You can filter on the following
     * resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Queues
     * </p>
     * </li>
     * <li>
     * <p>
     * Routing profiles
     * </p>
     * </li>
     * <li>
     * <p>
     * Agents
     * </p>
     * </li>
     * <li>
     * <p>
     * Channels
     * </p>
     * </li>
     * <li>
     * <p>
     * User hierarchy groups
     * </p>
     * </li>
     * <li>
     * <p>
     * Feature
     * </p>
     * </li>
     * <li>
     * <p>
     * Routing step expression
     * </p>
     * </li>
     * </ul>
     * <p>
     * At least one filter must be passed from queues, routing profiles, agents,
     * or user hierarchy groups.
     * </p>
     * <p>
     * To filter by phone number, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-historical-metrics-report.html"
     * >Create a historical metrics report</a> in the <i>Amazon Connect
     * Administrator's Guide</i>.
     * </p>
     * <p>
     * Note the following limits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Filter keys</b>: A maximum of 5 filter keys are supported in a single
     * request. Valid filter keys: <code>QUEUE</code> |
     * <code>ROUTING_PROFILE</code> | <code>AGENT</code> | <code>CHANNEL</code>
     * | <code>AGENT_HIERARCHY_LEVEL_ONE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_TWO</code> |
     * <code>AGENT_HIERARCHY_LEVEL_THREE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FOUR</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FIVE</code> | <code>FEATURE</code> |
     * <code>contact/segmentAttributes/connect:Subtype</code> |
     * <code>ROUTING_STEP_EXPRESSION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Filter values</b>: A maximum of 100 filter values are supported in a
     * single request. VOICE, CHAT, and TASK are valid <code>filterValue</code>
     * for the CHANNEL filter key. They do not count towards limitation of 100
     * filter values. For example, a GetMetricDataV2 request can filter by 50
     * queues, 35 agents, and 15 routing profiles for a total of 100 filter
     * values, along with 3 channel filters.
     * </p>
     * <p>
     * <code>contact_lens_conversational_analytics</code> is a valid filterValue
     * for the <code>FEATURE</code> filter key. It is available only to contacts
     * analyzed by Contact Lens conversational analytics.
     * </p>
     * <p>
     * <code>connect:Chat</code>, <code>connect:SMS</code>,
     * <code>connect:Telephony</code>, and <code>connect:WebRTC</code> are valid
     * <code>filterValue</code> examples (not exhaustive) for the
     * <code>contact/segmentAttributes/connect:Subtype filter</code> key.
     * </p>
     * <p>
     * <code>ROUTING_STEP_EXPRESSION</code> is a valid filter key with a filter
     * value up to 3000 length. This filter is case and order sensitive. JSON
     * string fields must be sorted in ascending order and JSON array order
     * should be kept as is.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The filters to apply to returned metrics. You can filter on the
     *         following resources:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Queues
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Routing profiles
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Agents
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Channels
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         User hierarchy groups
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Feature
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Routing step expression
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         At least one filter must be passed from queues, routing profiles,
     *         agents, or user hierarchy groups.
     *         </p>
     *         <p>
     *         To filter by phone number, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/create-historical-metrics-report.html"
     *         >Create a historical metrics report</a> in the <i>Amazon Connect
     *         Administrator's Guide</i>.
     *         </p>
     *         <p>
     *         Note the following limits:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Filter keys</b>: A maximum of 5 filter keys are supported in a
     *         single request. Valid filter keys: <code>QUEUE</code> |
     *         <code>ROUTING_PROFILE</code> | <code>AGENT</code> |
     *         <code>CHANNEL</code> | <code>AGENT_HIERARCHY_LEVEL_ONE</code> |
     *         <code>AGENT_HIERARCHY_LEVEL_TWO</code> |
     *         <code>AGENT_HIERARCHY_LEVEL_THREE</code> |
     *         <code>AGENT_HIERARCHY_LEVEL_FOUR</code> |
     *         <code>AGENT_HIERARCHY_LEVEL_FIVE</code> | <code>FEATURE</code> |
     *         <code>contact/segmentAttributes/connect:Subtype</code> |
     *         <code>ROUTING_STEP_EXPRESSION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Filter values</b>: A maximum of 100 filter values are
     *         supported in a single request. VOICE, CHAT, and TASK are valid
     *         <code>filterValue</code> for the CHANNEL filter key. They do not
     *         count towards limitation of 100 filter values. For example, a
     *         GetMetricDataV2 request can filter by 50 queues, 35 agents, and
     *         15 routing profiles for a total of 100 filter values, along with
     *         3 channel filters.
     *         </p>
     *         <p>
     *         <code>contact_lens_conversational_analytics</code> is a valid
     *         filterValue for the <code>FEATURE</code> filter key. It is
     *         available only to contacts analyzed by Contact Lens
     *         conversational analytics.
     *         </p>
     *         <p>
     *         <code>connect:Chat</code>, <code>connect:SMS</code>,
     *         <code>connect:Telephony</code>, and <code>connect:WebRTC</code>
     *         are valid <code>filterValue</code> examples (not exhaustive) for
     *         the <code>contact/segmentAttributes/connect:Subtype filter</code>
     *         key.
     *         </p>
     *         <p>
     *         <code>ROUTING_STEP_EXPRESSION</code> is a valid filter key with a
     *         filter value up to 3000 length. This filter is case and order
     *         sensitive. JSON string fields must be sorted in ascending order
     *         and JSON array order should be kept as is.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<FilterV2> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters to apply to returned metrics. You can filter on the following
     * resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Queues
     * </p>
     * </li>
     * <li>
     * <p>
     * Routing profiles
     * </p>
     * </li>
     * <li>
     * <p>
     * Agents
     * </p>
     * </li>
     * <li>
     * <p>
     * Channels
     * </p>
     * </li>
     * <li>
     * <p>
     * User hierarchy groups
     * </p>
     * </li>
     * <li>
     * <p>
     * Feature
     * </p>
     * </li>
     * <li>
     * <p>
     * Routing step expression
     * </p>
     * </li>
     * </ul>
     * <p>
     * At least one filter must be passed from queues, routing profiles, agents,
     * or user hierarchy groups.
     * </p>
     * <p>
     * To filter by phone number, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-historical-metrics-report.html"
     * >Create a historical metrics report</a> in the <i>Amazon Connect
     * Administrator's Guide</i>.
     * </p>
     * <p>
     * Note the following limits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Filter keys</b>: A maximum of 5 filter keys are supported in a single
     * request. Valid filter keys: <code>QUEUE</code> |
     * <code>ROUTING_PROFILE</code> | <code>AGENT</code> | <code>CHANNEL</code>
     * | <code>AGENT_HIERARCHY_LEVEL_ONE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_TWO</code> |
     * <code>AGENT_HIERARCHY_LEVEL_THREE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FOUR</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FIVE</code> | <code>FEATURE</code> |
     * <code>contact/segmentAttributes/connect:Subtype</code> |
     * <code>ROUTING_STEP_EXPRESSION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Filter values</b>: A maximum of 100 filter values are supported in a
     * single request. VOICE, CHAT, and TASK are valid <code>filterValue</code>
     * for the CHANNEL filter key. They do not count towards limitation of 100
     * filter values. For example, a GetMetricDataV2 request can filter by 50
     * queues, 35 agents, and 15 routing profiles for a total of 100 filter
     * values, along with 3 channel filters.
     * </p>
     * <p>
     * <code>contact_lens_conversational_analytics</code> is a valid filterValue
     * for the <code>FEATURE</code> filter key. It is available only to contacts
     * analyzed by Contact Lens conversational analytics.
     * </p>
     * <p>
     * <code>connect:Chat</code>, <code>connect:SMS</code>,
     * <code>connect:Telephony</code>, and <code>connect:WebRTC</code> are valid
     * <code>filterValue</code> examples (not exhaustive) for the
     * <code>contact/segmentAttributes/connect:Subtype filter</code> key.
     * </p>
     * <p>
     * <code>ROUTING_STEP_EXPRESSION</code> is a valid filter key with a filter
     * value up to 3000 length. This filter is case and order sensitive. JSON
     * string fields must be sorted in ascending order and JSON array order
     * should be kept as is.
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            The filters to apply to returned metrics. You can filter on
     *            the following resources:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Queues
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Routing profiles
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Agents
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Channels
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            User hierarchy groups
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Feature
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Routing step expression
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            At least one filter must be passed from queues, routing
     *            profiles, agents, or user hierarchy groups.
     *            </p>
     *            <p>
     *            To filter by phone number, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/create-historical-metrics-report.html"
     *            >Create a historical metrics report</a> in the <i>Amazon
     *            Connect Administrator's Guide</i>.
     *            </p>
     *            <p>
     *            Note the following limits:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Filter keys</b>: A maximum of 5 filter keys are supported
     *            in a single request. Valid filter keys: <code>QUEUE</code> |
     *            <code>ROUTING_PROFILE</code> | <code>AGENT</code> |
     *            <code>CHANNEL</code> | <code>AGENT_HIERARCHY_LEVEL_ONE</code>
     *            | <code>AGENT_HIERARCHY_LEVEL_TWO</code> |
     *            <code>AGENT_HIERARCHY_LEVEL_THREE</code> |
     *            <code>AGENT_HIERARCHY_LEVEL_FOUR</code> |
     *            <code>AGENT_HIERARCHY_LEVEL_FIVE</code> | <code>FEATURE</code>
     *            | <code>contact/segmentAttributes/connect:Subtype</code> |
     *            <code>ROUTING_STEP_EXPRESSION</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Filter values</b>: A maximum of 100 filter values are
     *            supported in a single request. VOICE, CHAT, and TASK are valid
     *            <code>filterValue</code> for the CHANNEL filter key. They do
     *            not count towards limitation of 100 filter values. For
     *            example, a GetMetricDataV2 request can filter by 50 queues, 35
     *            agents, and 15 routing profiles for a total of 100 filter
     *            values, along with 3 channel filters.
     *            </p>
     *            <p>
     *            <code>contact_lens_conversational_analytics</code> is a valid
     *            filterValue for the <code>FEATURE</code> filter key. It is
     *            available only to contacts analyzed by Contact Lens
     *            conversational analytics.
     *            </p>
     *            <p>
     *            <code>connect:Chat</code>, <code>connect:SMS</code>,
     *            <code>connect:Telephony</code>, and
     *            <code>connect:WebRTC</code> are valid <code>filterValue</code>
     *            examples (not exhaustive) for the
     *            <code>contact/segmentAttributes/connect:Subtype filter</code>
     *            key.
     *            </p>
     *            <p>
     *            <code>ROUTING_STEP_EXPRESSION</code> is a valid filter key
     *            with a filter value up to 3000 length. This filter is case and
     *            order sensitive. JSON string fields must be sorted in
     *            ascending order and JSON array order should be kept as is.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFilters(java.util.Collection<FilterV2> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<FilterV2>(filters);
    }

    /**
     * <p>
     * The filters to apply to returned metrics. You can filter on the following
     * resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Queues
     * </p>
     * </li>
     * <li>
     * <p>
     * Routing profiles
     * </p>
     * </li>
     * <li>
     * <p>
     * Agents
     * </p>
     * </li>
     * <li>
     * <p>
     * Channels
     * </p>
     * </li>
     * <li>
     * <p>
     * User hierarchy groups
     * </p>
     * </li>
     * <li>
     * <p>
     * Feature
     * </p>
     * </li>
     * <li>
     * <p>
     * Routing step expression
     * </p>
     * </li>
     * </ul>
     * <p>
     * At least one filter must be passed from queues, routing profiles, agents,
     * or user hierarchy groups.
     * </p>
     * <p>
     * To filter by phone number, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-historical-metrics-report.html"
     * >Create a historical metrics report</a> in the <i>Amazon Connect
     * Administrator's Guide</i>.
     * </p>
     * <p>
     * Note the following limits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Filter keys</b>: A maximum of 5 filter keys are supported in a single
     * request. Valid filter keys: <code>QUEUE</code> |
     * <code>ROUTING_PROFILE</code> | <code>AGENT</code> | <code>CHANNEL</code>
     * | <code>AGENT_HIERARCHY_LEVEL_ONE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_TWO</code> |
     * <code>AGENT_HIERARCHY_LEVEL_THREE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FOUR</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FIVE</code> | <code>FEATURE</code> |
     * <code>contact/segmentAttributes/connect:Subtype</code> |
     * <code>ROUTING_STEP_EXPRESSION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Filter values</b>: A maximum of 100 filter values are supported in a
     * single request. VOICE, CHAT, and TASK are valid <code>filterValue</code>
     * for the CHANNEL filter key. They do not count towards limitation of 100
     * filter values. For example, a GetMetricDataV2 request can filter by 50
     * queues, 35 agents, and 15 routing profiles for a total of 100 filter
     * values, along with 3 channel filters.
     * </p>
     * <p>
     * <code>contact_lens_conversational_analytics</code> is a valid filterValue
     * for the <code>FEATURE</code> filter key. It is available only to contacts
     * analyzed by Contact Lens conversational analytics.
     * </p>
     * <p>
     * <code>connect:Chat</code>, <code>connect:SMS</code>,
     * <code>connect:Telephony</code>, and <code>connect:WebRTC</code> are valid
     * <code>filterValue</code> examples (not exhaustive) for the
     * <code>contact/segmentAttributes/connect:Subtype filter</code> key.
     * </p>
     * <p>
     * <code>ROUTING_STEP_EXPRESSION</code> is a valid filter key with a filter
     * value up to 3000 length. This filter is case and order sensitive. JSON
     * string fields must be sorted in ascending order and JSON array order
     * should be kept as is.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters to apply to returned metrics. You can filter on
     *            the following resources:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Queues
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Routing profiles
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Agents
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Channels
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            User hierarchy groups
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Feature
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Routing step expression
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            At least one filter must be passed from queues, routing
     *            profiles, agents, or user hierarchy groups.
     *            </p>
     *            <p>
     *            To filter by phone number, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/create-historical-metrics-report.html"
     *            >Create a historical metrics report</a> in the <i>Amazon
     *            Connect Administrator's Guide</i>.
     *            </p>
     *            <p>
     *            Note the following limits:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Filter keys</b>: A maximum of 5 filter keys are supported
     *            in a single request. Valid filter keys: <code>QUEUE</code> |
     *            <code>ROUTING_PROFILE</code> | <code>AGENT</code> |
     *            <code>CHANNEL</code> | <code>AGENT_HIERARCHY_LEVEL_ONE</code>
     *            | <code>AGENT_HIERARCHY_LEVEL_TWO</code> |
     *            <code>AGENT_HIERARCHY_LEVEL_THREE</code> |
     *            <code>AGENT_HIERARCHY_LEVEL_FOUR</code> |
     *            <code>AGENT_HIERARCHY_LEVEL_FIVE</code> | <code>FEATURE</code>
     *            | <code>contact/segmentAttributes/connect:Subtype</code> |
     *            <code>ROUTING_STEP_EXPRESSION</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Filter values</b>: A maximum of 100 filter values are
     *            supported in a single request. VOICE, CHAT, and TASK are valid
     *            <code>filterValue</code> for the CHANNEL filter key. They do
     *            not count towards limitation of 100 filter values. For
     *            example, a GetMetricDataV2 request can filter by 50 queues, 35
     *            agents, and 15 routing profiles for a total of 100 filter
     *            values, along with 3 channel filters.
     *            </p>
     *            <p>
     *            <code>contact_lens_conversational_analytics</code> is a valid
     *            filterValue for the <code>FEATURE</code> filter key. It is
     *            available only to contacts analyzed by Contact Lens
     *            conversational analytics.
     *            </p>
     *            <p>
     *            <code>connect:Chat</code>, <code>connect:SMS</code>,
     *            <code>connect:Telephony</code>, and
     *            <code>connect:WebRTC</code> are valid <code>filterValue</code>
     *            examples (not exhaustive) for the
     *            <code>contact/segmentAttributes/connect:Subtype filter</code>
     *            key.
     *            </p>
     *            <p>
     *            <code>ROUTING_STEP_EXPRESSION</code> is a valid filter key
     *            with a filter value up to 3000 length. This filter is case and
     *            order sensitive. JSON string fields must be sorted in
     *            ascending order and JSON array order should be kept as is.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataV2Request withFilters(FilterV2... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<FilterV2>(filters.length);
        }
        for (FilterV2 value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The filters to apply to returned metrics. You can filter on the following
     * resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Queues
     * </p>
     * </li>
     * <li>
     * <p>
     * Routing profiles
     * </p>
     * </li>
     * <li>
     * <p>
     * Agents
     * </p>
     * </li>
     * <li>
     * <p>
     * Channels
     * </p>
     * </li>
     * <li>
     * <p>
     * User hierarchy groups
     * </p>
     * </li>
     * <li>
     * <p>
     * Feature
     * </p>
     * </li>
     * <li>
     * <p>
     * Routing step expression
     * </p>
     * </li>
     * </ul>
     * <p>
     * At least one filter must be passed from queues, routing profiles, agents,
     * or user hierarchy groups.
     * </p>
     * <p>
     * To filter by phone number, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-historical-metrics-report.html"
     * >Create a historical metrics report</a> in the <i>Amazon Connect
     * Administrator's Guide</i>.
     * </p>
     * <p>
     * Note the following limits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Filter keys</b>: A maximum of 5 filter keys are supported in a single
     * request. Valid filter keys: <code>QUEUE</code> |
     * <code>ROUTING_PROFILE</code> | <code>AGENT</code> | <code>CHANNEL</code>
     * | <code>AGENT_HIERARCHY_LEVEL_ONE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_TWO</code> |
     * <code>AGENT_HIERARCHY_LEVEL_THREE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FOUR</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FIVE</code> | <code>FEATURE</code> |
     * <code>contact/segmentAttributes/connect:Subtype</code> |
     * <code>ROUTING_STEP_EXPRESSION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Filter values</b>: A maximum of 100 filter values are supported in a
     * single request. VOICE, CHAT, and TASK are valid <code>filterValue</code>
     * for the CHANNEL filter key. They do not count towards limitation of 100
     * filter values. For example, a GetMetricDataV2 request can filter by 50
     * queues, 35 agents, and 15 routing profiles for a total of 100 filter
     * values, along with 3 channel filters.
     * </p>
     * <p>
     * <code>contact_lens_conversational_analytics</code> is a valid filterValue
     * for the <code>FEATURE</code> filter key. It is available only to contacts
     * analyzed by Contact Lens conversational analytics.
     * </p>
     * <p>
     * <code>connect:Chat</code>, <code>connect:SMS</code>,
     * <code>connect:Telephony</code>, and <code>connect:WebRTC</code> are valid
     * <code>filterValue</code> examples (not exhaustive) for the
     * <code>contact/segmentAttributes/connect:Subtype filter</code> key.
     * </p>
     * <p>
     * <code>ROUTING_STEP_EXPRESSION</code> is a valid filter key with a filter
     * value up to 3000 length. This filter is case and order sensitive. JSON
     * string fields must be sorted in ascending order and JSON array order
     * should be kept as is.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters to apply to returned metrics. You can filter on
     *            the following resources:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Queues
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Routing profiles
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Agents
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Channels
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            User hierarchy groups
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Feature
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Routing step expression
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            At least one filter must be passed from queues, routing
     *            profiles, agents, or user hierarchy groups.
     *            </p>
     *            <p>
     *            To filter by phone number, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/create-historical-metrics-report.html"
     *            >Create a historical metrics report</a> in the <i>Amazon
     *            Connect Administrator's Guide</i>.
     *            </p>
     *            <p>
     *            Note the following limits:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Filter keys</b>: A maximum of 5 filter keys are supported
     *            in a single request. Valid filter keys: <code>QUEUE</code> |
     *            <code>ROUTING_PROFILE</code> | <code>AGENT</code> |
     *            <code>CHANNEL</code> | <code>AGENT_HIERARCHY_LEVEL_ONE</code>
     *            | <code>AGENT_HIERARCHY_LEVEL_TWO</code> |
     *            <code>AGENT_HIERARCHY_LEVEL_THREE</code> |
     *            <code>AGENT_HIERARCHY_LEVEL_FOUR</code> |
     *            <code>AGENT_HIERARCHY_LEVEL_FIVE</code> | <code>FEATURE</code>
     *            | <code>contact/segmentAttributes/connect:Subtype</code> |
     *            <code>ROUTING_STEP_EXPRESSION</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Filter values</b>: A maximum of 100 filter values are
     *            supported in a single request. VOICE, CHAT, and TASK are valid
     *            <code>filterValue</code> for the CHANNEL filter key. They do
     *            not count towards limitation of 100 filter values. For
     *            example, a GetMetricDataV2 request can filter by 50 queues, 35
     *            agents, and 15 routing profiles for a total of 100 filter
     *            values, along with 3 channel filters.
     *            </p>
     *            <p>
     *            <code>contact_lens_conversational_analytics</code> is a valid
     *            filterValue for the <code>FEATURE</code> filter key. It is
     *            available only to contacts analyzed by Contact Lens
     *            conversational analytics.
     *            </p>
     *            <p>
     *            <code>connect:Chat</code>, <code>connect:SMS</code>,
     *            <code>connect:Telephony</code>, and
     *            <code>connect:WebRTC</code> are valid <code>filterValue</code>
     *            examples (not exhaustive) for the
     *            <code>contact/segmentAttributes/connect:Subtype filter</code>
     *            key.
     *            </p>
     *            <p>
     *            <code>ROUTING_STEP_EXPRESSION</code> is a valid filter key
     *            with a filter value up to 3000 length. This filter is case and
     *            order sensitive. JSON string fields must be sorted in
     *            ascending order and JSON array order should be kept as is.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataV2Request withFilters(java.util.Collection<FilterV2> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The grouping applied to the metrics that are returned. For example, when
     * results are grouped by queue, the metrics returned are grouped by queue.
     * The values that are returned apply to the metrics for each queue. They
     * are not aggregated for all queues.
     * </p>
     * <p>
     * If no grouping is specified, a summary of all metrics is returned.
     * </p>
     * <p>
     * Valid grouping keys: <code>QUEUE</code> | <code>ROUTING_PROFILE</code> |
     * <code>AGENT</code> | <code>CHANNEL</code> |
     * <code>AGENT_HIERARCHY_LEVEL_ONE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_TWO</code> |
     * <code>AGENT_HIERARCHY_LEVEL_THREE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FOUR</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FIVE</code>,
     * <code>contact/segmentAttributes/connect:Subtype</code> |
     * <code>ROUTING_STEP_EXPRESSION</code>
     * </p>
     *
     * @return <p>
     *         The grouping applied to the metrics that are returned. For
     *         example, when results are grouped by queue, the metrics returned
     *         are grouped by queue. The values that are returned apply to the
     *         metrics for each queue. They are not aggregated for all queues.
     *         </p>
     *         <p>
     *         If no grouping is specified, a summary of all metrics is
     *         returned.
     *         </p>
     *         <p>
     *         Valid grouping keys: <code>QUEUE</code> |
     *         <code>ROUTING_PROFILE</code> | <code>AGENT</code> |
     *         <code>CHANNEL</code> | <code>AGENT_HIERARCHY_LEVEL_ONE</code> |
     *         <code>AGENT_HIERARCHY_LEVEL_TWO</code> |
     *         <code>AGENT_HIERARCHY_LEVEL_THREE</code> |
     *         <code>AGENT_HIERARCHY_LEVEL_FOUR</code> |
     *         <code>AGENT_HIERARCHY_LEVEL_FIVE</code>,
     *         <code>contact/segmentAttributes/connect:Subtype</code> |
     *         <code>ROUTING_STEP_EXPRESSION</code>
     *         </p>
     */
    public java.util.List<String> getGroupings() {
        return groupings;
    }

    /**
     * <p>
     * The grouping applied to the metrics that are returned. For example, when
     * results are grouped by queue, the metrics returned are grouped by queue.
     * The values that are returned apply to the metrics for each queue. They
     * are not aggregated for all queues.
     * </p>
     * <p>
     * If no grouping is specified, a summary of all metrics is returned.
     * </p>
     * <p>
     * Valid grouping keys: <code>QUEUE</code> | <code>ROUTING_PROFILE</code> |
     * <code>AGENT</code> | <code>CHANNEL</code> |
     * <code>AGENT_HIERARCHY_LEVEL_ONE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_TWO</code> |
     * <code>AGENT_HIERARCHY_LEVEL_THREE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FOUR</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FIVE</code>,
     * <code>contact/segmentAttributes/connect:Subtype</code> |
     * <code>ROUTING_STEP_EXPRESSION</code>
     * </p>
     *
     * @param groupings <p>
     *            The grouping applied to the metrics that are returned. For
     *            example, when results are grouped by queue, the metrics
     *            returned are grouped by queue. The values that are returned
     *            apply to the metrics for each queue. They are not aggregated
     *            for all queues.
     *            </p>
     *            <p>
     *            If no grouping is specified, a summary of all metrics is
     *            returned.
     *            </p>
     *            <p>
     *            Valid grouping keys: <code>QUEUE</code> |
     *            <code>ROUTING_PROFILE</code> | <code>AGENT</code> |
     *            <code>CHANNEL</code> | <code>AGENT_HIERARCHY_LEVEL_ONE</code>
     *            | <code>AGENT_HIERARCHY_LEVEL_TWO</code> |
     *            <code>AGENT_HIERARCHY_LEVEL_THREE</code> |
     *            <code>AGENT_HIERARCHY_LEVEL_FOUR</code> |
     *            <code>AGENT_HIERARCHY_LEVEL_FIVE</code>,
     *            <code>contact/segmentAttributes/connect:Subtype</code> |
     *            <code>ROUTING_STEP_EXPRESSION</code>
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
     * The grouping applied to the metrics that are returned. For example, when
     * results are grouped by queue, the metrics returned are grouped by queue.
     * The values that are returned apply to the metrics for each queue. They
     * are not aggregated for all queues.
     * </p>
     * <p>
     * If no grouping is specified, a summary of all metrics is returned.
     * </p>
     * <p>
     * Valid grouping keys: <code>QUEUE</code> | <code>ROUTING_PROFILE</code> |
     * <code>AGENT</code> | <code>CHANNEL</code> |
     * <code>AGENT_HIERARCHY_LEVEL_ONE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_TWO</code> |
     * <code>AGENT_HIERARCHY_LEVEL_THREE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FOUR</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FIVE</code>,
     * <code>contact/segmentAttributes/connect:Subtype</code> |
     * <code>ROUTING_STEP_EXPRESSION</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupings <p>
     *            The grouping applied to the metrics that are returned. For
     *            example, when results are grouped by queue, the metrics
     *            returned are grouped by queue. The values that are returned
     *            apply to the metrics for each queue. They are not aggregated
     *            for all queues.
     *            </p>
     *            <p>
     *            If no grouping is specified, a summary of all metrics is
     *            returned.
     *            </p>
     *            <p>
     *            Valid grouping keys: <code>QUEUE</code> |
     *            <code>ROUTING_PROFILE</code> | <code>AGENT</code> |
     *            <code>CHANNEL</code> | <code>AGENT_HIERARCHY_LEVEL_ONE</code>
     *            | <code>AGENT_HIERARCHY_LEVEL_TWO</code> |
     *            <code>AGENT_HIERARCHY_LEVEL_THREE</code> |
     *            <code>AGENT_HIERARCHY_LEVEL_FOUR</code> |
     *            <code>AGENT_HIERARCHY_LEVEL_FIVE</code>,
     *            <code>contact/segmentAttributes/connect:Subtype</code> |
     *            <code>ROUTING_STEP_EXPRESSION</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataV2Request withGroupings(String... groupings) {
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
     * The grouping applied to the metrics that are returned. For example, when
     * results are grouped by queue, the metrics returned are grouped by queue.
     * The values that are returned apply to the metrics for each queue. They
     * are not aggregated for all queues.
     * </p>
     * <p>
     * If no grouping is specified, a summary of all metrics is returned.
     * </p>
     * <p>
     * Valid grouping keys: <code>QUEUE</code> | <code>ROUTING_PROFILE</code> |
     * <code>AGENT</code> | <code>CHANNEL</code> |
     * <code>AGENT_HIERARCHY_LEVEL_ONE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_TWO</code> |
     * <code>AGENT_HIERARCHY_LEVEL_THREE</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FOUR</code> |
     * <code>AGENT_HIERARCHY_LEVEL_FIVE</code>,
     * <code>contact/segmentAttributes/connect:Subtype</code> |
     * <code>ROUTING_STEP_EXPRESSION</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupings <p>
     *            The grouping applied to the metrics that are returned. For
     *            example, when results are grouped by queue, the metrics
     *            returned are grouped by queue. The values that are returned
     *            apply to the metrics for each queue. They are not aggregated
     *            for all queues.
     *            </p>
     *            <p>
     *            If no grouping is specified, a summary of all metrics is
     *            returned.
     *            </p>
     *            <p>
     *            Valid grouping keys: <code>QUEUE</code> |
     *            <code>ROUTING_PROFILE</code> | <code>AGENT</code> |
     *            <code>CHANNEL</code> | <code>AGENT_HIERARCHY_LEVEL_ONE</code>
     *            | <code>AGENT_HIERARCHY_LEVEL_TWO</code> |
     *            <code>AGENT_HIERARCHY_LEVEL_THREE</code> |
     *            <code>AGENT_HIERARCHY_LEVEL_FOUR</code> |
     *            <code>AGENT_HIERARCHY_LEVEL_FIVE</code>,
     *            <code>contact/segmentAttributes/connect:Subtype</code> |
     *            <code>ROUTING_STEP_EXPRESSION</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataV2Request withGroupings(java.util.Collection<String> groupings) {
        setGroupings(groupings);
        return this;
    }

    /**
     * <p>
     * The metrics to retrieve. Specify the name, groupings, and filters for
     * each metric. The following historical metrics are available. For a
     * description of each metric, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
     * >Historical metrics definitions</a> in the <i>Amazon Connect
     * Administrator's Guide</i>.
     * </p>
     * <dl>
     * <dt>ABANDONMENT_RATE</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AGENT_ADHERENT_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only in Amazon Web Services Regions where <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     * >Forecasting, capacity planning, and scheduling</a> is available.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_ANSWER_RATE</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_NON_ADHERENT_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_NON_RESPONSE</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_NON_RESPONSE_WITHOUT_CUSTOMER_ABANDONS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * <p>
     * Data for this metric is available starting from October 1, 2023 0:00:00
     * GMT.
     * </p>
     * </dd>
     * <dt>AGENT_OCCUPANCY</dt>
     * <dd>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_SCHEDULE_ADHERENCE</dt>
     * <dd>
     * <p>
     * This metric is available only in Amazon Web Services Regions where <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     * >Forecasting, capacity planning, and scheduling</a> is available.
     * </p>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_SCHEDULED_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only in Amazon Web Services Regions where <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     * >Forecasting, capacity planning, and scheduling</a> is available.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AVG_ABANDON_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_ACTIVE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AVG_AFTER_CONTACT_WORK_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_AGENT_CONNECTING_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>. For now, this
     * metric only supports the following as <code>INITIATION_METHOD</code>:
     * <code>INBOUND</code> | <code>OUTBOUND</code> | <code>CALLBACK</code> |
     * <code>API</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * <note>
     * <p>
     * The <code>Negate</code> key in Metric Level Filters is not applicable for
     * this metric.
     * </p>
     * </note></dd>
     * <dt>AVG_AGENT_PAUSE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AVG_CONTACT_DURATION</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_CONVERSATION_DURATION</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_GREETING_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_HANDLE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype,
     * RoutingStepExpression
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_HOLD_TIME_ALL_CONTACTS</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_HOLDS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_INTERACTION_AND_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_INTERACTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Feature,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_INTERRUPTIONS_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_INTERRUPTION_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_NON_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_QUEUE_ANSWER_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Feature,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_RESOLUTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_TALK_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_TALK_TIME_CUSTOMER</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_ABANDONED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype,
     * RoutingStepExpression
     * </p>
     * </dd>
     * <dt>CONTACTS_CREATED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Feature,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>,
     * <code>DISCONNECT_REASON</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype,
     * RoutingStepExpression
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>CONTACTS_HANDLED_BY_CONNECTED_TO_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Agent, Agent Hierarchy,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_HOLD_ABANDONS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_ON_HOLD_AGENT_DISCONNECT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_ON_HOLD_CUSTOMER_DISCONNECT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_PUT_ON_HOLD</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_EXTERNAL</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_INTERNAL</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_QUEUED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_QUEUED_BY_ENQUEUE</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Agent, Agent Hierarchy,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_RESOLVED_IN_X</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code> enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_BY_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_FROM_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>MAX_QUEUED_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_CONTACTS_STEP_EXPIRED</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, RoutingStepExpression
     * </p>
     * </dd>
     * <dt>PERCENT_CONTACTS_STEP_JOINED</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, RoutingStepExpression
     * </p>
     * </dd>
     * <dt>PERCENT_NON_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_TALK_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_TALK_TIME_CUSTOMER</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>SERVICE_LEVEL</dt>
     * <dd>
     * <p>
     * You can include up to 20 SERVICE_LEVEL metrics in a request.
     * </p>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code>, enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>STEP_CONTACTS_QUEUED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, RoutingStepExpression
     * </p>
     * </dd>
     * <dt>SUM_AFTER_CONTACT_WORK_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_CONNECTING_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>. This metric only
     * supports the following filter keys as <code>INITIATION_METHOD</code>:
     * <code>INBOUND</code> | <code>OUTBOUND</code> | <code>CALLBACK</code> |
     * <code>API</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * <note>
     * <p>
     * The <code>Negate</code> key in Metric Level Filters is not applicable for
     * this metric.
     * </p>
     * </note></dd>
     * <dt>SUM_CONTACT_FLOW_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_CONTACT_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_CONTACTS_ANSWERED_IN_X</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code>, enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>SUM_CONTACTS_ABANDONED_IN_X</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code>, enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>SUM_CONTACTS_DISCONNECTED</dt>
     * <dd>
     * <p>
     * Valid metric filter key: <code>DISCONNECT_REASON</code>
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>SUM_ERROR_STATUS_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_HANDLE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_IDLE_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_INTERACTION_AND_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_INTERACTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_NON_PRODUCTIVE_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_ONLINE_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_RETRY_CALLBACK_ATTEMPTS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * </dl>
     *
     * @return <p>
     *         The metrics to retrieve. Specify the name, groupings, and filters
     *         for each metric. The following historical metrics are available.
     *         For a description of each metric, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
     *         >Historical metrics definitions</a> in the <i>Amazon Connect
     *         Administrator's Guide</i>.
     *         </p>
     *         <dl>
     *         <dt>ABANDONMENT_RATE</dt>
     *         <dd>
     *         <p>
     *         Unit: Percent
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, Feature,
     *         contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>AGENT_ADHERENT_TIME</dt>
     *         <dd>
     *         <p>
     *         This metric is available only in Amazon Web Services Regions
     *         where <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     *         >Forecasting, capacity planning, and scheduling</a> is available.
     *         </p>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>AGENT_ANSWER_RATE</dt>
     *         <dd>
     *         <p>
     *         Unit: Percent
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>AGENT_NON_ADHERENT_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>AGENT_NON_RESPONSE</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>AGENT_NON_RESPONSE_WITHOUT_CUSTOMER_ABANDONS</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         <p>
     *         Data for this metric is available starting from October 1, 2023
     *         0:00:00 GMT.
     *         </p>
     *         </dd>
     *         <dt>AGENT_OCCUPANCY</dt>
     *         <dd>
     *         <p>
     *         Unit: Percentage
     *         </p>
     *         <p>
     *         Valid groupings and filters: Routing Profile, Agent, Agent
     *         Hierarchy
     *         </p>
     *         </dd>
     *         <dt>AGENT_SCHEDULE_ADHERENCE</dt>
     *         <dd>
     *         <p>
     *         This metric is available only in Amazon Web Services Regions
     *         where <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     *         >Forecasting, capacity planning, and scheduling</a> is available.
     *         </p>
     *         <p>
     *         Unit: Percent
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>AGENT_SCHEDULED_TIME</dt>
     *         <dd>
     *         <p>
     *         This metric is available only in Amazon Web Services Regions
     *         where <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     *         >Forecasting, capacity planning, and scheduling</a> is available.
     *         </p>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>AVG_ABANDON_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, Feature,
     *         contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>AVG_ACTIVE_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>AVG_AFTER_CONTACT_WORK_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid metric filter key: <code>INITIATION_METHOD</code>
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, Feature,
     *         contact/segmentAttributes/connect:Subtype
     *         </p>
     *         <note>
     *         <p>
     *         Feature is a valid filter but not a valid grouping.
     *         </p>
     *         </note></dd>
     *         <dt>AVG_AGENT_CONNECTING_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid metric filter key: <code>INITIATION_METHOD</code>. For now,
     *         this metric only supports the following as
     *         <code>INITIATION_METHOD</code>: <code>INBOUND</code> |
     *         <code>OUTBOUND</code> | <code>CALLBACK</code> | <code>API</code>
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         <note>
     *         <p>
     *         The <code>Negate</code> key in Metric Level Filters is not
     *         applicable for this metric.
     *         </p>
     *         </note></dd>
     *         <dt>AVG_AGENT_PAUSE_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>AVG_CONTACT_DURATION</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, Feature,
     *         contact/segmentAttributes/connect:Subtype
     *         </p>
     *         <note>
     *         <p>
     *         Feature is a valid filter but not a valid grouping.
     *         </p>
     *         </note></dd>
     *         <dt>AVG_CONVERSATION_DURATION</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, Feature,
     *         contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>AVG_GREETING_TIME_AGENT</dt>
     *         <dd>
     *         <p>
     *         This metric is available only for contacts analyzed by Contact
     *         Lens conversational analytics.
     *         </p>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>AVG_HANDLE_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, Feature,
     *         contact/segmentAttributes/connect:Subtype, RoutingStepExpression
     *         </p>
     *         <note>
     *         <p>
     *         Feature is a valid filter but not a valid grouping.
     *         </p>
     *         </note></dd>
     *         <dt>AVG_HOLD_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, Feature,
     *         contact/segmentAttributes/connect:Subtype
     *         </p>
     *         <note>
     *         <p>
     *         Feature is a valid filter but not a valid grouping.
     *         </p>
     *         </note></dd>
     *         <dt>AVG_HOLD_TIME_ALL_CONTACTS</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>AVG_HOLDS</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, Feature,
     *         contact/segmentAttributes/connect:Subtype
     *         </p>
     *         <note>
     *         <p>
     *         Feature is a valid filter but not a valid grouping.
     *         </p>
     *         </note></dd>
     *         <dt>AVG_INTERACTION_AND_HOLD_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>AVG_INTERACTION_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid metric filter key: <code>INITIATION_METHOD</code>
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Feature, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         <note>
     *         <p>
     *         Feature is a valid filter but not a valid grouping.
     *         </p>
     *         </note></dd>
     *         <dt>AVG_INTERRUPTIONS_AGENT</dt>
     *         <dd>
     *         <p>
     *         This metric is available only for contacts analyzed by Contact
     *         Lens conversational analytics.
     *         </p>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>AVG_INTERRUPTION_TIME_AGENT</dt>
     *         <dd>
     *         <p>
     *         This metric is available only for contacts analyzed by Contact
     *         Lens conversational analytics.
     *         </p>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>AVG_NON_TALK_TIME</dt>
     *         <dd>
     *         <p>
     *         This metric is available only for contacts analyzed by Contact
     *         Lens conversational analytics.
     *         </p>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>AVG_QUEUE_ANSWER_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Feature, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         <note>
     *         <p>
     *         Feature is a valid filter but not a valid grouping.
     *         </p>
     *         </note></dd>
     *         <dt>AVG_RESOLUTION_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>AVG_TALK_TIME</dt>
     *         <dd>
     *         <p>
     *         This metric is available only for contacts analyzed by Contact
     *         Lens conversational analytics.
     *         </p>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>AVG_TALK_TIME_AGENT</dt>
     *         <dd>
     *         <p>
     *         This metric is available only for contacts analyzed by Contact
     *         Lens conversational analytics.
     *         </p>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>AVG_TALK_TIME_CUSTOMER</dt>
     *         <dd>
     *         <p>
     *         This metric is available only for contacts analyzed by Contact
     *         Lens conversational analytics.
     *         </p>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_ABANDONED</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy,
     *         contact/segmentAttributes/connect:Subtype, RoutingStepExpression
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_CREATED</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid metric filter key: <code>INITIATION_METHOD</code>
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Feature, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         <note>
     *         <p>
     *         Feature is a valid filter but not a valid grouping.
     *         </p>
     *         </note></dd>
     *         <dt>CONTACTS_HANDLED</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid metric filter key: <code>INITIATION_METHOD</code>,
     *         <code>DISCONNECT_REASON</code>
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, Feature,
     *         contact/segmentAttributes/connect:Subtype, RoutingStepExpression
     *         </p>
     *         <note>
     *         <p>
     *         Feature is a valid filter but not a valid grouping.
     *         </p>
     *         </note></dd>
     *         <dt>CONTACTS_HANDLED_BY_CONNECTED_TO_AGENT</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid metric filter key: <code>INITIATION_METHOD</code>
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Agent, Agent
     *         Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_HOLD_ABANDONS</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_ON_HOLD_AGENT_DISCONNECT</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_ON_HOLD_CUSTOMER_DISCONNECT</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_PUT_ON_HOLD</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_TRANSFERRED_OUT_EXTERNAL</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_TRANSFERRED_OUT_INTERNAL</dt>
     *         <dd>
     *         <p>
     *         Unit: Percent
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_QUEUED</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_QUEUED_BY_ENQUEUE</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Agent, Agent
     *         Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_RESOLVED_IN_X</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         contact/segmentAttributes/connect:Subtype
     *         </p>
     *         <p>
     *         Threshold: For <code>ThresholdValue</code> enter any whole number
     *         from 1 to 604800 (inclusive), in seconds. For
     *         <code>Comparison</code>, you must enter <code>LT</code> (for
     *         "Less than").
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_TRANSFERRED_OUT</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, Feature,
     *         contact/segmentAttributes/connect:Subtype
     *         </p>
     *         <note>
     *         <p>
     *         Feature is a valid filter but not a valid grouping.
     *         </p>
     *         </note></dd>
     *         <dt>CONTACTS_TRANSFERRED_OUT_BY_AGENT</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_TRANSFERRED_OUT_FROM_QUEUE</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>MAX_QUEUED_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>PERCENT_CONTACTS_STEP_EXPIRED</dt>
     *         <dd>
     *         <p>
     *         Unit: Percent
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, RoutingStepExpression
     *         </p>
     *         </dd>
     *         <dt>PERCENT_CONTACTS_STEP_JOINED</dt>
     *         <dd>
     *         <p>
     *         Unit: Percent
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, RoutingStepExpression
     *         </p>
     *         </dd>
     *         <dt>PERCENT_NON_TALK_TIME</dt>
     *         <dd>
     *         <p>
     *         This metric is available only for contacts analyzed by Contact
     *         Lens conversational analytics.
     *         </p>
     *         <p>
     *         Unit: Percentage
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>PERCENT_TALK_TIME</dt>
     *         <dd>
     *         <p>
     *         This metric is available only for contacts analyzed by Contact
     *         Lens conversational analytics.
     *         </p>
     *         <p>
     *         Unit: Percentage
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>PERCENT_TALK_TIME_AGENT</dt>
     *         <dd>
     *         <p>
     *         This metric is available only for contacts analyzed by Contact
     *         Lens conversational analytics.
     *         </p>
     *         <p>
     *         Unit: Percentage
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>PERCENT_TALK_TIME_CUSTOMER</dt>
     *         <dd>
     *         <p>
     *         This metric is available only for contacts analyzed by Contact
     *         Lens conversational analytics.
     *         </p>
     *         <p>
     *         Unit: Percentage
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>SERVICE_LEVEL</dt>
     *         <dd>
     *         <p>
     *         You can include up to 20 SERVICE_LEVEL metrics in a request.
     *         </p>
     *         <p>
     *         Unit: Percent
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile
     *         </p>
     *         <p>
     *         Threshold: For <code>ThresholdValue</code>, enter any whole
     *         number from 1 to 604800 (inclusive), in seconds. For
     *         <code>Comparison</code>, you must enter <code>LT</code> (for
     *         "Less than").
     *         </p>
     *         </dd>
     *         <dt>STEP_CONTACTS_QUEUED</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, RoutingStepExpression
     *         </p>
     *         </dd>
     *         <dt>SUM_AFTER_CONTACT_WORK_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>SUM_CONNECTING_TIME_AGENT</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid metric filter key: <code>INITIATION_METHOD</code>. This
     *         metric only supports the following filter keys as
     *         <code>INITIATION_METHOD</code>: <code>INBOUND</code> |
     *         <code>OUTBOUND</code> | <code>CALLBACK</code> | <code>API</code>
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         <note>
     *         <p>
     *         The <code>Negate</code> key in Metric Level Filters is not
     *         applicable for this metric.
     *         </p>
     *         </note></dd>
     *         <dt>SUM_CONTACT_FLOW_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>SUM_CONTACT_TIME_AGENT</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>SUM_CONTACTS_ANSWERED_IN_X</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         contact/segmentAttributes/connect:Subtype
     *         </p>
     *         <p>
     *         Threshold: For <code>ThresholdValue</code>, enter any whole
     *         number from 1 to 604800 (inclusive), in seconds. For
     *         <code>Comparison</code>, you must enter <code>LT</code> (for
     *         "Less than").
     *         </p>
     *         </dd>
     *         <dt>SUM_CONTACTS_ABANDONED_IN_X</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         contact/segmentAttributes/connect:Subtype
     *         </p>
     *         <p>
     *         Threshold: For <code>ThresholdValue</code>, enter any whole
     *         number from 1 to 604800 (inclusive), in seconds. For
     *         <code>Comparison</code>, you must enter <code>LT</code> (for
     *         "Less than").
     *         </p>
     *         </dd>
     *         <dt>SUM_CONTACTS_DISCONNECTED</dt>
     *         <dd>
     *         <p>
     *         Valid metric filter key: <code>DISCONNECT_REASON</code>
     *         </p>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         <dt>SUM_ERROR_STATUS_TIME_AGENT</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>SUM_HANDLE_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>SUM_HOLD_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>SUM_IDLE_TIME_AGENT</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Routing Profile, Agent, Agent
     *         Hierarchy
     *         </p>
     *         </dd>
     *         <dt>SUM_INTERACTION_AND_HOLD_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>SUM_INTERACTION_TIME</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         Agent, Agent Hierarchy
     *         </p>
     *         </dd>
     *         <dt>SUM_NON_PRODUCTIVE_TIME_AGENT</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Routing Profile, Agent, Agent
     *         Hierarchy
     *         </p>
     *         </dd>
     *         <dt>SUM_ONLINE_TIME_AGENT</dt>
     *         <dd>
     *         <p>
     *         Unit: Seconds
     *         </p>
     *         <p>
     *         Valid groupings and filters: Routing Profile, Agent, Agent
     *         Hierarchy
     *         </p>
     *         </dd>
     *         <dt>SUM_RETRY_CALLBACK_ATTEMPTS</dt>
     *         <dd>
     *         <p>
     *         Unit: Count
     *         </p>
     *         <p>
     *         Valid groupings and filters: Queue, Channel, Routing Profile,
     *         contact/segmentAttributes/connect:Subtype
     *         </p>
     *         </dd>
     *         </dl>
     */
    public java.util.List<MetricV2> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * The metrics to retrieve. Specify the name, groupings, and filters for
     * each metric. The following historical metrics are available. For a
     * description of each metric, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
     * >Historical metrics definitions</a> in the <i>Amazon Connect
     * Administrator's Guide</i>.
     * </p>
     * <dl>
     * <dt>ABANDONMENT_RATE</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AGENT_ADHERENT_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only in Amazon Web Services Regions where <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     * >Forecasting, capacity planning, and scheduling</a> is available.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_ANSWER_RATE</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_NON_ADHERENT_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_NON_RESPONSE</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_NON_RESPONSE_WITHOUT_CUSTOMER_ABANDONS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * <p>
     * Data for this metric is available starting from October 1, 2023 0:00:00
     * GMT.
     * </p>
     * </dd>
     * <dt>AGENT_OCCUPANCY</dt>
     * <dd>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_SCHEDULE_ADHERENCE</dt>
     * <dd>
     * <p>
     * This metric is available only in Amazon Web Services Regions where <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     * >Forecasting, capacity planning, and scheduling</a> is available.
     * </p>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_SCHEDULED_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only in Amazon Web Services Regions where <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     * >Forecasting, capacity planning, and scheduling</a> is available.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AVG_ABANDON_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_ACTIVE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AVG_AFTER_CONTACT_WORK_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_AGENT_CONNECTING_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>. For now, this
     * metric only supports the following as <code>INITIATION_METHOD</code>:
     * <code>INBOUND</code> | <code>OUTBOUND</code> | <code>CALLBACK</code> |
     * <code>API</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * <note>
     * <p>
     * The <code>Negate</code> key in Metric Level Filters is not applicable for
     * this metric.
     * </p>
     * </note></dd>
     * <dt>AVG_AGENT_PAUSE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AVG_CONTACT_DURATION</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_CONVERSATION_DURATION</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_GREETING_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_HANDLE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype,
     * RoutingStepExpression
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_HOLD_TIME_ALL_CONTACTS</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_HOLDS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_INTERACTION_AND_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_INTERACTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Feature,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_INTERRUPTIONS_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_INTERRUPTION_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_NON_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_QUEUE_ANSWER_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Feature,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_RESOLUTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_TALK_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_TALK_TIME_CUSTOMER</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_ABANDONED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype,
     * RoutingStepExpression
     * </p>
     * </dd>
     * <dt>CONTACTS_CREATED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Feature,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>,
     * <code>DISCONNECT_REASON</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype,
     * RoutingStepExpression
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>CONTACTS_HANDLED_BY_CONNECTED_TO_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Agent, Agent Hierarchy,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_HOLD_ABANDONS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_ON_HOLD_AGENT_DISCONNECT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_ON_HOLD_CUSTOMER_DISCONNECT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_PUT_ON_HOLD</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_EXTERNAL</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_INTERNAL</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_QUEUED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_QUEUED_BY_ENQUEUE</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Agent, Agent Hierarchy,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_RESOLVED_IN_X</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code> enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_BY_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_FROM_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>MAX_QUEUED_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_CONTACTS_STEP_EXPIRED</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, RoutingStepExpression
     * </p>
     * </dd>
     * <dt>PERCENT_CONTACTS_STEP_JOINED</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, RoutingStepExpression
     * </p>
     * </dd>
     * <dt>PERCENT_NON_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_TALK_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_TALK_TIME_CUSTOMER</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>SERVICE_LEVEL</dt>
     * <dd>
     * <p>
     * You can include up to 20 SERVICE_LEVEL metrics in a request.
     * </p>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code>, enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>STEP_CONTACTS_QUEUED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, RoutingStepExpression
     * </p>
     * </dd>
     * <dt>SUM_AFTER_CONTACT_WORK_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_CONNECTING_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>. This metric only
     * supports the following filter keys as <code>INITIATION_METHOD</code>:
     * <code>INBOUND</code> | <code>OUTBOUND</code> | <code>CALLBACK</code> |
     * <code>API</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * <note>
     * <p>
     * The <code>Negate</code> key in Metric Level Filters is not applicable for
     * this metric.
     * </p>
     * </note></dd>
     * <dt>SUM_CONTACT_FLOW_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_CONTACT_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_CONTACTS_ANSWERED_IN_X</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code>, enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>SUM_CONTACTS_ABANDONED_IN_X</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code>, enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>SUM_CONTACTS_DISCONNECTED</dt>
     * <dd>
     * <p>
     * Valid metric filter key: <code>DISCONNECT_REASON</code>
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>SUM_ERROR_STATUS_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_HANDLE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_IDLE_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_INTERACTION_AND_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_INTERACTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_NON_PRODUCTIVE_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_ONLINE_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_RETRY_CALLBACK_ATTEMPTS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * </dl>
     *
     * @param metrics <p>
     *            The metrics to retrieve. Specify the name, groupings, and
     *            filters for each metric. The following historical metrics are
     *            available. For a description of each metric, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
     *            >Historical metrics definitions</a> in the <i>Amazon Connect
     *            Administrator's Guide</i>.
     *            </p>
     *            <dl>
     *            <dt>ABANDONMENT_RATE</dt>
     *            <dd>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AGENT_ADHERENT_TIME</dt>
     *            <dd>
     *            <p>
     *            This metric is available only in Amazon Web Services Regions
     *            where <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     *            >Forecasting, capacity planning, and scheduling</a> is
     *            available.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AGENT_ANSWER_RATE</dt>
     *            <dd>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AGENT_NON_ADHERENT_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AGENT_NON_RESPONSE</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AGENT_NON_RESPONSE_WITHOUT_CUSTOMER_ABANDONS</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            <p>
     *            Data for this metric is available starting from October 1,
     *            2023 0:00:00 GMT.
     *            </p>
     *            </dd>
     *            <dt>AGENT_OCCUPANCY</dt>
     *            <dd>
     *            <p>
     *            Unit: Percentage
     *            </p>
     *            <p>
     *            Valid groupings and filters: Routing Profile, Agent, Agent
     *            Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AGENT_SCHEDULE_ADHERENCE</dt>
     *            <dd>
     *            <p>
     *            This metric is available only in Amazon Web Services Regions
     *            where <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     *            >Forecasting, capacity planning, and scheduling</a> is
     *            available.
     *            </p>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AGENT_SCHEDULED_TIME</dt>
     *            <dd>
     *            <p>
     *            This metric is available only in Amazon Web Services Regions
     *            where <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     *            >Forecasting, capacity planning, and scheduling</a> is
     *            available.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AVG_ABANDON_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_ACTIVE_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AVG_AFTER_CONTACT_WORK_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_AGENT_CONNECTING_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>. For
     *            now, this metric only supports the following as
     *            <code>INITIATION_METHOD</code>: <code>INBOUND</code> |
     *            <code>OUTBOUND</code> | <code>CALLBACK</code> |
     *            <code>API</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            <note>
     *            <p>
     *            The <code>Negate</code> key in Metric Level Filters is not
     *            applicable for this metric.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_AGENT_PAUSE_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AVG_CONTACT_DURATION</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_CONVERSATION_DURATION</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_GREETING_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_HANDLE_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype,
     *            RoutingStepExpression
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_HOLD_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_HOLD_TIME_ALL_CONTACTS</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_HOLDS</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_INTERACTION_AND_HOLD_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_INTERACTION_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Feature, contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_INTERRUPTIONS_AGENT</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_INTERRUPTION_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_NON_TALK_TIME</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_QUEUE_ANSWER_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Feature, contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_RESOLUTION_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_TALK_TIME</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_TALK_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_TALK_TIME_CUSTOMER</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_ABANDONED</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype,
     *            RoutingStepExpression
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_CREATED</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Feature, contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>CONTACTS_HANDLED</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>,
     *            <code>DISCONNECT_REASON</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype,
     *            RoutingStepExpression
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>CONTACTS_HANDLED_BY_CONNECTED_TO_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Agent, Agent
     *            Hierarchy, contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_HOLD_ABANDONS</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_ON_HOLD_AGENT_DISCONNECT</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_ON_HOLD_CUSTOMER_DISCONNECT</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_PUT_ON_HOLD</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT_EXTERNAL</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT_INTERNAL</dt>
     *            <dd>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_QUEUED</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_QUEUED_BY_ENQUEUE</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Agent, Agent
     *            Hierarchy, contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_RESOLVED_IN_X</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <p>
     *            Threshold: For <code>ThresholdValue</code> enter any whole
     *            number from 1 to 604800 (inclusive), in seconds. For
     *            <code>Comparison</code>, you must enter <code>LT</code> (for
     *            "Less than").
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT_BY_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT_FROM_QUEUE</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>MAX_QUEUED_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>PERCENT_CONTACTS_STEP_EXPIRED</dt>
     *            <dd>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, RoutingStepExpression
     *            </p>
     *            </dd>
     *            <dt>PERCENT_CONTACTS_STEP_JOINED</dt>
     *            <dd>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, RoutingStepExpression
     *            </p>
     *            </dd>
     *            <dt>PERCENT_NON_TALK_TIME</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Percentage
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>PERCENT_TALK_TIME</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Percentage
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>PERCENT_TALK_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Percentage
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>PERCENT_TALK_TIME_CUSTOMER</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Percentage
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>SERVICE_LEVEL</dt>
     *            <dd>
     *            <p>
     *            You can include up to 20 SERVICE_LEVEL metrics in a request.
     *            </p>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile
     *            </p>
     *            <p>
     *            Threshold: For <code>ThresholdValue</code>, enter any whole
     *            number from 1 to 604800 (inclusive), in seconds. For
     *            <code>Comparison</code>, you must enter <code>LT</code> (for
     *            "Less than").
     *            </p>
     *            </dd>
     *            <dt>STEP_CONTACTS_QUEUED</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, RoutingStepExpression
     *            </p>
     *            </dd>
     *            <dt>SUM_AFTER_CONTACT_WORK_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_CONNECTING_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>. This
     *            metric only supports the following filter keys as
     *            <code>INITIATION_METHOD</code>: <code>INBOUND</code> |
     *            <code>OUTBOUND</code> | <code>CALLBACK</code> |
     *            <code>API</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            <note>
     *            <p>
     *            The <code>Negate</code> key in Metric Level Filters is not
     *            applicable for this metric.
     *            </p>
     *            </note></dd>
     *            <dt>SUM_CONTACT_FLOW_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_CONTACT_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_CONTACTS_ANSWERED_IN_X</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <p>
     *            Threshold: For <code>ThresholdValue</code>, enter any whole
     *            number from 1 to 604800 (inclusive), in seconds. For
     *            <code>Comparison</code>, you must enter <code>LT</code> (for
     *            "Less than").
     *            </p>
     *            </dd>
     *            <dt>SUM_CONTACTS_ABANDONED_IN_X</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <p>
     *            Threshold: For <code>ThresholdValue</code>, enter any whole
     *            number from 1 to 604800 (inclusive), in seconds. For
     *            <code>Comparison</code>, you must enter <code>LT</code> (for
     *            "Less than").
     *            </p>
     *            </dd>
     *            <dt>SUM_CONTACTS_DISCONNECTED</dt>
     *            <dd>
     *            <p>
     *            Valid metric filter key: <code>DISCONNECT_REASON</code>
     *            </p>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>SUM_ERROR_STATUS_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_HANDLE_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_HOLD_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_IDLE_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Routing Profile, Agent, Agent
     *            Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_INTERACTION_AND_HOLD_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_INTERACTION_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_NON_PRODUCTIVE_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Routing Profile, Agent, Agent
     *            Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_ONLINE_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Routing Profile, Agent, Agent
     *            Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_RETRY_CALLBACK_ATTEMPTS</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            </dl>
     */
    public void setMetrics(java.util.Collection<MetricV2> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new java.util.ArrayList<MetricV2>(metrics);
    }

    /**
     * <p>
     * The metrics to retrieve. Specify the name, groupings, and filters for
     * each metric. The following historical metrics are available. For a
     * description of each metric, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
     * >Historical metrics definitions</a> in the <i>Amazon Connect
     * Administrator's Guide</i>.
     * </p>
     * <dl>
     * <dt>ABANDONMENT_RATE</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AGENT_ADHERENT_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only in Amazon Web Services Regions where <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     * >Forecasting, capacity planning, and scheduling</a> is available.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_ANSWER_RATE</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_NON_ADHERENT_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_NON_RESPONSE</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_NON_RESPONSE_WITHOUT_CUSTOMER_ABANDONS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * <p>
     * Data for this metric is available starting from October 1, 2023 0:00:00
     * GMT.
     * </p>
     * </dd>
     * <dt>AGENT_OCCUPANCY</dt>
     * <dd>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_SCHEDULE_ADHERENCE</dt>
     * <dd>
     * <p>
     * This metric is available only in Amazon Web Services Regions where <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     * >Forecasting, capacity planning, and scheduling</a> is available.
     * </p>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_SCHEDULED_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only in Amazon Web Services Regions where <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     * >Forecasting, capacity planning, and scheduling</a> is available.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AVG_ABANDON_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_ACTIVE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AVG_AFTER_CONTACT_WORK_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_AGENT_CONNECTING_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>. For now, this
     * metric only supports the following as <code>INITIATION_METHOD</code>:
     * <code>INBOUND</code> | <code>OUTBOUND</code> | <code>CALLBACK</code> |
     * <code>API</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * <note>
     * <p>
     * The <code>Negate</code> key in Metric Level Filters is not applicable for
     * this metric.
     * </p>
     * </note></dd>
     * <dt>AVG_AGENT_PAUSE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AVG_CONTACT_DURATION</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_CONVERSATION_DURATION</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_GREETING_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_HANDLE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype,
     * RoutingStepExpression
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_HOLD_TIME_ALL_CONTACTS</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_HOLDS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_INTERACTION_AND_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_INTERACTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Feature,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_INTERRUPTIONS_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_INTERRUPTION_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_NON_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_QUEUE_ANSWER_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Feature,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_RESOLUTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_TALK_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_TALK_TIME_CUSTOMER</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_ABANDONED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype,
     * RoutingStepExpression
     * </p>
     * </dd>
     * <dt>CONTACTS_CREATED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Feature,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>,
     * <code>DISCONNECT_REASON</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype,
     * RoutingStepExpression
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>CONTACTS_HANDLED_BY_CONNECTED_TO_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Agent, Agent Hierarchy,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_HOLD_ABANDONS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_ON_HOLD_AGENT_DISCONNECT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_ON_HOLD_CUSTOMER_DISCONNECT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_PUT_ON_HOLD</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_EXTERNAL</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_INTERNAL</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_QUEUED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_QUEUED_BY_ENQUEUE</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Agent, Agent Hierarchy,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_RESOLVED_IN_X</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code> enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_BY_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_FROM_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>MAX_QUEUED_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_CONTACTS_STEP_EXPIRED</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, RoutingStepExpression
     * </p>
     * </dd>
     * <dt>PERCENT_CONTACTS_STEP_JOINED</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, RoutingStepExpression
     * </p>
     * </dd>
     * <dt>PERCENT_NON_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_TALK_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_TALK_TIME_CUSTOMER</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>SERVICE_LEVEL</dt>
     * <dd>
     * <p>
     * You can include up to 20 SERVICE_LEVEL metrics in a request.
     * </p>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code>, enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>STEP_CONTACTS_QUEUED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, RoutingStepExpression
     * </p>
     * </dd>
     * <dt>SUM_AFTER_CONTACT_WORK_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_CONNECTING_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>. This metric only
     * supports the following filter keys as <code>INITIATION_METHOD</code>:
     * <code>INBOUND</code> | <code>OUTBOUND</code> | <code>CALLBACK</code> |
     * <code>API</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * <note>
     * <p>
     * The <code>Negate</code> key in Metric Level Filters is not applicable for
     * this metric.
     * </p>
     * </note></dd>
     * <dt>SUM_CONTACT_FLOW_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_CONTACT_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_CONTACTS_ANSWERED_IN_X</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code>, enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>SUM_CONTACTS_ABANDONED_IN_X</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code>, enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>SUM_CONTACTS_DISCONNECTED</dt>
     * <dd>
     * <p>
     * Valid metric filter key: <code>DISCONNECT_REASON</code>
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>SUM_ERROR_STATUS_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_HANDLE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_IDLE_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_INTERACTION_AND_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_INTERACTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_NON_PRODUCTIVE_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_ONLINE_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_RETRY_CALLBACK_ATTEMPTS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            The metrics to retrieve. Specify the name, groupings, and
     *            filters for each metric. The following historical metrics are
     *            available. For a description of each metric, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
     *            >Historical metrics definitions</a> in the <i>Amazon Connect
     *            Administrator's Guide</i>.
     *            </p>
     *            <dl>
     *            <dt>ABANDONMENT_RATE</dt>
     *            <dd>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AGENT_ADHERENT_TIME</dt>
     *            <dd>
     *            <p>
     *            This metric is available only in Amazon Web Services Regions
     *            where <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     *            >Forecasting, capacity planning, and scheduling</a> is
     *            available.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AGENT_ANSWER_RATE</dt>
     *            <dd>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AGENT_NON_ADHERENT_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AGENT_NON_RESPONSE</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AGENT_NON_RESPONSE_WITHOUT_CUSTOMER_ABANDONS</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            <p>
     *            Data for this metric is available starting from October 1,
     *            2023 0:00:00 GMT.
     *            </p>
     *            </dd>
     *            <dt>AGENT_OCCUPANCY</dt>
     *            <dd>
     *            <p>
     *            Unit: Percentage
     *            </p>
     *            <p>
     *            Valid groupings and filters: Routing Profile, Agent, Agent
     *            Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AGENT_SCHEDULE_ADHERENCE</dt>
     *            <dd>
     *            <p>
     *            This metric is available only in Amazon Web Services Regions
     *            where <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     *            >Forecasting, capacity planning, and scheduling</a> is
     *            available.
     *            </p>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AGENT_SCHEDULED_TIME</dt>
     *            <dd>
     *            <p>
     *            This metric is available only in Amazon Web Services Regions
     *            where <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     *            >Forecasting, capacity planning, and scheduling</a> is
     *            available.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AVG_ABANDON_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_ACTIVE_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AVG_AFTER_CONTACT_WORK_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_AGENT_CONNECTING_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>. For
     *            now, this metric only supports the following as
     *            <code>INITIATION_METHOD</code>: <code>INBOUND</code> |
     *            <code>OUTBOUND</code> | <code>CALLBACK</code> |
     *            <code>API</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            <note>
     *            <p>
     *            The <code>Negate</code> key in Metric Level Filters is not
     *            applicable for this metric.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_AGENT_PAUSE_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AVG_CONTACT_DURATION</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_CONVERSATION_DURATION</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_GREETING_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_HANDLE_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype,
     *            RoutingStepExpression
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_HOLD_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_HOLD_TIME_ALL_CONTACTS</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_HOLDS</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_INTERACTION_AND_HOLD_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_INTERACTION_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Feature, contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_INTERRUPTIONS_AGENT</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_INTERRUPTION_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_NON_TALK_TIME</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_QUEUE_ANSWER_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Feature, contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_RESOLUTION_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_TALK_TIME</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_TALK_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_TALK_TIME_CUSTOMER</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_ABANDONED</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype,
     *            RoutingStepExpression
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_CREATED</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Feature, contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>CONTACTS_HANDLED</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>,
     *            <code>DISCONNECT_REASON</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype,
     *            RoutingStepExpression
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>CONTACTS_HANDLED_BY_CONNECTED_TO_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Agent, Agent
     *            Hierarchy, contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_HOLD_ABANDONS</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_ON_HOLD_AGENT_DISCONNECT</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_ON_HOLD_CUSTOMER_DISCONNECT</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_PUT_ON_HOLD</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT_EXTERNAL</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT_INTERNAL</dt>
     *            <dd>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_QUEUED</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_QUEUED_BY_ENQUEUE</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Agent, Agent
     *            Hierarchy, contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_RESOLVED_IN_X</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <p>
     *            Threshold: For <code>ThresholdValue</code> enter any whole
     *            number from 1 to 604800 (inclusive), in seconds. For
     *            <code>Comparison</code>, you must enter <code>LT</code> (for
     *            "Less than").
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT_BY_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT_FROM_QUEUE</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>MAX_QUEUED_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>PERCENT_CONTACTS_STEP_EXPIRED</dt>
     *            <dd>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, RoutingStepExpression
     *            </p>
     *            </dd>
     *            <dt>PERCENT_CONTACTS_STEP_JOINED</dt>
     *            <dd>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, RoutingStepExpression
     *            </p>
     *            </dd>
     *            <dt>PERCENT_NON_TALK_TIME</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Percentage
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>PERCENT_TALK_TIME</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Percentage
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>PERCENT_TALK_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Percentage
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>PERCENT_TALK_TIME_CUSTOMER</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Percentage
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>SERVICE_LEVEL</dt>
     *            <dd>
     *            <p>
     *            You can include up to 20 SERVICE_LEVEL metrics in a request.
     *            </p>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile
     *            </p>
     *            <p>
     *            Threshold: For <code>ThresholdValue</code>, enter any whole
     *            number from 1 to 604800 (inclusive), in seconds. For
     *            <code>Comparison</code>, you must enter <code>LT</code> (for
     *            "Less than").
     *            </p>
     *            </dd>
     *            <dt>STEP_CONTACTS_QUEUED</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, RoutingStepExpression
     *            </p>
     *            </dd>
     *            <dt>SUM_AFTER_CONTACT_WORK_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_CONNECTING_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>. This
     *            metric only supports the following filter keys as
     *            <code>INITIATION_METHOD</code>: <code>INBOUND</code> |
     *            <code>OUTBOUND</code> | <code>CALLBACK</code> |
     *            <code>API</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            <note>
     *            <p>
     *            The <code>Negate</code> key in Metric Level Filters is not
     *            applicable for this metric.
     *            </p>
     *            </note></dd>
     *            <dt>SUM_CONTACT_FLOW_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_CONTACT_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_CONTACTS_ANSWERED_IN_X</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <p>
     *            Threshold: For <code>ThresholdValue</code>, enter any whole
     *            number from 1 to 604800 (inclusive), in seconds. For
     *            <code>Comparison</code>, you must enter <code>LT</code> (for
     *            "Less than").
     *            </p>
     *            </dd>
     *            <dt>SUM_CONTACTS_ABANDONED_IN_X</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <p>
     *            Threshold: For <code>ThresholdValue</code>, enter any whole
     *            number from 1 to 604800 (inclusive), in seconds. For
     *            <code>Comparison</code>, you must enter <code>LT</code> (for
     *            "Less than").
     *            </p>
     *            </dd>
     *            <dt>SUM_CONTACTS_DISCONNECTED</dt>
     *            <dd>
     *            <p>
     *            Valid metric filter key: <code>DISCONNECT_REASON</code>
     *            </p>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>SUM_ERROR_STATUS_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_HANDLE_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_HOLD_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_IDLE_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Routing Profile, Agent, Agent
     *            Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_INTERACTION_AND_HOLD_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_INTERACTION_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_NON_PRODUCTIVE_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Routing Profile, Agent, Agent
     *            Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_ONLINE_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Routing Profile, Agent, Agent
     *            Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_RETRY_CALLBACK_ATTEMPTS</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataV2Request withMetrics(MetricV2... metrics) {
        if (getMetrics() == null) {
            this.metrics = new java.util.ArrayList<MetricV2>(metrics.length);
        }
        for (MetricV2 value : metrics) {
            this.metrics.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The metrics to retrieve. Specify the name, groupings, and filters for
     * each metric. The following historical metrics are available. For a
     * description of each metric, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
     * >Historical metrics definitions</a> in the <i>Amazon Connect
     * Administrator's Guide</i>.
     * </p>
     * <dl>
     * <dt>ABANDONMENT_RATE</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AGENT_ADHERENT_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only in Amazon Web Services Regions where <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     * >Forecasting, capacity planning, and scheduling</a> is available.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_ANSWER_RATE</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_NON_ADHERENT_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_NON_RESPONSE</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_NON_RESPONSE_WITHOUT_CUSTOMER_ABANDONS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * <p>
     * Data for this metric is available starting from October 1, 2023 0:00:00
     * GMT.
     * </p>
     * </dd>
     * <dt>AGENT_OCCUPANCY</dt>
     * <dd>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_SCHEDULE_ADHERENCE</dt>
     * <dd>
     * <p>
     * This metric is available only in Amazon Web Services Regions where <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     * >Forecasting, capacity planning, and scheduling</a> is available.
     * </p>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AGENT_SCHEDULED_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only in Amazon Web Services Regions where <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     * >Forecasting, capacity planning, and scheduling</a> is available.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AVG_ABANDON_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_ACTIVE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AVG_AFTER_CONTACT_WORK_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_AGENT_CONNECTING_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>. For now, this
     * metric only supports the following as <code>INITIATION_METHOD</code>:
     * <code>INBOUND</code> | <code>OUTBOUND</code> | <code>CALLBACK</code> |
     * <code>API</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * <note>
     * <p>
     * The <code>Negate</code> key in Metric Level Filters is not applicable for
     * this metric.
     * </p>
     * </note></dd>
     * <dt>AVG_AGENT_PAUSE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>AVG_CONTACT_DURATION</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_CONVERSATION_DURATION</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_GREETING_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_HANDLE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype,
     * RoutingStepExpression
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_HOLD_TIME_ALL_CONTACTS</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_HOLDS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_INTERACTION_AND_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_INTERACTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Feature,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_INTERRUPTIONS_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_INTERRUPTION_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_NON_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_QUEUE_ANSWER_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Feature,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>AVG_RESOLUTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_TALK_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>AVG_TALK_TIME_CUSTOMER</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_ABANDONED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype,
     * RoutingStepExpression
     * </p>
     * </dd>
     * <dt>CONTACTS_CREATED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Feature,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>CONTACTS_HANDLED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>,
     * <code>DISCONNECT_REASON</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype,
     * RoutingStepExpression
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>CONTACTS_HANDLED_BY_CONNECTED_TO_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Agent, Agent Hierarchy,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_HOLD_ABANDONS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_ON_HOLD_AGENT_DISCONNECT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_ON_HOLD_CUSTOMER_DISCONNECT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_PUT_ON_HOLD</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_EXTERNAL</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_INTERNAL</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>CONTACTS_QUEUED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_QUEUED_BY_ENQUEUE</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Agent, Agent Hierarchy,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_RESOLVED_IN_X</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code> enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, Feature, contact/segmentAttributes/connect:Subtype
     * </p>
     * <note>
     * <p>
     * Feature is a valid filter but not a valid grouping.
     * </p>
     * </note></dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_BY_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>CONTACTS_TRANSFERRED_OUT_FROM_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>MAX_QUEUED_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_CONTACTS_STEP_EXPIRED</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, RoutingStepExpression
     * </p>
     * </dd>
     * <dt>PERCENT_CONTACTS_STEP_JOINED</dt>
     * <dd>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, RoutingStepExpression
     * </p>
     * </dd>
     * <dt>PERCENT_NON_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_TALK_TIME</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_TALK_TIME_AGENT</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>PERCENT_TALK_TIME_CUSTOMER</dt>
     * <dd>
     * <p>
     * This metric is available only for contacts analyzed by Contact Lens
     * conversational analytics.
     * </p>
     * <p>
     * Unit: Percentage
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>SERVICE_LEVEL</dt>
     * <dd>
     * <p>
     * You can include up to 20 SERVICE_LEVEL metrics in a request.
     * </p>
     * <p>
     * Unit: Percent
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code>, enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>STEP_CONTACTS_QUEUED</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, RoutingStepExpression
     * </p>
     * </dd>
     * <dt>SUM_AFTER_CONTACT_WORK_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_CONNECTING_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid metric filter key: <code>INITIATION_METHOD</code>. This metric only
     * supports the following filter keys as <code>INITIATION_METHOD</code>:
     * <code>INBOUND</code> | <code>OUTBOUND</code> | <code>CALLBACK</code> |
     * <code>API</code>
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * <note>
     * <p>
     * The <code>Negate</code> key in Metric Level Filters is not applicable for
     * this metric.
     * </p>
     * </note></dd>
     * <dt>SUM_CONTACT_FLOW_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_CONTACT_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_CONTACTS_ANSWERED_IN_X</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code>, enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>SUM_CONTACTS_ABANDONED_IN_X</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * <p>
     * Threshold: For <code>ThresholdValue</code>, enter any whole number from 1
     * to 604800 (inclusive), in seconds. For <code>Comparison</code>, you must
     * enter <code>LT</code> (for "Less than").
     * </p>
     * </dd>
     * <dt>SUM_CONTACTS_DISCONNECTED</dt>
     * <dd>
     * <p>
     * Valid metric filter key: <code>DISCONNECT_REASON</code>
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy, contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * <dt>SUM_ERROR_STATUS_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_HANDLE_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_IDLE_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_INTERACTION_AND_HOLD_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_INTERACTION_TIME</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile, Agent,
     * Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_NON_PRODUCTIVE_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_ONLINE_TIME_AGENT</dt>
     * <dd>
     * <p>
     * Unit: Seconds
     * </p>
     * <p>
     * Valid groupings and filters: Routing Profile, Agent, Agent Hierarchy
     * </p>
     * </dd>
     * <dt>SUM_RETRY_CALLBACK_ATTEMPTS</dt>
     * <dd>
     * <p>
     * Unit: Count
     * </p>
     * <p>
     * Valid groupings and filters: Queue, Channel, Routing Profile,
     * contact/segmentAttributes/connect:Subtype
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            The metrics to retrieve. Specify the name, groupings, and
     *            filters for each metric. The following historical metrics are
     *            available. For a description of each metric, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html"
     *            >Historical metrics definitions</a> in the <i>Amazon Connect
     *            Administrator's Guide</i>.
     *            </p>
     *            <dl>
     *            <dt>ABANDONMENT_RATE</dt>
     *            <dd>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AGENT_ADHERENT_TIME</dt>
     *            <dd>
     *            <p>
     *            This metric is available only in Amazon Web Services Regions
     *            where <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     *            >Forecasting, capacity planning, and scheduling</a> is
     *            available.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AGENT_ANSWER_RATE</dt>
     *            <dd>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AGENT_NON_ADHERENT_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AGENT_NON_RESPONSE</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AGENT_NON_RESPONSE_WITHOUT_CUSTOMER_ABANDONS</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            <p>
     *            Data for this metric is available starting from October 1,
     *            2023 0:00:00 GMT.
     *            </p>
     *            </dd>
     *            <dt>AGENT_OCCUPANCY</dt>
     *            <dd>
     *            <p>
     *            Unit: Percentage
     *            </p>
     *            <p>
     *            Valid groupings and filters: Routing Profile, Agent, Agent
     *            Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AGENT_SCHEDULE_ADHERENCE</dt>
     *            <dd>
     *            <p>
     *            This metric is available only in Amazon Web Services Regions
     *            where <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     *            >Forecasting, capacity planning, and scheduling</a> is
     *            available.
     *            </p>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AGENT_SCHEDULED_TIME</dt>
     *            <dd>
     *            <p>
     *            This metric is available only in Amazon Web Services Regions
     *            where <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/regions.html#optimization_region"
     *            >Forecasting, capacity planning, and scheduling</a> is
     *            available.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AVG_ABANDON_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_ACTIVE_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AVG_AFTER_CONTACT_WORK_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_AGENT_CONNECTING_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>. For
     *            now, this metric only supports the following as
     *            <code>INITIATION_METHOD</code>: <code>INBOUND</code> |
     *            <code>OUTBOUND</code> | <code>CALLBACK</code> |
     *            <code>API</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            <note>
     *            <p>
     *            The <code>Negate</code> key in Metric Level Filters is not
     *            applicable for this metric.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_AGENT_PAUSE_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>AVG_CONTACT_DURATION</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_CONVERSATION_DURATION</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_GREETING_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_HANDLE_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype,
     *            RoutingStepExpression
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_HOLD_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_HOLD_TIME_ALL_CONTACTS</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_HOLDS</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_INTERACTION_AND_HOLD_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_INTERACTION_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Feature, contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_INTERRUPTIONS_AGENT</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_INTERRUPTION_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_NON_TALK_TIME</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_QUEUE_ANSWER_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Feature, contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>AVG_RESOLUTION_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_TALK_TIME</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_TALK_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>AVG_TALK_TIME_CUSTOMER</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_ABANDONED</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype,
     *            RoutingStepExpression
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_CREATED</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Feature, contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>CONTACTS_HANDLED</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>,
     *            <code>DISCONNECT_REASON</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype,
     *            RoutingStepExpression
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>CONTACTS_HANDLED_BY_CONNECTED_TO_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Agent, Agent
     *            Hierarchy, contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_HOLD_ABANDONS</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_ON_HOLD_AGENT_DISCONNECT</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_ON_HOLD_CUSTOMER_DISCONNECT</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_PUT_ON_HOLD</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT_EXTERNAL</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT_INTERNAL</dt>
     *            <dd>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_QUEUED</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_QUEUED_BY_ENQUEUE</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Agent, Agent
     *            Hierarchy, contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_RESOLVED_IN_X</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <p>
     *            Threshold: For <code>ThresholdValue</code> enter any whole
     *            number from 1 to 604800 (inclusive), in seconds. For
     *            <code>Comparison</code>, you must enter <code>LT</code> (for
     *            "Less than").
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy, Feature,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <note>
     *            <p>
     *            Feature is a valid filter but not a valid grouping.
     *            </p>
     *            </note></dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT_BY_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_TRANSFERRED_OUT_FROM_QUEUE</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>MAX_QUEUED_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>PERCENT_CONTACTS_STEP_EXPIRED</dt>
     *            <dd>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, RoutingStepExpression
     *            </p>
     *            </dd>
     *            <dt>PERCENT_CONTACTS_STEP_JOINED</dt>
     *            <dd>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, RoutingStepExpression
     *            </p>
     *            </dd>
     *            <dt>PERCENT_NON_TALK_TIME</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Percentage
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>PERCENT_TALK_TIME</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Percentage
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>PERCENT_TALK_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Percentage
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>PERCENT_TALK_TIME_CUSTOMER</dt>
     *            <dd>
     *            <p>
     *            This metric is available only for contacts analyzed by Contact
     *            Lens conversational analytics.
     *            </p>
     *            <p>
     *            Unit: Percentage
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>SERVICE_LEVEL</dt>
     *            <dd>
     *            <p>
     *            You can include up to 20 SERVICE_LEVEL metrics in a request.
     *            </p>
     *            <p>
     *            Unit: Percent
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile
     *            </p>
     *            <p>
     *            Threshold: For <code>ThresholdValue</code>, enter any whole
     *            number from 1 to 604800 (inclusive), in seconds. For
     *            <code>Comparison</code>, you must enter <code>LT</code> (for
     *            "Less than").
     *            </p>
     *            </dd>
     *            <dt>STEP_CONTACTS_QUEUED</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, RoutingStepExpression
     *            </p>
     *            </dd>
     *            <dt>SUM_AFTER_CONTACT_WORK_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_CONNECTING_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid metric filter key: <code>INITIATION_METHOD</code>. This
     *            metric only supports the following filter keys as
     *            <code>INITIATION_METHOD</code>: <code>INBOUND</code> |
     *            <code>OUTBOUND</code> | <code>CALLBACK</code> |
     *            <code>API</code>
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            <note>
     *            <p>
     *            The <code>Negate</code> key in Metric Level Filters is not
     *            applicable for this metric.
     *            </p>
     *            </note></dd>
     *            <dt>SUM_CONTACT_FLOW_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_CONTACT_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_CONTACTS_ANSWERED_IN_X</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <p>
     *            Threshold: For <code>ThresholdValue</code>, enter any whole
     *            number from 1 to 604800 (inclusive), in seconds. For
     *            <code>Comparison</code>, you must enter <code>LT</code> (for
     *            "Less than").
     *            </p>
     *            </dd>
     *            <dt>SUM_CONTACTS_ABANDONED_IN_X</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            <p>
     *            Threshold: For <code>ThresholdValue</code>, enter any whole
     *            number from 1 to 604800 (inclusive), in seconds. For
     *            <code>Comparison</code>, you must enter <code>LT</code> (for
     *            "Less than").
     *            </p>
     *            </dd>
     *            <dt>SUM_CONTACTS_DISCONNECTED</dt>
     *            <dd>
     *            <p>
     *            Valid metric filter key: <code>DISCONNECT_REASON</code>
     *            </p>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            <dt>SUM_ERROR_STATUS_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_HANDLE_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_HOLD_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_IDLE_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Routing Profile, Agent, Agent
     *            Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_INTERACTION_AND_HOLD_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_INTERACTION_TIME</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            Agent, Agent Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_NON_PRODUCTIVE_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Routing Profile, Agent, Agent
     *            Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_ONLINE_TIME_AGENT</dt>
     *            <dd>
     *            <p>
     *            Unit: Seconds
     *            </p>
     *            <p>
     *            Valid groupings and filters: Routing Profile, Agent, Agent
     *            Hierarchy
     *            </p>
     *            </dd>
     *            <dt>SUM_RETRY_CALLBACK_ATTEMPTS</dt>
     *            <dd>
     *            <p>
     *            Unit: Count
     *            </p>
     *            <p>
     *            Valid groupings and filters: Queue, Channel, Routing Profile,
     *            contact/segmentAttributes/connect:Subtype
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataV2Request withMetrics(java.util.Collection<MetricV2> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataV2Request withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results to return per page.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per page.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMetricDataV2Request withMaxResults(Integer maxResults) {
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getInterval() != null)
            sb.append("Interval: " + getInterval() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getGroupings() != null)
            sb.append("Groupings: " + getGroupings() + ",");
        if (getMetrics() != null)
            sb.append("Metrics: " + getMetrics() + ",");
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

        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getGroupings() == null) ? 0 : getGroupings().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
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

        if (obj instanceof GetMetricDataV2Request == false)
            return false;
        GetMetricDataV2Request other = (GetMetricDataV2Request) obj;

        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
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
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
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
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
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
