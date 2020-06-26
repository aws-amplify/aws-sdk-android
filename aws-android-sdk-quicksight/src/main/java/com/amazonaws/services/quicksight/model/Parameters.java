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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * Parameters.
 * </p>
 */
public class Parameters implements Serializable {
    /**
     * <p>
     * String parameters.
     * </p>
     */
    private java.util.List<StringParameter> stringParameters;

    /**
     * <p>
     * Integer parameters.
     * </p>
     */
    private java.util.List<IntegerParameter> integerParameters;

    /**
     * <p>
     * Decimal parameters.
     * </p>
     */
    private java.util.List<DecimalParameter> decimalParameters;

    /**
     * <p>
     * DateTime parameters.
     * </p>
     */
    private java.util.List<DateTimeParameter> dateTimeParameters;

    /**
     * <p>
     * String parameters.
     * </p>
     *
     * @return <p>
     *         String parameters.
     *         </p>
     */
    public java.util.List<StringParameter> getStringParameters() {
        return stringParameters;
    }

    /**
     * <p>
     * String parameters.
     * </p>
     *
     * @param stringParameters <p>
     *            String parameters.
     *            </p>
     */
    public void setStringParameters(java.util.Collection<StringParameter> stringParameters) {
        if (stringParameters == null) {
            this.stringParameters = null;
            return;
        }

        this.stringParameters = new java.util.ArrayList<StringParameter>(stringParameters);
    }

    /**
     * <p>
     * String parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringParameters <p>
     *            String parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parameters withStringParameters(StringParameter... stringParameters) {
        if (getStringParameters() == null) {
            this.stringParameters = new java.util.ArrayList<StringParameter>(
                    stringParameters.length);
        }
        for (StringParameter value : stringParameters) {
            this.stringParameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * String parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringParameters <p>
     *            String parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parameters withStringParameters(java.util.Collection<StringParameter> stringParameters) {
        setStringParameters(stringParameters);
        return this;
    }

    /**
     * <p>
     * Integer parameters.
     * </p>
     *
     * @return <p>
     *         Integer parameters.
     *         </p>
     */
    public java.util.List<IntegerParameter> getIntegerParameters() {
        return integerParameters;
    }

    /**
     * <p>
     * Integer parameters.
     * </p>
     *
     * @param integerParameters <p>
     *            Integer parameters.
     *            </p>
     */
    public void setIntegerParameters(java.util.Collection<IntegerParameter> integerParameters) {
        if (integerParameters == null) {
            this.integerParameters = null;
            return;
        }

        this.integerParameters = new java.util.ArrayList<IntegerParameter>(integerParameters);
    }

    /**
     * <p>
     * Integer parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integerParameters <p>
     *            Integer parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parameters withIntegerParameters(IntegerParameter... integerParameters) {
        if (getIntegerParameters() == null) {
            this.integerParameters = new java.util.ArrayList<IntegerParameter>(
                    integerParameters.length);
        }
        for (IntegerParameter value : integerParameters) {
            this.integerParameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Integer parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integerParameters <p>
     *            Integer parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parameters withIntegerParameters(java.util.Collection<IntegerParameter> integerParameters) {
        setIntegerParameters(integerParameters);
        return this;
    }

    /**
     * <p>
     * Decimal parameters.
     * </p>
     *
     * @return <p>
     *         Decimal parameters.
     *         </p>
     */
    public java.util.List<DecimalParameter> getDecimalParameters() {
        return decimalParameters;
    }

    /**
     * <p>
     * Decimal parameters.
     * </p>
     *
     * @param decimalParameters <p>
     *            Decimal parameters.
     *            </p>
     */
    public void setDecimalParameters(java.util.Collection<DecimalParameter> decimalParameters) {
        if (decimalParameters == null) {
            this.decimalParameters = null;
            return;
        }

        this.decimalParameters = new java.util.ArrayList<DecimalParameter>(decimalParameters);
    }

    /**
     * <p>
     * Decimal parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param decimalParameters <p>
     *            Decimal parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parameters withDecimalParameters(DecimalParameter... decimalParameters) {
        if (getDecimalParameters() == null) {
            this.decimalParameters = new java.util.ArrayList<DecimalParameter>(
                    decimalParameters.length);
        }
        for (DecimalParameter value : decimalParameters) {
            this.decimalParameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Decimal parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param decimalParameters <p>
     *            Decimal parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parameters withDecimalParameters(java.util.Collection<DecimalParameter> decimalParameters) {
        setDecimalParameters(decimalParameters);
        return this;
    }

    /**
     * <p>
     * DateTime parameters.
     * </p>
     *
     * @return <p>
     *         DateTime parameters.
     *         </p>
     */
    public java.util.List<DateTimeParameter> getDateTimeParameters() {
        return dateTimeParameters;
    }

    /**
     * <p>
     * DateTime parameters.
     * </p>
     *
     * @param dateTimeParameters <p>
     *            DateTime parameters.
     *            </p>
     */
    public void setDateTimeParameters(java.util.Collection<DateTimeParameter> dateTimeParameters) {
        if (dateTimeParameters == null) {
            this.dateTimeParameters = null;
            return;
        }

        this.dateTimeParameters = new java.util.ArrayList<DateTimeParameter>(dateTimeParameters);
    }

    /**
     * <p>
     * DateTime parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateTimeParameters <p>
     *            DateTime parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parameters withDateTimeParameters(DateTimeParameter... dateTimeParameters) {
        if (getDateTimeParameters() == null) {
            this.dateTimeParameters = new java.util.ArrayList<DateTimeParameter>(
                    dateTimeParameters.length);
        }
        for (DateTimeParameter value : dateTimeParameters) {
            this.dateTimeParameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * DateTime parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateTimeParameters <p>
     *            DateTime parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parameters withDateTimeParameters(
            java.util.Collection<DateTimeParameter> dateTimeParameters) {
        setDateTimeParameters(dateTimeParameters);
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
        if (getStringParameters() != null)
            sb.append("StringParameters: " + getStringParameters() + ",");
        if (getIntegerParameters() != null)
            sb.append("IntegerParameters: " + getIntegerParameters() + ",");
        if (getDecimalParameters() != null)
            sb.append("DecimalParameters: " + getDecimalParameters() + ",");
        if (getDateTimeParameters() != null)
            sb.append("DateTimeParameters: " + getDateTimeParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStringParameters() == null) ? 0 : getStringParameters().hashCode());
        hashCode = prime * hashCode
                + ((getIntegerParameters() == null) ? 0 : getIntegerParameters().hashCode());
        hashCode = prime * hashCode
                + ((getDecimalParameters() == null) ? 0 : getDecimalParameters().hashCode());
        hashCode = prime * hashCode
                + ((getDateTimeParameters() == null) ? 0 : getDateTimeParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Parameters == false)
            return false;
        Parameters other = (Parameters) obj;

        if (other.getStringParameters() == null ^ this.getStringParameters() == null)
            return false;
        if (other.getStringParameters() != null
                && other.getStringParameters().equals(this.getStringParameters()) == false)
            return false;
        if (other.getIntegerParameters() == null ^ this.getIntegerParameters() == null)
            return false;
        if (other.getIntegerParameters() != null
                && other.getIntegerParameters().equals(this.getIntegerParameters()) == false)
            return false;
        if (other.getDecimalParameters() == null ^ this.getDecimalParameters() == null)
            return false;
        if (other.getDecimalParameters() != null
                && other.getDecimalParameters().equals(this.getDecimalParameters()) == false)
            return false;
        if (other.getDateTimeParameters() == null ^ this.getDateTimeParameters() == null)
            return false;
        if (other.getDateTimeParameters() != null
                && other.getDateTimeParameters().equals(this.getDateTimeParameters()) == false)
            return false;
        return true;
    }
}
