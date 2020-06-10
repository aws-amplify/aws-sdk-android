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
 * Provisions the specified product.
 * </p>
 * <p>
 * A provisioned product is a resourced instance of a product. For example,
 * provisioning a product based on a CloudFormation template launches a
 * CloudFormation stack and its underlying resources. You can check the status
 * of this request using <a>DescribeRecord</a>.
 * </p>
 * <p>
 * If the request contains a tag key with an empty list of values, there is a
 * tag conflict for that key. Do not include conflicted keys as tags, or this
 * causes the error
 * "Parameter validation failed: Missing required parameter in Tags[<i>N</i>]:<i>Value</i>"
 * .
 * </p>
 */
public class ProvisionProductRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String productId;

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String provisioningArtifactId;

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product
     * has a default path, and required if the product has more than one path.
     * To list the paths for a product, use <a>ListLaunchPaths</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String pathId;

    /**
     * <p>
     * A user-friendly name for the provisioned product. This value must be
     * unique for the AWS account and cannot be updated after the product is
     * provisioned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     */
    private String provisionedProductName;

    /**
     * <p>
     * Parameters specified by the administrator that are required for
     * provisioning the product.
     * </p>
     */
    private java.util.List<ProvisioningParameter> provisioningParameters;

    /**
     * <p>
     * An object that contains information about the provisioning preferences
     * for a stack set.
     * </p>
     */
    private ProvisioningPreferences provisioningPreferences;

    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish
     * stack-related events.
     * </p>
     */
    private java.util.List<String> notificationArns;

    /**
     * <p>
     * An idempotency token that uniquely identifies the provisioning request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String provisionToken;

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
    public ProvisionProductRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The product identifier.
     *         </p>
     */
    public String getProductId() {
        return productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param productId <p>
     *            The product identifier.
     *            </p>
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param productId <p>
     *            The product identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionProductRequest withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the provisioning artifact.
     *         </p>
     */
    public String getProvisioningArtifactId() {
        return provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisioningArtifactId <p>
     *            The identifier of the provisioning artifact.
     *            </p>
     */
    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisioningArtifactId <p>
     *            The identifier of the provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionProductRequest withProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
        return this;
    }

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product
     * has a default path, and required if the product has more than one path.
     * To list the paths for a product, use <a>ListLaunchPaths</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The path identifier of the product. This value is optional if the
     *         product has a default path, and required if the product has more
     *         than one path. To list the paths for a product, use
     *         <a>ListLaunchPaths</a>.
     *         </p>
     */
    public String getPathId() {
        return pathId;
    }

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product
     * has a default path, and required if the product has more than one path.
     * To list the paths for a product, use <a>ListLaunchPaths</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param pathId <p>
     *            The path identifier of the product. This value is optional if
     *            the product has a default path, and required if the product
     *            has more than one path. To list the paths for a product, use
     *            <a>ListLaunchPaths</a>.
     *            </p>
     */
    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    /**
     * <p>
     * The path identifier of the product. This value is optional if the product
     * has a default path, and required if the product has more than one path.
     * To list the paths for a product, use <a>ListLaunchPaths</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param pathId <p>
     *            The path identifier of the product. This value is optional if
     *            the product has a default path, and required if the product
     *            has more than one path. To list the paths for a product, use
     *            <a>ListLaunchPaths</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionProductRequest withPathId(String pathId) {
        this.pathId = pathId;
        return this;
    }

    /**
     * <p>
     * A user-friendly name for the provisioned product. This value must be
     * unique for the AWS account and cannot be updated after the product is
     * provisioned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     *
     * @return <p>
     *         A user-friendly name for the provisioned product. This value must
     *         be unique for the AWS account and cannot be updated after the
     *         product is provisioned.
     *         </p>
     */
    public String getProvisionedProductName() {
        return provisionedProductName;
    }

    /**
     * <p>
     * A user-friendly name for the provisioned product. This value must be
     * unique for the AWS account and cannot be updated after the product is
     * provisioned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     *
     * @param provisionedProductName <p>
     *            A user-friendly name for the provisioned product. This value
     *            must be unique for the AWS account and cannot be updated after
     *            the product is provisioned.
     *            </p>
     */
    public void setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
    }

    /**
     * <p>
     * A user-friendly name for the provisioned product. This value must be
     * unique for the AWS account and cannot be updated after the product is
     * provisioned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     *
     * @param provisionedProductName <p>
     *            A user-friendly name for the provisioned product. This value
     *            must be unique for the AWS account and cannot be updated after
     *            the product is provisioned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionProductRequest withProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
        return this;
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for
     * provisioning the product.
     * </p>
     *
     * @return <p>
     *         Parameters specified by the administrator that are required for
     *         provisioning the product.
     *         </p>
     */
    public java.util.List<ProvisioningParameter> getProvisioningParameters() {
        return provisioningParameters;
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for
     * provisioning the product.
     * </p>
     *
     * @param provisioningParameters <p>
     *            Parameters specified by the administrator that are required
     *            for provisioning the product.
     *            </p>
     */
    public void setProvisioningParameters(
            java.util.Collection<ProvisioningParameter> provisioningParameters) {
        if (provisioningParameters == null) {
            this.provisioningParameters = null;
            return;
        }

        this.provisioningParameters = new java.util.ArrayList<ProvisioningParameter>(
                provisioningParameters);
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for
     * provisioning the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningParameters <p>
     *            Parameters specified by the administrator that are required
     *            for provisioning the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionProductRequest withProvisioningParameters(
            ProvisioningParameter... provisioningParameters) {
        if (getProvisioningParameters() == null) {
            this.provisioningParameters = new java.util.ArrayList<ProvisioningParameter>(
                    provisioningParameters.length);
        }
        for (ProvisioningParameter value : provisioningParameters) {
            this.provisioningParameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Parameters specified by the administrator that are required for
     * provisioning the product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningParameters <p>
     *            Parameters specified by the administrator that are required
     *            for provisioning the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionProductRequest withProvisioningParameters(
            java.util.Collection<ProvisioningParameter> provisioningParameters) {
        setProvisioningParameters(provisioningParameters);
        return this;
    }

    /**
     * <p>
     * An object that contains information about the provisioning preferences
     * for a stack set.
     * </p>
     *
     * @return <p>
     *         An object that contains information about the provisioning
     *         preferences for a stack set.
     *         </p>
     */
    public ProvisioningPreferences getProvisioningPreferences() {
        return provisioningPreferences;
    }

    /**
     * <p>
     * An object that contains information about the provisioning preferences
     * for a stack set.
     * </p>
     *
     * @param provisioningPreferences <p>
     *            An object that contains information about the provisioning
     *            preferences for a stack set.
     *            </p>
     */
    public void setProvisioningPreferences(ProvisioningPreferences provisioningPreferences) {
        this.provisioningPreferences = provisioningPreferences;
    }

    /**
     * <p>
     * An object that contains information about the provisioning preferences
     * for a stack set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningPreferences <p>
     *            An object that contains information about the provisioning
     *            preferences for a stack set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionProductRequest withProvisioningPreferences(
            ProvisioningPreferences provisioningPreferences) {
        this.provisioningPreferences = provisioningPreferences;
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @return <p>
     *         One or more tags.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @param tags <p>
     *            One or more tags.
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
     * One or more tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionProductRequest withTags(Tag... tags) {
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
     * One or more tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionProductRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish
     * stack-related events.
     * </p>
     *
     * @return <p>
     *         Passed to CloudFormation. The SNS topic ARNs to which to publish
     *         stack-related events.
     *         </p>
     */
    public java.util.List<String> getNotificationArns() {
        return notificationArns;
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish
     * stack-related events.
     * </p>
     *
     * @param notificationArns <p>
     *            Passed to CloudFormation. The SNS topic ARNs to which to
     *            publish stack-related events.
     *            </p>
     */
    public void setNotificationArns(java.util.Collection<String> notificationArns) {
        if (notificationArns == null) {
            this.notificationArns = null;
            return;
        }

        this.notificationArns = new java.util.ArrayList<String>(notificationArns);
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish
     * stack-related events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationArns <p>
     *            Passed to CloudFormation. The SNS topic ARNs to which to
     *            publish stack-related events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionProductRequest withNotificationArns(String... notificationArns) {
        if (getNotificationArns() == null) {
            this.notificationArns = new java.util.ArrayList<String>(notificationArns.length);
        }
        for (String value : notificationArns) {
            this.notificationArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Passed to CloudFormation. The SNS topic ARNs to which to publish
     * stack-related events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationArns <p>
     *            Passed to CloudFormation. The SNS topic ARNs to which to
     *            publish stack-related events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionProductRequest withNotificationArns(
            java.util.Collection<String> notificationArns) {
        setNotificationArns(notificationArns);
        return this;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the provisioning request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         An idempotency token that uniquely identifies the provisioning
     *         request.
     *         </p>
     */
    public String getProvisionToken() {
        return provisionToken;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the provisioning request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param provisionToken <p>
     *            An idempotency token that uniquely identifies the provisioning
     *            request.
     *            </p>
     */
    public void setProvisionToken(String provisionToken) {
        this.provisionToken = provisionToken;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the provisioning request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param provisionToken <p>
     *            An idempotency token that uniquely identifies the provisioning
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionProductRequest withProvisionToken(String provisionToken) {
        this.provisionToken = provisionToken;
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
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId() + ",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: " + getProvisioningArtifactId() + ",");
        if (getPathId() != null)
            sb.append("PathId: " + getPathId() + ",");
        if (getProvisionedProductName() != null)
            sb.append("ProvisionedProductName: " + getProvisionedProductName() + ",");
        if (getProvisioningParameters() != null)
            sb.append("ProvisioningParameters: " + getProvisioningParameters() + ",");
        if (getProvisioningPreferences() != null)
            sb.append("ProvisioningPreferences: " + getProvisioningPreferences() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getNotificationArns() != null)
            sb.append("NotificationArns: " + getNotificationArns() + ",");
        if (getProvisionToken() != null)
            sb.append("ProvisionToken: " + getProvisionToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId()
                        .hashCode());
        hashCode = prime * hashCode + ((getPathId() == null) ? 0 : getPathId().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedProductName() == null) ? 0 : getProvisionedProductName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningParameters() == null) ? 0 : getProvisioningParameters()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningPreferences() == null) ? 0 : getProvisioningPreferences()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationArns() == null) ? 0 : getNotificationArns().hashCode());
        hashCode = prime * hashCode
                + ((getProvisionToken() == null) ? 0 : getProvisionToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionProductRequest == false)
            return false;
        ProvisionProductRequest other = (ProvisionProductRequest) obj;

        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null
                && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null
                && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null
                && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getPathId() == null ^ this.getPathId() == null)
            return false;
        if (other.getPathId() != null && other.getPathId().equals(this.getPathId()) == false)
            return false;
        if (other.getProvisionedProductName() == null ^ this.getProvisionedProductName() == null)
            return false;
        if (other.getProvisionedProductName() != null
                && other.getProvisionedProductName().equals(this.getProvisionedProductName()) == false)
            return false;
        if (other.getProvisioningParameters() == null ^ this.getProvisioningParameters() == null)
            return false;
        if (other.getProvisioningParameters() != null
                && other.getProvisioningParameters().equals(this.getProvisioningParameters()) == false)
            return false;
        if (other.getProvisioningPreferences() == null ^ this.getProvisioningPreferences() == null)
            return false;
        if (other.getProvisioningPreferences() != null
                && other.getProvisioningPreferences().equals(this.getProvisioningPreferences()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getNotificationArns() == null ^ this.getNotificationArns() == null)
            return false;
        if (other.getNotificationArns() != null
                && other.getNotificationArns().equals(this.getNotificationArns()) == false)
            return false;
        if (other.getProvisionToken() == null ^ this.getProvisionToken() == null)
            return false;
        if (other.getProvisionToken() != null
                && other.getProvisionToken().equals(this.getProvisionToken()) == false)
            return false;
        return true;
    }
}
