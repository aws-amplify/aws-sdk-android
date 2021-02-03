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

/**
 * <p>
 * A topic rule destination.
 * </p>
 */
public class TopicRuleDestination implements Serializable {
    /**
     * <p>
     * The topic rule destination URL.
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
     * <b>Allowed Values: </b>ENABLED, IN_PROGRESS, DISABLED, ERROR, DELETING
     */
    private String status;

    /**
     * <p>
     * The date and time when the topic rule destination was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The date and time when the topic rule destination was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * Additional details or reason why the topic rule destination is in the
     * current status.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * Properties of the HTTP URL.
     * </p>
     */
    private HttpUrlDestinationProperties httpUrlProperties;

    /**
     * <p>
     * Properties of the virtual private cloud (VPC) connection.
     * </p>
     */
    private VpcDestinationProperties vpcProperties;

    /**
     * <p>
     * The topic rule destination URL.
     * </p>
     *
     * @return <p>
     *         The topic rule destination URL.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The topic rule destination URL.
     * </p>
     *
     * @param arn <p>
     *            The topic rule destination URL.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The topic rule destination URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The topic rule destination URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRuleDestination withArn(String arn) {
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
     * <b>Allowed Values: </b>ENABLED, IN_PROGRESS, DISABLED, ERROR, DELETING
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
     * <b>Allowed Values: </b>ENABLED, IN_PROGRESS, DISABLED, ERROR, DELETING
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
     * <b>Allowed Values: </b>ENABLED, IN_PROGRESS, DISABLED, ERROR, DELETING
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
    public TopicRuleDestination withStatus(String status) {
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
     * <b>Allowed Values: </b>ENABLED, IN_PROGRESS, DISABLED, ERROR, DELETING
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
     * <b>Allowed Values: </b>ENABLED, IN_PROGRESS, DISABLED, ERROR, DELETING
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
    public TopicRuleDestination withStatus(TopicRuleDestinationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the topic rule destination was created.
     * </p>
     *
     * @return <p>
     *         The date and time when the topic rule destination was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date and time when the topic rule destination was created.
     * </p>
     *
     * @param createdAt <p>
     *            The date and time when the topic rule destination was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the topic rule destination was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date and time when the topic rule destination was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRuleDestination withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The date and time when the topic rule destination was last updated.
     * </p>
     *
     * @return <p>
     *         The date and time when the topic rule destination was last
     *         updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the topic rule destination was last updated.
     * </p>
     *
     * @param lastUpdatedAt <p>
     *            The date and time when the topic rule destination was last
     *            updated.
     *            </p>
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the topic rule destination was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedAt <p>
     *            The date and time when the topic rule destination was last
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRuleDestination withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * <p>
     * Additional details or reason why the topic rule destination is in the
     * current status.
     * </p>
     *
     * @return <p>
     *         Additional details or reason why the topic rule destination is in
     *         the current status.
     *         </p>
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * <p>
     * Additional details or reason why the topic rule destination is in the
     * current status.
     * </p>
     *
     * @param statusReason <p>
     *            Additional details or reason why the topic rule destination is
     *            in the current status.
     *            </p>
     */
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * Additional details or reason why the topic rule destination is in the
     * current status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusReason <p>
     *            Additional details or reason why the topic rule destination is
     *            in the current status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRuleDestination withStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * <p>
     * Properties of the HTTP URL.
     * </p>
     *
     * @return <p>
     *         Properties of the HTTP URL.
     *         </p>
     */
    public HttpUrlDestinationProperties getHttpUrlProperties() {
        return httpUrlProperties;
    }

    /**
     * <p>
     * Properties of the HTTP URL.
     * </p>
     *
     * @param httpUrlProperties <p>
     *            Properties of the HTTP URL.
     *            </p>
     */
    public void setHttpUrlProperties(HttpUrlDestinationProperties httpUrlProperties) {
        this.httpUrlProperties = httpUrlProperties;
    }

    /**
     * <p>
     * Properties of the HTTP URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param httpUrlProperties <p>
     *            Properties of the HTTP URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRuleDestination withHttpUrlProperties(HttpUrlDestinationProperties httpUrlProperties) {
        this.httpUrlProperties = httpUrlProperties;
        return this;
    }

    /**
     * <p>
     * Properties of the virtual private cloud (VPC) connection.
     * </p>
     *
     * @return <p>
     *         Properties of the virtual private cloud (VPC) connection.
     *         </p>
     */
    public VpcDestinationProperties getVpcProperties() {
        return vpcProperties;
    }

    /**
     * <p>
     * Properties of the virtual private cloud (VPC) connection.
     * </p>
     *
     * @param vpcProperties <p>
     *            Properties of the virtual private cloud (VPC) connection.
     *            </p>
     */
    public void setVpcProperties(VpcDestinationProperties vpcProperties) {
        this.vpcProperties = vpcProperties;
    }

    /**
     * <p>
     * Properties of the virtual private cloud (VPC) connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcProperties <p>
     *            Properties of the virtual private cloud (VPC) connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRuleDestination withVpcProperties(VpcDestinationProperties vpcProperties) {
        this.vpcProperties = vpcProperties;
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
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getLastUpdatedAt() != null)
            sb.append("lastUpdatedAt: " + getLastUpdatedAt() + ",");
        if (getStatusReason() != null)
            sb.append("statusReason: " + getStatusReason() + ",");
        if (getHttpUrlProperties() != null)
            sb.append("httpUrlProperties: " + getHttpUrlProperties() + ",");
        if (getVpcProperties() != null)
            sb.append("vpcProperties: " + getVpcProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode
                + ((getHttpUrlProperties() == null) ? 0 : getHttpUrlProperties().hashCode());
        hashCode = prime * hashCode
                + ((getVpcProperties() == null) ? 0 : getVpcProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicRuleDestination == false)
            return false;
        TopicRuleDestination other = (TopicRuleDestination) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null
                && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null
                && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getHttpUrlProperties() == null ^ this.getHttpUrlProperties() == null)
            return false;
        if (other.getHttpUrlProperties() != null
                && other.getHttpUrlProperties().equals(this.getHttpUrlProperties()) == false)
            return false;
        if (other.getVpcProperties() == null ^ this.getVpcProperties() == null)
            return false;
        if (other.getVpcProperties() != null
                && other.getVpcProperties().equals(this.getVpcProperties()) == false)
            return false;
        return true;
    }
}
