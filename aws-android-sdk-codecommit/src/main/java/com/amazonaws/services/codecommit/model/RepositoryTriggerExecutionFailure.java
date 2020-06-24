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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * A trigger failed to run.
 * </p>
 */
public class RepositoryTriggerExecutionFailure implements Serializable {
    /**
     * <p>
     * The name of the trigger that did not run.
     * </p>
     */
    private String trigger;

    /**
     * <p>
     * Message information about the trigger that did not run.
     * </p>
     */
    private String failureMessage;

    /**
     * <p>
     * The name of the trigger that did not run.
     * </p>
     *
     * @return <p>
     *         The name of the trigger that did not run.
     *         </p>
     */
    public String getTrigger() {
        return trigger;
    }

    /**
     * <p>
     * The name of the trigger that did not run.
     * </p>
     *
     * @param trigger <p>
     *            The name of the trigger that did not run.
     *            </p>
     */
    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    /**
     * <p>
     * The name of the trigger that did not run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trigger <p>
     *            The name of the trigger that did not run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryTriggerExecutionFailure withTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * <p>
     * Message information about the trigger that did not run.
     * </p>
     *
     * @return <p>
     *         Message information about the trigger that did not run.
     *         </p>
     */
    public String getFailureMessage() {
        return failureMessage;
    }

    /**
     * <p>
     * Message information about the trigger that did not run.
     * </p>
     *
     * @param failureMessage <p>
     *            Message information about the trigger that did not run.
     *            </p>
     */
    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * Message information about the trigger that did not run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureMessage <p>
     *            Message information about the trigger that did not run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryTriggerExecutionFailure withFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
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
        if (getTrigger() != null)
            sb.append("trigger: " + getTrigger() + ",");
        if (getFailureMessage() != null)
            sb.append("failureMessage: " + getFailureMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrigger() == null) ? 0 : getTrigger().hashCode());
        hashCode = prime * hashCode
                + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryTriggerExecutionFailure == false)
            return false;
        RepositoryTriggerExecutionFailure other = (RepositoryTriggerExecutionFailure) obj;

        if (other.getTrigger() == null ^ this.getTrigger() == null)
            return false;
        if (other.getTrigger() != null && other.getTrigger().equals(this.getTrigger()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null
                && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        return true;
    }
}
