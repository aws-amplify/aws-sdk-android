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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * Endpoint user specific custom userAttributes
 */
public class EndpointUser implements Serializable {
    /**
     * Custom attributes that describe the user by associating a name with an
     * array of values. For example, an attribute named "interests" might have
     * the following values: ["science", "politics", "travel"]. You can use
     * these attributes as selection criteria when you create segments. The
     * Amazon Pinpoint console can't display attribute names that include the
     * following characters: hash/pound sign (#), colon (:), question mark (?),
     * backslash (\), and forward slash (/). For this reason, you should avoid
     * using these characters in the names of custom attributes.
     */
    private java.util.Map<String, java.util.List<String>> userAttributes;

    /**
     * The unique ID of the user.
     */
    private String userId;

    /**
     * Custom attributes that describe the user by associating a name with an
     * array of values. For example, an attribute named "interests" might have
     * the following values: ["science", "politics", "travel"]. You can use
     * these attributes as selection criteria when you create segments. The
     * Amazon Pinpoint console can't display attribute names that include the
     * following characters: hash/pound sign (#), colon (:), question mark (?),
     * backslash (\), and forward slash (/). For this reason, you should avoid
     * using these characters in the names of custom attributes.
     *
     * @return Custom attributes that describe the user by associating a name
     *         with an array of values. For example, an attribute named
     *         "interests" might have the following values: ["science",
     *         "politics", "travel"]. You can use these attributes as selection
     *         criteria when you create segments. The Amazon Pinpoint console
     *         can't display attribute names that include the following
     *         characters: hash/pound sign (#), colon (:), question mark (?),
     *         backslash (\), and forward slash (/). For this reason, you should
     *         avoid using these characters in the names of custom attributes.
     */
    public java.util.Map<String, java.util.List<String>> getUserAttributes() {
        return userAttributes;
    }

    /**
     * Custom attributes that describe the user by associating a name with an
     * array of values. For example, an attribute named "interests" might have
     * the following values: ["science", "politics", "travel"]. You can use
     * these attributes as selection criteria when you create segments. The
     * Amazon Pinpoint console can't display attribute names that include the
     * following characters: hash/pound sign (#), colon (:), question mark (?),
     * backslash (\), and forward slash (/). For this reason, you should avoid
     * using these characters in the names of custom attributes.
     *
     * @param userAttributes Custom attributes that describe the user by
     *            associating a name with an array of values. For example, an
     *            attribute named "interests" might have the following values:
     *            ["science", "politics", "travel"]. You can use these
     *            attributes as selection criteria when you create segments. The
     *            Amazon Pinpoint console can't display attribute names that
     *            include the following characters: hash/pound sign (#), colon
     *            (:), question mark (?), backslash (\), and forward slash (/).
     *            For this reason, you should avoid using these characters in
     *            the names of custom attributes.
     */
    public void setUserAttributes(java.util.Map<String, java.util.List<String>> userAttributes) {
        this.userAttributes = userAttributes;
    }

    /**
     * Custom attributes that describe the user by associating a name with an
     * array of values. For example, an attribute named "interests" might have
     * the following values: ["science", "politics", "travel"]. You can use
     * these attributes as selection criteria when you create segments. The
     * Amazon Pinpoint console can't display attribute names that include the
     * following characters: hash/pound sign (#), colon (:), question mark (?),
     * backslash (\), and forward slash (/). For this reason, you should avoid
     * using these characters in the names of custom attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userAttributes Custom attributes that describe the user by
     *            associating a name with an array of values. For example, an
     *            attribute named "interests" might have the following values:
     *            ["science", "politics", "travel"]. You can use these
     *            attributes as selection criteria when you create segments. The
     *            Amazon Pinpoint console can't display attribute names that
     *            include the following characters: hash/pound sign (#), colon
     *            (:), question mark (?), backslash (\), and forward slash (/).
     *            For this reason, you should avoid using these characters in
     *            the names of custom attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointUser withUserAttributes(
            java.util.Map<String, java.util.List<String>> userAttributes) {
        this.userAttributes = userAttributes;
        return this;
    }

    /**
     * Custom attributes that describe the user by associating a name with an
     * array of values. For example, an attribute named "interests" might have
     * the following values: ["science", "politics", "travel"]. You can use
     * these attributes as selection criteria when you create segments. The
     * Amazon Pinpoint console can't display attribute names that include the
     * following characters: hash/pound sign (#), colon (:), question mark (?),
     * backslash (\), and forward slash (/). For this reason, you should avoid
     * using these characters in the names of custom attributes.
     * <p>
     * The method adds a new key-value pair into UserAttributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into UserAttributes.
     * @param value The corresponding value of the entry to be added into
     *            UserAttributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointUser addUserAttributesEntry(String key, java.util.List<String> value) {
        if (null == this.userAttributes) {
            this.userAttributes = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.userAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.userAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UserAttributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public EndpointUser clearUserAttributesEntries() {
        this.userAttributes = null;
        return this;
    }

    /**
     * The unique ID of the user.
     *
     * @return The unique ID of the user.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * The unique ID of the user.
     *
     * @param userId The unique ID of the user.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * The unique ID of the user.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userId The unique ID of the user.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointUser withUserId(String userId) {
        this.userId = userId;
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
        if (getUserAttributes() != null)
            sb.append("UserAttributes: " + getUserAttributes() + ",");
        if (getUserId() != null)
            sb.append("UserId: " + getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserAttributes() == null) ? 0 : getUserAttributes().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointUser == false)
            return false;
        EndpointUser other = (EndpointUser) obj;

        if (other.getUserAttributes() == null ^ this.getUserAttributes() == null)
            return false;
        if (other.getUserAttributes() != null
                && other.getUserAttributes().equals(this.getUserAttributes()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }
}
