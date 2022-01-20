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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class CreateQueueResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     */
    private String queueArn;

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     */
    private String queueId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the queue.
     *         </p>
     */
    public String getQueueArn() {
        return queueArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     *
     * @param queueArn <p>
     *            The Amazon Resource Name (ARN) of the queue.
     *            </p>
     */
    public void setQueueArn(String queueArn) {
        this.queueArn = queueArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueArn <p>
     *            The Amazon Resource Name (ARN) of the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueueResult withQueueArn(String queueArn) {
        this.queueArn = queueArn;
        return this;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     *
     * @return <p>
     *         The identifier for the queue.
     *         </p>
     */
    public String getQueueId() {
        return queueId;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     *
     * @param queueId <p>
     *            The identifier for the queue.
     *            </p>
     */
    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The identifier for the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueId <p>
     *            The identifier for the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueueResult withQueueId(String queueId) {
        this.queueId = queueId;
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
        if (getQueueArn() != null)
            sb.append("QueueArn: " + getQueueArn() + ",");
        if (getQueueId() != null)
            sb.append("QueueId: " + getQueueId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueArn() == null) ? 0 : getQueueArn().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateQueueResult == false)
            return false;
        CreateQueueResult other = (CreateQueueResult) obj;

        if (other.getQueueArn() == null ^ this.getQueueArn() == null)
            return false;
        if (other.getQueueArn() != null && other.getQueueArn().equals(this.getQueueArn()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        return true;
    }
}
