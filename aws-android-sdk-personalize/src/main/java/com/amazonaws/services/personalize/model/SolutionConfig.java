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
 * Describes the configuration properties for the solution.
 * </p>
 */
public class SolutionConfig implements Serializable {
    /**
     * <p>
     * Only events with a value greater than or equal to this threshold are used
     * for training a model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String eventValueThreshold;

    /**
     * <p>
     * Describes the properties for hyperparameter optimization (HPO).
     * </p>
     */
    private HPOConfig hpoConfig;

    /**
     * <p>
     * Lists the hyperparameter names and ranges.
     * </p>
     */
    private java.util.Map<String, String> algorithmHyperParameters;

    /**
     * <p>
     * Lists the feature transformation parameters.
     * </p>
     */
    private java.util.Map<String, String> featureTransformationParameters;

    /**
     * <p>
     * The <a>AutoMLConfig</a> object containing a list of recipes to search
     * when AutoML is performed.
     * </p>
     */
    private AutoMLConfig autoMLConfig;

    /**
     * <p>
     * Only events with a value greater than or equal to this threshold are used
     * for training a model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         Only events with a value greater than or equal to this threshold
     *         are used for training a model.
     *         </p>
     */
    public String getEventValueThreshold() {
        return eventValueThreshold;
    }

    /**
     * <p>
     * Only events with a value greater than or equal to this threshold are used
     * for training a model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param eventValueThreshold <p>
     *            Only events with a value greater than or equal to this
     *            threshold are used for training a model.
     *            </p>
     */
    public void setEventValueThreshold(String eventValueThreshold) {
        this.eventValueThreshold = eventValueThreshold;
    }

    /**
     * <p>
     * Only events with a value greater than or equal to this threshold are used
     * for training a model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param eventValueThreshold <p>
     *            Only events with a value greater than or equal to this
     *            threshold are used for training a model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionConfig withEventValueThreshold(String eventValueThreshold) {
        this.eventValueThreshold = eventValueThreshold;
        return this;
    }

    /**
     * <p>
     * Describes the properties for hyperparameter optimization (HPO).
     * </p>
     *
     * @return <p>
     *         Describes the properties for hyperparameter optimization (HPO).
     *         </p>
     */
    public HPOConfig getHpoConfig() {
        return hpoConfig;
    }

    /**
     * <p>
     * Describes the properties for hyperparameter optimization (HPO).
     * </p>
     *
     * @param hpoConfig <p>
     *            Describes the properties for hyperparameter optimization
     *            (HPO).
     *            </p>
     */
    public void setHpoConfig(HPOConfig hpoConfig) {
        this.hpoConfig = hpoConfig;
    }

    /**
     * <p>
     * Describes the properties for hyperparameter optimization (HPO).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hpoConfig <p>
     *            Describes the properties for hyperparameter optimization
     *            (HPO).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionConfig withHpoConfig(HPOConfig hpoConfig) {
        this.hpoConfig = hpoConfig;
        return this;
    }

    /**
     * <p>
     * Lists the hyperparameter names and ranges.
     * </p>
     *
     * @return <p>
     *         Lists the hyperparameter names and ranges.
     *         </p>
     */
    public java.util.Map<String, String> getAlgorithmHyperParameters() {
        return algorithmHyperParameters;
    }

    /**
     * <p>
     * Lists the hyperparameter names and ranges.
     * </p>
     *
     * @param algorithmHyperParameters <p>
     *            Lists the hyperparameter names and ranges.
     *            </p>
     */
    public void setAlgorithmHyperParameters(java.util.Map<String, String> algorithmHyperParameters) {
        this.algorithmHyperParameters = algorithmHyperParameters;
    }

    /**
     * <p>
     * Lists the hyperparameter names and ranges.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param algorithmHyperParameters <p>
     *            Lists the hyperparameter names and ranges.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionConfig withAlgorithmHyperParameters(
            java.util.Map<String, String> algorithmHyperParameters) {
        this.algorithmHyperParameters = algorithmHyperParameters;
        return this;
    }

    /**
     * <p>
     * Lists the hyperparameter names and ranges.
     * </p>
     * <p>
     * The method adds a new key-value pair into algorithmHyperParameters
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            algorithmHyperParameters.
     * @param value The corresponding value of the entry to be added into
     *            algorithmHyperParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionConfig addalgorithmHyperParametersEntry(String key, String value) {
        if (null == this.algorithmHyperParameters) {
            this.algorithmHyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.algorithmHyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.algorithmHyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into algorithmHyperParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SolutionConfig clearalgorithmHyperParametersEntries() {
        this.algorithmHyperParameters = null;
        return this;
    }

    /**
     * <p>
     * Lists the feature transformation parameters.
     * </p>
     *
     * @return <p>
     *         Lists the feature transformation parameters.
     *         </p>
     */
    public java.util.Map<String, String> getFeatureTransformationParameters() {
        return featureTransformationParameters;
    }

    /**
     * <p>
     * Lists the feature transformation parameters.
     * </p>
     *
     * @param featureTransformationParameters <p>
     *            Lists the feature transformation parameters.
     *            </p>
     */
    public void setFeatureTransformationParameters(
            java.util.Map<String, String> featureTransformationParameters) {
        this.featureTransformationParameters = featureTransformationParameters;
    }

    /**
     * <p>
     * Lists the feature transformation parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureTransformationParameters <p>
     *            Lists the feature transformation parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionConfig withFeatureTransformationParameters(
            java.util.Map<String, String> featureTransformationParameters) {
        this.featureTransformationParameters = featureTransformationParameters;
        return this;
    }

    /**
     * <p>
     * Lists the feature transformation parameters.
     * </p>
     * <p>
     * The method adds a new key-value pair into featureTransformationParameters
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            featureTransformationParameters.
     * @param value The corresponding value of the entry to be added into
     *            featureTransformationParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionConfig addfeatureTransformationParametersEntry(String key, String value) {
        if (null == this.featureTransformationParameters) {
            this.featureTransformationParameters = new java.util.HashMap<String, String>();
        }
        if (this.featureTransformationParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.featureTransformationParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into featureTransformationParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SolutionConfig clearfeatureTransformationParametersEntries() {
        this.featureTransformationParameters = null;
        return this;
    }

    /**
     * <p>
     * The <a>AutoMLConfig</a> object containing a list of recipes to search
     * when AutoML is performed.
     * </p>
     *
     * @return <p>
     *         The <a>AutoMLConfig</a> object containing a list of recipes to
     *         search when AutoML is performed.
     *         </p>
     */
    public AutoMLConfig getAutoMLConfig() {
        return autoMLConfig;
    }

    /**
     * <p>
     * The <a>AutoMLConfig</a> object containing a list of recipes to search
     * when AutoML is performed.
     * </p>
     *
     * @param autoMLConfig <p>
     *            The <a>AutoMLConfig</a> object containing a list of recipes to
     *            search when AutoML is performed.
     *            </p>
     */
    public void setAutoMLConfig(AutoMLConfig autoMLConfig) {
        this.autoMLConfig = autoMLConfig;
    }

    /**
     * <p>
     * The <a>AutoMLConfig</a> object containing a list of recipes to search
     * when AutoML is performed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoMLConfig <p>
     *            The <a>AutoMLConfig</a> object containing a list of recipes to
     *            search when AutoML is performed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionConfig withAutoMLConfig(AutoMLConfig autoMLConfig) {
        this.autoMLConfig = autoMLConfig;
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
        if (getEventValueThreshold() != null)
            sb.append("eventValueThreshold: " + getEventValueThreshold() + ",");
        if (getHpoConfig() != null)
            sb.append("hpoConfig: " + getHpoConfig() + ",");
        if (getAlgorithmHyperParameters() != null)
            sb.append("algorithmHyperParameters: " + getAlgorithmHyperParameters() + ",");
        if (getFeatureTransformationParameters() != null)
            sb.append("featureTransformationParameters: " + getFeatureTransformationParameters()
                    + ",");
        if (getAutoMLConfig() != null)
            sb.append("autoMLConfig: " + getAutoMLConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventValueThreshold() == null) ? 0 : getEventValueThreshold().hashCode());
        hashCode = prime * hashCode + ((getHpoConfig() == null) ? 0 : getHpoConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getAlgorithmHyperParameters() == null) ? 0 : getAlgorithmHyperParameters()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getFeatureTransformationParameters() == null) ? 0
                        : getFeatureTransformationParameters().hashCode());
        hashCode = prime * hashCode
                + ((getAutoMLConfig() == null) ? 0 : getAutoMLConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SolutionConfig == false)
            return false;
        SolutionConfig other = (SolutionConfig) obj;

        if (other.getEventValueThreshold() == null ^ this.getEventValueThreshold() == null)
            return false;
        if (other.getEventValueThreshold() != null
                && other.getEventValueThreshold().equals(this.getEventValueThreshold()) == false)
            return false;
        if (other.getHpoConfig() == null ^ this.getHpoConfig() == null)
            return false;
        if (other.getHpoConfig() != null
                && other.getHpoConfig().equals(this.getHpoConfig()) == false)
            return false;
        if (other.getAlgorithmHyperParameters() == null
                ^ this.getAlgorithmHyperParameters() == null)
            return false;
        if (other.getAlgorithmHyperParameters() != null
                && other.getAlgorithmHyperParameters().equals(this.getAlgorithmHyperParameters()) == false)
            return false;
        if (other.getFeatureTransformationParameters() == null
                ^ this.getFeatureTransformationParameters() == null)
            return false;
        if (other.getFeatureTransformationParameters() != null
                && other.getFeatureTransformationParameters().equals(
                        this.getFeatureTransformationParameters()) == false)
            return false;
        if (other.getAutoMLConfig() == null ^ this.getAutoMLConfig() == null)
            return false;
        if (other.getAutoMLConfig() != null
                && other.getAutoMLConfig().equals(this.getAutoMLConfig()) == false)
            return false;
        return true;
    }
}
