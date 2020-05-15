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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The Parameter data type.
 * </p>
 */
public class Parameter implements Serializable {
    /**
     * <p>
     * The key associated with the parameter. If you don't specify a key and
     * value for a particular parameter, AWS CloudFormation uses the default
     * value that is specified in your template.
     * </p>
     */
    private String parameterKey;

    /**
     * <p>
     * The input value associated with the parameter.
     * </p>
     */
    private String parameterValue;

    /**
     * <p>
     * During a stack update, use the existing parameter value that the stack is
     * using for a given parameter key. If you specify <code>true</code>, do not
     * specify a parameter value.
     * </p>
     */
    private Boolean usePreviousValue;

    /**
     * <p>
     * Read-only. The value that corresponds to a Systems Manager parameter key.
     * This field is returned only for <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#aws-ssm-parameter-types"
     * > <code>SSM</code> parameter types</a> in the template.
     * </p>
     */
    private String resolvedValue;

    /**
     * <p>
     * The key associated with the parameter. If you don't specify a key and
     * value for a particular parameter, AWS CloudFormation uses the default
     * value that is specified in your template.
     * </p>
     *
     * @return <p>
     *         The key associated with the parameter. If you don't specify a key
     *         and value for a particular parameter, AWS CloudFormation uses the
     *         default value that is specified in your template.
     *         </p>
     */
    public String getParameterKey() {
        return parameterKey;
    }

    /**
     * <p>
     * The key associated with the parameter. If you don't specify a key and
     * value for a particular parameter, AWS CloudFormation uses the default
     * value that is specified in your template.
     * </p>
     *
     * @param parameterKey <p>
     *            The key associated with the parameter. If you don't specify a
     *            key and value for a particular parameter, AWS CloudFormation
     *            uses the default value that is specified in your template.
     *            </p>
     */
    public void setParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
    }

    /**
     * <p>
     * The key associated with the parameter. If you don't specify a key and
     * value for a particular parameter, AWS CloudFormation uses the default
     * value that is specified in your template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterKey <p>
     *            The key associated with the parameter. If you don't specify a
     *            key and value for a particular parameter, AWS CloudFormation
     *            uses the default value that is specified in your template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parameter withParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
        return this;
    }

    /**
     * <p>
     * The input value associated with the parameter.
     * </p>
     *
     * @return <p>
     *         The input value associated with the parameter.
     *         </p>
     */
    public String getParameterValue() {
        return parameterValue;
    }

    /**
     * <p>
     * The input value associated with the parameter.
     * </p>
     *
     * @param parameterValue <p>
     *            The input value associated with the parameter.
     *            </p>
     */
    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    /**
     * <p>
     * The input value associated with the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterValue <p>
     *            The input value associated with the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parameter withParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
        return this;
    }

    /**
     * <p>
     * During a stack update, use the existing parameter value that the stack is
     * using for a given parameter key. If you specify <code>true</code>, do not
     * specify a parameter value.
     * </p>
     *
     * @return <p>
     *         During a stack update, use the existing parameter value that the
     *         stack is using for a given parameter key. If you specify
     *         <code>true</code>, do not specify a parameter value.
     *         </p>
     */
    public Boolean isUsePreviousValue() {
        return usePreviousValue;
    }

    /**
     * <p>
     * During a stack update, use the existing parameter value that the stack is
     * using for a given parameter key. If you specify <code>true</code>, do not
     * specify a parameter value.
     * </p>
     *
     * @return <p>
     *         During a stack update, use the existing parameter value that the
     *         stack is using for a given parameter key. If you specify
     *         <code>true</code>, do not specify a parameter value.
     *         </p>
     */
    public Boolean getUsePreviousValue() {
        return usePreviousValue;
    }

    /**
     * <p>
     * During a stack update, use the existing parameter value that the stack is
     * using for a given parameter key. If you specify <code>true</code>, do not
     * specify a parameter value.
     * </p>
     *
     * @param usePreviousValue <p>
     *            During a stack update, use the existing parameter value that
     *            the stack is using for a given parameter key. If you specify
     *            <code>true</code>, do not specify a parameter value.
     *            </p>
     */
    public void setUsePreviousValue(Boolean usePreviousValue) {
        this.usePreviousValue = usePreviousValue;
    }

    /**
     * <p>
     * During a stack update, use the existing parameter value that the stack is
     * using for a given parameter key. If you specify <code>true</code>, do not
     * specify a parameter value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usePreviousValue <p>
     *            During a stack update, use the existing parameter value that
     *            the stack is using for a given parameter key. If you specify
     *            <code>true</code>, do not specify a parameter value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parameter withUsePreviousValue(Boolean usePreviousValue) {
        this.usePreviousValue = usePreviousValue;
        return this;
    }

    /**
     * <p>
     * Read-only. The value that corresponds to a Systems Manager parameter key.
     * This field is returned only for <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#aws-ssm-parameter-types"
     * > <code>SSM</code> parameter types</a> in the template.
     * </p>
     *
     * @return <p>
     *         Read-only. The value that corresponds to a Systems Manager
     *         parameter key. This field is returned only for <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#aws-ssm-parameter-types"
     *         > <code>SSM</code> parameter types</a> in the template.
     *         </p>
     */
    public String getResolvedValue() {
        return resolvedValue;
    }

    /**
     * <p>
     * Read-only. The value that corresponds to a Systems Manager parameter key.
     * This field is returned only for <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#aws-ssm-parameter-types"
     * > <code>SSM</code> parameter types</a> in the template.
     * </p>
     *
     * @param resolvedValue <p>
     *            Read-only. The value that corresponds to a Systems Manager
     *            parameter key. This field is returned only for <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#aws-ssm-parameter-types"
     *            > <code>SSM</code> parameter types</a> in the template.
     *            </p>
     */
    public void setResolvedValue(String resolvedValue) {
        this.resolvedValue = resolvedValue;
    }

    /**
     * <p>
     * Read-only. The value that corresponds to a Systems Manager parameter key.
     * This field is returned only for <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#aws-ssm-parameter-types"
     * > <code>SSM</code> parameter types</a> in the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resolvedValue <p>
     *            Read-only. The value that corresponds to a Systems Manager
     *            parameter key. This field is returned only for <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#aws-ssm-parameter-types"
     *            > <code>SSM</code> parameter types</a> in the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parameter withResolvedValue(String resolvedValue) {
        this.resolvedValue = resolvedValue;
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
        if (getParameterKey() != null)
            sb.append("ParameterKey: " + getParameterKey() + ",");
        if (getParameterValue() != null)
            sb.append("ParameterValue: " + getParameterValue() + ",");
        if (getUsePreviousValue() != null)
            sb.append("UsePreviousValue: " + getUsePreviousValue() + ",");
        if (getResolvedValue() != null)
            sb.append("ResolvedValue: " + getResolvedValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getParameterKey() == null) ? 0 : getParameterKey().hashCode());
        hashCode = prime * hashCode
                + ((getParameterValue() == null) ? 0 : getParameterValue().hashCode());
        hashCode = prime * hashCode
                + ((getUsePreviousValue() == null) ? 0 : getUsePreviousValue().hashCode());
        hashCode = prime * hashCode
                + ((getResolvedValue() == null) ? 0 : getResolvedValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Parameter == false)
            return false;
        Parameter other = (Parameter) obj;

        if (other.getParameterKey() == null ^ this.getParameterKey() == null)
            return false;
        if (other.getParameterKey() != null
                && other.getParameterKey().equals(this.getParameterKey()) == false)
            return false;
        if (other.getParameterValue() == null ^ this.getParameterValue() == null)
            return false;
        if (other.getParameterValue() != null
                && other.getParameterValue().equals(this.getParameterValue()) == false)
            return false;
        if (other.getUsePreviousValue() == null ^ this.getUsePreviousValue() == null)
            return false;
        if (other.getUsePreviousValue() != null
                && other.getUsePreviousValue().equals(this.getUsePreviousValue()) == false)
            return false;
        if (other.getResolvedValue() == null ^ this.getResolvedValue() == null)
            return false;
        if (other.getResolvedValue() != null
                && other.getResolvedValue().equals(this.getResolvedValue()) == false)
            return false;
        return true;
    }
}
