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

public class GetMeetingResult implements Serializable {
    /**
     * <p>
     * The Amazon Chime SDK meeting information.
     * </p>
     */
    private Meeting meeting;

    /**
     * <p>
     * The Amazon Chime SDK meeting information.
     * </p>
     *
     * @return <p>
     *         The Amazon Chime SDK meeting information.
     *         </p>
     */
    public Meeting getMeeting() {
        return meeting;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting information.
     * </p>
     *
     * @param meeting <p>
     *            The Amazon Chime SDK meeting information.
     *            </p>
     */
    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param meeting <p>
     *            The Amazon Chime SDK meeting information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMeetingResult withMeeting(Meeting meeting) {
        this.meeting = meeting;
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
        if (getMeeting() != null)
            sb.append("Meeting: " + getMeeting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeeting() == null) ? 0 : getMeeting().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMeetingResult == false)
            return false;
        GetMeetingResult other = (GetMeetingResult) obj;

        if (other.getMeeting() == null ^ this.getMeeting() == null)
            return false;
        if (other.getMeeting() != null && other.getMeeting().equals(this.getMeeting()) == false)
            return false;
        return true;
    }
}
