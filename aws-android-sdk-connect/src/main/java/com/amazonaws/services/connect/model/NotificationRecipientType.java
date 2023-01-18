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
 * The type of notification recipient.
 * </p>
 */
public class NotificationRecipientType implements Serializable {
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }. Amazon
     * Connect users with the specified tags will be notified.
     * </p>
     */
    private java.util.Map<String, String> userTags;

    /**
     * <p>
     * A list of user IDs.
     * </p>
     */
    private java.util.List<String> userIds;

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }. Amazon
     * Connect users with the specified tags will be notified.
     * </p>
     *
     * @return <p>
     *         The tags used to organize, track, or control access for this
     *         resource. For example, { "tags": {"key1":"value1",
     *         "key2":"value2"} }. Amazon Connect users with the specified tags
     *         will be notified.
     *         </p>
     */
    public java.util.Map<String, String> getUserTags() {
        return userTags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }. Amazon
     * Connect users with the specified tags will be notified.
     * </p>
     *
     * @param userTags <p>
     *            The tags used to organize, track, or control access for this
     *            resource. For example, { "tags": {"key1":"value1",
     *            "key2":"value2"} }. Amazon Connect users with the specified
     *            tags will be notified.
     *            </p>
     */
    public void setUserTags(java.util.Map<String, String> userTags) {
        this.userTags = userTags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }. Amazon
     * Connect users with the specified tags will be notified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userTags <p>
     *            The tags used to organize, track, or control access for this
     *            resource. For example, { "tags": {"key1":"value1",
     *            "key2":"value2"} }. Amazon Connect users with the specified
     *            tags will be notified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationRecipientType withUserTags(java.util.Map<String, String> userTags) {
        this.userTags = userTags;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }. Amazon
     * Connect users with the specified tags will be notified.
     * </p>
     * <p>
     * The method adds a new key-value pair into UserTags parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into UserTags.
     * @param value The corresponding value of the entry to be added into
     *            UserTags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationRecipientType addUserTagsEntry(String key, String value) {
        if (null == this.userTags) {
            this.userTags = new java.util.HashMap<String, String>();
        }
        if (this.userTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.userTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UserTags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public NotificationRecipientType clearUserTagsEntries() {
        this.userTags = null;
        return this;
    }

    /**
     * <p>
     * A list of user IDs.
     * </p>
     *
     * @return <p>
     *         A list of user IDs.
     *         </p>
     */
    public java.util.List<String> getUserIds() {
        return userIds;
    }

    /**
     * <p>
     * A list of user IDs.
     * </p>
     *
     * @param userIds <p>
     *            A list of user IDs.
     *            </p>
     */
    public void setUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
            return;
        }

        this.userIds = new java.util.ArrayList<String>(userIds);
    }

    /**
     * <p>
     * A list of user IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIds <p>
     *            A list of user IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationRecipientType withUserIds(String... userIds) {
        if (getUserIds() == null) {
            this.userIds = new java.util.ArrayList<String>(userIds.length);
        }
        for (String value : userIds) {
            this.userIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of user IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIds <p>
     *            A list of user IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationRecipientType withUserIds(java.util.Collection<String> userIds) {
        setUserIds(userIds);
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
        if (getUserTags() != null)
            sb.append("UserTags: " + getUserTags() + ",");
        if (getUserIds() != null)
            sb.append("UserIds: " + getUserIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserTags() == null) ? 0 : getUserTags().hashCode());
        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationRecipientType == false)
            return false;
        NotificationRecipientType other = (NotificationRecipientType) obj;

        if (other.getUserTags() == null ^ this.getUserTags() == null)
            return false;
        if (other.getUserTags() != null && other.getUserTags().equals(this.getUserTags()) == false)
            return false;
        if (other.getUserIds() == null ^ this.getUserIds() == null)
            return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false)
            return false;
        return true;
    }
}
