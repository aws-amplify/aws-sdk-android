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

public class InvokeEndpointResult implements Serializable {
    /**
     * <p>
     * Includes the inference provided by the model.
     * </p>
     * <p>
     * For information about the format of the response body, see <a href=
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
     * The MIME type of the inference returned in the response body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String contentType;

    /**
     * <p>
     * Identifies the production variant that was invoked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String invokedProductionVariant;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String customAttributes;

    /**
     * <p>
     * Includes the inference provided by the model.
     * </p>
     * <p>
     * For information about the format of the response body, see <a href=
     * "http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html"
     * >Common Data Formats—Inference</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 5242880<br/>
     *
     * @return <p>
     *         Includes the inference provided by the model.
     *         </p>
     *         <p>
     *         For information about the format of the response body, see <a
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
     * Includes the inference provided by the model.
     * </p>
     * <p>
     * For information about the format of the response body, see <a href=
     * "http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html"
     * >Common Data Formats—Inference</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 5242880<br/>
     *
     * @param body <p>
     *            Includes the inference provided by the model.
     *            </p>
     *            <p>
     *            For information about the format of the response body, see <a
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
     * Includes the inference provided by the model.
     * </p>
     * <p>
     * For information about the format of the response body, see <a href=
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
     *            Includes the inference provided by the model.
     *            </p>
     *            <p>
     *            For information about the format of the response body, see <a
     *            href=
     *            "http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html"
     *            >Common Data Formats—Inference</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeEndpointResult withBody(java.nio.ByteBuffer body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * The MIME type of the inference returned in the response body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The MIME type of the inference returned in the response body.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The MIME type of the inference returned in the response body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param contentType <p>
     *            The MIME type of the inference returned in the response body.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The MIME type of the inference returned in the response body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param contentType <p>
     *            The MIME type of the inference returned in the response body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeEndpointResult withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * Identifies the production variant that was invoked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         Identifies the production variant that was invoked.
     *         </p>
     */
    public String getInvokedProductionVariant() {
        return invokedProductionVariant;
    }

    /**
     * <p>
     * Identifies the production variant that was invoked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param invokedProductionVariant <p>
     *            Identifies the production variant that was invoked.
     *            </p>
     */
    public void setInvokedProductionVariant(String invokedProductionVariant) {
        this.invokedProductionVariant = invokedProductionVariant;
    }

    /**
     * <p>
     * Identifies the production variant that was invoked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param invokedProductionVariant <p>
     *            Identifies the production variant that was invoked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeEndpointResult withInvokedProductionVariant(String invokedProductionVariant) {
        this.invokedProductionVariant = invokedProductionVariant;
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
    public InvokeEndpointResult withCustomAttributes(String customAttributes) {
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
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType() + ",");
        if (getInvokedProductionVariant() != null)
            sb.append("InvokedProductionVariant: " + getInvokedProductionVariant() + ",");
        if (getCustomAttributes() != null)
            sb.append("CustomAttributes: " + getCustomAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime
                * hashCode
                + ((getInvokedProductionVariant() == null) ? 0 : getInvokedProductionVariant()
                        .hashCode());
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

        if (obj instanceof InvokeEndpointResult == false)
            return false;
        InvokeEndpointResult other = (InvokeEndpointResult) obj;

        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getInvokedProductionVariant() == null
                ^ this.getInvokedProductionVariant() == null)
            return false;
        if (other.getInvokedProductionVariant() != null
                && other.getInvokedProductionVariant().equals(this.getInvokedProductionVariant()) == false)
            return false;
        if (other.getCustomAttributes() == null ^ this.getCustomAttributes() == null)
            return false;
        if (other.getCustomAttributes() != null
                && other.getCustomAttributes().equals(this.getCustomAttributes()) == false)
            return false;
        return true;
    }
}
