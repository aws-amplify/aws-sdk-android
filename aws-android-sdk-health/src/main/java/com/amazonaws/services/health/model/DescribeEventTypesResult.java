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

package com.amazonaws.services.health.model;

import java.io.Serializable;

public class DescribeEventTypesResult implements Serializable {
    /**
     * <p>
     * A list of event types that match the filter criteria. Event types have a
     * category (<code>issue</code>, <code>accountNotification</code>, or
     * <code>scheduledChange</code>), a service (for example, <code>EC2</code>,
     * <code>RDS</code>, <code>DATAPIPELINE</code>, <code>BILLING</code>), and a
     * code (in the format <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>;
     * for example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>).
     * </p>
     */
    private java.util.List<EventType> eventTypes;

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are
     * returned, and a <code>nextToken</code> pagination token is returned in
     * the response. To retrieve the next batch of results, reissue the search
     * request and include the returned token. When all results have been
     * returned, the response does not contain a pagination token value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9=/+_.-]{4,10000}<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of event types that match the filter criteria. Event types have a
     * category (<code>issue</code>, <code>accountNotification</code>, or
     * <code>scheduledChange</code>), a service (for example, <code>EC2</code>,
     * <code>RDS</code>, <code>DATAPIPELINE</code>, <code>BILLING</code>), and a
     * code (in the format <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>;
     * for example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>).
     * </p>
     *
     * @return <p>
     *         A list of event types that match the filter criteria. Event types
     *         have a category (<code>issue</code>,
     *         <code>accountNotification</code>, or <code>scheduledChange</code>
     *         ), a service (for example, <code>EC2</code>, <code>RDS</code>,
     *         <code>DATAPIPELINE</code>, <code>BILLING</code>), and a code (in
     *         the format <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>;
     *         for example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>).
     *         </p>
     */
    public java.util.List<EventType> getEventTypes() {
        return eventTypes;
    }

    /**
     * <p>
     * A list of event types that match the filter criteria. Event types have a
     * category (<code>issue</code>, <code>accountNotification</code>, or
     * <code>scheduledChange</code>), a service (for example, <code>EC2</code>,
     * <code>RDS</code>, <code>DATAPIPELINE</code>, <code>BILLING</code>), and a
     * code (in the format <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>;
     * for example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>).
     * </p>
     *
     * @param eventTypes <p>
     *            A list of event types that match the filter criteria. Event
     *            types have a category (<code>issue</code>,
     *            <code>accountNotification</code>, or
     *            <code>scheduledChange</code>), a service (for example,
     *            <code>EC2</code>, <code>RDS</code>, <code>DATAPIPELINE</code>,
     *            <code>BILLING</code>), and a code (in the format
     *            <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>; for
     *            example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>).
     *            </p>
     */
    public void setEventTypes(java.util.Collection<EventType> eventTypes) {
        if (eventTypes == null) {
            this.eventTypes = null;
            return;
        }

        this.eventTypes = new java.util.ArrayList<EventType>(eventTypes);
    }

    /**
     * <p>
     * A list of event types that match the filter criteria. Event types have a
     * category (<code>issue</code>, <code>accountNotification</code>, or
     * <code>scheduledChange</code>), a service (for example, <code>EC2</code>,
     * <code>RDS</code>, <code>DATAPIPELINE</code>, <code>BILLING</code>), and a
     * code (in the format <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>;
     * for example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventTypes <p>
     *            A list of event types that match the filter criteria. Event
     *            types have a category (<code>issue</code>,
     *            <code>accountNotification</code>, or
     *            <code>scheduledChange</code>), a service (for example,
     *            <code>EC2</code>, <code>RDS</code>, <code>DATAPIPELINE</code>,
     *            <code>BILLING</code>), and a code (in the format
     *            <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>; for
     *            example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventTypesResult withEventTypes(EventType... eventTypes) {
        if (getEventTypes() == null) {
            this.eventTypes = new java.util.ArrayList<EventType>(eventTypes.length);
        }
        for (EventType value : eventTypes) {
            this.eventTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of event types that match the filter criteria. Event types have a
     * category (<code>issue</code>, <code>accountNotification</code>, or
     * <code>scheduledChange</code>), a service (for example, <code>EC2</code>,
     * <code>RDS</code>, <code>DATAPIPELINE</code>, <code>BILLING</code>), and a
     * code (in the format <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>;
     * for example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventTypes <p>
     *            A list of event types that match the filter criteria. Event
     *            types have a category (<code>issue</code>,
     *            <code>accountNotification</code>, or
     *            <code>scheduledChange</code>), a service (for example,
     *            <code>EC2</code>, <code>RDS</code>, <code>DATAPIPELINE</code>,
     *            <code>BILLING</code>), and a code (in the format
     *            <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>; for
     *            example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventTypesResult withEventTypes(java.util.Collection<EventType> eventTypes) {
        setEventTypes(eventTypes);
        return this;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are
     * returned, and a <code>nextToken</code> pagination token is returned in
     * the response. To retrieve the next batch of results, reissue the search
     * request and include the returned token. When all results have been
     * returned, the response does not contain a pagination token value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9=/+_.-]{4,10000}<br/>
     *
     * @return <p>
     *         If the results of a search are large, only a portion of the
     *         results are returned, and a <code>nextToken</code> pagination
     *         token is returned in the response. To retrieve the next batch of
     *         results, reissue the search request and include the returned
     *         token. When all results have been returned, the response does not
     *         contain a pagination token value.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are
     * returned, and a <code>nextToken</code> pagination token is returned in
     * the response. To retrieve the next batch of results, reissue the search
     * request and include the returned token. When all results have been
     * returned, the response does not contain a pagination token value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9=/+_.-]{4,10000}<br/>
     *
     * @param nextToken <p>
     *            If the results of a search are large, only a portion of the
     *            results are returned, and a <code>nextToken</code> pagination
     *            token is returned in the response. To retrieve the next batch
     *            of results, reissue the search request and include the
     *            returned token. When all results have been returned, the
     *            response does not contain a pagination token value.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are
     * returned, and a <code>nextToken</code> pagination token is returned in
     * the response. To retrieve the next batch of results, reissue the search
     * request and include the returned token. When all results have been
     * returned, the response does not contain a pagination token value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9=/+_.-]{4,10000}<br/>
     *
     * @param nextToken <p>
     *            If the results of a search are large, only a portion of the
     *            results are returned, and a <code>nextToken</code> pagination
     *            token is returned in the response. To retrieve the next batch
     *            of results, reissue the search request and include the
     *            returned token. When all results have been returned, the
     *            response does not contain a pagination token value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventTypesResult withNextToken(String nextToken) {
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
        if (getEventTypes() != null)
            sb.append("eventTypes: " + getEventTypes() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventTypes() == null) ? 0 : getEventTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventTypesResult == false)
            return false;
        DescribeEventTypesResult other = (DescribeEventTypesResult) obj;

        if (other.getEventTypes() == null ^ this.getEventTypes() == null)
            return false;
        if (other.getEventTypes() != null
                && other.getEventTypes().equals(this.getEventTypes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
