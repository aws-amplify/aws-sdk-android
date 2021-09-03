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
 * Sends an input to an IoT Events detector.
 * </p>
 */
public class IotEventsAction implements Serializable {
    /**
     * <p>
     * The name of the IoT Events input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String inputName;

    /**
     * <p>
     * The ID of the message. The default <code>messageId</code> is a new UUID
     * value.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code>, you can't specify a
     * <code>messageId</code>--a new UUID value will be assigned.
     * </p>
     * <p>
     * Assign a value to this property to ensure that only one input (message)
     * with a given <code>messageId</code> will be processed by an IoT Events
     * detector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     */
    private String messageId;

    /**
     * <p>
     * Whether to process the event actions as a batch. The default value is
     * <code>false</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code>, you can't specify a
     * <code>messageId</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code> and the rule SQL
     * statement evaluates to an Array, each Array element is treated as a
     * separate message when it's sent to IoT Events by calling <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html"
     * > <code>BatchPutMessage</code> </a>. The resulting array can't have more
     * than 10 messages.
     * </p>
     */
    private Boolean batchMode;

    /**
     * <p>
     * The ARN of the role that grants IoT permission to send an input to an IoT
     * Events detector. ("Action":"iotevents:BatchPutMessage").
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the IoT Events input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The name of the IoT Events input.
     *         </p>
     */
    public String getInputName() {
        return inputName;
    }

    /**
     * <p>
     * The name of the IoT Events input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param inputName <p>
     *            The name of the IoT Events input.
     *            </p>
     */
    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    /**
     * <p>
     * The name of the IoT Events input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param inputName <p>
     *            The name of the IoT Events input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotEventsAction withInputName(String inputName) {
        this.inputName = inputName;
        return this;
    }

    /**
     * <p>
     * The ID of the message. The default <code>messageId</code> is a new UUID
     * value.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code>, you can't specify a
     * <code>messageId</code>--a new UUID value will be assigned.
     * </p>
     * <p>
     * Assign a value to this property to ensure that only one input (message)
     * with a given <code>messageId</code> will be processed by an IoT Events
     * detector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @return <p>
     *         The ID of the message. The default <code>messageId</code> is a
     *         new UUID value.
     *         </p>
     *         <p>
     *         When <code>batchMode</code> is <code>true</code>, you can't
     *         specify a <code>messageId</code>--a new UUID value will be
     *         assigned.
     *         </p>
     *         <p>
     *         Assign a value to this property to ensure that only one input
     *         (message) with a given <code>messageId</code> will be processed
     *         by an IoT Events detector.
     *         </p>
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * <p>
     * The ID of the message. The default <code>messageId</code> is a new UUID
     * value.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code>, you can't specify a
     * <code>messageId</code>--a new UUID value will be assigned.
     * </p>
     * <p>
     * Assign a value to this property to ensure that only one input (message)
     * with a given <code>messageId</code> will be processed by an IoT Events
     * detector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param messageId <p>
     *            The ID of the message. The default <code>messageId</code> is a
     *            new UUID value.
     *            </p>
     *            <p>
     *            When <code>batchMode</code> is <code>true</code>, you can't
     *            specify a <code>messageId</code>--a new UUID value will be
     *            assigned.
     *            </p>
     *            <p>
     *            Assign a value to this property to ensure that only one input
     *            (message) with a given <code>messageId</code> will be
     *            processed by an IoT Events detector.
     *            </p>
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The ID of the message. The default <code>messageId</code> is a new UUID
     * value.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code>, you can't specify a
     * <code>messageId</code>--a new UUID value will be assigned.
     * </p>
     * <p>
     * Assign a value to this property to ensure that only one input (message)
     * with a given <code>messageId</code> will be processed by an IoT Events
     * detector.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param messageId <p>
     *            The ID of the message. The default <code>messageId</code> is a
     *            new UUID value.
     *            </p>
     *            <p>
     *            When <code>batchMode</code> is <code>true</code>, you can't
     *            specify a <code>messageId</code>--a new UUID value will be
     *            assigned.
     *            </p>
     *            <p>
     *            Assign a value to this property to ensure that only one input
     *            (message) with a given <code>messageId</code> will be
     *            processed by an IoT Events detector.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotEventsAction withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * <p>
     * Whether to process the event actions as a batch. The default value is
     * <code>false</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code>, you can't specify a
     * <code>messageId</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code> and the rule SQL
     * statement evaluates to an Array, each Array element is treated as a
     * separate message when it's sent to IoT Events by calling <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html"
     * > <code>BatchPutMessage</code> </a>. The resulting array can't have more
     * than 10 messages.
     * </p>
     *
     * @return <p>
     *         Whether to process the event actions as a batch. The default
     *         value is <code>false</code>.
     *         </p>
     *         <p>
     *         When <code>batchMode</code> is <code>true</code>, you can't
     *         specify a <code>messageId</code>.
     *         </p>
     *         <p>
     *         When <code>batchMode</code> is <code>true</code> and the rule SQL
     *         statement evaluates to an Array, each Array element is treated as
     *         a separate message when it's sent to IoT Events by calling <a
     *         href=
     *         "https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html"
     *         > <code>BatchPutMessage</code> </a>. The resulting array can't
     *         have more than 10 messages.
     *         </p>
     */
    public Boolean isBatchMode() {
        return batchMode;
    }

    /**
     * <p>
     * Whether to process the event actions as a batch. The default value is
     * <code>false</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code>, you can't specify a
     * <code>messageId</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code> and the rule SQL
     * statement evaluates to an Array, each Array element is treated as a
     * separate message when it's sent to IoT Events by calling <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html"
     * > <code>BatchPutMessage</code> </a>. The resulting array can't have more
     * than 10 messages.
     * </p>
     *
     * @return <p>
     *         Whether to process the event actions as a batch. The default
     *         value is <code>false</code>.
     *         </p>
     *         <p>
     *         When <code>batchMode</code> is <code>true</code>, you can't
     *         specify a <code>messageId</code>.
     *         </p>
     *         <p>
     *         When <code>batchMode</code> is <code>true</code> and the rule SQL
     *         statement evaluates to an Array, each Array element is treated as
     *         a separate message when it's sent to IoT Events by calling <a
     *         href=
     *         "https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html"
     *         > <code>BatchPutMessage</code> </a>. The resulting array can't
     *         have more than 10 messages.
     *         </p>
     */
    public Boolean getBatchMode() {
        return batchMode;
    }

    /**
     * <p>
     * Whether to process the event actions as a batch. The default value is
     * <code>false</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code>, you can't specify a
     * <code>messageId</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code> and the rule SQL
     * statement evaluates to an Array, each Array element is treated as a
     * separate message when it's sent to IoT Events by calling <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html"
     * > <code>BatchPutMessage</code> </a>. The resulting array can't have more
     * than 10 messages.
     * </p>
     *
     * @param batchMode <p>
     *            Whether to process the event actions as a batch. The default
     *            value is <code>false</code>.
     *            </p>
     *            <p>
     *            When <code>batchMode</code> is <code>true</code>, you can't
     *            specify a <code>messageId</code>.
     *            </p>
     *            <p>
     *            When <code>batchMode</code> is <code>true</code> and the rule
     *            SQL statement evaluates to an Array, each Array element is
     *            treated as a separate message when it's sent to IoT Events by
     *            calling <a href=
     *            "https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html"
     *            > <code>BatchPutMessage</code> </a>. The resulting array can't
     *            have more than 10 messages.
     *            </p>
     */
    public void setBatchMode(Boolean batchMode) {
        this.batchMode = batchMode;
    }

    /**
     * <p>
     * Whether to process the event actions as a batch. The default value is
     * <code>false</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code>, you can't specify a
     * <code>messageId</code>.
     * </p>
     * <p>
     * When <code>batchMode</code> is <code>true</code> and the rule SQL
     * statement evaluates to an Array, each Array element is treated as a
     * separate message when it's sent to IoT Events by calling <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html"
     * > <code>BatchPutMessage</code> </a>. The resulting array can't have more
     * than 10 messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param batchMode <p>
     *            Whether to process the event actions as a batch. The default
     *            value is <code>false</code>.
     *            </p>
     *            <p>
     *            When <code>batchMode</code> is <code>true</code>, you can't
     *            specify a <code>messageId</code>.
     *            </p>
     *            <p>
     *            When <code>batchMode</code> is <code>true</code> and the rule
     *            SQL statement evaluates to an Array, each Array element is
     *            treated as a separate message when it's sent to IoT Events by
     *            calling <a href=
     *            "https://docs.aws.amazon.com/iotevents/latest/apireference/API_iotevents-data_BatchPutMessage.html"
     *            > <code>BatchPutMessage</code> </a>. The resulting array can't
     *            have more than 10 messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotEventsAction withBatchMode(Boolean batchMode) {
        this.batchMode = batchMode;
        return this;
    }

    /**
     * <p>
     * The ARN of the role that grants IoT permission to send an input to an IoT
     * Events detector. ("Action":"iotevents:BatchPutMessage").
     * </p>
     *
     * @return <p>
     *         The ARN of the role that grants IoT permission to send an input
     *         to an IoT Events detector.
     *         ("Action":"iotevents:BatchPutMessage").
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants IoT permission to send an input to an IoT
     * Events detector. ("Action":"iotevents:BatchPutMessage").
     * </p>
     *
     * @param roleArn <p>
     *            The ARN of the role that grants IoT permission to send an
     *            input to an IoT Events detector.
     *            ("Action":"iotevents:BatchPutMessage").
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants IoT permission to send an input to an IoT
     * Events detector. ("Action":"iotevents:BatchPutMessage").
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The ARN of the role that grants IoT permission to send an
     *            input to an IoT Events detector.
     *            ("Action":"iotevents:BatchPutMessage").
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IotEventsAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getInputName() != null)
            sb.append("inputName: " + getInputName() + ",");
        if (getMessageId() != null)
            sb.append("messageId: " + getMessageId() + ",");
        if (getBatchMode() != null)
            sb.append("batchMode: " + getBatchMode() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputName() == null) ? 0 : getInputName().hashCode());
        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getBatchMode() == null) ? 0 : getBatchMode().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IotEventsAction == false)
            return false;
        IotEventsAction other = (IotEventsAction) obj;

        if (other.getInputName() == null ^ this.getInputName() == null)
            return false;
        if (other.getInputName() != null
                && other.getInputName().equals(this.getInputName()) == false)
            return false;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null
                && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getBatchMode() == null ^ this.getBatchMode() == null)
            return false;
        if (other.getBatchMode() != null
                && other.getBatchMode().equals(this.getBatchMode()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
