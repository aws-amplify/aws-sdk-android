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
 * A complex type that contains information about one health check that is
 * associated with the current AWS account.
 * </p>
 */
public class HealthCheck implements Serializable {
    /**
     * <p>
     * The identifier that Amazon Route 53assigned to the health check when you
     * created it. When you add or update a resource record set, you use this
     * value to specify which health check to use. The value can be up to 64
     * characters long.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String id;

    /**
     * <p>
     * A unique string that you specified when you created the health check.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String callerReference;

    /**
     * <p>
     * If the health check was created by another service, the service that
     * created the health check. When a health check is created by another
     * service, you can't edit or delete it using Amazon Route 53.
     * </p>
     */
    private LinkedService linkedService;

    /**
     * <p>
     * A complex type that contains detailed information about one health check.
     * </p>
     */
    private HealthCheckConfig healthCheckConfig;

    /**
     * <p>
     * The version of the health check. You can optionally pass this value in a
     * call to <code>UpdateHealthCheck</code> to prevent overwriting another
     * change to the health check.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long healthCheckVersion;

    /**
     * <p>
     * A complex type that contains information about the CloudWatch alarm that
     * Amazon Route 53 is monitoring for this health check.
     * </p>
     */
    private CloudWatchAlarmConfiguration cloudWatchAlarmConfiguration;

    /**
     * <p>
     * The identifier that Amazon Route 53assigned to the health check when you
     * created it. When you add or update a resource record set, you use this
     * value to specify which health check to use. The value can be up to 64
     * characters long.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The identifier that Amazon Route 53assigned to the health check
     *         when you created it. When you add or update a resource record
     *         set, you use this value to specify which health check to use. The
     *         value can be up to 64 characters long.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier that Amazon Route 53assigned to the health check when you
     * created it. When you add or update a resource record set, you use this
     * value to specify which health check to use. The value can be up to 64
     * characters long.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param id <p>
     *            The identifier that Amazon Route 53assigned to the health
     *            check when you created it. When you add or update a resource
     *            record set, you use this value to specify which health check
     *            to use. The value can be up to 64 characters long.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier that Amazon Route 53assigned to the health check when you
     * created it. When you add or update a resource record set, you use this
     * value to specify which health check to use. The value can be up to 64
     * characters long.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param id <p>
     *            The identifier that Amazon Route 53assigned to the health
     *            check when you created it. When you add or update a resource
     *            record set, you use this value to specify which health check
     *            to use. The value can be up to 64 characters long.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheck withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * A unique string that you specified when you created the health check.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         A unique string that you specified when you created the health
     *         check.
     *         </p>
     */
    public String getCallerReference() {
        return callerReference;
    }

    /**
     * <p>
     * A unique string that you specified when you created the health check.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param callerReference <p>
     *            A unique string that you specified when you created the health
     *            check.
     *            </p>
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique string that you specified when you created the health check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param callerReference <p>
     *            A unique string that you specified when you created the health
     *            check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheck withCallerReference(String callerReference) {
        this.callerReference = callerReference;
        return this;
    }

    /**
     * <p>
     * If the health check was created by another service, the service that
     * created the health check. When a health check is created by another
     * service, you can't edit or delete it using Amazon Route 53.
     * </p>
     *
     * @return <p>
     *         If the health check was created by another service, the service
     *         that created the health check. When a health check is created by
     *         another service, you can't edit or delete it using Amazon Route
     *         53.
     *         </p>
     */
    public LinkedService getLinkedService() {
        return linkedService;
    }

    /**
     * <p>
     * If the health check was created by another service, the service that
     * created the health check. When a health check is created by another
     * service, you can't edit or delete it using Amazon Route 53.
     * </p>
     *
     * @param linkedService <p>
     *            If the health check was created by another service, the
     *            service that created the health check. When a health check is
     *            created by another service, you can't edit or delete it using
     *            Amazon Route 53.
     *            </p>
     */
    public void setLinkedService(LinkedService linkedService) {
        this.linkedService = linkedService;
    }

    /**
     * <p>
     * If the health check was created by another service, the service that
     * created the health check. When a health check is created by another
     * service, you can't edit or delete it using Amazon Route 53.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param linkedService <p>
     *            If the health check was created by another service, the
     *            service that created the health check. When a health check is
     *            created by another service, you can't edit or delete it using
     *            Amazon Route 53.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheck withLinkedService(LinkedService linkedService) {
        this.linkedService = linkedService;
        return this;
    }

    /**
     * <p>
     * A complex type that contains detailed information about one health check.
     * </p>
     *
     * @return <p>
     *         A complex type that contains detailed information about one
     *         health check.
     *         </p>
     */
    public HealthCheckConfig getHealthCheckConfig() {
        return healthCheckConfig;
    }

    /**
     * <p>
     * A complex type that contains detailed information about one health check.
     * </p>
     *
     * @param healthCheckConfig <p>
     *            A complex type that contains detailed information about one
     *            health check.
     *            </p>
     */
    public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    /**
     * <p>
     * A complex type that contains detailed information about one health check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheckConfig <p>
     *            A complex type that contains detailed information about one
     *            health check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheck withHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }

    /**
     * <p>
     * The version of the health check. You can optionally pass this value in a
     * call to <code>UpdateHealthCheck</code> to prevent overwriting another
     * change to the health check.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The version of the health check. You can optionally pass this
     *         value in a call to <code>UpdateHealthCheck</code> to prevent
     *         overwriting another change to the health check.
     *         </p>
     */
    public Long getHealthCheckVersion() {
        return healthCheckVersion;
    }

    /**
     * <p>
     * The version of the health check. You can optionally pass this value in a
     * call to <code>UpdateHealthCheck</code> to prevent overwriting another
     * change to the health check.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param healthCheckVersion <p>
     *            The version of the health check. You can optionally pass this
     *            value in a call to <code>UpdateHealthCheck</code> to prevent
     *            overwriting another change to the health check.
     *            </p>
     */
    public void setHealthCheckVersion(Long healthCheckVersion) {
        this.healthCheckVersion = healthCheckVersion;
    }

    /**
     * <p>
     * The version of the health check. You can optionally pass this value in a
     * call to <code>UpdateHealthCheck</code> to prevent overwriting another
     * change to the health check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param healthCheckVersion <p>
     *            The version of the health check. You can optionally pass this
     *            value in a call to <code>UpdateHealthCheck</code> to prevent
     *            overwriting another change to the health check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheck withHealthCheckVersion(Long healthCheckVersion) {
        this.healthCheckVersion = healthCheckVersion;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the CloudWatch alarm that
     * Amazon Route 53 is monitoring for this health check.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about the CloudWatch
     *         alarm that Amazon Route 53 is monitoring for this health check.
     *         </p>
     */
    public CloudWatchAlarmConfiguration getCloudWatchAlarmConfiguration() {
        return cloudWatchAlarmConfiguration;
    }

    /**
     * <p>
     * A complex type that contains information about the CloudWatch alarm that
     * Amazon Route 53 is monitoring for this health check.
     * </p>
     *
     * @param cloudWatchAlarmConfiguration <p>
     *            A complex type that contains information about the CloudWatch
     *            alarm that Amazon Route 53 is monitoring for this health
     *            check.
     *            </p>
     */
    public void setCloudWatchAlarmConfiguration(
            CloudWatchAlarmConfiguration cloudWatchAlarmConfiguration) {
        this.cloudWatchAlarmConfiguration = cloudWatchAlarmConfiguration;
    }

    /**
     * <p>
     * A complex type that contains information about the CloudWatch alarm that
     * Amazon Route 53 is monitoring for this health check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudWatchAlarmConfiguration <p>
     *            A complex type that contains information about the CloudWatch
     *            alarm that Amazon Route 53 is monitoring for this health
     *            check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheck withCloudWatchAlarmConfiguration(
            CloudWatchAlarmConfiguration cloudWatchAlarmConfiguration) {
        this.cloudWatchAlarmConfiguration = cloudWatchAlarmConfiguration;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getCallerReference() != null)
            sb.append("CallerReference: " + getCallerReference() + ",");
        if (getLinkedService() != null)
            sb.append("LinkedService: " + getLinkedService() + ",");
        if (getHealthCheckConfig() != null)
            sb.append("HealthCheckConfig: " + getHealthCheckConfig() + ",");
        if (getHealthCheckVersion() != null)
            sb.append("HealthCheckVersion: " + getHealthCheckVersion() + ",");
        if (getCloudWatchAlarmConfiguration() != null)
            sb.append("CloudWatchAlarmConfiguration: " + getCloudWatchAlarmConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        hashCode = prime * hashCode
                + ((getLinkedService() == null) ? 0 : getLinkedService().hashCode());
        hashCode = prime * hashCode
                + ((getHealthCheckConfig() == null) ? 0 : getHealthCheckConfig().hashCode());
        hashCode = prime * hashCode
                + ((getHealthCheckVersion() == null) ? 0 : getHealthCheckVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getCloudWatchAlarmConfiguration() == null) ? 0
                        : getCloudWatchAlarmConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HealthCheck == false)
            return false;
        HealthCheck other = (HealthCheck) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getLinkedService() == null ^ this.getLinkedService() == null)
            return false;
        if (other.getLinkedService() != null
                && other.getLinkedService().equals(this.getLinkedService()) == false)
            return false;
        if (other.getHealthCheckConfig() == null ^ this.getHealthCheckConfig() == null)
            return false;
        if (other.getHealthCheckConfig() != null
                && other.getHealthCheckConfig().equals(this.getHealthCheckConfig()) == false)
            return false;
        if (other.getHealthCheckVersion() == null ^ this.getHealthCheckVersion() == null)
            return false;
        if (other.getHealthCheckVersion() != null
                && other.getHealthCheckVersion().equals(this.getHealthCheckVersion()) == false)
            return false;
        if (other.getCloudWatchAlarmConfiguration() == null
                ^ this.getCloudWatchAlarmConfiguration() == null)
            return false;
        if (other.getCloudWatchAlarmConfiguration() != null
                && other.getCloudWatchAlarmConfiguration().equals(
                        this.getCloudWatchAlarmConfiguration()) == false)
            return false;
        return true;
    }
}
