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
package com.amazonaws.services.application-autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Deregisters an Application Auto Scaling scalable target when you have finished using it. To see which resources have been registered, use <a href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_DescribeScalableTargets.html">DescribeScalableTargets</a>. </p> <note> <p>Deregistering a scalable target deletes the scaling policies and the scheduled actions that are associated with it.</p> </note>
 */
public class DeregisterScalableTargetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The namespace of the AWS service that provides the resource. For a resource provided by your own application or service, use <code>custom-resource</code> instead.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs, elasticmapreduce, ec2, appstream, dynamodb, rds, sagemaker, custom-resource, comprehend, lambda, cassandra
     */
    private String serviceNamespace;

    /**
     * <p>The identifier of the resource associated with the scalable target. This string consists of the resource type and unique identifier.</p> <ul> <li> <p>ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and service name. Example: <code>service/default/sample-webapp</code>.</p> </li> <li> <p>Spot Fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot Fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.</p> </li> <li> <p>EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID and instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.</p> </li> <li> <p>AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name. Example: <code>fleet/sample-fleet</code>.</p> </li> <li> <p>DynamoDB table - The resource type is <code>table</code> and the unique identifier is the table name. Example: <code>table/my-table</code>.</p> </li> <li> <p>DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the index name. Example: <code>table/my-table/index/my-table-index</code>.</p> </li> <li> <p>Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name. Example: <code>cluster:my-db-cluster</code>.</p> </li> <li> <p>Amazon SageMaker endpoint variant - The resource type is <code>variant</code> and the unique identifier is the resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.</p> </li> <li> <p>Custom resources are not supported with a resource type. This parameter must specify the <code>OutputValue</code> from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider. More information is available in our <a href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub repository</a>.</p> </li> <li> <p>Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified using the endpoint ARN. Example: <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>.</p> </li> <li> <p>Lambda provisioned concurrency - The resource type is <code>function</code> and the unique identifier is the function name with a function version or alias name suffix that is not <code>$LATEST</code>. Example: <code>function:my-function:prod</code> or <code>function:my-function:1</code>.</p> </li> <li> <p>Amazon Keyspaces table - The resource type is <code>table</code> and the unique identifier is the table name. Example: <code>keyspace/mykeyspace/table/mytable</code>.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String resourceId;

    /**
     * <p>The scalable dimension associated with the scalable target. This string consists of the service namespace, resource type, and scaling property.</p> <ul> <li> <p> <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.</p> </li> <li> <p> <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.</p> </li> <li> <p> <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.</p> </li> <li> <p> <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.</p> </li> <li> <p> <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.</p> </li> <li> <p> <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model endpoint variant.</p> </li> <li> <p> <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by your own application or service.</p> </li> <li> <p> <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units for an Amazon Comprehend document classification endpoint.</p> </li> <li> <p> <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.</p> </li> <li> <p> <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces table.</p> </li> <li> <p> <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces table.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs:service:DesiredCount, ec2:spot-fleet-request:TargetCapacity, elasticmapreduce:instancegroup:InstanceCount, appstream:fleet:DesiredCapacity, dynamodb:table:ReadCapacityUnits, dynamodb:table:WriteCapacityUnits, dynamodb:index:ReadCapacityUnits, dynamodb:index:WriteCapacityUnits, rds:cluster:ReadReplicaCount, sagemaker:variant:DesiredInstanceCount, custom-resource:ResourceType:Property, comprehend:document-classifier-endpoint:DesiredInferenceUnits, lambda:function:ProvisionedConcurrency, cassandra:table:ReadCapacityUnits, cassandra:table:WriteCapacityUnits
     */
    private String scalableDimension;

    /**
     * <p>The namespace of the AWS service that provides the resource. For a resource provided by your own application or service, use <code>custom-resource</code> instead.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs, elasticmapreduce, ec2, appstream, dynamodb, rds, sagemaker, custom-resource, comprehend, lambda, cassandra
     *
     * @return <p>The namespace of the AWS service that provides the resource. For a resource provided by your own application or service, use <code>custom-resource</code> instead.</p>
     *
     * @see ServiceNamespace
     */
    public String getServiceNamespace() {
        return serviceNamespace;
    }

    /**
     * <p>The namespace of the AWS service that provides the resource. For a resource provided by your own application or service, use <code>custom-resource</code> instead.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs, elasticmapreduce, ec2, appstream, dynamodb, rds, sagemaker, custom-resource, comprehend, lambda, cassandra
     *
     * @param serviceNamespace <p>The namespace of the AWS service that provides the resource. For a resource provided by your own application or service, use <code>custom-resource</code> instead.</p>
     *
     * @see ServiceNamespace
     */
    public void setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * <p>The namespace of the AWS service that provides the resource. For a resource provided by your own application or service, use <code>custom-resource</code> instead.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs, elasticmapreduce, ec2, appstream, dynamodb, rds, sagemaker, custom-resource, comprehend, lambda, cassandra
     *
     * @param serviceNamespace <p>The namespace of the AWS service that provides the resource. For a resource provided by your own application or service, use <code>custom-resource</code> instead.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ServiceNamespace
     */
    public DeregisterScalableTargetRequest withServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
        return this;
    }

    /**
     * <p>The namespace of the AWS service that provides the resource. For a resource provided by your own application or service, use <code>custom-resource</code> instead.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs, elasticmapreduce, ec2, appstream, dynamodb, rds, sagemaker, custom-resource, comprehend, lambda, cassandra
     *
     * @param serviceNamespace <p>The namespace of the AWS service that provides the resource. For a resource provided by your own application or service, use <code>custom-resource</code> instead.</p>
     *
     * @see ServiceNamespace
     */
    public void setServiceNamespace(ServiceNamespace serviceNamespace) {
        this.serviceNamespace = serviceNamespace.toString();
    }

    /**
     * <p>The namespace of the AWS service that provides the resource. For a resource provided by your own application or service, use <code>custom-resource</code> instead.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs, elasticmapreduce, ec2, appstream, dynamodb, rds, sagemaker, custom-resource, comprehend, lambda, cassandra
     *
     * @param serviceNamespace <p>The namespace of the AWS service that provides the resource. For a resource provided by your own application or service, use <code>custom-resource</code> instead.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ServiceNamespace
     */
    public DeregisterScalableTargetRequest withServiceNamespace(ServiceNamespace serviceNamespace) {
        this.serviceNamespace = serviceNamespace.toString();
        return this;
    }

    /**
     * <p>The identifier of the resource associated with the scalable target. This string consists of the resource type and unique identifier.</p> <ul> <li> <p>ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and service name. Example: <code>service/default/sample-webapp</code>.</p> </li> <li> <p>Spot Fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot Fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.</p> </li> <li> <p>EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID and instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.</p> </li> <li> <p>AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name. Example: <code>fleet/sample-fleet</code>.</p> </li> <li> <p>DynamoDB table - The resource type is <code>table</code> and the unique identifier is the table name. Example: <code>table/my-table</code>.</p> </li> <li> <p>DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the index name. Example: <code>table/my-table/index/my-table-index</code>.</p> </li> <li> <p>Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name. Example: <code>cluster:my-db-cluster</code>.</p> </li> <li> <p>Amazon SageMaker endpoint variant - The resource type is <code>variant</code> and the unique identifier is the resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.</p> </li> <li> <p>Custom resources are not supported with a resource type. This parameter must specify the <code>OutputValue</code> from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider. More information is available in our <a href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub repository</a>.</p> </li> <li> <p>Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified using the endpoint ARN. Example: <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>.</p> </li> <li> <p>Lambda provisioned concurrency - The resource type is <code>function</code> and the unique identifier is the function name with a function version or alias name suffix that is not <code>$LATEST</code>. Example: <code>function:my-function:prod</code> or <code>function:my-function:1</code>.</p> </li> <li> <p>Amazon Keyspaces table - The resource type is <code>table</code> and the unique identifier is the table name. Example: <code>keyspace/mykeyspace/table/mytable</code>.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return <p>The identifier of the resource associated with the scalable target. This string consists of the resource type and unique identifier.</p> <ul> <li> <p>ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and service name. Example: <code>service/default/sample-webapp</code>.</p> </li> <li> <p>Spot Fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot Fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.</p> </li> <li> <p>EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID and instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.</p> </li> <li> <p>AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name. Example: <code>fleet/sample-fleet</code>.</p> </li> <li> <p>DynamoDB table - The resource type is <code>table</code> and the unique identifier is the table name. Example: <code>table/my-table</code>.</p> </li> <li> <p>DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the index name. Example: <code>table/my-table/index/my-table-index</code>.</p> </li> <li> <p>Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name. Example: <code>cluster:my-db-cluster</code>.</p> </li> <li> <p>Amazon SageMaker endpoint variant - The resource type is <code>variant</code> and the unique identifier is the resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.</p> </li> <li> <p>Custom resources are not supported with a resource type. This parameter must specify the <code>OutputValue</code> from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider. More information is available in our <a href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub repository</a>.</p> </li> <li> <p>Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified using the endpoint ARN. Example: <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>.</p> </li> <li> <p>Lambda provisioned concurrency - The resource type is <code>function</code> and the unique identifier is the function name with a function version or alias name suffix that is not <code>$LATEST</code>. Example: <code>function:my-function:prod</code> or <code>function:my-function:1</code>.</p> </li> <li> <p>Amazon Keyspaces table - The resource type is <code>table</code> and the unique identifier is the table name. Example: <code>keyspace/mykeyspace/table/mytable</code>.</p> </li> </ul>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>The identifier of the resource associated with the scalable target. This string consists of the resource type and unique identifier.</p> <ul> <li> <p>ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and service name. Example: <code>service/default/sample-webapp</code>.</p> </li> <li> <p>Spot Fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot Fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.</p> </li> <li> <p>EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID and instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.</p> </li> <li> <p>AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name. Example: <code>fleet/sample-fleet</code>.</p> </li> <li> <p>DynamoDB table - The resource type is <code>table</code> and the unique identifier is the table name. Example: <code>table/my-table</code>.</p> </li> <li> <p>DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the index name. Example: <code>table/my-table/index/my-table-index</code>.</p> </li> <li> <p>Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name. Example: <code>cluster:my-db-cluster</code>.</p> </li> <li> <p>Amazon SageMaker endpoint variant - The resource type is <code>variant</code> and the unique identifier is the resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.</p> </li> <li> <p>Custom resources are not supported with a resource type. This parameter must specify the <code>OutputValue</code> from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider. More information is available in our <a href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub repository</a>.</p> </li> <li> <p>Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified using the endpoint ARN. Example: <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>.</p> </li> <li> <p>Lambda provisioned concurrency - The resource type is <code>function</code> and the unique identifier is the function name with a function version or alias name suffix that is not <code>$LATEST</code>. Example: <code>function:my-function:prod</code> or <code>function:my-function:1</code>.</p> </li> <li> <p>Amazon Keyspaces table - The resource type is <code>table</code> and the unique identifier is the table name. Example: <code>keyspace/mykeyspace/table/mytable</code>.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param resourceId <p>The identifier of the resource associated with the scalable target. This string consists of the resource type and unique identifier.</p> <ul> <li> <p>ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and service name. Example: <code>service/default/sample-webapp</code>.</p> </li> <li> <p>Spot Fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot Fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.</p> </li> <li> <p>EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID and instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.</p> </li> <li> <p>AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name. Example: <code>fleet/sample-fleet</code>.</p> </li> <li> <p>DynamoDB table - The resource type is <code>table</code> and the unique identifier is the table name. Example: <code>table/my-table</code>.</p> </li> <li> <p>DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the index name. Example: <code>table/my-table/index/my-table-index</code>.</p> </li> <li> <p>Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name. Example: <code>cluster:my-db-cluster</code>.</p> </li> <li> <p>Amazon SageMaker endpoint variant - The resource type is <code>variant</code> and the unique identifier is the resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.</p> </li> <li> <p>Custom resources are not supported with a resource type. This parameter must specify the <code>OutputValue</code> from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider. More information is available in our <a href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub repository</a>.</p> </li> <li> <p>Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified using the endpoint ARN. Example: <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>.</p> </li> <li> <p>Lambda provisioned concurrency - The resource type is <code>function</code> and the unique identifier is the function name with a function version or alias name suffix that is not <code>$LATEST</code>. Example: <code>function:my-function:prod</code> or <code>function:my-function:1</code>.</p> </li> <li> <p>Amazon Keyspaces table - The resource type is <code>table</code> and the unique identifier is the table name. Example: <code>keyspace/mykeyspace/table/mytable</code>.</p> </li> </ul>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>The identifier of the resource associated with the scalable target. This string consists of the resource type and unique identifier.</p> <ul> <li> <p>ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and service name. Example: <code>service/default/sample-webapp</code>.</p> </li> <li> <p>Spot Fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot Fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.</p> </li> <li> <p>EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID and instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.</p> </li> <li> <p>AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name. Example: <code>fleet/sample-fleet</code>.</p> </li> <li> <p>DynamoDB table - The resource type is <code>table</code> and the unique identifier is the table name. Example: <code>table/my-table</code>.</p> </li> <li> <p>DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the index name. Example: <code>table/my-table/index/my-table-index</code>.</p> </li> <li> <p>Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name. Example: <code>cluster:my-db-cluster</code>.</p> </li> <li> <p>Amazon SageMaker endpoint variant - The resource type is <code>variant</code> and the unique identifier is the resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.</p> </li> <li> <p>Custom resources are not supported with a resource type. This parameter must specify the <code>OutputValue</code> from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider. More information is available in our <a href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub repository</a>.</p> </li> <li> <p>Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified using the endpoint ARN. Example: <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>.</p> </li> <li> <p>Lambda provisioned concurrency - The resource type is <code>function</code> and the unique identifier is the function name with a function version or alias name suffix that is not <code>$LATEST</code>. Example: <code>function:my-function:prod</code> or <code>function:my-function:1</code>.</p> </li> <li> <p>Amazon Keyspaces table - The resource type is <code>table</code> and the unique identifier is the table name. Example: <code>keyspace/mykeyspace/table/mytable</code>.</p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param resourceId <p>The identifier of the resource associated with the scalable target. This string consists of the resource type and unique identifier.</p> <ul> <li> <p>ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and service name. Example: <code>service/default/sample-webapp</code>.</p> </li> <li> <p>Spot Fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot Fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.</p> </li> <li> <p>EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID and instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.</p> </li> <li> <p>AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name. Example: <code>fleet/sample-fleet</code>.</p> </li> <li> <p>DynamoDB table - The resource type is <code>table</code> and the unique identifier is the table name. Example: <code>table/my-table</code>.</p> </li> <li> <p>DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the index name. Example: <code>table/my-table/index/my-table-index</code>.</p> </li> <li> <p>Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name. Example: <code>cluster:my-db-cluster</code>.</p> </li> <li> <p>Amazon SageMaker endpoint variant - The resource type is <code>variant</code> and the unique identifier is the resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.</p> </li> <li> <p>Custom resources are not supported with a resource type. This parameter must specify the <code>OutputValue</code> from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider. More information is available in our <a href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub repository</a>.</p> </li> <li> <p>Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified using the endpoint ARN. Example: <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>.</p> </li> <li> <p>Lambda provisioned concurrency - The resource type is <code>function</code> and the unique identifier is the function name with a function version or alias name suffix that is not <code>$LATEST</code>. Example: <code>function:my-function:prod</code> or <code>function:my-function:1</code>.</p> </li> <li> <p>Amazon Keyspaces table - The resource type is <code>table</code> and the unique identifier is the table name. Example: <code>keyspace/mykeyspace/table/mytable</code>.</p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeregisterScalableTargetRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>The scalable dimension associated with the scalable target. This string consists of the service namespace, resource type, and scaling property.</p> <ul> <li> <p> <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.</p> </li> <li> <p> <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.</p> </li> <li> <p> <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.</p> </li> <li> <p> <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.</p> </li> <li> <p> <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.</p> </li> <li> <p> <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model endpoint variant.</p> </li> <li> <p> <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by your own application or service.</p> </li> <li> <p> <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units for an Amazon Comprehend document classification endpoint.</p> </li> <li> <p> <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.</p> </li> <li> <p> <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces table.</p> </li> <li> <p> <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces table.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs:service:DesiredCount, ec2:spot-fleet-request:TargetCapacity, elasticmapreduce:instancegroup:InstanceCount, appstream:fleet:DesiredCapacity, dynamodb:table:ReadCapacityUnits, dynamodb:table:WriteCapacityUnits, dynamodb:index:ReadCapacityUnits, dynamodb:index:WriteCapacityUnits, rds:cluster:ReadReplicaCount, sagemaker:variant:DesiredInstanceCount, custom-resource:ResourceType:Property, comprehend:document-classifier-endpoint:DesiredInferenceUnits, lambda:function:ProvisionedConcurrency, cassandra:table:ReadCapacityUnits, cassandra:table:WriteCapacityUnits
     *
     * @return <p>The scalable dimension associated with the scalable target. This string consists of the service namespace, resource type, and scaling property.</p> <ul> <li> <p> <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.</p> </li> <li> <p> <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.</p> </li> <li> <p> <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.</p> </li> <li> <p> <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.</p> </li> <li> <p> <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.</p> </li> <li> <p> <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model endpoint variant.</p> </li> <li> <p> <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by your own application or service.</p> </li> <li> <p> <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units for an Amazon Comprehend document classification endpoint.</p> </li> <li> <p> <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.</p> </li> <li> <p> <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces table.</p> </li> <li> <p> <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces table.</p> </li> </ul>
     *
     * @see ScalableDimension
     */
    public String getScalableDimension() {
        return scalableDimension;
    }

    /**
     * <p>The scalable dimension associated with the scalable target. This string consists of the service namespace, resource type, and scaling property.</p> <ul> <li> <p> <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.</p> </li> <li> <p> <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.</p> </li> <li> <p> <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.</p> </li> <li> <p> <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.</p> </li> <li> <p> <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.</p> </li> <li> <p> <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model endpoint variant.</p> </li> <li> <p> <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by your own application or service.</p> </li> <li> <p> <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units for an Amazon Comprehend document classification endpoint.</p> </li> <li> <p> <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.</p> </li> <li> <p> <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces table.</p> </li> <li> <p> <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces table.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs:service:DesiredCount, ec2:spot-fleet-request:TargetCapacity, elasticmapreduce:instancegroup:InstanceCount, appstream:fleet:DesiredCapacity, dynamodb:table:ReadCapacityUnits, dynamodb:table:WriteCapacityUnits, dynamodb:index:ReadCapacityUnits, dynamodb:index:WriteCapacityUnits, rds:cluster:ReadReplicaCount, sagemaker:variant:DesiredInstanceCount, custom-resource:ResourceType:Property, comprehend:document-classifier-endpoint:DesiredInferenceUnits, lambda:function:ProvisionedConcurrency, cassandra:table:ReadCapacityUnits, cassandra:table:WriteCapacityUnits
     *
     * @param scalableDimension <p>The scalable dimension associated with the scalable target. This string consists of the service namespace, resource type, and scaling property.</p> <ul> <li> <p> <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.</p> </li> <li> <p> <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.</p> </li> <li> <p> <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.</p> </li> <li> <p> <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.</p> </li> <li> <p> <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.</p> </li> <li> <p> <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model endpoint variant.</p> </li> <li> <p> <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by your own application or service.</p> </li> <li> <p> <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units for an Amazon Comprehend document classification endpoint.</p> </li> <li> <p> <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.</p> </li> <li> <p> <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces table.</p> </li> <li> <p> <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces table.</p> </li> </ul>
     *
     * @see ScalableDimension
     */
    public void setScalableDimension(String scalableDimension) {
        this.scalableDimension = scalableDimension;
    }

    /**
     * <p>The scalable dimension associated with the scalable target. This string consists of the service namespace, resource type, and scaling property.</p> <ul> <li> <p> <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.</p> </li> <li> <p> <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.</p> </li> <li> <p> <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.</p> </li> <li> <p> <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.</p> </li> <li> <p> <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.</p> </li> <li> <p> <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model endpoint variant.</p> </li> <li> <p> <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by your own application or service.</p> </li> <li> <p> <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units for an Amazon Comprehend document classification endpoint.</p> </li> <li> <p> <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.</p> </li> <li> <p> <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces table.</p> </li> <li> <p> <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces table.</p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs:service:DesiredCount, ec2:spot-fleet-request:TargetCapacity, elasticmapreduce:instancegroup:InstanceCount, appstream:fleet:DesiredCapacity, dynamodb:table:ReadCapacityUnits, dynamodb:table:WriteCapacityUnits, dynamodb:index:ReadCapacityUnits, dynamodb:index:WriteCapacityUnits, rds:cluster:ReadReplicaCount, sagemaker:variant:DesiredInstanceCount, custom-resource:ResourceType:Property, comprehend:document-classifier-endpoint:DesiredInferenceUnits, lambda:function:ProvisionedConcurrency, cassandra:table:ReadCapacityUnits, cassandra:table:WriteCapacityUnits
     *
     * @param scalableDimension <p>The scalable dimension associated with the scalable target. This string consists of the service namespace, resource type, and scaling property.</p> <ul> <li> <p> <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.</p> </li> <li> <p> <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.</p> </li> <li> <p> <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.</p> </li> <li> <p> <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.</p> </li> <li> <p> <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.</p> </li> <li> <p> <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model endpoint variant.</p> </li> <li> <p> <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by your own application or service.</p> </li> <li> <p> <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units for an Amazon Comprehend document classification endpoint.</p> </li> <li> <p> <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.</p> </li> <li> <p> <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces table.</p> </li> <li> <p> <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces table.</p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ScalableDimension
     */
    public DeregisterScalableTargetRequest withScalableDimension(String scalableDimension) {
        this.scalableDimension = scalableDimension;
        return this;
    }

    /**
     * <p>The scalable dimension associated with the scalable target. This string consists of the service namespace, resource type, and scaling property.</p> <ul> <li> <p> <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.</p> </li> <li> <p> <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.</p> </li> <li> <p> <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.</p> </li> <li> <p> <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.</p> </li> <li> <p> <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.</p> </li> <li> <p> <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model endpoint variant.</p> </li> <li> <p> <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by your own application or service.</p> </li> <li> <p> <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units for an Amazon Comprehend document classification endpoint.</p> </li> <li> <p> <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.</p> </li> <li> <p> <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces table.</p> </li> <li> <p> <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces table.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs:service:DesiredCount, ec2:spot-fleet-request:TargetCapacity, elasticmapreduce:instancegroup:InstanceCount, appstream:fleet:DesiredCapacity, dynamodb:table:ReadCapacityUnits, dynamodb:table:WriteCapacityUnits, dynamodb:index:ReadCapacityUnits, dynamodb:index:WriteCapacityUnits, rds:cluster:ReadReplicaCount, sagemaker:variant:DesiredInstanceCount, custom-resource:ResourceType:Property, comprehend:document-classifier-endpoint:DesiredInferenceUnits, lambda:function:ProvisionedConcurrency, cassandra:table:ReadCapacityUnits, cassandra:table:WriteCapacityUnits
     *
     * @param scalableDimension <p>The scalable dimension associated with the scalable target. This string consists of the service namespace, resource type, and scaling property.</p> <ul> <li> <p> <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.</p> </li> <li> <p> <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.</p> </li> <li> <p> <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.</p> </li> <li> <p> <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.</p> </li> <li> <p> <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.</p> </li> <li> <p> <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model endpoint variant.</p> </li> <li> <p> <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by your own application or service.</p> </li> <li> <p> <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units for an Amazon Comprehend document classification endpoint.</p> </li> <li> <p> <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.</p> </li> <li> <p> <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces table.</p> </li> <li> <p> <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces table.</p> </li> </ul>
     *
     * @see ScalableDimension
     */
    public void setScalableDimension(ScalableDimension scalableDimension) {
        this.scalableDimension = scalableDimension.toString();
    }

    /**
     * <p>The scalable dimension associated with the scalable target. This string consists of the service namespace, resource type, and scaling property.</p> <ul> <li> <p> <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.</p> </li> <li> <p> <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.</p> </li> <li> <p> <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.</p> </li> <li> <p> <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.</p> </li> <li> <p> <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.</p> </li> <li> <p> <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model endpoint variant.</p> </li> <li> <p> <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by your own application or service.</p> </li> <li> <p> <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units for an Amazon Comprehend document classification endpoint.</p> </li> <li> <p> <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.</p> </li> <li> <p> <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces table.</p> </li> <li> <p> <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces table.</p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs:service:DesiredCount, ec2:spot-fleet-request:TargetCapacity, elasticmapreduce:instancegroup:InstanceCount, appstream:fleet:DesiredCapacity, dynamodb:table:ReadCapacityUnits, dynamodb:table:WriteCapacityUnits, dynamodb:index:ReadCapacityUnits, dynamodb:index:WriteCapacityUnits, rds:cluster:ReadReplicaCount, sagemaker:variant:DesiredInstanceCount, custom-resource:ResourceType:Property, comprehend:document-classifier-endpoint:DesiredInferenceUnits, lambda:function:ProvisionedConcurrency, cassandra:table:ReadCapacityUnits, cassandra:table:WriteCapacityUnits
     *
     * @param scalableDimension <p>The scalable dimension associated with the scalable target. This string consists of the service namespace, resource type, and scaling property.</p> <ul> <li> <p> <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.</p> </li> <li> <p> <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.</p> </li> <li> <p> <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.</p> </li> <li> <p> <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.</p> </li> <li> <p> <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.</p> </li> <li> <p> <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary index.</p> </li> <li> <p> <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.</p> </li> <li> <p> <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model endpoint variant.</p> </li> <li> <p> <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by your own application or service.</p> </li> <li> <p> <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units for an Amazon Comprehend document classification endpoint.</p> </li> <li> <p> <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.</p> </li> <li> <p> <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces table.</p> </li> <li> <p> <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces table.</p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ScalableDimension
     */
    public DeregisterScalableTargetRequest withScalableDimension(ScalableDimension scalableDimension) {
        this.scalableDimension = scalableDimension.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getServiceNamespace() != null) sb.append("ServiceNamespace: " + getServiceNamespace() + ",");
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() + ",");
        if (getScalableDimension() != null) sb.append("ScalableDimension: " + getScalableDimension());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getScalableDimension() == null) ? 0 : getScalableDimension().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeregisterScalableTargetRequest == false) return false;
        DeregisterScalableTargetRequest other = (DeregisterScalableTargetRequest)obj;

        if (other.getServiceNamespace() == null ^ this.getServiceNamespace() == null) return false;
        if (other.getServiceNamespace() != null && other.getServiceNamespace().equals(this.getServiceNamespace()) == false) return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false;
        if (other.getScalableDimension() == null ^ this.getScalableDimension() == null) return false;
        if (other.getScalableDimension() != null && other.getScalableDimension().equals(this.getScalableDimension()) == false) return false;
        return true;
    }
}
