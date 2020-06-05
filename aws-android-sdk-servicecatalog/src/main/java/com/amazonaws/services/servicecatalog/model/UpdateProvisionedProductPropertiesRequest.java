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
 * Requests updates to the properties of the specified provisioned product.
 * </p>
 */
public class UpdateProvisionedProductPropertiesRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The identifier of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String provisionedProductId;

    /**
     * <p>
     * A map that contains the provisioned product properties to be updated.
     * </p>
     * <p>
     * The <code>OWNER</code> key accepts user ARNs and role ARNs. The owner is
     * the user that is allowed to see, update, terminate, and execute service
     * actions in the provisioned product.
     * </p>
     * <p>
     * The administrator can change the owner of a provisioned product to
     * another IAM user within the same account. Both end user owners and
     * administrators can see ownership history of the provisioned product using
     * the <code>ListRecordHistory</code> API. The new owner can describe all
     * past records for the provisioned product using the
     * <code>DescribeRecord</code> API. The previous owner can no longer use
     * <code>DescribeRecord</code>, but can still see the product's history from
     * when he was an owner using <code>ListRecordHistory</code>.
     * </p>
     * <p>
     * If a provisioned product ownership is assigned to an end user, they can
     * see and perform any action through the API or Service Catalog console
     * such as update, terminate, and execute service actions. If an end user
     * provisions a product and the owner is updated to someone else, they will
     * no longer be able to see or perform any actions through API or the
     * Service Catalog console on that provisioned product.
     * </p>
     */
    private java.util.Map<String, String> provisionedProductProperties;

    /**
     * <p>
     * The idempotency token that uniquely identifies the provisioning product
     * update request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String idempotencyToken;

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
    public UpdateProvisionedProductPropertiesRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the provisioned product.
     *         </p>
     */
    public String getProvisionedProductId() {
        return provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisionedProductId <p>
     *            The identifier of the provisioned product.
     *            </p>
     */
    public void setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the provisioned product.
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
     *            The identifier of the provisioned product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisionedProductPropertiesRequest withProvisionedProductId(
            String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
        return this;
    }

    /**
     * <p>
     * A map that contains the provisioned product properties to be updated.
     * </p>
     * <p>
     * The <code>OWNER</code> key accepts user ARNs and role ARNs. The owner is
     * the user that is allowed to see, update, terminate, and execute service
     * actions in the provisioned product.
     * </p>
     * <p>
     * The administrator can change the owner of a provisioned product to
     * another IAM user within the same account. Both end user owners and
     * administrators can see ownership history of the provisioned product using
     * the <code>ListRecordHistory</code> API. The new owner can describe all
     * past records for the provisioned product using the
     * <code>DescribeRecord</code> API. The previous owner can no longer use
     * <code>DescribeRecord</code>, but can still see the product's history from
     * when he was an owner using <code>ListRecordHistory</code>.
     * </p>
     * <p>
     * If a provisioned product ownership is assigned to an end user, they can
     * see and perform any action through the API or Service Catalog console
     * such as update, terminate, and execute service actions. If an end user
     * provisions a product and the owner is updated to someone else, they will
     * no longer be able to see or perform any actions through API or the
     * Service Catalog console on that provisioned product.
     * </p>
     *
     * @return <p>
     *         A map that contains the provisioned product properties to be
     *         updated.
     *         </p>
     *         <p>
     *         The <code>OWNER</code> key accepts user ARNs and role ARNs. The
     *         owner is the user that is allowed to see, update, terminate, and
     *         execute service actions in the provisioned product.
     *         </p>
     *         <p>
     *         The administrator can change the owner of a provisioned product
     *         to another IAM user within the same account. Both end user owners
     *         and administrators can see ownership history of the provisioned
     *         product using the <code>ListRecordHistory</code> API. The new
     *         owner can describe all past records for the provisioned product
     *         using the <code>DescribeRecord</code> API. The previous owner can
     *         no longer use <code>DescribeRecord</code>, but can still see the
     *         product's history from when he was an owner using
     *         <code>ListRecordHistory</code>.
     *         </p>
     *         <p>
     *         If a provisioned product ownership is assigned to an end user,
     *         they can see and perform any action through the API or Service
     *         Catalog console such as update, terminate, and execute service
     *         actions. If an end user provisions a product and the owner is
     *         updated to someone else, they will no longer be able to see or
     *         perform any actions through API or the Service Catalog console on
     *         that provisioned product.
     *         </p>
     */
    public java.util.Map<String, String> getProvisionedProductProperties() {
        return provisionedProductProperties;
    }

    /**
     * <p>
     * A map that contains the provisioned product properties to be updated.
     * </p>
     * <p>
     * The <code>OWNER</code> key accepts user ARNs and role ARNs. The owner is
     * the user that is allowed to see, update, terminate, and execute service
     * actions in the provisioned product.
     * </p>
     * <p>
     * The administrator can change the owner of a provisioned product to
     * another IAM user within the same account. Both end user owners and
     * administrators can see ownership history of the provisioned product using
     * the <code>ListRecordHistory</code> API. The new owner can describe all
     * past records for the provisioned product using the
     * <code>DescribeRecord</code> API. The previous owner can no longer use
     * <code>DescribeRecord</code>, but can still see the product's history from
     * when he was an owner using <code>ListRecordHistory</code>.
     * </p>
     * <p>
     * If a provisioned product ownership is assigned to an end user, they can
     * see and perform any action through the API or Service Catalog console
     * such as update, terminate, and execute service actions. If an end user
     * provisions a product and the owner is updated to someone else, they will
     * no longer be able to see or perform any actions through API or the
     * Service Catalog console on that provisioned product.
     * </p>
     *
     * @param provisionedProductProperties <p>
     *            A map that contains the provisioned product properties to be
     *            updated.
     *            </p>
     *            <p>
     *            The <code>OWNER</code> key accepts user ARNs and role ARNs.
     *            The owner is the user that is allowed to see, update,
     *            terminate, and execute service actions in the provisioned
     *            product.
     *            </p>
     *            <p>
     *            The administrator can change the owner of a provisioned
     *            product to another IAM user within the same account. Both end
     *            user owners and administrators can see ownership history of
     *            the provisioned product using the
     *            <code>ListRecordHistory</code> API. The new owner can describe
     *            all past records for the provisioned product using the
     *            <code>DescribeRecord</code> API. The previous owner can no
     *            longer use <code>DescribeRecord</code>, but can still see the
     *            product's history from when he was an owner using
     *            <code>ListRecordHistory</code>.
     *            </p>
     *            <p>
     *            If a provisioned product ownership is assigned to an end user,
     *            they can see and perform any action through the API or Service
     *            Catalog console such as update, terminate, and execute service
     *            actions. If an end user provisions a product and the owner is
     *            updated to someone else, they will no longer be able to see or
     *            perform any actions through API or the Service Catalog console
     *            on that provisioned product.
     *            </p>
     */
    public void setProvisionedProductProperties(
            java.util.Map<String, String> provisionedProductProperties) {
        this.provisionedProductProperties = provisionedProductProperties;
    }

    /**
     * <p>
     * A map that contains the provisioned product properties to be updated.
     * </p>
     * <p>
     * The <code>OWNER</code> key accepts user ARNs and role ARNs. The owner is
     * the user that is allowed to see, update, terminate, and execute service
     * actions in the provisioned product.
     * </p>
     * <p>
     * The administrator can change the owner of a provisioned product to
     * another IAM user within the same account. Both end user owners and
     * administrators can see ownership history of the provisioned product using
     * the <code>ListRecordHistory</code> API. The new owner can describe all
     * past records for the provisioned product using the
     * <code>DescribeRecord</code> API. The previous owner can no longer use
     * <code>DescribeRecord</code>, but can still see the product's history from
     * when he was an owner using <code>ListRecordHistory</code>.
     * </p>
     * <p>
     * If a provisioned product ownership is assigned to an end user, they can
     * see and perform any action through the API or Service Catalog console
     * such as update, terminate, and execute service actions. If an end user
     * provisions a product and the owner is updated to someone else, they will
     * no longer be able to see or perform any actions through API or the
     * Service Catalog console on that provisioned product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisionedProductProperties <p>
     *            A map that contains the provisioned product properties to be
     *            updated.
     *            </p>
     *            <p>
     *            The <code>OWNER</code> key accepts user ARNs and role ARNs.
     *            The owner is the user that is allowed to see, update,
     *            terminate, and execute service actions in the provisioned
     *            product.
     *            </p>
     *            <p>
     *            The administrator can change the owner of a provisioned
     *            product to another IAM user within the same account. Both end
     *            user owners and administrators can see ownership history of
     *            the provisioned product using the
     *            <code>ListRecordHistory</code> API. The new owner can describe
     *            all past records for the provisioned product using the
     *            <code>DescribeRecord</code> API. The previous owner can no
     *            longer use <code>DescribeRecord</code>, but can still see the
     *            product's history from when he was an owner using
     *            <code>ListRecordHistory</code>.
     *            </p>
     *            <p>
     *            If a provisioned product ownership is assigned to an end user,
     *            they can see and perform any action through the API or Service
     *            Catalog console such as update, terminate, and execute service
     *            actions. If an end user provisions a product and the owner is
     *            updated to someone else, they will no longer be able to see or
     *            perform any actions through API or the Service Catalog console
     *            on that provisioned product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisionedProductPropertiesRequest withProvisionedProductProperties(
            java.util.Map<String, String> provisionedProductProperties) {
        this.provisionedProductProperties = provisionedProductProperties;
        return this;
    }

    /**
     * <p>
     * A map that contains the provisioned product properties to be updated.
     * </p>
     * <p>
     * The <code>OWNER</code> key accepts user ARNs and role ARNs. The owner is
     * the user that is allowed to see, update, terminate, and execute service
     * actions in the provisioned product.
     * </p>
     * <p>
     * The administrator can change the owner of a provisioned product to
     * another IAM user within the same account. Both end user owners and
     * administrators can see ownership history of the provisioned product using
     * the <code>ListRecordHistory</code> API. The new owner can describe all
     * past records for the provisioned product using the
     * <code>DescribeRecord</code> API. The previous owner can no longer use
     * <code>DescribeRecord</code>, but can still see the product's history from
     * when he was an owner using <code>ListRecordHistory</code>.
     * </p>
     * <p>
     * If a provisioned product ownership is assigned to an end user, they can
     * see and perform any action through the API or Service Catalog console
     * such as update, terminate, and execute service actions. If an end user
     * provisions a product and the owner is updated to someone else, they will
     * no longer be able to see or perform any actions through API or the
     * Service Catalog console on that provisioned product.
     * </p>
     * <p>
     * The method adds a new key-value pair into ProvisionedProductProperties
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            ProvisionedProductProperties.
     * @param value The corresponding value of the entry to be added into
     *            ProvisionedProductProperties.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisionedProductPropertiesRequest addProvisionedProductPropertiesEntry(
            String key, String value) {
        if (null == this.provisionedProductProperties) {
            this.provisionedProductProperties = new java.util.HashMap<String, String>();
        }
        if (this.provisionedProductProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.provisionedProductProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ProvisionedProductProperties.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateProvisionedProductPropertiesRequest clearProvisionedProductPropertiesEntries() {
        this.provisionedProductProperties = null;
        return this;
    }

    /**
     * <p>
     * The idempotency token that uniquely identifies the provisioning product
     * update request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         The idempotency token that uniquely identifies the provisioning
     *         product update request.
     *         </p>
     */
    public String getIdempotencyToken() {
        return idempotencyToken;
    }

    /**
     * <p>
     * The idempotency token that uniquely identifies the provisioning product
     * update request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param idempotencyToken <p>
     *            The idempotency token that uniquely identifies the
     *            provisioning product update request.
     *            </p>
     */
    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * The idempotency token that uniquely identifies the provisioning product
     * update request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param idempotencyToken <p>
     *            The idempotency token that uniquely identifies the
     *            provisioning product update request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisionedProductPropertiesRequest withIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: " + getAcceptLanguage() + ",");
        if (getProvisionedProductId() != null)
            sb.append("ProvisionedProductId: " + getProvisionedProductId() + ",");
        if (getProvisionedProductProperties() != null)
            sb.append("ProvisionedProductProperties: " + getProvisionedProductProperties() + ",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: " + getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode
                + ((getProvisionedProductId() == null) ? 0 : getProvisionedProductId().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedProductProperties() == null) ? 0
                        : getProvisionedProductProperties().hashCode());
        hashCode = prime * hashCode
                + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProvisionedProductPropertiesRequest == false)
            return false;
        UpdateProvisionedProductPropertiesRequest other = (UpdateProvisionedProductPropertiesRequest) obj;

        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null
                && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getProvisionedProductId() == null ^ this.getProvisionedProductId() == null)
            return false;
        if (other.getProvisionedProductId() != null
                && other.getProvisionedProductId().equals(this.getProvisionedProductId()) == false)
            return false;
        if (other.getProvisionedProductProperties() == null
                ^ this.getProvisionedProductProperties() == null)
            return false;
        if (other.getProvisionedProductProperties() != null
                && other.getProvisionedProductProperties().equals(
                        this.getProvisionedProductProperties()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null
                && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }
}
