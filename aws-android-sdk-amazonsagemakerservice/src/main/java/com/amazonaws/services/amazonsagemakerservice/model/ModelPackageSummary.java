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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Provides summary information about a model package.
 * </p>
 */
public class ModelPackageSummary implements Serializable {
    /**
     * <p>
     * The name of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String modelPackageName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model-package/.*<br/>
     */
    private String modelPackageArn;

    /**
     * <p>
     * A brief description of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     */
    private String modelPackageDescription;

    /**
     * <p>
     * A timestamp that shows when the model package was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The overall status of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     */
    private String modelPackageStatus;

    /**
     * <p>
     * The name of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the model package.
     *         </p>
     */
    public String getModelPackageName() {
        return modelPackageName;
    }

    /**
     * <p>
     * The name of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param modelPackageName <p>
     *            The name of the model package.
     *            </p>
     */
    public void setModelPackageName(String modelPackageName) {
        this.modelPackageName = modelPackageName;
    }

    /**
     * <p>
     * The name of the model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param modelPackageName <p>
     *            The name of the model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelPackageSummary withModelPackageName(String modelPackageName) {
        this.modelPackageName = modelPackageName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model-package/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the model package.
     *         </p>
     */
    public String getModelPackageArn() {
        return modelPackageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model-package/.*<br/>
     *
     * @param modelPackageArn <p>
     *            The Amazon Resource Name (ARN) of the model package.
     *            </p>
     */
    public void setModelPackageArn(String modelPackageArn) {
        this.modelPackageArn = modelPackageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model-package/.*<br/>
     *
     * @param modelPackageArn <p>
     *            The Amazon Resource Name (ARN) of the model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelPackageSummary withModelPackageArn(String modelPackageArn) {
        this.modelPackageArn = modelPackageArn;
        return this;
    }

    /**
     * <p>
     * A brief description of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @return <p>
     *         A brief description of the model package.
     *         </p>
     */
    public String getModelPackageDescription() {
        return modelPackageDescription;
    }

    /**
     * <p>
     * A brief description of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param modelPackageDescription <p>
     *            A brief description of the model package.
     *            </p>
     */
    public void setModelPackageDescription(String modelPackageDescription) {
        this.modelPackageDescription = modelPackageDescription;
    }

    /**
     * <p>
     * A brief description of the model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param modelPackageDescription <p>
     *            A brief description of the model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelPackageSummary withModelPackageDescription(String modelPackageDescription) {
        this.modelPackageDescription = modelPackageDescription;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the model package was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the model package was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the model package was created.
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp that shows when the model package was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the model package was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp that shows when the model package was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelPackageSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The overall status of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @return <p>
     *         The overall status of the model package.
     *         </p>
     * @see ModelPackageStatus
     */
    public String getModelPackageStatus() {
        return modelPackageStatus;
    }

    /**
     * <p>
     * The overall status of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @param modelPackageStatus <p>
     *            The overall status of the model package.
     *            </p>
     * @see ModelPackageStatus
     */
    public void setModelPackageStatus(String modelPackageStatus) {
        this.modelPackageStatus = modelPackageStatus;
    }

    /**
     * <p>
     * The overall status of the model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @param modelPackageStatus <p>
     *            The overall status of the model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelPackageStatus
     */
    public ModelPackageSummary withModelPackageStatus(String modelPackageStatus) {
        this.modelPackageStatus = modelPackageStatus;
        return this;
    }

    /**
     * <p>
     * The overall status of the model package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @param modelPackageStatus <p>
     *            The overall status of the model package.
     *            </p>
     * @see ModelPackageStatus
     */
    public void setModelPackageStatus(ModelPackageStatus modelPackageStatus) {
        this.modelPackageStatus = modelPackageStatus.toString();
    }

    /**
     * <p>
     * The overall status of the model package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Completed, Failed, Deleting
     *
     * @param modelPackageStatus <p>
     *            The overall status of the model package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelPackageStatus
     */
    public ModelPackageSummary withModelPackageStatus(ModelPackageStatus modelPackageStatus) {
        this.modelPackageStatus = modelPackageStatus.toString();
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
        if (getModelPackageName() != null)
            sb.append("ModelPackageName: " + getModelPackageName() + ",");
        if (getModelPackageArn() != null)
            sb.append("ModelPackageArn: " + getModelPackageArn() + ",");
        if (getModelPackageDescription() != null)
            sb.append("ModelPackageDescription: " + getModelPackageDescription() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getModelPackageStatus() != null)
            sb.append("ModelPackageStatus: " + getModelPackageStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getModelPackageName() == null) ? 0 : getModelPackageName().hashCode());
        hashCode = prime * hashCode
                + ((getModelPackageArn() == null) ? 0 : getModelPackageArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getModelPackageDescription() == null) ? 0 : getModelPackageDescription()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getModelPackageStatus() == null) ? 0 : getModelPackageStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelPackageSummary == false)
            return false;
        ModelPackageSummary other = (ModelPackageSummary) obj;

        if (other.getModelPackageName() == null ^ this.getModelPackageName() == null)
            return false;
        if (other.getModelPackageName() != null
                && other.getModelPackageName().equals(this.getModelPackageName()) == false)
            return false;
        if (other.getModelPackageArn() == null ^ this.getModelPackageArn() == null)
            return false;
        if (other.getModelPackageArn() != null
                && other.getModelPackageArn().equals(this.getModelPackageArn()) == false)
            return false;
        if (other.getModelPackageDescription() == null ^ this.getModelPackageDescription() == null)
            return false;
        if (other.getModelPackageDescription() != null
                && other.getModelPackageDescription().equals(this.getModelPackageDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getModelPackageStatus() == null ^ this.getModelPackageStatus() == null)
            return false;
        if (other.getModelPackageStatus() != null
                && other.getModelPackageStatus().equals(this.getModelPackageStatus()) == false)
            return false;
        return true;
    }
}
