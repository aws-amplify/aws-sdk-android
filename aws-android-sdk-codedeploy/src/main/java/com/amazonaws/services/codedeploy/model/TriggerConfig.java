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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about notification triggers for the deployment group.
 * </p>
 */
public class TriggerConfig implements Serializable {
    /**
     * <p>
     * The name of the notification trigger.
     * </p>
     */
    private String triggerName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * topic through which notifications about deployment or instance events are
     * sent.
     * </p>
     */
    private String triggerTargetArn;

    /**
     * <p>
     * The event type or types for which notifications are triggered.
     * </p>
     */
    private java.util.List<String> triggerEvents;

    /**
     * <p>
     * The name of the notification trigger.
     * </p>
     *
     * @return <p>
     *         The name of the notification trigger.
     *         </p>
     */
    public String getTriggerName() {
        return triggerName;
    }

    /**
     * <p>
     * The name of the notification trigger.
     * </p>
     *
     * @param triggerName <p>
     *            The name of the notification trigger.
     *            </p>
     */
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    /**
     * <p>
     * The name of the notification trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggerName <p>
     *            The name of the notification trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TriggerConfig withTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * topic through which notifications about deployment or instance events are
     * sent.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service topic through which notifications about deployment or
     *         instance events are sent.
     *         </p>
     */
    public String getTriggerTargetArn() {
        return triggerTargetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * topic through which notifications about deployment or instance events are
     * sent.
     * </p>
     *
     * @param triggerTargetArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon Simple
     *            Notification Service topic through which notifications about
     *            deployment or instance events are sent.
     *            </p>
     */
    public void setTriggerTargetArn(String triggerTargetArn) {
        this.triggerTargetArn = triggerTargetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * topic through which notifications about deployment or instance events are
     * sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggerTargetArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon Simple
     *            Notification Service topic through which notifications about
     *            deployment or instance events are sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TriggerConfig withTriggerTargetArn(String triggerTargetArn) {
        this.triggerTargetArn = triggerTargetArn;
        return this;
    }

    /**
     * <p>
     * The event type or types for which notifications are triggered.
     * </p>
     *
     * @return <p>
     *         The event type or types for which notifications are triggered.
     *         </p>
     */
    public java.util.List<String> getTriggerEvents() {
        return triggerEvents;
    }

    /**
     * <p>
     * The event type or types for which notifications are triggered.
     * </p>
     *
     * @param triggerEvents <p>
     *            The event type or types for which notifications are triggered.
     *            </p>
     */
    public void setTriggerEvents(java.util.Collection<String> triggerEvents) {
        if (triggerEvents == null) {
            this.triggerEvents = null;
            return;
        }

        this.triggerEvents = new java.util.ArrayList<String>(triggerEvents);
    }

    /**
     * <p>
     * The event type or types for which notifications are triggered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggerEvents <p>
     *            The event type or types for which notifications are triggered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TriggerConfig withTriggerEvents(String... triggerEvents) {
        if (getTriggerEvents() == null) {
            this.triggerEvents = new java.util.ArrayList<String>(triggerEvents.length);
        }
        for (String value : triggerEvents) {
            this.triggerEvents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The event type or types for which notifications are triggered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggerEvents <p>
     *            The event type or types for which notifications are triggered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TriggerConfig withTriggerEvents(java.util.Collection<String> triggerEvents) {
        setTriggerEvents(triggerEvents);
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
        if (getTriggerName() != null)
            sb.append("triggerName: " + getTriggerName() + ",");
        if (getTriggerTargetArn() != null)
            sb.append("triggerTargetArn: " + getTriggerTargetArn() + ",");
        if (getTriggerEvents() != null)
            sb.append("triggerEvents: " + getTriggerEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTriggerName() == null) ? 0 : getTriggerName().hashCode());
        hashCode = prime * hashCode
                + ((getTriggerTargetArn() == null) ? 0 : getTriggerTargetArn().hashCode());
        hashCode = prime * hashCode
                + ((getTriggerEvents() == null) ? 0 : getTriggerEvents().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TriggerConfig == false)
            return false;
        TriggerConfig other = (TriggerConfig) obj;

        if (other.getTriggerName() == null ^ this.getTriggerName() == null)
            return false;
        if (other.getTriggerName() != null
                && other.getTriggerName().equals(this.getTriggerName()) == false)
            return false;
        if (other.getTriggerTargetArn() == null ^ this.getTriggerTargetArn() == null)
            return false;
        if (other.getTriggerTargetArn() != null
                && other.getTriggerTargetArn().equals(this.getTriggerTargetArn()) == false)
            return false;
        if (other.getTriggerEvents() == null ^ this.getTriggerEvents() == null)
            return false;
        if (other.getTriggerEvents() != null
                && other.getTriggerEvents().equals(this.getTriggerEvents()) == false)
            return false;
        return true;
    }
}
