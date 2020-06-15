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

public class GetAddressBookResult implements Serializable {
    /**
     * <p>
     * The details of the requested address book.
     * </p>
     */
    private AddressBook addressBook;

    /**
     * <p>
     * The details of the requested address book.
     * </p>
     *
     * @return <p>
     *         The details of the requested address book.
     *         </p>
     */
    public AddressBook getAddressBook() {
        return addressBook;
    }

    /**
     * <p>
     * The details of the requested address book.
     * </p>
     *
     * @param addressBook <p>
     *            The details of the requested address book.
     *            </p>
     */
    public void setAddressBook(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    /**
     * <p>
     * The details of the requested address book.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addressBook <p>
     *            The details of the requested address book.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAddressBookResult withAddressBook(AddressBook addressBook) {
        this.addressBook = addressBook;
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
        if (getAddressBook() != null)
            sb.append("AddressBook: " + getAddressBook());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAddressBook() == null) ? 0 : getAddressBook().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAddressBookResult == false)
            return false;
        GetAddressBookResult other = (GetAddressBookResult) obj;

        if (other.getAddressBook() == null ^ this.getAddressBook() == null)
            return false;
        if (other.getAddressBook() != null
                && other.getAddressBook().equals(this.getAddressBook()) == false)
            return false;
        return true;
    }
}
