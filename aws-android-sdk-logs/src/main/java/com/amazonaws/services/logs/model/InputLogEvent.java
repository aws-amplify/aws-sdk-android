/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents a log event, which is a record of activity that was recorded by
 * the application or resource being monitored.
 * </p>
 */
public class InputLogEvent implements Serializable {
    /**
     * <p>
     * The time the event occurred, expressed as the number of milliseconds
     * since Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long timestamp;

    /**
     * <p>
     * The raw event message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String message;

    /**
     * <p>
     * The time the event occurred, expressed as the number of milliseconds
     * since Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The time the event occurred, expressed as the number of
     *         milliseconds since Jan 1, 1970 00:00:00 UTC.
     *         </p>
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The time the event occurred, expressed as the number of milliseconds
     * since Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param timestamp <p>
     *            The time the event occurred, expressed as the number of
     *            milliseconds since Jan 1, 1970 00:00:00 UTC.
     *            </p>
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time the event occurred, expressed as the number of milliseconds
     * since Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param timestamp <p>
     *            The time the event occurred, expressed as the number of
     *            milliseconds since Jan 1, 1970 00:00:00 UTC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputLogEvent withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * The raw event message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The raw event message.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The raw event message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param message <p>
     *            The raw event message.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The raw event message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param message <p>
     *            The raw event message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputLogEvent withMessage(String message) {
        this.message = message;
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
        if (getTimestamp() != null)
            sb.append("timestamp: " + getTimestamp() + ",");
        if (getMessage() != null)
            sb.append("message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputLogEvent == false)
            return false;
        InputLogEvent other = (InputLogEvent) obj;

        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
