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

package com.amazonaws.services.amazonfrauddetector.model;

import java.io.Serializable;

public class GetDetectorVersionResult implements Serializable {
    /**
     * <p>
     * The detector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     */
    private String detectorId;

    /**
     * <p>
     * The detector version ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String detectorVersionId;

    /**
     * <p>
     * The detector version description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String description;

    /**
     * <p>
     * The Amazon SageMaker model endpoints included in the detector version.
     * </p>
     */
    private java.util.List<String> externalModelEndpoints;

    /**
     * <p>
     * The model versions included in the detector version.
     * </p>
     */
    private java.util.List<ModelVersion> modelVersions;

    /**
     * <p>
     * The rules included in the detector version.
     * </p>
     */
    private java.util.List<Rule> rules;

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, INACTIVE
     */
    private String status;

    /**
     * <p>
     * The timestamp when the detector version was last updated.
     * </p>
     */
    private String lastUpdatedTime;

    /**
     * <p>
     * The timestamp when the detector version was created.
     * </p>
     */
    private String createdTime;

    /**
     * <p>
     * The execution mode of the rule in the dectector
     * </p>
     * <p>
     * <code>FIRST_MATCHED</code> indicates that Amazon Fraud Detector evaluates
     * rules sequentially, first to last, stopping at the first matched rule.
     * Amazon Fraud dectector then provides the outcomes for that single rule.
     * </p>
     * <p>
     * <code>ALL_MATCHED</code> indicates that Amazon Fraud Detector evaluates
     * all rules and returns the outcomes for all matched rules. You can define
     * and edit the rule mode at the detector version level, when it is in draft
     * status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_MATCHED, FIRST_MATCHED
     */
    private String ruleExecutionMode;

    /**
     * <p>
     * The detector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @return <p>
     *         The detector ID.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @param detectorId <p>
     *            The detector ID.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @param detectorId <p>
     *            The detector ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDetectorVersionResult withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The detector version ID.
     *         </p>
     */
    public String getDetectorVersionId() {
        return detectorVersionId;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param detectorVersionId <p>
     *            The detector version ID.
     *            </p>
     */
    public void setDetectorVersionId(String detectorVersionId) {
        this.detectorVersionId = detectorVersionId;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param detectorVersionId <p>
     *            The detector version ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDetectorVersionResult withDetectorVersionId(String detectorVersionId) {
        this.detectorVersionId = detectorVersionId;
        return this;
    }

    /**
     * <p>
     * The detector version description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The detector version description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The detector version description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            The detector version description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The detector version description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            The detector version description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDetectorVersionResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoints included in the detector version.
     * </p>
     *
     * @return <p>
     *         The Amazon SageMaker model endpoints included in the detector
     *         version.
     *         </p>
     */
    public java.util.List<String> getExternalModelEndpoints() {
        return externalModelEndpoints;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoints included in the detector version.
     * </p>
     *
     * @param externalModelEndpoints <p>
     *            The Amazon SageMaker model endpoints included in the detector
     *            version.
     *            </p>
     */
    public void setExternalModelEndpoints(java.util.Collection<String> externalModelEndpoints) {
        if (externalModelEndpoints == null) {
            this.externalModelEndpoints = null;
            return;
        }

        this.externalModelEndpoints = new java.util.ArrayList<String>(externalModelEndpoints);
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoints included in the detector version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalModelEndpoints <p>
     *            The Amazon SageMaker model endpoints included in the detector
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDetectorVersionResult withExternalModelEndpoints(String... externalModelEndpoints) {
        if (getExternalModelEndpoints() == null) {
            this.externalModelEndpoints = new java.util.ArrayList<String>(
                    externalModelEndpoints.length);
        }
        for (String value : externalModelEndpoints) {
            this.externalModelEndpoints.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoints included in the detector version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalModelEndpoints <p>
     *            The Amazon SageMaker model endpoints included in the detector
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDetectorVersionResult withExternalModelEndpoints(
            java.util.Collection<String> externalModelEndpoints) {
        setExternalModelEndpoints(externalModelEndpoints);
        return this;
    }

    /**
     * <p>
     * The model versions included in the detector version.
     * </p>
     *
     * @return <p>
     *         The model versions included in the detector version.
     *         </p>
     */
    public java.util.List<ModelVersion> getModelVersions() {
        return modelVersions;
    }

    /**
     * <p>
     * The model versions included in the detector version.
     * </p>
     *
     * @param modelVersions <p>
     *            The model versions included in the detector version.
     *            </p>
     */
    public void setModelVersions(java.util.Collection<ModelVersion> modelVersions) {
        if (modelVersions == null) {
            this.modelVersions = null;
            return;
        }

        this.modelVersions = new java.util.ArrayList<ModelVersion>(modelVersions);
    }

    /**
     * <p>
     * The model versions included in the detector version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelVersions <p>
     *            The model versions included in the detector version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDetectorVersionResult withModelVersions(ModelVersion... modelVersions) {
        if (getModelVersions() == null) {
            this.modelVersions = new java.util.ArrayList<ModelVersion>(modelVersions.length);
        }
        for (ModelVersion value : modelVersions) {
            this.modelVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The model versions included in the detector version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelVersions <p>
     *            The model versions included in the detector version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDetectorVersionResult withModelVersions(
            java.util.Collection<ModelVersion> modelVersions) {
        setModelVersions(modelVersions);
        return this;
    }

    /**
     * <p>
     * The rules included in the detector version.
     * </p>
     *
     * @return <p>
     *         The rules included in the detector version.
     *         </p>
     */
    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The rules included in the detector version.
     * </p>
     *
     * @param rules <p>
     *            The rules included in the detector version.
     *            </p>
     */
    public void setRules(java.util.Collection<Rule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<Rule>(rules);
    }

    /**
     * <p>
     * The rules included in the detector version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            The rules included in the detector version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDetectorVersionResult withRules(Rule... rules) {
        if (getRules() == null) {
            this.rules = new java.util.ArrayList<Rule>(rules.length);
        }
        for (Rule value : rules) {
            this.rules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The rules included in the detector version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            The rules included in the detector version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDetectorVersionResult withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, INACTIVE
     *
     * @return <p>
     *         The status of the detector version.
     *         </p>
     * @see DetectorVersionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the detector version.
     *            </p>
     * @see DetectorVersionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the detector version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DetectorVersionStatus
     */
    public GetDetectorVersionResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the detector version.
     *            </p>
     * @see DetectorVersionStatus
     */
    public void setStatus(DetectorVersionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the detector version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DetectorVersionStatus
     */
    public GetDetectorVersionResult withStatus(DetectorVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the detector version was last updated.
     * </p>
     *
     * @return <p>
     *         The timestamp when the detector version was last updated.
     *         </p>
     */
    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp when the detector version was last updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The timestamp when the detector version was last updated.
     *            </p>
     */
    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp when the detector version was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The timestamp when the detector version was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDetectorVersionResult withLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * The timestamp when the detector version was created.
     * </p>
     *
     * @return <p>
     *         The timestamp when the detector version was created.
     *         </p>
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The timestamp when the detector version was created.
     * </p>
     *
     * @param createdTime <p>
     *            The timestamp when the detector version was created.
     *            </p>
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp when the detector version was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The timestamp when the detector version was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDetectorVersionResult withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The execution mode of the rule in the dectector
     * </p>
     * <p>
     * <code>FIRST_MATCHED</code> indicates that Amazon Fraud Detector evaluates
     * rules sequentially, first to last, stopping at the first matched rule.
     * Amazon Fraud dectector then provides the outcomes for that single rule.
     * </p>
     * <p>
     * <code>ALL_MATCHED</code> indicates that Amazon Fraud Detector evaluates
     * all rules and returns the outcomes for all matched rules. You can define
     * and edit the rule mode at the detector version level, when it is in draft
     * status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_MATCHED, FIRST_MATCHED
     *
     * @return <p>
     *         The execution mode of the rule in the dectector
     *         </p>
     *         <p>
     *         <code>FIRST_MATCHED</code> indicates that Amazon Fraud Detector
     *         evaluates rules sequentially, first to last, stopping at the
     *         first matched rule. Amazon Fraud dectector then provides the
     *         outcomes for that single rule.
     *         </p>
     *         <p>
     *         <code>ALL_MATCHED</code> indicates that Amazon Fraud Detector
     *         evaluates all rules and returns the outcomes for all matched
     *         rules. You can define and edit the rule mode at the detector
     *         version level, when it is in draft status.
     *         </p>
     * @see RuleExecutionMode
     */
    public String getRuleExecutionMode() {
        return ruleExecutionMode;
    }

    /**
     * <p>
     * The execution mode of the rule in the dectector
     * </p>
     * <p>
     * <code>FIRST_MATCHED</code> indicates that Amazon Fraud Detector evaluates
     * rules sequentially, first to last, stopping at the first matched rule.
     * Amazon Fraud dectector then provides the outcomes for that single rule.
     * </p>
     * <p>
     * <code>ALL_MATCHED</code> indicates that Amazon Fraud Detector evaluates
     * all rules and returns the outcomes for all matched rules. You can define
     * and edit the rule mode at the detector version level, when it is in draft
     * status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_MATCHED, FIRST_MATCHED
     *
     * @param ruleExecutionMode <p>
     *            The execution mode of the rule in the dectector
     *            </p>
     *            <p>
     *            <code>FIRST_MATCHED</code> indicates that Amazon Fraud
     *            Detector evaluates rules sequentially, first to last, stopping
     *            at the first matched rule. Amazon Fraud dectector then
     *            provides the outcomes for that single rule.
     *            </p>
     *            <p>
     *            <code>ALL_MATCHED</code> indicates that Amazon Fraud Detector
     *            evaluates all rules and returns the outcomes for all matched
     *            rules. You can define and edit the rule mode at the detector
     *            version level, when it is in draft status.
     *            </p>
     * @see RuleExecutionMode
     */
    public void setRuleExecutionMode(String ruleExecutionMode) {
        this.ruleExecutionMode = ruleExecutionMode;
    }

    /**
     * <p>
     * The execution mode of the rule in the dectector
     * </p>
     * <p>
     * <code>FIRST_MATCHED</code> indicates that Amazon Fraud Detector evaluates
     * rules sequentially, first to last, stopping at the first matched rule.
     * Amazon Fraud dectector then provides the outcomes for that single rule.
     * </p>
     * <p>
     * <code>ALL_MATCHED</code> indicates that Amazon Fraud Detector evaluates
     * all rules and returns the outcomes for all matched rules. You can define
     * and edit the rule mode at the detector version level, when it is in draft
     * status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_MATCHED, FIRST_MATCHED
     *
     * @param ruleExecutionMode <p>
     *            The execution mode of the rule in the dectector
     *            </p>
     *            <p>
     *            <code>FIRST_MATCHED</code> indicates that Amazon Fraud
     *            Detector evaluates rules sequentially, first to last, stopping
     *            at the first matched rule. Amazon Fraud dectector then
     *            provides the outcomes for that single rule.
     *            </p>
     *            <p>
     *            <code>ALL_MATCHED</code> indicates that Amazon Fraud Detector
     *            evaluates all rules and returns the outcomes for all matched
     *            rules. You can define and edit the rule mode at the detector
     *            version level, when it is in draft status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RuleExecutionMode
     */
    public GetDetectorVersionResult withRuleExecutionMode(String ruleExecutionMode) {
        this.ruleExecutionMode = ruleExecutionMode;
        return this;
    }

    /**
     * <p>
     * The execution mode of the rule in the dectector
     * </p>
     * <p>
     * <code>FIRST_MATCHED</code> indicates that Amazon Fraud Detector evaluates
     * rules sequentially, first to last, stopping at the first matched rule.
     * Amazon Fraud dectector then provides the outcomes for that single rule.
     * </p>
     * <p>
     * <code>ALL_MATCHED</code> indicates that Amazon Fraud Detector evaluates
     * all rules and returns the outcomes for all matched rules. You can define
     * and edit the rule mode at the detector version level, when it is in draft
     * status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_MATCHED, FIRST_MATCHED
     *
     * @param ruleExecutionMode <p>
     *            The execution mode of the rule in the dectector
     *            </p>
     *            <p>
     *            <code>FIRST_MATCHED</code> indicates that Amazon Fraud
     *            Detector evaluates rules sequentially, first to last, stopping
     *            at the first matched rule. Amazon Fraud dectector then
     *            provides the outcomes for that single rule.
     *            </p>
     *            <p>
     *            <code>ALL_MATCHED</code> indicates that Amazon Fraud Detector
     *            evaluates all rules and returns the outcomes for all matched
     *            rules. You can define and edit the rule mode at the detector
     *            version level, when it is in draft status.
     *            </p>
     * @see RuleExecutionMode
     */
    public void setRuleExecutionMode(RuleExecutionMode ruleExecutionMode) {
        this.ruleExecutionMode = ruleExecutionMode.toString();
    }

    /**
     * <p>
     * The execution mode of the rule in the dectector
     * </p>
     * <p>
     * <code>FIRST_MATCHED</code> indicates that Amazon Fraud Detector evaluates
     * rules sequentially, first to last, stopping at the first matched rule.
     * Amazon Fraud dectector then provides the outcomes for that single rule.
     * </p>
     * <p>
     * <code>ALL_MATCHED</code> indicates that Amazon Fraud Detector evaluates
     * all rules and returns the outcomes for all matched rules. You can define
     * and edit the rule mode at the detector version level, when it is in draft
     * status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_MATCHED, FIRST_MATCHED
     *
     * @param ruleExecutionMode <p>
     *            The execution mode of the rule in the dectector
     *            </p>
     *            <p>
     *            <code>FIRST_MATCHED</code> indicates that Amazon Fraud
     *            Detector evaluates rules sequentially, first to last, stopping
     *            at the first matched rule. Amazon Fraud dectector then
     *            provides the outcomes for that single rule.
     *            </p>
     *            <p>
     *            <code>ALL_MATCHED</code> indicates that Amazon Fraud Detector
     *            evaluates all rules and returns the outcomes for all matched
     *            rules. You can define and edit the rule mode at the detector
     *            version level, when it is in draft status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RuleExecutionMode
     */
    public GetDetectorVersionResult withRuleExecutionMode(RuleExecutionMode ruleExecutionMode) {
        this.ruleExecutionMode = ruleExecutionMode.toString();
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
            sb.append("detectorId: " + getDetectorId() + ",");
        if (getDetectorVersionId() != null)
            sb.append("detectorVersionId: " + getDetectorVersionId() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getExternalModelEndpoints() != null)
            sb.append("externalModelEndpoints: " + getExternalModelEndpoints() + ",");
        if (getModelVersions() != null)
            sb.append("modelVersions: " + getModelVersions() + ",");
        if (getRules() != null)
            sb.append("rules: " + getRules() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("lastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getCreatedTime() != null)
            sb.append("createdTime: " + getCreatedTime() + ",");
        if (getRuleExecutionMode() != null)
            sb.append("ruleExecutionMode: " + getRuleExecutionMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode
                + ((getDetectorVersionId() == null) ? 0 : getDetectorVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getExternalModelEndpoints() == null) ? 0 : getExternalModelEndpoints()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getModelVersions() == null) ? 0 : getModelVersions().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getRuleExecutionMode() == null) ? 0 : getRuleExecutionMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDetectorVersionResult == false)
            return false;
        GetDetectorVersionResult other = (GetDetectorVersionResult) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDetectorVersionId() == null ^ this.getDetectorVersionId() == null)
            return false;
        if (other.getDetectorVersionId() != null
                && other.getDetectorVersionId().equals(this.getDetectorVersionId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExternalModelEndpoints() == null ^ this.getExternalModelEndpoints() == null)
            return false;
        if (other.getExternalModelEndpoints() != null
                && other.getExternalModelEndpoints().equals(this.getExternalModelEndpoints()) == false)
            return false;
        if (other.getModelVersions() == null ^ this.getModelVersions() == null)
            return false;
        if (other.getModelVersions() != null
                && other.getModelVersions().equals(this.getModelVersions()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getRuleExecutionMode() == null ^ this.getRuleExecutionMode() == null)
            return false;
        if (other.getRuleExecutionMode() != null
                && other.getRuleExecutionMode().equals(this.getRuleExecutionMode()) == false)
            return false;
        return true;
    }
}
