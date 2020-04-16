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

/**
 * <p>
 * Details for an individual security standard control.
 * </p>
 */
public class StandardsControl implements Serializable {
    /**
     * <p>
     * The ARN of the security standard control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String standardsControlArn;

    /**
     * <p>
     * The current status of the security standard control. Indicates whether
     * the control is enabled or disabled. Security Hub does not check against
     * disabled controls.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String controlStatus;

    /**
     * <p>
     * The reason provided for the most recent change in status for the control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String disabledReason;

    /**
     * <p>
     * The date and time that the status of the security standard control was
     * most recently updated.
     * </p>
     */
    private java.util.Date controlStatusUpdatedAt;

    /**
     * <p>
     * The identifier of the security standard control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String controlId;

    /**
     * <p>
     * The title of the security standard control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String title;

    /**
     * <p>
     * The longer description of the security standard control. Provides
     * information about what the control is checking for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String description;

    /**
     * <p>
     * A link to remediation information for the control in the Security Hub
     * user documentation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String remediationUrl;

    /**
     * <p>
     * The severity of findings generated from this security standard control.
     * </p>
     * <p>
     * The finding severity is based on an assessment of how easy it would be to
     * compromise AWS resources if the issue is detected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOW, MEDIUM, HIGH, CRITICAL
     */
    private String severityRating;

    /**
     * <p>
     * The list of requirements that are related to this control.
     * </p>
     */
    private java.util.List<String> relatedRequirements;

    /**
     * <p>
     * The ARN of the security standard control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ARN of the security standard control.
     *         </p>
     */
    public String getStandardsControlArn() {
        return standardsControlArn;
    }

    /**
     * <p>
     * The ARN of the security standard control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param standardsControlArn <p>
     *            The ARN of the security standard control.
     *            </p>
     */
    public void setStandardsControlArn(String standardsControlArn) {
        this.standardsControlArn = standardsControlArn;
    }

    /**
     * <p>
     * The ARN of the security standard control.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param standardsControlArn <p>
     *            The ARN of the security standard control.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StandardsControl withStandardsControlArn(String standardsControlArn) {
        this.standardsControlArn = standardsControlArn;
        return this;
    }

    /**
     * <p>
     * The current status of the security standard control. Indicates whether
     * the control is enabled or disabled. Security Hub does not check against
     * disabled controls.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         The current status of the security standard control. Indicates
     *         whether the control is enabled or disabled. Security Hub does not
     *         check against disabled controls.
     *         </p>
     * @see ControlStatus
     */
    public String getControlStatus() {
        return controlStatus;
    }

    /**
     * <p>
     * The current status of the security standard control. Indicates whether
     * the control is enabled or disabled. Security Hub does not check against
     * disabled controls.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param controlStatus <p>
     *            The current status of the security standard control. Indicates
     *            whether the control is enabled or disabled. Security Hub does
     *            not check against disabled controls.
     *            </p>
     * @see ControlStatus
     */
    public void setControlStatus(String controlStatus) {
        this.controlStatus = controlStatus;
    }

    /**
     * <p>
     * The current status of the security standard control. Indicates whether
     * the control is enabled or disabled. Security Hub does not check against
     * disabled controls.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param controlStatus <p>
     *            The current status of the security standard control. Indicates
     *            whether the control is enabled or disabled. Security Hub does
     *            not check against disabled controls.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ControlStatus
     */
    public StandardsControl withControlStatus(String controlStatus) {
        this.controlStatus = controlStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the security standard control. Indicates whether
     * the control is enabled or disabled. Security Hub does not check against
     * disabled controls.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param controlStatus <p>
     *            The current status of the security standard control. Indicates
     *            whether the control is enabled or disabled. Security Hub does
     *            not check against disabled controls.
     *            </p>
     * @see ControlStatus
     */
    public void setControlStatus(ControlStatus controlStatus) {
        this.controlStatus = controlStatus.toString();
    }

    /**
     * <p>
     * The current status of the security standard control. Indicates whether
     * the control is enabled or disabled. Security Hub does not check against
     * disabled controls.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param controlStatus <p>
     *            The current status of the security standard control. Indicates
     *            whether the control is enabled or disabled. Security Hub does
     *            not check against disabled controls.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ControlStatus
     */
    public StandardsControl withControlStatus(ControlStatus controlStatus) {
        this.controlStatus = controlStatus.toString();
        return this;
    }

    /**
     * <p>
     * The reason provided for the most recent change in status for the control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The reason provided for the most recent change in status for the
     *         control.
     *         </p>
     */
    public String getDisabledReason() {
        return disabledReason;
    }

    /**
     * <p>
     * The reason provided for the most recent change in status for the control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param disabledReason <p>
     *            The reason provided for the most recent change in status for
     *            the control.
     *            </p>
     */
    public void setDisabledReason(String disabledReason) {
        this.disabledReason = disabledReason;
    }

    /**
     * <p>
     * The reason provided for the most recent change in status for the control.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param disabledReason <p>
     *            The reason provided for the most recent change in status for
     *            the control.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StandardsControl withDisabledReason(String disabledReason) {
        this.disabledReason = disabledReason;
        return this;
    }

    /**
     * <p>
     * The date and time that the status of the security standard control was
     * most recently updated.
     * </p>
     *
     * @return <p>
     *         The date and time that the status of the security standard
     *         control was most recently updated.
     *         </p>
     */
    public java.util.Date getControlStatusUpdatedAt() {
        return controlStatusUpdatedAt;
    }

    /**
     * <p>
     * The date and time that the status of the security standard control was
     * most recently updated.
     * </p>
     *
     * @param controlStatusUpdatedAt <p>
     *            The date and time that the status of the security standard
     *            control was most recently updated.
     *            </p>
     */
    public void setControlStatusUpdatedAt(java.util.Date controlStatusUpdatedAt) {
        this.controlStatusUpdatedAt = controlStatusUpdatedAt;
    }

    /**
     * <p>
     * The date and time that the status of the security standard control was
     * most recently updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param controlStatusUpdatedAt <p>
     *            The date and time that the status of the security standard
     *            control was most recently updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StandardsControl withControlStatusUpdatedAt(java.util.Date controlStatusUpdatedAt) {
        this.controlStatusUpdatedAt = controlStatusUpdatedAt;
        return this;
    }

    /**
     * <p>
     * The identifier of the security standard control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The identifier of the security standard control.
     *         </p>
     */
    public String getControlId() {
        return controlId;
    }

    /**
     * <p>
     * The identifier of the security standard control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param controlId <p>
     *            The identifier of the security standard control.
     *            </p>
     */
    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    /**
     * <p>
     * The identifier of the security standard control.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param controlId <p>
     *            The identifier of the security standard control.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StandardsControl withControlId(String controlId) {
        this.controlId = controlId;
        return this;
    }

    /**
     * <p>
     * The title of the security standard control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The title of the security standard control.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The title of the security standard control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param title <p>
     *            The title of the security standard control.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the security standard control.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param title <p>
     *            The title of the security standard control.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StandardsControl withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The longer description of the security standard control. Provides
     * information about what the control is checking for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The longer description of the security standard control. Provides
     *         information about what the control is checking for.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The longer description of the security standard control. Provides
     * information about what the control is checking for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param description <p>
     *            The longer description of the security standard control.
     *            Provides information about what the control is checking for.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The longer description of the security standard control. Provides
     * information about what the control is checking for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param description <p>
     *            The longer description of the security standard control.
     *            Provides information about what the control is checking for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StandardsControl withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A link to remediation information for the control in the Security Hub
     * user documentation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A link to remediation information for the control in the Security
     *         Hub user documentation.
     *         </p>
     */
    public String getRemediationUrl() {
        return remediationUrl;
    }

    /**
     * <p>
     * A link to remediation information for the control in the Security Hub
     * user documentation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param remediationUrl <p>
     *            A link to remediation information for the control in the
     *            Security Hub user documentation.
     *            </p>
     */
    public void setRemediationUrl(String remediationUrl) {
        this.remediationUrl = remediationUrl;
    }

    /**
     * <p>
     * A link to remediation information for the control in the Security Hub
     * user documentation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param remediationUrl <p>
     *            A link to remediation information for the control in the
     *            Security Hub user documentation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StandardsControl withRemediationUrl(String remediationUrl) {
        this.remediationUrl = remediationUrl;
        return this;
    }

    /**
     * <p>
     * The severity of findings generated from this security standard control.
     * </p>
     * <p>
     * The finding severity is based on an assessment of how easy it would be to
     * compromise AWS resources if the issue is detected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOW, MEDIUM, HIGH, CRITICAL
     *
     * @return <p>
     *         The severity of findings generated from this security standard
     *         control.
     *         </p>
     *         <p>
     *         The finding severity is based on an assessment of how easy it
     *         would be to compromise AWS resources if the issue is detected.
     *         </p>
     * @see SeverityRating
     */
    public String getSeverityRating() {
        return severityRating;
    }

    /**
     * <p>
     * The severity of findings generated from this security standard control.
     * </p>
     * <p>
     * The finding severity is based on an assessment of how easy it would be to
     * compromise AWS resources if the issue is detected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOW, MEDIUM, HIGH, CRITICAL
     *
     * @param severityRating <p>
     *            The severity of findings generated from this security standard
     *            control.
     *            </p>
     *            <p>
     *            The finding severity is based on an assessment of how easy it
     *            would be to compromise AWS resources if the issue is detected.
     *            </p>
     * @see SeverityRating
     */
    public void setSeverityRating(String severityRating) {
        this.severityRating = severityRating;
    }

    /**
     * <p>
     * The severity of findings generated from this security standard control.
     * </p>
     * <p>
     * The finding severity is based on an assessment of how easy it would be to
     * compromise AWS resources if the issue is detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOW, MEDIUM, HIGH, CRITICAL
     *
     * @param severityRating <p>
     *            The severity of findings generated from this security standard
     *            control.
     *            </p>
     *            <p>
     *            The finding severity is based on an assessment of how easy it
     *            would be to compromise AWS resources if the issue is detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SeverityRating
     */
    public StandardsControl withSeverityRating(String severityRating) {
        this.severityRating = severityRating;
        return this;
    }

    /**
     * <p>
     * The severity of findings generated from this security standard control.
     * </p>
     * <p>
     * The finding severity is based on an assessment of how easy it would be to
     * compromise AWS resources if the issue is detected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOW, MEDIUM, HIGH, CRITICAL
     *
     * @param severityRating <p>
     *            The severity of findings generated from this security standard
     *            control.
     *            </p>
     *            <p>
     *            The finding severity is based on an assessment of how easy it
     *            would be to compromise AWS resources if the issue is detected.
     *            </p>
     * @see SeverityRating
     */
    public void setSeverityRating(SeverityRating severityRating) {
        this.severityRating = severityRating.toString();
    }

    /**
     * <p>
     * The severity of findings generated from this security standard control.
     * </p>
     * <p>
     * The finding severity is based on an assessment of how easy it would be to
     * compromise AWS resources if the issue is detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOW, MEDIUM, HIGH, CRITICAL
     *
     * @param severityRating <p>
     *            The severity of findings generated from this security standard
     *            control.
     *            </p>
     *            <p>
     *            The finding severity is based on an assessment of how easy it
     *            would be to compromise AWS resources if the issue is detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SeverityRating
     */
    public StandardsControl withSeverityRating(SeverityRating severityRating) {
        this.severityRating = severityRating.toString();
        return this;
    }

    /**
     * <p>
     * The list of requirements that are related to this control.
     * </p>
     *
     * @return <p>
     *         The list of requirements that are related to this control.
     *         </p>
     */
    public java.util.List<String> getRelatedRequirements() {
        return relatedRequirements;
    }

    /**
     * <p>
     * The list of requirements that are related to this control.
     * </p>
     *
     * @param relatedRequirements <p>
     *            The list of requirements that are related to this control.
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
     * The list of requirements that are related to this control.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relatedRequirements <p>
     *            The list of requirements that are related to this control.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StandardsControl withRelatedRequirements(String... relatedRequirements) {
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
     * The list of requirements that are related to this control.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relatedRequirements <p>
     *            The list of requirements that are related to this control.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StandardsControl withRelatedRequirements(java.util.Collection<String> relatedRequirements) {
        setRelatedRequirements(relatedRequirements);
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
        if (getStandardsControlArn() != null)
            sb.append("StandardsControlArn: " + getStandardsControlArn() + ",");
        if (getControlStatus() != null)
            sb.append("ControlStatus: " + getControlStatus() + ",");
        if (getDisabledReason() != null)
            sb.append("DisabledReason: " + getDisabledReason() + ",");
        if (getControlStatusUpdatedAt() != null)
            sb.append("ControlStatusUpdatedAt: " + getControlStatusUpdatedAt() + ",");
        if (getControlId() != null)
            sb.append("ControlId: " + getControlId() + ",");
        if (getTitle() != null)
            sb.append("Title: " + getTitle() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getRemediationUrl() != null)
            sb.append("RemediationUrl: " + getRemediationUrl() + ",");
        if (getSeverityRating() != null)
            sb.append("SeverityRating: " + getSeverityRating() + ",");
        if (getRelatedRequirements() != null)
            sb.append("RelatedRequirements: " + getRelatedRequirements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStandardsControlArn() == null) ? 0 : getStandardsControlArn().hashCode());
        hashCode = prime * hashCode
                + ((getControlStatus() == null) ? 0 : getControlStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDisabledReason() == null) ? 0 : getDisabledReason().hashCode());
        hashCode = prime
                * hashCode
                + ((getControlStatusUpdatedAt() == null) ? 0 : getControlStatusUpdatedAt()
                        .hashCode());
        hashCode = prime * hashCode + ((getControlId() == null) ? 0 : getControlId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getRemediationUrl() == null) ? 0 : getRemediationUrl().hashCode());
        hashCode = prime * hashCode
                + ((getSeverityRating() == null) ? 0 : getSeverityRating().hashCode());
        hashCode = prime * hashCode
                + ((getRelatedRequirements() == null) ? 0 : getRelatedRequirements().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StandardsControl == false)
            return false;
        StandardsControl other = (StandardsControl) obj;

        if (other.getStandardsControlArn() == null ^ this.getStandardsControlArn() == null)
            return false;
        if (other.getStandardsControlArn() != null
                && other.getStandardsControlArn().equals(this.getStandardsControlArn()) == false)
            return false;
        if (other.getControlStatus() == null ^ this.getControlStatus() == null)
            return false;
        if (other.getControlStatus() != null
                && other.getControlStatus().equals(this.getControlStatus()) == false)
            return false;
        if (other.getDisabledReason() == null ^ this.getDisabledReason() == null)
            return false;
        if (other.getDisabledReason() != null
                && other.getDisabledReason().equals(this.getDisabledReason()) == false)
            return false;
        if (other.getControlStatusUpdatedAt() == null ^ this.getControlStatusUpdatedAt() == null)
            return false;
        if (other.getControlStatusUpdatedAt() != null
                && other.getControlStatusUpdatedAt().equals(this.getControlStatusUpdatedAt()) == false)
            return false;
        if (other.getControlId() == null ^ this.getControlId() == null)
            return false;
        if (other.getControlId() != null
                && other.getControlId().equals(this.getControlId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRemediationUrl() == null ^ this.getRemediationUrl() == null)
            return false;
        if (other.getRemediationUrl() != null
                && other.getRemediationUrl().equals(this.getRemediationUrl()) == false)
            return false;
        if (other.getSeverityRating() == null ^ this.getSeverityRating() == null)
            return false;
        if (other.getSeverityRating() != null
                && other.getSeverityRating().equals(this.getSeverityRating()) == false)
            return false;
        if (other.getRelatedRequirements() == null ^ this.getRelatedRequirements() == null)
            return false;
        if (other.getRelatedRequirements() != null
                && other.getRelatedRequirements().equals(this.getRelatedRequirements()) == false)
            return false;
        return true;
    }
}
