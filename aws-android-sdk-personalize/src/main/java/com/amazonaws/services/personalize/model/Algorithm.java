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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a custom algorithm.
 * </p>
 */
public class Algorithm implements Serializable {
    /**
     * <p>
     * The name of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String algorithmArn;

    /**
     * <p>
     * The URI of the Docker container for the algorithm image.
     * </p>
     */
    private AlgorithmImage algorithmImage;

    /**
     * <p>
     * Specifies the default hyperparameters.
     * </p>
     */
    private java.util.Map<String, String> defaultHyperParameters;

    /**
     * <p>
     * Specifies the default hyperparameters, their ranges, and whether they are
     * tunable. A tunable hyperparameter can have its value determined during
     * hyperparameter optimization (HPO).
     * </p>
     */
    private DefaultHyperParameterRanges defaultHyperParameterRanges;

    /**
     * <p>
     * Specifies the default maximum number of training jobs and parallel
     * training jobs.
     * </p>
     */
    private java.util.Map<String, String> defaultResourceConfig;

    /**
     * <p>
     * The training input mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String trainingInputMode;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The date and time (in Unix time) that the algorithm was created.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The date and time (in Unix time) that the algorithm was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The name of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @return <p>
     *         The name of the algorithm.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name of the algorithm.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name of the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Algorithm withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the algorithm.
     *         </p>
     */
    public String getAlgorithmArn() {
        return algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param algorithmArn <p>
     *            The Amazon Resource Name (ARN) of the algorithm.
     *            </p>
     */
    public void setAlgorithmArn(String algorithmArn) {
        this.algorithmArn = algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param algorithmArn <p>
     *            The Amazon Resource Name (ARN) of the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Algorithm withAlgorithmArn(String algorithmArn) {
        this.algorithmArn = algorithmArn;
        return this;
    }

    /**
     * <p>
     * The URI of the Docker container for the algorithm image.
     * </p>
     *
     * @return <p>
     *         The URI of the Docker container for the algorithm image.
     *         </p>
     */
    public AlgorithmImage getAlgorithmImage() {
        return algorithmImage;
    }

    /**
     * <p>
     * The URI of the Docker container for the algorithm image.
     * </p>
     *
     * @param algorithmImage <p>
     *            The URI of the Docker container for the algorithm image.
     *            </p>
     */
    public void setAlgorithmImage(AlgorithmImage algorithmImage) {
        this.algorithmImage = algorithmImage;
    }

    /**
     * <p>
     * The URI of the Docker container for the algorithm image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param algorithmImage <p>
     *            The URI of the Docker container for the algorithm image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Algorithm withAlgorithmImage(AlgorithmImage algorithmImage) {
        this.algorithmImage = algorithmImage;
        return this;
    }

    /**
     * <p>
     * Specifies the default hyperparameters.
     * </p>
     *
     * @return <p>
     *         Specifies the default hyperparameters.
     *         </p>
     */
    public java.util.Map<String, String> getDefaultHyperParameters() {
        return defaultHyperParameters;
    }

    /**
     * <p>
     * Specifies the default hyperparameters.
     * </p>
     *
     * @param defaultHyperParameters <p>
     *            Specifies the default hyperparameters.
     *            </p>
     */
    public void setDefaultHyperParameters(java.util.Map<String, String> defaultHyperParameters) {
        this.defaultHyperParameters = defaultHyperParameters;
    }

    /**
     * <p>
     * Specifies the default hyperparameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultHyperParameters <p>
     *            Specifies the default hyperparameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Algorithm withDefaultHyperParameters(java.util.Map<String, String> defaultHyperParameters) {
        this.defaultHyperParameters = defaultHyperParameters;
        return this;
    }

    /**
     * <p>
     * Specifies the default hyperparameters.
     * </p>
     * <p>
     * The method adds a new key-value pair into defaultHyperParameters
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into defaultHyperParameters.
     * @param value The corresponding value of the entry to be added into
     *            defaultHyperParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Algorithm adddefaultHyperParametersEntry(String key, String value) {
        if (null == this.defaultHyperParameters) {
            this.defaultHyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.defaultHyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.defaultHyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into defaultHyperParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Algorithm cleardefaultHyperParametersEntries() {
        this.defaultHyperParameters = null;
        return this;
    }

    /**
     * <p>
     * Specifies the default hyperparameters, their ranges, and whether they are
     * tunable. A tunable hyperparameter can have its value determined during
     * hyperparameter optimization (HPO).
     * </p>
     *
     * @return <p>
     *         Specifies the default hyperparameters, their ranges, and whether
     *         they are tunable. A tunable hyperparameter can have its value
     *         determined during hyperparameter optimization (HPO).
     *         </p>
     */
    public DefaultHyperParameterRanges getDefaultHyperParameterRanges() {
        return defaultHyperParameterRanges;
    }

    /**
     * <p>
     * Specifies the default hyperparameters, their ranges, and whether they are
     * tunable. A tunable hyperparameter can have its value determined during
     * hyperparameter optimization (HPO).
     * </p>
     *
     * @param defaultHyperParameterRanges <p>
     *            Specifies the default hyperparameters, their ranges, and
     *            whether they are tunable. A tunable hyperparameter can have
     *            its value determined during hyperparameter optimization (HPO).
     *            </p>
     */
    public void setDefaultHyperParameterRanges(
            DefaultHyperParameterRanges defaultHyperParameterRanges) {
        this.defaultHyperParameterRanges = defaultHyperParameterRanges;
    }

    /**
     * <p>
     * Specifies the default hyperparameters, their ranges, and whether they are
     * tunable. A tunable hyperparameter can have its value determined during
     * hyperparameter optimization (HPO).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultHyperParameterRanges <p>
     *            Specifies the default hyperparameters, their ranges, and
     *            whether they are tunable. A tunable hyperparameter can have
     *            its value determined during hyperparameter optimization (HPO).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Algorithm withDefaultHyperParameterRanges(
            DefaultHyperParameterRanges defaultHyperParameterRanges) {
        this.defaultHyperParameterRanges = defaultHyperParameterRanges;
        return this;
    }

    /**
     * <p>
     * Specifies the default maximum number of training jobs and parallel
     * training jobs.
     * </p>
     *
     * @return <p>
     *         Specifies the default maximum number of training jobs and
     *         parallel training jobs.
     *         </p>
     */
    public java.util.Map<String, String> getDefaultResourceConfig() {
        return defaultResourceConfig;
    }

    /**
     * <p>
     * Specifies the default maximum number of training jobs and parallel
     * training jobs.
     * </p>
     *
     * @param defaultResourceConfig <p>
     *            Specifies the default maximum number of training jobs and
     *            parallel training jobs.
     *            </p>
     */
    public void setDefaultResourceConfig(java.util.Map<String, String> defaultResourceConfig) {
        this.defaultResourceConfig = defaultResourceConfig;
    }

    /**
     * <p>
     * Specifies the default maximum number of training jobs and parallel
     * training jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultResourceConfig <p>
     *            Specifies the default maximum number of training jobs and
     *            parallel training jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Algorithm withDefaultResourceConfig(java.util.Map<String, String> defaultResourceConfig) {
        this.defaultResourceConfig = defaultResourceConfig;
        return this;
    }

    /**
     * <p>
     * Specifies the default maximum number of training jobs and parallel
     * training jobs.
     * </p>
     * <p>
     * The method adds a new key-value pair into defaultResourceConfig
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into defaultResourceConfig.
     * @param value The corresponding value of the entry to be added into
     *            defaultResourceConfig.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Algorithm adddefaultResourceConfigEntry(String key, String value) {
        if (null == this.defaultResourceConfig) {
            this.defaultResourceConfig = new java.util.HashMap<String, String>();
        }
        if (this.defaultResourceConfig.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.defaultResourceConfig.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into defaultResourceConfig.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Algorithm cleardefaultResourceConfigEntries() {
        this.defaultResourceConfig = null;
        return this;
    }

    /**
     * <p>
     * The training input mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The training input mode.
     *         </p>
     */
    public String getTrainingInputMode() {
        return trainingInputMode;
    }

    /**
     * <p>
     * The training input mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param trainingInputMode <p>
     *            The training input mode.
     *            </p>
     */
    public void setTrainingInputMode(String trainingInputMode) {
        this.trainingInputMode = trainingInputMode;
    }

    /**
     * <p>
     * The training input mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param trainingInputMode <p>
     *            The training input mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Algorithm withTrainingInputMode(String trainingInputMode) {
        this.trainingInputMode = trainingInputMode;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the role.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the role.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Algorithm withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the algorithm was created.
     * </p>
     *
     * @return <p>
     *         The date and time (in Unix time) that the algorithm was created.
     *         </p>
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the algorithm was created.
     * </p>
     *
     * @param creationDateTime <p>
     *            The date and time (in Unix time) that the algorithm was
     *            created.
     *            </p>
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the algorithm was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDateTime <p>
     *            The date and time (in Unix time) that the algorithm was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Algorithm withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the algorithm was last updated.
     * </p>
     *
     * @return <p>
     *         The date and time (in Unix time) that the algorithm was last
     *         updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the algorithm was last updated.
     * </p>
     *
     * @param lastUpdatedDateTime <p>
     *            The date and time (in Unix time) that the algorithm was last
     *            updated.
     *            </p>
     */
    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the algorithm was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedDateTime <p>
     *            The date and time (in Unix time) that the algorithm was last
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Algorithm withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getAlgorithmArn() != null)
            sb.append("algorithmArn: " + getAlgorithmArn() + ",");
        if (getAlgorithmImage() != null)
            sb.append("algorithmImage: " + getAlgorithmImage() + ",");
        if (getDefaultHyperParameters() != null)
            sb.append("defaultHyperParameters: " + getDefaultHyperParameters() + ",");
        if (getDefaultHyperParameterRanges() != null)
            sb.append("defaultHyperParameterRanges: " + getDefaultHyperParameterRanges() + ",");
        if (getDefaultResourceConfig() != null)
            sb.append("defaultResourceConfig: " + getDefaultResourceConfig() + ",");
        if (getTrainingInputMode() != null)
            sb.append("trainingInputMode: " + getTrainingInputMode() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getCreationDateTime() != null)
            sb.append("creationDateTime: " + getCreationDateTime() + ",");
        if (getLastUpdatedDateTime() != null)
            sb.append("lastUpdatedDateTime: " + getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getAlgorithmArn() == null) ? 0 : getAlgorithmArn().hashCode());
        hashCode = prime * hashCode
                + ((getAlgorithmImage() == null) ? 0 : getAlgorithmImage().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultHyperParameters() == null) ? 0 : getDefaultHyperParameters()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultHyperParameterRanges() == null) ? 0
                        : getDefaultHyperParameterRanges().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultResourceConfig() == null) ? 0 : getDefaultResourceConfig().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingInputMode() == null) ? 0 : getTrainingInputMode().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Algorithm == false)
            return false;
        Algorithm other = (Algorithm) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAlgorithmArn() == null ^ this.getAlgorithmArn() == null)
            return false;
        if (other.getAlgorithmArn() != null
                && other.getAlgorithmArn().equals(this.getAlgorithmArn()) == false)
            return false;
        if (other.getAlgorithmImage() == null ^ this.getAlgorithmImage() == null)
            return false;
        if (other.getAlgorithmImage() != null
                && other.getAlgorithmImage().equals(this.getAlgorithmImage()) == false)
            return false;
        if (other.getDefaultHyperParameters() == null ^ this.getDefaultHyperParameters() == null)
            return false;
        if (other.getDefaultHyperParameters() != null
                && other.getDefaultHyperParameters().equals(this.getDefaultHyperParameters()) == false)
            return false;
        if (other.getDefaultHyperParameterRanges() == null
                ^ this.getDefaultHyperParameterRanges() == null)
            return false;
        if (other.getDefaultHyperParameterRanges() != null
                && other.getDefaultHyperParameterRanges().equals(
                        this.getDefaultHyperParameterRanges()) == false)
            return false;
        if (other.getDefaultResourceConfig() == null ^ this.getDefaultResourceConfig() == null)
            return false;
        if (other.getDefaultResourceConfig() != null
                && other.getDefaultResourceConfig().equals(this.getDefaultResourceConfig()) == false)
            return false;
        if (other.getTrainingInputMode() == null ^ this.getTrainingInputMode() == null)
            return false;
        if (other.getTrainingInputMode() != null
                && other.getTrainingInputMode().equals(this.getTrainingInputMode()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null
                && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null
                && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }
}
