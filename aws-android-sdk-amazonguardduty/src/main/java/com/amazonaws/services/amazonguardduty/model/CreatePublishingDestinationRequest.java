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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a publishing destination to export findings to. The resource to
 * export findings to must exist before you use this operation.
 * </p>
 */
public class CreatePublishingDestinationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the GuardDuty detector associated with the publishing
     * destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * The type of resource for the publishing destination. Currently only
     * Amazon S3 buckets are supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>S3
     */
    private String destinationType;

    /**
     * <p>
     * The properties of the publishing destination, including the ARNs for the
     * destination and the KMS key used for encryption.
     * </p>
     */
    private DestinationProperties destinationProperties;

    /**
     * <p>
     * The idempotency token for the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the GuardDuty detector associated with the publishing
     * destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The ID of the GuardDuty detector associated with the publishing
     *         destination.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The ID of the GuardDuty detector associated with the publishing
     * destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The ID of the GuardDuty detector associated with the
     *            publishing destination.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the GuardDuty detector associated with the publishing
     * destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The ID of the GuardDuty detector associated with the
     *            publishing destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublishingDestinationRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * The type of resource for the publishing destination. Currently only
     * Amazon S3 buckets are supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>S3
     *
     * @return <p>
     *         The type of resource for the publishing destination. Currently
     *         only Amazon S3 buckets are supported.
     *         </p>
     * @see DestinationType
     */
    public String getDestinationType() {
        return destinationType;
    }

    /**
     * <p>
     * The type of resource for the publishing destination. Currently only
     * Amazon S3 buckets are supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>S3
     *
     * @param destinationType <p>
     *            The type of resource for the publishing destination. Currently
     *            only Amazon S3 buckets are supported.
     *            </p>
     * @see DestinationType
     */
    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    /**
     * <p>
     * The type of resource for the publishing destination. Currently only
     * Amazon S3 buckets are supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>S3
     *
     * @param destinationType <p>
     *            The type of resource for the publishing destination. Currently
     *            only Amazon S3 buckets are supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DestinationType
     */
    public CreatePublishingDestinationRequest withDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * <p>
     * The type of resource for the publishing destination. Currently only
     * Amazon S3 buckets are supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>S3
     *
     * @param destinationType <p>
     *            The type of resource for the publishing destination. Currently
     *            only Amazon S3 buckets are supported.
     *            </p>
     * @see DestinationType
     */
    public void setDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType.toString();
    }

    /**
     * <p>
     * The type of resource for the publishing destination. Currently only
     * Amazon S3 buckets are supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>S3
     *
     * @param destinationType <p>
     *            The type of resource for the publishing destination. Currently
     *            only Amazon S3 buckets are supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DestinationType
     */
    public CreatePublishingDestinationRequest withDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType.toString();
        return this;
    }

    /**
     * <p>
     * The properties of the publishing destination, including the ARNs for the
     * destination and the KMS key used for encryption.
     * </p>
     *
     * @return <p>
     *         The properties of the publishing destination, including the ARNs
     *         for the destination and the KMS key used for encryption.
     *         </p>
     */
    public DestinationProperties getDestinationProperties() {
        return destinationProperties;
    }

    /**
     * <p>
     * The properties of the publishing destination, including the ARNs for the
     * destination and the KMS key used for encryption.
     * </p>
     *
     * @param destinationProperties <p>
     *            The properties of the publishing destination, including the
     *            ARNs for the destination and the KMS key used for encryption.
     *            </p>
     */
    public void setDestinationProperties(DestinationProperties destinationProperties) {
        this.destinationProperties = destinationProperties;
    }

    /**
     * <p>
     * The properties of the publishing destination, including the ARNs for the
     * destination and the KMS key used for encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationProperties <p>
     *            The properties of the publishing destination, including the
     *            ARNs for the destination and the KMS key used for encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublishingDestinationRequest withDestinationProperties(
            DestinationProperties destinationProperties) {
        this.destinationProperties = destinationProperties;
        return this;
    }

    /**
     * <p>
     * The idempotency token for the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return <p>
     *         The idempotency token for the request.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * The idempotency token for the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param clientToken <p>
     *            The idempotency token for the request.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token for the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param clientToken <p>
     *            The idempotency token for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublishingDestinationRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getDestinationType() != null)
            sb.append("DestinationType: " + getDestinationType() + ",");
        if (getDestinationProperties() != null)
            sb.append("DestinationProperties: " + getDestinationProperties() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationType() == null) ? 0 : getDestinationType().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationProperties() == null) ? 0 : getDestinationProperties().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePublishingDestinationRequest == false)
            return false;
        CreatePublishingDestinationRequest other = (CreatePublishingDestinationRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDestinationType() == null ^ this.getDestinationType() == null)
            return false;
        if (other.getDestinationType() != null
                && other.getDestinationType().equals(this.getDestinationType()) == false)
            return false;
        if (other.getDestinationProperties() == null ^ this.getDestinationProperties() == null)
            return false;
        if (other.getDestinationProperties() != null
                && other.getDestinationProperties().equals(this.getDestinationProperties()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
