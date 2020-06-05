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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * A set of per-resource AWS Elastic Beanstalk quotas associated with an AWS
 * account. They reflect Elastic Beanstalk resource limits for this account.
 * </p>
 */
public class ResourceQuotas implements Serializable {
    /**
     * <p>
     * The quota for applications in the AWS account.
     * </p>
     */
    private ResourceQuota applicationQuota;

    /**
     * <p>
     * The quota for application versions in the AWS account.
     * </p>
     */
    private ResourceQuota applicationVersionQuota;

    /**
     * <p>
     * The quota for environments in the AWS account.
     * </p>
     */
    private ResourceQuota environmentQuota;

    /**
     * <p>
     * The quota for configuration templates in the AWS account.
     * </p>
     */
    private ResourceQuota configurationTemplateQuota;

    /**
     * <p>
     * The quota for custom platforms in the AWS account.
     * </p>
     */
    private ResourceQuota customPlatformQuota;

    /**
     * <p>
     * The quota for applications in the AWS account.
     * </p>
     *
     * @return <p>
     *         The quota for applications in the AWS account.
     *         </p>
     */
    public ResourceQuota getApplicationQuota() {
        return applicationQuota;
    }

    /**
     * <p>
     * The quota for applications in the AWS account.
     * </p>
     *
     * @param applicationQuota <p>
     *            The quota for applications in the AWS account.
     *            </p>
     */
    public void setApplicationQuota(ResourceQuota applicationQuota) {
        this.applicationQuota = applicationQuota;
    }

    /**
     * <p>
     * The quota for applications in the AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationQuota <p>
     *            The quota for applications in the AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceQuotas withApplicationQuota(ResourceQuota applicationQuota) {
        this.applicationQuota = applicationQuota;
        return this;
    }

    /**
     * <p>
     * The quota for application versions in the AWS account.
     * </p>
     *
     * @return <p>
     *         The quota for application versions in the AWS account.
     *         </p>
     */
    public ResourceQuota getApplicationVersionQuota() {
        return applicationVersionQuota;
    }

    /**
     * <p>
     * The quota for application versions in the AWS account.
     * </p>
     *
     * @param applicationVersionQuota <p>
     *            The quota for application versions in the AWS account.
     *            </p>
     */
    public void setApplicationVersionQuota(ResourceQuota applicationVersionQuota) {
        this.applicationVersionQuota = applicationVersionQuota;
    }

    /**
     * <p>
     * The quota for application versions in the AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationVersionQuota <p>
     *            The quota for application versions in the AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceQuotas withApplicationVersionQuota(ResourceQuota applicationVersionQuota) {
        this.applicationVersionQuota = applicationVersionQuota;
        return this;
    }

    /**
     * <p>
     * The quota for environments in the AWS account.
     * </p>
     *
     * @return <p>
     *         The quota for environments in the AWS account.
     *         </p>
     */
    public ResourceQuota getEnvironmentQuota() {
        return environmentQuota;
    }

    /**
     * <p>
     * The quota for environments in the AWS account.
     * </p>
     *
     * @param environmentQuota <p>
     *            The quota for environments in the AWS account.
     *            </p>
     */
    public void setEnvironmentQuota(ResourceQuota environmentQuota) {
        this.environmentQuota = environmentQuota;
    }

    /**
     * <p>
     * The quota for environments in the AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentQuota <p>
     *            The quota for environments in the AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceQuotas withEnvironmentQuota(ResourceQuota environmentQuota) {
        this.environmentQuota = environmentQuota;
        return this;
    }

    /**
     * <p>
     * The quota for configuration templates in the AWS account.
     * </p>
     *
     * @return <p>
     *         The quota for configuration templates in the AWS account.
     *         </p>
     */
    public ResourceQuota getConfigurationTemplateQuota() {
        return configurationTemplateQuota;
    }

    /**
     * <p>
     * The quota for configuration templates in the AWS account.
     * </p>
     *
     * @param configurationTemplateQuota <p>
     *            The quota for configuration templates in the AWS account.
     *            </p>
     */
    public void setConfigurationTemplateQuota(ResourceQuota configurationTemplateQuota) {
        this.configurationTemplateQuota = configurationTemplateQuota;
    }

    /**
     * <p>
     * The quota for configuration templates in the AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationTemplateQuota <p>
     *            The quota for configuration templates in the AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceQuotas withConfigurationTemplateQuota(ResourceQuota configurationTemplateQuota) {
        this.configurationTemplateQuota = configurationTemplateQuota;
        return this;
    }

    /**
     * <p>
     * The quota for custom platforms in the AWS account.
     * </p>
     *
     * @return <p>
     *         The quota for custom platforms in the AWS account.
     *         </p>
     */
    public ResourceQuota getCustomPlatformQuota() {
        return customPlatformQuota;
    }

    /**
     * <p>
     * The quota for custom platforms in the AWS account.
     * </p>
     *
     * @param customPlatformQuota <p>
     *            The quota for custom platforms in the AWS account.
     *            </p>
     */
    public void setCustomPlatformQuota(ResourceQuota customPlatformQuota) {
        this.customPlatformQuota = customPlatformQuota;
    }

    /**
     * <p>
     * The quota for custom platforms in the AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customPlatformQuota <p>
     *            The quota for custom platforms in the AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceQuotas withCustomPlatformQuota(ResourceQuota customPlatformQuota) {
        this.customPlatformQuota = customPlatformQuota;
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
        if (getApplicationQuota() != null)
            sb.append("ApplicationQuota: " + getApplicationQuota() + ",");
        if (getApplicationVersionQuota() != null)
            sb.append("ApplicationVersionQuota: " + getApplicationVersionQuota() + ",");
        if (getEnvironmentQuota() != null)
            sb.append("EnvironmentQuota: " + getEnvironmentQuota() + ",");
        if (getConfigurationTemplateQuota() != null)
            sb.append("ConfigurationTemplateQuota: " + getConfigurationTemplateQuota() + ",");
        if (getCustomPlatformQuota() != null)
            sb.append("CustomPlatformQuota: " + getCustomPlatformQuota());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationQuota() == null) ? 0 : getApplicationQuota().hashCode());
        hashCode = prime
                * hashCode
                + ((getApplicationVersionQuota() == null) ? 0 : getApplicationVersionQuota()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentQuota() == null) ? 0 : getEnvironmentQuota().hashCode());
        hashCode = prime
                * hashCode
                + ((getConfigurationTemplateQuota() == null) ? 0 : getConfigurationTemplateQuota()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCustomPlatformQuota() == null) ? 0 : getCustomPlatformQuota().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceQuotas == false)
            return false;
        ResourceQuotas other = (ResourceQuotas) obj;

        if (other.getApplicationQuota() == null ^ this.getApplicationQuota() == null)
            return false;
        if (other.getApplicationQuota() != null
                && other.getApplicationQuota().equals(this.getApplicationQuota()) == false)
            return false;
        if (other.getApplicationVersionQuota() == null ^ this.getApplicationVersionQuota() == null)
            return false;
        if (other.getApplicationVersionQuota() != null
                && other.getApplicationVersionQuota().equals(this.getApplicationVersionQuota()) == false)
            return false;
        if (other.getEnvironmentQuota() == null ^ this.getEnvironmentQuota() == null)
            return false;
        if (other.getEnvironmentQuota() != null
                && other.getEnvironmentQuota().equals(this.getEnvironmentQuota()) == false)
            return false;
        if (other.getConfigurationTemplateQuota() == null
                ^ this.getConfigurationTemplateQuota() == null)
            return false;
        if (other.getConfigurationTemplateQuota() != null
                && other.getConfigurationTemplateQuota().equals(
                        this.getConfigurationTemplateQuota()) == false)
            return false;
        if (other.getCustomPlatformQuota() == null ^ this.getCustomPlatformQuota() == null)
            return false;
        if (other.getCustomPlatformQuota() != null
                && other.getCustomPlatformQuota().equals(this.getCustomPlatformQuota()) == false)
            return false;
        return true;
    }
}
