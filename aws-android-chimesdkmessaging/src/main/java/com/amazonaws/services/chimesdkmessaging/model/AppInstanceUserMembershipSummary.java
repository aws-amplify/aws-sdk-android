/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

/**
 * <p>
 * Summary of the membership details of an <code>AppInstanceUser</code>.
 * </p>
 */
public class AppInstanceUserMembershipSummary implements Serializable {
    /**
     * <p>
     * The type of <code>ChannelMembership</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     */
    private String type;

    /**
     * <p>
     * The time at which a message was last read.
     * </p>
     */
    private java.util.Date readMarkerTimestamp;

    /**
     * <p>
     * The type of <code>ChannelMembership</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @return <p>
     *         The type of <code>ChannelMembership</code>.
     *         </p>
     * @see ChannelMembershipType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of <code>ChannelMembership</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The type of <code>ChannelMembership</code>.
     *            </p>
     * @see ChannelMembershipType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of <code>ChannelMembership</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The type of <code>ChannelMembership</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMembershipType
     */
    public AppInstanceUserMembershipSummary withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of <code>ChannelMembership</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The type of <code>ChannelMembership</code>.
     *            </p>
     * @see ChannelMembershipType
     */
    public void setType(ChannelMembershipType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of <code>ChannelMembership</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The type of <code>ChannelMembership</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMembershipType
     */
    public AppInstanceUserMembershipSummary withType(ChannelMembershipType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The time at which a message was last read.
     * </p>
     *
     * @return <p>
     *         The time at which a message was last read.
     *         </p>
     */
    public java.util.Date getReadMarkerTimestamp() {
        return readMarkerTimestamp;
    }

    /**
     * <p>
     * The time at which a message was last read.
     * </p>
     *
     * @param readMarkerTimestamp <p>
     *            The time at which a message was last read.
     *            </p>
     */
    public void setReadMarkerTimestamp(java.util.Date readMarkerTimestamp) {
        this.readMarkerTimestamp = readMarkerTimestamp;
    }

    /**
     * <p>
     * The time at which a message was last read.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readMarkerTimestamp <p>
     *            The time at which a message was last read.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppInstanceUserMembershipSummary withReadMarkerTimestamp(
            java.util.Date readMarkerTimestamp) {
        this.readMarkerTimestamp = readMarkerTimestamp;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getReadMarkerTimestamp() != null)
            sb.append("ReadMarkerTimestamp: " + getReadMarkerTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getReadMarkerTimestamp() == null) ? 0 : getReadMarkerTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppInstanceUserMembershipSummary == false)
            return false;
        AppInstanceUserMembershipSummary other = (AppInstanceUserMembershipSummary) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getReadMarkerTimestamp() == null ^ this.getReadMarkerTimestamp() == null)
            return false;
        if (other.getReadMarkerTimestamp() != null
                && other.getReadMarkerTimestamp().equals(this.getReadMarkerTimestamp()) == false)
            return false;
        return true;
    }
}
