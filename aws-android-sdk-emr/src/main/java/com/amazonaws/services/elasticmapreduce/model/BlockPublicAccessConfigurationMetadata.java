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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Properties that describe the AWS principal that created the
 * <code>BlockPublicAccessConfiguration</code> using the
 * <code>PutBlockPublicAccessConfiguration</code> action as well as the date and
 * time that the configuration was created. Each time a configuration for block
 * public access is updated, Amazon EMR updates this metadata.
 * </p>
 */
public class BlockPublicAccessConfigurationMetadata implements Serializable {
    /**
     * <p>
     * The date and time that the configuration was created.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The Amazon Resource Name that created or last modified the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String createdByArn;

    /**
     * <p>
     * The date and time that the configuration was created.
     * </p>
     *
     * @return <p>
     *         The date and time that the configuration was created.
     *         </p>
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * <p>
     * The date and time that the configuration was created.
     * </p>
     *
     * @param creationDateTime <p>
     *            The date and time that the configuration was created.
     *            </p>
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time that the configuration was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDateTime <p>
     *            The date and time that the configuration was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockPublicAccessConfigurationMetadata withCreationDateTime(
            java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name that created or last modified the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name that created or last modified the
     *         configuration.
     *         </p>
     */
    public String getCreatedByArn() {
        return createdByArn;
    }

    /**
     * <p>
     * The Amazon Resource Name that created or last modified the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param createdByArn <p>
     *            The Amazon Resource Name that created or last modified the
     *            configuration.
     *            </p>
     */
    public void setCreatedByArn(String createdByArn) {
        this.createdByArn = createdByArn;
    }

    /**
     * <p>
     * The Amazon Resource Name that created or last modified the configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param createdByArn <p>
     *            The Amazon Resource Name that created or last modified the
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlockPublicAccessConfigurationMetadata withCreatedByArn(String createdByArn) {
        this.createdByArn = createdByArn;
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
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: " + getCreationDateTime() + ",");
        if (getCreatedByArn() != null)
            sb.append("CreatedByArn: " + getCreatedByArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedByArn() == null) ? 0 : getCreatedByArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlockPublicAccessConfigurationMetadata == false)
            return false;
        BlockPublicAccessConfigurationMetadata other = (BlockPublicAccessConfigurationMetadata) obj;

        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null
                && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getCreatedByArn() == null ^ this.getCreatedByArn() == null)
            return false;
        if (other.getCreatedByArn() != null
                && other.getCreatedByArn().equals(this.getCreatedByArn()) == false)
            return false;
        return true;
    }
}
