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

public class GetPredictionResult implements Serializable {
    /**
     * <p>
     * The prediction outcomes.
     * </p>
     */
    private java.util.List<String> outcomes;

    /**
     * <p>
     * The model scores for models used in the detector version.
     * </p>
     */
    private java.util.List<ModelScores> modelScores;

    /**
     * <p>
     * The rule results in the prediction.
     * </p>
     */
    private java.util.List<RuleResult> ruleResults;

    /**
     * <p>
     * The prediction outcomes.
     * </p>
     *
     * @return <p>
     *         The prediction outcomes.
     *         </p>
     */
    public java.util.List<String> getOutcomes() {
        return outcomes;
    }

    /**
     * <p>
     * The prediction outcomes.
     * </p>
     *
     * @param outcomes <p>
     *            The prediction outcomes.
     *            </p>
     */
    public void setOutcomes(java.util.Collection<String> outcomes) {
        if (outcomes == null) {
            this.outcomes = null;
            return;
        }

        this.outcomes = new java.util.ArrayList<String>(outcomes);
    }

    /**
     * <p>
     * The prediction outcomes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outcomes <p>
     *            The prediction outcomes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPredictionResult withOutcomes(String... outcomes) {
        if (getOutcomes() == null) {
            this.outcomes = new java.util.ArrayList<String>(outcomes.length);
        }
        for (String value : outcomes) {
            this.outcomes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The prediction outcomes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outcomes <p>
     *            The prediction outcomes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPredictionResult withOutcomes(java.util.Collection<String> outcomes) {
        setOutcomes(outcomes);
        return this;
    }

    /**
     * <p>
     * The model scores for models used in the detector version.
     * </p>
     *
     * @return <p>
     *         The model scores for models used in the detector version.
     *         </p>
     */
    public java.util.List<ModelScores> getModelScores() {
        return modelScores;
    }

    /**
     * <p>
     * The model scores for models used in the detector version.
     * </p>
     *
     * @param modelScores <p>
     *            The model scores for models used in the detector version.
     *            </p>
     */
    public void setModelScores(java.util.Collection<ModelScores> modelScores) {
        if (modelScores == null) {
            this.modelScores = null;
            return;
        }

        this.modelScores = new java.util.ArrayList<ModelScores>(modelScores);
    }

    /**
     * <p>
     * The model scores for models used in the detector version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelScores <p>
     *            The model scores for models used in the detector version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPredictionResult withModelScores(ModelScores... modelScores) {
        if (getModelScores() == null) {
            this.modelScores = new java.util.ArrayList<ModelScores>(modelScores.length);
        }
        for (ModelScores value : modelScores) {
            this.modelScores.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The model scores for models used in the detector version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelScores <p>
     *            The model scores for models used in the detector version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPredictionResult withModelScores(java.util.Collection<ModelScores> modelScores) {
        setModelScores(modelScores);
        return this;
    }

    /**
     * <p>
     * The rule results in the prediction.
     * </p>
     *
     * @return <p>
     *         The rule results in the prediction.
     *         </p>
     */
    public java.util.List<RuleResult> getRuleResults() {
        return ruleResults;
    }

    /**
     * <p>
     * The rule results in the prediction.
     * </p>
     *
     * @param ruleResults <p>
     *            The rule results in the prediction.
     *            </p>
     */
    public void setRuleResults(java.util.Collection<RuleResult> ruleResults) {
        if (ruleResults == null) {
            this.ruleResults = null;
            return;
        }

        this.ruleResults = new java.util.ArrayList<RuleResult>(ruleResults);
    }

    /**
     * <p>
     * The rule results in the prediction.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleResults <p>
     *            The rule results in the prediction.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPredictionResult withRuleResults(RuleResult... ruleResults) {
        if (getRuleResults() == null) {
            this.ruleResults = new java.util.ArrayList<RuleResult>(ruleResults.length);
        }
        for (RuleResult value : ruleResults) {
            this.ruleResults.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The rule results in the prediction.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleResults <p>
     *            The rule results in the prediction.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPredictionResult withRuleResults(java.util.Collection<RuleResult> ruleResults) {
        setRuleResults(ruleResults);
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
        if (getOutcomes() != null)
            sb.append("outcomes: " + getOutcomes() + ",");
        if (getModelScores() != null)
            sb.append("modelScores: " + getModelScores() + ",");
        if (getRuleResults() != null)
            sb.append("ruleResults: " + getRuleResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutcomes() == null) ? 0 : getOutcomes().hashCode());
        hashCode = prime * hashCode
                + ((getModelScores() == null) ? 0 : getModelScores().hashCode());
        hashCode = prime * hashCode
                + ((getRuleResults() == null) ? 0 : getRuleResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPredictionResult == false)
            return false;
        GetPredictionResult other = (GetPredictionResult) obj;

        if (other.getOutcomes() == null ^ this.getOutcomes() == null)
            return false;
        if (other.getOutcomes() != null && other.getOutcomes().equals(this.getOutcomes()) == false)
            return false;
        if (other.getModelScores() == null ^ this.getModelScores() == null)
            return false;
        if (other.getModelScores() != null
                && other.getModelScores().equals(this.getModelScores()) == false)
            return false;
        if (other.getRuleResults() == null ^ this.getRuleResults() == null)
            return false;
        if (other.getRuleResults() != null
                && other.getRuleResults().equals(this.getRuleResults()) == false)
            return false;
        return true;
    }
}
