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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

public class GetContactMethodsResult implements Serializable {
    /**
     * <p>
     * An array of objects that describe the contact methods.
     * </p>
     */
    private java.util.List<ContactMethod> contactMethods;

    /**
     * <p>
     * An array of objects that describe the contact methods.
     * </p>
     *
     * @return <p>
     *         An array of objects that describe the contact methods.
     *         </p>
     */
    public java.util.List<ContactMethod> getContactMethods() {
        return contactMethods;
    }

    /**
     * <p>
     * An array of objects that describe the contact methods.
     * </p>
     *
     * @param contactMethods <p>
     *            An array of objects that describe the contact methods.
     *            </p>
     */
    public void setContactMethods(java.util.Collection<ContactMethod> contactMethods) {
        if (contactMethods == null) {
            this.contactMethods = null;
            return;
        }

        this.contactMethods = new java.util.ArrayList<ContactMethod>(contactMethods);
    }

    /**
     * <p>
     * An array of objects that describe the contact methods.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contactMethods <p>
     *            An array of objects that describe the contact methods.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetContactMethodsResult withContactMethods(ContactMethod... contactMethods) {
        if (getContactMethods() == null) {
            this.contactMethods = new java.util.ArrayList<ContactMethod>(contactMethods.length);
        }
        for (ContactMethod value : contactMethods) {
            this.contactMethods.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the contact methods.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contactMethods <p>
     *            An array of objects that describe the contact methods.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetContactMethodsResult withContactMethods(
            java.util.Collection<ContactMethod> contactMethods) {
        setContactMethods(contactMethods);
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
        if (getContactMethods() != null)
            sb.append("contactMethods: " + getContactMethods());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContactMethods() == null) ? 0 : getContactMethods().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContactMethodsResult == false)
            return false;
        GetContactMethodsResult other = (GetContactMethodsResult) obj;

        if (other.getContactMethods() == null ^ this.getContactMethods() == null)
            return false;
        if (other.getContactMethods() != null
                && other.getContactMethods().equals(this.getContactMethods()) == false)
            return false;
        return true;
    }
}
