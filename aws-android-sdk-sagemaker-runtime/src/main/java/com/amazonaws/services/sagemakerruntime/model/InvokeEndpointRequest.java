/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sagemakerruntime.model;

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
 * href="http://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How
 * It Works</a>.
 * </p>
 * <p>
 * Amazon SageMaker strips all POST headers except those supported by the API.
 * Amazon SageMaker might add additional headers. You should not rely on the
 * behavior of headers outside those enumerated in the request syntax.
 * </p>
 * <p>
 * Cals to <code>InvokeEndpoint</code> are authenticated by using AWS Signature
 * Version 4. For information, see <a href=
 * "http://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html"
 * >Authenticating Requests (AWS Signature Version 4)</a> in the <i>Amazon S3
 * API Reference</i>.
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
     * "http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html"
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
     * "http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html"
     * >Common Data Formats—Inference</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 5242880<br/>
     */
    private java.nio.ByteBuffer body;

    /**
     * <p>
     * The MIME type of the input data in the request body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String contentType;

    /**
     * <p>
     * The desired MIME type of the inference in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String accept;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String customAttributes;

    /**
     * <p>
     * The name of the endpoint that you specified when you created the endpoint
     * using the <a href=
     * "http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html"
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
     *         "http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html"
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
     * "http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html"
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
     *            "http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html"
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
     * "http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html"
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
     *            "http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html"
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
     * "http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html"
     * >Common Data Formats—Inference</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 5242880<br/>
     *
     * @return <p>
     *         Provides input data, in the format specified in the
     *         <code>ContentType</code> request header. Amazon SageMaker passes
     *         all of the data in the body to the model.
     *         </p>
     *         <p>
     *         For information about the format of the request body, see <a
     *         href=
     *         "http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html"
     *         >Common Data Formats—Inference</a>.
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
     * "http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html"
     * >Common Data Formats—Inference</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 5242880<br/>
     *
     * @param body <p>
     *            Provides input data, in the format specified in the
     *            <code>ContentType</code> request header. Amazon SageMaker
     *            passes all of the data in the body to the model.
     *            </p>
     *            <p>
     *            For information about the format of the request body, see <a
     *            href=
     *            "http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html"
     *            >Common Data Formats—Inference</a>.
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
     * "http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html"
     * >Common Data Formats—Inference</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 5242880<br/>
     *
     * @param body <p>
     *            Provides input data, in the format specified in the
     *            <code>ContentType</code> request header. Amazon SageMaker
     *            passes all of the data in the body to the model.
     *            </p>
     *            <p>
     *            For information about the format of the request body, see <a
     *            href=
     *            "http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html"
     *            >Common Data Formats—Inference</a>.
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
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p/>
     */
    public String getCustomAttributes() {
        return customAttributes;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param customAttributes <p/>
     */
    public void setCustomAttributes(String customAttributes) {
        this.customAttributes = customAttributes;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param customAttributes <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeEndpointRequest withCustomAttributes(String customAttributes) {
        this.customAttributes = customAttributes;
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
            sb.append("CustomAttributes: " + getCustomAttributes());
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
        return true;
    }
}
