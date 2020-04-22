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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a resize operation.
 * </p>
 */
public class ResizeInfo implements Serializable {
    /**
     * <p>
     * Returns the value <code>ClassicResize</code>.
     * </p>
     */
    private String resizeType;

    /**
     * <p>
     * A boolean value indicating if the resize operation can be cancelled.
     * </p>
     */
    private Boolean allowCancelResize;

    /**
     * <p>
     * Returns the value <code>ClassicResize</code>.
     * </p>
     *
     * @return <p>
     *         Returns the value <code>ClassicResize</code>.
     *         </p>
     */
    public String getResizeType() {
        return resizeType;
    }

    /**
     * <p>
     * Returns the value <code>ClassicResize</code>.
     * </p>
     *
     * @param resizeType <p>
     *            Returns the value <code>ClassicResize</code>.
     *            </p>
     */
    public void setResizeType(String resizeType) {
        this.resizeType = resizeType;
    }

    /**
     * <p>
     * Returns the value <code>ClassicResize</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resizeType <p>
     *            Returns the value <code>ClassicResize</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResizeInfo withResizeType(String resizeType) {
        this.resizeType = resizeType;
        return this;
    }

    /**
     * <p>
     * A boolean value indicating if the resize operation can be cancelled.
     * </p>
     *
     * @return <p>
     *         A boolean value indicating if the resize operation can be
     *         cancelled.
     *         </p>
     */
    public Boolean isAllowCancelResize() {
        return allowCancelResize;
    }

    /**
     * <p>
     * A boolean value indicating if the resize operation can be cancelled.
     * </p>
     *
     * @return <p>
     *         A boolean value indicating if the resize operation can be
     *         cancelled.
     *         </p>
     */
    public Boolean getAllowCancelResize() {
        return allowCancelResize;
    }

    /**
     * <p>
     * A boolean value indicating if the resize operation can be cancelled.
     * </p>
     *
     * @param allowCancelResize <p>
     *            A boolean value indicating if the resize operation can be
     *            cancelled.
     *            </p>
     */
    public void setAllowCancelResize(Boolean allowCancelResize) {
        this.allowCancelResize = allowCancelResize;
    }

    /**
     * <p>
     * A boolean value indicating if the resize operation can be cancelled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowCancelResize <p>
     *            A boolean value indicating if the resize operation can be
     *            cancelled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResizeInfo withAllowCancelResize(Boolean allowCancelResize) {
        this.allowCancelResize = allowCancelResize;
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
        if (getResizeType() != null)
            sb.append("ResizeType: " + getResizeType() + ",");
        if (getAllowCancelResize() != null)
            sb.append("AllowCancelResize: " + getAllowCancelResize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResizeType() == null) ? 0 : getResizeType().hashCode());
        hashCode = prime * hashCode
                + ((getAllowCancelResize() == null) ? 0 : getAllowCancelResize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResizeInfo == false)
            return false;
        ResizeInfo other = (ResizeInfo) obj;

        if (other.getResizeType() == null ^ this.getResizeType() == null)
            return false;
        if (other.getResizeType() != null
                && other.getResizeType().equals(this.getResizeType()) == false)
            return false;
        if (other.getAllowCancelResize() == null ^ this.getAllowCancelResize() == null)
            return false;
        if (other.getAllowCancelResize() != null
                && other.getAllowCancelResize().equals(this.getAllowCancelResize()) == false)
            return false;
        return true;
    }
}
