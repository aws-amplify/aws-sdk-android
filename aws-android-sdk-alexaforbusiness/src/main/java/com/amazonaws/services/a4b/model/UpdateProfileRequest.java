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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates an existing room profile by room profile ARN.
 * </p>
 */
public class UpdateProfileRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the room profile to update. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String profileArn;

    /**
     * <p>
     * The updated name for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String profileName;

    /**
     * <p>
     * Sets the profile as default if selected. If this is missing, no update is
     * done to the default status.
     * </p>
     */
    private Boolean isDefault;

    /**
     * <p>
     * The updated timezone for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String timezone;

    /**
     * <p>
     * The updated address for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private String address;

    /**
     * <p>
     * The updated distance unit for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>METRIC, IMPERIAL
     */
    private String distanceUnit;

    /**
     * <p>
     * The updated temperature unit for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAHRENHEIT, CELSIUS
     */
    private String temperatureUnit;

    /**
     * <p>
     * The updated wake word for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA, AMAZON, ECHO, COMPUTER
     */
    private String wakeWord;

    /**
     * <p>
     * The updated locale for the room profile. (This is currently only
     * available to a limited preview audience.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String locale;

    /**
     * <p>
     * Whether the setup mode of the profile is enabled.
     * </p>
     */
    private Boolean setupModeDisabled;

    /**
     * <p>
     * The updated maximum volume limit for the room profile.
     * </p>
     */
    private Integer maxVolumeLimit;

    /**
     * <p>
     * Whether the PSTN setting of the room profile is enabled.
     * </p>
     */
    private Boolean pSTNEnabled;

    /**
     * <p>
     * The updated meeting room settings of a room profile.
     * </p>
     */
    private UpdateMeetingRoomConfiguration meetingRoomConfiguration;

    /**
     * <p>
     * The ARN of the room profile to update. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the room profile to update. Required.
     *         </p>
     */
    public String getProfileArn() {
        return profileArn;
    }

    /**
     * <p>
     * The ARN of the room profile to update. Required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param profileArn <p>
     *            The ARN of the room profile to update. Required.
     *            </p>
     */
    public void setProfileArn(String profileArn) {
        this.profileArn = profileArn;
    }

    /**
     * <p>
     * The ARN of the room profile to update. Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param profileArn <p>
     *            The ARN of the room profile to update. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProfileRequest withProfileArn(String profileArn) {
        this.profileArn = profileArn;
        return this;
    }

    /**
     * <p>
     * The updated name for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The updated name for the room profile.
     *         </p>
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * <p>
     * The updated name for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param profileName <p>
     *            The updated name for the room profile.
     *            </p>
     */
    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The updated name for the room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param profileName <p>
     *            The updated name for the room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProfileRequest withProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }

    /**
     * <p>
     * Sets the profile as default if selected. If this is missing, no update is
     * done to the default status.
     * </p>
     *
     * @return <p>
     *         Sets the profile as default if selected. If this is missing, no
     *         update is done to the default status.
     *         </p>
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * <p>
     * Sets the profile as default if selected. If this is missing, no update is
     * done to the default status.
     * </p>
     *
     * @return <p>
     *         Sets the profile as default if selected. If this is missing, no
     *         update is done to the default status.
     *         </p>
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * <p>
     * Sets the profile as default if selected. If this is missing, no update is
     * done to the default status.
     * </p>
     *
     * @param isDefault <p>
     *            Sets the profile as default if selected. If this is missing,
     *            no update is done to the default status.
     *            </p>
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Sets the profile as default if selected. If this is missing, no update is
     * done to the default status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isDefault <p>
     *            Sets the profile as default if selected. If this is missing,
     *            no update is done to the default status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProfileRequest withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * <p>
     * The updated timezone for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The updated timezone for the room profile.
     *         </p>
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * <p>
     * The updated timezone for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param timezone <p>
     *            The updated timezone for the room profile.
     *            </p>
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The updated timezone for the room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param timezone <p>
     *            The updated timezone for the room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProfileRequest withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * <p>
     * The updated address for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return <p>
     *         The updated address for the room profile.
     *         </p>
     */
    public String getAddress() {
        return address;
    }

    /**
     * <p>
     * The updated address for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param address <p>
     *            The updated address for the room profile.
     *            </p>
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The updated address for the room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param address <p>
     *            The updated address for the room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProfileRequest withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * <p>
     * The updated distance unit for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>METRIC, IMPERIAL
     *
     * @return <p>
     *         The updated distance unit for the room profile.
     *         </p>
     * @see DistanceUnit
     */
    public String getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * <p>
     * The updated distance unit for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>METRIC, IMPERIAL
     *
     * @param distanceUnit <p>
     *            The updated distance unit for the room profile.
     *            </p>
     * @see DistanceUnit
     */
    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    /**
     * <p>
     * The updated distance unit for the room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>METRIC, IMPERIAL
     *
     * @param distanceUnit <p>
     *            The updated distance unit for the room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DistanceUnit
     */
    public UpdateProfileRequest withDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
        return this;
    }

    /**
     * <p>
     * The updated distance unit for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>METRIC, IMPERIAL
     *
     * @param distanceUnit <p>
     *            The updated distance unit for the room profile.
     *            </p>
     * @see DistanceUnit
     */
    public void setDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
    }

    /**
     * <p>
     * The updated distance unit for the room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>METRIC, IMPERIAL
     *
     * @param distanceUnit <p>
     *            The updated distance unit for the room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DistanceUnit
     */
    public UpdateProfileRequest withDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
        return this;
    }

    /**
     * <p>
     * The updated temperature unit for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAHRENHEIT, CELSIUS
     *
     * @return <p>
     *         The updated temperature unit for the room profile.
     *         </p>
     * @see TemperatureUnit
     */
    public String getTemperatureUnit() {
        return temperatureUnit;
    }

    /**
     * <p>
     * The updated temperature unit for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAHRENHEIT, CELSIUS
     *
     * @param temperatureUnit <p>
     *            The updated temperature unit for the room profile.
     *            </p>
     * @see TemperatureUnit
     */
    public void setTemperatureUnit(String temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
    }

    /**
     * <p>
     * The updated temperature unit for the room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAHRENHEIT, CELSIUS
     *
     * @param temperatureUnit <p>
     *            The updated temperature unit for the room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TemperatureUnit
     */
    public UpdateProfileRequest withTemperatureUnit(String temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
        return this;
    }

    /**
     * <p>
     * The updated temperature unit for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAHRENHEIT, CELSIUS
     *
     * @param temperatureUnit <p>
     *            The updated temperature unit for the room profile.
     *            </p>
     * @see TemperatureUnit
     */
    public void setTemperatureUnit(TemperatureUnit temperatureUnit) {
        this.temperatureUnit = temperatureUnit.toString();
    }

    /**
     * <p>
     * The updated temperature unit for the room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAHRENHEIT, CELSIUS
     *
     * @param temperatureUnit <p>
     *            The updated temperature unit for the room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TemperatureUnit
     */
    public UpdateProfileRequest withTemperatureUnit(TemperatureUnit temperatureUnit) {
        this.temperatureUnit = temperatureUnit.toString();
        return this;
    }

    /**
     * <p>
     * The updated wake word for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA, AMAZON, ECHO, COMPUTER
     *
     * @return <p>
     *         The updated wake word for the room profile.
     *         </p>
     * @see WakeWord
     */
    public String getWakeWord() {
        return wakeWord;
    }

    /**
     * <p>
     * The updated wake word for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA, AMAZON, ECHO, COMPUTER
     *
     * @param wakeWord <p>
     *            The updated wake word for the room profile.
     *            </p>
     * @see WakeWord
     */
    public void setWakeWord(String wakeWord) {
        this.wakeWord = wakeWord;
    }

    /**
     * <p>
     * The updated wake word for the room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA, AMAZON, ECHO, COMPUTER
     *
     * @param wakeWord <p>
     *            The updated wake word for the room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WakeWord
     */
    public UpdateProfileRequest withWakeWord(String wakeWord) {
        this.wakeWord = wakeWord;
        return this;
    }

    /**
     * <p>
     * The updated wake word for the room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA, AMAZON, ECHO, COMPUTER
     *
     * @param wakeWord <p>
     *            The updated wake word for the room profile.
     *            </p>
     * @see WakeWord
     */
    public void setWakeWord(WakeWord wakeWord) {
        this.wakeWord = wakeWord.toString();
    }

    /**
     * <p>
     * The updated wake word for the room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA, AMAZON, ECHO, COMPUTER
     *
     * @param wakeWord <p>
     *            The updated wake word for the room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WakeWord
     */
    public UpdateProfileRequest withWakeWord(WakeWord wakeWord) {
        this.wakeWord = wakeWord.toString();
        return this;
    }

    /**
     * <p>
     * The updated locale for the room profile. (This is currently only
     * available to a limited preview audience.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The updated locale for the room profile. (This is currently only
     *         available to a limited preview audience.)
     *         </p>
     */
    public String getLocale() {
        return locale;
    }

    /**
     * <p>
     * The updated locale for the room profile. (This is currently only
     * available to a limited preview audience.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param locale <p>
     *            The updated locale for the room profile. (This is currently
     *            only available to a limited preview audience.)
     *            </p>
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The updated locale for the room profile. (This is currently only
     * available to a limited preview audience.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param locale <p>
     *            The updated locale for the room profile. (This is currently
     *            only available to a limited preview audience.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProfileRequest withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * <p>
     * Whether the setup mode of the profile is enabled.
     * </p>
     *
     * @return <p>
     *         Whether the setup mode of the profile is enabled.
     *         </p>
     */
    public Boolean isSetupModeDisabled() {
        return setupModeDisabled;
    }

    /**
     * <p>
     * Whether the setup mode of the profile is enabled.
     * </p>
     *
     * @return <p>
     *         Whether the setup mode of the profile is enabled.
     *         </p>
     */
    public Boolean getSetupModeDisabled() {
        return setupModeDisabled;
    }

    /**
     * <p>
     * Whether the setup mode of the profile is enabled.
     * </p>
     *
     * @param setupModeDisabled <p>
     *            Whether the setup mode of the profile is enabled.
     *            </p>
     */
    public void setSetupModeDisabled(Boolean setupModeDisabled) {
        this.setupModeDisabled = setupModeDisabled;
    }

    /**
     * <p>
     * Whether the setup mode of the profile is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param setupModeDisabled <p>
     *            Whether the setup mode of the profile is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProfileRequest withSetupModeDisabled(Boolean setupModeDisabled) {
        this.setupModeDisabled = setupModeDisabled;
        return this;
    }

    /**
     * <p>
     * The updated maximum volume limit for the room profile.
     * </p>
     *
     * @return <p>
     *         The updated maximum volume limit for the room profile.
     *         </p>
     */
    public Integer getMaxVolumeLimit() {
        return maxVolumeLimit;
    }

    /**
     * <p>
     * The updated maximum volume limit for the room profile.
     * </p>
     *
     * @param maxVolumeLimit <p>
     *            The updated maximum volume limit for the room profile.
     *            </p>
     */
    public void setMaxVolumeLimit(Integer maxVolumeLimit) {
        this.maxVolumeLimit = maxVolumeLimit;
    }

    /**
     * <p>
     * The updated maximum volume limit for the room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxVolumeLimit <p>
     *            The updated maximum volume limit for the room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProfileRequest withMaxVolumeLimit(Integer maxVolumeLimit) {
        this.maxVolumeLimit = maxVolumeLimit;
        return this;
    }

    /**
     * <p>
     * Whether the PSTN setting of the room profile is enabled.
     * </p>
     *
     * @return <p>
     *         Whether the PSTN setting of the room profile is enabled.
     *         </p>
     */
    public Boolean isPSTNEnabled() {
        return pSTNEnabled;
    }

    /**
     * <p>
     * Whether the PSTN setting of the room profile is enabled.
     * </p>
     *
     * @return <p>
     *         Whether the PSTN setting of the room profile is enabled.
     *         </p>
     */
    public Boolean getPSTNEnabled() {
        return pSTNEnabled;
    }

    /**
     * <p>
     * Whether the PSTN setting of the room profile is enabled.
     * </p>
     *
     * @param pSTNEnabled <p>
     *            Whether the PSTN setting of the room profile is enabled.
     *            </p>
     */
    public void setPSTNEnabled(Boolean pSTNEnabled) {
        this.pSTNEnabled = pSTNEnabled;
    }

    /**
     * <p>
     * Whether the PSTN setting of the room profile is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pSTNEnabled <p>
     *            Whether the PSTN setting of the room profile is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProfileRequest withPSTNEnabled(Boolean pSTNEnabled) {
        this.pSTNEnabled = pSTNEnabled;
        return this;
    }

    /**
     * <p>
     * The updated meeting room settings of a room profile.
     * </p>
     *
     * @return <p>
     *         The updated meeting room settings of a room profile.
     *         </p>
     */
    public UpdateMeetingRoomConfiguration getMeetingRoomConfiguration() {
        return meetingRoomConfiguration;
    }

    /**
     * <p>
     * The updated meeting room settings of a room profile.
     * </p>
     *
     * @param meetingRoomConfiguration <p>
     *            The updated meeting room settings of a room profile.
     *            </p>
     */
    public void setMeetingRoomConfiguration(UpdateMeetingRoomConfiguration meetingRoomConfiguration) {
        this.meetingRoomConfiguration = meetingRoomConfiguration;
    }

    /**
     * <p>
     * The updated meeting room settings of a room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param meetingRoomConfiguration <p>
     *            The updated meeting room settings of a room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProfileRequest withMeetingRoomConfiguration(
            UpdateMeetingRoomConfiguration meetingRoomConfiguration) {
        this.meetingRoomConfiguration = meetingRoomConfiguration;
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
        if (getProfileArn() != null)
            sb.append("ProfileArn: " + getProfileArn() + ",");
        if (getProfileName() != null)
            sb.append("ProfileName: " + getProfileName() + ",");
        if (getIsDefault() != null)
            sb.append("IsDefault: " + getIsDefault() + ",");
        if (getTimezone() != null)
            sb.append("Timezone: " + getTimezone() + ",");
        if (getAddress() != null)
            sb.append("Address: " + getAddress() + ",");
        if (getDistanceUnit() != null)
            sb.append("DistanceUnit: " + getDistanceUnit() + ",");
        if (getTemperatureUnit() != null)
            sb.append("TemperatureUnit: " + getTemperatureUnit() + ",");
        if (getWakeWord() != null)
            sb.append("WakeWord: " + getWakeWord() + ",");
        if (getLocale() != null)
            sb.append("Locale: " + getLocale() + ",");
        if (getSetupModeDisabled() != null)
            sb.append("SetupModeDisabled: " + getSetupModeDisabled() + ",");
        if (getMaxVolumeLimit() != null)
            sb.append("MaxVolumeLimit: " + getMaxVolumeLimit() + ",");
        if (getPSTNEnabled() != null)
            sb.append("PSTNEnabled: " + getPSTNEnabled() + ",");
        if (getMeetingRoomConfiguration() != null)
            sb.append("MeetingRoomConfiguration: " + getMeetingRoomConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileArn() == null) ? 0 : getProfileArn().hashCode());
        hashCode = prime * hashCode
                + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode
                + ((getDistanceUnit() == null) ? 0 : getDistanceUnit().hashCode());
        hashCode = prime * hashCode
                + ((getTemperatureUnit() == null) ? 0 : getTemperatureUnit().hashCode());
        hashCode = prime * hashCode + ((getWakeWord() == null) ? 0 : getWakeWord().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode
                + ((getSetupModeDisabled() == null) ? 0 : getSetupModeDisabled().hashCode());
        hashCode = prime * hashCode
                + ((getMaxVolumeLimit() == null) ? 0 : getMaxVolumeLimit().hashCode());
        hashCode = prime * hashCode
                + ((getPSTNEnabled() == null) ? 0 : getPSTNEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getMeetingRoomConfiguration() == null) ? 0 : getMeetingRoomConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProfileRequest == false)
            return false;
        UpdateProfileRequest other = (UpdateProfileRequest) obj;

        if (other.getProfileArn() == null ^ this.getProfileArn() == null)
            return false;
        if (other.getProfileArn() != null
                && other.getProfileArn().equals(this.getProfileArn()) == false)
            return false;
        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null
                && other.getProfileName().equals(this.getProfileName()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null
                && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getDistanceUnit() == null ^ this.getDistanceUnit() == null)
            return false;
        if (other.getDistanceUnit() != null
                && other.getDistanceUnit().equals(this.getDistanceUnit()) == false)
            return false;
        if (other.getTemperatureUnit() == null ^ this.getTemperatureUnit() == null)
            return false;
        if (other.getTemperatureUnit() != null
                && other.getTemperatureUnit().equals(this.getTemperatureUnit()) == false)
            return false;
        if (other.getWakeWord() == null ^ this.getWakeWord() == null)
            return false;
        if (other.getWakeWord() != null && other.getWakeWord().equals(this.getWakeWord()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getSetupModeDisabled() == null ^ this.getSetupModeDisabled() == null)
            return false;
        if (other.getSetupModeDisabled() != null
                && other.getSetupModeDisabled().equals(this.getSetupModeDisabled()) == false)
            return false;
        if (other.getMaxVolumeLimit() == null ^ this.getMaxVolumeLimit() == null)
            return false;
        if (other.getMaxVolumeLimit() != null
                && other.getMaxVolumeLimit().equals(this.getMaxVolumeLimit()) == false)
            return false;
        if (other.getPSTNEnabled() == null ^ this.getPSTNEnabled() == null)
            return false;
        if (other.getPSTNEnabled() != null
                && other.getPSTNEnabled().equals(this.getPSTNEnabled()) == false)
            return false;
        if (other.getMeetingRoomConfiguration() == null
                ^ this.getMeetingRoomConfiguration() == null)
            return false;
        if (other.getMeetingRoomConfiguration() != null
                && other.getMeetingRoomConfiguration().equals(this.getMeetingRoomConfiguration()) == false)
            return false;
        return true;
    }
}
