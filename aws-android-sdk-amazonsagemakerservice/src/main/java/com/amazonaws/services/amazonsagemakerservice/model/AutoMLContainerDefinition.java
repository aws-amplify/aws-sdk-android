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
 * A list of container definitions that describe the different containers that
 * make up one AutoML candidate. Refer to ContainerDefinition for more details.
 * </p>
 */
public class AutoMLContainerDefinition implements Serializable {
    /**
     * <p>
     * The ECR path of the container. Refer to ContainerDefinition for more
     * details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String image;

    /**
     * <p>
     * The location of the model artifacts. Refer to ContainerDefinition for
     * more details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String modelDataUrl;

    /**
     * <p>
     * Environment variables to set in the container. Refer to
     * ContainerDefinition for more details.
     * </p>
     */
    private java.util.Map<String, String> environment;

    /**
     * <p>
     * The ECR path of the container. Refer to ContainerDefinition for more
     * details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return <p>
     *         The ECR path of the container. Refer to ContainerDefinition for
     *         more details.
     *         </p>
     */
    public String getImage() {
        return image;
    }

    /**
     * <p>
     * The ECR path of the container. Refer to ContainerDefinition for more
     * details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param image <p>
     *            The ECR path of the container. Refer to ContainerDefinition
     *            for more details.
     *            </p>
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The ECR path of the container. Refer to ContainerDefinition for more
     * details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param image <p>
     *            The ECR path of the container. Refer to ContainerDefinition
     *            for more details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLContainerDefinition withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * <p>
     * The location of the model artifacts. Refer to ContainerDefinition for
     * more details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         The location of the model artifacts. Refer to ContainerDefinition
     *         for more details.
     *         </p>
     */
    public String getModelDataUrl() {
        return modelDataUrl;
    }

    /**
     * <p>
     * The location of the model artifacts. Refer to ContainerDefinition for
     * more details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param modelDataUrl <p>
     *            The location of the model artifacts. Refer to
     *            ContainerDefinition for more details.
     *            </p>
     */
    public void setModelDataUrl(String modelDataUrl) {
        this.modelDataUrl = modelDataUrl;
    }

    /**
     * <p>
     * The location of the model artifacts. Refer to ContainerDefinition for
     * more details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param modelDataUrl <p>
     *            The location of the model artifacts. Refer to
     *            ContainerDefinition for more details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLContainerDefinition withModelDataUrl(String modelDataUrl) {
        this.modelDataUrl = modelDataUrl;
        return this;
    }

    /**
     * <p>
     * Environment variables to set in the container. Refer to
     * ContainerDefinition for more details.
     * </p>
     *
     * @return <p>
     *         Environment variables to set in the container. Refer to
     *         ContainerDefinition for more details.
     *         </p>
     */
    public java.util.Map<String, String> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * Environment variables to set in the container. Refer to
     * ContainerDefinition for more details.
     * </p>
     *
     * @param environment <p>
     *            Environment variables to set in the container. Refer to
     *            ContainerDefinition for more details.
     *            </p>
     */
    public void setEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * Environment variables to set in the container. Refer to
     * ContainerDefinition for more details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environment <p>
     *            Environment variables to set in the container. Refer to
     *            ContainerDefinition for more details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLContainerDefinition withEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
        return this;
    }

    /**
     * <p>
     * Environment variables to set in the container. Refer to
     * ContainerDefinition for more details.
     * </p>
     * <p>
     * The method adds a new key-value pair into Environment parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Environment.
     * @param value The corresponding value of the entry to be added into
     *            Environment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLContainerDefinition addEnvironmentEntry(String key, String value) {
        if (null == this.environment) {
            this.environment = new java.util.HashMap<String, String>();
        }
        if (this.environment.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.environment.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public AutoMLContainerDefinition clearEnvironmentEntries() {
        this.environment = null;
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
        if (getImage() != null)
            sb.append("Image: " + getImage() + ",");
        if (getModelDataUrl() != null)
            sb.append("ModelDataUrl: " + getModelDataUrl() + ",");
        if (getEnvironment() != null)
            sb.append("Environment: " + getEnvironment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode
                + ((getModelDataUrl() == null) ? 0 : getModelDataUrl().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLContainerDefinition == false)
            return false;
        AutoMLContainerDefinition other = (AutoMLContainerDefinition) obj;

        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getModelDataUrl() == null ^ this.getModelDataUrl() == null)
            return false;
        if (other.getModelDataUrl() != null
                && other.getModelDataUrl().equals(this.getModelDataUrl()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null
                && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        return true;
    }
}
