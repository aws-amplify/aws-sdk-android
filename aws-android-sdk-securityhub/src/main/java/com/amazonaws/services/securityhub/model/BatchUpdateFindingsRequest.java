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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Used by Security Hub customers to update information about their
 * investigation into a finding. Requested by master accounts or member
 * accounts. Master accounts can update findings for their account and their
 * member accounts. Member accounts can update findings for their account.
 * </p>
 * <p>
 * Updates from <code>BatchUpdateFindings</code> do not affect the value of
 * <code>UpdatedAt</code> for a finding.
 * </p>
 * <p>
 * Master accounts can use <code>BatchUpdateFindings</code> to update the
 * following finding fields and objects.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Confidence</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Criticality</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Note</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RelatedFindings</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Severity</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Types</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UserDefinedFields</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>VerificationState</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Workflow</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * Member accounts can only use <code>BatchUpdateFindings</code> to update the
 * Note object.
 * </p>
 */
public class BatchUpdateFindingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The list of findings to update. <code>BatchUpdateFindings</code> can be
     * used to update up to 100 findings at a time.
     * </p>
     * <p>
     * For each finding, the list provides the finding identifier and the ARN of
     * the finding provider.
     * </p>
     */
    private java.util.List<AwsSecurityFindingIdentifier> findingIdentifiers;

    /**
     * <p>
     * The updated note.
     * </p>
     */
    private NoteUpdate note;

    /**
     * <p>
     * Used to update the finding severity.
     * </p>
     */
    private SeverityUpdate severity;

    /**
     * <p>
     * Indicates the veracity of a finding.
     * </p>
     * <p>
     * The available values for <code>VerificationState</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNKNOWN</code> – The default disposition of a security finding
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUE_POSITIVE</code> – The security finding is confirmed
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FALSE_POSITIVE</code> – The security finding was determined to be a
     * false alarm
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BENIGN_POSITIVE</code> – A special case of
     * <code>TRUE_POSITIVE</code> where the finding doesn't pose any threat, is
     * expected, or both
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNKNOWN, TRUE_POSITIVE, FALSE_POSITIVE,
     * BENIGN_POSITIVE
     */
    private String verificationState;

    /**
     * <p>
     * The updated value for the finding confidence. Confidence is defined as
     * the likelihood that a finding accurately identifies the behavior or issue
     * that it was intended to identify.
     * </p>
     * <p>
     * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means
     * zero percent confidence and 100 means 100 percent confidence.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer confidence;

    /**
     * <p>
     * The updated value for the level of importance assigned to the resources
     * associated with the findings.
     * </p>
     * <p>
     * A score of 0 means that the underlying resources have no criticality, and
     * a score of 100 is reserved for the most critical resources.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer criticality;

    /**
     * <p>
     * One or more finding types in the format of namespace/category/classifier
     * that classify a finding.
     * </p>
     * <p>
     * Valid namespace values are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Software and Configuration Checks
     * </p>
     * </li>
     * <li>
     * <p>
     * TTPs
     * </p>
     * </li>
     * <li>
     * <p>
     * Effects
     * </p>
     * </li>
     * <li>
     * <p>
     * Unusual Behaviors
     * </p>
     * </li>
     * <li>
     * <p>
     * Sensitive Data Identifications
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> types;

    /**
     * <p>
     * A list of name/value string pairs associated with the finding. These are
     * custom, user-defined fields added to a finding.
     * </p>
     */
    private java.util.Map<String, String> userDefinedFields;

    /**
     * <p>
     * Used to update the workflow status of a finding.
     * </p>
     * <p>
     * The workflow status indicates the progress of the investigation into the
     * finding.
     * </p>
     */
    private WorkflowUpdate workflow;

    /**
     * <p>
     * A list of findings that are related to the updated findings.
     * </p>
     */
    private java.util.List<RelatedFinding> relatedFindings;

    /**
     * <p>
     * The list of findings to update. <code>BatchUpdateFindings</code> can be
     * used to update up to 100 findings at a time.
     * </p>
     * <p>
     * For each finding, the list provides the finding identifier and the ARN of
     * the finding provider.
     * </p>
     *
     * @return <p>
     *         The list of findings to update. <code>BatchUpdateFindings</code>
     *         can be used to update up to 100 findings at a time.
     *         </p>
     *         <p>
     *         For each finding, the list provides the finding identifier and
     *         the ARN of the finding provider.
     *         </p>
     */
    public java.util.List<AwsSecurityFindingIdentifier> getFindingIdentifiers() {
        return findingIdentifiers;
    }

    /**
     * <p>
     * The list of findings to update. <code>BatchUpdateFindings</code> can be
     * used to update up to 100 findings at a time.
     * </p>
     * <p>
     * For each finding, the list provides the finding identifier and the ARN of
     * the finding provider.
     * </p>
     *
     * @param findingIdentifiers <p>
     *            The list of findings to update.
     *            <code>BatchUpdateFindings</code> can be used to update up to
     *            100 findings at a time.
     *            </p>
     *            <p>
     *            For each finding, the list provides the finding identifier and
     *            the ARN of the finding provider.
     *            </p>
     */
    public void setFindingIdentifiers(
            java.util.Collection<AwsSecurityFindingIdentifier> findingIdentifiers) {
        if (findingIdentifiers == null) {
            this.findingIdentifiers = null;
            return;
        }

        this.findingIdentifiers = new java.util.ArrayList<AwsSecurityFindingIdentifier>(
                findingIdentifiers);
    }

    /**
     * <p>
     * The list of findings to update. <code>BatchUpdateFindings</code> can be
     * used to update up to 100 findings at a time.
     * </p>
     * <p>
     * For each finding, the list provides the finding identifier and the ARN of
     * the finding provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingIdentifiers <p>
     *            The list of findings to update.
     *            <code>BatchUpdateFindings</code> can be used to update up to
     *            100 findings at a time.
     *            </p>
     *            <p>
     *            For each finding, the list provides the finding identifier and
     *            the ARN of the finding provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateFindingsRequest withFindingIdentifiers(
            AwsSecurityFindingIdentifier... findingIdentifiers) {
        if (getFindingIdentifiers() == null) {
            this.findingIdentifiers = new java.util.ArrayList<AwsSecurityFindingIdentifier>(
                    findingIdentifiers.length);
        }
        for (AwsSecurityFindingIdentifier value : findingIdentifiers) {
            this.findingIdentifiers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of findings to update. <code>BatchUpdateFindings</code> can be
     * used to update up to 100 findings at a time.
     * </p>
     * <p>
     * For each finding, the list provides the finding identifier and the ARN of
     * the finding provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingIdentifiers <p>
     *            The list of findings to update.
     *            <code>BatchUpdateFindings</code> can be used to update up to
     *            100 findings at a time.
     *            </p>
     *            <p>
     *            For each finding, the list provides the finding identifier and
     *            the ARN of the finding provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateFindingsRequest withFindingIdentifiers(
            java.util.Collection<AwsSecurityFindingIdentifier> findingIdentifiers) {
        setFindingIdentifiers(findingIdentifiers);
        return this;
    }

    /**
     * <p>
     * The updated note.
     * </p>
     *
     * @return <p>
     *         The updated note.
     *         </p>
     */
    public NoteUpdate getNote() {
        return note;
    }

    /**
     * <p>
     * The updated note.
     * </p>
     *
     * @param note <p>
     *            The updated note.
     *            </p>
     */
    public void setNote(NoteUpdate note) {
        this.note = note;
    }

    /**
     * <p>
     * The updated note.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param note <p>
     *            The updated note.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateFindingsRequest withNote(NoteUpdate note) {
        this.note = note;
        return this;
    }

    /**
     * <p>
     * Used to update the finding severity.
     * </p>
     *
     * @return <p>
     *         Used to update the finding severity.
     *         </p>
     */
    public SeverityUpdate getSeverity() {
        return severity;
    }

    /**
     * <p>
     * Used to update the finding severity.
     * </p>
     *
     * @param severity <p>
     *            Used to update the finding severity.
     *            </p>
     */
    public void setSeverity(SeverityUpdate severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * Used to update the finding severity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param severity <p>
     *            Used to update the finding severity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateFindingsRequest withSeverity(SeverityUpdate severity) {
        this.severity = severity;
        return this;
    }

    /**
     * <p>
     * Indicates the veracity of a finding.
     * </p>
     * <p>
     * The available values for <code>VerificationState</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNKNOWN</code> – The default disposition of a security finding
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUE_POSITIVE</code> – The security finding is confirmed
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FALSE_POSITIVE</code> – The security finding was determined to be a
     * false alarm
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BENIGN_POSITIVE</code> – A special case of
     * <code>TRUE_POSITIVE</code> where the finding doesn't pose any threat, is
     * expected, or both
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNKNOWN, TRUE_POSITIVE, FALSE_POSITIVE,
     * BENIGN_POSITIVE
     *
     * @return <p>
     *         Indicates the veracity of a finding.
     *         </p>
     *         <p>
     *         The available values for <code>VerificationState</code> are as
     *         follows.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>UNKNOWN</code> – The default disposition of a security
     *         finding
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TRUE_POSITIVE</code> – The security finding is confirmed
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FALSE_POSITIVE</code> – The security finding was determined
     *         to be a false alarm
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BENIGN_POSITIVE</code> – A special case of
     *         <code>TRUE_POSITIVE</code> where the finding doesn't pose any
     *         threat, is expected, or both
     *         </p>
     *         </li>
     *         </ul>
     * @see VerificationState
     */
    public String getVerificationState() {
        return verificationState;
    }

    /**
     * <p>
     * Indicates the veracity of a finding.
     * </p>
     * <p>
     * The available values for <code>VerificationState</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNKNOWN</code> – The default disposition of a security finding
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUE_POSITIVE</code> – The security finding is confirmed
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FALSE_POSITIVE</code> – The security finding was determined to be a
     * false alarm
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BENIGN_POSITIVE</code> – A special case of
     * <code>TRUE_POSITIVE</code> where the finding doesn't pose any threat, is
     * expected, or both
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNKNOWN, TRUE_POSITIVE, FALSE_POSITIVE,
     * BENIGN_POSITIVE
     *
     * @param verificationState <p>
     *            Indicates the veracity of a finding.
     *            </p>
     *            <p>
     *            The available values for <code>VerificationState</code> are as
     *            follows.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>UNKNOWN</code> – The default disposition of a security
     *            finding
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TRUE_POSITIVE</code> – The security finding is confirmed
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FALSE_POSITIVE</code> – The security finding was
     *            determined to be a false alarm
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BENIGN_POSITIVE</code> – A special case of
     *            <code>TRUE_POSITIVE</code> where the finding doesn't pose any
     *            threat, is expected, or both
     *            </p>
     *            </li>
     *            </ul>
     * @see VerificationState
     */
    public void setVerificationState(String verificationState) {
        this.verificationState = verificationState;
    }

    /**
     * <p>
     * Indicates the veracity of a finding.
     * </p>
     * <p>
     * The available values for <code>VerificationState</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNKNOWN</code> – The default disposition of a security finding
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUE_POSITIVE</code> – The security finding is confirmed
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FALSE_POSITIVE</code> – The security finding was determined to be a
     * false alarm
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BENIGN_POSITIVE</code> – A special case of
     * <code>TRUE_POSITIVE</code> where the finding doesn't pose any threat, is
     * expected, or both
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNKNOWN, TRUE_POSITIVE, FALSE_POSITIVE,
     * BENIGN_POSITIVE
     *
     * @param verificationState <p>
     *            Indicates the veracity of a finding.
     *            </p>
     *            <p>
     *            The available values for <code>VerificationState</code> are as
     *            follows.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>UNKNOWN</code> – The default disposition of a security
     *            finding
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TRUE_POSITIVE</code> – The security finding is confirmed
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FALSE_POSITIVE</code> – The security finding was
     *            determined to be a false alarm
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BENIGN_POSITIVE</code> – A special case of
     *            <code>TRUE_POSITIVE</code> where the finding doesn't pose any
     *            threat, is expected, or both
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VerificationState
     */
    public BatchUpdateFindingsRequest withVerificationState(String verificationState) {
        this.verificationState = verificationState;
        return this;
    }

    /**
     * <p>
     * Indicates the veracity of a finding.
     * </p>
     * <p>
     * The available values for <code>VerificationState</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNKNOWN</code> – The default disposition of a security finding
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUE_POSITIVE</code> – The security finding is confirmed
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FALSE_POSITIVE</code> – The security finding was determined to be a
     * false alarm
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BENIGN_POSITIVE</code> – A special case of
     * <code>TRUE_POSITIVE</code> where the finding doesn't pose any threat, is
     * expected, or both
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNKNOWN, TRUE_POSITIVE, FALSE_POSITIVE,
     * BENIGN_POSITIVE
     *
     * @param verificationState <p>
     *            Indicates the veracity of a finding.
     *            </p>
     *            <p>
     *            The available values for <code>VerificationState</code> are as
     *            follows.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>UNKNOWN</code> – The default disposition of a security
     *            finding
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TRUE_POSITIVE</code> – The security finding is confirmed
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FALSE_POSITIVE</code> – The security finding was
     *            determined to be a false alarm
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BENIGN_POSITIVE</code> – A special case of
     *            <code>TRUE_POSITIVE</code> where the finding doesn't pose any
     *            threat, is expected, or both
     *            </p>
     *            </li>
     *            </ul>
     * @see VerificationState
     */
    public void setVerificationState(VerificationState verificationState) {
        this.verificationState = verificationState.toString();
    }

    /**
     * <p>
     * Indicates the veracity of a finding.
     * </p>
     * <p>
     * The available values for <code>VerificationState</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNKNOWN</code> – The default disposition of a security finding
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUE_POSITIVE</code> – The security finding is confirmed
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FALSE_POSITIVE</code> – The security finding was determined to be a
     * false alarm
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BENIGN_POSITIVE</code> – A special case of
     * <code>TRUE_POSITIVE</code> where the finding doesn't pose any threat, is
     * expected, or both
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNKNOWN, TRUE_POSITIVE, FALSE_POSITIVE,
     * BENIGN_POSITIVE
     *
     * @param verificationState <p>
     *            Indicates the veracity of a finding.
     *            </p>
     *            <p>
     *            The available values for <code>VerificationState</code> are as
     *            follows.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>UNKNOWN</code> – The default disposition of a security
     *            finding
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TRUE_POSITIVE</code> – The security finding is confirmed
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FALSE_POSITIVE</code> – The security finding was
     *            determined to be a false alarm
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BENIGN_POSITIVE</code> – A special case of
     *            <code>TRUE_POSITIVE</code> where the finding doesn't pose any
     *            threat, is expected, or both
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VerificationState
     */
    public BatchUpdateFindingsRequest withVerificationState(VerificationState verificationState) {
        this.verificationState = verificationState.toString();
        return this;
    }

    /**
     * <p>
     * The updated value for the finding confidence. Confidence is defined as
     * the likelihood that a finding accurately identifies the behavior or issue
     * that it was intended to identify.
     * </p>
     * <p>
     * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means
     * zero percent confidence and 100 means 100 percent confidence.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The updated value for the finding confidence. Confidence is
     *         defined as the likelihood that a finding accurately identifies
     *         the behavior or issue that it was intended to identify.
     *         </p>
     *         <p>
     *         Confidence is scored on a 0-100 basis using a ratio scale, where
     *         0 means zero percent confidence and 100 means 100 percent
     *         confidence.
     *         </p>
     */
    public Integer getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * The updated value for the finding confidence. Confidence is defined as
     * the likelihood that a finding accurately identifies the behavior or issue
     * that it was intended to identify.
     * </p>
     * <p>
     * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means
     * zero percent confidence and 100 means 100 percent confidence.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The updated value for the finding confidence. Confidence is
     *            defined as the likelihood that a finding accurately identifies
     *            the behavior or issue that it was intended to identify.
     *            </p>
     *            <p>
     *            Confidence is scored on a 0-100 basis using a ratio scale,
     *            where 0 means zero percent confidence and 100 means 100
     *            percent confidence.
     *            </p>
     */
    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The updated value for the finding confidence. Confidence is defined as
     * the likelihood that a finding accurately identifies the behavior or issue
     * that it was intended to identify.
     * </p>
     * <p>
     * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means
     * zero percent confidence and 100 means 100 percent confidence.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The updated value for the finding confidence. Confidence is
     *            defined as the likelihood that a finding accurately identifies
     *            the behavior or issue that it was intended to identify.
     *            </p>
     *            <p>
     *            Confidence is scored on a 0-100 basis using a ratio scale,
     *            where 0 means zero percent confidence and 100 means 100
     *            percent confidence.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateFindingsRequest withConfidence(Integer confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * <p>
     * The updated value for the level of importance assigned to the resources
     * associated with the findings.
     * </p>
     * <p>
     * A score of 0 means that the underlying resources have no criticality, and
     * a score of 100 is reserved for the most critical resources.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The updated value for the level of importance assigned to the
     *         resources associated with the findings.
     *         </p>
     *         <p>
     *         A score of 0 means that the underlying resources have no
     *         criticality, and a score of 100 is reserved for the most critical
     *         resources.
     *         </p>
     */
    public Integer getCriticality() {
        return criticality;
    }

    /**
     * <p>
     * The updated value for the level of importance assigned to the resources
     * associated with the findings.
     * </p>
     * <p>
     * A score of 0 means that the underlying resources have no criticality, and
     * a score of 100 is reserved for the most critical resources.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param criticality <p>
     *            The updated value for the level of importance assigned to the
     *            resources associated with the findings.
     *            </p>
     *            <p>
     *            A score of 0 means that the underlying resources have no
     *            criticality, and a score of 100 is reserved for the most
     *            critical resources.
     *            </p>
     */
    public void setCriticality(Integer criticality) {
        this.criticality = criticality;
    }

    /**
     * <p>
     * The updated value for the level of importance assigned to the resources
     * associated with the findings.
     * </p>
     * <p>
     * A score of 0 means that the underlying resources have no criticality, and
     * a score of 100 is reserved for the most critical resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param criticality <p>
     *            The updated value for the level of importance assigned to the
     *            resources associated with the findings.
     *            </p>
     *            <p>
     *            A score of 0 means that the underlying resources have no
     *            criticality, and a score of 100 is reserved for the most
     *            critical resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateFindingsRequest withCriticality(Integer criticality) {
        this.criticality = criticality;
        return this;
    }

    /**
     * <p>
     * One or more finding types in the format of namespace/category/classifier
     * that classify a finding.
     * </p>
     * <p>
     * Valid namespace values are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Software and Configuration Checks
     * </p>
     * </li>
     * <li>
     * <p>
     * TTPs
     * </p>
     * </li>
     * <li>
     * <p>
     * Effects
     * </p>
     * </li>
     * <li>
     * <p>
     * Unusual Behaviors
     * </p>
     * </li>
     * <li>
     * <p>
     * Sensitive Data Identifications
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         One or more finding types in the format of
     *         namespace/category/classifier that classify a finding.
     *         </p>
     *         <p>
     *         Valid namespace values are as follows.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Software and Configuration Checks
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TTPs
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Effects
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Unusual Behaviors
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Sensitive Data Identifications
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getTypes() {
        return types;
    }

    /**
     * <p>
     * One or more finding types in the format of namespace/category/classifier
     * that classify a finding.
     * </p>
     * <p>
     * Valid namespace values are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Software and Configuration Checks
     * </p>
     * </li>
     * <li>
     * <p>
     * TTPs
     * </p>
     * </li>
     * <li>
     * <p>
     * Effects
     * </p>
     * </li>
     * <li>
     * <p>
     * Unusual Behaviors
     * </p>
     * </li>
     * <li>
     * <p>
     * Sensitive Data Identifications
     * </p>
     * </li>
     * </ul>
     *
     * @param types <p>
     *            One or more finding types in the format of
     *            namespace/category/classifier that classify a finding.
     *            </p>
     *            <p>
     *            Valid namespace values are as follows.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Software and Configuration Checks
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TTPs
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Effects
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Unusual Behaviors
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Sensitive Data Identifications
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTypes(java.util.Collection<String> types) {
        if (types == null) {
            this.types = null;
            return;
        }

        this.types = new java.util.ArrayList<String>(types);
    }

    /**
     * <p>
     * One or more finding types in the format of namespace/category/classifier
     * that classify a finding.
     * </p>
     * <p>
     * Valid namespace values are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Software and Configuration Checks
     * </p>
     * </li>
     * <li>
     * <p>
     * TTPs
     * </p>
     * </li>
     * <li>
     * <p>
     * Effects
     * </p>
     * </li>
     * <li>
     * <p>
     * Unusual Behaviors
     * </p>
     * </li>
     * <li>
     * <p>
     * Sensitive Data Identifications
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param types <p>
     *            One or more finding types in the format of
     *            namespace/category/classifier that classify a finding.
     *            </p>
     *            <p>
     *            Valid namespace values are as follows.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Software and Configuration Checks
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TTPs
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Effects
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Unusual Behaviors
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Sensitive Data Identifications
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateFindingsRequest withTypes(String... types) {
        if (getTypes() == null) {
            this.types = new java.util.ArrayList<String>(types.length);
        }
        for (String value : types) {
            this.types.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more finding types in the format of namespace/category/classifier
     * that classify a finding.
     * </p>
     * <p>
     * Valid namespace values are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Software and Configuration Checks
     * </p>
     * </li>
     * <li>
     * <p>
     * TTPs
     * </p>
     * </li>
     * <li>
     * <p>
     * Effects
     * </p>
     * </li>
     * <li>
     * <p>
     * Unusual Behaviors
     * </p>
     * </li>
     * <li>
     * <p>
     * Sensitive Data Identifications
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param types <p>
     *            One or more finding types in the format of
     *            namespace/category/classifier that classify a finding.
     *            </p>
     *            <p>
     *            Valid namespace values are as follows.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Software and Configuration Checks
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TTPs
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Effects
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Unusual Behaviors
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Sensitive Data Identifications
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateFindingsRequest withTypes(java.util.Collection<String> types) {
        setTypes(types);
        return this;
    }

    /**
     * <p>
     * A list of name/value string pairs associated with the finding. These are
     * custom, user-defined fields added to a finding.
     * </p>
     *
     * @return <p>
     *         A list of name/value string pairs associated with the finding.
     *         These are custom, user-defined fields added to a finding.
     *         </p>
     */
    public java.util.Map<String, String> getUserDefinedFields() {
        return userDefinedFields;
    }

    /**
     * <p>
     * A list of name/value string pairs associated with the finding. These are
     * custom, user-defined fields added to a finding.
     * </p>
     *
     * @param userDefinedFields <p>
     *            A list of name/value string pairs associated with the finding.
     *            These are custom, user-defined fields added to a finding.
     *            </p>
     */
    public void setUserDefinedFields(java.util.Map<String, String> userDefinedFields) {
        this.userDefinedFields = userDefinedFields;
    }

    /**
     * <p>
     * A list of name/value string pairs associated with the finding. These are
     * custom, user-defined fields added to a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userDefinedFields <p>
     *            A list of name/value string pairs associated with the finding.
     *            These are custom, user-defined fields added to a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateFindingsRequest withUserDefinedFields(
            java.util.Map<String, String> userDefinedFields) {
        this.userDefinedFields = userDefinedFields;
        return this;
    }

    /**
     * <p>
     * A list of name/value string pairs associated with the finding. These are
     * custom, user-defined fields added to a finding.
     * </p>
     * <p>
     * The method adds a new key-value pair into UserDefinedFields parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into UserDefinedFields.
     * @param value The corresponding value of the entry to be added into
     *            UserDefinedFields.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateFindingsRequest addUserDefinedFieldsEntry(String key, String value) {
        if (null == this.userDefinedFields) {
            this.userDefinedFields = new java.util.HashMap<String, String>();
        }
        if (this.userDefinedFields.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.userDefinedFields.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UserDefinedFields.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public BatchUpdateFindingsRequest clearUserDefinedFieldsEntries() {
        this.userDefinedFields = null;
        return this;
    }

    /**
     * <p>
     * Used to update the workflow status of a finding.
     * </p>
     * <p>
     * The workflow status indicates the progress of the investigation into the
     * finding.
     * </p>
     *
     * @return <p>
     *         Used to update the workflow status of a finding.
     *         </p>
     *         <p>
     *         The workflow status indicates the progress of the investigation
     *         into the finding.
     *         </p>
     */
    public WorkflowUpdate getWorkflow() {
        return workflow;
    }

    /**
     * <p>
     * Used to update the workflow status of a finding.
     * </p>
     * <p>
     * The workflow status indicates the progress of the investigation into the
     * finding.
     * </p>
     *
     * @param workflow <p>
     *            Used to update the workflow status of a finding.
     *            </p>
     *            <p>
     *            The workflow status indicates the progress of the
     *            investigation into the finding.
     *            </p>
     */
    public void setWorkflow(WorkflowUpdate workflow) {
        this.workflow = workflow;
    }

    /**
     * <p>
     * Used to update the workflow status of a finding.
     * </p>
     * <p>
     * The workflow status indicates the progress of the investigation into the
     * finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param workflow <p>
     *            Used to update the workflow status of a finding.
     *            </p>
     *            <p>
     *            The workflow status indicates the progress of the
     *            investigation into the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateFindingsRequest withWorkflow(WorkflowUpdate workflow) {
        this.workflow = workflow;
        return this;
    }

    /**
     * <p>
     * A list of findings that are related to the updated findings.
     * </p>
     *
     * @return <p>
     *         A list of findings that are related to the updated findings.
     *         </p>
     */
    public java.util.List<RelatedFinding> getRelatedFindings() {
        return relatedFindings;
    }

    /**
     * <p>
     * A list of findings that are related to the updated findings.
     * </p>
     *
     * @param relatedFindings <p>
     *            A list of findings that are related to the updated findings.
     *            </p>
     */
    public void setRelatedFindings(java.util.Collection<RelatedFinding> relatedFindings) {
        if (relatedFindings == null) {
            this.relatedFindings = null;
            return;
        }

        this.relatedFindings = new java.util.ArrayList<RelatedFinding>(relatedFindings);
    }

    /**
     * <p>
     * A list of findings that are related to the updated findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relatedFindings <p>
     *            A list of findings that are related to the updated findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateFindingsRequest withRelatedFindings(RelatedFinding... relatedFindings) {
        if (getRelatedFindings() == null) {
            this.relatedFindings = new java.util.ArrayList<RelatedFinding>(relatedFindings.length);
        }
        for (RelatedFinding value : relatedFindings) {
            this.relatedFindings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of findings that are related to the updated findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relatedFindings <p>
     *            A list of findings that are related to the updated findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateFindingsRequest withRelatedFindings(
            java.util.Collection<RelatedFinding> relatedFindings) {
        setRelatedFindings(relatedFindings);
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
        if (getFindingIdentifiers() != null)
            sb.append("FindingIdentifiers: " + getFindingIdentifiers() + ",");
        if (getNote() != null)
            sb.append("Note: " + getNote() + ",");
        if (getSeverity() != null)
            sb.append("Severity: " + getSeverity() + ",");
        if (getVerificationState() != null)
            sb.append("VerificationState: " + getVerificationState() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence() + ",");
        if (getCriticality() != null)
            sb.append("Criticality: " + getCriticality() + ",");
        if (getTypes() != null)
            sb.append("Types: " + getTypes() + ",");
        if (getUserDefinedFields() != null)
            sb.append("UserDefinedFields: " + getUserDefinedFields() + ",");
        if (getWorkflow() != null)
            sb.append("Workflow: " + getWorkflow() + ",");
        if (getRelatedFindings() != null)
            sb.append("RelatedFindings: " + getRelatedFindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFindingIdentifiers() == null) ? 0 : getFindingIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getNote() == null) ? 0 : getNote().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode
                + ((getVerificationState() == null) ? 0 : getVerificationState().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode
                + ((getCriticality() == null) ? 0 : getCriticality().hashCode());
        hashCode = prime * hashCode + ((getTypes() == null) ? 0 : getTypes().hashCode());
        hashCode = prime * hashCode
                + ((getUserDefinedFields() == null) ? 0 : getUserDefinedFields().hashCode());
        hashCode = prime * hashCode + ((getWorkflow() == null) ? 0 : getWorkflow().hashCode());
        hashCode = prime * hashCode
                + ((getRelatedFindings() == null) ? 0 : getRelatedFindings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateFindingsRequest == false)
            return false;
        BatchUpdateFindingsRequest other = (BatchUpdateFindingsRequest) obj;

        if (other.getFindingIdentifiers() == null ^ this.getFindingIdentifiers() == null)
            return false;
        if (other.getFindingIdentifiers() != null
                && other.getFindingIdentifiers().equals(this.getFindingIdentifiers()) == false)
            return false;
        if (other.getNote() == null ^ this.getNote() == null)
            return false;
        if (other.getNote() != null && other.getNote().equals(this.getNote()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getVerificationState() == null ^ this.getVerificationState() == null)
            return false;
        if (other.getVerificationState() != null
                && other.getVerificationState().equals(this.getVerificationState()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getCriticality() == null ^ this.getCriticality() == null)
            return false;
        if (other.getCriticality() != null
                && other.getCriticality().equals(this.getCriticality()) == false)
            return false;
        if (other.getTypes() == null ^ this.getTypes() == null)
            return false;
        if (other.getTypes() != null && other.getTypes().equals(this.getTypes()) == false)
            return false;
        if (other.getUserDefinedFields() == null ^ this.getUserDefinedFields() == null)
            return false;
        if (other.getUserDefinedFields() != null
                && other.getUserDefinedFields().equals(this.getUserDefinedFields()) == false)
            return false;
        if (other.getWorkflow() == null ^ this.getWorkflow() == null)
            return false;
        if (other.getWorkflow() != null && other.getWorkflow().equals(this.getWorkflow()) == false)
            return false;
        if (other.getRelatedFindings() == null ^ this.getRelatedFindings() == null)
            return false;
        if (other.getRelatedFindings() != null
                && other.getRelatedFindings().equals(this.getRelatedFindings()) == false)
            return false;
        return true;
    }
}
