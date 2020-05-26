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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

public class UpdateDataSetPermissionsResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     */
    private String dataSetArn;

    /**
     * <p>
     * The ID for the dataset whose permissions you want to update. This ID is
     * unique per AWS Region for each AWS account.
     * </p>
     */
    private String dataSetId;

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the dataset.
     *         </p>
     */
    public String getDataSetArn() {
        return dataSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     *
     * @param dataSetArn <p>
     *            The Amazon Resource Name (ARN) of the dataset.
     *            </p>
     */
    public void setDataSetArn(String dataSetArn) {
        this.dataSetArn = dataSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSetArn <p>
     *            The Amazon Resource Name (ARN) of the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSetPermissionsResult withDataSetArn(String dataSetArn) {
        this.dataSetArn = dataSetArn;
        return this;
    }

    /**
     * <p>
     * The ID for the dataset whose permissions you want to update. This ID is
     * unique per AWS Region for each AWS account.
     * </p>
     *
     * @return <p>
     *         The ID for the dataset whose permissions you want to update. This
     *         ID is unique per AWS Region for each AWS account.
     *         </p>
     */
    public String getDataSetId() {
        return dataSetId;
    }

    /**
     * <p>
     * The ID for the dataset whose permissions you want to update. This ID is
     * unique per AWS Region for each AWS account.
     * </p>
     *
     * @param dataSetId <p>
     *            The ID for the dataset whose permissions you want to update.
     *            This ID is unique per AWS Region for each AWS account.
     *            </p>
     */
    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The ID for the dataset whose permissions you want to update. This ID is
     * unique per AWS Region for each AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSetId <p>
     *            The ID for the dataset whose permissions you want to update.
     *            This ID is unique per AWS Region for each AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSetPermissionsResult withDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     *
     * @return <p>
     *         The AWS request ID for this operation.
     *         </p>
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     *
     * @param requestId <p>
     *            The AWS request ID for this operation.
     *            </p>
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId <p>
     *            The AWS request ID for this operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSetPermissionsResult withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     *
     * @return <p>
     *         The HTTP status of the request.
     *         </p>
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     *
     * @param status <p>
     *            The HTTP status of the request.
     *            </p>
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The HTTP status of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSetPermissionsResult withStatus(Integer status) {
        this.status = status;
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
        if (getDataSetArn() != null)
            sb.append("DataSetArn: " + getDataSetArn() + ",");
        if (getDataSetId() != null)
            sb.append("DataSetId: " + getDataSetId() + ",");
        if (getRequestId() != null)
            sb.append("RequestId: " + getRequestId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetArn() == null) ? 0 : getDataSetArn().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDataSetPermissionsResult == false)
            return false;
        UpdateDataSetPermissionsResult other = (UpdateDataSetPermissionsResult) obj;

        if (other.getDataSetArn() == null ^ this.getDataSetArn() == null)
            return false;
        if (other.getDataSetArn() != null
                && other.getDataSetArn().equals(this.getDataSetArn()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null
                && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
