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
 * An invalidation.
 * </p>
 */
public class Invalidation implements Serializable {
    /**
     * <p>
     * The identifier for the invalidation request. For example:
     * <code>IDFDVBD632BHDS5</code>.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The status of the invalidation request. When the invalidation batch is
     * finished, the status is <code>Completed</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The date and time the invalidation request was first made.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The current invalidation information for the batch request.
     * </p>
     */
    private InvalidationBatch invalidationBatch;

    /**
     * <p>
     * The identifier for the invalidation request. For example:
     * <code>IDFDVBD632BHDS5</code>.
     * </p>
     *
     * @return <p>
     *         The identifier for the invalidation request. For example:
     *         <code>IDFDVBD632BHDS5</code>.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier for the invalidation request. For example:
     * <code>IDFDVBD632BHDS5</code>.
     * </p>
     *
     * @param id <p>
     *            The identifier for the invalidation request. For example:
     *            <code>IDFDVBD632BHDS5</code>.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the invalidation request. For example:
     * <code>IDFDVBD632BHDS5</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier for the invalidation request. For example:
     *            <code>IDFDVBD632BHDS5</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Invalidation withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The status of the invalidation request. When the invalidation batch is
     * finished, the status is <code>Completed</code>.
     * </p>
     *
     * @return <p>
     *         The status of the invalidation request. When the invalidation
     *         batch is finished, the status is <code>Completed</code>.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the invalidation request. When the invalidation batch is
     * finished, the status is <code>Completed</code>.
     * </p>
     *
     * @param status <p>
     *            The status of the invalidation request. When the invalidation
     *            batch is finished, the status is <code>Completed</code>.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the invalidation request. When the invalidation batch is
     * finished, the status is <code>Completed</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the invalidation request. When the invalidation
     *            batch is finished, the status is <code>Completed</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Invalidation withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The date and time the invalidation request was first made.
     * </p>
     *
     * @return <p>
     *         The date and time the invalidation request was first made.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The date and time the invalidation request was first made.
     * </p>
     *
     * @param createTime <p>
     *            The date and time the invalidation request was first made.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time the invalidation request was first made.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The date and time the invalidation request was first made.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Invalidation withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The current invalidation information for the batch request.
     * </p>
     *
     * @return <p>
     *         The current invalidation information for the batch request.
     *         </p>
     */
    public InvalidationBatch getInvalidationBatch() {
        return invalidationBatch;
    }

    /**
     * <p>
     * The current invalidation information for the batch request.
     * </p>
     *
     * @param invalidationBatch <p>
     *            The current invalidation information for the batch request.
     *            </p>
     */
    public void setInvalidationBatch(InvalidationBatch invalidationBatch) {
        this.invalidationBatch = invalidationBatch;
    }

    /**
     * <p>
     * The current invalidation information for the batch request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invalidationBatch <p>
     *            The current invalidation information for the batch request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Invalidation withInvalidationBatch(InvalidationBatch invalidationBatch) {
        this.invalidationBatch = invalidationBatch;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getInvalidationBatch() != null)
            sb.append("InvalidationBatch: " + getInvalidationBatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode
                + ((getInvalidationBatch() == null) ? 0 : getInvalidationBatch().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Invalidation == false)
            return false;
        Invalidation other = (Invalidation) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getInvalidationBatch() == null ^ this.getInvalidationBatch() == null)
            return false;
        if (other.getInvalidationBatch() != null
                && other.getInvalidationBatch().equals(this.getInvalidationBatch()) == false)
            return false;
        return true;
    }
}
