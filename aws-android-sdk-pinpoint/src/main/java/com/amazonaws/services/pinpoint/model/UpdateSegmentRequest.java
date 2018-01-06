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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Use to update a segment.
 */
public class UpdateSegmentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The new value for the applicationId property for this object.
     */
    private String applicationId;

    /**
     * The new value for the segmentId property for this object.
     */
    private String segmentId;

    /**
     * Segment definition.
     */
    private WriteSegmentRequest writeSegmentRequest;

    /**
     * Returns the value of the applicationId property for this object.
     *
     * @return The value of the applicationId property for this object.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of applicationId
     *
     * @param applicationId The new value for the applicationId property for
     *            this object.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets the value of the applicationId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId The new value for the applicationId property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSegmentRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns the value of the segmentId property for this object.
     *
     * @return The value of the segmentId property for this object.
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * Sets the value of segmentId
     *
     * @param segmentId The new value for the segmentId property for this
     *            object.
     */
    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * Sets the value of the segmentId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentId The new value for the segmentId property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSegmentRequest withSegmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    /**
     * Segment definition.
     *
     * @return Segment definition.
     */
    public WriteSegmentRequest getWriteSegmentRequest() {
        return writeSegmentRequest;
    }

    /**
     * Segment definition.
     *
     * @param writeSegmentRequest Segment definition.
     */
    public void setWriteSegmentRequest(WriteSegmentRequest writeSegmentRequest) {
        this.writeSegmentRequest = writeSegmentRequest;
    }

    /**
     * Segment definition.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param writeSegmentRequest Segment definition.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSegmentRequest withWriteSegmentRequest(WriteSegmentRequest writeSegmentRequest) {
        this.writeSegmentRequest = writeSegmentRequest;
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
        if (getSegmentId() != null)
            sb.append("SegmentId: " + getSegmentId() + ",");
        if (getWriteSegmentRequest() != null)
            sb.append("WriteSegmentRequest: " + getWriteSegmentRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getSegmentId() == null) ? 0 : getSegmentId().hashCode());
        hashCode = prime * hashCode
                + ((getWriteSegmentRequest() == null) ? 0 : getWriteSegmentRequest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSegmentRequest == false)
            return false;
        UpdateSegmentRequest other = (UpdateSegmentRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getSegmentId() == null ^ this.getSegmentId() == null)
            return false;
        if (other.getSegmentId() != null
                && other.getSegmentId().equals(this.getSegmentId()) == false)
            return false;
        if (other.getWriteSegmentRequest() == null ^ this.getWriteSegmentRequest() == null)
            return false;
        if (other.getWriteSegmentRequest() != null
                && other.getWriteSegmentRequest().equals(this.getWriteSegmentRequest()) == false)
            return false;
        return true;
    }
}
