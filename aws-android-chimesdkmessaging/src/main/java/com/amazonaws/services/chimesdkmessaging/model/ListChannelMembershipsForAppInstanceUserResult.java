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

public class ListChannelMembershipsForAppInstanceUserResult implements Serializable {
    /**
     * <p>
     * The token passed by previous API calls until all requested users are
     * returned.
     * </p>
     */
    private java.util.List<ChannelMembershipForAppInstanceUserSummary> channelMemberships;

    /**
     * <p>
     * The token passed by previous API calls until all requested users are
     * returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The token passed by previous API calls until all requested users are
     * returned.
     * </p>
     *
     * @return <p>
     *         The token passed by previous API calls until all requested users
     *         are returned.
     *         </p>
     */
    public java.util.List<ChannelMembershipForAppInstanceUserSummary> getChannelMemberships() {
        return channelMemberships;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested users are
     * returned.
     * </p>
     *
     * @param channelMemberships <p>
     *            The token passed by previous API calls until all requested
     *            users are returned.
     *            </p>
     */
    public void setChannelMemberships(
            java.util.Collection<ChannelMembershipForAppInstanceUserSummary> channelMemberships) {
        if (channelMemberships == null) {
            this.channelMemberships = null;
            return;
        }

        this.channelMemberships = new java.util.ArrayList<ChannelMembershipForAppInstanceUserSummary>(
                channelMemberships);
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested users are
     * returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelMemberships <p>
     *            The token passed by previous API calls until all requested
     *            users are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelMembershipsForAppInstanceUserResult withChannelMemberships(
            ChannelMembershipForAppInstanceUserSummary... channelMemberships) {
        if (getChannelMemberships() == null) {
            this.channelMemberships = new java.util.ArrayList<ChannelMembershipForAppInstanceUserSummary>(
                    channelMemberships.length);
        }
        for (ChannelMembershipForAppInstanceUserSummary value : channelMemberships) {
            this.channelMemberships.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested users are
     * returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelMemberships <p>
     *            The token passed by previous API calls until all requested
     *            users are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelMembershipsForAppInstanceUserResult withChannelMemberships(
            java.util.Collection<ChannelMembershipForAppInstanceUserSummary> channelMemberships) {
        setChannelMemberships(channelMemberships);
        return this;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested users are
     * returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The token passed by previous API calls until all requested users
     *         are returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested users are
     * returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            The token passed by previous API calls until all requested
     *            users are returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested users are
     * returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            The token passed by previous API calls until all requested
     *            users are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelMembershipsForAppInstanceUserResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getChannelMemberships() != null)
            sb.append("ChannelMemberships: " + getChannelMemberships() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChannelMemberships() == null) ? 0 : getChannelMemberships().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChannelMembershipsForAppInstanceUserResult == false)
            return false;
        ListChannelMembershipsForAppInstanceUserResult other = (ListChannelMembershipsForAppInstanceUserResult) obj;

        if (other.getChannelMemberships() == null ^ this.getChannelMemberships() == null)
            return false;
        if (other.getChannelMemberships() != null
                && other.getChannelMemberships().equals(this.getChannelMemberships()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
