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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that identifies the CloudWatch alarm that you want Amazon
 * Route 53 health checkers to use to determine whether the specified health
 * check is healthy.
 * </p>
 */
public class AlarmIdentifier implements Serializable {
    /**
     * <p>
     * For the CloudWatch alarm that you want Route 53 health checkers to use to
     * determine whether this health check is healthy, the region that the alarm
     * was created in.
     * </p>
     * <p>
     * For the current list of CloudWatch regions, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#cw_region"
     * >Amazon CloudWatch</a> in the <i>AWS Service Endpoints</i> chapter of the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * ca-central-1, eu-central-1, eu-west-1, eu-west-2, eu-west-3, ap-east-1,
     * me-south-1, ap-south-1, ap-southeast-1, ap-southeast-2, ap-northeast-1,
     * ap-northeast-2, ap-northeast-3, eu-north-1, sa-east-1, cn-northwest-1,
     * cn-north-1, af-south-1, us-gov-west-1, us-gov-east-1, us-iso-east-1,
     * us-isob-east-1
     */
    private String region;

    /**
     * <p>
     * The name of the CloudWatch alarm that you want Amazon Route 53 health
     * checkers to use to determine whether this health check is healthy.
     * </p>
     * <note>
     * <p>
     * Route 53 supports CloudWatch alarms with the following features:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Standard-resolution metrics. High-resolution metrics aren't supported.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/publishingMetrics.html#high-resolution-metrics"
     * >High-Resolution Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Statistics: Average, Minimum, Maximum, Sum, and SampleCount. Extended
     * statistics aren't supported.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * <p>
     * For the CloudWatch alarm that you want Route 53 health checkers to use to
     * determine whether this health check is healthy, the region that the alarm
     * was created in.
     * </p>
     * <p>
     * For the current list of CloudWatch regions, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#cw_region"
     * >Amazon CloudWatch</a> in the <i>AWS Service Endpoints</i> chapter of the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * ca-central-1, eu-central-1, eu-west-1, eu-west-2, eu-west-3, ap-east-1,
     * me-south-1, ap-south-1, ap-southeast-1, ap-southeast-2, ap-northeast-1,
     * ap-northeast-2, ap-northeast-3, eu-north-1, sa-east-1, cn-northwest-1,
     * cn-north-1, af-south-1, us-gov-west-1, us-gov-east-1, us-iso-east-1,
     * us-isob-east-1
     *
     * @return <p>
     *         For the CloudWatch alarm that you want Route 53 health checkers
     *         to use to determine whether this health check is healthy, the
     *         region that the alarm was created in.
     *         </p>
     *         <p>
     *         For the current list of CloudWatch regions, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/rande.html#cw_region"
     *         >Amazon CloudWatch</a> in the <i>AWS Service Endpoints</i>
     *         chapter of the <i>Amazon Web Services General Reference</i>.
     *         </p>
     * @see CloudWatchRegion
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * For the CloudWatch alarm that you want Route 53 health checkers to use to
     * determine whether this health check is healthy, the region that the alarm
     * was created in.
     * </p>
     * <p>
     * For the current list of CloudWatch regions, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#cw_region"
     * >Amazon CloudWatch</a> in the <i>AWS Service Endpoints</i> chapter of the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * ca-central-1, eu-central-1, eu-west-1, eu-west-2, eu-west-3, ap-east-1,
     * me-south-1, ap-south-1, ap-southeast-1, ap-southeast-2, ap-northeast-1,
     * ap-northeast-2, ap-northeast-3, eu-north-1, sa-east-1, cn-northwest-1,
     * cn-north-1, af-south-1, us-gov-west-1, us-gov-east-1, us-iso-east-1,
     * us-isob-east-1
     *
     * @param region <p>
     *            For the CloudWatch alarm that you want Route 53 health
     *            checkers to use to determine whether this health check is
     *            healthy, the region that the alarm was created in.
     *            </p>
     *            <p>
     *            For the current list of CloudWatch regions, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande.html#cw_region"
     *            >Amazon CloudWatch</a> in the <i>AWS Service Endpoints</i>
     *            chapter of the <i>Amazon Web Services General Reference</i>.
     *            </p>
     * @see CloudWatchRegion
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * For the CloudWatch alarm that you want Route 53 health checkers to use to
     * determine whether this health check is healthy, the region that the alarm
     * was created in.
     * </p>
     * <p>
     * For the current list of CloudWatch regions, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#cw_region"
     * >Amazon CloudWatch</a> in the <i>AWS Service Endpoints</i> chapter of the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * ca-central-1, eu-central-1, eu-west-1, eu-west-2, eu-west-3, ap-east-1,
     * me-south-1, ap-south-1, ap-southeast-1, ap-southeast-2, ap-northeast-1,
     * ap-northeast-2, ap-northeast-3, eu-north-1, sa-east-1, cn-northwest-1,
     * cn-north-1, af-south-1, us-gov-west-1, us-gov-east-1, us-iso-east-1,
     * us-isob-east-1
     *
     * @param region <p>
     *            For the CloudWatch alarm that you want Route 53 health
     *            checkers to use to determine whether this health check is
     *            healthy, the region that the alarm was created in.
     *            </p>
     *            <p>
     *            For the current list of CloudWatch regions, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande.html#cw_region"
     *            >Amazon CloudWatch</a> in the <i>AWS Service Endpoints</i>
     *            chapter of the <i>Amazon Web Services General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CloudWatchRegion
     */
    public AlarmIdentifier withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * For the CloudWatch alarm that you want Route 53 health checkers to use to
     * determine whether this health check is healthy, the region that the alarm
     * was created in.
     * </p>
     * <p>
     * For the current list of CloudWatch regions, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#cw_region"
     * >Amazon CloudWatch</a> in the <i>AWS Service Endpoints</i> chapter of the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * ca-central-1, eu-central-1, eu-west-1, eu-west-2, eu-west-3, ap-east-1,
     * me-south-1, ap-south-1, ap-southeast-1, ap-southeast-2, ap-northeast-1,
     * ap-northeast-2, ap-northeast-3, eu-north-1, sa-east-1, cn-northwest-1,
     * cn-north-1, af-south-1, us-gov-west-1, us-gov-east-1, us-iso-east-1,
     * us-isob-east-1
     *
     * @param region <p>
     *            For the CloudWatch alarm that you want Route 53 health
     *            checkers to use to determine whether this health check is
     *            healthy, the region that the alarm was created in.
     *            </p>
     *            <p>
     *            For the current list of CloudWatch regions, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande.html#cw_region"
     *            >Amazon CloudWatch</a> in the <i>AWS Service Endpoints</i>
     *            chapter of the <i>Amazon Web Services General Reference</i>.
     *            </p>
     * @see CloudWatchRegion
     */
    public void setRegion(CloudWatchRegion region) {
        this.region = region.toString();
    }

    /**
     * <p>
     * For the CloudWatch alarm that you want Route 53 health checkers to use to
     * determine whether this health check is healthy, the region that the alarm
     * was created in.
     * </p>
     * <p>
     * For the current list of CloudWatch regions, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/rande.html#cw_region"
     * >Amazon CloudWatch</a> in the <i>AWS Service Endpoints</i> chapter of the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * ca-central-1, eu-central-1, eu-west-1, eu-west-2, eu-west-3, ap-east-1,
     * me-south-1, ap-south-1, ap-southeast-1, ap-southeast-2, ap-northeast-1,
     * ap-northeast-2, ap-northeast-3, eu-north-1, sa-east-1, cn-northwest-1,
     * cn-north-1, af-south-1, us-gov-west-1, us-gov-east-1, us-iso-east-1,
     * us-isob-east-1
     *
     * @param region <p>
     *            For the CloudWatch alarm that you want Route 53 health
     *            checkers to use to determine whether this health check is
     *            healthy, the region that the alarm was created in.
     *            </p>
     *            <p>
     *            For the current list of CloudWatch regions, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande.html#cw_region"
     *            >Amazon CloudWatch</a> in the <i>AWS Service Endpoints</i>
     *            chapter of the <i>Amazon Web Services General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CloudWatchRegion
     */
    public AlarmIdentifier withRegion(CloudWatchRegion region) {
        this.region = region.toString();
        return this;
    }

    /**
     * <p>
     * The name of the CloudWatch alarm that you want Amazon Route 53 health
     * checkers to use to determine whether this health check is healthy.
     * </p>
     * <note>
     * <p>
     * Route 53 supports CloudWatch alarms with the following features:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Standard-resolution metrics. High-resolution metrics aren't supported.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/publishingMetrics.html#high-resolution-metrics"
     * >High-Resolution Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Statistics: Average, Minimum, Maximum, Sum, and SampleCount. Extended
     * statistics aren't supported.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The name of the CloudWatch alarm that you want Amazon Route 53
     *         health checkers to use to determine whether this health check is
     *         healthy.
     *         </p>
     *         <note>
     *         <p>
     *         Route 53 supports CloudWatch alarms with the following features:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Standard-resolution metrics. High-resolution metrics aren't
     *         supported. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/publishingMetrics.html#high-resolution-metrics"
     *         >High-Resolution Metrics</a> in the <i>Amazon CloudWatch User
     *         Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Statistics: Average, Minimum, Maximum, Sum, and SampleCount.
     *         Extended statistics aren't supported.
     *         </p>
     *         </li>
     *         </ul>
     *         </note>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the CloudWatch alarm that you want Amazon Route 53 health
     * checkers to use to determine whether this health check is healthy.
     * </p>
     * <note>
     * <p>
     * Route 53 supports CloudWatch alarms with the following features:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Standard-resolution metrics. High-resolution metrics aren't supported.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/publishingMetrics.html#high-resolution-metrics"
     * >High-Resolution Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Statistics: Average, Minimum, Maximum, Sum, and SampleCount. Extended
     * statistics aren't supported.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>
     *            The name of the CloudWatch alarm that you want Amazon Route 53
     *            health checkers to use to determine whether this health check
     *            is healthy.
     *            </p>
     *            <note>
     *            <p>
     *            Route 53 supports CloudWatch alarms with the following
     *            features:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Standard-resolution metrics. High-resolution metrics aren't
     *            supported. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/publishingMetrics.html#high-resolution-metrics"
     *            >High-Resolution Metrics</a> in the <i>Amazon CloudWatch User
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Statistics: Average, Minimum, Maximum, Sum, and SampleCount.
     *            Extended statistics aren't supported.
     *            </p>
     *            </li>
     *            </ul>
     *            </note>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the CloudWatch alarm that you want Amazon Route 53 health
     * checkers to use to determine whether this health check is healthy.
     * </p>
     * <note>
     * <p>
     * Route 53 supports CloudWatch alarms with the following features:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Standard-resolution metrics. High-resolution metrics aren't supported.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/publishingMetrics.html#high-resolution-metrics"
     * >High-Resolution Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Statistics: Average, Minimum, Maximum, Sum, and SampleCount. Extended
     * statistics aren't supported.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>
     *            The name of the CloudWatch alarm that you want Amazon Route 53
     *            health checkers to use to determine whether this health check
     *            is healthy.
     *            </p>
     *            <note>
     *            <p>
     *            Route 53 supports CloudWatch alarms with the following
     *            features:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Standard-resolution metrics. High-resolution metrics aren't
     *            supported. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/publishingMetrics.html#high-resolution-metrics"
     *            >High-Resolution Metrics</a> in the <i>Amazon CloudWatch User
     *            Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Statistics: Average, Minimum, Maximum, Sum, and SampleCount.
     *            Extended statistics aren't supported.
     *            </p>
     *            </li>
     *            </ul>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlarmIdentifier withName(String name) {
        this.name = name;
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
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlarmIdentifier == false)
            return false;
        AlarmIdentifier other = (AlarmIdentifier) obj;

        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
