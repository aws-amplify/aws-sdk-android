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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the package configuration.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >UpdatePackageConfiguration</a> and <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html"
 * >iam:PassRole</a> actions.
 * </p>
 */
public class UpdatePackageConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Configuration to manage job's package version reporting. This updates the
     * thing's reserved named shadow that the job targets.
     * </p>
     */
    private VersionUpdateByJobsConfig versionUpdateByJobsConfig;

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     */
    private String clientToken;

    /**
     * <p>
     * Configuration to manage job's package version reporting. This updates the
     * thing's reserved named shadow that the job targets.
     * </p>
     *
     * @return <p>
     *         Configuration to manage job's package version reporting. This
     *         updates the thing's reserved named shadow that the job targets.
     *         </p>
     */
    public VersionUpdateByJobsConfig getVersionUpdateByJobsConfig() {
        return versionUpdateByJobsConfig;
    }

    /**
     * <p>
     * Configuration to manage job's package version reporting. This updates the
     * thing's reserved named shadow that the job targets.
     * </p>
     *
     * @param versionUpdateByJobsConfig <p>
     *            Configuration to manage job's package version reporting. This
     *            updates the thing's reserved named shadow that the job
     *            targets.
     *            </p>
     */
    public void setVersionUpdateByJobsConfig(VersionUpdateByJobsConfig versionUpdateByJobsConfig) {
        this.versionUpdateByJobsConfig = versionUpdateByJobsConfig;
    }

    /**
     * <p>
     * Configuration to manage job's package version reporting. This updates the
     * thing's reserved named shadow that the job targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionUpdateByJobsConfig <p>
     *            Configuration to manage job's package version reporting. This
     *            updates the thing's reserved named shadow that the job
     *            targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePackageConfigurationRequest withVersionUpdateByJobsConfig(
            VersionUpdateByJobsConfig versionUpdateByJobsConfig) {
        this.versionUpdateByJobsConfig = versionUpdateByJobsConfig;
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @return <p>
     *         A unique case-sensitive identifier that you can provide to ensure
     *         the idempotency of the request. Don't reuse this client token if
     *         a new idempotent request is required.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @param clientToken <p>
     *            A unique case-sensitive identifier that you can provide to
     *            ensure the idempotency of the request. Don't reuse this client
     *            token if a new idempotent request is required.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @param clientToken <p>
     *            A unique case-sensitive identifier that you can provide to
     *            ensure the idempotency of the request. Don't reuse this client
     *            token if a new idempotent request is required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePackageConfigurationRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
            sb.append("versionUpdateByJobsConfig: " + getVersionUpdateByJobsConfig() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken());
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
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePackageConfigurationRequest == false)
            return false;
        UpdatePackageConfigurationRequest other = (UpdatePackageConfigurationRequest) obj;

        if (other.getVersionUpdateByJobsConfig() == null
                ^ this.getVersionUpdateByJobsConfig() == null)
            return false;
        if (other.getVersionUpdateByJobsConfig() != null
                && other.getVersionUpdateByJobsConfig().equals(this.getVersionUpdateByJobsConfig()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
