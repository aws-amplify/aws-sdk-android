/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class CreateHoursOfOperationResult implements Serializable {
    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     */
    private String hoursOfOperationId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the hours of operation.
     * </p>
     */
    private String hoursOfOperationArn;

    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     *
     * @return <p>
     *         The identifier for the hours of operation.
     *         </p>
     */
    public String getHoursOfOperationId() {
        return hoursOfOperationId;
    }

    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     *
     * @param hoursOfOperationId <p>
     *            The identifier for the hours of operation.
     *            </p>
     */
    public void setHoursOfOperationId(String hoursOfOperationId) {
        this.hoursOfOperationId = hoursOfOperationId;
    }

    /**
     * <p>
     * The identifier for the hours of operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hoursOfOperationId <p>
     *            The identifier for the hours of operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHoursOfOperationResult withHoursOfOperationId(String hoursOfOperationId) {
        this.hoursOfOperationId = hoursOfOperationId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the hours of operation.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the hours of operation.
     *         </p>
     */
    public String getHoursOfOperationArn() {
        return hoursOfOperationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the hours of operation.
     * </p>
     *
     * @param hoursOfOperationArn <p>
     *            The Amazon Resource Name (ARN) for the hours of operation.
     *            </p>
     */
    public void setHoursOfOperationArn(String hoursOfOperationArn) {
        this.hoursOfOperationArn = hoursOfOperationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the hours of operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hoursOfOperationArn <p>
     *            The Amazon Resource Name (ARN) for the hours of operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHoursOfOperationResult withHoursOfOperationArn(String hoursOfOperationArn) {
        this.hoursOfOperationArn = hoursOfOperationArn;
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
        if (getHoursOfOperationId() != null)
            sb.append("HoursOfOperationId: " + getHoursOfOperationId() + ",");
        if (getHoursOfOperationArn() != null)
            sb.append("HoursOfOperationArn: " + getHoursOfOperationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHoursOfOperationId() == null) ? 0 : getHoursOfOperationId().hashCode());
        hashCode = prime * hashCode
                + ((getHoursOfOperationArn() == null) ? 0 : getHoursOfOperationArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHoursOfOperationResult == false)
            return false;
        CreateHoursOfOperationResult other = (CreateHoursOfOperationResult) obj;

        if (other.getHoursOfOperationId() == null ^ this.getHoursOfOperationId() == null)
            return false;
        if (other.getHoursOfOperationId() != null
                && other.getHoursOfOperationId().equals(this.getHoursOfOperationId()) == false)
            return false;
        if (other.getHoursOfOperationArn() == null ^ this.getHoursOfOperationArn() == null)
            return false;
        if (other.getHoursOfOperationArn() != null
                && other.getHoursOfOperationArn().equals(this.getHoursOfOperationArn()) == false)
            return false;
        return true;
    }
}
