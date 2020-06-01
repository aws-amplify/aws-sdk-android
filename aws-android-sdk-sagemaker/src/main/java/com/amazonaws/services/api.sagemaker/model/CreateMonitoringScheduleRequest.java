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
 * Creates a schedule that regularly starts Amazon SageMaker Processing Jobs to
 * monitor the data captured for an Amazon SageMaker Endoint.
 * </p>
 */
public class CreateMonitoringScheduleRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the monitoring schedule. The name must be unique within an
     * AWS Region within an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String monitoringScheduleName;

    /**
     * <p>
     * The configuration object that specifies the monitoring schedule and
     * defines the monitoring job.
     * </p>
     */
    private MonitoringScheduleConfig monitoringScheduleConfig;

    /**
     * <p>
     * (Optional) An array of key-value pairs. For more information, see <a
     * href=
     * " https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the monitoring schedule. The name must be unique within an
     * AWS Region within an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the monitoring schedule. The name must be unique
     *         within an AWS Region within an AWS account.
     *         </p>
     */
    public String getMonitoringScheduleName() {
        return monitoringScheduleName;
    }

    /**
     * <p>
     * The name of the monitoring schedule. The name must be unique within an
     * AWS Region within an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param monitoringScheduleName <p>
     *            The name of the monitoring schedule. The name must be unique
     *            within an AWS Region within an AWS account.
     *            </p>
     */
    public void setMonitoringScheduleName(String monitoringScheduleName) {
        this.monitoringScheduleName = monitoringScheduleName;
    }

    /**
     * <p>
     * The name of the monitoring schedule. The name must be unique within an
     * AWS Region within an AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param monitoringScheduleName <p>
     *            The name of the monitoring schedule. The name must be unique
     *            within an AWS Region within an AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMonitoringScheduleRequest withMonitoringScheduleName(String monitoringScheduleName) {
        this.monitoringScheduleName = monitoringScheduleName;
        return this;
    }

    /**
     * <p>
     * The configuration object that specifies the monitoring schedule and
     * defines the monitoring job.
     * </p>
     *
     * @return <p>
     *         The configuration object that specifies the monitoring schedule
     *         and defines the monitoring job.
     *         </p>
     */
    public MonitoringScheduleConfig getMonitoringScheduleConfig() {
        return monitoringScheduleConfig;
    }

    /**
     * <p>
     * The configuration object that specifies the monitoring schedule and
     * defines the monitoring job.
     * </p>
     *
     * @param monitoringScheduleConfig <p>
     *            The configuration object that specifies the monitoring
     *            schedule and defines the monitoring job.
     *            </p>
     */
    public void setMonitoringScheduleConfig(MonitoringScheduleConfig monitoringScheduleConfig) {
        this.monitoringScheduleConfig = monitoringScheduleConfig;
    }

    /**
     * <p>
     * The configuration object that specifies the monitoring schedule and
     * defines the monitoring job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringScheduleConfig <p>
     *            The configuration object that specifies the monitoring
     *            schedule and defines the monitoring job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMonitoringScheduleRequest withMonitoringScheduleConfig(
            MonitoringScheduleConfig monitoringScheduleConfig) {
        this.monitoringScheduleConfig = monitoringScheduleConfig;
        return this;
    }

    /**
     * <p>
     * (Optional) An array of key-value pairs. For more information, see <a
     * href=
     * " https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         (Optional) An array of key-value pairs. For more information, see
     *         <a href=
     *         " https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *         >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *         Management User Guide</i>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * (Optional) An array of key-value pairs. For more information, see <a
     * href=
     * " https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     *
     * @param tags <p>
     *            (Optional) An array of key-value pairs. For more information,
     *            see <a href=
     *            " https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *            >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *            Management User Guide</i>.
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
     * (Optional) An array of key-value pairs. For more information, see <a
     * href=
     * " https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            (Optional) An array of key-value pairs. For more information,
     *            see <a href=
     *            " https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *            >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *            Management User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMonitoringScheduleRequest withTags(Tag... tags) {
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
     * (Optional) An array of key-value pairs. For more information, see <a
     * href=
     * " https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            (Optional) An array of key-value pairs. For more information,
     *            see <a href=
     *            " https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *            >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *            Management User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMonitoringScheduleRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getMonitoringScheduleName() != null)
            sb.append("MonitoringScheduleName: " + getMonitoringScheduleName() + ",");
        if (getMonitoringScheduleConfig() != null)
            sb.append("MonitoringScheduleConfig: " + getMonitoringScheduleConfig() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMonitoringScheduleName() == null) ? 0 : getMonitoringScheduleName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMonitoringScheduleConfig() == null) ? 0 : getMonitoringScheduleConfig()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMonitoringScheduleRequest == false)
            return false;
        CreateMonitoringScheduleRequest other = (CreateMonitoringScheduleRequest) obj;

        if (other.getMonitoringScheduleName() == null ^ this.getMonitoringScheduleName() == null)
            return false;
        if (other.getMonitoringScheduleName() != null
                && other.getMonitoringScheduleName().equals(this.getMonitoringScheduleName()) == false)
            return false;
        if (other.getMonitoringScheduleConfig() == null
                ^ this.getMonitoringScheduleConfig() == null)
            return false;
        if (other.getMonitoringScheduleConfig() != null
                && other.getMonitoringScheduleConfig().equals(this.getMonitoringScheduleConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
