/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class CreateEvaluationFormResult implements Serializable {
    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private String evaluationFormId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     */
    private String evaluationFormArn;

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return <p>
     *         The unique identifier for the evaluation form.
     *         </p>
     */
    public String getEvaluationFormId() {
        return evaluationFormId;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param evaluationFormId <p>
     *            The unique identifier for the evaluation form.
     *            </p>
     */
    public void setEvaluationFormId(String evaluationFormId) {
        this.evaluationFormId = evaluationFormId;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param evaluationFormId <p>
     *            The unique identifier for the evaluation form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEvaluationFormResult withEvaluationFormId(String evaluationFormId) {
        this.evaluationFormId = evaluationFormId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the evaluation form resource.
     *         </p>
     */
    public String getEvaluationFormArn() {
        return evaluationFormArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     *
     * @param evaluationFormArn <p>
     *            The Amazon Resource Name (ARN) for the evaluation form
     *            resource.
     *            </p>
     */
    public void setEvaluationFormArn(String evaluationFormArn) {
        this.evaluationFormArn = evaluationFormArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluationFormArn <p>
     *            The Amazon Resource Name (ARN) for the evaluation form
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEvaluationFormResult withEvaluationFormArn(String evaluationFormArn) {
        this.evaluationFormArn = evaluationFormArn;
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
        if (getEvaluationFormId() != null)
            sb.append("EvaluationFormId: " + getEvaluationFormId() + ",");
        if (getEvaluationFormArn() != null)
            sb.append("EvaluationFormArn: " + getEvaluationFormArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEvaluationFormId() == null) ? 0 : getEvaluationFormId().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationFormArn() == null) ? 0 : getEvaluationFormArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEvaluationFormResult == false)
            return false;
        CreateEvaluationFormResult other = (CreateEvaluationFormResult) obj;

        if (other.getEvaluationFormId() == null ^ this.getEvaluationFormId() == null)
            return false;
        if (other.getEvaluationFormId() != null
                && other.getEvaluationFormId().equals(this.getEvaluationFormId()) == false)
            return false;
        if (other.getEvaluationFormArn() == null ^ this.getEvaluationFormArn() == null)
            return false;
        if (other.getEvaluationFormArn() != null
                && other.getEvaluationFormArn().equals(this.getEvaluationFormArn()) == false)
            return false;
        return true;
    }
}
