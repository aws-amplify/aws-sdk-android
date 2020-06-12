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

package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;

public class GetImagePipelineResult implements Serializable {
    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String requestId;

    /**
     * <p>
     * The image pipeline object.
     * </p>
     */
    private ImagePipeline imagePipeline;

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The request ID that uniquely identifies this request.
     *         </p>
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param requestId <p>
     *            The request ID that uniquely identifies this request.
     *            </p>
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param requestId <p>
     *            The request ID that uniquely identifies this request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImagePipelineResult withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * <p>
     * The image pipeline object.
     * </p>
     *
     * @return <p>
     *         The image pipeline object.
     *         </p>
     */
    public ImagePipeline getImagePipeline() {
        return imagePipeline;
    }

    /**
     * <p>
     * The image pipeline object.
     * </p>
     *
     * @param imagePipeline <p>
     *            The image pipeline object.
     *            </p>
     */
    public void setImagePipeline(ImagePipeline imagePipeline) {
        this.imagePipeline = imagePipeline;
    }

    /**
     * <p>
     * The image pipeline object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imagePipeline <p>
     *            The image pipeline object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImagePipelineResult withImagePipeline(ImagePipeline imagePipeline) {
        this.imagePipeline = imagePipeline;
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
        if (getRequestId() != null)
            sb.append("requestId: " + getRequestId() + ",");
        if (getImagePipeline() != null)
            sb.append("imagePipeline: " + getImagePipeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode
                + ((getImagePipeline() == null) ? 0 : getImagePipeline().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImagePipelineResult == false)
            return false;
        GetImagePipelineResult other = (GetImagePipelineResult) obj;

        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getImagePipeline() == null ^ this.getImagePipeline() == null)
            return false;
        if (other.getImagePipeline() != null
                && other.getImagePipeline().equals(this.getImagePipeline()) == false)
            return false;
        return true;
    }
}
