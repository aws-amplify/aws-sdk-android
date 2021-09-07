/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a Device Defender security profile.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >UpdateSecurityProfile</a> action.
 * </p>
 */
public class UpdateSecurityProfileRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the security profile you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String securityProfileName;

    /**
     * <p>
     * A description of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     */
    private String securityProfileDescription;

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an
     * alert.
     * </p>
     */
    private java.util.List<Behavior> behaviors;

    /**
     * <p>
     * Where the alerts are sent. (Alerts are always sent to the console.)
     * </p>
     */
    private java.util.Map<String, AlertTarget> alertTargets;

    /**
     * <p>
     * <i>Please use
     * <a>UpdateSecurityProfileRequest$additionalMetricsToRetainV2</a>
     * instead.</i>
     * </p>
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is
     * retained for any metric used in the profile's <code>behaviors</code>, but
     * it is also retained for any metric specified here. Can be used with
     * custom metrics; cannot be used with dimensions.
     * </p>
     */
    private java.util.List<String> additionalMetricsToRetain;

    /**
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is
     * retained for any metric used in the profile's behaviors, but it is also
     * retained for any metric specified here. Can be used with custom metrics;
     * cannot be used with dimensions.
     * </p>
     */
    private java.util.List<MetricToRetain> additionalMetricsToRetainV2;

    /**
     * <p>
     * If true, delete all <code>behaviors</code> defined for this security
     * profile. If any <code>behaviors</code> are defined in the current
     * invocation, an exception occurs.
     * </p>
     */
    private Boolean deleteBehaviors;

    /**
     * <p>
     * If true, delete all <code>alertTargets</code> defined for this security
     * profile. If any <code>alertTargets</code> are defined in the current
     * invocation, an exception occurs.
     * </p>
     */
    private Boolean deleteAlertTargets;

    /**
     * <p>
     * If true, delete all <code>additionalMetricsToRetain</code> defined for
     * this security profile. If any <code>additionalMetricsToRetain</code> are
     * defined in the current invocation, an exception occurs.
     * </p>
     */
    private Boolean deleteAdditionalMetricsToRetain;

    /**
     * <p>
     * The expected version of the security profile. A new version is generated
     * whenever the security profile is updated. If you specify a value that is
     * different from the actual version, a
     * <code>VersionConflictException</code> is thrown.
     * </p>
     */
    private Long expectedVersion;

    /**
     * <p>
     * The name of the security profile you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the security profile you want to update.
     *         </p>
     */
    public String getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param securityProfileName <p>
     *            The name of the security profile you want to update.
     *            </p>
     */
    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param securityProfileName <p>
     *            The name of the security profile you want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
        return this;
    }

    /**
     * <p>
     * A description of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @return <p>
     *         A description of the security profile.
     *         </p>
     */
    public String getSecurityProfileDescription() {
        return securityProfileDescription;
    }

    /**
     * <p>
     * A description of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param securityProfileDescription <p>
     *            A description of the security profile.
     *            </p>
     */
    public void setSecurityProfileDescription(String securityProfileDescription) {
        this.securityProfileDescription = securityProfileDescription;
    }

    /**
     * <p>
     * A description of the security profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param securityProfileDescription <p>
     *            A description of the security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withSecurityProfileDescription(
            String securityProfileDescription) {
        this.securityProfileDescription = securityProfileDescription;
        return this;
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an
     * alert.
     * </p>
     *
     * @return <p>
     *         Specifies the behaviors that, when violated by a device (thing),
     *         cause an alert.
     *         </p>
     */
    public java.util.List<Behavior> getBehaviors() {
        return behaviors;
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an
     * alert.
     * </p>
     *
     * @param behaviors <p>
     *            Specifies the behaviors that, when violated by a device
     *            (thing), cause an alert.
     *            </p>
     */
    public void setBehaviors(java.util.Collection<Behavior> behaviors) {
        if (behaviors == null) {
            this.behaviors = null;
            return;
        }

        this.behaviors = new java.util.ArrayList<Behavior>(behaviors);
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an
     * alert.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param behaviors <p>
     *            Specifies the behaviors that, when violated by a device
     *            (thing), cause an alert.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withBehaviors(Behavior... behaviors) {
        if (getBehaviors() == null) {
            this.behaviors = new java.util.ArrayList<Behavior>(behaviors.length);
        }
        for (Behavior value : behaviors) {
            this.behaviors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an
     * alert.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param behaviors <p>
     *            Specifies the behaviors that, when violated by a device
     *            (thing), cause an alert.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withBehaviors(java.util.Collection<Behavior> behaviors) {
        setBehaviors(behaviors);
        return this;
    }

    /**
     * <p>
     * Where the alerts are sent. (Alerts are always sent to the console.)
     * </p>
     *
     * @return <p>
     *         Where the alerts are sent. (Alerts are always sent to the
     *         console.)
     *         </p>
     */
    public java.util.Map<String, AlertTarget> getAlertTargets() {
        return alertTargets;
    }

    /**
     * <p>
     * Where the alerts are sent. (Alerts are always sent to the console.)
     * </p>
     *
     * @param alertTargets <p>
     *            Where the alerts are sent. (Alerts are always sent to the
     *            console.)
     *            </p>
     */
    public void setAlertTargets(java.util.Map<String, AlertTarget> alertTargets) {
        this.alertTargets = alertTargets;
    }

    /**
     * <p>
     * Where the alerts are sent. (Alerts are always sent to the console.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alertTargets <p>
     *            Where the alerts are sent. (Alerts are always sent to the
     *            console.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withAlertTargets(
            java.util.Map<String, AlertTarget> alertTargets) {
        this.alertTargets = alertTargets;
        return this;
    }

    /**
     * <p>
     * Where the alerts are sent. (Alerts are always sent to the console.)
     * </p>
     * <p>
     * The method adds a new key-value pair into alertTargets parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into alertTargets.
     * @param value The corresponding value of the entry to be added into
     *            alertTargets.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest addalertTargetsEntry(String key, AlertTarget value) {
        if (null == this.alertTargets) {
            this.alertTargets = new java.util.HashMap<String, AlertTarget>();
        }
        if (this.alertTargets.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.alertTargets.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into alertTargets.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateSecurityProfileRequest clearalertTargetsEntries() {
        this.alertTargets = null;
        return this;
    }

    /**
     * <p>
     * <i>Please use
     * <a>UpdateSecurityProfileRequest$additionalMetricsToRetainV2</a>
     * instead.</i>
     * </p>
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is
     * retained for any metric used in the profile's <code>behaviors</code>, but
     * it is also retained for any metric specified here. Can be used with
     * custom metrics; cannot be used with dimensions.
     * </p>
     *
     * @return <p>
     *         <i>Please use
     *         <a>UpdateSecurityProfileRequest$additionalMetricsToRetainV2</a>
     *         instead.</i>
     *         </p>
     *         <p>
     *         A list of metrics whose data is retained (stored). By default,
     *         data is retained for any metric used in the profile's
     *         <code>behaviors</code>, but it is also retained for any metric
     *         specified here. Can be used with custom metrics; cannot be used
     *         with dimensions.
     *         </p>
     */
    public java.util.List<String> getAdditionalMetricsToRetain() {
        return additionalMetricsToRetain;
    }

    /**
     * <p>
     * <i>Please use
     * <a>UpdateSecurityProfileRequest$additionalMetricsToRetainV2</a>
     * instead.</i>
     * </p>
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is
     * retained for any metric used in the profile's <code>behaviors</code>, but
     * it is also retained for any metric specified here. Can be used with
     * custom metrics; cannot be used with dimensions.
     * </p>
     *
     * @param additionalMetricsToRetain <p>
     *            <i>Please use
     *            <a>UpdateSecurityProfileRequest$additionalMetricsToRetainV2
     *            </a> instead.</i>
     *            </p>
     *            <p>
     *            A list of metrics whose data is retained (stored). By default,
     *            data is retained for any metric used in the profile's
     *            <code>behaviors</code>, but it is also retained for any metric
     *            specified here. Can be used with custom metrics; cannot be
     *            used with dimensions.
     *            </p>
     */
    public void setAdditionalMetricsToRetain(java.util.Collection<String> additionalMetricsToRetain) {
        if (additionalMetricsToRetain == null) {
            this.additionalMetricsToRetain = null;
            return;
        }

        this.additionalMetricsToRetain = new java.util.ArrayList<String>(additionalMetricsToRetain);
    }

    /**
     * <p>
     * <i>Please use
     * <a>UpdateSecurityProfileRequest$additionalMetricsToRetainV2</a>
     * instead.</i>
     * </p>
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is
     * retained for any metric used in the profile's <code>behaviors</code>, but
     * it is also retained for any metric specified here. Can be used with
     * custom metrics; cannot be used with dimensions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalMetricsToRetain <p>
     *            <i>Please use
     *            <a>UpdateSecurityProfileRequest$additionalMetricsToRetainV2
     *            </a> instead.</i>
     *            </p>
     *            <p>
     *            A list of metrics whose data is retained (stored). By default,
     *            data is retained for any metric used in the profile's
     *            <code>behaviors</code>, but it is also retained for any metric
     *            specified here. Can be used with custom metrics; cannot be
     *            used with dimensions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withAdditionalMetricsToRetain(
            String... additionalMetricsToRetain) {
        if (getAdditionalMetricsToRetain() == null) {
            this.additionalMetricsToRetain = new java.util.ArrayList<String>(
                    additionalMetricsToRetain.length);
        }
        for (String value : additionalMetricsToRetain) {
            this.additionalMetricsToRetain.add(value);
        }
        return this;
    }

    /**
     * <p>
     * <i>Please use
     * <a>UpdateSecurityProfileRequest$additionalMetricsToRetainV2</a>
     * instead.</i>
     * </p>
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is
     * retained for any metric used in the profile's <code>behaviors</code>, but
     * it is also retained for any metric specified here. Can be used with
     * custom metrics; cannot be used with dimensions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalMetricsToRetain <p>
     *            <i>Please use
     *            <a>UpdateSecurityProfileRequest$additionalMetricsToRetainV2
     *            </a> instead.</i>
     *            </p>
     *            <p>
     *            A list of metrics whose data is retained (stored). By default,
     *            data is retained for any metric used in the profile's
     *            <code>behaviors</code>, but it is also retained for any metric
     *            specified here. Can be used with custom metrics; cannot be
     *            used with dimensions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withAdditionalMetricsToRetain(
            java.util.Collection<String> additionalMetricsToRetain) {
        setAdditionalMetricsToRetain(additionalMetricsToRetain);
        return this;
    }

    /**
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is
     * retained for any metric used in the profile's behaviors, but it is also
     * retained for any metric specified here. Can be used with custom metrics;
     * cannot be used with dimensions.
     * </p>
     *
     * @return <p>
     *         A list of metrics whose data is retained (stored). By default,
     *         data is retained for any metric used in the profile's behaviors,
     *         but it is also retained for any metric specified here. Can be
     *         used with custom metrics; cannot be used with dimensions.
     *         </p>
     */
    public java.util.List<MetricToRetain> getAdditionalMetricsToRetainV2() {
        return additionalMetricsToRetainV2;
    }

    /**
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is
     * retained for any metric used in the profile's behaviors, but it is also
     * retained for any metric specified here. Can be used with custom metrics;
     * cannot be used with dimensions.
     * </p>
     *
     * @param additionalMetricsToRetainV2 <p>
     *            A list of metrics whose data is retained (stored). By default,
     *            data is retained for any metric used in the profile's
     *            behaviors, but it is also retained for any metric specified
     *            here. Can be used with custom metrics; cannot be used with
     *            dimensions.
     *            </p>
     */
    public void setAdditionalMetricsToRetainV2(
            java.util.Collection<MetricToRetain> additionalMetricsToRetainV2) {
        if (additionalMetricsToRetainV2 == null) {
            this.additionalMetricsToRetainV2 = null;
            return;
        }

        this.additionalMetricsToRetainV2 = new java.util.ArrayList<MetricToRetain>(
                additionalMetricsToRetainV2);
    }

    /**
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is
     * retained for any metric used in the profile's behaviors, but it is also
     * retained for any metric specified here. Can be used with custom metrics;
     * cannot be used with dimensions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalMetricsToRetainV2 <p>
     *            A list of metrics whose data is retained (stored). By default,
     *            data is retained for any metric used in the profile's
     *            behaviors, but it is also retained for any metric specified
     *            here. Can be used with custom metrics; cannot be used with
     *            dimensions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withAdditionalMetricsToRetainV2(
            MetricToRetain... additionalMetricsToRetainV2) {
        if (getAdditionalMetricsToRetainV2() == null) {
            this.additionalMetricsToRetainV2 = new java.util.ArrayList<MetricToRetain>(
                    additionalMetricsToRetainV2.length);
        }
        for (MetricToRetain value : additionalMetricsToRetainV2) {
            this.additionalMetricsToRetainV2.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of metrics whose data is retained (stored). By default, data is
     * retained for any metric used in the profile's behaviors, but it is also
     * retained for any metric specified here. Can be used with custom metrics;
     * cannot be used with dimensions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalMetricsToRetainV2 <p>
     *            A list of metrics whose data is retained (stored). By default,
     *            data is retained for any metric used in the profile's
     *            behaviors, but it is also retained for any metric specified
     *            here. Can be used with custom metrics; cannot be used with
     *            dimensions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withAdditionalMetricsToRetainV2(
            java.util.Collection<MetricToRetain> additionalMetricsToRetainV2) {
        setAdditionalMetricsToRetainV2(additionalMetricsToRetainV2);
        return this;
    }

    /**
     * <p>
     * If true, delete all <code>behaviors</code> defined for this security
     * profile. If any <code>behaviors</code> are defined in the current
     * invocation, an exception occurs.
     * </p>
     *
     * @return <p>
     *         If true, delete all <code>behaviors</code> defined for this
     *         security profile. If any <code>behaviors</code> are defined in
     *         the current invocation, an exception occurs.
     *         </p>
     */
    public Boolean isDeleteBehaviors() {
        return deleteBehaviors;
    }

    /**
     * <p>
     * If true, delete all <code>behaviors</code> defined for this security
     * profile. If any <code>behaviors</code> are defined in the current
     * invocation, an exception occurs.
     * </p>
     *
     * @return <p>
     *         If true, delete all <code>behaviors</code> defined for this
     *         security profile. If any <code>behaviors</code> are defined in
     *         the current invocation, an exception occurs.
     *         </p>
     */
    public Boolean getDeleteBehaviors() {
        return deleteBehaviors;
    }

    /**
     * <p>
     * If true, delete all <code>behaviors</code> defined for this security
     * profile. If any <code>behaviors</code> are defined in the current
     * invocation, an exception occurs.
     * </p>
     *
     * @param deleteBehaviors <p>
     *            If true, delete all <code>behaviors</code> defined for this
     *            security profile. If any <code>behaviors</code> are defined in
     *            the current invocation, an exception occurs.
     *            </p>
     */
    public void setDeleteBehaviors(Boolean deleteBehaviors) {
        this.deleteBehaviors = deleteBehaviors;
    }

    /**
     * <p>
     * If true, delete all <code>behaviors</code> defined for this security
     * profile. If any <code>behaviors</code> are defined in the current
     * invocation, an exception occurs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteBehaviors <p>
     *            If true, delete all <code>behaviors</code> defined for this
     *            security profile. If any <code>behaviors</code> are defined in
     *            the current invocation, an exception occurs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withDeleteBehaviors(Boolean deleteBehaviors) {
        this.deleteBehaviors = deleteBehaviors;
        return this;
    }

    /**
     * <p>
     * If true, delete all <code>alertTargets</code> defined for this security
     * profile. If any <code>alertTargets</code> are defined in the current
     * invocation, an exception occurs.
     * </p>
     *
     * @return <p>
     *         If true, delete all <code>alertTargets</code> defined for this
     *         security profile. If any <code>alertTargets</code> are defined in
     *         the current invocation, an exception occurs.
     *         </p>
     */
    public Boolean isDeleteAlertTargets() {
        return deleteAlertTargets;
    }

    /**
     * <p>
     * If true, delete all <code>alertTargets</code> defined for this security
     * profile. If any <code>alertTargets</code> are defined in the current
     * invocation, an exception occurs.
     * </p>
     *
     * @return <p>
     *         If true, delete all <code>alertTargets</code> defined for this
     *         security profile. If any <code>alertTargets</code> are defined in
     *         the current invocation, an exception occurs.
     *         </p>
     */
    public Boolean getDeleteAlertTargets() {
        return deleteAlertTargets;
    }

    /**
     * <p>
     * If true, delete all <code>alertTargets</code> defined for this security
     * profile. If any <code>alertTargets</code> are defined in the current
     * invocation, an exception occurs.
     * </p>
     *
     * @param deleteAlertTargets <p>
     *            If true, delete all <code>alertTargets</code> defined for this
     *            security profile. If any <code>alertTargets</code> are defined
     *            in the current invocation, an exception occurs.
     *            </p>
     */
    public void setDeleteAlertTargets(Boolean deleteAlertTargets) {
        this.deleteAlertTargets = deleteAlertTargets;
    }

    /**
     * <p>
     * If true, delete all <code>alertTargets</code> defined for this security
     * profile. If any <code>alertTargets</code> are defined in the current
     * invocation, an exception occurs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteAlertTargets <p>
     *            If true, delete all <code>alertTargets</code> defined for this
     *            security profile. If any <code>alertTargets</code> are defined
     *            in the current invocation, an exception occurs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withDeleteAlertTargets(Boolean deleteAlertTargets) {
        this.deleteAlertTargets = deleteAlertTargets;
        return this;
    }

    /**
     * <p>
     * If true, delete all <code>additionalMetricsToRetain</code> defined for
     * this security profile. If any <code>additionalMetricsToRetain</code> are
     * defined in the current invocation, an exception occurs.
     * </p>
     *
     * @return <p>
     *         If true, delete all <code>additionalMetricsToRetain</code>
     *         defined for this security profile. If any
     *         <code>additionalMetricsToRetain</code> are defined in the current
     *         invocation, an exception occurs.
     *         </p>
     */
    public Boolean isDeleteAdditionalMetricsToRetain() {
        return deleteAdditionalMetricsToRetain;
    }

    /**
     * <p>
     * If true, delete all <code>additionalMetricsToRetain</code> defined for
     * this security profile. If any <code>additionalMetricsToRetain</code> are
     * defined in the current invocation, an exception occurs.
     * </p>
     *
     * @return <p>
     *         If true, delete all <code>additionalMetricsToRetain</code>
     *         defined for this security profile. If any
     *         <code>additionalMetricsToRetain</code> are defined in the current
     *         invocation, an exception occurs.
     *         </p>
     */
    public Boolean getDeleteAdditionalMetricsToRetain() {
        return deleteAdditionalMetricsToRetain;
    }

    /**
     * <p>
     * If true, delete all <code>additionalMetricsToRetain</code> defined for
     * this security profile. If any <code>additionalMetricsToRetain</code> are
     * defined in the current invocation, an exception occurs.
     * </p>
     *
     * @param deleteAdditionalMetricsToRetain <p>
     *            If true, delete all <code>additionalMetricsToRetain</code>
     *            defined for this security profile. If any
     *            <code>additionalMetricsToRetain</code> are defined in the
     *            current invocation, an exception occurs.
     *            </p>
     */
    public void setDeleteAdditionalMetricsToRetain(Boolean deleteAdditionalMetricsToRetain) {
        this.deleteAdditionalMetricsToRetain = deleteAdditionalMetricsToRetain;
    }

    /**
     * <p>
     * If true, delete all <code>additionalMetricsToRetain</code> defined for
     * this security profile. If any <code>additionalMetricsToRetain</code> are
     * defined in the current invocation, an exception occurs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteAdditionalMetricsToRetain <p>
     *            If true, delete all <code>additionalMetricsToRetain</code>
     *            defined for this security profile. If any
     *            <code>additionalMetricsToRetain</code> are defined in the
     *            current invocation, an exception occurs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withDeleteAdditionalMetricsToRetain(
            Boolean deleteAdditionalMetricsToRetain) {
        this.deleteAdditionalMetricsToRetain = deleteAdditionalMetricsToRetain;
        return this;
    }

    /**
     * <p>
     * The expected version of the security profile. A new version is generated
     * whenever the security profile is updated. If you specify a value that is
     * different from the actual version, a
     * <code>VersionConflictException</code> is thrown.
     * </p>
     *
     * @return <p>
     *         The expected version of the security profile. A new version is
     *         generated whenever the security profile is updated. If you
     *         specify a value that is different from the actual version, a
     *         <code>VersionConflictException</code> is thrown.
     *         </p>
     */
    public Long getExpectedVersion() {
        return expectedVersion;
    }

    /**
     * <p>
     * The expected version of the security profile. A new version is generated
     * whenever the security profile is updated. If you specify a value that is
     * different from the actual version, a
     * <code>VersionConflictException</code> is thrown.
     * </p>
     *
     * @param expectedVersion <p>
     *            The expected version of the security profile. A new version is
     *            generated whenever the security profile is updated. If you
     *            specify a value that is different from the actual version, a
     *            <code>VersionConflictException</code> is thrown.
     *            </p>
     */
    public void setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
    }

    /**
     * <p>
     * The expected version of the security profile. A new version is generated
     * whenever the security profile is updated. If you specify a value that is
     * different from the actual version, a
     * <code>VersionConflictException</code> is thrown.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expectedVersion <p>
     *            The expected version of the security profile. A new version is
     *            generated whenever the security profile is updated. If you
     *            specify a value that is different from the actual version, a
     *            <code>VersionConflictException</code> is thrown.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
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
        if (getSecurityProfileName() != null)
            sb.append("securityProfileName: " + getSecurityProfileName() + ",");
        if (getSecurityProfileDescription() != null)
            sb.append("securityProfileDescription: " + getSecurityProfileDescription() + ",");
        if (getBehaviors() != null)
            sb.append("behaviors: " + getBehaviors() + ",");
        if (getAlertTargets() != null)
            sb.append("alertTargets: " + getAlertTargets() + ",");
        if (getAdditionalMetricsToRetain() != null)
            sb.append("additionalMetricsToRetain: " + getAdditionalMetricsToRetain() + ",");
        if (getAdditionalMetricsToRetainV2() != null)
            sb.append("additionalMetricsToRetainV2: " + getAdditionalMetricsToRetainV2() + ",");
        if (getDeleteBehaviors() != null)
            sb.append("deleteBehaviors: " + getDeleteBehaviors() + ",");
        if (getDeleteAlertTargets() != null)
            sb.append("deleteAlertTargets: " + getDeleteAlertTargets() + ",");
        if (getDeleteAdditionalMetricsToRetain() != null)
            sb.append("deleteAdditionalMetricsToRetain: " + getDeleteAdditionalMetricsToRetain()
                    + ",");
        if (getExpectedVersion() != null)
            sb.append("expectedVersion: " + getExpectedVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecurityProfileDescription() == null) ? 0 : getSecurityProfileDescription()
                        .hashCode());
        hashCode = prime * hashCode + ((getBehaviors() == null) ? 0 : getBehaviors().hashCode());
        hashCode = prime * hashCode
                + ((getAlertTargets() == null) ? 0 : getAlertTargets().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdditionalMetricsToRetain() == null) ? 0 : getAdditionalMetricsToRetain()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAdditionalMetricsToRetainV2() == null) ? 0
                        : getAdditionalMetricsToRetainV2().hashCode());
        hashCode = prime * hashCode
                + ((getDeleteBehaviors() == null) ? 0 : getDeleteBehaviors().hashCode());
        hashCode = prime * hashCode
                + ((getDeleteAlertTargets() == null) ? 0 : getDeleteAlertTargets().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeleteAdditionalMetricsToRetain() == null) ? 0
                        : getDeleteAdditionalMetricsToRetain().hashCode());
        hashCode = prime * hashCode
                + ((getExpectedVersion() == null) ? 0 : getExpectedVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSecurityProfileRequest == false)
            return false;
        UpdateSecurityProfileRequest other = (UpdateSecurityProfileRequest) obj;

        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null
                && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getSecurityProfileDescription() == null
                ^ this.getSecurityProfileDescription() == null)
            return false;
        if (other.getSecurityProfileDescription() != null
                && other.getSecurityProfileDescription().equals(
                        this.getSecurityProfileDescription()) == false)
            return false;
        if (other.getBehaviors() == null ^ this.getBehaviors() == null)
            return false;
        if (other.getBehaviors() != null
                && other.getBehaviors().equals(this.getBehaviors()) == false)
            return false;
        if (other.getAlertTargets() == null ^ this.getAlertTargets() == null)
            return false;
        if (other.getAlertTargets() != null
                && other.getAlertTargets().equals(this.getAlertTargets()) == false)
            return false;
        if (other.getAdditionalMetricsToRetain() == null
                ^ this.getAdditionalMetricsToRetain() == null)
            return false;
        if (other.getAdditionalMetricsToRetain() != null
                && other.getAdditionalMetricsToRetain().equals(this.getAdditionalMetricsToRetain()) == false)
            return false;
        if (other.getAdditionalMetricsToRetainV2() == null
                ^ this.getAdditionalMetricsToRetainV2() == null)
            return false;
        if (other.getAdditionalMetricsToRetainV2() != null
                && other.getAdditionalMetricsToRetainV2().equals(
                        this.getAdditionalMetricsToRetainV2()) == false)
            return false;
        if (other.getDeleteBehaviors() == null ^ this.getDeleteBehaviors() == null)
            return false;
        if (other.getDeleteBehaviors() != null
                && other.getDeleteBehaviors().equals(this.getDeleteBehaviors()) == false)
            return false;
        if (other.getDeleteAlertTargets() == null ^ this.getDeleteAlertTargets() == null)
            return false;
        if (other.getDeleteAlertTargets() != null
                && other.getDeleteAlertTargets().equals(this.getDeleteAlertTargets()) == false)
            return false;
        if (other.getDeleteAdditionalMetricsToRetain() == null
                ^ this.getDeleteAdditionalMetricsToRetain() == null)
            return false;
        if (other.getDeleteAdditionalMetricsToRetain() != null
                && other.getDeleteAdditionalMetricsToRetain().equals(
                        this.getDeleteAdditionalMetricsToRetain()) == false)
            return false;
        if (other.getExpectedVersion() == null ^ this.getExpectedVersion() == null)
            return false;
        if (other.getExpectedVersion() != null
                && other.getExpectedVersion().equals(this.getExpectedVersion()) == false)
            return false;
        return true;
    }
}
