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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a provisioning artifact (also known as a version) for a
 * product.
 * </p>
 */
public class ProvisioningArtifactProperties implements Serializable {
    /**
     * <p>
     * The name of the provisioning artifact (for example, v1 v2beta). No spaces
     * are allowed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the provisioning artifact, including how it differs
     * from the previous provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     */
    private String description;

    /**
     * <p>
     * The URL of the CloudFormation template in Amazon S3. Specify the URL in
     * JSON format as follows:
     * </p>
     * <p>
     * <code>"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."</code>
     * </p>
     */
    private java.util.Map<String, String> info;

    /**
     * <p>
     * The type of provisioning artifact.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation template
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and AWS Resources
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLOUD_FORMATION_TEMPLATE, MARKETPLACE_AMI,
     * MARKETPLACE_CAR
     */
    private String type;

    /**
     * <p>
     * If set to true, AWS Service Catalog stops validating the specified
     * provisioning artifact even if it is invalid.
     * </p>
     */
    private Boolean disableTemplateValidation;

    /**
     * <p>
     * The name of the provisioning artifact (for example, v1 v2beta). No spaces
     * are allowed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @return <p>
     *         The name of the provisioning artifact (for example, v1 v2beta).
     *         No spaces are allowed.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the provisioning artifact (for example, v1 v2beta). No spaces
     * are allowed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param name <p>
     *            The name of the provisioning artifact (for example, v1
     *            v2beta). No spaces are allowed.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the provisioning artifact (for example, v1 v2beta). No spaces
     * are allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param name <p>
     *            The name of the provisioning artifact (for example, v1
     *            v2beta). No spaces are allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the provisioning artifact, including how it differs
     * from the previous provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @return <p>
     *         The description of the provisioning artifact, including how it
     *         differs from the previous provisioning artifact.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the provisioning artifact, including how it differs
     * from the previous provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param description <p>
     *            The description of the provisioning artifact, including how it
     *            differs from the previous provisioning artifact.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the provisioning artifact, including how it differs
     * from the previous provisioning artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param description <p>
     *            The description of the provisioning artifact, including how it
     *            differs from the previous provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The URL of the CloudFormation template in Amazon S3. Specify the URL in
     * JSON format as follows:
     * </p>
     * <p>
     * <code>"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."</code>
     * </p>
     *
     * @return <p>
     *         The URL of the CloudFormation template in Amazon S3. Specify the
     *         URL in JSON format as follows:
     *         </p>
     *         <p>
     *         <code>"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."</code>
     *         </p>
     */
    public java.util.Map<String, String> getInfo() {
        return info;
    }

    /**
     * <p>
     * The URL of the CloudFormation template in Amazon S3. Specify the URL in
     * JSON format as follows:
     * </p>
     * <p>
     * <code>"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."</code>
     * </p>
     *
     * @param info <p>
     *            The URL of the CloudFormation template in Amazon S3. Specify
     *            the URL in JSON format as follows:
     *            </p>
     *            <p>
     *            <code>"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."</code>
     *            </p>
     */
    public void setInfo(java.util.Map<String, String> info) {
        this.info = info;
    }

    /**
     * <p>
     * The URL of the CloudFormation template in Amazon S3. Specify the URL in
     * JSON format as follows:
     * </p>
     * <p>
     * <code>"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param info <p>
     *            The URL of the CloudFormation template in Amazon S3. Specify
     *            the URL in JSON format as follows:
     *            </p>
     *            <p>
     *            <code>"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactProperties withInfo(java.util.Map<String, String> info) {
        this.info = info;
        return this;
    }

    /**
     * <p>
     * The URL of the CloudFormation template in Amazon S3. Specify the URL in
     * JSON format as follows:
     * </p>
     * <p>
     * <code>"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."</code>
     * </p>
     * <p>
     * The method adds a new key-value pair into Info parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Info.
     * @param value The corresponding value of the entry to be added into Info.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactProperties addInfoEntry(String key, String value) {
        if (null == this.info) {
            this.info = new java.util.HashMap<String, String>();
        }
        if (this.info.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.info.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Info.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ProvisioningArtifactProperties clearInfoEntries() {
        this.info = null;
        return this;
    }

    /**
     * <p>
     * The type of provisioning artifact.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation template
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and AWS Resources
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLOUD_FORMATION_TEMPLATE, MARKETPLACE_AMI,
     * MARKETPLACE_CAR
     *
     * @return <p>
     *         The type of provisioning artifact.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation
     *         template
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and AWS
     *         Resources
     *         </p>
     *         </li>
     *         </ul>
     * @see ProvisioningArtifactType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of provisioning artifact.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation template
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and AWS Resources
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLOUD_FORMATION_TEMPLATE, MARKETPLACE_AMI,
     * MARKETPLACE_CAR
     *
     * @param type <p>
     *            The type of provisioning artifact.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation
     *            template
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and
     *            AWS Resources
     *            </p>
     *            </li>
     *            </ul>
     * @see ProvisioningArtifactType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of provisioning artifact.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation template
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and AWS Resources
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLOUD_FORMATION_TEMPLATE, MARKETPLACE_AMI,
     * MARKETPLACE_CAR
     *
     * @param type <p>
     *            The type of provisioning artifact.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation
     *            template
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and
     *            AWS Resources
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProvisioningArtifactType
     */
    public ProvisioningArtifactProperties withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of provisioning artifact.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation template
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and AWS Resources
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLOUD_FORMATION_TEMPLATE, MARKETPLACE_AMI,
     * MARKETPLACE_CAR
     *
     * @param type <p>
     *            The type of provisioning artifact.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation
     *            template
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and
     *            AWS Resources
     *            </p>
     *            </li>
     *            </ul>
     * @see ProvisioningArtifactType
     */
    public void setType(ProvisioningArtifactType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of provisioning artifact.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation template
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and AWS Resources
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLOUD_FORMATION_TEMPLATE, MARKETPLACE_AMI,
     * MARKETPLACE_CAR
     *
     * @param type <p>
     *            The type of provisioning artifact.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation
     *            template
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and
     *            AWS Resources
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProvisioningArtifactType
     */
    public ProvisioningArtifactProperties withType(ProvisioningArtifactType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops validating the specified
     * provisioning artifact even if it is invalid.
     * </p>
     *
     * @return <p>
     *         If set to true, AWS Service Catalog stops validating the
     *         specified provisioning artifact even if it is invalid.
     *         </p>
     */
    public Boolean isDisableTemplateValidation() {
        return disableTemplateValidation;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops validating the specified
     * provisioning artifact even if it is invalid.
     * </p>
     *
     * @return <p>
     *         If set to true, AWS Service Catalog stops validating the
     *         specified provisioning artifact even if it is invalid.
     *         </p>
     */
    public Boolean getDisableTemplateValidation() {
        return disableTemplateValidation;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops validating the specified
     * provisioning artifact even if it is invalid.
     * </p>
     *
     * @param disableTemplateValidation <p>
     *            If set to true, AWS Service Catalog stops validating the
     *            specified provisioning artifact even if it is invalid.
     *            </p>
     */
    public void setDisableTemplateValidation(Boolean disableTemplateValidation) {
        this.disableTemplateValidation = disableTemplateValidation;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops validating the specified
     * provisioning artifact even if it is invalid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableTemplateValidation <p>
     *            If set to true, AWS Service Catalog stops validating the
     *            specified provisioning artifact even if it is invalid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactProperties withDisableTemplateValidation(
            Boolean disableTemplateValidation) {
        this.disableTemplateValidation = disableTemplateValidation;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getInfo() != null)
            sb.append("Info: " + getInfo() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDisableTemplateValidation() != null)
            sb.append("DisableTemplateValidation: " + getDisableTemplateValidation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInfo() == null) ? 0 : getInfo().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime
                * hashCode
                + ((getDisableTemplateValidation() == null) ? 0 : getDisableTemplateValidation()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningArtifactProperties == false)
            return false;
        ProvisioningArtifactProperties other = (ProvisioningArtifactProperties) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInfo() == null ^ this.getInfo() == null)
            return false;
        if (other.getInfo() != null && other.getInfo().equals(this.getInfo()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDisableTemplateValidation() == null
                ^ this.getDisableTemplateValidation() == null)
            return false;
        if (other.getDisableTemplateValidation() != null
                && other.getDisableTemplateValidation().equals(this.getDisableTemplateValidation()) == false)
            return false;
        return true;
    }
}
