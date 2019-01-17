/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

public class PutLogEventsResult implements Serializable {
    /**
     * <p>
     * The next sequence token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextSequenceToken;

    /**
     * <p>
     * The rejected events.
     * </p>
     */
    private RejectedLogEventsInfo rejectedLogEventsInfo;

    /**
     * <p>
     * The next sequence token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The next sequence token.
     *         </p>
     */
    public String getNextSequenceToken() {
        return nextSequenceToken;
    }

    /**
     * <p>
     * The next sequence token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextSequenceToken <p>
     *            The next sequence token.
     *            </p>
     */
    public void setNextSequenceToken(String nextSequenceToken) {
        this.nextSequenceToken = nextSequenceToken;
    }

    /**
     * <p>
     * The next sequence token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextSequenceToken <p>
     *            The next sequence token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLogEventsResult withNextSequenceToken(String nextSequenceToken) {
        this.nextSequenceToken = nextSequenceToken;
        return this;
    }

    /**
     * <p>
     * The rejected events.
     * </p>
     *
     * @return <p>
     *         The rejected events.
     *         </p>
     */
    public RejectedLogEventsInfo getRejectedLogEventsInfo() {
        return rejectedLogEventsInfo;
    }

    /**
     * <p>
     * The rejected events.
     * </p>
     *
     * @param rejectedLogEventsInfo <p>
     *            The rejected events.
     *            </p>
     */
    public void setRejectedLogEventsInfo(RejectedLogEventsInfo rejectedLogEventsInfo) {
        this.rejectedLogEventsInfo = rejectedLogEventsInfo;
    }

    /**
     * <p>
     * The rejected events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rejectedLogEventsInfo <p>
     *            The rejected events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLogEventsResult withRejectedLogEventsInfo(RejectedLogEventsInfo rejectedLogEventsInfo) {
        this.rejectedLogEventsInfo = rejectedLogEventsInfo;
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
        if (getNextSequenceToken() != null)
            sb.append("nextSequenceToken: " + getNextSequenceToken() + ",");
        if (getRejectedLogEventsInfo() != null)
            sb.append("rejectedLogEventsInfo: " + getRejectedLogEventsInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNextSequenceToken() == null) ? 0 : getNextSequenceToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getRejectedLogEventsInfo() == null) ? 0 : getRejectedLogEventsInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLogEventsResult == false)
            return false;
        PutLogEventsResult other = (PutLogEventsResult) obj;

        if (other.getNextSequenceToken() == null ^ this.getNextSequenceToken() == null)
            return false;
        if (other.getNextSequenceToken() != null
                && other.getNextSequenceToken().equals(this.getNextSequenceToken()) == false)
            return false;
        if (other.getRejectedLogEventsInfo() == null ^ this.getRejectedLogEventsInfo() == null)
            return false;
        if (other.getRejectedLogEventsInfo() != null
                && other.getRejectedLogEventsInfo().equals(this.getRejectedLogEventsInfo()) == false)
            return false;
        return true;
    }
}
