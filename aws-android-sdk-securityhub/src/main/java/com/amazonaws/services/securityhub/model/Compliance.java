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

package com.amazonaws.services.securityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Contains finding details that are specific to control-based findings. Only
 * returned for findings generated from controls.
 * </p>
 */
public class Compliance implements Serializable {
    /**
     * <p>
     * The result of a standards check.
     * </p>
     * <p>
     * The valid values for <code>Status</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <code>PASSED</code> - Standards check passed for all evaluated resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> - Some information is missing or this check is not
     * supported for your configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Standards check failed for at least one evaluated
     * resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_AVAILABLE</code> - Check could not be performed due to a
     * service outage, API error, or because the result of the AWS Config
     * evaluation was <code>NOT_APPLICABLE</code>. If the AWS Config evaluation
     * result was <code>NOT_APPLICABLE</code>, then after 3 days, Security Hub
     * automatically archives the finding.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSED, WARNING, FAILED, NOT_AVAILABLE
     */
    private String status;

    /**
     * <p>
     * For a control, the industry or regulatory framework requirements that are
     * related to the control. The check for that control is aligned with these
     * requirements.
     * </p>
     */
    private java.util.List<String> relatedRequirements;

    /**
     * <p>
     * For findings generated from controls, a list of reasons behind the value
     * of <code>Status</code>. For the list of status reason codes and their
     * meanings, see <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     * >Standards-related information in the ASFF</a> in the <i>AWS Security Hub
     * User Guide</i>.
     * </p>
     */
    private java.util.List<StatusReason> statusReasons;

    /**
     * <p>
     * The result of a standards check.
     * </p>
     * <p>
     * The valid values for <code>Status</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <code>PASSED</code> - Standards check passed for all evaluated resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> - Some information is missing or this check is not
     * supported for your configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Standards check failed for at least one evaluated
     * resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_AVAILABLE</code> - Check could not be performed due to a
     * service outage, API error, or because the result of the AWS Config
     * evaluation was <code>NOT_APPLICABLE</code>. If the AWS Config evaluation
     * result was <code>NOT_APPLICABLE</code>, then after 3 days, Security Hub
     * automatically archives the finding.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSED, WARNING, FAILED, NOT_AVAILABLE
     *
     * @return <p>
     *         The result of a standards check.
     *         </p>
     *         <p>
     *         The valid values for <code>Status</code> are as follows.
     *         </p>
     *         <ul>
     *         <li>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PASSED</code> - Standards check passed for all evaluated
     *         resources.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WARNING</code> - Some information is missing or this check
     *         is not supported for your configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - Standards check failed for at least one
     *         evaluated resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_AVAILABLE</code> - Check could not be performed due to
     *         a service outage, API error, or because the result of the AWS
     *         Config evaluation was <code>NOT_APPLICABLE</code>. If the AWS
     *         Config evaluation result was <code>NOT_APPLICABLE</code>, then
     *         after 3 days, Security Hub automatically archives the finding.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     * @see ComplianceStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The result of a standards check.
     * </p>
     * <p>
     * The valid values for <code>Status</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <code>PASSED</code> - Standards check passed for all evaluated resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> - Some information is missing or this check is not
     * supported for your configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Standards check failed for at least one evaluated
     * resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_AVAILABLE</code> - Check could not be performed due to a
     * service outage, API error, or because the result of the AWS Config
     * evaluation was <code>NOT_APPLICABLE</code>. If the AWS Config evaluation
     * result was <code>NOT_APPLICABLE</code>, then after 3 days, Security Hub
     * automatically archives the finding.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSED, WARNING, FAILED, NOT_AVAILABLE
     *
     * @param status <p>
     *            The result of a standards check.
     *            </p>
     *            <p>
     *            The valid values for <code>Status</code> are as follows.
     *            </p>
     *            <ul>
     *            <li>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PASSED</code> - Standards check passed for all evaluated
     *            resources.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>WARNING</code> - Some information is missing or this
     *            check is not supported for your configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - Standards check failed for at least one
     *            evaluated resource.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_AVAILABLE</code> - Check could not be performed due
     *            to a service outage, API error, or because the result of the
     *            AWS Config evaluation was <code>NOT_APPLICABLE</code>. If the
     *            AWS Config evaluation result was <code>NOT_APPLICABLE</code>,
     *            then after 3 days, Security Hub automatically archives the
     *            finding.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @see ComplianceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The result of a standards check.
     * </p>
     * <p>
     * The valid values for <code>Status</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <code>PASSED</code> - Standards check passed for all evaluated resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> - Some information is missing or this check is not
     * supported for your configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Standards check failed for at least one evaluated
     * resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_AVAILABLE</code> - Check could not be performed due to a
     * service outage, API error, or because the result of the AWS Config
     * evaluation was <code>NOT_APPLICABLE</code>. If the AWS Config evaluation
     * result was <code>NOT_APPLICABLE</code>, then after 3 days, Security Hub
     * automatically archives the finding.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSED, WARNING, FAILED, NOT_AVAILABLE
     *
     * @param status <p>
     *            The result of a standards check.
     *            </p>
     *            <p>
     *            The valid values for <code>Status</code> are as follows.
     *            </p>
     *            <ul>
     *            <li>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PASSED</code> - Standards check passed for all evaluated
     *            resources.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>WARNING</code> - Some information is missing or this
     *            check is not supported for your configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - Standards check failed for at least one
     *            evaluated resource.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_AVAILABLE</code> - Check could not be performed due
     *            to a service outage, API error, or because the result of the
     *            AWS Config evaluation was <code>NOT_APPLICABLE</code>. If the
     *            AWS Config evaluation result was <code>NOT_APPLICABLE</code>,
     *            then after 3 days, Security Hub automatically archives the
     *            finding.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComplianceStatus
     */
    public Compliance withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The result of a standards check.
     * </p>
     * <p>
     * The valid values for <code>Status</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <code>PASSED</code> - Standards check passed for all evaluated resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> - Some information is missing or this check is not
     * supported for your configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Standards check failed for at least one evaluated
     * resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_AVAILABLE</code> - Check could not be performed due to a
     * service outage, API error, or because the result of the AWS Config
     * evaluation was <code>NOT_APPLICABLE</code>. If the AWS Config evaluation
     * result was <code>NOT_APPLICABLE</code>, then after 3 days, Security Hub
     * automatically archives the finding.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSED, WARNING, FAILED, NOT_AVAILABLE
     *
     * @param status <p>
     *            The result of a standards check.
     *            </p>
     *            <p>
     *            The valid values for <code>Status</code> are as follows.
     *            </p>
     *            <ul>
     *            <li>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PASSED</code> - Standards check passed for all evaluated
     *            resources.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>WARNING</code> - Some information is missing or this
     *            check is not supported for your configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - Standards check failed for at least one
     *            evaluated resource.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_AVAILABLE</code> - Check could not be performed due
     *            to a service outage, API error, or because the result of the
     *            AWS Config evaluation was <code>NOT_APPLICABLE</code>. If the
     *            AWS Config evaluation result was <code>NOT_APPLICABLE</code>,
     *            then after 3 days, Security Hub automatically archives the
     *            finding.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @see ComplianceStatus
     */
    public void setStatus(ComplianceStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The result of a standards check.
     * </p>
     * <p>
     * The valid values for <code>Status</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <ul>
     * <li>
     * <p>
     * <code>PASSED</code> - Standards check passed for all evaluated resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARNING</code> - Some information is missing or this check is not
     * supported for your configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Standards check failed for at least one evaluated
     * resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_AVAILABLE</code> - Check could not be performed due to a
     * service outage, API error, or because the result of the AWS Config
     * evaluation was <code>NOT_APPLICABLE</code>. If the AWS Config evaluation
     * result was <code>NOT_APPLICABLE</code>, then after 3 days, Security Hub
     * automatically archives the finding.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSED, WARNING, FAILED, NOT_AVAILABLE
     *
     * @param status <p>
     *            The result of a standards check.
     *            </p>
     *            <p>
     *            The valid values for <code>Status</code> are as follows.
     *            </p>
     *            <ul>
     *            <li>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PASSED</code> - Standards check passed for all evaluated
     *            resources.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>WARNING</code> - Some information is missing or this
     *            check is not supported for your configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - Standards check failed for at least one
     *            evaluated resource.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_AVAILABLE</code> - Check could not be performed due
     *            to a service outage, API error, or because the result of the
     *            AWS Config evaluation was <code>NOT_APPLICABLE</code>. If the
     *            AWS Config evaluation result was <code>NOT_APPLICABLE</code>,
     *            then after 3 days, Security Hub automatically archives the
     *            finding.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComplianceStatus
     */
    public Compliance withStatus(ComplianceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * For a control, the industry or regulatory framework requirements that are
     * related to the control. The check for that control is aligned with these
     * requirements.
     * </p>
     *
     * @return <p>
     *         For a control, the industry or regulatory framework requirements
     *         that are related to the control. The check for that control is
     *         aligned with these requirements.
     *         </p>
     */
    public java.util.List<String> getRelatedRequirements() {
        return relatedRequirements;
    }

    /**
     * <p>
     * For a control, the industry or regulatory framework requirements that are
     * related to the control. The check for that control is aligned with these
     * requirements.
     * </p>
     *
     * @param relatedRequirements <p>
     *            For a control, the industry or regulatory framework
     *            requirements that are related to the control. The check for
     *            that control is aligned with these requirements.
     *            </p>
     */
    public void setRelatedRequirements(java.util.Collection<String> relatedRequirements) {
        if (relatedRequirements == null) {
            this.relatedRequirements = null;
            return;
        }

        this.relatedRequirements = new java.util.ArrayList<String>(relatedRequirements);
    }

    /**
     * <p>
     * For a control, the industry or regulatory framework requirements that are
     * related to the control. The check for that control is aligned with these
     * requirements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relatedRequirements <p>
     *            For a control, the industry or regulatory framework
     *            requirements that are related to the control. The check for
     *            that control is aligned with these requirements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Compliance withRelatedRequirements(String... relatedRequirements) {
        if (getRelatedRequirements() == null) {
            this.relatedRequirements = new java.util.ArrayList<String>(relatedRequirements.length);
        }
        for (String value : relatedRequirements) {
            this.relatedRequirements.add(value);
        }
        return this;
    }

    /**
     * <p>
     * For a control, the industry or regulatory framework requirements that are
     * related to the control. The check for that control is aligned with these
     * requirements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relatedRequirements <p>
     *            For a control, the industry or regulatory framework
     *            requirements that are related to the control. The check for
     *            that control is aligned with these requirements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Compliance withRelatedRequirements(java.util.Collection<String> relatedRequirements) {
        setRelatedRequirements(relatedRequirements);
        return this;
    }

    /**
     * <p>
     * For findings generated from controls, a list of reasons behind the value
     * of <code>Status</code>. For the list of status reason codes and their
     * meanings, see <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     * >Standards-related information in the ASFF</a> in the <i>AWS Security Hub
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         For findings generated from controls, a list of reasons behind
     *         the value of <code>Status</code>. For the list of status reason
     *         codes and their meanings, see <a href=
     *         "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     *         >Standards-related information in the ASFF</a> in the <i>AWS
     *         Security Hub User Guide</i>.
     *         </p>
     */
    public java.util.List<StatusReason> getStatusReasons() {
        return statusReasons;
    }

    /**
     * <p>
     * For findings generated from controls, a list of reasons behind the value
     * of <code>Status</code>. For the list of status reason codes and their
     * meanings, see <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     * >Standards-related information in the ASFF</a> in the <i>AWS Security Hub
     * User Guide</i>.
     * </p>
     *
     * @param statusReasons <p>
     *            For findings generated from controls, a list of reasons behind
     *            the value of <code>Status</code>. For the list of status
     *            reason codes and their meanings, see <a href=
     *            "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     *            >Standards-related information in the ASFF</a> in the <i>AWS
     *            Security Hub User Guide</i>.
     *            </p>
     */
    public void setStatusReasons(java.util.Collection<StatusReason> statusReasons) {
        if (statusReasons == null) {
            this.statusReasons = null;
            return;
        }

        this.statusReasons = new java.util.ArrayList<StatusReason>(statusReasons);
    }

    /**
     * <p>
     * For findings generated from controls, a list of reasons behind the value
     * of <code>Status</code>. For the list of status reason codes and their
     * meanings, see <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     * >Standards-related information in the ASFF</a> in the <i>AWS Security Hub
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusReasons <p>
     *            For findings generated from controls, a list of reasons behind
     *            the value of <code>Status</code>. For the list of status
     *            reason codes and their meanings, see <a href=
     *            "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     *            >Standards-related information in the ASFF</a> in the <i>AWS
     *            Security Hub User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Compliance withStatusReasons(StatusReason... statusReasons) {
        if (getStatusReasons() == null) {
            this.statusReasons = new java.util.ArrayList<StatusReason>(statusReasons.length);
        }
        for (StatusReason value : statusReasons) {
            this.statusReasons.add(value);
        }
        return this;
    }

    /**
     * <p>
     * For findings generated from controls, a list of reasons behind the value
     * of <code>Status</code>. For the list of status reason codes and their
     * meanings, see <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     * >Standards-related information in the ASFF</a> in the <i>AWS Security Hub
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusReasons <p>
     *            For findings generated from controls, a list of reasons behind
     *            the value of <code>Status</code>. For the list of status
     *            reason codes and their meanings, see <a href=
     *            "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-results.html#securityhub-standards-results-asff"
     *            >Standards-related information in the ASFF</a> in the <i>AWS
     *            Security Hub User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Compliance withStatusReasons(java.util.Collection<StatusReason> statusReasons) {
        setStatusReasons(statusReasons);
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getRelatedRequirements() != null)
            sb.append("RelatedRequirements: " + getRelatedRequirements() + ",");
        if (getStatusReasons() != null)
            sb.append("StatusReasons: " + getStatusReasons());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getRelatedRequirements() == null) ? 0 : getRelatedRequirements().hashCode());
        hashCode = prime * hashCode
                + ((getStatusReasons() == null) ? 0 : getStatusReasons().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Compliance == false)
            return false;
        Compliance other = (Compliance) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRelatedRequirements() == null ^ this.getRelatedRequirements() == null)
            return false;
        if (other.getRelatedRequirements() != null
                && other.getRelatedRequirements().equals(this.getRelatedRequirements()) == false)
            return false;
        if (other.getStatusReasons() == null ^ this.getStatusReasons() == null)
            return false;
        if (other.getStatusReasons() != null
                && other.getStatusReasons().equals(this.getStatusReasons()) == false)
            return false;
        return true;
    }
}
