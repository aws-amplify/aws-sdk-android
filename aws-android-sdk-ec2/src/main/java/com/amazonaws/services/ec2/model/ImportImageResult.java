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

public class ImportImageResult implements Serializable {
    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     */
    private String architecture;

    /**
     * <p>
     * A description of the import task.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Indicates whether the AMI is encrypted.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * The target hypervisor of the import task.
     * </p>
     */
    private String hypervisor;

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) created by the import task.
     * </p>
     */
    private String imageId;

    /**
     * <p>
     * The task ID of the import image task.
     * </p>
     */
    private String importTaskId;

    /**
     * <p>
     * The identifier for the symmetric AWS Key Management Service (AWS KMS)
     * customer master key (CMK) that was used to create the encrypted AMI.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The license type of the virtual machine.
     * </p>
     */
    private String licenseType;

    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     */
    private String platform;

    /**
     * <p>
     * The progress of the task.
     * </p>
     */
    private String progress;

    /**
     * <p>
     * Information about the snapshots.
     * </p>
     */
    private java.util.List<SnapshotDetail> snapshotDetails;

    /**
     * <p>
     * A brief status of the task.
     * </p>
     */
    private String status;

    /**
     * <p>
     * A detailed status message of the import task.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The ARNs of the license configurations.
     * </p>
     */
    private java.util.List<ImportImageLicenseConfigurationResponse> licenseSpecifications;

    /**
     * <p>
     * Any tags assigned to the image being imported.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     *
     * @return <p>
     *         The architecture of the virtual machine.
     *         </p>
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     *
     * @param architecture <p>
     *            The architecture of the virtual machine.
     *            </p>
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param architecture <p>
     *            The architecture of the virtual machine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageResult withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * <p>
     * A description of the import task.
     * </p>
     *
     * @return <p>
     *         A description of the import task.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the import task.
     * </p>
     *
     * @param description <p>
     *            A description of the import task.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the import task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the import task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Indicates whether the AMI is encrypted.
     * </p>
     *
     * @return <p>
     *         Indicates whether the AMI is encrypted.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Indicates whether the AMI is encrypted.
     * </p>
     *
     * @return <p>
     *         Indicates whether the AMI is encrypted.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Indicates whether the AMI is encrypted.
     * </p>
     *
     * @param encrypted <p>
     *            Indicates whether the AMI is encrypted.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the AMI is encrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            Indicates whether the AMI is encrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageResult withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * The target hypervisor of the import task.
     * </p>
     *
     * @return <p>
     *         The target hypervisor of the import task.
     *         </p>
     */
    public String getHypervisor() {
        return hypervisor;
    }

    /**
     * <p>
     * The target hypervisor of the import task.
     * </p>
     *
     * @param hypervisor <p>
     *            The target hypervisor of the import task.
     *            </p>
     */
    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }

    /**
     * <p>
     * The target hypervisor of the import task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hypervisor <p>
     *            The target hypervisor of the import task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageResult withHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) created by the import task.
     * </p>
     *
     * @return <p>
     *         The ID of the Amazon Machine Image (AMI) created by the import
     *         task.
     *         </p>
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) created by the import task.
     * </p>
     *
     * @param imageId <p>
     *            The ID of the Amazon Machine Image (AMI) created by the import
     *            task.
     *            </p>
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) created by the import task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageId <p>
     *            The ID of the Amazon Machine Image (AMI) created by the import
     *            task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageResult withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * <p>
     * The task ID of the import image task.
     * </p>
     *
     * @return <p>
     *         The task ID of the import image task.
     *         </p>
     */
    public String getImportTaskId() {
        return importTaskId;
    }

    /**
     * <p>
     * The task ID of the import image task.
     * </p>
     *
     * @param importTaskId <p>
     *            The task ID of the import image task.
     *            </p>
     */
    public void setImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
    }

    /**
     * <p>
     * The task ID of the import image task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importTaskId <p>
     *            The task ID of the import image task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageResult withImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
        return this;
    }

    /**
     * <p>
     * The identifier for the symmetric AWS Key Management Service (AWS KMS)
     * customer master key (CMK) that was used to create the encrypted AMI.
     * </p>
     *
     * @return <p>
     *         The identifier for the symmetric AWS Key Management Service (AWS
     *         KMS) customer master key (CMK) that was used to create the
     *         encrypted AMI.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The identifier for the symmetric AWS Key Management Service (AWS KMS)
     * customer master key (CMK) that was used to create the encrypted AMI.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The identifier for the symmetric AWS Key Management Service
     *            (AWS KMS) customer master key (CMK) that was used to create
     *            the encrypted AMI.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier for the symmetric AWS Key Management Service (AWS KMS)
     * customer master key (CMK) that was used to create the encrypted AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The identifier for the symmetric AWS Key Management Service
     *            (AWS KMS) customer master key (CMK) that was used to create
     *            the encrypted AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageResult withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The license type of the virtual machine.
     * </p>
     *
     * @return <p>
     *         The license type of the virtual machine.
     *         </p>
     */
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * <p>
     * The license type of the virtual machine.
     * </p>
     *
     * @param licenseType <p>
     *            The license type of the virtual machine.
     *            </p>
     */
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The license type of the virtual machine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseType <p>
     *            The license type of the virtual machine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageResult withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     *
     * @return <p>
     *         The operating system of the virtual machine.
     *         </p>
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     *
     * @param platform <p>
     *            The operating system of the virtual machine.
     *            </p>
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platform <p>
     *            The operating system of the virtual machine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageResult withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * The progress of the task.
     * </p>
     *
     * @return <p>
     *         The progress of the task.
     *         </p>
     */
    public String getProgress() {
        return progress;
    }

    /**
     * <p>
     * The progress of the task.
     * </p>
     *
     * @param progress <p>
     *            The progress of the task.
     *            </p>
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The progress of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progress <p>
     *            The progress of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageResult withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * <p>
     * Information about the snapshots.
     * </p>
     *
     * @return <p>
     *         Information about the snapshots.
     *         </p>
     */
    public java.util.List<SnapshotDetail> getSnapshotDetails() {
        return snapshotDetails;
    }

    /**
     * <p>
     * Information about the snapshots.
     * </p>
     *
     * @param snapshotDetails <p>
     *            Information about the snapshots.
     *            </p>
     */
    public void setSnapshotDetails(java.util.Collection<SnapshotDetail> snapshotDetails) {
        if (snapshotDetails == null) {
            this.snapshotDetails = null;
            return;
        }

        this.snapshotDetails = new java.util.ArrayList<SnapshotDetail>(snapshotDetails);
    }

    /**
     * <p>
     * Information about the snapshots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotDetails <p>
     *            Information about the snapshots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageResult withSnapshotDetails(SnapshotDetail... snapshotDetails) {
        if (getSnapshotDetails() == null) {
            this.snapshotDetails = new java.util.ArrayList<SnapshotDetail>(snapshotDetails.length);
        }
        for (SnapshotDetail value : snapshotDetails) {
            this.snapshotDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the snapshots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotDetails <p>
     *            Information about the snapshots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageResult withSnapshotDetails(
            java.util.Collection<SnapshotDetail> snapshotDetails) {
        setSnapshotDetails(snapshotDetails);
        return this;
    }

    /**
     * <p>
     * A brief status of the task.
     * </p>
     *
     * @return <p>
     *         A brief status of the task.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * A brief status of the task.
     * </p>
     *
     * @param status <p>
     *            A brief status of the task.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A brief status of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            A brief status of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * A detailed status message of the import task.
     * </p>
     *
     * @return <p>
     *         A detailed status message of the import task.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * A detailed status message of the import task.
     * </p>
     *
     * @param statusMessage <p>
     *            A detailed status message of the import task.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A detailed status message of the import task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            A detailed status message of the import task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageResult withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The ARNs of the license configurations.
     * </p>
     *
     * @return <p>
     *         The ARNs of the license configurations.
     *         </p>
     */
    public java.util.List<ImportImageLicenseConfigurationResponse> getLicenseSpecifications() {
        return licenseSpecifications;
    }

    /**
     * <p>
     * The ARNs of the license configurations.
     * </p>
     *
     * @param licenseSpecifications <p>
     *            The ARNs of the license configurations.
     *            </p>
     */
    public void setLicenseSpecifications(
            java.util.Collection<ImportImageLicenseConfigurationResponse> licenseSpecifications) {
        if (licenseSpecifications == null) {
            this.licenseSpecifications = null;
            return;
        }

        this.licenseSpecifications = new java.util.ArrayList<ImportImageLicenseConfigurationResponse>(
                licenseSpecifications);
    }

    /**
     * <p>
     * The ARNs of the license configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseSpecifications <p>
     *            The ARNs of the license configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageResult withLicenseSpecifications(
            ImportImageLicenseConfigurationResponse... licenseSpecifications) {
        if (getLicenseSpecifications() == null) {
            this.licenseSpecifications = new java.util.ArrayList<ImportImageLicenseConfigurationResponse>(
                    licenseSpecifications.length);
        }
        for (ImportImageLicenseConfigurationResponse value : licenseSpecifications) {
            this.licenseSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of the license configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseSpecifications <p>
     *            The ARNs of the license configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageResult withLicenseSpecifications(
            java.util.Collection<ImportImageLicenseConfigurationResponse> licenseSpecifications) {
        setLicenseSpecifications(licenseSpecifications);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the image being imported.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the image being imported.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the image being imported.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the image being imported.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the image being imported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the image being imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageResult withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the image being imported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the image being imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getArchitecture() != null)
            sb.append("Architecture: " + getArchitecture() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getHypervisor() != null)
            sb.append("Hypervisor: " + getHypervisor() + ",");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getImportTaskId() != null)
            sb.append("ImportTaskId: " + getImportTaskId() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getLicenseType() != null)
            sb.append("LicenseType: " + getLicenseType() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform() + ",");
        if (getProgress() != null)
            sb.append("Progress: " + getProgress() + ",");
        if (getSnapshotDetails() != null)
            sb.append("SnapshotDetails: " + getSnapshotDetails() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getLicenseSpecifications() != null)
            sb.append("LicenseSpecifications: " + getLicenseSpecifications() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getHypervisor() == null) ? 0 : getHypervisor().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode
                + ((getImportTaskId() == null) ? 0 : getImportTaskId().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotDetails() == null) ? 0 : getSnapshotDetails().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime
                * hashCode
                + ((getLicenseSpecifications() == null) ? 0 : getLicenseSpecifications().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportImageResult == false)
            return false;
        ImportImageResult other = (ImportImageResult) obj;

        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null
                && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null
                && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getHypervisor() == null ^ this.getHypervisor() == null)
            return false;
        if (other.getHypervisor() != null
                && other.getHypervisor().equals(this.getHypervisor()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getImportTaskId() == null ^ this.getImportTaskId() == null)
            return false;
        if (other.getImportTaskId() != null
                && other.getImportTaskId().equals(this.getImportTaskId()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null
                && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getSnapshotDetails() == null ^ this.getSnapshotDetails() == null)
            return false;
        if (other.getSnapshotDetails() != null
                && other.getSnapshotDetails().equals(this.getSnapshotDetails()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getLicenseSpecifications() == null ^ this.getLicenseSpecifications() == null)
            return false;
        if (other.getLicenseSpecifications() != null
                && other.getLicenseSpecifications().equals(this.getLicenseSpecifications()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
