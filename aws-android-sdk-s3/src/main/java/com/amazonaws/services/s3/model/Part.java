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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Container for elements related to a part.
 * </p>
 */
public class Part implements Serializable {
    /**
     * <p>
     * Part number identifying the part. This is a positive integer between 1
     * and 10,000.
     * </p>
     */
    private Integer partNumber;

    /**
     * <p>
     * Date and time at which the part was uploaded.
     * </p>
     */
    private java.util.Date lastModified;

    /**
     * <p>
     * Entity tag returned when the part was uploaded.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * Size in bytes of the uploaded part data.
     * </p>
     */
    private Integer size;

    /**
     * <p>
     * Part number identifying the part. This is a positive integer between 1
     * and 10,000.
     * </p>
     *
     * @return <p>
     *         Part number identifying the part. This is a positive integer
     *         between 1 and 10,000.
     *         </p>
     */
    public Integer getPartNumber() {
        return partNumber;
    }

    /**
     * <p>
     * Part number identifying the part. This is a positive integer between 1
     * and 10,000.
     * </p>
     *
     * @param partNumber <p>
     *            Part number identifying the part. This is a positive integer
     *            between 1 and 10,000.
     *            </p>
     */
    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * <p>
     * Part number identifying the part. This is a positive integer between 1
     * and 10,000.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partNumber <p>
     *            Part number identifying the part. This is a positive integer
     *            between 1 and 10,000.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Part withPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
        return this;
    }

    /**
     * <p>
     * Date and time at which the part was uploaded.
     * </p>
     *
     * @return <p>
     *         Date and time at which the part was uploaded.
     *         </p>
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }

    /**
     * <p>
     * Date and time at which the part was uploaded.
     * </p>
     *
     * @param lastModified <p>
     *            Date and time at which the part was uploaded.
     *            </p>
     */
    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * Date and time at which the part was uploaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModified <p>
     *            Date and time at which the part was uploaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Part withLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * <p>
     * Entity tag returned when the part was uploaded.
     * </p>
     *
     * @return <p>
     *         Entity tag returned when the part was uploaded.
     *         </p>
     */
    public String getETag() {
        return eTag;
    }

    /**
     * <p>
     * Entity tag returned when the part was uploaded.
     * </p>
     *
     * @param eTag <p>
     *            Entity tag returned when the part was uploaded.
     *            </p>
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * Entity tag returned when the part was uploaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eTag <p>
     *            Entity tag returned when the part was uploaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Part withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * <p>
     * Size in bytes of the uploaded part data.
     * </p>
     *
     * @return <p>
     *         Size in bytes of the uploaded part data.
     *         </p>
     */
    public Integer getSize() {
        return size;
    }

    /**
     * <p>
     * Size in bytes of the uploaded part data.
     * </p>
     *
     * @param size <p>
     *            Size in bytes of the uploaded part data.
     *            </p>
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * Size in bytes of the uploaded part data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param size <p>
     *            Size in bytes of the uploaded part data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Part withSize(Integer size) {
        this.size = size;
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
        if (getPartNumber() != null)
            sb.append("PartNumber: " + getPartNumber() + ",");
        if (getLastModified() != null)
            sb.append("LastModified: " + getLastModified() + ",");
        if (getETag() != null)
            sb.append("ETag: " + getETag() + ",");
        if (getSize() != null)
            sb.append("Size: " + getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartNumber() == null) ? 0 : getPartNumber().hashCode());
        hashCode = prime * hashCode
                + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Part == false)
            return false;
        Part other = (Part) obj;

        if (other.getPartNumber() == null ^ this.getPartNumber() == null)
            return false;
        if (other.getPartNumber() != null
                && other.getPartNumber().equals(this.getPartNumber()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null
                && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }
}
