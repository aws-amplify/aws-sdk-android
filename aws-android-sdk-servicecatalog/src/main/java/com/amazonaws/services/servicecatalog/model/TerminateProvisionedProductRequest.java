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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Terminates the specified provisioned product.
 * </p>
 * <p>
 * This operation does not delete any records associated with the provisioned
 * product.
 * </p>
 * <p>
 * You can check the status of this request using <a>DescribeRecord</a>.
 * </p>
 */
public class TerminateProvisionedProductRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the provisioned product. You cannot specify both
     * <code>ProvisionedProductName</code> and <code>ProvisionedProductId</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-
     * 9._-]{0,127}|arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023
     * }<br/>
     */
    private String provisionedProductName;

    /**
     * <p>
     * The identifier of the provisioned product. You cannot specify both
     * <code>ProvisionedProductName</code> and <code>ProvisionedProductId</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String provisionedProductId;

    /**
     * <p>
     * An idempotency token that uniquely identifies the termination request.
     * This token is only valid during the termination process. After the
     * provisioned product is terminated, subsequent requests to terminate the
     * same provisioned product always return <b>ResourceNotFound</b>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String terminateToken;

    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified
     * provisioned product even if it cannot delete the underlying resources.
     * </p>
     */
    private Boolean ignoreErrors;

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     */
    private String acceptLanguage;

    /**
     * <p>
     * The name of the provisioned product. You cannot specify both
     * <code>ProvisionedProductName</code> and <code>ProvisionedProductId</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-
     * 9._-]{0,127}|arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023
     * }<br/>
     *
     * @return <p>
     *         The name of the provisioned product. You cannot specify both
     *         <code>ProvisionedProductName</code> and
     *         <code>ProvisionedProductId</code>.
     *         </p>
     */
    public String getProvisionedProductName() {
        return provisionedProductName;
    }

    /**
     * <p>
     * The name of the provisioned product. You cannot specify both
     * <code>ProvisionedProductName</code> and <code>ProvisionedProductId</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-
     * 9._-]{0,127}|arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023
     * }<br/>
     *
     * @param provisionedProductName <p>
     *            The name of the provisioned product. You cannot specify both
     *            <code>ProvisionedProductName</code> and
     *            <code>ProvisionedProductId</code>.
     *            </p>
     */
    public void setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
    }

    /**
     * <p>
     * The name of the provisioned product. You cannot specify both
     * <code>ProvisionedProductName</code> and <code>ProvisionedProductId</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-
     * 9._-]{0,127}|arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023
     * }<br/>
     *
     * @param provisionedProductName <p>
     *            The name of the provisioned product. You cannot specify both
     *            <code>ProvisionedProductName</code> and
     *            <code>ProvisionedProductId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateProvisionedProductRequest withProvisionedProductName(
            String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioned product. You cannot specify both
     * <code>ProvisionedProductName</code> and <code>ProvisionedProductId</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the provisioned product. You cannot specify
     *         both <code>ProvisionedProductName</code> and
     *         <code>ProvisionedProductId</code>.
     *         </p>
     */
    public String getProvisionedProductId() {
        return provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the provisioned product. You cannot specify both
     * <code>ProvisionedProductName</code> and <code>ProvisionedProductId</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisionedProductId <p>
     *            The identifier of the provisioned product. You cannot specify
     *            both <code>ProvisionedProductName</code> and
     *            <code>ProvisionedProductId</code>.
     *            </p>
     */
    public void setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the provisioned product. You cannot specify both
     * <code>ProvisionedProductName</code> and <code>ProvisionedProductId</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisionedProductId <p>
     *            The identifier of the provisioned product. You cannot specify
     *            both <code>ProvisionedProductName</code> and
     *            <code>ProvisionedProductId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateProvisionedProductRequest withProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
        return this;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the termination request.
     * This token is only valid during the termination process. After the
     * provisioned product is terminated, subsequent requests to terminate the
     * same provisioned product always return <b>ResourceNotFound</b>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         An idempotency token that uniquely identifies the termination
     *         request. This token is only valid during the termination process.
     *         After the provisioned product is terminated, subsequent requests
     *         to terminate the same provisioned product always return
     *         <b>ResourceNotFound</b>.
     *         </p>
     */
    public String getTerminateToken() {
        return terminateToken;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the termination request.
     * This token is only valid during the termination process. After the
     * provisioned product is terminated, subsequent requests to terminate the
     * same provisioned product always return <b>ResourceNotFound</b>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param terminateToken <p>
     *            An idempotency token that uniquely identifies the termination
     *            request. This token is only valid during the termination
     *            process. After the provisioned product is terminated,
     *            subsequent requests to terminate the same provisioned product
     *            always return <b>ResourceNotFound</b>.
     *            </p>
     */
    public void setTerminateToken(String terminateToken) {
        this.terminateToken = terminateToken;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the termination request.
     * This token is only valid during the termination process. After the
     * provisioned product is terminated, subsequent requests to terminate the
     * same provisioned product always return <b>ResourceNotFound</b>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param terminateToken <p>
     *            An idempotency token that uniquely identifies the termination
     *            request. This token is only valid during the termination
     *            process. After the provisioned product is terminated,
     *            subsequent requests to terminate the same provisioned product
     *            always return <b>ResourceNotFound</b>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateProvisionedProductRequest withTerminateToken(String terminateToken) {
        this.terminateToken = terminateToken;
        return this;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified
     * provisioned product even if it cannot delete the underlying resources.
     * </p>
     *
     * @return <p>
     *         If set to true, AWS Service Catalog stops managing the specified
     *         provisioned product even if it cannot delete the underlying
     *         resources.
     *         </p>
     */
    public Boolean isIgnoreErrors() {
        return ignoreErrors;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified
     * provisioned product even if it cannot delete the underlying resources.
     * </p>
     *
     * @return <p>
     *         If set to true, AWS Service Catalog stops managing the specified
     *         provisioned product even if it cannot delete the underlying
     *         resources.
     *         </p>
     */
    public Boolean getIgnoreErrors() {
        return ignoreErrors;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified
     * provisioned product even if it cannot delete the underlying resources.
     * </p>
     *
     * @param ignoreErrors <p>
     *            If set to true, AWS Service Catalog stops managing the
     *            specified provisioned product even if it cannot delete the
     *            underlying resources.
     *            </p>
     */
    public void setIgnoreErrors(Boolean ignoreErrors) {
        this.ignoreErrors = ignoreErrors;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified
     * provisioned product even if it cannot delete the underlying resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ignoreErrors <p>
     *            If set to true, AWS Service Catalog stops managing the
     *            specified provisioned product even if it cannot delete the
     *            underlying resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateProvisionedProductRequest withIgnoreErrors(Boolean ignoreErrors) {
        this.ignoreErrors = ignoreErrors;
        return this;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @return <p>
     *         The language code.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param acceptLanguage <p>
     *            The language code.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>en</code> - English (default)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>jp</code> - Japanese
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zh</code> - Chinese
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param acceptLanguage <p>
     *            The language code.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>en</code> - English (default)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>jp</code> - Japanese
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zh</code> - Chinese
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateProvisionedProductRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
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
        if (getProvisionedProductName() != null)
            sb.append("ProvisionedProductName: " + getProvisionedProductName() + ",");
        if (getProvisionedProductId() != null)
            sb.append("ProvisionedProductId: " + getProvisionedProductId() + ",");
        if (getTerminateToken() != null)
            sb.append("TerminateToken: " + getTerminateToken() + ",");
        if (getIgnoreErrors() != null)
            sb.append("IgnoreErrors: " + getIgnoreErrors() + ",");
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: " + getAcceptLanguage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getProvisionedProductName() == null) ? 0 : getProvisionedProductName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getProvisionedProductId() == null) ? 0 : getProvisionedProductId().hashCode());
        hashCode = prime * hashCode
                + ((getTerminateToken() == null) ? 0 : getTerminateToken().hashCode());
        hashCode = prime * hashCode
                + ((getIgnoreErrors() == null) ? 0 : getIgnoreErrors().hashCode());
        hashCode = prime * hashCode
                + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateProvisionedProductRequest == false)
            return false;
        TerminateProvisionedProductRequest other = (TerminateProvisionedProductRequest) obj;

        if (other.getProvisionedProductName() == null ^ this.getProvisionedProductName() == null)
            return false;
        if (other.getProvisionedProductName() != null
                && other.getProvisionedProductName().equals(this.getProvisionedProductName()) == false)
            return false;
        if (other.getProvisionedProductId() == null ^ this.getProvisionedProductId() == null)
            return false;
        if (other.getProvisionedProductId() != null
                && other.getProvisionedProductId().equals(this.getProvisionedProductId()) == false)
            return false;
        if (other.getTerminateToken() == null ^ this.getTerminateToken() == null)
            return false;
        if (other.getTerminateToken() != null
                && other.getTerminateToken().equals(this.getTerminateToken()) == false)
            return false;
        if (other.getIgnoreErrors() == null ^ this.getIgnoreErrors() == null)
            return false;
        if (other.getIgnoreErrors() != null
                && other.getIgnoreErrors().equals(this.getIgnoreErrors()) == false)
            return false;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null
                && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        return true;
    }
}
