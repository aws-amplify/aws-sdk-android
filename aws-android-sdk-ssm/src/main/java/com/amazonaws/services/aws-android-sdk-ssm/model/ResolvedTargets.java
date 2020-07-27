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


/**
 * <p>Information about targets that resolved during the Automation execution.</p>
 */
public class ResolvedTargets implements Serializable {
    /**
     * <p>A list of parameter values sent to targets that resolved during the Automation execution.</p>
     */
    private java.util.List<String> parameterValues;

    /**
     * <p>A boolean value indicating whether the resolved target list is truncated.</p>
     */
    private Boolean truncated;

    /**
     * <p>A list of parameter values sent to targets that resolved during the Automation execution.</p>
     *
     * @return <p>A list of parameter values sent to targets that resolved during the Automation execution.</p>
     */
    public java.util.List<String> getParameterValues() {
        return parameterValues;
    }

    /**
     * <p>A list of parameter values sent to targets that resolved during the Automation execution.</p>
     *
     * @param parameterValues <p>A list of parameter values sent to targets that resolved during the Automation execution.</p>
     */
    public void setParameterValues(java.util.Collection<String> parameterValues) {
        if (parameterValues == null) {
            this.parameterValues = null;
            return;
        }

        this.parameterValues = new java.util.ArrayList<String>(parameterValues);
    }

    /**
     * <p>A list of parameter values sent to targets that resolved during the Automation execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterValues <p>A list of parameter values sent to targets that resolved during the Automation execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResolvedTargets withParameterValues(String... parameterValues) {
        if (getParameterValues() == null) {
            this.parameterValues = new java.util.ArrayList<String>(parameterValues.length);
        }
        for (String value : parameterValues) {
            this.parameterValues.add(value);
        }
        return this;
    }

    /**
     * <p>A list of parameter values sent to targets that resolved during the Automation execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterValues <p>A list of parameter values sent to targets that resolved during the Automation execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResolvedTargets withParameterValues(java.util.Collection<String> parameterValues) {
        setParameterValues(parameterValues);
        return this;
    }

    /**
     * <p>A boolean value indicating whether the resolved target list is truncated.</p>
     *
     * @return <p>A boolean value indicating whether the resolved target list is truncated.</p>
     */
    public Boolean isTruncated() {
        return truncated;
    }

    /**
     * <p>A boolean value indicating whether the resolved target list is truncated.</p>
     *
     * @return <p>A boolean value indicating whether the resolved target list is truncated.</p>
     */
    public Boolean getTruncated() {
        return truncated;
    }

    /**
     * <p>A boolean value indicating whether the resolved target list is truncated.</p>
     *
     * @param truncated <p>A boolean value indicating whether the resolved target list is truncated.</p>
     */
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * <p>A boolean value indicating whether the resolved target list is truncated.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param truncated <p>A boolean value indicating whether the resolved target list is truncated.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResolvedTargets withTruncated(Boolean truncated) {
        this.truncated = truncated;
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
        if (getParameterValues() != null) sb.append("ParameterValues: " + getParameterValues() + ",");
        if (getTruncated() != null) sb.append("Truncated: " + getTruncated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterValues() == null) ? 0 : getParameterValues().hashCode());
        hashCode = prime * hashCode + ((getTruncated() == null) ? 0 : getTruncated().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResolvedTargets == false) return false;
        ResolvedTargets other = (ResolvedTargets)obj;

        if (other.getParameterValues() == null ^ this.getParameterValues() == null) return false;
        if (other.getParameterValues() != null && other.getParameterValues().equals(this.getParameterValues()) == false) return false;
        if (other.getTruncated() == null ^ this.getTruncated() == null) return false;
        if (other.getTruncated() != null && other.getTruncated().equals(this.getTruncated()) == false) return false;
        return true;
    }
}
