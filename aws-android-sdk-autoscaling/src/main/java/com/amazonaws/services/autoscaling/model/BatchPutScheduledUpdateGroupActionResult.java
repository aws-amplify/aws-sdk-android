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

public class BatchPutScheduledUpdateGroupActionResult implements Serializable {
    /**
     * <p>
     * The names of the scheduled actions that could not be created or updated,
     * including an error message.
     * </p>
     */
    private java.util.List<FailedScheduledUpdateGroupActionRequest> failedScheduledUpdateGroupActions = new java.util.ArrayList<FailedScheduledUpdateGroupActionRequest>();

    /**
     * <p>
     * The names of the scheduled actions that could not be created or updated,
     * including an error message.
     * </p>
     *
     * @return <p>
     *         The names of the scheduled actions that could not be created or
     *         updated, including an error message.
     *         </p>
     */
    public java.util.List<FailedScheduledUpdateGroupActionRequest> getFailedScheduledUpdateGroupActions() {
        return failedScheduledUpdateGroupActions;
    }

    /**
     * <p>
     * The names of the scheduled actions that could not be created or updated,
     * including an error message.
     * </p>
     *
     * @param failedScheduledUpdateGroupActions <p>
     *            The names of the scheduled actions that could not be created
     *            or updated, including an error message.
     *            </p>
     */
    public void setFailedScheduledUpdateGroupActions(
            java.util.Collection<FailedScheduledUpdateGroupActionRequest> failedScheduledUpdateGroupActions) {
        if (failedScheduledUpdateGroupActions == null) {
            this.failedScheduledUpdateGroupActions = null;
            return;
        }

        this.failedScheduledUpdateGroupActions = new java.util.ArrayList<FailedScheduledUpdateGroupActionRequest>(
                failedScheduledUpdateGroupActions);
    }

    /**
     * <p>
     * The names of the scheduled actions that could not be created or updated,
     * including an error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedScheduledUpdateGroupActions <p>
     *            The names of the scheduled actions that could not be created
     *            or updated, including an error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutScheduledUpdateGroupActionResult withFailedScheduledUpdateGroupActions(
            FailedScheduledUpdateGroupActionRequest... failedScheduledUpdateGroupActions) {
        if (getFailedScheduledUpdateGroupActions() == null) {
            this.failedScheduledUpdateGroupActions = new java.util.ArrayList<FailedScheduledUpdateGroupActionRequest>(
                    failedScheduledUpdateGroupActions.length);
        }
        for (FailedScheduledUpdateGroupActionRequest value : failedScheduledUpdateGroupActions) {
            this.failedScheduledUpdateGroupActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the scheduled actions that could not be created or updated,
     * including an error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedScheduledUpdateGroupActions <p>
     *            The names of the scheduled actions that could not be created
     *            or updated, including an error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutScheduledUpdateGroupActionResult withFailedScheduledUpdateGroupActions(
            java.util.Collection<FailedScheduledUpdateGroupActionRequest> failedScheduledUpdateGroupActions) {
        setFailedScheduledUpdateGroupActions(failedScheduledUpdateGroupActions);
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
        if (getFailedScheduledUpdateGroupActions() != null)
            sb.append("FailedScheduledUpdateGroupActions: "
                    + getFailedScheduledUpdateGroupActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getFailedScheduledUpdateGroupActions() == null) ? 0
                        : getFailedScheduledUpdateGroupActions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutScheduledUpdateGroupActionResult == false)
            return false;
        BatchPutScheduledUpdateGroupActionResult other = (BatchPutScheduledUpdateGroupActionResult) obj;

        if (other.getFailedScheduledUpdateGroupActions() == null
                ^ this.getFailedScheduledUpdateGroupActions() == null)
            return false;
        if (other.getFailedScheduledUpdateGroupActions() != null
                && other.getFailedScheduledUpdateGroupActions().equals(
                        this.getFailedScheduledUpdateGroupActions()) == false)
            return false;
        return true;
    }
}
