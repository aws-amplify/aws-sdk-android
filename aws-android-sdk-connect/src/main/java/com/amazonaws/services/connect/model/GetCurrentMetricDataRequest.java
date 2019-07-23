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
 * The <code>GetCurrentMetricData</code> operation retrieves current metric data
 * from your Amazon Connect instance.
 * </p>
 * <p>
 * If you are using an IAM account, it must have permission to the
 * <code>connect:GetCurrentMetricData</code> action.
 * </p>
 */
public class GetCurrentMetricDataRequest extends AmazonWebServiceRequest implements Serializable {
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
     * A <code>Filters</code> object that contains a list of queue IDs or queue
     * ARNs, up to 100, or list of Channels to use to filter the metrics
     * returned in the response. Metric data is retrieved only for the resources
     * associated with the queue IDs, ARNs, or Channels included in the filter.
     * You can include both IDs and ARNs in the same request. To retrieve
     * metrics for all queues, add the queue ID or ARN for each queue in your
     * instance. Only VOICE is supported for Channels.
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
     * The grouping applied to the metrics returned. For example, when grouped
     * by QUEUE, the metrics returned apply to each queue rather than aggregated
     * for all queues. If you group by CHANNEL, you should include a Channels
     * filter. The only supported channel is VOICE.
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of
     * <code>CurrentMetrics</code> is returned.
     * </p>
     */
    private java.util.List<String> groupings;

    /**
     * <p>
     * A list of <code>CurrentMetric</code> objects for the metrics to retrieve.
     * Each <code>CurrentMetric</code> includes a name of a metric to retrieve
     * and the unit to use for it. You must list each metric to retrieve data
     * for in the request.
     * </p>
     * <p>
     * The following metrics are available:
     * </p>
     * <dl>
     * <dt>AGENTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ONLINE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CALL</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_STAFFED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_NON_PRODUCTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ERROR</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>CONTACTS_IN_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>OLDEST_CONTACT_AGE</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * </dd>
     * <dt>CONTACTS_SCHEDULED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * </dl>
     */
    private java.util.List<CurrentMetric> currentMetrics;

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * The token expires after 5 minutes from the time it is created. Subsequent
     * requests that use the <a href="">NextToken</a> must use the same request
     * parameters as the request that generated the token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * <code>MaxResults</code> indicates the maximum number of results to return
     * per page in the response, between 1 and 100.
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
    public GetCurrentMetricDataRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * A <code>Filters</code> object that contains a list of queue IDs or queue
     * ARNs, up to 100, or list of Channels to use to filter the metrics
     * returned in the response. Metric data is retrieved only for the resources
     * associated with the queue IDs, ARNs, or Channels included in the filter.
     * You can include both IDs and ARNs in the same request. To retrieve
     * metrics for all queues, add the queue ID or ARN for each queue in your
     * instance. Only VOICE is supported for Channels.
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
     *         or queue ARNs, up to 100, or list of Channels to use to filter
     *         the metrics returned in the response. Metric data is retrieved
     *         only for the resources associated with the queue IDs, ARNs, or
     *         Channels included in the filter. You can include both IDs and
     *         ARNs in the same request. To retrieve metrics for all queues, add
     *         the queue ID or ARN for each queue in your instance. Only VOICE
     *         is supported for Channels.
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
     * ARNs, up to 100, or list of Channels to use to filter the metrics
     * returned in the response. Metric data is retrieved only for the resources
     * associated with the queue IDs, ARNs, or Channels included in the filter.
     * You can include both IDs and ARNs in the same request. To retrieve
     * metrics for all queues, add the queue ID or ARN for each queue in your
     * instance. Only VOICE is supported for Channels.
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
     *            IDs or queue ARNs, up to 100, or list of Channels to use to
     *            filter the metrics returned in the response. Metric data is
     *            retrieved only for the resources associated with the queue
     *            IDs, ARNs, or Channels included in the filter. You can include
     *            both IDs and ARNs in the same request. To retrieve metrics for
     *            all queues, add the queue ID or ARN for each queue in your
     *            instance. Only VOICE is supported for Channels.
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
     * ARNs, up to 100, or list of Channels to use to filter the metrics
     * returned in the response. Metric data is retrieved only for the resources
     * associated with the queue IDs, ARNs, or Channels included in the filter.
     * You can include both IDs and ARNs in the same request. To retrieve
     * metrics for all queues, add the queue ID or ARN for each queue in your
     * instance. Only VOICE is supported for Channels.
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
     *            IDs or queue ARNs, up to 100, or list of Channels to use to
     *            filter the metrics returned in the response. Metric data is
     *            retrieved only for the resources associated with the queue
     *            IDs, ARNs, or Channels included in the filter. You can include
     *            both IDs and ARNs in the same request. To retrieve metrics for
     *            all queues, add the queue ID or ARN for each queue in your
     *            instance. Only VOICE is supported for Channels.
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
    public GetCurrentMetricDataRequest withFilters(Filters filters) {
        this.filters = filters;
        return this;
    }

    /**
     * <p>
     * The grouping applied to the metrics returned. For example, when grouped
     * by QUEUE, the metrics returned apply to each queue rather than aggregated
     * for all queues. If you group by CHANNEL, you should include a Channels
     * filter. The only supported channel is VOICE.
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of
     * <code>CurrentMetrics</code> is returned.
     * </p>
     *
     * @return <p>
     *         The grouping applied to the metrics returned. For example, when
     *         grouped by QUEUE, the metrics returned apply to each queue rather
     *         than aggregated for all queues. If you group by CHANNEL, you
     *         should include a Channels filter. The only supported channel is
     *         VOICE.
     *         </p>
     *         <p>
     *         If no <code>Grouping</code> is included in the request, a summary
     *         of <code>CurrentMetrics</code> is returned.
     *         </p>
     */
    public java.util.List<String> getGroupings() {
        return groupings;
    }

    /**
     * <p>
     * The grouping applied to the metrics returned. For example, when grouped
     * by QUEUE, the metrics returned apply to each queue rather than aggregated
     * for all queues. If you group by CHANNEL, you should include a Channels
     * filter. The only supported channel is VOICE.
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of
     * <code>CurrentMetrics</code> is returned.
     * </p>
     *
     * @param groupings <p>
     *            The grouping applied to the metrics returned. For example,
     *            when grouped by QUEUE, the metrics returned apply to each
     *            queue rather than aggregated for all queues. If you group by
     *            CHANNEL, you should include a Channels filter. The only
     *            supported channel is VOICE.
     *            </p>
     *            <p>
     *            If no <code>Grouping</code> is included in the request, a
     *            summary of <code>CurrentMetrics</code> is returned.
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
     * The grouping applied to the metrics returned. For example, when grouped
     * by QUEUE, the metrics returned apply to each queue rather than aggregated
     * for all queues. If you group by CHANNEL, you should include a Channels
     * filter. The only supported channel is VOICE.
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of
     * <code>CurrentMetrics</code> is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupings <p>
     *            The grouping applied to the metrics returned. For example,
     *            when grouped by QUEUE, the metrics returned apply to each
     *            queue rather than aggregated for all queues. If you group by
     *            CHANNEL, you should include a Channels filter. The only
     *            supported channel is VOICE.
     *            </p>
     *            <p>
     *            If no <code>Grouping</code> is included in the request, a
     *            summary of <code>CurrentMetrics</code> is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCurrentMetricDataRequest withGroupings(String... groupings) {
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
     * The grouping applied to the metrics returned. For example, when grouped
     * by QUEUE, the metrics returned apply to each queue rather than aggregated
     * for all queues. If you group by CHANNEL, you should include a Channels
     * filter. The only supported channel is VOICE.
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of
     * <code>CurrentMetrics</code> is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupings <p>
     *            The grouping applied to the metrics returned. For example,
     *            when grouped by QUEUE, the metrics returned apply to each
     *            queue rather than aggregated for all queues. If you group by
     *            CHANNEL, you should include a Channels filter. The only
     *            supported channel is VOICE.
     *            </p>
     *            <p>
     *            If no <code>Grouping</code> is included in the request, a
     *            summary of <code>CurrentMetrics</code> is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCurrentMetricDataRequest withGroupings(java.util.Collection<String> groupings) {
        setGroupings(groupings);
        return this;
    }

    /**
     * <p>
     * A list of <code>CurrentMetric</code> objects for the metrics to retrieve.
     * Each <code>CurrentMetric</code> includes a name of a metric to retrieve
     * and the unit to use for it. You must list each metric to retrieve data
     * for in the request.
     * </p>
     * <p>
     * The following metrics are available:
     * </p>
     * <dl>
     * <dt>AGENTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ONLINE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CALL</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_STAFFED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_NON_PRODUCTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ERROR</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>CONTACTS_IN_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>OLDEST_CONTACT_AGE</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * </dd>
     * <dt>CONTACTS_SCHEDULED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * </dl>
     *
     * @return <p>
     *         A list of <code>CurrentMetric</code> objects for the metrics to
     *         retrieve. Each <code>CurrentMetric</code> includes a name of a
     *         metric to retrieve and the unit to use for it. You must list each
     *         metric to retrieve data for in the request.
     *         </p>
     *         <p>
     *         The following metrics are available:
     *         </p>
     *         <dl>
     *         <dt>AGENTS_AVAILABLE</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>AGENTS_ONLINE</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>AGENTS_ON_CALL</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>AGENTS_STAFFED</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>AGENTS_NON_PRODUCTIVE</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>AGENTS_ERROR</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_IN_QUEUE</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         <dt>OLDEST_CONTACT_AGE</dt>
     *         <dd>
     *         <p>
     *         Unit: SECONDS
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_SCHEDULED</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         </dd>
     *         </dl>
     */
    public java.util.List<CurrentMetric> getCurrentMetrics() {
        return currentMetrics;
    }

    /**
     * <p>
     * A list of <code>CurrentMetric</code> objects for the metrics to retrieve.
     * Each <code>CurrentMetric</code> includes a name of a metric to retrieve
     * and the unit to use for it. You must list each metric to retrieve data
     * for in the request.
     * </p>
     * <p>
     * The following metrics are available:
     * </p>
     * <dl>
     * <dt>AGENTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ONLINE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CALL</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_STAFFED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_NON_PRODUCTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ERROR</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>CONTACTS_IN_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>OLDEST_CONTACT_AGE</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * </dd>
     * <dt>CONTACTS_SCHEDULED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * </dl>
     *
     * @param currentMetrics <p>
     *            A list of <code>CurrentMetric</code> objects for the metrics
     *            to retrieve. Each <code>CurrentMetric</code> includes a name
     *            of a metric to retrieve and the unit to use for it. You must
     *            list each metric to retrieve data for in the request.
     *            </p>
     *            <p>
     *            The following metrics are available:
     *            </p>
     *            <dl>
     *            <dt>AGENTS_AVAILABLE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ONLINE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ON_CALL</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>AGENTS_STAFFED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>AGENTS_NON_PRODUCTIVE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ERROR</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_IN_QUEUE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>OLDEST_CONTACT_AGE</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_SCHEDULED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            </dl>
     */
    public void setCurrentMetrics(java.util.Collection<CurrentMetric> currentMetrics) {
        if (currentMetrics == null) {
            this.currentMetrics = null;
            return;
        }

        this.currentMetrics = new java.util.ArrayList<CurrentMetric>(currentMetrics);
    }

    /**
     * <p>
     * A list of <code>CurrentMetric</code> objects for the metrics to retrieve.
     * Each <code>CurrentMetric</code> includes a name of a metric to retrieve
     * and the unit to use for it. You must list each metric to retrieve data
     * for in the request.
     * </p>
     * <p>
     * The following metrics are available:
     * </p>
     * <dl>
     * <dt>AGENTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ONLINE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CALL</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_STAFFED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_NON_PRODUCTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ERROR</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>CONTACTS_IN_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>OLDEST_CONTACT_AGE</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * </dd>
     * <dt>CONTACTS_SCHEDULED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentMetrics <p>
     *            A list of <code>CurrentMetric</code> objects for the metrics
     *            to retrieve. Each <code>CurrentMetric</code> includes a name
     *            of a metric to retrieve and the unit to use for it. You must
     *            list each metric to retrieve data for in the request.
     *            </p>
     *            <p>
     *            The following metrics are available:
     *            </p>
     *            <dl>
     *            <dt>AGENTS_AVAILABLE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ONLINE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ON_CALL</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>AGENTS_STAFFED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>AGENTS_NON_PRODUCTIVE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ERROR</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_IN_QUEUE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>OLDEST_CONTACT_AGE</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_SCHEDULED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCurrentMetricDataRequest withCurrentMetrics(CurrentMetric... currentMetrics) {
        if (getCurrentMetrics() == null) {
            this.currentMetrics = new java.util.ArrayList<CurrentMetric>(currentMetrics.length);
        }
        for (CurrentMetric value : currentMetrics) {
            this.currentMetrics.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>CurrentMetric</code> objects for the metrics to retrieve.
     * Each <code>CurrentMetric</code> includes a name of a metric to retrieve
     * and the unit to use for it. You must list each metric to retrieve data
     * for in the request.
     * </p>
     * <p>
     * The following metrics are available:
     * </p>
     * <dl>
     * <dt>AGENTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ONLINE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CALL</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_STAFFED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_NON_PRODUCTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>AGENTS_ERROR</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>CONTACTS_IN_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * <dt>OLDEST_CONTACT_AGE</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * </dd>
     * <dt>CONTACTS_SCHEDULED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentMetrics <p>
     *            A list of <code>CurrentMetric</code> objects for the metrics
     *            to retrieve. Each <code>CurrentMetric</code> includes a name
     *            of a metric to retrieve and the unit to use for it. You must
     *            list each metric to retrieve data for in the request.
     *            </p>
     *            <p>
     *            The following metrics are available:
     *            </p>
     *            <dl>
     *            <dt>AGENTS_AVAILABLE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ONLINE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ON_CALL</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>AGENTS_STAFFED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>AGENTS_NON_PRODUCTIVE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ERROR</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_IN_QUEUE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            <dt>OLDEST_CONTACT_AGE</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_SCHEDULED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCurrentMetricDataRequest withCurrentMetrics(
            java.util.Collection<CurrentMetric> currentMetrics) {
        setCurrentMetrics(currentMetrics);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * The token expires after 5 minutes from the time it is created. Subsequent
     * requests that use the <a href="">NextToken</a> must use the same request
     * parameters as the request that generated the token.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results. Use the value returned in
     *         the previous response in the next request to retrieve the next
     *         set of results.
     *         </p>
     *         <p>
     *         The token expires after 5 minutes from the time it is created.
     *         Subsequent requests that use the <a href="">NextToken</a> must
     *         use the same request parameters as the request that generated the
     *         token.
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
     * The token expires after 5 minutes from the time it is created. Subsequent
     * requests that use the <a href="">NextToken</a> must use the same request
     * parameters as the request that generated the token.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     *            <p>
     *            The token expires after 5 minutes from the time it is created.
     *            Subsequent requests that use the <a href="">NextToken</a> must
     *            use the same request parameters as the request that generated
     *            the token.
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
     * The token expires after 5 minutes from the time it is created. Subsequent
     * requests that use the <a href="">NextToken</a> must use the same request
     * parameters as the request that generated the token.
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
     *            <p>
     *            The token expires after 5 minutes from the time it is created.
     *            Subsequent requests that use the <a href="">NextToken</a> must
     *            use the same request parameters as the request that generated
     *            the token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCurrentMetricDataRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * <code>MaxResults</code> indicates the maximum number of results to return
     * per page in the response, between 1 and 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         <code>MaxResults</code> indicates the maximum number of results
     *         to return per page in the response, between 1 and 100.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * <code>MaxResults</code> indicates the maximum number of results to return
     * per page in the response, between 1 and 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            <code>MaxResults</code> indicates the maximum number of
     *            results to return per page in the response, between 1 and 100.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * <code>MaxResults</code> indicates the maximum number of results to return
     * per page in the response, between 1 and 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            <code>MaxResults</code> indicates the maximum number of
     *            results to return per page in the response, between 1 and 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCurrentMetricDataRequest withMaxResults(Integer maxResults) {
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getGroupings() != null)
            sb.append("Groupings: " + getGroupings() + ",");
        if (getCurrentMetrics() != null)
            sb.append("CurrentMetrics: " + getCurrentMetrics() + ",");
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
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getGroupings() == null) ? 0 : getGroupings().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentMetrics() == null) ? 0 : getCurrentMetrics().hashCode());
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

        if (obj instanceof GetCurrentMetricDataRequest == false)
            return false;
        GetCurrentMetricDataRequest other = (GetCurrentMetricDataRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
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
        if (other.getCurrentMetrics() == null ^ this.getCurrentMetrics() == null)
            return false;
        if (other.getCurrentMetrics() != null
                && other.getCurrentMetrics().equals(this.getCurrentMetrics()) == false)
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
