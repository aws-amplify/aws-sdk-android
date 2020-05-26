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

public class CreateIngestionResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the data ingestion.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * An ID for the ingestion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String ingestionId;

    /**
     * <p>
     * The ingestion status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZED, QUEUED, RUNNING, FAILED, COMPLETED,
     * CANCELLED
     */
    private String ingestionStatus;

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
     * The Amazon Resource Name (ARN) for the data ingestion.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the data ingestion.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the data ingestion.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) for the data ingestion.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the data ingestion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) for the data ingestion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIngestionResult withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * An ID for the ingestion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         An ID for the ingestion.
     *         </p>
     */
    public String getIngestionId() {
        return ingestionId;
    }

    /**
     * <p>
     * An ID for the ingestion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param ingestionId <p>
     *            An ID for the ingestion.
     *            </p>
     */
    public void setIngestionId(String ingestionId) {
        this.ingestionId = ingestionId;
    }

    /**
     * <p>
     * An ID for the ingestion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param ingestionId <p>
     *            An ID for the ingestion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIngestionResult withIngestionId(String ingestionId) {
        this.ingestionId = ingestionId;
        return this;
    }

    /**
     * <p>
     * The ingestion status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZED, QUEUED, RUNNING, FAILED, COMPLETED,
     * CANCELLED
     *
     * @return <p>
     *         The ingestion status.
     *         </p>
     * @see IngestionStatus
     */
    public String getIngestionStatus() {
        return ingestionStatus;
    }

    /**
     * <p>
     * The ingestion status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZED, QUEUED, RUNNING, FAILED, COMPLETED,
     * CANCELLED
     *
     * @param ingestionStatus <p>
     *            The ingestion status.
     *            </p>
     * @see IngestionStatus
     */
    public void setIngestionStatus(String ingestionStatus) {
        this.ingestionStatus = ingestionStatus;
    }

    /**
     * <p>
     * The ingestion status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZED, QUEUED, RUNNING, FAILED, COMPLETED,
     * CANCELLED
     *
     * @param ingestionStatus <p>
     *            The ingestion status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IngestionStatus
     */
    public CreateIngestionResult withIngestionStatus(String ingestionStatus) {
        this.ingestionStatus = ingestionStatus;
        return this;
    }

    /**
     * <p>
     * The ingestion status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZED, QUEUED, RUNNING, FAILED, COMPLETED,
     * CANCELLED
     *
     * @param ingestionStatus <p>
     *            The ingestion status.
     *            </p>
     * @see IngestionStatus
     */
    public void setIngestionStatus(IngestionStatus ingestionStatus) {
        this.ingestionStatus = ingestionStatus.toString();
    }

    /**
     * <p>
     * The ingestion status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZED, QUEUED, RUNNING, FAILED, COMPLETED,
     * CANCELLED
     *
     * @param ingestionStatus <p>
     *            The ingestion status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IngestionStatus
     */
    public CreateIngestionResult withIngestionStatus(IngestionStatus ingestionStatus) {
        this.ingestionStatus = ingestionStatus.toString();
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
    public CreateIngestionResult withRequestId(String requestId) {
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
    public CreateIngestionResult withStatus(Integer status) {
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getIngestionId() != null)
            sb.append("IngestionId: " + getIngestionId() + ",");
        if (getIngestionStatus() != null)
            sb.append("IngestionStatus: " + getIngestionStatus() + ",");
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getIngestionId() == null) ? 0 : getIngestionId().hashCode());
        hashCode = prime * hashCode
                + ((getIngestionStatus() == null) ? 0 : getIngestionStatus().hashCode());
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

        if (obj instanceof CreateIngestionResult == false)
            return false;
        CreateIngestionResult other = (CreateIngestionResult) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getIngestionId() == null ^ this.getIngestionId() == null)
            return false;
        if (other.getIngestionId() != null
                && other.getIngestionId().equals(this.getIngestionId()) == false)
            return false;
        if (other.getIngestionStatus() == null ^ this.getIngestionStatus() == null)
            return false;
        if (other.getIngestionStatus() != null
                && other.getIngestionStatus().equals(this.getIngestionStatus()) == false)
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
