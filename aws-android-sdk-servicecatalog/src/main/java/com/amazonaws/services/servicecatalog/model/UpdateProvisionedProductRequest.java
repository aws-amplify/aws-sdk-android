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
 * Requests updates to the configuration of the specified provisioned product.
 * </p>
 * <p>
 * If there are tags associated with the object, they cannot be updated or
 * added. Depending on the specific updates requested, this operation can update
 * with no interruption, with some interruption, or replace the provisioned
 * product entirely.
 * </p>
 * <p>
 * You can check the status of this request using <a>DescribeRecord</a>.
 * </p>
 */
public class UpdateProvisionedProductRequest extends AmazonWebServiceRequest implements
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
     * The identifier of the product.
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
     * The new path identifier. This value is optional if the product has a
     * default path, and required if the product has more than one path.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String pathId;

    /**
     * <p>
     * The new parameters.
     * </p>
     */
    private java.util.List<UpdateProvisioningParameter> provisioningParameters;

    /**
     * <p>
     * An object that contains information about the provisioning preferences
     * for a stack set.
     * </p>
     */
    private UpdateProvisioningPreferences provisioningPreferences;

    /**
     * <p>
     * One or more tags. Requires the product to have
     * <code>RESOURCE_UPDATE</code> constraint with
     * <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code>
     * to allow tag updates.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The idempotency token that uniquely identifies the provisioning update
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String updateToken;

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
    public UpdateProvisionedProductRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
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
    public UpdateProvisionedProductRequest withProvisionedProductName(String provisionedProductName) {
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
    public UpdateProvisionedProductRequest withProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
        return this;
    }

    /**
     * <p>
     * The identifier of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the product.
     *         </p>
     */
    public String getProductId() {
        return productId;
    }

    /**
     * <p>
     * The identifier of the product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param productId <p>
     *            The identifier of the product.
     *            </p>
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The identifier of the product.
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
     *            The identifier of the product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisionedProductRequest withProductId(String productId) {
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
    public UpdateProvisionedProductRequest withProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
        return this;
    }

    /**
     * <p>
     * The new path identifier. This value is optional if the product has a
     * default path, and required if the product has more than one path.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The new path identifier. This value is optional if the product
     *         has a default path, and required if the product has more than one
     *         path.
     *         </p>
     */
    public String getPathId() {
        return pathId;
    }

    /**
     * <p>
     * The new path identifier. This value is optional if the product has a
     * default path, and required if the product has more than one path.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param pathId <p>
     *            The new path identifier. This value is optional if the product
     *            has a default path, and required if the product has more than
     *            one path.
     *            </p>
     */
    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    /**
     * <p>
     * The new path identifier. This value is optional if the product has a
     * default path, and required if the product has more than one path.
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
     *            The new path identifier. This value is optional if the product
     *            has a default path, and required if the product has more than
     *            one path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisionedProductRequest withPathId(String pathId) {
        this.pathId = pathId;
        return this;
    }

    /**
     * <p>
     * The new parameters.
     * </p>
     *
     * @return <p>
     *         The new parameters.
     *         </p>
     */
    public java.util.List<UpdateProvisioningParameter> getProvisioningParameters() {
        return provisioningParameters;
    }

    /**
     * <p>
     * The new parameters.
     * </p>
     *
     * @param provisioningParameters <p>
     *            The new parameters.
     *            </p>
     */
    public void setProvisioningParameters(
            java.util.Collection<UpdateProvisioningParameter> provisioningParameters) {
        if (provisioningParameters == null) {
            this.provisioningParameters = null;
            return;
        }

        this.provisioningParameters = new java.util.ArrayList<UpdateProvisioningParameter>(
                provisioningParameters);
    }

    /**
     * <p>
     * The new parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningParameters <p>
     *            The new parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisionedProductRequest withProvisioningParameters(
            UpdateProvisioningParameter... provisioningParameters) {
        if (getProvisioningParameters() == null) {
            this.provisioningParameters = new java.util.ArrayList<UpdateProvisioningParameter>(
                    provisioningParameters.length);
        }
        for (UpdateProvisioningParameter value : provisioningParameters) {
            this.provisioningParameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The new parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningParameters <p>
     *            The new parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisionedProductRequest withProvisioningParameters(
            java.util.Collection<UpdateProvisioningParameter> provisioningParameters) {
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
    public UpdateProvisioningPreferences getProvisioningPreferences() {
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
    public void setProvisioningPreferences(UpdateProvisioningPreferences provisioningPreferences) {
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
    public UpdateProvisionedProductRequest withProvisioningPreferences(
            UpdateProvisioningPreferences provisioningPreferences) {
        this.provisioningPreferences = provisioningPreferences;
        return this;
    }

    /**
     * <p>
     * One or more tags. Requires the product to have
     * <code>RESOURCE_UPDATE</code> constraint with
     * <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code>
     * to allow tag updates.
     * </p>
     *
     * @return <p>
     *         One or more tags. Requires the product to have
     *         <code>RESOURCE_UPDATE</code> constraint with
     *         <code>TagUpdatesOnProvisionedProduct</code> set to
     *         <code>ALLOWED</code> to allow tag updates.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags. Requires the product to have
     * <code>RESOURCE_UPDATE</code> constraint with
     * <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code>
     * to allow tag updates.
     * </p>
     *
     * @param tags <p>
     *            One or more tags. Requires the product to have
     *            <code>RESOURCE_UPDATE</code> constraint with
     *            <code>TagUpdatesOnProvisionedProduct</code> set to
     *            <code>ALLOWED</code> to allow tag updates.
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
     * One or more tags. Requires the product to have
     * <code>RESOURCE_UPDATE</code> constraint with
     * <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code>
     * to allow tag updates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags. Requires the product to have
     *            <code>RESOURCE_UPDATE</code> constraint with
     *            <code>TagUpdatesOnProvisionedProduct</code> set to
     *            <code>ALLOWED</code> to allow tag updates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisionedProductRequest withTags(Tag... tags) {
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
     * One or more tags. Requires the product to have
     * <code>RESOURCE_UPDATE</code> constraint with
     * <code>TagUpdatesOnProvisionedProduct</code> set to <code>ALLOWED</code>
     * to allow tag updates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags. Requires the product to have
     *            <code>RESOURCE_UPDATE</code> constraint with
     *            <code>TagUpdatesOnProvisionedProduct</code> set to
     *            <code>ALLOWED</code> to allow tag updates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisionedProductRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The idempotency token that uniquely identifies the provisioning update
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         The idempotency token that uniquely identifies the provisioning
     *         update request.
     *         </p>
     */
    public String getUpdateToken() {
        return updateToken;
    }

    /**
     * <p>
     * The idempotency token that uniquely identifies the provisioning update
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param updateToken <p>
     *            The idempotency token that uniquely identifies the
     *            provisioning update request.
     *            </p>
     */
    public void setUpdateToken(String updateToken) {
        this.updateToken = updateToken;
    }

    /**
     * <p>
     * The idempotency token that uniquely identifies the provisioning update
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param updateToken <p>
     *            The idempotency token that uniquely identifies the
     *            provisioning update request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisionedProductRequest withUpdateToken(String updateToken) {
        this.updateToken = updateToken;
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
        if (getProvisionedProductName() != null)
            sb.append("ProvisionedProductName: " + getProvisionedProductName() + ",");
        if (getProvisionedProductId() != null)
            sb.append("ProvisionedProductId: " + getProvisionedProductId() + ",");
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId() + ",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: " + getProvisioningArtifactId() + ",");
        if (getPathId() != null)
            sb.append("PathId: " + getPathId() + ",");
        if (getProvisioningParameters() != null)
            sb.append("ProvisioningParameters: " + getProvisioningParameters() + ",");
        if (getProvisioningPreferences() != null)
            sb.append("ProvisioningPreferences: " + getProvisioningPreferences() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getUpdateToken() != null)
            sb.append("UpdateToken: " + getUpdateToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedProductName() == null) ? 0 : getProvisionedProductName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getProvisionedProductId() == null) ? 0 : getProvisionedProductId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId()
                        .hashCode());
        hashCode = prime * hashCode + ((getPathId() == null) ? 0 : getPathId().hashCode());
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
                + ((getUpdateToken() == null) ? 0 : getUpdateToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProvisionedProductRequest == false)
            return false;
        UpdateProvisionedProductRequest other = (UpdateProvisionedProductRequest) obj;

        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null
                && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
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
        if (other.getUpdateToken() == null ^ this.getUpdateToken() == null)
            return false;
        if (other.getUpdateToken() != null
                && other.getUpdateToken().equals(this.getUpdateToken()) == false)
            return false;
        return true;
    }
}
