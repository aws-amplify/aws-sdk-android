/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains configuration settings for a quick connect.
 * </p>
 */
public class QuickConnectConfig implements Serializable {
    /**
     * <p>
     * The type of quick connect. In the Amazon Connect console, when you create
     * a quick connect, you are prompted to assign one of the following types:
     * Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, QUEUE, PHONE_NUMBER
     */
    private String quickConnectType;

    /**
     * <p>
     * The user configuration. This is required only if QuickConnectType is
     * USER.
     * </p>
     */
    private UserQuickConnectConfig userConfig;

    /**
     * <p>
     * The queue configuration. This is required only if QuickConnectType is
     * QUEUE.
     * </p>
     */
    private QueueQuickConnectConfig queueConfig;

    /**
     * <p>
     * The phone configuration. This is required only if QuickConnectType is
     * PHONE_NUMBER.
     * </p>
     */
    private PhoneNumberQuickConnectConfig phoneConfig;

    /**
     * <p>
     * The type of quick connect. In the Amazon Connect console, when you create
     * a quick connect, you are prompted to assign one of the following types:
     * Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, QUEUE, PHONE_NUMBER
     *
     * @return <p>
     *         The type of quick connect. In the Amazon Connect console, when
     *         you create a quick connect, you are prompted to assign one of the
     *         following types: Agent (USER), External (PHONE_NUMBER), or Queue
     *         (QUEUE).
     *         </p>
     * @see QuickConnectType
     */
    public String getQuickConnectType() {
        return quickConnectType;
    }

    /**
     * <p>
     * The type of quick connect. In the Amazon Connect console, when you create
     * a quick connect, you are prompted to assign one of the following types:
     * Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, QUEUE, PHONE_NUMBER
     *
     * @param quickConnectType <p>
     *            The type of quick connect. In the Amazon Connect console, when
     *            you create a quick connect, you are prompted to assign one of
     *            the following types: Agent (USER), External (PHONE_NUMBER), or
     *            Queue (QUEUE).
     *            </p>
     * @see QuickConnectType
     */
    public void setQuickConnectType(String quickConnectType) {
        this.quickConnectType = quickConnectType;
    }

    /**
     * <p>
     * The type of quick connect. In the Amazon Connect console, when you create
     * a quick connect, you are prompted to assign one of the following types:
     * Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, QUEUE, PHONE_NUMBER
     *
     * @param quickConnectType <p>
     *            The type of quick connect. In the Amazon Connect console, when
     *            you create a quick connect, you are prompted to assign one of
     *            the following types: Agent (USER), External (PHONE_NUMBER), or
     *            Queue (QUEUE).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QuickConnectType
     */
    public QuickConnectConfig withQuickConnectType(String quickConnectType) {
        this.quickConnectType = quickConnectType;
        return this;
    }

    /**
     * <p>
     * The type of quick connect. In the Amazon Connect console, when you create
     * a quick connect, you are prompted to assign one of the following types:
     * Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, QUEUE, PHONE_NUMBER
     *
     * @param quickConnectType <p>
     *            The type of quick connect. In the Amazon Connect console, when
     *            you create a quick connect, you are prompted to assign one of
     *            the following types: Agent (USER), External (PHONE_NUMBER), or
     *            Queue (QUEUE).
     *            </p>
     * @see QuickConnectType
     */
    public void setQuickConnectType(QuickConnectType quickConnectType) {
        this.quickConnectType = quickConnectType.toString();
    }

    /**
     * <p>
     * The type of quick connect. In the Amazon Connect console, when you create
     * a quick connect, you are prompted to assign one of the following types:
     * Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, QUEUE, PHONE_NUMBER
     *
     * @param quickConnectType <p>
     *            The type of quick connect. In the Amazon Connect console, when
     *            you create a quick connect, you are prompted to assign one of
     *            the following types: Agent (USER), External (PHONE_NUMBER), or
     *            Queue (QUEUE).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QuickConnectType
     */
    public QuickConnectConfig withQuickConnectType(QuickConnectType quickConnectType) {
        this.quickConnectType = quickConnectType.toString();
        return this;
    }

    /**
     * <p>
     * The user configuration. This is required only if QuickConnectType is
     * USER.
     * </p>
     *
     * @return <p>
     *         The user configuration. This is required only if QuickConnectType
     *         is USER.
     *         </p>
     */
    public UserQuickConnectConfig getUserConfig() {
        return userConfig;
    }

    /**
     * <p>
     * The user configuration. This is required only if QuickConnectType is
     * USER.
     * </p>
     *
     * @param userConfig <p>
     *            The user configuration. This is required only if
     *            QuickConnectType is USER.
     *            </p>
     */
    public void setUserConfig(UserQuickConnectConfig userConfig) {
        this.userConfig = userConfig;
    }

    /**
     * <p>
     * The user configuration. This is required only if QuickConnectType is
     * USER.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userConfig <p>
     *            The user configuration. This is required only if
     *            QuickConnectType is USER.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QuickConnectConfig withUserConfig(UserQuickConnectConfig userConfig) {
        this.userConfig = userConfig;
        return this;
    }

    /**
     * <p>
     * The queue configuration. This is required only if QuickConnectType is
     * QUEUE.
     * </p>
     *
     * @return <p>
     *         The queue configuration. This is required only if
     *         QuickConnectType is QUEUE.
     *         </p>
     */
    public QueueQuickConnectConfig getQueueConfig() {
        return queueConfig;
    }

    /**
     * <p>
     * The queue configuration. This is required only if QuickConnectType is
     * QUEUE.
     * </p>
     *
     * @param queueConfig <p>
     *            The queue configuration. This is required only if
     *            QuickConnectType is QUEUE.
     *            </p>
     */
    public void setQueueConfig(QueueQuickConnectConfig queueConfig) {
        this.queueConfig = queueConfig;
    }

    /**
     * <p>
     * The queue configuration. This is required only if QuickConnectType is
     * QUEUE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueConfig <p>
     *            The queue configuration. This is required only if
     *            QuickConnectType is QUEUE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QuickConnectConfig withQueueConfig(QueueQuickConnectConfig queueConfig) {
        this.queueConfig = queueConfig;
        return this;
    }

    /**
     * <p>
     * The phone configuration. This is required only if QuickConnectType is
     * PHONE_NUMBER.
     * </p>
     *
     * @return <p>
     *         The phone configuration. This is required only if
     *         QuickConnectType is PHONE_NUMBER.
     *         </p>
     */
    public PhoneNumberQuickConnectConfig getPhoneConfig() {
        return phoneConfig;
    }

    /**
     * <p>
     * The phone configuration. This is required only if QuickConnectType is
     * PHONE_NUMBER.
     * </p>
     *
     * @param phoneConfig <p>
     *            The phone configuration. This is required only if
     *            QuickConnectType is PHONE_NUMBER.
     *            </p>
     */
    public void setPhoneConfig(PhoneNumberQuickConnectConfig phoneConfig) {
        this.phoneConfig = phoneConfig;
    }

    /**
     * <p>
     * The phone configuration. This is required only if QuickConnectType is
     * PHONE_NUMBER.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneConfig <p>
     *            The phone configuration. This is required only if
     *            QuickConnectType is PHONE_NUMBER.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QuickConnectConfig withPhoneConfig(PhoneNumberQuickConnectConfig phoneConfig) {
        this.phoneConfig = phoneConfig;
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
        if (getQuickConnectType() != null)
            sb.append("QuickConnectType: " + getQuickConnectType() + ",");
        if (getUserConfig() != null)
            sb.append("UserConfig: " + getUserConfig() + ",");
        if (getQueueConfig() != null)
            sb.append("QueueConfig: " + getQueueConfig() + ",");
        if (getPhoneConfig() != null)
            sb.append("PhoneConfig: " + getPhoneConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQuickConnectType() == null) ? 0 : getQuickConnectType().hashCode());
        hashCode = prime * hashCode + ((getUserConfig() == null) ? 0 : getUserConfig().hashCode());
        hashCode = prime * hashCode
                + ((getQueueConfig() == null) ? 0 : getQueueConfig().hashCode());
        hashCode = prime * hashCode
                + ((getPhoneConfig() == null) ? 0 : getPhoneConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QuickConnectConfig == false)
            return false;
        QuickConnectConfig other = (QuickConnectConfig) obj;

        if (other.getQuickConnectType() == null ^ this.getQuickConnectType() == null)
            return false;
        if (other.getQuickConnectType() != null
                && other.getQuickConnectType().equals(this.getQuickConnectType()) == false)
            return false;
        if (other.getUserConfig() == null ^ this.getUserConfig() == null)
            return false;
        if (other.getUserConfig() != null
                && other.getUserConfig().equals(this.getUserConfig()) == false)
            return false;
        if (other.getQueueConfig() == null ^ this.getQueueConfig() == null)
            return false;
        if (other.getQueueConfig() != null
                && other.getQueueConfig().equals(this.getQueueConfig()) == false)
            return false;
        if (other.getPhoneConfig() == null ^ this.getPhoneConfig() == null)
            return false;
        if (other.getPhoneConfig() != null
                && other.getPhoneConfig().equals(this.getPhoneConfig()) == false)
            return false;
        return true;
    }
}
