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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates information about the publishing destination specified by the
 * <code>destinationId</code>.
 * </p>
 */
public class UpdatePublishingDestinationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the detector associated with the publishing destinations to
     * update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * The ID of the publishing destination to update.
     * </p>
     */
    private String destinationId;

    /**
     * <p>
     * A <code>DestinationProperties</code> object that includes the
     * <code>DestinationArn</code> and <code>KmsKeyArn</code> of the publishing
     * destination.
     * </p>
     */
    private DestinationProperties destinationProperties;

    /**
     * <p>
     * The ID of the detector associated with the publishing destinations to
     * update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The ID of the detector associated with the publishing
     *         destinations to update.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The ID of the detector associated with the publishing destinations to
     * update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The ID of the detector associated with the publishing
     *            destinations to update.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the detector associated with the publishing destinations to
     * update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The ID of the detector associated with the publishing
     *            destinations to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePublishingDestinationRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * The ID of the publishing destination to update.
     * </p>
     *
     * @return <p>
     *         The ID of the publishing destination to update.
     *         </p>
     */
    public String getDestinationId() {
        return destinationId;
    }

    /**
     * <p>
     * The ID of the publishing destination to update.
     * </p>
     *
     * @param destinationId <p>
     *            The ID of the publishing destination to update.
     *            </p>
     */
    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    /**
     * <p>
     * The ID of the publishing destination to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationId <p>
     *            The ID of the publishing destination to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePublishingDestinationRequest withDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }

    /**
     * <p>
     * A <code>DestinationProperties</code> object that includes the
     * <code>DestinationArn</code> and <code>KmsKeyArn</code> of the publishing
     * destination.
     * </p>
     *
     * @return <p>
     *         A <code>DestinationProperties</code> object that includes the
     *         <code>DestinationArn</code> and <code>KmsKeyArn</code> of the
     *         publishing destination.
     *         </p>
     */
    public DestinationProperties getDestinationProperties() {
        return destinationProperties;
    }

    /**
     * <p>
     * A <code>DestinationProperties</code> object that includes the
     * <code>DestinationArn</code> and <code>KmsKeyArn</code> of the publishing
     * destination.
     * </p>
     *
     * @param destinationProperties <p>
     *            A <code>DestinationProperties</code> object that includes the
     *            <code>DestinationArn</code> and <code>KmsKeyArn</code> of the
     *            publishing destination.
     *            </p>
     */
    public void setDestinationProperties(DestinationProperties destinationProperties) {
        this.destinationProperties = destinationProperties;
    }

    /**
     * <p>
     * A <code>DestinationProperties</code> object that includes the
     * <code>DestinationArn</code> and <code>KmsKeyArn</code> of the publishing
     * destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationProperties <p>
     *            A <code>DestinationProperties</code> object that includes the
     *            <code>DestinationArn</code> and <code>KmsKeyArn</code> of the
     *            publishing destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePublishingDestinationRequest withDestinationProperties(
            DestinationProperties destinationProperties) {
        this.destinationProperties = destinationProperties;
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
        if (getDetectorId() != null)
            sb.append("DetectorId: " + getDetectorId() + ",");
        if (getDestinationId() != null)
            sb.append("DestinationId: " + getDestinationId() + ",");
        if (getDestinationProperties() != null)
            sb.append("DestinationProperties: " + getDestinationProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationId() == null) ? 0 : getDestinationId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationProperties() == null) ? 0 : getDestinationProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePublishingDestinationRequest == false)
            return false;
        UpdatePublishingDestinationRequest other = (UpdatePublishingDestinationRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDestinationId() == null ^ this.getDestinationId() == null)
            return false;
        if (other.getDestinationId() != null
                && other.getDestinationId().equals(this.getDestinationId()) == false)
            return false;
        if (other.getDestinationProperties() == null ^ this.getDestinationProperties() == null)
            return false;
        if (other.getDestinationProperties() != null
                && other.getDestinationProperties().equals(this.getDestinationProperties()) == false)
            return false;
        return true;
    }
}
