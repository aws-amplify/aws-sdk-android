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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

public class BatchUpdateFindingsResult implements Serializable {
    /**
     * <p>
     * The list of findings that were updated successfully.
     * </p>
     */
    private java.util.List<AwsSecurityFindingIdentifier> processedFindings;

    /**
     * <p>
     * The list of findings that were not updated.
     * </p>
     */
    private java.util.List<BatchUpdateFindingsUnprocessedFinding> unprocessedFindings;

    /**
     * <p>
     * The list of findings that were updated successfully.
     * </p>
     *
     * @return <p>
     *         The list of findings that were updated successfully.
     *         </p>
     */
    public java.util.List<AwsSecurityFindingIdentifier> getProcessedFindings() {
        return processedFindings;
    }

    /**
     * <p>
     * The list of findings that were updated successfully.
     * </p>
     *
     * @param processedFindings <p>
     *            The list of findings that were updated successfully.
     *            </p>
     */
    public void setProcessedFindings(
            java.util.Collection<AwsSecurityFindingIdentifier> processedFindings) {
        if (processedFindings == null) {
            this.processedFindings = null;
            return;
        }

        this.processedFindings = new java.util.ArrayList<AwsSecurityFindingIdentifier>(
                processedFindings);
    }

    /**
     * <p>
     * The list of findings that were updated successfully.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processedFindings <p>
     *            The list of findings that were updated successfully.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateFindingsResult withProcessedFindings(
            AwsSecurityFindingIdentifier... processedFindings) {
        if (getProcessedFindings() == null) {
            this.processedFindings = new java.util.ArrayList<AwsSecurityFindingIdentifier>(
                    processedFindings.length);
        }
        for (AwsSecurityFindingIdentifier value : processedFindings) {
            this.processedFindings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of findings that were updated successfully.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processedFindings <p>
     *            The list of findings that were updated successfully.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateFindingsResult withProcessedFindings(
            java.util.Collection<AwsSecurityFindingIdentifier> processedFindings) {
        setProcessedFindings(processedFindings);
        return this;
    }

    /**
     * <p>
     * The list of findings that were not updated.
     * </p>
     *
     * @return <p>
     *         The list of findings that were not updated.
     *         </p>
     */
    public java.util.List<BatchUpdateFindingsUnprocessedFinding> getUnprocessedFindings() {
        return unprocessedFindings;
    }

    /**
     * <p>
     * The list of findings that were not updated.
     * </p>
     *
     * @param unprocessedFindings <p>
     *            The list of findings that were not updated.
     *            </p>
     */
    public void setUnprocessedFindings(
            java.util.Collection<BatchUpdateFindingsUnprocessedFinding> unprocessedFindings) {
        if (unprocessedFindings == null) {
            this.unprocessedFindings = null;
            return;
        }

        this.unprocessedFindings = new java.util.ArrayList<BatchUpdateFindingsUnprocessedFinding>(
                unprocessedFindings);
    }

    /**
     * <p>
     * The list of findings that were not updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unprocessedFindings <p>
     *            The list of findings that were not updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateFindingsResult withUnprocessedFindings(
            BatchUpdateFindingsUnprocessedFinding... unprocessedFindings) {
        if (getUnprocessedFindings() == null) {
            this.unprocessedFindings = new java.util.ArrayList<BatchUpdateFindingsUnprocessedFinding>(
                    unprocessedFindings.length);
        }
        for (BatchUpdateFindingsUnprocessedFinding value : unprocessedFindings) {
            this.unprocessedFindings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of findings that were not updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unprocessedFindings <p>
     *            The list of findings that were not updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateFindingsResult withUnprocessedFindings(
            java.util.Collection<BatchUpdateFindingsUnprocessedFinding> unprocessedFindings) {
        setUnprocessedFindings(unprocessedFindings);
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
        if (getProcessedFindings() != null)
            sb.append("ProcessedFindings: " + getProcessedFindings() + ",");
        if (getUnprocessedFindings() != null)
            sb.append("UnprocessedFindings: " + getUnprocessedFindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProcessedFindings() == null) ? 0 : getProcessedFindings().hashCode());
        hashCode = prime * hashCode
                + ((getUnprocessedFindings() == null) ? 0 : getUnprocessedFindings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateFindingsResult == false)
            return false;
        BatchUpdateFindingsResult other = (BatchUpdateFindingsResult) obj;

        if (other.getProcessedFindings() == null ^ this.getProcessedFindings() == null)
            return false;
        if (other.getProcessedFindings() != null
                && other.getProcessedFindings().equals(this.getProcessedFindings()) == false)
            return false;
        if (other.getUnprocessedFindings() == null ^ this.getUnprocessedFindings() == null)
            return false;
        if (other.getUnprocessedFindings() != null
                && other.getUnprocessedFindings().equals(this.getUnprocessedFindings()) == false)
            return false;
        return true;
    }
}
