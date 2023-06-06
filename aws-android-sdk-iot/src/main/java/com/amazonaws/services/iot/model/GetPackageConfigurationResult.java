/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class GetPackageConfigurationResult implements Serializable {
    /**
     * <p>
     * The version that is associated to a specific job.
     * </p>
     */
    private VersionUpdateByJobsConfig versionUpdateByJobsConfig;

    /**
     * <p>
     * The version that is associated to a specific job.
     * </p>
     *
     * @return <p>
     *         The version that is associated to a specific job.
     *         </p>
     */
    public VersionUpdateByJobsConfig getVersionUpdateByJobsConfig() {
        return versionUpdateByJobsConfig;
    }

    /**
     * <p>
     * The version that is associated to a specific job.
     * </p>
     *
     * @param versionUpdateByJobsConfig <p>
     *            The version that is associated to a specific job.
     *            </p>
     */
    public void setVersionUpdateByJobsConfig(VersionUpdateByJobsConfig versionUpdateByJobsConfig) {
        this.versionUpdateByJobsConfig = versionUpdateByJobsConfig;
    }

    /**
     * <p>
     * The version that is associated to a specific job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionUpdateByJobsConfig <p>
     *            The version that is associated to a specific job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPackageConfigurationResult withVersionUpdateByJobsConfig(
            VersionUpdateByJobsConfig versionUpdateByJobsConfig) {
        this.versionUpdateByJobsConfig = versionUpdateByJobsConfig;
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
        if (getVersionUpdateByJobsConfig() != null)
            sb.append("versionUpdateByJobsConfig: " + getVersionUpdateByJobsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getVersionUpdateByJobsConfig() == null) ? 0 : getVersionUpdateByJobsConfig()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPackageConfigurationResult == false)
            return false;
        GetPackageConfigurationResult other = (GetPackageConfigurationResult) obj;

        if (other.getVersionUpdateByJobsConfig() == null
                ^ this.getVersionUpdateByJobsConfig() == null)
            return false;
        if (other.getVersionUpdateByJobsConfig() != null
                && other.getVersionUpdateByJobsConfig().equals(this.getVersionUpdateByJobsConfig()) == false)
            return false;
        return true;
    }
}
