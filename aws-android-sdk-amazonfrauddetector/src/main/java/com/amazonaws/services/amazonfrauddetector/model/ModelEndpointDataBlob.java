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

package com.amazonaws.services.amazonfrauddetector.model;

import java.io.Serializable;

/**
 * <p>
 * A pre-formed Amazon SageMaker model input you can include if your detector
 * version includes an imported Amazon SageMaker model endpoint with
 * pass-through input configuration.
 * </p>
 */
public class ModelEndpointDataBlob implements Serializable {
    /**
     * <p>
     * The byte buffer of the Amazon SageMaker model endpoint input data blob.
     * </p>
     */
    private java.nio.ByteBuffer byteBufferValue;

    /**
     * <p>
     * The content type of the Amazon SageMaker model endpoint input data blob.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String contentType;

    /**
     * <p>
     * The byte buffer of the Amazon SageMaker model endpoint input data blob.
     * </p>
     *
     * @return <p>
     *         The byte buffer of the Amazon SageMaker model endpoint input data
     *         blob.
     *         </p>
     */
    public java.nio.ByteBuffer getByteBuffer() {
        return byteBufferValue;
    }

    /**
     * <p>
     * The byte buffer of the Amazon SageMaker model endpoint input data blob.
     * </p>
     *
     * @param byteBufferValue <p>
     *            The byte buffer of the Amazon SageMaker model endpoint input
     *            data blob.
     *            </p>
     */
    public void setByteBuffer(java.nio.ByteBuffer byteBufferValue) {
        this.byteBufferValue = byteBufferValue;
    }

    /**
     * <p>
     * The byte buffer of the Amazon SageMaker model endpoint input data blob.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param byteBufferValue <p>
     *            The byte buffer of the Amazon SageMaker model endpoint input
     *            data blob.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelEndpointDataBlob withByteBuffer(java.nio.ByteBuffer byteBufferValue) {
        this.byteBufferValue = byteBufferValue;
        return this;
    }

    /**
     * <p>
     * The content type of the Amazon SageMaker model endpoint input data blob.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The content type of the Amazon SageMaker model endpoint input
     *         data blob.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The content type of the Amazon SageMaker model endpoint input data blob.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param contentType <p>
     *            The content type of the Amazon SageMaker model endpoint input
     *            data blob.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the Amazon SageMaker model endpoint input data blob.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param contentType <p>
     *            The content type of the Amazon SageMaker model endpoint input
     *            data blob.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelEndpointDataBlob withContentType(String contentType) {
        this.contentType = contentType;
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
        if (getByteBuffer() != null)
            sb.append("byteBuffer: " + getByteBuffer() + ",");
        if (getContentType() != null)
            sb.append("contentType: " + getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getByteBuffer() == null) ? 0 : getByteBuffer().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelEndpointDataBlob == false)
            return false;
        ModelEndpointDataBlob other = (ModelEndpointDataBlob) obj;

        if (other.getByteBuffer() == null ^ this.getByteBuffer() == null)
            return false;
        if (other.getByteBuffer() != null
                && other.getByteBuffer().equals(this.getByteBuffer()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }
}
