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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a Letter of Authorization - Connecting Facility Assignment
 * (LOA-CFA) for a connection.
 * </p>
 */
public class DescribeLoaResult implements Serializable {
    /**
     * <p>
     * The binary contents of the LOA-CFA document.
     * </p>
     */
    private java.nio.ByteBuffer loaContent;

    /**
     * <p>
     * The standard media type for the LOA-CFA document. The only supported
     * value is application/pdf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/pdf
     */
    private String loaContentType;

    /**
     * <p>
     * The binary contents of the LOA-CFA document.
     * </p>
     *
     * @return <p>
     *         The binary contents of the LOA-CFA document.
     *         </p>
     */
    public java.nio.ByteBuffer getLoaContent() {
        return loaContent;
    }

    /**
     * <p>
     * The binary contents of the LOA-CFA document.
     * </p>
     *
     * @param loaContent <p>
     *            The binary contents of the LOA-CFA document.
     *            </p>
     */
    public void setLoaContent(java.nio.ByteBuffer loaContent) {
        this.loaContent = loaContent;
    }

    /**
     * <p>
     * The binary contents of the LOA-CFA document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loaContent <p>
     *            The binary contents of the LOA-CFA document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLoaResult withLoaContent(java.nio.ByteBuffer loaContent) {
        this.loaContent = loaContent;
        return this;
    }

    /**
     * <p>
     * The standard media type for the LOA-CFA document. The only supported
     * value is application/pdf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/pdf
     *
     * @return <p>
     *         The standard media type for the LOA-CFA document. The only
     *         supported value is application/pdf.
     *         </p>
     * @see LoaContentType
     */
    public String getLoaContentType() {
        return loaContentType;
    }

    /**
     * <p>
     * The standard media type for the LOA-CFA document. The only supported
     * value is application/pdf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/pdf
     *
     * @param loaContentType <p>
     *            The standard media type for the LOA-CFA document. The only
     *            supported value is application/pdf.
     *            </p>
     * @see LoaContentType
     */
    public void setLoaContentType(String loaContentType) {
        this.loaContentType = loaContentType;
    }

    /**
     * <p>
     * The standard media type for the LOA-CFA document. The only supported
     * value is application/pdf.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/pdf
     *
     * @param loaContentType <p>
     *            The standard media type for the LOA-CFA document. The only
     *            supported value is application/pdf.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoaContentType
     */
    public DescribeLoaResult withLoaContentType(String loaContentType) {
        this.loaContentType = loaContentType;
        return this;
    }

    /**
     * <p>
     * The standard media type for the LOA-CFA document. The only supported
     * value is application/pdf.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/pdf
     *
     * @param loaContentType <p>
     *            The standard media type for the LOA-CFA document. The only
     *            supported value is application/pdf.
     *            </p>
     * @see LoaContentType
     */
    public void setLoaContentType(LoaContentType loaContentType) {
        this.loaContentType = loaContentType.toString();
    }

    /**
     * <p>
     * The standard media type for the LOA-CFA document. The only supported
     * value is application/pdf.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/pdf
     *
     * @param loaContentType <p>
     *            The standard media type for the LOA-CFA document. The only
     *            supported value is application/pdf.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoaContentType
     */
    public DescribeLoaResult withLoaContentType(LoaContentType loaContentType) {
        this.loaContentType = loaContentType.toString();
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
        if (getLoaContent() != null)
            sb.append("loaContent: " + getLoaContent() + ",");
        if (getLoaContentType() != null)
            sb.append("loaContentType: " + getLoaContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoaContent() == null) ? 0 : getLoaContent().hashCode());
        hashCode = prime * hashCode
                + ((getLoaContentType() == null) ? 0 : getLoaContentType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLoaResult == false)
            return false;
        DescribeLoaResult other = (DescribeLoaResult) obj;

        if (other.getLoaContent() == null ^ this.getLoaContent() == null)
            return false;
        if (other.getLoaContent() != null
                && other.getLoaContent().equals(this.getLoaContent()) == false)
            return false;
        if (other.getLoaContentType() == null ^ this.getLoaContentType() == null)
            return false;
        if (other.getLoaContentType() != null
                && other.getLoaContentType().equals(this.getLoaContentType()) == false)
            return false;
        return true;
    }
}
