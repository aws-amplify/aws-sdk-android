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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the topic rule destination.
 * </p>
 */
public class TopicRuleDestinationSummary implements Serializable {
    /**
     * <p>
     * The topic rule destination ARN.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The status of the topic rule destination. Valid values are:
     * </p>
     * <dl>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * A topic rule destination was created but has not been confirmed. You can
     * set <code>status</code> to <code>IN_PROGRESS</code> by calling
     * <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation
     * challenge to be sent to your confirmation endpoint.
     * </p>
     * </dd>
     * <dt>ENABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is allowed.
     * You can set <code>status</code> to <code>DISABLED</code> by calling
     * <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>DISABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is not
     * allowed. You can set <code>status</code> to <code>ENABLED</code> by
     * calling <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>ERROR</dt>
     * <dd>
     * <p>
     * Confirmation could not be completed, for example if the confirmation
     * timed out. You can call <code>GetTopicRuleDestination</code> for details
     * about the error. You can set <code>status</code> to
     * <code>IN_PROGRESS</code> by calling
     * <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation
     * challenge to be sent to your confirmation endpoint.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, IN_PROGRESS, DISABLED, ERROR
     */
    private String status;

    /**
     * <p>
     * The reason the topic rule destination is in the current status.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * Information about the HTTP URL.
     * </p>
     */
    private HttpUrlDestinationSummary httpUrlSummary;

    /**
     * <p>
     * The topic rule destination ARN.
     * </p>
     *
     * @return <p>
     *         The topic rule destination ARN.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The topic rule destination ARN.
     * </p>
     *
     * @param arn <p>
     *            The topic rule destination ARN.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The topic rule destination ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The topic rule destination ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRuleDestinationSummary withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The status of the topic rule destination. Valid values are:
     * </p>
     * <dl>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * A topic rule destination was created but has not been confirmed. You can
     * set <code>status</code> to <code>IN_PROGRESS</code> by calling
     * <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation
     * challenge to be sent to your confirmation endpoint.
     * </p>
     * </dd>
     * <dt>ENABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is allowed.
     * You can set <code>status</code> to <code>DISABLED</code> by calling
     * <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>DISABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is not
     * allowed. You can set <code>status</code> to <code>ENABLED</code> by
     * calling <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>ERROR</dt>
     * <dd>
     * <p>
     * Confirmation could not be completed, for example if the confirmation
     * timed out. You can call <code>GetTopicRuleDestination</code> for details
     * about the error. You can set <code>status</code> to
     * <code>IN_PROGRESS</code> by calling
     * <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation
     * challenge to be sent to your confirmation endpoint.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, IN_PROGRESS, DISABLED, ERROR
     *
     * @return <p>
     *         The status of the topic rule destination. Valid values are:
     *         </p>
     *         <dl>
     *         <dt>IN_PROGRESS</dt>
     *         <dd>
     *         <p>
     *         A topic rule destination was created but has not been confirmed.
     *         You can set <code>status</code> to <code>IN_PROGRESS</code> by
     *         calling <code>UpdateTopicRuleDestination</code>. Calling
     *         <code>UpdateTopicRuleDestination</code> causes a new confirmation
     *         challenge to be sent to your confirmation endpoint.
     *         </p>
     *         </dd>
     *         <dt>ENABLED</dt>
     *         <dd>
     *         <p>
     *         Confirmation was completed, and traffic to this destination is
     *         allowed. You can set <code>status</code> to <code>DISABLED</code>
     *         by calling <code>UpdateTopicRuleDestination</code>.
     *         </p>
     *         </dd>
     *         <dt>DISABLED</dt>
     *         <dd>
     *         <p>
     *         Confirmation was completed, and traffic to this destination is
     *         not allowed. You can set <code>status</code> to
     *         <code>ENABLED</code> by calling
     *         <code>UpdateTopicRuleDestination</code>.
     *         </p>
     *         </dd>
     *         <dt>ERROR</dt>
     *         <dd>
     *         <p>
     *         Confirmation could not be completed, for example if the
     *         confirmation timed out. You can call
     *         <code>GetTopicRuleDestination</code> for details about the error.
     *         You can set <code>status</code> to <code>IN_PROGRESS</code> by
     *         calling <code>UpdateTopicRuleDestination</code>. Calling
     *         <code>UpdateTopicRuleDestination</code> causes a new confirmation
     *         challenge to be sent to your confirmation endpoint.
     *         </p>
     *         </dd>
     *         </dl>
     * @see TopicRuleDestinationStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the topic rule destination. Valid values are:
     * </p>
     * <dl>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * A topic rule destination was created but has not been confirmed. You can
     * set <code>status</code> to <code>IN_PROGRESS</code> by calling
     * <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation
     * challenge to be sent to your confirmation endpoint.
     * </p>
     * </dd>
     * <dt>ENABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is allowed.
     * You can set <code>status</code> to <code>DISABLED</code> by calling
     * <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>DISABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is not
     * allowed. You can set <code>status</code> to <code>ENABLED</code> by
     * calling <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>ERROR</dt>
     * <dd>
     * <p>
     * Confirmation could not be completed, for example if the confirmation
     * timed out. You can call <code>GetTopicRuleDestination</code> for details
     * about the error. You can set <code>status</code> to
     * <code>IN_PROGRESS</code> by calling
     * <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation
     * challenge to be sent to your confirmation endpoint.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, IN_PROGRESS, DISABLED, ERROR
     *
     * @param status <p>
     *            The status of the topic rule destination. Valid values are:
     *            </p>
     *            <dl>
     *            <dt>IN_PROGRESS</dt>
     *            <dd>
     *            <p>
     *            A topic rule destination was created but has not been
     *            confirmed. You can set <code>status</code> to
     *            <code>IN_PROGRESS</code> by calling
     *            <code>UpdateTopicRuleDestination</code>. Calling
     *            <code>UpdateTopicRuleDestination</code> causes a new
     *            confirmation challenge to be sent to your confirmation
     *            endpoint.
     *            </p>
     *            </dd>
     *            <dt>ENABLED</dt>
     *            <dd>
     *            <p>
     *            Confirmation was completed, and traffic to this destination is
     *            allowed. You can set <code>status</code> to
     *            <code>DISABLED</code> by calling
     *            <code>UpdateTopicRuleDestination</code>.
     *            </p>
     *            </dd>
     *            <dt>DISABLED</dt>
     *            <dd>
     *            <p>
     *            Confirmation was completed, and traffic to this destination is
     *            not allowed. You can set <code>status</code> to
     *            <code>ENABLED</code> by calling
     *            <code>UpdateTopicRuleDestination</code>.
     *            </p>
     *            </dd>
     *            <dt>ERROR</dt>
     *            <dd>
     *            <p>
     *            Confirmation could not be completed, for example if the
     *            confirmation timed out. You can call
     *            <code>GetTopicRuleDestination</code> for details about the
     *            error. You can set <code>status</code> to
     *            <code>IN_PROGRESS</code> by calling
     *            <code>UpdateTopicRuleDestination</code>. Calling
     *            <code>UpdateTopicRuleDestination</code> causes a new
     *            confirmation challenge to be sent to your confirmation
     *            endpoint.
     *            </p>
     *            </dd>
     *            </dl>
     * @see TopicRuleDestinationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the topic rule destination. Valid values are:
     * </p>
     * <dl>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * A topic rule destination was created but has not been confirmed. You can
     * set <code>status</code> to <code>IN_PROGRESS</code> by calling
     * <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation
     * challenge to be sent to your confirmation endpoint.
     * </p>
     * </dd>
     * <dt>ENABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is allowed.
     * You can set <code>status</code> to <code>DISABLED</code> by calling
     * <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>DISABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is not
     * allowed. You can set <code>status</code> to <code>ENABLED</code> by
     * calling <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>ERROR</dt>
     * <dd>
     * <p>
     * Confirmation could not be completed, for example if the confirmation
     * timed out. You can call <code>GetTopicRuleDestination</code> for details
     * about the error. You can set <code>status</code> to
     * <code>IN_PROGRESS</code> by calling
     * <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation
     * challenge to be sent to your confirmation endpoint.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, IN_PROGRESS, DISABLED, ERROR
     *
     * @param status <p>
     *            The status of the topic rule destination. Valid values are:
     *            </p>
     *            <dl>
     *            <dt>IN_PROGRESS</dt>
     *            <dd>
     *            <p>
     *            A topic rule destination was created but has not been
     *            confirmed. You can set <code>status</code> to
     *            <code>IN_PROGRESS</code> by calling
     *            <code>UpdateTopicRuleDestination</code>. Calling
     *            <code>UpdateTopicRuleDestination</code> causes a new
     *            confirmation challenge to be sent to your confirmation
     *            endpoint.
     *            </p>
     *            </dd>
     *            <dt>ENABLED</dt>
     *            <dd>
     *            <p>
     *            Confirmation was completed, and traffic to this destination is
     *            allowed. You can set <code>status</code> to
     *            <code>DISABLED</code> by calling
     *            <code>UpdateTopicRuleDestination</code>.
     *            </p>
     *            </dd>
     *            <dt>DISABLED</dt>
     *            <dd>
     *            <p>
     *            Confirmation was completed, and traffic to this destination is
     *            not allowed. You can set <code>status</code> to
     *            <code>ENABLED</code> by calling
     *            <code>UpdateTopicRuleDestination</code>.
     *            </p>
     *            </dd>
     *            <dt>ERROR</dt>
     *            <dd>
     *            <p>
     *            Confirmation could not be completed, for example if the
     *            confirmation timed out. You can call
     *            <code>GetTopicRuleDestination</code> for details about the
     *            error. You can set <code>status</code> to
     *            <code>IN_PROGRESS</code> by calling
     *            <code>UpdateTopicRuleDestination</code>. Calling
     *            <code>UpdateTopicRuleDestination</code> causes a new
     *            confirmation challenge to be sent to your confirmation
     *            endpoint.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TopicRuleDestinationStatus
     */
    public TopicRuleDestinationSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the topic rule destination. Valid values are:
     * </p>
     * <dl>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * A topic rule destination was created but has not been confirmed. You can
     * set <code>status</code> to <code>IN_PROGRESS</code> by calling
     * <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation
     * challenge to be sent to your confirmation endpoint.
     * </p>
     * </dd>
     * <dt>ENABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is allowed.
     * You can set <code>status</code> to <code>DISABLED</code> by calling
     * <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>DISABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is not
     * allowed. You can set <code>status</code> to <code>ENABLED</code> by
     * calling <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>ERROR</dt>
     * <dd>
     * <p>
     * Confirmation could not be completed, for example if the confirmation
     * timed out. You can call <code>GetTopicRuleDestination</code> for details
     * about the error. You can set <code>status</code> to
     * <code>IN_PROGRESS</code> by calling
     * <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation
     * challenge to be sent to your confirmation endpoint.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, IN_PROGRESS, DISABLED, ERROR
     *
     * @param status <p>
     *            The status of the topic rule destination. Valid values are:
     *            </p>
     *            <dl>
     *            <dt>IN_PROGRESS</dt>
     *            <dd>
     *            <p>
     *            A topic rule destination was created but has not been
     *            confirmed. You can set <code>status</code> to
     *            <code>IN_PROGRESS</code> by calling
     *            <code>UpdateTopicRuleDestination</code>. Calling
     *            <code>UpdateTopicRuleDestination</code> causes a new
     *            confirmation challenge to be sent to your confirmation
     *            endpoint.
     *            </p>
     *            </dd>
     *            <dt>ENABLED</dt>
     *            <dd>
     *            <p>
     *            Confirmation was completed, and traffic to this destination is
     *            allowed. You can set <code>status</code> to
     *            <code>DISABLED</code> by calling
     *            <code>UpdateTopicRuleDestination</code>.
     *            </p>
     *            </dd>
     *            <dt>DISABLED</dt>
     *            <dd>
     *            <p>
     *            Confirmation was completed, and traffic to this destination is
     *            not allowed. You can set <code>status</code> to
     *            <code>ENABLED</code> by calling
     *            <code>UpdateTopicRuleDestination</code>.
     *            </p>
     *            </dd>
     *            <dt>ERROR</dt>
     *            <dd>
     *            <p>
     *            Confirmation could not be completed, for example if the
     *            confirmation timed out. You can call
     *            <code>GetTopicRuleDestination</code> for details about the
     *            error. You can set <code>status</code> to
     *            <code>IN_PROGRESS</code> by calling
     *            <code>UpdateTopicRuleDestination</code>. Calling
     *            <code>UpdateTopicRuleDestination</code> causes a new
     *            confirmation challenge to be sent to your confirmation
     *            endpoint.
     *            </p>
     *            </dd>
     *            </dl>
     * @see TopicRuleDestinationStatus
     */
    public void setStatus(TopicRuleDestinationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the topic rule destination. Valid values are:
     * </p>
     * <dl>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * A topic rule destination was created but has not been confirmed. You can
     * set <code>status</code> to <code>IN_PROGRESS</code> by calling
     * <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation
     * challenge to be sent to your confirmation endpoint.
     * </p>
     * </dd>
     * <dt>ENABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is allowed.
     * You can set <code>status</code> to <code>DISABLED</code> by calling
     * <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>DISABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is not
     * allowed. You can set <code>status</code> to <code>ENABLED</code> by
     * calling <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>ERROR</dt>
     * <dd>
     * <p>
     * Confirmation could not be completed, for example if the confirmation
     * timed out. You can call <code>GetTopicRuleDestination</code> for details
     * about the error. You can set <code>status</code> to
     * <code>IN_PROGRESS</code> by calling
     * <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation
     * challenge to be sent to your confirmation endpoint.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, IN_PROGRESS, DISABLED, ERROR
     *
     * @param status <p>
     *            The status of the topic rule destination. Valid values are:
     *            </p>
     *            <dl>
     *            <dt>IN_PROGRESS</dt>
     *            <dd>
     *            <p>
     *            A topic rule destination was created but has not been
     *            confirmed. You can set <code>status</code> to
     *            <code>IN_PROGRESS</code> by calling
     *            <code>UpdateTopicRuleDestination</code>. Calling
     *            <code>UpdateTopicRuleDestination</code> causes a new
     *            confirmation challenge to be sent to your confirmation
     *            endpoint.
     *            </p>
     *            </dd>
     *            <dt>ENABLED</dt>
     *            <dd>
     *            <p>
     *            Confirmation was completed, and traffic to this destination is
     *            allowed. You can set <code>status</code> to
     *            <code>DISABLED</code> by calling
     *            <code>UpdateTopicRuleDestination</code>.
     *            </p>
     *            </dd>
     *            <dt>DISABLED</dt>
     *            <dd>
     *            <p>
     *            Confirmation was completed, and traffic to this destination is
     *            not allowed. You can set <code>status</code> to
     *            <code>ENABLED</code> by calling
     *            <code>UpdateTopicRuleDestination</code>.
     *            </p>
     *            </dd>
     *            <dt>ERROR</dt>
     *            <dd>
     *            <p>
     *            Confirmation could not be completed, for example if the
     *            confirmation timed out. You can call
     *            <code>GetTopicRuleDestination</code> for details about the
     *            error. You can set <code>status</code> to
     *            <code>IN_PROGRESS</code> by calling
     *            <code>UpdateTopicRuleDestination</code>. Calling
     *            <code>UpdateTopicRuleDestination</code> causes a new
     *            confirmation challenge to be sent to your confirmation
     *            endpoint.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TopicRuleDestinationStatus
     */
    public TopicRuleDestinationSummary withStatus(TopicRuleDestinationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason the topic rule destination is in the current status.
     * </p>
     *
     * @return <p>
     *         The reason the topic rule destination is in the current status.
     *         </p>
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * <p>
     * The reason the topic rule destination is in the current status.
     * </p>
     *
     * @param statusReason <p>
     *            The reason the topic rule destination is in the current
     *            status.
     *            </p>
     */
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason the topic rule destination is in the current status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusReason <p>
     *            The reason the topic rule destination is in the current
     *            status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRuleDestinationSummary withStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * <p>
     * Information about the HTTP URL.
     * </p>
     *
     * @return <p>
     *         Information about the HTTP URL.
     *         </p>
     */
    public HttpUrlDestinationSummary getHttpUrlSummary() {
        return httpUrlSummary;
    }

    /**
     * <p>
     * Information about the HTTP URL.
     * </p>
     *
     * @param httpUrlSummary <p>
     *            Information about the HTTP URL.
     *            </p>
     */
    public void setHttpUrlSummary(HttpUrlDestinationSummary httpUrlSummary) {
        this.httpUrlSummary = httpUrlSummary;
    }

    /**
     * <p>
     * Information about the HTTP URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param httpUrlSummary <p>
     *            Information about the HTTP URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRuleDestinationSummary withHttpUrlSummary(HttpUrlDestinationSummary httpUrlSummary) {
        this.httpUrlSummary = httpUrlSummary;
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getStatusReason() != null)
            sb.append("statusReason: " + getStatusReason() + ",");
        if (getHttpUrlSummary() != null)
            sb.append("httpUrlSummary: " + getHttpUrlSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode
                + ((getHttpUrlSummary() == null) ? 0 : getHttpUrlSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicRuleDestinationSummary == false)
            return false;
        TopicRuleDestinationSummary other = (TopicRuleDestinationSummary) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null
                && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getHttpUrlSummary() == null ^ this.getHttpUrlSummary() == null)
            return false;
        if (other.getHttpUrlSummary() != null
                && other.getHttpUrlSummary().equals(this.getHttpUrlSummary()) == false)
            return false;
        return true;
    }
}
