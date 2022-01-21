/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

public class GetMapSpritesResult implements Serializable {
    /**
     * <p>
     * Contains the body of the sprite sheet or JSON offset ﬁle.
     * </p>
     */
    private java.nio.ByteBuffer blob;

    /**
     * <p>
     * The content type of the sprite sheet and offsets. For example, the sprite
     * sheet content type is <code>image/png</code>, and the sprite offset JSON
     * document is <code>application/json</code>.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * Contains the body of the sprite sheet or JSON offset ﬁle.
     * </p>
     *
     * @return <p>
     *         Contains the body of the sprite sheet or JSON offset ﬁle.
     *         </p>
     */
    public java.nio.ByteBuffer getBlob() {
        return blob;
    }

    /**
     * <p>
     * Contains the body of the sprite sheet or JSON offset ﬁle.
     * </p>
     *
     * @param blob <p>
     *            Contains the body of the sprite sheet or JSON offset ﬁle.
     *            </p>
     */
    public void setBlob(java.nio.ByteBuffer blob) {
        this.blob = blob;
    }

    /**
     * <p>
     * Contains the body of the sprite sheet or JSON offset ﬁle.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blob <p>
     *            Contains the body of the sprite sheet or JSON offset ﬁle.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMapSpritesResult withBlob(java.nio.ByteBuffer blob) {
        this.blob = blob;
        return this;
    }

    /**
     * <p>
     * The content type of the sprite sheet and offsets. For example, the sprite
     * sheet content type is <code>image/png</code>, and the sprite offset JSON
     * document is <code>application/json</code>.
     * </p>
     *
     * @return <p>
     *         The content type of the sprite sheet and offsets. For example,
     *         the sprite sheet content type is <code>image/png</code>, and the
     *         sprite offset JSON document is <code>application/json</code>.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The content type of the sprite sheet and offsets. For example, the sprite
     * sheet content type is <code>image/png</code>, and the sprite offset JSON
     * document is <code>application/json</code>.
     * </p>
     *
     * @param contentType <p>
     *            The content type of the sprite sheet and offsets. For example,
     *            the sprite sheet content type is <code>image/png</code>, and
     *            the sprite offset JSON document is
     *            <code>application/json</code>.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the sprite sheet and offsets. For example, the sprite
     * sheet content type is <code>image/png</code>, and the sprite offset JSON
     * document is <code>application/json</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentType <p>
     *            The content type of the sprite sheet and offsets. For example,
     *            the sprite sheet content type is <code>image/png</code>, and
     *            the sprite offset JSON document is
     *            <code>application/json</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMapSpritesResult withContentType(String contentType) {
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
        if (getBlob() != null)
            sb.append("Blob: " + getBlob() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlob() == null) ? 0 : getBlob().hashCode());
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

        if (obj instanceof GetMapSpritesResult == false)
            return false;
        GetMapSpritesResult other = (GetMapSpritesResult) obj;

        if (other.getBlob() == null ^ this.getBlob() == null)
            return false;
        if (other.getBlob() != null && other.getBlob().equals(this.getBlob()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }
}
