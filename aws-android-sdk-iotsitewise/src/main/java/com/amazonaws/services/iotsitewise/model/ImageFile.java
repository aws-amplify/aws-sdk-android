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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1500000<br/>
     */
    private java.nio.ByteBuffer data;

    /**
     * <p>
     * The file type of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PNG
     */
    private String type;

    /**
     * <p>
     * The image file contents, represented as a base64-encoded string. The file
     * size must be less than 1 MB.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1500000<br/>
     *
     * @return <p>
     *         The image file contents, represented as a base64-encoded string.
     *         The file size must be less than 1 MB.
     *         </p>
     */
    public java.nio.ByteBuffer getData() {
        return data;
    }

    /**
     * <p>
     * The image file contents, represented as a base64-encoded string. The file
     * size must be less than 1 MB.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1500000<br/>
     *
     * @param data <p>
     *            The image file contents, represented as a base64-encoded
     *            string. The file size must be less than 1 MB.
     *            </p>
     */
    public void setData(java.nio.ByteBuffer data) {
        this.data = data;
    }

    /**
     * <p>
     * The image file contents, represented as a base64-encoded string. The file
     * size must be less than 1 MB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1500000<br/>
     *
     * @param data <p>
     *            The image file contents, represented as a base64-encoded
     *            string. The file size must be less than 1 MB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageFile withData(java.nio.ByteBuffer data) {
        this.data = data;
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
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The file type of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PNG
     *
     * @param type <p>
     *            The file type of the image.
     *            </p>
     * @see ImageFileType
     */
    public void setType(String type) {
        this.type = type;
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
     * @param type <p>
     *            The file type of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageFileType
     */
    public ImageFile withType(String type) {
        this.type = type;
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
     * @param type <p>
     *            The file type of the image.
     *            </p>
     * @see ImageFileType
     */
    public void setType(ImageFileType type) {
        this.type = type.toString();
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
     * @param type <p>
     *            The file type of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageFileType
     */
    public ImageFile withType(ImageFileType type) {
        this.type = type.toString();
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
        if (getData() != null)
            sb.append("data: " + getData() + ",");
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
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

        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
