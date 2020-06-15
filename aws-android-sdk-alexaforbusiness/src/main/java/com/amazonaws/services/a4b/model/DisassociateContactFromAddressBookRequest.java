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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disassociates a contact from a given address book.
 * </p>
 */
public class DisassociateContactFromAddressBookRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ARN of the contact to disassociate from an address book.
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
     * The ARN of the address from which to disassociate the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String addressBookArn;

    /**
     * <p>
     * The ARN of the contact to disassociate from an address book.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the contact to disassociate from an address book.
     *         </p>
     */
    public String getContactArn() {
        return contactArn;
    }

    /**
     * <p>
     * The ARN of the contact to disassociate from an address book.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param contactArn <p>
     *            The ARN of the contact to disassociate from an address book.
     *            </p>
     */
    public void setContactArn(String contactArn) {
        this.contactArn = contactArn;
    }

    /**
     * <p>
     * The ARN of the contact to disassociate from an address book.
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
     *            The ARN of the contact to disassociate from an address book.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateContactFromAddressBookRequest withContactArn(String contactArn) {
        this.contactArn = contactArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the address from which to disassociate the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the address from which to disassociate the contact.
     *         </p>
     */
    public String getAddressBookArn() {
        return addressBookArn;
    }

    /**
     * <p>
     * The ARN of the address from which to disassociate the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param addressBookArn <p>
     *            The ARN of the address from which to disassociate the contact.
     *            </p>
     */
    public void setAddressBookArn(String addressBookArn) {
        this.addressBookArn = addressBookArn;
    }

    /**
     * <p>
     * The ARN of the address from which to disassociate the contact.
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
     * @param addressBookArn <p>
     *            The ARN of the address from which to disassociate the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateContactFromAddressBookRequest withAddressBookArn(String addressBookArn) {
        this.addressBookArn = addressBookArn;
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
        if (getAddressBookArn() != null)
            sb.append("AddressBookArn: " + getAddressBookArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactArn() == null) ? 0 : getContactArn().hashCode());
        hashCode = prime * hashCode
                + ((getAddressBookArn() == null) ? 0 : getAddressBookArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateContactFromAddressBookRequest == false)
            return false;
        DisassociateContactFromAddressBookRequest other = (DisassociateContactFromAddressBookRequest) obj;

        if (other.getContactArn() == null ^ this.getContactArn() == null)
            return false;
        if (other.getContactArn() != null
                && other.getContactArn().equals(this.getContactArn()) == false)
            return false;
        if (other.getAddressBookArn() == null ^ this.getAddressBookArn() == null)
            return false;
        if (other.getAddressBookArn() != null
                && other.getAddressBookArn().equals(this.getAddressBookArn()) == false)
            return false;
        return true;
    }
}
