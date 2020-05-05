/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the status of the specified instances or all of your instances. By
 * default, only running instances are described, unless you specifically
 * indicate to return the status of all instances.
 * </p>
 * <p>
 * Instance status includes the following components:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Status checks</b> - Amazon EC2 performs status checks on running EC2
 * instances to identify hardware and software issues. For more information, see
 * <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-system-instance-status-check.html"
 * >Status Checks for Your Instances</a> and <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstances.html"
 * >Troubleshooting Instances with Failed Status Checks</a> in the <i>Amazon
 * Elastic Compute Cloud User Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Scheduled events</b> - Amazon EC2 can schedule events (such as reboot,
 * stop, or terminate) for your instances related to hardware issues, software
 * updates, or system maintenance. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-instances-status-check_sched.html"
 * >Scheduled Events for Your Instances</a> in the <i>Amazon Elastic Compute
 * Cloud User Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Instance state</b> - You can manage your instances from the moment you
 * launch them through their termination. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html"
 * >Instance Lifecycle</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 * </li>
 * </ul>
 */
public class DescribeInstanceStatusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.code</code> - The code for the scheduled event (
     * <code>instance-reboot</code> | <code>system-reboot</code> |
     * <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.instance-event-id</code> - The ID of the event whose date and
     * time you are modifying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the scheduled
     * event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the scheduled
     * event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before-deadline</code> - The deadline for starting the
     * event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The code for the instance state, as a
     * 16-bit unsigned integer. The high byte is used for internal purposes and
     * should be ignored. The low byte is set based on the state represented.
     * The valid values are 0 (pending), 16 (running), 32 (shutting-down), 48
     * (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (
     * <code>pending</code> | <code>running</code> | <code>shutting-down</code>
     * | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.reachability</code> - Filters on instance status
     * where the name is <code>reachability</code> (<code>passed</code> |
     * <code>failed</code> | <code>initializing</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.status</code> - The status of the instance (
     * <code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     * <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.reachability</code> - Filters on system status where
     * the name is <code>reachability</code> (<code>passed</code> |
     * <code>failed</code> | <code>initializing</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.status</code> - The system status of the instance (
     * <code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     * <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified instance IDs.
     * </p>
     */
    private java.util.List<String> instanceIds;

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000. You
     * cannot specify this parameter and the instance IDs parameter in the same
     * call.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * When <code>true</code>, includes the health status for all instances.
     * When <code>false</code>, includes the health status for running instances
     * only.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean includeAllInstances;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.code</code> - The code for the scheduled event (
     * <code>instance-reboot</code> | <code>system-reboot</code> |
     * <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.instance-event-id</code> - The ID of the event whose date and
     * time you are modifying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the scheduled
     * event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the scheduled
     * event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before-deadline</code> - The deadline for starting the
     * event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The code for the instance state, as a
     * 16-bit unsigned integer. The high byte is used for internal purposes and
     * should be ignored. The low byte is set based on the state represented.
     * The valid values are 0 (pending), 16 (running), 32 (shutting-down), 48
     * (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (
     * <code>pending</code> | <code>running</code> | <code>shutting-down</code>
     * | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.reachability</code> - Filters on instance status
     * where the name is <code>reachability</code> (<code>passed</code> |
     * <code>failed</code> | <code>initializing</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.status</code> - The status of the instance (
     * <code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     * <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.reachability</code> - Filters on system status where
     * the name is <code>reachability</code> (<code>passed</code> |
     * <code>failed</code> | <code>initializing</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.status</code> - The system status of the instance (
     * <code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     * <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The filters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone of the
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.code</code> - The code for the scheduled event (
     *         <code>instance-reboot</code> | <code>system-reboot</code> |
     *         <code>system-maintenance</code> |
     *         <code>instance-retirement</code> | <code>instance-stop</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.description</code> - A description of the event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.instance-event-id</code> - The ID of the event whose
     *         date and time you are modifying.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.not-after</code> - The latest end time for the
     *         scheduled event (for example,
     *         <code>2014-09-15T17:15:20.000Z</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.not-before</code> - The earliest start time for the
     *         scheduled event (for example,
     *         <code>2014-09-15T17:15:20.000Z</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>event.not-before-deadline</code> - The deadline for
     *         starting the event (for example,
     *         <code>2014-09-15T17:15:20.000Z</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-state-code</code> - The code for the instance
     *         state, as a 16-bit unsigned integer. The high byte is used for
     *         internal purposes and should be ignored. The low byte is set
     *         based on the state represented. The valid values are 0 (pending),
     *         16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping),
     *         and 80 (stopped).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-state-name</code> - The state of the instance (
     *         <code>pending</code> | <code>running</code> |
     *         <code>shutting-down</code> | <code>terminated</code> |
     *         <code>stopping</code> | <code>stopped</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-status.reachability</code> - Filters on instance
     *         status where the name is <code>reachability</code> (
     *         <code>passed</code> | <code>failed</code> |
     *         <code>initializing</code> | <code>insufficient-data</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-status.status</code> - The status of the instance
     *         (<code>ok</code> | <code>impaired</code> |
     *         <code>initializing</code> | <code>insufficient-data</code> |
     *         <code>not-applicable</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>system-status.reachability</code> - Filters on system
     *         status where the name is <code>reachability</code> (
     *         <code>passed</code> | <code>failed</code> |
     *         <code>initializing</code> | <code>insufficient-data</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>system-status.status</code> - The system status of the
     *         instance (<code>ok</code> | <code>impaired</code> |
     *         <code>initializing</code> | <code>insufficient-data</code> |
     *         <code>not-applicable</code>).
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.code</code> - The code for the scheduled event (
     * <code>instance-reboot</code> | <code>system-reboot</code> |
     * <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.instance-event-id</code> - The ID of the event whose date and
     * time you are modifying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the scheduled
     * event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the scheduled
     * event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before-deadline</code> - The deadline for starting the
     * event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The code for the instance state, as a
     * 16-bit unsigned integer. The high byte is used for internal purposes and
     * should be ignored. The low byte is set based on the state represented.
     * The valid values are 0 (pending), 16 (running), 32 (shutting-down), 48
     * (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (
     * <code>pending</code> | <code>running</code> | <code>shutting-down</code>
     * | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.reachability</code> - Filters on instance status
     * where the name is <code>reachability</code> (<code>passed</code> |
     * <code>failed</code> | <code>initializing</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.status</code> - The status of the instance (
     * <code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     * <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.reachability</code> - Filters on system status where
     * the name is <code>reachability</code> (<code>passed</code> |
     * <code>failed</code> | <code>initializing</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.status</code> - The system status of the instance (
     * <code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     * <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone of the
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.code</code> - The code for the scheduled event (
     *            <code>instance-reboot</code> | <code>system-reboot</code> |
     *            <code>system-maintenance</code> |
     *            <code>instance-retirement</code> | <code>instance-stop</code>
     *            ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.description</code> - A description of the event.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.instance-event-id</code> - The ID of the event
     *            whose date and time you are modifying.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.not-after</code> - The latest end time for the
     *            scheduled event (for example,
     *            <code>2014-09-15T17:15:20.000Z</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.not-before</code> - The earliest start time for
     *            the scheduled event (for example,
     *            <code>2014-09-15T17:15:20.000Z</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.not-before-deadline</code> - The deadline for
     *            starting the event (for example,
     *            <code>2014-09-15T17:15:20.000Z</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-state-code</code> - The code for the instance
     *            state, as a 16-bit unsigned integer. The high byte is used for
     *            internal purposes and should be ignored. The low byte is set
     *            based on the state represented. The valid values are 0
     *            (pending), 16 (running), 32 (shutting-down), 48 (terminated),
     *            64 (stopping), and 80 (stopped).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-state-name</code> - The state of the instance (
     *            <code>pending</code> | <code>running</code> |
     *            <code>shutting-down</code> | <code>terminated</code> |
     *            <code>stopping</code> | <code>stopped</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-status.reachability</code> - Filters on
     *            instance status where the name is <code>reachability</code> (
     *            <code>passed</code> | <code>failed</code> |
     *            <code>initializing</code> | <code>insufficient-data</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-status.status</code> - The status of the
     *            instance (<code>ok</code> | <code>impaired</code> |
     *            <code>initializing</code> | <code>insufficient-data</code> |
     *            <code>not-applicable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>system-status.reachability</code> - Filters on system
     *            status where the name is <code>reachability</code> (
     *            <code>passed</code> | <code>failed</code> |
     *            <code>initializing</code> | <code>insufficient-data</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>system-status.status</code> - The system status of the
     *            instance (<code>ok</code> | <code>impaired</code> |
     *            <code>initializing</code> | <code>insufficient-data</code> |
     *            <code>not-applicable</code>).
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.code</code> - The code for the scheduled event (
     * <code>instance-reboot</code> | <code>system-reboot</code> |
     * <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.instance-event-id</code> - The ID of the event whose date and
     * time you are modifying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the scheduled
     * event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the scheduled
     * event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before-deadline</code> - The deadline for starting the
     * event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The code for the instance state, as a
     * 16-bit unsigned integer. The high byte is used for internal purposes and
     * should be ignored. The low byte is set based on the state represented.
     * The valid values are 0 (pending), 16 (running), 32 (shutting-down), 48
     * (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (
     * <code>pending</code> | <code>running</code> | <code>shutting-down</code>
     * | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.reachability</code> - Filters on instance status
     * where the name is <code>reachability</code> (<code>passed</code> |
     * <code>failed</code> | <code>initializing</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.status</code> - The status of the instance (
     * <code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     * <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.reachability</code> - Filters on system status where
     * the name is <code>reachability</code> (<code>passed</code> |
     * <code>failed</code> | <code>initializing</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.status</code> - The system status of the instance (
     * <code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     * <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone of the
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.code</code> - The code for the scheduled event (
     *            <code>instance-reboot</code> | <code>system-reboot</code> |
     *            <code>system-maintenance</code> |
     *            <code>instance-retirement</code> | <code>instance-stop</code>
     *            ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.description</code> - A description of the event.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.instance-event-id</code> - The ID of the event
     *            whose date and time you are modifying.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.not-after</code> - The latest end time for the
     *            scheduled event (for example,
     *            <code>2014-09-15T17:15:20.000Z</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.not-before</code> - The earliest start time for
     *            the scheduled event (for example,
     *            <code>2014-09-15T17:15:20.000Z</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.not-before-deadline</code> - The deadline for
     *            starting the event (for example,
     *            <code>2014-09-15T17:15:20.000Z</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-state-code</code> - The code for the instance
     *            state, as a 16-bit unsigned integer. The high byte is used for
     *            internal purposes and should be ignored. The low byte is set
     *            based on the state represented. The valid values are 0
     *            (pending), 16 (running), 32 (shutting-down), 48 (terminated),
     *            64 (stopping), and 80 (stopped).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-state-name</code> - The state of the instance (
     *            <code>pending</code> | <code>running</code> |
     *            <code>shutting-down</code> | <code>terminated</code> |
     *            <code>stopping</code> | <code>stopped</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-status.reachability</code> - Filters on
     *            instance status where the name is <code>reachability</code> (
     *            <code>passed</code> | <code>failed</code> |
     *            <code>initializing</code> | <code>insufficient-data</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-status.status</code> - The status of the
     *            instance (<code>ok</code> | <code>impaired</code> |
     *            <code>initializing</code> | <code>insufficient-data</code> |
     *            <code>not-applicable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>system-status.reachability</code> - Filters on system
     *            status where the name is <code>reachability</code> (
     *            <code>passed</code> | <code>failed</code> |
     *            <code>initializing</code> | <code>insufficient-data</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>system-status.status</code> - The system status of the
     *            instance (<code>ok</code> | <code>impaired</code> |
     *            <code>initializing</code> | <code>insufficient-data</code> |
     *            <code>not-applicable</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceStatusRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.code</code> - The code for the scheduled event (
     * <code>instance-reboot</code> | <code>system-reboot</code> |
     * <code>system-maintenance</code> | <code>instance-retirement</code> |
     * <code>instance-stop</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.description</code> - A description of the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.instance-event-id</code> - The ID of the event whose date and
     * time you are modifying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-after</code> - The latest end time for the scheduled
     * event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before</code> - The earliest start time for the scheduled
     * event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>event.not-before-deadline</code> - The deadline for starting the
     * event (for example, <code>2014-09-15T17:15:20.000Z</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-code</code> - The code for the instance state, as a
     * 16-bit unsigned integer. The high byte is used for internal purposes and
     * should be ignored. The low byte is set based on the state represented.
     * The valid values are 0 (pending), 16 (running), 32 (shutting-down), 48
     * (terminated), 64 (stopping), and 80 (stopped).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-state-name</code> - The state of the instance (
     * <code>pending</code> | <code>running</code> | <code>shutting-down</code>
     * | <code>terminated</code> | <code>stopping</code> | <code>stopped</code>
     * ).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.reachability</code> - Filters on instance status
     * where the name is <code>reachability</code> (<code>passed</code> |
     * <code>failed</code> | <code>initializing</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-status.status</code> - The status of the instance (
     * <code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     * <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.reachability</code> - Filters on system status where
     * the name is <code>reachability</code> (<code>passed</code> |
     * <code>failed</code> | <code>initializing</code> |
     * <code>insufficient-data</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>system-status.status</code> - The system status of the instance (
     * <code>ok</code> | <code>impaired</code> | <code>initializing</code> |
     * <code>insufficient-data</code> | <code>not-applicable</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>availability-zone</code> - The Availability Zone of the
     *            instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.code</code> - The code for the scheduled event (
     *            <code>instance-reboot</code> | <code>system-reboot</code> |
     *            <code>system-maintenance</code> |
     *            <code>instance-retirement</code> | <code>instance-stop</code>
     *            ).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.description</code> - A description of the event.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.instance-event-id</code> - The ID of the event
     *            whose date and time you are modifying.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.not-after</code> - The latest end time for the
     *            scheduled event (for example,
     *            <code>2014-09-15T17:15:20.000Z</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.not-before</code> - The earliest start time for
     *            the scheduled event (for example,
     *            <code>2014-09-15T17:15:20.000Z</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>event.not-before-deadline</code> - The deadline for
     *            starting the event (for example,
     *            <code>2014-09-15T17:15:20.000Z</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-state-code</code> - The code for the instance
     *            state, as a 16-bit unsigned integer. The high byte is used for
     *            internal purposes and should be ignored. The low byte is set
     *            based on the state represented. The valid values are 0
     *            (pending), 16 (running), 32 (shutting-down), 48 (terminated),
     *            64 (stopping), and 80 (stopped).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-state-name</code> - The state of the instance (
     *            <code>pending</code> | <code>running</code> |
     *            <code>shutting-down</code> | <code>terminated</code> |
     *            <code>stopping</code> | <code>stopped</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-status.reachability</code> - Filters on
     *            instance status where the name is <code>reachability</code> (
     *            <code>passed</code> | <code>failed</code> |
     *            <code>initializing</code> | <code>insufficient-data</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-status.status</code> - The status of the
     *            instance (<code>ok</code> | <code>impaired</code> |
     *            <code>initializing</code> | <code>insufficient-data</code> |
     *            <code>not-applicable</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>system-status.reachability</code> - Filters on system
     *            status where the name is <code>reachability</code> (
     *            <code>passed</code> | <code>failed</code> |
     *            <code>initializing</code> | <code>insufficient-data</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>system-status.status</code> - The system status of the
     *            instance (<code>ok</code> | <code>impaired</code> |
     *            <code>initializing</code> | <code>insufficient-data</code> |
     *            <code>not-applicable</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceStatusRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified instance IDs.
     * </p>
     *
     * @return <p>
     *         The instance IDs.
     *         </p>
     *         <p>
     *         Default: Describes all your instances.
     *         </p>
     *         <p>
     *         Constraints: Maximum 100 explicitly specified instance IDs.
     *         </p>
     */
    public java.util.List<String> getInstanceIds() {
        return instanceIds;
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified instance IDs.
     * </p>
     *
     * @param instanceIds <p>
     *            The instance IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your instances.
     *            </p>
     *            <p>
     *            Constraints: Maximum 100 explicitly specified instance IDs.
     *            </p>
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new java.util.ArrayList<String>(instanceIds);
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified instance IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceIds <p>
     *            The instance IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your instances.
     *            </p>
     *            <p>
     *            Constraints: Maximum 100 explicitly specified instance IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceStatusRequest withInstanceIds(String... instanceIds) {
        if (getInstanceIds() == null) {
            this.instanceIds = new java.util.ArrayList<String>(instanceIds.length);
        }
        for (String value : instanceIds) {
            this.instanceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified instance IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceIds <p>
     *            The instance IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your instances.
     *            </p>
     *            <p>
     *            Constraints: Maximum 100 explicitly specified instance IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceStatusRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000. You
     * cannot specify this parameter and the instance IDs parameter in the same
     * call.
     * </p>
     *
     * @return <p>
     *         The maximum number of results to return in a single call. To
     *         retrieve the remaining results, make another call with the
     *         returned <code>NextToken</code> value. This value can be between
     *         5 and 1000. You cannot specify this parameter and the instance
     *         IDs parameter in the same call.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000. You
     * cannot specify this parameter and the instance IDs parameter in the same
     * call.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>NextToken</code> value. This value can be
     *            between 5 and 1000. You cannot specify this parameter and the
     *            instance IDs parameter in the same call.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000. You
     * cannot specify this parameter and the instance IDs parameter in the same
     * call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>NextToken</code> value. This value can be
     *            between 5 and 1000. You cannot specify this parameter and the
     *            instance IDs parameter in the same call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceStatusRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to retrieve the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to retrieve the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to retrieve the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceStatusRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceStatusRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, includes the health status for all instances.
     * When <code>false</code>, includes the health status for running instances
     * only.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         When <code>true</code>, includes the health status for all
     *         instances. When <code>false</code>, includes the health status
     *         for running instances only.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean isIncludeAllInstances() {
        return includeAllInstances;
    }

    /**
     * <p>
     * When <code>true</code>, includes the health status for all instances.
     * When <code>false</code>, includes the health status for running instances
     * only.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         When <code>true</code>, includes the health status for all
     *         instances. When <code>false</code>, includes the health status
     *         for running instances only.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean getIncludeAllInstances() {
        return includeAllInstances;
    }

    /**
     * <p>
     * When <code>true</code>, includes the health status for all instances.
     * When <code>false</code>, includes the health status for running instances
     * only.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @param includeAllInstances <p>
     *            When <code>true</code>, includes the health status for all
     *            instances. When <code>false</code>, includes the health status
     *            for running instances only.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     */
    public void setIncludeAllInstances(Boolean includeAllInstances) {
        this.includeAllInstances = includeAllInstances;
    }

    /**
     * <p>
     * When <code>true</code>, includes the health status for all instances.
     * When <code>false</code>, includes the health status for running instances
     * only.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeAllInstances <p>
     *            When <code>true</code>, includes the health status for all
     *            instances. When <code>false</code>, includes the health status
     *            for running instances only.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceStatusRequest withIncludeAllInstances(Boolean includeAllInstances) {
        this.includeAllInstances = includeAllInstances;
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getInstanceIds() != null)
            sb.append("InstanceIds: " + getInstanceIds() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getIncludeAllInstances() != null)
            sb.append("IncludeAllInstances: " + getIncludeAllInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getIncludeAllInstances() == null) ? 0 : getIncludeAllInstances().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceStatusRequest == false)
            return false;
        DescribeInstanceStatusRequest other = (DescribeInstanceStatusRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null
                && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getIncludeAllInstances() == null ^ this.getIncludeAllInstances() == null)
            return false;
        if (other.getIncludeAllInstances() != null
                && other.getIncludeAllInstances().equals(this.getIncludeAllInstances()) == false)
            return false;
        return true;
    }
}
