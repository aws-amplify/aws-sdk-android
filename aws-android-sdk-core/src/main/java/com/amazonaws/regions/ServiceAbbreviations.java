/*
 * Copyright 2013-2019 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.regions;

/**
 * Abbreviations for looking up information about a specific service. Used in
 * {@link Region#getServiceEndpoint(String)} and related methods.
 */
@SuppressWarnings("checkstyle:constantname")
public final class ServiceAbbreviations {

    /** cloudformation. */
    public static final String CloudFormation = "cloudformation";

    /** cloudfront. */
    public static final String CloudFront = "cloudfront";

    /** cloudsearch. */
    public static final String CloudSearch = "cloudsearch";

    /** cloudwatch. */
    public static final String CloudWatch = "monitoring";

    /** dynamodb. */
    public static final String Dynamodb = "dynamodb";

    /** ec2. */
    public static final String EC2 = "ec2";

    /** elastic map reduce. */
    public static final String ElasticMapReduce = "elasticmapreduce";

    /** elasticache. */
    public static final String Elasticache = "elasticache";

    /** rds. */
    public static final String RDS = "rds";

    /** route53. */
    public static final String Route53 = "route53";

    /** email. */
    public static final String Email = "email";

    /** simple db. */
    public static final String SimpleDB = "sdb";

    /** sns. */
    public static final String SNS = "sns";

    /** sqs. */
    public static final String SQS = "sqs";

    /** s3. */
    public static final String S3 = "s3";

    /** autosclaing. */
    public static final String Autoscaling = "autoscaling";

    /** elastic bean stalk. */
    public static final String ElasticBeanstalk = "elasticbeanstalk";

    /** iam. */
    public static final String IAM = "iam";

    /** import export. */
    public static final String ImportExport = "importexport";

    /** sts. */
    public static final String STS = "sts";

    /** storage gateway. */
    public static final String StorageGateway = "storagegateway";

    /** elastic load balancing. */
    public static final String ElasticLoadbalancing = "elasticloadbalancing";

    /** simple workflow. */
    public static final String SimpleWorkflow = "swf";

    /** glacier. */
    public static final String Glacier = "glacier";

    /** direct connect. */
    public static final String DirectConnect = "directconnect";

    /** data pipeline. */
    public static final String DataPipeline = "datapipeline";

    /** redshift. */
    public static final String RedShift = "redshift";

    /** opsworks. */
    public static final String Opsworks = "opsworks";

    /** elastic transcoder. */
    public static final String ElasticTranscoder = "elastictranscoder";
}
