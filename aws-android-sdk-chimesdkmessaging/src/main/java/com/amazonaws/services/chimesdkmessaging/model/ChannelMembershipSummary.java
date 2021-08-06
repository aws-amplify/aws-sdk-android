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
 * Summary of the details of a <code>ChannelMembership</code>.
 * </p>
 */
public class ChannelMembershipSummary implements Serializable {
    /**
     * <p>
     * A member's summary data.
     * </p>
     */
    private Identity member;

    /**
     * <p>
     * A member's summary data.
     * </p>
     *
     * @return <p>
     *         A member's summary data.
     *         </p>
     */
    public Identity getMember() {
        return member;
    }

    /**
     * <p>
     * A member's summary data.
     * </p>
     *
     * @param member <p>
     *            A member's summary data.
     *            </p>
     */
    public void setMember(Identity member) {
        this.member = member;
    }

    /**
     * <p>
     * A member's summary data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param member <p>
     *            A member's summary data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMembershipSummary withMember(Identity member) {
        this.member = member;
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
        if (getMember() != null)
            sb.append("Member: " + getMember());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMember() == null) ? 0 : getMember().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelMembershipSummary == false)
            return false;
        ChannelMembershipSummary other = (ChannelMembershipSummary) obj;

        if (other.getMember() == null ^ this.getMember() == null)
            return false;
        if (other.getMember() != null && other.getMember().equals(this.getMember()) == false)
            return false;
        return true;
    }
}
