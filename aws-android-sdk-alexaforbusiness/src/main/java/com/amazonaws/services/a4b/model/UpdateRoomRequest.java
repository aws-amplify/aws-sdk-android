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
 * Updates room details by room ARN.
 * </p>
 */
public class UpdateRoomRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the room to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String roomArn;

    /**
     * <p>
     * The updated name for the room.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String roomName;

    /**
     * <p>
     * The updated description for the room.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String description;

    /**
     * <p>
     * The updated provider calendar ARN for the room.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private String providerCalendarId;

    /**
     * <p>
     * The updated profile ARN for the room.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String profileArn;

    /**
     * <p>
     * The ARN of the room to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the room to update.
     *         </p>
     */
    public String getRoomArn() {
        return roomArn;
    }

    /**
     * <p>
     * The ARN of the room to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roomArn <p>
     *            The ARN of the room to update.
     *            </p>
     */
    public void setRoomArn(String roomArn) {
        this.roomArn = roomArn;
    }

    /**
     * <p>
     * The ARN of the room to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roomArn <p>
     *            The ARN of the room to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRoomRequest withRoomArn(String roomArn) {
        this.roomArn = roomArn;
        return this;
    }

    /**
     * <p>
     * The updated name for the room.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The updated name for the room.
     *         </p>
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * <p>
     * The updated name for the room.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param roomName <p>
     *            The updated name for the room.
     *            </p>
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * <p>
     * The updated name for the room.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param roomName <p>
     *            The updated name for the room.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRoomRequest withRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    /**
     * <p>
     * The updated description for the room.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The updated description for the room.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The updated description for the room.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param description <p>
     *            The updated description for the room.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description for the room.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param description <p>
     *            The updated description for the room.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRoomRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The updated provider calendar ARN for the room.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         The updated provider calendar ARN for the room.
     *         </p>
     */
    public String getProviderCalendarId() {
        return providerCalendarId;
    }

    /**
     * <p>
     * The updated provider calendar ARN for the room.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param providerCalendarId <p>
     *            The updated provider calendar ARN for the room.
     *            </p>
     */
    public void setProviderCalendarId(String providerCalendarId) {
        this.providerCalendarId = providerCalendarId;
    }

    /**
     * <p>
     * The updated provider calendar ARN for the room.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param providerCalendarId <p>
     *            The updated provider calendar ARN for the room.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRoomRequest withProviderCalendarId(String providerCalendarId) {
        this.providerCalendarId = providerCalendarId;
        return this;
    }

    /**
     * <p>
     * The updated profile ARN for the room.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The updated profile ARN for the room.
     *         </p>
     */
    public String getProfileArn() {
        return profileArn;
    }

    /**
     * <p>
     * The updated profile ARN for the room.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param profileArn <p>
     *            The updated profile ARN for the room.
     *            </p>
     */
    public void setProfileArn(String profileArn) {
        this.profileArn = profileArn;
    }

    /**
     * <p>
     * The updated profile ARN for the room.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param profileArn <p>
     *            The updated profile ARN for the room.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRoomRequest withProfileArn(String profileArn) {
        this.profileArn = profileArn;
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
        if (getRoomArn() != null)
            sb.append("RoomArn: " + getRoomArn() + ",");
        if (getRoomName() != null)
            sb.append("RoomName: " + getRoomName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getProviderCalendarId() != null)
            sb.append("ProviderCalendarId: " + getProviderCalendarId() + ",");
        if (getProfileArn() != null)
            sb.append("ProfileArn: " + getProfileArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        hashCode = prime * hashCode + ((getRoomName() == null) ? 0 : getRoomName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getProviderCalendarId() == null) ? 0 : getProviderCalendarId().hashCode());
        hashCode = prime * hashCode + ((getProfileArn() == null) ? 0 : getProfileArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRoomRequest == false)
            return false;
        UpdateRoomRequest other = (UpdateRoomRequest) obj;

        if (other.getRoomArn() == null ^ this.getRoomArn() == null)
            return false;
        if (other.getRoomArn() != null && other.getRoomArn().equals(this.getRoomArn()) == false)
            return false;
        if (other.getRoomName() == null ^ this.getRoomName() == null)
            return false;
        if (other.getRoomName() != null && other.getRoomName().equals(this.getRoomName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getProviderCalendarId() == null ^ this.getProviderCalendarId() == null)
            return false;
        if (other.getProviderCalendarId() != null
                && other.getProviderCalendarId().equals(this.getProviderCalendarId()) == false)
            return false;
        if (other.getProfileArn() == null ^ this.getProfileArn() == null)
            return false;
        if (other.getProfileArn() != null
                && other.getProfileArn().equals(this.getProfileArn()) == false)
            return false;
        return true;
    }
}
