/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * A list of email addresses that you have verified with Amazon SES under your
 * AWS account.
 * </p>
 */
public class ListVerifiedEmailAddressesResult implements Serializable {
    /**
     * <p>
     * A list of email addresses that have been verified.
     * </p>
     */
    private java.util.List<String> verifiedEmailAddresses = new java.util.ArrayList<String>();

    /**
     * <p>
     * A list of email addresses that have been verified.
     * </p>
     *
     * @return <p>
     *         A list of email addresses that have been verified.
     *         </p>
     */
    public java.util.List<String> getVerifiedEmailAddresses() {
        return verifiedEmailAddresses;
    }

    /**
     * <p>
     * A list of email addresses that have been verified.
     * </p>
     *
     * @param verifiedEmailAddresses <p>
     *            A list of email addresses that have been verified.
     *            </p>
     */
    public void setVerifiedEmailAddresses(java.util.Collection<String> verifiedEmailAddresses) {
        if (verifiedEmailAddresses == null) {
            this.verifiedEmailAddresses = null;
            return;
        }

        this.verifiedEmailAddresses = new java.util.ArrayList<String>(verifiedEmailAddresses);
    }

    /**
     * <p>
     * A list of email addresses that have been verified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param verifiedEmailAddresses <p>
     *            A list of email addresses that have been verified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVerifiedEmailAddressesResult withVerifiedEmailAddresses(
            String... verifiedEmailAddresses) {
        if (getVerifiedEmailAddresses() == null) {
            this.verifiedEmailAddresses = new java.util.ArrayList<String>(
                    verifiedEmailAddresses.length);
        }
        for (String value : verifiedEmailAddresses) {
            this.verifiedEmailAddresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of email addresses that have been verified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param verifiedEmailAddresses <p>
     *            A list of email addresses that have been verified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVerifiedEmailAddressesResult withVerifiedEmailAddresses(
            java.util.Collection<String> verifiedEmailAddresses) {
        setVerifiedEmailAddresses(verifiedEmailAddresses);
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
        if (getVerifiedEmailAddresses() != null)
            sb.append("VerifiedEmailAddresses: " + getVerifiedEmailAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getVerifiedEmailAddresses() == null) ? 0 : getVerifiedEmailAddresses()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVerifiedEmailAddressesResult == false)
            return false;
        ListVerifiedEmailAddressesResult other = (ListVerifiedEmailAddressesResult) obj;

        if (other.getVerifiedEmailAddresses() == null ^ this.getVerifiedEmailAddresses() == null)
            return false;
        if (other.getVerifiedEmailAddresses() != null
                && other.getVerifiedEmailAddresses().equals(this.getVerifiedEmailAddresses()) == false)
            return false;
        return true;
    }
}
