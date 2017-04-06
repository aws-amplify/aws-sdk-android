/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes an import image task.
 * </p>
 */
public class ImportImageTask implements Serializable {

    /**
     * The ID of the import image task.
     */
    private String importTaskId;

    /**
     * The architecture of the virtual machine. <p>Valid values:
     * <code>i386</code> | <code>x86_64</code>
     */
    private String architecture;

    /**
     * The license type of the virtual machine.
     */
    private String licenseType;

    /**
     * The description string for the import image task.
     */
    private String platform;

    /**
     * The target hypervisor for the import task. <p>Valid values:
     * <code>xen</code>
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
     * The ID of the Amazon Machine Image (AMI) of the imported virtual
     * machine.
     */
    private String imageId;

    /**
     * The percentage of progress of the import image task.
     */
    private String progress;

    /**
     * A descriptive status message for the import image task.
     */
    private String statusMessage;

    /**
     * A brief status for the import image task.
     */
    private String status;

    /**
     * The ID of the import image task.
     *
     * @return The ID of the import image task.
     */
    public String getImportTaskId() {
        return importTaskId;
    }
    
    /**
     * The ID of the import image task.
     *
     * @param importTaskId The ID of the import image task.
     */
    public void setImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
    }
    
    /**
     * The ID of the import image task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importTaskId The ID of the import image task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageTask withImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
        return this;
    }

    /**
     * The architecture of the virtual machine. <p>Valid values:
     * <code>i386</code> | <code>x86_64</code>
     *
     * @return The architecture of the virtual machine. <p>Valid values:
     *         <code>i386</code> | <code>x86_64</code>
     */
    public String getArchitecture() {
        return architecture;
    }
    
    /**
     * The architecture of the virtual machine. <p>Valid values:
     * <code>i386</code> | <code>x86_64</code>
     *
     * @param architecture The architecture of the virtual machine. <p>Valid values:
     *         <code>i386</code> | <code>x86_64</code>
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }
    
    /**
     * The architecture of the virtual machine. <p>Valid values:
     * <code>i386</code> | <code>x86_64</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param architecture The architecture of the virtual machine. <p>Valid values:
     *         <code>i386</code> | <code>x86_64</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageTask withArchitecture(String architecture) {
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
    public ImportImageTask withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * The description string for the import image task.
     *
     * @return The description string for the import image task.
     */
    public String getPlatform() {
        return platform;
    }
    
    /**
     * The description string for the import image task.
     *
     * @param platform The description string for the import image task.
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    /**
     * The description string for the import image task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param platform The description string for the import image task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageTask withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * The target hypervisor for the import task. <p>Valid values:
     * <code>xen</code>
     *
     * @return The target hypervisor for the import task. <p>Valid values:
     *         <code>xen</code>
     */
    public String getHypervisor() {
        return hypervisor;
    }
    
    /**
     * The target hypervisor for the import task. <p>Valid values:
     * <code>xen</code>
     *
     * @param hypervisor The target hypervisor for the import task. <p>Valid values:
     *         <code>xen</code>
     */
    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }
    
    /**
     * The target hypervisor for the import task. <p>Valid values:
     * <code>xen</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hypervisor The target hypervisor for the import task. <p>Valid values:
     *         <code>xen</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageTask withHypervisor(String hypervisor) {
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
    public ImportImageTask withDescription(String description) {
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
    public ImportImageTask withSnapshotDetails(SnapshotDetail... snapshotDetails) {
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
    public ImportImageTask withSnapshotDetails(java.util.Collection<SnapshotDetail> snapshotDetails) {
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
     * The ID of the Amazon Machine Image (AMI) of the imported virtual
     * machine.
     *
     * @return The ID of the Amazon Machine Image (AMI) of the imported virtual
     *         machine.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * The ID of the Amazon Machine Image (AMI) of the imported virtual
     * machine.
     *
     * @param imageId The ID of the Amazon Machine Image (AMI) of the imported virtual
     *         machine.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * The ID of the Amazon Machine Image (AMI) of the imported virtual
     * machine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId The ID of the Amazon Machine Image (AMI) of the imported virtual
     *         machine.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageTask withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * The percentage of progress of the import image task.
     *
     * @return The percentage of progress of the import image task.
     */
    public String getProgress() {
        return progress;
    }
    
    /**
     * The percentage of progress of the import image task.
     *
     * @param progress The percentage of progress of the import image task.
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }
    
    /**
     * The percentage of progress of the import image task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param progress The percentage of progress of the import image task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageTask withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * A descriptive status message for the import image task.
     *
     * @return A descriptive status message for the import image task.
     */
    public String getStatusMessage() {
        return statusMessage;
    }
    
    /**
     * A descriptive status message for the import image task.
     *
     * @param statusMessage A descriptive status message for the import image task.
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    
    /**
     * A descriptive status message for the import image task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusMessage A descriptive status message for the import image task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageTask withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * A brief status for the import image task.
     *
     * @return A brief status for the import image task.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * A brief status for the import image task.
     *
     * @param status A brief status for the import image task.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * A brief status for the import image task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status A brief status for the import image task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageTask withStatus(String status) {
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

        if (obj instanceof ImportImageTask == false) return false;
        ImportImageTask other = (ImportImageTask)obj;
        
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
    