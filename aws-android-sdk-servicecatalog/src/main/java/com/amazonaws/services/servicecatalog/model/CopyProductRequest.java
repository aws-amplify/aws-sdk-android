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
 * Copies the specified source product to the specified target product or a new
 * product.
 * </p>
 * <p>
 * You can copy a product to the same account or another account. You can copy a
 * product to the same region or another region.
 * </p>
 * <p>
 * This operation is performed asynchronously. To track the progress of the
 * operation, use <a>DescribeCopyProductStatus</a>.
 * </p>
 */
public class CopyProductRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The Amazon Resource Name (ARN) of the source product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String sourceProductArn;

    /**
     * <p>
     * The identifier of the target product. By default, a new product is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String targetProductId;

    /**
     * <p>
     * A name for the target product. The default is the name of the source
     * product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     */
    private String targetProductName;

    /**
     * <p>
     * The identifiers of the provisioning artifacts (also known as versions) of
     * the product to copy. By default, all provisioning artifacts are copied.
     * </p>
     */
    private java.util.List<java.util.Map<String, String>> sourceProvisioningArtifactIdentifiers;

    /**
     * <p>
     * The copy options. If the value is <code>CopyTags</code>, the tags from
     * the source product are copied to the target product.
     * </p>
     */
    private java.util.List<String> copyOptions;

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple
     * requests differ only by the idempotency token, the same response is
     * returned for each repeated request.
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
    public CopyProductRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the source product.
     *         </p>
     */
    public String getSourceProductArn() {
        return sourceProductArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param sourceProductArn <p>
     *            The Amazon Resource Name (ARN) of the source product.
     *            </p>
     */
    public void setSourceProductArn(String sourceProductArn) {
        this.sourceProductArn = sourceProductArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param sourceProductArn <p>
     *            The Amazon Resource Name (ARN) of the source product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyProductRequest withSourceProductArn(String sourceProductArn) {
        this.sourceProductArn = sourceProductArn;
        return this;
    }

    /**
     * <p>
     * The identifier of the target product. By default, a new product is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the target product. By default, a new product
     *         is created.
     *         </p>
     */
    public String getTargetProductId() {
        return targetProductId;
    }

    /**
     * <p>
     * The identifier of the target product. By default, a new product is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param targetProductId <p>
     *            The identifier of the target product. By default, a new
     *            product is created.
     *            </p>
     */
    public void setTargetProductId(String targetProductId) {
        this.targetProductId = targetProductId;
    }

    /**
     * <p>
     * The identifier of the target product. By default, a new product is
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param targetProductId <p>
     *            The identifier of the target product. By default, a new
     *            product is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyProductRequest withTargetProductId(String targetProductId) {
        this.targetProductId = targetProductId;
        return this;
    }

    /**
     * <p>
     * A name for the target product. The default is the name of the source
     * product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @return <p>
     *         A name for the target product. The default is the name of the
     *         source product.
     *         </p>
     */
    public String getTargetProductName() {
        return targetProductName;
    }

    /**
     * <p>
     * A name for the target product. The default is the name of the source
     * product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param targetProductName <p>
     *            A name for the target product. The default is the name of the
     *            source product.
     *            </p>
     */
    public void setTargetProductName(String targetProductName) {
        this.targetProductName = targetProductName;
    }

    /**
     * <p>
     * A name for the target product. The default is the name of the source
     * product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8191<br/>
     *
     * @param targetProductName <p>
     *            A name for the target product. The default is the name of the
     *            source product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyProductRequest withTargetProductName(String targetProductName) {
        this.targetProductName = targetProductName;
        return this;
    }

    /**
     * <p>
     * The identifiers of the provisioning artifacts (also known as versions) of
     * the product to copy. By default, all provisioning artifacts are copied.
     * </p>
     *
     * @return <p>
     *         The identifiers of the provisioning artifacts (also known as
     *         versions) of the product to copy. By default, all provisioning
     *         artifacts are copied.
     *         </p>
     */
    public java.util.List<java.util.Map<String, String>> getSourceProvisioningArtifactIdentifiers() {
        return sourceProvisioningArtifactIdentifiers;
    }

    /**
     * <p>
     * The identifiers of the provisioning artifacts (also known as versions) of
     * the product to copy. By default, all provisioning artifacts are copied.
     * </p>
     *
     * @param sourceProvisioningArtifactIdentifiers <p>
     *            The identifiers of the provisioning artifacts (also known as
     *            versions) of the product to copy. By default, all provisioning
     *            artifacts are copied.
     *            </p>
     */
    public void setSourceProvisioningArtifactIdentifiers(
            java.util.Collection<java.util.Map<String, String>> sourceProvisioningArtifactIdentifiers) {
        if (sourceProvisioningArtifactIdentifiers == null) {
            this.sourceProvisioningArtifactIdentifiers = null;
            return;
        }

        this.sourceProvisioningArtifactIdentifiers = new java.util.ArrayList<java.util.Map<String, String>>(
                sourceProvisioningArtifactIdentifiers);
    }

    /**
     * <p>
     * The identifiers of the provisioning artifacts (also known as versions) of
     * the product to copy. By default, all provisioning artifacts are copied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceProvisioningArtifactIdentifiers <p>
     *            The identifiers of the provisioning artifacts (also known as
     *            versions) of the product to copy. By default, all provisioning
     *            artifacts are copied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyProductRequest withSourceProvisioningArtifactIdentifiers(
            java.util.Map<String, String>... sourceProvisioningArtifactIdentifiers) {
        if (getSourceProvisioningArtifactIdentifiers() == null) {
            this.sourceProvisioningArtifactIdentifiers = new java.util.ArrayList<java.util.Map<String, String>>(
                    sourceProvisioningArtifactIdentifiers.length);
        }
        for (java.util.Map<String, String> value : sourceProvisioningArtifactIdentifiers) {
            this.sourceProvisioningArtifactIdentifiers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the provisioning artifacts (also known as versions) of
     * the product to copy. By default, all provisioning artifacts are copied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceProvisioningArtifactIdentifiers <p>
     *            The identifiers of the provisioning artifacts (also known as
     *            versions) of the product to copy. By default, all provisioning
     *            artifacts are copied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyProductRequest withSourceProvisioningArtifactIdentifiers(
            java.util.Collection<java.util.Map<String, String>> sourceProvisioningArtifactIdentifiers) {
        setSourceProvisioningArtifactIdentifiers(sourceProvisioningArtifactIdentifiers);
        return this;
    }

    /**
     * <p>
     * The copy options. If the value is <code>CopyTags</code>, the tags from
     * the source product are copied to the target product.
     * </p>
     *
     * @return <p>
     *         The copy options. If the value is <code>CopyTags</code>, the tags
     *         from the source product are copied to the target product.
     *         </p>
     */
    public java.util.List<String> getCopyOptions() {
        return copyOptions;
    }

    /**
     * <p>
     * The copy options. If the value is <code>CopyTags</code>, the tags from
     * the source product are copied to the target product.
     * </p>
     *
     * @param copyOptions <p>
     *            The copy options. If the value is <code>CopyTags</code>, the
     *            tags from the source product are copied to the target product.
     *            </p>
     */
    public void setCopyOptions(java.util.Collection<String> copyOptions) {
        if (copyOptions == null) {
            this.copyOptions = null;
            return;
        }

        this.copyOptions = new java.util.ArrayList<String>(copyOptions);
    }

    /**
     * <p>
     * The copy options. If the value is <code>CopyTags</code>, the tags from
     * the source product are copied to the target product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyOptions <p>
     *            The copy options. If the value is <code>CopyTags</code>, the
     *            tags from the source product are copied to the target product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyProductRequest withCopyOptions(String... copyOptions) {
        if (getCopyOptions() == null) {
            this.copyOptions = new java.util.ArrayList<String>(copyOptions.length);
        }
        for (String value : copyOptions) {
            this.copyOptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The copy options. If the value is <code>CopyTags</code>, the tags from
     * the source product are copied to the target product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyOptions <p>
     *            The copy options. If the value is <code>CopyTags</code>, the
     *            tags from the source product are copied to the target product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyProductRequest withCopyOptions(java.util.Collection<String> copyOptions) {
        setCopyOptions(copyOptions);
        return this;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple
     * requests differ only by the idempotency token, the same response is
     * returned for each repeated request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         A unique identifier that you provide to ensure idempotency. If
     *         multiple requests differ only by the idempotency token, the same
     *         response is returned for each repeated request.
     *         </p>
     */
    public String getIdempotencyToken() {
        return idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple
     * requests differ only by the idempotency token, the same response is
     * returned for each repeated request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param idempotencyToken <p>
     *            A unique identifier that you provide to ensure idempotency. If
     *            multiple requests differ only by the idempotency token, the
     *            same response is returned for each repeated request.
     *            </p>
     */
    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple
     * requests differ only by the idempotency token, the same response is
     * returned for each repeated request.
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
     *            A unique identifier that you provide to ensure idempotency. If
     *            multiple requests differ only by the idempotency token, the
     *            same response is returned for each repeated request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyProductRequest withIdempotencyToken(String idempotencyToken) {
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
        if (getSourceProductArn() != null)
            sb.append("SourceProductArn: " + getSourceProductArn() + ",");
        if (getTargetProductId() != null)
            sb.append("TargetProductId: " + getTargetProductId() + ",");
        if (getTargetProductName() != null)
            sb.append("TargetProductName: " + getTargetProductName() + ",");
        if (getSourceProvisioningArtifactIdentifiers() != null)
            sb.append("SourceProvisioningArtifactIdentifiers: "
                    + getSourceProvisioningArtifactIdentifiers() + ",");
        if (getCopyOptions() != null)
            sb.append("CopyOptions: " + getCopyOptions() + ",");
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
                + ((getSourceProductArn() == null) ? 0 : getSourceProductArn().hashCode());
        hashCode = prime * hashCode
                + ((getTargetProductId() == null) ? 0 : getTargetProductId().hashCode());
        hashCode = prime * hashCode
                + ((getTargetProductName() == null) ? 0 : getTargetProductName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceProvisioningArtifactIdentifiers() == null) ? 0
                        : getSourceProvisioningArtifactIdentifiers().hashCode());
        hashCode = prime * hashCode
                + ((getCopyOptions() == null) ? 0 : getCopyOptions().hashCode());
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

        if (obj instanceof CopyProductRequest == false)
            return false;
        CopyProductRequest other = (CopyProductRequest) obj;

        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null
                && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getSourceProductArn() == null ^ this.getSourceProductArn() == null)
            return false;
        if (other.getSourceProductArn() != null
                && other.getSourceProductArn().equals(this.getSourceProductArn()) == false)
            return false;
        if (other.getTargetProductId() == null ^ this.getTargetProductId() == null)
            return false;
        if (other.getTargetProductId() != null
                && other.getTargetProductId().equals(this.getTargetProductId()) == false)
            return false;
        if (other.getTargetProductName() == null ^ this.getTargetProductName() == null)
            return false;
        if (other.getTargetProductName() != null
                && other.getTargetProductName().equals(this.getTargetProductName()) == false)
            return false;
        if (other.getSourceProvisioningArtifactIdentifiers() == null
                ^ this.getSourceProvisioningArtifactIdentifiers() == null)
            return false;
        if (other.getSourceProvisioningArtifactIdentifiers() != null
                && other.getSourceProvisioningArtifactIdentifiers().equals(
                        this.getSourceProvisioningArtifactIdentifiers()) == false)
            return false;
        if (other.getCopyOptions() == null ^ this.getCopyOptions() == null)
            return false;
        if (other.getCopyOptions() != null
                && other.getCopyOptions().equals(this.getCopyOptions()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null
                && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }
}
