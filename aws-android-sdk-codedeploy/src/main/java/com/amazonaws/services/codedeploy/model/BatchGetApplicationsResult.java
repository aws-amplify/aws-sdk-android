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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a <code>BatchGetApplications</code> operation.
 * </p>
 */
public class BatchGetApplicationsResult implements Serializable {
    /**
     * <p>
     * Information about the applications.
     * </p>
     */
    private java.util.List<ApplicationInfo> applicationsInfo;

    /**
     * <p>
     * Information about the applications.
     * </p>
     *
     * @return <p>
     *         Information about the applications.
     *         </p>
     */
    public java.util.List<ApplicationInfo> getApplicationsInfo() {
        return applicationsInfo;
    }

    /**
     * <p>
     * Information about the applications.
     * </p>
     *
     * @param applicationsInfo <p>
     *            Information about the applications.
     *            </p>
     */
    public void setApplicationsInfo(java.util.Collection<ApplicationInfo> applicationsInfo) {
        if (applicationsInfo == null) {
            this.applicationsInfo = null;
            return;
        }

        this.applicationsInfo = new java.util.ArrayList<ApplicationInfo>(applicationsInfo);
    }

    /**
     * <p>
     * Information about the applications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationsInfo <p>
     *            Information about the applications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetApplicationsResult withApplicationsInfo(ApplicationInfo... applicationsInfo) {
        if (getApplicationsInfo() == null) {
            this.applicationsInfo = new java.util.ArrayList<ApplicationInfo>(
                    applicationsInfo.length);
        }
        for (ApplicationInfo value : applicationsInfo) {
            this.applicationsInfo.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the applications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationsInfo <p>
     *            Information about the applications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetApplicationsResult withApplicationsInfo(
            java.util.Collection<ApplicationInfo> applicationsInfo) {
        setApplicationsInfo(applicationsInfo);
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
        if (getApplicationsInfo() != null)
            sb.append("applicationsInfo: " + getApplicationsInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationsInfo() == null) ? 0 : getApplicationsInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetApplicationsResult == false)
            return false;
        BatchGetApplicationsResult other = (BatchGetApplicationsResult) obj;

        if (other.getApplicationsInfo() == null ^ this.getApplicationsInfo() == null)
            return false;
        if (other.getApplicationsInfo() != null
                && other.getApplicationsInfo().equals(this.getApplicationsInfo()) == false)
            return false;
        return true;
    }
}
