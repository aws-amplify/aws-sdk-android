/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class GetMapGlyphsResult implements Serializable {
    /**
     * <p>
     * The glyph, as binary blob.
     * </p>
     */
    private java.nio.ByteBuffer blob;

    /**
     * <p>
     * The map glyph content type. For example,
     * <code>application/octet-stream</code>.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * The HTTP Cache-Control directive for the value.
     * </p>
     */
    private String cacheControl;

    /**
     * <p>
     * The glyph, as binary blob.
     * </p>
     *
     * @return <p>
     *         The glyph, as binary blob.
     *         </p>
     */
    public java.nio.ByteBuffer getBlob() {
        return blob;
    }

    /**
     * <p>
     * The glyph, as binary blob.
     * </p>
     *
     * @param blob <p>
     *            The glyph, as binary blob.
     *            </p>
     */
    public void setBlob(java.nio.ByteBuffer blob) {
        this.blob = blob;
    }

    /**
     * <p>
     * The glyph, as binary blob.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blob <p>
     *            The glyph, as binary blob.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMapGlyphsResult withBlob(java.nio.ByteBuffer blob) {
        this.blob = blob;
        return this;
    }

    /**
     * <p>
     * The map glyph content type. For example,
     * <code>application/octet-stream</code>.
     * </p>
     *
     * @return <p>
     *         The map glyph content type. For example,
     *         <code>application/octet-stream</code>.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The map glyph content type. For example,
     * <code>application/octet-stream</code>.
     * </p>
     *
     * @param contentType <p>
     *            The map glyph content type. For example,
     *            <code>application/octet-stream</code>.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The map glyph content type. For example,
     * <code>application/octet-stream</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentType <p>
     *            The map glyph content type. For example,
     *            <code>application/octet-stream</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMapGlyphsResult withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * The HTTP Cache-Control directive for the value.
     * </p>
     *
     * @return <p>
     *         The HTTP Cache-Control directive for the value.
     *         </p>
     */
    public String getCacheControl() {
        return cacheControl;
    }

    /**
     * <p>
     * The HTTP Cache-Control directive for the value.
     * </p>
     *
     * @param cacheControl <p>
     *            The HTTP Cache-Control directive for the value.
     *            </p>
     */
    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    /**
     * <p>
     * The HTTP Cache-Control directive for the value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheControl <p>
     *            The HTTP Cache-Control directive for the value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMapGlyphsResult withCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
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
            sb.append("ContentType: " + getContentType() + ",");
        if (getCacheControl() != null)
            sb.append("CacheControl: " + getCacheControl());
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
        hashCode = prime * hashCode
                + ((getCacheControl() == null) ? 0 : getCacheControl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMapGlyphsResult == false)
            return false;
        GetMapGlyphsResult other = (GetMapGlyphsResult) obj;

        if (other.getBlob() == null ^ this.getBlob() == null)
            return false;
        if (other.getBlob() != null && other.getBlob().equals(this.getBlob()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getCacheControl() == null ^ this.getCacheControl() == null)
            return false;
        if (other.getCacheControl() != null
                && other.getCacheControl().equals(this.getCacheControl()) == false)
            return false;
        return true;
    }
}
