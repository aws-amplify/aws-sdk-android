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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a <code>Domain</code> used by SageMaker Studio. A domain consists of
 * an associated directory, a list of authorized users, and a variety of
 * security, application, policy, and Amazon Virtual Private Cloud (VPC)
 * configurations. An AWS account is limited to one domain per region. Users
 * within a domain can share notebook files and other artifacts with each other.
 * </p>
 * <p>
 * When a domain is created, an Amazon Elastic File System (EFS) volume is also
 * created for use by all of the users within the domain. Each user receives a
 * private home directory within the EFS for notebooks, Git repositories, and
 * data files.
 * </p>
 * <p>
 * All traffic between the domain and the EFS volume is communicated through the
 * specified subnet IDs. All other traffic goes over the Internet through an
 * Amazon SageMaker system VPC. The EFS traffic uses the NFS/TCP protocol over
 * port 2049.
 * </p>
 * <important>
 * <p>
 * NFS traffic over TCP on port 2049 needs to be allowed in both inbound and
 * outbound rules in order to launch a SageMaker Studio app successfully.
 * </p>
 * </important>
 */
public class CreateDomainRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A name for the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String domainName;

    /**
     * <p>
     * The mode of authentication that members use to access the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSO, IAM
     */
    private String authMode;

    /**
     * <p>
     * The default user settings.
     * </p>
     */
    private UserSettings defaultUserSettings;

    /**
     * <p>
     * The VPC subnets to use for communication with the EFS volume.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * The ID of the Amazon Virtual Private Cloud (VPC) to use for communication
     * with the EFS volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     * <b>Pattern: </b>[-0-9a-zA-Z]+<br/>
     */
    private String vpcId;

    /**
     * <p>
     * Tags to associated with the Domain. Each tag consists of a key and an
     * optional value. Tag keys must be unique per resource. Tags are searchable
     * using the <a>Search</a> API.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The AWS Key Management Service (KMS) encryption key ID. Encryption with a
     * customer master key (CMK) is not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String homeEfsFileSystemKmsKeyId;

    /**
     * <p>
     * A name for the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         A name for the domain.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * A name for the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param domainName <p>
     *            A name for the domain.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * A name for the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param domainName <p>
     *            A name for the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The mode of authentication that members use to access the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSO, IAM
     *
     * @return <p>
     *         The mode of authentication that members use to access the domain.
     *         </p>
     * @see AuthMode
     */
    public String getAuthMode() {
        return authMode;
    }

    /**
     * <p>
     * The mode of authentication that members use to access the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSO, IAM
     *
     * @param authMode <p>
     *            The mode of authentication that members use to access the
     *            domain.
     *            </p>
     * @see AuthMode
     */
    public void setAuthMode(String authMode) {
        this.authMode = authMode;
    }

    /**
     * <p>
     * The mode of authentication that members use to access the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSO, IAM
     *
     * @param authMode <p>
     *            The mode of authentication that members use to access the
     *            domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthMode
     */
    public CreateDomainRequest withAuthMode(String authMode) {
        this.authMode = authMode;
        return this;
    }

    /**
     * <p>
     * The mode of authentication that members use to access the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSO, IAM
     *
     * @param authMode <p>
     *            The mode of authentication that members use to access the
     *            domain.
     *            </p>
     * @see AuthMode
     */
    public void setAuthMode(AuthMode authMode) {
        this.authMode = authMode.toString();
    }

    /**
     * <p>
     * The mode of authentication that members use to access the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSO, IAM
     *
     * @param authMode <p>
     *            The mode of authentication that members use to access the
     *            domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthMode
     */
    public CreateDomainRequest withAuthMode(AuthMode authMode) {
        this.authMode = authMode.toString();
        return this;
    }

    /**
     * <p>
     * The default user settings.
     * </p>
     *
     * @return <p>
     *         The default user settings.
     *         </p>
     */
    public UserSettings getDefaultUserSettings() {
        return defaultUserSettings;
    }

    /**
     * <p>
     * The default user settings.
     * </p>
     *
     * @param defaultUserSettings <p>
     *            The default user settings.
     *            </p>
     */
    public void setDefaultUserSettings(UserSettings defaultUserSettings) {
        this.defaultUserSettings = defaultUserSettings;
    }

    /**
     * <p>
     * The default user settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultUserSettings <p>
     *            The default user settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainRequest withDefaultUserSettings(UserSettings defaultUserSettings) {
        this.defaultUserSettings = defaultUserSettings;
        return this;
    }

    /**
     * <p>
     * The VPC subnets to use for communication with the EFS volume.
     * </p>
     *
     * @return <p>
     *         The VPC subnets to use for communication with the EFS volume.
     *         </p>
     */
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The VPC subnets to use for communication with the EFS volume.
     * </p>
     *
     * @param subnetIds <p>
     *            The VPC subnets to use for communication with the EFS volume.
     *            </p>
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * The VPC subnets to use for communication with the EFS volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            The VPC subnets to use for communication with the EFS volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainRequest withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) {
            this.subnetIds = new java.util.ArrayList<String>(subnetIds.length);
        }
        for (String value : subnetIds) {
            this.subnetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The VPC subnets to use for communication with the EFS volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            The VPC subnets to use for communication with the EFS volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Virtual Private Cloud (VPC) to use for communication
     * with the EFS volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     * <b>Pattern: </b>[-0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The ID of the Amazon Virtual Private Cloud (VPC) to use for
     *         communication with the EFS volume.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the Amazon Virtual Private Cloud (VPC) to use for communication
     * with the EFS volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     * <b>Pattern: </b>[-0-9a-zA-Z]+<br/>
     *
     * @param vpcId <p>
     *            The ID of the Amazon Virtual Private Cloud (VPC) to use for
     *            communication with the EFS volume.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the Amazon Virtual Private Cloud (VPC) to use for communication
     * with the EFS volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     * <b>Pattern: </b>[-0-9a-zA-Z]+<br/>
     *
     * @param vpcId <p>
     *            The ID of the Amazon Virtual Private Cloud (VPC) to use for
     *            communication with the EFS volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * Tags to associated with the Domain. Each tag consists of a key and an
     * optional value. Tag keys must be unique per resource. Tags are searchable
     * using the <a>Search</a> API.
     * </p>
     *
     * @return <p>
     *         Tags to associated with the Domain. Each tag consists of a key
     *         and an optional value. Tag keys must be unique per resource. Tags
     *         are searchable using the <a>Search</a> API.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to associated with the Domain. Each tag consists of a key and an
     * optional value. Tag keys must be unique per resource. Tags are searchable
     * using the <a>Search</a> API.
     * </p>
     *
     * @param tags <p>
     *            Tags to associated with the Domain. Each tag consists of a key
     *            and an optional value. Tag keys must be unique per resource.
     *            Tags are searchable using the <a>Search</a> API.
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
     * Tags to associated with the Domain. Each tag consists of a key and an
     * optional value. Tag keys must be unique per resource. Tags are searchable
     * using the <a>Search</a> API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to associated with the Domain. Each tag consists of a key
     *            and an optional value. Tag keys must be unique per resource.
     *            Tags are searchable using the <a>Search</a> API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainRequest withTags(Tag... tags) {
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
     * Tags to associated with the Domain. Each tag consists of a key and an
     * optional value. Tag keys must be unique per resource. Tags are searchable
     * using the <a>Search</a> API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to associated with the Domain. Each tag consists of a key
     *            and an optional value. Tag keys must be unique per resource.
     *            Tags are searchable using the <a>Search</a> API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) encryption key ID. Encryption with a
     * customer master key (CMK) is not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The AWS Key Management Service (KMS) encryption key ID.
     *         Encryption with a customer master key (CMK) is not supported.
     *         </p>
     */
    public String getHomeEfsFileSystemKmsKeyId() {
        return homeEfsFileSystemKmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) encryption key ID. Encryption with a
     * customer master key (CMK) is not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param homeEfsFileSystemKmsKeyId <p>
     *            The AWS Key Management Service (KMS) encryption key ID.
     *            Encryption with a customer master key (CMK) is not supported.
     *            </p>
     */
    public void setHomeEfsFileSystemKmsKeyId(String homeEfsFileSystemKmsKeyId) {
        this.homeEfsFileSystemKmsKeyId = homeEfsFileSystemKmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (KMS) encryption key ID. Encryption with a
     * customer master key (CMK) is not supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param homeEfsFileSystemKmsKeyId <p>
     *            The AWS Key Management Service (KMS) encryption key ID.
     *            Encryption with a customer master key (CMK) is not supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDomainRequest withHomeEfsFileSystemKmsKeyId(String homeEfsFileSystemKmsKeyId) {
        this.homeEfsFileSystemKmsKeyId = homeEfsFileSystemKmsKeyId;
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getAuthMode() != null)
            sb.append("AuthMode: " + getAuthMode() + ",");
        if (getDefaultUserSettings() != null)
            sb.append("DefaultUserSettings: " + getDefaultUserSettings() + ",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: " + getSubnetIds() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getHomeEfsFileSystemKmsKeyId() != null)
            sb.append("HomeEfsFileSystemKmsKeyId: " + getHomeEfsFileSystemKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAuthMode() == null) ? 0 : getAuthMode().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultUserSettings() == null) ? 0 : getDefaultUserSettings().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getHomeEfsFileSystemKmsKeyId() == null) ? 0 : getHomeEfsFileSystemKmsKeyId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDomainRequest == false)
            return false;
        CreateDomainRequest other = (CreateDomainRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAuthMode() == null ^ this.getAuthMode() == null)
            return false;
        if (other.getAuthMode() != null && other.getAuthMode().equals(this.getAuthMode()) == false)
            return false;
        if (other.getDefaultUserSettings() == null ^ this.getDefaultUserSettings() == null)
            return false;
        if (other.getDefaultUserSettings() != null
                && other.getDefaultUserSettings().equals(this.getDefaultUserSettings()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null
                && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getHomeEfsFileSystemKmsKeyId() == null
                ^ this.getHomeEfsFileSystemKmsKeyId() == null)
            return false;
        if (other.getHomeEfsFileSystemKmsKeyId() != null
                && other.getHomeEfsFileSystemKmsKeyId().equals(this.getHomeEfsFileSystemKmsKeyId()) == false)
            return false;
        return true;
    }
}
