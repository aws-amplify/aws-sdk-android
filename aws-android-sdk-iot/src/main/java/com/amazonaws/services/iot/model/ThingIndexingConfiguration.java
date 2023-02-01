/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The thing indexing configuration. For more information, see <a href=
 * "https://docs.aws.amazon.com/iot/latest/developerguide/managing-index.html"
 * >Managing Thing Indexing</a>.
 * </p>
 */
public class ThingIndexingConfiguration implements Serializable {
    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, REGISTRY, REGISTRY_AND_SHADOW
     */
    private String thingIndexingMode;

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing
     * connectivity indexing, <i>thingIndexMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, STATUS
     */
    private String thingConnectivityIndexingMode;

    /**
     * <p>
     * Device Defender indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VIOLATIONS – Your thing index contains Device Defender violations. To
     * enable Device Defender indexing, <i>deviceDefenderIndexingMode</i> must
     * not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Device Defender indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Device Defender violations, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html"
     * >Device Defender Detect.</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, VIOLATIONS
     */
    private String deviceDefenderIndexingMode;

    /**
     * <p>
     * Named shadow indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ON – Your thing index contains named shadow. To enable thing named shadow
     * indexing, <i>namedShadowIndexingMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Named shadow indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Shadows, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html"
     * >IoT Device Shadow service.</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     */
    private String namedShadowIndexingMode;

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the
     * Fleet Indexing service.
     * </p>
     */
    private java.util.List<Field> managedFields;

    /**
     * <p>
     * Contains custom field names and their data type.
     * </p>
     */
    private java.util.List<Field> customFields;

    /**
     * <p>
     * Provides additional filters for specific data sources. Named shadow is
     * the only data source that currently supports and requires a filter. To
     * add named shadows to your fleet indexing configuration, set
     * <code>namedShadowIndexingMode</code> to be <code>ON</code> and specify
     * your shadow names in <code>filter</code>.
     * </p>
     */
    private IndexingFilter filter;

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, REGISTRY, REGISTRY_AND_SHADOW
     *
     * @return <p>
     *         Thing indexing mode. Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         REGISTRY – Your thing index contains registry data only.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REGISTRY_AND_SHADOW - Your thing index contains registry and
     *         shadow data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OFF - Thing indexing is disabled.
     *         </p>
     *         </li>
     *         </ul>
     * @see ThingIndexingMode
     */
    public String getThingIndexingMode() {
        return thingIndexingMode;
    }

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, REGISTRY, REGISTRY_AND_SHADOW
     *
     * @param thingIndexingMode <p>
     *            Thing indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            REGISTRY – Your thing index contains registry data only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGISTRY_AND_SHADOW - Your thing index contains registry and
     *            shadow data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Thing indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @see ThingIndexingMode
     */
    public void setThingIndexingMode(String thingIndexingMode) {
        this.thingIndexingMode = thingIndexingMode;
    }

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, REGISTRY, REGISTRY_AND_SHADOW
     *
     * @param thingIndexingMode <p>
     *            Thing indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            REGISTRY – Your thing index contains registry data only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGISTRY_AND_SHADOW - Your thing index contains registry and
     *            shadow data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Thing indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThingIndexingMode
     */
    public ThingIndexingConfiguration withThingIndexingMode(String thingIndexingMode) {
        this.thingIndexingMode = thingIndexingMode;
        return this;
    }

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, REGISTRY, REGISTRY_AND_SHADOW
     *
     * @param thingIndexingMode <p>
     *            Thing indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            REGISTRY – Your thing index contains registry data only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGISTRY_AND_SHADOW - Your thing index contains registry and
     *            shadow data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Thing indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @see ThingIndexingMode
     */
    public void setThingIndexingMode(ThingIndexingMode thingIndexingMode) {
        this.thingIndexingMode = thingIndexingMode.toString();
    }

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, REGISTRY, REGISTRY_AND_SHADOW
     *
     * @param thingIndexingMode <p>
     *            Thing indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            REGISTRY – Your thing index contains registry data only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGISTRY_AND_SHADOW - Your thing index contains registry and
     *            shadow data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Thing indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThingIndexingMode
     */
    public ThingIndexingConfiguration withThingIndexingMode(ThingIndexingMode thingIndexingMode) {
        this.thingIndexingMode = thingIndexingMode.toString();
        return this;
    }

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing
     * connectivity indexing, <i>thingIndexMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, STATUS
     *
     * @return <p>
     *         Thing connectivity indexing mode. Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         STATUS – Your thing index contains connectivity status. To enable
     *         thing connectivity indexing, <i>thingIndexMode</i> must not be
     *         set to OFF.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OFF - Thing connectivity status indexing is disabled.
     *         </p>
     *         </li>
     *         </ul>
     * @see ThingConnectivityIndexingMode
     */
    public String getThingConnectivityIndexingMode() {
        return thingConnectivityIndexingMode;
    }

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing
     * connectivity indexing, <i>thingIndexMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, STATUS
     *
     * @param thingConnectivityIndexingMode <p>
     *            Thing connectivity indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            STATUS – Your thing index contains connectivity status. To
     *            enable thing connectivity indexing, <i>thingIndexMode</i> must
     *            not be set to OFF.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Thing connectivity status indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @see ThingConnectivityIndexingMode
     */
    public void setThingConnectivityIndexingMode(String thingConnectivityIndexingMode) {
        this.thingConnectivityIndexingMode = thingConnectivityIndexingMode;
    }

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing
     * connectivity indexing, <i>thingIndexMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, STATUS
     *
     * @param thingConnectivityIndexingMode <p>
     *            Thing connectivity indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            STATUS – Your thing index contains connectivity status. To
     *            enable thing connectivity indexing, <i>thingIndexMode</i> must
     *            not be set to OFF.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Thing connectivity status indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThingConnectivityIndexingMode
     */
    public ThingIndexingConfiguration withThingConnectivityIndexingMode(
            String thingConnectivityIndexingMode) {
        this.thingConnectivityIndexingMode = thingConnectivityIndexingMode;
        return this;
    }

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing
     * connectivity indexing, <i>thingIndexMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, STATUS
     *
     * @param thingConnectivityIndexingMode <p>
     *            Thing connectivity indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            STATUS – Your thing index contains connectivity status. To
     *            enable thing connectivity indexing, <i>thingIndexMode</i> must
     *            not be set to OFF.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Thing connectivity status indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @see ThingConnectivityIndexingMode
     */
    public void setThingConnectivityIndexingMode(
            ThingConnectivityIndexingMode thingConnectivityIndexingMode) {
        this.thingConnectivityIndexingMode = thingConnectivityIndexingMode.toString();
    }

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing
     * connectivity indexing, <i>thingIndexMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, STATUS
     *
     * @param thingConnectivityIndexingMode <p>
     *            Thing connectivity indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            STATUS – Your thing index contains connectivity status. To
     *            enable thing connectivity indexing, <i>thingIndexMode</i> must
     *            not be set to OFF.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Thing connectivity status indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThingConnectivityIndexingMode
     */
    public ThingIndexingConfiguration withThingConnectivityIndexingMode(
            ThingConnectivityIndexingMode thingConnectivityIndexingMode) {
        this.thingConnectivityIndexingMode = thingConnectivityIndexingMode.toString();
        return this;
    }

    /**
     * <p>
     * Device Defender indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VIOLATIONS – Your thing index contains Device Defender violations. To
     * enable Device Defender indexing, <i>deviceDefenderIndexingMode</i> must
     * not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Device Defender indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Device Defender violations, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html"
     * >Device Defender Detect.</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, VIOLATIONS
     *
     * @return <p>
     *         Device Defender indexing mode. Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         VIOLATIONS – Your thing index contains Device Defender
     *         violations. To enable Device Defender indexing,
     *         <i>deviceDefenderIndexingMode</i> must not be set to OFF.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OFF - Device Defender indexing is disabled.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about Device Defender violations, see <a
     *         href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html"
     *         >Device Defender Detect.</a>
     *         </p>
     * @see DeviceDefenderIndexingMode
     */
    public String getDeviceDefenderIndexingMode() {
        return deviceDefenderIndexingMode;
    }

    /**
     * <p>
     * Device Defender indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VIOLATIONS – Your thing index contains Device Defender violations. To
     * enable Device Defender indexing, <i>deviceDefenderIndexingMode</i> must
     * not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Device Defender indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Device Defender violations, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html"
     * >Device Defender Detect.</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, VIOLATIONS
     *
     * @param deviceDefenderIndexingMode <p>
     *            Device Defender indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            VIOLATIONS – Your thing index contains Device Defender
     *            violations. To enable Device Defender indexing,
     *            <i>deviceDefenderIndexingMode</i> must not be set to OFF.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Device Defender indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about Device Defender violations, see <a
     *            href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html"
     *            >Device Defender Detect.</a>
     *            </p>
     * @see DeviceDefenderIndexingMode
     */
    public void setDeviceDefenderIndexingMode(String deviceDefenderIndexingMode) {
        this.deviceDefenderIndexingMode = deviceDefenderIndexingMode;
    }

    /**
     * <p>
     * Device Defender indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VIOLATIONS – Your thing index contains Device Defender violations. To
     * enable Device Defender indexing, <i>deviceDefenderIndexingMode</i> must
     * not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Device Defender indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Device Defender violations, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html"
     * >Device Defender Detect.</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, VIOLATIONS
     *
     * @param deviceDefenderIndexingMode <p>
     *            Device Defender indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            VIOLATIONS – Your thing index contains Device Defender
     *            violations. To enable Device Defender indexing,
     *            <i>deviceDefenderIndexingMode</i> must not be set to OFF.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Device Defender indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about Device Defender violations, see <a
     *            href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html"
     *            >Device Defender Detect.</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceDefenderIndexingMode
     */
    public ThingIndexingConfiguration withDeviceDefenderIndexingMode(
            String deviceDefenderIndexingMode) {
        this.deviceDefenderIndexingMode = deviceDefenderIndexingMode;
        return this;
    }

    /**
     * <p>
     * Device Defender indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VIOLATIONS – Your thing index contains Device Defender violations. To
     * enable Device Defender indexing, <i>deviceDefenderIndexingMode</i> must
     * not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Device Defender indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Device Defender violations, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html"
     * >Device Defender Detect.</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, VIOLATIONS
     *
     * @param deviceDefenderIndexingMode <p>
     *            Device Defender indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            VIOLATIONS – Your thing index contains Device Defender
     *            violations. To enable Device Defender indexing,
     *            <i>deviceDefenderIndexingMode</i> must not be set to OFF.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Device Defender indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about Device Defender violations, see <a
     *            href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html"
     *            >Device Defender Detect.</a>
     *            </p>
     * @see DeviceDefenderIndexingMode
     */
    public void setDeviceDefenderIndexingMode(DeviceDefenderIndexingMode deviceDefenderIndexingMode) {
        this.deviceDefenderIndexingMode = deviceDefenderIndexingMode.toString();
    }

    /**
     * <p>
     * Device Defender indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * VIOLATIONS – Your thing index contains Device Defender violations. To
     * enable Device Defender indexing, <i>deviceDefenderIndexingMode</i> must
     * not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Device Defender indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Device Defender violations, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html"
     * >Device Defender Detect.</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, VIOLATIONS
     *
     * @param deviceDefenderIndexingMode <p>
     *            Device Defender indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            VIOLATIONS – Your thing index contains Device Defender
     *            violations. To enable Device Defender indexing,
     *            <i>deviceDefenderIndexingMode</i> must not be set to OFF.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Device Defender indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about Device Defender violations, see <a
     *            href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/device-defender-detect.html"
     *            >Device Defender Detect.</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceDefenderIndexingMode
     */
    public ThingIndexingConfiguration withDeviceDefenderIndexingMode(
            DeviceDefenderIndexingMode deviceDefenderIndexingMode) {
        this.deviceDefenderIndexingMode = deviceDefenderIndexingMode.toString();
        return this;
    }

    /**
     * <p>
     * Named shadow indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ON – Your thing index contains named shadow. To enable thing named shadow
     * indexing, <i>namedShadowIndexingMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Named shadow indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Shadows, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html"
     * >IoT Device Shadow service.</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @return <p>
     *         Named shadow indexing mode. Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ON – Your thing index contains named shadow. To enable thing
     *         named shadow indexing, <i>namedShadowIndexingMode</i> must not be
     *         set to OFF.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OFF - Named shadow indexing is disabled.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about Shadows, see <a href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html"
     *         >IoT Device Shadow service.</a>
     *         </p>
     * @see NamedShadowIndexingMode
     */
    public String getNamedShadowIndexingMode() {
        return namedShadowIndexingMode;
    }

    /**
     * <p>
     * Named shadow indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ON – Your thing index contains named shadow. To enable thing named shadow
     * indexing, <i>namedShadowIndexingMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Named shadow indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Shadows, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html"
     * >IoT Device Shadow service.</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @param namedShadowIndexingMode <p>
     *            Named shadow indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ON – Your thing index contains named shadow. To enable thing
     *            named shadow indexing, <i>namedShadowIndexingMode</i> must not
     *            be set to OFF.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Named shadow indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about Shadows, see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html"
     *            >IoT Device Shadow service.</a>
     *            </p>
     * @see NamedShadowIndexingMode
     */
    public void setNamedShadowIndexingMode(String namedShadowIndexingMode) {
        this.namedShadowIndexingMode = namedShadowIndexingMode;
    }

    /**
     * <p>
     * Named shadow indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ON – Your thing index contains named shadow. To enable thing named shadow
     * indexing, <i>namedShadowIndexingMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Named shadow indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Shadows, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html"
     * >IoT Device Shadow service.</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @param namedShadowIndexingMode <p>
     *            Named shadow indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ON – Your thing index contains named shadow. To enable thing
     *            named shadow indexing, <i>namedShadowIndexingMode</i> must not
     *            be set to OFF.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Named shadow indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about Shadows, see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html"
     *            >IoT Device Shadow service.</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NamedShadowIndexingMode
     */
    public ThingIndexingConfiguration withNamedShadowIndexingMode(String namedShadowIndexingMode) {
        this.namedShadowIndexingMode = namedShadowIndexingMode;
        return this;
    }

    /**
     * <p>
     * Named shadow indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ON – Your thing index contains named shadow. To enable thing named shadow
     * indexing, <i>namedShadowIndexingMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Named shadow indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Shadows, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html"
     * >IoT Device Shadow service.</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @param namedShadowIndexingMode <p>
     *            Named shadow indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ON – Your thing index contains named shadow. To enable thing
     *            named shadow indexing, <i>namedShadowIndexingMode</i> must not
     *            be set to OFF.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Named shadow indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about Shadows, see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html"
     *            >IoT Device Shadow service.</a>
     *            </p>
     * @see NamedShadowIndexingMode
     */
    public void setNamedShadowIndexingMode(NamedShadowIndexingMode namedShadowIndexingMode) {
        this.namedShadowIndexingMode = namedShadowIndexingMode.toString();
    }

    /**
     * <p>
     * Named shadow indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ON – Your thing index contains named shadow. To enable thing named shadow
     * indexing, <i>namedShadowIndexingMode</i> must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Named shadow indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Shadows, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html"
     * >IoT Device Shadow service.</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON
     *
     * @param namedShadowIndexingMode <p>
     *            Named shadow indexing mode. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ON – Your thing index contains named shadow. To enable thing
     *            named shadow indexing, <i>namedShadowIndexingMode</i> must not
     *            be set to OFF.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OFF - Named shadow indexing is disabled.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about Shadows, see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html"
     *            >IoT Device Shadow service.</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NamedShadowIndexingMode
     */
    public ThingIndexingConfiguration withNamedShadowIndexingMode(
            NamedShadowIndexingMode namedShadowIndexingMode) {
        this.namedShadowIndexingMode = namedShadowIndexingMode.toString();
        return this;
    }

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the
     * Fleet Indexing service.
     * </p>
     *
     * @return <p>
     *         Contains fields that are indexed and whose types are already
     *         known by the Fleet Indexing service.
     *         </p>
     */
    public java.util.List<Field> getManagedFields() {
        return managedFields;
    }

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the
     * Fleet Indexing service.
     * </p>
     *
     * @param managedFields <p>
     *            Contains fields that are indexed and whose types are already
     *            known by the Fleet Indexing service.
     *            </p>
     */
    public void setManagedFields(java.util.Collection<Field> managedFields) {
        if (managedFields == null) {
            this.managedFields = null;
            return;
        }

        this.managedFields = new java.util.ArrayList<Field>(managedFields);
    }

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the
     * Fleet Indexing service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param managedFields <p>
     *            Contains fields that are indexed and whose types are already
     *            known by the Fleet Indexing service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingIndexingConfiguration withManagedFields(Field... managedFields) {
        if (getManagedFields() == null) {
            this.managedFields = new java.util.ArrayList<Field>(managedFields.length);
        }
        for (Field value : managedFields) {
            this.managedFields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the
     * Fleet Indexing service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param managedFields <p>
     *            Contains fields that are indexed and whose types are already
     *            known by the Fleet Indexing service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingIndexingConfiguration withManagedFields(java.util.Collection<Field> managedFields) {
        setManagedFields(managedFields);
        return this;
    }

    /**
     * <p>
     * Contains custom field names and their data type.
     * </p>
     *
     * @return <p>
     *         Contains custom field names and their data type.
     *         </p>
     */
    public java.util.List<Field> getCustomFields() {
        return customFields;
    }

    /**
     * <p>
     * Contains custom field names and their data type.
     * </p>
     *
     * @param customFields <p>
     *            Contains custom field names and their data type.
     *            </p>
     */
    public void setCustomFields(java.util.Collection<Field> customFields) {
        if (customFields == null) {
            this.customFields = null;
            return;
        }

        this.customFields = new java.util.ArrayList<Field>(customFields);
    }

    /**
     * <p>
     * Contains custom field names and their data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customFields <p>
     *            Contains custom field names and their data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingIndexingConfiguration withCustomFields(Field... customFields) {
        if (getCustomFields() == null) {
            this.customFields = new java.util.ArrayList<Field>(customFields.length);
        }
        for (Field value : customFields) {
            this.customFields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains custom field names and their data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customFields <p>
     *            Contains custom field names and their data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingIndexingConfiguration withCustomFields(java.util.Collection<Field> customFields) {
        setCustomFields(customFields);
        return this;
    }

    /**
     * <p>
     * Provides additional filters for specific data sources. Named shadow is
     * the only data source that currently supports and requires a filter. To
     * add named shadows to your fleet indexing configuration, set
     * <code>namedShadowIndexingMode</code> to be <code>ON</code> and specify
     * your shadow names in <code>filter</code>.
     * </p>
     *
     * @return <p>
     *         Provides additional filters for specific data sources. Named
     *         shadow is the only data source that currently supports and
     *         requires a filter. To add named shadows to your fleet indexing
     *         configuration, set <code>namedShadowIndexingMode</code> to be
     *         <code>ON</code> and specify your shadow names in
     *         <code>filter</code>.
     *         </p>
     */
    public IndexingFilter getFilter() {
        return filter;
    }

    /**
     * <p>
     * Provides additional filters for specific data sources. Named shadow is
     * the only data source that currently supports and requires a filter. To
     * add named shadows to your fleet indexing configuration, set
     * <code>namedShadowIndexingMode</code> to be <code>ON</code> and specify
     * your shadow names in <code>filter</code>.
     * </p>
     *
     * @param filter <p>
     *            Provides additional filters for specific data sources. Named
     *            shadow is the only data source that currently supports and
     *            requires a filter. To add named shadows to your fleet indexing
     *            configuration, set <code>namedShadowIndexingMode</code> to be
     *            <code>ON</code> and specify your shadow names in
     *            <code>filter</code>.
     *            </p>
     */
    public void setFilter(IndexingFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Provides additional filters for specific data sources. Named shadow is
     * the only data source that currently supports and requires a filter. To
     * add named shadows to your fleet indexing configuration, set
     * <code>namedShadowIndexingMode</code> to be <code>ON</code> and specify
     * your shadow names in <code>filter</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            Provides additional filters for specific data sources. Named
     *            shadow is the only data source that currently supports and
     *            requires a filter. To add named shadows to your fleet indexing
     *            configuration, set <code>namedShadowIndexingMode</code> to be
     *            <code>ON</code> and specify your shadow names in
     *            <code>filter</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingIndexingConfiguration withFilter(IndexingFilter filter) {
        this.filter = filter;
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
        if (getThingIndexingMode() != null)
            sb.append("thingIndexingMode: " + getThingIndexingMode() + ",");
        if (getThingConnectivityIndexingMode() != null)
            sb.append("thingConnectivityIndexingMode: " + getThingConnectivityIndexingMode() + ",");
        if (getDeviceDefenderIndexingMode() != null)
            sb.append("deviceDefenderIndexingMode: " + getDeviceDefenderIndexingMode() + ",");
        if (getNamedShadowIndexingMode() != null)
            sb.append("namedShadowIndexingMode: " + getNamedShadowIndexingMode() + ",");
        if (getManagedFields() != null)
            sb.append("managedFields: " + getManagedFields() + ",");
        if (getCustomFields() != null)
            sb.append("customFields: " + getCustomFields() + ",");
        if (getFilter() != null)
            sb.append("filter: " + getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getThingIndexingMode() == null) ? 0 : getThingIndexingMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getThingConnectivityIndexingMode() == null) ? 0
                        : getThingConnectivityIndexingMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeviceDefenderIndexingMode() == null) ? 0 : getDeviceDefenderIndexingMode()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNamedShadowIndexingMode() == null) ? 0 : getNamedShadowIndexingMode()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getManagedFields() == null) ? 0 : getManagedFields().hashCode());
        hashCode = prime * hashCode
                + ((getCustomFields() == null) ? 0 : getCustomFields().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingIndexingConfiguration == false)
            return false;
        ThingIndexingConfiguration other = (ThingIndexingConfiguration) obj;

        if (other.getThingIndexingMode() == null ^ this.getThingIndexingMode() == null)
            return false;
        if (other.getThingIndexingMode() != null
                && other.getThingIndexingMode().equals(this.getThingIndexingMode()) == false)
            return false;
        if (other.getThingConnectivityIndexingMode() == null
                ^ this.getThingConnectivityIndexingMode() == null)
            return false;
        if (other.getThingConnectivityIndexingMode() != null
                && other.getThingConnectivityIndexingMode().equals(
                        this.getThingConnectivityIndexingMode()) == false)
            return false;
        if (other.getDeviceDefenderIndexingMode() == null
                ^ this.getDeviceDefenderIndexingMode() == null)
            return false;
        if (other.getDeviceDefenderIndexingMode() != null
                && other.getDeviceDefenderIndexingMode().equals(
                        this.getDeviceDefenderIndexingMode()) == false)
            return false;
        if (other.getNamedShadowIndexingMode() == null ^ this.getNamedShadowIndexingMode() == null)
            return false;
        if (other.getNamedShadowIndexingMode() != null
                && other.getNamedShadowIndexingMode().equals(this.getNamedShadowIndexingMode()) == false)
            return false;
        if (other.getManagedFields() == null ^ this.getManagedFields() == null)
            return false;
        if (other.getManagedFields() != null
                && other.getManagedFields().equals(this.getManagedFields()) == false)
            return false;
        if (other.getCustomFields() == null ^ this.getCustomFields() == null)
            return false;
        if (other.getCustomFields() != null
                && other.getCustomFields().equals(this.getCustomFields()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }
}
