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
 * Container for all response elements.
 * </p>
 */
public class CopyPartResult implements Serializable {
    /**
     * <p>
     * Entity tag of the object.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * Date and time at which the object was uploaded.
     * </p>
     */
    private java.util.Date lastModified;

    /**
     * <p>
     * Entity tag of the object.
     * </p>
     *
     * @return <p>
     *         Entity tag of the object.
     *         </p>
     */
    public String getETag() {
        return eTag;
    }

    /**
     * <p>
     * Entity tag of the object.
     * </p>
     *
     * @param eTag <p>
     *            Entity tag of the object.
     *            </p>
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * Entity tag of the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eTag <p>
     *            Entity tag of the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyPartResult withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * <p>
     * Date and time at which the object was uploaded.
     * </p>
     *
     * @return <p>
     *         Date and time at which the object was uploaded.
     *         </p>
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }

    /**
     * <p>
     * Date and time at which the object was uploaded.
     * </p>
     *
     * @param lastModified <p>
     *            Date and time at which the object was uploaded.
     *            </p>
     */
    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * Date and time at which the object was uploaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModified <p>
     *            Date and time at which the object was uploaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyPartResult withLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
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
        if (getETag() != null)
            sb.append("ETag: " + getETag() + ",");
        if (getLastModified() != null)
            sb.append("LastModified: " + getLastModified());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode
                + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyPartResult == false)
            return false;
        CopyPartResult other = (CopyPartResult) obj;

        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null
                && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        return true;
    }
}
