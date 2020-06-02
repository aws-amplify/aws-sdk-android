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

/**
 * <p>
 * Contains information about the publishing destination, including the ID,
 * type, and status.
 * </p>
 */
public class Destination implements Serializable {
    /**
     * <p>
     * The unique ID of the publishing destination.
     * </p>
     */
    private String destinationId;

    /**
     * <p>
     * The type of resource used for the publishing destination. Currently, only
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
     * The status of the publishing destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>PENDING_VERIFICATION, PUBLISHING,
     * UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY, STOPPED
     */
    private String status;

    /**
     * <p>
     * The unique ID of the publishing destination.
     * </p>
     *
     * @return <p>
     *         The unique ID of the publishing destination.
     *         </p>
     */
    public String getDestinationId() {
        return destinationId;
    }

    /**
     * <p>
     * The unique ID of the publishing destination.
     * </p>
     *
     * @param destinationId <p>
     *            The unique ID of the publishing destination.
     *            </p>
     */
    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    /**
     * <p>
     * The unique ID of the publishing destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationId <p>
     *            The unique ID of the publishing destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }

    /**
     * <p>
     * The type of resource used for the publishing destination. Currently, only
     * Amazon S3 buckets are supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>S3
     *
     * @return <p>
     *         The type of resource used for the publishing destination.
     *         Currently, only Amazon S3 buckets are supported.
     *         </p>
     * @see DestinationType
     */
    public String getDestinationType() {
        return destinationType;
    }

    /**
     * <p>
     * The type of resource used for the publishing destination. Currently, only
     * Amazon S3 buckets are supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>S3
     *
     * @param destinationType <p>
     *            The type of resource used for the publishing destination.
     *            Currently, only Amazon S3 buckets are supported.
     *            </p>
     * @see DestinationType
     */
    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    /**
     * <p>
     * The type of resource used for the publishing destination. Currently, only
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
     *            The type of resource used for the publishing destination.
     *            Currently, only Amazon S3 buckets are supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DestinationType
     */
    public Destination withDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * <p>
     * The type of resource used for the publishing destination. Currently, only
     * Amazon S3 buckets are supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>S3
     *
     * @param destinationType <p>
     *            The type of resource used for the publishing destination.
     *            Currently, only Amazon S3 buckets are supported.
     *            </p>
     * @see DestinationType
     */
    public void setDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType.toString();
    }

    /**
     * <p>
     * The type of resource used for the publishing destination. Currently, only
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
     *            The type of resource used for the publishing destination.
     *            Currently, only Amazon S3 buckets are supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DestinationType
     */
    public Destination withDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the publishing destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>PENDING_VERIFICATION, PUBLISHING,
     * UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY, STOPPED
     *
     * @return <p>
     *         The status of the publishing destination.
     *         </p>
     * @see PublishingStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the publishing destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>PENDING_VERIFICATION, PUBLISHING,
     * UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY, STOPPED
     *
     * @param status <p>
     *            The status of the publishing destination.
     *            </p>
     * @see PublishingStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the publishing destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>PENDING_VERIFICATION, PUBLISHING,
     * UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY, STOPPED
     *
     * @param status <p>
     *            The status of the publishing destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PublishingStatus
     */
    public Destination withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the publishing destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>PENDING_VERIFICATION, PUBLISHING,
     * UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY, STOPPED
     *
     * @param status <p>
     *            The status of the publishing destination.
     *            </p>
     * @see PublishingStatus
     */
    public void setStatus(PublishingStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the publishing destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>PENDING_VERIFICATION, PUBLISHING,
     * UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY, STOPPED
     *
     * @param status <p>
     *            The status of the publishing destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PublishingStatus
     */
    public Destination withStatus(PublishingStatus status) {
        this.status = status.toString();
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
        if (getDestinationId() != null)
            sb.append("DestinationId: " + getDestinationId() + ",");
        if (getDestinationType() != null)
            sb.append("DestinationType: " + getDestinationType() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestinationId() == null) ? 0 : getDestinationId().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationType() == null) ? 0 : getDestinationType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Destination == false)
            return false;
        Destination other = (Destination) obj;

        if (other.getDestinationId() == null ^ this.getDestinationId() == null)
            return false;
        if (other.getDestinationId() != null
                && other.getDestinationId().equals(this.getDestinationId()) == false)
            return false;
        if (other.getDestinationType() == null ^ this.getDestinationType() == null)
            return false;
        if (other.getDestinationType() != null
                && other.getDestinationType().equals(this.getDestinationType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
