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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ImportImageRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#importImage(ImportImageRequest) ImportImage operation}.
 * <p>
 * Import single or multi-volume disk images or EBS snapshots into an
 * Amazon Machine Image (AMI).
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#importImage(ImportImageRequest)
 */
public class ImportImageRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ImportImageRequest> {

    /**
     * A description string for the import image task.
     */
    private String description;

    /**
     * Information about the disk containers.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ImageDiskContainer> diskContainers;

    /**
     * The license type to be used for the Amazon Machine Image (AMI) after
     * importing. <p><b>Note:</b> You may only use BYOL if you have existing
     * licenses with rights to use these licenses in a third party cloud like
     * AWS. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/VMImportPrerequisites.html">VM
     * Import/Export Prerequisites</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>. <p>Valid values: <code>AWS</code> | <code>BYOL</code>
     */
    private String licenseType;

    /**
     * The target hypervisor platform. <p>Valid values: <code>xen</code>
     */
    private String hypervisor;

    /**
     * The architecture of the virtual machine. <p>Valid values:
     * <code>i386</code> | <code>x86_64</code>
     */
    private String architecture;

    /**
     * The operating system of the virtual machine. <p>Valid values:
     * <code>Windows</code> | <code>Linux</code>
     */
    private String platform;

    /**
     * The client-specific data.
     */
    private ClientData clientData;

    /**
     * The token to enable idempotency for VM import requests.
     */
    private String clientToken;

    /**
     * The name of the role to use when not using the default role,
     * 'vmimport'.
     */
    private String roleName;

    /**
     * A description string for the import image task.
     *
     * @return A description string for the import image task.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description string for the import image task.
     *
     * @param description A description string for the import image task.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description string for the import image task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description string for the import image task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Information about the disk containers.
     *
     * @return Information about the disk containers.
     */
    public java.util.List<ImageDiskContainer> getDiskContainers() {
        if (diskContainers == null) {
              diskContainers = new com.amazonaws.internal.ListWithAutoConstructFlag<ImageDiskContainer>();
              diskContainers.setAutoConstruct(true);
        }
        return diskContainers;
    }
    
    /**
     * Information about the disk containers.
     *
     * @param diskContainers Information about the disk containers.
     */
    public void setDiskContainers(java.util.Collection<ImageDiskContainer> diskContainers) {
        if (diskContainers == null) {
            this.diskContainers = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ImageDiskContainer> diskContainersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ImageDiskContainer>(diskContainers.size());
        diskContainersCopy.addAll(diskContainers);
        this.diskContainers = diskContainersCopy;
    }
    
    /**
     * Information about the disk containers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskContainers Information about the disk containers.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageRequest withDiskContainers(ImageDiskContainer... diskContainers) {
        if (getDiskContainers() == null) setDiskContainers(new java.util.ArrayList<ImageDiskContainer>(diskContainers.length));
        for (ImageDiskContainer value : diskContainers) {
            getDiskContainers().add(value);
        }
        return this;
    }
    
    /**
     * Information about the disk containers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskContainers Information about the disk containers.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageRequest withDiskContainers(java.util.Collection<ImageDiskContainer> diskContainers) {
        if (diskContainers == null) {
            this.diskContainers = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ImageDiskContainer> diskContainersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ImageDiskContainer>(diskContainers.size());
            diskContainersCopy.addAll(diskContainers);
            this.diskContainers = diskContainersCopy;
        }

        return this;
    }

    /**
     * The license type to be used for the Amazon Machine Image (AMI) after
     * importing. <p><b>Note:</b> You may only use BYOL if you have existing
     * licenses with rights to use these licenses in a third party cloud like
     * AWS. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/VMImportPrerequisites.html">VM
     * Import/Export Prerequisites</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>. <p>Valid values: <code>AWS</code> | <code>BYOL</code>
     *
     * @return The license type to be used for the Amazon Machine Image (AMI) after
     *         importing. <p><b>Note:</b> You may only use BYOL if you have existing
     *         licenses with rights to use these licenses in a third party cloud like
     *         AWS. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/VMImportPrerequisites.html">VM
     *         Import/Export Prerequisites</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>. <p>Valid values: <code>AWS</code> | <code>BYOL</code>
     */
    public String getLicenseType() {
        return licenseType;
    }
    
    /**
     * The license type to be used for the Amazon Machine Image (AMI) after
     * importing. <p><b>Note:</b> You may only use BYOL if you have existing
     * licenses with rights to use these licenses in a third party cloud like
     * AWS. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/VMImportPrerequisites.html">VM
     * Import/Export Prerequisites</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>. <p>Valid values: <code>AWS</code> | <code>BYOL</code>
     *
     * @param licenseType The license type to be used for the Amazon Machine Image (AMI) after
     *         importing. <p><b>Note:</b> You may only use BYOL if you have existing
     *         licenses with rights to use these licenses in a third party cloud like
     *         AWS. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/VMImportPrerequisites.html">VM
     *         Import/Export Prerequisites</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>. <p>Valid values: <code>AWS</code> | <code>BYOL</code>
     */
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }
    
    /**
     * The license type to be used for the Amazon Machine Image (AMI) after
     * importing. <p><b>Note:</b> You may only use BYOL if you have existing
     * licenses with rights to use these licenses in a third party cloud like
     * AWS. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/VMImportPrerequisites.html">VM
     * Import/Export Prerequisites</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>. <p>Valid values: <code>AWS</code> | <code>BYOL</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseType The license type to be used for the Amazon Machine Image (AMI) after
     *         importing. <p><b>Note:</b> You may only use BYOL if you have existing
     *         licenses with rights to use these licenses in a third party cloud like
     *         AWS. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/VMImportPrerequisites.html">VM
     *         Import/Export Prerequisites</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>. <p>Valid values: <code>AWS</code> | <code>BYOL</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageRequest withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * The target hypervisor platform. <p>Valid values: <code>xen</code>
     *
     * @return The target hypervisor platform. <p>Valid values: <code>xen</code>
     */
    public String getHypervisor() {
        return hypervisor;
    }
    
    /**
     * The target hypervisor platform. <p>Valid values: <code>xen</code>
     *
     * @param hypervisor The target hypervisor platform. <p>Valid values: <code>xen</code>
     */
    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }
    
    /**
     * The target hypervisor platform. <p>Valid values: <code>xen</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hypervisor The target hypervisor platform. <p>Valid values: <code>xen</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageRequest withHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
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
    public ImportImageRequest withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * The operating system of the virtual machine. <p>Valid values:
     * <code>Windows</code> | <code>Linux</code>
     *
     * @return The operating system of the virtual machine. <p>Valid values:
     *         <code>Windows</code> | <code>Linux</code>
     */
    public String getPlatform() {
        return platform;
    }
    
    /**
     * The operating system of the virtual machine. <p>Valid values:
     * <code>Windows</code> | <code>Linux</code>
     *
     * @param platform The operating system of the virtual machine. <p>Valid values:
     *         <code>Windows</code> | <code>Linux</code>
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    /**
     * The operating system of the virtual machine. <p>Valid values:
     * <code>Windows</code> | <code>Linux</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param platform The operating system of the virtual machine. <p>Valid values:
     *         <code>Windows</code> | <code>Linux</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageRequest withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * The client-specific data.
     *
     * @return The client-specific data.
     */
    public ClientData getClientData() {
        return clientData;
    }
    
    /**
     * The client-specific data.
     *
     * @param clientData The client-specific data.
     */
    public void setClientData(ClientData clientData) {
        this.clientData = clientData;
    }
    
    /**
     * The client-specific data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientData The client-specific data.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageRequest withClientData(ClientData clientData) {
        this.clientData = clientData;
        return this;
    }

    /**
     * The token to enable idempotency for VM import requests.
     *
     * @return The token to enable idempotency for VM import requests.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * The token to enable idempotency for VM import requests.
     *
     * @param clientToken The token to enable idempotency for VM import requests.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * The token to enable idempotency for VM import requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken The token to enable idempotency for VM import requests.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * The name of the role to use when not using the default role,
     * 'vmimport'.
     *
     * @return The name of the role to use when not using the default role,
     *         'vmimport'.
     */
    public String getRoleName() {
        return roleName;
    }
    
    /**
     * The name of the role to use when not using the default role,
     * 'vmimport'.
     *
     * @param roleName The name of the role to use when not using the default role,
     *         'vmimport'.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    /**
     * The name of the role to use when not using the default role,
     * 'vmimport'.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param roleName The name of the role to use when not using the default role,
     *         'vmimport'.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportImageRequest withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ImportImageRequest> getDryRunRequest() {
        Request<ImportImageRequest> request = new ImportImageRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getDiskContainers() != null) sb.append("DiskContainers: " + getDiskContainers() + ",");
        if (getLicenseType() != null) sb.append("LicenseType: " + getLicenseType() + ",");
        if (getHypervisor() != null) sb.append("Hypervisor: " + getHypervisor() + ",");
        if (getArchitecture() != null) sb.append("Architecture: " + getArchitecture() + ",");
        if (getPlatform() != null) sb.append("Platform: " + getPlatform() + ",");
        if (getClientData() != null) sb.append("ClientData: " + getClientData() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() + ",");
        if (getRoleName() != null) sb.append("RoleName: " + getRoleName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getDiskContainers() == null) ? 0 : getDiskContainers().hashCode()); 
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode()); 
        hashCode = prime * hashCode + ((getHypervisor() == null) ? 0 : getHypervisor().hashCode()); 
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode()); 
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode()); 
        hashCode = prime * hashCode + ((getClientData() == null) ? 0 : getClientData().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ImportImageRequest == false) return false;
        ImportImageRequest other = (ImportImageRequest)obj;
        
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getDiskContainers() == null ^ this.getDiskContainers() == null) return false;
        if (other.getDiskContainers() != null && other.getDiskContainers().equals(this.getDiskContainers()) == false) return false; 
        if (other.getLicenseType() == null ^ this.getLicenseType() == null) return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false) return false; 
        if (other.getHypervisor() == null ^ this.getHypervisor() == null) return false;
        if (other.getHypervisor() != null && other.getHypervisor().equals(this.getHypervisor()) == false) return false; 
        if (other.getArchitecture() == null ^ this.getArchitecture() == null) return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false) return false; 
        if (other.getPlatform() == null ^ this.getPlatform() == null) return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false) return false; 
        if (other.getClientData() == null ^ this.getClientData() == null) return false;
        if (other.getClientData() != null && other.getClientData().equals(this.getClientData()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        if (other.getRoleName() == null ^ this.getRoleName() == null) return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false) return false; 
        return true;
    }
    
}
    