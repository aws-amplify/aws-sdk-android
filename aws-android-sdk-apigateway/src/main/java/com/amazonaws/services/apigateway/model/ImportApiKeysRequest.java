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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Import API keys from an external source, such as a CSV-formatted file.
 * </p>
 */
public class ImportApiKeysRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The payload of the POST request to import API keys. For the payload
     * format, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-key-file-format.html"
     * >API Key File Format</a>.
     * </p>
     */
    private java.nio.ByteBuffer body;

    /**
     * <p>
     * A query parameter to specify the input format to imported API keys.
     * Currently, only the <code>csv</code> format is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>csv
     */
    private String format;

    /**
     * <p>
     * A query parameter to indicate whether to rollback <a>ApiKey</a>
     * importation (<code>true</code>) or not (<code>false</code>) when error is
     * encountered.
     * </p>
     */
    private Boolean failOnWarnings;

    /**
     * <p>
     * The payload of the POST request to import API keys. For the payload
     * format, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-key-file-format.html"
     * >API Key File Format</a>.
     * </p>
     *
     * @return <p>
     *         The payload of the POST request to import API keys. For the
     *         payload format, see <a href=
     *         "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-key-file-format.html"
     *         >API Key File Format</a>.
     *         </p>
     */
    public java.nio.ByteBuffer getBody() {
        return body;
    }

    /**
     * <p>
     * The payload of the POST request to import API keys. For the payload
     * format, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-key-file-format.html"
     * >API Key File Format</a>.
     * </p>
     *
     * @param body <p>
     *            The payload of the POST request to import API keys. For the
     *            payload format, see <a href=
     *            "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-key-file-format.html"
     *            >API Key File Format</a>.
     *            </p>
     */
    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * The payload of the POST request to import API keys. For the payload
     * format, see <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-key-file-format.html"
     * >API Key File Format</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            The payload of the POST request to import API keys. For the
     *            payload format, see <a href=
     *            "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-key-file-format.html"
     *            >API Key File Format</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportApiKeysRequest withBody(java.nio.ByteBuffer body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * A query parameter to specify the input format to imported API keys.
     * Currently, only the <code>csv</code> format is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>csv
     *
     * @return <p>
     *         A query parameter to specify the input format to imported API
     *         keys. Currently, only the <code>csv</code> format is supported.
     *         </p>
     * @see ApiKeysFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * A query parameter to specify the input format to imported API keys.
     * Currently, only the <code>csv</code> format is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>csv
     *
     * @param format <p>
     *            A query parameter to specify the input format to imported API
     *            keys. Currently, only the <code>csv</code> format is
     *            supported.
     *            </p>
     * @see ApiKeysFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * A query parameter to specify the input format to imported API keys.
     * Currently, only the <code>csv</code> format is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>csv
     *
     * @param format <p>
     *            A query parameter to specify the input format to imported API
     *            keys. Currently, only the <code>csv</code> format is
     *            supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApiKeysFormat
     */
    public ImportApiKeysRequest withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * A query parameter to specify the input format to imported API keys.
     * Currently, only the <code>csv</code> format is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>csv
     *
     * @param format <p>
     *            A query parameter to specify the input format to imported API
     *            keys. Currently, only the <code>csv</code> format is
     *            supported.
     *            </p>
     * @see ApiKeysFormat
     */
    public void setFormat(ApiKeysFormat format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * A query parameter to specify the input format to imported API keys.
     * Currently, only the <code>csv</code> format is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>csv
     *
     * @param format <p>
     *            A query parameter to specify the input format to imported API
     *            keys. Currently, only the <code>csv</code> format is
     *            supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApiKeysFormat
     */
    public ImportApiKeysRequest withFormat(ApiKeysFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback <a>ApiKey</a>
     * importation (<code>true</code>) or not (<code>false</code>) when error is
     * encountered.
     * </p>
     *
     * @return <p>
     *         A query parameter to indicate whether to rollback <a>ApiKey</a>
     *         importation (<code>true</code>) or not (<code>false</code>) when
     *         error is encountered.
     *         </p>
     */
    public Boolean isFailOnWarnings() {
        return failOnWarnings;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback <a>ApiKey</a>
     * importation (<code>true</code>) or not (<code>false</code>) when error is
     * encountered.
     * </p>
     *
     * @return <p>
     *         A query parameter to indicate whether to rollback <a>ApiKey</a>
     *         importation (<code>true</code>) or not (<code>false</code>) when
     *         error is encountered.
     *         </p>
     */
    public Boolean getFailOnWarnings() {
        return failOnWarnings;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback <a>ApiKey</a>
     * importation (<code>true</code>) or not (<code>false</code>) when error is
     * encountered.
     * </p>
     *
     * @param failOnWarnings <p>
     *            A query parameter to indicate whether to rollback
     *            <a>ApiKey</a> importation (<code>true</code>) or not (
     *            <code>false</code>) when error is encountered.
     *            </p>
     */
    public void setFailOnWarnings(Boolean failOnWarnings) {
        this.failOnWarnings = failOnWarnings;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback <a>ApiKey</a>
     * importation (<code>true</code>) or not (<code>false</code>) when error is
     * encountered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failOnWarnings <p>
     *            A query parameter to indicate whether to rollback
     *            <a>ApiKey</a> importation (<code>true</code>) or not (
     *            <code>false</code>) when error is encountered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportApiKeysRequest withFailOnWarnings(Boolean failOnWarnings) {
        this.failOnWarnings = failOnWarnings;
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
            sb.append("body: " + getBody() + ",");
        if (getFormat() != null)
            sb.append("format: " + getFormat() + ",");
        if (getFailOnWarnings() != null)
            sb.append("failOnWarnings: " + getFailOnWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode
                + ((getFailOnWarnings() == null) ? 0 : getFailOnWarnings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportApiKeysRequest == false)
            return false;
        ImportApiKeysRequest other = (ImportApiKeysRequest) obj;

        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getFailOnWarnings() == null ^ this.getFailOnWarnings() == null)
            return false;
        if (other.getFailOnWarnings() != null
                && other.getFailOnWarnings().equals(this.getFailOnWarnings()) == false)
            return false;
        return true;
    }
}
