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
 * <p>
 * Specifies data for one or more attributes that describe the user who's
 * associated with an endpoint.
 * </p>
 */
public class EndpointUser implements Serializable {
    /**
     * <p>
     * One or more custom attributes that describe the user by associating a
     * name with an array of values. For example, the value of an attribute
     * named Interests might be: ["science", "music", "travel"]. You can use
     * these attributes as filter criteria when you create segments.
     * </p>
     * <p>
     * When you define the name of a custom attribute, avoid using the following
     * characters: number sign (#), colon (:), question mark (?), backslash (\),
     * and slash (/). The Amazon Pinpoint console can't display attribute names
     * that contain these characters. This limitation doesn't apply to attribute
     * values.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> userAttributes;

    /**
     * <p>
     * The unique identifier for the user.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * One or more custom attributes that describe the user by associating a
     * name with an array of values. For example, the value of an attribute
     * named Interests might be: ["science", "music", "travel"]. You can use
     * these attributes as filter criteria when you create segments.
     * </p>
     * <p>
     * When you define the name of a custom attribute, avoid using the following
     * characters: number sign (#), colon (:), question mark (?), backslash (\),
     * and slash (/). The Amazon Pinpoint console can't display attribute names
     * that contain these characters. This limitation doesn't apply to attribute
     * values.
     * </p>
     *
     * @return <p>
     *         One or more custom attributes that describe the user by
     *         associating a name with an array of values. For example, the
     *         value of an attribute named Interests might be: ["science",
     *         "music", "travel"]. You can use these attributes as filter
     *         criteria when you create segments.
     *         </p>
     *         <p>
     *         When you define the name of a custom attribute, avoid using the
     *         following characters: number sign (#), colon (:), question mark
     *         (?), backslash (\), and slash (/). The Amazon Pinpoint console
     *         can't display attribute names that contain these characters. This
     *         limitation doesn't apply to attribute values.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getUserAttributes() {
        return userAttributes;
    }

    /**
     * <p>
     * One or more custom attributes that describe the user by associating a
     * name with an array of values. For example, the value of an attribute
     * named Interests might be: ["science", "music", "travel"]. You can use
     * these attributes as filter criteria when you create segments.
     * </p>
     * <p>
     * When you define the name of a custom attribute, avoid using the following
     * characters: number sign (#), colon (:), question mark (?), backslash (\),
     * and slash (/). The Amazon Pinpoint console can't display attribute names
     * that contain these characters. This limitation doesn't apply to attribute
     * values.
     * </p>
     *
     * @param userAttributes <p>
     *            One or more custom attributes that describe the user by
     *            associating a name with an array of values. For example, the
     *            value of an attribute named Interests might be: ["science",
     *            "music", "travel"]. You can use these attributes as filter
     *            criteria when you create segments.
     *            </p>
     *            <p>
     *            When you define the name of a custom attribute, avoid using
     *            the following characters: number sign (#), colon (:), question
     *            mark (?), backslash (\), and slash (/). The Amazon Pinpoint
     *            console can't display attribute names that contain these
     *            characters. This limitation doesn't apply to attribute values.
     *            </p>
     */
    public void setUserAttributes(java.util.Map<String, java.util.List<String>> userAttributes) {
        this.userAttributes = userAttributes;
    }

    /**
     * <p>
     * One or more custom attributes that describe the user by associating a
     * name with an array of values. For example, the value of an attribute
     * named Interests might be: ["science", "music", "travel"]. You can use
     * these attributes as filter criteria when you create segments.
     * </p>
     * <p>
     * When you define the name of a custom attribute, avoid using the following
     * characters: number sign (#), colon (:), question mark (?), backslash (\),
     * and slash (/). The Amazon Pinpoint console can't display attribute names
     * that contain these characters. This limitation doesn't apply to attribute
     * values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userAttributes <p>
     *            One or more custom attributes that describe the user by
     *            associating a name with an array of values. For example, the
     *            value of an attribute named Interests might be: ["science",
     *            "music", "travel"]. You can use these attributes as filter
     *            criteria when you create segments.
     *            </p>
     *            <p>
     *            When you define the name of a custom attribute, avoid using
     *            the following characters: number sign (#), colon (:), question
     *            mark (?), backslash (\), and slash (/). The Amazon Pinpoint
     *            console can't display attribute names that contain these
     *            characters. This limitation doesn't apply to attribute values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointUser withUserAttributes(
            java.util.Map<String, java.util.List<String>> userAttributes) {
        this.userAttributes = userAttributes;
        return this;
    }

    /**
     * <p>
     * One or more custom attributes that describe the user by associating a
     * name with an array of values. For example, the value of an attribute
     * named Interests might be: ["science", "music", "travel"]. You can use
     * these attributes as filter criteria when you create segments.
     * </p>
     * <p>
     * When you define the name of a custom attribute, avoid using the following
     * characters: number sign (#), colon (:), question mark (?), backslash (\),
     * and slash (/). The Amazon Pinpoint console can't display attribute names
     * that contain these characters. This limitation doesn't apply to attribute
     * values.
     * </p>
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
     * <p>
     * The unique identifier for the user.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the user.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The unique identifier for the user.
     * </p>
     *
     * @param userId <p>
     *            The unique identifier for the user.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The unique identifier for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userId <p>
     *            The unique identifier for the user.
     *            </p>
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
