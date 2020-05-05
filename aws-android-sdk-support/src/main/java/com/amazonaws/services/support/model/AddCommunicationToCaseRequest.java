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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds additional customer communication to an AWS Support case. You use the
 * <code>caseId</code> value to identify the case to add communication to. You
 * can list a set of email addresses to copy on the communication using the
 * <code>ccEmailAddresses</code> value. The <code>communicationBody</code> value
 * contains the text of the communication.
 * </p>
 * <p>
 * The response indicates the success or failure of the request.
 * </p>
 * <p>
 * This operation implements a subset of the features of the AWS Support Center.
 * </p>
 */
public class AddCommunicationToCaseRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The body of an email communication to add to the support case.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     */
    private String communicationBody;

    /**
     * <p>
     * The email addresses in the CC line of an email to be added to the support
     * case.
     * </p>
     */
    private java.util.List<String> ccEmailAddresses;

    /**
     * <p>
     * The ID of a set of one or more attachments for the communication to add
     * to the case. Create the set by calling <a>AddAttachmentsToSet</a>
     * </p>
     */
    private String attachmentSetId;

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
    public AddCommunicationToCaseRequest withCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * <p>
     * The body of an email communication to add to the support case.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @return <p>
     *         The body of an email communication to add to the support case.
     *         </p>
     */
    public String getCommunicationBody() {
        return communicationBody;
    }

    /**
     * <p>
     * The body of an email communication to add to the support case.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @param communicationBody <p>
     *            The body of an email communication to add to the support case.
     *            </p>
     */
    public void setCommunicationBody(String communicationBody) {
        this.communicationBody = communicationBody;
    }

    /**
     * <p>
     * The body of an email communication to add to the support case.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @param communicationBody <p>
     *            The body of an email communication to add to the support case.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddCommunicationToCaseRequest withCommunicationBody(String communicationBody) {
        this.communicationBody = communicationBody;
        return this;
    }

    /**
     * <p>
     * The email addresses in the CC line of an email to be added to the support
     * case.
     * </p>
     *
     * @return <p>
     *         The email addresses in the CC line of an email to be added to the
     *         support case.
     *         </p>
     */
    public java.util.List<String> getCcEmailAddresses() {
        return ccEmailAddresses;
    }

    /**
     * <p>
     * The email addresses in the CC line of an email to be added to the support
     * case.
     * </p>
     *
     * @param ccEmailAddresses <p>
     *            The email addresses in the CC line of an email to be added to
     *            the support case.
     *            </p>
     */
    public void setCcEmailAddresses(java.util.Collection<String> ccEmailAddresses) {
        if (ccEmailAddresses == null) {
            this.ccEmailAddresses = null;
            return;
        }

        this.ccEmailAddresses = new java.util.ArrayList<String>(ccEmailAddresses);
    }

    /**
     * <p>
     * The email addresses in the CC line of an email to be added to the support
     * case.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ccEmailAddresses <p>
     *            The email addresses in the CC line of an email to be added to
     *            the support case.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddCommunicationToCaseRequest withCcEmailAddresses(String... ccEmailAddresses) {
        if (getCcEmailAddresses() == null) {
            this.ccEmailAddresses = new java.util.ArrayList<String>(ccEmailAddresses.length);
        }
        for (String value : ccEmailAddresses) {
            this.ccEmailAddresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The email addresses in the CC line of an email to be added to the support
     * case.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ccEmailAddresses <p>
     *            The email addresses in the CC line of an email to be added to
     *            the support case.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddCommunicationToCaseRequest withCcEmailAddresses(
            java.util.Collection<String> ccEmailAddresses) {
        setCcEmailAddresses(ccEmailAddresses);
        return this;
    }

    /**
     * <p>
     * The ID of a set of one or more attachments for the communication to add
     * to the case. Create the set by calling <a>AddAttachmentsToSet</a>
     * </p>
     *
     * @return <p>
     *         The ID of a set of one or more attachments for the communication
     *         to add to the case. Create the set by calling
     *         <a>AddAttachmentsToSet</a>
     *         </p>
     */
    public String getAttachmentSetId() {
        return attachmentSetId;
    }

    /**
     * <p>
     * The ID of a set of one or more attachments for the communication to add
     * to the case. Create the set by calling <a>AddAttachmentsToSet</a>
     * </p>
     *
     * @param attachmentSetId <p>
     *            The ID of a set of one or more attachments for the
     *            communication to add to the case. Create the set by calling
     *            <a>AddAttachmentsToSet</a>
     *            </p>
     */
    public void setAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
    }

    /**
     * <p>
     * The ID of a set of one or more attachments for the communication to add
     * to the case. Create the set by calling <a>AddAttachmentsToSet</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentSetId <p>
     *            The ID of a set of one or more attachments for the
     *            communication to add to the case. Create the set by calling
     *            <a>AddAttachmentsToSet</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddCommunicationToCaseRequest withAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
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
        if (getCommunicationBody() != null)
            sb.append("communicationBody: " + getCommunicationBody() + ",");
        if (getCcEmailAddresses() != null)
            sb.append("ccEmailAddresses: " + getCcEmailAddresses() + ",");
        if (getAttachmentSetId() != null)
            sb.append("attachmentSetId: " + getAttachmentSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        hashCode = prime * hashCode
                + ((getCommunicationBody() == null) ? 0 : getCommunicationBody().hashCode());
        hashCode = prime * hashCode
                + ((getCcEmailAddresses() == null) ? 0 : getCcEmailAddresses().hashCode());
        hashCode = prime * hashCode
                + ((getAttachmentSetId() == null) ? 0 : getAttachmentSetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddCommunicationToCaseRequest == false)
            return false;
        AddCommunicationToCaseRequest other = (AddCommunicationToCaseRequest) obj;

        if (other.getCaseId() == null ^ this.getCaseId() == null)
            return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false)
            return false;
        if (other.getCommunicationBody() == null ^ this.getCommunicationBody() == null)
            return false;
        if (other.getCommunicationBody() != null
                && other.getCommunicationBody().equals(this.getCommunicationBody()) == false)
            return false;
        if (other.getCcEmailAddresses() == null ^ this.getCcEmailAddresses() == null)
            return false;
        if (other.getCcEmailAddresses() != null
                && other.getCcEmailAddresses().equals(this.getCcEmailAddresses()) == false)
            return false;
        if (other.getAttachmentSetId() == null ^ this.getAttachmentSetId() == null)
            return false;
        if (other.getAttachmentSetId() != null
                && other.getAttachmentSetId().equals(this.getAttachmentSetId()) == false)
            return false;
        return true;
    }
}
