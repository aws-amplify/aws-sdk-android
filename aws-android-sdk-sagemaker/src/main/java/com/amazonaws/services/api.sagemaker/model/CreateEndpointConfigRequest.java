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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an endpoint configuration that Amazon SageMaker hosting services uses
 * to deploy models. In the configuration, you identify one or more models,
 * created using the <code>CreateModel</code> API, to deploy and the resources
 * that you want Amazon SageMaker to provision. Then you call the
 * <a>CreateEndpoint</a> API.
 * </p>
 * <note>
 * <p>
 * Use this API if you want to use Amazon SageMaker hosting services to deploy
 * models into production.
 * </p>
 * </note>
 * <p>
 * In the request, you define a <code>ProductionVariant</code>, for each model
 * that you want to deploy. Each <code>ProductionVariant</code> parameter also
 * describes the resources that you want Amazon SageMaker to provision. This
 * includes the number and type of ML compute instances to deploy.
 * </p>
 * <p>
 * If you are hosting multiple models, you also assign a
 * <code>VariantWeight</code> to specify how much traffic you want to allocate
 * to each model. For example, suppose that you want to host two models, A and
 * B, and you assign traffic weight 2 for model A and 1 for model B. Amazon
 * SageMaker distributes two-thirds of the traffic to Model A, and one-third to
 * model B.
 * </p>
 * <p>
 * For an example that calls this method when deploying a model to Amazon
 * SageMaker hosting services, see <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto"
 * >Deploy the Model to Amazon SageMaker Hosting Services (AWS SDK for Python
 * (Boto 3)).</a>
 * </p>
 * <note>
 * <p>
 * When you call <a>CreateEndpoint</a>, a load call is made to DynamoDB to
 * verify that your endpoint configuration exists. When you read data from a
 * DynamoDB table supporting <a href=
 * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadConsistency.html"
 * > <code>Eventually Consistent Reads</code> </a>, the response might not
 * reflect the results of a recently completed write operation. The response
 * might include some stale data. If the dependent entities are not yet in
 * DynamoDB, this causes a validation error. If you repeat your read request
 * after a short time, the response should return the latest data. So retry
 * logic is recommended to handle these possible issues. We also recommend that
 * customers call <a>DescribeEndpointConfig</a> before calling
 * <a>CreateEndpoint</a> to minimize the potential impact of a DynamoDB
 * eventually consistent read.
 * </p>
 * </note>
 */
public class CreateEndpointConfigRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the endpoint configuration. You specify this name in a
     * <a>CreateEndpoint</a> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointConfigName;

    /**
     * <p>
     * An list of <code>ProductionVariant</code> objects, one for each model
     * that you want to host at this endpoint.
     * </p>
     */
    private java.util.List<ProductionVariant> productionVariants;

    /**
     * <p/>
     */
    private DataCaptureConfig dataCaptureConfig;

    /**
     * <p>
     * A list of key-value pairs. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost
     * Management User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a AWS Key Management Service key that
     * Amazon SageMaker uses to encrypt data on the storage volume attached to
     * the ML compute instance that hosts the endpoint.
     * </p>
     * <p>
     * The KmsKeyId can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name ARN:
     * <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify
     * in your <code>CreateEndpoint</code>, <code>UpdateEndpoint</code>
     * requests. For more information, refer to the AWS Key Management Service
     * section<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * > Using Key Policies in AWS KMS </a>
     * </p>
     * <note>
     * <p>
     * Certain Nitro-based instances include local storage, dependent on the
     * instance type. Local storage volumes are encrypted using a hardware
     * module on the instance. You can't request a <code>KmsKeyId</code> when
     * using an instance type with local storage. If any of the models that you
     * specify in the <code>ProductionVariants</code> parameter use nitro-based
     * instances with local storage, do not specify a value for the
     * <code>KmsKeyId</code> parameter. If you specify a value for
     * <code>KmsKeyId</code> when using any nitro-based instances with local
     * storage, the call to <code>CreateEndpointConfig</code> fails.
     * </p>
     * <p>
     * For a list of instance types that support local instance storage, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     * >Instance Store Volumes</a>.
     * </p>
     * <p>
     * For more information about local instance storage encryption, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html"
     * >SSD Instance Store Volumes</a>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The name of the endpoint configuration. You specify this name in a
     * <a>CreateEndpoint</a> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the endpoint configuration. You specify this name in
     *         a <a>CreateEndpoint</a> request.
     *         </p>
     */
    public String getEndpointConfigName() {
        return endpointConfigName;
    }

    /**
     * <p>
     * The name of the endpoint configuration. You specify this name in a
     * <a>CreateEndpoint</a> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointConfigName <p>
     *            The name of the endpoint configuration. You specify this name
     *            in a <a>CreateEndpoint</a> request.
     *            </p>
     */
    public void setEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
    }

    /**
     * <p>
     * The name of the endpoint configuration. You specify this name in a
     * <a>CreateEndpoint</a> request.
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
     *            The name of the endpoint configuration. You specify this name
     *            in a <a>CreateEndpoint</a> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEndpointConfigRequest withEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
        return this;
    }

    /**
     * <p>
     * An list of <code>ProductionVariant</code> objects, one for each model
     * that you want to host at this endpoint.
     * </p>
     *
     * @return <p>
     *         An list of <code>ProductionVariant</code> objects, one for each
     *         model that you want to host at this endpoint.
     *         </p>
     */
    public java.util.List<ProductionVariant> getProductionVariants() {
        return productionVariants;
    }

    /**
     * <p>
     * An list of <code>ProductionVariant</code> objects, one for each model
     * that you want to host at this endpoint.
     * </p>
     *
     * @param productionVariants <p>
     *            An list of <code>ProductionVariant</code> objects, one for
     *            each model that you want to host at this endpoint.
     *            </p>
     */
    public void setProductionVariants(java.util.Collection<ProductionVariant> productionVariants) {
        if (productionVariants == null) {
            this.productionVariants = null;
            return;
        }

        this.productionVariants = new java.util.ArrayList<ProductionVariant>(productionVariants);
    }

    /**
     * <p>
     * An list of <code>ProductionVariant</code> objects, one for each model
     * that you want to host at this endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productionVariants <p>
     *            An list of <code>ProductionVariant</code> objects, one for
     *            each model that you want to host at this endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEndpointConfigRequest withProductionVariants(
            ProductionVariant... productionVariants) {
        if (getProductionVariants() == null) {
            this.productionVariants = new java.util.ArrayList<ProductionVariant>(
                    productionVariants.length);
        }
        for (ProductionVariant value : productionVariants) {
            this.productionVariants.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An list of <code>ProductionVariant</code> objects, one for each model
     * that you want to host at this endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productionVariants <p>
     *            An list of <code>ProductionVariant</code> objects, one for
     *            each model that you want to host at this endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEndpointConfigRequest withProductionVariants(
            java.util.Collection<ProductionVariant> productionVariants) {
        setProductionVariants(productionVariants);
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public DataCaptureConfig getDataCaptureConfig() {
        return dataCaptureConfig;
    }

    /**
     * <p/>
     *
     * @param dataCaptureConfig <p/>
     */
    public void setDataCaptureConfig(DataCaptureConfig dataCaptureConfig) {
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
    public CreateEndpointConfigRequest withDataCaptureConfig(DataCaptureConfig dataCaptureConfig) {
        this.dataCaptureConfig = dataCaptureConfig;
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost
     * Management User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of key-value pairs. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *         >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost
     *         Management User Guide</i>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost
     * Management User Guide</i>.
     * </p>
     *
     * @param tags <p>
     *            A list of key-value pairs. For more information, see <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *            >Using Cost Allocation Tags</a> in the <i> AWS Billing and
     *            Cost Management User Guide</i>.
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
     * A list of key-value pairs. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost
     * Management User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of key-value pairs. For more information, see <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *            >Using Cost Allocation Tags</a> in the <i> AWS Billing and
     *            Cost Management User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEndpointConfigRequest withTags(Tag... tags) {
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
     * A list of key-value pairs. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost
     * Management User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of key-value pairs. For more information, see <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *            >Using Cost Allocation Tags</a> in the <i> AWS Billing and
     *            Cost Management User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEndpointConfigRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a AWS Key Management Service key that
     * Amazon SageMaker uses to encrypt data on the storage volume attached to
     * the ML compute instance that hosts the endpoint.
     * </p>
     * <p>
     * The KmsKeyId can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name ARN:
     * <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify
     * in your <code>CreateEndpoint</code>, <code>UpdateEndpoint</code>
     * requests. For more information, refer to the AWS Key Management Service
     * section<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * > Using Key Policies in AWS KMS </a>
     * </p>
     * <note>
     * <p>
     * Certain Nitro-based instances include local storage, dependent on the
     * instance type. Local storage volumes are encrypted using a hardware
     * module on the instance. You can't request a <code>KmsKeyId</code> when
     * using an instance type with local storage. If any of the models that you
     * specify in the <code>ProductionVariants</code> parameter use nitro-based
     * instances with local storage, do not specify a value for the
     * <code>KmsKeyId</code> parameter. If you specify a value for
     * <code>KmsKeyId</code> when using any nitro-based instances with local
     * storage, the call to <code>CreateEndpointConfig</code> fails.
     * </p>
     * <p>
     * For a list of instance types that support local instance storage, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     * >Instance Store Volumes</a>.
     * </p>
     * <p>
     * For more information about local instance storage encryption, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html"
     * >SSD Instance Store Volumes</a>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of a AWS Key Management Service
     *         key that Amazon SageMaker uses to encrypt data on the storage
     *         volume attached to the ML compute instance that hosts the
     *         endpoint.
     *         </p>
     *         <p>
     *         The KmsKeyId can be any of the following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN:
     *         <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias name: <code>alias/ExampleAlias</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias name ARN:
     *         <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The KMS key policy must grant permission to the IAM role that you
     *         specify in your <code>CreateEndpoint</code>,
     *         <code>UpdateEndpoint</code> requests. For more information, refer
     *         to the AWS Key Management Service section<a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     *         > Using Key Policies in AWS KMS </a>
     *         </p>
     *         <note>
     *         <p>
     *         Certain Nitro-based instances include local storage, dependent on
     *         the instance type. Local storage volumes are encrypted using a
     *         hardware module on the instance. You can't request a
     *         <code>KmsKeyId</code> when using an instance type with local
     *         storage. If any of the models that you specify in the
     *         <code>ProductionVariants</code> parameter use nitro-based
     *         instances with local storage, do not specify a value for the
     *         <code>KmsKeyId</code> parameter. If you specify a value for
     *         <code>KmsKeyId</code> when using any nitro-based instances with
     *         local storage, the call to <code>CreateEndpointConfig</code>
     *         fails.
     *         </p>
     *         <p>
     *         For a list of instance types that support local instance storage,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     *         >Instance Store Volumes</a>.
     *         </p>
     *         <p>
     *         For more information about local instance storage encryption, see
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html"
     *         >SSD Instance Store Volumes</a>.
     *         </p>
     *         </note>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a AWS Key Management Service key that
     * Amazon SageMaker uses to encrypt data on the storage volume attached to
     * the ML compute instance that hosts the endpoint.
     * </p>
     * <p>
     * The KmsKeyId can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name ARN:
     * <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify
     * in your <code>CreateEndpoint</code>, <code>UpdateEndpoint</code>
     * requests. For more information, refer to the AWS Key Management Service
     * section<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * > Using Key Policies in AWS KMS </a>
     * </p>
     * <note>
     * <p>
     * Certain Nitro-based instances include local storage, dependent on the
     * instance type. Local storage volumes are encrypted using a hardware
     * module on the instance. You can't request a <code>KmsKeyId</code> when
     * using an instance type with local storage. If any of the models that you
     * specify in the <code>ProductionVariants</code> parameter use nitro-based
     * instances with local storage, do not specify a value for the
     * <code>KmsKeyId</code> parameter. If you specify a value for
     * <code>KmsKeyId</code> when using any nitro-based instances with local
     * storage, the call to <code>CreateEndpointConfig</code> fails.
     * </p>
     * <p>
     * For a list of instance types that support local instance storage, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     * >Instance Store Volumes</a>.
     * </p>
     * <p>
     * For more information about local instance storage encryption, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html"
     * >SSD Instance Store Volumes</a>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param kmsKeyId <p>
     *            The Amazon Resource Name (ARN) of a AWS Key Management Service
     *            key that Amazon SageMaker uses to encrypt data on the storage
     *            volume attached to the ML compute instance that hosts the
     *            endpoint.
     *            </p>
     *            <p>
     *            The KmsKeyId can be any of the following formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias name: <code>alias/ExampleAlias</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias name ARN:
     *            <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The KMS key policy must grant permission to the IAM role that
     *            you specify in your <code>CreateEndpoint</code>,
     *            <code>UpdateEndpoint</code> requests. For more information,
     *            refer to the AWS Key Management Service section<a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     *            > Using Key Policies in AWS KMS </a>
     *            </p>
     *            <note>
     *            <p>
     *            Certain Nitro-based instances include local storage, dependent
     *            on the instance type. Local storage volumes are encrypted
     *            using a hardware module on the instance. You can't request a
     *            <code>KmsKeyId</code> when using an instance type with local
     *            storage. If any of the models that you specify in the
     *            <code>ProductionVariants</code> parameter use nitro-based
     *            instances with local storage, do not specify a value for the
     *            <code>KmsKeyId</code> parameter. If you specify a value for
     *            <code>KmsKeyId</code> when using any nitro-based instances
     *            with local storage, the call to
     *            <code>CreateEndpointConfig</code> fails.
     *            </p>
     *            <p>
     *            For a list of instance types that support local instance
     *            storage, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     *            >Instance Store Volumes</a>.
     *            </p>
     *            <p>
     *            For more information about local instance storage encryption,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html"
     *            >SSD Instance Store Volumes</a>.
     *            </p>
     *            </note>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a AWS Key Management Service key that
     * Amazon SageMaker uses to encrypt data on the storage volume attached to
     * the ML compute instance that hosts the endpoint.
     * </p>
     * <p>
     * The KmsKeyId can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name ARN:
     * <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify
     * in your <code>CreateEndpoint</code>, <code>UpdateEndpoint</code>
     * requests. For more information, refer to the AWS Key Management Service
     * section<a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * > Using Key Policies in AWS KMS </a>
     * </p>
     * <note>
     * <p>
     * Certain Nitro-based instances include local storage, dependent on the
     * instance type. Local storage volumes are encrypted using a hardware
     * module on the instance. You can't request a <code>KmsKeyId</code> when
     * using an instance type with local storage. If any of the models that you
     * specify in the <code>ProductionVariants</code> parameter use nitro-based
     * instances with local storage, do not specify a value for the
     * <code>KmsKeyId</code> parameter. If you specify a value for
     * <code>KmsKeyId</code> when using any nitro-based instances with local
     * storage, the call to <code>CreateEndpointConfig</code> fails.
     * </p>
     * <p>
     * For a list of instance types that support local instance storage, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     * >Instance Store Volumes</a>.
     * </p>
     * <p>
     * For more information about local instance storage encryption, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html"
     * >SSD Instance Store Volumes</a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param kmsKeyId <p>
     *            The Amazon Resource Name (ARN) of a AWS Key Management Service
     *            key that Amazon SageMaker uses to encrypt data on the storage
     *            volume attached to the ML compute instance that hosts the
     *            endpoint.
     *            </p>
     *            <p>
     *            The KmsKeyId can be any of the following formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias name: <code>alias/ExampleAlias</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias name ARN:
     *            <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The KMS key policy must grant permission to the IAM role that
     *            you specify in your <code>CreateEndpoint</code>,
     *            <code>UpdateEndpoint</code> requests. For more information,
     *            refer to the AWS Key Management Service section<a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     *            > Using Key Policies in AWS KMS </a>
     *            </p>
     *            <note>
     *            <p>
     *            Certain Nitro-based instances include local storage, dependent
     *            on the instance type. Local storage volumes are encrypted
     *            using a hardware module on the instance. You can't request a
     *            <code>KmsKeyId</code> when using an instance type with local
     *            storage. If any of the models that you specify in the
     *            <code>ProductionVariants</code> parameter use nitro-based
     *            instances with local storage, do not specify a value for the
     *            <code>KmsKeyId</code> parameter. If you specify a value for
     *            <code>KmsKeyId</code> when using any nitro-based instances
     *            with local storage, the call to
     *            <code>CreateEndpointConfig</code> fails.
     *            </p>
     *            <p>
     *            For a list of instance types that support local instance
     *            storage, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes"
     *            >Instance Store Volumes</a>.
     *            </p>
     *            <p>
     *            For more information about local instance storage encryption,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html"
     *            >SSD Instance Store Volumes</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEndpointConfigRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
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
        if (getEndpointConfigName() != null)
            sb.append("EndpointConfigName: " + getEndpointConfigName() + ",");
        if (getProductionVariants() != null)
            sb.append("ProductionVariants: " + getProductionVariants() + ",");
        if (getDataCaptureConfig() != null)
            sb.append("DataCaptureConfig: " + getDataCaptureConfig() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointConfigName() == null) ? 0 : getEndpointConfigName().hashCode());
        hashCode = prime * hashCode
                + ((getProductionVariants() == null) ? 0 : getProductionVariants().hashCode());
        hashCode = prime * hashCode
                + ((getDataCaptureConfig() == null) ? 0 : getDataCaptureConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEndpointConfigRequest == false)
            return false;
        CreateEndpointConfigRequest other = (CreateEndpointConfigRequest) obj;

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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }
}
