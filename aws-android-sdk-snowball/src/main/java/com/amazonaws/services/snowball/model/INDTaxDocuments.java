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
 * The tax documents required in AWS Regions in India.
 * </p>
 */
public class INDTaxDocuments implements Serializable {
    /**
     * <p>
     * The Goods and Services Tax (GST) documents required in AWS Regions in
     * India.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{2}[A-Z]{5}\d{4}[A-Z]{1}[A-Z\d]{1}[Z]{1}[A-Z\d]{1}<br/>
     */
    private String gSTIN;

    /**
     * <p>
     * The Goods and Services Tax (GST) documents required in AWS Regions in
     * India.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{2}[A-Z]{5}\d{4}[A-Z]{1}[A-Z\d]{1}[Z]{1}[A-Z\d]{1}<br/>
     *
     * @return <p>
     *         The Goods and Services Tax (GST) documents required in AWS
     *         Regions in India.
     *         </p>
     */
    public String getGSTIN() {
        return gSTIN;
    }

    /**
     * <p>
     * The Goods and Services Tax (GST) documents required in AWS Regions in
     * India.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{2}[A-Z]{5}\d{4}[A-Z]{1}[A-Z\d]{1}[Z]{1}[A-Z\d]{1}<br/>
     *
     * @param gSTIN <p>
     *            The Goods and Services Tax (GST) documents required in AWS
     *            Regions in India.
     *            </p>
     */
    public void setGSTIN(String gSTIN) {
        this.gSTIN = gSTIN;
    }

    /**
     * <p>
     * The Goods and Services Tax (GST) documents required in AWS Regions in
     * India.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{2}[A-Z]{5}\d{4}[A-Z]{1}[A-Z\d]{1}[Z]{1}[A-Z\d]{1}<br/>
     *
     * @param gSTIN <p>
     *            The Goods and Services Tax (GST) documents required in AWS
     *            Regions in India.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public INDTaxDocuments withGSTIN(String gSTIN) {
        this.gSTIN = gSTIN;
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
        if (getGSTIN() != null)
            sb.append("GSTIN: " + getGSTIN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGSTIN() == null) ? 0 : getGSTIN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof INDTaxDocuments == false)
            return false;
        INDTaxDocuments other = (INDTaxDocuments) obj;

        if (other.getGSTIN() == null ^ this.getGSTIN() == null)
            return false;
        if (other.getGSTIN() != null && other.getGSTIN().equals(this.getGSTIN()) == false)
            return false;
        return true;
    }
}
