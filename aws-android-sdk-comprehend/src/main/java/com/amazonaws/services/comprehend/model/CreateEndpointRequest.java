/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a model-specific endpoint for synchronous inference for a previously
 * trained custom model
 * </p>
 */
public class CreateEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * This is the descriptive suffix that becomes part of the
     * <code>EndpointArn</code> used for all subsequent requests to this
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 40<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String endpointName;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint will
     * be attached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     */
    private String modelArn;

    /**
     * <p>
     * The desired number of inference units to be used by the model using this
     * endpoint. Each inference unit represents of a throughput of 100
     * characters per second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer desiredInferenceUnits;

    /**
     * <p>
     * An idempotency token provided by the customer. If this token matches a
     * previous endpoint creation request, Amazon Comprehend will not return a
     * <code>ResourceInUseException</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * Tags associated with the endpoint being created. A tag is a key-value
     * pair that adds metadata to the endpoint. For example, a tag with "Sales"
     * as the key might be added to an endpoint to indicate its use by the sales
     * department.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to trained custom
     * models encrypted with a customer managed key (ModelKmsKeyId).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * This is the descriptive suffix that becomes part of the
     * <code>EndpointArn</code> used for all subsequent requests to this
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 40<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         This is the descriptive suffix that becomes part of the
     *         <code>EndpointArn</code> used for all subsequent requests to this
     *         resource.
     *         </p>
     */
    public String getEndpointName() {
        return endpointName;
    }

    /**
     * <p>
     * This is the descriptive suffix that becomes part of the
     * <code>EndpointArn</code> used for all subsequent requests to this
     * resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 40<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param endpointName <p>
     *            This is the descriptive suffix that becomes part of the
     *            <code>EndpointArn</code> used for all subsequent requests to
     *            this resource.
     *            </p>
     */
    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * This is the descriptive suffix that becomes part of the
     * <code>EndpointArn</code> used for all subsequent requests to this
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 40<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param endpointName <p>
     *            This is the descriptive suffix that becomes part of the
     *            <code>EndpointArn</code> used for all subsequent requests to
     *            this resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEndpointRequest withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint will
     * be attached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) of the model to which the
     *         endpoint will be attached.
     *         </p>
     */
    public String getModelArn() {
        return modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint will
     * be attached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @param modelArn <p>
     *            The Amazon Resource Number (ARN) of the model to which the
     *            endpoint will be attached.
     *            </p>
     */
    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint will
     * be attached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @param modelArn <p>
     *            The Amazon Resource Number (ARN) of the model to which the
     *            endpoint will be attached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEndpointRequest withModelArn(String modelArn) {
        this.modelArn = modelArn;
        return this;
    }

    /**
     * <p>
     * The desired number of inference units to be used by the model using this
     * endpoint. Each inference unit represents of a throughput of 100
     * characters per second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The desired number of inference units to be used by the model
     *         using this endpoint. Each inference unit represents of a
     *         throughput of 100 characters per second.
     *         </p>
     */
    public Integer getDesiredInferenceUnits() {
        return desiredInferenceUnits;
    }

    /**
     * <p>
     * The desired number of inference units to be used by the model using this
     * endpoint. Each inference unit represents of a throughput of 100
     * characters per second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param desiredInferenceUnits <p>
     *            The desired number of inference units to be used by the model
     *            using this endpoint. Each inference unit represents of a
     *            throughput of 100 characters per second.
     *            </p>
     */
    public void setDesiredInferenceUnits(Integer desiredInferenceUnits) {
        this.desiredInferenceUnits = desiredInferenceUnits;
    }

    /**
     * <p>
     * The desired number of inference units to be used by the model using this
     * endpoint. Each inference unit represents of a throughput of 100
     * characters per second.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param desiredInferenceUnits <p>
     *            The desired number of inference units to be used by the model
     *            using this endpoint. Each inference unit represents of a
     *            throughput of 100 characters per second.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEndpointRequest withDesiredInferenceUnits(Integer desiredInferenceUnits) {
        this.desiredInferenceUnits = desiredInferenceUnits;
        return this;
    }

    /**
     * <p>
     * An idempotency token provided by the customer. If this token matches a
     * previous endpoint creation request, Amazon Comprehend will not return a
     * <code>ResourceInUseException</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     *
     * @return <p>
     *         An idempotency token provided by the customer. If this token
     *         matches a previous endpoint creation request, Amazon Comprehend
     *         will not return a <code>ResourceInUseException</code>.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * An idempotency token provided by the customer. If this token matches a
     * previous endpoint creation request, Amazon Comprehend will not return a
     * <code>ResourceInUseException</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     *
     * @param clientRequestToken <p>
     *            An idempotency token provided by the customer. If this token
     *            matches a previous endpoint creation request, Amazon
     *            Comprehend will not return a
     *            <code>ResourceInUseException</code>.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * An idempotency token provided by the customer. If this token matches a
     * previous endpoint creation request, Amazon Comprehend will not return a
     * <code>ResourceInUseException</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     *
     * @param clientRequestToken <p>
     *            An idempotency token provided by the customer. If this token
     *            matches a previous endpoint creation request, Amazon
     *            Comprehend will not return a
     *            <code>ResourceInUseException</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEndpointRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * Tags associated with the endpoint being created. A tag is a key-value
     * pair that adds metadata to the endpoint. For example, a tag with "Sales"
     * as the key might be added to an endpoint to indicate its use by the sales
     * department.
     * </p>
     *
     * @return <p>
     *         Tags associated with the endpoint being created. A tag is a
     *         key-value pair that adds metadata to the endpoint. For example, a
     *         tag with "Sales" as the key might be added to an endpoint to
     *         indicate its use by the sales department.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with the endpoint being created. A tag is a key-value
     * pair that adds metadata to the endpoint. For example, a tag with "Sales"
     * as the key might be added to an endpoint to indicate its use by the sales
     * department.
     * </p>
     *
     * @param tags <p>
     *            Tags associated with the endpoint being created. A tag is a
     *            key-value pair that adds metadata to the endpoint. For
     *            example, a tag with "Sales" as the key might be added to an
     *            endpoint to indicate its use by the sales department.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags associated with the endpoint being created. A tag is a key-value
     * pair that adds metadata to the endpoint. For example, a tag with "Sales"
     * as the key might be added to an endpoint to indicate its use by the sales
     * department.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags associated with the endpoint being created. A tag is a
     *            key-value pair that adds metadata to the endpoint. For
     *            example, a tag with "Sales" as the key might be added to an
     *            endpoint to indicate its use by the sales department.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEndpointRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Tags associated with the endpoint being created. A tag is a key-value
     * pair that adds metadata to the endpoint. For example, a tag with "Sales"
     * as the key might be added to an endpoint to indicate its use by the sales
     * department.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags associated with the endpoint being created. A tag is a
     *            key-value pair that adds metadata to the endpoint. For
     *            example, a tag with "Sales" as the key might be added to an
     *            endpoint to indicate its use by the sales department.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEndpointRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to trained custom
     * models encrypted with a customer managed key (ModelKmsKeyId).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS identity and Access
     *         Management (IAM) role that grants Amazon Comprehend read access
     *         to trained custom models encrypted with a customer managed key
     *         (ModelKmsKeyId).
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to trained custom
     * models encrypted with a customer managed key (ModelKmsKeyId).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS identity and Access
     *            Management (IAM) role that grants Amazon Comprehend read
     *            access to trained custom models encrypted with a customer
     *            managed key (ModelKmsKeyId).
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to trained custom
     * models encrypted with a customer managed key (ModelKmsKeyId).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS identity and Access
     *            Management (IAM) role that grants Amazon Comprehend read
     *            access to trained custom models encrypted with a customer
     *            managed key (ModelKmsKeyId).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEndpointRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
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
        if (getEndpointName() != null)
            sb.append("EndpointName: " + getEndpointName() + ",");
        if (getModelArn() != null)
            sb.append("ModelArn: " + getModelArn() + ",");
        if (getDesiredInferenceUnits() != null)
            sb.append("DesiredInferenceUnits: " + getDesiredInferenceUnits() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getDesiredInferenceUnits() == null) ? 0 : getDesiredInferenceUnits().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEndpointRequest == false)
            return false;
        CreateEndpointRequest other = (CreateEndpointRequest) obj;

        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null
                && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getDesiredInferenceUnits() == null ^ this.getDesiredInferenceUnits() == null)
            return false;
        if (other.getDesiredInferenceUnits() != null
                && other.getDesiredInferenceUnits().equals(this.getDesiredInferenceUnits()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null
                && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        return true;
    }
}
