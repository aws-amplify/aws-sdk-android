/*
 * Copyright 2013-2015 Amazon Technologies, Inc.
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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class RegionDefaults {
    public static List<Region> getRegions() {

        List<Region> ret = new ArrayList<Region>();
        Region region;

        region = new Region("us-east-1", "");
        ret.add(region);

        updateRegion(region, "s3", "s3.amazonaws.com", true, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);
        updateRegion(region, "monitoring", "monitoring.us-east-1.amazonaws.com", true, true);
        updateRegion(region, "sns", "sns.us-east-1.amazonaws.com", true, true);
        updateRegion(region, "autoscaling", "autoscaling.us-east-1.amazonaws.com", true, true);
        updateRegion(region, "sdb", "sdb.amazonaws.com", true, true);
        updateRegion(region, "dynamodb", "dynamodb.us-east-1.amazonaws.com", true, true);
        updateRegion(region, "ec2", "ec2.us-east-1.amazonaws.com", true, true);
        updateRegion(region, "kinesis", "kinesis.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.us-east-1.amazonaws.com", true, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.us-east-1.amazonaws.com", true, true);
        updateRegion(region, "email", "email.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "cognito-sync", "cognito-sync.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "cognito-identity", "cognito-identity.us-east-1.amazonaws.com", false,
                true);
        updateRegion(region, "ers", "mobileanalytics.us-east-1.amazonaws.com", false, true);
        updateRegion(region, "machinelearning", "machinelearning.us-east-1.amazonaws.com", false,
                true);

        region = new Region("us-west-1", "");
        ret.add(region);

        updateRegion(region, "s3", "s3-us-west-1.amazonaws.com", true, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);
        updateRegion(region, "monitoring", "monitoring.us-west-1.amazonaws.com", true, true);
        updateRegion(region, "sns", "sns.us-west-1.amazonaws.com", true, true);
        updateRegion(region, "autoscaling", "autoscaling.us-west-1.amazonaws.com", true, true);
        updateRegion(region, "sdb", "sdb.us-west-1.amazonaws.com", true, true);
        updateRegion(region, "dynamodb", "dynamodb.us-west-1.amazonaws.com", true, true);
        updateRegion(region, "ec2", "ec2.us-west-1.amazonaws.com", true, true);
        updateRegion(region, "kinesis", "kinesis.us-west-1.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.us-west-1.amazonaws.com", true, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.us-west-1.amazonaws.com", true, true);

        region = new Region("us-west-2", "");
        ret.add(region);

        updateRegion(region, "s3", "s3-us-west-2.amazonaws.com", true, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);
        updateRegion(region, "monitoring", "monitoring.us-west-2.amazonaws.com", true, true);
        updateRegion(region, "sns", "sns.us-west-2.amazonaws.com", true, true);
        updateRegion(region, "autoscaling", "autoscaling.us-west-2.amazonaws.com", true, true);
        updateRegion(region, "sdb", "sdb.us-west-2.amazonaws.com", true, true);
        updateRegion(region, "dynamodb", "dynamodb.us-west-2.amazonaws.com", true, true);
        updateRegion(region, "ec2", "ec2.us-west-2.amazonaws.com", true, true);
        updateRegion(region, "kinesis", "kinesis.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.us-west-2.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.us-west-2.amazonaws.com", true, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.us-west-2.amazonaws.com", true, true);
        updateRegion(region, "email", "email.us-west-2.amazonaws.com", false, true);

        region = new Region("ap-northeast-1", "");
        ret.add(region);

        updateRegion(region, "s3", "s3-ap-northeast-1.amazonaws.com", true, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);
        updateRegion(region, "monitoring", "monitoring.ap-northeast-1.amazonaws.com", true, true);
        updateRegion(region, "sns", "sns.ap-northeast-1.amazonaws.com", true, true);
        updateRegion(region, "autoscaling", "autoscaling.ap-northeast-1.amazonaws.com", true, true);
        updateRegion(region, "sdb", "sdb.ap-northeast-1.amazonaws.com", true, true);
        updateRegion(region, "dynamodb", "dynamodb.ap-northeast-1.amazonaws.com", true, true);
        updateRegion(region, "ec2", "ec2.ap-northeast-1.amazonaws.com", true, true);
        updateRegion(region, "kinesis", "kinesis.ap-northeast-1.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.ap-northeast-1.amazonaws.com", true, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.ap-northeast-1.amazonaws.com", true, true);

        region = new Region("ap-southeast-1", "");
        ret.add(region);

        updateRegion(region, "s3", "s3-ap-southeast-1.amazonaws.com", true, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);
        updateRegion(region, "monitoring", "monitoring.ap-southeast-1.amazonaws.com", true, true);
        updateRegion(region, "sns", "sns.ap-southeast-1.amazonaws.com", true, true);
        updateRegion(region, "autoscaling", "autoscaling.ap-southeast-1.amazonaws.com", true, true);
        updateRegion(region, "sdb", "sdb.ap-southeast-1.amazonaws.com", true, true);
        updateRegion(region, "dynamodb", "dynamodb.ap-southeast-1.amazonaws.com", true, true);
        updateRegion(region, "ec2", "ec2.ap-southeast-1.amazonaws.com", true, true);
        updateRegion(region, "kinesis", "kinesis.ap-southeast-1.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.ap-southeast-1.amazonaws.com", true, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.ap-southeast-1.amazonaws.com", true, true);

        region = new Region("ap-southeast-2", "");
        ret.add(region);

        updateRegion(region, "s3", "s3-ap-southeast-2.amazonaws.com", true, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);
        updateRegion(region, "monitoring", "monitoring.ap-southeast-2.amazonaws.com", true, true);
        updateRegion(region, "sns", "sns.ap-southeast-2.amazonaws.com", true, true);
        updateRegion(region, "autoscaling", "autoscaling.ap-southeast-2.amazonaws.com", true, true);
        updateRegion(region, "sdb", "sdb.ap-southeast-2.amazonaws.com", true, true);
        updateRegion(region, "dynamodb", "dynamodb.ap-southeast-2.amazonaws.com", true, true);
        updateRegion(region, "ec2", "ec2.ap-southeast-2.amazonaws.com", true, true);
        updateRegion(region, "kinesis", "kinesis.ap-southeast-2.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.ap-southeast-2.amazonaws.com", true, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.ap-southeast-2.amazonaws.com", true, true);

        region = new Region("sa-east-1", "");
        ret.add(region);

        updateRegion(region, "s3", "s3-sa-east-1.amazonaws.com", true, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);
        updateRegion(region, "monitoring", "monitoring.sa-east-1.amazonaws.com", true, true);
        updateRegion(region, "sns", "sns.sa-east-1.amazonaws.com", true, true);
        updateRegion(region, "autoscaling", "autoscaling.sa-east-1.amazonaws.com", true, true);
        updateRegion(region, "sdb", "sdb.sa-east-1.amazonaws.com", true, true);
        updateRegion(region, "dynamodb", "dynamodb.sa-east-1.amazonaws.com", true, true);
        updateRegion(region, "ec2", "ec2.sa-east-1.amazonaws.com", true, true);
        updateRegion(region, "sqs", "sqs.sa-east-1.amazonaws.com", true, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.sa-east-1.amazonaws.com", true, true);

        region = new Region("eu-west-1", "");
        ret.add(region);

        updateRegion(region, "s3", "s3-eu-west-1.amazonaws.com", true, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);
        updateRegion(region, "monitoring", "monitoring.eu-west-1.amazonaws.com", true, true);
        updateRegion(region, "sns", "sns.eu-west-1.amazonaws.com", true, true);
        updateRegion(region, "autoscaling", "autoscaling.eu-west-1.amazonaws.com", true, true);
        updateRegion(region, "sdb", "sdb.eu-west-1.amazonaws.com", true, true);
        updateRegion(region, "dynamodb", "dynamodb.eu-west-1.amazonaws.com", true, true);
        updateRegion(region, "ec2", "ec2.eu-west-1.amazonaws.com", true, true);
        updateRegion(region, "kinesis", "kinesis.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "lambda", "lambda.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "sqs", "sqs.eu-west-1.amazonaws.com", true, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.eu-west-1.amazonaws.com", true, true);
        updateRegion(region, "email", "email.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "cognito-sync", "cognito-sync.eu-west-1.amazonaws.com", false, true);
        updateRegion(region, "cognito-identity", "cognito-identity.eu-west-1.amazonaws.com", false,
                true);

        region = new Region("eu-central-1", "");
        ret.add(region);

        updateRegion(region, "sqs", "sqs.eu-central-1.amazonaws.com", true, true);
        updateRegion(region, "s3", "s3.eu-central-1.amazonaws.com", true, true);
        updateRegion(region, "sts", "sts.amazonaws.com", false, true);
        updateRegion(region, "monitoring", "monitoring.eu-central-1.amazonaws.com", true, true);
        updateRegion(region, "sns", "sns.eu-central-1.amazonaws.com", true, true);
        updateRegion(region, "autoscaling", "autoscaling.eu-central-1.amazonaws.com", true, true);
        updateRegion(region, "dynamodb", "dynamodb.eu-central-1.amazonaws.com", true, true);
        updateRegion(region, "ec2", "ec2.eu-central-1.amazonaws.com", true, true);
        updateRegion(region, "kinesis", "kinesis.eu-central-1.amazonaws.com", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.eu-central-1.amazonaws.com", true, true);

        region = new Region("cn-north-1", "amazonaws.com.cn");
        ret.add(region);

        updateRegion(region, "dynamodb", "dynamodb.cn-north-1.amazonaws.com.cn", true, true);
        updateRegion(region, "ec2", "ec2.cn-north-1.amazonaws.com.cn", true, true);
        updateRegion(region, "sns", "sns.cn-north-1.amazonaws.com.cn", true, true);
        updateRegion(region, "sqs", "sqs.cn-north-1.amazonaws.com.cn", true, true);
        updateRegion(region, "s3", "s3.cn-north-1.amazonaws.com.cn", true, true);
        updateRegion(region, "sts", "sts.cn-north-1.amazonaws.com.cn", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.cn-north-1.amazonaws.com.cn", true, true);
        updateRegion(region, "autoscaling", "autoscaling.cn-north-1.amazonaws.com.cn", true, true);
        updateRegion(region, "monitoring", "monitoring.cn-north-1.amazonaws.com.cn", true, true);

        region = new Region("us-gov-west-1", "");
        ret.add(region);

        updateRegion(region, "dynamodb", "dynamodb.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(region, "ec2", "ec2.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(region, "sns", "sns.us-gov-west-1.amazonaws.com", true, true);
        updateRegion(region, "sqs", "sqs.us-gov-west-1.amazonaws.com", true, true);
        updateRegion(region, "s3", "s3-us-gov-west-1.amazonaws.com", true, true);
        updateRegion(region, "sts", "sts.us-gov-west-1.amazonaws.com", false, true);
        updateRegion(region, "elasticloadbalancing",
                "elasticloadbalancing.us-gov-west-1.amazonaws.com", true, true);
        updateRegion(region, "autoscaling", "autoscaling.us-gov-west-1.amazonaws.com", true, true);
        updateRegion(region, "monitoring", "monitoring.us-gov-west-1.amazonaws.com", false, true);

        return ret;
    }

    private static void updateRegion(Region region, String service, String host,
            boolean http, boolean https) {

        Map<String, String> serviceEndpoints = region.getServiceEndpoints();
        Map<String, Boolean> httpSupport = region.getHttpSupport();
        Map<String, Boolean> httpsSupport = region.getHttpsSupport();

        serviceEndpoints.put(service, host);
        httpSupport.put(service, http);
        httpsSupport.put(service, https);
    }

}
