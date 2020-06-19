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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * <p>
 * An update that you can apply to your Redis clusters.
 * </p>
 */
public class ServiceUpdate implements Serializable {
    /**
     * <p>
     * The unique ID of the service update
     * </p>
     */
    private String serviceUpdateName;

    /**
     * <p>
     * The date when the service update is initially available
     * </p>
     */
    private java.util.Date serviceUpdateReleaseDate;

    /**
     * <p>
     * The date after which the service update is no longer available
     * </p>
     */
    private java.util.Date serviceUpdateEndDate;

    /**
     * <p>
     * The severity of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>critical, important, medium, low
     */
    private String serviceUpdateSeverity;

    /**
     * <p>
     * The recommendend date to apply the service update in order to ensure
     * compliance. For information on compliance, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     * >Self-Service Security Updates for Compliance</a>.
     * </p>
     */
    private java.util.Date serviceUpdateRecommendedApplyByDate;

    /**
     * <p>
     * The status of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, cancelled, expired
     */
    private String serviceUpdateStatus;

    /**
     * <p>
     * Provides details of the service update
     * </p>
     */
    private String serviceUpdateDescription;

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>security-update
     */
    private String serviceUpdateType;

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or
     * Memcached
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The Elasticache engine version to which the update applies. Either Redis
     * or Memcached engine version
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * Indicates whether the service update will be automatically applied once
     * the recommended apply-by date has expired.
     * </p>
     */
    private Boolean autoUpdateAfterRecommendedApplyByDate;

    /**
     * <p>
     * The estimated length of time the service update will take
     * </p>
     */
    private String estimatedUpdateTime;

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     *
     * @return <p>
     *         The unique ID of the service update
     *         </p>
     */
    public String getServiceUpdateName() {
        return serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     *
     * @param serviceUpdateName <p>
     *            The unique ID of the service update
     *            </p>
     */
    public void setServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceUpdateName <p>
     *            The unique ID of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceUpdate withServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
        return this;
    }

    /**
     * <p>
     * The date when the service update is initially available
     * </p>
     *
     * @return <p>
     *         The date when the service update is initially available
     *         </p>
     */
    public java.util.Date getServiceUpdateReleaseDate() {
        return serviceUpdateReleaseDate;
    }

    /**
     * <p>
     * The date when the service update is initially available
     * </p>
     *
     * @param serviceUpdateReleaseDate <p>
     *            The date when the service update is initially available
     *            </p>
     */
    public void setServiceUpdateReleaseDate(java.util.Date serviceUpdateReleaseDate) {
        this.serviceUpdateReleaseDate = serviceUpdateReleaseDate;
    }

    /**
     * <p>
     * The date when the service update is initially available
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceUpdateReleaseDate <p>
     *            The date when the service update is initially available
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceUpdate withServiceUpdateReleaseDate(java.util.Date serviceUpdateReleaseDate) {
        this.serviceUpdateReleaseDate = serviceUpdateReleaseDate;
        return this;
    }

    /**
     * <p>
     * The date after which the service update is no longer available
     * </p>
     *
     * @return <p>
     *         The date after which the service update is no longer available
     *         </p>
     */
    public java.util.Date getServiceUpdateEndDate() {
        return serviceUpdateEndDate;
    }

    /**
     * <p>
     * The date after which the service update is no longer available
     * </p>
     *
     * @param serviceUpdateEndDate <p>
     *            The date after which the service update is no longer available
     *            </p>
     */
    public void setServiceUpdateEndDate(java.util.Date serviceUpdateEndDate) {
        this.serviceUpdateEndDate = serviceUpdateEndDate;
    }

    /**
     * <p>
     * The date after which the service update is no longer available
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceUpdateEndDate <p>
     *            The date after which the service update is no longer available
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceUpdate withServiceUpdateEndDate(java.util.Date serviceUpdateEndDate) {
        this.serviceUpdateEndDate = serviceUpdateEndDate;
        return this;
    }

    /**
     * <p>
     * The severity of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>critical, important, medium, low
     *
     * @return <p>
     *         The severity of the service update
     *         </p>
     * @see ServiceUpdateSeverity
     */
    public String getServiceUpdateSeverity() {
        return serviceUpdateSeverity;
    }

    /**
     * <p>
     * The severity of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>critical, important, medium, low
     *
     * @param serviceUpdateSeverity <p>
     *            The severity of the service update
     *            </p>
     * @see ServiceUpdateSeverity
     */
    public void setServiceUpdateSeverity(String serviceUpdateSeverity) {
        this.serviceUpdateSeverity = serviceUpdateSeverity;
    }

    /**
     * <p>
     * The severity of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>critical, important, medium, low
     *
     * @param serviceUpdateSeverity <p>
     *            The severity of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceUpdateSeverity
     */
    public ServiceUpdate withServiceUpdateSeverity(String serviceUpdateSeverity) {
        this.serviceUpdateSeverity = serviceUpdateSeverity;
        return this;
    }

    /**
     * <p>
     * The severity of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>critical, important, medium, low
     *
     * @param serviceUpdateSeverity <p>
     *            The severity of the service update
     *            </p>
     * @see ServiceUpdateSeverity
     */
    public void setServiceUpdateSeverity(ServiceUpdateSeverity serviceUpdateSeverity) {
        this.serviceUpdateSeverity = serviceUpdateSeverity.toString();
    }

    /**
     * <p>
     * The severity of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>critical, important, medium, low
     *
     * @param serviceUpdateSeverity <p>
     *            The severity of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceUpdateSeverity
     */
    public ServiceUpdate withServiceUpdateSeverity(ServiceUpdateSeverity serviceUpdateSeverity) {
        this.serviceUpdateSeverity = serviceUpdateSeverity.toString();
        return this;
    }

    /**
     * <p>
     * The recommendend date to apply the service update in order to ensure
     * compliance. For information on compliance, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     * >Self-Service Security Updates for Compliance</a>.
     * </p>
     *
     * @return <p>
     *         The recommendend date to apply the service update in order to
     *         ensure compliance. For information on compliance, see <a href=
     *         "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     *         >Self-Service Security Updates for Compliance</a>.
     *         </p>
     */
    public java.util.Date getServiceUpdateRecommendedApplyByDate() {
        return serviceUpdateRecommendedApplyByDate;
    }

    /**
     * <p>
     * The recommendend date to apply the service update in order to ensure
     * compliance. For information on compliance, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     * >Self-Service Security Updates for Compliance</a>.
     * </p>
     *
     * @param serviceUpdateRecommendedApplyByDate <p>
     *            The recommendend date to apply the service update in order to
     *            ensure compliance. For information on compliance, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     *            >Self-Service Security Updates for Compliance</a>.
     *            </p>
     */
    public void setServiceUpdateRecommendedApplyByDate(
            java.util.Date serviceUpdateRecommendedApplyByDate) {
        this.serviceUpdateRecommendedApplyByDate = serviceUpdateRecommendedApplyByDate;
    }

    /**
     * <p>
     * The recommendend date to apply the service update in order to ensure
     * compliance. For information on compliance, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     * >Self-Service Security Updates for Compliance</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceUpdateRecommendedApplyByDate <p>
     *            The recommendend date to apply the service update in order to
     *            ensure compliance. For information on compliance, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     *            >Self-Service Security Updates for Compliance</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceUpdate withServiceUpdateRecommendedApplyByDate(
            java.util.Date serviceUpdateRecommendedApplyByDate) {
        this.serviceUpdateRecommendedApplyByDate = serviceUpdateRecommendedApplyByDate;
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, cancelled, expired
     *
     * @return <p>
     *         The status of the service update
     *         </p>
     * @see ServiceUpdateStatus
     */
    public String getServiceUpdateStatus() {
        return serviceUpdateStatus;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, cancelled, expired
     *
     * @param serviceUpdateStatus <p>
     *            The status of the service update
     *            </p>
     * @see ServiceUpdateStatus
     */
    public void setServiceUpdateStatus(String serviceUpdateStatus) {
        this.serviceUpdateStatus = serviceUpdateStatus;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, cancelled, expired
     *
     * @param serviceUpdateStatus <p>
     *            The status of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceUpdateStatus
     */
    public ServiceUpdate withServiceUpdateStatus(String serviceUpdateStatus) {
        this.serviceUpdateStatus = serviceUpdateStatus;
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, cancelled, expired
     *
     * @param serviceUpdateStatus <p>
     *            The status of the service update
     *            </p>
     * @see ServiceUpdateStatus
     */
    public void setServiceUpdateStatus(ServiceUpdateStatus serviceUpdateStatus) {
        this.serviceUpdateStatus = serviceUpdateStatus.toString();
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, cancelled, expired
     *
     * @param serviceUpdateStatus <p>
     *            The status of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceUpdateStatus
     */
    public ServiceUpdate withServiceUpdateStatus(ServiceUpdateStatus serviceUpdateStatus) {
        this.serviceUpdateStatus = serviceUpdateStatus.toString();
        return this;
    }

    /**
     * <p>
     * Provides details of the service update
     * </p>
     *
     * @return <p>
     *         Provides details of the service update
     *         </p>
     */
    public String getServiceUpdateDescription() {
        return serviceUpdateDescription;
    }

    /**
     * <p>
     * Provides details of the service update
     * </p>
     *
     * @param serviceUpdateDescription <p>
     *            Provides details of the service update
     *            </p>
     */
    public void setServiceUpdateDescription(String serviceUpdateDescription) {
        this.serviceUpdateDescription = serviceUpdateDescription;
    }

    /**
     * <p>
     * Provides details of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceUpdateDescription <p>
     *            Provides details of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceUpdate withServiceUpdateDescription(String serviceUpdateDescription) {
        this.serviceUpdateDescription = serviceUpdateDescription;
        return this;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>security-update
     *
     * @return <p>
     *         Reflects the nature of the service update
     *         </p>
     * @see ServiceUpdateType
     */
    public String getServiceUpdateType() {
        return serviceUpdateType;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>security-update
     *
     * @param serviceUpdateType <p>
     *            Reflects the nature of the service update
     *            </p>
     * @see ServiceUpdateType
     */
    public void setServiceUpdateType(String serviceUpdateType) {
        this.serviceUpdateType = serviceUpdateType;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>security-update
     *
     * @param serviceUpdateType <p>
     *            Reflects the nature of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceUpdateType
     */
    public ServiceUpdate withServiceUpdateType(String serviceUpdateType) {
        this.serviceUpdateType = serviceUpdateType;
        return this;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>security-update
     *
     * @param serviceUpdateType <p>
     *            Reflects the nature of the service update
     *            </p>
     * @see ServiceUpdateType
     */
    public void setServiceUpdateType(ServiceUpdateType serviceUpdateType) {
        this.serviceUpdateType = serviceUpdateType.toString();
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>security-update
     *
     * @param serviceUpdateType <p>
     *            Reflects the nature of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceUpdateType
     */
    public ServiceUpdate withServiceUpdateType(ServiceUpdateType serviceUpdateType) {
        this.serviceUpdateType = serviceUpdateType.toString();
        return this;
    }

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or
     * Memcached
     * </p>
     *
     * @return <p>
     *         The Elasticache engine to which the update applies. Either Redis
     *         or Memcached
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or
     * Memcached
     * </p>
     *
     * @param engine <p>
     *            The Elasticache engine to which the update applies. Either
     *            Redis or Memcached
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or
     * Memcached
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The Elasticache engine to which the update applies. Either
     *            Redis or Memcached
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceUpdate withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The Elasticache engine version to which the update applies. Either Redis
     * or Memcached engine version
     * </p>
     *
     * @return <p>
     *         The Elasticache engine version to which the update applies.
     *         Either Redis or Memcached engine version
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The Elasticache engine version to which the update applies. Either Redis
     * or Memcached engine version
     * </p>
     *
     * @param engineVersion <p>
     *            The Elasticache engine version to which the update applies.
     *            Either Redis or Memcached engine version
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The Elasticache engine version to which the update applies. Either Redis
     * or Memcached engine version
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The Elasticache engine version to which the update applies.
     *            Either Redis or Memcached engine version
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceUpdate withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * Indicates whether the service update will be automatically applied once
     * the recommended apply-by date has expired.
     * </p>
     *
     * @return <p>
     *         Indicates whether the service update will be automatically
     *         applied once the recommended apply-by date has expired.
     *         </p>
     */
    public Boolean isAutoUpdateAfterRecommendedApplyByDate() {
        return autoUpdateAfterRecommendedApplyByDate;
    }

    /**
     * <p>
     * Indicates whether the service update will be automatically applied once
     * the recommended apply-by date has expired.
     * </p>
     *
     * @return <p>
     *         Indicates whether the service update will be automatically
     *         applied once the recommended apply-by date has expired.
     *         </p>
     */
    public Boolean getAutoUpdateAfterRecommendedApplyByDate() {
        return autoUpdateAfterRecommendedApplyByDate;
    }

    /**
     * <p>
     * Indicates whether the service update will be automatically applied once
     * the recommended apply-by date has expired.
     * </p>
     *
     * @param autoUpdateAfterRecommendedApplyByDate <p>
     *            Indicates whether the service update will be automatically
     *            applied once the recommended apply-by date has expired.
     *            </p>
     */
    public void setAutoUpdateAfterRecommendedApplyByDate(
            Boolean autoUpdateAfterRecommendedApplyByDate) {
        this.autoUpdateAfterRecommendedApplyByDate = autoUpdateAfterRecommendedApplyByDate;
    }

    /**
     * <p>
     * Indicates whether the service update will be automatically applied once
     * the recommended apply-by date has expired.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoUpdateAfterRecommendedApplyByDate <p>
     *            Indicates whether the service update will be automatically
     *            applied once the recommended apply-by date has expired.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceUpdate withAutoUpdateAfterRecommendedApplyByDate(
            Boolean autoUpdateAfterRecommendedApplyByDate) {
        this.autoUpdateAfterRecommendedApplyByDate = autoUpdateAfterRecommendedApplyByDate;
        return this;
    }

    /**
     * <p>
     * The estimated length of time the service update will take
     * </p>
     *
     * @return <p>
     *         The estimated length of time the service update will take
     *         </p>
     */
    public String getEstimatedUpdateTime() {
        return estimatedUpdateTime;
    }

    /**
     * <p>
     * The estimated length of time the service update will take
     * </p>
     *
     * @param estimatedUpdateTime <p>
     *            The estimated length of time the service update will take
     *            </p>
     */
    public void setEstimatedUpdateTime(String estimatedUpdateTime) {
        this.estimatedUpdateTime = estimatedUpdateTime;
    }

    /**
     * <p>
     * The estimated length of time the service update will take
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param estimatedUpdateTime <p>
     *            The estimated length of time the service update will take
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceUpdate withEstimatedUpdateTime(String estimatedUpdateTime) {
        this.estimatedUpdateTime = estimatedUpdateTime;
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
        if (getServiceUpdateName() != null)
            sb.append("ServiceUpdateName: " + getServiceUpdateName() + ",");
        if (getServiceUpdateReleaseDate() != null)
            sb.append("ServiceUpdateReleaseDate: " + getServiceUpdateReleaseDate() + ",");
        if (getServiceUpdateEndDate() != null)
            sb.append("ServiceUpdateEndDate: " + getServiceUpdateEndDate() + ",");
        if (getServiceUpdateSeverity() != null)
            sb.append("ServiceUpdateSeverity: " + getServiceUpdateSeverity() + ",");
        if (getServiceUpdateRecommendedApplyByDate() != null)
            sb.append("ServiceUpdateRecommendedApplyByDate: "
                    + getServiceUpdateRecommendedApplyByDate() + ",");
        if (getServiceUpdateStatus() != null)
            sb.append("ServiceUpdateStatus: " + getServiceUpdateStatus() + ",");
        if (getServiceUpdateDescription() != null)
            sb.append("ServiceUpdateDescription: " + getServiceUpdateDescription() + ",");
        if (getServiceUpdateType() != null)
            sb.append("ServiceUpdateType: " + getServiceUpdateType() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getAutoUpdateAfterRecommendedApplyByDate() != null)
            sb.append("AutoUpdateAfterRecommendedApplyByDate: "
                    + getAutoUpdateAfterRecommendedApplyByDate() + ",");
        if (getEstimatedUpdateTime() != null)
            sb.append("EstimatedUpdateTime: " + getEstimatedUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServiceUpdateName() == null) ? 0 : getServiceUpdateName().hashCode());
        hashCode = prime
                * hashCode
                + ((getServiceUpdateReleaseDate() == null) ? 0 : getServiceUpdateReleaseDate()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getServiceUpdateEndDate() == null) ? 0 : getServiceUpdateEndDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getServiceUpdateSeverity() == null) ? 0 : getServiceUpdateSeverity().hashCode());
        hashCode = prime
                * hashCode
                + ((getServiceUpdateRecommendedApplyByDate() == null) ? 0
                        : getServiceUpdateRecommendedApplyByDate().hashCode());
        hashCode = prime * hashCode
                + ((getServiceUpdateStatus() == null) ? 0 : getServiceUpdateStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getServiceUpdateDescription() == null) ? 0 : getServiceUpdateDescription()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getServiceUpdateType() == null) ? 0 : getServiceUpdateType().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoUpdateAfterRecommendedApplyByDate() == null) ? 0
                        : getAutoUpdateAfterRecommendedApplyByDate().hashCode());
        hashCode = prime * hashCode
                + ((getEstimatedUpdateTime() == null) ? 0 : getEstimatedUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceUpdate == false)
            return false;
        ServiceUpdate other = (ServiceUpdate) obj;

        if (other.getServiceUpdateName() == null ^ this.getServiceUpdateName() == null)
            return false;
        if (other.getServiceUpdateName() != null
                && other.getServiceUpdateName().equals(this.getServiceUpdateName()) == false)
            return false;
        if (other.getServiceUpdateReleaseDate() == null
                ^ this.getServiceUpdateReleaseDate() == null)
            return false;
        if (other.getServiceUpdateReleaseDate() != null
                && other.getServiceUpdateReleaseDate().equals(this.getServiceUpdateReleaseDate()) == false)
            return false;
        if (other.getServiceUpdateEndDate() == null ^ this.getServiceUpdateEndDate() == null)
            return false;
        if (other.getServiceUpdateEndDate() != null
                && other.getServiceUpdateEndDate().equals(this.getServiceUpdateEndDate()) == false)
            return false;
        if (other.getServiceUpdateSeverity() == null ^ this.getServiceUpdateSeverity() == null)
            return false;
        if (other.getServiceUpdateSeverity() != null
                && other.getServiceUpdateSeverity().equals(this.getServiceUpdateSeverity()) == false)
            return false;
        if (other.getServiceUpdateRecommendedApplyByDate() == null
                ^ this.getServiceUpdateRecommendedApplyByDate() == null)
            return false;
        if (other.getServiceUpdateRecommendedApplyByDate() != null
                && other.getServiceUpdateRecommendedApplyByDate().equals(
                        this.getServiceUpdateRecommendedApplyByDate()) == false)
            return false;
        if (other.getServiceUpdateStatus() == null ^ this.getServiceUpdateStatus() == null)
            return false;
        if (other.getServiceUpdateStatus() != null
                && other.getServiceUpdateStatus().equals(this.getServiceUpdateStatus()) == false)
            return false;
        if (other.getServiceUpdateDescription() == null
                ^ this.getServiceUpdateDescription() == null)
            return false;
        if (other.getServiceUpdateDescription() != null
                && other.getServiceUpdateDescription().equals(this.getServiceUpdateDescription()) == false)
            return false;
        if (other.getServiceUpdateType() == null ^ this.getServiceUpdateType() == null)
            return false;
        if (other.getServiceUpdateType() != null
                && other.getServiceUpdateType().equals(this.getServiceUpdateType()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAutoUpdateAfterRecommendedApplyByDate() == null
                ^ this.getAutoUpdateAfterRecommendedApplyByDate() == null)
            return false;
        if (other.getAutoUpdateAfterRecommendedApplyByDate() != null
                && other.getAutoUpdateAfterRecommendedApplyByDate().equals(
                        this.getAutoUpdateAfterRecommendedApplyByDate()) == false)
            return false;
        if (other.getEstimatedUpdateTime() == null ^ this.getEstimatedUpdateTime() == null)
            return false;
        if (other.getEstimatedUpdateTime() != null
                && other.getEstimatedUpdateTime().equals(this.getEstimatedUpdateTime()) == false)
            return false;
        return true;
    }
}
