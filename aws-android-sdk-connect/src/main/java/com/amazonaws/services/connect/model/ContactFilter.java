/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Filters user data based on the contact information that is associated to the
 * users. It contains a list of <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
 * >contact states</a>.
 * </p>
 */
public class ContactFilter implements Serializable {
    /**
     * <p>
     * A list of up to 9 <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     * >contact states</a>.
     * </p>
     */
    private java.util.List<String> contactStates;

    /**
     * <p>
     * A list of up to 9 <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     * >contact states</a>.
     * </p>
     *
     * @return <p>
     *         A list of up to 9 <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     *         >contact states</a>.
     *         </p>
     */
    public java.util.List<String> getContactStates() {
        return contactStates;
    }

    /**
     * <p>
     * A list of up to 9 <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     * >contact states</a>.
     * </p>
     *
     * @param contactStates <p>
     *            A list of up to 9 <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     *            >contact states</a>.
     *            </p>
     */
    public void setContactStates(java.util.Collection<String> contactStates) {
        if (contactStates == null) {
            this.contactStates = null;
            return;
        }

        this.contactStates = new java.util.ArrayList<String>(contactStates);
    }

    /**
     * <p>
     * A list of up to 9 <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     * >contact states</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contactStates <p>
     *            A list of up to 9 <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     *            >contact states</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactFilter withContactStates(String... contactStates) {
        if (getContactStates() == null) {
            this.contactStates = new java.util.ArrayList<String>(contactStates.length);
        }
        for (String value : contactStates) {
            this.contactStates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 9 <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     * >contact states</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contactStates <p>
     *            A list of up to 9 <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html"
     *            >contact states</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactFilter withContactStates(java.util.Collection<String> contactStates) {
        setContactStates(contactStates);
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
        if (getContactStates() != null)
            sb.append("ContactStates: " + getContactStates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContactStates() == null) ? 0 : getContactStates().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactFilter == false)
            return false;
        ContactFilter other = (ContactFilter) obj;

        if (other.getContactStates() == null ^ this.getContactStates() == null)
            return false;
        if (other.getContactStates() != null
                && other.getContactStates().equals(this.getContactStates()) == false)
            return false;
        return true;
    }
}
