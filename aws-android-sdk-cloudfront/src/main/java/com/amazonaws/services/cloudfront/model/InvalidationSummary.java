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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * A summary of an invalidation request.
 * </p>
 */
public class InvalidationSummary implements Serializable {
    /**
     * <p>
     * The unique ID for an invalidation request.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The time that an invalidation request was created.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The status of an invalidation request.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The unique ID for an invalidation request.
     * </p>
     *
     * @return <p>
     *         The unique ID for an invalidation request.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique ID for an invalidation request.
     * </p>
     *
     * @param id <p>
     *            The unique ID for an invalidation request.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID for an invalidation request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique ID for an invalidation request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvalidationSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The time that an invalidation request was created.
     * </p>
     *
     * @return <p>
     *         The time that an invalidation request was created.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The time that an invalidation request was created.
     * </p>
     *
     * @param createTime <p>
     *            The time that an invalidation request was created.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time that an invalidation request was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The time that an invalidation request was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvalidationSummary withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The status of an invalidation request.
     * </p>
     *
     * @return <p>
     *         The status of an invalidation request.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of an invalidation request.
     * </p>
     *
     * @param status <p>
     *            The status of an invalidation request.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of an invalidation request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of an invalidation request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvalidationSummary withStatus(String status) {
        this.status = status;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvalidationSummary == false)
            return false;
        InvalidationSummary other = (InvalidationSummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
