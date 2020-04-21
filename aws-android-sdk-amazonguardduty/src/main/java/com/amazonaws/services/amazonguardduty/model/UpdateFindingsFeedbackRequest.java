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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Marks the specified GuardDuty findings as useful or not useful.
 * </p>
 */
public class UpdateFindingsFeedbackRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the detector associated with the findings to update feedback
     * for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * The IDs of the findings that you want to mark as useful or not useful.
     * </p>
     */
    private java.util.List<String> findingIds;

    /**
     * <p>
     * The feedback for the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USEFUL, NOT_USEFUL
     */
    private String feedback;

    /**
     * <p>
     * Additional feedback about the GuardDuty findings.
     * </p>
     */
    private String comments;

    /**
     * <p>
     * The ID of the detector associated with the findings to update feedback
     * for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The ID of the detector associated with the findings to update
     *         feedback for.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The ID of the detector associated with the findings to update feedback
     * for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The ID of the detector associated with the findings to update
     *            feedback for.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the detector associated with the findings to update feedback
     * for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The ID of the detector associated with the findings to update
     *            feedback for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFindingsFeedbackRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * The IDs of the findings that you want to mark as useful or not useful.
     * </p>
     *
     * @return <p>
     *         The IDs of the findings that you want to mark as useful or not
     *         useful.
     *         </p>
     */
    public java.util.List<String> getFindingIds() {
        return findingIds;
    }

    /**
     * <p>
     * The IDs of the findings that you want to mark as useful or not useful.
     * </p>
     *
     * @param findingIds <p>
     *            The IDs of the findings that you want to mark as useful or not
     *            useful.
     *            </p>
     */
    public void setFindingIds(java.util.Collection<String> findingIds) {
        if (findingIds == null) {
            this.findingIds = null;
            return;
        }

        this.findingIds = new java.util.ArrayList<String>(findingIds);
    }

    /**
     * <p>
     * The IDs of the findings that you want to mark as useful or not useful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingIds <p>
     *            The IDs of the findings that you want to mark as useful or not
     *            useful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFindingsFeedbackRequest withFindingIds(String... findingIds) {
        if (getFindingIds() == null) {
            this.findingIds = new java.util.ArrayList<String>(findingIds.length);
        }
        for (String value : findingIds) {
            this.findingIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the findings that you want to mark as useful or not useful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingIds <p>
     *            The IDs of the findings that you want to mark as useful or not
     *            useful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFindingsFeedbackRequest withFindingIds(java.util.Collection<String> findingIds) {
        setFindingIds(findingIds);
        return this;
    }

    /**
     * <p>
     * The feedback for the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USEFUL, NOT_USEFUL
     *
     * @return <p>
     *         The feedback for the finding.
     *         </p>
     * @see Feedback
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * <p>
     * The feedback for the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USEFUL, NOT_USEFUL
     *
     * @param feedback <p>
     *            The feedback for the finding.
     *            </p>
     * @see Feedback
     */
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    /**
     * <p>
     * The feedback for the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USEFUL, NOT_USEFUL
     *
     * @param feedback <p>
     *            The feedback for the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Feedback
     */
    public UpdateFindingsFeedbackRequest withFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }

    /**
     * <p>
     * The feedback for the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USEFUL, NOT_USEFUL
     *
     * @param feedback <p>
     *            The feedback for the finding.
     *            </p>
     * @see Feedback
     */
    public void setFeedback(Feedback feedback) {
        this.feedback = feedback.toString();
    }

    /**
     * <p>
     * The feedback for the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USEFUL, NOT_USEFUL
     *
     * @param feedback <p>
     *            The feedback for the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Feedback
     */
    public UpdateFindingsFeedbackRequest withFeedback(Feedback feedback) {
        this.feedback = feedback.toString();
        return this;
    }

    /**
     * <p>
     * Additional feedback about the GuardDuty findings.
     * </p>
     *
     * @return <p>
     *         Additional feedback about the GuardDuty findings.
     *         </p>
     */
    public String getComments() {
        return comments;
    }

    /**
     * <p>
     * Additional feedback about the GuardDuty findings.
     * </p>
     *
     * @param comments <p>
     *            Additional feedback about the GuardDuty findings.
     *            </p>
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * <p>
     * Additional feedback about the GuardDuty findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comments <p>
     *            Additional feedback about the GuardDuty findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFindingsFeedbackRequest withComments(String comments) {
        this.comments = comments;
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
        if (getDetectorId() != null)
            sb.append("DetectorId: " + getDetectorId() + ",");
        if (getFindingIds() != null)
            sb.append("FindingIds: " + getFindingIds() + ",");
        if (getFeedback() != null)
            sb.append("Feedback: " + getFeedback() + ",");
        if (getComments() != null)
            sb.append("Comments: " + getComments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getFindingIds() == null) ? 0 : getFindingIds().hashCode());
        hashCode = prime * hashCode + ((getFeedback() == null) ? 0 : getFeedback().hashCode());
        hashCode = prime * hashCode + ((getComments() == null) ? 0 : getComments().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFindingsFeedbackRequest == false)
            return false;
        UpdateFindingsFeedbackRequest other = (UpdateFindingsFeedbackRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getFindingIds() == null ^ this.getFindingIds() == null)
            return false;
        if (other.getFindingIds() != null
                && other.getFindingIds().equals(this.getFindingIds()) == false)
            return false;
        if (other.getFeedback() == null ^ this.getFeedback() == null)
            return false;
        if (other.getFeedback() != null && other.getFeedback().equals(this.getFeedback()) == false)
            return false;
        if (other.getComments() == null ^ this.getComments() == null)
            return false;
        if (other.getComments() != null && other.getComments().equals(this.getComments()) == false)
            return false;
        return true;
    }
}
