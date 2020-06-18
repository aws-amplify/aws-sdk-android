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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

public class UpdateQueueResult implements Serializable {
    /**
     * You can use queues to manage the resources that are available to your AWS
     * account for running multiple transcoding jobs at the same time. If you
     * don't specify a queue, the service sends all jobs through the default
     * queue. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/
     * latest/ug/working-with-queues.html.
     */
    private Queue queue;

    /**
     * You can use queues to manage the resources that are available to your AWS
     * account for running multiple transcoding jobs at the same time. If you
     * don't specify a queue, the service sends all jobs through the default
     * queue. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/
     * latest/ug/working-with-queues.html.
     *
     * @return You can use queues to manage the resources that are available to
     *         your AWS account for running multiple transcoding jobs at the
     *         same time. If you don't specify a queue, the service sends all
     *         jobs through the default queue. For more information, see
     *         https://
     *         docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues
     *         .html.
     */
    public Queue getQueue() {
        return queue;
    }

    /**
     * You can use queues to manage the resources that are available to your AWS
     * account for running multiple transcoding jobs at the same time. If you
     * don't specify a queue, the service sends all jobs through the default
     * queue. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/
     * latest/ug/working-with-queues.html.
     *
     * @param queue You can use queues to manage the resources that are
     *            available to your AWS account for running multiple transcoding
     *            jobs at the same time. If you don't specify a queue, the
     *            service sends all jobs through the default queue. For more
     *            information, see
     *            https://docs.aws.amazon.com/mediaconvert/latest
     *            /ug/working-with-queues.html.
     */
    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    /**
     * You can use queues to manage the resources that are available to your AWS
     * account for running multiple transcoding jobs at the same time. If you
     * don't specify a queue, the service sends all jobs through the default
     * queue. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/
     * latest/ug/working-with-queues.html.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queue You can use queues to manage the resources that are
     *            available to your AWS account for running multiple transcoding
     *            jobs at the same time. If you don't specify a queue, the
     *            service sends all jobs through the default queue. For more
     *            information, see
     *            https://docs.aws.amazon.com/mediaconvert/latest
     *            /ug/working-with-queues.html.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateQueueResult withQueue(Queue queue) {
        this.queue = queue;
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
        if (getQueue() != null)
            sb.append("Queue: " + getQueue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateQueueResult == false)
            return false;
        UpdateQueueResult other = (UpdateQueueResult) obj;

        if (other.getQueue() == null ^ this.getQueue() == null)
            return false;
        if (other.getQueue() != null && other.getQueue().equals(this.getQueue()) == false)
            return false;
        return true;
    }
}
