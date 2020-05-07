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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an import instance task using metadata from the specified disk image.
 * <code>ImportInstance</code> only supports single-volume VMs. To import
 * multi-volume VMs, use <a>ImportImage</a>. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/CommandLineReference/ec2-cli-vmimport-export.html"
 * >Importing a Virtual Machine Using the Amazon EC2 CLI</a>.
 * </p>
 * <p>
 * For information about the import manifest referenced by this API action, see
 * <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/manifest.html"
 * >VM Import Manifest</a>.
 * </p>
 */
public class ImportInstanceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A description for the instance being imported.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The disk image.
     * </p>
     */
    private java.util.List<DiskImage> diskImages;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The launch specification.
     * </p>
     */
    private ImportInstanceLaunchSpecification launchSpecification;

    /**
     * <p>
     * The instance operating system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     */
    private String platform;

    /**
     * <p>
     * A description for the instance being imported.
     * </p>
     *
     * @return <p>
     *         A description for the instance being imported.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the instance being imported.
     * </p>
     *
     * @param description <p>
     *            A description for the instance being imported.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the instance being imported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for the instance being imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportInstanceRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The disk image.
     * </p>
     *
     * @return <p>
     *         The disk image.
     *         </p>
     */
    public java.util.List<DiskImage> getDiskImages() {
        return diskImages;
    }

    /**
     * <p>
     * The disk image.
     * </p>
     *
     * @param diskImages <p>
     *            The disk image.
     *            </p>
     */
    public void setDiskImages(java.util.Collection<DiskImage> diskImages) {
        if (diskImages == null) {
            this.diskImages = null;
            return;
        }

        this.diskImages = new java.util.ArrayList<DiskImage>(diskImages);
    }

    /**
     * <p>
     * The disk image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskImages <p>
     *            The disk image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportInstanceRequest withDiskImages(DiskImage... diskImages) {
        if (getDiskImages() == null) {
            this.diskImages = new java.util.ArrayList<DiskImage>(diskImages.length);
        }
        for (DiskImage value : diskImages) {
            this.diskImages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The disk image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskImages <p>
     *            The disk image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportInstanceRequest withDiskImages(java.util.Collection<DiskImage> diskImages) {
        setDiskImages(diskImages);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportInstanceRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The launch specification.
     * </p>
     *
     * @return <p>
     *         The launch specification.
     *         </p>
     */
    public ImportInstanceLaunchSpecification getLaunchSpecification() {
        return launchSpecification;
    }

    /**
     * <p>
     * The launch specification.
     * </p>
     *
     * @param launchSpecification <p>
     *            The launch specification.
     *            </p>
     */
    public void setLaunchSpecification(ImportInstanceLaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
    }

    /**
     * <p>
     * The launch specification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchSpecification <p>
     *            The launch specification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportInstanceRequest withLaunchSpecification(
            ImportInstanceLaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
        return this;
    }

    /**
     * <p>
     * The instance operating system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @return <p>
     *         The instance operating system.
     *         </p>
     * @see PlatformValues
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The instance operating system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform <p>
     *            The instance operating system.
     *            </p>
     * @see PlatformValues
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The instance operating system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform <p>
     *            The instance operating system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlatformValues
     */
    public ImportInstanceRequest withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * The instance operating system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform <p>
     *            The instance operating system.
     *            </p>
     * @see PlatformValues
     */
    public void setPlatform(PlatformValues platform) {
        this.platform = platform.toString();
    }

    /**
     * <p>
     * The instance operating system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform <p>
     *            The instance operating system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlatformValues
     */
    public ImportInstanceRequest withPlatform(PlatformValues platform) {
        this.platform = platform.toString();
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDiskImages() != null)
            sb.append("DiskImages: " + getDiskImages() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getLaunchSpecification() != null)
            sb.append("LaunchSpecification: " + getLaunchSpecification() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDiskImages() == null) ? 0 : getDiskImages().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchSpecification() == null) ? 0 : getLaunchSpecification().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportInstanceRequest == false)
            return false;
        ImportInstanceRequest other = (ImportInstanceRequest) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDiskImages() == null ^ this.getDiskImages() == null)
            return false;
        if (other.getDiskImages() != null
                && other.getDiskImages().equals(this.getDiskImages()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getLaunchSpecification() == null ^ this.getLaunchSpecification() == null)
            return false;
        if (other.getLaunchSpecification() != null
                && other.getLaunchSpecification().equals(this.getLaunchSpecification()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        return true;
    }
}
