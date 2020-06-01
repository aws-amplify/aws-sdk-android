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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The timeline of the instance group lifecycle.
 * </p>
 */
public class InstanceGroupTimeline implements Serializable {
    /**
     * <p>
     * The creation date and time of the instance group.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The date and time when the instance group became ready to perform tasks.
     * </p>
     */
    private java.util.Date readyDateTime;

    /**
     * <p>
     * The date and time when the instance group terminated.
     * </p>
     */
    private java.util.Date endDateTime;

    /**
     * <p>
     * The creation date and time of the instance group.
     * </p>
     *
     * @return <p>
     *         The creation date and time of the instance group.
     *         </p>
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * <p>
     * The creation date and time of the instance group.
     * </p>
     *
     * @param creationDateTime <p>
     *            The creation date and time of the instance group.
     *            </p>
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time of the instance group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDateTime <p>
     *            The creation date and time of the instance group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupTimeline withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * <p>
     * The date and time when the instance group became ready to perform tasks.
     * </p>
     *
     * @return <p>
     *         The date and time when the instance group became ready to perform
     *         tasks.
     *         </p>
     */
    public java.util.Date getReadyDateTime() {
        return readyDateTime;
    }

    /**
     * <p>
     * The date and time when the instance group became ready to perform tasks.
     * </p>
     *
     * @param readyDateTime <p>
     *            The date and time when the instance group became ready to
     *            perform tasks.
     *            </p>
     */
    public void setReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
    }

    /**
     * <p>
     * The date and time when the instance group became ready to perform tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readyDateTime <p>
     *            The date and time when the instance group became ready to
     *            perform tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupTimeline withReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
        return this;
    }

    /**
     * <p>
     * The date and time when the instance group terminated.
     * </p>
     *
     * @return <p>
     *         The date and time when the instance group terminated.
     *         </p>
     */
    public java.util.Date getEndDateTime() {
        return endDateTime;
    }

    /**
     * <p>
     * The date and time when the instance group terminated.
     * </p>
     *
     * @param endDateTime <p>
     *            The date and time when the instance group terminated.
     *            </p>
     */
    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * The date and time when the instance group terminated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endDateTime <p>
     *            The date and time when the instance group terminated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceGroupTimeline withEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
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
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: " + getCreationDateTime() + ",");
        if (getReadyDateTime() != null)
            sb.append("ReadyDateTime: " + getReadyDateTime() + ",");
        if (getEndDateTime() != null)
            sb.append("EndDateTime: " + getEndDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getReadyDateTime() == null) ? 0 : getReadyDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceGroupTimeline == false)
            return false;
        InstanceGroupTimeline other = (InstanceGroupTimeline) obj;

        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null
                && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getReadyDateTime() == null ^ this.getReadyDateTime() == null)
            return false;
        if (other.getReadyDateTime() != null
                && other.getReadyDateTime().equals(this.getReadyDateTime()) == false)
            return false;
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null)
            return false;
        if (other.getEndDateTime() != null
                && other.getEndDateTime().equals(this.getEndDateTime()) == false)
            return false;
        return true;
    }
}
