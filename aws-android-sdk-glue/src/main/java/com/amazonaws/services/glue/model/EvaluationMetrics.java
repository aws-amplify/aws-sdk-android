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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * Evaluation metrics provide an estimate of the quality of your machine
 * learning transform.
 * </p>
 */
public class EvaluationMetrics implements Serializable {
    /**
     * <p>
     * The type of machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIND_MATCHES
     */
    private String transformType;

    /**
     * <p>
     * The evaluation metrics for the find matches algorithm.
     * </p>
     */
    private FindMatchesMetrics findMatchesMetrics;

    /**
     * <p>
     * The type of machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIND_MATCHES
     *
     * @return <p>
     *         The type of machine learning transform.
     *         </p>
     * @see TransformType
     */
    public String getTransformType() {
        return transformType;
    }

    /**
     * <p>
     * The type of machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIND_MATCHES
     *
     * @param transformType <p>
     *            The type of machine learning transform.
     *            </p>
     * @see TransformType
     */
    public void setTransformType(String transformType) {
        this.transformType = transformType;
    }

    /**
     * <p>
     * The type of machine learning transform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIND_MATCHES
     *
     * @param transformType <p>
     *            The type of machine learning transform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransformType
     */
    public EvaluationMetrics withTransformType(String transformType) {
        this.transformType = transformType;
        return this;
    }

    /**
     * <p>
     * The type of machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIND_MATCHES
     *
     * @param transformType <p>
     *            The type of machine learning transform.
     *            </p>
     * @see TransformType
     */
    public void setTransformType(TransformType transformType) {
        this.transformType = transformType.toString();
    }

    /**
     * <p>
     * The type of machine learning transform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIND_MATCHES
     *
     * @param transformType <p>
     *            The type of machine learning transform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransformType
     */
    public EvaluationMetrics withTransformType(TransformType transformType) {
        this.transformType = transformType.toString();
        return this;
    }

    /**
     * <p>
     * The evaluation metrics for the find matches algorithm.
     * </p>
     *
     * @return <p>
     *         The evaluation metrics for the find matches algorithm.
     *         </p>
     */
    public FindMatchesMetrics getFindMatchesMetrics() {
        return findMatchesMetrics;
    }

    /**
     * <p>
     * The evaluation metrics for the find matches algorithm.
     * </p>
     *
     * @param findMatchesMetrics <p>
     *            The evaluation metrics for the find matches algorithm.
     *            </p>
     */
    public void setFindMatchesMetrics(FindMatchesMetrics findMatchesMetrics) {
        this.findMatchesMetrics = findMatchesMetrics;
    }

    /**
     * <p>
     * The evaluation metrics for the find matches algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findMatchesMetrics <p>
     *            The evaluation metrics for the find matches algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationMetrics withFindMatchesMetrics(FindMatchesMetrics findMatchesMetrics) {
        this.findMatchesMetrics = findMatchesMetrics;
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
        if (getTransformType() != null)
            sb.append("TransformType: " + getTransformType() + ",");
        if (getFindMatchesMetrics() != null)
            sb.append("FindMatchesMetrics: " + getFindMatchesMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransformType() == null) ? 0 : getTransformType().hashCode());
        hashCode = prime * hashCode
                + ((getFindMatchesMetrics() == null) ? 0 : getFindMatchesMetrics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationMetrics == false)
            return false;
        EvaluationMetrics other = (EvaluationMetrics) obj;

        if (other.getTransformType() == null ^ this.getTransformType() == null)
            return false;
        if (other.getTransformType() != null
                && other.getTransformType().equals(this.getTransformType()) == false)
            return false;
        if (other.getFindMatchesMetrics() == null ^ this.getFindMatchesMetrics() == null)
            return false;
        if (other.getFindMatchesMetrics() != null
                && other.getFindMatchesMetrics().equals(this.getFindMatchesMetrics()) == false)
            return false;
        return true;
    }
}
