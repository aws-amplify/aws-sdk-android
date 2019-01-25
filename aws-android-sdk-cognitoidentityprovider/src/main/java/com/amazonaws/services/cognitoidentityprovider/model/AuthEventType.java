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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The authentication event type.
 * </p>
 */
public class AuthEventType implements Serializable {
    /**
     * <p>
     * The event ID.
     * </p>
     */
    private String eventId;

    /**
     * <p>
     * The event type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SignIn, SignUp, ForgotPassword
     */
    private String eventType;

    /**
     * <p>
     * The creation date
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The event response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure
     */
    private String eventResponse;

    /**
     * <p>
     * The event risk.
     * </p>
     */
    private EventRiskType eventRisk;

    /**
     * <p>
     * The challenge responses.
     * </p>
     */
    private java.util.List<ChallengeResponseType> challengeResponses;

    /**
     * <p>
     * The user context data captured at the time of an event request. It
     * provides additional information about the client from which event the
     * request is received.
     * </p>
     */
    private EventContextDataType eventContextData;

    /**
     * <p>
     * A flag specifying the user feedback captured at the time of an event
     * request is good or bad.
     * </p>
     */
    private EventFeedbackType eventFeedback;

    /**
     * <p>
     * The event ID.
     * </p>
     *
     * @return <p>
     *         The event ID.
     *         </p>
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * <p>
     * The event ID.
     * </p>
     *
     * @param eventId <p>
     *            The event ID.
     *            </p>
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The event ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventId <p>
     *            The event ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthEventType withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SignIn, SignUp, ForgotPassword
     *
     * @return <p>
     *         The event type.
     *         </p>
     * @see EventType
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SignIn, SignUp, ForgotPassword
     *
     * @param eventType <p>
     *            The event type.
     *            </p>
     * @see EventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SignIn, SignUp, ForgotPassword
     *
     * @param eventType <p>
     *            The event type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventType
     */
    public AuthEventType withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SignIn, SignUp, ForgotPassword
     *
     * @param eventType <p>
     *            The event type.
     *            </p>
     * @see EventType
     */
    public void setEventType(EventType eventType) {
        this.eventType = eventType.toString();
    }

    /**
     * <p>
     * The event type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SignIn, SignUp, ForgotPassword
     *
     * @param eventType <p>
     *            The event type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventType
     */
    public AuthEventType withEventType(EventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * The creation date
     * </p>
     *
     * @return <p>
     *         The creation date
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The creation date
     * </p>
     *
     * @param creationDate <p>
     *            The creation date
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The creation date
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthEventType withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The event response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure
     *
     * @return <p>
     *         The event response.
     *         </p>
     * @see EventResponseType
     */
    public String getEventResponse() {
        return eventResponse;
    }

    /**
     * <p>
     * The event response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure
     *
     * @param eventResponse <p>
     *            The event response.
     *            </p>
     * @see EventResponseType
     */
    public void setEventResponse(String eventResponse) {
        this.eventResponse = eventResponse;
    }

    /**
     * <p>
     * The event response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure
     *
     * @param eventResponse <p>
     *            The event response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventResponseType
     */
    public AuthEventType withEventResponse(String eventResponse) {
        this.eventResponse = eventResponse;
        return this;
    }

    /**
     * <p>
     * The event response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure
     *
     * @param eventResponse <p>
     *            The event response.
     *            </p>
     * @see EventResponseType
     */
    public void setEventResponse(EventResponseType eventResponse) {
        this.eventResponse = eventResponse.toString();
    }

    /**
     * <p>
     * The event response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, Failure
     *
     * @param eventResponse <p>
     *            The event response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventResponseType
     */
    public AuthEventType withEventResponse(EventResponseType eventResponse) {
        this.eventResponse = eventResponse.toString();
        return this;
    }

    /**
     * <p>
     * The event risk.
     * </p>
     *
     * @return <p>
     *         The event risk.
     *         </p>
     */
    public EventRiskType getEventRisk() {
        return eventRisk;
    }

    /**
     * <p>
     * The event risk.
     * </p>
     *
     * @param eventRisk <p>
     *            The event risk.
     *            </p>
     */
    public void setEventRisk(EventRiskType eventRisk) {
        this.eventRisk = eventRisk;
    }

    /**
     * <p>
     * The event risk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventRisk <p>
     *            The event risk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthEventType withEventRisk(EventRiskType eventRisk) {
        this.eventRisk = eventRisk;
        return this;
    }

    /**
     * <p>
     * The challenge responses.
     * </p>
     *
     * @return <p>
     *         The challenge responses.
     *         </p>
     */
    public java.util.List<ChallengeResponseType> getChallengeResponses() {
        return challengeResponses;
    }

    /**
     * <p>
     * The challenge responses.
     * </p>
     *
     * @param challengeResponses <p>
     *            The challenge responses.
     *            </p>
     */
    public void setChallengeResponses(java.util.Collection<ChallengeResponseType> challengeResponses) {
        if (challengeResponses == null) {
            this.challengeResponses = null;
            return;
        }

        this.challengeResponses = new java.util.ArrayList<ChallengeResponseType>(challengeResponses);
    }

    /**
     * <p>
     * The challenge responses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param challengeResponses <p>
     *            The challenge responses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthEventType withChallengeResponses(ChallengeResponseType... challengeResponses) {
        if (getChallengeResponses() == null) {
            this.challengeResponses = new java.util.ArrayList<ChallengeResponseType>(
                    challengeResponses.length);
        }
        for (ChallengeResponseType value : challengeResponses) {
            this.challengeResponses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The challenge responses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param challengeResponses <p>
     *            The challenge responses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthEventType withChallengeResponses(
            java.util.Collection<ChallengeResponseType> challengeResponses) {
        setChallengeResponses(challengeResponses);
        return this;
    }

    /**
     * <p>
     * The user context data captured at the time of an event request. It
     * provides additional information about the client from which event the
     * request is received.
     * </p>
     *
     * @return <p>
     *         The user context data captured at the time of an event request.
     *         It provides additional information about the client from which
     *         event the request is received.
     *         </p>
     */
    public EventContextDataType getEventContextData() {
        return eventContextData;
    }

    /**
     * <p>
     * The user context data captured at the time of an event request. It
     * provides additional information about the client from which event the
     * request is received.
     * </p>
     *
     * @param eventContextData <p>
     *            The user context data captured at the time of an event
     *            request. It provides additional information about the client
     *            from which event the request is received.
     *            </p>
     */
    public void setEventContextData(EventContextDataType eventContextData) {
        this.eventContextData = eventContextData;
    }

    /**
     * <p>
     * The user context data captured at the time of an event request. It
     * provides additional information about the client from which event the
     * request is received.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventContextData <p>
     *            The user context data captured at the time of an event
     *            request. It provides additional information about the client
     *            from which event the request is received.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthEventType withEventContextData(EventContextDataType eventContextData) {
        this.eventContextData = eventContextData;
        return this;
    }

    /**
     * <p>
     * A flag specifying the user feedback captured at the time of an event
     * request is good or bad.
     * </p>
     *
     * @return <p>
     *         A flag specifying the user feedback captured at the time of an
     *         event request is good or bad.
     *         </p>
     */
    public EventFeedbackType getEventFeedback() {
        return eventFeedback;
    }

    /**
     * <p>
     * A flag specifying the user feedback captured at the time of an event
     * request is good or bad.
     * </p>
     *
     * @param eventFeedback <p>
     *            A flag specifying the user feedback captured at the time of an
     *            event request is good or bad.
     *            </p>
     */
    public void setEventFeedback(EventFeedbackType eventFeedback) {
        this.eventFeedback = eventFeedback;
    }

    /**
     * <p>
     * A flag specifying the user feedback captured at the time of an event
     * request is good or bad.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventFeedback <p>
     *            A flag specifying the user feedback captured at the time of an
     *            event request is good or bad.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthEventType withEventFeedback(EventFeedbackType eventFeedback) {
        this.eventFeedback = eventFeedback;
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
        if (getEventId() != null)
            sb.append("EventId: " + getEventId() + ",");
        if (getEventType() != null)
            sb.append("EventType: " + getEventType() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getEventResponse() != null)
            sb.append("EventResponse: " + getEventResponse() + ",");
        if (getEventRisk() != null)
            sb.append("EventRisk: " + getEventRisk() + ",");
        if (getChallengeResponses() != null)
            sb.append("ChallengeResponses: " + getChallengeResponses() + ",");
        if (getEventContextData() != null)
            sb.append("EventContextData: " + getEventContextData() + ",");
        if (getEventFeedback() != null)
            sb.append("EventFeedback: " + getEventFeedback());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getEventResponse() == null) ? 0 : getEventResponse().hashCode());
        hashCode = prime * hashCode + ((getEventRisk() == null) ? 0 : getEventRisk().hashCode());
        hashCode = prime * hashCode
                + ((getChallengeResponses() == null) ? 0 : getChallengeResponses().hashCode());
        hashCode = prime * hashCode
                + ((getEventContextData() == null) ? 0 : getEventContextData().hashCode());
        hashCode = prime * hashCode
                + ((getEventFeedback() == null) ? 0 : getEventFeedback().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthEventType == false)
            return false;
        AuthEventType other = (AuthEventType) obj;

        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null
                && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getEventResponse() == null ^ this.getEventResponse() == null)
            return false;
        if (other.getEventResponse() != null
                && other.getEventResponse().equals(this.getEventResponse()) == false)
            return false;
        if (other.getEventRisk() == null ^ this.getEventRisk() == null)
            return false;
        if (other.getEventRisk() != null
                && other.getEventRisk().equals(this.getEventRisk()) == false)
            return false;
        if (other.getChallengeResponses() == null ^ this.getChallengeResponses() == null)
            return false;
        if (other.getChallengeResponses() != null
                && other.getChallengeResponses().equals(this.getChallengeResponses()) == false)
            return false;
        if (other.getEventContextData() == null ^ this.getEventContextData() == null)
            return false;
        if (other.getEventContextData() != null
                && other.getEventContextData().equals(this.getEventContextData()) == false)
            return false;
        if (other.getEventFeedback() == null ^ this.getEventFeedback() == null)
            return false;
        if (other.getEventFeedback() != null
                && other.getEventFeedback().equals(this.getEventFeedback()) == false)
            return false;
        return true;
    }
}
