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

package com.amazonaws.services.applicationautoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates or updates a scheduled action for an Application Auto Scaling
 * scalable target.
 * </p>
 * <p>
 * Each scalable target is identified by a service namespace, resource ID, and
 * scalable dimension. A scheduled action applies to the scalable target
 * identified by those three attributes. You cannot create a scheduled action
 * until you have registered the resource as a scalable target.
 * </p>
 * <p>
 * When start and end times are specified with a recurring schedule using a cron
 * expression or rates, they form the boundaries of when the recurring action
 * starts and stops.
 * </p>
 * <p>
 * To update a scheduled action, specify the parameters that you want to change.
 * If you don't specify start and end times, the old values are deleted.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html"
 * >Scheduled Scaling</a> in the <i>Application Auto Scaling User Guide</i>.
 * </p>
 * <note>
 * <p>
 * If a scalable target is deregistered, the scalable target is no longer
 * available to run scheduled actions. Any scheduled actions that were specified
 * for the scalable target are deleted.
 * </p>
 * </note>
 */
public class PutScheduledActionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The namespace of the AWS service that provides the resource. For a
     * resource provided by your own application or service, use
     * <code>custom-resource</code> instead.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs, elasticmapreduce, ec2, appstream, dynamodb,
     * rds, sagemaker, custom-resource, comprehend, lambda, cassandra
     */
    private String serviceNamespace;

    /**
     * <p>
     * The schedule for this action. The following formats are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * At expressions - "
     * <code>at(<i>yyyy</i>-<i>mm</i>-<i>dd</i>T<i>hh</i>:<i>mm</i>:<i>ss</i>)</code>
     * "
     * </p>
     * </li>
     * <li>
     * <p>
     * Rate expressions - "<code>rate(<i>value</i> <i>unit</i>)</code>"
     * </p>
     * </li>
     * <li>
     * <p>
     * Cron expressions - "<code>cron(<i>fields</i>)</code>"
     * </p>
     * </li>
     * </ul>
     * <p>
     * At expressions are useful for one-time schedules. Specify the time in
     * UTC.
     * </p>
     * <p>
     * For rate expressions, <i>value</i> is a positive integer and <i>unit</i>
     * is <code>minute</code> | <code>minutes</code> | <code>hour</code> |
     * <code>hours</code> | <code>day</code> | <code>days</code>.
     * </p>
     * <p>
     * For more information about cron expressions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     * >Cron Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * <p>
     * For examples of using these expressions, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html"
     * >Scheduled Scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String schedule;

    /**
     * <p>
     * The name of the scheduled action. This name must be unique among all
     * other scheduled actions on the specified scalable target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>(?!((^[
     * ]+.*)|(.*([\u0000-\u001f]|[\u007f-\u009f]|[:/|])+.*)|(.*[ ]+$))).+<br/>
     */
    private String scheduledActionName;

    /**
     * <p>
     * The identifier of the resource associated with the scheduled action. This
     * string consists of the resource type and unique identifier.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ECS service - The resource type is <code>service</code> and the unique
     * identifier is the cluster name and service name. Example:
     * <code>service/default/sample-webapp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot Fleet request - The resource type is <code>spot-fleet-request</code>
     * and the unique identifier is the Spot Fleet request ID. Example:
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMR cluster - The resource type is <code>instancegroup</code> and the
     * unique identifier is the cluster ID and instance group ID. Example:
     * <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleet - The resource type is <code>fleet</code> and the
     * unique identifier is the fleet name. Example:
     * <code>fleet/sample-fleet</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB table - The resource type is <code>table</code> and the unique
     * identifier is the table name. Example: <code>table/my-table</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary index - The resource type is <code>index</code>
     * and the unique identifier is the index name. Example:
     * <code>table/my-table/index/my-table-index</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB cluster - The resource type is <code>cluster</code> and the
     * unique identifier is the cluster name. Example:
     * <code>cluster:my-db-cluster</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variant - The resource type is
     * <code>variant</code> and the unique identifier is the resource ID.
     * Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources are not supported with a resource type. This parameter
     * must specify the <code>OutputValue</code> from the CloudFormation
     * template stack used to access the resources. The unique identifier is
     * defined by the service provider. More information is available in our <a
     * href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub
     * repository</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Comprehend document classification endpoint - The resource type
     * and unique identifier are specified using the endpoint ARN. Example:
     * <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda provisioned concurrency - The resource type is
     * <code>function</code> and the unique identifier is the function name with
     * a function version or alias name suffix that is not <code>$LATEST</code>.
     * Example: <code>function:my-function:prod</code> or
     * <code>function:my-function:1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Keyspaces table - The resource type is <code>table</code> and the
     * unique identifier is the table name. Example:
     * <code>keyspace/mykeyspace/table/mytable</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String resourceId;

    /**
     * <p>
     * The scalable dimension. This string consists of the service namespace,
     * resource type, and scaling property.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ecs:service:DesiredCount</code> - The desired task count of an ECS
     * service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity
     * of a Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance
     * count of an EMR Instance Group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an
     * AppStream 2.0 fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read
     * capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write
     * capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read
     * capacity for a DynamoDB global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write
     * capacity for a DynamoDB global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas
     * in an Aurora DB cluster. Available for Aurora MySQL-compatible edition
     * and Aurora PostgreSQL-compatible edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2
     * instances for an Amazon SageMaker model endpoint variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-resource:ResourceType:Property</code> - The scalable
     * dimension for a custom resource provided by your own application or
     * service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code>
     * - The number of inference units for an Amazon Comprehend document
     * classification endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda:function:ProvisionedConcurrency</code> - The provisioned
     * concurrency for a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read
     * capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write
     * capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs:service:DesiredCount,
     * ec2:spot-fleet-request:TargetCapacity,
     * elasticmapreduce:instancegroup:InstanceCount,
     * appstream:fleet:DesiredCapacity, dynamodb:table:ReadCapacityUnits,
     * dynamodb:table:WriteCapacityUnits, dynamodb:index:ReadCapacityUnits,
     * dynamodb:index:WriteCapacityUnits, rds:cluster:ReadReplicaCount,
     * sagemaker:variant:DesiredInstanceCount,
     * custom-resource:ResourceType:Property,
     * comprehend:document-classifier-endpoint:DesiredInferenceUnits,
     * lambda:function:ProvisionedConcurrency,
     * cassandra:table:ReadCapacityUnits, cassandra:table:WriteCapacityUnits
     */
    private String scalableDimension;

    /**
     * <p>
     * The date and time for this scheduled action to start.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The date and time for the recurring schedule to end.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The new minimum and maximum capacity. You can set both values or just
     * one. At the scheduled time, if the current capacity is below the minimum
     * capacity, Application Auto Scaling scales out to the minimum capacity. If
     * the current capacity is above the maximum capacity, Application Auto
     * Scaling scales in to the maximum capacity.
     * </p>
     */
    private ScalableTargetAction scalableTargetAction;

    /**
     * <p>
     * The namespace of the AWS service that provides the resource. For a
     * resource provided by your own application or service, use
     * <code>custom-resource</code> instead.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs, elasticmapreduce, ec2, appstream, dynamodb,
     * rds, sagemaker, custom-resource, comprehend, lambda, cassandra
     *
     * @return <p>
     *         The namespace of the AWS service that provides the resource. For
     *         a resource provided by your own application or service, use
     *         <code>custom-resource</code> instead.
     *         </p>
     * @see ServiceNamespace
     */
    public String getServiceNamespace() {
        return serviceNamespace;
    }

    /**
     * <p>
     * The namespace of the AWS service that provides the resource. For a
     * resource provided by your own application or service, use
     * <code>custom-resource</code> instead.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs, elasticmapreduce, ec2, appstream, dynamodb,
     * rds, sagemaker, custom-resource, comprehend, lambda, cassandra
     *
     * @param serviceNamespace <p>
     *            The namespace of the AWS service that provides the resource.
     *            For a resource provided by your own application or service,
     *            use <code>custom-resource</code> instead.
     *            </p>
     * @see ServiceNamespace
     */
    public void setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * <p>
     * The namespace of the AWS service that provides the resource. For a
     * resource provided by your own application or service, use
     * <code>custom-resource</code> instead.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs, elasticmapreduce, ec2, appstream, dynamodb,
     * rds, sagemaker, custom-resource, comprehend, lambda, cassandra
     *
     * @param serviceNamespace <p>
     *            The namespace of the AWS service that provides the resource.
     *            For a resource provided by your own application or service,
     *            use <code>custom-resource</code> instead.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceNamespace
     */
    public PutScheduledActionRequest withServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
        return this;
    }

    /**
     * <p>
     * The namespace of the AWS service that provides the resource. For a
     * resource provided by your own application or service, use
     * <code>custom-resource</code> instead.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs, elasticmapreduce, ec2, appstream, dynamodb,
     * rds, sagemaker, custom-resource, comprehend, lambda, cassandra
     *
     * @param serviceNamespace <p>
     *            The namespace of the AWS service that provides the resource.
     *            For a resource provided by your own application or service,
     *            use <code>custom-resource</code> instead.
     *            </p>
     * @see ServiceNamespace
     */
    public void setServiceNamespace(ServiceNamespace serviceNamespace) {
        this.serviceNamespace = serviceNamespace.toString();
    }

    /**
     * <p>
     * The namespace of the AWS service that provides the resource. For a
     * resource provided by your own application or service, use
     * <code>custom-resource</code> instead.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs, elasticmapreduce, ec2, appstream, dynamodb,
     * rds, sagemaker, custom-resource, comprehend, lambda, cassandra
     *
     * @param serviceNamespace <p>
     *            The namespace of the AWS service that provides the resource.
     *            For a resource provided by your own application or service,
     *            use <code>custom-resource</code> instead.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceNamespace
     */
    public PutScheduledActionRequest withServiceNamespace(ServiceNamespace serviceNamespace) {
        this.serviceNamespace = serviceNamespace.toString();
        return this;
    }

    /**
     * <p>
     * The schedule for this action. The following formats are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * At expressions - "
     * <code>at(<i>yyyy</i>-<i>mm</i>-<i>dd</i>T<i>hh</i>:<i>mm</i>:<i>ss</i>)</code>
     * "
     * </p>
     * </li>
     * <li>
     * <p>
     * Rate expressions - "<code>rate(<i>value</i> <i>unit</i>)</code>"
     * </p>
     * </li>
     * <li>
     * <p>
     * Cron expressions - "<code>cron(<i>fields</i>)</code>"
     * </p>
     * </li>
     * </ul>
     * <p>
     * At expressions are useful for one-time schedules. Specify the time in
     * UTC.
     * </p>
     * <p>
     * For rate expressions, <i>value</i> is a positive integer and <i>unit</i>
     * is <code>minute</code> | <code>minutes</code> | <code>hour</code> |
     * <code>hours</code> | <code>day</code> | <code>days</code>.
     * </p>
     * <p>
     * For more information about cron expressions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     * >Cron Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * <p>
     * For examples of using these expressions, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html"
     * >Scheduled Scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The schedule for this action. The following formats are
     *         supported:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         At expressions - "
     *         <code>at(<i>yyyy</i>-<i>mm</i>-<i>dd</i>T<i>hh</i>:<i>mm</i>:<i>ss</i>)</code>
     *         "
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Rate expressions - "<code>rate(<i>value</i> <i>unit</i>)</code>"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cron expressions - "<code>cron(<i>fields</i>)</code>"
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         At expressions are useful for one-time schedules. Specify the
     *         time in UTC.
     *         </p>
     *         <p>
     *         For rate expressions, <i>value</i> is a positive integer and
     *         <i>unit</i> is <code>minute</code> | <code>minutes</code> |
     *         <code>hour</code> | <code>hours</code> | <code>day</code> |
     *         <code>days</code>.
     *         </p>
     *         <p>
     *         For more information about cron expressions, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     *         >Cron Expressions</a> in the <i>Amazon CloudWatch Events User
     *         Guide</i>.
     *         </p>
     *         <p>
     *         For examples of using these expressions, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html"
     *         >Scheduled Scaling</a> in the <i>Application Auto Scaling User
     *         Guide</i>.
     *         </p>
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * The schedule for this action. The following formats are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * At expressions - "
     * <code>at(<i>yyyy</i>-<i>mm</i>-<i>dd</i>T<i>hh</i>:<i>mm</i>:<i>ss</i>)</code>
     * "
     * </p>
     * </li>
     * <li>
     * <p>
     * Rate expressions - "<code>rate(<i>value</i> <i>unit</i>)</code>"
     * </p>
     * </li>
     * <li>
     * <p>
     * Cron expressions - "<code>cron(<i>fields</i>)</code>"
     * </p>
     * </li>
     * </ul>
     * <p>
     * At expressions are useful for one-time schedules. Specify the time in
     * UTC.
     * </p>
     * <p>
     * For rate expressions, <i>value</i> is a positive integer and <i>unit</i>
     * is <code>minute</code> | <code>minutes</code> | <code>hour</code> |
     * <code>hours</code> | <code>day</code> | <code>days</code>.
     * </p>
     * <p>
     * For more information about cron expressions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     * >Cron Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * <p>
     * For examples of using these expressions, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html"
     * >Scheduled Scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param schedule <p>
     *            The schedule for this action. The following formats are
     *            supported:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            At expressions - "
     *            <code>at(<i>yyyy</i>-<i>mm</i>-<i>dd</i>T<i>hh</i>:<i>mm</i>:<i>ss</i>)</code>
     *            "
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Rate expressions - "
     *            <code>rate(<i>value</i> <i>unit</i>)</code>"
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cron expressions - "<code>cron(<i>fields</i>)</code>"
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            At expressions are useful for one-time schedules. Specify the
     *            time in UTC.
     *            </p>
     *            <p>
     *            For rate expressions, <i>value</i> is a positive integer and
     *            <i>unit</i> is <code>minute</code> | <code>minutes</code> |
     *            <code>hour</code> | <code>hours</code> | <code>day</code> |
     *            <code>days</code>.
     *            </p>
     *            <p>
     *            For more information about cron expressions, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     *            >Cron Expressions</a> in the <i>Amazon CloudWatch Events User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            For examples of using these expressions, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html"
     *            >Scheduled Scaling</a> in the <i>Application Auto Scaling User
     *            Guide</i>.
     *            </p>
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule for this action. The following formats are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * At expressions - "
     * <code>at(<i>yyyy</i>-<i>mm</i>-<i>dd</i>T<i>hh</i>:<i>mm</i>:<i>ss</i>)</code>
     * "
     * </p>
     * </li>
     * <li>
     * <p>
     * Rate expressions - "<code>rate(<i>value</i> <i>unit</i>)</code>"
     * </p>
     * </li>
     * <li>
     * <p>
     * Cron expressions - "<code>cron(<i>fields</i>)</code>"
     * </p>
     * </li>
     * </ul>
     * <p>
     * At expressions are useful for one-time schedules. Specify the time in
     * UTC.
     * </p>
     * <p>
     * For rate expressions, <i>value</i> is a positive integer and <i>unit</i>
     * is <code>minute</code> | <code>minutes</code> | <code>hour</code> |
     * <code>hours</code> | <code>day</code> | <code>days</code>.
     * </p>
     * <p>
     * For more information about cron expressions, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     * >Cron Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * <p>
     * For examples of using these expressions, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html"
     * >Scheduled Scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param schedule <p>
     *            The schedule for this action. The following formats are
     *            supported:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            At expressions - "
     *            <code>at(<i>yyyy</i>-<i>mm</i>-<i>dd</i>T<i>hh</i>:<i>mm</i>:<i>ss</i>)</code>
     *            "
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Rate expressions - "
     *            <code>rate(<i>value</i> <i>unit</i>)</code>"
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cron expressions - "<code>cron(<i>fields</i>)</code>"
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            At expressions are useful for one-time schedules. Specify the
     *            time in UTC.
     *            </p>
     *            <p>
     *            For rate expressions, <i>value</i> is a positive integer and
     *            <i>unit</i> is <code>minute</code> | <code>minutes</code> |
     *            <code>hour</code> | <code>hours</code> | <code>day</code> |
     *            <code>days</code>.
     *            </p>
     *            <p>
     *            For more information about cron expressions, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     *            >Cron Expressions</a> in the <i>Amazon CloudWatch Events User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            For examples of using these expressions, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html"
     *            >Scheduled Scaling</a> in the <i>Application Auto Scaling User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScheduledActionRequest withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>
     * The name of the scheduled action. This name must be unique among all
     * other scheduled actions on the specified scalable target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>(?!((^[
     * ]+.*)|(.*([\u0000-\u001f]|[\u007f-\u009f]|[:/|])+.*)|(.*[ ]+$))).+<br/>
     *
     * @return <p>
     *         The name of the scheduled action. This name must be unique among
     *         all other scheduled actions on the specified scalable target.
     *         </p>
     */
    public String getScheduledActionName() {
        return scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action. This name must be unique among all
     * other scheduled actions on the specified scalable target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>(?!((^[
     * ]+.*)|(.*([\u0000-\u001f]|[\u007f-\u009f]|[:/|])+.*)|(.*[ ]+$))).+<br/>
     *
     * @param scheduledActionName <p>
     *            The name of the scheduled action. This name must be unique
     *            among all other scheduled actions on the specified scalable
     *            target.
     *            </p>
     */
    public void setScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action. This name must be unique among all
     * other scheduled actions on the specified scalable target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>(?!((^[
     * ]+.*)|(.*([\u0000-\u001f]|[\u007f-\u009f]|[:/|])+.*)|(.*[ ]+$))).+<br/>
     *
     * @param scheduledActionName <p>
     *            The name of the scheduled action. This name must be unique
     *            among all other scheduled actions on the specified scalable
     *            target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScheduledActionRequest withScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
        return this;
    }

    /**
     * <p>
     * The identifier of the resource associated with the scheduled action. This
     * string consists of the resource type and unique identifier.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ECS service - The resource type is <code>service</code> and the unique
     * identifier is the cluster name and service name. Example:
     * <code>service/default/sample-webapp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot Fleet request - The resource type is <code>spot-fleet-request</code>
     * and the unique identifier is the Spot Fleet request ID. Example:
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMR cluster - The resource type is <code>instancegroup</code> and the
     * unique identifier is the cluster ID and instance group ID. Example:
     * <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleet - The resource type is <code>fleet</code> and the
     * unique identifier is the fleet name. Example:
     * <code>fleet/sample-fleet</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB table - The resource type is <code>table</code> and the unique
     * identifier is the table name. Example: <code>table/my-table</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary index - The resource type is <code>index</code>
     * and the unique identifier is the index name. Example:
     * <code>table/my-table/index/my-table-index</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB cluster - The resource type is <code>cluster</code> and the
     * unique identifier is the cluster name. Example:
     * <code>cluster:my-db-cluster</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variant - The resource type is
     * <code>variant</code> and the unique identifier is the resource ID.
     * Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources are not supported with a resource type. This parameter
     * must specify the <code>OutputValue</code> from the CloudFormation
     * template stack used to access the resources. The unique identifier is
     * defined by the service provider. More information is available in our <a
     * href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub
     * repository</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Comprehend document classification endpoint - The resource type
     * and unique identifier are specified using the endpoint ARN. Example:
     * <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda provisioned concurrency - The resource type is
     * <code>function</code> and the unique identifier is the function name with
     * a function version or alias name suffix that is not <code>$LATEST</code>.
     * Example: <code>function:my-function:prod</code> or
     * <code>function:my-function:1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Keyspaces table - The resource type is <code>table</code> and the
     * unique identifier is the table name. Example:
     * <code>keyspace/mykeyspace/table/mytable</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The identifier of the resource associated with the scheduled
     *         action. This string consists of the resource type and unique
     *         identifier.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ECS service - The resource type is <code>service</code> and the
     *         unique identifier is the cluster name and service name. Example:
     *         <code>service/default/sample-webapp</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Spot Fleet request - The resource type is
     *         <code>spot-fleet-request</code> and the unique identifier is the
     *         Spot Fleet request ID. Example:
     *         <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMR cluster - The resource type is <code>instancegroup</code> and
     *         the unique identifier is the cluster ID and instance group ID.
     *         Example:
     *         <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AppStream 2.0 fleet - The resource type is <code>fleet</code> and
     *         the unique identifier is the fleet name. Example:
     *         <code>fleet/sample-fleet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DynamoDB table - The resource type is <code>table</code> and the
     *         unique identifier is the table name. Example:
     *         <code>table/my-table</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DynamoDB global secondary index - The resource type is
     *         <code>index</code> and the unique identifier is the index name.
     *         Example: <code>table/my-table/index/my-table-index</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Aurora DB cluster - The resource type is <code>cluster</code> and
     *         the unique identifier is the cluster name. Example:
     *         <code>cluster:my-db-cluster</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon SageMaker endpoint variant - The resource type is
     *         <code>variant</code> and the unique identifier is the resource
     *         ID. Example:
     *         <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Custom resources are not supported with a resource type. This
     *         parameter must specify the <code>OutputValue</code> from the
     *         CloudFormation template stack used to access the resources. The
     *         unique identifier is defined by the service provider. More
     *         information is available in our <a
     *         href="https://github.com/aws/aws-auto-scaling-custom-resource"
     *         >GitHub repository</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Comprehend document classification endpoint - The resource
     *         type and unique identifier are specified using the endpoint ARN.
     *         Example:
     *         <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Lambda provisioned concurrency - The resource type is
     *         <code>function</code> and the unique identifier is the function
     *         name with a function version or alias name suffix that is not
     *         <code>$LATEST</code>. Example:
     *         <code>function:my-function:prod</code> or
     *         <code>function:my-function:1</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Keyspaces table - The resource type is <code>table</code>
     *         and the unique identifier is the table name. Example:
     *         <code>keyspace/mykeyspace/table/mytable</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The identifier of the resource associated with the scheduled action. This
     * string consists of the resource type and unique identifier.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ECS service - The resource type is <code>service</code> and the unique
     * identifier is the cluster name and service name. Example:
     * <code>service/default/sample-webapp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot Fleet request - The resource type is <code>spot-fleet-request</code>
     * and the unique identifier is the Spot Fleet request ID. Example:
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMR cluster - The resource type is <code>instancegroup</code> and the
     * unique identifier is the cluster ID and instance group ID. Example:
     * <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleet - The resource type is <code>fleet</code> and the
     * unique identifier is the fleet name. Example:
     * <code>fleet/sample-fleet</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB table - The resource type is <code>table</code> and the unique
     * identifier is the table name. Example: <code>table/my-table</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary index - The resource type is <code>index</code>
     * and the unique identifier is the index name. Example:
     * <code>table/my-table/index/my-table-index</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB cluster - The resource type is <code>cluster</code> and the
     * unique identifier is the cluster name. Example:
     * <code>cluster:my-db-cluster</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variant - The resource type is
     * <code>variant</code> and the unique identifier is the resource ID.
     * Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources are not supported with a resource type. This parameter
     * must specify the <code>OutputValue</code> from the CloudFormation
     * template stack used to access the resources. The unique identifier is
     * defined by the service provider. More information is available in our <a
     * href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub
     * repository</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Comprehend document classification endpoint - The resource type
     * and unique identifier are specified using the endpoint ARN. Example:
     * <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda provisioned concurrency - The resource type is
     * <code>function</code> and the unique identifier is the function name with
     * a function version or alias name suffix that is not <code>$LATEST</code>.
     * Example: <code>function:my-function:prod</code> or
     * <code>function:my-function:1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Keyspaces table - The resource type is <code>table</code> and the
     * unique identifier is the table name. Example:
     * <code>keyspace/mykeyspace/table/mytable</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param resourceId <p>
     *            The identifier of the resource associated with the scheduled
     *            action. This string consists of the resource type and unique
     *            identifier.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ECS service - The resource type is <code>service</code> and
     *            the unique identifier is the cluster name and service name.
     *            Example: <code>service/default/sample-webapp</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Spot Fleet request - The resource type is
     *            <code>spot-fleet-request</code> and the unique identifier is
     *            the Spot Fleet request ID. Example:
     *            <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EMR cluster - The resource type is <code>instancegroup</code>
     *            and the unique identifier is the cluster ID and instance group
     *            ID. Example:
     *            <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AppStream 2.0 fleet - The resource type is <code>fleet</code>
     *            and the unique identifier is the fleet name. Example:
     *            <code>fleet/sample-fleet</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DynamoDB table - The resource type is <code>table</code> and
     *            the unique identifier is the table name. Example:
     *            <code>table/my-table</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DynamoDB global secondary index - The resource type is
     *            <code>index</code> and the unique identifier is the index
     *            name. Example:
     *            <code>table/my-table/index/my-table-index</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Aurora DB cluster - The resource type is <code>cluster</code>
     *            and the unique identifier is the cluster name. Example:
     *            <code>cluster:my-db-cluster</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon SageMaker endpoint variant - The resource type is
     *            <code>variant</code> and the unique identifier is the resource
     *            ID. Example:
     *            <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Custom resources are not supported with a resource type. This
     *            parameter must specify the <code>OutputValue</code> from the
     *            CloudFormation template stack used to access the resources.
     *            The unique identifier is defined by the service provider. More
     *            information is available in our <a href=
     *            "https://github.com/aws/aws-auto-scaling-custom-resource"
     *            >GitHub repository</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Comprehend document classification endpoint - The
     *            resource type and unique identifier are specified using the
     *            endpoint ARN. Example:
     *            <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Lambda provisioned concurrency - The resource type is
     *            <code>function</code> and the unique identifier is the
     *            function name with a function version or alias name suffix
     *            that is not <code>$LATEST</code>. Example:
     *            <code>function:my-function:prod</code> or
     *            <code>function:my-function:1</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Keyspaces table - The resource type is
     *            <code>table</code> and the unique identifier is the table
     *            name. Example: <code>keyspace/mykeyspace/table/mytable</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the resource associated with the scheduled action. This
     * string consists of the resource type and unique identifier.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ECS service - The resource type is <code>service</code> and the unique
     * identifier is the cluster name and service name. Example:
     * <code>service/default/sample-webapp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot Fleet request - The resource type is <code>spot-fleet-request</code>
     * and the unique identifier is the Spot Fleet request ID. Example:
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * EMR cluster - The resource type is <code>instancegroup</code> and the
     * unique identifier is the cluster ID and instance group ID. Example:
     * <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleet - The resource type is <code>fleet</code> and the
     * unique identifier is the fleet name. Example:
     * <code>fleet/sample-fleet</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB table - The resource type is <code>table</code> and the unique
     * identifier is the table name. Example: <code>table/my-table</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary index - The resource type is <code>index</code>
     * and the unique identifier is the index name. Example:
     * <code>table/my-table/index/my-table-index</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB cluster - The resource type is <code>cluster</code> and the
     * unique identifier is the cluster name. Example:
     * <code>cluster:my-db-cluster</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variant - The resource type is
     * <code>variant</code> and the unique identifier is the resource ID.
     * Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources are not supported with a resource type. This parameter
     * must specify the <code>OutputValue</code> from the CloudFormation
     * template stack used to access the resources. The unique identifier is
     * defined by the service provider. More information is available in our <a
     * href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub
     * repository</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Comprehend document classification endpoint - The resource type
     * and unique identifier are specified using the endpoint ARN. Example:
     * <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda provisioned concurrency - The resource type is
     * <code>function</code> and the unique identifier is the function name with
     * a function version or alias name suffix that is not <code>$LATEST</code>.
     * Example: <code>function:my-function:prod</code> or
     * <code>function:my-function:1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Keyspaces table - The resource type is <code>table</code> and the
     * unique identifier is the table name. Example:
     * <code>keyspace/mykeyspace/table/mytable</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param resourceId <p>
     *            The identifier of the resource associated with the scheduled
     *            action. This string consists of the resource type and unique
     *            identifier.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ECS service - The resource type is <code>service</code> and
     *            the unique identifier is the cluster name and service name.
     *            Example: <code>service/default/sample-webapp</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Spot Fleet request - The resource type is
     *            <code>spot-fleet-request</code> and the unique identifier is
     *            the Spot Fleet request ID. Example:
     *            <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EMR cluster - The resource type is <code>instancegroup</code>
     *            and the unique identifier is the cluster ID and instance group
     *            ID. Example:
     *            <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AppStream 2.0 fleet - The resource type is <code>fleet</code>
     *            and the unique identifier is the fleet name. Example:
     *            <code>fleet/sample-fleet</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DynamoDB table - The resource type is <code>table</code> and
     *            the unique identifier is the table name. Example:
     *            <code>table/my-table</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DynamoDB global secondary index - The resource type is
     *            <code>index</code> and the unique identifier is the index
     *            name. Example:
     *            <code>table/my-table/index/my-table-index</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Aurora DB cluster - The resource type is <code>cluster</code>
     *            and the unique identifier is the cluster name. Example:
     *            <code>cluster:my-db-cluster</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon SageMaker endpoint variant - The resource type is
     *            <code>variant</code> and the unique identifier is the resource
     *            ID. Example:
     *            <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Custom resources are not supported with a resource type. This
     *            parameter must specify the <code>OutputValue</code> from the
     *            CloudFormation template stack used to access the resources.
     *            The unique identifier is defined by the service provider. More
     *            information is available in our <a href=
     *            "https://github.com/aws/aws-auto-scaling-custom-resource"
     *            >GitHub repository</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Comprehend document classification endpoint - The
     *            resource type and unique identifier are specified using the
     *            endpoint ARN. Example:
     *            <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Lambda provisioned concurrency - The resource type is
     *            <code>function</code> and the unique identifier is the
     *            function name with a function version or alias name suffix
     *            that is not <code>$LATEST</code>. Example:
     *            <code>function:my-function:prod</code> or
     *            <code>function:my-function:1</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Keyspaces table - The resource type is
     *            <code>table</code> and the unique identifier is the table
     *            name. Example: <code>keyspace/mykeyspace/table/mytable</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScheduledActionRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * The scalable dimension. This string consists of the service namespace,
     * resource type, and scaling property.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ecs:service:DesiredCount</code> - The desired task count of an ECS
     * service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity
     * of a Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance
     * count of an EMR Instance Group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an
     * AppStream 2.0 fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read
     * capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write
     * capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read
     * capacity for a DynamoDB global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write
     * capacity for a DynamoDB global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas
     * in an Aurora DB cluster. Available for Aurora MySQL-compatible edition
     * and Aurora PostgreSQL-compatible edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2
     * instances for an Amazon SageMaker model endpoint variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-resource:ResourceType:Property</code> - The scalable
     * dimension for a custom resource provided by your own application or
     * service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code>
     * - The number of inference units for an Amazon Comprehend document
     * classification endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda:function:ProvisionedConcurrency</code> - The provisioned
     * concurrency for a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read
     * capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write
     * capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs:service:DesiredCount,
     * ec2:spot-fleet-request:TargetCapacity,
     * elasticmapreduce:instancegroup:InstanceCount,
     * appstream:fleet:DesiredCapacity, dynamodb:table:ReadCapacityUnits,
     * dynamodb:table:WriteCapacityUnits, dynamodb:index:ReadCapacityUnits,
     * dynamodb:index:WriteCapacityUnits, rds:cluster:ReadReplicaCount,
     * sagemaker:variant:DesiredInstanceCount,
     * custom-resource:ResourceType:Property,
     * comprehend:document-classifier-endpoint:DesiredInferenceUnits,
     * lambda:function:ProvisionedConcurrency,
     * cassandra:table:ReadCapacityUnits, cassandra:table:WriteCapacityUnits
     *
     * @return <p>
     *         The scalable dimension. This string consists of the service
     *         namespace, resource type, and scaling property.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ecs:service:DesiredCount</code> - The desired task count of
     *         an ECS service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ec2:spot-fleet-request:TargetCapacity</code> - The target
     *         capacity of a Spot Fleet request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>elasticmapreduce:instancegroup:InstanceCount</code> - The
     *         instance count of an EMR Instance Group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>appstream:fleet:DesiredCapacity</code> - The desired
     *         capacity of an AppStream 2.0 fleet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned
     *         read capacity for a DynamoDB table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned
     *         write capacity for a DynamoDB table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned
     *         read capacity for a DynamoDB global secondary index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned
     *         write capacity for a DynamoDB global secondary index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora
     *         Replicas in an Aurora DB cluster. Available for Aurora
     *         MySQL-compatible edition and Aurora PostgreSQL-compatible
     *         edition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sagemaker:variant:DesiredInstanceCount</code> - The number
     *         of EC2 instances for an Amazon SageMaker model endpoint variant.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>custom-resource:ResourceType:Property</code> - The scalable
     *         dimension for a custom resource provided by your own application
     *         or service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code>
     *         - The number of inference units for an Amazon Comprehend document
     *         classification endpoint.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>lambda:function:ProvisionedConcurrency</code> - The
     *         provisioned concurrency for a Lambda function.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cassandra:table:ReadCapacityUnits</code> - The provisioned
     *         read capacity for an Amazon Keyspaces table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cassandra:table:WriteCapacityUnits</code> - The provisioned
     *         write capacity for an Amazon Keyspaces table.
     *         </p>
     *         </li>
     *         </ul>
     * @see ScalableDimension
     */
    public String getScalableDimension() {
        return scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension. This string consists of the service namespace,
     * resource type, and scaling property.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ecs:service:DesiredCount</code> - The desired task count of an ECS
     * service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity
     * of a Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance
     * count of an EMR Instance Group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an
     * AppStream 2.0 fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read
     * capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write
     * capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read
     * capacity for a DynamoDB global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write
     * capacity for a DynamoDB global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas
     * in an Aurora DB cluster. Available for Aurora MySQL-compatible edition
     * and Aurora PostgreSQL-compatible edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2
     * instances for an Amazon SageMaker model endpoint variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-resource:ResourceType:Property</code> - The scalable
     * dimension for a custom resource provided by your own application or
     * service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code>
     * - The number of inference units for an Amazon Comprehend document
     * classification endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda:function:ProvisionedConcurrency</code> - The provisioned
     * concurrency for a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read
     * capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write
     * capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs:service:DesiredCount,
     * ec2:spot-fleet-request:TargetCapacity,
     * elasticmapreduce:instancegroup:InstanceCount,
     * appstream:fleet:DesiredCapacity, dynamodb:table:ReadCapacityUnits,
     * dynamodb:table:WriteCapacityUnits, dynamodb:index:ReadCapacityUnits,
     * dynamodb:index:WriteCapacityUnits, rds:cluster:ReadReplicaCount,
     * sagemaker:variant:DesiredInstanceCount,
     * custom-resource:ResourceType:Property,
     * comprehend:document-classifier-endpoint:DesiredInferenceUnits,
     * lambda:function:ProvisionedConcurrency,
     * cassandra:table:ReadCapacityUnits, cassandra:table:WriteCapacityUnits
     *
     * @param scalableDimension <p>
     *            The scalable dimension. This string consists of the service
     *            namespace, resource type, and scaling property.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ecs:service:DesiredCount</code> - The desired task count
     *            of an ECS service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ec2:spot-fleet-request:TargetCapacity</code> - The
     *            target capacity of a Spot Fleet request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>elasticmapreduce:instancegroup:InstanceCount</code> -
     *            The instance count of an EMR Instance Group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>appstream:fleet:DesiredCapacity</code> - The desired
     *            capacity of an AppStream 2.0 fleet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dynamodb:table:ReadCapacityUnits</code> - The
     *            provisioned read capacity for a DynamoDB table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dynamodb:table:WriteCapacityUnits</code> - The
     *            provisioned write capacity for a DynamoDB table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dynamodb:index:ReadCapacityUnits</code> - The
     *            provisioned read capacity for a DynamoDB global secondary
     *            index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dynamodb:index:WriteCapacityUnits</code> - The
     *            provisioned write capacity for a DynamoDB global secondary
     *            index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rds:cluster:ReadReplicaCount</code> - The count of
     *            Aurora Replicas in an Aurora DB cluster. Available for Aurora
     *            MySQL-compatible edition and Aurora PostgreSQL-compatible
     *            edition.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sagemaker:variant:DesiredInstanceCount</code> - The
     *            number of EC2 instances for an Amazon SageMaker model endpoint
     *            variant.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>custom-resource:ResourceType:Property</code> - The
     *            scalable dimension for a custom resource provided by your own
     *            application or service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code>
     *            - The number of inference units for an Amazon Comprehend
     *            document classification endpoint.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>lambda:function:ProvisionedConcurrency</code> - The
     *            provisioned concurrency for a Lambda function.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cassandra:table:ReadCapacityUnits</code> - The
     *            provisioned read capacity for an Amazon Keyspaces table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cassandra:table:WriteCapacityUnits</code> - The
     *            provisioned write capacity for an Amazon Keyspaces table.
     *            </p>
     *            </li>
     *            </ul>
     * @see ScalableDimension
     */
    public void setScalableDimension(String scalableDimension) {
        this.scalableDimension = scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension. This string consists of the service namespace,
     * resource type, and scaling property.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ecs:service:DesiredCount</code> - The desired task count of an ECS
     * service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity
     * of a Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance
     * count of an EMR Instance Group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an
     * AppStream 2.0 fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read
     * capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write
     * capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read
     * capacity for a DynamoDB global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write
     * capacity for a DynamoDB global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas
     * in an Aurora DB cluster. Available for Aurora MySQL-compatible edition
     * and Aurora PostgreSQL-compatible edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2
     * instances for an Amazon SageMaker model endpoint variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-resource:ResourceType:Property</code> - The scalable
     * dimension for a custom resource provided by your own application or
     * service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code>
     * - The number of inference units for an Amazon Comprehend document
     * classification endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda:function:ProvisionedConcurrency</code> - The provisioned
     * concurrency for a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read
     * capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write
     * capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs:service:DesiredCount,
     * ec2:spot-fleet-request:TargetCapacity,
     * elasticmapreduce:instancegroup:InstanceCount,
     * appstream:fleet:DesiredCapacity, dynamodb:table:ReadCapacityUnits,
     * dynamodb:table:WriteCapacityUnits, dynamodb:index:ReadCapacityUnits,
     * dynamodb:index:WriteCapacityUnits, rds:cluster:ReadReplicaCount,
     * sagemaker:variant:DesiredInstanceCount,
     * custom-resource:ResourceType:Property,
     * comprehend:document-classifier-endpoint:DesiredInferenceUnits,
     * lambda:function:ProvisionedConcurrency,
     * cassandra:table:ReadCapacityUnits, cassandra:table:WriteCapacityUnits
     *
     * @param scalableDimension <p>
     *            The scalable dimension. This string consists of the service
     *            namespace, resource type, and scaling property.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ecs:service:DesiredCount</code> - The desired task count
     *            of an ECS service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ec2:spot-fleet-request:TargetCapacity</code> - The
     *            target capacity of a Spot Fleet request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>elasticmapreduce:instancegroup:InstanceCount</code> -
     *            The instance count of an EMR Instance Group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>appstream:fleet:DesiredCapacity</code> - The desired
     *            capacity of an AppStream 2.0 fleet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dynamodb:table:ReadCapacityUnits</code> - The
     *            provisioned read capacity for a DynamoDB table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dynamodb:table:WriteCapacityUnits</code> - The
     *            provisioned write capacity for a DynamoDB table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dynamodb:index:ReadCapacityUnits</code> - The
     *            provisioned read capacity for a DynamoDB global secondary
     *            index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dynamodb:index:WriteCapacityUnits</code> - The
     *            provisioned write capacity for a DynamoDB global secondary
     *            index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rds:cluster:ReadReplicaCount</code> - The count of
     *            Aurora Replicas in an Aurora DB cluster. Available for Aurora
     *            MySQL-compatible edition and Aurora PostgreSQL-compatible
     *            edition.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sagemaker:variant:DesiredInstanceCount</code> - The
     *            number of EC2 instances for an Amazon SageMaker model endpoint
     *            variant.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>custom-resource:ResourceType:Property</code> - The
     *            scalable dimension for a custom resource provided by your own
     *            application or service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code>
     *            - The number of inference units for an Amazon Comprehend
     *            document classification endpoint.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>lambda:function:ProvisionedConcurrency</code> - The
     *            provisioned concurrency for a Lambda function.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cassandra:table:ReadCapacityUnits</code> - The
     *            provisioned read capacity for an Amazon Keyspaces table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cassandra:table:WriteCapacityUnits</code> - The
     *            provisioned write capacity for an Amazon Keyspaces table.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScalableDimension
     */
    public PutScheduledActionRequest withScalableDimension(String scalableDimension) {
        this.scalableDimension = scalableDimension;
        return this;
    }

    /**
     * <p>
     * The scalable dimension. This string consists of the service namespace,
     * resource type, and scaling property.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ecs:service:DesiredCount</code> - The desired task count of an ECS
     * service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity
     * of a Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance
     * count of an EMR Instance Group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an
     * AppStream 2.0 fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read
     * capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write
     * capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read
     * capacity for a DynamoDB global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write
     * capacity for a DynamoDB global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas
     * in an Aurora DB cluster. Available for Aurora MySQL-compatible edition
     * and Aurora PostgreSQL-compatible edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2
     * instances for an Amazon SageMaker model endpoint variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-resource:ResourceType:Property</code> - The scalable
     * dimension for a custom resource provided by your own application or
     * service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code>
     * - The number of inference units for an Amazon Comprehend document
     * classification endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda:function:ProvisionedConcurrency</code> - The provisioned
     * concurrency for a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read
     * capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write
     * capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs:service:DesiredCount,
     * ec2:spot-fleet-request:TargetCapacity,
     * elasticmapreduce:instancegroup:InstanceCount,
     * appstream:fleet:DesiredCapacity, dynamodb:table:ReadCapacityUnits,
     * dynamodb:table:WriteCapacityUnits, dynamodb:index:ReadCapacityUnits,
     * dynamodb:index:WriteCapacityUnits, rds:cluster:ReadReplicaCount,
     * sagemaker:variant:DesiredInstanceCount,
     * custom-resource:ResourceType:Property,
     * comprehend:document-classifier-endpoint:DesiredInferenceUnits,
     * lambda:function:ProvisionedConcurrency,
     * cassandra:table:ReadCapacityUnits, cassandra:table:WriteCapacityUnits
     *
     * @param scalableDimension <p>
     *            The scalable dimension. This string consists of the service
     *            namespace, resource type, and scaling property.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ecs:service:DesiredCount</code> - The desired task count
     *            of an ECS service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ec2:spot-fleet-request:TargetCapacity</code> - The
     *            target capacity of a Spot Fleet request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>elasticmapreduce:instancegroup:InstanceCount</code> -
     *            The instance count of an EMR Instance Group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>appstream:fleet:DesiredCapacity</code> - The desired
     *            capacity of an AppStream 2.0 fleet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dynamodb:table:ReadCapacityUnits</code> - The
     *            provisioned read capacity for a DynamoDB table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dynamodb:table:WriteCapacityUnits</code> - The
     *            provisioned write capacity for a DynamoDB table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dynamodb:index:ReadCapacityUnits</code> - The
     *            provisioned read capacity for a DynamoDB global secondary
     *            index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dynamodb:index:WriteCapacityUnits</code> - The
     *            provisioned write capacity for a DynamoDB global secondary
     *            index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rds:cluster:ReadReplicaCount</code> - The count of
     *            Aurora Replicas in an Aurora DB cluster. Available for Aurora
     *            MySQL-compatible edition and Aurora PostgreSQL-compatible
     *            edition.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sagemaker:variant:DesiredInstanceCount</code> - The
     *            number of EC2 instances for an Amazon SageMaker model endpoint
     *            variant.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>custom-resource:ResourceType:Property</code> - The
     *            scalable dimension for a custom resource provided by your own
     *            application or service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code>
     *            - The number of inference units for an Amazon Comprehend
     *            document classification endpoint.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>lambda:function:ProvisionedConcurrency</code> - The
     *            provisioned concurrency for a Lambda function.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cassandra:table:ReadCapacityUnits</code> - The
     *            provisioned read capacity for an Amazon Keyspaces table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cassandra:table:WriteCapacityUnits</code> - The
     *            provisioned write capacity for an Amazon Keyspaces table.
     *            </p>
     *            </li>
     *            </ul>
     * @see ScalableDimension
     */
    public void setScalableDimension(ScalableDimension scalableDimension) {
        this.scalableDimension = scalableDimension.toString();
    }

    /**
     * <p>
     * The scalable dimension. This string consists of the service namespace,
     * resource type, and scaling property.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ecs:service:DesiredCount</code> - The desired task count of an ECS
     * service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity
     * of a Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance
     * count of an EMR Instance Group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an
     * AppStream 2.0 fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read
     * capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write
     * capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read
     * capacity for a DynamoDB global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write
     * capacity for a DynamoDB global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas
     * in an Aurora DB cluster. Available for Aurora MySQL-compatible edition
     * and Aurora PostgreSQL-compatible edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2
     * instances for an Amazon SageMaker model endpoint variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-resource:ResourceType:Property</code> - The scalable
     * dimension for a custom resource provided by your own application or
     * service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code>
     * - The number of inference units for an Amazon Comprehend document
     * classification endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda:function:ProvisionedConcurrency</code> - The provisioned
     * concurrency for a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read
     * capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write
     * capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ecs:service:DesiredCount,
     * ec2:spot-fleet-request:TargetCapacity,
     * elasticmapreduce:instancegroup:InstanceCount,
     * appstream:fleet:DesiredCapacity, dynamodb:table:ReadCapacityUnits,
     * dynamodb:table:WriteCapacityUnits, dynamodb:index:ReadCapacityUnits,
     * dynamodb:index:WriteCapacityUnits, rds:cluster:ReadReplicaCount,
     * sagemaker:variant:DesiredInstanceCount,
     * custom-resource:ResourceType:Property,
     * comprehend:document-classifier-endpoint:DesiredInferenceUnits,
     * lambda:function:ProvisionedConcurrency,
     * cassandra:table:ReadCapacityUnits, cassandra:table:WriteCapacityUnits
     *
     * @param scalableDimension <p>
     *            The scalable dimension. This string consists of the service
     *            namespace, resource type, and scaling property.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ecs:service:DesiredCount</code> - The desired task count
     *            of an ECS service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ec2:spot-fleet-request:TargetCapacity</code> - The
     *            target capacity of a Spot Fleet request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>elasticmapreduce:instancegroup:InstanceCount</code> -
     *            The instance count of an EMR Instance Group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>appstream:fleet:DesiredCapacity</code> - The desired
     *            capacity of an AppStream 2.0 fleet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dynamodb:table:ReadCapacityUnits</code> - The
     *            provisioned read capacity for a DynamoDB table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dynamodb:table:WriteCapacityUnits</code> - The
     *            provisioned write capacity for a DynamoDB table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dynamodb:index:ReadCapacityUnits</code> - The
     *            provisioned read capacity for a DynamoDB global secondary
     *            index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>dynamodb:index:WriteCapacityUnits</code> - The
     *            provisioned write capacity for a DynamoDB global secondary
     *            index.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>rds:cluster:ReadReplicaCount</code> - The count of
     *            Aurora Replicas in an Aurora DB cluster. Available for Aurora
     *            MySQL-compatible edition and Aurora PostgreSQL-compatible
     *            edition.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sagemaker:variant:DesiredInstanceCount</code> - The
     *            number of EC2 instances for an Amazon SageMaker model endpoint
     *            variant.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>custom-resource:ResourceType:Property</code> - The
     *            scalable dimension for a custom resource provided by your own
     *            application or service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code>
     *            - The number of inference units for an Amazon Comprehend
     *            document classification endpoint.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>lambda:function:ProvisionedConcurrency</code> - The
     *            provisioned concurrency for a Lambda function.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cassandra:table:ReadCapacityUnits</code> - The
     *            provisioned read capacity for an Amazon Keyspaces table.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cassandra:table:WriteCapacityUnits</code> - The
     *            provisioned write capacity for an Amazon Keyspaces table.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScalableDimension
     */
    public PutScheduledActionRequest withScalableDimension(ScalableDimension scalableDimension) {
        this.scalableDimension = scalableDimension.toString();
        return this;
    }

    /**
     * <p>
     * The date and time for this scheduled action to start.
     * </p>
     *
     * @return <p>
     *         The date and time for this scheduled action to start.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The date and time for this scheduled action to start.
     * </p>
     *
     * @param startTime <p>
     *            The date and time for this scheduled action to start.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time for this scheduled action to start.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The date and time for this scheduled action to start.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScheduledActionRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The date and time for the recurring schedule to end.
     * </p>
     *
     * @return <p>
     *         The date and time for the recurring schedule to end.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The date and time for the recurring schedule to end.
     * </p>
     *
     * @param endTime <p>
     *            The date and time for the recurring schedule to end.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time for the recurring schedule to end.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The date and time for the recurring schedule to end.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScheduledActionRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The new minimum and maximum capacity. You can set both values or just
     * one. At the scheduled time, if the current capacity is below the minimum
     * capacity, Application Auto Scaling scales out to the minimum capacity. If
     * the current capacity is above the maximum capacity, Application Auto
     * Scaling scales in to the maximum capacity.
     * </p>
     *
     * @return <p>
     *         The new minimum and maximum capacity. You can set both values or
     *         just one. At the scheduled time, if the current capacity is below
     *         the minimum capacity, Application Auto Scaling scales out to the
     *         minimum capacity. If the current capacity is above the maximum
     *         capacity, Application Auto Scaling scales in to the maximum
     *         capacity.
     *         </p>
     */
    public ScalableTargetAction getScalableTargetAction() {
        return scalableTargetAction;
    }

    /**
     * <p>
     * The new minimum and maximum capacity. You can set both values or just
     * one. At the scheduled time, if the current capacity is below the minimum
     * capacity, Application Auto Scaling scales out to the minimum capacity. If
     * the current capacity is above the maximum capacity, Application Auto
     * Scaling scales in to the maximum capacity.
     * </p>
     *
     * @param scalableTargetAction <p>
     *            The new minimum and maximum capacity. You can set both values
     *            or just one. At the scheduled time, if the current capacity is
     *            below the minimum capacity, Application Auto Scaling scales
     *            out to the minimum capacity. If the current capacity is above
     *            the maximum capacity, Application Auto Scaling scales in to
     *            the maximum capacity.
     *            </p>
     */
    public void setScalableTargetAction(ScalableTargetAction scalableTargetAction) {
        this.scalableTargetAction = scalableTargetAction;
    }

    /**
     * <p>
     * The new minimum and maximum capacity. You can set both values or just
     * one. At the scheduled time, if the current capacity is below the minimum
     * capacity, Application Auto Scaling scales out to the minimum capacity. If
     * the current capacity is above the maximum capacity, Application Auto
     * Scaling scales in to the maximum capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scalableTargetAction <p>
     *            The new minimum and maximum capacity. You can set both values
     *            or just one. At the scheduled time, if the current capacity is
     *            below the minimum capacity, Application Auto Scaling scales
     *            out to the minimum capacity. If the current capacity is above
     *            the maximum capacity, Application Auto Scaling scales in to
     *            the maximum capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScheduledActionRequest withScalableTargetAction(
            ScalableTargetAction scalableTargetAction) {
        this.scalableTargetAction = scalableTargetAction;
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
        if (getServiceNamespace() != null)
            sb.append("ServiceNamespace: " + getServiceNamespace() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule() + ",");
        if (getScheduledActionName() != null)
            sb.append("ScheduledActionName: " + getScheduledActionName() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getScalableDimension() != null)
            sb.append("ScalableDimension: " + getScalableDimension() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getScalableTargetAction() != null)
            sb.append("ScalableTargetAction: " + getScalableTargetAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode
                + ((getScheduledActionName() == null) ? 0 : getScheduledActionName().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getScalableDimension() == null) ? 0 : getScalableDimension().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getScalableTargetAction() == null) ? 0 : getScalableTargetAction().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutScheduledActionRequest == false)
            return false;
        PutScheduledActionRequest other = (PutScheduledActionRequest) obj;

        if (other.getServiceNamespace() == null ^ this.getServiceNamespace() == null)
            return false;
        if (other.getServiceNamespace() != null
                && other.getServiceNamespace().equals(this.getServiceNamespace()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getScheduledActionName() == null ^ this.getScheduledActionName() == null)
            return false;
        if (other.getScheduledActionName() != null
                && other.getScheduledActionName().equals(this.getScheduledActionName()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getScalableDimension() == null ^ this.getScalableDimension() == null)
            return false;
        if (other.getScalableDimension() != null
                && other.getScalableDimension().equals(this.getScalableDimension()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getScalableTargetAction() == null ^ this.getScalableTargetAction() == null)
            return false;
        if (other.getScalableTargetAction() != null
                && other.getScalableTargetAction().equals(this.getScalableTargetAction()) == false)
            return false;
        return true;
    }
}
