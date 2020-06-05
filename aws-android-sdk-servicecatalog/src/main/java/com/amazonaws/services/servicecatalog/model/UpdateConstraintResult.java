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

public class UpdateConstraintResult implements Serializable {
    /**
     * <p>
     * Information about the constraint.
     * </p>
     */
    private ConstraintDetail constraintDetail;

    /**
     * <p>
     * The constraint parameters.
     * </p>
     */
    private String constraintParameters;

    /**
     * <p>
     * The status of the current request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED
     */
    private String status;

    /**
     * <p>
     * Information about the constraint.
     * </p>
     *
     * @return <p>
     *         Information about the constraint.
     *         </p>
     */
    public ConstraintDetail getConstraintDetail() {
        return constraintDetail;
    }

    /**
     * <p>
     * Information about the constraint.
     * </p>
     *
     * @param constraintDetail <p>
     *            Information about the constraint.
     *            </p>
     */
    public void setConstraintDetail(ConstraintDetail constraintDetail) {
        this.constraintDetail = constraintDetail;
    }

    /**
     * <p>
     * Information about the constraint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param constraintDetail <p>
     *            Information about the constraint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConstraintResult withConstraintDetail(ConstraintDetail constraintDetail) {
        this.constraintDetail = constraintDetail;
        return this;
    }

    /**
     * <p>
     * The constraint parameters.
     * </p>
     *
     * @return <p>
     *         The constraint parameters.
     *         </p>
     */
    public String getConstraintParameters() {
        return constraintParameters;
    }

    /**
     * <p>
     * The constraint parameters.
     * </p>
     *
     * @param constraintParameters <p>
     *            The constraint parameters.
     *            </p>
     */
    public void setConstraintParameters(String constraintParameters) {
        this.constraintParameters = constraintParameters;
    }

    /**
     * <p>
     * The constraint parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param constraintParameters <p>
     *            The constraint parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConstraintResult withConstraintParameters(String constraintParameters) {
        this.constraintParameters = constraintParameters;
        return this;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED
     *
     * @return <p>
     *         The status of the current request.
     *         </p>
     * @see Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED
     *
     * @param status <p>
     *            The status of the current request.
     *            </p>
     * @see Status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED
     *
     * @param status <p>
     *            The status of the current request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public UpdateConstraintResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED
     *
     * @param status <p>
     *            The status of the current request.
     *            </p>
     * @see Status
     */
    public void setStatus(Status status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED
     *
     * @param status <p>
     *            The status of the current request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public UpdateConstraintResult withStatus(Status status) {
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
        if (getConstraintDetail() != null)
            sb.append("ConstraintDetail: " + getConstraintDetail() + ",");
        if (getConstraintParameters() != null)
            sb.append("ConstraintParameters: " + getConstraintParameters() + ",");
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
                + ((getConstraintDetail() == null) ? 0 : getConstraintDetail().hashCode());
        hashCode = prime * hashCode
                + ((getConstraintParameters() == null) ? 0 : getConstraintParameters().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConstraintResult == false)
            return false;
        UpdateConstraintResult other = (UpdateConstraintResult) obj;

        if (other.getConstraintDetail() == null ^ this.getConstraintDetail() == null)
            return false;
        if (other.getConstraintDetail() != null
                && other.getConstraintDetail().equals(this.getConstraintDetail()) == false)
            return false;
        if (other.getConstraintParameters() == null ^ this.getConstraintParameters() == null)
            return false;
        if (other.getConstraintParameters() != null
                && other.getConstraintParameters().equals(this.getConstraintParameters()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
