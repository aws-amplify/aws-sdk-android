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

package com.amazonaws.services.runtime.sagemaker.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * After you deploy a model into production using Amazon SageMaker hosting
 * services, your client applications use this API to get inferences from the
 * model hosted at the specified endpoint.
 * </p>
 * <p>
 * For an overview of Amazon SageMaker, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How
 * It Works</a>.
 * </p>
 * <p>
 * Amazon SageMaker strips all POST headers except those supported by the API.
 * Amazon SageMaker might add additional headers. You should not rely on the
 * behavior of headers outside those enumerated in the request syntax.
 * </p>
 * <p>
 * Calls to <code>InvokeEndpoint</code> are authenticated by using AWS Signature
 * Version 4. For information, see <a href=
 * "http://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html"
 * >Authenticating Requests (AWS Signature Version 4)</a> in the <i>Amazon S3
 * API Reference</i>.
 * </p>
 * <p>
 * A customer's model containers must respond to requests within 60 seconds. The
 * model itself can have a maximum processing time of 60 seconds before
 * responding to the /invocations. If your model is going to take 50-60 seconds
 * of processing time, the SDK socket timeout should be set to be 70 seconds.
 * </p>
 * <note>
 * <p>
 * Endpoints are scoped to an individual account, and are not public. The URL
 * does not contain the account ID, but Amazon SageMaker determines the account
 * ID from the authentication token that is supplied by the caller.
 * </p>
 * </note>
 */
public class InvokeEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the endpoint that you specified when you created the endpoint
     * using the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html"
     * >CreateEndpoint</a> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointName;

    /**
     * <p>
     * Provides input data, in the format specified in the
     * <code>ContentType</code> request header. Amazon SageMaker passes all of
     * the data in the body to the model.
     * </p>
     * <p>
     * For information about the format of the request body, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html"
     * >Common Data Formats-Inference</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     */
    private java.nio.ByteBuffer body;

    /**
     * <p>
     * The MIME type of the input data in the request body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>\p{ASCII}*<br/>
     */
    private String contentType;

    /**
     * <p>
     * The desired MIME type of the inference in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>\p{ASCII}*<br/>
     */
    private String accept;

    /**
     * <p>
     * Provides additional information about a request for an inference
     * submitted to a model hosted at an Amazon SageMaker endpoint. The
     * information is an opaque value that is forwarded verbatim. You could use
     * this value, for example, to provide an ID that you can use to track a
     * request or to provide other metadata that a service endpoint was
     * programmed to process. The value must consist of no more than 1024
     * visible US-ASCII characters as specified in <a
     * href="https://tools.ietf.org/html/rfc7230#section-3.2.6">Section 3.3.6.
     * Field Value Components</a> of the Hypertext Transfer Protocol (HTTP/1.1).
     * This feature is currently supported in the AWS SDKs but not in the Amazon
     * SageMaker Python SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>\p{ASCII}*<br/>
     */
    private String customAttributes;

    /**
     * <p>
     * The model to request for inference when invoking a multi-model endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>\A\S[\p{Print}]*\z<br/>
     */
    private String targetModel;

    /**
     * <p>
     * Specify the production variant to send the inference request to when
     * invoking an endpoint that is running two or more variants. Note that this
     * parameter overrides the default behavior for the endpoint, which is to
     * distribute the invocation traffic based on the variant weights.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String targetVariant;

    /**
     * <p>
     * The name of the endpoint that you specified when you created the endpoint
     * using the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html"
     * >CreateEndpoint</a> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the endpoint that you specified when you created the
     *         endpoint using the <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html"
     *         >CreateEndpoint</a> API.
     *         </p>
     */
    public String getEndpointName() {
        return endpointName;
    }

    /**
     * <p>
     * The name of the endpoint that you specified when you created the endpoint
     * using the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html"
     * >CreateEndpoint</a> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointName <p>
     *            The name of the endpoint that you specified when you created
     *            the endpoint using the <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html"
     *            >CreateEndpoint</a> API.
     *            </p>
     */
    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint that you specified when you created the endpoint
     * using the <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html"
     * >CreateEndpoint</a> API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointName <p>
     *            The name of the endpoint that you specified when you created
     *            the endpoint using the <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html"
     *            >CreateEndpoint</a> API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeEndpointRequest withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * <p>
     * Provides input data, in the format specified in the
     * <code>ContentType</code> request header. Amazon SageMaker passes all of
     * the data in the body to the model.
     * </p>
     * <p>
     * For information about the format of the request body, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html"
     * >Common Data Formats-Inference</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     *
     * @return <p>
     *         Provides input data, in the format specified in the
     *         <code>ContentType</code> request header. Amazon SageMaker passes
     *         all of the data in the body to the model.
     *         </p>
     *         <p>
     *         For information about the format of the request body, see <a
     *         href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html"
     *         >Common Data Formats-Inference</a>.
     *         </p>
     */
    public java.nio.ByteBuffer getBody() {
        return body;
    }

    /**
     * <p>
     * Provides input data, in the format specified in the
     * <code>ContentType</code> request header. Amazon SageMaker passes all of
     * the data in the body to the model.
     * </p>
     * <p>
     * For information about the format of the request body, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html"
     * >Common Data Formats-Inference</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     *
     * @param body <p>
     *            Provides input data, in the format specified in the
     *            <code>ContentType</code> request header. Amazon SageMaker
     *            passes all of the data in the body to the model.
     *            </p>
     *            <p>
     *            For information about the format of the request body, see <a
     *            href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html"
     *            >Common Data Formats-Inference</a>.
     *            </p>
     */
    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * Provides input data, in the format specified in the
     * <code>ContentType</code> request header. Amazon SageMaker passes all of
     * the data in the body to the model.
     * </p>
     * <p>
     * For information about the format of the request body, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html"
     * >Common Data Formats-Inference</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     *
     * @param body <p>
     *            Provides input data, in the format specified in the
     *            <code>ContentType</code> request header. Amazon SageMaker
     *            passes all of the data in the body to the model.
     *            </p>
     *            <p>
     *            For information about the format of the request body, see <a
     *            href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html"
     *            >Common Data Formats-Inference</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeEndpointRequest withBody(java.nio.ByteBuffer body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * The MIME type of the input data in the request body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>\p{ASCII}*<br/>
     *
     * @return <p>
     *         The MIME type of the input data in the request body.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The MIME type of the input data in the request body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>\p{ASCII}*<br/>
     *
     * @param contentType <p>
     *            The MIME type of the input data in the request body.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The MIME type of the input data in the request body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>\p{ASCII}*<br/>
     *
     * @param contentType <p>
     *            The MIME type of the input data in the request body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeEndpointRequest withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * The desired MIME type of the inference in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>\p{ASCII}*<br/>
     *
     * @return <p>
     *         The desired MIME type of the inference in the response.
     *         </p>
     */
    public String getAccept() {
        return accept;
    }

    /**
     * <p>
     * The desired MIME type of the inference in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>\p{ASCII}*<br/>
     *
     * @param accept <p>
     *            The desired MIME type of the inference in the response.
     *            </p>
     */
    public void setAccept(String accept) {
        this.accept = accept;
    }

    /**
     * <p>
     * The desired MIME type of the inference in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>\p{ASCII}*<br/>
     *
     * @param accept <p>
     *            The desired MIME type of the inference in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeEndpointRequest withAccept(String accept) {
        this.accept = accept;
        return this;
    }

    /**
     * <p>
     * Provides additional information about a request for an inference
     * submitted to a model hosted at an Amazon SageMaker endpoint. The
     * information is an opaque value that is forwarded verbatim. You could use
     * this value, for example, to provide an ID that you can use to track a
     * request or to provide other metadata that a service endpoint was
     * programmed to process. The value must consist of no more than 1024
     * visible US-ASCII characters as specified in <a
     * href="https://tools.ietf.org/html/rfc7230#section-3.2.6">Section 3.3.6.
     * Field Value Components</a> of the Hypertext Transfer Protocol (HTTP/1.1).
     * This feature is currently supported in the AWS SDKs but not in the Amazon
     * SageMaker Python SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>\p{ASCII}*<br/>
     *
     * @return <p>
     *         Provides additional information about a request for an inference
     *         submitted to a model hosted at an Amazon SageMaker endpoint. The
     *         information is an opaque value that is forwarded verbatim. You
     *         could use this value, for example, to provide an ID that you can
     *         use to track a request or to provide other metadata that a
     *         service endpoint was programmed to process. The value must
     *         consist of no more than 1024 visible US-ASCII characters as
     *         specified in <a
     *         href="https://tools.ietf.org/html/rfc7230#section-3.2.6">Section
     *         3.3.6. Field Value Components</a> of the Hypertext Transfer
     *         Protocol (HTTP/1.1). This feature is currently supported in the
     *         AWS SDKs but not in the Amazon SageMaker Python SDK.
     *         </p>
     */
    public String getCustomAttributes() {
        return customAttributes;
    }

    /**
     * <p>
     * Provides additional information about a request for an inference
     * submitted to a model hosted at an Amazon SageMaker endpoint. The
     * information is an opaque value that is forwarded verbatim. You could use
     * this value, for example, to provide an ID that you can use to track a
     * request or to provide other metadata that a service endpoint was
     * programmed to process. The value must consist of no more than 1024
     * visible US-ASCII characters as specified in <a
     * href="https://tools.ietf.org/html/rfc7230#section-3.2.6">Section 3.3.6.
     * Field Value Components</a> of the Hypertext Transfer Protocol (HTTP/1.1).
     * This feature is currently supported in the AWS SDKs but not in the Amazon
     * SageMaker Python SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>\p{ASCII}*<br/>
     *
     * @param customAttributes <p>
     *            Provides additional information about a request for an
     *            inference submitted to a model hosted at an Amazon SageMaker
     *            endpoint. The information is an opaque value that is forwarded
     *            verbatim. You could use this value, for example, to provide an
     *            ID that you can use to track a request or to provide other
     *            metadata that a service endpoint was programmed to process.
     *            The value must consist of no more than 1024 visible US-ASCII
     *            characters as specified in <a
     *            href="https://tools.ietf.org/html/rfc7230#section-3.2.6"
     *            >Section 3.3.6. Field Value Components</a> of the Hypertext
     *            Transfer Protocol (HTTP/1.1). This feature is currently
     *            supported in the AWS SDKs but not in the Amazon SageMaker
     *            Python SDK.
     *            </p>
     */
    public void setCustomAttributes(String customAttributes) {
        this.customAttributes = customAttributes;
    }

    /**
     * <p>
     * Provides additional information about a request for an inference
     * submitted to a model hosted at an Amazon SageMaker endpoint. The
     * information is an opaque value that is forwarded verbatim. You could use
     * this value, for example, to provide an ID that you can use to track a
     * request or to provide other metadata that a service endpoint was
     * programmed to process. The value must consist of no more than 1024
     * visible US-ASCII characters as specified in <a
     * href="https://tools.ietf.org/html/rfc7230#section-3.2.6">Section 3.3.6.
     * Field Value Components</a> of the Hypertext Transfer Protocol (HTTP/1.1).
     * This feature is currently supported in the AWS SDKs but not in the Amazon
     * SageMaker Python SDK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>\p{ASCII}*<br/>
     *
     * @param customAttributes <p>
     *            Provides additional information about a request for an
     *            inference submitted to a model hosted at an Amazon SageMaker
     *            endpoint. The information is an opaque value that is forwarded
     *            verbatim. You could use this value, for example, to provide an
     *            ID that you can use to track a request or to provide other
     *            metadata that a service endpoint was programmed to process.
     *            The value must consist of no more than 1024 visible US-ASCII
     *            characters as specified in <a
     *            href="https://tools.ietf.org/html/rfc7230#section-3.2.6"
     *            >Section 3.3.6. Field Value Components</a> of the Hypertext
     *            Transfer Protocol (HTTP/1.1). This feature is currently
     *            supported in the AWS SDKs but not in the Amazon SageMaker
     *            Python SDK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeEndpointRequest withCustomAttributes(String customAttributes) {
        this.customAttributes = customAttributes;
        return this;
    }

    /**
     * <p>
     * The model to request for inference when invoking a multi-model endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>\A\S[\p{Print}]*\z<br/>
     *
     * @return <p>
     *         The model to request for inference when invoking a multi-model
     *         endpoint.
     *         </p>
     */
    public String getTargetModel() {
        return targetModel;
    }

    /**
     * <p>
     * The model to request for inference when invoking a multi-model endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>\A\S[\p{Print}]*\z<br/>
     *
     * @param targetModel <p>
     *            The model to request for inference when invoking a multi-model
     *            endpoint.
     *            </p>
     */
    public void setTargetModel(String targetModel) {
        this.targetModel = targetModel;
    }

    /**
     * <p>
     * The model to request for inference when invoking a multi-model endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>\A\S[\p{Print}]*\z<br/>
     *
     * @param targetModel <p>
     *            The model to request for inference when invoking a multi-model
     *            endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeEndpointRequest withTargetModel(String targetModel) {
        this.targetModel = targetModel;
        return this;
    }

    /**
     * <p>
     * Specify the production variant to send the inference request to when
     * invoking an endpoint that is running two or more variants. Note that this
     * parameter overrides the default behavior for the endpoint, which is to
     * distribute the invocation traffic based on the variant weights.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         Specify the production variant to send the inference request to
     *         when invoking an endpoint that is running two or more variants.
     *         Note that this parameter overrides the default behavior for the
     *         endpoint, which is to distribute the invocation traffic based on
     *         the variant weights.
     *         </p>
     */
    public String getTargetVariant() {
        return targetVariant;
    }

    /**
     * <p>
     * Specify the production variant to send the inference request to when
     * invoking an endpoint that is running two or more variants. Note that this
     * parameter overrides the default behavior for the endpoint, which is to
     * distribute the invocation traffic based on the variant weights.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param targetVariant <p>
     *            Specify the production variant to send the inference request
     *            to when invoking an endpoint that is running two or more
     *            variants. Note that this parameter overrides the default
     *            behavior for the endpoint, which is to distribute the
     *            invocation traffic based on the variant weights.
     *            </p>
     */
    public void setTargetVariant(String targetVariant) {
        this.targetVariant = targetVariant;
    }

    /**
     * <p>
     * Specify the production variant to send the inference request to when
     * invoking an endpoint that is running two or more variants. Note that this
     * parameter overrides the default behavior for the endpoint, which is to
     * distribute the invocation traffic based on the variant weights.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param targetVariant <p>
     *            Specify the production variant to send the inference request
     *            to when invoking an endpoint that is running two or more
     *            variants. Note that this parameter overrides the default
     *            behavior for the endpoint, which is to distribute the
     *            invocation traffic based on the variant weights.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeEndpointRequest withTargetVariant(String targetVariant) {
        this.targetVariant = targetVariant;
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
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType() + ",");
        if (getAccept() != null)
            sb.append("Accept: " + getAccept() + ",");
        if (getCustomAttributes() != null)
            sb.append("CustomAttributes: " + getCustomAttributes() + ",");
        if (getTargetModel() != null)
            sb.append("TargetModel: " + getTargetModel() + ",");
        if (getTargetVariant() != null)
            sb.append("TargetVariant: " + getTargetVariant());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getAccept() == null) ? 0 : getAccept().hashCode());
        hashCode = prime * hashCode
                + ((getCustomAttributes() == null) ? 0 : getCustomAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getTargetModel() == null) ? 0 : getTargetModel().hashCode());
        hashCode = prime * hashCode
                + ((getTargetVariant() == null) ? 0 : getTargetVariant().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokeEndpointRequest == false)
            return false;
        InvokeEndpointRequest other = (InvokeEndpointRequest) obj;

        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null
                && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getAccept() == null ^ this.getAccept() == null)
            return false;
        if (other.getAccept() != null && other.getAccept().equals(this.getAccept()) == false)
            return false;
        if (other.getCustomAttributes() == null ^ this.getCustomAttributes() == null)
            return false;
        if (other.getCustomAttributes() != null
                && other.getCustomAttributes().equals(this.getCustomAttributes()) == false)
            return false;
        if (other.getTargetModel() == null ^ this.getTargetModel() == null)
            return false;
        if (other.getTargetModel() != null
                && other.getTargetModel().equals(this.getTargetModel()) == false)
            return false;
        if (other.getTargetVariant() == null ^ this.getTargetVariant() == null)
            return false;
        if (other.getTargetVariant() != null
                && other.getTargetVariant().equals(this.getTargetVariant()) == false)
            return false;
        return true;
    }
}
