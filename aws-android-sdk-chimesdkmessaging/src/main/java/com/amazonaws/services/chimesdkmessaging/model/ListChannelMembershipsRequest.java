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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists all channel memberships in a channel.
 * </p>
 * <note>
 * <p>
 * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
 * <code>AppInstanceUserArn</code> of the user that makes the API call as the
 * value in the header.
 * </p>
 * </note>
 * <p>
 * If you want to list the channels to which a specific app instance user
 * belongs, see the <a href=
 * "https://docs.aws.amazon.com/chime/latest/APIReference/API_messaging-chime_ListChannelMembershipsForAppInstanceUser.html"
 * >ListChannelMembershipsForAppInstanceUser</a> API.
 * </p>
 */
public class ListChannelMembershipsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The maximum number of channel memberships that you want returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String channelArn;

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or
     * <code>HIDDEN</code>. Default members are returned as part of
     * <code>ListChannelMemberships</code> if no type is specified. Hidden
     * members are only returned if the type filter in
     * <code>ListChannelMemberships</code> equals <code>HIDDEN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     */
    private String type;

    /**
     * <p>
     * The maximum number of channel memberships that you want returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token passed by previous API calls until all requested channel
     * memberships are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String chimeBearer;

    /**
     * <p>
     * The maximum number of channel memberships that you want returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The maximum number of channel memberships that you want returned.
     *         </p>
     */
    public String getChannelArn() {
        return channelArn;
    }

    /**
     * <p>
     * The maximum number of channel memberships that you want returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param channelArn <p>
     *            The maximum number of channel memberships that you want
     *            returned.
     *            </p>
     */
    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The maximum number of channel memberships that you want returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param channelArn <p>
     *            The maximum number of channel memberships that you want
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelMembershipsRequest withChannelArn(String channelArn) {
        this.channelArn = channelArn;
        return this;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or
     * <code>HIDDEN</code>. Default members are returned as part of
     * <code>ListChannelMemberships</code> if no type is specified. Hidden
     * members are only returned if the type filter in
     * <code>ListChannelMemberships</code> equals <code>HIDDEN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @return <p>
     *         The membership type of a user, <code>DEFAULT</code> or
     *         <code>HIDDEN</code>. Default members are returned as part of
     *         <code>ListChannelMemberships</code> if no type is specified.
     *         Hidden members are only returned if the type filter in
     *         <code>ListChannelMemberships</code> equals <code>HIDDEN</code>.
     *         </p>
     * @see ChannelMembershipType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or
     * <code>HIDDEN</code>. Default members are returned as part of
     * <code>ListChannelMemberships</code> if no type is specified. Hidden
     * members are only returned if the type filter in
     * <code>ListChannelMemberships</code> equals <code>HIDDEN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership type of a user, <code>DEFAULT</code> or
     *            <code>HIDDEN</code>. Default members are returned as part of
     *            <code>ListChannelMemberships</code> if no type is specified.
     *            Hidden members are only returned if the type filter in
     *            <code>ListChannelMemberships</code> equals <code>HIDDEN</code>
     *            .
     *            </p>
     * @see ChannelMembershipType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or
     * <code>HIDDEN</code>. Default members are returned as part of
     * <code>ListChannelMemberships</code> if no type is specified. Hidden
     * members are only returned if the type filter in
     * <code>ListChannelMemberships</code> equals <code>HIDDEN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership type of a user, <code>DEFAULT</code> or
     *            <code>HIDDEN</code>. Default members are returned as part of
     *            <code>ListChannelMemberships</code> if no type is specified.
     *            Hidden members are only returned if the type filter in
     *            <code>ListChannelMemberships</code> equals <code>HIDDEN</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMembershipType
     */
    public ListChannelMembershipsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or
     * <code>HIDDEN</code>. Default members are returned as part of
     * <code>ListChannelMemberships</code> if no type is specified. Hidden
     * members are only returned if the type filter in
     * <code>ListChannelMemberships</code> equals <code>HIDDEN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership type of a user, <code>DEFAULT</code> or
     *            <code>HIDDEN</code>. Default members are returned as part of
     *            <code>ListChannelMemberships</code> if no type is specified.
     *            Hidden members are only returned if the type filter in
     *            <code>ListChannelMemberships</code> equals <code>HIDDEN</code>
     *            .
     *            </p>
     * @see ChannelMembershipType
     */
    public void setType(ChannelMembershipType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or
     * <code>HIDDEN</code>. Default members are returned as part of
     * <code>ListChannelMemberships</code> if no type is specified. Hidden
     * members are only returned if the type filter in
     * <code>ListChannelMemberships</code> equals <code>HIDDEN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, HIDDEN
     *
     * @param type <p>
     *            The membership type of a user, <code>DEFAULT</code> or
     *            <code>HIDDEN</code>. Default members are returned as part of
     *            <code>ListChannelMemberships</code> if no type is specified.
     *            Hidden members are only returned if the type filter in
     *            <code>ListChannelMemberships</code> equals <code>HIDDEN</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelMembershipType
     */
    public ListChannelMembershipsRequest withType(ChannelMembershipType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of channel memberships that you want returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         The maximum number of channel memberships that you want returned.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of channel memberships that you want returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of channel memberships that you want
     *            returned.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of channel memberships that you want returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of channel memberships that you want
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelMembershipsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested channel
     * memberships are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The token passed by previous API calls until all requested
     *         channel memberships are returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested channel
     * memberships are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            The token passed by previous API calls until all requested
     *            channel memberships are returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested channel
     * memberships are returned.
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
     *            channel memberships are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelMembershipsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The <code>AppInstanceUserArn</code> of the user that makes the
     *         API call.
     *         </p>
     */
    public String getChimeBearer() {
        return chimeBearer;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param chimeBearer <p>
     *            The <code>AppInstanceUserArn</code> of the user that makes the
     *            API call.
     *            </p>
     */
    public void setChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param chimeBearer <p>
     *            The <code>AppInstanceUserArn</code> of the user that makes the
     *            API call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListChannelMembershipsRequest withChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: " + getChannelArn() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getChimeBearer() != null)
            sb.append("ChimeBearer: " + getChimeBearer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getChimeBearer() == null) ? 0 : getChimeBearer().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChannelMembershipsRequest == false)
            return false;
        ListChannelMembershipsRequest other = (ListChannelMembershipsRequest) obj;

        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null
                && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getChimeBearer() == null ^ this.getChimeBearer() == null)
            return false;
        if (other.getChimeBearer() != null
                && other.getChimeBearer().equals(this.getChimeBearer()) == false)
            return false;
        return true;
    }
}
