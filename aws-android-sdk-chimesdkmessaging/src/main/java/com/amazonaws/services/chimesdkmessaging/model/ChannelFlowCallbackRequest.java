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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Calls back Chime SDK Messaging with a processing response message. This
 * should be invoked from the processor Lambda. This is a developer API.
 * </p>
 * <p>
 * You can return one of the following processing responses:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Update message content or metadata
 * </p>
 * </li>
 * <li>
 * <p>
 * Deny a message
 * </p>
 * </li>
 * <li>
 * <p>
 * Make no changes to the message
 * </p>
 * </li>
 * </ul>
 */
public class ChannelFlowCallbackRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier passed to the processor by the service when invoked. Use
     * the identifier to call back the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     */
    private String callbackId;

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String channelArn;

    /**
     * <p>
     * When a processor determines that a message needs to be
     * <code>DENIED</code>, pass this parameter with a value of true.
     * </p>
     */
    private Boolean deleteResource;

    /**
     * <p>
     * Stores information about the processed message.
     * </p>
     */
    private ChannelMessageCallback channelMessage;

    /**
     * <p>
     * The identifier passed to the processor by the service when invoked. Use
     * the identifier to call back the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @return <p>
     *         The identifier passed to the processor by the service when
     *         invoked. Use the identifier to call back the service.
     *         </p>
     */
    public String getCallbackId() {
        return callbackId;
    }

    /**
     * <p>
     * The identifier passed to the processor by the service when invoked. Use
     * the identifier to call back the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param callbackId <p>
     *            The identifier passed to the processor by the service when
     *            invoked. Use the identifier to call back the service.
     *            </p>
     */
    public void setCallbackId(String callbackId) {
        this.callbackId = callbackId;
    }

    /**
     * <p>
     * The identifier passed to the processor by the service when invoked. Use
     * the identifier to call back the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param callbackId <p>
     *            The identifier passed to the processor by the service when
     *            invoked. Use the identifier to call back the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelFlowCallbackRequest withCallbackId(String callbackId) {
        this.callbackId = callbackId;
        return this;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the channel.
     *         </p>
     */
    public String getChannelArn() {
        return channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param channelArn <p>
     *            The ARN of the channel.
     *            </p>
     */
    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param channelArn <p>
     *            The ARN of the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelFlowCallbackRequest withChannelArn(String channelArn) {
        this.channelArn = channelArn;
        return this;
    }

    /**
     * <p>
     * When a processor determines that a message needs to be
     * <code>DENIED</code>, pass this parameter with a value of true.
     * </p>
     *
     * @return <p>
     *         When a processor determines that a message needs to be
     *         <code>DENIED</code>, pass this parameter with a value of true.
     *         </p>
     */
    public Boolean isDeleteResource() {
        return deleteResource;
    }

    /**
     * <p>
     * When a processor determines that a message needs to be
     * <code>DENIED</code>, pass this parameter with a value of true.
     * </p>
     *
     * @return <p>
     *         When a processor determines that a message needs to be
     *         <code>DENIED</code>, pass this parameter with a value of true.
     *         </p>
     */
    public Boolean getDeleteResource() {
        return deleteResource;
    }

    /**
     * <p>
     * When a processor determines that a message needs to be
     * <code>DENIED</code>, pass this parameter with a value of true.
     * </p>
     *
     * @param deleteResource <p>
     *            When a processor determines that a message needs to be
     *            <code>DENIED</code>, pass this parameter with a value of true.
     *            </p>
     */
    public void setDeleteResource(Boolean deleteResource) {
        this.deleteResource = deleteResource;
    }

    /**
     * <p>
     * When a processor determines that a message needs to be
     * <code>DENIED</code>, pass this parameter with a value of true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteResource <p>
     *            When a processor determines that a message needs to be
     *            <code>DENIED</code>, pass this parameter with a value of true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelFlowCallbackRequest withDeleteResource(Boolean deleteResource) {
        this.deleteResource = deleteResource;
        return this;
    }

    /**
     * <p>
     * Stores information about the processed message.
     * </p>
     *
     * @return <p>
     *         Stores information about the processed message.
     *         </p>
     */
    public ChannelMessageCallback getChannelMessage() {
        return channelMessage;
    }

    /**
     * <p>
     * Stores information about the processed message.
     * </p>
     *
     * @param channelMessage <p>
     *            Stores information about the processed message.
     *            </p>
     */
    public void setChannelMessage(ChannelMessageCallback channelMessage) {
        this.channelMessage = channelMessage;
    }

    /**
     * <p>
     * Stores information about the processed message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelMessage <p>
     *            Stores information about the processed message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelFlowCallbackRequest withChannelMessage(ChannelMessageCallback channelMessage) {
        this.channelMessage = channelMessage;
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
        if (getCallbackId() != null)
            sb.append("CallbackId: " + getCallbackId() + ",");
        if (getChannelArn() != null)
            sb.append("ChannelArn: " + getChannelArn() + ",");
        if (getDeleteResource() != null)
            sb.append("DeleteResource: " + getDeleteResource() + ",");
        if (getChannelMessage() != null)
            sb.append("ChannelMessage: " + getChannelMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallbackId() == null) ? 0 : getCallbackId().hashCode());
        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode
                + ((getDeleteResource() == null) ? 0 : getDeleteResource().hashCode());
        hashCode = prime * hashCode
                + ((getChannelMessage() == null) ? 0 : getChannelMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelFlowCallbackRequest == false)
            return false;
        ChannelFlowCallbackRequest other = (ChannelFlowCallbackRequest) obj;

        if (other.getCallbackId() == null ^ this.getCallbackId() == null)
            return false;
        if (other.getCallbackId() != null
                && other.getCallbackId().equals(this.getCallbackId()) == false)
            return false;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null
                && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getDeleteResource() == null ^ this.getDeleteResource() == null)
            return false;
        if (other.getDeleteResource() != null
                && other.getDeleteResource().equals(this.getDeleteResource()) == false)
            return false;
        if (other.getChannelMessage() == null ^ this.getChannelMessage() == null)
            return false;
        if (other.getChannelMessage() != null
                && other.getChannelMessage().equals(this.getChannelMessage()) == false)
            return false;
        return true;
    }
}
