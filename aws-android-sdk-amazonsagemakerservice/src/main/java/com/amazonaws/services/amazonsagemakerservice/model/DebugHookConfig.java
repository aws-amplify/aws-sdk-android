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
 * Configuration information for the debug hook parameters, collection
 * configuration, and storage paths.
 * </p>
 */
public class DebugHookConfig implements Serializable {
    /**
     * <p>
     * Path to local storage location for tensors. Defaults to
     * <code>/opt/ml/output/tensors/</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String localPath;

    /**
     * <p>
     * Path to Amazon S3 storage location for tensors.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String s3OutputPath;

    /**
     * <p>
     * Configuration information for the debug hook parameters.
     * </p>
     */
    private java.util.Map<String, String> hookParameters;

    /**
     * <p>
     * Configuration information for tensor collections.
     * </p>
     */
    private java.util.List<CollectionConfiguration> collectionConfigurations;

    /**
     * <p>
     * Path to local storage location for tensors. Defaults to
     * <code>/opt/ml/output/tensors/</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         Path to local storage location for tensors. Defaults to
     *         <code>/opt/ml/output/tensors/</code>.
     *         </p>
     */
    public String getLocalPath() {
        return localPath;
    }

    /**
     * <p>
     * Path to local storage location for tensors. Defaults to
     * <code>/opt/ml/output/tensors/</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param localPath <p>
     *            Path to local storage location for tensors. Defaults to
     *            <code>/opt/ml/output/tensors/</code>.
     *            </p>
     */
    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    /**
     * <p>
     * Path to local storage location for tensors. Defaults to
     * <code>/opt/ml/output/tensors/</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param localPath <p>
     *            Path to local storage location for tensors. Defaults to
     *            <code>/opt/ml/output/tensors/</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DebugHookConfig withLocalPath(String localPath) {
        this.localPath = localPath;
        return this;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for tensors.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         Path to Amazon S3 storage location for tensors.
     *         </p>
     */
    public String getS3OutputPath() {
        return s3OutputPath;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for tensors.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3OutputPath <p>
     *            Path to Amazon S3 storage location for tensors.
     *            </p>
     */
    public void setS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for tensors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3OutputPath <p>
     *            Path to Amazon S3 storage location for tensors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DebugHookConfig withS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
        return this;
    }

    /**
     * <p>
     * Configuration information for the debug hook parameters.
     * </p>
     *
     * @return <p>
     *         Configuration information for the debug hook parameters.
     *         </p>
     */
    public java.util.Map<String, String> getHookParameters() {
        return hookParameters;
    }

    /**
     * <p>
     * Configuration information for the debug hook parameters.
     * </p>
     *
     * @param hookParameters <p>
     *            Configuration information for the debug hook parameters.
     *            </p>
     */
    public void setHookParameters(java.util.Map<String, String> hookParameters) {
        this.hookParameters = hookParameters;
    }

    /**
     * <p>
     * Configuration information for the debug hook parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hookParameters <p>
     *            Configuration information for the debug hook parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DebugHookConfig withHookParameters(java.util.Map<String, String> hookParameters) {
        this.hookParameters = hookParameters;
        return this;
    }

    /**
     * <p>
     * Configuration information for the debug hook parameters.
     * </p>
     * <p>
     * The method adds a new key-value pair into HookParameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into HookParameters.
     * @param value The corresponding value of the entry to be added into
     *            HookParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DebugHookConfig addHookParametersEntry(String key, String value) {
        if (null == this.hookParameters) {
            this.hookParameters = new java.util.HashMap<String, String>();
        }
        if (this.hookParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.hookParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into HookParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DebugHookConfig clearHookParametersEntries() {
        this.hookParameters = null;
        return this;
    }

    /**
     * <p>
     * Configuration information for tensor collections.
     * </p>
     *
     * @return <p>
     *         Configuration information for tensor collections.
     *         </p>
     */
    public java.util.List<CollectionConfiguration> getCollectionConfigurations() {
        return collectionConfigurations;
    }

    /**
     * <p>
     * Configuration information for tensor collections.
     * </p>
     *
     * @param collectionConfigurations <p>
     *            Configuration information for tensor collections.
     *            </p>
     */
    public void setCollectionConfigurations(
            java.util.Collection<CollectionConfiguration> collectionConfigurations) {
        if (collectionConfigurations == null) {
            this.collectionConfigurations = null;
            return;
        }

        this.collectionConfigurations = new java.util.ArrayList<CollectionConfiguration>(
                collectionConfigurations);
    }

    /**
     * <p>
     * Configuration information for tensor collections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param collectionConfigurations <p>
     *            Configuration information for tensor collections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DebugHookConfig withCollectionConfigurations(
            CollectionConfiguration... collectionConfigurations) {
        if (getCollectionConfigurations() == null) {
            this.collectionConfigurations = new java.util.ArrayList<CollectionConfiguration>(
                    collectionConfigurations.length);
        }
        for (CollectionConfiguration value : collectionConfigurations) {
            this.collectionConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Configuration information for tensor collections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param collectionConfigurations <p>
     *            Configuration information for tensor collections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DebugHookConfig withCollectionConfigurations(
            java.util.Collection<CollectionConfiguration> collectionConfigurations) {
        setCollectionConfigurations(collectionConfigurations);
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
        if (getLocalPath() != null)
            sb.append("LocalPath: " + getLocalPath() + ",");
        if (getS3OutputPath() != null)
            sb.append("S3OutputPath: " + getS3OutputPath() + ",");
        if (getHookParameters() != null)
            sb.append("HookParameters: " + getHookParameters() + ",");
        if (getCollectionConfigurations() != null)
            sb.append("CollectionConfigurations: " + getCollectionConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocalPath() == null) ? 0 : getLocalPath().hashCode());
        hashCode = prime * hashCode
                + ((getS3OutputPath() == null) ? 0 : getS3OutputPath().hashCode());
        hashCode = prime * hashCode
                + ((getHookParameters() == null) ? 0 : getHookParameters().hashCode());
        hashCode = prime
                * hashCode
                + ((getCollectionConfigurations() == null) ? 0 : getCollectionConfigurations()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DebugHookConfig == false)
            return false;
        DebugHookConfig other = (DebugHookConfig) obj;

        if (other.getLocalPath() == null ^ this.getLocalPath() == null)
            return false;
        if (other.getLocalPath() != null
                && other.getLocalPath().equals(this.getLocalPath()) == false)
            return false;
        if (other.getS3OutputPath() == null ^ this.getS3OutputPath() == null)
            return false;
        if (other.getS3OutputPath() != null
                && other.getS3OutputPath().equals(this.getS3OutputPath()) == false)
            return false;
        if (other.getHookParameters() == null ^ this.getHookParameters() == null)
            return false;
        if (other.getHookParameters() != null
                && other.getHookParameters().equals(this.getHookParameters()) == false)
            return false;
        if (other.getCollectionConfigurations() == null
                ^ this.getCollectionConfigurations() == null)
            return false;
        if (other.getCollectionConfigurations() != null
                && other.getCollectionConfigurations().equals(this.getCollectionConfigurations()) == false)
            return false;
        return true;
    }
}
