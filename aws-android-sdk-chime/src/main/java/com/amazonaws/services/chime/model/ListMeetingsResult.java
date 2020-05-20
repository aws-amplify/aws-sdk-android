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

public class ListMeetingsResult implements Serializable {
    /**
     * <p>
     * The Amazon Chime SDK meeting information.
     * </p>
     */
    private java.util.List<Meeting> meetings;

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Chime SDK meeting information.
     * </p>
     *
     * @return <p>
     *         The Amazon Chime SDK meeting information.
     *         </p>
     */
    public java.util.List<Meeting> getMeetings() {
        return meetings;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting information.
     * </p>
     *
     * @param meetings <p>
     *            The Amazon Chime SDK meeting information.
     *            </p>
     */
    public void setMeetings(java.util.Collection<Meeting> meetings) {
        if (meetings == null) {
            this.meetings = null;
            return;
        }

        this.meetings = new java.util.ArrayList<Meeting>(meetings);
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param meetings <p>
     *            The Amazon Chime SDK meeting information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMeetingsResult withMeetings(Meeting... meetings) {
        if (getMeetings() == null) {
            this.meetings = new java.util.ArrayList<Meeting>(meetings.length);
        }
        for (Meeting value : meetings) {
            this.meetings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param meetings <p>
     *            The Amazon Chime SDK meeting information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMeetingsResult withMeetings(java.util.Collection<Meeting> meetings) {
        setMeetings(meetings);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMeetingsResult withNextToken(String nextToken) {
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
        if (getMeetings() != null)
            sb.append("Meetings: " + getMeetings() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeetings() == null) ? 0 : getMeetings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMeetingsResult == false)
            return false;
        ListMeetingsResult other = (ListMeetingsResult) obj;

        if (other.getMeetings() == null ^ this.getMeetings() == null)
            return false;
        if (other.getMeetings() != null && other.getMeetings().equals(this.getMeetings()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
