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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sends an invitation to another account to join your organization as a member
 * account. AWS Organizations sends email on your behalf to the email address
 * that is associated with the other account's owner. The invitation is
 * implemented as a <a>Handshake</a> whose details are in the response.
 * </p>
 * <important>
 * <ul>
 * <li>
 * <p>
 * You can invite AWS accounts only from the same seller as the master account.
 * For example, if your organization's master account was created by Amazon
 * Internet Services Pvt. Ltd (AISPL), an AWS seller in India, you can invite
 * only other AISPL accounts to your organization. You can't combine accounts
 * from AISPL and AWS or from any other AWS seller. For more information, see <a
 * href=
 * "http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/useconsolidatedbilliing-India.html"
 * >Consolidated Billing in India</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you receive an exception that indicates that you exceeded your account
 * limits for the organization or that the operation failed because your
 * organization is still initializing, wait one hour and then try again. If the
 * error persists after an hour, contact <a
 * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
 * </p>
 * </li>
 * </ul>
 * </important>
 * <p>
 * This operation can be called only from the organization's master account.
 * </p>
 */
public class InviteAccountToOrganizationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier (ID) of the AWS account that you want to invite to join
     * your organization. This is a JSON object that contains the following
     * elements:
     * </p>
     * <p>
     * <code>{ "Type": "ACCOUNT", "Id": "&lt;<i> <b>account id number</b> </i>&gt;" }</code>
     * </p>
     * <p>
     * If you use the AWS CLI, you can submit this as a single string, similar
     * to the following example:
     * </p>
     * <p>
     * <code>--target Id=123456789012,Type=ACCOUNT</code>
     * </p>
     * <p>
     * If you specify <code>"Type": "ACCOUNT"</code>, you must provide the AWS
     * account ID number as the <code>Id</code>. If you specify
     * <code>"Type": "EMAIL"</code>, you must specify the email address that is
     * associated with the account.
     * </p>
     * <p>
     * <code>--target Id=diego@example.com,Type=EMAIL</code>
     * </p>
     */
    private HandshakeParty target;

    /**
     * <p>
     * Additional information that you want to include in the generated email to
     * the recipient account owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String notes;

    /**
     * <p>
     * The identifier (ID) of the AWS account that you want to invite to join
     * your organization. This is a JSON object that contains the following
     * elements:
     * </p>
     * <p>
     * <code>{ "Type": "ACCOUNT", "Id": "&lt;<i> <b>account id number</b> </i>&gt;" }</code>
     * </p>
     * <p>
     * If you use the AWS CLI, you can submit this as a single string, similar
     * to the following example:
     * </p>
     * <p>
     * <code>--target Id=123456789012,Type=ACCOUNT</code>
     * </p>
     * <p>
     * If you specify <code>"Type": "ACCOUNT"</code>, you must provide the AWS
     * account ID number as the <code>Id</code>. If you specify
     * <code>"Type": "EMAIL"</code>, you must specify the email address that is
     * associated with the account.
     * </p>
     * <p>
     * <code>--target Id=diego@example.com,Type=EMAIL</code>
     * </p>
     *
     * @return <p>
     *         The identifier (ID) of the AWS account that you want to invite to
     *         join your organization. This is a JSON object that contains the
     *         following elements:
     *         </p>
     *         <p>
     *         <code>{ "Type": "ACCOUNT", "Id": "&lt;<i> <b>account id number</b> </i>&gt;" }</code>
     *         </p>
     *         <p>
     *         If you use the AWS CLI, you can submit this as a single string,
     *         similar to the following example:
     *         </p>
     *         <p>
     *         <code>--target Id=123456789012,Type=ACCOUNT</code>
     *         </p>
     *         <p>
     *         If you specify <code>"Type": "ACCOUNT"</code>, you must provide
     *         the AWS account ID number as the <code>Id</code>. If you specify
     *         <code>"Type": "EMAIL"</code>, you must specify the email address
     *         that is associated with the account.
     *         </p>
     *         <p>
     *         <code>--target Id=diego@example.com,Type=EMAIL</code>
     *         </p>
     */
    public HandshakeParty getTarget() {
        return target;
    }

    /**
     * <p>
     * The identifier (ID) of the AWS account that you want to invite to join
     * your organization. This is a JSON object that contains the following
     * elements:
     * </p>
     * <p>
     * <code>{ "Type": "ACCOUNT", "Id": "&lt;<i> <b>account id number</b> </i>&gt;" }</code>
     * </p>
     * <p>
     * If you use the AWS CLI, you can submit this as a single string, similar
     * to the following example:
     * </p>
     * <p>
     * <code>--target Id=123456789012,Type=ACCOUNT</code>
     * </p>
     * <p>
     * If you specify <code>"Type": "ACCOUNT"</code>, you must provide the AWS
     * account ID number as the <code>Id</code>. If you specify
     * <code>"Type": "EMAIL"</code>, you must specify the email address that is
     * associated with the account.
     * </p>
     * <p>
     * <code>--target Id=diego@example.com,Type=EMAIL</code>
     * </p>
     *
     * @param target <p>
     *            The identifier (ID) of the AWS account that you want to invite
     *            to join your organization. This is a JSON object that contains
     *            the following elements:
     *            </p>
     *            <p>
     *            <code>{ "Type": "ACCOUNT", "Id": "&lt;<i> <b>account id number</b> </i>&gt;" }</code>
     *            </p>
     *            <p>
     *            If you use the AWS CLI, you can submit this as a single
     *            string, similar to the following example:
     *            </p>
     *            <p>
     *            <code>--target Id=123456789012,Type=ACCOUNT</code>
     *            </p>
     *            <p>
     *            If you specify <code>"Type": "ACCOUNT"</code>, you must
     *            provide the AWS account ID number as the <code>Id</code>. If
     *            you specify <code>"Type": "EMAIL"</code>, you must specify the
     *            email address that is associated with the account.
     *            </p>
     *            <p>
     *            <code>--target Id=diego@example.com,Type=EMAIL</code>
     *            </p>
     */
    public void setTarget(HandshakeParty target) {
        this.target = target;
    }

    /**
     * <p>
     * The identifier (ID) of the AWS account that you want to invite to join
     * your organization. This is a JSON object that contains the following
     * elements:
     * </p>
     * <p>
     * <code>{ "Type": "ACCOUNT", "Id": "&lt;<i> <b>account id number</b> </i>&gt;" }</code>
     * </p>
     * <p>
     * If you use the AWS CLI, you can submit this as a single string, similar
     * to the following example:
     * </p>
     * <p>
     * <code>--target Id=123456789012,Type=ACCOUNT</code>
     * </p>
     * <p>
     * If you specify <code>"Type": "ACCOUNT"</code>, you must provide the AWS
     * account ID number as the <code>Id</code>. If you specify
     * <code>"Type": "EMAIL"</code>, you must specify the email address that is
     * associated with the account.
     * </p>
     * <p>
     * <code>--target Id=diego@example.com,Type=EMAIL</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param target <p>
     *            The identifier (ID) of the AWS account that you want to invite
     *            to join your organization. This is a JSON object that contains
     *            the following elements:
     *            </p>
     *            <p>
     *            <code>{ "Type": "ACCOUNT", "Id": "&lt;<i> <b>account id number</b> </i>&gt;" }</code>
     *            </p>
     *            <p>
     *            If you use the AWS CLI, you can submit this as a single
     *            string, similar to the following example:
     *            </p>
     *            <p>
     *            <code>--target Id=123456789012,Type=ACCOUNT</code>
     *            </p>
     *            <p>
     *            If you specify <code>"Type": "ACCOUNT"</code>, you must
     *            provide the AWS account ID number as the <code>Id</code>. If
     *            you specify <code>"Type": "EMAIL"</code>, you must specify the
     *            email address that is associated with the account.
     *            </p>
     *            <p>
     *            <code>--target Id=diego@example.com,Type=EMAIL</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InviteAccountToOrganizationRequest withTarget(HandshakeParty target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * Additional information that you want to include in the generated email to
     * the recipient account owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         Additional information that you want to include in the generated
     *         email to the recipient account owner.
     *         </p>
     */
    public String getNotes() {
        return notes;
    }

    /**
     * <p>
     * Additional information that you want to include in the generated email to
     * the recipient account owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param notes <p>
     *            Additional information that you want to include in the
     *            generated email to the recipient account owner.
     *            </p>
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * <p>
     * Additional information that you want to include in the generated email to
     * the recipient account owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param notes <p>
     *            Additional information that you want to include in the
     *            generated email to the recipient account owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InviteAccountToOrganizationRequest withNotes(String notes) {
        this.notes = notes;
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
        if (getTarget() != null)
            sb.append("Target: " + getTarget() + ",");
        if (getNotes() != null)
            sb.append("Notes: " + getNotes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InviteAccountToOrganizationRequest == false)
            return false;
        InviteAccountToOrganizationRequest other = (InviteAccountToOrganizationRequest) obj;

        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        return true;
    }
}
