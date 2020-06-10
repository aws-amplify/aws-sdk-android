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

package com.amazonaws.services.appconfig.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Information that enables AppConfig to access the configuration source. Valid
 * configuration sources include Systems Manager (SSM) documents, SSM Parameter
 * Store parameters, and Amazon S3 objects. A configuration profile includes the
 * following information.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The Uri location of the configuration data.
 * </p>
 * </li>
 * <li>
 * <p>
 * The AWS Identity and Access Management (IAM) role that provides access to the
 * configuration data.
 * </p>
 * </li>
 * <li>
 * <p>
 * A validator for the configuration data. Available validators include either a
 * JSON Schema or an AWS Lambda function.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig-creating-configuration-and-profile.html"
 * >Create a Configuration and a Configuration Profile</a> in the <i>AWS
 * AppConfig User Guide</i>.
 * </p>
 */
public class CreateConfigurationProfileRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The application ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     */
    private String applicationId;

    /**
     * <p>
     * A name for the configuration profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the configuration profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * A URI to locate the configuration. You can specify a Systems Manager
     * (SSM) document, an SSM Parameter Store parameter, or an Amazon S3 object.
     * For an SSM document, specify either the document name in the format
     * <code>ssm-document://&lt;Document_name&gt;</code> or the Amazon Resource
     * Name (ARN). For a parameter, specify either the parameter name in the
     * format <code>ssm-parameter://&lt;Parameter_name&gt;</code> or the ARN.
     * For an Amazon S3 object, specify the URI in the following format:
     * <code>s3://&lt;bucket&gt;/&lt;objectKey&gt; </code>. Here is an example:
     * s3://my-bucket/my-app/us-east-1/my-config.json
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String locationUri;

    /**
     * <p>
     * The ARN of an IAM role with permission to access the configuration at the
     * specified LocationUri.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^((arn):(aws|aws-cn|aws-iso|aws-iso-[a-z]{1}|aws-us-gov):(
     * iam)::\d{12}:role[/].*)$<br/>
     */
    private String retrievalRoleArn;

    /**
     * <p>
     * A list of methods for validating the configuration.
     * </p>
     */
    private java.util.List<Validator> validators;

    /**
     * <p>
     * Metadata to assign to the configuration profile. Tags help organize and
     * categorize your AppConfig resources. Each tag consists of a key and an
     * optional value, both of which you define.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The application ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @return <p>
     *         The application ID.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param applicationId <p>
     *            The application ID.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param applicationId <p>
     *            The application ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationProfileRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * A name for the configuration profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         A name for the configuration profile.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A name for the configuration profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            A name for the configuration profile.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the configuration profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            A name for the configuration profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationProfileRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the configuration profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         A description of the configuration profile.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the configuration profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            A description of the configuration profile.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the configuration profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            A description of the configuration profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationProfileRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A URI to locate the configuration. You can specify a Systems Manager
     * (SSM) document, an SSM Parameter Store parameter, or an Amazon S3 object.
     * For an SSM document, specify either the document name in the format
     * <code>ssm-document://&lt;Document_name&gt;</code> or the Amazon Resource
     * Name (ARN). For a parameter, specify either the parameter name in the
     * format <code>ssm-parameter://&lt;Parameter_name&gt;</code> or the ARN.
     * For an Amazon S3 object, specify the URI in the following format:
     * <code>s3://&lt;bucket&gt;/&lt;objectKey&gt; </code>. Here is an example:
     * s3://my-bucket/my-app/us-east-1/my-config.json
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         A URI to locate the configuration. You can specify a Systems
     *         Manager (SSM) document, an SSM Parameter Store parameter, or an
     *         Amazon S3 object. For an SSM document, specify either the
     *         document name in the format
     *         <code>ssm-document://&lt;Document_name&gt;</code> or the Amazon
     *         Resource Name (ARN). For a parameter, specify either the
     *         parameter name in the format
     *         <code>ssm-parameter://&lt;Parameter_name&gt;</code> or the ARN.
     *         For an Amazon S3 object, specify the URI in the following format:
     *         <code>s3://&lt;bucket&gt;/&lt;objectKey&gt; </code>. Here is an
     *         example: s3://my-bucket/my-app/us-east-1/my-config.json
     *         </p>
     */
    public String getLocationUri() {
        return locationUri;
    }

    /**
     * <p>
     * A URI to locate the configuration. You can specify a Systems Manager
     * (SSM) document, an SSM Parameter Store parameter, or an Amazon S3 object.
     * For an SSM document, specify either the document name in the format
     * <code>ssm-document://&lt;Document_name&gt;</code> or the Amazon Resource
     * Name (ARN). For a parameter, specify either the parameter name in the
     * format <code>ssm-parameter://&lt;Parameter_name&gt;</code> or the ARN.
     * For an Amazon S3 object, specify the URI in the following format:
     * <code>s3://&lt;bucket&gt;/&lt;objectKey&gt; </code>. Here is an example:
     * s3://my-bucket/my-app/us-east-1/my-config.json
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param locationUri <p>
     *            A URI to locate the configuration. You can specify a Systems
     *            Manager (SSM) document, an SSM Parameter Store parameter, or
     *            an Amazon S3 object. For an SSM document, specify either the
     *            document name in the format
     *            <code>ssm-document://&lt;Document_name&gt;</code> or the
     *            Amazon Resource Name (ARN). For a parameter, specify either
     *            the parameter name in the format
     *            <code>ssm-parameter://&lt;Parameter_name&gt;</code> or the
     *            ARN. For an Amazon S3 object, specify the URI in the following
     *            format: <code>s3://&lt;bucket&gt;/&lt;objectKey&gt; </code>.
     *            Here is an example:
     *            s3://my-bucket/my-app/us-east-1/my-config.json
     *            </p>
     */
    public void setLocationUri(String locationUri) {
        this.locationUri = locationUri;
    }

    /**
     * <p>
     * A URI to locate the configuration. You can specify a Systems Manager
     * (SSM) document, an SSM Parameter Store parameter, or an Amazon S3 object.
     * For an SSM document, specify either the document name in the format
     * <code>ssm-document://&lt;Document_name&gt;</code> or the Amazon Resource
     * Name (ARN). For a parameter, specify either the parameter name in the
     * format <code>ssm-parameter://&lt;Parameter_name&gt;</code> or the ARN.
     * For an Amazon S3 object, specify the URI in the following format:
     * <code>s3://&lt;bucket&gt;/&lt;objectKey&gt; </code>. Here is an example:
     * s3://my-bucket/my-app/us-east-1/my-config.json
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param locationUri <p>
     *            A URI to locate the configuration. You can specify a Systems
     *            Manager (SSM) document, an SSM Parameter Store parameter, or
     *            an Amazon S3 object. For an SSM document, specify either the
     *            document name in the format
     *            <code>ssm-document://&lt;Document_name&gt;</code> or the
     *            Amazon Resource Name (ARN). For a parameter, specify either
     *            the parameter name in the format
     *            <code>ssm-parameter://&lt;Parameter_name&gt;</code> or the
     *            ARN. For an Amazon S3 object, specify the URI in the following
     *            format: <code>s3://&lt;bucket&gt;/&lt;objectKey&gt; </code>.
     *            Here is an example:
     *            s3://my-bucket/my-app/us-east-1/my-config.json
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationProfileRequest withLocationUri(String locationUri) {
        this.locationUri = locationUri;
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role with permission to access the configuration at the
     * specified LocationUri.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^((arn):(aws|aws-cn|aws-iso|aws-iso-[a-z]{1}|aws-us-gov):(
     * iam)::\d{12}:role[/].*)$<br/>
     *
     * @return <p>
     *         The ARN of an IAM role with permission to access the
     *         configuration at the specified LocationUri.
     *         </p>
     */
    public String getRetrievalRoleArn() {
        return retrievalRoleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role with permission to access the configuration at the
     * specified LocationUri.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^((arn):(aws|aws-cn|aws-iso|aws-iso-[a-z]{1}|aws-us-gov):(
     * iam)::\d{12}:role[/].*)$<br/>
     *
     * @param retrievalRoleArn <p>
     *            The ARN of an IAM role with permission to access the
     *            configuration at the specified LocationUri.
     *            </p>
     */
    public void setRetrievalRoleArn(String retrievalRoleArn) {
        this.retrievalRoleArn = retrievalRoleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role with permission to access the configuration at the
     * specified LocationUri.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^((arn):(aws|aws-cn|aws-iso|aws-iso-[a-z]{1}|aws-us-gov):(
     * iam)::\d{12}:role[/].*)$<br/>
     *
     * @param retrievalRoleArn <p>
     *            The ARN of an IAM role with permission to access the
     *            configuration at the specified LocationUri.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationProfileRequest withRetrievalRoleArn(String retrievalRoleArn) {
        this.retrievalRoleArn = retrievalRoleArn;
        return this;
    }

    /**
     * <p>
     * A list of methods for validating the configuration.
     * </p>
     *
     * @return <p>
     *         A list of methods for validating the configuration.
     *         </p>
     */
    public java.util.List<Validator> getValidators() {
        return validators;
    }

    /**
     * <p>
     * A list of methods for validating the configuration.
     * </p>
     *
     * @param validators <p>
     *            A list of methods for validating the configuration.
     *            </p>
     */
    public void setValidators(java.util.Collection<Validator> validators) {
        if (validators == null) {
            this.validators = null;
            return;
        }

        this.validators = new java.util.ArrayList<Validator>(validators);
    }

    /**
     * <p>
     * A list of methods for validating the configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validators <p>
     *            A list of methods for validating the configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationProfileRequest withValidators(Validator... validators) {
        if (getValidators() == null) {
            this.validators = new java.util.ArrayList<Validator>(validators.length);
        }
        for (Validator value : validators) {
            this.validators.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of methods for validating the configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validators <p>
     *            A list of methods for validating the configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationProfileRequest withValidators(
            java.util.Collection<Validator> validators) {
        setValidators(validators);
        return this;
    }

    /**
     * <p>
     * Metadata to assign to the configuration profile. Tags help organize and
     * categorize your AppConfig resources. Each tag consists of a key and an
     * optional value, both of which you define.
     * </p>
     *
     * @return <p>
     *         Metadata to assign to the configuration profile. Tags help
     *         organize and categorize your AppConfig resources. Each tag
     *         consists of a key and an optional value, both of which you
     *         define.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata to assign to the configuration profile. Tags help organize and
     * categorize your AppConfig resources. Each tag consists of a key and an
     * optional value, both of which you define.
     * </p>
     *
     * @param tags <p>
     *            Metadata to assign to the configuration profile. Tags help
     *            organize and categorize your AppConfig resources. Each tag
     *            consists of a key and an optional value, both of which you
     *            define.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata to assign to the configuration profile. Tags help organize and
     * categorize your AppConfig resources. Each tag consists of a key and an
     * optional value, both of which you define.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata to assign to the configuration profile. Tags help
     *            organize and categorize your AppConfig resources. Each tag
     *            consists of a key and an optional value, both of which you
     *            define.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationProfileRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * Metadata to assign to the configuration profile. Tags help organize and
     * categorize your AppConfig resources. Each tag consists of a key and an
     * optional value, both of which you define.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationProfileRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateConfigurationProfileRequest clearTagsEntries() {
        this.tags = null;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getLocationUri() != null)
            sb.append("LocationUri: " + getLocationUri() + ",");
        if (getRetrievalRoleArn() != null)
            sb.append("RetrievalRoleArn: " + getRetrievalRoleArn() + ",");
        if (getValidators() != null)
            sb.append("Validators: " + getValidators() + ",");
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
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getLocationUri() == null) ? 0 : getLocationUri().hashCode());
        hashCode = prime * hashCode
                + ((getRetrievalRoleArn() == null) ? 0 : getRetrievalRoleArn().hashCode());
        hashCode = prime * hashCode + ((getValidators() == null) ? 0 : getValidators().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConfigurationProfileRequest == false)
            return false;
        CreateConfigurationProfileRequest other = (CreateConfigurationProfileRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLocationUri() == null ^ this.getLocationUri() == null)
            return false;
        if (other.getLocationUri() != null
                && other.getLocationUri().equals(this.getLocationUri()) == false)
            return false;
        if (other.getRetrievalRoleArn() == null ^ this.getRetrievalRoleArn() == null)
            return false;
        if (other.getRetrievalRoleArn() != null
                && other.getRetrievalRoleArn().equals(this.getRetrievalRoleArn()) == false)
            return false;
        if (other.getValidators() == null ^ this.getValidators() == null)
            return false;
        if (other.getValidators() != null
                && other.getValidators().equals(this.getValidators()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
