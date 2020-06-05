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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a journey from an application.
 * </p>
 */
public class DeleteJourneyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * The unique identifier for the journey.
     * </p>
     */
    private String journeyId;

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the application. This identifier is
     *         displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *         console.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     *
     * @param applicationId <p>
     *            The unique identifier for the application. This identifier is
     *            displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *            console.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The unique identifier for the application. This identifier is
     *            displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *            console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteJourneyRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the journey.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the journey.
     *         </p>
     */
    public String getJourneyId() {
        return journeyId;
    }

    /**
     * <p>
     * The unique identifier for the journey.
     * </p>
     *
     * @param journeyId <p>
     *            The unique identifier for the journey.
     *            </p>
     */
    public void setJourneyId(String journeyId) {
        this.journeyId = journeyId;
    }

    /**
     * <p>
     * The unique identifier for the journey.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param journeyId <p>
     *            The unique identifier for the journey.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteJourneyRequest withJourneyId(String journeyId) {
        this.journeyId = journeyId;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getJourneyId() != null)
            sb.append("JourneyId: " + getJourneyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getJourneyId() == null) ? 0 : getJourneyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteJourneyRequest == false)
            return false;
        DeleteJourneyRequest other = (DeleteJourneyRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getJourneyId() == null ^ this.getJourneyId() == null)
            return false;
        if (other.getJourneyId() != null
                && other.getJourneyId().equals(this.getJourneyId()) == false)
            return false;
        return true;
    }
}
