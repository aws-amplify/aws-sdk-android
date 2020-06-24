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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * Returns information about a pull request event.
 * </p>
 */
public class PullRequestEvent implements Serializable {
    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     */
    private String pullRequestId;

    /**
     * <p>
     * The day and time of the pull request event, in timestamp format.
     * </p>
     */
    private java.util.Date eventDate;

    /**
     * <p>
     * The type of the pull request event (for example, a status change event
     * (PULL_REQUEST_STATUS_CHANGED) or update event
     * (PULL_REQUEST_SOURCE_REFERENCE_UPDATED)).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PULL_REQUEST_CREATED, PULL_REQUEST_STATUS_CHANGED,
     * PULL_REQUEST_SOURCE_REFERENCE_UPDATED, PULL_REQUEST_MERGE_STATE_CHANGED,
     * PULL_REQUEST_APPROVAL_RULE_CREATED, PULL_REQUEST_APPROVAL_RULE_UPDATED,
     * PULL_REQUEST_APPROVAL_RULE_DELETED,
     * PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN,
     * PULL_REQUEST_APPROVAL_STATE_CHANGED
     */
    private String pullRequestEventType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose actions resulted in the
     * event. Examples include updating the pull request with more commits or
     * changing the status of a pull request.
     * </p>
     */
    private String actorArn;

    /**
     * <p>
     * Information about the source and destination branches for the pull
     * request.
     * </p>
     */
    private PullRequestCreatedEventMetadata pullRequestCreatedEventMetadata;

    /**
     * <p>
     * Information about the change in status for the pull request event.
     * </p>
     */
    private PullRequestStatusChangedEventMetadata pullRequestStatusChangedEventMetadata;

    /**
     * <p>
     * Information about the updated source branch for the pull request event.
     * </p>
     */
    private PullRequestSourceReferenceUpdatedEventMetadata pullRequestSourceReferenceUpdatedEventMetadata;

    /**
     * <p>
     * Information about the change in mergability state for the pull request
     * event.
     * </p>
     */
    private PullRequestMergedStateChangedEventMetadata pullRequestMergedStateChangedEventMetadata;

    /**
     * <p>
     * Information about a pull request event.
     * </p>
     */
    private ApprovalRuleEventMetadata approvalRuleEventMetadata;

    /**
     * <p>
     * Information about an approval state change for a pull request.
     * </p>
     */
    private ApprovalStateChangedEventMetadata approvalStateChangedEventMetadata;

    /**
     * <p>
     * Information about an approval rule override event for a pull request.
     * </p>
     */
    private ApprovalRuleOverriddenEventMetadata approvalRuleOverriddenEventMetadata;

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     *
     * @return <p>
     *         The system-generated ID of the pull request.
     *         </p>
     */
    public String getPullRequestId() {
        return pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     *
     * @param pullRequestId <p>
     *            The system-generated ID of the pull request.
     *            </p>
     */
    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestId <p>
     *            The system-generated ID of the pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestEvent withPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }

    /**
     * <p>
     * The day and time of the pull request event, in timestamp format.
     * </p>
     *
     * @return <p>
     *         The day and time of the pull request event, in timestamp format.
     *         </p>
     */
    public java.util.Date getEventDate() {
        return eventDate;
    }

    /**
     * <p>
     * The day and time of the pull request event, in timestamp format.
     * </p>
     *
     * @param eventDate <p>
     *            The day and time of the pull request event, in timestamp
     *            format.
     *            </p>
     */
    public void setEventDate(java.util.Date eventDate) {
        this.eventDate = eventDate;
    }

    /**
     * <p>
     * The day and time of the pull request event, in timestamp format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventDate <p>
     *            The day and time of the pull request event, in timestamp
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestEvent withEventDate(java.util.Date eventDate) {
        this.eventDate = eventDate;
        return this;
    }

    /**
     * <p>
     * The type of the pull request event (for example, a status change event
     * (PULL_REQUEST_STATUS_CHANGED) or update event
     * (PULL_REQUEST_SOURCE_REFERENCE_UPDATED)).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PULL_REQUEST_CREATED, PULL_REQUEST_STATUS_CHANGED,
     * PULL_REQUEST_SOURCE_REFERENCE_UPDATED, PULL_REQUEST_MERGE_STATE_CHANGED,
     * PULL_REQUEST_APPROVAL_RULE_CREATED, PULL_REQUEST_APPROVAL_RULE_UPDATED,
     * PULL_REQUEST_APPROVAL_RULE_DELETED,
     * PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN,
     * PULL_REQUEST_APPROVAL_STATE_CHANGED
     *
     * @return <p>
     *         The type of the pull request event (for example, a status change
     *         event (PULL_REQUEST_STATUS_CHANGED) or update event
     *         (PULL_REQUEST_SOURCE_REFERENCE_UPDATED)).
     *         </p>
     * @see PullRequestEventType
     */
    public String getPullRequestEventType() {
        return pullRequestEventType;
    }

    /**
     * <p>
     * The type of the pull request event (for example, a status change event
     * (PULL_REQUEST_STATUS_CHANGED) or update event
     * (PULL_REQUEST_SOURCE_REFERENCE_UPDATED)).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PULL_REQUEST_CREATED, PULL_REQUEST_STATUS_CHANGED,
     * PULL_REQUEST_SOURCE_REFERENCE_UPDATED, PULL_REQUEST_MERGE_STATE_CHANGED,
     * PULL_REQUEST_APPROVAL_RULE_CREATED, PULL_REQUEST_APPROVAL_RULE_UPDATED,
     * PULL_REQUEST_APPROVAL_RULE_DELETED,
     * PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN,
     * PULL_REQUEST_APPROVAL_STATE_CHANGED
     *
     * @param pullRequestEventType <p>
     *            The type of the pull request event (for example, a status
     *            change event (PULL_REQUEST_STATUS_CHANGED) or update event
     *            (PULL_REQUEST_SOURCE_REFERENCE_UPDATED)).
     *            </p>
     * @see PullRequestEventType
     */
    public void setPullRequestEventType(String pullRequestEventType) {
        this.pullRequestEventType = pullRequestEventType;
    }

    /**
     * <p>
     * The type of the pull request event (for example, a status change event
     * (PULL_REQUEST_STATUS_CHANGED) or update event
     * (PULL_REQUEST_SOURCE_REFERENCE_UPDATED)).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PULL_REQUEST_CREATED, PULL_REQUEST_STATUS_CHANGED,
     * PULL_REQUEST_SOURCE_REFERENCE_UPDATED, PULL_REQUEST_MERGE_STATE_CHANGED,
     * PULL_REQUEST_APPROVAL_RULE_CREATED, PULL_REQUEST_APPROVAL_RULE_UPDATED,
     * PULL_REQUEST_APPROVAL_RULE_DELETED,
     * PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN,
     * PULL_REQUEST_APPROVAL_STATE_CHANGED
     *
     * @param pullRequestEventType <p>
     *            The type of the pull request event (for example, a status
     *            change event (PULL_REQUEST_STATUS_CHANGED) or update event
     *            (PULL_REQUEST_SOURCE_REFERENCE_UPDATED)).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PullRequestEventType
     */
    public PullRequestEvent withPullRequestEventType(String pullRequestEventType) {
        this.pullRequestEventType = pullRequestEventType;
        return this;
    }

    /**
     * <p>
     * The type of the pull request event (for example, a status change event
     * (PULL_REQUEST_STATUS_CHANGED) or update event
     * (PULL_REQUEST_SOURCE_REFERENCE_UPDATED)).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PULL_REQUEST_CREATED, PULL_REQUEST_STATUS_CHANGED,
     * PULL_REQUEST_SOURCE_REFERENCE_UPDATED, PULL_REQUEST_MERGE_STATE_CHANGED,
     * PULL_REQUEST_APPROVAL_RULE_CREATED, PULL_REQUEST_APPROVAL_RULE_UPDATED,
     * PULL_REQUEST_APPROVAL_RULE_DELETED,
     * PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN,
     * PULL_REQUEST_APPROVAL_STATE_CHANGED
     *
     * @param pullRequestEventType <p>
     *            The type of the pull request event (for example, a status
     *            change event (PULL_REQUEST_STATUS_CHANGED) or update event
     *            (PULL_REQUEST_SOURCE_REFERENCE_UPDATED)).
     *            </p>
     * @see PullRequestEventType
     */
    public void setPullRequestEventType(PullRequestEventType pullRequestEventType) {
        this.pullRequestEventType = pullRequestEventType.toString();
    }

    /**
     * <p>
     * The type of the pull request event (for example, a status change event
     * (PULL_REQUEST_STATUS_CHANGED) or update event
     * (PULL_REQUEST_SOURCE_REFERENCE_UPDATED)).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PULL_REQUEST_CREATED, PULL_REQUEST_STATUS_CHANGED,
     * PULL_REQUEST_SOURCE_REFERENCE_UPDATED, PULL_REQUEST_MERGE_STATE_CHANGED,
     * PULL_REQUEST_APPROVAL_RULE_CREATED, PULL_REQUEST_APPROVAL_RULE_UPDATED,
     * PULL_REQUEST_APPROVAL_RULE_DELETED,
     * PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN,
     * PULL_REQUEST_APPROVAL_STATE_CHANGED
     *
     * @param pullRequestEventType <p>
     *            The type of the pull request event (for example, a status
     *            change event (PULL_REQUEST_STATUS_CHANGED) or update event
     *            (PULL_REQUEST_SOURCE_REFERENCE_UPDATED)).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PullRequestEventType
     */
    public PullRequestEvent withPullRequestEventType(PullRequestEventType pullRequestEventType) {
        this.pullRequestEventType = pullRequestEventType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose actions resulted in the
     * event. Examples include updating the pull request with more commits or
     * changing the status of a pull request.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the user whose actions resulted
     *         in the event. Examples include updating the pull request with
     *         more commits or changing the status of a pull request.
     *         </p>
     */
    public String getActorArn() {
        return actorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose actions resulted in the
     * event. Examples include updating the pull request with more commits or
     * changing the status of a pull request.
     * </p>
     *
     * @param actorArn <p>
     *            The Amazon Resource Name (ARN) of the user whose actions
     *            resulted in the event. Examples include updating the pull
     *            request with more commits or changing the status of a pull
     *            request.
     *            </p>
     */
    public void setActorArn(String actorArn) {
        this.actorArn = actorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose actions resulted in the
     * event. Examples include updating the pull request with more commits or
     * changing the status of a pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actorArn <p>
     *            The Amazon Resource Name (ARN) of the user whose actions
     *            resulted in the event. Examples include updating the pull
     *            request with more commits or changing the status of a pull
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestEvent withActorArn(String actorArn) {
        this.actorArn = actorArn;
        return this;
    }

    /**
     * <p>
     * Information about the source and destination branches for the pull
     * request.
     * </p>
     *
     * @return <p>
     *         Information about the source and destination branches for the
     *         pull request.
     *         </p>
     */
    public PullRequestCreatedEventMetadata getPullRequestCreatedEventMetadata() {
        return pullRequestCreatedEventMetadata;
    }

    /**
     * <p>
     * Information about the source and destination branches for the pull
     * request.
     * </p>
     *
     * @param pullRequestCreatedEventMetadata <p>
     *            Information about the source and destination branches for the
     *            pull request.
     *            </p>
     */
    public void setPullRequestCreatedEventMetadata(
            PullRequestCreatedEventMetadata pullRequestCreatedEventMetadata) {
        this.pullRequestCreatedEventMetadata = pullRequestCreatedEventMetadata;
    }

    /**
     * <p>
     * Information about the source and destination branches for the pull
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestCreatedEventMetadata <p>
     *            Information about the source and destination branches for the
     *            pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestEvent withPullRequestCreatedEventMetadata(
            PullRequestCreatedEventMetadata pullRequestCreatedEventMetadata) {
        this.pullRequestCreatedEventMetadata = pullRequestCreatedEventMetadata;
        return this;
    }

    /**
     * <p>
     * Information about the change in status for the pull request event.
     * </p>
     *
     * @return <p>
     *         Information about the change in status for the pull request
     *         event.
     *         </p>
     */
    public PullRequestStatusChangedEventMetadata getPullRequestStatusChangedEventMetadata() {
        return pullRequestStatusChangedEventMetadata;
    }

    /**
     * <p>
     * Information about the change in status for the pull request event.
     * </p>
     *
     * @param pullRequestStatusChangedEventMetadata <p>
     *            Information about the change in status for the pull request
     *            event.
     *            </p>
     */
    public void setPullRequestStatusChangedEventMetadata(
            PullRequestStatusChangedEventMetadata pullRequestStatusChangedEventMetadata) {
        this.pullRequestStatusChangedEventMetadata = pullRequestStatusChangedEventMetadata;
    }

    /**
     * <p>
     * Information about the change in status for the pull request event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestStatusChangedEventMetadata <p>
     *            Information about the change in status for the pull request
     *            event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestEvent withPullRequestStatusChangedEventMetadata(
            PullRequestStatusChangedEventMetadata pullRequestStatusChangedEventMetadata) {
        this.pullRequestStatusChangedEventMetadata = pullRequestStatusChangedEventMetadata;
        return this;
    }

    /**
     * <p>
     * Information about the updated source branch for the pull request event.
     * </p>
     *
     * @return <p>
     *         Information about the updated source branch for the pull request
     *         event.
     *         </p>
     */
    public PullRequestSourceReferenceUpdatedEventMetadata getPullRequestSourceReferenceUpdatedEventMetadata() {
        return pullRequestSourceReferenceUpdatedEventMetadata;
    }

    /**
     * <p>
     * Information about the updated source branch for the pull request event.
     * </p>
     *
     * @param pullRequestSourceReferenceUpdatedEventMetadata <p>
     *            Information about the updated source branch for the pull
     *            request event.
     *            </p>
     */
    public void setPullRequestSourceReferenceUpdatedEventMetadata(
            PullRequestSourceReferenceUpdatedEventMetadata pullRequestSourceReferenceUpdatedEventMetadata) {
        this.pullRequestSourceReferenceUpdatedEventMetadata = pullRequestSourceReferenceUpdatedEventMetadata;
    }

    /**
     * <p>
     * Information about the updated source branch for the pull request event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestSourceReferenceUpdatedEventMetadata <p>
     *            Information about the updated source branch for the pull
     *            request event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestEvent withPullRequestSourceReferenceUpdatedEventMetadata(
            PullRequestSourceReferenceUpdatedEventMetadata pullRequestSourceReferenceUpdatedEventMetadata) {
        this.pullRequestSourceReferenceUpdatedEventMetadata = pullRequestSourceReferenceUpdatedEventMetadata;
        return this;
    }

    /**
     * <p>
     * Information about the change in mergability state for the pull request
     * event.
     * </p>
     *
     * @return <p>
     *         Information about the change in mergability state for the pull
     *         request event.
     *         </p>
     */
    public PullRequestMergedStateChangedEventMetadata getPullRequestMergedStateChangedEventMetadata() {
        return pullRequestMergedStateChangedEventMetadata;
    }

    /**
     * <p>
     * Information about the change in mergability state for the pull request
     * event.
     * </p>
     *
     * @param pullRequestMergedStateChangedEventMetadata <p>
     *            Information about the change in mergability state for the pull
     *            request event.
     *            </p>
     */
    public void setPullRequestMergedStateChangedEventMetadata(
            PullRequestMergedStateChangedEventMetadata pullRequestMergedStateChangedEventMetadata) {
        this.pullRequestMergedStateChangedEventMetadata = pullRequestMergedStateChangedEventMetadata;
    }

    /**
     * <p>
     * Information about the change in mergability state for the pull request
     * event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullRequestMergedStateChangedEventMetadata <p>
     *            Information about the change in mergability state for the pull
     *            request event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestEvent withPullRequestMergedStateChangedEventMetadata(
            PullRequestMergedStateChangedEventMetadata pullRequestMergedStateChangedEventMetadata) {
        this.pullRequestMergedStateChangedEventMetadata = pullRequestMergedStateChangedEventMetadata;
        return this;
    }

    /**
     * <p>
     * Information about a pull request event.
     * </p>
     *
     * @return <p>
     *         Information about a pull request event.
     *         </p>
     */
    public ApprovalRuleEventMetadata getApprovalRuleEventMetadata() {
        return approvalRuleEventMetadata;
    }

    /**
     * <p>
     * Information about a pull request event.
     * </p>
     *
     * @param approvalRuleEventMetadata <p>
     *            Information about a pull request event.
     *            </p>
     */
    public void setApprovalRuleEventMetadata(ApprovalRuleEventMetadata approvalRuleEventMetadata) {
        this.approvalRuleEventMetadata = approvalRuleEventMetadata;
    }

    /**
     * <p>
     * Information about a pull request event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRuleEventMetadata <p>
     *            Information about a pull request event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestEvent withApprovalRuleEventMetadata(
            ApprovalRuleEventMetadata approvalRuleEventMetadata) {
        this.approvalRuleEventMetadata = approvalRuleEventMetadata;
        return this;
    }

    /**
     * <p>
     * Information about an approval state change for a pull request.
     * </p>
     *
     * @return <p>
     *         Information about an approval state change for a pull request.
     *         </p>
     */
    public ApprovalStateChangedEventMetadata getApprovalStateChangedEventMetadata() {
        return approvalStateChangedEventMetadata;
    }

    /**
     * <p>
     * Information about an approval state change for a pull request.
     * </p>
     *
     * @param approvalStateChangedEventMetadata <p>
     *            Information about an approval state change for a pull request.
     *            </p>
     */
    public void setApprovalStateChangedEventMetadata(
            ApprovalStateChangedEventMetadata approvalStateChangedEventMetadata) {
        this.approvalStateChangedEventMetadata = approvalStateChangedEventMetadata;
    }

    /**
     * <p>
     * Information about an approval state change for a pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalStateChangedEventMetadata <p>
     *            Information about an approval state change for a pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestEvent withApprovalStateChangedEventMetadata(
            ApprovalStateChangedEventMetadata approvalStateChangedEventMetadata) {
        this.approvalStateChangedEventMetadata = approvalStateChangedEventMetadata;
        return this;
    }

    /**
     * <p>
     * Information about an approval rule override event for a pull request.
     * </p>
     *
     * @return <p>
     *         Information about an approval rule override event for a pull
     *         request.
     *         </p>
     */
    public ApprovalRuleOverriddenEventMetadata getApprovalRuleOverriddenEventMetadata() {
        return approvalRuleOverriddenEventMetadata;
    }

    /**
     * <p>
     * Information about an approval rule override event for a pull request.
     * </p>
     *
     * @param approvalRuleOverriddenEventMetadata <p>
     *            Information about an approval rule override event for a pull
     *            request.
     *            </p>
     */
    public void setApprovalRuleOverriddenEventMetadata(
            ApprovalRuleOverriddenEventMetadata approvalRuleOverriddenEventMetadata) {
        this.approvalRuleOverriddenEventMetadata = approvalRuleOverriddenEventMetadata;
    }

    /**
     * <p>
     * Information about an approval rule override event for a pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRuleOverriddenEventMetadata <p>
     *            Information about an approval rule override event for a pull
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PullRequestEvent withApprovalRuleOverriddenEventMetadata(
            ApprovalRuleOverriddenEventMetadata approvalRuleOverriddenEventMetadata) {
        this.approvalRuleOverriddenEventMetadata = approvalRuleOverriddenEventMetadata;
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
        if (getPullRequestId() != null)
            sb.append("pullRequestId: " + getPullRequestId() + ",");
        if (getEventDate() != null)
            sb.append("eventDate: " + getEventDate() + ",");
        if (getPullRequestEventType() != null)
            sb.append("pullRequestEventType: " + getPullRequestEventType() + ",");
        if (getActorArn() != null)
            sb.append("actorArn: " + getActorArn() + ",");
        if (getPullRequestCreatedEventMetadata() != null)
            sb.append("pullRequestCreatedEventMetadata: " + getPullRequestCreatedEventMetadata()
                    + ",");
        if (getPullRequestStatusChangedEventMetadata() != null)
            sb.append("pullRequestStatusChangedEventMetadata: "
                    + getPullRequestStatusChangedEventMetadata() + ",");
        if (getPullRequestSourceReferenceUpdatedEventMetadata() != null)
            sb.append("pullRequestSourceReferenceUpdatedEventMetadata: "
                    + getPullRequestSourceReferenceUpdatedEventMetadata() + ",");
        if (getPullRequestMergedStateChangedEventMetadata() != null)
            sb.append("pullRequestMergedStateChangedEventMetadata: "
                    + getPullRequestMergedStateChangedEventMetadata() + ",");
        if (getApprovalRuleEventMetadata() != null)
            sb.append("approvalRuleEventMetadata: " + getApprovalRuleEventMetadata() + ",");
        if (getApprovalStateChangedEventMetadata() != null)
            sb.append("approvalStateChangedEventMetadata: "
                    + getApprovalStateChangedEventMetadata() + ",");
        if (getApprovalRuleOverriddenEventMetadata() != null)
            sb.append("approvalRuleOverriddenEventMetadata: "
                    + getApprovalRuleOverriddenEventMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getEventDate() == null) ? 0 : getEventDate().hashCode());
        hashCode = prime * hashCode
                + ((getPullRequestEventType() == null) ? 0 : getPullRequestEventType().hashCode());
        hashCode = prime * hashCode + ((getActorArn() == null) ? 0 : getActorArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getPullRequestCreatedEventMetadata() == null) ? 0
                        : getPullRequestCreatedEventMetadata().hashCode());
        hashCode = prime
                * hashCode
                + ((getPullRequestStatusChangedEventMetadata() == null) ? 0
                        : getPullRequestStatusChangedEventMetadata().hashCode());
        hashCode = prime
                * hashCode
                + ((getPullRequestSourceReferenceUpdatedEventMetadata() == null) ? 0
                        : getPullRequestSourceReferenceUpdatedEventMetadata().hashCode());
        hashCode = prime
                * hashCode
                + ((getPullRequestMergedStateChangedEventMetadata() == null) ? 0
                        : getPullRequestMergedStateChangedEventMetadata().hashCode());
        hashCode = prime
                * hashCode
                + ((getApprovalRuleEventMetadata() == null) ? 0 : getApprovalRuleEventMetadata()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getApprovalStateChangedEventMetadata() == null) ? 0
                        : getApprovalStateChangedEventMetadata().hashCode());
        hashCode = prime
                * hashCode
                + ((getApprovalRuleOverriddenEventMetadata() == null) ? 0
                        : getApprovalRuleOverriddenEventMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PullRequestEvent == false)
            return false;
        PullRequestEvent other = (PullRequestEvent) obj;

        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null
                && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getEventDate() == null ^ this.getEventDate() == null)
            return false;
        if (other.getEventDate() != null
                && other.getEventDate().equals(this.getEventDate()) == false)
            return false;
        if (other.getPullRequestEventType() == null ^ this.getPullRequestEventType() == null)
            return false;
        if (other.getPullRequestEventType() != null
                && other.getPullRequestEventType().equals(this.getPullRequestEventType()) == false)
            return false;
        if (other.getActorArn() == null ^ this.getActorArn() == null)
            return false;
        if (other.getActorArn() != null && other.getActorArn().equals(this.getActorArn()) == false)
            return false;
        if (other.getPullRequestCreatedEventMetadata() == null
                ^ this.getPullRequestCreatedEventMetadata() == null)
            return false;
        if (other.getPullRequestCreatedEventMetadata() != null
                && other.getPullRequestCreatedEventMetadata().equals(
                        this.getPullRequestCreatedEventMetadata()) == false)
            return false;
        if (other.getPullRequestStatusChangedEventMetadata() == null
                ^ this.getPullRequestStatusChangedEventMetadata() == null)
            return false;
        if (other.getPullRequestStatusChangedEventMetadata() != null
                && other.getPullRequestStatusChangedEventMetadata().equals(
                        this.getPullRequestStatusChangedEventMetadata()) == false)
            return false;
        if (other.getPullRequestSourceReferenceUpdatedEventMetadata() == null
                ^ this.getPullRequestSourceReferenceUpdatedEventMetadata() == null)
            return false;
        if (other.getPullRequestSourceReferenceUpdatedEventMetadata() != null
                && other.getPullRequestSourceReferenceUpdatedEventMetadata().equals(
                        this.getPullRequestSourceReferenceUpdatedEventMetadata()) == false)
            return false;
        if (other.getPullRequestMergedStateChangedEventMetadata() == null
                ^ this.getPullRequestMergedStateChangedEventMetadata() == null)
            return false;
        if (other.getPullRequestMergedStateChangedEventMetadata() != null
                && other.getPullRequestMergedStateChangedEventMetadata().equals(
                        this.getPullRequestMergedStateChangedEventMetadata()) == false)
            return false;
        if (other.getApprovalRuleEventMetadata() == null
                ^ this.getApprovalRuleEventMetadata() == null)
            return false;
        if (other.getApprovalRuleEventMetadata() != null
                && other.getApprovalRuleEventMetadata().equals(this.getApprovalRuleEventMetadata()) == false)
            return false;
        if (other.getApprovalStateChangedEventMetadata() == null
                ^ this.getApprovalStateChangedEventMetadata() == null)
            return false;
        if (other.getApprovalStateChangedEventMetadata() != null
                && other.getApprovalStateChangedEventMetadata().equals(
                        this.getApprovalStateChangedEventMetadata()) == false)
            return false;
        if (other.getApprovalRuleOverriddenEventMetadata() == null
                ^ this.getApprovalRuleOverriddenEventMetadata() == null)
            return false;
        if (other.getApprovalRuleOverriddenEventMetadata() != null
                && other.getApprovalRuleOverriddenEventMetadata().equals(
                        this.getApprovalRuleOverriddenEventMetadata()) == false)
            return false;
        return true;
    }
}
