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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

/**
 * <p>
 * The information about a processor in a channel flow.
 * </p>
 */
public class Processor implements Serializable {
    /**
     * <p>
     * The name of the channel flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String name;

    /**
     * <p>
     * The information about the type of processor and its identifier.
     * </p>
     */
    private ProcessorConfiguration configuration;

    /**
     * <p>
     * The sequence in which processors run. If you have multiple processors in
     * a channel flow, message processing goes through each processor in the
     * sequence. The value determines the sequence. At this point, we support
     * only 1 processor within a flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3<br/>
     */
    private Integer executionOrder;

    /**
     * <p>
     * Determines whether to continue with message processing or stop it in
     * cases where communication with a processor fails. If a processor has a
     * fallback action of <code>ABORT</code> and communication with it fails,
     * the processor sets the message status to <code>FAILED</code> and does not
     * send the message to any recipients. Note that if the last processor in
     * the channel flow sequence has a fallback action of <code>CONTINUE</code>
     * and communication with the processor fails, then the message is
     * considered processed and sent to recipients of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUE, ABORT
     */
    private String fallbackAction;

    /**
     * <p>
     * The name of the channel flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The name of the channel flow.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the channel flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param name <p>
     *            The name of the channel flow.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the channel flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param name <p>
     *            The name of the channel flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Processor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The information about the type of processor and its identifier.
     * </p>
     *
     * @return <p>
     *         The information about the type of processor and its identifier.
     *         </p>
     */
    public ProcessorConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * The information about the type of processor and its identifier.
     * </p>
     *
     * @param configuration <p>
     *            The information about the type of processor and its
     *            identifier.
     *            </p>
     */
    public void setConfiguration(ProcessorConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The information about the type of processor and its identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configuration <p>
     *            The information about the type of processor and its
     *            identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Processor withConfiguration(ProcessorConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * <p>
     * The sequence in which processors run. If you have multiple processors in
     * a channel flow, message processing goes through each processor in the
     * sequence. The value determines the sequence. At this point, we support
     * only 1 processor within a flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3<br/>
     *
     * @return <p>
     *         The sequence in which processors run. If you have multiple
     *         processors in a channel flow, message processing goes through
     *         each processor in the sequence. The value determines the
     *         sequence. At this point, we support only 1 processor within a
     *         flow.
     *         </p>
     */
    public Integer getExecutionOrder() {
        return executionOrder;
    }

    /**
     * <p>
     * The sequence in which processors run. If you have multiple processors in
     * a channel flow, message processing goes through each processor in the
     * sequence. The value determines the sequence. At this point, we support
     * only 1 processor within a flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3<br/>
     *
     * @param executionOrder <p>
     *            The sequence in which processors run. If you have multiple
     *            processors in a channel flow, message processing goes through
     *            each processor in the sequence. The value determines the
     *            sequence. At this point, we support only 1 processor within a
     *            flow.
     *            </p>
     */
    public void setExecutionOrder(Integer executionOrder) {
        this.executionOrder = executionOrder;
    }

    /**
     * <p>
     * The sequence in which processors run. If you have multiple processors in
     * a channel flow, message processing goes through each processor in the
     * sequence. The value determines the sequence. At this point, we support
     * only 1 processor within a flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3<br/>
     *
     * @param executionOrder <p>
     *            The sequence in which processors run. If you have multiple
     *            processors in a channel flow, message processing goes through
     *            each processor in the sequence. The value determines the
     *            sequence. At this point, we support only 1 processor within a
     *            flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Processor withExecutionOrder(Integer executionOrder) {
        this.executionOrder = executionOrder;
        return this;
    }

    /**
     * <p>
     * Determines whether to continue with message processing or stop it in
     * cases where communication with a processor fails. If a processor has a
     * fallback action of <code>ABORT</code> and communication with it fails,
     * the processor sets the message status to <code>FAILED</code> and does not
     * send the message to any recipients. Note that if the last processor in
     * the channel flow sequence has a fallback action of <code>CONTINUE</code>
     * and communication with the processor fails, then the message is
     * considered processed and sent to recipients of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUE, ABORT
     *
     * @return <p>
     *         Determines whether to continue with message processing or stop it
     *         in cases where communication with a processor fails. If a
     *         processor has a fallback action of <code>ABORT</code> and
     *         communication with it fails, the processor sets the message
     *         status to <code>FAILED</code> and does not send the message to
     *         any recipients. Note that if the last processor in the channel
     *         flow sequence has a fallback action of <code>CONTINUE</code> and
     *         communication with the processor fails, then the message is
     *         considered processed and sent to recipients of the channel.
     *         </p>
     * @see FallbackAction
     */
    public String getFallbackAction() {
        return fallbackAction;
    }

    /**
     * <p>
     * Determines whether to continue with message processing or stop it in
     * cases where communication with a processor fails. If a processor has a
     * fallback action of <code>ABORT</code> and communication with it fails,
     * the processor sets the message status to <code>FAILED</code> and does not
     * send the message to any recipients. Note that if the last processor in
     * the channel flow sequence has a fallback action of <code>CONTINUE</code>
     * and communication with the processor fails, then the message is
     * considered processed and sent to recipients of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUE, ABORT
     *
     * @param fallbackAction <p>
     *            Determines whether to continue with message processing or stop
     *            it in cases where communication with a processor fails. If a
     *            processor has a fallback action of <code>ABORT</code> and
     *            communication with it fails, the processor sets the message
     *            status to <code>FAILED</code> and does not send the message to
     *            any recipients. Note that if the last processor in the channel
     *            flow sequence has a fallback action of <code>CONTINUE</code>
     *            and communication with the processor fails, then the message
     *            is considered processed and sent to recipients of the channel.
     *            </p>
     * @see FallbackAction
     */
    public void setFallbackAction(String fallbackAction) {
        this.fallbackAction = fallbackAction;
    }

    /**
     * <p>
     * Determines whether to continue with message processing or stop it in
     * cases where communication with a processor fails. If a processor has a
     * fallback action of <code>ABORT</code> and communication with it fails,
     * the processor sets the message status to <code>FAILED</code> and does not
     * send the message to any recipients. Note that if the last processor in
     * the channel flow sequence has a fallback action of <code>CONTINUE</code>
     * and communication with the processor fails, then the message is
     * considered processed and sent to recipients of the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUE, ABORT
     *
     * @param fallbackAction <p>
     *            Determines whether to continue with message processing or stop
     *            it in cases where communication with a processor fails. If a
     *            processor has a fallback action of <code>ABORT</code> and
     *            communication with it fails, the processor sets the message
     *            status to <code>FAILED</code> and does not send the message to
     *            any recipients. Note that if the last processor in the channel
     *            flow sequence has a fallback action of <code>CONTINUE</code>
     *            and communication with the processor fails, then the message
     *            is considered processed and sent to recipients of the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FallbackAction
     */
    public Processor withFallbackAction(String fallbackAction) {
        this.fallbackAction = fallbackAction;
        return this;
    }

    /**
     * <p>
     * Determines whether to continue with message processing or stop it in
     * cases where communication with a processor fails. If a processor has a
     * fallback action of <code>ABORT</code> and communication with it fails,
     * the processor sets the message status to <code>FAILED</code> and does not
     * send the message to any recipients. Note that if the last processor in
     * the channel flow sequence has a fallback action of <code>CONTINUE</code>
     * and communication with the processor fails, then the message is
     * considered processed and sent to recipients of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUE, ABORT
     *
     * @param fallbackAction <p>
     *            Determines whether to continue with message processing or stop
     *            it in cases where communication with a processor fails. If a
     *            processor has a fallback action of <code>ABORT</code> and
     *            communication with it fails, the processor sets the message
     *            status to <code>FAILED</code> and does not send the message to
     *            any recipients. Note that if the last processor in the channel
     *            flow sequence has a fallback action of <code>CONTINUE</code>
     *            and communication with the processor fails, then the message
     *            is considered processed and sent to recipients of the channel.
     *            </p>
     * @see FallbackAction
     */
    public void setFallbackAction(FallbackAction fallbackAction) {
        this.fallbackAction = fallbackAction.toString();
    }

    /**
     * <p>
     * Determines whether to continue with message processing or stop it in
     * cases where communication with a processor fails. If a processor has a
     * fallback action of <code>ABORT</code> and communication with it fails,
     * the processor sets the message status to <code>FAILED</code> and does not
     * send the message to any recipients. Note that if the last processor in
     * the channel flow sequence has a fallback action of <code>CONTINUE</code>
     * and communication with the processor fails, then the message is
     * considered processed and sent to recipients of the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUE, ABORT
     *
     * @param fallbackAction <p>
     *            Determines whether to continue with message processing or stop
     *            it in cases where communication with a processor fails. If a
     *            processor has a fallback action of <code>ABORT</code> and
     *            communication with it fails, the processor sets the message
     *            status to <code>FAILED</code> and does not send the message to
     *            any recipients. Note that if the last processor in the channel
     *            flow sequence has a fallback action of <code>CONTINUE</code>
     *            and communication with the processor fails, then the message
     *            is considered processed and sent to recipients of the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FallbackAction
     */
    public Processor withFallbackAction(FallbackAction fallbackAction) {
        this.fallbackAction = fallbackAction.toString();
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getConfiguration() != null)
            sb.append("Configuration: " + getConfiguration() + ",");
        if (getExecutionOrder() != null)
            sb.append("ExecutionOrder: " + getExecutionOrder() + ",");
        if (getFallbackAction() != null)
            sb.append("FallbackAction: " + getFallbackAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionOrder() == null) ? 0 : getExecutionOrder().hashCode());
        hashCode = prime * hashCode
                + ((getFallbackAction() == null) ? 0 : getFallbackAction().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Processor == false)
            return false;
        Processor other = (Processor) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null
                && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getExecutionOrder() == null ^ this.getExecutionOrder() == null)
            return false;
        if (other.getExecutionOrder() != null
                && other.getExecutionOrder().equals(this.getExecutionOrder()) == false)
            return false;
        if (other.getFallbackAction() == null ^ this.getFallbackAction() == null)
            return false;
        if (other.getFallbackAction() != null
                && other.getFallbackAction().equals(this.getFallbackAction()) == false)
            return false;
        return true;
    }
}
