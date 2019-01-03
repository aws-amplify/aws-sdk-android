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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides the feedback for an authentication event whether it was from a valid
 * user or not. This feedback is used for improving the risk evaluation decision
 * for the user pool as part of Amazon Cognito advanced security.
 * </p>
 */
public class UpdateAuthEventFeedbackRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The user pool username.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * <p>
     * The event ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w+-]+<br/>
     */
    private String eventId;

    /**
     * <p>
     * The feedback token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     */
    private String feedbackToken;

    /**
     * <p>
     * The authentication event feedback value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Valid, Invalid
     */
    private String feedbackValue;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuthEventFeedbackRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The user pool username.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The user pool username.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user pool username.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The user pool username.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user pool username.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The user pool username.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuthEventFeedbackRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * The event ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w+-]+<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w+-]+<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w+-]+<br/>
     *
     * @param eventId <p>
     *            The event ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuthEventFeedbackRequest withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * <p>
     * The feedback token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @return <p>
     *         The feedback token.
     *         </p>
     */
    public String getFeedbackToken() {
        return feedbackToken;
    }

    /**
     * <p>
     * The feedback token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param feedbackToken <p>
     *            The feedback token.
     *            </p>
     */
    public void setFeedbackToken(String feedbackToken) {
        this.feedbackToken = feedbackToken;
    }

    /**
     * <p>
     * The feedback token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param feedbackToken <p>
     *            The feedback token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuthEventFeedbackRequest withFeedbackToken(String feedbackToken) {
        this.feedbackToken = feedbackToken;
        return this;
    }

    /**
     * <p>
     * The authentication event feedback value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Valid, Invalid
     *
     * @return <p>
     *         The authentication event feedback value.
     *         </p>
     * @see FeedbackValueType
     */
    public String getFeedbackValue() {
        return feedbackValue;
    }

    /**
     * <p>
     * The authentication event feedback value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Valid, Invalid
     *
     * @param feedbackValue <p>
     *            The authentication event feedback value.
     *            </p>
     * @see FeedbackValueType
     */
    public void setFeedbackValue(String feedbackValue) {
        this.feedbackValue = feedbackValue;
    }

    /**
     * <p>
     * The authentication event feedback value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Valid, Invalid
     *
     * @param feedbackValue <p>
     *            The authentication event feedback value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FeedbackValueType
     */
    public UpdateAuthEventFeedbackRequest withFeedbackValue(String feedbackValue) {
        this.feedbackValue = feedbackValue;
        return this;
    }

    /**
     * <p>
     * The authentication event feedback value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Valid, Invalid
     *
     * @param feedbackValue <p>
     *            The authentication event feedback value.
     *            </p>
     * @see FeedbackValueType
     */
    public void setFeedbackValue(FeedbackValueType feedbackValue) {
        this.feedbackValue = feedbackValue.toString();
    }

    /**
     * <p>
     * The authentication event feedback value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Valid, Invalid
     *
     * @param feedbackValue <p>
     *            The authentication event feedback value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FeedbackValueType
     */
    public UpdateAuthEventFeedbackRequest withFeedbackValue(FeedbackValueType feedbackValue) {
        this.feedbackValue = feedbackValue.toString();
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getEventId() != null)
            sb.append("EventId: " + getEventId() + ",");
        if (getFeedbackToken() != null)
            sb.append("FeedbackToken: " + getFeedbackToken() + ",");
        if (getFeedbackValue() != null)
            sb.append("FeedbackValue: " + getFeedbackValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode
                + ((getFeedbackToken() == null) ? 0 : getFeedbackToken().hashCode());
        hashCode = prime * hashCode
                + ((getFeedbackValue() == null) ? 0 : getFeedbackValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAuthEventFeedbackRequest == false)
            return false;
        UpdateAuthEventFeedbackRequest other = (UpdateAuthEventFeedbackRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getFeedbackToken() == null ^ this.getFeedbackToken() == null)
            return false;
        if (other.getFeedbackToken() != null
                && other.getFeedbackToken().equals(this.getFeedbackToken()) == false)
            return false;
        if (other.getFeedbackValue() == null ^ this.getFeedbackValue() == null)
            return false;
        if (other.getFeedbackValue() != null
                && other.getFeedbackValue().equals(this.getFeedbackValue()) == false)
            return false;
        return true;
    }
}
