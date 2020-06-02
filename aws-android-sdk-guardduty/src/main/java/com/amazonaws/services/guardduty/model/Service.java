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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains additional information about the generated finding.
 * </p>
 */
public class Service implements Serializable {
    /**
     * <p>
     * Information about the activity that is described in a finding.
     * </p>
     */
    private Action action;

    /**
     * <p>
     * An evidence object associated with the service.
     * </p>
     */
    private Evidence evidence;

    /**
     * <p>
     * Indicates whether this finding is archived.
     * </p>
     */
    private Boolean archived;

    /**
     * <p>
     * The total count of the occurrences of this finding type.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The detector ID for the GuardDuty service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * The first-seen timestamp of the activity that prompted GuardDuty to
     * generate this finding.
     * </p>
     */
    private String eventFirstSeen;

    /**
     * <p>
     * The last-seen timestamp of the activity that prompted GuardDuty to
     * generate this finding.
     * </p>
     */
    private String eventLastSeen;

    /**
     * <p>
     * The resource role information for this finding.
     * </p>
     */
    private String resourceRole;

    /**
     * <p>
     * The name of the AWS service (GuardDuty) that generated a finding.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * Feedback that was submitted about the finding.
     * </p>
     */
    private String userFeedback;

    /**
     * <p>
     * Information about the activity that is described in a finding.
     * </p>
     *
     * @return <p>
     *         Information about the activity that is described in a finding.
     *         </p>
     */
    public Action getAction() {
        return action;
    }

    /**
     * <p>
     * Information about the activity that is described in a finding.
     * </p>
     *
     * @param action <p>
     *            Information about the activity that is described in a finding.
     *            </p>
     */
    public void setAction(Action action) {
        this.action = action;
    }

    /**
     * <p>
     * Information about the activity that is described in a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param action <p>
     *            Information about the activity that is described in a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withAction(Action action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * An evidence object associated with the service.
     * </p>
     *
     * @return <p>
     *         An evidence object associated with the service.
     *         </p>
     */
    public Evidence getEvidence() {
        return evidence;
    }

    /**
     * <p>
     * An evidence object associated with the service.
     * </p>
     *
     * @param evidence <p>
     *            An evidence object associated with the service.
     *            </p>
     */
    public void setEvidence(Evidence evidence) {
        this.evidence = evidence;
    }

    /**
     * <p>
     * An evidence object associated with the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evidence <p>
     *            An evidence object associated with the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withEvidence(Evidence evidence) {
        this.evidence = evidence;
        return this;
    }

    /**
     * <p>
     * Indicates whether this finding is archived.
     * </p>
     *
     * @return <p>
     *         Indicates whether this finding is archived.
     *         </p>
     */
    public Boolean isArchived() {
        return archived;
    }

    /**
     * <p>
     * Indicates whether this finding is archived.
     * </p>
     *
     * @return <p>
     *         Indicates whether this finding is archived.
     *         </p>
     */
    public Boolean getArchived() {
        return archived;
    }

    /**
     * <p>
     * Indicates whether this finding is archived.
     * </p>
     *
     * @param archived <p>
     *            Indicates whether this finding is archived.
     *            </p>
     */
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    /**
     * <p>
     * Indicates whether this finding is archived.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param archived <p>
     *            Indicates whether this finding is archived.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * <p>
     * The total count of the occurrences of this finding type.
     * </p>
     *
     * @return <p>
     *         The total count of the occurrences of this finding type.
     *         </p>
     */
    public Integer getCount() {
        return count;
    }

    /**
     * <p>
     * The total count of the occurrences of this finding type.
     * </p>
     *
     * @param count <p>
     *            The total count of the occurrences of this finding type.
     *            </p>
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The total count of the occurrences of this finding type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The total count of the occurrences of this finding type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * <p>
     * The detector ID for the GuardDuty service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The detector ID for the GuardDuty service.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The detector ID for the GuardDuty service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The detector ID for the GuardDuty service.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The detector ID for the GuardDuty service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The detector ID for the GuardDuty service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * The first-seen timestamp of the activity that prompted GuardDuty to
     * generate this finding.
     * </p>
     *
     * @return <p>
     *         The first-seen timestamp of the activity that prompted GuardDuty
     *         to generate this finding.
     *         </p>
     */
    public String getEventFirstSeen() {
        return eventFirstSeen;
    }

    /**
     * <p>
     * The first-seen timestamp of the activity that prompted GuardDuty to
     * generate this finding.
     * </p>
     *
     * @param eventFirstSeen <p>
     *            The first-seen timestamp of the activity that prompted
     *            GuardDuty to generate this finding.
     *            </p>
     */
    public void setEventFirstSeen(String eventFirstSeen) {
        this.eventFirstSeen = eventFirstSeen;
    }

    /**
     * <p>
     * The first-seen timestamp of the activity that prompted GuardDuty to
     * generate this finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventFirstSeen <p>
     *            The first-seen timestamp of the activity that prompted
     *            GuardDuty to generate this finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withEventFirstSeen(String eventFirstSeen) {
        this.eventFirstSeen = eventFirstSeen;
        return this;
    }

    /**
     * <p>
     * The last-seen timestamp of the activity that prompted GuardDuty to
     * generate this finding.
     * </p>
     *
     * @return <p>
     *         The last-seen timestamp of the activity that prompted GuardDuty
     *         to generate this finding.
     *         </p>
     */
    public String getEventLastSeen() {
        return eventLastSeen;
    }

    /**
     * <p>
     * The last-seen timestamp of the activity that prompted GuardDuty to
     * generate this finding.
     * </p>
     *
     * @param eventLastSeen <p>
     *            The last-seen timestamp of the activity that prompted
     *            GuardDuty to generate this finding.
     *            </p>
     */
    public void setEventLastSeen(String eventLastSeen) {
        this.eventLastSeen = eventLastSeen;
    }

    /**
     * <p>
     * The last-seen timestamp of the activity that prompted GuardDuty to
     * generate this finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventLastSeen <p>
     *            The last-seen timestamp of the activity that prompted
     *            GuardDuty to generate this finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withEventLastSeen(String eventLastSeen) {
        this.eventLastSeen = eventLastSeen;
        return this;
    }

    /**
     * <p>
     * The resource role information for this finding.
     * </p>
     *
     * @return <p>
     *         The resource role information for this finding.
     *         </p>
     */
    public String getResourceRole() {
        return resourceRole;
    }

    /**
     * <p>
     * The resource role information for this finding.
     * </p>
     *
     * @param resourceRole <p>
     *            The resource role information for this finding.
     *            </p>
     */
    public void setResourceRole(String resourceRole) {
        this.resourceRole = resourceRole;
    }

    /**
     * <p>
     * The resource role information for this finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceRole <p>
     *            The resource role information for this finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withResourceRole(String resourceRole) {
        this.resourceRole = resourceRole;
        return this;
    }

    /**
     * <p>
     * The name of the AWS service (GuardDuty) that generated a finding.
     * </p>
     *
     * @return <p>
     *         The name of the AWS service (GuardDuty) that generated a finding.
     *         </p>
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <p>
     * The name of the AWS service (GuardDuty) that generated a finding.
     * </p>
     *
     * @param serviceName <p>
     *            The name of the AWS service (GuardDuty) that generated a
     *            finding.
     *            </p>
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the AWS service (GuardDuty) that generated a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceName <p>
     *            The name of the AWS service (GuardDuty) that generated a
     *            finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * <p>
     * Feedback that was submitted about the finding.
     * </p>
     *
     * @return <p>
     *         Feedback that was submitted about the finding.
     *         </p>
     */
    public String getUserFeedback() {
        return userFeedback;
    }

    /**
     * <p>
     * Feedback that was submitted about the finding.
     * </p>
     *
     * @param userFeedback <p>
     *            Feedback that was submitted about the finding.
     *            </p>
     */
    public void setUserFeedback(String userFeedback) {
        this.userFeedback = userFeedback;
    }

    /**
     * <p>
     * Feedback that was submitted about the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userFeedback <p>
     *            Feedback that was submitted about the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withUserFeedback(String userFeedback) {
        this.userFeedback = userFeedback;
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
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getEvidence() != null)
            sb.append("Evidence: " + getEvidence() + ",");
        if (getArchived() != null)
            sb.append("Archived: " + getArchived() + ",");
        if (getCount() != null)
            sb.append("Count: " + getCount() + ",");
        if (getDetectorId() != null)
            sb.append("DetectorId: " + getDetectorId() + ",");
        if (getEventFirstSeen() != null)
            sb.append("EventFirstSeen: " + getEventFirstSeen() + ",");
        if (getEventLastSeen() != null)
            sb.append("EventLastSeen: " + getEventLastSeen() + ",");
        if (getResourceRole() != null)
            sb.append("ResourceRole: " + getResourceRole() + ",");
        if (getServiceName() != null)
            sb.append("ServiceName: " + getServiceName() + ",");
        if (getUserFeedback() != null)
            sb.append("UserFeedback: " + getUserFeedback());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getEvidence() == null) ? 0 : getEvidence().hashCode());
        hashCode = prime * hashCode + ((getArchived() == null) ? 0 : getArchived().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode
                + ((getEventFirstSeen() == null) ? 0 : getEventFirstSeen().hashCode());
        hashCode = prime * hashCode
                + ((getEventLastSeen() == null) ? 0 : getEventLastSeen().hashCode());
        hashCode = prime * hashCode
                + ((getResourceRole() == null) ? 0 : getResourceRole().hashCode());
        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode
                + ((getUserFeedback() == null) ? 0 : getUserFeedback().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Service == false)
            return false;
        Service other = (Service) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getEvidence() == null ^ this.getEvidence() == null)
            return false;
        if (other.getEvidence() != null && other.getEvidence().equals(this.getEvidence()) == false)
            return false;
        if (other.getArchived() == null ^ this.getArchived() == null)
            return false;
        if (other.getArchived() != null && other.getArchived().equals(this.getArchived()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getEventFirstSeen() == null ^ this.getEventFirstSeen() == null)
            return false;
        if (other.getEventFirstSeen() != null
                && other.getEventFirstSeen().equals(this.getEventFirstSeen()) == false)
            return false;
        if (other.getEventLastSeen() == null ^ this.getEventLastSeen() == null)
            return false;
        if (other.getEventLastSeen() != null
                && other.getEventLastSeen().equals(this.getEventLastSeen()) == false)
            return false;
        if (other.getResourceRole() == null ^ this.getResourceRole() == null)
            return false;
        if (other.getResourceRole() != null
                && other.getResourceRole().equals(this.getResourceRole()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getUserFeedback() == null ^ this.getUserFeedback() == null)
            return false;
        if (other.getUserFeedback() != null
                && other.getUserFeedback().equals(this.getUserFeedback()) == false)
            return false;
        return true;
    }
}
