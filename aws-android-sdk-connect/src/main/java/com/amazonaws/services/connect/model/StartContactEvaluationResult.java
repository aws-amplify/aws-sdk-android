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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class StartContactEvaluationResult implements Serializable {
    /**
     * <p>
     * A unique identifier for the contact evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private String evaluationId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact evaluation resource.
     * </p>
     */
    private String evaluationArn;

    /**
     * <p>
     * A unique identifier for the contact evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return <p>
     *         A unique identifier for the contact evaluation.
     *         </p>
     */
    public String getEvaluationId() {
        return evaluationId;
    }

    /**
     * <p>
     * A unique identifier for the contact evaluation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param evaluationId <p>
     *            A unique identifier for the contact evaluation.
     *            </p>
     */
    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
    }

    /**
     * <p>
     * A unique identifier for the contact evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param evaluationId <p>
     *            A unique identifier for the contact evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartContactEvaluationResult withEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact evaluation resource.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the contact evaluation
     *         resource.
     *         </p>
     */
    public String getEvaluationArn() {
        return evaluationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact evaluation resource.
     * </p>
     *
     * @param evaluationArn <p>
     *            The Amazon Resource Name (ARN) for the contact evaluation
     *            resource.
     *            </p>
     */
    public void setEvaluationArn(String evaluationArn) {
        this.evaluationArn = evaluationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the contact evaluation resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluationArn <p>
     *            The Amazon Resource Name (ARN) for the contact evaluation
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartContactEvaluationResult withEvaluationArn(String evaluationArn) {
        this.evaluationArn = evaluationArn;
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
        if (getEvaluationId() != null)
            sb.append("EvaluationId: " + getEvaluationId() + ",");
        if (getEvaluationArn() != null)
            sb.append("EvaluationArn: " + getEvaluationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEvaluationId() == null) ? 0 : getEvaluationId().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationArn() == null) ? 0 : getEvaluationArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartContactEvaluationResult == false)
            return false;
        StartContactEvaluationResult other = (StartContactEvaluationResult) obj;

        if (other.getEvaluationId() == null ^ this.getEvaluationId() == null)
            return false;
        if (other.getEvaluationId() != null
                && other.getEvaluationId().equals(this.getEvaluationId()) == false)
            return false;
        if (other.getEvaluationArn() == null ^ this.getEvaluationArn() == null)
            return false;
        if (other.getEvaluationArn() != null
                && other.getEvaluationArn().equals(this.getEvaluationArn()) == false)
            return false;
        return true;
    }
}
