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
 * Information about the audit check.
 * </p>
 */
public class AuditCheckDetails implements Serializable {
    /**
     * <p>
     * The completion status of this check, one of "IN_PROGRESS",
     * "WAITING_FOR_DATA_COLLECTION", "CANCELED", "COMPLETED_COMPLIANT",
     * "COMPLETED_NON_COMPLIANT", or "FAILED".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, WAITING_FOR_DATA_COLLECTION,
     * CANCELED, COMPLETED_COMPLIANT, COMPLETED_NON_COMPLIANT, FAILED
     */
    private String checkRunStatus;

    /**
     * <p>
     * True if the check completed and found all resources compliant.
     * </p>
     */
    private Boolean checkCompliant;

    /**
     * <p>
     * The number of resources on which the check was performed.
     * </p>
     */
    private Long totalResourcesCount;

    /**
     * <p>
     * The number of resources that the check found non-compliant.
     * </p>
     */
    private Long nonCompliantResourcesCount;

    /**
     * <p>
     * The code of any error encountered when performing this check during this
     * audit. One of "INSUFFICIENT_PERMISSIONS", or "AUDIT_CHECK_DISABLED".
     * </p>
     */
    private String errorCode;

    /**
     * <p>
     * The message associated with any error encountered when performing this
     * check during this audit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     */
    private String message;

    /**
     * <p>
     * The completion status of this check, one of "IN_PROGRESS",
     * "WAITING_FOR_DATA_COLLECTION", "CANCELED", "COMPLETED_COMPLIANT",
     * "COMPLETED_NON_COMPLIANT", or "FAILED".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, WAITING_FOR_DATA_COLLECTION,
     * CANCELED, COMPLETED_COMPLIANT, COMPLETED_NON_COMPLIANT, FAILED
     *
     * @return <p>
     *         The completion status of this check, one of "IN_PROGRESS",
     *         "WAITING_FOR_DATA_COLLECTION", "CANCELED", "COMPLETED_COMPLIANT",
     *         "COMPLETED_NON_COMPLIANT", or "FAILED".
     *         </p>
     * @see AuditCheckRunStatus
     */
    public String getCheckRunStatus() {
        return checkRunStatus;
    }

    /**
     * <p>
     * The completion status of this check, one of "IN_PROGRESS",
     * "WAITING_FOR_DATA_COLLECTION", "CANCELED", "COMPLETED_COMPLIANT",
     * "COMPLETED_NON_COMPLIANT", or "FAILED".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, WAITING_FOR_DATA_COLLECTION,
     * CANCELED, COMPLETED_COMPLIANT, COMPLETED_NON_COMPLIANT, FAILED
     *
     * @param checkRunStatus <p>
     *            The completion status of this check, one of "IN_PROGRESS",
     *            "WAITING_FOR_DATA_COLLECTION", "CANCELED",
     *            "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
     *            </p>
     * @see AuditCheckRunStatus
     */
    public void setCheckRunStatus(String checkRunStatus) {
        this.checkRunStatus = checkRunStatus;
    }

    /**
     * <p>
     * The completion status of this check, one of "IN_PROGRESS",
     * "WAITING_FOR_DATA_COLLECTION", "CANCELED", "COMPLETED_COMPLIANT",
     * "COMPLETED_NON_COMPLIANT", or "FAILED".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, WAITING_FOR_DATA_COLLECTION,
     * CANCELED, COMPLETED_COMPLIANT, COMPLETED_NON_COMPLIANT, FAILED
     *
     * @param checkRunStatus <p>
     *            The completion status of this check, one of "IN_PROGRESS",
     *            "WAITING_FOR_DATA_COLLECTION", "CANCELED",
     *            "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditCheckRunStatus
     */
    public AuditCheckDetails withCheckRunStatus(String checkRunStatus) {
        this.checkRunStatus = checkRunStatus;
        return this;
    }

    /**
     * <p>
     * The completion status of this check, one of "IN_PROGRESS",
     * "WAITING_FOR_DATA_COLLECTION", "CANCELED", "COMPLETED_COMPLIANT",
     * "COMPLETED_NON_COMPLIANT", or "FAILED".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, WAITING_FOR_DATA_COLLECTION,
     * CANCELED, COMPLETED_COMPLIANT, COMPLETED_NON_COMPLIANT, FAILED
     *
     * @param checkRunStatus <p>
     *            The completion status of this check, one of "IN_PROGRESS",
     *            "WAITING_FOR_DATA_COLLECTION", "CANCELED",
     *            "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
     *            </p>
     * @see AuditCheckRunStatus
     */
    public void setCheckRunStatus(AuditCheckRunStatus checkRunStatus) {
        this.checkRunStatus = checkRunStatus.toString();
    }

    /**
     * <p>
     * The completion status of this check, one of "IN_PROGRESS",
     * "WAITING_FOR_DATA_COLLECTION", "CANCELED", "COMPLETED_COMPLIANT",
     * "COMPLETED_NON_COMPLIANT", or "FAILED".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, WAITING_FOR_DATA_COLLECTION,
     * CANCELED, COMPLETED_COMPLIANT, COMPLETED_NON_COMPLIANT, FAILED
     *
     * @param checkRunStatus <p>
     *            The completion status of this check, one of "IN_PROGRESS",
     *            "WAITING_FOR_DATA_COLLECTION", "CANCELED",
     *            "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditCheckRunStatus
     */
    public AuditCheckDetails withCheckRunStatus(AuditCheckRunStatus checkRunStatus) {
        this.checkRunStatus = checkRunStatus.toString();
        return this;
    }

    /**
     * <p>
     * True if the check completed and found all resources compliant.
     * </p>
     *
     * @return <p>
     *         True if the check completed and found all resources compliant.
     *         </p>
     */
    public Boolean isCheckCompliant() {
        return checkCompliant;
    }

    /**
     * <p>
     * True if the check completed and found all resources compliant.
     * </p>
     *
     * @return <p>
     *         True if the check completed and found all resources compliant.
     *         </p>
     */
    public Boolean getCheckCompliant() {
        return checkCompliant;
    }

    /**
     * <p>
     * True if the check completed and found all resources compliant.
     * </p>
     *
     * @param checkCompliant <p>
     *            True if the check completed and found all resources compliant.
     *            </p>
     */
    public void setCheckCompliant(Boolean checkCompliant) {
        this.checkCompliant = checkCompliant;
    }

    /**
     * <p>
     * True if the check completed and found all resources compliant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checkCompliant <p>
     *            True if the check completed and found all resources compliant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditCheckDetails withCheckCompliant(Boolean checkCompliant) {
        this.checkCompliant = checkCompliant;
        return this;
    }

    /**
     * <p>
     * The number of resources on which the check was performed.
     * </p>
     *
     * @return <p>
     *         The number of resources on which the check was performed.
     *         </p>
     */
    public Long getTotalResourcesCount() {
        return totalResourcesCount;
    }

    /**
     * <p>
     * The number of resources on which the check was performed.
     * </p>
     *
     * @param totalResourcesCount <p>
     *            The number of resources on which the check was performed.
     *            </p>
     */
    public void setTotalResourcesCount(Long totalResourcesCount) {
        this.totalResourcesCount = totalResourcesCount;
    }

    /**
     * <p>
     * The number of resources on which the check was performed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalResourcesCount <p>
     *            The number of resources on which the check was performed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditCheckDetails withTotalResourcesCount(Long totalResourcesCount) {
        this.totalResourcesCount = totalResourcesCount;
        return this;
    }

    /**
     * <p>
     * The number of resources that the check found non-compliant.
     * </p>
     *
     * @return <p>
     *         The number of resources that the check found non-compliant.
     *         </p>
     */
    public Long getNonCompliantResourcesCount() {
        return nonCompliantResourcesCount;
    }

    /**
     * <p>
     * The number of resources that the check found non-compliant.
     * </p>
     *
     * @param nonCompliantResourcesCount <p>
     *            The number of resources that the check found non-compliant.
     *            </p>
     */
    public void setNonCompliantResourcesCount(Long nonCompliantResourcesCount) {
        this.nonCompliantResourcesCount = nonCompliantResourcesCount;
    }

    /**
     * <p>
     * The number of resources that the check found non-compliant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nonCompliantResourcesCount <p>
     *            The number of resources that the check found non-compliant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditCheckDetails withNonCompliantResourcesCount(Long nonCompliantResourcesCount) {
        this.nonCompliantResourcesCount = nonCompliantResourcesCount;
        return this;
    }

    /**
     * <p>
     * The code of any error encountered when performing this check during this
     * audit. One of "INSUFFICIENT_PERMISSIONS", or "AUDIT_CHECK_DISABLED".
     * </p>
     *
     * @return <p>
     *         The code of any error encountered when performing this check
     *         during this audit. One of "INSUFFICIENT_PERMISSIONS", or
     *         "AUDIT_CHECK_DISABLED".
     *         </p>
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * The code of any error encountered when performing this check during this
     * audit. One of "INSUFFICIENT_PERMISSIONS", or "AUDIT_CHECK_DISABLED".
     * </p>
     *
     * @param errorCode <p>
     *            The code of any error encountered when performing this check
     *            during this audit. One of "INSUFFICIENT_PERMISSIONS", or
     *            "AUDIT_CHECK_DISABLED".
     *            </p>
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The code of any error encountered when performing this check during this
     * audit. One of "INSUFFICIENT_PERMISSIONS", or "AUDIT_CHECK_DISABLED".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorCode <p>
     *            The code of any error encountered when performing this check
     *            during this audit. One of "INSUFFICIENT_PERMISSIONS", or
     *            "AUDIT_CHECK_DISABLED".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditCheckDetails withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * The message associated with any error encountered when performing this
     * check during this audit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @return <p>
     *         The message associated with any error encountered when performing
     *         this check during this audit.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The message associated with any error encountered when performing this
     * check during this audit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param message <p>
     *            The message associated with any error encountered when
     *            performing this check during this audit.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message associated with any error encountered when performing this
     * check during this audit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param message <p>
     *            The message associated with any error encountered when
     *            performing this check during this audit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditCheckDetails withMessage(String message) {
        this.message = message;
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
        if (getCheckRunStatus() != null)
            sb.append("checkRunStatus: " + getCheckRunStatus() + ",");
        if (getCheckCompliant() != null)
            sb.append("checkCompliant: " + getCheckCompliant() + ",");
        if (getTotalResourcesCount() != null)
            sb.append("totalResourcesCount: " + getTotalResourcesCount() + ",");
        if (getNonCompliantResourcesCount() != null)
            sb.append("nonCompliantResourcesCount: " + getNonCompliantResourcesCount() + ",");
        if (getErrorCode() != null)
            sb.append("errorCode: " + getErrorCode() + ",");
        if (getMessage() != null)
            sb.append("message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCheckRunStatus() == null) ? 0 : getCheckRunStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCheckCompliant() == null) ? 0 : getCheckCompliant().hashCode());
        hashCode = prime * hashCode
                + ((getTotalResourcesCount() == null) ? 0 : getTotalResourcesCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getNonCompliantResourcesCount() == null) ? 0 : getNonCompliantResourcesCount()
                        .hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditCheckDetails == false)
            return false;
        AuditCheckDetails other = (AuditCheckDetails) obj;

        if (other.getCheckRunStatus() == null ^ this.getCheckRunStatus() == null)
            return false;
        if (other.getCheckRunStatus() != null
                && other.getCheckRunStatus().equals(this.getCheckRunStatus()) == false)
            return false;
        if (other.getCheckCompliant() == null ^ this.getCheckCompliant() == null)
            return false;
        if (other.getCheckCompliant() != null
                && other.getCheckCompliant().equals(this.getCheckCompliant()) == false)
            return false;
        if (other.getTotalResourcesCount() == null ^ this.getTotalResourcesCount() == null)
            return false;
        if (other.getTotalResourcesCount() != null
                && other.getTotalResourcesCount().equals(this.getTotalResourcesCount()) == false)
            return false;
        if (other.getNonCompliantResourcesCount() == null
                ^ this.getNonCompliantResourcesCount() == null)
            return false;
        if (other.getNonCompliantResourcesCount() != null
                && other.getNonCompliantResourcesCount().equals(
                        this.getNonCompliantResourcesCount()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
