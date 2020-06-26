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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * A version of a template.
 * </p>
 */
public class TemplateVersion implements Serializable {
    /**
     * <p>
     * The time that this template version was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * Errors associated with the template.
     * </p>
     */
    private java.util.List<TemplateError> errors;

    /**
     * <p>
     * The version number of the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long versionNumber;

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     */
    private String status;

    /**
     * <p>
     * Schema of the dataset identified by the placeholder. The idea is that any
     * dashboard created from the template should be bound to new datasets
     * matching the same schema described through this API. .
     * </p>
     */
    private java.util.List<DataSetConfiguration> dataSetConfigurations;

    /**
     * <p>
     * The description of the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String description;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis or template which was used
     * to create this template.
     * </p>
     */
    private String sourceEntityArn;

    /**
     * <p>
     * The time that this template version was created.
     * </p>
     *
     * @return <p>
     *         The time that this template version was created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The time that this template version was created.
     * </p>
     *
     * @param createdTime <p>
     *            The time that this template version was created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that this template version was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The time that this template version was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersion withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * Errors associated with the template.
     * </p>
     *
     * @return <p>
     *         Errors associated with the template.
     *         </p>
     */
    public java.util.List<TemplateError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Errors associated with the template.
     * </p>
     *
     * @param errors <p>
     *            Errors associated with the template.
     *            </p>
     */
    public void setErrors(java.util.Collection<TemplateError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<TemplateError>(errors);
    }

    /**
     * <p>
     * Errors associated with the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Errors associated with the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersion withErrors(TemplateError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<TemplateError>(errors.length);
        }
        for (TemplateError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Errors associated with the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Errors associated with the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersion withErrors(java.util.Collection<TemplateError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * The version number of the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The version number of the template.
     *         </p>
     */
    public Long getVersionNumber() {
        return versionNumber;
    }

    /**
     * <p>
     * The version number of the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param versionNumber <p>
     *            The version number of the template.
     *            </p>
     */
    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number of the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param versionNumber <p>
     *            The version number of the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersion withVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @return <p>
     *         The HTTP status of the request.
     *         </p>
     * @see ResourceStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @param status <p>
     *            The HTTP status of the request.
     *            </p>
     * @see ResourceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @param status <p>
     *            The HTTP status of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceStatus
     */
    public TemplateVersion withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @param status <p>
     *            The HTTP status of the request.
     *            </p>
     * @see ResourceStatus
     */
    public void setStatus(ResourceStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, CREATION_SUCCESSFUL,
     * CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED
     *
     * @param status <p>
     *            The HTTP status of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceStatus
     */
    public TemplateVersion withStatus(ResourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Schema of the dataset identified by the placeholder. The idea is that any
     * dashboard created from the template should be bound to new datasets
     * matching the same schema described through this API. .
     * </p>
     *
     * @return <p>
     *         Schema of the dataset identified by the placeholder. The idea is
     *         that any dashboard created from the template should be bound to
     *         new datasets matching the same schema described through this API.
     *         .
     *         </p>
     */
    public java.util.List<DataSetConfiguration> getDataSetConfigurations() {
        return dataSetConfigurations;
    }

    /**
     * <p>
     * Schema of the dataset identified by the placeholder. The idea is that any
     * dashboard created from the template should be bound to new datasets
     * matching the same schema described through this API. .
     * </p>
     *
     * @param dataSetConfigurations <p>
     *            Schema of the dataset identified by the placeholder. The idea
     *            is that any dashboard created from the template should be
     *            bound to new datasets matching the same schema described
     *            through this API. .
     *            </p>
     */
    public void setDataSetConfigurations(
            java.util.Collection<DataSetConfiguration> dataSetConfigurations) {
        if (dataSetConfigurations == null) {
            this.dataSetConfigurations = null;
            return;
        }

        this.dataSetConfigurations = new java.util.ArrayList<DataSetConfiguration>(
                dataSetConfigurations);
    }

    /**
     * <p>
     * Schema of the dataset identified by the placeholder. The idea is that any
     * dashboard created from the template should be bound to new datasets
     * matching the same schema described through this API. .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSetConfigurations <p>
     *            Schema of the dataset identified by the placeholder. The idea
     *            is that any dashboard created from the template should be
     *            bound to new datasets matching the same schema described
     *            through this API. .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersion withDataSetConfigurations(DataSetConfiguration... dataSetConfigurations) {
        if (getDataSetConfigurations() == null) {
            this.dataSetConfigurations = new java.util.ArrayList<DataSetConfiguration>(
                    dataSetConfigurations.length);
        }
        for (DataSetConfiguration value : dataSetConfigurations) {
            this.dataSetConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Schema of the dataset identified by the placeholder. The idea is that any
     * dashboard created from the template should be bound to new datasets
     * matching the same schema described through this API. .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSetConfigurations <p>
     *            Schema of the dataset identified by the placeholder. The idea
     *            is that any dashboard created from the template should be
     *            bound to new datasets matching the same schema described
     *            through this API. .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersion withDataSetConfigurations(
            java.util.Collection<DataSetConfiguration> dataSetConfigurations) {
        setDataSetConfigurations(dataSetConfigurations);
        return this;
    }

    /**
     * <p>
     * The description of the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         The description of the template.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param description <p>
     *            The description of the template.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param description <p>
     *            The description of the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersion withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis or template which was used
     * to create this template.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the analysis or template which
     *         was used to create this template.
     *         </p>
     */
    public String getSourceEntityArn() {
        return sourceEntityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis or template which was used
     * to create this template.
     * </p>
     *
     * @param sourceEntityArn <p>
     *            The Amazon Resource Name (ARN) of the analysis or template
     *            which was used to create this template.
     *            </p>
     */
    public void setSourceEntityArn(String sourceEntityArn) {
        this.sourceEntityArn = sourceEntityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis or template which was used
     * to create this template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceEntityArn <p>
     *            The Amazon Resource Name (ARN) of the analysis or template
     *            which was used to create this template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersion withSourceEntityArn(String sourceEntityArn) {
        this.sourceEntityArn = sourceEntityArn;
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
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getErrors() != null)
            sb.append("Errors: " + getErrors() + ",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: " + getVersionNumber() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getDataSetConfigurations() != null)
            sb.append("DataSetConfigurations: " + getDataSetConfigurations() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSourceEntityArn() != null)
            sb.append("SourceEntityArn: " + getSourceEntityArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode
                + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getDataSetConfigurations() == null) ? 0 : getDataSetConfigurations().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getSourceEntityArn() == null) ? 0 : getSourceEntityArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateVersion == false)
            return false;
        TemplateVersion other = (TemplateVersion) obj;

        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null
                && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDataSetConfigurations() == null ^ this.getDataSetConfigurations() == null)
            return false;
        if (other.getDataSetConfigurations() != null
                && other.getDataSetConfigurations().equals(this.getDataSetConfigurations()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSourceEntityArn() == null ^ this.getSourceEntityArn() == null)
            return false;
        if (other.getSourceEntityArn() != null
                && other.getSourceEntityArn().equals(this.getSourceEntityArn()) == false)
            return false;
        return true;
    }
}
