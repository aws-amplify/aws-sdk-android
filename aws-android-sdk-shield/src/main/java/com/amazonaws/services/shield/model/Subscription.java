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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the AWS Shield Advanced subscription for an account.
 * </p>
 */
public class Subscription implements Serializable {
    /**
     * <p>
     * The start time of the subscription, in Unix time in seconds. For more
     * information see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The date and time your subscription will end.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The length, in seconds, of the AWS Shield Advanced subscription for the
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long timeCommitmentInSeconds;

    /**
     * <p>
     * If <code>ENABLED</code>, the subscription will be automatically renewed
     * at the end of the existing subscription period.
     * </p>
     * <p>
     * When you initally create a subscription, <code>AutoRenew</code> is set to
     * <code>ENABLED</code>. You can change this by submitting an
     * <code>UpdateSubscription</code> request. If the
     * <code>UpdateSubscription</code> request does not included a value for
     * <code>AutoRenew</code>, the existing value for <code>AutoRenew</code>
     * remains unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String autoRenew;

    /**
     * <p>
     * Specifies how many protections of a given type you can create.
     * </p>
     */
    private java.util.List<Limit> limits;

    /**
     * <p>
     * If <code>ENABLED</code>, the DDoS Response Team (DRT) will use email and
     * phone to notify contacts about escalations to the DRT and to initiate
     * proactive customer support.
     * </p>
     * <p>
     * If <code>PENDING</code>, you have requested proactive engagement and the
     * request is pending. The status changes to <code>ENABLED</code> when your
     * request is fully processed.
     * </p>
     * <p>
     * If <code>DISABLED</code>, the DRT will not proactively notify contacts
     * about escalations or to initiate proactive customer support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, PENDING
     */
    private String proactiveEngagementStatus;

    /**
     * <p>
     * The start time of the subscription, in Unix time in seconds. For more
     * information see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     *
     * @return <p>
     *         The start time of the subscription, in Unix time in seconds. For
     *         more information see <a href=
     *         "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *         >timestamp</a>.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The start time of the subscription, in Unix time in seconds. For more
     * information see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     *
     * @param startTime <p>
     *            The start time of the subscription, in Unix time in seconds.
     *            For more information see <a href=
     *            "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *            >timestamp</a>.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the subscription, in Unix time in seconds. For more
     * information see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The start time of the subscription, in Unix time in seconds.
     *            For more information see <a href=
     *            "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *            >timestamp</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subscription withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The date and time your subscription will end.
     * </p>
     *
     * @return <p>
     *         The date and time your subscription will end.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The date and time your subscription will end.
     * </p>
     *
     * @param endTime <p>
     *            The date and time your subscription will end.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time your subscription will end.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The date and time your subscription will end.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subscription withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The length, in seconds, of the AWS Shield Advanced subscription for the
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The length, in seconds, of the AWS Shield Advanced subscription
     *         for the account.
     *         </p>
     */
    public Long getTimeCommitmentInSeconds() {
        return timeCommitmentInSeconds;
    }

    /**
     * <p>
     * The length, in seconds, of the AWS Shield Advanced subscription for the
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param timeCommitmentInSeconds <p>
     *            The length, in seconds, of the AWS Shield Advanced
     *            subscription for the account.
     *            </p>
     */
    public void setTimeCommitmentInSeconds(Long timeCommitmentInSeconds) {
        this.timeCommitmentInSeconds = timeCommitmentInSeconds;
    }

    /**
     * <p>
     * The length, in seconds, of the AWS Shield Advanced subscription for the
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param timeCommitmentInSeconds <p>
     *            The length, in seconds, of the AWS Shield Advanced
     *            subscription for the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subscription withTimeCommitmentInSeconds(Long timeCommitmentInSeconds) {
        this.timeCommitmentInSeconds = timeCommitmentInSeconds;
        return this;
    }

    /**
     * <p>
     * If <code>ENABLED</code>, the subscription will be automatically renewed
     * at the end of the existing subscription period.
     * </p>
     * <p>
     * When you initally create a subscription, <code>AutoRenew</code> is set to
     * <code>ENABLED</code>. You can change this by submitting an
     * <code>UpdateSubscription</code> request. If the
     * <code>UpdateSubscription</code> request does not included a value for
     * <code>AutoRenew</code>, the existing value for <code>AutoRenew</code>
     * remains unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         If <code>ENABLED</code>, the subscription will be automatically
     *         renewed at the end of the existing subscription period.
     *         </p>
     *         <p>
     *         When you initally create a subscription, <code>AutoRenew</code>
     *         is set to <code>ENABLED</code>. You can change this by submitting
     *         an <code>UpdateSubscription</code> request. If the
     *         <code>UpdateSubscription</code> request does not included a value
     *         for <code>AutoRenew</code>, the existing value for
     *         <code>AutoRenew</code> remains unchanged.
     *         </p>
     * @see AutoRenew
     */
    public String getAutoRenew() {
        return autoRenew;
    }

    /**
     * <p>
     * If <code>ENABLED</code>, the subscription will be automatically renewed
     * at the end of the existing subscription period.
     * </p>
     * <p>
     * When you initally create a subscription, <code>AutoRenew</code> is set to
     * <code>ENABLED</code>. You can change this by submitting an
     * <code>UpdateSubscription</code> request. If the
     * <code>UpdateSubscription</code> request does not included a value for
     * <code>AutoRenew</code>, the existing value for <code>AutoRenew</code>
     * remains unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoRenew <p>
     *            If <code>ENABLED</code>, the subscription will be
     *            automatically renewed at the end of the existing subscription
     *            period.
     *            </p>
     *            <p>
     *            When you initally create a subscription,
     *            <code>AutoRenew</code> is set to <code>ENABLED</code>. You can
     *            change this by submitting an <code>UpdateSubscription</code>
     *            request. If the <code>UpdateSubscription</code> request does
     *            not included a value for <code>AutoRenew</code>, the existing
     *            value for <code>AutoRenew</code> remains unchanged.
     *            </p>
     * @see AutoRenew
     */
    public void setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
    }

    /**
     * <p>
     * If <code>ENABLED</code>, the subscription will be automatically renewed
     * at the end of the existing subscription period.
     * </p>
     * <p>
     * When you initally create a subscription, <code>AutoRenew</code> is set to
     * <code>ENABLED</code>. You can change this by submitting an
     * <code>UpdateSubscription</code> request. If the
     * <code>UpdateSubscription</code> request does not included a value for
     * <code>AutoRenew</code>, the existing value for <code>AutoRenew</code>
     * remains unchanged.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoRenew <p>
     *            If <code>ENABLED</code>, the subscription will be
     *            automatically renewed at the end of the existing subscription
     *            period.
     *            </p>
     *            <p>
     *            When you initally create a subscription,
     *            <code>AutoRenew</code> is set to <code>ENABLED</code>. You can
     *            change this by submitting an <code>UpdateSubscription</code>
     *            request. If the <code>UpdateSubscription</code> request does
     *            not included a value for <code>AutoRenew</code>, the existing
     *            value for <code>AutoRenew</code> remains unchanged.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoRenew
     */
    public Subscription withAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * <p>
     * If <code>ENABLED</code>, the subscription will be automatically renewed
     * at the end of the existing subscription period.
     * </p>
     * <p>
     * When you initally create a subscription, <code>AutoRenew</code> is set to
     * <code>ENABLED</code>. You can change this by submitting an
     * <code>UpdateSubscription</code> request. If the
     * <code>UpdateSubscription</code> request does not included a value for
     * <code>AutoRenew</code>, the existing value for <code>AutoRenew</code>
     * remains unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoRenew <p>
     *            If <code>ENABLED</code>, the subscription will be
     *            automatically renewed at the end of the existing subscription
     *            period.
     *            </p>
     *            <p>
     *            When you initally create a subscription,
     *            <code>AutoRenew</code> is set to <code>ENABLED</code>. You can
     *            change this by submitting an <code>UpdateSubscription</code>
     *            request. If the <code>UpdateSubscription</code> request does
     *            not included a value for <code>AutoRenew</code>, the existing
     *            value for <code>AutoRenew</code> remains unchanged.
     *            </p>
     * @see AutoRenew
     */
    public void setAutoRenew(AutoRenew autoRenew) {
        this.autoRenew = autoRenew.toString();
    }

    /**
     * <p>
     * If <code>ENABLED</code>, the subscription will be automatically renewed
     * at the end of the existing subscription period.
     * </p>
     * <p>
     * When you initally create a subscription, <code>AutoRenew</code> is set to
     * <code>ENABLED</code>. You can change this by submitting an
     * <code>UpdateSubscription</code> request. If the
     * <code>UpdateSubscription</code> request does not included a value for
     * <code>AutoRenew</code>, the existing value for <code>AutoRenew</code>
     * remains unchanged.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param autoRenew <p>
     *            If <code>ENABLED</code>, the subscription will be
     *            automatically renewed at the end of the existing subscription
     *            period.
     *            </p>
     *            <p>
     *            When you initally create a subscription,
     *            <code>AutoRenew</code> is set to <code>ENABLED</code>. You can
     *            change this by submitting an <code>UpdateSubscription</code>
     *            request. If the <code>UpdateSubscription</code> request does
     *            not included a value for <code>AutoRenew</code>, the existing
     *            value for <code>AutoRenew</code> remains unchanged.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoRenew
     */
    public Subscription withAutoRenew(AutoRenew autoRenew) {
        this.autoRenew = autoRenew.toString();
        return this;
    }

    /**
     * <p>
     * Specifies how many protections of a given type you can create.
     * </p>
     *
     * @return <p>
     *         Specifies how many protections of a given type you can create.
     *         </p>
     */
    public java.util.List<Limit> getLimits() {
        return limits;
    }

    /**
     * <p>
     * Specifies how many protections of a given type you can create.
     * </p>
     *
     * @param limits <p>
     *            Specifies how many protections of a given type you can create.
     *            </p>
     */
    public void setLimits(java.util.Collection<Limit> limits) {
        if (limits == null) {
            this.limits = null;
            return;
        }

        this.limits = new java.util.ArrayList<Limit>(limits);
    }

    /**
     * <p>
     * Specifies how many protections of a given type you can create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limits <p>
     *            Specifies how many protections of a given type you can create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subscription withLimits(Limit... limits) {
        if (getLimits() == null) {
            this.limits = new java.util.ArrayList<Limit>(limits.length);
        }
        for (Limit value : limits) {
            this.limits.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies how many protections of a given type you can create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limits <p>
     *            Specifies how many protections of a given type you can create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Subscription withLimits(java.util.Collection<Limit> limits) {
        setLimits(limits);
        return this;
    }

    /**
     * <p>
     * If <code>ENABLED</code>, the DDoS Response Team (DRT) will use email and
     * phone to notify contacts about escalations to the DRT and to initiate
     * proactive customer support.
     * </p>
     * <p>
     * If <code>PENDING</code>, you have requested proactive engagement and the
     * request is pending. The status changes to <code>ENABLED</code> when your
     * request is fully processed.
     * </p>
     * <p>
     * If <code>DISABLED</code>, the DRT will not proactively notify contacts
     * about escalations or to initiate proactive customer support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, PENDING
     *
     * @return <p>
     *         If <code>ENABLED</code>, the DDoS Response Team (DRT) will use
     *         email and phone to notify contacts about escalations to the DRT
     *         and to initiate proactive customer support.
     *         </p>
     *         <p>
     *         If <code>PENDING</code>, you have requested proactive engagement
     *         and the request is pending. The status changes to
     *         <code>ENABLED</code> when your request is fully processed.
     *         </p>
     *         <p>
     *         If <code>DISABLED</code>, the DRT will not proactively notify
     *         contacts about escalations or to initiate proactive customer
     *         support.
     *         </p>
     * @see ProactiveEngagementStatus
     */
    public String getProactiveEngagementStatus() {
        return proactiveEngagementStatus;
    }

    /**
     * <p>
     * If <code>ENABLED</code>, the DDoS Response Team (DRT) will use email and
     * phone to notify contacts about escalations to the DRT and to initiate
     * proactive customer support.
     * </p>
     * <p>
     * If <code>PENDING</code>, you have requested proactive engagement and the
     * request is pending. The status changes to <code>ENABLED</code> when your
     * request is fully processed.
     * </p>
     * <p>
     * If <code>DISABLED</code>, the DRT will not proactively notify contacts
     * about escalations or to initiate proactive customer support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, PENDING
     *
     * @param proactiveEngagementStatus <p>
     *            If <code>ENABLED</code>, the DDoS Response Team (DRT) will use
     *            email and phone to notify contacts about escalations to the
     *            DRT and to initiate proactive customer support.
     *            </p>
     *            <p>
     *            If <code>PENDING</code>, you have requested proactive
     *            engagement and the request is pending. The status changes to
     *            <code>ENABLED</code> when your request is fully processed.
     *            </p>
     *            <p>
     *            If <code>DISABLED</code>, the DRT will not proactively notify
     *            contacts about escalations or to initiate proactive customer
     *            support.
     *            </p>
     * @see ProactiveEngagementStatus
     */
    public void setProactiveEngagementStatus(String proactiveEngagementStatus) {
        this.proactiveEngagementStatus = proactiveEngagementStatus;
    }

    /**
     * <p>
     * If <code>ENABLED</code>, the DDoS Response Team (DRT) will use email and
     * phone to notify contacts about escalations to the DRT and to initiate
     * proactive customer support.
     * </p>
     * <p>
     * If <code>PENDING</code>, you have requested proactive engagement and the
     * request is pending. The status changes to <code>ENABLED</code> when your
     * request is fully processed.
     * </p>
     * <p>
     * If <code>DISABLED</code>, the DRT will not proactively notify contacts
     * about escalations or to initiate proactive customer support.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, PENDING
     *
     * @param proactiveEngagementStatus <p>
     *            If <code>ENABLED</code>, the DDoS Response Team (DRT) will use
     *            email and phone to notify contacts about escalations to the
     *            DRT and to initiate proactive customer support.
     *            </p>
     *            <p>
     *            If <code>PENDING</code>, you have requested proactive
     *            engagement and the request is pending. The status changes to
     *            <code>ENABLED</code> when your request is fully processed.
     *            </p>
     *            <p>
     *            If <code>DISABLED</code>, the DRT will not proactively notify
     *            contacts about escalations or to initiate proactive customer
     *            support.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProactiveEngagementStatus
     */
    public Subscription withProactiveEngagementStatus(String proactiveEngagementStatus) {
        this.proactiveEngagementStatus = proactiveEngagementStatus;
        return this;
    }

    /**
     * <p>
     * If <code>ENABLED</code>, the DDoS Response Team (DRT) will use email and
     * phone to notify contacts about escalations to the DRT and to initiate
     * proactive customer support.
     * </p>
     * <p>
     * If <code>PENDING</code>, you have requested proactive engagement and the
     * request is pending. The status changes to <code>ENABLED</code> when your
     * request is fully processed.
     * </p>
     * <p>
     * If <code>DISABLED</code>, the DRT will not proactively notify contacts
     * about escalations or to initiate proactive customer support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, PENDING
     *
     * @param proactiveEngagementStatus <p>
     *            If <code>ENABLED</code>, the DDoS Response Team (DRT) will use
     *            email and phone to notify contacts about escalations to the
     *            DRT and to initiate proactive customer support.
     *            </p>
     *            <p>
     *            If <code>PENDING</code>, you have requested proactive
     *            engagement and the request is pending. The status changes to
     *            <code>ENABLED</code> when your request is fully processed.
     *            </p>
     *            <p>
     *            If <code>DISABLED</code>, the DRT will not proactively notify
     *            contacts about escalations or to initiate proactive customer
     *            support.
     *            </p>
     * @see ProactiveEngagementStatus
     */
    public void setProactiveEngagementStatus(ProactiveEngagementStatus proactiveEngagementStatus) {
        this.proactiveEngagementStatus = proactiveEngagementStatus.toString();
    }

    /**
     * <p>
     * If <code>ENABLED</code>, the DDoS Response Team (DRT) will use email and
     * phone to notify contacts about escalations to the DRT and to initiate
     * proactive customer support.
     * </p>
     * <p>
     * If <code>PENDING</code>, you have requested proactive engagement and the
     * request is pending. The status changes to <code>ENABLED</code> when your
     * request is fully processed.
     * </p>
     * <p>
     * If <code>DISABLED</code>, the DRT will not proactively notify contacts
     * about escalations or to initiate proactive customer support.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED, PENDING
     *
     * @param proactiveEngagementStatus <p>
     *            If <code>ENABLED</code>, the DDoS Response Team (DRT) will use
     *            email and phone to notify contacts about escalations to the
     *            DRT and to initiate proactive customer support.
     *            </p>
     *            <p>
     *            If <code>PENDING</code>, you have requested proactive
     *            engagement and the request is pending. The status changes to
     *            <code>ENABLED</code> when your request is fully processed.
     *            </p>
     *            <p>
     *            If <code>DISABLED</code>, the DRT will not proactively notify
     *            contacts about escalations or to initiate proactive customer
     *            support.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProactiveEngagementStatus
     */
    public Subscription withProactiveEngagementStatus(
            ProactiveEngagementStatus proactiveEngagementStatus) {
        this.proactiveEngagementStatus = proactiveEngagementStatus.toString();
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
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getTimeCommitmentInSeconds() != null)
            sb.append("TimeCommitmentInSeconds: " + getTimeCommitmentInSeconds() + ",");
        if (getAutoRenew() != null)
            sb.append("AutoRenew: " + getAutoRenew() + ",");
        if (getLimits() != null)
            sb.append("Limits: " + getLimits() + ",");
        if (getProactiveEngagementStatus() != null)
            sb.append("ProactiveEngagementStatus: " + getProactiveEngagementStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getTimeCommitmentInSeconds() == null) ? 0 : getTimeCommitmentInSeconds()
                        .hashCode());
        hashCode = prime * hashCode + ((getAutoRenew() == null) ? 0 : getAutoRenew().hashCode());
        hashCode = prime * hashCode + ((getLimits() == null) ? 0 : getLimits().hashCode());
        hashCode = prime
                * hashCode
                + ((getProactiveEngagementStatus() == null) ? 0 : getProactiveEngagementStatus()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Subscription == false)
            return false;
        Subscription other = (Subscription) obj;

        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getTimeCommitmentInSeconds() == null ^ this.getTimeCommitmentInSeconds() == null)
            return false;
        if (other.getTimeCommitmentInSeconds() != null
                && other.getTimeCommitmentInSeconds().equals(this.getTimeCommitmentInSeconds()) == false)
            return false;
        if (other.getAutoRenew() == null ^ this.getAutoRenew() == null)
            return false;
        if (other.getAutoRenew() != null
                && other.getAutoRenew().equals(this.getAutoRenew()) == false)
            return false;
        if (other.getLimits() == null ^ this.getLimits() == null)
            return false;
        if (other.getLimits() != null && other.getLimits().equals(this.getLimits()) == false)
            return false;
        if (other.getProactiveEngagementStatus() == null
                ^ this.getProactiveEngagementStatus() == null)
            return false;
        if (other.getProactiveEngagementStatus() != null
                && other.getProactiveEngagementStatus().equals(this.getProactiveEngagementStatus()) == false)
            return false;
        return true;
    }
}
