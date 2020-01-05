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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * A user pool description.
 * </p>
 */
public class UserPoolDescriptionType implements Serializable {
    /**
     * <p>
     * The ID in a user pool description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String id;

    /**
     * <p>
     * The name in a user pool description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     */
    private String name;

    /**
     * <p>
     * The AWS Lambda configuration information in a user pool description.
     * </p>
     */
    private LambdaConfigType lambdaConfig;

    /**
     * <p>
     * The user pool status in a user pool description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     */
    private String status;

    /**
     * <p>
     * The date the user pool description was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The date the user pool description was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The ID in a user pool description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The ID in a user pool description.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID in a user pool description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param id <p>
     *            The ID in a user pool description.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID in a user pool description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param id <p>
     *            The ID in a user pool description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolDescriptionType withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name in a user pool description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @return <p>
     *         The name in a user pool description.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name in a user pool description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param name <p>
     *            The name in a user pool description.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name in a user pool description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param name <p>
     *            The name in a user pool description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolDescriptionType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The AWS Lambda configuration information in a user pool description.
     * </p>
     *
     * @return <p>
     *         The AWS Lambda configuration information in a user pool
     *         description.
     *         </p>
     */
    public LambdaConfigType getLambdaConfig() {
        return lambdaConfig;
    }

    /**
     * <p>
     * The AWS Lambda configuration information in a user pool description.
     * </p>
     *
     * @param lambdaConfig <p>
     *            The AWS Lambda configuration information in a user pool
     *            description.
     *            </p>
     */
    public void setLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }

    /**
     * <p>
     * The AWS Lambda configuration information in a user pool description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambdaConfig <p>
     *            The AWS Lambda configuration information in a user pool
     *            description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolDescriptionType withLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
        return this;
    }

    /**
     * <p>
     * The user pool status in a user pool description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @return <p>
     *         The user pool status in a user pool description.
     *         </p>
     * @see StatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The user pool status in a user pool description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            The user pool status in a user pool description.
     *            </p>
     * @see StatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The user pool status in a user pool description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            The user pool status in a user pool description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public UserPoolDescriptionType withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The user pool status in a user pool description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            The user pool status in a user pool description.
     *            </p>
     * @see StatusType
     */
    public void setStatus(StatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The user pool status in a user pool description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            The user pool status in a user pool description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public UserPoolDescriptionType withStatus(StatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date the user pool description was last modified.
     * </p>
     *
     * @return <p>
     *         The date the user pool description was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date the user pool description was last modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date the user pool description was last modified.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the user pool description was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date the user pool description was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolDescriptionType withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The date the user pool description was created.
     * </p>
     *
     * @return <p>
     *         The date the user pool description was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date the user pool description was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date the user pool description was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the user pool description was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date the user pool description was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolDescriptionType withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getLambdaConfig() != null)
            sb.append("LambdaConfig: " + getLambdaConfig() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getLambdaConfig() == null) ? 0 : getLambdaConfig().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserPoolDescriptionType == false)
            return false;
        UserPoolDescriptionType other = (UserPoolDescriptionType) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLambdaConfig() == null ^ this.getLambdaConfig() == null)
            return false;
        if (other.getLambdaConfig() != null
                && other.getLambdaConfig().equals(this.getLambdaConfig()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }
}
