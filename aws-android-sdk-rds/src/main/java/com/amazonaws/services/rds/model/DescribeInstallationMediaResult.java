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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

public class DescribeInstallationMediaResult implements Serializable {
    /**
     * <p>
     * An optional pagination token provided by a previous
     * <a>DescribeInstallationMedia</a> request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The list of <a>InstallationMedia</a> objects for the AWS account.
     * </p>
     */
    private java.util.List<InstallationMedia> installationMedia;

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <a>DescribeInstallationMedia</a> request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous
     *         <a>DescribeInstallationMedia</a> request. If this parameter is
     *         specified, the response includes only records beyond the marker,
     *         up to the value specified by <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <a>DescribeInstallationMedia</a> request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <a>DescribeInstallationMedia</a> request. If this parameter is
     *            specified, the response includes only records beyond the
     *            marker, up to the value specified by <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * <a>DescribeInstallationMedia</a> request. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            <a>DescribeInstallationMedia</a> request. If this parameter is
     *            specified, the response includes only records beyond the
     *            marker, up to the value specified by <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstallationMediaResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The list of <a>InstallationMedia</a> objects for the AWS account.
     * </p>
     *
     * @return <p>
     *         The list of <a>InstallationMedia</a> objects for the AWS account.
     *         </p>
     */
    public java.util.List<InstallationMedia> getInstallationMedia() {
        return installationMedia;
    }

    /**
     * <p>
     * The list of <a>InstallationMedia</a> objects for the AWS account.
     * </p>
     *
     * @param installationMedia <p>
     *            The list of <a>InstallationMedia</a> objects for the AWS
     *            account.
     *            </p>
     */
    public void setInstallationMedia(java.util.Collection<InstallationMedia> installationMedia) {
        if (installationMedia == null) {
            this.installationMedia = null;
            return;
        }

        this.installationMedia = new java.util.ArrayList<InstallationMedia>(installationMedia);
    }

    /**
     * <p>
     * The list of <a>InstallationMedia</a> objects for the AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param installationMedia <p>
     *            The list of <a>InstallationMedia</a> objects for the AWS
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstallationMediaResult withInstallationMedia(
            InstallationMedia... installationMedia) {
        if (getInstallationMedia() == null) {
            this.installationMedia = new java.util.ArrayList<InstallationMedia>(
                    installationMedia.length);
        }
        for (InstallationMedia value : installationMedia) {
            this.installationMedia.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of <a>InstallationMedia</a> objects for the AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param installationMedia <p>
     *            The list of <a>InstallationMedia</a> objects for the AWS
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstallationMediaResult withInstallationMedia(
            java.util.Collection<InstallationMedia> installationMedia) {
        setInstallationMedia(installationMedia);
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getInstallationMedia() != null)
            sb.append("InstallationMedia: " + getInstallationMedia());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getInstallationMedia() == null) ? 0 : getInstallationMedia().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstallationMediaResult == false)
            return false;
        DescribeInstallationMediaResult other = (DescribeInstallationMediaResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getInstallationMedia() == null ^ this.getInstallationMedia() == null)
            return false;
        if (other.getInstallationMedia() != null
                && other.getInstallationMedia().equals(this.getInstallationMedia()) == false)
            return false;
        return true;
    }
}
