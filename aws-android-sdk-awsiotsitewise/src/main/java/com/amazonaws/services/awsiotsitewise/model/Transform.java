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

package com.amazonaws.services.awsiotsitewise.model;

import java.io.Serializable;

/**
 * <p>
 * Contains an asset transform property. A transform is a one-to-one mapping of
 * a property's data points from one form to another. For example, you can use a
 * transform to convert a Celsius data stream to Fahrenheit by applying the
 * transformation expression to each data point of the Celsius stream. A
 * transform can only have a data type of <code>DOUBLE</code> and consume
 * properties with data types of <code>INTEGER</code> or <code>DOUBLE</code>.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html#transforms"
 * >Transforms</a> in the <i>AWS IoT SiteWise User Guide</i>.
 * </p>
 */
public class Transform implements Serializable {
    /**
     * <p>
     * The mathematical expression that defines the transformation function. You
     * can specify up to 10 variables per expression. You can specify up to 10
     * functions per expression.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     * >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[a-z0-9._+\-*%/^, ()]+$<br/>
     */
    private String expression;

    /**
     * <p>
     * The list of variables used in the expression.
     * </p>
     */
    private java.util.List<ExpressionVariable> variables;

    /**
     * <p>
     * The mathematical expression that defines the transformation function. You
     * can specify up to 10 variables per expression. You can specify up to 10
     * functions per expression.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     * >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[a-z0-9._+\-*%/^, ()]+$<br/>
     *
     * @return <p>
     *         The mathematical expression that defines the transformation
     *         function. You can specify up to 10 variables per expression. You
     *         can specify up to 10 functions per expression.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     *         >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     *         </p>
     */
    public String getExpression() {
        return expression;
    }

    /**
     * <p>
     * The mathematical expression that defines the transformation function. You
     * can specify up to 10 variables per expression. You can specify up to 10
     * functions per expression.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     * >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[a-z0-9._+\-*%/^, ()]+$<br/>
     *
     * @param expression <p>
     *            The mathematical expression that defines the transformation
     *            function. You can specify up to 10 variables per expression.
     *            You can specify up to 10 functions per expression.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     *            >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The mathematical expression that defines the transformation function. You
     * can specify up to 10 variables per expression. You can specify up to 10
     * functions per expression.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     * >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[a-z0-9._+\-*%/^, ()]+$<br/>
     *
     * @param expression <p>
     *            The mathematical expression that defines the transformation
     *            function. You can specify up to 10 variables per expression.
     *            You can specify up to 10 functions per expression.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html"
     *            >Quotas</a> in the <i>AWS IoT SiteWise User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Transform withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * <p>
     * The list of variables used in the expression.
     * </p>
     *
     * @return <p>
     *         The list of variables used in the expression.
     *         </p>
     */
    public java.util.List<ExpressionVariable> getVariables() {
        return variables;
    }

    /**
     * <p>
     * The list of variables used in the expression.
     * </p>
     *
     * @param variables <p>
     *            The list of variables used in the expression.
     *            </p>
     */
    public void setVariables(java.util.Collection<ExpressionVariable> variables) {
        if (variables == null) {
            this.variables = null;
            return;
        }

        this.variables = new java.util.ArrayList<ExpressionVariable>(variables);
    }

    /**
     * <p>
     * The list of variables used in the expression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param variables <p>
     *            The list of variables used in the expression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Transform withVariables(ExpressionVariable... variables) {
        if (getVariables() == null) {
            this.variables = new java.util.ArrayList<ExpressionVariable>(variables.length);
        }
        for (ExpressionVariable value : variables) {
            this.variables.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of variables used in the expression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param variables <p>
     *            The list of variables used in the expression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Transform withVariables(java.util.Collection<ExpressionVariable> variables) {
        setVariables(variables);
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
        if (getExpression() != null)
            sb.append("expression: " + getExpression() + ",");
        if (getVariables() != null)
            sb.append("variables: " + getVariables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Transform == false)
            return false;
        Transform other = (Transform) obj;

        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null
                && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null
                && other.getVariables().equals(this.getVariables()) == false)
            return false;
        return true;
    }
}
