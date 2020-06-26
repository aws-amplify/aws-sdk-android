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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Container image configuration object for the monitoring job.
 * </p>
 */
public class MonitoringAppSpecification implements Serializable {
    /**
     * <p>
     * The container image to be run by the monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String imageUri;

    /**
     * <p>
     * Specifies the entrypoint for a container used to run the monitoring job.
     * </p>
     */
    private java.util.List<String> containerEntrypoint;

    /**
     * <p>
     * An array of arguments for the container used to run the monitoring job.
     * </p>
     */
    private java.util.List<String> containerArguments;

    /**
     * <p>
     * An Amazon S3 URI to a script that is called per row prior to running
     * analysis. It can base64 decode the payload and convert it into a flatted
     * json so that the built-in container can use the converted data.
     * Applicable only for the built-in (first party) containers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String recordPreprocessorSourceUri;

    /**
     * <p>
     * An Amazon S3 URI to a script that is called after analysis has been
     * performed. Applicable only for the built-in (first party) containers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String postAnalyticsProcessorSourceUri;

    /**
     * <p>
     * The container image to be run by the monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The container image to be run by the monitoring job.
     *         </p>
     */
    public String getImageUri() {
        return imageUri;
    }

    /**
     * <p>
     * The container image to be run by the monitoring job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param imageUri <p>
     *            The container image to be run by the monitoring job.
     *            </p>
     */
    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    /**
     * <p>
     * The container image to be run by the monitoring job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param imageUri <p>
     *            The container image to be run by the monitoring job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringAppSpecification withImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }

    /**
     * <p>
     * Specifies the entrypoint for a container used to run the monitoring job.
     * </p>
     *
     * @return <p>
     *         Specifies the entrypoint for a container used to run the
     *         monitoring job.
     *         </p>
     */
    public java.util.List<String> getContainerEntrypoint() {
        return containerEntrypoint;
    }

    /**
     * <p>
     * Specifies the entrypoint for a container used to run the monitoring job.
     * </p>
     *
     * @param containerEntrypoint <p>
     *            Specifies the entrypoint for a container used to run the
     *            monitoring job.
     *            </p>
     */
    public void setContainerEntrypoint(java.util.Collection<String> containerEntrypoint) {
        if (containerEntrypoint == null) {
            this.containerEntrypoint = null;
            return;
        }

        this.containerEntrypoint = new java.util.ArrayList<String>(containerEntrypoint);
    }

    /**
     * <p>
     * Specifies the entrypoint for a container used to run the monitoring job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerEntrypoint <p>
     *            Specifies the entrypoint for a container used to run the
     *            monitoring job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringAppSpecification withContainerEntrypoint(String... containerEntrypoint) {
        if (getContainerEntrypoint() == null) {
            this.containerEntrypoint = new java.util.ArrayList<String>(containerEntrypoint.length);
        }
        for (String value : containerEntrypoint) {
            this.containerEntrypoint.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the entrypoint for a container used to run the monitoring job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerEntrypoint <p>
     *            Specifies the entrypoint for a container used to run the
     *            monitoring job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringAppSpecification withContainerEntrypoint(
            java.util.Collection<String> containerEntrypoint) {
        setContainerEntrypoint(containerEntrypoint);
        return this;
    }

    /**
     * <p>
     * An array of arguments for the container used to run the monitoring job.
     * </p>
     *
     * @return <p>
     *         An array of arguments for the container used to run the
     *         monitoring job.
     *         </p>
     */
    public java.util.List<String> getContainerArguments() {
        return containerArguments;
    }

    /**
     * <p>
     * An array of arguments for the container used to run the monitoring job.
     * </p>
     *
     * @param containerArguments <p>
     *            An array of arguments for the container used to run the
     *            monitoring job.
     *            </p>
     */
    public void setContainerArguments(java.util.Collection<String> containerArguments) {
        if (containerArguments == null) {
            this.containerArguments = null;
            return;
        }

        this.containerArguments = new java.util.ArrayList<String>(containerArguments);
    }

    /**
     * <p>
     * An array of arguments for the container used to run the monitoring job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerArguments <p>
     *            An array of arguments for the container used to run the
     *            monitoring job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringAppSpecification withContainerArguments(String... containerArguments) {
        if (getContainerArguments() == null) {
            this.containerArguments = new java.util.ArrayList<String>(containerArguments.length);
        }
        for (String value : containerArguments) {
            this.containerArguments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of arguments for the container used to run the monitoring job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerArguments <p>
     *            An array of arguments for the container used to run the
     *            monitoring job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringAppSpecification withContainerArguments(
            java.util.Collection<String> containerArguments) {
        setContainerArguments(containerArguments);
        return this;
    }

    /**
     * <p>
     * An Amazon S3 URI to a script that is called per row prior to running
     * analysis. It can base64 decode the payload and convert it into a flatted
     * json so that the built-in container can use the converted data.
     * Applicable only for the built-in (first party) containers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         An Amazon S3 URI to a script that is called per row prior to
     *         running analysis. It can base64 decode the payload and convert it
     *         into a flatted json so that the built-in container can use the
     *         converted data. Applicable only for the built-in (first party)
     *         containers.
     *         </p>
     */
    public String getRecordPreprocessorSourceUri() {
        return recordPreprocessorSourceUri;
    }

    /**
     * <p>
     * An Amazon S3 URI to a script that is called per row prior to running
     * analysis. It can base64 decode the payload and convert it into a flatted
     * json so that the built-in container can use the converted data.
     * Applicable only for the built-in (first party) containers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param recordPreprocessorSourceUri <p>
     *            An Amazon S3 URI to a script that is called per row prior to
     *            running analysis. It can base64 decode the payload and convert
     *            it into a flatted json so that the built-in container can use
     *            the converted data. Applicable only for the built-in (first
     *            party) containers.
     *            </p>
     */
    public void setRecordPreprocessorSourceUri(String recordPreprocessorSourceUri) {
        this.recordPreprocessorSourceUri = recordPreprocessorSourceUri;
    }

    /**
     * <p>
     * An Amazon S3 URI to a script that is called per row prior to running
     * analysis. It can base64 decode the payload and convert it into a flatted
     * json so that the built-in container can use the converted data.
     * Applicable only for the built-in (first party) containers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param recordPreprocessorSourceUri <p>
     *            An Amazon S3 URI to a script that is called per row prior to
     *            running analysis. It can base64 decode the payload and convert
     *            it into a flatted json so that the built-in container can use
     *            the converted data. Applicable only for the built-in (first
     *            party) containers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringAppSpecification withRecordPreprocessorSourceUri(
            String recordPreprocessorSourceUri) {
        this.recordPreprocessorSourceUri = recordPreprocessorSourceUri;
        return this;
    }

    /**
     * <p>
     * An Amazon S3 URI to a script that is called after analysis has been
     * performed. Applicable only for the built-in (first party) containers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         An Amazon S3 URI to a script that is called after analysis has
     *         been performed. Applicable only for the built-in (first party)
     *         containers.
     *         </p>
     */
    public String getPostAnalyticsProcessorSourceUri() {
        return postAnalyticsProcessorSourceUri;
    }

    /**
     * <p>
     * An Amazon S3 URI to a script that is called after analysis has been
     * performed. Applicable only for the built-in (first party) containers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param postAnalyticsProcessorSourceUri <p>
     *            An Amazon S3 URI to a script that is called after analysis has
     *            been performed. Applicable only for the built-in (first party)
     *            containers.
     *            </p>
     */
    public void setPostAnalyticsProcessorSourceUri(String postAnalyticsProcessorSourceUri) {
        this.postAnalyticsProcessorSourceUri = postAnalyticsProcessorSourceUri;
    }

    /**
     * <p>
     * An Amazon S3 URI to a script that is called after analysis has been
     * performed. Applicable only for the built-in (first party) containers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param postAnalyticsProcessorSourceUri <p>
     *            An Amazon S3 URI to a script that is called after analysis has
     *            been performed. Applicable only for the built-in (first party)
     *            containers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringAppSpecification withPostAnalyticsProcessorSourceUri(
            String postAnalyticsProcessorSourceUri) {
        this.postAnalyticsProcessorSourceUri = postAnalyticsProcessorSourceUri;
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
        if (getImageUri() != null)
            sb.append("ImageUri: " + getImageUri() + ",");
        if (getContainerEntrypoint() != null)
            sb.append("ContainerEntrypoint: " + getContainerEntrypoint() + ",");
        if (getContainerArguments() != null)
            sb.append("ContainerArguments: " + getContainerArguments() + ",");
        if (getRecordPreprocessorSourceUri() != null)
            sb.append("RecordPreprocessorSourceUri: " + getRecordPreprocessorSourceUri() + ",");
        if (getPostAnalyticsProcessorSourceUri() != null)
            sb.append("PostAnalyticsProcessorSourceUri: " + getPostAnalyticsProcessorSourceUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageUri() == null) ? 0 : getImageUri().hashCode());
        hashCode = prime * hashCode
                + ((getContainerEntrypoint() == null) ? 0 : getContainerEntrypoint().hashCode());
        hashCode = prime * hashCode
                + ((getContainerArguments() == null) ? 0 : getContainerArguments().hashCode());
        hashCode = prime
                * hashCode
                + ((getRecordPreprocessorSourceUri() == null) ? 0
                        : getRecordPreprocessorSourceUri().hashCode());
        hashCode = prime
                * hashCode
                + ((getPostAnalyticsProcessorSourceUri() == null) ? 0
                        : getPostAnalyticsProcessorSourceUri().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringAppSpecification == false)
            return false;
        MonitoringAppSpecification other = (MonitoringAppSpecification) obj;

        if (other.getImageUri() == null ^ this.getImageUri() == null)
            return false;
        if (other.getImageUri() != null && other.getImageUri().equals(this.getImageUri()) == false)
            return false;
        if (other.getContainerEntrypoint() == null ^ this.getContainerEntrypoint() == null)
            return false;
        if (other.getContainerEntrypoint() != null
                && other.getContainerEntrypoint().equals(this.getContainerEntrypoint()) == false)
            return false;
        if (other.getContainerArguments() == null ^ this.getContainerArguments() == null)
            return false;
        if (other.getContainerArguments() != null
                && other.getContainerArguments().equals(this.getContainerArguments()) == false)
            return false;
        if (other.getRecordPreprocessorSourceUri() == null
                ^ this.getRecordPreprocessorSourceUri() == null)
            return false;
        if (other.getRecordPreprocessorSourceUri() != null
                && other.getRecordPreprocessorSourceUri().equals(
                        this.getRecordPreprocessorSourceUri()) == false)
            return false;
        if (other.getPostAnalyticsProcessorSourceUri() == null
                ^ this.getPostAnalyticsProcessorSourceUri() == null)
            return false;
        if (other.getPostAnalyticsProcessorSourceUri() != null
                && other.getPostAnalyticsProcessorSourceUri().equals(
                        this.getPostAnalyticsProcessorSourceUri()) == false)
            return false;
        return true;
    }
}
