/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the notification attributes for a list of identities.
 * </p>
 */
public class GetIdentityNotificationAttributesResult implements Serializable {
    /**
     * <p>
     * A map of Identity to IdentityNotificationAttributes.
     * </p>
     */
    private java.util.Map<String, IdentityNotificationAttributes> notificationAttributes = new java.util.HashMap<String, IdentityNotificationAttributes>();

    /**
     * <p>
     * A map of Identity to IdentityNotificationAttributes.
     * </p>
     *
     * @return <p>
     *         A map of Identity to IdentityNotificationAttributes.
     *         </p>
     */
    public java.util.Map<String, IdentityNotificationAttributes> getNotificationAttributes() {
        return notificationAttributes;
    }

    /**
     * <p>
     * A map of Identity to IdentityNotificationAttributes.
     * </p>
     *
     * @param notificationAttributes <p>
     *            A map of Identity to IdentityNotificationAttributes.
     *            </p>
     */
    public void setNotificationAttributes(
            java.util.Map<String, IdentityNotificationAttributes> notificationAttributes) {
        this.notificationAttributes = notificationAttributes;
    }

    /**
     * <p>
     * A map of Identity to IdentityNotificationAttributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationAttributes <p>
     *            A map of Identity to IdentityNotificationAttributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIdentityNotificationAttributesResult withNotificationAttributes(
            java.util.Map<String, IdentityNotificationAttributes> notificationAttributes) {
        this.notificationAttributes = notificationAttributes;
        return this;
    }

    /**
     * <p>
     * A map of Identity to IdentityNotificationAttributes.
     * </p>
     * <p>
     * The method adds a new key-value pair into NotificationAttributes
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into NotificationAttributes.
     * @param value The corresponding value of the entry to be added into
     *            NotificationAttributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIdentityNotificationAttributesResult addNotificationAttributesEntry(String key,
            IdentityNotificationAttributes value) {
        if (null == this.notificationAttributes) {
            this.notificationAttributes = new java.util.HashMap<String, IdentityNotificationAttributes>();
        }
        if (this.notificationAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.notificationAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into NotificationAttributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetIdentityNotificationAttributesResult clearNotificationAttributesEntries() {
        this.notificationAttributes = null;
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
        if (getNotificationAttributes() != null)
            sb.append("NotificationAttributes: " + getNotificationAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getNotificationAttributes() == null) ? 0 : getNotificationAttributes()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIdentityNotificationAttributesResult == false)
            return false;
        GetIdentityNotificationAttributesResult other = (GetIdentityNotificationAttributesResult) obj;

        if (other.getNotificationAttributes() == null ^ this.getNotificationAttributes() == null)
            return false;
        if (other.getNotificationAttributes() != null
                && other.getNotificationAttributes().equals(this.getNotificationAttributes()) == false)
            return false;
        return true;
    }
}
