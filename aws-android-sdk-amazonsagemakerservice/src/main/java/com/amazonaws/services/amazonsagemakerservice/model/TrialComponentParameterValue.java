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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * The value of a hyperparameter. Only one of <code>NumberValue</code> or
 * <code>StringValue</code> can be specified.
 * </p>
 * <p>
 * This object is specified in the <a>CreateTrialComponent</a> request.
 * </p>
 */
public class TrialComponentParameterValue implements Serializable {
    /**
     * <p>
     * The string value of a categorical hyperparameter. If you specify a value
     * for this parameter, you can't specify the <code>NumberValue</code>
     * parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String stringValue;

    /**
     * <p>
     * The numeric value of a numeric hyperparameter. If you specify a value for
     * this parameter, you can't specify the <code>StringValue</code> parameter.
     * </p>
     */
    private Double numberValue;

    /**
     * <p>
     * The string value of a categorical hyperparameter. If you specify a value
     * for this parameter, you can't specify the <code>NumberValue</code>
     * parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The string value of a categorical hyperparameter. If you specify
     *         a value for this parameter, you can't specify the
     *         <code>NumberValue</code> parameter.
     *         </p>
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * <p>
     * The string value of a categorical hyperparameter. If you specify a value
     * for this parameter, you can't specify the <code>NumberValue</code>
     * parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param stringValue <p>
     *            The string value of a categorical hyperparameter. If you
     *            specify a value for this parameter, you can't specify the
     *            <code>NumberValue</code> parameter.
     *            </p>
     */
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * The string value of a categorical hyperparameter. If you specify a value
     * for this parameter, you can't specify the <code>NumberValue</code>
     * parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param stringValue <p>
     *            The string value of a categorical hyperparameter. If you
     *            specify a value for this parameter, you can't specify the
     *            <code>NumberValue</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentParameterValue withStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }

    /**
     * <p>
     * The numeric value of a numeric hyperparameter. If you specify a value for
     * this parameter, you can't specify the <code>StringValue</code> parameter.
     * </p>
     *
     * @return <p>
     *         The numeric value of a numeric hyperparameter. If you specify a
     *         value for this parameter, you can't specify the
     *         <code>StringValue</code> parameter.
     *         </p>
     */
    public Double getNumberValue() {
        return numberValue;
    }

    /**
     * <p>
     * The numeric value of a numeric hyperparameter. If you specify a value for
     * this parameter, you can't specify the <code>StringValue</code> parameter.
     * </p>
     *
     * @param numberValue <p>
     *            The numeric value of a numeric hyperparameter. If you specify
     *            a value for this parameter, you can't specify the
     *            <code>StringValue</code> parameter.
     *            </p>
     */
    public void setNumberValue(Double numberValue) {
        this.numberValue = numberValue;
    }

    /**
     * <p>
     * The numeric value of a numeric hyperparameter. If you specify a value for
     * this parameter, you can't specify the <code>StringValue</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberValue <p>
     *            The numeric value of a numeric hyperparameter. If you specify
     *            a value for this parameter, you can't specify the
     *            <code>StringValue</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentParameterValue withNumberValue(Double numberValue) {
        this.numberValue = numberValue;
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
        if (getStringValue() != null)
            sb.append("StringValue: " + getStringValue() + ",");
        if (getNumberValue() != null)
            sb.append("NumberValue: " + getNumberValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        hashCode = prime * hashCode
                + ((getNumberValue() == null) ? 0 : getNumberValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrialComponentParameterValue == false)
            return false;
        TrialComponentParameterValue other = (TrialComponentParameterValue) obj;

        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null
                && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        if (other.getNumberValue() == null ^ this.getNumberValue() == null)
            return false;
        if (other.getNumberValue() != null
                && other.getNumberValue().equals(this.getNumberValue()) == false)
            return false;
        return true;
    }
}
