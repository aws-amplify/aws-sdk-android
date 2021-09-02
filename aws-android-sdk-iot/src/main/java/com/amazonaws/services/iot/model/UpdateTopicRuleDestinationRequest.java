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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a topic rule destination. You use this to change the status, endpoint
 * URL, or confirmation URL of the destination.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >UpdateTopicRuleDestination</a> action.
 * </p>
 */
public class UpdateTopicRuleDestinationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ARN of the topic rule destination.
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
     * The ARN of the topic rule destination.
     * </p>
     *
     * @return <p>
     *         The ARN of the topic rule destination.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN of the topic rule destination.
     * </p>
     *
     * @param arn <p>
     *            The ARN of the topic rule destination.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the topic rule destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The ARN of the topic rule destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTopicRuleDestinationRequest withArn(String arn) {
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
    public UpdateTopicRuleDestinationRequest withStatus(String status) {
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
    public UpdateTopicRuleDestinationRequest withStatus(TopicRuleDestinationStatus status) {
        this.status = status.toString();
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
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTopicRuleDestinationRequest == false)
            return false;
        UpdateTopicRuleDestinationRequest other = (UpdateTopicRuleDestinationRequest) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
