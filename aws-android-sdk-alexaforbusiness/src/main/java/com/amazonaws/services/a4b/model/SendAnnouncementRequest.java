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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Triggers an asynchronous flow to send text, SSML, or audio announcements to
 * rooms that are identified by a search or filter.
 * </p>
 */
public class SendAnnouncementRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The filters to use to send an announcement to a specified list of rooms.
     * The supported filter keys are RoomName, ProfileName, RoomArn, and
     * ProfileArn. To send to all rooms, specify an empty RoomFilters list.
     * </p>
     */
    private java.util.List<Filter> roomFilters;

    /**
     * <p>
     * The announcement content. This can contain only one of the three possible
     * announcement types (text, SSML or audio).
     * </p>
     */
    private Content content;

    /**
     * <p>
     * The time to live for an announcement. Default is 300. If delivery doesn't
     * occur within this time, the announcement is not delivered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3600<br/>
     */
    private Integer timeToLiveInSeconds;

    /**
     * <p>
     * The unique, user-specified identifier for the request that ensures
     * idempotency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The filters to use to send an announcement to a specified list of rooms.
     * The supported filter keys are RoomName, ProfileName, RoomArn, and
     * ProfileArn. To send to all rooms, specify an empty RoomFilters list.
     * </p>
     *
     * @return <p>
     *         The filters to use to send an announcement to a specified list of
     *         rooms. The supported filter keys are RoomName, ProfileName,
     *         RoomArn, and ProfileArn. To send to all rooms, specify an empty
     *         RoomFilters list.
     *         </p>
     */
    public java.util.List<Filter> getRoomFilters() {
        return roomFilters;
    }

    /**
     * <p>
     * The filters to use to send an announcement to a specified list of rooms.
     * The supported filter keys are RoomName, ProfileName, RoomArn, and
     * ProfileArn. To send to all rooms, specify an empty RoomFilters list.
     * </p>
     *
     * @param roomFilters <p>
     *            The filters to use to send an announcement to a specified list
     *            of rooms. The supported filter keys are RoomName, ProfileName,
     *            RoomArn, and ProfileArn. To send to all rooms, specify an
     *            empty RoomFilters list.
     *            </p>
     */
    public void setRoomFilters(java.util.Collection<Filter> roomFilters) {
        if (roomFilters == null) {
            this.roomFilters = null;
            return;
        }

        this.roomFilters = new java.util.ArrayList<Filter>(roomFilters);
    }

    /**
     * <p>
     * The filters to use to send an announcement to a specified list of rooms.
     * The supported filter keys are RoomName, ProfileName, RoomArn, and
     * ProfileArn. To send to all rooms, specify an empty RoomFilters list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roomFilters <p>
     *            The filters to use to send an announcement to a specified list
     *            of rooms. The supported filter keys are RoomName, ProfileName,
     *            RoomArn, and ProfileArn. To send to all rooms, specify an
     *            empty RoomFilters list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendAnnouncementRequest withRoomFilters(Filter... roomFilters) {
        if (getRoomFilters() == null) {
            this.roomFilters = new java.util.ArrayList<Filter>(roomFilters.length);
        }
        for (Filter value : roomFilters) {
            this.roomFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The filters to use to send an announcement to a specified list of rooms.
     * The supported filter keys are RoomName, ProfileName, RoomArn, and
     * ProfileArn. To send to all rooms, specify an empty RoomFilters list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roomFilters <p>
     *            The filters to use to send an announcement to a specified list
     *            of rooms. The supported filter keys are RoomName, ProfileName,
     *            RoomArn, and ProfileArn. To send to all rooms, specify an
     *            empty RoomFilters list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendAnnouncementRequest withRoomFilters(java.util.Collection<Filter> roomFilters) {
        setRoomFilters(roomFilters);
        return this;
    }

    /**
     * <p>
     * The announcement content. This can contain only one of the three possible
     * announcement types (text, SSML or audio).
     * </p>
     *
     * @return <p>
     *         The announcement content. This can contain only one of the three
     *         possible announcement types (text, SSML or audio).
     *         </p>
     */
    public Content getContent() {
        return content;
    }

    /**
     * <p>
     * The announcement content. This can contain only one of the three possible
     * announcement types (text, SSML or audio).
     * </p>
     *
     * @param content <p>
     *            The announcement content. This can contain only one of the
     *            three possible announcement types (text, SSML or audio).
     *            </p>
     */
    public void setContent(Content content) {
        this.content = content;
    }

    /**
     * <p>
     * The announcement content. This can contain only one of the three possible
     * announcement types (text, SSML or audio).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            The announcement content. This can contain only one of the
     *            three possible announcement types (text, SSML or audio).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendAnnouncementRequest withContent(Content content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * The time to live for an announcement. Default is 300. If delivery doesn't
     * occur within this time, the announcement is not delivered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3600<br/>
     *
     * @return <p>
     *         The time to live for an announcement. Default is 300. If delivery
     *         doesn't occur within this time, the announcement is not
     *         delivered.
     *         </p>
     */
    public Integer getTimeToLiveInSeconds() {
        return timeToLiveInSeconds;
    }

    /**
     * <p>
     * The time to live for an announcement. Default is 300. If delivery doesn't
     * occur within this time, the announcement is not delivered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3600<br/>
     *
     * @param timeToLiveInSeconds <p>
     *            The time to live for an announcement. Default is 300. If
     *            delivery doesn't occur within this time, the announcement is
     *            not delivered.
     *            </p>
     */
    public void setTimeToLiveInSeconds(Integer timeToLiveInSeconds) {
        this.timeToLiveInSeconds = timeToLiveInSeconds;
    }

    /**
     * <p>
     * The time to live for an announcement. Default is 300. If delivery doesn't
     * occur within this time, the announcement is not delivered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3600<br/>
     *
     * @param timeToLiveInSeconds <p>
     *            The time to live for an announcement. Default is 300. If
     *            delivery doesn't occur within this time, the announcement is
     *            not delivered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendAnnouncementRequest withTimeToLiveInSeconds(Integer timeToLiveInSeconds) {
        this.timeToLiveInSeconds = timeToLiveInSeconds;
        return this;
    }

    /**
     * <p>
     * The unique, user-specified identifier for the request that ensures
     * idempotency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         The unique, user-specified identifier for the request that
     *         ensures idempotency.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * The unique, user-specified identifier for the request that ensures
     * idempotency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param clientRequestToken <p>
     *            The unique, user-specified identifier for the request that
     *            ensures idempotency.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The unique, user-specified identifier for the request that ensures
     * idempotency.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param clientRequestToken <p>
     *            The unique, user-specified identifier for the request that
     *            ensures idempotency.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendAnnouncementRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
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
        if (getRoomFilters() != null)
            sb.append("RoomFilters: " + getRoomFilters() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getTimeToLiveInSeconds() != null)
            sb.append("TimeToLiveInSeconds: " + getTimeToLiveInSeconds() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRoomFilters() == null) ? 0 : getRoomFilters().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode
                + ((getTimeToLiveInSeconds() == null) ? 0 : getTimeToLiveInSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendAnnouncementRequest == false)
            return false;
        SendAnnouncementRequest other = (SendAnnouncementRequest) obj;

        if (other.getRoomFilters() == null ^ this.getRoomFilters() == null)
            return false;
        if (other.getRoomFilters() != null
                && other.getRoomFilters().equals(this.getRoomFilters()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getTimeToLiveInSeconds() == null ^ this.getTimeToLiveInSeconds() == null)
            return false;
        if (other.getTimeToLiveInSeconds() != null
                && other.getTimeToLiveInSeconds().equals(this.getTimeToLiveInSeconds()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
