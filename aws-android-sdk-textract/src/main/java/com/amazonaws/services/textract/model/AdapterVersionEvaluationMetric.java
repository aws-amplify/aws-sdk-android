/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information on the metrics used to evalute the peformance of a given
 * adapter version. Includes data for baseline model performance and individual
 * adapter version perfromance.
 * </p>
 */
public class AdapterVersionEvaluationMetric implements Serializable {
    /**
     * <p>
     * The F1 score, precision, and recall metrics for the baseline model.
     * </p>
     */
    private EvaluationMetric baseline;

    /**
     * <p>
     * The F1 score, precision, and recall metrics for the baseline model.
     * </p>
     */
    private EvaluationMetric adapterVersion;

    /**
     * <p>
     * Indicates the feature type being analyzed by a given adapter version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TABLES, FORMS, QUERIES, SIGNATURES, LAYOUT
     */
    private String featureType;

    /**
     * <p>
     * The F1 score, precision, and recall metrics for the baseline model.
     * </p>
     *
     * @return <p>
     *         The F1 score, precision, and recall metrics for the baseline
     *         model.
     *         </p>
     */
    public EvaluationMetric getBaseline() {
        return baseline;
    }

    /**
     * <p>
     * The F1 score, precision, and recall metrics for the baseline model.
     * </p>
     *
     * @param baseline <p>
     *            The F1 score, precision, and recall metrics for the baseline
     *            model.
     *            </p>
     */
    public void setBaseline(EvaluationMetric baseline) {
        this.baseline = baseline;
    }

    /**
     * <p>
     * The F1 score, precision, and recall metrics for the baseline model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baseline <p>
     *            The F1 score, precision, and recall metrics for the baseline
     *            model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdapterVersionEvaluationMetric withBaseline(EvaluationMetric baseline) {
        this.baseline = baseline;
        return this;
    }

    /**
     * <p>
     * The F1 score, precision, and recall metrics for the baseline model.
     * </p>
     *
     * @return <p>
     *         The F1 score, precision, and recall metrics for the baseline
     *         model.
     *         </p>
     */
    public EvaluationMetric getAdapterVersion() {
        return adapterVersion;
    }

    /**
     * <p>
     * The F1 score, precision, and recall metrics for the baseline model.
     * </p>
     *
     * @param adapterVersion <p>
     *            The F1 score, precision, and recall metrics for the baseline
     *            model.
     *            </p>
     */
    public void setAdapterVersion(EvaluationMetric adapterVersion) {
        this.adapterVersion = adapterVersion;
    }

    /**
     * <p>
     * The F1 score, precision, and recall metrics for the baseline model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adapterVersion <p>
     *            The F1 score, precision, and recall metrics for the baseline
     *            model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdapterVersionEvaluationMetric withAdapterVersion(EvaluationMetric adapterVersion) {
        this.adapterVersion = adapterVersion;
        return this;
    }

    /**
     * <p>
     * Indicates the feature type being analyzed by a given adapter version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TABLES, FORMS, QUERIES, SIGNATURES, LAYOUT
     *
     * @return <p>
     *         Indicates the feature type being analyzed by a given adapter
     *         version.
     *         </p>
     * @see FeatureType
     */
    public String getFeatureType() {
        return featureType;
    }

    /**
     * <p>
     * Indicates the feature type being analyzed by a given adapter version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TABLES, FORMS, QUERIES, SIGNATURES, LAYOUT
     *
     * @param featureType <p>
     *            Indicates the feature type being analyzed by a given adapter
     *            version.
     *            </p>
     * @see FeatureType
     */
    public void setFeatureType(String featureType) {
        this.featureType = featureType;
    }

    /**
     * <p>
     * Indicates the feature type being analyzed by a given adapter version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TABLES, FORMS, QUERIES, SIGNATURES, LAYOUT
     *
     * @param featureType <p>
     *            Indicates the feature type being analyzed by a given adapter
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FeatureType
     */
    public AdapterVersionEvaluationMetric withFeatureType(String featureType) {
        this.featureType = featureType;
        return this;
    }

    /**
     * <p>
     * Indicates the feature type being analyzed by a given adapter version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TABLES, FORMS, QUERIES, SIGNATURES, LAYOUT
     *
     * @param featureType <p>
     *            Indicates the feature type being analyzed by a given adapter
     *            version.
     *            </p>
     * @see FeatureType
     */
    public void setFeatureType(FeatureType featureType) {
        this.featureType = featureType.toString();
    }

    /**
     * <p>
     * Indicates the feature type being analyzed by a given adapter version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TABLES, FORMS, QUERIES, SIGNATURES, LAYOUT
     *
     * @param featureType <p>
     *            Indicates the feature type being analyzed by a given adapter
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FeatureType
     */
    public AdapterVersionEvaluationMetric withFeatureType(FeatureType featureType) {
        this.featureType = featureType.toString();
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
        if (getBaseline() != null)
            sb.append("Baseline: " + getBaseline() + ",");
        if (getAdapterVersion() != null)
            sb.append("AdapterVersion: " + getAdapterVersion() + ",");
        if (getFeatureType() != null)
            sb.append("FeatureType: " + getFeatureType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseline() == null) ? 0 : getBaseline().hashCode());
        hashCode = prime * hashCode
                + ((getAdapterVersion() == null) ? 0 : getAdapterVersion().hashCode());
        hashCode = prime * hashCode
                + ((getFeatureType() == null) ? 0 : getFeatureType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdapterVersionEvaluationMetric == false)
            return false;
        AdapterVersionEvaluationMetric other = (AdapterVersionEvaluationMetric) obj;

        if (other.getBaseline() == null ^ this.getBaseline() == null)
            return false;
        if (other.getBaseline() != null && other.getBaseline().equals(this.getBaseline()) == false)
            return false;
        if (other.getAdapterVersion() == null ^ this.getAdapterVersion() == null)
            return false;
        if (other.getAdapterVersion() != null
                && other.getAdapterVersion().equals(this.getAdapterVersion()) == false)
            return false;
        if (other.getFeatureType() == null ^ this.getFeatureType() == null)
            return false;
        if (other.getFeatureType() != null
                && other.getFeatureType().equals(this.getFeatureType()) == false)
            return false;
        return true;
    }
}
