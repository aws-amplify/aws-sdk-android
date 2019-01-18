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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Generates and sends a bounce message to the sender of an email you received
 * through Amazon SES. You can only use this API on an email up to 24 hours
 * after you receive it.
 * </p>
 * <note>
 * <p>
 * You cannot use this API to send generic bounces for mail that was not
 * received by Amazon SES.
 * </p>
 * </note>
 * <p>
 * For information about receiving email through Amazon SES, see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 */
public class SendBounceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The message ID of the message to be bounced.
     * </p>
     */
    private String originalMessageId;

    /**
     * <p>
     * The address to use in the "From" header of the bounce message. This must
     * be an identity that you have verified with Amazon SES.
     * </p>
     */
    private String bounceSender;

    /**
     * <p>
     * Human-readable text for the bounce message to explain the failure. If not
     * specified, the text will be auto-generated based on the bounced recipient
     * information.
     * </p>
     */
    private String explanation;

    /**
     * <p>
     * Message-related DSN fields. If not specified, Amazon SES will choose the
     * values.
     * </p>
     */
    private MessageDsn messageDsn;

    /**
     * <p>
     * A list of recipients of the bounced message, including the information
     * required to create the Delivery Status Notifications (DSNs) for the
     * recipients. You must specify at least one
     * <code>BouncedRecipientInfo</code> in the list.
     * </p>
     */
    private java.util.List<BouncedRecipientInfo> bouncedRecipientInfoList = new java.util.ArrayList<BouncedRecipientInfo>();

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to use the address in the "From" header of the bounce.
     * For more information about sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     */
    private String bounceSenderArn;

    /**
     * <p>
     * The message ID of the message to be bounced.
     * </p>
     *
     * @return <p>
     *         The message ID of the message to be bounced.
     *         </p>
     */
    public String getOriginalMessageId() {
        return originalMessageId;
    }

    /**
     * <p>
     * The message ID of the message to be bounced.
     * </p>
     *
     * @param originalMessageId <p>
     *            The message ID of the message to be bounced.
     *            </p>
     */
    public void setOriginalMessageId(String originalMessageId) {
        this.originalMessageId = originalMessageId;
    }

    /**
     * <p>
     * The message ID of the message to be bounced.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param originalMessageId <p>
     *            The message ID of the message to be bounced.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendBounceRequest withOriginalMessageId(String originalMessageId) {
        this.originalMessageId = originalMessageId;
        return this;
    }

    /**
     * <p>
     * The address to use in the "From" header of the bounce message. This must
     * be an identity that you have verified with Amazon SES.
     * </p>
     *
     * @return <p>
     *         The address to use in the "From" header of the bounce message.
     *         This must be an identity that you have verified with Amazon SES.
     *         </p>
     */
    public String getBounceSender() {
        return bounceSender;
    }

    /**
     * <p>
     * The address to use in the "From" header of the bounce message. This must
     * be an identity that you have verified with Amazon SES.
     * </p>
     *
     * @param bounceSender <p>
     *            The address to use in the "From" header of the bounce message.
     *            This must be an identity that you have verified with Amazon
     *            SES.
     *            </p>
     */
    public void setBounceSender(String bounceSender) {
        this.bounceSender = bounceSender;
    }

    /**
     * <p>
     * The address to use in the "From" header of the bounce message. This must
     * be an identity that you have verified with Amazon SES.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bounceSender <p>
     *            The address to use in the "From" header of the bounce message.
     *            This must be an identity that you have verified with Amazon
     *            SES.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendBounceRequest withBounceSender(String bounceSender) {
        this.bounceSender = bounceSender;
        return this;
    }

    /**
     * <p>
     * Human-readable text for the bounce message to explain the failure. If not
     * specified, the text will be auto-generated based on the bounced recipient
     * information.
     * </p>
     *
     * @return <p>
     *         Human-readable text for the bounce message to explain the
     *         failure. If not specified, the text will be auto-generated based
     *         on the bounced recipient information.
     *         </p>
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * <p>
     * Human-readable text for the bounce message to explain the failure. If not
     * specified, the text will be auto-generated based on the bounced recipient
     * information.
     * </p>
     *
     * @param explanation <p>
     *            Human-readable text for the bounce message to explain the
     *            failure. If not specified, the text will be auto-generated
     *            based on the bounced recipient information.
     *            </p>
     */
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    /**
     * <p>
     * Human-readable text for the bounce message to explain the failure. If not
     * specified, the text will be auto-generated based on the bounced recipient
     * information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param explanation <p>
     *            Human-readable text for the bounce message to explain the
     *            failure. If not specified, the text will be auto-generated
     *            based on the bounced recipient information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendBounceRequest withExplanation(String explanation) {
        this.explanation = explanation;
        return this;
    }

    /**
     * <p>
     * Message-related DSN fields. If not specified, Amazon SES will choose the
     * values.
     * </p>
     *
     * @return <p>
     *         Message-related DSN fields. If not specified, Amazon SES will
     *         choose the values.
     *         </p>
     */
    public MessageDsn getMessageDsn() {
        return messageDsn;
    }

    /**
     * <p>
     * Message-related DSN fields. If not specified, Amazon SES will choose the
     * values.
     * </p>
     *
     * @param messageDsn <p>
     *            Message-related DSN fields. If not specified, Amazon SES will
     *            choose the values.
     *            </p>
     */
    public void setMessageDsn(MessageDsn messageDsn) {
        this.messageDsn = messageDsn;
    }

    /**
     * <p>
     * Message-related DSN fields. If not specified, Amazon SES will choose the
     * values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageDsn <p>
     *            Message-related DSN fields. If not specified, Amazon SES will
     *            choose the values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendBounceRequest withMessageDsn(MessageDsn messageDsn) {
        this.messageDsn = messageDsn;
        return this;
    }

    /**
     * <p>
     * A list of recipients of the bounced message, including the information
     * required to create the Delivery Status Notifications (DSNs) for the
     * recipients. You must specify at least one
     * <code>BouncedRecipientInfo</code> in the list.
     * </p>
     *
     * @return <p>
     *         A list of recipients of the bounced message, including the
     *         information required to create the Delivery Status Notifications
     *         (DSNs) for the recipients. You must specify at least one
     *         <code>BouncedRecipientInfo</code> in the list.
     *         </p>
     */
    public java.util.List<BouncedRecipientInfo> getBouncedRecipientInfoList() {
        return bouncedRecipientInfoList;
    }

    /**
     * <p>
     * A list of recipients of the bounced message, including the information
     * required to create the Delivery Status Notifications (DSNs) for the
     * recipients. You must specify at least one
     * <code>BouncedRecipientInfo</code> in the list.
     * </p>
     *
     * @param bouncedRecipientInfoList <p>
     *            A list of recipients of the bounced message, including the
     *            information required to create the Delivery Status
     *            Notifications (DSNs) for the recipients. You must specify at
     *            least one <code>BouncedRecipientInfo</code> in the list.
     *            </p>
     */
    public void setBouncedRecipientInfoList(
            java.util.Collection<BouncedRecipientInfo> bouncedRecipientInfoList) {
        if (bouncedRecipientInfoList == null) {
            this.bouncedRecipientInfoList = null;
            return;
        }

        this.bouncedRecipientInfoList = new java.util.ArrayList<BouncedRecipientInfo>(
                bouncedRecipientInfoList);
    }

    /**
     * <p>
     * A list of recipients of the bounced message, including the information
     * required to create the Delivery Status Notifications (DSNs) for the
     * recipients. You must specify at least one
     * <code>BouncedRecipientInfo</code> in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bouncedRecipientInfoList <p>
     *            A list of recipients of the bounced message, including the
     *            information required to create the Delivery Status
     *            Notifications (DSNs) for the recipients. You must specify at
     *            least one <code>BouncedRecipientInfo</code> in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendBounceRequest withBouncedRecipientInfoList(
            BouncedRecipientInfo... bouncedRecipientInfoList) {
        if (getBouncedRecipientInfoList() == null) {
            this.bouncedRecipientInfoList = new java.util.ArrayList<BouncedRecipientInfo>(
                    bouncedRecipientInfoList.length);
        }
        for (BouncedRecipientInfo value : bouncedRecipientInfoList) {
            this.bouncedRecipientInfoList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of recipients of the bounced message, including the information
     * required to create the Delivery Status Notifications (DSNs) for the
     * recipients. You must specify at least one
     * <code>BouncedRecipientInfo</code> in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bouncedRecipientInfoList <p>
     *            A list of recipients of the bounced message, including the
     *            information required to create the Delivery Status
     *            Notifications (DSNs) for the recipients. You must specify at
     *            least one <code>BouncedRecipientInfo</code> in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendBounceRequest withBouncedRecipientInfoList(
            java.util.Collection<BouncedRecipientInfo> bouncedRecipientInfoList) {
        setBouncedRecipientInfoList(bouncedRecipientInfoList);
        return this;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to use the address in the "From" header of the bounce.
     * For more information about sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     *
     * @return <p>
     *         This parameter is used only for sending authorization. It is the
     *         ARN of the identity that is associated with the sending
     *         authorization policy that permits you to use the address in the
     *         "From" header of the bounce. For more information about sending
     *         authorization, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *         >Amazon SES Developer Guide</a>.
     *         </p>
     */
    public String getBounceSenderArn() {
        return bounceSenderArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to use the address in the "From" header of the bounce.
     * For more information about sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     *
     * @param bounceSenderArn <p>
     *            This parameter is used only for sending authorization. It is
     *            the ARN of the identity that is associated with the sending
     *            authorization policy that permits you to use the address in
     *            the "From" header of the bounce. For more information about
     *            sending authorization, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     */
    public void setBounceSenderArn(String bounceSenderArn) {
        this.bounceSenderArn = bounceSenderArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to use the address in the "From" header of the bounce.
     * For more information about sending authorization, see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bounceSenderArn <p>
     *            This parameter is used only for sending authorization. It is
     *            the ARN of the identity that is associated with the sending
     *            authorization policy that permits you to use the address in
     *            the "From" header of the bounce. For more information about
     *            sending authorization, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendBounceRequest withBounceSenderArn(String bounceSenderArn) {
        this.bounceSenderArn = bounceSenderArn;
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
        if (getOriginalMessageId() != null)
            sb.append("OriginalMessageId: " + getOriginalMessageId() + ",");
        if (getBounceSender() != null)
            sb.append("BounceSender: " + getBounceSender() + ",");
        if (getExplanation() != null)
            sb.append("Explanation: " + getExplanation() + ",");
        if (getMessageDsn() != null)
            sb.append("MessageDsn: " + getMessageDsn() + ",");
        if (getBouncedRecipientInfoList() != null)
            sb.append("BouncedRecipientInfoList: " + getBouncedRecipientInfoList() + ",");
        if (getBounceSenderArn() != null)
            sb.append("BounceSenderArn: " + getBounceSenderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOriginalMessageId() == null) ? 0 : getOriginalMessageId().hashCode());
        hashCode = prime * hashCode
                + ((getBounceSender() == null) ? 0 : getBounceSender().hashCode());
        hashCode = prime * hashCode
                + ((getExplanation() == null) ? 0 : getExplanation().hashCode());
        hashCode = prime * hashCode + ((getMessageDsn() == null) ? 0 : getMessageDsn().hashCode());
        hashCode = prime
                * hashCode
                + ((getBouncedRecipientInfoList() == null) ? 0 : getBouncedRecipientInfoList()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getBounceSenderArn() == null) ? 0 : getBounceSenderArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendBounceRequest == false)
            return false;
        SendBounceRequest other = (SendBounceRequest) obj;

        if (other.getOriginalMessageId() == null ^ this.getOriginalMessageId() == null)
            return false;
        if (other.getOriginalMessageId() != null
                && other.getOriginalMessageId().equals(this.getOriginalMessageId()) == false)
            return false;
        if (other.getBounceSender() == null ^ this.getBounceSender() == null)
            return false;
        if (other.getBounceSender() != null
                && other.getBounceSender().equals(this.getBounceSender()) == false)
            return false;
        if (other.getExplanation() == null ^ this.getExplanation() == null)
            return false;
        if (other.getExplanation() != null
                && other.getExplanation().equals(this.getExplanation()) == false)
            return false;
        if (other.getMessageDsn() == null ^ this.getMessageDsn() == null)
            return false;
        if (other.getMessageDsn() != null
                && other.getMessageDsn().equals(this.getMessageDsn()) == false)
            return false;
        if (other.getBouncedRecipientInfoList() == null
                ^ this.getBouncedRecipientInfoList() == null)
            return false;
        if (other.getBouncedRecipientInfoList() != null
                && other.getBouncedRecipientInfoList().equals(this.getBouncedRecipientInfoList()) == false)
            return false;
        if (other.getBounceSenderArn() == null ^ this.getBounceSenderArn() == null)
            return false;
        if (other.getBounceSenderArn() != null
                && other.getBounceSenderArn().equals(this.getBounceSenderArn()) == false)
            return false;
        return true;
    }
}
