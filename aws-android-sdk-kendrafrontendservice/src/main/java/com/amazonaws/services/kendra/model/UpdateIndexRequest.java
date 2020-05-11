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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates an existing Amazon Kendra index.
 * </p>
 */
public class UpdateIndexRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the index to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     */
    private String id;

    /**
     * <p>
     * The name of the index to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String name;

    /**
     * <p>
     * A new IAM role that gives Amazon Kendra permission to access your Amazon
     * CloudWatch logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String roleArn;

    /**
     * <p>
     * A new description for the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     */
    private String description;

    /**
     * <p>
     * The document metadata to update.
     * </p>
     */
    private java.util.List<DocumentMetadataConfiguration> documentMetadataConfigurationUpdates;

    /**
     * <p>
     * Sets the number of addtional storage and query capacity units that should
     * be used by the index. You can change the capacity of the index up to 5
     * times per day.
     * </p>
     * <p>
     * If you are using extra storage units, you can't reduce the storage
     * capacity below that required to meet the storage needs for your index.
     * </p>
     */
    private CapacityUnitsConfiguration capacityUnits;

    /**
     * <p>
     * The identifier of the index to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @return <p>
     *         The identifier of the index to update.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the index to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param id <p>
     *            The identifier of the index to update.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the index to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param id <p>
     *            The identifier of the index to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIndexRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the index to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         The name of the index to update.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the index to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param name <p>
     *            The name of the index to update.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the index to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param name <p>
     *            The name of the index to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIndexRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A new IAM role that gives Amazon Kendra permission to access your Amazon
     * CloudWatch logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         A new IAM role that gives Amazon Kendra permission to access your
     *         Amazon CloudWatch logs.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * A new IAM role that gives Amazon Kendra permission to access your Amazon
     * CloudWatch logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roleArn <p>
     *            A new IAM role that gives Amazon Kendra permission to access
     *            your Amazon CloudWatch logs.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * A new IAM role that gives Amazon Kendra permission to access your Amazon
     * CloudWatch logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roleArn <p>
     *            A new IAM role that gives Amazon Kendra permission to access
     *            your Amazon CloudWatch logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIndexRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * A new description for the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @return <p>
     *         A new description for the index.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A new description for the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param description <p>
     *            A new description for the index.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description for the index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param description <p>
     *            A new description for the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIndexRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The document metadata to update.
     * </p>
     *
     * @return <p>
     *         The document metadata to update.
     *         </p>
     */
    public java.util.List<DocumentMetadataConfiguration> getDocumentMetadataConfigurationUpdates() {
        return documentMetadataConfigurationUpdates;
    }

    /**
     * <p>
     * The document metadata to update.
     * </p>
     *
     * @param documentMetadataConfigurationUpdates <p>
     *            The document metadata to update.
     *            </p>
     */
    public void setDocumentMetadataConfigurationUpdates(
            java.util.Collection<DocumentMetadataConfiguration> documentMetadataConfigurationUpdates) {
        if (documentMetadataConfigurationUpdates == null) {
            this.documentMetadataConfigurationUpdates = null;
            return;
        }

        this.documentMetadataConfigurationUpdates = new java.util.ArrayList<DocumentMetadataConfiguration>(
                documentMetadataConfigurationUpdates);
    }

    /**
     * <p>
     * The document metadata to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentMetadataConfigurationUpdates <p>
     *            The document metadata to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIndexRequest withDocumentMetadataConfigurationUpdates(
            DocumentMetadataConfiguration... documentMetadataConfigurationUpdates) {
        if (getDocumentMetadataConfigurationUpdates() == null) {
            this.documentMetadataConfigurationUpdates = new java.util.ArrayList<DocumentMetadataConfiguration>(
                    documentMetadataConfigurationUpdates.length);
        }
        for (DocumentMetadataConfiguration value : documentMetadataConfigurationUpdates) {
            this.documentMetadataConfigurationUpdates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The document metadata to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentMetadataConfigurationUpdates <p>
     *            The document metadata to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIndexRequest withDocumentMetadataConfigurationUpdates(
            java.util.Collection<DocumentMetadataConfiguration> documentMetadataConfigurationUpdates) {
        setDocumentMetadataConfigurationUpdates(documentMetadataConfigurationUpdates);
        return this;
    }

    /**
     * <p>
     * Sets the number of addtional storage and query capacity units that should
     * be used by the index. You can change the capacity of the index up to 5
     * times per day.
     * </p>
     * <p>
     * If you are using extra storage units, you can't reduce the storage
     * capacity below that required to meet the storage needs for your index.
     * </p>
     *
     * @return <p>
     *         Sets the number of addtional storage and query capacity units
     *         that should be used by the index. You can change the capacity of
     *         the index up to 5 times per day.
     *         </p>
     *         <p>
     *         If you are using extra storage units, you can't reduce the
     *         storage capacity below that required to meet the storage needs
     *         for your index.
     *         </p>
     */
    public CapacityUnitsConfiguration getCapacityUnits() {
        return capacityUnits;
    }

    /**
     * <p>
     * Sets the number of addtional storage and query capacity units that should
     * be used by the index. You can change the capacity of the index up to 5
     * times per day.
     * </p>
     * <p>
     * If you are using extra storage units, you can't reduce the storage
     * capacity below that required to meet the storage needs for your index.
     * </p>
     *
     * @param capacityUnits <p>
     *            Sets the number of addtional storage and query capacity units
     *            that should be used by the index. You can change the capacity
     *            of the index up to 5 times per day.
     *            </p>
     *            <p>
     *            If you are using extra storage units, you can't reduce the
     *            storage capacity below that required to meet the storage needs
     *            for your index.
     *            </p>
     */
    public void setCapacityUnits(CapacityUnitsConfiguration capacityUnits) {
        this.capacityUnits = capacityUnits;
    }

    /**
     * <p>
     * Sets the number of addtional storage and query capacity units that should
     * be used by the index. You can change the capacity of the index up to 5
     * times per day.
     * </p>
     * <p>
     * If you are using extra storage units, you can't reduce the storage
     * capacity below that required to meet the storage needs for your index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityUnits <p>
     *            Sets the number of addtional storage and query capacity units
     *            that should be used by the index. You can change the capacity
     *            of the index up to 5 times per day.
     *            </p>
     *            <p>
     *            If you are using extra storage units, you can't reduce the
     *            storage capacity below that required to meet the storage needs
     *            for your index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIndexRequest withCapacityUnits(CapacityUnitsConfiguration capacityUnits) {
        this.capacityUnits = capacityUnits;
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
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDocumentMetadataConfigurationUpdates() != null)
            sb.append("DocumentMetadataConfigurationUpdates: "
                    + getDocumentMetadataConfigurationUpdates() + ",");
        if (getCapacityUnits() != null)
            sb.append("CapacityUnits: " + getCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getDocumentMetadataConfigurationUpdates() == null) ? 0
                        : getDocumentMetadataConfigurationUpdates().hashCode());
        hashCode = prime * hashCode
                + ((getCapacityUnits() == null) ? 0 : getCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIndexRequest == false)
            return false;
        UpdateIndexRequest other = (UpdateIndexRequest) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDocumentMetadataConfigurationUpdates() == null
                ^ this.getDocumentMetadataConfigurationUpdates() == null)
            return false;
        if (other.getDocumentMetadataConfigurationUpdates() != null
                && other.getDocumentMetadataConfigurationUpdates().equals(
                        this.getDocumentMetadataConfigurationUpdates()) == false)
            return false;
        if (other.getCapacityUnits() == null ^ this.getCapacityUnits() == null)
            return false;
        if (other.getCapacityUnits() != null
                && other.getCapacityUnits().equals(this.getCapacityUnits()) == false)
            return false;
        return true;
    }
}
