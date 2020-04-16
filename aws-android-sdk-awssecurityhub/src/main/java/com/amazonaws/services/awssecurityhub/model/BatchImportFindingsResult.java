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

public class BatchImportFindingsResult implements Serializable {
    /**
     * <p>
     * The number of findings that failed to import.
     * </p>
     */
    private Integer failedCount;

    /**
     * <p>
     * The number of findings that were successfully imported.
     * </p>
     */
    private Integer successCount;

    /**
     * <p>
     * The list of findings that failed to import.
     * </p>
     */
    private java.util.List<ImportFindingsError> failedFindings;

    /**
     * <p>
     * The number of findings that failed to import.
     * </p>
     *
     * @return <p>
     *         The number of findings that failed to import.
     *         </p>
     */
    public Integer getFailedCount() {
        return failedCount;
    }

    /**
     * <p>
     * The number of findings that failed to import.
     * </p>
     *
     * @param failedCount <p>
     *            The number of findings that failed to import.
     *            </p>
     */
    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    /**
     * <p>
     * The number of findings that failed to import.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedCount <p>
     *            The number of findings that failed to import.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchImportFindingsResult withFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    /**
     * <p>
     * The number of findings that were successfully imported.
     * </p>
     *
     * @return <p>
     *         The number of findings that were successfully imported.
     *         </p>
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    /**
     * <p>
     * The number of findings that were successfully imported.
     * </p>
     *
     * @param successCount <p>
     *            The number of findings that were successfully imported.
     *            </p>
     */
    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    /**
     * <p>
     * The number of findings that were successfully imported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successCount <p>
     *            The number of findings that were successfully imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchImportFindingsResult withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * <p>
     * The list of findings that failed to import.
     * </p>
     *
     * @return <p>
     *         The list of findings that failed to import.
     *         </p>
     */
    public java.util.List<ImportFindingsError> getFailedFindings() {
        return failedFindings;
    }

    /**
     * <p>
     * The list of findings that failed to import.
     * </p>
     *
     * @param failedFindings <p>
     *            The list of findings that failed to import.
     *            </p>
     */
    public void setFailedFindings(java.util.Collection<ImportFindingsError> failedFindings) {
        if (failedFindings == null) {
            this.failedFindings = null;
            return;
        }

        this.failedFindings = new java.util.ArrayList<ImportFindingsError>(failedFindings);
    }

    /**
     * <p>
     * The list of findings that failed to import.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedFindings <p>
     *            The list of findings that failed to import.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchImportFindingsResult withFailedFindings(ImportFindingsError... failedFindings) {
        if (getFailedFindings() == null) {
            this.failedFindings = new java.util.ArrayList<ImportFindingsError>(
                    failedFindings.length);
        }
        for (ImportFindingsError value : failedFindings) {
            this.failedFindings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of findings that failed to import.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedFindings <p>
     *            The list of findings that failed to import.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchImportFindingsResult withFailedFindings(
            java.util.Collection<ImportFindingsError> failedFindings) {
        setFailedFindings(failedFindings);
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
        if (getFailedCount() != null)
            sb.append("FailedCount: " + getFailedCount() + ",");
        if (getSuccessCount() != null)
            sb.append("SuccessCount: " + getSuccessCount() + ",");
        if (getFailedFindings() != null)
            sb.append("FailedFindings: " + getFailedFindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFailedCount() == null) ? 0 : getFailedCount().hashCode());
        hashCode = prime * hashCode
                + ((getSuccessCount() == null) ? 0 : getSuccessCount().hashCode());
        hashCode = prime * hashCode
                + ((getFailedFindings() == null) ? 0 : getFailedFindings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchImportFindingsResult == false)
            return false;
        BatchImportFindingsResult other = (BatchImportFindingsResult) obj;

        if (other.getFailedCount() == null ^ this.getFailedCount() == null)
            return false;
        if (other.getFailedCount() != null
                && other.getFailedCount().equals(this.getFailedCount()) == false)
            return false;
        if (other.getSuccessCount() == null ^ this.getSuccessCount() == null)
            return false;
        if (other.getSuccessCount() != null
                && other.getSuccessCount().equals(this.getSuccessCount()) == false)
            return false;
        if (other.getFailedFindings() == null ^ this.getFailedFindings() == null)
            return false;
        if (other.getFailedFindings() != null
                && other.getFailedFindings().equals(this.getFailedFindings()) == false)
            return false;
        return true;
    }
}
