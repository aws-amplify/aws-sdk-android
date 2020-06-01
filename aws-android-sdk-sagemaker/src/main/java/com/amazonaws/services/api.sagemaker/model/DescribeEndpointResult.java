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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

public class DescribeEndpointResult implements Serializable {
    /**
     * <p>
     * Name of the endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:endpoint/.*<br/>
     */
    private String endpointArn;

    /**
     * <p>
     * The name of the endpoint configuration associated with this endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointConfigName;

    /**
     * <p>
     * An array of <a>ProductionVariantSummary</a> objects, one for each model
     * hosted behind this endpoint.
     * </p>
     */
    private java.util.List<ProductionVariantSummary> productionVariants;

    /**
     * <p/>
     */
    private DataCaptureConfigSummary dataCaptureConfig;

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OutOfService</code>: Endpoint is not available to take incoming
     * requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: <a>UpdateEndpoint</a> or
     * <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SystemUpdating</code>: Endpoint is undergoing maintenance and
     * cannot be updated or deleted or re-scaled until it has completed. This
     * maintenance operation does not change any customer-specified values such
     * as VPC config, KMS encryption, model, instance type, or instance count.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RollingBack</code>: Endpoint fails to scale up or down or change
     * its variant weight and is in the process of rolling back to its previous
     * configuration. Once the rollback completes, endpoint returns to an
     * <code>InService</code> status. This transitional status only applies to
     * an endpoint that has autoscaling enabled and is undergoing variant weight
     * or capacity changes as part of an
     * <a>UpdateEndpointWeightsAndCapacities</a> call or when the
     * <a>UpdateEndpointWeightsAndCapacities</a> operation is called explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code>: Endpoint is available to process incoming
     * requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Endpoint could not be created, updated, or
     * re-scaled. Use <a>DescribeEndpointOutput$FailureReason</a> for
     * information about the failure. <a>DeleteEndpoint</a> is the only
     * operation that can be performed on a failed endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OutOfService, Creating, Updating, SystemUpdating,
     * RollingBack, InService, Deleting, Failed
     */
    private String endpointStatus;

    /**
     * <p>
     * If the status of the endpoint is <code>Failed</code>, the reason why it
     * failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * A timestamp that shows when the endpoint was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * A timestamp that shows when the endpoint was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * Name of the endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         Name of the endpoint.
     *         </p>
     */
    public String getEndpointName() {
        return endpointName;
    }

    /**
     * <p>
     * Name of the endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointName <p>
     *            Name of the endpoint.
     *            </p>
     */
    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * Name of the endpoint.
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
     *            Name of the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointResult withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:endpoint/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the endpoint.
     *         </p>
     */
    public String getEndpointArn() {
        return endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:endpoint/.*<br/>
     *
     * @param endpointArn <p>
     *            The Amazon Resource Name (ARN) of the endpoint.
     *            </p>
     */
    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:endpoint/.*<br/>
     *
     * @param endpointArn <p>
     *            The Amazon Resource Name (ARN) of the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointResult withEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
        return this;
    }

    /**
     * <p>
     * The name of the endpoint configuration associated with this endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the endpoint configuration associated with this
     *         endpoint.
     *         </p>
     */
    public String getEndpointConfigName() {
        return endpointConfigName;
    }

    /**
     * <p>
     * The name of the endpoint configuration associated with this endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointConfigName <p>
     *            The name of the endpoint configuration associated with this
     *            endpoint.
     *            </p>
     */
    public void setEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
    }

    /**
     * <p>
     * The name of the endpoint configuration associated with this endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointConfigName <p>
     *            The name of the endpoint configuration associated with this
     *            endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointResult withEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
        return this;
    }

    /**
     * <p>
     * An array of <a>ProductionVariantSummary</a> objects, one for each model
     * hosted behind this endpoint.
     * </p>
     *
     * @return <p>
     *         An array of <a>ProductionVariantSummary</a> objects, one for each
     *         model hosted behind this endpoint.
     *         </p>
     */
    public java.util.List<ProductionVariantSummary> getProductionVariants() {
        return productionVariants;
    }

    /**
     * <p>
     * An array of <a>ProductionVariantSummary</a> objects, one for each model
     * hosted behind this endpoint.
     * </p>
     *
     * @param productionVariants <p>
     *            An array of <a>ProductionVariantSummary</a> objects, one for
     *            each model hosted behind this endpoint.
     *            </p>
     */
    public void setProductionVariants(
            java.util.Collection<ProductionVariantSummary> productionVariants) {
        if (productionVariants == null) {
            this.productionVariants = null;
            return;
        }

        this.productionVariants = new java.util.ArrayList<ProductionVariantSummary>(
                productionVariants);
    }

    /**
     * <p>
     * An array of <a>ProductionVariantSummary</a> objects, one for each model
     * hosted behind this endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productionVariants <p>
     *            An array of <a>ProductionVariantSummary</a> objects, one for
     *            each model hosted behind this endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointResult withProductionVariants(
            ProductionVariantSummary... productionVariants) {
        if (getProductionVariants() == null) {
            this.productionVariants = new java.util.ArrayList<ProductionVariantSummary>(
                    productionVariants.length);
        }
        for (ProductionVariantSummary value : productionVariants) {
            this.productionVariants.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>ProductionVariantSummary</a> objects, one for each model
     * hosted behind this endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productionVariants <p>
     *            An array of <a>ProductionVariantSummary</a> objects, one for
     *            each model hosted behind this endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointResult withProductionVariants(
            java.util.Collection<ProductionVariantSummary> productionVariants) {
        setProductionVariants(productionVariants);
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public DataCaptureConfigSummary getDataCaptureConfig() {
        return dataCaptureConfig;
    }

    /**
     * <p/>
     *
     * @param dataCaptureConfig <p/>
     */
    public void setDataCaptureConfig(DataCaptureConfigSummary dataCaptureConfig) {
        this.dataCaptureConfig = dataCaptureConfig;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataCaptureConfig <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointResult withDataCaptureConfig(DataCaptureConfigSummary dataCaptureConfig) {
        this.dataCaptureConfig = dataCaptureConfig;
        return this;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OutOfService</code>: Endpoint is not available to take incoming
     * requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: <a>UpdateEndpoint</a> or
     * <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SystemUpdating</code>: Endpoint is undergoing maintenance and
     * cannot be updated or deleted or re-scaled until it has completed. This
     * maintenance operation does not change any customer-specified values such
     * as VPC config, KMS encryption, model, instance type, or instance count.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RollingBack</code>: Endpoint fails to scale up or down or change
     * its variant weight and is in the process of rolling back to its previous
     * configuration. Once the rollback completes, endpoint returns to an
     * <code>InService</code> status. This transitional status only applies to
     * an endpoint that has autoscaling enabled and is undergoing variant weight
     * or capacity changes as part of an
     * <a>UpdateEndpointWeightsAndCapacities</a> call or when the
     * <a>UpdateEndpointWeightsAndCapacities</a> operation is called explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code>: Endpoint is available to process incoming
     * requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Endpoint could not be created, updated, or
     * re-scaled. Use <a>DescribeEndpointOutput$FailureReason</a> for
     * information about the failure. <a>DeleteEndpoint</a> is the only
     * operation that can be performed on a failed endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OutOfService, Creating, Updating, SystemUpdating,
     * RollingBack, InService, Deleting, Failed
     *
     * @return <p>
     *         The status of the endpoint.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>OutOfService</code>: Endpoint is not available to take
     *         incoming requests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Updating</code>: <a>UpdateEndpoint</a> or
     *         <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SystemUpdating</code>: Endpoint is undergoing maintenance
     *         and cannot be updated or deleted or re-scaled until it has
     *         completed. This maintenance operation does not change any
     *         customer-specified values such as VPC config, KMS encryption,
     *         model, instance type, or instance count.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RollingBack</code>: Endpoint fails to scale up or down or
     *         change its variant weight and is in the process of rolling back
     *         to its previous configuration. Once the rollback completes,
     *         endpoint returns to an <code>InService</code> status. This
     *         transitional status only applies to an endpoint that has
     *         autoscaling enabled and is undergoing variant weight or capacity
     *         changes as part of an <a>UpdateEndpointWeightsAndCapacities</a>
     *         call or when the <a>UpdateEndpointWeightsAndCapacities</a>
     *         operation is called explicitly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InService</code>: Endpoint is available to process incoming
     *         requests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code>: Endpoint could not be created, updated, or
     *         re-scaled. Use <a>DescribeEndpointOutput$FailureReason</a> for
     *         information about the failure. <a>DeleteEndpoint</a> is the only
     *         operation that can be performed on a failed endpoint.
     *         </p>
     *         </li>
     *         </ul>
     * @see EndpointStatus
     */
    public String getEndpointStatus() {
        return endpointStatus;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OutOfService</code>: Endpoint is not available to take incoming
     * requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: <a>UpdateEndpoint</a> or
     * <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SystemUpdating</code>: Endpoint is undergoing maintenance and
     * cannot be updated or deleted or re-scaled until it has completed. This
     * maintenance operation does not change any customer-specified values such
     * as VPC config, KMS encryption, model, instance type, or instance count.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RollingBack</code>: Endpoint fails to scale up or down or change
     * its variant weight and is in the process of rolling back to its previous
     * configuration. Once the rollback completes, endpoint returns to an
     * <code>InService</code> status. This transitional status only applies to
     * an endpoint that has autoscaling enabled and is undergoing variant weight
     * or capacity changes as part of an
     * <a>UpdateEndpointWeightsAndCapacities</a> call or when the
     * <a>UpdateEndpointWeightsAndCapacities</a> operation is called explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code>: Endpoint is available to process incoming
     * requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Endpoint could not be created, updated, or
     * re-scaled. Use <a>DescribeEndpointOutput$FailureReason</a> for
     * information about the failure. <a>DeleteEndpoint</a> is the only
     * operation that can be performed on a failed endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OutOfService, Creating, Updating, SystemUpdating,
     * RollingBack, InService, Deleting, Failed
     *
     * @param endpointStatus <p>
     *            The status of the endpoint.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>OutOfService</code>: Endpoint is not available to take
     *            incoming requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Updating</code>: <a>UpdateEndpoint</a> or
     *            <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SystemUpdating</code>: Endpoint is undergoing
     *            maintenance and cannot be updated or deleted or re-scaled
     *            until it has completed. This maintenance operation does not
     *            change any customer-specified values such as VPC config, KMS
     *            encryption, model, instance type, or instance count.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RollingBack</code>: Endpoint fails to scale up or down
     *            or change its variant weight and is in the process of rolling
     *            back to its previous configuration. Once the rollback
     *            completes, endpoint returns to an <code>InService</code>
     *            status. This transitional status only applies to an endpoint
     *            that has autoscaling enabled and is undergoing variant weight
     *            or capacity changes as part of an
     *            <a>UpdateEndpointWeightsAndCapacities</a> call or when the
     *            <a>UpdateEndpointWeightsAndCapacities</a> operation is called
     *            explicitly.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InService</code>: Endpoint is available to process
     *            incoming requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code>: Endpoint could not be created, updated,
     *            or re-scaled. Use <a>DescribeEndpointOutput$FailureReason</a>
     *            for information about the failure. <a>DeleteEndpoint</a> is
     *            the only operation that can be performed on a failed endpoint.
     *            </p>
     *            </li>
     *            </ul>
     * @see EndpointStatus
     */
    public void setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OutOfService</code>: Endpoint is not available to take incoming
     * requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: <a>UpdateEndpoint</a> or
     * <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SystemUpdating</code>: Endpoint is undergoing maintenance and
     * cannot be updated or deleted or re-scaled until it has completed. This
     * maintenance operation does not change any customer-specified values such
     * as VPC config, KMS encryption, model, instance type, or instance count.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RollingBack</code>: Endpoint fails to scale up or down or change
     * its variant weight and is in the process of rolling back to its previous
     * configuration. Once the rollback completes, endpoint returns to an
     * <code>InService</code> status. This transitional status only applies to
     * an endpoint that has autoscaling enabled and is undergoing variant weight
     * or capacity changes as part of an
     * <a>UpdateEndpointWeightsAndCapacities</a> call or when the
     * <a>UpdateEndpointWeightsAndCapacities</a> operation is called explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code>: Endpoint is available to process incoming
     * requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Endpoint could not be created, updated, or
     * re-scaled. Use <a>DescribeEndpointOutput$FailureReason</a> for
     * information about the failure. <a>DeleteEndpoint</a> is the only
     * operation that can be performed on a failed endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OutOfService, Creating, Updating, SystemUpdating,
     * RollingBack, InService, Deleting, Failed
     *
     * @param endpointStatus <p>
     *            The status of the endpoint.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>OutOfService</code>: Endpoint is not available to take
     *            incoming requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Updating</code>: <a>UpdateEndpoint</a> or
     *            <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SystemUpdating</code>: Endpoint is undergoing
     *            maintenance and cannot be updated or deleted or re-scaled
     *            until it has completed. This maintenance operation does not
     *            change any customer-specified values such as VPC config, KMS
     *            encryption, model, instance type, or instance count.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RollingBack</code>: Endpoint fails to scale up or down
     *            or change its variant weight and is in the process of rolling
     *            back to its previous configuration. Once the rollback
     *            completes, endpoint returns to an <code>InService</code>
     *            status. This transitional status only applies to an endpoint
     *            that has autoscaling enabled and is undergoing variant weight
     *            or capacity changes as part of an
     *            <a>UpdateEndpointWeightsAndCapacities</a> call or when the
     *            <a>UpdateEndpointWeightsAndCapacities</a> operation is called
     *            explicitly.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InService</code>: Endpoint is available to process
     *            incoming requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code>: Endpoint could not be created, updated,
     *            or re-scaled. Use <a>DescribeEndpointOutput$FailureReason</a>
     *            for information about the failure. <a>DeleteEndpoint</a> is
     *            the only operation that can be performed on a failed endpoint.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndpointStatus
     */
    public DescribeEndpointResult withEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
        return this;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OutOfService</code>: Endpoint is not available to take incoming
     * requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: <a>UpdateEndpoint</a> or
     * <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SystemUpdating</code>: Endpoint is undergoing maintenance and
     * cannot be updated or deleted or re-scaled until it has completed. This
     * maintenance operation does not change any customer-specified values such
     * as VPC config, KMS encryption, model, instance type, or instance count.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RollingBack</code>: Endpoint fails to scale up or down or change
     * its variant weight and is in the process of rolling back to its previous
     * configuration. Once the rollback completes, endpoint returns to an
     * <code>InService</code> status. This transitional status only applies to
     * an endpoint that has autoscaling enabled and is undergoing variant weight
     * or capacity changes as part of an
     * <a>UpdateEndpointWeightsAndCapacities</a> call or when the
     * <a>UpdateEndpointWeightsAndCapacities</a> operation is called explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code>: Endpoint is available to process incoming
     * requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Endpoint could not be created, updated, or
     * re-scaled. Use <a>DescribeEndpointOutput$FailureReason</a> for
     * information about the failure. <a>DeleteEndpoint</a> is the only
     * operation that can be performed on a failed endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OutOfService, Creating, Updating, SystemUpdating,
     * RollingBack, InService, Deleting, Failed
     *
     * @param endpointStatus <p>
     *            The status of the endpoint.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>OutOfService</code>: Endpoint is not available to take
     *            incoming requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Updating</code>: <a>UpdateEndpoint</a> or
     *            <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SystemUpdating</code>: Endpoint is undergoing
     *            maintenance and cannot be updated or deleted or re-scaled
     *            until it has completed. This maintenance operation does not
     *            change any customer-specified values such as VPC config, KMS
     *            encryption, model, instance type, or instance count.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RollingBack</code>: Endpoint fails to scale up or down
     *            or change its variant weight and is in the process of rolling
     *            back to its previous configuration. Once the rollback
     *            completes, endpoint returns to an <code>InService</code>
     *            status. This transitional status only applies to an endpoint
     *            that has autoscaling enabled and is undergoing variant weight
     *            or capacity changes as part of an
     *            <a>UpdateEndpointWeightsAndCapacities</a> call or when the
     *            <a>UpdateEndpointWeightsAndCapacities</a> operation is called
     *            explicitly.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InService</code>: Endpoint is available to process
     *            incoming requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code>: Endpoint could not be created, updated,
     *            or re-scaled. Use <a>DescribeEndpointOutput$FailureReason</a>
     *            for information about the failure. <a>DeleteEndpoint</a> is
     *            the only operation that can be performed on a failed endpoint.
     *            </p>
     *            </li>
     *            </ul>
     * @see EndpointStatus
     */
    public void setEndpointStatus(EndpointStatus endpointStatus) {
        this.endpointStatus = endpointStatus.toString();
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OutOfService</code>: Endpoint is not available to take incoming
     * requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: <a>UpdateEndpoint</a> or
     * <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SystemUpdating</code>: Endpoint is undergoing maintenance and
     * cannot be updated or deleted or re-scaled until it has completed. This
     * maintenance operation does not change any customer-specified values such
     * as VPC config, KMS encryption, model, instance type, or instance count.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RollingBack</code>: Endpoint fails to scale up or down or change
     * its variant weight and is in the process of rolling back to its previous
     * configuration. Once the rollback completes, endpoint returns to an
     * <code>InService</code> status. This transitional status only applies to
     * an endpoint that has autoscaling enabled and is undergoing variant weight
     * or capacity changes as part of an
     * <a>UpdateEndpointWeightsAndCapacities</a> call or when the
     * <a>UpdateEndpointWeightsAndCapacities</a> operation is called explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code>: Endpoint is available to process incoming
     * requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Endpoint could not be created, updated, or
     * re-scaled. Use <a>DescribeEndpointOutput$FailureReason</a> for
     * information about the failure. <a>DeleteEndpoint</a> is the only
     * operation that can be performed on a failed endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OutOfService, Creating, Updating, SystemUpdating,
     * RollingBack, InService, Deleting, Failed
     *
     * @param endpointStatus <p>
     *            The status of the endpoint.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>OutOfService</code>: Endpoint is not available to take
     *            incoming requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Updating</code>: <a>UpdateEndpoint</a> or
     *            <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SystemUpdating</code>: Endpoint is undergoing
     *            maintenance and cannot be updated or deleted or re-scaled
     *            until it has completed. This maintenance operation does not
     *            change any customer-specified values such as VPC config, KMS
     *            encryption, model, instance type, or instance count.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RollingBack</code>: Endpoint fails to scale up or down
     *            or change its variant weight and is in the process of rolling
     *            back to its previous configuration. Once the rollback
     *            completes, endpoint returns to an <code>InService</code>
     *            status. This transitional status only applies to an endpoint
     *            that has autoscaling enabled and is undergoing variant weight
     *            or capacity changes as part of an
     *            <a>UpdateEndpointWeightsAndCapacities</a> call or when the
     *            <a>UpdateEndpointWeightsAndCapacities</a> operation is called
     *            explicitly.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InService</code>: Endpoint is available to process
     *            incoming requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code>: Endpoint could not be created, updated,
     *            or re-scaled. Use <a>DescribeEndpointOutput$FailureReason</a>
     *            for information about the failure. <a>DeleteEndpoint</a> is
     *            the only operation that can be performed on a failed endpoint.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndpointStatus
     */
    public DescribeEndpointResult withEndpointStatus(EndpointStatus endpointStatus) {
        this.endpointStatus = endpointStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the status of the endpoint is <code>Failed</code>, the reason why it
     * failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         If the status of the endpoint is <code>Failed</code>, the reason
     *         why it failed.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If the status of the endpoint is <code>Failed</code>, the reason why it
     * failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            If the status of the endpoint is <code>Failed</code>, the
     *            reason why it failed.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the status of the endpoint is <code>Failed</code>, the reason why it
     * failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            If the status of the endpoint is <code>Failed</code>, the
     *            reason why it failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointResult withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the endpoint was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint was created.
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp that shows when the endpoint was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp that shows when the endpoint was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint was last modified.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the endpoint was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            A timestamp that shows when the endpoint was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            A timestamp that shows when the endpoint was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
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
        if (getEndpointArn() != null)
            sb.append("EndpointArn: " + getEndpointArn() + ",");
        if (getEndpointConfigName() != null)
            sb.append("EndpointConfigName: " + getEndpointConfigName() + ",");
        if (getProductionVariants() != null)
            sb.append("ProductionVariants: " + getProductionVariants() + ",");
        if (getDataCaptureConfig() != null)
            sb.append("DataCaptureConfig: " + getDataCaptureConfig() + ",");
        if (getEndpointStatus() != null)
            sb.append("EndpointStatus: " + getEndpointStatus() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointConfigName() == null) ? 0 : getEndpointConfigName().hashCode());
        hashCode = prime * hashCode
                + ((getProductionVariants() == null) ? 0 : getProductionVariants().hashCode());
        hashCode = prime * hashCode
                + ((getDataCaptureConfig() == null) ? 0 : getDataCaptureConfig().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointStatus() == null) ? 0 : getEndpointStatus().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEndpointResult == false)
            return false;
        DescribeEndpointResult other = (DescribeEndpointResult) obj;

        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null
                && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null
                && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getEndpointConfigName() == null ^ this.getEndpointConfigName() == null)
            return false;
        if (other.getEndpointConfigName() != null
                && other.getEndpointConfigName().equals(this.getEndpointConfigName()) == false)
            return false;
        if (other.getProductionVariants() == null ^ this.getProductionVariants() == null)
            return false;
        if (other.getProductionVariants() != null
                && other.getProductionVariants().equals(this.getProductionVariants()) == false)
            return false;
        if (other.getDataCaptureConfig() == null ^ this.getDataCaptureConfig() == null)
            return false;
        if (other.getDataCaptureConfig() != null
                && other.getDataCaptureConfig().equals(this.getDataCaptureConfig()) == false)
            return false;
        if (other.getEndpointStatus() == null ^ this.getEndpointStatus() == null)
            return false;
        if (other.getEndpointStatus() != null
                && other.getEndpointStatus().equals(this.getEndpointStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }
}
