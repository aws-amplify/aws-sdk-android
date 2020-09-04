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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


public class LabelParameterVersionResult implements Serializable {
    /**
     * <p>The label does not meet the requirements. For information about parameter label requirements, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html">Labeling parameters</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     */
    private java.util.List<String> invalidLabels;

    /**
     * <p>The version of the parameter that has been labeled.</p>
     */
    private Long parameterVersion;

    /**
     * <p>The label does not meet the requirements. For information about parameter label requirements, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html">Labeling parameters</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @return <p>The label does not meet the requirements. For information about parameter label requirements, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html">Labeling parameters</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     */
    public java.util.List<String> getInvalidLabels() {
        return invalidLabels;
    }

    /**
     * <p>The label does not meet the requirements. For information about parameter label requirements, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html">Labeling parameters</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @param invalidLabels <p>The label does not meet the requirements. For information about parameter label requirements, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html">Labeling parameters</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     */
    public void setInvalidLabels(java.util.Collection<String> invalidLabels) {
        if (invalidLabels == null) {
            this.invalidLabels = null;
            return;
        }

        this.invalidLabels = new java.util.ArrayList<String>(invalidLabels);
    }

    /**
     * <p>The label does not meet the requirements. For information about parameter label requirements, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html">Labeling parameters</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param invalidLabels <p>The label does not meet the requirements. For information about parameter label requirements, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html">Labeling parameters</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public LabelParameterVersionResult withInvalidLabels(String... invalidLabels) {
        if (getInvalidLabels() == null) {
            this.invalidLabels = new java.util.ArrayList<String>(invalidLabels.length);
        }
        for (String value : invalidLabels) {
            this.invalidLabels.add(value);
        }
        return this;
    }

    /**
     * <p>The label does not meet the requirements. For information about parameter label requirements, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html">Labeling parameters</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param invalidLabels <p>The label does not meet the requirements. For information about parameter label requirements, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html">Labeling parameters</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public LabelParameterVersionResult withInvalidLabels(java.util.Collection<String> invalidLabels) {
        setInvalidLabels(invalidLabels);
        return this;
    }

    /**
     * <p>The version of the parameter that has been labeled.</p>
     *
     * @return <p>The version of the parameter that has been labeled.</p>
     */
    public Long getParameterVersion() {
        return parameterVersion;
    }

    /**
     * <p>The version of the parameter that has been labeled.</p>
     *
     * @param parameterVersion <p>The version of the parameter that has been labeled.</p>
     */
    public void setParameterVersion(Long parameterVersion) {
        this.parameterVersion = parameterVersion;
    }

    /**
     * <p>The version of the parameter that has been labeled.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterVersion <p>The version of the parameter that has been labeled.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public LabelParameterVersionResult withParameterVersion(Long parameterVersion) {
        this.parameterVersion = parameterVersion;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInvalidLabels() != null) sb.append("InvalidLabels: " + getInvalidLabels() + ",");
        if (getParameterVersion() != null) sb.append("ParameterVersion: " + getParameterVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvalidLabels() == null) ? 0 : getInvalidLabels().hashCode());
        hashCode = prime * hashCode + ((getParameterVersion() == null) ? 0 : getParameterVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LabelParameterVersionResult == false) return false;
        LabelParameterVersionResult other = (LabelParameterVersionResult)obj;

        if (other.getInvalidLabels() == null ^ this.getInvalidLabels() == null) return false;
        if (other.getInvalidLabels() != null && other.getInvalidLabels().equals(this.getInvalidLabels()) == false) return false;
        if (other.getParameterVersion() == null ^ this.getParameterVersion() == null) return false;
        if (other.getParameterVersion() != null && other.getParameterVersion().equals(this.getParameterVersion()) == false) return false;
        return true;
    }
}
