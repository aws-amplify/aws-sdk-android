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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

public class UpdateProvisionedProductResult implements Serializable {
    /**
     * <p>
     * Information about the result of the request.
     * </p>
     */
    private RecordDetail recordDetail;

    /**
     * <p>
     * Information about the result of the request.
     * </p>
     *
     * @return <p>
     *         Information about the result of the request.
     *         </p>
     */
    public RecordDetail getRecordDetail() {
        return recordDetail;
    }

    /**
     * <p>
     * Information about the result of the request.
     * </p>
     *
     * @param recordDetail <p>
     *            Information about the result of the request.
     *            </p>
     */
    public void setRecordDetail(RecordDetail recordDetail) {
        this.recordDetail = recordDetail;
    }

    /**
     * <p>
     * Information about the result of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recordDetail <p>
     *            Information about the result of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisionedProductResult withRecordDetail(RecordDetail recordDetail) {
        this.recordDetail = recordDetail;
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
        if (getRecordDetail() != null)
            sb.append("RecordDetail: " + getRecordDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRecordDetail() == null) ? 0 : getRecordDetail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProvisionedProductResult == false)
            return false;
        UpdateProvisionedProductResult other = (UpdateProvisionedProductResult) obj;

        if (other.getRecordDetail() == null ^ this.getRecordDetail() == null)
            return false;
        if (other.getRecordDetail() != null
                && other.getRecordDetail().equals(this.getRecordDetail()) == false)
            return false;
        return true;
    }
}
