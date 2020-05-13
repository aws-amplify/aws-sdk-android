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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

public class BatchApplyUpdateActionResult implements Serializable {
    /**
     * <p>
     * Update actions that have been processed successfully
     * </p>
     */
    private java.util.List<ProcessedUpdateAction> processedUpdateActions;

    /**
     * <p>
     * Update actions that haven't been processed successfully
     * </p>
     */
    private java.util.List<UnprocessedUpdateAction> unprocessedUpdateActions;

    /**
     * <p>
     * Update actions that have been processed successfully
     * </p>
     *
     * @return <p>
     *         Update actions that have been processed successfully
     *         </p>
     */
    public java.util.List<ProcessedUpdateAction> getProcessedUpdateActions() {
        return processedUpdateActions;
    }

    /**
     * <p>
     * Update actions that have been processed successfully
     * </p>
     *
     * @param processedUpdateActions <p>
     *            Update actions that have been processed successfully
     *            </p>
     */
    public void setProcessedUpdateActions(
            java.util.Collection<ProcessedUpdateAction> processedUpdateActions) {
        if (processedUpdateActions == null) {
            this.processedUpdateActions = null;
            return;
        }

        this.processedUpdateActions = new java.util.ArrayList<ProcessedUpdateAction>(
                processedUpdateActions);
    }

    /**
     * <p>
     * Update actions that have been processed successfully
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processedUpdateActions <p>
     *            Update actions that have been processed successfully
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchApplyUpdateActionResult withProcessedUpdateActions(
            ProcessedUpdateAction... processedUpdateActions) {
        if (getProcessedUpdateActions() == null) {
            this.processedUpdateActions = new java.util.ArrayList<ProcessedUpdateAction>(
                    processedUpdateActions.length);
        }
        for (ProcessedUpdateAction value : processedUpdateActions) {
            this.processedUpdateActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Update actions that have been processed successfully
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processedUpdateActions <p>
     *            Update actions that have been processed successfully
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchApplyUpdateActionResult withProcessedUpdateActions(
            java.util.Collection<ProcessedUpdateAction> processedUpdateActions) {
        setProcessedUpdateActions(processedUpdateActions);
        return this;
    }

    /**
     * <p>
     * Update actions that haven't been processed successfully
     * </p>
     *
     * @return <p>
     *         Update actions that haven't been processed successfully
     *         </p>
     */
    public java.util.List<UnprocessedUpdateAction> getUnprocessedUpdateActions() {
        return unprocessedUpdateActions;
    }

    /**
     * <p>
     * Update actions that haven't been processed successfully
     * </p>
     *
     * @param unprocessedUpdateActions <p>
     *            Update actions that haven't been processed successfully
     *            </p>
     */
    public void setUnprocessedUpdateActions(
            java.util.Collection<UnprocessedUpdateAction> unprocessedUpdateActions) {
        if (unprocessedUpdateActions == null) {
            this.unprocessedUpdateActions = null;
            return;
        }

        this.unprocessedUpdateActions = new java.util.ArrayList<UnprocessedUpdateAction>(
                unprocessedUpdateActions);
    }

    /**
     * <p>
     * Update actions that haven't been processed successfully
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unprocessedUpdateActions <p>
     *            Update actions that haven't been processed successfully
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchApplyUpdateActionResult withUnprocessedUpdateActions(
            UnprocessedUpdateAction... unprocessedUpdateActions) {
        if (getUnprocessedUpdateActions() == null) {
            this.unprocessedUpdateActions = new java.util.ArrayList<UnprocessedUpdateAction>(
                    unprocessedUpdateActions.length);
        }
        for (UnprocessedUpdateAction value : unprocessedUpdateActions) {
            this.unprocessedUpdateActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Update actions that haven't been processed successfully
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unprocessedUpdateActions <p>
     *            Update actions that haven't been processed successfully
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchApplyUpdateActionResult withUnprocessedUpdateActions(
            java.util.Collection<UnprocessedUpdateAction> unprocessedUpdateActions) {
        setUnprocessedUpdateActions(unprocessedUpdateActions);
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
        if (getProcessedUpdateActions() != null)
            sb.append("ProcessedUpdateActions: " + getProcessedUpdateActions() + ",");
        if (getUnprocessedUpdateActions() != null)
            sb.append("UnprocessedUpdateActions: " + getUnprocessedUpdateActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getProcessedUpdateActions() == null) ? 0 : getProcessedUpdateActions()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getUnprocessedUpdateActions() == null) ? 0 : getUnprocessedUpdateActions()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchApplyUpdateActionResult == false)
            return false;
        BatchApplyUpdateActionResult other = (BatchApplyUpdateActionResult) obj;

        if (other.getProcessedUpdateActions() == null ^ this.getProcessedUpdateActions() == null)
            return false;
        if (other.getProcessedUpdateActions() != null
                && other.getProcessedUpdateActions().equals(this.getProcessedUpdateActions()) == false)
            return false;
        if (other.getUnprocessedUpdateActions() == null
                ^ this.getUnprocessedUpdateActions() == null)
            return false;
        if (other.getUnprocessedUpdateActions() != null
                && other.getUnprocessedUpdateActions().equals(this.getUnprocessedUpdateActions()) == false)
            return false;
        return true;
    }
}
