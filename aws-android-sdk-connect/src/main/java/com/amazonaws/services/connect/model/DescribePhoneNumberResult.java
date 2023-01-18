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

public class DescribePhoneNumberResult implements Serializable {
    /**
     * <p>
     * Information about a phone number that's been claimed to your Amazon
     * Connect instance or traffic distribution group.
     * </p>
     */
    private ClaimedPhoneNumberSummary claimedPhoneNumberSummary;

    /**
     * <p>
     * Information about a phone number that's been claimed to your Amazon
     * Connect instance or traffic distribution group.
     * </p>
     *
     * @return <p>
     *         Information about a phone number that's been claimed to your
     *         Amazon Connect instance or traffic distribution group.
     *         </p>
     */
    public ClaimedPhoneNumberSummary getClaimedPhoneNumberSummary() {
        return claimedPhoneNumberSummary;
    }

    /**
     * <p>
     * Information about a phone number that's been claimed to your Amazon
     * Connect instance or traffic distribution group.
     * </p>
     *
     * @param claimedPhoneNumberSummary <p>
     *            Information about a phone number that's been claimed to your
     *            Amazon Connect instance or traffic distribution group.
     *            </p>
     */
    public void setClaimedPhoneNumberSummary(ClaimedPhoneNumberSummary claimedPhoneNumberSummary) {
        this.claimedPhoneNumberSummary = claimedPhoneNumberSummary;
    }

    /**
     * <p>
     * Information about a phone number that's been claimed to your Amazon
     * Connect instance or traffic distribution group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param claimedPhoneNumberSummary <p>
     *            Information about a phone number that's been claimed to your
     *            Amazon Connect instance or traffic distribution group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePhoneNumberResult withClaimedPhoneNumberSummary(
            ClaimedPhoneNumberSummary claimedPhoneNumberSummary) {
        this.claimedPhoneNumberSummary = claimedPhoneNumberSummary;
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
        if (getClaimedPhoneNumberSummary() != null)
            sb.append("ClaimedPhoneNumberSummary: " + getClaimedPhoneNumberSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getClaimedPhoneNumberSummary() == null) ? 0 : getClaimedPhoneNumberSummary()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePhoneNumberResult == false)
            return false;
        DescribePhoneNumberResult other = (DescribePhoneNumberResult) obj;

        if (other.getClaimedPhoneNumberSummary() == null
                ^ this.getClaimedPhoneNumberSummary() == null)
            return false;
        if (other.getClaimedPhoneNumberSummary() != null
                && other.getClaimedPhoneNumberSummary().equals(this.getClaimedPhoneNumberSummary()) == false)
            return false;
        return true;
    }
}
