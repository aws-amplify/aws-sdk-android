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
 * Defines how to perform inference generation after a training job is run.
 * </p>
 */
public class InferenceSpecification implements Serializable {
    /**
     * <p>
     * The Amazon ECR registry path of the Docker image that contains the
     * inference code.
     * </p>
     */
    private java.util.List<ModelPackageContainerDefinition> containers;

    /**
     * <p>
     * A list of the instance types on which a transformation job can be run or
     * on which an endpoint can be deployed.
     * </p>
     */
    private java.util.List<String> supportedTransformInstanceTypes;

    /**
     * <p>
     * A list of the instance types that are used to generate inferences in
     * real-time.
     * </p>
     */
    private java.util.List<String> supportedRealtimeInferenceInstanceTypes;

    /**
     * <p>
     * The supported MIME types for the input data.
     * </p>
     */
    private java.util.List<String> supportedContentTypes;

    /**
     * <p>
     * The supported MIME types for the output data.
     * </p>
     */
    private java.util.List<String> supportedResponseMIMETypes;

    /**
     * <p>
     * The Amazon ECR registry path of the Docker image that contains the
     * inference code.
     * </p>
     *
     * @return <p>
     *         The Amazon ECR registry path of the Docker image that contains
     *         the inference code.
     *         </p>
     */
    public java.util.List<ModelPackageContainerDefinition> getContainers() {
        return containers;
    }

    /**
     * <p>
     * The Amazon ECR registry path of the Docker image that contains the
     * inference code.
     * </p>
     *
     * @param containers <p>
     *            The Amazon ECR registry path of the Docker image that contains
     *            the inference code.
     *            </p>
     */
    public void setContainers(java.util.Collection<ModelPackageContainerDefinition> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new java.util.ArrayList<ModelPackageContainerDefinition>(containers);
    }

    /**
     * <p>
     * The Amazon ECR registry path of the Docker image that contains the
     * inference code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containers <p>
     *            The Amazon ECR registry path of the Docker image that contains
     *            the inference code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferenceSpecification withContainers(ModelPackageContainerDefinition... containers) {
        if (getContainers() == null) {
            this.containers = new java.util.ArrayList<ModelPackageContainerDefinition>(
                    containers.length);
        }
        for (ModelPackageContainerDefinition value : containers) {
            this.containers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon ECR registry path of the Docker image that contains the
     * inference code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containers <p>
     *            The Amazon ECR registry path of the Docker image that contains
     *            the inference code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferenceSpecification withContainers(
            java.util.Collection<ModelPackageContainerDefinition> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * <p>
     * A list of the instance types on which a transformation job can be run or
     * on which an endpoint can be deployed.
     * </p>
     *
     * @return <p>
     *         A list of the instance types on which a transformation job can be
     *         run or on which an endpoint can be deployed.
     *         </p>
     */
    public java.util.List<String> getSupportedTransformInstanceTypes() {
        return supportedTransformInstanceTypes;
    }

    /**
     * <p>
     * A list of the instance types on which a transformation job can be run or
     * on which an endpoint can be deployed.
     * </p>
     *
     * @param supportedTransformInstanceTypes <p>
     *            A list of the instance types on which a transformation job can
     *            be run or on which an endpoint can be deployed.
     *            </p>
     */
    public void setSupportedTransformInstanceTypes(
            java.util.Collection<String> supportedTransformInstanceTypes) {
        if (supportedTransformInstanceTypes == null) {
            this.supportedTransformInstanceTypes = null;
            return;
        }

        this.supportedTransformInstanceTypes = new java.util.ArrayList<String>(
                supportedTransformInstanceTypes);
    }

    /**
     * <p>
     * A list of the instance types on which a transformation job can be run or
     * on which an endpoint can be deployed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedTransformInstanceTypes <p>
     *            A list of the instance types on which a transformation job can
     *            be run or on which an endpoint can be deployed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferenceSpecification withSupportedTransformInstanceTypes(
            String... supportedTransformInstanceTypes) {
        if (getSupportedTransformInstanceTypes() == null) {
            this.supportedTransformInstanceTypes = new java.util.ArrayList<String>(
                    supportedTransformInstanceTypes.length);
        }
        for (String value : supportedTransformInstanceTypes) {
            this.supportedTransformInstanceTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the instance types on which a transformation job can be run or
     * on which an endpoint can be deployed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedTransformInstanceTypes <p>
     *            A list of the instance types on which a transformation job can
     *            be run or on which an endpoint can be deployed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferenceSpecification withSupportedTransformInstanceTypes(
            java.util.Collection<String> supportedTransformInstanceTypes) {
        setSupportedTransformInstanceTypes(supportedTransformInstanceTypes);
        return this;
    }

    /**
     * <p>
     * A list of the instance types that are used to generate inferences in
     * real-time.
     * </p>
     *
     * @return <p>
     *         A list of the instance types that are used to generate inferences
     *         in real-time.
     *         </p>
     */
    public java.util.List<String> getSupportedRealtimeInferenceInstanceTypes() {
        return supportedRealtimeInferenceInstanceTypes;
    }

    /**
     * <p>
     * A list of the instance types that are used to generate inferences in
     * real-time.
     * </p>
     *
     * @param supportedRealtimeInferenceInstanceTypes <p>
     *            A list of the instance types that are used to generate
     *            inferences in real-time.
     *            </p>
     */
    public void setSupportedRealtimeInferenceInstanceTypes(
            java.util.Collection<String> supportedRealtimeInferenceInstanceTypes) {
        if (supportedRealtimeInferenceInstanceTypes == null) {
            this.supportedRealtimeInferenceInstanceTypes = null;
            return;
        }

        this.supportedRealtimeInferenceInstanceTypes = new java.util.ArrayList<String>(
                supportedRealtimeInferenceInstanceTypes);
    }

    /**
     * <p>
     * A list of the instance types that are used to generate inferences in
     * real-time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedRealtimeInferenceInstanceTypes <p>
     *            A list of the instance types that are used to generate
     *            inferences in real-time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferenceSpecification withSupportedRealtimeInferenceInstanceTypes(
            String... supportedRealtimeInferenceInstanceTypes) {
        if (getSupportedRealtimeInferenceInstanceTypes() == null) {
            this.supportedRealtimeInferenceInstanceTypes = new java.util.ArrayList<String>(
                    supportedRealtimeInferenceInstanceTypes.length);
        }
        for (String value : supportedRealtimeInferenceInstanceTypes) {
            this.supportedRealtimeInferenceInstanceTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the instance types that are used to generate inferences in
     * real-time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedRealtimeInferenceInstanceTypes <p>
     *            A list of the instance types that are used to generate
     *            inferences in real-time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferenceSpecification withSupportedRealtimeInferenceInstanceTypes(
            java.util.Collection<String> supportedRealtimeInferenceInstanceTypes) {
        setSupportedRealtimeInferenceInstanceTypes(supportedRealtimeInferenceInstanceTypes);
        return this;
    }

    /**
     * <p>
     * The supported MIME types for the input data.
     * </p>
     *
     * @return <p>
     *         The supported MIME types for the input data.
     *         </p>
     */
    public java.util.List<String> getSupportedContentTypes() {
        return supportedContentTypes;
    }

    /**
     * <p>
     * The supported MIME types for the input data.
     * </p>
     *
     * @param supportedContentTypes <p>
     *            The supported MIME types for the input data.
     *            </p>
     */
    public void setSupportedContentTypes(java.util.Collection<String> supportedContentTypes) {
        if (supportedContentTypes == null) {
            this.supportedContentTypes = null;
            return;
        }

        this.supportedContentTypes = new java.util.ArrayList<String>(supportedContentTypes);
    }

    /**
     * <p>
     * The supported MIME types for the input data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedContentTypes <p>
     *            The supported MIME types for the input data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferenceSpecification withSupportedContentTypes(String... supportedContentTypes) {
        if (getSupportedContentTypes() == null) {
            this.supportedContentTypes = new java.util.ArrayList<String>(
                    supportedContentTypes.length);
        }
        for (String value : supportedContentTypes) {
            this.supportedContentTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The supported MIME types for the input data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedContentTypes <p>
     *            The supported MIME types for the input data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferenceSpecification withSupportedContentTypes(
            java.util.Collection<String> supportedContentTypes) {
        setSupportedContentTypes(supportedContentTypes);
        return this;
    }

    /**
     * <p>
     * The supported MIME types for the output data.
     * </p>
     *
     * @return <p>
     *         The supported MIME types for the output data.
     *         </p>
     */
    public java.util.List<String> getSupportedResponseMIMETypes() {
        return supportedResponseMIMETypes;
    }

    /**
     * <p>
     * The supported MIME types for the output data.
     * </p>
     *
     * @param supportedResponseMIMETypes <p>
     *            The supported MIME types for the output data.
     *            </p>
     */
    public void setSupportedResponseMIMETypes(
            java.util.Collection<String> supportedResponseMIMETypes) {
        if (supportedResponseMIMETypes == null) {
            this.supportedResponseMIMETypes = null;
            return;
        }

        this.supportedResponseMIMETypes = new java.util.ArrayList<String>(
                supportedResponseMIMETypes);
    }

    /**
     * <p>
     * The supported MIME types for the output data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedResponseMIMETypes <p>
     *            The supported MIME types for the output data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferenceSpecification withSupportedResponseMIMETypes(
            String... supportedResponseMIMETypes) {
        if (getSupportedResponseMIMETypes() == null) {
            this.supportedResponseMIMETypes = new java.util.ArrayList<String>(
                    supportedResponseMIMETypes.length);
        }
        for (String value : supportedResponseMIMETypes) {
            this.supportedResponseMIMETypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The supported MIME types for the output data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedResponseMIMETypes <p>
     *            The supported MIME types for the output data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferenceSpecification withSupportedResponseMIMETypes(
            java.util.Collection<String> supportedResponseMIMETypes) {
        setSupportedResponseMIMETypes(supportedResponseMIMETypes);
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
        if (getContainers() != null)
            sb.append("Containers: " + getContainers() + ",");
        if (getSupportedTransformInstanceTypes() != null)
            sb.append("SupportedTransformInstanceTypes: " + getSupportedTransformInstanceTypes()
                    + ",");
        if (getSupportedRealtimeInferenceInstanceTypes() != null)
            sb.append("SupportedRealtimeInferenceInstanceTypes: "
                    + getSupportedRealtimeInferenceInstanceTypes() + ",");
        if (getSupportedContentTypes() != null)
            sb.append("SupportedContentTypes: " + getSupportedContentTypes() + ",");
        if (getSupportedResponseMIMETypes() != null)
            sb.append("SupportedResponseMIMETypes: " + getSupportedResponseMIMETypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedTransformInstanceTypes() == null) ? 0
                        : getSupportedTransformInstanceTypes().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedRealtimeInferenceInstanceTypes() == null) ? 0
                        : getSupportedRealtimeInferenceInstanceTypes().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedContentTypes() == null) ? 0 : getSupportedContentTypes().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedResponseMIMETypes() == null) ? 0 : getSupportedResponseMIMETypes()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceSpecification == false)
            return false;
        InferenceSpecification other = (InferenceSpecification) obj;

        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null
                && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getSupportedTransformInstanceTypes() == null
                ^ this.getSupportedTransformInstanceTypes() == null)
            return false;
        if (other.getSupportedTransformInstanceTypes() != null
                && other.getSupportedTransformInstanceTypes().equals(
                        this.getSupportedTransformInstanceTypes()) == false)
            return false;
        if (other.getSupportedRealtimeInferenceInstanceTypes() == null
                ^ this.getSupportedRealtimeInferenceInstanceTypes() == null)
            return false;
        if (other.getSupportedRealtimeInferenceInstanceTypes() != null
                && other.getSupportedRealtimeInferenceInstanceTypes().equals(
                        this.getSupportedRealtimeInferenceInstanceTypes()) == false)
            return false;
        if (other.getSupportedContentTypes() == null ^ this.getSupportedContentTypes() == null)
            return false;
        if (other.getSupportedContentTypes() != null
                && other.getSupportedContentTypes().equals(this.getSupportedContentTypes()) == false)
            return false;
        if (other.getSupportedResponseMIMETypes() == null
                ^ this.getSupportedResponseMIMETypes() == null)
            return false;
        if (other.getSupportedResponseMIMETypes() != null
                && other.getSupportedResponseMIMETypes().equals(
                        this.getSupportedResponseMIMETypes()) == false)
            return false;
        return true;
    }
}
