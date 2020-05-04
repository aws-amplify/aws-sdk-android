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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


/**
 * <p>Contains the configuration information for a job's manifest.</p>
 */
public class JobManifest implements Serializable {
    /**
     * <p>Describes the format of the specified job's manifest. If the manifest is in CSV format, also describes the columns contained within the manifest.</p>
     */
    private JobManifestSpec spec;

    /**
     * <p>Contains the information required to locate the specified job's manifest.</p>
     */
    private JobManifestLocation location;

    /**
     * <p>Describes the format of the specified job's manifest. If the manifest is in CSV format, also describes the columns contained within the manifest.</p>
     *
     * @return <p>Describes the format of the specified job's manifest. If the manifest is in CSV format, also describes the columns contained within the manifest.</p>
     */
    public JobManifestSpec getSpec() {
        return spec;
    }

    /**
     * <p>Describes the format of the specified job's manifest. If the manifest is in CSV format, also describes the columns contained within the manifest.</p>
     *
     * @param spec <p>Describes the format of the specified job's manifest. If the manifest is in CSV format, also describes the columns contained within the manifest.</p>
     */
    public void setSpec(JobManifestSpec spec) {
        this.spec = spec;
    }

    /**
     * <p>Describes the format of the specified job's manifest. If the manifest is in CSV format, also describes the columns contained within the manifest.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spec <p>Describes the format of the specified job's manifest. If the manifest is in CSV format, also describes the columns contained within the manifest.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobManifest withSpec(JobManifestSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * <p>Contains the information required to locate the specified job's manifest.</p>
     *
     * @return <p>Contains the information required to locate the specified job's manifest.</p>
     */
    public JobManifestLocation getLocation() {
        return location;
    }

    /**
     * <p>Contains the information required to locate the specified job's manifest.</p>
     *
     * @param location <p>Contains the information required to locate the specified job's manifest.</p>
     */
    public void setLocation(JobManifestLocation location) {
        this.location = location;
    }

    /**
     * <p>Contains the information required to locate the specified job's manifest.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param location <p>Contains the information required to locate the specified job's manifest.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobManifest withLocation(JobManifestLocation location) {
        this.location = location;
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
        if (getSpec() != null) sb.append("Spec: " + getSpec() + ",");
        if (getLocation() != null) sb.append("Location: " + getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof JobManifest == false) return false;
        JobManifest other = (JobManifest)obj;

        if (other.getSpec() == null ^ this.getSpec() == null) return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false) return false;
        if (other.getLocation() == null ^ this.getLocation() == null) return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false) return false;
        return true;
    }
}
