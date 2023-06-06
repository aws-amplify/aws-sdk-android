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

/**
 * <p>
 * Configuration to manage IoT Job's package version reporting. If configured,
 * Jobs updates the thing's reserved named shadow with the package version
 * information up on successful job completion.
 * </p>
 * <p>
 * <b>Note:</b> For each job, the destinationPackageVersions attribute has to be
 * set with the correct data for Jobs to report to the thing shadow.
 * </p>
 */
public class VersionUpdateByJobsConfig implements Serializable {
    /**
     * <p>
     * Indicates whether the Job is enabled or not.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that grants permission to the
     * IoT jobs service to update the reserved named shadow when the job
     * successfully completes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleArn;

    /**
     * <p>
     * Indicates whether the Job is enabled or not.
     * </p>
     *
     * @return <p>
     *         Indicates whether the Job is enabled or not.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether the Job is enabled or not.
     * </p>
     *
     * @return <p>
     *         Indicates whether the Job is enabled or not.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether the Job is enabled or not.
     * </p>
     *
     * @param enabled <p>
     *            Indicates whether the Job is enabled or not.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether the Job is enabled or not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Indicates whether the Job is enabled or not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VersionUpdateByJobsConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that grants permission to the
     * IoT jobs service to update the reserved named shadow when the job
     * successfully completes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the role that grants permission
     *         to the IoT jobs service to update the reserved named shadow when
     *         the job successfully completes.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that grants permission to the
     * IoT jobs service to update the reserved named shadow when the job
     * successfully completes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the role that grants
     *            permission to the IoT jobs service to update the reserved
     *            named shadow when the job successfully completes.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that grants permission to the
     * IoT jobs service to update the reserved named shadow when the job
     * successfully completes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the role that grants
     *            permission to the IoT jobs service to update the reserved
     *            named shadow when the job successfully completes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VersionUpdateByJobsConfig withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getEnabled() != null)
            sb.append("enabled: " + getEnabled() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VersionUpdateByJobsConfig == false)
            return false;
        VersionUpdateByJobsConfig other = (VersionUpdateByJobsConfig) obj;

        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
