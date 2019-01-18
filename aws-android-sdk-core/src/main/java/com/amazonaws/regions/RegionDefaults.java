/*
 * Copyright 2010-2019- Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.regions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class RegionDefaults {
    public static List<Region> getRegions() {

        final List<Region> ret = new ArrayList<Region>();
        Region region;

        region = new Region("ap-northeast-1", "amazonaws.com");
        ret.add(region);
        updateRegion(region, "autoscaling", "autoscaling.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(region, "cognito-identity", "cognito-identity.ap-northeast-1.amazonaws.com",
                false, true);
        updateRegion(region, "cognito-idp", "cognito-idp.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(region, "cognito-sync", "cognito-sync.ap-northeast-1.amazonaws.com", false,
                true);
        updateRegion(region, "data.iot", "data.iot.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(region, "dynamodb", "dynamodb.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(region, "ec2", "ec2.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(region, "firehose", "firehose.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(region, "iot", "iot.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(region, "kinesis", "kinesis.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(region, "kms", "kms.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(region, "logs", "logs.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(region, "polly", "polly.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(region, "s3", "s3.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(region, "sdb", "sdb.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(region, "sns", "sns.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);

        region = new Region("ap-northeast-2", "amazonaws.com");
        ret.add(region);
        updateRegion(region, "autoscaling", "autoscaling.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(region, "cognito-identity", "cognito-identity.ap-northeast-2.amazonaws.com",
                false, true);
        updateRegion(region, "cognito-idp", "cognito-idp.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(region, "cognito-sync", "cognito-sync.ap-northeast-2.amazonaws.com", false,
                true);
        updateRegion(region, "data.iot", "data.iot.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(region, "dynamodb", "dynamodb.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(region, "ec2", "ec2.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(region, "iot", "iot.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(region, "kinesis", "kinesis.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(region, "kms", "kms.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(region, "logs", "logs.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(region, "polly", "polly.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(region, "s3", "s3.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(region, "sns", "sns.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.ap-northeast-2.amazonaws.com", false, true);
        updateRegion(region, "sts", "sts.ap-northeast-2.amazonaws.com", false, true);

        region = new Region("ap-south-1", "amazonaws.com");
        ret.add(region);
        updateRegion(region, "autoscaling", "autoscaling.ap-south-1.amazonaws.com", false, true);
        updateRegion(region, "cognito-identity", "cognito-identity.ap-south-1.amazonaws.com",
                false, true);
        updateRegion(region, "cognito-idp", "cognito-idp.ap-south-1.amazonaws.com", false, true);
        updateRegion(region, "cognito-sync", "cognito-sync.ap-south-1.amazonaws.com", false, true);
        updateRegion(region, "dynamodb", "dynamodb.ap-south-1.amazonaws.com", false, true);
        updateRegion(region, "ec2", "ec2.ap-south-1.amazonaws.com", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.ap-south-1.amazonaws.com", false, true);
        updateRegion(region, "kinesis", "kinesis.ap-south-1.amazonaws.com", false, true);
        updateRegion(region, "kms", "kms.ap-south-1.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.ap-south-1.amazonaws.com", false, true);
        updateRegion(region, "logs", "logs.ap-south-1.amazonaws.com", false, true);
        updateRegion(region, "polly", "polly.ap-south-1.amazonaws.com", false, true);
        updateRegion(region, "s3", "s3.ap-south-1.amazonaws.com", false, true);
        updateRegion(region, "sns", "sns.ap-south-1.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.ap-south-1.amazonaws.com", false, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);

        region = new Region("ap-southeast-1", "amazonaws.com");
        ret.add(region);
        updateRegion(region, "autoscaling", "autoscaling.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(region, "cognito-identity", "cognito-identity.ap-southeast-1.amazonaws.com",
                false, true);
        updateRegion(region, "cognito-idp", "cognito-idp.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(region, "cognito-sync", "cognito-sync.ap-southeast-1.amazonaws.com", false,
                true);
        updateRegion(region, "data.iot", "data.iot.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(region, "dynamodb", "dynamodb.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(region, "ec2", "ec2.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(region, "iot", "iot.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(region, "kinesis", "kinesis.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(region, "kms", "kms.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(region, "logs", "logs.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(region, "polly", "polly.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(region, "s3", "s3.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(region, "sdb", "sdb.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(region, "sns", "sns.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);

        region = new Region("ap-southeast-2", "amazonaws.com");
        ret.add(region);
        updateRegion(region, "autoscaling", "autoscaling.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(region, "cognito-identity", "cognito-identity.ap-southeast-2.amazonaws.com",
                false, true);
        updateRegion(region, "cognito-idp", "cognito-idp.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(region, "cognito-sync", "cognito-sync.ap-southeast-2.amazonaws.com", false,
                true);
        updateRegion(region, "data.iot", "data.iot.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(region, "dynamodb", "dynamodb.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(region, "ec2", "ec2.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(region, "iot", "iot.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(region, "kinesis", "kinesis.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(region, "kms", "kms.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(region, "logs", "logs.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(region, "polly", "polly.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(region, "s3", "s3.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(region, "sdb", "sdb.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(region, "sns", "sns.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);

        region = new Region("ca-central-1", "amazonaws.com");
        ret.add(region);
        updateRegion(region, "autoscaling", "autoscaling.ca-central-1.amazonaws.com", false, true);
        updateRegion(region, "dynamodb", "dynamodb.ca-central-1.amazonaws.com", false, true);
        updateRegion(region, "ec2", "ec2.ca-central-1.amazonaws.com", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.ca-central-1.amazonaws.com", false, true);
        updateRegion(region, "kinesis", "kinesis.ca-central-1.amazonaws.com", false, true);
        updateRegion(region, "kms", "kms.ca-central-1.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.ca-central-1.amazonaws.com", false, true);
        updateRegion(region, "logs", "logs.ca-central-1.amazonaws.com", false, true);
        updateRegion(region, "polly", "polly.ca-central-1.amazonaws.com", false, true);
        updateRegion(region, "s3", "s3.ca-central-1.amazonaws.com", false, true);
        updateRegion(region, "sns", "sns.ca-central-1.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.ca-central-1.amazonaws.com", false, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);

        region = new Region("eu-central-1", "amazonaws.com");
        ret.add(region);
        updateRegion(region, "autoscaling", "autoscaling.eu-central-1.amazonaws.com", false, true);
        updateRegion(region, "cognito-identity", "cognito-identity.eu-central-1.amazonaws.com",
                false, true);
        updateRegion(region, "cognito-idp", "cognito-idp.eu-central-1.amazonaws.com", false, true);
        updateRegion(region, "cognito-sync", "cognito-sync.eu-central-1.amazonaws.com", false, true);
        updateRegion(region, "data.iot", "data.iot.eu-central-1.amazonaws.com", false, true);
        updateRegion(region, "dynamodb", "dynamodb.eu-central-1.amazonaws.com", false, true);
        updateRegion(region, "ec2", "ec2.eu-central-1.amazonaws.com", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.eu-central-1.amazonaws.com", false, true);
        updateRegion(region, "firehose", "firehose.eu-central-1.amazonaws.com", false, true);
        updateRegion(region, "iot", "iot.eu-central-1.amazonaws.com", false, true);
        updateRegion(region, "kinesis", "kinesis.eu-central-1.amazonaws.com", false, true);
        updateRegion(region, "kms", "kms.eu-central-1.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.eu-central-1.amazonaws.com", false, true);
        updateRegion(region, "logs", "logs.eu-central-1.amazonaws.com", false, true);
        updateRegion(region, "polly", "polly.eu-central-1.amazonaws.com", false, true);
        updateRegion(region, "s3", "s3.eu-central-1.amazonaws.com", false, true);
        updateRegion(region, "sns", "sns.eu-central-1.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.eu-central-1.amazonaws.com", false, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);

        region = new Region("eu-west-1", "amazonaws.com");
        ret.add(region);
        updateRegion(region, "autoscaling", "autoscaling.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "cognito-identity", "cognito-identity.eu-west-1.amazonaws.com", false,
                true);
        updateRegion(region, "cognito-idp", "cognito-idp.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "cognito-sync", "cognito-sync.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "data.iot", "data.iot.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "dynamodb", "dynamodb.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "ec2", "ec2.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "email", "email.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "firehose", "firehose.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "iot", "iot.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "kinesis", "kinesis.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "kms", "kms.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "logs", "logs.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "machinelearning", "machinelearning.eu-west-1.amazonaws.com", false,
                true);
        updateRegion(region, "polly", "polly.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "rekognition", "rekognition.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "s3", "s3.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "sdb", "sdb.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "sns", "sns.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);

        region = new Region("eu-west-2", "amazonaws.com");
        ret.add(region);
        updateRegion(region, "autoscaling", "autoscaling.eu-west-2.amazonaws.com", false, true);
        updateRegion(region, "cognito-identity", "cognito-identity.eu-west-2.amazonaws.com", false,
                true);
        updateRegion(region, "cognito-idp", "cognito-idp.eu-west-2.amazonaws.com", false, true);
        updateRegion(region, "cognito-sync", "cognito-sync.eu-west-2.amazonaws.com", false, true);
        updateRegion(region, "dynamodb", "dynamodb.eu-west-2.amazonaws.com", false, true);
        updateRegion(region, "ec2", "ec2.eu-west-2.amazonaws.com", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.eu-west-2.amazonaws.com", false, true);
        updateRegion(region, "iot", "iot.eu-west-2.amazonaws.com", false, true);
        updateRegion(region, "kinesis", "kinesis.eu-west-2.amazonaws.com", false, true);
        updateRegion(region, "kms", "kms.eu-west-2.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.eu-west-2.amazonaws.com", false, true);
        updateRegion(region, "logs", "logs.eu-west-2.amazonaws.com", false, true);
        updateRegion(region, "polly", "polly.eu-west-2.amazonaws.com", false, true);
        updateRegion(region, "s3", "s3.eu-west-2.amazonaws.com", false, true);
        updateRegion(region, "sns", "sns.eu-west-2.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.eu-west-2.amazonaws.com", false, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);

        region = new Region("eu-west-3", "amazonaws.com");
        ret.add(region);
        updateRegion(region, "autoscaling", "autoscaling.eu-west-3.amazonaws.com", false, true);
        updateRegion(region, "dynamodb", "dynamodb.eu-west-3.amazonaws.com", false, true);
        updateRegion(region, "ec2", "ec2.eu-west-3.amazonaws.com", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.eu-west-3.amazonaws.com", false, true);
        updateRegion(region, "kinesis", "kinesis.eu-west-3.amazonaws.com", false, true);
        updateRegion(region, "kms", "kms.eu-west-3.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.eu-west-3.amazonaws.com", false, true);
        updateRegion(region, "logs", "logs.eu-west-3.amazonaws.com", false, true);
        updateRegion(region, "polly", "polly.eu-west-3.amazonaws.com", false, true);
        updateRegion(region, "s3", "s3.eu-west-3.amazonaws.com", false, true);
        updateRegion(region, "sns", "sns.eu-west-3.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.eu-west-3.amazonaws.com", false, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);

        region = new Region("sa-east-1", "amazonaws.com");
        ret.add(region);
        updateRegion(region, "autoscaling", "autoscaling.sa-east-1.amazonaws.com", false, true);
        updateRegion(region, "dynamodb", "dynamodb.sa-east-1.amazonaws.com", false, true);
        updateRegion(region, "ec2", "ec2.sa-east-1.amazonaws.com", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.sa-east-1.amazonaws.com", false, true);
        updateRegion(region, "kinesis", "kinesis.sa-east-1.amazonaws.com", false, true);
        updateRegion(region, "kms", "kms.sa-east-1.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.sa-east-1.amazonaws.com", false, true);
        updateRegion(region, "logs", "logs.sa-east-1.amazonaws.com", false, true);
        updateRegion(region, "polly", "polly.sa-east-1.amazonaws.com", false, true);
        updateRegion(region, "s3", "s3.sa-east-1.amazonaws.com", false, true);
        updateRegion(region, "sdb", "sdb.sa-east-1.amazonaws.com", false, true);
        updateRegion(region, "sns", "sns.sa-east-1.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.sa-east-1.amazonaws.com", false, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);

        region = new Region("us-east-1", "amazonaws.com");
        ret.add(region);
        updateRegion(region, "autoscaling", "autoscaling.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "cognito-identity", "cognito-identity.us-east-1.amazonaws.com", false,
                true);
        updateRegion(region, "cognito-idp", "cognito-idp.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "cognito-sync", "cognito-sync.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "data.iot", "data.iot.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "dynamodb", "dynamodb.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "ec2", "ec2.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "email", "email.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "firehose", "firehose.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "iot", "iot.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "kinesis", "kinesis.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "kms", "kms.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "logs", "logs.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "machinelearning", "machinelearning.us-east-1.amazonaws.com", false,
                true);
        updateRegion(region, "mobileanalytics", "mobileanalytics.us-east-1.amazonaws.com", false,
                true);
        updateRegion(region, "pinpoint", "pinpoint.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "polly", "polly.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "rekognition", "rekognition.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "s3", "s3.amazonaws.com", false, true);
        updateRegion(region, "sdb", "sdb.amazonaws.com", false, true);
        updateRegion(region, "sns", "sns.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);

        region = new Region("us-east-2", "amazonaws.com");
        ret.add(region);
        updateRegion(region, "autoscaling", "autoscaling.us-east-2.amazonaws.com", false, true);
        updateRegion(region, "cognito-identity", "cognito-identity.us-east-2.amazonaws.com", false,
                true);
        updateRegion(region, "cognito-idp", "cognito-idp.us-east-2.amazonaws.com", false, true);
        updateRegion(region, "cognito-sync", "cognito-sync.us-east-2.amazonaws.com", false, true);
        updateRegion(region, "dynamodb", "dynamodb.us-east-2.amazonaws.com", false, true);
        updateRegion(region, "ec2", "ec2.us-east-2.amazonaws.com", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.us-east-2.amazonaws.com", false, true);
        updateRegion(region, "firehose", "firehose.us-east-2.amazonaws.com", false, true);
        updateRegion(region, "iot", "iot.us-east-2.amazonaws.com", false, true);
        updateRegion(region, "kinesis", "kinesis.us-east-2.amazonaws.com", false, true);
        updateRegion(region, "kms", "kms.us-east-2.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.us-east-2.amazonaws.com", false, true);
        updateRegion(region, "logs", "logs.us-east-2.amazonaws.com", false, true);
        updateRegion(region, "polly", "polly.us-east-2.amazonaws.com", false, true);
        updateRegion(region, "s3", "s3.us-east-2.amazonaws.com", false, true);
        updateRegion(region, "sns", "sns.us-east-2.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.us-east-2.amazonaws.com", false, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);

        region = new Region("us-west-1", "amazonaws.com");
        ret.add(region);
        updateRegion(region, "autoscaling", "autoscaling.us-west-1.amazonaws.com", false, true);
        updateRegion(region, "dynamodb", "dynamodb.us-west-1.amazonaws.com", false, true);
        updateRegion(region, "ec2", "ec2.us-west-1.amazonaws.com", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.us-west-1.amazonaws.com", false, true);
        updateRegion(region, "kinesis", "kinesis.us-west-1.amazonaws.com", false, true);
        updateRegion(region, "kms", "kms.us-west-1.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.us-west-1.amazonaws.com", false, true);
        updateRegion(region, "logs", "logs.us-west-1.amazonaws.com", false, true);
        updateRegion(region, "polly", "polly.us-west-1.amazonaws.com", false, true);
        updateRegion(region, "s3", "s3.us-west-1.amazonaws.com", false, true);
        updateRegion(region, "sdb", "sdb.us-west-1.amazonaws.com", false, true);
        updateRegion(region, "sns", "sns.us-west-1.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.us-west-1.amazonaws.com", false, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);

        region = new Region("us-west-2", "amazonaws.com");
        ret.add(region);
        updateRegion(region, "autoscaling", "autoscaling.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "cognito-identity", "cognito-identity.us-west-2.amazonaws.com", false,
                true);
        updateRegion(region, "cognito-idp", "cognito-idp.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "cognito-sync", "cognito-sync.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "data.iot", "data.iot.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "dynamodb", "dynamodb.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "ec2", "ec2.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "email", "email.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "firehose", "firehose.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "iot", "iot.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "kinesis", "kinesis.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "kms", "kms.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "logs", "logs.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "polly", "polly.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "rekognition", "rekognition.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "s3", "s3.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "sdb", "sdb.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "sns", "sns.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);

        region = new Region("cn-north-1", "amazonaws.com.cn");
        ret.add(region);
        updateRegion(region, "autoscaling", "autoscaling.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(region, "cognito-identity", "cognito-identity.cn-north-1.amazonaws.com.cn",
                false, true);
        updateRegion(region, "dynamodb", "dynamodb.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(region, "ec2", "ec2.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(region, "iot", "iot.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(region, "kinesis", "kinesis.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(region, "lambda", "lambda.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(region, "logs", "logs.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(region, "s3", "s3.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(region, "sns", "sns.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(region, "sqs", "sqs.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(region, "sts", "sts.cn-north-1.amazonaws.com.cn", false, true);

        region = new Region("cn-northwest-1", "amazonaws.com.cn");
        ret.add(region);
        updateRegion(region, "autoscaling", "autoscaling.cn-northwest-1.amazonaws.com.cn", false,
                true);
        updateRegion(region, "dynamodb", "dynamodb.cn-northwest-1.amazonaws.com.cn", false, true);
        updateRegion(region, "ec2", "ec2.cn-northwest-1.amazonaws.com.cn", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.cn-northwest-1.amazonaws.com.cn", false, true);
        updateRegion(region, "kinesis", "kinesis.cn-northwest-1.amazonaws.com.cn", false, true);
        updateRegion(region, "logs", "logs.cn-northwest-1.amazonaws.com.cn", false, true);
        updateRegion(region, "s3", "s3.cn-northwest-1.amazonaws.com.cn", false, true);
        updateRegion(region, "sns", "sns.cn-northwest-1.amazonaws.com.cn", false, true);
        updateRegion(region, "sqs", "sqs.cn-northwest-1.amazonaws.com.cn", false, true);
        updateRegion(region, "sts", "sts.amazonaws.com.cn", false, true);

        region = new Region("us-gov-west-1", "amazonaws.com");
        ret.add(region);
        updateRegion(region, "autoscaling", "autoscaling.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(region, "dynamodb", "dynamodb.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(region, "ec2", "ec2.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(region, "kinesis", "kinesis.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(region, "kms", "kms.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(region, "logs", "logs.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(region, "rekognition", "rekognition.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(region, "s3", "s3.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(region, "sns", "sns.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);
        return ret;
    }

    private static void updateRegion(Region region, String service, String host,
            boolean http, boolean https) {

        final Map<String, String> serviceEndpoints = region.getServiceEndpoints();
        final Map<String, Boolean> httpSupport = region.getHttpSupport();
        final Map<String, Boolean> httpsSupport = region.getHttpsSupport();

        serviceEndpoints.put(service, host);
        httpSupport.put(service, http);
        httpsSupport.put(service, https);
    }

}
