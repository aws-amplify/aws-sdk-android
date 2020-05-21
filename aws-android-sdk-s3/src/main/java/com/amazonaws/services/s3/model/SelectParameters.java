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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the parameters for Select job types.
 * </p>
 */
public class SelectParameters implements Serializable {
    /**
     * <p>
     * Describes the serialization format of the object.
     * </p>
     */
    private InputSerialization inputSerialization;

    /**
     * <p>
     * The type of the provided expression (for example, SQL).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SQL
     */
    private String expressionType;

    /**
     * <p>
     * The expression that is used to query the object.
     * </p>
     */
    private String expression;

    /**
     * <p>
     * Describes how the results of the Select job are serialized.
     * </p>
     */
    private OutputSerialization outputSerialization;

    /**
     * <p>
     * Describes the serialization format of the object.
     * </p>
     *
     * @return <p>
     *         Describes the serialization format of the object.
     *         </p>
     */
    public InputSerialization getInputSerialization() {
        return inputSerialization;
    }

    /**
     * <p>
     * Describes the serialization format of the object.
     * </p>
     *
     * @param inputSerialization <p>
     *            Describes the serialization format of the object.
     *            </p>
     */
    public void setInputSerialization(InputSerialization inputSerialization) {
        this.inputSerialization = inputSerialization;
    }

    /**
     * <p>
     * Describes the serialization format of the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputSerialization <p>
     *            Describes the serialization format of the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelectParameters withInputSerialization(InputSerialization inputSerialization) {
        this.inputSerialization = inputSerialization;
        return this;
    }

    /**
     * <p>
     * The type of the provided expression (for example, SQL).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SQL
     *
     * @return <p>
     *         The type of the provided expression (for example, SQL).
     *         </p>
     * @see ExpressionType
     */
    public String getExpressionType() {
        return expressionType;
    }

    /**
     * <p>
     * The type of the provided expression (for example, SQL).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SQL
     *
     * @param expressionType <p>
     *            The type of the provided expression (for example, SQL).
     *            </p>
     * @see ExpressionType
     */
    public void setExpressionType(String expressionType) {
        this.expressionType = expressionType;
    }

    /**
     * <p>
     * The type of the provided expression (for example, SQL).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SQL
     *
     * @param expressionType <p>
     *            The type of the provided expression (for example, SQL).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExpressionType
     */
    public SelectParameters withExpressionType(String expressionType) {
        this.expressionType = expressionType;
        return this;
    }

    /**
     * <p>
     * The type of the provided expression (for example, SQL).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SQL
     *
     * @param expressionType <p>
     *            The type of the provided expression (for example, SQL).
     *            </p>
     * @see ExpressionType
     */
    public void setExpressionType(ExpressionType expressionType) {
        this.expressionType = expressionType.toString();
    }

    /**
     * <p>
     * The type of the provided expression (for example, SQL).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SQL
     *
     * @param expressionType <p>
     *            The type of the provided expression (for example, SQL).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExpressionType
     */
    public SelectParameters withExpressionType(ExpressionType expressionType) {
        this.expressionType = expressionType.toString();
        return this;
    }

    /**
     * <p>
     * The expression that is used to query the object.
     * </p>
     *
     * @return <p>
     *         The expression that is used to query the object.
     *         </p>
     */
    public String getExpression() {
        return expression;
    }

    /**
     * <p>
     * The expression that is used to query the object.
     * </p>
     *
     * @param expression <p>
     *            The expression that is used to query the object.
     *            </p>
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The expression that is used to query the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expression <p>
     *            The expression that is used to query the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelectParameters withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * <p>
     * Describes how the results of the Select job are serialized.
     * </p>
     *
     * @return <p>
     *         Describes how the results of the Select job are serialized.
     *         </p>
     */
    public OutputSerialization getOutputSerialization() {
        return outputSerialization;
    }

    /**
     * <p>
     * Describes how the results of the Select job are serialized.
     * </p>
     *
     * @param outputSerialization <p>
     *            Describes how the results of the Select job are serialized.
     *            </p>
     */
    public void setOutputSerialization(OutputSerialization outputSerialization) {
        this.outputSerialization = outputSerialization;
    }

    /**
     * <p>
     * Describes how the results of the Select job are serialized.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputSerialization <p>
     *            Describes how the results of the Select job are serialized.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelectParameters withOutputSerialization(OutputSerialization outputSerialization) {
        this.outputSerialization = outputSerialization;
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
        if (getInputSerialization() != null)
            sb.append("InputSerialization: " + getInputSerialization() + ",");
        if (getExpressionType() != null)
            sb.append("ExpressionType: " + getExpressionType() + ",");
        if (getExpression() != null)
            sb.append("Expression: " + getExpression() + ",");
        if (getOutputSerialization() != null)
            sb.append("OutputSerialization: " + getOutputSerialization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInputSerialization() == null) ? 0 : getInputSerialization().hashCode());
        hashCode = prime * hashCode
                + ((getExpressionType() == null) ? 0 : getExpressionType().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode
                + ((getOutputSerialization() == null) ? 0 : getOutputSerialization().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelectParameters == false)
            return false;
        SelectParameters other = (SelectParameters) obj;

        if (other.getInputSerialization() == null ^ this.getInputSerialization() == null)
            return false;
        if (other.getInputSerialization() != null
                && other.getInputSerialization().equals(this.getInputSerialization()) == false)
            return false;
        if (other.getExpressionType() == null ^ this.getExpressionType() == null)
            return false;
        if (other.getExpressionType() != null
                && other.getExpressionType().equals(this.getExpressionType()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null
                && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getOutputSerialization() == null ^ this.getOutputSerialization() == null)
            return false;
        if (other.getOutputSerialization() != null
                && other.getOutputSerialization().equals(this.getOutputSerialization()) == false)
            return false;
        return true;
    }
}
