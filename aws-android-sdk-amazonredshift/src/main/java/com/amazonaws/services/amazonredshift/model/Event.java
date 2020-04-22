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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an event.
 * </p>
 */
public class Event implements Serializable {
    /**
     * <p>
     * The identifier for the source of the event.
     * </p>
     */
    private String sourceIdentifier;

    /**
     * <p>
     * The source type for this event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, cluster-parameter-group,
     * cluster-security-group, cluster-snapshot, scheduled-action
     */
    private String sourceType;

    /**
     * <p>
     * The text of this event.
     * </p>
     */
    private String message;

    /**
     * <p>
     * A list of the event categories.
     * </p>
     * <p>
     * Values: Configuration, Management, Monitoring, Security
     * </p>
     */
    private java.util.List<String> eventCategories;

    /**
     * <p>
     * The severity of the event.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     */
    private String severity;

    /**
     * <p>
     * The date and time of the event.
     * </p>
     */
    private java.util.Date dateValue;

    /**
     * <p>
     * The identifier of the event.
     * </p>
     */
    private String eventId;

    /**
     * <p>
     * The identifier for the source of the event.
     * </p>
     *
     * @return <p>
     *         The identifier for the source of the event.
     *         </p>
     */
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    /**
     * <p>
     * The identifier for the source of the event.
     * </p>
     *
     * @param sourceIdentifier <p>
     *            The identifier for the source of the event.
     *            </p>
     */
    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * <p>
     * The identifier for the source of the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceIdentifier <p>
     *            The identifier for the source of the event.
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
     * The source type for this event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, cluster-parameter-group,
     * cluster-security-group, cluster-snapshot, scheduled-action
     *
     * @return <p>
     *         The source type for this event.
     *         </p>
     * @see SourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * <p>
     * The source type for this event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, cluster-parameter-group,
     * cluster-security-group, cluster-snapshot, scheduled-action
     *
     * @param sourceType <p>
     *            The source type for this event.
     *            </p>
     * @see SourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source type for this event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, cluster-parameter-group,
     * cluster-security-group, cluster-snapshot, scheduled-action
     *
     * @param sourceType <p>
     *            The source type for this event.
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
     * The source type for this event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, cluster-parameter-group,
     * cluster-security-group, cluster-snapshot, scheduled-action
     *
     * @param sourceType <p>
     *            The source type for this event.
     *            </p>
     * @see SourceType
     */
    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
    }

    /**
     * <p>
     * The source type for this event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cluster, cluster-parameter-group,
     * cluster-security-group, cluster-snapshot, scheduled-action
     *
     * @param sourceType <p>
     *            The source type for this event.
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
     * The text of this event.
     * </p>
     *
     * @return <p>
     *         The text of this event.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The text of this event.
     * </p>
     *
     * @param message <p>
     *            The text of this event.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The text of this event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            The text of this event.
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
     * A list of the event categories.
     * </p>
     * <p>
     * Values: Configuration, Management, Monitoring, Security
     * </p>
     *
     * @return <p>
     *         A list of the event categories.
     *         </p>
     *         <p>
     *         Values: Configuration, Management, Monitoring, Security
     *         </p>
     */
    public java.util.List<String> getEventCategories() {
        return eventCategories;
    }

    /**
     * <p>
     * A list of the event categories.
     * </p>
     * <p>
     * Values: Configuration, Management, Monitoring, Security
     * </p>
     *
     * @param eventCategories <p>
     *            A list of the event categories.
     *            </p>
     *            <p>
     *            Values: Configuration, Management, Monitoring, Security
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
     * A list of the event categories.
     * </p>
     * <p>
     * Values: Configuration, Management, Monitoring, Security
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventCategories <p>
     *            A list of the event categories.
     *            </p>
     *            <p>
     *            Values: Configuration, Management, Monitoring, Security
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
     * A list of the event categories.
     * </p>
     * <p>
     * Values: Configuration, Management, Monitoring, Security
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventCategories <p>
     *            A list of the event categories.
     *            </p>
     *            <p>
     *            Values: Configuration, Management, Monitoring, Security
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
     * The severity of the event.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     *
     * @return <p>
     *         The severity of the event.
     *         </p>
     *         <p>
     *         Values: ERROR, INFO
     *         </p>
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * <p>
     * The severity of the event.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     *
     * @param severity <p>
     *            The severity of the event.
     *            </p>
     *            <p>
     *            Values: ERROR, INFO
     *            </p>
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the event.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param severity <p>
     *            The severity of the event.
     *            </p>
     *            <p>
     *            Values: ERROR, INFO
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * <p>
     * The date and time of the event.
     * </p>
     *
     * @return <p>
     *         The date and time of the event.
     *         </p>
     */
    public java.util.Date getDate() {
        return dateValue;
    }

    /**
     * <p>
     * The date and time of the event.
     * </p>
     *
     * @param dateValue <p>
     *            The date and time of the event.
     *            </p>
     */
    public void setDate(java.util.Date dateValue) {
        this.dateValue = dateValue;
    }

    /**
     * <p>
     * The date and time of the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateValue <p>
     *            The date and time of the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withDate(java.util.Date dateValue) {
        this.dateValue = dateValue;
        return this;
    }

    /**
     * <p>
     * The identifier of the event.
     * </p>
     *
     * @return <p>
     *         The identifier of the event.
     *         </p>
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * <p>
     * The identifier of the event.
     * </p>
     *
     * @param eventId <p>
     *            The identifier of the event.
     *            </p>
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The identifier of the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventId <p>
     *            The identifier of the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withEventId(String eventId) {
        this.eventId = eventId;
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
        if (getSeverity() != null)
            sb.append("Severity: " + getSeverity() + ",");
        if (getDate() != null)
            sb.append("Date: " + getDate() + ",");
        if (getEventId() != null)
            sb.append("EventId: " + getEventId());
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
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
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
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        return true;
    }
}
