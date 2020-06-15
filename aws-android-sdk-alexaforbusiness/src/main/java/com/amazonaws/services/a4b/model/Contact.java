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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * A contact with attributes.
 * </p>
 */
public class Contact implements Serializable {
    /**
     * <p>
     * The ARN of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String contactArn;

    /**
     * <p>
     * The name of the contact to display on the console.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String displayName;

    /**
     * <p>
     * The first name of the contact, used to call the contact on the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String firstName;

    /**
     * <p>
     * The last name of the contact, used to call the contact on the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String lastName;

    /**
     * <p>
     * The phone number of the contact. The phone number type defaults to WORK.
     * You can either specify PhoneNumber or PhoneNumbers. We recommend that you
     * use PhoneNumbers, which lets you specify the phone number type and
     * multiple numbers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     * <b>Pattern: </b>^[\+0-9\#\,\(][\+0-9\-\.\/\(\)\,\#\s]+$<br/>
     */
    private String phoneNumber;

    /**
     * <p>
     * The list of phone numbers for the contact.
     * </p>
     */
    private java.util.List<PhoneNumber> phoneNumbers;

    /**
     * <p>
     * The list of SIP addresses for the contact.
     * </p>
     */
    private java.util.List<SipAddress> sipAddresses;

    /**
     * <p>
     * The ARN of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the contact.
     *         </p>
     */
    public String getContactArn() {
        return contactArn;
    }

    /**
     * <p>
     * The ARN of the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param contactArn <p>
     *            The ARN of the contact.
     *            </p>
     */
    public void setContactArn(String contactArn) {
        this.contactArn = contactArn;
    }

    /**
     * <p>
     * The ARN of the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param contactArn <p>
     *            The ARN of the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withContactArn(String contactArn) {
        this.contactArn = contactArn;
        return this;
    }

    /**
     * <p>
     * The name of the contact to display on the console.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The name of the contact to display on the console.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The name of the contact to display on the console.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param displayName <p>
     *            The name of the contact to display on the console.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the contact to display on the console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param displayName <p>
     *            The name of the contact to display on the console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The first name of the contact, used to call the contact on the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The first name of the contact, used to call the contact on the
     *         device.
     *         </p>
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * <p>
     * The first name of the contact, used to call the contact on the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param firstName <p>
     *            The first name of the contact, used to call the contact on the
     *            device.
     *            </p>
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The first name of the contact, used to call the contact on the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param firstName <p>
     *            The first name of the contact, used to call the contact on the
     *            device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * <p>
     * The last name of the contact, used to call the contact on the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The last name of the contact, used to call the contact on the
     *         device.
     *         </p>
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * <p>
     * The last name of the contact, used to call the contact on the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param lastName <p>
     *            The last name of the contact, used to call the contact on the
     *            device.
     *            </p>
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The last name of the contact, used to call the contact on the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param lastName <p>
     *            The last name of the contact, used to call the contact on the
     *            device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * <p>
     * The phone number of the contact. The phone number type defaults to WORK.
     * You can either specify PhoneNumber or PhoneNumbers. We recommend that you
     * use PhoneNumbers, which lets you specify the phone number type and
     * multiple numbers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     * <b>Pattern: </b>^[\+0-9\#\,\(][\+0-9\-\.\/\(\)\,\#\s]+$<br/>
     *
     * @return <p>
     *         The phone number of the contact. The phone number type defaults
     *         to WORK. You can either specify PhoneNumber or PhoneNumbers. We
     *         recommend that you use PhoneNumbers, which lets you specify the
     *         phone number type and multiple numbers.
     *         </p>
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>
     * The phone number of the contact. The phone number type defaults to WORK.
     * You can either specify PhoneNumber or PhoneNumbers. We recommend that you
     * use PhoneNumbers, which lets you specify the phone number type and
     * multiple numbers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     * <b>Pattern: </b>^[\+0-9\#\,\(][\+0-9\-\.\/\(\)\,\#\s]+$<br/>
     *
     * @param phoneNumber <p>
     *            The phone number of the contact. The phone number type
     *            defaults to WORK. You can either specify PhoneNumber or
     *            PhoneNumbers. We recommend that you use PhoneNumbers, which
     *            lets you specify the phone number type and multiple numbers.
     *            </p>
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number of the contact. The phone number type defaults to WORK.
     * You can either specify PhoneNumber or PhoneNumbers. We recommend that you
     * use PhoneNumbers, which lets you specify the phone number type and
     * multiple numbers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 50<br/>
     * <b>Pattern: </b>^[\+0-9\#\,\(][\+0-9\-\.\/\(\)\,\#\s]+$<br/>
     *
     * @param phoneNumber <p>
     *            The phone number of the contact. The phone number type
     *            defaults to WORK. You can either specify PhoneNumber or
     *            PhoneNumbers. We recommend that you use PhoneNumbers, which
     *            lets you specify the phone number type and multiple numbers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * <p>
     * The list of phone numbers for the contact.
     * </p>
     *
     * @return <p>
     *         The list of phone numbers for the contact.
     *         </p>
     */
    public java.util.List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * <p>
     * The list of phone numbers for the contact.
     * </p>
     *
     * @param phoneNumbers <p>
     *            The list of phone numbers for the contact.
     *            </p>
     */
    public void setPhoneNumbers(java.util.Collection<PhoneNumber> phoneNumbers) {
        if (phoneNumbers == null) {
            this.phoneNumbers = null;
            return;
        }

        this.phoneNumbers = new java.util.ArrayList<PhoneNumber>(phoneNumbers);
    }

    /**
     * <p>
     * The list of phone numbers for the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumbers <p>
     *            The list of phone numbers for the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withPhoneNumbers(PhoneNumber... phoneNumbers) {
        if (getPhoneNumbers() == null) {
            this.phoneNumbers = new java.util.ArrayList<PhoneNumber>(phoneNumbers.length);
        }
        for (PhoneNumber value : phoneNumbers) {
            this.phoneNumbers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of phone numbers for the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumbers <p>
     *            The list of phone numbers for the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withPhoneNumbers(java.util.Collection<PhoneNumber> phoneNumbers) {
        setPhoneNumbers(phoneNumbers);
        return this;
    }

    /**
     * <p>
     * The list of SIP addresses for the contact.
     * </p>
     *
     * @return <p>
     *         The list of SIP addresses for the contact.
     *         </p>
     */
    public java.util.List<SipAddress> getSipAddresses() {
        return sipAddresses;
    }

    /**
     * <p>
     * The list of SIP addresses for the contact.
     * </p>
     *
     * @param sipAddresses <p>
     *            The list of SIP addresses for the contact.
     *            </p>
     */
    public void setSipAddresses(java.util.Collection<SipAddress> sipAddresses) {
        if (sipAddresses == null) {
            this.sipAddresses = null;
            return;
        }

        this.sipAddresses = new java.util.ArrayList<SipAddress>(sipAddresses);
    }

    /**
     * <p>
     * The list of SIP addresses for the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sipAddresses <p>
     *            The list of SIP addresses for the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withSipAddresses(SipAddress... sipAddresses) {
        if (getSipAddresses() == null) {
            this.sipAddresses = new java.util.ArrayList<SipAddress>(sipAddresses.length);
        }
        for (SipAddress value : sipAddresses) {
            this.sipAddresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of SIP addresses for the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sipAddresses <p>
     *            The list of SIP addresses for the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Contact withSipAddresses(java.util.Collection<SipAddress> sipAddresses) {
        setSipAddresses(sipAddresses);
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
        if (getContactArn() != null)
            sb.append("ContactArn: " + getContactArn() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getFirstName() != null)
            sb.append("FirstName: " + getFirstName() + ",");
        if (getLastName() != null)
            sb.append("LastName: " + getLastName() + ",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: " + getPhoneNumber() + ",");
        if (getPhoneNumbers() != null)
            sb.append("PhoneNumbers: " + getPhoneNumbers() + ",");
        if (getSipAddresses() != null)
            sb.append("SipAddresses: " + getSipAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactArn() == null) ? 0 : getContactArn().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode
                + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode
                + ((getPhoneNumbers() == null) ? 0 : getPhoneNumbers().hashCode());
        hashCode = prime * hashCode
                + ((getSipAddresses() == null) ? 0 : getSipAddresses().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Contact == false)
            return false;
        Contact other = (Contact) obj;

        if (other.getContactArn() == null ^ this.getContactArn() == null)
            return false;
        if (other.getContactArn() != null
                && other.getContactArn().equals(this.getContactArn()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null
                && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null
                && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getPhoneNumbers() == null ^ this.getPhoneNumbers() == null)
            return false;
        if (other.getPhoneNumbers() != null
                && other.getPhoneNumbers().equals(this.getPhoneNumbers()) == false)
            return false;
        if (other.getSipAddresses() == null ^ this.getSipAddresses() == null)
            return false;
        if (other.getSipAddresses() != null
                && other.getSipAddresses().equals(this.getSipAddresses()) == false)
            return false;
        return true;
    }
}
