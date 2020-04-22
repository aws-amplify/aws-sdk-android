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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a scheduled action. You can use a scheduled action to trigger some
 * Amazon Redshift API operations on a schedule. For information about which API
 * operations can be scheduled, see <a>ScheduledActionType</a>.
 * </p>
 */
public class ModifyScheduledActionResult implements Serializable {
    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     */
    private String scheduledActionName;

    /**
     * <p>
     * A JSON format string of the Amazon Redshift API operation with input
     * parameters.
     * </p>
     * <p>
     * "
     * <code>{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}</code>
     * ".
     * </p>
     */
    private ScheduledActionType targetAction;

    /**
     * <p>
     * The schedule for a one-time (at format) or recurring (cron format)
     * scheduled action. Schedule invocations must be separated by at least one
     * hour.
     * </p>
     * <p>
     * Format of at expressions is "<code>at(yyyy-mm-ddThh:mm:ss)</code>
     * ". For example, "<code>at(2016-03-04T17:27:00)</code>".
     * </p>
     * <p>
     * Format of cron expressions is "
     * <code>cron(Minutes Hours Day-of-month Month Day-of-week Year)</code>
     * ". For example, "<code>cron(0 10 ? * MON *)</code>
     * ". For more information, see <a href="
     * https://docs.aws.amazon.com/AmazonCloudWatch
     * /latest/events/ScheduledEvents.html#CronExpressions">Cron Expressions</a>
     * in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     */
    private String schedule;

    /**
     * <p>
     * The IAM role to assume to run the scheduled action. This IAM role must
     * have permission to run the Amazon Redshift API operation in the scheduled
     * action. This IAM role must allow the Amazon Redshift scheduler (Principal
     * scheduler.redshift.amazonaws.com) to assume permissions on your behalf.
     * For more information about the IAM role to use with the Amazon Redshift
     * scheduler, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html"
     * >Using Identity-Based Policies for Amazon Redshift</a> in the <i>Amazon
     * Redshift Cluster Management Guide</i>.
     * </p>
     */
    private String iamRole;

    /**
     * <p>
     * The description of the scheduled action.
     * </p>
     */
    private String scheduledActionDescription;

    /**
     * <p>
     * The state of the scheduled action. For example, <code>DISABLED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DISABLED
     */
    private String state;

    /**
     * <p>
     * List of times when the scheduled action will run.
     * </p>
     */
    private java.util.List<java.util.Date> nextInvocations;

    /**
     * <p>
     * The start time in UTC when the schedule is active. Before this time, the
     * scheduled action does not trigger.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The end time in UTC when the schedule is no longer active. After this
     * time, the scheduled action does not trigger.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     *
     * @return <p>
     *         The name of the scheduled action.
     *         </p>
     */
    public String getScheduledActionName() {
        return scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     *
     * @param scheduledActionName <p>
     *            The name of the scheduled action.
     *            </p>
     */
    public void setScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledActionName <p>
     *            The name of the scheduled action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyScheduledActionResult withScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
        return this;
    }

    /**
     * <p>
     * A JSON format string of the Amazon Redshift API operation with input
     * parameters.
     * </p>
     * <p>
     * "
     * <code>{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}</code>
     * ".
     * </p>
     *
     * @return <p>
     *         A JSON format string of the Amazon Redshift API operation with
     *         input parameters.
     *         </p>
     *         <p>
     *         "
     *         <code>{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}</code>
     *         ".
     *         </p>
     */
    public ScheduledActionType getTargetAction() {
        return targetAction;
    }

    /**
     * <p>
     * A JSON format string of the Amazon Redshift API operation with input
     * parameters.
     * </p>
     * <p>
     * "
     * <code>{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}</code>
     * ".
     * </p>
     *
     * @param targetAction <p>
     *            A JSON format string of the Amazon Redshift API operation with
     *            input parameters.
     *            </p>
     *            <p>
     *            "
     *            <code>{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}</code>
     *            ".
     *            </p>
     */
    public void setTargetAction(ScheduledActionType targetAction) {
        this.targetAction = targetAction;
    }

    /**
     * <p>
     * A JSON format string of the Amazon Redshift API operation with input
     * parameters.
     * </p>
     * <p>
     * "
     * <code>{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}</code>
     * ".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetAction <p>
     *            A JSON format string of the Amazon Redshift API operation with
     *            input parameters.
     *            </p>
     *            <p>
     *            "
     *            <code>{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}</code>
     *            ".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyScheduledActionResult withTargetAction(ScheduledActionType targetAction) {
        this.targetAction = targetAction;
        return this;
    }

    /**
     * <p>
     * The schedule for a one-time (at format) or recurring (cron format)
     * scheduled action. Schedule invocations must be separated by at least one
     * hour.
     * </p>
     * <p>
     * Format of at expressions is "<code>at(yyyy-mm-ddThh:mm:ss)</code>
     * ". For example, "<code>at(2016-03-04T17:27:00)</code>".
     * </p>
     * <p>
     * Format of cron expressions is "
     * <code>cron(Minutes Hours Day-of-month Month Day-of-week Year)</code>
     * ". For example, "<code>cron(0 10 ? * MON *)</code>
     * ". For more information, see <a href="
     * https://docs.aws.amazon.com/AmazonCloudWatch
     * /latest/events/ScheduledEvents.html#CronExpressions">Cron Expressions</a>
     * in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The schedule for a one-time (at format) or recurring (cron
     *         format) scheduled action. Schedule invocations must be separated
     *         by at least one hour.
     *         </p>
     *         <p>
     *         Format of at expressions is "<code>at(yyyy-mm-ddThh:mm:ss)</code>
     *         ". For example, "<code>at(2016-03-04T17:27:00)</code>".
     *         </p>
     *         <p>
     *         Format of cron expressions is "
     *         <code>cron(Minutes Hours Day-of-month Month Day-of-week Year)</code>
     *         ". For example, "<code>cron(0 10 ? * MON *)</code>
     *         ". For more information, see <a href="
     *         https://docs.aws.amazon.com/
     *         AmazonCloudWatch/latest/events/ScheduledEvents
     *         .html#CronExpressions">Cron Expressions</a> in the <i>Amazon
     *         CloudWatch Events User Guide</i>.
     *         </p>
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * The schedule for a one-time (at format) or recurring (cron format)
     * scheduled action. Schedule invocations must be separated by at least one
     * hour.
     * </p>
     * <p>
     * Format of at expressions is "<code>at(yyyy-mm-ddThh:mm:ss)</code>
     * ". For example, "<code>at(2016-03-04T17:27:00)</code>".
     * </p>
     * <p>
     * Format of cron expressions is "
     * <code>cron(Minutes Hours Day-of-month Month Day-of-week Year)</code>
     * ". For example, "<code>cron(0 10 ? * MON *)</code>
     * ". For more information, see <a href="
     * https://docs.aws.amazon.com/AmazonCloudWatch
     * /latest/events/ScheduledEvents.html#CronExpressions">Cron Expressions</a>
     * in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     *
     * @param schedule <p>
     *            The schedule for a one-time (at format) or recurring (cron
     *            format) scheduled action. Schedule invocations must be
     *            separated by at least one hour.
     *            </p>
     *            <p>
     *            Format of at expressions is "
     *            <code>at(yyyy-mm-ddThh:mm:ss)</code>". For example, "
     *            <code>at(2016-03-04T17:27:00)</code>".
     *            </p>
     *            <p>
     *            Format of cron expressions is "
     *            <code>cron(Minutes Hours Day-of-month Month Day-of-week Year)</code>
     *            ". For example, "<code>cron(0 10 ? * MON *)</code>
     *            ". For more information, see <a href="
     *            https://docs.aws.amazon.com
     *            /AmazonCloudWatch/latest/events/ScheduledEvents
     *            .html#CronExpressions">Cron Expressions</a> in the <i>Amazon
     *            CloudWatch Events User Guide</i>.
     *            </p>
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule for a one-time (at format) or recurring (cron format)
     * scheduled action. Schedule invocations must be separated by at least one
     * hour.
     * </p>
     * <p>
     * Format of at expressions is "<code>at(yyyy-mm-ddThh:mm:ss)</code>
     * ". For example, "<code>at(2016-03-04T17:27:00)</code>".
     * </p>
     * <p>
     * Format of cron expressions is "
     * <code>cron(Minutes Hours Day-of-month Month Day-of-week Year)</code>
     * ". For example, "<code>cron(0 10 ? * MON *)</code>
     * ". For more information, see <a href="
     * https://docs.aws.amazon.com/AmazonCloudWatch
     * /latest/events/ScheduledEvents.html#CronExpressions">Cron Expressions</a>
     * in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedule <p>
     *            The schedule for a one-time (at format) or recurring (cron
     *            format) scheduled action. Schedule invocations must be
     *            separated by at least one hour.
     *            </p>
     *            <p>
     *            Format of at expressions is "
     *            <code>at(yyyy-mm-ddThh:mm:ss)</code>". For example, "
     *            <code>at(2016-03-04T17:27:00)</code>".
     *            </p>
     *            <p>
     *            Format of cron expressions is "
     *            <code>cron(Minutes Hours Day-of-month Month Day-of-week Year)</code>
     *            ". For example, "<code>cron(0 10 ? * MON *)</code>
     *            ". For more information, see <a href="
     *            https://docs.aws.amazon.com
     *            /AmazonCloudWatch/latest/events/ScheduledEvents
     *            .html#CronExpressions">Cron Expressions</a> in the <i>Amazon
     *            CloudWatch Events User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyScheduledActionResult withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>
     * The IAM role to assume to run the scheduled action. This IAM role must
     * have permission to run the Amazon Redshift API operation in the scheduled
     * action. This IAM role must allow the Amazon Redshift scheduler (Principal
     * scheduler.redshift.amazonaws.com) to assume permissions on your behalf.
     * For more information about the IAM role to use with the Amazon Redshift
     * scheduler, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html"
     * >Using Identity-Based Policies for Amazon Redshift</a> in the <i>Amazon
     * Redshift Cluster Management Guide</i>.
     * </p>
     *
     * @return <p>
     *         The IAM role to assume to run the scheduled action. This IAM role
     *         must have permission to run the Amazon Redshift API operation in
     *         the scheduled action. This IAM role must allow the Amazon
     *         Redshift scheduler (Principal scheduler.redshift.amazonaws.com)
     *         to assume permissions on your behalf. For more information about
     *         the IAM role to use with the Amazon Redshift scheduler, see <a
     *         href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html"
     *         >Using Identity-Based Policies for Amazon Redshift</a> in the
     *         <i>Amazon Redshift Cluster Management Guide</i>.
     *         </p>
     */
    public String getIamRole() {
        return iamRole;
    }

    /**
     * <p>
     * The IAM role to assume to run the scheduled action. This IAM role must
     * have permission to run the Amazon Redshift API operation in the scheduled
     * action. This IAM role must allow the Amazon Redshift scheduler (Principal
     * scheduler.redshift.amazonaws.com) to assume permissions on your behalf.
     * For more information about the IAM role to use with the Amazon Redshift
     * scheduler, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html"
     * >Using Identity-Based Policies for Amazon Redshift</a> in the <i>Amazon
     * Redshift Cluster Management Guide</i>.
     * </p>
     *
     * @param iamRole <p>
     *            The IAM role to assume to run the scheduled action. This IAM
     *            role must have permission to run the Amazon Redshift API
     *            operation in the scheduled action. This IAM role must allow
     *            the Amazon Redshift scheduler (Principal
     *            scheduler.redshift.amazonaws.com) to assume permissions on
     *            your behalf. For more information about the IAM role to use
     *            with the Amazon Redshift scheduler, see <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html"
     *            >Using Identity-Based Policies for Amazon Redshift</a> in the
     *            <i>Amazon Redshift Cluster Management Guide</i>.
     *            </p>
     */
    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * The IAM role to assume to run the scheduled action. This IAM role must
     * have permission to run the Amazon Redshift API operation in the scheduled
     * action. This IAM role must allow the Amazon Redshift scheduler (Principal
     * scheduler.redshift.amazonaws.com) to assume permissions on your behalf.
     * For more information about the IAM role to use with the Amazon Redshift
     * scheduler, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html"
     * >Using Identity-Based Policies for Amazon Redshift</a> in the <i>Amazon
     * Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamRole <p>
     *            The IAM role to assume to run the scheduled action. This IAM
     *            role must have permission to run the Amazon Redshift API
     *            operation in the scheduled action. This IAM role must allow
     *            the Amazon Redshift scheduler (Principal
     *            scheduler.redshift.amazonaws.com) to assume permissions on
     *            your behalf. For more information about the IAM role to use
     *            with the Amazon Redshift scheduler, see <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html"
     *            >Using Identity-Based Policies for Amazon Redshift</a> in the
     *            <i>Amazon Redshift Cluster Management Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyScheduledActionResult withIamRole(String iamRole) {
        this.iamRole = iamRole;
        return this;
    }

    /**
     * <p>
     * The description of the scheduled action.
     * </p>
     *
     * @return <p>
     *         The description of the scheduled action.
     *         </p>
     */
    public String getScheduledActionDescription() {
        return scheduledActionDescription;
    }

    /**
     * <p>
     * The description of the scheduled action.
     * </p>
     *
     * @param scheduledActionDescription <p>
     *            The description of the scheduled action.
     *            </p>
     */
    public void setScheduledActionDescription(String scheduledActionDescription) {
        this.scheduledActionDescription = scheduledActionDescription;
    }

    /**
     * <p>
     * The description of the scheduled action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledActionDescription <p>
     *            The description of the scheduled action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyScheduledActionResult withScheduledActionDescription(
            String scheduledActionDescription) {
        this.scheduledActionDescription = scheduledActionDescription;
        return this;
    }

    /**
     * <p>
     * The state of the scheduled action. For example, <code>DISABLED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DISABLED
     *
     * @return <p>
     *         The state of the scheduled action. For example,
     *         <code>DISABLED</code>.
     *         </p>
     * @see ScheduledActionState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the scheduled action. For example, <code>DISABLED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DISABLED
     *
     * @param state <p>
     *            The state of the scheduled action. For example,
     *            <code>DISABLED</code>.
     *            </p>
     * @see ScheduledActionState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the scheduled action. For example, <code>DISABLED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DISABLED
     *
     * @param state <p>
     *            The state of the scheduled action. For example,
     *            <code>DISABLED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScheduledActionState
     */
    public ModifyScheduledActionResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the scheduled action. For example, <code>DISABLED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DISABLED
     *
     * @param state <p>
     *            The state of the scheduled action. For example,
     *            <code>DISABLED</code>.
     *            </p>
     * @see ScheduledActionState
     */
    public void setState(ScheduledActionState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the scheduled action. For example, <code>DISABLED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DISABLED
     *
     * @param state <p>
     *            The state of the scheduled action. For example,
     *            <code>DISABLED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScheduledActionState
     */
    public ModifyScheduledActionResult withState(ScheduledActionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * List of times when the scheduled action will run.
     * </p>
     *
     * @return <p>
     *         List of times when the scheduled action will run.
     *         </p>
     */
    public java.util.List<java.util.Date> getNextInvocations() {
        return nextInvocations;
    }

    /**
     * <p>
     * List of times when the scheduled action will run.
     * </p>
     *
     * @param nextInvocations <p>
     *            List of times when the scheduled action will run.
     *            </p>
     */
    public void setNextInvocations(java.util.Collection<java.util.Date> nextInvocations) {
        if (nextInvocations == null) {
            this.nextInvocations = null;
            return;
        }

        this.nextInvocations = new java.util.ArrayList<java.util.Date>(nextInvocations);
    }

    /**
     * <p>
     * List of times when the scheduled action will run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextInvocations <p>
     *            List of times when the scheduled action will run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyScheduledActionResult withNextInvocations(java.util.Date... nextInvocations) {
        if (getNextInvocations() == null) {
            this.nextInvocations = new java.util.ArrayList<java.util.Date>(nextInvocations.length);
        }
        for (java.util.Date value : nextInvocations) {
            this.nextInvocations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of times when the scheduled action will run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextInvocations <p>
     *            List of times when the scheduled action will run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyScheduledActionResult withNextInvocations(
            java.util.Collection<java.util.Date> nextInvocations) {
        setNextInvocations(nextInvocations);
        return this;
    }

    /**
     * <p>
     * The start time in UTC when the schedule is active. Before this time, the
     * scheduled action does not trigger.
     * </p>
     *
     * @return <p>
     *         The start time in UTC when the schedule is active. Before this
     *         time, the scheduled action does not trigger.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The start time in UTC when the schedule is active. Before this time, the
     * scheduled action does not trigger.
     * </p>
     *
     * @param startTime <p>
     *            The start time in UTC when the schedule is active. Before this
     *            time, the scheduled action does not trigger.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time in UTC when the schedule is active. Before this time, the
     * scheduled action does not trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The start time in UTC when the schedule is active. Before this
     *            time, the scheduled action does not trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyScheduledActionResult withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The end time in UTC when the schedule is no longer active. After this
     * time, the scheduled action does not trigger.
     * </p>
     *
     * @return <p>
     *         The end time in UTC when the schedule is no longer active. After
     *         this time, the scheduled action does not trigger.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The end time in UTC when the schedule is no longer active. After this
     * time, the scheduled action does not trigger.
     * </p>
     *
     * @param endTime <p>
     *            The end time in UTC when the schedule is no longer active.
     *            After this time, the scheduled action does not trigger.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time in UTC when the schedule is no longer active. After this
     * time, the scheduled action does not trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The end time in UTC when the schedule is no longer active.
     *            After this time, the scheduled action does not trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyScheduledActionResult withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
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
        if (getScheduledActionName() != null)
            sb.append("ScheduledActionName: " + getScheduledActionName() + ",");
        if (getTargetAction() != null)
            sb.append("TargetAction: " + getTargetAction() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule() + ",");
        if (getIamRole() != null)
            sb.append("IamRole: " + getIamRole() + ",");
        if (getScheduledActionDescription() != null)
            sb.append("ScheduledActionDescription: " + getScheduledActionDescription() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getNextInvocations() != null)
            sb.append("NextInvocations: " + getNextInvocations() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getScheduledActionName() == null) ? 0 : getScheduledActionName().hashCode());
        hashCode = prime * hashCode
                + ((getTargetAction() == null) ? 0 : getTargetAction().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime
                * hashCode
                + ((getScheduledActionDescription() == null) ? 0 : getScheduledActionDescription()
                        .hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getNextInvocations() == null) ? 0 : getNextInvocations().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyScheduledActionResult == false)
            return false;
        ModifyScheduledActionResult other = (ModifyScheduledActionResult) obj;

        if (other.getScheduledActionName() == null ^ this.getScheduledActionName() == null)
            return false;
        if (other.getScheduledActionName() != null
                && other.getScheduledActionName().equals(this.getScheduledActionName()) == false)
            return false;
        if (other.getTargetAction() == null ^ this.getTargetAction() == null)
            return false;
        if (other.getTargetAction() != null
                && other.getTargetAction().equals(this.getTargetAction()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null)
            return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false)
            return false;
        if (other.getScheduledActionDescription() == null
                ^ this.getScheduledActionDescription() == null)
            return false;
        if (other.getScheduledActionDescription() != null
                && other.getScheduledActionDescription().equals(
                        this.getScheduledActionDescription()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getNextInvocations() == null ^ this.getNextInvocations() == null)
            return false;
        if (other.getNextInvocations() != null
                && other.getNextInvocations().equals(this.getNextInvocations()) == false)
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
        return true;
    }
}
