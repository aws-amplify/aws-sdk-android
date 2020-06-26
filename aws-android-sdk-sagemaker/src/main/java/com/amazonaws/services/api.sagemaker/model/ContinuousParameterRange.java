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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * A list of continuous hyperparameters to tune.
 * </p>
 */
public class ContinuousParameterRange implements Serializable {
    /**
     * <p>
     * The name of the continuous hyperparameter to tune.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String name;

    /**
     * <p>
     * The minimum value for the hyperparameter. The tuning job uses
     * floating-point values between this value and <code>MaxValue</code>for
     * tuning.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String minValue;

    /**
     * <p>
     * The maximum value for the hyperparameter. The tuning job uses
     * floating-point values between <code>MinValue</code> value and this value
     * for tuning.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String maxValue;

    /**
     * <p>
     * The scale that hyperparameter tuning uses to search the hyperparameter
     * range. For information about choosing a hyperparameter scale, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     * >Hyperparameter Scaling</a>. One of the following values:
     * </p>
     * <dl>
     * <dt>Auto</dt>
     * <dd>
     * <p>
     * Amazon SageMaker hyperparameter tuning chooses the best scale for the
     * hyperparameter.
     * </p>
     * </dd>
     * <dt>Linear</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by
     * using a linear scale.
     * </p>
     * </dd>
     * <dt>Logarithmic</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by
     * using a logarithmic scale.
     * </p>
     * <p>
     * Logarithmic scaling works only for ranges that have only values greater
     * than 0.
     * </p>
     * </dd>
     * <dt>ReverseLogarithmic</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by
     * using a reverse logarithmic scale.
     * </p>
     * <p>
     * Reverse logarithmic scaling works only for ranges that are entirely
     * within the range 0&lt;=x&lt;1.0.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Linear, Logarithmic, ReverseLogarithmic
     */
    private String scalingType;

    /**
     * <p>
     * The name of the continuous hyperparameter to tune.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The name of the continuous hyperparameter to tune.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the continuous hyperparameter to tune.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param name <p>
     *            The name of the continuous hyperparameter to tune.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the continuous hyperparameter to tune.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param name <p>
     *            The name of the continuous hyperparameter to tune.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContinuousParameterRange withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The minimum value for the hyperparameter. The tuning job uses
     * floating-point values between this value and <code>MaxValue</code>for
     * tuning.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The minimum value for the hyperparameter. The tuning job uses
     *         floating-point values between this value and
     *         <code>MaxValue</code>for tuning.
     *         </p>
     */
    public String getMinValue() {
        return minValue;
    }

    /**
     * <p>
     * The minimum value for the hyperparameter. The tuning job uses
     * floating-point values between this value and <code>MaxValue</code>for
     * tuning.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param minValue <p>
     *            The minimum value for the hyperparameter. The tuning job uses
     *            floating-point values between this value and
     *            <code>MaxValue</code>for tuning.
     *            </p>
     */
    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    /**
     * <p>
     * The minimum value for the hyperparameter. The tuning job uses
     * floating-point values between this value and <code>MaxValue</code>for
     * tuning.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param minValue <p>
     *            The minimum value for the hyperparameter. The tuning job uses
     *            floating-point values between this value and
     *            <code>MaxValue</code>for tuning.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContinuousParameterRange withMinValue(String minValue) {
        this.minValue = minValue;
        return this;
    }

    /**
     * <p>
     * The maximum value for the hyperparameter. The tuning job uses
     * floating-point values between <code>MinValue</code> value and this value
     * for tuning.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The maximum value for the hyperparameter. The tuning job uses
     *         floating-point values between <code>MinValue</code> value and
     *         this value for tuning.
     *         </p>
     */
    public String getMaxValue() {
        return maxValue;
    }

    /**
     * <p>
     * The maximum value for the hyperparameter. The tuning job uses
     * floating-point values between <code>MinValue</code> value and this value
     * for tuning.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param maxValue <p>
     *            The maximum value for the hyperparameter. The tuning job uses
     *            floating-point values between <code>MinValue</code> value and
     *            this value for tuning.
     *            </p>
     */
    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * <p>
     * The maximum value for the hyperparameter. The tuning job uses
     * floating-point values between <code>MinValue</code> value and this value
     * for tuning.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param maxValue <p>
     *            The maximum value for the hyperparameter. The tuning job uses
     *            floating-point values between <code>MinValue</code> value and
     *            this value for tuning.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContinuousParameterRange withMaxValue(String maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /**
     * <p>
     * The scale that hyperparameter tuning uses to search the hyperparameter
     * range. For information about choosing a hyperparameter scale, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     * >Hyperparameter Scaling</a>. One of the following values:
     * </p>
     * <dl>
     * <dt>Auto</dt>
     * <dd>
     * <p>
     * Amazon SageMaker hyperparameter tuning chooses the best scale for the
     * hyperparameter.
     * </p>
     * </dd>
     * <dt>Linear</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by
     * using a linear scale.
     * </p>
     * </dd>
     * <dt>Logarithmic</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by
     * using a logarithmic scale.
     * </p>
     * <p>
     * Logarithmic scaling works only for ranges that have only values greater
     * than 0.
     * </p>
     * </dd>
     * <dt>ReverseLogarithmic</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by
     * using a reverse logarithmic scale.
     * </p>
     * <p>
     * Reverse logarithmic scaling works only for ranges that are entirely
     * within the range 0&lt;=x&lt;1.0.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Linear, Logarithmic, ReverseLogarithmic
     *
     * @return <p>
     *         The scale that hyperparameter tuning uses to search the
     *         hyperparameter range. For information about choosing a
     *         hyperparameter scale, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     *         >Hyperparameter Scaling</a>. One of the following values:
     *         </p>
     *         <dl>
     *         <dt>Auto</dt>
     *         <dd>
     *         <p>
     *         Amazon SageMaker hyperparameter tuning chooses the best scale for
     *         the hyperparameter.
     *         </p>
     *         </dd>
     *         <dt>Linear</dt>
     *         <dd>
     *         <p>
     *         Hyperparameter tuning searches the values in the hyperparameter
     *         range by using a linear scale.
     *         </p>
     *         </dd>
     *         <dt>Logarithmic</dt>
     *         <dd>
     *         <p>
     *         Hyperparameter tuning searches the values in the hyperparameter
     *         range by using a logarithmic scale.
     *         </p>
     *         <p>
     *         Logarithmic scaling works only for ranges that have only values
     *         greater than 0.
     *         </p>
     *         </dd>
     *         <dt>ReverseLogarithmic</dt>
     *         <dd>
     *         <p>
     *         Hyperparameter tuning searches the values in the hyperparameter
     *         range by using a reverse logarithmic scale.
     *         </p>
     *         <p>
     *         Reverse logarithmic scaling works only for ranges that are
     *         entirely within the range 0&lt;=x&lt;1.0.
     *         </p>
     *         </dd>
     *         </dl>
     * @see HyperParameterScalingType
     */
    public String getScalingType() {
        return scalingType;
    }

    /**
     * <p>
     * The scale that hyperparameter tuning uses to search the hyperparameter
     * range. For information about choosing a hyperparameter scale, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     * >Hyperparameter Scaling</a>. One of the following values:
     * </p>
     * <dl>
     * <dt>Auto</dt>
     * <dd>
     * <p>
     * Amazon SageMaker hyperparameter tuning chooses the best scale for the
     * hyperparameter.
     * </p>
     * </dd>
     * <dt>Linear</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by
     * using a linear scale.
     * </p>
     * </dd>
     * <dt>Logarithmic</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by
     * using a logarithmic scale.
     * </p>
     * <p>
     * Logarithmic scaling works only for ranges that have only values greater
     * than 0.
     * </p>
     * </dd>
     * <dt>ReverseLogarithmic</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by
     * using a reverse logarithmic scale.
     * </p>
     * <p>
     * Reverse logarithmic scaling works only for ranges that are entirely
     * within the range 0&lt;=x&lt;1.0.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Linear, Logarithmic, ReverseLogarithmic
     *
     * @param scalingType <p>
     *            The scale that hyperparameter tuning uses to search the
     *            hyperparameter range. For information about choosing a
     *            hyperparameter scale, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     *            >Hyperparameter Scaling</a>. One of the following values:
     *            </p>
     *            <dl>
     *            <dt>Auto</dt>
     *            <dd>
     *            <p>
     *            Amazon SageMaker hyperparameter tuning chooses the best scale
     *            for the hyperparameter.
     *            </p>
     *            </dd>
     *            <dt>Linear</dt>
     *            <dd>
     *            <p>
     *            Hyperparameter tuning searches the values in the
     *            hyperparameter range by using a linear scale.
     *            </p>
     *            </dd>
     *            <dt>Logarithmic</dt>
     *            <dd>
     *            <p>
     *            Hyperparameter tuning searches the values in the
     *            hyperparameter range by using a logarithmic scale.
     *            </p>
     *            <p>
     *            Logarithmic scaling works only for ranges that have only
     *            values greater than 0.
     *            </p>
     *            </dd>
     *            <dt>ReverseLogarithmic</dt>
     *            <dd>
     *            <p>
     *            Hyperparameter tuning searches the values in the
     *            hyperparameter range by using a reverse logarithmic scale.
     *            </p>
     *            <p>
     *            Reverse logarithmic scaling works only for ranges that are
     *            entirely within the range 0&lt;=x&lt;1.0.
     *            </p>
     *            </dd>
     *            </dl>
     * @see HyperParameterScalingType
     */
    public void setScalingType(String scalingType) {
        this.scalingType = scalingType;
    }

    /**
     * <p>
     * The scale that hyperparameter tuning uses to search the hyperparameter
     * range. For information about choosing a hyperparameter scale, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     * >Hyperparameter Scaling</a>. One of the following values:
     * </p>
     * <dl>
     * <dt>Auto</dt>
     * <dd>
     * <p>
     * Amazon SageMaker hyperparameter tuning chooses the best scale for the
     * hyperparameter.
     * </p>
     * </dd>
     * <dt>Linear</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by
     * using a linear scale.
     * </p>
     * </dd>
     * <dt>Logarithmic</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by
     * using a logarithmic scale.
     * </p>
     * <p>
     * Logarithmic scaling works only for ranges that have only values greater
     * than 0.
     * </p>
     * </dd>
     * <dt>ReverseLogarithmic</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by
     * using a reverse logarithmic scale.
     * </p>
     * <p>
     * Reverse logarithmic scaling works only for ranges that are entirely
     * within the range 0&lt;=x&lt;1.0.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Linear, Logarithmic, ReverseLogarithmic
     *
     * @param scalingType <p>
     *            The scale that hyperparameter tuning uses to search the
     *            hyperparameter range. For information about choosing a
     *            hyperparameter scale, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     *            >Hyperparameter Scaling</a>. One of the following values:
     *            </p>
     *            <dl>
     *            <dt>Auto</dt>
     *            <dd>
     *            <p>
     *            Amazon SageMaker hyperparameter tuning chooses the best scale
     *            for the hyperparameter.
     *            </p>
     *            </dd>
     *            <dt>Linear</dt>
     *            <dd>
     *            <p>
     *            Hyperparameter tuning searches the values in the
     *            hyperparameter range by using a linear scale.
     *            </p>
     *            </dd>
     *            <dt>Logarithmic</dt>
     *            <dd>
     *            <p>
     *            Hyperparameter tuning searches the values in the
     *            hyperparameter range by using a logarithmic scale.
     *            </p>
     *            <p>
     *            Logarithmic scaling works only for ranges that have only
     *            values greater than 0.
     *            </p>
     *            </dd>
     *            <dt>ReverseLogarithmic</dt>
     *            <dd>
     *            <p>
     *            Hyperparameter tuning searches the values in the
     *            hyperparameter range by using a reverse logarithmic scale.
     *            </p>
     *            <p>
     *            Reverse logarithmic scaling works only for ranges that are
     *            entirely within the range 0&lt;=x&lt;1.0.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HyperParameterScalingType
     */
    public ContinuousParameterRange withScalingType(String scalingType) {
        this.scalingType = scalingType;
        return this;
    }

    /**
     * <p>
     * The scale that hyperparameter tuning uses to search the hyperparameter
     * range. For information about choosing a hyperparameter scale, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     * >Hyperparameter Scaling</a>. One of the following values:
     * </p>
     * <dl>
     * <dt>Auto</dt>
     * <dd>
     * <p>
     * Amazon SageMaker hyperparameter tuning chooses the best scale for the
     * hyperparameter.
     * </p>
     * </dd>
     * <dt>Linear</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by
     * using a linear scale.
     * </p>
     * </dd>
     * <dt>Logarithmic</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by
     * using a logarithmic scale.
     * </p>
     * <p>
     * Logarithmic scaling works only for ranges that have only values greater
     * than 0.
     * </p>
     * </dd>
     * <dt>ReverseLogarithmic</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by
     * using a reverse logarithmic scale.
     * </p>
     * <p>
     * Reverse logarithmic scaling works only for ranges that are entirely
     * within the range 0&lt;=x&lt;1.0.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Linear, Logarithmic, ReverseLogarithmic
     *
     * @param scalingType <p>
     *            The scale that hyperparameter tuning uses to search the
     *            hyperparameter range. For information about choosing a
     *            hyperparameter scale, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     *            >Hyperparameter Scaling</a>. One of the following values:
     *            </p>
     *            <dl>
     *            <dt>Auto</dt>
     *            <dd>
     *            <p>
     *            Amazon SageMaker hyperparameter tuning chooses the best scale
     *            for the hyperparameter.
     *            </p>
     *            </dd>
     *            <dt>Linear</dt>
     *            <dd>
     *            <p>
     *            Hyperparameter tuning searches the values in the
     *            hyperparameter range by using a linear scale.
     *            </p>
     *            </dd>
     *            <dt>Logarithmic</dt>
     *            <dd>
     *            <p>
     *            Hyperparameter tuning searches the values in the
     *            hyperparameter range by using a logarithmic scale.
     *            </p>
     *            <p>
     *            Logarithmic scaling works only for ranges that have only
     *            values greater than 0.
     *            </p>
     *            </dd>
     *            <dt>ReverseLogarithmic</dt>
     *            <dd>
     *            <p>
     *            Hyperparameter tuning searches the values in the
     *            hyperparameter range by using a reverse logarithmic scale.
     *            </p>
     *            <p>
     *            Reverse logarithmic scaling works only for ranges that are
     *            entirely within the range 0&lt;=x&lt;1.0.
     *            </p>
     *            </dd>
     *            </dl>
     * @see HyperParameterScalingType
     */
    public void setScalingType(HyperParameterScalingType scalingType) {
        this.scalingType = scalingType.toString();
    }

    /**
     * <p>
     * The scale that hyperparameter tuning uses to search the hyperparameter
     * range. For information about choosing a hyperparameter scale, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     * >Hyperparameter Scaling</a>. One of the following values:
     * </p>
     * <dl>
     * <dt>Auto</dt>
     * <dd>
     * <p>
     * Amazon SageMaker hyperparameter tuning chooses the best scale for the
     * hyperparameter.
     * </p>
     * </dd>
     * <dt>Linear</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by
     * using a linear scale.
     * </p>
     * </dd>
     * <dt>Logarithmic</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by
     * using a logarithmic scale.
     * </p>
     * <p>
     * Logarithmic scaling works only for ranges that have only values greater
     * than 0.
     * </p>
     * </dd>
     * <dt>ReverseLogarithmic</dt>
     * <dd>
     * <p>
     * Hyperparameter tuning searches the values in the hyperparameter range by
     * using a reverse logarithmic scale.
     * </p>
     * <p>
     * Reverse logarithmic scaling works only for ranges that are entirely
     * within the range 0&lt;=x&lt;1.0.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Linear, Logarithmic, ReverseLogarithmic
     *
     * @param scalingType <p>
     *            The scale that hyperparameter tuning uses to search the
     *            hyperparameter range. For information about choosing a
     *            hyperparameter scale, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/automatic-model-tuning-define-ranges.html#scaling-type"
     *            >Hyperparameter Scaling</a>. One of the following values:
     *            </p>
     *            <dl>
     *            <dt>Auto</dt>
     *            <dd>
     *            <p>
     *            Amazon SageMaker hyperparameter tuning chooses the best scale
     *            for the hyperparameter.
     *            </p>
     *            </dd>
     *            <dt>Linear</dt>
     *            <dd>
     *            <p>
     *            Hyperparameter tuning searches the values in the
     *            hyperparameter range by using a linear scale.
     *            </p>
     *            </dd>
     *            <dt>Logarithmic</dt>
     *            <dd>
     *            <p>
     *            Hyperparameter tuning searches the values in the
     *            hyperparameter range by using a logarithmic scale.
     *            </p>
     *            <p>
     *            Logarithmic scaling works only for ranges that have only
     *            values greater than 0.
     *            </p>
     *            </dd>
     *            <dt>ReverseLogarithmic</dt>
     *            <dd>
     *            <p>
     *            Hyperparameter tuning searches the values in the
     *            hyperparameter range by using a reverse logarithmic scale.
     *            </p>
     *            <p>
     *            Reverse logarithmic scaling works only for ranges that are
     *            entirely within the range 0&lt;=x&lt;1.0.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HyperParameterScalingType
     */
    public ContinuousParameterRange withScalingType(HyperParameterScalingType scalingType) {
        this.scalingType = scalingType.toString();
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getMinValue() != null)
            sb.append("MinValue: " + getMinValue() + ",");
        if (getMaxValue() != null)
            sb.append("MaxValue: " + getMaxValue() + ",");
        if (getScalingType() != null)
            sb.append("ScalingType: " + getScalingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMinValue() == null) ? 0 : getMinValue().hashCode());
        hashCode = prime * hashCode + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
        hashCode = prime * hashCode
                + ((getScalingType() == null) ? 0 : getScalingType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContinuousParameterRange == false)
            return false;
        ContinuousParameterRange other = (ContinuousParameterRange) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMinValue() == null ^ this.getMinValue() == null)
            return false;
        if (other.getMinValue() != null && other.getMinValue().equals(this.getMinValue()) == false)
            return false;
        if (other.getMaxValue() == null ^ this.getMaxValue() == null)
            return false;
        if (other.getMaxValue() != null && other.getMaxValue().equals(this.getMaxValue()) == false)
            return false;
        if (other.getScalingType() == null ^ this.getScalingType() == null)
            return false;
        if (other.getScalingType() != null
                && other.getScalingType().equals(this.getScalingType()) == false)
            return false;
        return true;
    }
}
