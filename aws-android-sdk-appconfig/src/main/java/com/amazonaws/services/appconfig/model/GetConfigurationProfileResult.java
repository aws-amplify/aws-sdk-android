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

public class GetConfigurationProfileResult implements Serializable {
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
     * The configuration profile ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     */
    private String id;

    /**
     * <p>
     * The name of the configuration profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String name;

    /**
     * <p>
     * The configuration profile description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The URI location of the configuration.
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
    public GetConfigurationProfileResult withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @return <p>
     *         The configuration profile ID.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param id <p>
     *            The configuration profile ID.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param id <p>
     *            The configuration profile ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConfigurationProfileResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the configuration profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The name of the configuration profile.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the configuration profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            The name of the configuration profile.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configuration profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            The name of the configuration profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConfigurationProfileResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The configuration profile description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         The configuration profile description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The configuration profile description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            The configuration profile description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The configuration profile description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            The configuration profile description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConfigurationProfileResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The URI location of the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The URI location of the configuration.
     *         </p>
     */
    public String getLocationUri() {
        return locationUri;
    }

    /**
     * <p>
     * The URI location of the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param locationUri <p>
     *            The URI location of the configuration.
     *            </p>
     */
    public void setLocationUri(String locationUri) {
        this.locationUri = locationUri;
    }

    /**
     * <p>
     * The URI location of the configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param locationUri <p>
     *            The URI location of the configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConfigurationProfileResult withLocationUri(String locationUri) {
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
    public GetConfigurationProfileResult withRetrievalRoleArn(String retrievalRoleArn) {
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
    public GetConfigurationProfileResult withValidators(Validator... validators) {
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
    public GetConfigurationProfileResult withValidators(java.util.Collection<Validator> validators) {
        setValidators(validators);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getLocationUri() != null)
            sb.append("LocationUri: " + getLocationUri() + ",");
        if (getRetrievalRoleArn() != null)
            sb.append("RetrievalRoleArn: " + getRetrievalRoleArn() + ",");
        if (getValidators() != null)
            sb.append("Validators: " + getValidators());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getLocationUri() == null) ? 0 : getLocationUri().hashCode());
        hashCode = prime * hashCode
                + ((getRetrievalRoleArn() == null) ? 0 : getRetrievalRoleArn().hashCode());
        hashCode = prime * hashCode + ((getValidators() == null) ? 0 : getValidators().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConfigurationProfileResult == false)
            return false;
        GetConfigurationProfileResult other = (GetConfigurationProfileResult) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        return true;
    }
}
