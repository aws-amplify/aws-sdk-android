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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an association of a Systems Manager document and an instance.
 * </p>
 */
public class Association implements Serializable {
    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The ID created by the system when you create an association. An
     * association is a binding between a document and a set of targets with a
     * schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     */
    private String associationId;

    /**
     * <p>
     * The association version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST)|([1-9][0-9]*)<br/>
     */
    private String associationVersion;

    /**
     * <p>
     * The version of the document used in the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String documentVersion;

    /**
     * <p>
     * The instances targeted by the request to create an association.
     * </p>
     */
    private java.util.List<Target> targets;

    /**
     * <p>
     * The date on which the association was last run.
     * </p>
     */
    private java.util.Date lastExecutionDate;

    /**
     * <p>
     * Information about the association.
     * </p>
     */
    private AssociationOverview overview;

    /**
     * <p>
     * A cron expression that specifies a schedule when the association runs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String scheduleExpression;

    /**
     * <p>
     * The association name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String associationName;

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @return <p>
     *         The name of the Systems Manager document.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the Systems Manager document.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the Systems Manager document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Association withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @return <p>
     *         The ID of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Association withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The ID created by the system when you create an association. An
     * association is a binding between a document and a set of targets with a
     * schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>
     *         The ID created by the system when you create an association. An
     *         association is a binding between a document and a set of targets
     *         with a schedule.
     *         </p>
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * <p>
     * The ID created by the system when you create an association. An
     * association is a binding between a document and a set of targets with a
     * schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param associationId <p>
     *            The ID created by the system when you create an association.
     *            An association is a binding between a document and a set of
     *            targets with a schedule.
     *            </p>
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID created by the system when you create an association. An
     * association is a binding between a document and a set of targets with a
     * schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param associationId <p>
     *            The ID created by the system when you create an association.
     *            An association is a binding between a document and a set of
     *            targets with a schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Association withAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }

    /**
     * <p>
     * The association version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST)|([1-9][0-9]*)<br/>
     *
     * @return <p>
     *         The association version.
     *         </p>
     */
    public String getAssociationVersion() {
        return associationVersion;
    }

    /**
     * <p>
     * The association version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST)|([1-9][0-9]*)<br/>
     *
     * @param associationVersion <p>
     *            The association version.
     *            </p>
     */
    public void setAssociationVersion(String associationVersion) {
        this.associationVersion = associationVersion;
    }

    /**
     * <p>
     * The association version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST)|([1-9][0-9]*)<br/>
     *
     * @param associationVersion <p>
     *            The association version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Association withAssociationVersion(String associationVersion) {
        this.associationVersion = associationVersion;
        return this;
    }

    /**
     * <p>
     * The version of the document used in the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @return <p>
     *         The version of the document used in the association.
     *         </p>
     */
    public String getDocumentVersion() {
        return documentVersion;
    }

    /**
     * <p>
     * The version of the document used in the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The version of the document used in the association.
     *            </p>
     */
    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of the document used in the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The version of the document used in the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Association withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * <p>
     * The instances targeted by the request to create an association.
     * </p>
     *
     * @return <p>
     *         The instances targeted by the request to create an association.
     *         </p>
     */
    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The instances targeted by the request to create an association.
     * </p>
     *
     * @param targets <p>
     *            The instances targeted by the request to create an
     *            association.
     *            </p>
     */
    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<Target>(targets);
    }

    /**
     * <p>
     * The instances targeted by the request to create an association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The instances targeted by the request to create an
     *            association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Association withTargets(Target... targets) {
        if (getTargets() == null) {
            this.targets = new java.util.ArrayList<Target>(targets.length);
        }
        for (Target value : targets) {
            this.targets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The instances targeted by the request to create an association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The instances targeted by the request to create an
     *            association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Association withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The date on which the association was last run.
     * </p>
     *
     * @return <p>
     *         The date on which the association was last run.
     *         </p>
     */
    public java.util.Date getLastExecutionDate() {
        return lastExecutionDate;
    }

    /**
     * <p>
     * The date on which the association was last run.
     * </p>
     *
     * @param lastExecutionDate <p>
     *            The date on which the association was last run.
     *            </p>
     */
    public void setLastExecutionDate(java.util.Date lastExecutionDate) {
        this.lastExecutionDate = lastExecutionDate;
    }

    /**
     * <p>
     * The date on which the association was last run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastExecutionDate <p>
     *            The date on which the association was last run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Association withLastExecutionDate(java.util.Date lastExecutionDate) {
        this.lastExecutionDate = lastExecutionDate;
        return this;
    }

    /**
     * <p>
     * Information about the association.
     * </p>
     *
     * @return <p>
     *         Information about the association.
     *         </p>
     */
    public AssociationOverview getOverview() {
        return overview;
    }

    /**
     * <p>
     * Information about the association.
     * </p>
     *
     * @param overview <p>
     *            Information about the association.
     *            </p>
     */
    public void setOverview(AssociationOverview overview) {
        this.overview = overview;
    }

    /**
     * <p>
     * Information about the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param overview <p>
     *            Information about the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Association withOverview(AssociationOverview overview) {
        this.overview = overview;
        return this;
    }

    /**
     * <p>
     * A cron expression that specifies a schedule when the association runs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         A cron expression that specifies a schedule when the association
     *         runs.
     *         </p>
     */
    public String getScheduleExpression() {
        return scheduleExpression;
    }

    /**
     * <p>
     * A cron expression that specifies a schedule when the association runs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param scheduleExpression <p>
     *            A cron expression that specifies a schedule when the
     *            association runs.
     *            </p>
     */
    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * A cron expression that specifies a schedule when the association runs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param scheduleExpression <p>
     *            A cron expression that specifies a schedule when the
     *            association runs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Association withScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }

    /**
     * <p>
     * The association name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         The association name.
     *         </p>
     */
    public String getAssociationName() {
        return associationName;
    }

    /**
     * <p>
     * The association name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param associationName <p>
     *            The association name.
     *            </p>
     */
    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    /**
     * <p>
     * The association name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param associationName <p>
     *            The association name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Association withAssociationName(String associationName) {
        this.associationName = associationName;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getAssociationId() != null)
            sb.append("AssociationId: " + getAssociationId() + ",");
        if (getAssociationVersion() != null)
            sb.append("AssociationVersion: " + getAssociationVersion() + ",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: " + getDocumentVersion() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getLastExecutionDate() != null)
            sb.append("LastExecutionDate: " + getLastExecutionDate() + ",");
        if (getOverview() != null)
            sb.append("Overview: " + getOverview() + ",");
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: " + getScheduleExpression() + ",");
        if (getAssociationName() != null)
            sb.append("AssociationName: " + getAssociationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode
                + ((getAssociationVersion() == null) ? 0 : getAssociationVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode
                + ((getLastExecutionDate() == null) ? 0 : getLastExecutionDate().hashCode());
        hashCode = prime * hashCode + ((getOverview() == null) ? 0 : getOverview().hashCode());
        hashCode = prime * hashCode
                + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode
                + ((getAssociationName() == null) ? 0 : getAssociationName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Association == false)
            return false;
        Association other = (Association) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null
                && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getAssociationVersion() == null ^ this.getAssociationVersion() == null)
            return false;
        if (other.getAssociationVersion() != null
                && other.getAssociationVersion().equals(this.getAssociationVersion()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null
                && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getLastExecutionDate() == null ^ this.getLastExecutionDate() == null)
            return false;
        if (other.getLastExecutionDate() != null
                && other.getLastExecutionDate().equals(this.getLastExecutionDate()) == false)
            return false;
        if (other.getOverview() == null ^ this.getOverview() == null)
            return false;
        if (other.getOverview() != null && other.getOverview().equals(this.getOverview()) == false)
            return false;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null
                && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getAssociationName() == null ^ this.getAssociationName() == null)
            return false;
        if (other.getAssociationName() != null
                && other.getAssociationName().equals(this.getAssociationName()) == false)
            return false;
        return true;
    }
}
