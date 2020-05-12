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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

/**
 * <p>
 * Contains an image file.
 * </p>
 */
public class ImageFile implements Serializable {
    /**
     * <p>
     * The image file contents, represented as a base64-encoded string. The file
     * size must be less than 1 MB.
     * </p>
     */
    private java.nio.ByteBuffer encodedString;

    /**
     * <p>
     * The file type of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PNG
     */
    private String fileType;

    /**
     * <p>
     * The image file contents, represented as a base64-encoded string. The file
     * size must be less than 1 MB.
     * </p>
     *
     * @return <p>
     *         The image file contents, represented as a base64-encoded string.
     *         The file size must be less than 1 MB.
     *         </p>
     */
    public java.nio.ByteBuffer getEncodedString() {
        return encodedString;
    }

    /**
     * <p>
     * The image file contents, represented as a base64-encoded string. The file
     * size must be less than 1 MB.
     * </p>
     *
     * @param encodedString <p>
     *            The image file contents, represented as a base64-encoded
     *            string. The file size must be less than 1 MB.
     *            </p>
     */
    public void setEncodedString(java.nio.ByteBuffer encodedString) {
        this.encodedString = encodedString;
    }

    /**
     * <p>
     * The image file contents, represented as a base64-encoded string. The file
     * size must be less than 1 MB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encodedString <p>
     *            The image file contents, represented as a base64-encoded
     *            string. The file size must be less than 1 MB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageFile withEncodedString(java.nio.ByteBuffer encodedString) {
        this.encodedString = encodedString;
        return this;
    }

    /**
     * <p>
     * The file type of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PNG
     *
     * @return <p>
     *         The file type of the image.
     *         </p>
     * @see ImageFileType
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * <p>
     * The file type of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PNG
     *
     * @param fileType <p>
     *            The file type of the image.
     *            </p>
     * @see ImageFileType
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * <p>
     * The file type of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PNG
     *
     * @param fileType <p>
     *            The file type of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageFileType
     */
    public ImageFile withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * <p>
     * The file type of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PNG
     *
     * @param fileType <p>
     *            The file type of the image.
     *            </p>
     * @see ImageFileType
     */
    public void setFileType(ImageFileType fileType) {
        this.fileType = fileType.toString();
    }

    /**
     * <p>
     * The file type of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PNG
     *
     * @param fileType <p>
     *            The file type of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageFileType
     */
    public ImageFile withFileType(ImageFileType fileType) {
        this.fileType = fileType.toString();
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
        if (getEncodedString() != null)
            sb.append("encodedString: " + getEncodedString() + ",");
        if (getFileType() != null)
            sb.append("fileType: " + getFileType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEncodedString() == null) ? 0 : getEncodedString().hashCode());
        hashCode = prime * hashCode + ((getFileType() == null) ? 0 : getFileType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageFile == false)
            return false;
        ImageFile other = (ImageFile) obj;

        if (other.getEncodedString() == null ^ this.getEncodedString() == null)
            return false;
        if (other.getEncodedString() != null
                && other.getEncodedString().equals(this.getEncodedString()) == false)
            return false;
        if (other.getFileType() == null ^ this.getFileType() == null)
            return false;
        if (other.getFileType() != null && other.getFileType().equals(this.getFileType()) == false)
            return false;
        return true;
    }
}
