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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an HSM configuration that contains the information required by an
 * Amazon Redshift cluster to store and use database encryption keys in a
 * Hardware Security Module (HSM). After creating the HSM configuration, you can
 * specify it as a parameter when creating a cluster. The cluster will then
 * store its encryption keys in the HSM.
 * </p>
 * <p>
 * In addition to creating an HSM configuration, you must also create an HSM
 * client certificate. For more information, go to <a href=
 * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-HSM.html"
 * >Hardware Security Modules</a> in the Amazon Redshift Cluster Management
 * Guide.
 * </p>
 */
public class CreateHsmConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier to be assigned to the new Amazon Redshift HSM
     * configuration.
     * </p>
     */
    private String hsmConfigurationIdentifier;

    /**
     * <p>
     * A text description of the HSM configuration to be created.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The IP address that the Amazon Redshift cluster must use to access the
     * HSM.
     * </p>
     */
    private String hsmIpAddress;

    /**
     * <p>
     * The name of the partition in the HSM where the Amazon Redshift clusters
     * will store their database encryption keys.
     * </p>
     */
    private String hsmPartitionName;

    /**
     * <p>
     * The password required to access the HSM partition.
     * </p>
     */
    private String hsmPartitionPassword;

    /**
     * <p>
     * The HSMs public certificate file. When using Cloud HSM, the file name is
     * server.pem.
     * </p>
     */
    private String hsmServerPublicCertificate;

    /**
     * <p>
     * A list of tag instances.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The identifier to be assigned to the new Amazon Redshift HSM
     * configuration.
     * </p>
     *
     * @return <p>
     *         The identifier to be assigned to the new Amazon Redshift HSM
     *         configuration.
     *         </p>
     */
    public String getHsmConfigurationIdentifier() {
        return hsmConfigurationIdentifier;
    }

    /**
     * <p>
     * The identifier to be assigned to the new Amazon Redshift HSM
     * configuration.
     * </p>
     *
     * @param hsmConfigurationIdentifier <p>
     *            The identifier to be assigned to the new Amazon Redshift HSM
     *            configuration.
     *            </p>
     */
    public void setHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
    }

    /**
     * <p>
     * The identifier to be assigned to the new Amazon Redshift HSM
     * configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hsmConfigurationIdentifier <p>
     *            The identifier to be assigned to the new Amazon Redshift HSM
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHsmConfigurationRequest withHsmConfigurationIdentifier(
            String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
        return this;
    }

    /**
     * <p>
     * A text description of the HSM configuration to be created.
     * </p>
     *
     * @return <p>
     *         A text description of the HSM configuration to be created.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A text description of the HSM configuration to be created.
     * </p>
     *
     * @param description <p>
     *            A text description of the HSM configuration to be created.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A text description of the HSM configuration to be created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A text description of the HSM configuration to be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHsmConfigurationRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The IP address that the Amazon Redshift cluster must use to access the
     * HSM.
     * </p>
     *
     * @return <p>
     *         The IP address that the Amazon Redshift cluster must use to
     *         access the HSM.
     *         </p>
     */
    public String getHsmIpAddress() {
        return hsmIpAddress;
    }

    /**
     * <p>
     * The IP address that the Amazon Redshift cluster must use to access the
     * HSM.
     * </p>
     *
     * @param hsmIpAddress <p>
     *            The IP address that the Amazon Redshift cluster must use to
     *            access the HSM.
     *            </p>
     */
    public void setHsmIpAddress(String hsmIpAddress) {
        this.hsmIpAddress = hsmIpAddress;
    }

    /**
     * <p>
     * The IP address that the Amazon Redshift cluster must use to access the
     * HSM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hsmIpAddress <p>
     *            The IP address that the Amazon Redshift cluster must use to
     *            access the HSM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHsmConfigurationRequest withHsmIpAddress(String hsmIpAddress) {
        this.hsmIpAddress = hsmIpAddress;
        return this;
    }

    /**
     * <p>
     * The name of the partition in the HSM where the Amazon Redshift clusters
     * will store their database encryption keys.
     * </p>
     *
     * @return <p>
     *         The name of the partition in the HSM where the Amazon Redshift
     *         clusters will store their database encryption keys.
     *         </p>
     */
    public String getHsmPartitionName() {
        return hsmPartitionName;
    }

    /**
     * <p>
     * The name of the partition in the HSM where the Amazon Redshift clusters
     * will store their database encryption keys.
     * </p>
     *
     * @param hsmPartitionName <p>
     *            The name of the partition in the HSM where the Amazon Redshift
     *            clusters will store their database encryption keys.
     *            </p>
     */
    public void setHsmPartitionName(String hsmPartitionName) {
        this.hsmPartitionName = hsmPartitionName;
    }

    /**
     * <p>
     * The name of the partition in the HSM where the Amazon Redshift clusters
     * will store their database encryption keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hsmPartitionName <p>
     *            The name of the partition in the HSM where the Amazon Redshift
     *            clusters will store their database encryption keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHsmConfigurationRequest withHsmPartitionName(String hsmPartitionName) {
        this.hsmPartitionName = hsmPartitionName;
        return this;
    }

    /**
     * <p>
     * The password required to access the HSM partition.
     * </p>
     *
     * @return <p>
     *         The password required to access the HSM partition.
     *         </p>
     */
    public String getHsmPartitionPassword() {
        return hsmPartitionPassword;
    }

    /**
     * <p>
     * The password required to access the HSM partition.
     * </p>
     *
     * @param hsmPartitionPassword <p>
     *            The password required to access the HSM partition.
     *            </p>
     */
    public void setHsmPartitionPassword(String hsmPartitionPassword) {
        this.hsmPartitionPassword = hsmPartitionPassword;
    }

    /**
     * <p>
     * The password required to access the HSM partition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hsmPartitionPassword <p>
     *            The password required to access the HSM partition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHsmConfigurationRequest withHsmPartitionPassword(String hsmPartitionPassword) {
        this.hsmPartitionPassword = hsmPartitionPassword;
        return this;
    }

    /**
     * <p>
     * The HSMs public certificate file. When using Cloud HSM, the file name is
     * server.pem.
     * </p>
     *
     * @return <p>
     *         The HSMs public certificate file. When using Cloud HSM, the file
     *         name is server.pem.
     *         </p>
     */
    public String getHsmServerPublicCertificate() {
        return hsmServerPublicCertificate;
    }

    /**
     * <p>
     * The HSMs public certificate file. When using Cloud HSM, the file name is
     * server.pem.
     * </p>
     *
     * @param hsmServerPublicCertificate <p>
     *            The HSMs public certificate file. When using Cloud HSM, the
     *            file name is server.pem.
     *            </p>
     */
    public void setHsmServerPublicCertificate(String hsmServerPublicCertificate) {
        this.hsmServerPublicCertificate = hsmServerPublicCertificate;
    }

    /**
     * <p>
     * The HSMs public certificate file. When using Cloud HSM, the file name is
     * server.pem.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hsmServerPublicCertificate <p>
     *            The HSMs public certificate file. When using Cloud HSM, the
     *            file name is server.pem.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHsmConfigurationRequest withHsmServerPublicCertificate(
            String hsmServerPublicCertificate) {
        this.hsmServerPublicCertificate = hsmServerPublicCertificate;
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     *
     * @return <p>
     *         A list of tag instances.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     *
     * @param tags <p>
     *            A list of tag instances.
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
     * A list of tag instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tag instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHsmConfigurationRequest withTags(Tag... tags) {
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
     * A list of tag instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tag instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHsmConfigurationRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getHsmConfigurationIdentifier() != null)
            sb.append("HsmConfigurationIdentifier: " + getHsmConfigurationIdentifier() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getHsmIpAddress() != null)
            sb.append("HsmIpAddress: " + getHsmIpAddress() + ",");
        if (getHsmPartitionName() != null)
            sb.append("HsmPartitionName: " + getHsmPartitionName() + ",");
        if (getHsmPartitionPassword() != null)
            sb.append("HsmPartitionPassword: " + getHsmPartitionPassword() + ",");
        if (getHsmServerPublicCertificate() != null)
            sb.append("HsmServerPublicCertificate: " + getHsmServerPublicCertificate() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHsmConfigurationIdentifier() == null) ? 0 : getHsmConfigurationIdentifier()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getHsmIpAddress() == null) ? 0 : getHsmIpAddress().hashCode());
        hashCode = prime * hashCode
                + ((getHsmPartitionName() == null) ? 0 : getHsmPartitionName().hashCode());
        hashCode = prime * hashCode
                + ((getHsmPartitionPassword() == null) ? 0 : getHsmPartitionPassword().hashCode());
        hashCode = prime
                * hashCode
                + ((getHsmServerPublicCertificate() == null) ? 0 : getHsmServerPublicCertificate()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHsmConfigurationRequest == false)
            return false;
        CreateHsmConfigurationRequest other = (CreateHsmConfigurationRequest) obj;

        if (other.getHsmConfigurationIdentifier() == null
                ^ this.getHsmConfigurationIdentifier() == null)
            return false;
        if (other.getHsmConfigurationIdentifier() != null
                && other.getHsmConfigurationIdentifier().equals(
                        this.getHsmConfigurationIdentifier()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getHsmIpAddress() == null ^ this.getHsmIpAddress() == null)
            return false;
        if (other.getHsmIpAddress() != null
                && other.getHsmIpAddress().equals(this.getHsmIpAddress()) == false)
            return false;
        if (other.getHsmPartitionName() == null ^ this.getHsmPartitionName() == null)
            return false;
        if (other.getHsmPartitionName() != null
                && other.getHsmPartitionName().equals(this.getHsmPartitionName()) == false)
            return false;
        if (other.getHsmPartitionPassword() == null ^ this.getHsmPartitionPassword() == null)
            return false;
        if (other.getHsmPartitionPassword() != null
                && other.getHsmPartitionPassword().equals(this.getHsmPartitionPassword()) == false)
            return false;
        if (other.getHsmServerPublicCertificate() == null
                ^ this.getHsmServerPublicCertificate() == null)
            return false;
        if (other.getHsmServerPublicCertificate() != null
                && other.getHsmServerPublicCertificate().equals(
                        this.getHsmServerPublicCertificate()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
