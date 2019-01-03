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
 * Specifies the event feedback type.
 * </p>
 */
public class EventFeedbackType implements Serializable {
    /**
     * <p>
     * The event feedback value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Valid, Invalid
     */
    private String feedbackValue;

    /**
     * <p>
     * The provider.
     * </p>
     */
    private String provider;

    /**
     * <p>
     * The event feedback date.
     * </p>
     */
    private java.util.Date feedbackDate;

    /**
     * <p>
     * The event feedback value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Valid, Invalid
     *
     * @return <p>
     *         The event feedback value.
     *         </p>
     * @see FeedbackValueType
     */
    public String getFeedbackValue() {
        return feedbackValue;
    }

    /**
     * <p>
     * The event feedback value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Valid, Invalid
     *
     * @param feedbackValue <p>
     *            The event feedback value.
     *            </p>
     * @see FeedbackValueType
     */
    public void setFeedbackValue(String feedbackValue) {
        this.feedbackValue = feedbackValue;
    }

    /**
     * <p>
     * The event feedback value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Valid, Invalid
     *
     * @param feedbackValue <p>
     *            The event feedback value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FeedbackValueType
     */
    public EventFeedbackType withFeedbackValue(String feedbackValue) {
        this.feedbackValue = feedbackValue;
        return this;
    }

    /**
     * <p>
     * The event feedback value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Valid, Invalid
     *
     * @param feedbackValue <p>
     *            The event feedback value.
     *            </p>
     * @see FeedbackValueType
     */
    public void setFeedbackValue(FeedbackValueType feedbackValue) {
        this.feedbackValue = feedbackValue.toString();
    }

    /**
     * <p>
     * The event feedback value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Valid, Invalid
     *
     * @param feedbackValue <p>
     *            The event feedback value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FeedbackValueType
     */
    public EventFeedbackType withFeedbackValue(FeedbackValueType feedbackValue) {
        this.feedbackValue = feedbackValue.toString();
        return this;
    }

    /**
     * <p>
     * The provider.
     * </p>
     *
     * @return <p>
     *         The provider.
     *         </p>
     */
    public String getProvider() {
        return provider;
    }

    /**
     * <p>
     * The provider.
     * </p>
     *
     * @param provider <p>
     *            The provider.
     *            </p>
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provider <p>
     *            The provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFeedbackType withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * <p>
     * The event feedback date.
     * </p>
     *
     * @return <p>
     *         The event feedback date.
     *         </p>
     */
    public java.util.Date getFeedbackDate() {
        return feedbackDate;
    }

    /**
     * <p>
     * The event feedback date.
     * </p>
     *
     * @param feedbackDate <p>
     *            The event feedback date.
     *            </p>
     */
    public void setFeedbackDate(java.util.Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    /**
     * <p>
     * The event feedback date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param feedbackDate <p>
     *            The event feedback date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventFeedbackType withFeedbackDate(java.util.Date feedbackDate) {
        this.feedbackDate = feedbackDate;
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
        if (getFeedbackValue() != null)
            sb.append("FeedbackValue: " + getFeedbackValue() + ",");
        if (getProvider() != null)
            sb.append("Provider: " + getProvider() + ",");
        if (getFeedbackDate() != null)
            sb.append("FeedbackDate: " + getFeedbackDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFeedbackValue() == null) ? 0 : getFeedbackValue().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode
                + ((getFeedbackDate() == null) ? 0 : getFeedbackDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventFeedbackType == false)
            return false;
        EventFeedbackType other = (EventFeedbackType) obj;

        if (other.getFeedbackValue() == null ^ this.getFeedbackValue() == null)
            return false;
        if (other.getFeedbackValue() != null
                && other.getFeedbackValue().equals(this.getFeedbackValue()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getFeedbackDate() == null ^ this.getFeedbackDate() == null)
            return false;
        if (other.getFeedbackDate() != null
                && other.getFeedbackDate().equals(this.getFeedbackDate()) == false)
            return false;
        return true;
    }
}
