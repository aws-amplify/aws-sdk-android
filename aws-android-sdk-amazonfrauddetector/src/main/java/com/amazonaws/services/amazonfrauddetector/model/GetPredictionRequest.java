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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Evaluates an event against a detector version. If a version ID is not
 * provided, the detector’s (<code>ACTIVE</code>) version is used.
 * </p>
 */
public class GetPredictionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The detector ID.
     * </p>
     */
    private String detectorId;

    /**
     * <p>
     * The detector version ID.
     * </p>
     */
    private String detectorVersionId;

    /**
     * <p>
     * The unique ID used to identify the event.
     * </p>
     */
    private String eventId;

    /**
     * <p>
     * Names of variables you defined in Amazon Fraud Detector to represent
     * event data elements and their corresponding values for the event you are
     * sending for evaluation.
     * </p>
     */
    private java.util.Map<String, String> eventAttributes;

    /**
     * <p>
     * The Amazon SageMaker model endpoint input data blobs.
     * </p>
     */
    private java.util.Map<String, ModelEndpointDataBlob> externalModelEndpointDataBlobs;

    /**
     * <p>
     * The detector ID.
     * </p>
     *
     * @return <p>
     *         The detector ID.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     *
     * @param detectorId <p>
     *            The detector ID.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectorId <p>
     *            The detector ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPredictionRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     *
     * @return <p>
     *         The detector version ID.
     *         </p>
     */
    public String getDetectorVersionId() {
        return detectorVersionId;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     *
     * @param detectorVersionId <p>
     *            The detector version ID.
     *            </p>
     */
    public void setDetectorVersionId(String detectorVersionId) {
        this.detectorVersionId = detectorVersionId;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectorVersionId <p>
     *            The detector version ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPredictionRequest withDetectorVersionId(String detectorVersionId) {
        this.detectorVersionId = detectorVersionId;
        return this;
    }

    /**
     * <p>
     * The unique ID used to identify the event.
     * </p>
     *
     * @return <p>
     *         The unique ID used to identify the event.
     *         </p>
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * <p>
     * The unique ID used to identify the event.
     * </p>
     *
     * @param eventId <p>
     *            The unique ID used to identify the event.
     *            </p>
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The unique ID used to identify the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventId <p>
     *            The unique ID used to identify the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPredictionRequest withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * <p>
     * Names of variables you defined in Amazon Fraud Detector to represent
     * event data elements and their corresponding values for the event you are
     * sending for evaluation.
     * </p>
     *
     * @return <p>
     *         Names of variables you defined in Amazon Fraud Detector to
     *         represent event data elements and their corresponding values for
     *         the event you are sending for evaluation.
     *         </p>
     */
    public java.util.Map<String, String> getEventAttributes() {
        return eventAttributes;
    }

    /**
     * <p>
     * Names of variables you defined in Amazon Fraud Detector to represent
     * event data elements and their corresponding values for the event you are
     * sending for evaluation.
     * </p>
     *
     * @param eventAttributes <p>
     *            Names of variables you defined in Amazon Fraud Detector to
     *            represent event data elements and their corresponding values
     *            for the event you are sending for evaluation.
     *            </p>
     */
    public void setEventAttributes(java.util.Map<String, String> eventAttributes) {
        this.eventAttributes = eventAttributes;
    }

    /**
     * <p>
     * Names of variables you defined in Amazon Fraud Detector to represent
     * event data elements and their corresponding values for the event you are
     * sending for evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventAttributes <p>
     *            Names of variables you defined in Amazon Fraud Detector to
     *            represent event data elements and their corresponding values
     *            for the event you are sending for evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPredictionRequest withEventAttributes(java.util.Map<String, String> eventAttributes) {
        this.eventAttributes = eventAttributes;
        return this;
    }

    /**
     * <p>
     * Names of variables you defined in Amazon Fraud Detector to represent
     * event data elements and their corresponding values for the event you are
     * sending for evaluation.
     * </p>
     * <p>
     * The method adds a new key-value pair into eventAttributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into eventAttributes.
     * @param value The corresponding value of the entry to be added into
     *            eventAttributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPredictionRequest addeventAttributesEntry(String key, String value) {
        if (null == this.eventAttributes) {
            this.eventAttributes = new java.util.HashMap<String, String>();
        }
        if (this.eventAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.eventAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into eventAttributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetPredictionRequest cleareventAttributesEntries() {
        this.eventAttributes = null;
        return this;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoint input data blobs.
     * </p>
     *
     * @return <p>
     *         The Amazon SageMaker model endpoint input data blobs.
     *         </p>
     */
    public java.util.Map<String, ModelEndpointDataBlob> getExternalModelEndpointDataBlobs() {
        return externalModelEndpointDataBlobs;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoint input data blobs.
     * </p>
     *
     * @param externalModelEndpointDataBlobs <p>
     *            The Amazon SageMaker model endpoint input data blobs.
     *            </p>
     */
    public void setExternalModelEndpointDataBlobs(
            java.util.Map<String, ModelEndpointDataBlob> externalModelEndpointDataBlobs) {
        this.externalModelEndpointDataBlobs = externalModelEndpointDataBlobs;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoint input data blobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalModelEndpointDataBlobs <p>
     *            The Amazon SageMaker model endpoint input data blobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPredictionRequest withExternalModelEndpointDataBlobs(
            java.util.Map<String, ModelEndpointDataBlob> externalModelEndpointDataBlobs) {
        this.externalModelEndpointDataBlobs = externalModelEndpointDataBlobs;
        return this;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoint input data blobs.
     * </p>
     * <p>
     * The method adds a new key-value pair into externalModelEndpointDataBlobs
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            externalModelEndpointDataBlobs.
     * @param value The corresponding value of the entry to be added into
     *            externalModelEndpointDataBlobs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPredictionRequest addexternalModelEndpointDataBlobsEntry(String key,
            ModelEndpointDataBlob value) {
        if (null == this.externalModelEndpointDataBlobs) {
            this.externalModelEndpointDataBlobs = new java.util.HashMap<String, ModelEndpointDataBlob>();
        }
        if (this.externalModelEndpointDataBlobs.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.externalModelEndpointDataBlobs.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into externalModelEndpointDataBlobs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetPredictionRequest clearexternalModelEndpointDataBlobsEntries() {
        this.externalModelEndpointDataBlobs = null;
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
        if (getDetectorId() != null)
            sb.append("detectorId: " + getDetectorId() + ",");
        if (getDetectorVersionId() != null)
            sb.append("detectorVersionId: " + getDetectorVersionId() + ",");
        if (getEventId() != null)
            sb.append("eventId: " + getEventId() + ",");
        if (getEventAttributes() != null)
            sb.append("eventAttributes: " + getEventAttributes() + ",");
        if (getExternalModelEndpointDataBlobs() != null)
            sb.append("externalModelEndpointDataBlobs: " + getExternalModelEndpointDataBlobs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode
                + ((getDetectorVersionId() == null) ? 0 : getDetectorVersionId().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode
                + ((getEventAttributes() == null) ? 0 : getEventAttributes().hashCode());
        hashCode = prime
                * hashCode
                + ((getExternalModelEndpointDataBlobs() == null) ? 0
                        : getExternalModelEndpointDataBlobs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPredictionRequest == false)
            return false;
        GetPredictionRequest other = (GetPredictionRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDetectorVersionId() == null ^ this.getDetectorVersionId() == null)
            return false;
        if (other.getDetectorVersionId() != null
                && other.getDetectorVersionId().equals(this.getDetectorVersionId()) == false)
            return false;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventAttributes() == null ^ this.getEventAttributes() == null)
            return false;
        if (other.getEventAttributes() != null
                && other.getEventAttributes().equals(this.getEventAttributes()) == false)
            return false;
        if (other.getExternalModelEndpointDataBlobs() == null
                ^ this.getExternalModelEndpointDataBlobs() == null)
            return false;
        if (other.getExternalModelEndpointDataBlobs() != null
                && other.getExternalModelEndpointDataBlobs().equals(
                        this.getExternalModelEndpointDataBlobs()) == false)
            return false;
        return true;
    }
}
