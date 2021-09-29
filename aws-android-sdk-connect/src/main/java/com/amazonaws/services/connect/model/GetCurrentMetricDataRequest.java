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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the real-time metric data from the specified Amazon Connect instance.
 * </p>
 * <p>
 * For a description of each metric, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html"
 * >Real-time Metrics Definitions</a> in the <i>Amazon Connect Administrator
 * Guide</i>.
 * </p>
 */
public class GetCurrentMetricDataRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The queues, up to 100, or channels, to use to filter the metrics
     * returned. Metric data is retrieved only for the resources associated with
     * the queues or channels included in the filter. You can include both queue
     * IDs and queue ARNs in the same request. VOICE, CHAT, and TASK channels
     * are supported.
     * </p>
     */
    private Filters filters;

    /**
     * <p>
     * The grouping applied to the metrics returned. For example, when grouped
     * by <code>QUEUE</code>, the metrics returned apply to each queue rather
     * than aggregated for all queues. If you group by <code>CHANNEL</code>, you
     * should include a Channels filter. VOICE, CHAT, and TASK channels are
     * supported.
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of
     * metrics is returned.
     * </p>
     */
    private java.util.List<String> groupings;

    /**
     * <p>
     * The metrics to retrieve. Specify the name and unit for each metric. The
     * following metrics are available. For a description of all the metrics,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html"
     * >Real-time Metrics Definitions</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <dl>
     * <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#aftercallwork-real-time"
     * >ACW</a>
     * </p>
     * </dd>
     * <dt>AGENTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#available-real-time"
     * >Available</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ERROR</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#error-real-time"
     * >Error</a>
     * </p>
     * </dd>
     * <dt>AGENTS_NON_PRODUCTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#non-productive-time-real-time"
     * >NPT (Non-Productive Time)</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CALL</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#on-call-real-time"
     * >On contact</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CONTACT</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#on-call-real-time"
     * >On contact</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ONLINE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#online-real-time"
     * >Online</a>
     * </p>
     * </dd>
     * <dt>AGENTS_STAFFED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#staffed-real-time"
     * >Staffed</a>
     * </p>
     * </dd>
     * <dt>CONTACTS_IN_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#in-queue-real-time"
     * >In queue</a>
     * </p>
     * </dd>
     * <dt>CONTACTS_SCHEDULED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#scheduled-real-time"
     * >Scheduled</a>
     * </p>
     * </dd>
     * <dt>OLDEST_CONTACT_AGE</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * When you use groupings, Unit says SECONDS and the Value is returned in
     * SECONDS.
     * </p>
     * <p>
     * When you do not use groupings, Unit says SECONDS but the Value is
     * returned in MILLISECONDS. For example, if you get a response like this:
     * </p>
     * <p>
     * <code>{ "Metric": { "Name": "OLDEST_CONTACT_AGE", "Unit": "SECONDS" }, "Value": 24113.0 </code>
     * </p>
     * <p>
     * The actual OLDEST_CONTACT_AGE is 24 seconds.
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#oldest-real-time"
     * >Oldest</a>
     * </p>
     * </dd>
     * <dt>SLOTS_ACTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#active-real-time"
     * >Active</a>
     * </p>
     * </dd>
     * <dt>SLOTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#availability-real-time"
     * >Availability</a>
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
     * requests that use the token must use the same request parameters as the
     * request that generated the token.
     * </p>
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
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
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
     * The queues, up to 100, or channels, to use to filter the metrics
     * returned. Metric data is retrieved only for the resources associated with
     * the queues or channels included in the filter. You can include both queue
     * IDs and queue ARNs in the same request. VOICE, CHAT, and TASK channels
     * are supported.
     * </p>
     *
     * @return <p>
     *         The queues, up to 100, or channels, to use to filter the metrics
     *         returned. Metric data is retrieved only for the resources
     *         associated with the queues or channels included in the filter.
     *         You can include both queue IDs and queue ARNs in the same
     *         request. VOICE, CHAT, and TASK channels are supported.
     *         </p>
     */
    public Filters getFilters() {
        return filters;
    }

    /**
     * <p>
     * The queues, up to 100, or channels, to use to filter the metrics
     * returned. Metric data is retrieved only for the resources associated with
     * the queues or channels included in the filter. You can include both queue
     * IDs and queue ARNs in the same request. VOICE, CHAT, and TASK channels
     * are supported.
     * </p>
     *
     * @param filters <p>
     *            The queues, up to 100, or channels, to use to filter the
     *            metrics returned. Metric data is retrieved only for the
     *            resources associated with the queues or channels included in
     *            the filter. You can include both queue IDs and queue ARNs in
     *            the same request. VOICE, CHAT, and TASK channels are
     *            supported.
     *            </p>
     */
    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * The queues, up to 100, or channels, to use to filter the metrics
     * returned. Metric data is retrieved only for the resources associated with
     * the queues or channels included in the filter. You can include both queue
     * IDs and queue ARNs in the same request. VOICE, CHAT, and TASK channels
     * are supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The queues, up to 100, or channels, to use to filter the
     *            metrics returned. Metric data is retrieved only for the
     *            resources associated with the queues or channels included in
     *            the filter. You can include both queue IDs and queue ARNs in
     *            the same request. VOICE, CHAT, and TASK channels are
     *            supported.
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
     * by <code>QUEUE</code>, the metrics returned apply to each queue rather
     * than aggregated for all queues. If you group by <code>CHANNEL</code>, you
     * should include a Channels filter. VOICE, CHAT, and TASK channels are
     * supported.
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of
     * metrics is returned.
     * </p>
     *
     * @return <p>
     *         The grouping applied to the metrics returned. For example, when
     *         grouped by <code>QUEUE</code>, the metrics returned apply to each
     *         queue rather than aggregated for all queues. If you group by
     *         <code>CHANNEL</code>, you should include a Channels filter.
     *         VOICE, CHAT, and TASK channels are supported.
     *         </p>
     *         <p>
     *         If no <code>Grouping</code> is included in the request, a summary
     *         of metrics is returned.
     *         </p>
     */
    public java.util.List<String> getGroupings() {
        return groupings;
    }

    /**
     * <p>
     * The grouping applied to the metrics returned. For example, when grouped
     * by <code>QUEUE</code>, the metrics returned apply to each queue rather
     * than aggregated for all queues. If you group by <code>CHANNEL</code>, you
     * should include a Channels filter. VOICE, CHAT, and TASK channels are
     * supported.
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of
     * metrics is returned.
     * </p>
     *
     * @param groupings <p>
     *            The grouping applied to the metrics returned. For example,
     *            when grouped by <code>QUEUE</code>, the metrics returned apply
     *            to each queue rather than aggregated for all queues. If you
     *            group by <code>CHANNEL</code>, you should include a Channels
     *            filter. VOICE, CHAT, and TASK channels are supported.
     *            </p>
     *            <p>
     *            If no <code>Grouping</code> is included in the request, a
     *            summary of metrics is returned.
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
     * by <code>QUEUE</code>, the metrics returned apply to each queue rather
     * than aggregated for all queues. If you group by <code>CHANNEL</code>, you
     * should include a Channels filter. VOICE, CHAT, and TASK channels are
     * supported.
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of
     * metrics is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupings <p>
     *            The grouping applied to the metrics returned. For example,
     *            when grouped by <code>QUEUE</code>, the metrics returned apply
     *            to each queue rather than aggregated for all queues. If you
     *            group by <code>CHANNEL</code>, you should include a Channels
     *            filter. VOICE, CHAT, and TASK channels are supported.
     *            </p>
     *            <p>
     *            If no <code>Grouping</code> is included in the request, a
     *            summary of metrics is returned.
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
     * by <code>QUEUE</code>, the metrics returned apply to each queue rather
     * than aggregated for all queues. If you group by <code>CHANNEL</code>, you
     * should include a Channels filter. VOICE, CHAT, and TASK channels are
     * supported.
     * </p>
     * <p>
     * If no <code>Grouping</code> is included in the request, a summary of
     * metrics is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupings <p>
     *            The grouping applied to the metrics returned. For example,
     *            when grouped by <code>QUEUE</code>, the metrics returned apply
     *            to each queue rather than aggregated for all queues. If you
     *            group by <code>CHANNEL</code>, you should include a Channels
     *            filter. VOICE, CHAT, and TASK channels are supported.
     *            </p>
     *            <p>
     *            If no <code>Grouping</code> is included in the request, a
     *            summary of metrics is returned.
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
     * The metrics to retrieve. Specify the name and unit for each metric. The
     * following metrics are available. For a description of all the metrics,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html"
     * >Real-time Metrics Definitions</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <dl>
     * <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#aftercallwork-real-time"
     * >ACW</a>
     * </p>
     * </dd>
     * <dt>AGENTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#available-real-time"
     * >Available</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ERROR</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#error-real-time"
     * >Error</a>
     * </p>
     * </dd>
     * <dt>AGENTS_NON_PRODUCTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#non-productive-time-real-time"
     * >NPT (Non-Productive Time)</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CALL</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#on-call-real-time"
     * >On contact</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CONTACT</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#on-call-real-time"
     * >On contact</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ONLINE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#online-real-time"
     * >Online</a>
     * </p>
     * </dd>
     * <dt>AGENTS_STAFFED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#staffed-real-time"
     * >Staffed</a>
     * </p>
     * </dd>
     * <dt>CONTACTS_IN_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#in-queue-real-time"
     * >In queue</a>
     * </p>
     * </dd>
     * <dt>CONTACTS_SCHEDULED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#scheduled-real-time"
     * >Scheduled</a>
     * </p>
     * </dd>
     * <dt>OLDEST_CONTACT_AGE</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * When you use groupings, Unit says SECONDS and the Value is returned in
     * SECONDS.
     * </p>
     * <p>
     * When you do not use groupings, Unit says SECONDS but the Value is
     * returned in MILLISECONDS. For example, if you get a response like this:
     * </p>
     * <p>
     * <code>{ "Metric": { "Name": "OLDEST_CONTACT_AGE", "Unit": "SECONDS" }, "Value": 24113.0 </code>
     * </p>
     * <p>
     * The actual OLDEST_CONTACT_AGE is 24 seconds.
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#oldest-real-time"
     * >Oldest</a>
     * </p>
     * </dd>
     * <dt>SLOTS_ACTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#active-real-time"
     * >Active</a>
     * </p>
     * </dd>
     * <dt>SLOTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#availability-real-time"
     * >Availability</a>
     * </p>
     * </dd>
     * </dl>
     *
     * @return <p>
     *         The metrics to retrieve. Specify the name and unit for each
     *         metric. The following metrics are available. For a description of
     *         all the metrics, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html"
     *         >Real-time Metrics Definitions</a> in the <i>Amazon Connect
     *         Administrator Guide</i>.
     *         </p>
     *         <dl>
     *         <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Name in real-time metrics report: <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#aftercallwork-real-time"
     *         >ACW</a>
     *         </p>
     *         </dd>
     *         <dt>AGENTS_AVAILABLE</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Name in real-time metrics report: <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#available-real-time"
     *         >Available</a>
     *         </p>
     *         </dd>
     *         <dt>AGENTS_ERROR</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Name in real-time metrics report: <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#error-real-time"
     *         >Error</a>
     *         </p>
     *         </dd>
     *         <dt>AGENTS_NON_PRODUCTIVE</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Name in real-time metrics report: <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#non-productive-time-real-time"
     *         >NPT (Non-Productive Time)</a>
     *         </p>
     *         </dd>
     *         <dt>AGENTS_ON_CALL</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Name in real-time metrics report: <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#on-call-real-time"
     *         >On contact</a>
     *         </p>
     *         </dd>
     *         <dt>AGENTS_ON_CONTACT</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Name in real-time metrics report: <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#on-call-real-time"
     *         >On contact</a>
     *         </p>
     *         </dd>
     *         <dt>AGENTS_ONLINE</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Name in real-time metrics report: <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#online-real-time"
     *         >Online</a>
     *         </p>
     *         </dd>
     *         <dt>AGENTS_STAFFED</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Name in real-time metrics report: <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#staffed-real-time"
     *         >Staffed</a>
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_IN_QUEUE</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Name in real-time metrics report: <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#in-queue-real-time"
     *         >In queue</a>
     *         </p>
     *         </dd>
     *         <dt>CONTACTS_SCHEDULED</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Name in real-time metrics report: <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#scheduled-real-time"
     *         >Scheduled</a>
     *         </p>
     *         </dd>
     *         <dt>OLDEST_CONTACT_AGE</dt>
     *         <dd>
     *         <p>
     *         Unit: SECONDS
     *         </p>
     *         <p>
     *         When you use groupings, Unit says SECONDS and the Value is
     *         returned in SECONDS.
     *         </p>
     *         <p>
     *         When you do not use groupings, Unit says SECONDS but the Value is
     *         returned in MILLISECONDS. For example, if you get a response like
     *         this:
     *         </p>
     *         <p>
     *         <code>{ "Metric": { "Name": "OLDEST_CONTACT_AGE", "Unit": "SECONDS" }, "Value": 24113.0 </code>
     *         </p>
     *         <p>
     *         The actual OLDEST_CONTACT_AGE is 24 seconds.
     *         </p>
     *         <p>
     *         Name in real-time metrics report: <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#oldest-real-time"
     *         >Oldest</a>
     *         </p>
     *         </dd>
     *         <dt>SLOTS_ACTIVE</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Name in real-time metrics report: <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#active-real-time"
     *         >Active</a>
     *         </p>
     *         </dd>
     *         <dt>SLOTS_AVAILABLE</dt>
     *         <dd>
     *         <p>
     *         Unit: COUNT
     *         </p>
     *         <p>
     *         Name in real-time metrics report: <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#availability-real-time"
     *         >Availability</a>
     *         </p>
     *         </dd>
     *         </dl>
     */
    public java.util.List<CurrentMetric> getCurrentMetrics() {
        return currentMetrics;
    }

    /**
     * <p>
     * The metrics to retrieve. Specify the name and unit for each metric. The
     * following metrics are available. For a description of all the metrics,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html"
     * >Real-time Metrics Definitions</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <dl>
     * <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#aftercallwork-real-time"
     * >ACW</a>
     * </p>
     * </dd>
     * <dt>AGENTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#available-real-time"
     * >Available</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ERROR</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#error-real-time"
     * >Error</a>
     * </p>
     * </dd>
     * <dt>AGENTS_NON_PRODUCTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#non-productive-time-real-time"
     * >NPT (Non-Productive Time)</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CALL</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#on-call-real-time"
     * >On contact</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CONTACT</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#on-call-real-time"
     * >On contact</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ONLINE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#online-real-time"
     * >Online</a>
     * </p>
     * </dd>
     * <dt>AGENTS_STAFFED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#staffed-real-time"
     * >Staffed</a>
     * </p>
     * </dd>
     * <dt>CONTACTS_IN_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#in-queue-real-time"
     * >In queue</a>
     * </p>
     * </dd>
     * <dt>CONTACTS_SCHEDULED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#scheduled-real-time"
     * >Scheduled</a>
     * </p>
     * </dd>
     * <dt>OLDEST_CONTACT_AGE</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * When you use groupings, Unit says SECONDS and the Value is returned in
     * SECONDS.
     * </p>
     * <p>
     * When you do not use groupings, Unit says SECONDS but the Value is
     * returned in MILLISECONDS. For example, if you get a response like this:
     * </p>
     * <p>
     * <code>{ "Metric": { "Name": "OLDEST_CONTACT_AGE", "Unit": "SECONDS" }, "Value": 24113.0 </code>
     * </p>
     * <p>
     * The actual OLDEST_CONTACT_AGE is 24 seconds.
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#oldest-real-time"
     * >Oldest</a>
     * </p>
     * </dd>
     * <dt>SLOTS_ACTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#active-real-time"
     * >Active</a>
     * </p>
     * </dd>
     * <dt>SLOTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#availability-real-time"
     * >Availability</a>
     * </p>
     * </dd>
     * </dl>
     *
     * @param currentMetrics <p>
     *            The metrics to retrieve. Specify the name and unit for each
     *            metric. The following metrics are available. For a description
     *            of all the metrics, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html"
     *            >Real-time Metrics Definitions</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     *            <dl>
     *            <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#aftercallwork-real-time"
     *            >ACW</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_AVAILABLE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#available-real-time"
     *            >Available</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ERROR</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#error-real-time"
     *            >Error</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_NON_PRODUCTIVE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#non-productive-time-real-time"
     *            >NPT (Non-Productive Time)</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ON_CALL</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#on-call-real-time"
     *            >On contact</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ON_CONTACT</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#on-call-real-time"
     *            >On contact</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ONLINE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#online-real-time"
     *            >Online</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_STAFFED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#staffed-real-time"
     *            >Staffed</a>
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_IN_QUEUE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#in-queue-real-time"
     *            >In queue</a>
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_SCHEDULED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#scheduled-real-time"
     *            >Scheduled</a>
     *            </p>
     *            </dd>
     *            <dt>OLDEST_CONTACT_AGE</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            When you use groupings, Unit says SECONDS and the Value is
     *            returned in SECONDS.
     *            </p>
     *            <p>
     *            When you do not use groupings, Unit says SECONDS but the Value
     *            is returned in MILLISECONDS. For example, if you get a
     *            response like this:
     *            </p>
     *            <p>
     *            <code>{ "Metric": { "Name": "OLDEST_CONTACT_AGE", "Unit": "SECONDS" }, "Value": 24113.0 </code>
     *            </p>
     *            <p>
     *            The actual OLDEST_CONTACT_AGE is 24 seconds.
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#oldest-real-time"
     *            >Oldest</a>
     *            </p>
     *            </dd>
     *            <dt>SLOTS_ACTIVE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#active-real-time"
     *            >Active</a>
     *            </p>
     *            </dd>
     *            <dt>SLOTS_AVAILABLE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#availability-real-time"
     *            >Availability</a>
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
     * The metrics to retrieve. Specify the name and unit for each metric. The
     * following metrics are available. For a description of all the metrics,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html"
     * >Real-time Metrics Definitions</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <dl>
     * <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#aftercallwork-real-time"
     * >ACW</a>
     * </p>
     * </dd>
     * <dt>AGENTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#available-real-time"
     * >Available</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ERROR</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#error-real-time"
     * >Error</a>
     * </p>
     * </dd>
     * <dt>AGENTS_NON_PRODUCTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#non-productive-time-real-time"
     * >NPT (Non-Productive Time)</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CALL</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#on-call-real-time"
     * >On contact</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CONTACT</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#on-call-real-time"
     * >On contact</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ONLINE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#online-real-time"
     * >Online</a>
     * </p>
     * </dd>
     * <dt>AGENTS_STAFFED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#staffed-real-time"
     * >Staffed</a>
     * </p>
     * </dd>
     * <dt>CONTACTS_IN_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#in-queue-real-time"
     * >In queue</a>
     * </p>
     * </dd>
     * <dt>CONTACTS_SCHEDULED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#scheduled-real-time"
     * >Scheduled</a>
     * </p>
     * </dd>
     * <dt>OLDEST_CONTACT_AGE</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * When you use groupings, Unit says SECONDS and the Value is returned in
     * SECONDS.
     * </p>
     * <p>
     * When you do not use groupings, Unit says SECONDS but the Value is
     * returned in MILLISECONDS. For example, if you get a response like this:
     * </p>
     * <p>
     * <code>{ "Metric": { "Name": "OLDEST_CONTACT_AGE", "Unit": "SECONDS" }, "Value": 24113.0 </code>
     * </p>
     * <p>
     * The actual OLDEST_CONTACT_AGE is 24 seconds.
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#oldest-real-time"
     * >Oldest</a>
     * </p>
     * </dd>
     * <dt>SLOTS_ACTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#active-real-time"
     * >Active</a>
     * </p>
     * </dd>
     * <dt>SLOTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#availability-real-time"
     * >Availability</a>
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentMetrics <p>
     *            The metrics to retrieve. Specify the name and unit for each
     *            metric. The following metrics are available. For a description
     *            of all the metrics, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html"
     *            >Real-time Metrics Definitions</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     *            <dl>
     *            <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#aftercallwork-real-time"
     *            >ACW</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_AVAILABLE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#available-real-time"
     *            >Available</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ERROR</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#error-real-time"
     *            >Error</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_NON_PRODUCTIVE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#non-productive-time-real-time"
     *            >NPT (Non-Productive Time)</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ON_CALL</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#on-call-real-time"
     *            >On contact</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ON_CONTACT</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#on-call-real-time"
     *            >On contact</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ONLINE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#online-real-time"
     *            >Online</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_STAFFED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#staffed-real-time"
     *            >Staffed</a>
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_IN_QUEUE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#in-queue-real-time"
     *            >In queue</a>
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_SCHEDULED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#scheduled-real-time"
     *            >Scheduled</a>
     *            </p>
     *            </dd>
     *            <dt>OLDEST_CONTACT_AGE</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            When you use groupings, Unit says SECONDS and the Value is
     *            returned in SECONDS.
     *            </p>
     *            <p>
     *            When you do not use groupings, Unit says SECONDS but the Value
     *            is returned in MILLISECONDS. For example, if you get a
     *            response like this:
     *            </p>
     *            <p>
     *            <code>{ "Metric": { "Name": "OLDEST_CONTACT_AGE", "Unit": "SECONDS" }, "Value": 24113.0 </code>
     *            </p>
     *            <p>
     *            The actual OLDEST_CONTACT_AGE is 24 seconds.
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#oldest-real-time"
     *            >Oldest</a>
     *            </p>
     *            </dd>
     *            <dt>SLOTS_ACTIVE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#active-real-time"
     *            >Active</a>
     *            </p>
     *            </dd>
     *            <dt>SLOTS_AVAILABLE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#availability-real-time"
     *            >Availability</a>
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
     * The metrics to retrieve. Specify the name and unit for each metric. The
     * following metrics are available. For a description of all the metrics,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html"
     * >Real-time Metrics Definitions</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <dl>
     * <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#aftercallwork-real-time"
     * >ACW</a>
     * </p>
     * </dd>
     * <dt>AGENTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#available-real-time"
     * >Available</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ERROR</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#error-real-time"
     * >Error</a>
     * </p>
     * </dd>
     * <dt>AGENTS_NON_PRODUCTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#non-productive-time-real-time"
     * >NPT (Non-Productive Time)</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CALL</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#on-call-real-time"
     * >On contact</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ON_CONTACT</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#on-call-real-time"
     * >On contact</a>
     * </p>
     * </dd>
     * <dt>AGENTS_ONLINE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#online-real-time"
     * >Online</a>
     * </p>
     * </dd>
     * <dt>AGENTS_STAFFED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#staffed-real-time"
     * >Staffed</a>
     * </p>
     * </dd>
     * <dt>CONTACTS_IN_QUEUE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#in-queue-real-time"
     * >In queue</a>
     * </p>
     * </dd>
     * <dt>CONTACTS_SCHEDULED</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#scheduled-real-time"
     * >Scheduled</a>
     * </p>
     * </dd>
     * <dt>OLDEST_CONTACT_AGE</dt>
     * <dd>
     * <p>
     * Unit: SECONDS
     * </p>
     * <p>
     * When you use groupings, Unit says SECONDS and the Value is returned in
     * SECONDS.
     * </p>
     * <p>
     * When you do not use groupings, Unit says SECONDS but the Value is
     * returned in MILLISECONDS. For example, if you get a response like this:
     * </p>
     * <p>
     * <code>{ "Metric": { "Name": "OLDEST_CONTACT_AGE", "Unit": "SECONDS" }, "Value": 24113.0 </code>
     * </p>
     * <p>
     * The actual OLDEST_CONTACT_AGE is 24 seconds.
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#oldest-real-time"
     * >Oldest</a>
     * </p>
     * </dd>
     * <dt>SLOTS_ACTIVE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#active-real-time"
     * >Active</a>
     * </p>
     * </dd>
     * <dt>SLOTS_AVAILABLE</dt>
     * <dd>
     * <p>
     * Unit: COUNT
     * </p>
     * <p>
     * Name in real-time metrics report: <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#availability-real-time"
     * >Availability</a>
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentMetrics <p>
     *            The metrics to retrieve. Specify the name and unit for each
     *            metric. The following metrics are available. For a description
     *            of all the metrics, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html"
     *            >Real-time Metrics Definitions</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     *            <dl>
     *            <dt>AGENTS_AFTER_CONTACT_WORK</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#aftercallwork-real-time"
     *            >ACW</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_AVAILABLE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#available-real-time"
     *            >Available</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ERROR</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#error-real-time"
     *            >Error</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_NON_PRODUCTIVE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#non-productive-time-real-time"
     *            >NPT (Non-Productive Time)</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ON_CALL</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#on-call-real-time"
     *            >On contact</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ON_CONTACT</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#on-call-real-time"
     *            >On contact</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_ONLINE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#online-real-time"
     *            >Online</a>
     *            </p>
     *            </dd>
     *            <dt>AGENTS_STAFFED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#staffed-real-time"
     *            >Staffed</a>
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_IN_QUEUE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#in-queue-real-time"
     *            >In queue</a>
     *            </p>
     *            </dd>
     *            <dt>CONTACTS_SCHEDULED</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#scheduled-real-time"
     *            >Scheduled</a>
     *            </p>
     *            </dd>
     *            <dt>OLDEST_CONTACT_AGE</dt>
     *            <dd>
     *            <p>
     *            Unit: SECONDS
     *            </p>
     *            <p>
     *            When you use groupings, Unit says SECONDS and the Value is
     *            returned in SECONDS.
     *            </p>
     *            <p>
     *            When you do not use groupings, Unit says SECONDS but the Value
     *            is returned in MILLISECONDS. For example, if you get a
     *            response like this:
     *            </p>
     *            <p>
     *            <code>{ "Metric": { "Name": "OLDEST_CONTACT_AGE", "Unit": "SECONDS" }, "Value": 24113.0 </code>
     *            </p>
     *            <p>
     *            The actual OLDEST_CONTACT_AGE is 24 seconds.
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#oldest-real-time"
     *            >Oldest</a>
     *            </p>
     *            </dd>
     *            <dt>SLOTS_ACTIVE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#active-real-time"
     *            >Active</a>
     *            </p>
     *            </dd>
     *            <dt>SLOTS_AVAILABLE</dt>
     *            <dd>
     *            <p>
     *            Unit: COUNT
     *            </p>
     *            <p>
     *            Name in real-time metrics report: <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html#availability-real-time"
     *            >Availability</a>
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
     * requests that use the token must use the same request parameters as the
     * request that generated the token.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results. Use the value returned in
     *         the previous response in the next request to retrieve the next
     *         set of results.
     *         </p>
     *         <p>
     *         The token expires after 5 minutes from the time it is created.
     *         Subsequent requests that use the token must use the same request
     *         parameters as the request that generated the token.
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
     * requests that use the token must use the same request parameters as the
     * request that generated the token.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     *            <p>
     *            The token expires after 5 minutes from the time it is created.
     *            Subsequent requests that use the token must use the same
     *            request parameters as the request that generated the token.
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
     * requests that use the token must use the same request parameters as the
     * request that generated the token.
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
     *            Subsequent requests that use the token must use the same
     *            request parameters as the request that generated the token.
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
