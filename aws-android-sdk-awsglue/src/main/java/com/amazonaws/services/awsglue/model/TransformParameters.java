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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * The algorithm-specific parameters that are associated with the machine
 * learning transform.
 * </p>
 */
public class TransformParameters implements Serializable {
    /**
     * <p>
     * The type of machine learning transform.
     * </p>
     * <p>
     * For information about the types of machine learning transforms, see <a
     * href=
     * "http://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html"
     * >Creating Machine Learning Transforms</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIND_MATCHES
     */
    private String transformType;

    /**
     * <p>
     * The parameters for the find matches algorithm.
     * </p>
     */
    private FindMatchesParameters findMatchesParameters;

    /**
     * <p>
     * The type of machine learning transform.
     * </p>
     * <p>
     * For information about the types of machine learning transforms, see <a
     * href=
     * "http://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html"
     * >Creating Machine Learning Transforms</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIND_MATCHES
     *
     * @return <p>
     *         The type of machine learning transform.
     *         </p>
     *         <p>
     *         For information about the types of machine learning transforms,
     *         see <a href=
     *         "http://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html"
     *         >Creating Machine Learning Transforms</a>.
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
     * For information about the types of machine learning transforms, see <a
     * href=
     * "http://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html"
     * >Creating Machine Learning Transforms</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIND_MATCHES
     *
     * @param transformType <p>
     *            The type of machine learning transform.
     *            </p>
     *            <p>
     *            For information about the types of machine learning
     *            transforms, see <a href=
     *            "http://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html"
     *            >Creating Machine Learning Transforms</a>.
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
     * For information about the types of machine learning transforms, see <a
     * href=
     * "http://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html"
     * >Creating Machine Learning Transforms</a>.
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
     *            <p>
     *            For information about the types of machine learning
     *            transforms, see <a href=
     *            "http://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html"
     *            >Creating Machine Learning Transforms</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransformType
     */
    public TransformParameters withTransformType(String transformType) {
        this.transformType = transformType;
        return this;
    }

    /**
     * <p>
     * The type of machine learning transform.
     * </p>
     * <p>
     * For information about the types of machine learning transforms, see <a
     * href=
     * "http://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html"
     * >Creating Machine Learning Transforms</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIND_MATCHES
     *
     * @param transformType <p>
     *            The type of machine learning transform.
     *            </p>
     *            <p>
     *            For information about the types of machine learning
     *            transforms, see <a href=
     *            "http://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html"
     *            >Creating Machine Learning Transforms</a>.
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
     * For information about the types of machine learning transforms, see <a
     * href=
     * "http://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html"
     * >Creating Machine Learning Transforms</a>.
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
     *            <p>
     *            For information about the types of machine learning
     *            transforms, see <a href=
     *            "http://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html"
     *            >Creating Machine Learning Transforms</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransformType
     */
    public TransformParameters withTransformType(TransformType transformType) {
        this.transformType = transformType.toString();
        return this;
    }

    /**
     * <p>
     * The parameters for the find matches algorithm.
     * </p>
     *
     * @return <p>
     *         The parameters for the find matches algorithm.
     *         </p>
     */
    public FindMatchesParameters getFindMatchesParameters() {
        return findMatchesParameters;
    }

    /**
     * <p>
     * The parameters for the find matches algorithm.
     * </p>
     *
     * @param findMatchesParameters <p>
     *            The parameters for the find matches algorithm.
     *            </p>
     */
    public void setFindMatchesParameters(FindMatchesParameters findMatchesParameters) {
        this.findMatchesParameters = findMatchesParameters;
    }

    /**
     * <p>
     * The parameters for the find matches algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findMatchesParameters <p>
     *            The parameters for the find matches algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformParameters withFindMatchesParameters(FindMatchesParameters findMatchesParameters) {
        this.findMatchesParameters = findMatchesParameters;
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
        if (getFindMatchesParameters() != null)
            sb.append("FindMatchesParameters: " + getFindMatchesParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransformType() == null) ? 0 : getTransformType().hashCode());
        hashCode = prime
                * hashCode
                + ((getFindMatchesParameters() == null) ? 0 : getFindMatchesParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransformParameters == false)
            return false;
        TransformParameters other = (TransformParameters) obj;

        if (other.getTransformType() == null ^ this.getTransformType() == null)
            return false;
        if (other.getTransformType() != null
                && other.getTransformType().equals(this.getTransformType()) == false)
            return false;
        if (other.getFindMatchesParameters() == null ^ this.getFindMatchesParameters() == null)
            return false;
        if (other.getFindMatchesParameters() != null
                && other.getFindMatchesParameters().equals(this.getFindMatchesParameters()) == false)
            return false;
        return true;
    }
}
