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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an identifiable significant activity that affects a replication
 * instance or task. This object can provide the message, the available event
 * categories, the date and source of the event, and the AWS DMS resource type.
 * </p>
 */
public class Event implements Serializable {
    /**
     * <p>
     * The identifier of an event source.
     * </p>
     */
    private String sourceIdentifier;

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | endpoint | replication-task
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>replication-instance
     */
    private String sourceType;

    /**
     * <p>
     * The event message.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The event categories available for the specified source type.
     * </p>
     */
    private java.util.List<String> eventCategories;

    /**
     * <p>
     * The date of the event.
     * </p>
     */
    private java.util.Date dateValue;

    /**
     * <p>
     * The identifier of an event source.
     * </p>
     *
     * @return <p>
     *         The identifier of an event source.
     *         </p>
     */
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    /**
     * <p>
     * The identifier of an event source.
     * </p>
     *
     * @param sourceIdentifier <p>
     *            The identifier of an event source.
     *            </p>
     */
    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * <p>
     * The identifier of an event source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceIdentifier <p>
     *            The identifier of an event source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | endpoint | replication-task
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>replication-instance
     *
     * @return <p>
     *         The type of AWS DMS resource that generates events.
     *         </p>
     *         <p>
     *         Valid values: replication-instance | endpoint | replication-task
     *         </p>
     * @see SourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | endpoint | replication-task
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>replication-instance
     *
     * @param sourceType <p>
     *            The type of AWS DMS resource that generates events.
     *            </p>
     *            <p>
     *            Valid values: replication-instance | endpoint |
     *            replication-task
     *            </p>
     * @see SourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | endpoint | replication-task
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>replication-instance
     *
     * @param sourceType <p>
     *            The type of AWS DMS resource that generates events.
     *            </p>
     *            <p>
     *            Valid values: replication-instance | endpoint |
     *            replication-task
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceType
     */
    public Event withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | endpoint | replication-task
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>replication-instance
     *
     * @param sourceType <p>
     *            The type of AWS DMS resource that generates events.
     *            </p>
     *            <p>
     *            Valid values: replication-instance | endpoint |
     *            replication-task
     *            </p>
     * @see SourceType
     */
    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
    }

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | endpoint | replication-task
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>replication-instance
     *
     * @param sourceType <p>
     *            The type of AWS DMS resource that generates events.
     *            </p>
     *            <p>
     *            Valid values: replication-instance | endpoint |
     *            replication-task
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceType
     */
    public Event withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * The event message.
     * </p>
     *
     * @return <p>
     *         The event message.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The event message.
     * </p>
     *
     * @param message <p>
     *            The event message.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The event message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            The event message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The event categories available for the specified source type.
     * </p>
     *
     * @return <p>
     *         The event categories available for the specified source type.
     *         </p>
     */
    public java.util.List<String> getEventCategories() {
        return eventCategories;
    }

    /**
     * <p>
     * The event categories available for the specified source type.
     * </p>
     *
     * @param eventCategories <p>
     *            The event categories available for the specified source type.
     *            </p>
     */
    public void setEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
            return;
        }

        this.eventCategories = new java.util.ArrayList<String>(eventCategories);
    }

    /**
     * <p>
     * The event categories available for the specified source type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventCategories <p>
     *            The event categories available for the specified source type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withEventCategories(String... eventCategories) {
        if (getEventCategories() == null) {
            this.eventCategories = new java.util.ArrayList<String>(eventCategories.length);
        }
        for (String value : eventCategories) {
            this.eventCategories.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The event categories available for the specified source type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventCategories <p>
     *            The event categories available for the specified source type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withEventCategories(java.util.Collection<String> eventCategories) {
        setEventCategories(eventCategories);
        return this;
    }

    /**
     * <p>
     * The date of the event.
     * </p>
     *
     * @return <p>
     *         The date of the event.
     *         </p>
     */
    public java.util.Date getDate() {
        return dateValue;
    }

    /**
     * <p>
     * The date of the event.
     * </p>
     *
     * @param dateValue <p>
     *            The date of the event.
     *            </p>
     */
    public void setDate(java.util.Date dateValue) {
        this.dateValue = dateValue;
    }

    /**
     * <p>
     * The date of the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateValue <p>
     *            The date of the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withDate(java.util.Date dateValue) {
        this.dateValue = dateValue;
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
        if (getSourceIdentifier() != null)
            sb.append("SourceIdentifier: " + getSourceIdentifier() + ",");
        if (getSourceType() != null)
            sb.append("SourceType: " + getSourceType() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getEventCategories() != null)
            sb.append("EventCategories: " + getEventCategories() + ",");
        if (getDate() != null)
            sb.append("Date: " + getDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceIdentifier() == null) ? 0 : getSourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode
                + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode());
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Event == false)
            return false;
        Event other = (Event) obj;

        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null)
            return false;
        if (other.getSourceIdentifier() != null
                && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null
                && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getEventCategories() == null ^ this.getEventCategories() == null)
            return false;
        if (other.getEventCategories() != null
                && other.getEventCategories().equals(this.getEventCategories()) == false)
            return false;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        return true;
    }
}
