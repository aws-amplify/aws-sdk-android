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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * The details of a phone number order created for Amazon Chime.
 * </p>
 */
public class PhoneNumberOrder implements Serializable {
    /**
     * <p>
     * The phone number order ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     */
    private String phoneNumberOrderId;

    /**
     * <p>
     * The phone number order product type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     */
    private String productType;

    /**
     * <p>
     * The status of the phone number order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Processing, Successful, Failed, Partial
     */
    private String status;

    /**
     * <p>
     * The ordered phone number details, such as the phone number in E.164
     * format and the phone number status.
     * </p>
     */
    private java.util.List<OrderedPhoneNumber> orderedPhoneNumbers;

    /**
     * <p>
     * The phone number order creation timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The updated phone number order timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The phone number order ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     *
     * @return <p>
     *         The phone number order ID.
     *         </p>
     */
    public String getPhoneNumberOrderId() {
        return phoneNumberOrderId;
    }

    /**
     * <p>
     * The phone number order ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     *
     * @param phoneNumberOrderId <p>
     *            The phone number order ID.
     *            </p>
     */
    public void setPhoneNumberOrderId(String phoneNumberOrderId) {
        this.phoneNumberOrderId = phoneNumberOrderId;
    }

    /**
     * <p>
     * The phone number order ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     *
     * @param phoneNumberOrderId <p>
     *            The phone number order ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberOrder withPhoneNumberOrderId(String phoneNumberOrderId) {
        this.phoneNumberOrderId = phoneNumberOrderId;
        return this;
    }

    /**
     * <p>
     * The phone number order product type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @return <p>
     *         The phone number order product type.
     *         </p>
     * @see PhoneNumberProductType
     */
    public String getProductType() {
        return productType;
    }

    /**
     * <p>
     * The phone number order product type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @param productType <p>
     *            The phone number order product type.
     *            </p>
     * @see PhoneNumberProductType
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * <p>
     * The phone number order product type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @param productType <p>
     *            The phone number order product type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberProductType
     */
    public PhoneNumberOrder withProductType(String productType) {
        this.productType = productType;
        return this;
    }

    /**
     * <p>
     * The phone number order product type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @param productType <p>
     *            The phone number order product type.
     *            </p>
     * @see PhoneNumberProductType
     */
    public void setProductType(PhoneNumberProductType productType) {
        this.productType = productType.toString();
    }

    /**
     * <p>
     * The phone number order product type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @param productType <p>
     *            The phone number order product type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberProductType
     */
    public PhoneNumberOrder withProductType(PhoneNumberProductType productType) {
        this.productType = productType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the phone number order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Processing, Successful, Failed, Partial
     *
     * @return <p>
     *         The status of the phone number order.
     *         </p>
     * @see PhoneNumberOrderStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the phone number order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Processing, Successful, Failed, Partial
     *
     * @param status <p>
     *            The status of the phone number order.
     *            </p>
     * @see PhoneNumberOrderStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the phone number order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Processing, Successful, Failed, Partial
     *
     * @param status <p>
     *            The status of the phone number order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberOrderStatus
     */
    public PhoneNumberOrder withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the phone number order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Processing, Successful, Failed, Partial
     *
     * @param status <p>
     *            The status of the phone number order.
     *            </p>
     * @see PhoneNumberOrderStatus
     */
    public void setStatus(PhoneNumberOrderStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the phone number order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Processing, Successful, Failed, Partial
     *
     * @param status <p>
     *            The status of the phone number order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberOrderStatus
     */
    public PhoneNumberOrder withStatus(PhoneNumberOrderStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ordered phone number details, such as the phone number in E.164
     * format and the phone number status.
     * </p>
     *
     * @return <p>
     *         The ordered phone number details, such as the phone number in
     *         E.164 format and the phone number status.
     *         </p>
     */
    public java.util.List<OrderedPhoneNumber> getOrderedPhoneNumbers() {
        return orderedPhoneNumbers;
    }

    /**
     * <p>
     * The ordered phone number details, such as the phone number in E.164
     * format and the phone number status.
     * </p>
     *
     * @param orderedPhoneNumbers <p>
     *            The ordered phone number details, such as the phone number in
     *            E.164 format and the phone number status.
     *            </p>
     */
    public void setOrderedPhoneNumbers(java.util.Collection<OrderedPhoneNumber> orderedPhoneNumbers) {
        if (orderedPhoneNumbers == null) {
            this.orderedPhoneNumbers = null;
            return;
        }

        this.orderedPhoneNumbers = new java.util.ArrayList<OrderedPhoneNumber>(orderedPhoneNumbers);
    }

    /**
     * <p>
     * The ordered phone number details, such as the phone number in E.164
     * format and the phone number status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param orderedPhoneNumbers <p>
     *            The ordered phone number details, such as the phone number in
     *            E.164 format and the phone number status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberOrder withOrderedPhoneNumbers(OrderedPhoneNumber... orderedPhoneNumbers) {
        if (getOrderedPhoneNumbers() == null) {
            this.orderedPhoneNumbers = new java.util.ArrayList<OrderedPhoneNumber>(
                    orderedPhoneNumbers.length);
        }
        for (OrderedPhoneNumber value : orderedPhoneNumbers) {
            this.orderedPhoneNumbers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ordered phone number details, such as the phone number in E.164
     * format and the phone number status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param orderedPhoneNumbers <p>
     *            The ordered phone number details, such as the phone number in
     *            E.164 format and the phone number status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberOrder withOrderedPhoneNumbers(
            java.util.Collection<OrderedPhoneNumber> orderedPhoneNumbers) {
        setOrderedPhoneNumbers(orderedPhoneNumbers);
        return this;
    }

    /**
     * <p>
     * The phone number order creation timestamp, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The phone number order creation timestamp, in ISO 8601 format.
     *         </p>
     */
    public java.util.Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * <p>
     * The phone number order creation timestamp, in ISO 8601 format.
     * </p>
     *
     * @param createdTimestamp <p>
     *            The phone number order creation timestamp, in ISO 8601 format.
     *            </p>
     */
    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The phone number order creation timestamp, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTimestamp <p>
     *            The phone number order creation timestamp, in ISO 8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberOrder withCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    /**
     * <p>
     * The updated phone number order timestamp, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The updated phone number order timestamp, in ISO 8601 format.
     *         </p>
     */
    public java.util.Date getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    /**
     * <p>
     * The updated phone number order timestamp, in ISO 8601 format.
     * </p>
     *
     * @param updatedTimestamp <p>
     *            The updated phone number order timestamp, in ISO 8601 format.
     *            </p>
     */
    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The updated phone number order timestamp, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedTimestamp <p>
     *            The updated phone number order timestamp, in ISO 8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhoneNumberOrder withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
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
        if (getPhoneNumberOrderId() != null)
            sb.append("PhoneNumberOrderId: " + getPhoneNumberOrderId() + ",");
        if (getProductType() != null)
            sb.append("ProductType: " + getProductType() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getOrderedPhoneNumbers() != null)
            sb.append("OrderedPhoneNumbers: " + getOrderedPhoneNumbers() + ",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: " + getCreatedTimestamp() + ",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: " + getUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPhoneNumberOrderId() == null) ? 0 : getPhoneNumberOrderId().hashCode());
        hashCode = prime * hashCode
                + ((getProductType() == null) ? 0 : getProductType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getOrderedPhoneNumbers() == null) ? 0 : getOrderedPhoneNumbers().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhoneNumberOrder == false)
            return false;
        PhoneNumberOrder other = (PhoneNumberOrder) obj;

        if (other.getPhoneNumberOrderId() == null ^ this.getPhoneNumberOrderId() == null)
            return false;
        if (other.getPhoneNumberOrderId() != null
                && other.getPhoneNumberOrderId().equals(this.getPhoneNumberOrderId()) == false)
            return false;
        if (other.getProductType() == null ^ this.getProductType() == null)
            return false;
        if (other.getProductType() != null
                && other.getProductType().equals(this.getProductType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOrderedPhoneNumbers() == null ^ this.getOrderedPhoneNumbers() == null)
            return false;
        if (other.getOrderedPhoneNumbers() != null
                && other.getOrderedPhoneNumbers().equals(this.getOrderedPhoneNumbers()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null
                && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null
                && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        return true;
    }
}
