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

package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * A communication associated with an AWS Support case. The communication
 * consists of the case ID, the message body, attachment information, the
 * submitter of the communication, and the date and time of the communication.
 * </p>
 */
public class Communication implements Serializable {
    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     */
    private String caseId;

    /**
     * <p>
     * The text of the communication between the customer and AWS Support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     */
    private String body;

    /**
     * <p>
     * The identity of the account that submitted, or responded to, the support
     * case. Customer entries include the role or IAM user as well as the email
     * address. For example,
     * "AdminRole (Role) &lt;someone@example.com&gt;. Entries from the AWS Support team display "
     * Amazon Web Services," and do not show an email address.
     * </p>
     */
    private String submittedBy;

    /**
     * <p>
     * The time the communication was created.
     * </p>
     */
    private String timeCreated;

    /**
     * <p>
     * Information about the attachments to the case communication.
     * </p>
     */
    private java.util.List<AttachmentDetails> attachmentSet;

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     *
     * @return <p>
     *         The AWS Support case ID requested or returned in the call. The
     *         case ID is an alphanumeric string formatted as shown in this
     *         example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     *         </p>
     */
    public String getCaseId() {
        return caseId;
    }

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     *
     * @param caseId <p>
     *            The AWS Support case ID requested or returned in the call. The
     *            case ID is an alphanumeric string formatted as shown in this
     *            example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     *            </p>
     */
    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param caseId <p>
     *            The AWS Support case ID requested or returned in the call. The
     *            case ID is an alphanumeric string formatted as shown in this
     *            example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Communication withCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * <p>
     * The text of the communication between the customer and AWS Support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @return <p>
     *         The text of the communication between the customer and AWS
     *         Support.
     *         </p>
     */
    public String getBody() {
        return body;
    }

    /**
     * <p>
     * The text of the communication between the customer and AWS Support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @param body <p>
     *            The text of the communication between the customer and AWS
     *            Support.
     *            </p>
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The text of the communication between the customer and AWS Support.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @param body <p>
     *            The text of the communication between the customer and AWS
     *            Support.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Communication withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * The identity of the account that submitted, or responded to, the support
     * case. Customer entries include the role or IAM user as well as the email
     * address. For example,
     * "AdminRole (Role) &lt;someone@example.com&gt;. Entries from the AWS Support team display "
     * Amazon Web Services," and do not show an email address.
     * </p>
     *
     * @return <p>
     *         The identity of the account that submitted, or responded to, the
     *         support case. Customer entries include the role or IAM user as
     *         well as the email address. For example,
     *         "AdminRole (Role) &lt;someone@example.com&gt;. Entries from the AWS Support team display "
     *         Amazon Web Services," and do not show an email address.
     *         </p>
     */
    public String getSubmittedBy() {
        return submittedBy;
    }

    /**
     * <p>
     * The identity of the account that submitted, or responded to, the support
     * case. Customer entries include the role or IAM user as well as the email
     * address. For example,
     * "AdminRole (Role) &lt;someone@example.com&gt;. Entries from the AWS Support team display "
     * Amazon Web Services," and do not show an email address.
     * </p>
     *
     * @param submittedBy <p>
     *            The identity of the account that submitted, or responded to,
     *            the support case. Customer entries include the role or IAM
     *            user as well as the email address. For example,
     *            "AdminRole (Role) &lt;someone@example.com&gt;. Entries from the AWS Support team display "
     *            Amazon Web Services," and do not show an email address.
     *            </p>
     */
    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    /**
     * <p>
     * The identity of the account that submitted, or responded to, the support
     * case. Customer entries include the role or IAM user as well as the email
     * address. For example,
     * "AdminRole (Role) &lt;someone@example.com&gt;. Entries from the AWS Support team display "
     * Amazon Web Services," and do not show an email address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submittedBy <p>
     *            The identity of the account that submitted, or responded to,
     *            the support case. Customer entries include the role or IAM
     *            user as well as the email address. For example,
     *            "AdminRole (Role) &lt;someone@example.com&gt;. Entries from the AWS Support team display "
     *            Amazon Web Services," and do not show an email address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Communication withSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    /**
     * <p>
     * The time the communication was created.
     * </p>
     *
     * @return <p>
     *         The time the communication was created.
     *         </p>
     */
    public String getTimeCreated() {
        return timeCreated;
    }

    /**
     * <p>
     * The time the communication was created.
     * </p>
     *
     * @param timeCreated <p>
     *            The time the communication was created.
     *            </p>
     */
    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    /**
     * <p>
     * The time the communication was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeCreated <p>
     *            The time the communication was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Communication withTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
        return this;
    }

    /**
     * <p>
     * Information about the attachments to the case communication.
     * </p>
     *
     * @return <p>
     *         Information about the attachments to the case communication.
     *         </p>
     */
    public java.util.List<AttachmentDetails> getAttachmentSet() {
        return attachmentSet;
    }

    /**
     * <p>
     * Information about the attachments to the case communication.
     * </p>
     *
     * @param attachmentSet <p>
     *            Information about the attachments to the case communication.
     *            </p>
     */
    public void setAttachmentSet(java.util.Collection<AttachmentDetails> attachmentSet) {
        if (attachmentSet == null) {
            this.attachmentSet = null;
            return;
        }

        this.attachmentSet = new java.util.ArrayList<AttachmentDetails>(attachmentSet);
    }

    /**
     * <p>
     * Information about the attachments to the case communication.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentSet <p>
     *            Information about the attachments to the case communication.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Communication withAttachmentSet(AttachmentDetails... attachmentSet) {
        if (getAttachmentSet() == null) {
            this.attachmentSet = new java.util.ArrayList<AttachmentDetails>(attachmentSet.length);
        }
        for (AttachmentDetails value : attachmentSet) {
            this.attachmentSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the attachments to the case communication.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentSet <p>
     *            Information about the attachments to the case communication.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Communication withAttachmentSet(java.util.Collection<AttachmentDetails> attachmentSet) {
        setAttachmentSet(attachmentSet);
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
        if (getCaseId() != null)
            sb.append("caseId: " + getCaseId() + ",");
        if (getBody() != null)
            sb.append("body: " + getBody() + ",");
        if (getSubmittedBy() != null)
            sb.append("submittedBy: " + getSubmittedBy() + ",");
        if (getTimeCreated() != null)
            sb.append("timeCreated: " + getTimeCreated() + ",");
        if (getAttachmentSet() != null)
            sb.append("attachmentSet: " + getAttachmentSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode
                + ((getSubmittedBy() == null) ? 0 : getSubmittedBy().hashCode());
        hashCode = prime * hashCode
                + ((getTimeCreated() == null) ? 0 : getTimeCreated().hashCode());
        hashCode = prime * hashCode
                + ((getAttachmentSet() == null) ? 0 : getAttachmentSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Communication == false)
            return false;
        Communication other = (Communication) obj;

        if (other.getCaseId() == null ^ this.getCaseId() == null)
            return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getSubmittedBy() == null ^ this.getSubmittedBy() == null)
            return false;
        if (other.getSubmittedBy() != null
                && other.getSubmittedBy().equals(this.getSubmittedBy()) == false)
            return false;
        if (other.getTimeCreated() == null ^ this.getTimeCreated() == null)
            return false;
        if (other.getTimeCreated() != null
                && other.getTimeCreated().equals(this.getTimeCreated()) == false)
            return false;
        if (other.getAttachmentSet() == null ^ this.getAttachmentSet() == null)
            return false;
        if (other.getAttachmentSet() != null
                && other.getAttachmentSet().equals(this.getAttachmentSet()) == false)
            return false;
        return true;
    }
}
