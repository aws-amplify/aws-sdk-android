/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class DescribeContactResult implements Serializable {
    /**
     * <p>
     * Information about the contact.
     * </p>
     */
    private Contact contact;

    /**
     * <p>
     * Information about the contact.
     * </p>
     *
     * @return <p>
     *         Information about the contact.
     *         </p>
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * <p>
     * Information about the contact.
     * </p>
     *
     * @param contact <p>
     *            Information about the contact.
     *            </p>
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * <p>
     * Information about the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contact <p>
     *            Information about the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeContactResult withContact(Contact contact) {
        this.contact = contact;
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
        if (getContact() != null)
            sb.append("Contact: " + getContact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContact() == null) ? 0 : getContact().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeContactResult == false)
            return false;
        DescribeContactResult other = (DescribeContactResult) obj;

        if (other.getContact() == null ^ this.getContact() == null)
            return false;
        if (other.getContact() != null && other.getContact().equals(this.getContact()) == false)
            return false;
        return true;
    }
}
