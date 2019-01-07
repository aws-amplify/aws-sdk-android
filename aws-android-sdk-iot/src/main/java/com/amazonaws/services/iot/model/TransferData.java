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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Data used to transfer a certificate to an AWS account.
 * </p>
 */
public class TransferData implements Serializable {
    /**
     * <p>
     * The transfer message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     */
    private String transferMessage;

    /**
     * <p>
     * The reason why the transfer was rejected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     */
    private String rejectReason;

    /**
     * <p>
     * The date the transfer took place.
     * </p>
     */
    private java.util.Date transferDate;

    /**
     * <p>
     * The date the transfer was accepted.
     * </p>
     */
    private java.util.Date acceptDate;

    /**
     * <p>
     * The date the transfer was rejected.
     * </p>
     */
    private java.util.Date rejectDate;

    /**
     * <p>
     * The transfer message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @return <p>
     *         The transfer message.
     *         </p>
     */
    public String getTransferMessage() {
        return transferMessage;
    }

    /**
     * <p>
     * The transfer message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param transferMessage <p>
     *            The transfer message.
     *            </p>
     */
    public void setTransferMessage(String transferMessage) {
        this.transferMessage = transferMessage;
    }

    /**
     * <p>
     * The transfer message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param transferMessage <p>
     *            The transfer message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferData withTransferMessage(String transferMessage) {
        this.transferMessage = transferMessage;
        return this;
    }

    /**
     * <p>
     * The reason why the transfer was rejected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @return <p>
     *         The reason why the transfer was rejected.
     *         </p>
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * <p>
     * The reason why the transfer was rejected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param rejectReason <p>
     *            The reason why the transfer was rejected.
     *            </p>
     */
    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    /**
     * <p>
     * The reason why the transfer was rejected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param rejectReason <p>
     *            The reason why the transfer was rejected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferData withRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }

    /**
     * <p>
     * The date the transfer took place.
     * </p>
     *
     * @return <p>
     *         The date the transfer took place.
     *         </p>
     */
    public java.util.Date getTransferDate() {
        return transferDate;
    }

    /**
     * <p>
     * The date the transfer took place.
     * </p>
     *
     * @param transferDate <p>
     *            The date the transfer took place.
     *            </p>
     */
    public void setTransferDate(java.util.Date transferDate) {
        this.transferDate = transferDate;
    }

    /**
     * <p>
     * The date the transfer took place.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transferDate <p>
     *            The date the transfer took place.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferData withTransferDate(java.util.Date transferDate) {
        this.transferDate = transferDate;
        return this;
    }

    /**
     * <p>
     * The date the transfer was accepted.
     * </p>
     *
     * @return <p>
     *         The date the transfer was accepted.
     *         </p>
     */
    public java.util.Date getAcceptDate() {
        return acceptDate;
    }

    /**
     * <p>
     * The date the transfer was accepted.
     * </p>
     *
     * @param acceptDate <p>
     *            The date the transfer was accepted.
     *            </p>
     */
    public void setAcceptDate(java.util.Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    /**
     * <p>
     * The date the transfer was accepted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceptDate <p>
     *            The date the transfer was accepted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferData withAcceptDate(java.util.Date acceptDate) {
        this.acceptDate = acceptDate;
        return this;
    }

    /**
     * <p>
     * The date the transfer was rejected.
     * </p>
     *
     * @return <p>
     *         The date the transfer was rejected.
     *         </p>
     */
    public java.util.Date getRejectDate() {
        return rejectDate;
    }

    /**
     * <p>
     * The date the transfer was rejected.
     * </p>
     *
     * @param rejectDate <p>
     *            The date the transfer was rejected.
     *            </p>
     */
    public void setRejectDate(java.util.Date rejectDate) {
        this.rejectDate = rejectDate;
    }

    /**
     * <p>
     * The date the transfer was rejected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rejectDate <p>
     *            The date the transfer was rejected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferData withRejectDate(java.util.Date rejectDate) {
        this.rejectDate = rejectDate;
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
        if (getTransferMessage() != null)
            sb.append("transferMessage: " + getTransferMessage() + ",");
        if (getRejectReason() != null)
            sb.append("rejectReason: " + getRejectReason() + ",");
        if (getTransferDate() != null)
            sb.append("transferDate: " + getTransferDate() + ",");
        if (getAcceptDate() != null)
            sb.append("acceptDate: " + getAcceptDate() + ",");
        if (getRejectDate() != null)
            sb.append("rejectDate: " + getRejectDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransferMessage() == null) ? 0 : getTransferMessage().hashCode());
        hashCode = prime * hashCode
                + ((getRejectReason() == null) ? 0 : getRejectReason().hashCode());
        hashCode = prime * hashCode
                + ((getTransferDate() == null) ? 0 : getTransferDate().hashCode());
        hashCode = prime * hashCode + ((getAcceptDate() == null) ? 0 : getAcceptDate().hashCode());
        hashCode = prime * hashCode + ((getRejectDate() == null) ? 0 : getRejectDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransferData == false)
            return false;
        TransferData other = (TransferData) obj;

        if (other.getTransferMessage() == null ^ this.getTransferMessage() == null)
            return false;
        if (other.getTransferMessage() != null
                && other.getTransferMessage().equals(this.getTransferMessage()) == false)
            return false;
        if (other.getRejectReason() == null ^ this.getRejectReason() == null)
            return false;
        if (other.getRejectReason() != null
                && other.getRejectReason().equals(this.getRejectReason()) == false)
            return false;
        if (other.getTransferDate() == null ^ this.getTransferDate() == null)
            return false;
        if (other.getTransferDate() != null
                && other.getTransferDate().equals(this.getTransferDate()) == false)
            return false;
        if (other.getAcceptDate() == null ^ this.getAcceptDate() == null)
            return false;
        if (other.getAcceptDate() != null
                && other.getAcceptDate().equals(this.getAcceptDate()) == false)
            return false;
        if (other.getRejectDate() == null ^ this.getRejectDate() == null)
            return false;
        if (other.getRejectDate() != null
                && other.getRejectDate().equals(this.getRejectDate()) == false)
            return false;
        return true;
    }
}
