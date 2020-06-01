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
 * A collection of settings used for a job.
 * </p>
 */
public class AutoMLJobConfig implements Serializable {
    /**
     * <p>
     * How long a job is allowed to run, or how many candidates a job is allowed
     * to generate.
     * </p>
     */
    private AutoMLJobCompletionCriteria completionCriteria;

    /**
     * <p>
     * Security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     */
    private AutoMLSecurityConfig securityConfig;

    /**
     * <p>
     * How long a job is allowed to run, or how many candidates a job is allowed
     * to generate.
     * </p>
     *
     * @return <p>
     *         How long a job is allowed to run, or how many candidates a job is
     *         allowed to generate.
     *         </p>
     */
    public AutoMLJobCompletionCriteria getCompletionCriteria() {
        return completionCriteria;
    }

    /**
     * <p>
     * How long a job is allowed to run, or how many candidates a job is allowed
     * to generate.
     * </p>
     *
     * @param completionCriteria <p>
     *            How long a job is allowed to run, or how many candidates a job
     *            is allowed to generate.
     *            </p>
     */
    public void setCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        this.completionCriteria = completionCriteria;
    }

    /**
     * <p>
     * How long a job is allowed to run, or how many candidates a job is allowed
     * to generate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completionCriteria <p>
     *            How long a job is allowed to run, or how many candidates a job
     *            is allowed to generate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLJobConfig withCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        this.completionCriteria = completionCriteria;
        return this;
    }

    /**
     * <p>
     * Security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     *
     * @return <p>
     *         Security configuration for traffic encryption or Amazon VPC
     *         settings.
     *         </p>
     */
    public AutoMLSecurityConfig getSecurityConfig() {
        return securityConfig;
    }

    /**
     * <p>
     * Security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     *
     * @param securityConfig <p>
     *            Security configuration for traffic encryption or Amazon VPC
     *            settings.
     *            </p>
     */
    public void setSecurityConfig(AutoMLSecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
    }

    /**
     * <p>
     * Security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityConfig <p>
     *            Security configuration for traffic encryption or Amazon VPC
     *            settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLJobConfig withSecurityConfig(AutoMLSecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
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
        if (getCompletionCriteria() != null)
            sb.append("CompletionCriteria: " + getCompletionCriteria() + ",");
        if (getSecurityConfig() != null)
            sb.append("SecurityConfig: " + getSecurityConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCompletionCriteria() == null) ? 0 : getCompletionCriteria().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityConfig() == null) ? 0 : getSecurityConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLJobConfig == false)
            return false;
        AutoMLJobConfig other = (AutoMLJobConfig) obj;

        if (other.getCompletionCriteria() == null ^ this.getCompletionCriteria() == null)
            return false;
        if (other.getCompletionCriteria() != null
                && other.getCompletionCriteria().equals(this.getCompletionCriteria()) == false)
            return false;
        if (other.getSecurityConfig() == null ^ this.getSecurityConfig() == null)
            return false;
        if (other.getSecurityConfig() != null
                && other.getSecurityConfig().equals(this.getSecurityConfig()) == false)
            return false;
        return true;
    }
}
