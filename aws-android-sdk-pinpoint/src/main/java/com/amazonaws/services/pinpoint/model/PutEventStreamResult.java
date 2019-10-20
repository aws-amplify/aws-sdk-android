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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class PutEventStreamResult implements Serializable {
    /**
     * <p>
     * Specifies settings for publishing event data to an Amazon Kinesis data
     * stream or an Amazon Kinesis Data Firehose delivery stream.
     * </p>
     */
    private EventStream eventStream;

    /**
     * <p>
     * Specifies settings for publishing event data to an Amazon Kinesis data
     * stream or an Amazon Kinesis Data Firehose delivery stream.
     * </p>
     *
     * @return <p>
     *         Specifies settings for publishing event data to an Amazon Kinesis
     *         data stream or an Amazon Kinesis Data Firehose delivery stream.
     *         </p>
     */
    public EventStream getEventStream() {
        return eventStream;
    }

    /**
     * <p>
     * Specifies settings for publishing event data to an Amazon Kinesis data
     * stream or an Amazon Kinesis Data Firehose delivery stream.
     * </p>
     *
     * @param eventStream <p>
     *            Specifies settings for publishing event data to an Amazon
     *            Kinesis data stream or an Amazon Kinesis Data Firehose
     *            delivery stream.
     *            </p>
     */
    public void setEventStream(EventStream eventStream) {
        this.eventStream = eventStream;
    }

    /**
     * <p>
     * Specifies settings for publishing event data to an Amazon Kinesis data
     * stream or an Amazon Kinesis Data Firehose delivery stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventStream <p>
     *            Specifies settings for publishing event data to an Amazon
     *            Kinesis data stream or an Amazon Kinesis Data Firehose
     *            delivery stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutEventStreamResult withEventStream(EventStream eventStream) {
        this.eventStream = eventStream;
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
        if (getEventStream() != null)
            sb.append("EventStream: " + getEventStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventStream() == null) ? 0 : getEventStream().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEventStreamResult == false)
            return false;
        PutEventStreamResult other = (PutEventStreamResult) obj;

        if (other.getEventStream() == null ^ this.getEventStream() == null)
            return false;
        if (other.getEventStream() != null
                && other.getEventStream().equals(this.getEventStream()) == false)
            return false;
        return true;
    }
}
