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
 * A UsageRecord indicates a quantity of usage for a given product, customer,
 * dimension and time.
 * </p>
 * <p>
 * Multiple requests with the same UsageRecords as input will be deduplicated to
 * prevent double charges.
 * </p>
 */
public class UsageRecord implements Serializable {
    /**
     * <p>
     * Timestamp, in UTC, for which the usage is being reported.
     * </p>
     * <p>
     * Your application can meter usage for up to one hour in the past. Make
     * sure the timestamp value is not before the start of the software usage.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The CustomerIdentifier is obtained through the ResolveCustomer operation
     * and represents an individual buyer in your application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String customerIdentifier;

    /**
     * <p>
     * During the process of registering a product on AWS Marketplace, up to
     * eight dimensions are specified. These represent different units of value
     * in your application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String dimension;

    /**
     * <p>
     * The quantity of usage consumed by the customer for the given dimension
     * and time. Defaults to <code>0</code> if not specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer quantity;

    /**
     * <p>
     * Timestamp, in UTC, for which the usage is being reported.
     * </p>
     * <p>
     * Your application can meter usage for up to one hour in the past. Make
     * sure the timestamp value is not before the start of the software usage.
     * </p>
     *
     * @return <p>
     *         Timestamp, in UTC, for which the usage is being reported.
     *         </p>
     *         <p>
     *         Your application can meter usage for up to one hour in the past.
     *         Make sure the timestamp value is not before the start of the
     *         software usage.
     *         </p>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * Timestamp, in UTC, for which the usage is being reported.
     * </p>
     * <p>
     * Your application can meter usage for up to one hour in the past. Make
     * sure the timestamp value is not before the start of the software usage.
     * </p>
     *
     * @param timestamp <p>
     *            Timestamp, in UTC, for which the usage is being reported.
     *            </p>
     *            <p>
     *            Your application can meter usage for up to one hour in the
     *            past. Make sure the timestamp value is not before the start of
     *            the software usage.
     *            </p>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Timestamp, in UTC, for which the usage is being reported.
     * </p>
     * <p>
     * Your application can meter usage for up to one hour in the past. Make
     * sure the timestamp value is not before the start of the software usage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            Timestamp, in UTC, for which the usage is being reported.
     *            </p>
     *            <p>
     *            Your application can meter usage for up to one hour in the
     *            past. Make sure the timestamp value is not before the start of
     *            the software usage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsageRecord withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * The CustomerIdentifier is obtained through the ResolveCustomer operation
     * and represents an individual buyer in your application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The CustomerIdentifier is obtained through the ResolveCustomer
     *         operation and represents an individual buyer in your application.
     *         </p>
     */
    public String getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * <p>
     * The CustomerIdentifier is obtained through the ResolveCustomer operation
     * and represents an individual buyer in your application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param customerIdentifier <p>
     *            The CustomerIdentifier is obtained through the ResolveCustomer
     *            operation and represents an individual buyer in your
     *            application.
     *            </p>
     */
    public void setCustomerIdentifier(String customerIdentifier) {
        this.customerIdentifier = customerIdentifier;
    }

    /**
     * <p>
     * The CustomerIdentifier is obtained through the ResolveCustomer operation
     * and represents an individual buyer in your application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param customerIdentifier <p>
     *            The CustomerIdentifier is obtained through the ResolveCustomer
     *            operation and represents an individual buyer in your
     *            application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsageRecord withCustomerIdentifier(String customerIdentifier) {
        this.customerIdentifier = customerIdentifier;
        return this;
    }

    /**
     * <p>
     * During the process of registering a product on AWS Marketplace, up to
     * eight dimensions are specified. These represent different units of value
     * in your application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         During the process of registering a product on AWS Marketplace,
     *         up to eight dimensions are specified. These represent different
     *         units of value in your application.
     *         </p>
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * <p>
     * During the process of registering a product on AWS Marketplace, up to
     * eight dimensions are specified. These represent different units of value
     * in your application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param dimension <p>
     *            During the process of registering a product on AWS
     *            Marketplace, up to eight dimensions are specified. These
     *            represent different units of value in your application.
     *            </p>
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * <p>
     * During the process of registering a product on AWS Marketplace, up to
     * eight dimensions are specified. These represent different units of value
     * in your application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param dimension <p>
     *            During the process of registering a product on AWS
     *            Marketplace, up to eight dimensions are specified. These
     *            represent different units of value in your application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsageRecord withDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * <p>
     * The quantity of usage consumed by the customer for the given dimension
     * and time. Defaults to <code>0</code> if not specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return <p>
     *         The quantity of usage consumed by the customer for the given
     *         dimension and time. Defaults to <code>0</code> if not specified.
     *         </p>
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * <p>
     * The quantity of usage consumed by the customer for the given dimension
     * and time. Defaults to <code>0</code> if not specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param quantity <p>
     *            The quantity of usage consumed by the customer for the given
     *            dimension and time. Defaults to <code>0</code> if not
     *            specified.
     *            </p>
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The quantity of usage consumed by the customer for the given dimension
     * and time. Defaults to <code>0</code> if not specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param quantity <p>
     *            The quantity of usage consumed by the customer for the given
     *            dimension and time. Defaults to <code>0</code> if not
     *            specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsageRecord withQuantity(Integer quantity) {
        this.quantity = quantity;
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
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getCustomerIdentifier() != null)
            sb.append("CustomerIdentifier: " + getCustomerIdentifier() + ",");
        if (getDimension() != null)
            sb.append("Dimension: " + getDimension() + ",");
        if (getQuantity() != null)
            sb.append("Quantity: " + getQuantity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getCustomerIdentifier() == null) ? 0 : getCustomerIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDimension() == null) ? 0 : getDimension().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageRecord == false)
            return false;
        UsageRecord other = (UsageRecord) obj;

        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getCustomerIdentifier() == null ^ this.getCustomerIdentifier() == null)
            return false;
        if (other.getCustomerIdentifier() != null
                && other.getCustomerIdentifier().equals(this.getCustomerIdentifier()) == false)
            return false;
        if (other.getDimension() == null ^ this.getDimension() == null)
            return false;
        if (other.getDimension() != null
                && other.getDimension().equals(this.getDimension()) == false)
            return false;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        return true;
    }
}
