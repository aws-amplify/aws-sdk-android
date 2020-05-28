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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

public class CreateConfigurationResult implements Serializable {
    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     */
    private String arn;

    /**
     * 
     <p>
     * The time when the configuration was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * 
     <p>
     * Latest revision of the configuration.
     * </p>
     */
    private ConfigurationRevision latestRevision;

    /**
     * 
     <p>
     * The name of the configuration.
     * </p>
     */
    private String name;

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the configuration.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     * 
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the configuration.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the configuration.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationResult withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * 
     <p>
     * The time when the configuration was created.
     * </p>
     * 
     * @return <p>
     *         The time when the configuration was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * 
     <p>
     * The time when the configuration was created.
     * </p>
     * 
     * @param creationTime <p>
     *            The time when the configuration was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 
     <p>
     * The time when the configuration was created.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time when the configuration was created.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 
     <p>
     * Latest revision of the configuration.
     * </p>
     * 
     * @return <p>
     *         Latest revision of the configuration.
     *         </p>
     */
    public ConfigurationRevision getLatestRevision() {
        return latestRevision;
    }

    /**
     * 
     <p>
     * Latest revision of the configuration.
     * </p>
     * 
     * @param latestRevision <p>
     *            Latest revision of the configuration.
     *            </p>
     */
    public void setLatestRevision(ConfigurationRevision latestRevision) {
        this.latestRevision = latestRevision;
    }

    /**
     * 
     <p>
     * Latest revision of the configuration.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latestRevision <p>
     *            Latest revision of the configuration.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationResult withLatestRevision(ConfigurationRevision latestRevision) {
        this.latestRevision = latestRevision;
        return this;
    }

    /**
     * 
     <p>
     * The name of the configuration.
     * </p>
     * 
     * @return <p>
     *         The name of the configuration.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * 
     <p>
     * The name of the configuration.
     * </p>
     * 
     * @param name <p>
     *            The name of the configuration.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     <p>
     * The name of the configuration.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the configuration.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationResult withName(String name) {
        this.name = name;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLatestRevision() != null)
            sb.append("LatestRevision: " + getLatestRevision() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLatestRevision() == null) ? 0 : getLatestRevision().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConfigurationResult == false)
            return false;
        CreateConfigurationResult other = (CreateConfigurationResult) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLatestRevision() == null ^ this.getLatestRevision() == null)
            return false;
        if (other.getLatestRevision() != null
                && other.getLatestRevision().equals(this.getLatestRevision()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
