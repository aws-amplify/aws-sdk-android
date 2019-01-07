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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The notify configuration type.
 * </p>
 */
public class NotifyConfigurationType implements Serializable {
    /**
     * <p>
     * The email address that is sending the email. It must be either
     * individually verified with Amazon SES, or from a domain that has been
     * verified with Amazon SES.
     * </p>
     */
    private String from;

    /**
     * <p>
     * The destination to which the receiver of an email should reply to.
     * </p>
     */
    private String replyTo;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity that is associated with
     * the sending authorization policy. It permits Amazon Cognito to send for
     * the email address specified in the <code>From</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String sourceArn;

    /**
     * <p>
     * Email template used when a detected risk event is blocked.
     * </p>
     */
    private NotifyEmailType blockEmail;

    /**
     * <p>
     * The email template used when a detected risk event is allowed.
     * </p>
     */
    private NotifyEmailType noActionEmail;

    /**
     * <p>
     * The MFA email template used when MFA is challenged as part of a detected
     * risk.
     * </p>
     */
    private NotifyEmailType mfaEmail;

    /**
     * <p>
     * The email address that is sending the email. It must be either
     * individually verified with Amazon SES, or from a domain that has been
     * verified with Amazon SES.
     * </p>
     *
     * @return <p>
     *         The email address that is sending the email. It must be either
     *         individually verified with Amazon SES, or from a domain that has
     *         been verified with Amazon SES.
     *         </p>
     */
    public String getFrom() {
        return from;
    }

    /**
     * <p>
     * The email address that is sending the email. It must be either
     * individually verified with Amazon SES, or from a domain that has been
     * verified with Amazon SES.
     * </p>
     *
     * @param from <p>
     *            The email address that is sending the email. It must be either
     *            individually verified with Amazon SES, or from a domain that
     *            has been verified with Amazon SES.
     *            </p>
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * <p>
     * The email address that is sending the email. It must be either
     * individually verified with Amazon SES, or from a domain that has been
     * verified with Amazon SES.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param from <p>
     *            The email address that is sending the email. It must be either
     *            individually verified with Amazon SES, or from a domain that
     *            has been verified with Amazon SES.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotifyConfigurationType withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * <p>
     * The destination to which the receiver of an email should reply to.
     * </p>
     *
     * @return <p>
     *         The destination to which the receiver of an email should reply
     *         to.
     *         </p>
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * <p>
     * The destination to which the receiver of an email should reply to.
     * </p>
     *
     * @param replyTo <p>
     *            The destination to which the receiver of an email should reply
     *            to.
     *            </p>
     */
    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    /**
     * <p>
     * The destination to which the receiver of an email should reply to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replyTo <p>
     *            The destination to which the receiver of an email should reply
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotifyConfigurationType withReplyTo(String replyTo) {
        this.replyTo = replyTo;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity that is associated with
     * the sending authorization policy. It permits Amazon Cognito to send for
     * the email address specified in the <code>From</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the identity that is associated
     *         with the sending authorization policy. It permits Amazon Cognito
     *         to send for the email address specified in the <code>From</code>
     *         parameter.
     *         </p>
     */
    public String getSourceArn() {
        return sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity that is associated with
     * the sending authorization policy. It permits Amazon Cognito to send for
     * the email address specified in the <code>From</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param sourceArn <p>
     *            The Amazon Resource Name (ARN) of the identity that is
     *            associated with the sending authorization policy. It permits
     *            Amazon Cognito to send for the email address specified in the
     *            <code>From</code> parameter.
     *            </p>
     */
    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity that is associated with
     * the sending authorization policy. It permits Amazon Cognito to send for
     * the email address specified in the <code>From</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param sourceArn <p>
     *            The Amazon Resource Name (ARN) of the identity that is
     *            associated with the sending authorization policy. It permits
     *            Amazon Cognito to send for the email address specified in the
     *            <code>From</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotifyConfigurationType withSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }

    /**
     * <p>
     * Email template used when a detected risk event is blocked.
     * </p>
     *
     * @return <p>
     *         Email template used when a detected risk event is blocked.
     *         </p>
     */
    public NotifyEmailType getBlockEmail() {
        return blockEmail;
    }

    /**
     * <p>
     * Email template used when a detected risk event is blocked.
     * </p>
     *
     * @param blockEmail <p>
     *            Email template used when a detected risk event is blocked.
     *            </p>
     */
    public void setBlockEmail(NotifyEmailType blockEmail) {
        this.blockEmail = blockEmail;
    }

    /**
     * <p>
     * Email template used when a detected risk event is blocked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockEmail <p>
     *            Email template used when a detected risk event is blocked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotifyConfigurationType withBlockEmail(NotifyEmailType blockEmail) {
        this.blockEmail = blockEmail;
        return this;
    }

    /**
     * <p>
     * The email template used when a detected risk event is allowed.
     * </p>
     *
     * @return <p>
     *         The email template used when a detected risk event is allowed.
     *         </p>
     */
    public NotifyEmailType getNoActionEmail() {
        return noActionEmail;
    }

    /**
     * <p>
     * The email template used when a detected risk event is allowed.
     * </p>
     *
     * @param noActionEmail <p>
     *            The email template used when a detected risk event is allowed.
     *            </p>
     */
    public void setNoActionEmail(NotifyEmailType noActionEmail) {
        this.noActionEmail = noActionEmail;
    }

    /**
     * <p>
     * The email template used when a detected risk event is allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param noActionEmail <p>
     *            The email template used when a detected risk event is allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotifyConfigurationType withNoActionEmail(NotifyEmailType noActionEmail) {
        this.noActionEmail = noActionEmail;
        return this;
    }

    /**
     * <p>
     * The MFA email template used when MFA is challenged as part of a detected
     * risk.
     * </p>
     *
     * @return <p>
     *         The MFA email template used when MFA is challenged as part of a
     *         detected risk.
     *         </p>
     */
    public NotifyEmailType getMfaEmail() {
        return mfaEmail;
    }

    /**
     * <p>
     * The MFA email template used when MFA is challenged as part of a detected
     * risk.
     * </p>
     *
     * @param mfaEmail <p>
     *            The MFA email template used when MFA is challenged as part of
     *            a detected risk.
     *            </p>
     */
    public void setMfaEmail(NotifyEmailType mfaEmail) {
        this.mfaEmail = mfaEmail;
    }

    /**
     * <p>
     * The MFA email template used when MFA is challenged as part of a detected
     * risk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mfaEmail <p>
     *            The MFA email template used when MFA is challenged as part of
     *            a detected risk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotifyConfigurationType withMfaEmail(NotifyEmailType mfaEmail) {
        this.mfaEmail = mfaEmail;
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
        if (getFrom() != null)
            sb.append("From: " + getFrom() + ",");
        if (getReplyTo() != null)
            sb.append("ReplyTo: " + getReplyTo() + ",");
        if (getSourceArn() != null)
            sb.append("SourceArn: " + getSourceArn() + ",");
        if (getBlockEmail() != null)
            sb.append("BlockEmail: " + getBlockEmail() + ",");
        if (getNoActionEmail() != null)
            sb.append("NoActionEmail: " + getNoActionEmail() + ",");
        if (getMfaEmail() != null)
            sb.append("MfaEmail: " + getMfaEmail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getReplyTo() == null) ? 0 : getReplyTo().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getBlockEmail() == null) ? 0 : getBlockEmail().hashCode());
        hashCode = prime * hashCode
                + ((getNoActionEmail() == null) ? 0 : getNoActionEmail().hashCode());
        hashCode = prime * hashCode + ((getMfaEmail() == null) ? 0 : getMfaEmail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotifyConfigurationType == false)
            return false;
        NotifyConfigurationType other = (NotifyConfigurationType) obj;

        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getReplyTo() == null ^ this.getReplyTo() == null)
            return false;
        if (other.getReplyTo() != null && other.getReplyTo().equals(this.getReplyTo()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null
                && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getBlockEmail() == null ^ this.getBlockEmail() == null)
            return false;
        if (other.getBlockEmail() != null
                && other.getBlockEmail().equals(this.getBlockEmail()) == false)
            return false;
        if (other.getNoActionEmail() == null ^ this.getNoActionEmail() == null)
            return false;
        if (other.getNoActionEmail() != null
                && other.getNoActionEmail().equals(this.getNoActionEmail()) == false)
            return false;
        if (other.getMfaEmail() == null ^ this.getMfaEmail() == null)
            return false;
        if (other.getMfaEmail() != null && other.getMfaEmail().equals(this.getMfaEmail()) == false)
            return false;
        return true;
    }
}
