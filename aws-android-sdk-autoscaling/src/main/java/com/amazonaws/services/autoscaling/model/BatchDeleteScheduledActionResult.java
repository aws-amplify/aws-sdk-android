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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

public class BatchDeleteScheduledActionResult implements Serializable {
    /**
     * <p>
     * The names of the scheduled actions that could not be deleted, including
     * an error message.
     * </p>
     */
    private java.util.List<FailedScheduledUpdateGroupActionRequest> failedScheduledActions = new java.util.ArrayList<FailedScheduledUpdateGroupActionRequest>();

    /**
     * <p>
     * The names of the scheduled actions that could not be deleted, including
     * an error message.
     * </p>
     *
     * @return <p>
     *         The names of the scheduled actions that could not be deleted,
     *         including an error message.
     *         </p>
     */
    public java.util.List<FailedScheduledUpdateGroupActionRequest> getFailedScheduledActions() {
        return failedScheduledActions;
    }

    /**
     * <p>
     * The names of the scheduled actions that could not be deleted, including
     * an error message.
     * </p>
     *
     * @param failedScheduledActions <p>
     *            The names of the scheduled actions that could not be deleted,
     *            including an error message.
     *            </p>
     */
    public void setFailedScheduledActions(
            java.util.Collection<FailedScheduledUpdateGroupActionRequest> failedScheduledActions) {
        if (failedScheduledActions == null) {
            this.failedScheduledActions = null;
            return;
        }

        this.failedScheduledActions = new java.util.ArrayList<FailedScheduledUpdateGroupActionRequest>(
                failedScheduledActions);
    }

    /**
     * <p>
     * The names of the scheduled actions that could not be deleted, including
     * an error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedScheduledActions <p>
     *            The names of the scheduled actions that could not be deleted,
     *            including an error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteScheduledActionResult withFailedScheduledActions(
            FailedScheduledUpdateGroupActionRequest... failedScheduledActions) {
        if (getFailedScheduledActions() == null) {
            this.failedScheduledActions = new java.util.ArrayList<FailedScheduledUpdateGroupActionRequest>(
                    failedScheduledActions.length);
        }
        for (FailedScheduledUpdateGroupActionRequest value : failedScheduledActions) {
            this.failedScheduledActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the scheduled actions that could not be deleted, including
     * an error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedScheduledActions <p>
     *            The names of the scheduled actions that could not be deleted,
     *            including an error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteScheduledActionResult withFailedScheduledActions(
            java.util.Collection<FailedScheduledUpdateGroupActionRequest> failedScheduledActions) {
        setFailedScheduledActions(failedScheduledActions);
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
        if (getFailedScheduledActions() != null)
            sb.append("FailedScheduledActions: " + getFailedScheduledActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getFailedScheduledActions() == null) ? 0 : getFailedScheduledActions()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteScheduledActionResult == false)
            return false;
        BatchDeleteScheduledActionResult other = (BatchDeleteScheduledActionResult) obj;

        if (other.getFailedScheduledActions() == null ^ this.getFailedScheduledActions() == null)
            return false;
        if (other.getFailedScheduledActions() != null
                && other.getFailedScheduledActions().equals(this.getFailedScheduledActions()) == false)
            return false;
        return true;
    }
}
