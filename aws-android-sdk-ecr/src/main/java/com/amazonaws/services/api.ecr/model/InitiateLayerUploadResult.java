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

package com.amazonaws.services.api.ecr.model;

import java.io.Serializable;

public class InitiateLayerUploadResult implements Serializable {
    /**
     * <p>
     * The upload ID for the layer upload. This parameter is passed to further
     * <a>UploadLayerPart</a> and <a>CompleteLayerUpload</a> operations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     */
    private String uploadId;

    /**
     * <p>
     * The size, in bytes, that Amazon ECR expects future layer part uploads to
     * be.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long partSize;

    /**
     * <p>
     * The upload ID for the layer upload. This parameter is passed to further
     * <a>UploadLayerPart</a> and <a>CompleteLayerUpload</a> operations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>
     *         The upload ID for the layer upload. This parameter is passed to
     *         further <a>UploadLayerPart</a> and <a>CompleteLayerUpload</a>
     *         operations.
     *         </p>
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * <p>
     * The upload ID for the layer upload. This parameter is passed to further
     * <a>UploadLayerPart</a> and <a>CompleteLayerUpload</a> operations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param uploadId <p>
     *            The upload ID for the layer upload. This parameter is passed
     *            to further <a>UploadLayerPart</a> and
     *            <a>CompleteLayerUpload</a> operations.
     *            </p>
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * The upload ID for the layer upload. This parameter is passed to further
     * <a>UploadLayerPart</a> and <a>CompleteLayerUpload</a> operations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param uploadId <p>
     *            The upload ID for the layer upload. This parameter is passed
     *            to further <a>UploadLayerPart</a> and
     *            <a>CompleteLayerUpload</a> operations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InitiateLayerUploadResult withUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }

    /**
     * <p>
     * The size, in bytes, that Amazon ECR expects future layer part uploads to
     * be.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The size, in bytes, that Amazon ECR expects future layer part
     *         uploads to be.
     *         </p>
     */
    public Long getPartSize() {
        return partSize;
    }

    /**
     * <p>
     * The size, in bytes, that Amazon ECR expects future layer part uploads to
     * be.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param partSize <p>
     *            The size, in bytes, that Amazon ECR expects future layer part
     *            uploads to be.
     *            </p>
     */
    public void setPartSize(Long partSize) {
        this.partSize = partSize;
    }

    /**
     * <p>
     * The size, in bytes, that Amazon ECR expects future layer part uploads to
     * be.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param partSize <p>
     *            The size, in bytes, that Amazon ECR expects future layer part
     *            uploads to be.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InitiateLayerUploadResult withPartSize(Long partSize) {
        this.partSize = partSize;
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
        if (getUploadId() != null)
            sb.append("uploadId: " + getUploadId() + ",");
        if (getPartSize() != null)
            sb.append("partSize: " + getPartSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode + ((getPartSize() == null) ? 0 : getPartSize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InitiateLayerUploadResult == false)
            return false;
        InitiateLayerUploadResult other = (InitiateLayerUploadResult) obj;

        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        if (other.getPartSize() == null ^ this.getPartSize() == null)
            return false;
        if (other.getPartSize() != null && other.getPartSize().equals(this.getPartSize()) == false)
            return false;
        return true;
    }
}
