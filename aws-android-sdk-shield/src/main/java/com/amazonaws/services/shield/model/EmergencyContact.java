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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

/**
 * <p>
 * Contact information that the DRT can use to contact you if you have proactive
 * engagement enabled, for escalations to the DRT and to initiate proactive
 * customer support.
 * </p>
 */
public class EmergencyContact implements Serializable {
    /**
     * <p>
     * The email address for the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     * <b>Pattern: </b>^\S+@\S+\.\S+$<br/>
     */
    private String emailAddress;

    /**
     * <p>
     * The phone number for the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>^\+[1-9]\d{1,14}$<br/>
     */
    private String phoneNumber;

    /**
     * <p>
     * Additional notes regarding the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[\w\s\.\-,:/()+@]*$<br/>
     */
    private String contactNotes;

    /**
     * <p>
     * The email address for the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     * <b>Pattern: </b>^\S+@\S+\.\S+$<br/>
     *
     * @return <p>
     *         The email address for the contact.
     *         </p>
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * <p>
     * The email address for the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     * <b>Pattern: </b>^\S+@\S+\.\S+$<br/>
     *
     * @param emailAddress <p>
     *            The email address for the contact.
     *            </p>
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address for the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     * <b>Pattern: </b>^\S+@\S+\.\S+$<br/>
     *
     * @param emailAddress <p>
     *            The email address for the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmergencyContact withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * <p>
     * The phone number for the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>^\+[1-9]\d{1,14}$<br/>
     *
     * @return <p>
     *         The phone number for the contact.
     *         </p>
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>
     * The phone number for the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>^\+[1-9]\d{1,14}$<br/>
     *
     * @param phoneNumber <p>
     *            The phone number for the contact.
     *            </p>
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number for the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>^\+[1-9]\d{1,14}$<br/>
     *
     * @param phoneNumber <p>
     *            The phone number for the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmergencyContact withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * <p>
     * Additional notes regarding the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[\w\s\.\-,:/()+@]*$<br/>
     *
     * @return <p>
     *         Additional notes regarding the contact.
     *         </p>
     */
    public String getContactNotes() {
        return contactNotes;
    }

    /**
     * <p>
     * Additional notes regarding the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[\w\s\.\-,:/()+@]*$<br/>
     *
     * @param contactNotes <p>
     *            Additional notes regarding the contact.
     *            </p>
     */
    public void setContactNotes(String contactNotes) {
        this.contactNotes = contactNotes;
    }

    /**
     * <p>
     * Additional notes regarding the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[\w\s\.\-,:/()+@]*$<br/>
     *
     * @param contactNotes <p>
     *            Additional notes regarding the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmergencyContact withContactNotes(String contactNotes) {
        this.contactNotes = contactNotes;
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
        if (getEmailAddress() != null)
            sb.append("EmailAddress: " + getEmailAddress() + ",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: " + getPhoneNumber() + ",");
        if (getContactNotes() != null)
            sb.append("ContactNotes: " + getContactNotes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode
                + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode
                + ((getContactNotes() == null) ? 0 : getContactNotes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmergencyContact == false)
            return false;
        EmergencyContact other = (EmergencyContact) obj;

        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null
                && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null
                && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getContactNotes() == null ^ this.getContactNotes() == null)
            return false;
        if (other.getContactNotes() != null
                && other.getContactNotes().equals(this.getContactNotes()) == false)
            return false;
        return true;
    }
}
