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

/**
 * Optional. Configuration for a destination queue to which the job can hop once
 * a customer-defined minimum wait time has passed.
 */
public class HopDestination implements Serializable {
    /**
     * Optional. When you set up a job to use queue hopping, you can specify a
     * different relative priority for the job in the destination queue. If you
     * don't specify, the relative priority will remain the same as in the
     * previous queue.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-50 - 50<br/>
     */
    private Integer priority;

    /**
     * Optional unless the job is submitted on the default queue. When you set
     * up a job to use queue hopping, you can specify a destination queue. This
     * queue cannot be the original queue to which the job is submitted. If the
     * original queue isn't the default queue and you don't specify the
     * destination queue, the job will move to the default queue.
     */
    private String queue;

    /**
     * Required for setting up a job to use queue hopping. Minimum wait time in
     * minutes until the job can hop to the destination queue. Valid range is 1
     * to 1440 minutes, inclusive.
     */
    private Integer waitMinutes;

    /**
     * Optional. When you set up a job to use queue hopping, you can specify a
     * different relative priority for the job in the destination queue. If you
     * don't specify, the relative priority will remain the same as in the
     * previous queue.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-50 - 50<br/>
     *
     * @return Optional. When you set up a job to use queue hopping, you can
     *         specify a different relative priority for the job in the
     *         destination queue. If you don't specify, the relative priority
     *         will remain the same as in the previous queue.
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Optional. When you set up a job to use queue hopping, you can specify a
     * different relative priority for the job in the destination queue. If you
     * don't specify, the relative priority will remain the same as in the
     * previous queue.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-50 - 50<br/>
     *
     * @param priority Optional. When you set up a job to use queue hopping, you
     *            can specify a different relative priority for the job in the
     *            destination queue. If you don't specify, the relative priority
     *            will remain the same as in the previous queue.
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Optional. When you set up a job to use queue hopping, you can specify a
     * different relative priority for the job in the destination queue. If you
     * don't specify, the relative priority will remain the same as in the
     * previous queue.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-50 - 50<br/>
     *
     * @param priority Optional. When you set up a job to use queue hopping, you
     *            can specify a different relative priority for the job in the
     *            destination queue. If you don't specify, the relative priority
     *            will remain the same as in the previous queue.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HopDestination withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Optional unless the job is submitted on the default queue. When you set
     * up a job to use queue hopping, you can specify a destination queue. This
     * queue cannot be the original queue to which the job is submitted. If the
     * original queue isn't the default queue and you don't specify the
     * destination queue, the job will move to the default queue.
     *
     * @return Optional unless the job is submitted on the default queue. When
     *         you set up a job to use queue hopping, you can specify a
     *         destination queue. This queue cannot be the original queue to
     *         which the job is submitted. If the original queue isn't the
     *         default queue and you don't specify the destination queue, the
     *         job will move to the default queue.
     */
    public String getQueue() {
        return queue;
    }

    /**
     * Optional unless the job is submitted on the default queue. When you set
     * up a job to use queue hopping, you can specify a destination queue. This
     * queue cannot be the original queue to which the job is submitted. If the
     * original queue isn't the default queue and you don't specify the
     * destination queue, the job will move to the default queue.
     *
     * @param queue Optional unless the job is submitted on the default queue.
     *            When you set up a job to use queue hopping, you can specify a
     *            destination queue. This queue cannot be the original queue to
     *            which the job is submitted. If the original queue isn't the
     *            default queue and you don't specify the destination queue, the
     *            job will move to the default queue.
     */
    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * Optional unless the job is submitted on the default queue. When you set
     * up a job to use queue hopping, you can specify a destination queue. This
     * queue cannot be the original queue to which the job is submitted. If the
     * original queue isn't the default queue and you don't specify the
     * destination queue, the job will move to the default queue.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queue Optional unless the job is submitted on the default queue.
     *            When you set up a job to use queue hopping, you can specify a
     *            destination queue. This queue cannot be the original queue to
     *            which the job is submitted. If the original queue isn't the
     *            default queue and you don't specify the destination queue, the
     *            job will move to the default queue.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HopDestination withQueue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
     * Required for setting up a job to use queue hopping. Minimum wait time in
     * minutes until the job can hop to the destination queue. Valid range is 1
     * to 1440 minutes, inclusive.
     *
     * @return Required for setting up a job to use queue hopping. Minimum wait
     *         time in minutes until the job can hop to the destination queue.
     *         Valid range is 1 to 1440 minutes, inclusive.
     */
    public Integer getWaitMinutes() {
        return waitMinutes;
    }

    /**
     * Required for setting up a job to use queue hopping. Minimum wait time in
     * minutes until the job can hop to the destination queue. Valid range is 1
     * to 1440 minutes, inclusive.
     *
     * @param waitMinutes Required for setting up a job to use queue hopping.
     *            Minimum wait time in minutes until the job can hop to the
     *            destination queue. Valid range is 1 to 1440 minutes,
     *            inclusive.
     */
    public void setWaitMinutes(Integer waitMinutes) {
        this.waitMinutes = waitMinutes;
    }

    /**
     * Required for setting up a job to use queue hopping. Minimum wait time in
     * minutes until the job can hop to the destination queue. Valid range is 1
     * to 1440 minutes, inclusive.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param waitMinutes Required for setting up a job to use queue hopping.
     *            Minimum wait time in minutes until the job can hop to the
     *            destination queue. Valid range is 1 to 1440 minutes,
     *            inclusive.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HopDestination withWaitMinutes(Integer waitMinutes) {
        this.waitMinutes = waitMinutes;
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
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getQueue() != null)
            sb.append("Queue: " + getQueue() + ",");
        if (getWaitMinutes() != null)
            sb.append("WaitMinutes: " + getWaitMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        hashCode = prime * hashCode
                + ((getWaitMinutes() == null) ? 0 : getWaitMinutes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HopDestination == false)
            return false;
        HopDestination other = (HopDestination) obj;

        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getQueue() == null ^ this.getQueue() == null)
            return false;
        if (other.getQueue() != null && other.getQueue().equals(this.getQueue()) == false)
            return false;
        if (other.getWaitMinutes() == null ^ this.getWaitMinutes() == null)
            return false;
        if (other.getWaitMinutes() != null
                && other.getWaitMinutes().equals(this.getWaitMinutes()) == false)
            return false;
        return true;
    }
}
