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

/**
 * <p>
 * The Amazon Chime SDK attendee fields to create, used with the
 * BatchCreateAttendee action.
 * </p>
 */
public class CreateAttendeeRequestItem implements Serializable {
    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity
     * managed by a builder application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     */
    private String externalUserId;

    /**
     * <p>
     * The tag key-value pairs.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity
     * managed by a builder application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     *
     * @return <p>
     *         The Amazon Chime SDK external user ID. Links the attendee to an
     *         identity managed by a builder application.
     *         </p>
     */
    public String getExternalUserId() {
        return externalUserId;
    }

    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity
     * managed by a builder application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     *
     * @param externalUserId <p>
     *            The Amazon Chime SDK external user ID. Links the attendee to
     *            an identity managed by a builder application.
     *            </p>
     */
    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
    }

    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity
     * managed by a builder application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     *
     * @param externalUserId <p>
     *            The Amazon Chime SDK external user ID. Links the attendee to
     *            an identity managed by a builder application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAttendeeRequestItem withExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }

    /**
     * <p>
     * The tag key-value pairs.
     * </p>
     *
     * @return <p>
     *         The tag key-value pairs.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag key-value pairs.
     * </p>
     *
     * @param tags <p>
     *            The tag key-value pairs.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag key-value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag key-value pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAttendeeRequestItem withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tag key-value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag key-value pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAttendeeRequestItem withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getExternalUserId() != null)
            sb.append("ExternalUserId: " + getExternalUserId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExternalUserId() == null) ? 0 : getExternalUserId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAttendeeRequestItem == false)
            return false;
        CreateAttendeeRequestItem other = (CreateAttendeeRequestItem) obj;

        if (other.getExternalUserId() == null ^ this.getExternalUserId() == null)
            return false;
        if (other.getExternalUserId() != null
                && other.getExternalUserId().equals(this.getExternalUserId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
