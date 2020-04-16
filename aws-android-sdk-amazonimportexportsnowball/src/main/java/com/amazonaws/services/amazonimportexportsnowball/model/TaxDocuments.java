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

package com.amazonaws.services.amazonimportexportsnowball.model;

import java.io.Serializable;

/**
 * <p>
 * The tax documents required in your AWS Region.
 * </p>
 */
public class TaxDocuments implements Serializable {
    /**
     * <p>
     * The tax documents required in AWS Regions in India.
     * </p>
     */
    private INDTaxDocuments iND;

    /**
     * <p>
     * The tax documents required in AWS Regions in India.
     * </p>
     *
     * @return <p>
     *         The tax documents required in AWS Regions in India.
     *         </p>
     */
    public INDTaxDocuments getIND() {
        return iND;
    }

    /**
     * <p>
     * The tax documents required in AWS Regions in India.
     * </p>
     *
     * @param iND <p>
     *            The tax documents required in AWS Regions in India.
     *            </p>
     */
    public void setIND(INDTaxDocuments iND) {
        this.iND = iND;
    }

    /**
     * <p>
     * The tax documents required in AWS Regions in India.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iND <p>
     *            The tax documents required in AWS Regions in India.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaxDocuments withIND(INDTaxDocuments iND) {
        this.iND = iND;
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
        if (getIND() != null)
            sb.append("IND: " + getIND());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIND() == null) ? 0 : getIND().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaxDocuments == false)
            return false;
        TaxDocuments other = (TaxDocuments) obj;

        if (other.getIND() == null ^ this.getIND() == null)
            return false;
        if (other.getIND() != null && other.getIND().equals(this.getIND()) == false)
            return false;
        return true;
    }
}
