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

package com.amazonaws.services.amazonfrauddetector.model;

import java.io.Serializable;

/**
 * <p>
 * Provides the model output configuration.
 * </p>
 */
public class ModelOutputConfiguration implements Serializable {
    /**
     * <p>
     * The format of the model output configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT_CSV, APPLICATION_JSONLINES
     */
    private String format;

    /**
     * <p>
     * A map of JSON keys in response from SageMaker to the Amazon Fraud
     * Detector variables.
     * </p>
     */
    private java.util.Map<String, String> jsonKeyToVariableMap;

    /**
     * <p>
     * A map of CSV index values in the SageMaker response to the Amazon Fraud
     * Detector variables.
     * </p>
     */
    private java.util.Map<String, String> csvIndexToVariableMap;

    /**
     * <p>
     * The format of the model output configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT_CSV, APPLICATION_JSONLINES
     *
     * @return <p>
     *         The format of the model output configuration.
     *         </p>
     * @see ModelOutputDataFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * The format of the model output configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT_CSV, APPLICATION_JSONLINES
     *
     * @param format <p>
     *            The format of the model output configuration.
     *            </p>
     * @see ModelOutputDataFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the model output configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT_CSV, APPLICATION_JSONLINES
     *
     * @param format <p>
     *            The format of the model output configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelOutputDataFormat
     */
    public ModelOutputConfiguration withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * The format of the model output configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT_CSV, APPLICATION_JSONLINES
     *
     * @param format <p>
     *            The format of the model output configuration.
     *            </p>
     * @see ModelOutputDataFormat
     */
    public void setFormat(ModelOutputDataFormat format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * The format of the model output configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT_CSV, APPLICATION_JSONLINES
     *
     * @param format <p>
     *            The format of the model output configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelOutputDataFormat
     */
    public ModelOutputConfiguration withFormat(ModelOutputDataFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * A map of JSON keys in response from SageMaker to the Amazon Fraud
     * Detector variables.
     * </p>
     *
     * @return <p>
     *         A map of JSON keys in response from SageMaker to the Amazon Fraud
     *         Detector variables.
     *         </p>
     */
    public java.util.Map<String, String> getJsonKeyToVariableMap() {
        return jsonKeyToVariableMap;
    }

    /**
     * <p>
     * A map of JSON keys in response from SageMaker to the Amazon Fraud
     * Detector variables.
     * </p>
     *
     * @param jsonKeyToVariableMap <p>
     *            A map of JSON keys in response from SageMaker to the Amazon
     *            Fraud Detector variables.
     *            </p>
     */
    public void setJsonKeyToVariableMap(java.util.Map<String, String> jsonKeyToVariableMap) {
        this.jsonKeyToVariableMap = jsonKeyToVariableMap;
    }

    /**
     * <p>
     * A map of JSON keys in response from SageMaker to the Amazon Fraud
     * Detector variables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jsonKeyToVariableMap <p>
     *            A map of JSON keys in response from SageMaker to the Amazon
     *            Fraud Detector variables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelOutputConfiguration withJsonKeyToVariableMap(
            java.util.Map<String, String> jsonKeyToVariableMap) {
        this.jsonKeyToVariableMap = jsonKeyToVariableMap;
        return this;
    }

    /**
     * <p>
     * A map of JSON keys in response from SageMaker to the Amazon Fraud
     * Detector variables.
     * </p>
     * <p>
     * The method adds a new key-value pair into jsonKeyToVariableMap parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into jsonKeyToVariableMap.
     * @param value The corresponding value of the entry to be added into
     *            jsonKeyToVariableMap.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelOutputConfiguration addjsonKeyToVariableMapEntry(String key, String value) {
        if (null == this.jsonKeyToVariableMap) {
            this.jsonKeyToVariableMap = new java.util.HashMap<String, String>();
        }
        if (this.jsonKeyToVariableMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.jsonKeyToVariableMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into jsonKeyToVariableMap.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ModelOutputConfiguration clearjsonKeyToVariableMapEntries() {
        this.jsonKeyToVariableMap = null;
        return this;
    }

    /**
     * <p>
     * A map of CSV index values in the SageMaker response to the Amazon Fraud
     * Detector variables.
     * </p>
     *
     * @return <p>
     *         A map of CSV index values in the SageMaker response to the Amazon
     *         Fraud Detector variables.
     *         </p>
     */
    public java.util.Map<String, String> getCsvIndexToVariableMap() {
        return csvIndexToVariableMap;
    }

    /**
     * <p>
     * A map of CSV index values in the SageMaker response to the Amazon Fraud
     * Detector variables.
     * </p>
     *
     * @param csvIndexToVariableMap <p>
     *            A map of CSV index values in the SageMaker response to the
     *            Amazon Fraud Detector variables.
     *            </p>
     */
    public void setCsvIndexToVariableMap(java.util.Map<String, String> csvIndexToVariableMap) {
        this.csvIndexToVariableMap = csvIndexToVariableMap;
    }

    /**
     * <p>
     * A map of CSV index values in the SageMaker response to the Amazon Fraud
     * Detector variables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param csvIndexToVariableMap <p>
     *            A map of CSV index values in the SageMaker response to the
     *            Amazon Fraud Detector variables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelOutputConfiguration withCsvIndexToVariableMap(
            java.util.Map<String, String> csvIndexToVariableMap) {
        this.csvIndexToVariableMap = csvIndexToVariableMap;
        return this;
    }

    /**
     * <p>
     * A map of CSV index values in the SageMaker response to the Amazon Fraud
     * Detector variables.
     * </p>
     * <p>
     * The method adds a new key-value pair into csvIndexToVariableMap
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into csvIndexToVariableMap.
     * @param value The corresponding value of the entry to be added into
     *            csvIndexToVariableMap.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelOutputConfiguration addcsvIndexToVariableMapEntry(String key, String value) {
        if (null == this.csvIndexToVariableMap) {
            this.csvIndexToVariableMap = new java.util.HashMap<String, String>();
        }
        if (this.csvIndexToVariableMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.csvIndexToVariableMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into csvIndexToVariableMap.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ModelOutputConfiguration clearcsvIndexToVariableMapEntries() {
        this.csvIndexToVariableMap = null;
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
        if (getFormat() != null)
            sb.append("format: " + getFormat() + ",");
        if (getJsonKeyToVariableMap() != null)
            sb.append("jsonKeyToVariableMap: " + getJsonKeyToVariableMap() + ",");
        if (getCsvIndexToVariableMap() != null)
            sb.append("csvIndexToVariableMap: " + getCsvIndexToVariableMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode
                + ((getJsonKeyToVariableMap() == null) ? 0 : getJsonKeyToVariableMap().hashCode());
        hashCode = prime
                * hashCode
                + ((getCsvIndexToVariableMap() == null) ? 0 : getCsvIndexToVariableMap().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelOutputConfiguration == false)
            return false;
        ModelOutputConfiguration other = (ModelOutputConfiguration) obj;

        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getJsonKeyToVariableMap() == null ^ this.getJsonKeyToVariableMap() == null)
            return false;
        if (other.getJsonKeyToVariableMap() != null
                && other.getJsonKeyToVariableMap().equals(this.getJsonKeyToVariableMap()) == false)
            return false;
        if (other.getCsvIndexToVariableMap() == null ^ this.getCsvIndexToVariableMap() == null)
            return false;
        if (other.getCsvIndexToVariableMap() != null
                && other.getCsvIndexToVariableMap().equals(this.getCsvIndexToVariableMap()) == false)
            return false;
        return true;
    }
}
