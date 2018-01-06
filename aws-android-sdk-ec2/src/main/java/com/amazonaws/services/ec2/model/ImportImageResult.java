/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains the output for ImportImage.
 * </p>
 */
public class ImportImageResult implements Serializable {

    /**
     * The task ID of the import image task.
     */
    private String importTaskId;

    /**
     * The architecture of the virtual machine.
     */
    private String architecture;

    /**
     * The license type of the virtual machine.
     */
    private String licenseType;

    /**
     * The operating system of the virtual machine.
     */
    private String platform;

    /**
     * The target hypervisor of the import task.
     */
    private String hypervisor;

    /**
     * A description of the import task.
     */
    private String description;

    /**
     * Information about the snapshots.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SnapshotDetail> snapshotDetails;

    /**
     * The ID of the Amazon Machine Image (AMI) created by the import task.
     */
    private String imageId;

    /**
     * The progress of the task.
     */
    private String progress;

    /**
     * A detailed status message of the import task.
     */
    private String statusMessage;

    /**
     * A brief status of the task.
     */
    private String status;

    /**
     * The task ID of the import image task.
     *
     * @return The task ID of the import image task.
     */
    public String getImportTaskId() {
        return importTaskId;
    }
    
    /**
     * The task ID of the import image task.
     *
     * @param importTaskId The task ID of the import image task.
     */
    public void setImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
    }
    
    /**
     * The task ID of the import image task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importTaskId The task ID of the import image task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageResult withImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
        return this;
    }

    /**
     * The architecture of the virtual machine.
     *
     * @return The architecture of the virtual machine.
     */
    public String getArchitecture() {
        return architecture;
    }
    
    /**
     * The architecture of the virtual machine.
     *
     * @param architecture The architecture of the virtual machine.
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }
    
    /**
     * The architecture of the virtual machine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param architecture The architecture of the virtual machine.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageResult withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * The license type of the virtual machine.
     *
     * @return The license type of the virtual machine.
     */
    public String getLicenseType() {
        return licenseType;
    }
    
    /**
     * The license type of the virtual machine.
     *
     * @param licenseType The license type of the virtual machine.
     */
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }
    
    /**
     * The license type of the virtual machine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseType The license type of the virtual machine.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageResult withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * The operating system of the virtual machine.
     *
     * @return The operating system of the virtual machine.
     */
    public String getPlatform() {
        return platform;
    }
    
    /**
     * The operating system of the virtual machine.
     *
     * @param platform The operating system of the virtual machine.
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    /**
     * The operating system of the virtual machine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param platform The operating system of the virtual machine.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageResult withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * The target hypervisor of the import task.
     *
     * @return The target hypervisor of the import task.
     */
    public String getHypervisor() {
        return hypervisor;
    }
    
    /**
     * The target hypervisor of the import task.
     *
     * @param hypervisor The target hypervisor of the import task.
     */
    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }
    
    /**
     * The target hypervisor of the import task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hypervisor The target hypervisor of the import task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageResult withHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
        return this;
    }

    /**
     * A description of the import task.
     *
     * @return A description of the import task.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description of the import task.
     *
     * @param description A description of the import task.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description of the import task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description of the import task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Information about the snapshots.
     *
     * @return Information about the snapshots.
     */
    public java.util.List<SnapshotDetail> getSnapshotDetails() {
        if (snapshotDetails == null) {
              snapshotDetails = new com.amazonaws.internal.ListWithAutoConstructFlag<SnapshotDetail>();
              snapshotDetails.setAutoConstruct(true);
        }
        return snapshotDetails;
    }
    
    /**
     * Information about the snapshots.
     *
     * @param snapshotDetails Information about the snapshots.
     */
    public void setSnapshotDetails(java.util.Collection<SnapshotDetail> snapshotDetails) {
        if (snapshotDetails == null) {
            this.snapshotDetails = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SnapshotDetail> snapshotDetailsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SnapshotDetail>(snapshotDetails.size());
        snapshotDetailsCopy.addAll(snapshotDetails);
        this.snapshotDetails = snapshotDetailsCopy;
    }
    
    /**
     * Information about the snapshots.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotDetails Information about the snapshots.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageResult withSnapshotDetails(SnapshotDetail... snapshotDetails) {
        if (getSnapshotDetails() == null) setSnapshotDetails(new java.util.ArrayList<SnapshotDetail>(snapshotDetails.length));
        for (SnapshotDetail value : snapshotDetails) {
            getSnapshotDetails().add(value);
        }
        return this;
    }
    
    /**
     * Information about the snapshots.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotDetails Information about the snapshots.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageResult withSnapshotDetails(java.util.Collection<SnapshotDetail> snapshotDetails) {
        if (snapshotDetails == null) {
            this.snapshotDetails = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SnapshotDetail> snapshotDetailsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SnapshotDetail>(snapshotDetails.size());
            snapshotDetailsCopy.addAll(snapshotDetails);
            this.snapshotDetails = snapshotDetailsCopy;
        }

        return this;
    }

    /**
     * The ID of the Amazon Machine Image (AMI) created by the import task.
     *
     * @return The ID of the Amazon Machine Image (AMI) created by the import task.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * The ID of the Amazon Machine Image (AMI) created by the import task.
     *
     * @param imageId The ID of the Amazon Machine Image (AMI) created by the import task.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * The ID of the Amazon Machine Image (AMI) created by the import task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId The ID of the Amazon Machine Image (AMI) created by the import task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageResult withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * The progress of the task.
     *
     * @return The progress of the task.
     */
    public String getProgress() {
        return progress;
    }
    
    /**
     * The progress of the task.
     *
     * @param progress The progress of the task.
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }
    
    /**
     * The progress of the task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param progress The progress of the task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageResult withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * A detailed status message of the import task.
     *
     * @return A detailed status message of the import task.
     */
    public String getStatusMessage() {
        return statusMessage;
    }
    
    /**
     * A detailed status message of the import task.
     *
     * @param statusMessage A detailed status message of the import task.
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    
    /**
     * A detailed status message of the import task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusMessage A detailed status message of the import task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageResult withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * A brief status of the task.
     *
     * @return A brief status of the task.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * A brief status of the task.
     *
     * @param status A brief status of the task.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * A brief status of the task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status A brief status of the task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageResult withStatus(String status) {
        this.status = status;
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
        if (getImportTaskId() != null) sb.append("ImportTaskId: " + getImportTaskId() + ",");
        if (getArchitecture() != null) sb.append("Architecture: " + getArchitecture() + ",");
        if (getLicenseType() != null) sb.append("LicenseType: " + getLicenseType() + ",");
        if (getPlatform() != null) sb.append("Platform: " + getPlatform() + ",");
        if (getHypervisor() != null) sb.append("Hypervisor: " + getHypervisor() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getSnapshotDetails() != null) sb.append("SnapshotDetails: " + getSnapshotDetails() + ",");
        if (getImageId() != null) sb.append("ImageId: " + getImageId() + ",");
        if (getProgress() != null) sb.append("Progress: " + getProgress() + ",");
        if (getStatusMessage() != null) sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImportTaskId() == null) ? 0 : getImportTaskId().hashCode()); 
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode()); 
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode()); 
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode()); 
        hashCode = prime * hashCode + ((getHypervisor() == null) ? 0 : getHypervisor().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotDetails() == null) ? 0 : getSnapshotDetails().hashCode()); 
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode()); 
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode()); 
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ImportImageResult == false) return false;
        ImportImageResult other = (ImportImageResult)obj;
        
        if (other.getImportTaskId() == null ^ this.getImportTaskId() == null) return false;
        if (other.getImportTaskId() != null && other.getImportTaskId().equals(this.getImportTaskId()) == false) return false; 
        if (other.getArchitecture() == null ^ this.getArchitecture() == null) return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false) return false; 
        if (other.getLicenseType() == null ^ this.getLicenseType() == null) return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false) return false; 
        if (other.getPlatform() == null ^ this.getPlatform() == null) return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false) return false; 
        if (other.getHypervisor() == null ^ this.getHypervisor() == null) return false;
        if (other.getHypervisor() != null && other.getHypervisor().equals(this.getHypervisor()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getSnapshotDetails() == null ^ this.getSnapshotDetails() == null) return false;
        if (other.getSnapshotDetails() != null && other.getSnapshotDetails().equals(this.getSnapshotDetails()) == false) return false; 
        if (other.getImageId() == null ^ this.getImageId() == null) return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false) return false; 
        if (other.getProgress() == null ^ this.getProgress() == null) return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false) return false; 
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null) return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    