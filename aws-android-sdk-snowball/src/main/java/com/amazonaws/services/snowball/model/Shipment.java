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

package com.amazonaws.services.snowball.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>Status</code> and <code>TrackingNumber</code> information for an
 * inbound or outbound shipment.
 * </p>
 */
public class Shipment implements Serializable {
    /**
     * <p>
     * Status information for a shipment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String status;

    /**
     * <p>
     * The tracking number for this job. Using this tracking number with your
     * region's carrier's website, you can track a Snowball as the carrier
     * transports it.
     * </p>
     * <p>
     * For India, the carrier is Amazon Logistics. For all other regions, UPS is
     * the carrier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String trackingNumber;

    /**
     * <p>
     * Status information for a shipment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Status information for a shipment.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Status information for a shipment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param status <p>
     *            Status information for a shipment.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status information for a shipment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param status <p>
     *            Status information for a shipment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Shipment withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The tracking number for this job. Using this tracking number with your
     * region's carrier's website, you can track a Snowball as the carrier
     * transports it.
     * </p>
     * <p>
     * For India, the carrier is Amazon Logistics. For all other regions, UPS is
     * the carrier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The tracking number for this job. Using this tracking number with
     *         your region's carrier's website, you can track a Snowball as the
     *         carrier transports it.
     *         </p>
     *         <p>
     *         For India, the carrier is Amazon Logistics. For all other
     *         regions, UPS is the carrier.
     *         </p>
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * <p>
     * The tracking number for this job. Using this tracking number with your
     * region's carrier's website, you can track a Snowball as the carrier
     * transports it.
     * </p>
     * <p>
     * For India, the carrier is Amazon Logistics. For all other regions, UPS is
     * the carrier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param trackingNumber <p>
     *            The tracking number for this job. Using this tracking number
     *            with your region's carrier's website, you can track a Snowball
     *            as the carrier transports it.
     *            </p>
     *            <p>
     *            For India, the carrier is Amazon Logistics. For all other
     *            regions, UPS is the carrier.
     *            </p>
     */
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    /**
     * <p>
     * The tracking number for this job. Using this tracking number with your
     * region's carrier's website, you can track a Snowball as the carrier
     * transports it.
     * </p>
     * <p>
     * For India, the carrier is Amazon Logistics. For all other regions, UPS is
     * the carrier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param trackingNumber <p>
     *            The tracking number for this job. Using this tracking number
     *            with your region's carrier's website, you can track a Snowball
     *            as the carrier transports it.
     *            </p>
     *            <p>
     *            For India, the carrier is Amazon Logistics. For all other
     *            regions, UPS is the carrier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Shipment withTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getTrackingNumber() != null)
            sb.append("TrackingNumber: " + getTrackingNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getTrackingNumber() == null) ? 0 : getTrackingNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Shipment == false)
            return false;
        Shipment other = (Shipment) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTrackingNumber() == null ^ this.getTrackingNumber() == null)
            return false;
        if (other.getTrackingNumber() != null
                && other.getTrackingNumber().equals(this.getTrackingNumber()) == false)
            return false;
        return true;
    }
}
