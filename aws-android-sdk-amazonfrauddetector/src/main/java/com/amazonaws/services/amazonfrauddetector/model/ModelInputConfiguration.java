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
 * The model input configuration.
 * </p>
 */
public class ModelInputConfiguration implements Serializable {
    /**
     * <p>
     * The format of the model input configuration. The format differs depending
     * on if it is passed through to SageMaker or constructed by Amazon Fraud
     * Detector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT_CSV, APPLICATION_JSON
     */
    private String format;

    /**
     * <p>
     * For an opaque-model, the input to the model will be a ByteBuffer blob
     * provided in the getPrediction request, and will be passed to SageMaker
     * as-is. For non-opaque models, the input will be constructed by Amazon
     * Fraud Detector based on the model-configuration.
     * </p>
     */
    private Boolean isOpaque;

    /**
     * <p>
     * Template for constructing the JSON input-data sent to SageMaker. At
     * event-evaluation, the placeholders for variable names in the template
     * will be replaced with the variable values before being sent to SageMaker.
     * </p>
     */
    private String jsonInputTemplate;

    /**
     * <p>
     * Template for constructing the CSV input-data sent to SageMaker. At
     * event-evaluation, the placeholders for variable-names in the template
     * will be replaced with the variable values before being sent to SageMaker.
     * </p>
     */
    private String csvInputTemplate;

    /**
     * <p>
     * The format of the model input configuration. The format differs depending
     * on if it is passed through to SageMaker or constructed by Amazon Fraud
     * Detector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT_CSV, APPLICATION_JSON
     *
     * @return <p>
     *         The format of the model input configuration. The format differs
     *         depending on if it is passed through to SageMaker or constructed
     *         by Amazon Fraud Detector.
     *         </p>
     * @see ModelInputDataFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * The format of the model input configuration. The format differs depending
     * on if it is passed through to SageMaker or constructed by Amazon Fraud
     * Detector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT_CSV, APPLICATION_JSON
     *
     * @param format <p>
     *            The format of the model input configuration. The format
     *            differs depending on if it is passed through to SageMaker or
     *            constructed by Amazon Fraud Detector.
     *            </p>
     * @see ModelInputDataFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the model input configuration. The format differs depending
     * on if it is passed through to SageMaker or constructed by Amazon Fraud
     * Detector.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT_CSV, APPLICATION_JSON
     *
     * @param format <p>
     *            The format of the model input configuration. The format
     *            differs depending on if it is passed through to SageMaker or
     *            constructed by Amazon Fraud Detector.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelInputDataFormat
     */
    public ModelInputConfiguration withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * The format of the model input configuration. The format differs depending
     * on if it is passed through to SageMaker or constructed by Amazon Fraud
     * Detector.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT_CSV, APPLICATION_JSON
     *
     * @param format <p>
     *            The format of the model input configuration. The format
     *            differs depending on if it is passed through to SageMaker or
     *            constructed by Amazon Fraud Detector.
     *            </p>
     * @see ModelInputDataFormat
     */
    public void setFormat(ModelInputDataFormat format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * The format of the model input configuration. The format differs depending
     * on if it is passed through to SageMaker or constructed by Amazon Fraud
     * Detector.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TEXT_CSV, APPLICATION_JSON
     *
     * @param format <p>
     *            The format of the model input configuration. The format
     *            differs depending on if it is passed through to SageMaker or
     *            constructed by Amazon Fraud Detector.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelInputDataFormat
     */
    public ModelInputConfiguration withFormat(ModelInputDataFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * For an opaque-model, the input to the model will be a ByteBuffer blob
     * provided in the getPrediction request, and will be passed to SageMaker
     * as-is. For non-opaque models, the input will be constructed by Amazon
     * Fraud Detector based on the model-configuration.
     * </p>
     *
     * @return <p>
     *         For an opaque-model, the input to the model will be a ByteBuffer
     *         blob provided in the getPrediction request, and will be passed to
     *         SageMaker as-is. For non-opaque models, the input will be
     *         constructed by Amazon Fraud Detector based on the
     *         model-configuration.
     *         </p>
     */
    public Boolean isIsOpaque() {
        return isOpaque;
    }

    /**
     * <p>
     * For an opaque-model, the input to the model will be a ByteBuffer blob
     * provided in the getPrediction request, and will be passed to SageMaker
     * as-is. For non-opaque models, the input will be constructed by Amazon
     * Fraud Detector based on the model-configuration.
     * </p>
     *
     * @return <p>
     *         For an opaque-model, the input to the model will be a ByteBuffer
     *         blob provided in the getPrediction request, and will be passed to
     *         SageMaker as-is. For non-opaque models, the input will be
     *         constructed by Amazon Fraud Detector based on the
     *         model-configuration.
     *         </p>
     */
    public Boolean getIsOpaque() {
        return isOpaque;
    }

    /**
     * <p>
     * For an opaque-model, the input to the model will be a ByteBuffer blob
     * provided in the getPrediction request, and will be passed to SageMaker
     * as-is. For non-opaque models, the input will be constructed by Amazon
     * Fraud Detector based on the model-configuration.
     * </p>
     *
     * @param isOpaque <p>
     *            For an opaque-model, the input to the model will be a
     *            ByteBuffer blob provided in the getPrediction request, and
     *            will be passed to SageMaker as-is. For non-opaque models, the
     *            input will be constructed by Amazon Fraud Detector based on
     *            the model-configuration.
     *            </p>
     */
    public void setIsOpaque(Boolean isOpaque) {
        this.isOpaque = isOpaque;
    }

    /**
     * <p>
     * For an opaque-model, the input to the model will be a ByteBuffer blob
     * provided in the getPrediction request, and will be passed to SageMaker
     * as-is. For non-opaque models, the input will be constructed by Amazon
     * Fraud Detector based on the model-configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isOpaque <p>
     *            For an opaque-model, the input to the model will be a
     *            ByteBuffer blob provided in the getPrediction request, and
     *            will be passed to SageMaker as-is. For non-opaque models, the
     *            input will be constructed by Amazon Fraud Detector based on
     *            the model-configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelInputConfiguration withIsOpaque(Boolean isOpaque) {
        this.isOpaque = isOpaque;
        return this;
    }

    /**
     * <p>
     * Template for constructing the JSON input-data sent to SageMaker. At
     * event-evaluation, the placeholders for variable names in the template
     * will be replaced with the variable values before being sent to SageMaker.
     * </p>
     *
     * @return <p>
     *         Template for constructing the JSON input-data sent to SageMaker.
     *         At event-evaluation, the placeholders for variable names in the
     *         template will be replaced with the variable values before being
     *         sent to SageMaker.
     *         </p>
     */
    public String getJsonInputTemplate() {
        return jsonInputTemplate;
    }

    /**
     * <p>
     * Template for constructing the JSON input-data sent to SageMaker. At
     * event-evaluation, the placeholders for variable names in the template
     * will be replaced with the variable values before being sent to SageMaker.
     * </p>
     *
     * @param jsonInputTemplate <p>
     *            Template for constructing the JSON input-data sent to
     *            SageMaker. At event-evaluation, the placeholders for variable
     *            names in the template will be replaced with the variable
     *            values before being sent to SageMaker.
     *            </p>
     */
    public void setJsonInputTemplate(String jsonInputTemplate) {
        this.jsonInputTemplate = jsonInputTemplate;
    }

    /**
     * <p>
     * Template for constructing the JSON input-data sent to SageMaker. At
     * event-evaluation, the placeholders for variable names in the template
     * will be replaced with the variable values before being sent to SageMaker.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jsonInputTemplate <p>
     *            Template for constructing the JSON input-data sent to
     *            SageMaker. At event-evaluation, the placeholders for variable
     *            names in the template will be replaced with the variable
     *            values before being sent to SageMaker.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelInputConfiguration withJsonInputTemplate(String jsonInputTemplate) {
        this.jsonInputTemplate = jsonInputTemplate;
        return this;
    }

    /**
     * <p>
     * Template for constructing the CSV input-data sent to SageMaker. At
     * event-evaluation, the placeholders for variable-names in the template
     * will be replaced with the variable values before being sent to SageMaker.
     * </p>
     *
     * @return <p>
     *         Template for constructing the CSV input-data sent to SageMaker.
     *         At event-evaluation, the placeholders for variable-names in the
     *         template will be replaced with the variable values before being
     *         sent to SageMaker.
     *         </p>
     */
    public String getCsvInputTemplate() {
        return csvInputTemplate;
    }

    /**
     * <p>
     * Template for constructing the CSV input-data sent to SageMaker. At
     * event-evaluation, the placeholders for variable-names in the template
     * will be replaced with the variable values before being sent to SageMaker.
     * </p>
     *
     * @param csvInputTemplate <p>
     *            Template for constructing the CSV input-data sent to
     *            SageMaker. At event-evaluation, the placeholders for
     *            variable-names in the template will be replaced with the
     *            variable values before being sent to SageMaker.
     *            </p>
     */
    public void setCsvInputTemplate(String csvInputTemplate) {
        this.csvInputTemplate = csvInputTemplate;
    }

    /**
     * <p>
     * Template for constructing the CSV input-data sent to SageMaker. At
     * event-evaluation, the placeholders for variable-names in the template
     * will be replaced with the variable values before being sent to SageMaker.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param csvInputTemplate <p>
     *            Template for constructing the CSV input-data sent to
     *            SageMaker. At event-evaluation, the placeholders for
     *            variable-names in the template will be replaced with the
     *            variable values before being sent to SageMaker.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelInputConfiguration withCsvInputTemplate(String csvInputTemplate) {
        this.csvInputTemplate = csvInputTemplate;
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
        if (getIsOpaque() != null)
            sb.append("isOpaque: " + getIsOpaque() + ",");
        if (getJsonInputTemplate() != null)
            sb.append("jsonInputTemplate: " + getJsonInputTemplate() + ",");
        if (getCsvInputTemplate() != null)
            sb.append("csvInputTemplate: " + getCsvInputTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getIsOpaque() == null) ? 0 : getIsOpaque().hashCode());
        hashCode = prime * hashCode
                + ((getJsonInputTemplate() == null) ? 0 : getJsonInputTemplate().hashCode());
        hashCode = prime * hashCode
                + ((getCsvInputTemplate() == null) ? 0 : getCsvInputTemplate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelInputConfiguration == false)
            return false;
        ModelInputConfiguration other = (ModelInputConfiguration) obj;

        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getIsOpaque() == null ^ this.getIsOpaque() == null)
            return false;
        if (other.getIsOpaque() != null && other.getIsOpaque().equals(this.getIsOpaque()) == false)
            return false;
        if (other.getJsonInputTemplate() == null ^ this.getJsonInputTemplate() == null)
            return false;
        if (other.getJsonInputTemplate() != null
                && other.getJsonInputTemplate().equals(this.getJsonInputTemplate()) == false)
            return false;
        if (other.getCsvInputTemplate() == null ^ this.getCsvInputTemplate() == null)
            return false;
        if (other.getCsvInputTemplate() != null
                && other.getCsvInputTemplate().equals(this.getCsvInputTemplate()) == false)
            return false;
        return true;
    }
}
