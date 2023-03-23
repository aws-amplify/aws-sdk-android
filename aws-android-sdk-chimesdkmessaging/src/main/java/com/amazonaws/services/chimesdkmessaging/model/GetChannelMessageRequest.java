/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Gets the full details of a channel message.
 * </p>
 * <note>
 * <p>
 * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the ARN
 * of the <code>AppInstanceUser</code> or <code>AppInstanceBot</code> that makes
 * the API call as the value in the header.
 * </p>
 * </note>
 */
public class GetChannelMessageRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The ID of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     */
    private String messageId;

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code> or
     * <code>AppInstanceBot</code> that makes the API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String chimeBearer;

    /**
     * <p>
     * The ID of the SubChannel in the request.
     * </p>
     * <note>
     * <p>
     * Only required when getting messages in a SubChannel that the user belongs
     * to.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     */
    private String subChannelId;

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
    public GetChannelMessageRequest withChannelArn(String channelArn) {
        this.channelArn = channelArn;
        return this;
    }

    /**
     * <p>
     * The ID of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The ID of the message.
     *         </p>
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * <p>
     * The ID of the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param messageId <p>
     *            The ID of the message.
     *            </p>
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The ID of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param messageId <p>
     *            The ID of the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetChannelMessageRequest withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code> or
     * <code>AppInstanceBot</code> that makes the API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the <code>AppInstanceUser</code> or
     *         <code>AppInstanceBot</code> that makes the API call.
     *         </p>
     */
    public String getChimeBearer() {
        return chimeBearer;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code> or
     * <code>AppInstanceBot</code> that makes the API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param chimeBearer <p>
     *            The ARN of the <code>AppInstanceUser</code> or
     *            <code>AppInstanceBot</code> that makes the API call.
     *            </p>
     */
    public void setChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code> or
     * <code>AppInstanceBot</code> that makes the API call.
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
     * @param chimeBearer <p>
     *            The ARN of the <code>AppInstanceUser</code> or
     *            <code>AppInstanceBot</code> that makes the API call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetChannelMessageRequest withChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
        return this;
    }

    /**
     * <p>
     * The ID of the SubChannel in the request.
     * </p>
     * <note>
     * <p>
     * Only required when getting messages in a SubChannel that the user belongs
     * to.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The ID of the SubChannel in the request.
     *         </p>
     *         <note>
     *         <p>
     *         Only required when getting messages in a SubChannel that the user
     *         belongs to.
     *         </p>
     *         </note>
     */
    public String getSubChannelId() {
        return subChannelId;
    }

    /**
     * <p>
     * The ID of the SubChannel in the request.
     * </p>
     * <note>
     * <p>
     * Only required when getting messages in a SubChannel that the user belongs
     * to.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param subChannelId <p>
     *            The ID of the SubChannel in the request.
     *            </p>
     *            <note>
     *            <p>
     *            Only required when getting messages in a SubChannel that the
     *            user belongs to.
     *            </p>
     *            </note>
     */
    public void setSubChannelId(String subChannelId) {
        this.subChannelId = subChannelId;
    }

    /**
     * <p>
     * The ID of the SubChannel in the request.
     * </p>
     * <note>
     * <p>
     * Only required when getting messages in a SubChannel that the user belongs
     * to.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param subChannelId <p>
     *            The ID of the SubChannel in the request.
     *            </p>
     *            <note>
     *            <p>
     *            Only required when getting messages in a SubChannel that the
     *            user belongs to.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetChannelMessageRequest withSubChannelId(String subChannelId) {
        this.subChannelId = subChannelId;
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: " + getChannelArn() + ",");
        if (getMessageId() != null)
            sb.append("MessageId: " + getMessageId() + ",");
        if (getChimeBearer() != null)
            sb.append("ChimeBearer: " + getChimeBearer() + ",");
        if (getSubChannelId() != null)
            sb.append("SubChannelId: " + getSubChannelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode
                + ((getChimeBearer() == null) ? 0 : getChimeBearer().hashCode());
        hashCode = prime * hashCode
                + ((getSubChannelId() == null) ? 0 : getSubChannelId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetChannelMessageRequest == false)
            return false;
        GetChannelMessageRequest other = (GetChannelMessageRequest) obj;

        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null
                && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null
                && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getChimeBearer() == null ^ this.getChimeBearer() == null)
            return false;
        if (other.getChimeBearer() != null
                && other.getChimeBearer().equals(this.getChimeBearer()) == false)
            return false;
        if (other.getSubChannelId() == null ^ this.getSubChannelId() == null)
            return false;
        if (other.getSubChannelId() != null
                && other.getSubChannelId().equals(this.getSubChannelId()) == false)
            return false;
        return true;
    }
}
