/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The job process details.
 * </p>
 */
public class JobProcessDetails implements Serializable {
    /**
     * <p>
     * The target devices to which the job execution is being rolled out. This
     * value will be null after the job execution has finished rolling out to
     * all the target devices.
     * </p>
     */
    private java.util.List<String> processingTargets;

    /**
     * <p>
     * The number of things that cancelled the job.
     * </p>
     */
    private Integer numberOfCanceledThings;

    /**
     * <p>
     * The number of things which successfully completed the job.
     * </p>
     */
    private Integer numberOfSucceededThings;

    /**
     * <p>
     * The number of things that failed executing the job.
     * </p>
     */
    private Integer numberOfFailedThings;

    /**
     * <p>
     * The number of things that rejected the job.
     * </p>
     */
    private Integer numberOfRejectedThings;

    /**
     * <p>
     * The number of things that are awaiting execution of the job.
     * </p>
     */
    private Integer numberOfQueuedThings;

    /**
     * <p>
     * The number of things currently executing the job.
     * </p>
     */
    private Integer numberOfInProgressThings;

    /**
     * <p>
     * The number of things that are no longer scheduled to execute the job
     * because they have been deleted or have been removed from the group that
     * was a target of the job.
     * </p>
     */
    private Integer numberOfRemovedThings;

    /**
     * <p>
     * The number of things whose job execution status is <code>TIMED_OUT</code>
     * .
     * </p>
     */
    private Integer numberOfTimedOutThings;

    /**
     * <p>
     * The target devices to which the job execution is being rolled out. This
     * value will be null after the job execution has finished rolling out to
     * all the target devices.
     * </p>
     *
     * @return <p>
     *         The target devices to which the job execution is being rolled
     *         out. This value will be null after the job execution has finished
     *         rolling out to all the target devices.
     *         </p>
     */
    public java.util.List<String> getProcessingTargets() {
        return processingTargets;
    }

    /**
     * <p>
     * The target devices to which the job execution is being rolled out. This
     * value will be null after the job execution has finished rolling out to
     * all the target devices.
     * </p>
     *
     * @param processingTargets <p>
     *            The target devices to which the job execution is being rolled
     *            out. This value will be null after the job execution has
     *            finished rolling out to all the target devices.
     *            </p>
     */
    public void setProcessingTargets(java.util.Collection<String> processingTargets) {
        if (processingTargets == null) {
            this.processingTargets = null;
            return;
        }

        this.processingTargets = new java.util.ArrayList<String>(processingTargets);
    }

    /**
     * <p>
     * The target devices to which the job execution is being rolled out. This
     * value will be null after the job execution has finished rolling out to
     * all the target devices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processingTargets <p>
     *            The target devices to which the job execution is being rolled
     *            out. This value will be null after the job execution has
     *            finished rolling out to all the target devices.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobProcessDetails withProcessingTargets(String... processingTargets) {
        if (getProcessingTargets() == null) {
            this.processingTargets = new java.util.ArrayList<String>(processingTargets.length);
        }
        for (String value : processingTargets) {
            this.processingTargets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The target devices to which the job execution is being rolled out. This
     * value will be null after the job execution has finished rolling out to
     * all the target devices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processingTargets <p>
     *            The target devices to which the job execution is being rolled
     *            out. This value will be null after the job execution has
     *            finished rolling out to all the target devices.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobProcessDetails withProcessingTargets(java.util.Collection<String> processingTargets) {
        setProcessingTargets(processingTargets);
        return this;
    }

    /**
     * <p>
     * The number of things that cancelled the job.
     * </p>
     *
     * @return <p>
     *         The number of things that cancelled the job.
     *         </p>
     */
    public Integer getNumberOfCanceledThings() {
        return numberOfCanceledThings;
    }

    /**
     * <p>
     * The number of things that cancelled the job.
     * </p>
     *
     * @param numberOfCanceledThings <p>
     *            The number of things that cancelled the job.
     *            </p>
     */
    public void setNumberOfCanceledThings(Integer numberOfCanceledThings) {
        this.numberOfCanceledThings = numberOfCanceledThings;
    }

    /**
     * <p>
     * The number of things that cancelled the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfCanceledThings <p>
     *            The number of things that cancelled the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobProcessDetails withNumberOfCanceledThings(Integer numberOfCanceledThings) {
        this.numberOfCanceledThings = numberOfCanceledThings;
        return this;
    }

    /**
     * <p>
     * The number of things which successfully completed the job.
     * </p>
     *
     * @return <p>
     *         The number of things which successfully completed the job.
     *         </p>
     */
    public Integer getNumberOfSucceededThings() {
        return numberOfSucceededThings;
    }

    /**
     * <p>
     * The number of things which successfully completed the job.
     * </p>
     *
     * @param numberOfSucceededThings <p>
     *            The number of things which successfully completed the job.
     *            </p>
     */
    public void setNumberOfSucceededThings(Integer numberOfSucceededThings) {
        this.numberOfSucceededThings = numberOfSucceededThings;
    }

    /**
     * <p>
     * The number of things which successfully completed the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfSucceededThings <p>
     *            The number of things which successfully completed the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobProcessDetails withNumberOfSucceededThings(Integer numberOfSucceededThings) {
        this.numberOfSucceededThings = numberOfSucceededThings;
        return this;
    }

    /**
     * <p>
     * The number of things that failed executing the job.
     * </p>
     *
     * @return <p>
     *         The number of things that failed executing the job.
     *         </p>
     */
    public Integer getNumberOfFailedThings() {
        return numberOfFailedThings;
    }

    /**
     * <p>
     * The number of things that failed executing the job.
     * </p>
     *
     * @param numberOfFailedThings <p>
     *            The number of things that failed executing the job.
     *            </p>
     */
    public void setNumberOfFailedThings(Integer numberOfFailedThings) {
        this.numberOfFailedThings = numberOfFailedThings;
    }

    /**
     * <p>
     * The number of things that failed executing the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfFailedThings <p>
     *            The number of things that failed executing the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobProcessDetails withNumberOfFailedThings(Integer numberOfFailedThings) {
        this.numberOfFailedThings = numberOfFailedThings;
        return this;
    }

    /**
     * <p>
     * The number of things that rejected the job.
     * </p>
     *
     * @return <p>
     *         The number of things that rejected the job.
     *         </p>
     */
    public Integer getNumberOfRejectedThings() {
        return numberOfRejectedThings;
    }

    /**
     * <p>
     * The number of things that rejected the job.
     * </p>
     *
     * @param numberOfRejectedThings <p>
     *            The number of things that rejected the job.
     *            </p>
     */
    public void setNumberOfRejectedThings(Integer numberOfRejectedThings) {
        this.numberOfRejectedThings = numberOfRejectedThings;
    }

    /**
     * <p>
     * The number of things that rejected the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfRejectedThings <p>
     *            The number of things that rejected the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobProcessDetails withNumberOfRejectedThings(Integer numberOfRejectedThings) {
        this.numberOfRejectedThings = numberOfRejectedThings;
        return this;
    }

    /**
     * <p>
     * The number of things that are awaiting execution of the job.
     * </p>
     *
     * @return <p>
     *         The number of things that are awaiting execution of the job.
     *         </p>
     */
    public Integer getNumberOfQueuedThings() {
        return numberOfQueuedThings;
    }

    /**
     * <p>
     * The number of things that are awaiting execution of the job.
     * </p>
     *
     * @param numberOfQueuedThings <p>
     *            The number of things that are awaiting execution of the job.
     *            </p>
     */
    public void setNumberOfQueuedThings(Integer numberOfQueuedThings) {
        this.numberOfQueuedThings = numberOfQueuedThings;
    }

    /**
     * <p>
     * The number of things that are awaiting execution of the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfQueuedThings <p>
     *            The number of things that are awaiting execution of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobProcessDetails withNumberOfQueuedThings(Integer numberOfQueuedThings) {
        this.numberOfQueuedThings = numberOfQueuedThings;
        return this;
    }

    /**
     * <p>
     * The number of things currently executing the job.
     * </p>
     *
     * @return <p>
     *         The number of things currently executing the job.
     *         </p>
     */
    public Integer getNumberOfInProgressThings() {
        return numberOfInProgressThings;
    }

    /**
     * <p>
     * The number of things currently executing the job.
     * </p>
     *
     * @param numberOfInProgressThings <p>
     *            The number of things currently executing the job.
     *            </p>
     */
    public void setNumberOfInProgressThings(Integer numberOfInProgressThings) {
        this.numberOfInProgressThings = numberOfInProgressThings;
    }

    /**
     * <p>
     * The number of things currently executing the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfInProgressThings <p>
     *            The number of things currently executing the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobProcessDetails withNumberOfInProgressThings(Integer numberOfInProgressThings) {
        this.numberOfInProgressThings = numberOfInProgressThings;
        return this;
    }

    /**
     * <p>
     * The number of things that are no longer scheduled to execute the job
     * because they have been deleted or have been removed from the group that
     * was a target of the job.
     * </p>
     *
     * @return <p>
     *         The number of things that are no longer scheduled to execute the
     *         job because they have been deleted or have been removed from the
     *         group that was a target of the job.
     *         </p>
     */
    public Integer getNumberOfRemovedThings() {
        return numberOfRemovedThings;
    }

    /**
     * <p>
     * The number of things that are no longer scheduled to execute the job
     * because they have been deleted or have been removed from the group that
     * was a target of the job.
     * </p>
     *
     * @param numberOfRemovedThings <p>
     *            The number of things that are no longer scheduled to execute
     *            the job because they have been deleted or have been removed
     *            from the group that was a target of the job.
     *            </p>
     */
    public void setNumberOfRemovedThings(Integer numberOfRemovedThings) {
        this.numberOfRemovedThings = numberOfRemovedThings;
    }

    /**
     * <p>
     * The number of things that are no longer scheduled to execute the job
     * because they have been deleted or have been removed from the group that
     * was a target of the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfRemovedThings <p>
     *            The number of things that are no longer scheduled to execute
     *            the job because they have been deleted or have been removed
     *            from the group that was a target of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobProcessDetails withNumberOfRemovedThings(Integer numberOfRemovedThings) {
        this.numberOfRemovedThings = numberOfRemovedThings;
        return this;
    }

    /**
     * <p>
     * The number of things whose job execution status is <code>TIMED_OUT</code>
     * .
     * </p>
     *
     * @return <p>
     *         The number of things whose job execution status is
     *         <code>TIMED_OUT</code>.
     *         </p>
     */
    public Integer getNumberOfTimedOutThings() {
        return numberOfTimedOutThings;
    }

    /**
     * <p>
     * The number of things whose job execution status is <code>TIMED_OUT</code>
     * .
     * </p>
     *
     * @param numberOfTimedOutThings <p>
     *            The number of things whose job execution status is
     *            <code>TIMED_OUT</code>.
     *            </p>
     */
    public void setNumberOfTimedOutThings(Integer numberOfTimedOutThings) {
        this.numberOfTimedOutThings = numberOfTimedOutThings;
    }

    /**
     * <p>
     * The number of things whose job execution status is <code>TIMED_OUT</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfTimedOutThings <p>
     *            The number of things whose job execution status is
     *            <code>TIMED_OUT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobProcessDetails withNumberOfTimedOutThings(Integer numberOfTimedOutThings) {
        this.numberOfTimedOutThings = numberOfTimedOutThings;
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
        if (getProcessingTargets() != null)
            sb.append("processingTargets: " + getProcessingTargets() + ",");
        if (getNumberOfCanceledThings() != null)
            sb.append("numberOfCanceledThings: " + getNumberOfCanceledThings() + ",");
        if (getNumberOfSucceededThings() != null)
            sb.append("numberOfSucceededThings: " + getNumberOfSucceededThings() + ",");
        if (getNumberOfFailedThings() != null)
            sb.append("numberOfFailedThings: " + getNumberOfFailedThings() + ",");
        if (getNumberOfRejectedThings() != null)
            sb.append("numberOfRejectedThings: " + getNumberOfRejectedThings() + ",");
        if (getNumberOfQueuedThings() != null)
            sb.append("numberOfQueuedThings: " + getNumberOfQueuedThings() + ",");
        if (getNumberOfInProgressThings() != null)
            sb.append("numberOfInProgressThings: " + getNumberOfInProgressThings() + ",");
        if (getNumberOfRemovedThings() != null)
            sb.append("numberOfRemovedThings: " + getNumberOfRemovedThings() + ",");
        if (getNumberOfTimedOutThings() != null)
            sb.append("numberOfTimedOutThings: " + getNumberOfTimedOutThings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProcessingTargets() == null) ? 0 : getProcessingTargets().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfCanceledThings() == null) ? 0 : getNumberOfCanceledThings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfSucceededThings() == null) ? 0 : getNumberOfSucceededThings()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfFailedThings() == null) ? 0 : getNumberOfFailedThings().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfRejectedThings() == null) ? 0 : getNumberOfRejectedThings()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfQueuedThings() == null) ? 0 : getNumberOfQueuedThings().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfInProgressThings() == null) ? 0 : getNumberOfInProgressThings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfRemovedThings() == null) ? 0 : getNumberOfRemovedThings().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfTimedOutThings() == null) ? 0 : getNumberOfTimedOutThings()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobProcessDetails == false)
            return false;
        JobProcessDetails other = (JobProcessDetails) obj;

        if (other.getProcessingTargets() == null ^ this.getProcessingTargets() == null)
            return false;
        if (other.getProcessingTargets() != null
                && other.getProcessingTargets().equals(this.getProcessingTargets()) == false)
            return false;
        if (other.getNumberOfCanceledThings() == null ^ this.getNumberOfCanceledThings() == null)
            return false;
        if (other.getNumberOfCanceledThings() != null
                && other.getNumberOfCanceledThings().equals(this.getNumberOfCanceledThings()) == false)
            return false;
        if (other.getNumberOfSucceededThings() == null ^ this.getNumberOfSucceededThings() == null)
            return false;
        if (other.getNumberOfSucceededThings() != null
                && other.getNumberOfSucceededThings().equals(this.getNumberOfSucceededThings()) == false)
            return false;
        if (other.getNumberOfFailedThings() == null ^ this.getNumberOfFailedThings() == null)
            return false;
        if (other.getNumberOfFailedThings() != null
                && other.getNumberOfFailedThings().equals(this.getNumberOfFailedThings()) == false)
            return false;
        if (other.getNumberOfRejectedThings() == null ^ this.getNumberOfRejectedThings() == null)
            return false;
        if (other.getNumberOfRejectedThings() != null
                && other.getNumberOfRejectedThings().equals(this.getNumberOfRejectedThings()) == false)
            return false;
        if (other.getNumberOfQueuedThings() == null ^ this.getNumberOfQueuedThings() == null)
            return false;
        if (other.getNumberOfQueuedThings() != null
                && other.getNumberOfQueuedThings().equals(this.getNumberOfQueuedThings()) == false)
            return false;
        if (other.getNumberOfInProgressThings() == null
                ^ this.getNumberOfInProgressThings() == null)
            return false;
        if (other.getNumberOfInProgressThings() != null
                && other.getNumberOfInProgressThings().equals(this.getNumberOfInProgressThings()) == false)
            return false;
        if (other.getNumberOfRemovedThings() == null ^ this.getNumberOfRemovedThings() == null)
            return false;
        if (other.getNumberOfRemovedThings() != null
                && other.getNumberOfRemovedThings().equals(this.getNumberOfRemovedThings()) == false)
            return false;
        if (other.getNumberOfTimedOutThings() == null ^ this.getNumberOfTimedOutThings() == null)
            return false;
        if (other.getNumberOfTimedOutThings() != null
                && other.getNumberOfTimedOutThings().equals(this.getNumberOfTimedOutThings()) == false)
            return false;
        return true;
    }
}
