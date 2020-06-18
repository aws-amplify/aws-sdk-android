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

package com.amazonaws.services.metering.marketplace.model;

import java.io.Serializable;

/**
 * <p>
 * A UsageRecordResult indicates the status of a given UsageRecord processed by
 * BatchMeterUsage.
 * </p>
 */
public class UsageRecordResult implements Serializable {
    /**
     * <p>
     * The UsageRecord that was part of the BatchMeterUsage request.
     * </p>
     */
    private UsageRecord usageRecord;

    /**
     * <p>
     * The MeteringRecordId is a unique identifier for this metering event.
     * </p>
     */
    private String meteringRecordId;

    /**
     * <p>
     * The UsageRecordResult Status indicates the status of an individual
     * UsageRecord processed by BatchMeterUsage.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Success</i>- The UsageRecord was accepted and honored by
     * BatchMeterUsage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified is not
     * subscribed to your product. The UsageRecord was not honored. Future
     * UsageRecords for this customer will fail until the customer subscribes to
     * your product.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DuplicateRecord</i>- Indicates that the UsageRecord was invalid and
     * not honored. A previously metered UsageRecord had the same customer,
     * dimension, and time, but a different quantity.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, CustomerNotSubscribed, DuplicateRecord
     */
    private String status;

    /**
     * <p>
     * The UsageRecord that was part of the BatchMeterUsage request.
     * </p>
     *
     * @return <p>
     *         The UsageRecord that was part of the BatchMeterUsage request.
     *         </p>
     */
    public UsageRecord getUsageRecord() {
        return usageRecord;
    }

    /**
     * <p>
     * The UsageRecord that was part of the BatchMeterUsage request.
     * </p>
     *
     * @param usageRecord <p>
     *            The UsageRecord that was part of the BatchMeterUsage request.
     *            </p>
     */
    public void setUsageRecord(UsageRecord usageRecord) {
        this.usageRecord = usageRecord;
    }

    /**
     * <p>
     * The UsageRecord that was part of the BatchMeterUsage request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usageRecord <p>
     *            The UsageRecord that was part of the BatchMeterUsage request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsageRecordResult withUsageRecord(UsageRecord usageRecord) {
        this.usageRecord = usageRecord;
        return this;
    }

    /**
     * <p>
     * The MeteringRecordId is a unique identifier for this metering event.
     * </p>
     *
     * @return <p>
     *         The MeteringRecordId is a unique identifier for this metering
     *         event.
     *         </p>
     */
    public String getMeteringRecordId() {
        return meteringRecordId;
    }

    /**
     * <p>
     * The MeteringRecordId is a unique identifier for this metering event.
     * </p>
     *
     * @param meteringRecordId <p>
     *            The MeteringRecordId is a unique identifier for this metering
     *            event.
     *            </p>
     */
    public void setMeteringRecordId(String meteringRecordId) {
        this.meteringRecordId = meteringRecordId;
    }

    /**
     * <p>
     * The MeteringRecordId is a unique identifier for this metering event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param meteringRecordId <p>
     *            The MeteringRecordId is a unique identifier for this metering
     *            event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsageRecordResult withMeteringRecordId(String meteringRecordId) {
        this.meteringRecordId = meteringRecordId;
        return this;
    }

    /**
     * <p>
     * The UsageRecordResult Status indicates the status of an individual
     * UsageRecord processed by BatchMeterUsage.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Success</i>- The UsageRecord was accepted and honored by
     * BatchMeterUsage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified is not
     * subscribed to your product. The UsageRecord was not honored. Future
     * UsageRecords for this customer will fail until the customer subscribes to
     * your product.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DuplicateRecord</i>- Indicates that the UsageRecord was invalid and
     * not honored. A previously metered UsageRecord had the same customer,
     * dimension, and time, but a different quantity.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, CustomerNotSubscribed, DuplicateRecord
     *
     * @return <p>
     *         The UsageRecordResult Status indicates the status of an
     *         individual UsageRecord processed by BatchMeterUsage.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Success</i>- The UsageRecord was accepted and honored by
     *         BatchMeterUsage.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified is
     *         not subscribed to your product. The UsageRecord was not honored.
     *         Future UsageRecords for this customer will fail until the
     *         customer subscribes to your product.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>DuplicateRecord</i>- Indicates that the UsageRecord was
     *         invalid and not honored. A previously metered UsageRecord had the
     *         same customer, dimension, and time, but a different quantity.
     *         </p>
     *         </li>
     *         </ul>
     * @see UsageRecordResultStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The UsageRecordResult Status indicates the status of an individual
     * UsageRecord processed by BatchMeterUsage.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Success</i>- The UsageRecord was accepted and honored by
     * BatchMeterUsage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified is not
     * subscribed to your product. The UsageRecord was not honored. Future
     * UsageRecords for this customer will fail until the customer subscribes to
     * your product.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DuplicateRecord</i>- Indicates that the UsageRecord was invalid and
     * not honored. A previously metered UsageRecord had the same customer,
     * dimension, and time, but a different quantity.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, CustomerNotSubscribed, DuplicateRecord
     *
     * @param status <p>
     *            The UsageRecordResult Status indicates the status of an
     *            individual UsageRecord processed by BatchMeterUsage.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>Success</i>- The UsageRecord was accepted and honored by
     *            BatchMeterUsage.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified
     *            is not subscribed to your product. The UsageRecord was not
     *            honored. Future UsageRecords for this customer will fail until
     *            the customer subscribes to your product.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>DuplicateRecord</i>- Indicates that the UsageRecord was
     *            invalid and not honored. A previously metered UsageRecord had
     *            the same customer, dimension, and time, but a different
     *            quantity.
     *            </p>
     *            </li>
     *            </ul>
     * @see UsageRecordResultStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The UsageRecordResult Status indicates the status of an individual
     * UsageRecord processed by BatchMeterUsage.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Success</i>- The UsageRecord was accepted and honored by
     * BatchMeterUsage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified is not
     * subscribed to your product. The UsageRecord was not honored. Future
     * UsageRecords for this customer will fail until the customer subscribes to
     * your product.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DuplicateRecord</i>- Indicates that the UsageRecord was invalid and
     * not honored. A previously metered UsageRecord had the same customer,
     * dimension, and time, but a different quantity.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, CustomerNotSubscribed, DuplicateRecord
     *
     * @param status <p>
     *            The UsageRecordResult Status indicates the status of an
     *            individual UsageRecord processed by BatchMeterUsage.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>Success</i>- The UsageRecord was accepted and honored by
     *            BatchMeterUsage.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified
     *            is not subscribed to your product. The UsageRecord was not
     *            honored. Future UsageRecords for this customer will fail until
     *            the customer subscribes to your product.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>DuplicateRecord</i>- Indicates that the UsageRecord was
     *            invalid and not honored. A previously metered UsageRecord had
     *            the same customer, dimension, and time, but a different
     *            quantity.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UsageRecordResultStatus
     */
    public UsageRecordResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The UsageRecordResult Status indicates the status of an individual
     * UsageRecord processed by BatchMeterUsage.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Success</i>- The UsageRecord was accepted and honored by
     * BatchMeterUsage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified is not
     * subscribed to your product. The UsageRecord was not honored. Future
     * UsageRecords for this customer will fail until the customer subscribes to
     * your product.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DuplicateRecord</i>- Indicates that the UsageRecord was invalid and
     * not honored. A previously metered UsageRecord had the same customer,
     * dimension, and time, but a different quantity.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, CustomerNotSubscribed, DuplicateRecord
     *
     * @param status <p>
     *            The UsageRecordResult Status indicates the status of an
     *            individual UsageRecord processed by BatchMeterUsage.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>Success</i>- The UsageRecord was accepted and honored by
     *            BatchMeterUsage.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified
     *            is not subscribed to your product. The UsageRecord was not
     *            honored. Future UsageRecords for this customer will fail until
     *            the customer subscribes to your product.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>DuplicateRecord</i>- Indicates that the UsageRecord was
     *            invalid and not honored. A previously metered UsageRecord had
     *            the same customer, dimension, and time, but a different
     *            quantity.
     *            </p>
     *            </li>
     *            </ul>
     * @see UsageRecordResultStatus
     */
    public void setStatus(UsageRecordResultStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The UsageRecordResult Status indicates the status of an individual
     * UsageRecord processed by BatchMeterUsage.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Success</i>- The UsageRecord was accepted and honored by
     * BatchMeterUsage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified is not
     * subscribed to your product. The UsageRecord was not honored. Future
     * UsageRecords for this customer will fail until the customer subscribes to
     * your product.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DuplicateRecord</i>- Indicates that the UsageRecord was invalid and
     * not honored. A previously metered UsageRecord had the same customer,
     * dimension, and time, but a different quantity.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, CustomerNotSubscribed, DuplicateRecord
     *
     * @param status <p>
     *            The UsageRecordResult Status indicates the status of an
     *            individual UsageRecord processed by BatchMeterUsage.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>Success</i>- The UsageRecord was accepted and honored by
     *            BatchMeterUsage.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified
     *            is not subscribed to your product. The UsageRecord was not
     *            honored. Future UsageRecords for this customer will fail until
     *            the customer subscribes to your product.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>DuplicateRecord</i>- Indicates that the UsageRecord was
     *            invalid and not honored. A previously metered UsageRecord had
     *            the same customer, dimension, and time, but a different
     *            quantity.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UsageRecordResultStatus
     */
    public UsageRecordResult withStatus(UsageRecordResultStatus status) {
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
        if (getUsageRecord() != null)
            sb.append("UsageRecord: " + getUsageRecord() + ",");
        if (getMeteringRecordId() != null)
            sb.append("MeteringRecordId: " + getMeteringRecordId() + ",");
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
                + ((getUsageRecord() == null) ? 0 : getUsageRecord().hashCode());
        hashCode = prime * hashCode
                + ((getMeteringRecordId() == null) ? 0 : getMeteringRecordId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageRecordResult == false)
            return false;
        UsageRecordResult other = (UsageRecordResult) obj;

        if (other.getUsageRecord() == null ^ this.getUsageRecord() == null)
            return false;
        if (other.getUsageRecord() != null
                && other.getUsageRecord().equals(this.getUsageRecord()) == false)
            return false;
        if (other.getMeteringRecordId() == null ^ this.getMeteringRecordId() == null)
            return false;
        if (other.getMeteringRecordId() != null
                && other.getMeteringRecordId().equals(this.getMeteringRecordId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
