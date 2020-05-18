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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Moves phone numbers into the <b>Deletion queue</b>. Phone numbers must be
 * disassociated from any users or Amazon Chime Voice Connectors before they can
 * be deleted.
 * </p>
 * <p>
 * Phone numbers remain in the <b>Deletion queue</b> for 7 days before they are
 * deleted permanently.
 * </p>
 */
public class BatchDeletePhoneNumberRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * List of phone number IDs.
     * </p>
     */
    private java.util.List<String> phoneNumberIds;

    /**
     * <p>
     * List of phone number IDs.
     * </p>
     *
     * @return <p>
     *         List of phone number IDs.
     *         </p>
     */
    public java.util.List<String> getPhoneNumberIds() {
        return phoneNumberIds;
    }

    /**
     * <p>
     * List of phone number IDs.
     * </p>
     *
     * @param phoneNumberIds <p>
     *            List of phone number IDs.
     *            </p>
     */
    public void setPhoneNumberIds(java.util.Collection<String> phoneNumberIds) {
        if (phoneNumberIds == null) {
            this.phoneNumberIds = null;
            return;
        }

        this.phoneNumberIds = new java.util.ArrayList<String>(phoneNumberIds);
    }

    /**
     * <p>
     * List of phone number IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumberIds <p>
     *            List of phone number IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeletePhoneNumberRequest withPhoneNumberIds(String... phoneNumberIds) {
        if (getPhoneNumberIds() == null) {
            this.phoneNumberIds = new java.util.ArrayList<String>(phoneNumberIds.length);
        }
        for (String value : phoneNumberIds) {
            this.phoneNumberIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of phone number IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumberIds <p>
     *            List of phone number IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeletePhoneNumberRequest withPhoneNumberIds(
            java.util.Collection<String> phoneNumberIds) {
        setPhoneNumberIds(phoneNumberIds);
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
        if (getPhoneNumberIds() != null)
            sb.append("PhoneNumberIds: " + getPhoneNumberIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPhoneNumberIds() == null) ? 0 : getPhoneNumberIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeletePhoneNumberRequest == false)
            return false;
        BatchDeletePhoneNumberRequest other = (BatchDeletePhoneNumberRequest) obj;

        if (other.getPhoneNumberIds() == null ^ this.getPhoneNumberIds() == null)
            return false;
        if (other.getPhoneNumberIds() != null
                && other.getPhoneNumberIds().equals(this.getPhoneNumberIds()) == false)
            return false;
        return true;
    }
}
