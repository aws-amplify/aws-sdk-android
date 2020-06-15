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

/**
 * <p>
 * A room profile with attributes.
 * </p>
 */
public class Profile implements Serializable {
    /**
     * <p>
     * The ARN of a room profile.
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
     * The name of a room profile.
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
     * Retrieves if the profile is default or not.
     * </p>
     */
    private Boolean isDefault;

    /**
     * <p>
     * The address of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private String address;

    /**
     * <p>
     * The time zone of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String timezone;

    /**
     * <p>
     * The distance unit of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>METRIC, IMPERIAL
     */
    private String distanceUnit;

    /**
     * <p>
     * The temperature unit of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAHRENHEIT, CELSIUS
     */
    private String temperatureUnit;

    /**
     * <p>
     * The wake word of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA, AMAZON, ECHO, COMPUTER
     */
    private String wakeWord;

    /**
     * <p>
     * The locale of a room profile. (This is currently available only to a
     * limited preview audience.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String locale;

    /**
     * <p>
     * The setup mode of a room profile.
     * </p>
     */
    private Boolean setupModeDisabled;

    /**
     * <p>
     * The max volume limit of a room profile.
     * </p>
     */
    private Integer maxVolumeLimit;

    /**
     * <p>
     * The PSTN setting of a room profile.
     * </p>
     */
    private Boolean pSTNEnabled;

    /**
     * <p>
     * The ARN of the address book.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String addressBookArn;

    /**
     * <p>
     * Meeting room settings of a room profile.
     * </p>
     */
    private MeetingRoomConfiguration meetingRoomConfiguration;

    /**
     * <p>
     * The ARN of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of a room profile.
     *         </p>
     */
    public String getProfileArn() {
        return profileArn;
    }

    /**
     * <p>
     * The ARN of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param profileArn <p>
     *            The ARN of a room profile.
     *            </p>
     */
    public void setProfileArn(String profileArn) {
        this.profileArn = profileArn;
    }

    /**
     * <p>
     * The ARN of a room profile.
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
     *            The ARN of a room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Profile withProfileArn(String profileArn) {
        this.profileArn = profileArn;
        return this;
    }

    /**
     * <p>
     * The name of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The name of a room profile.
     *         </p>
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * <p>
     * The name of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param profileName <p>
     *            The name of a room profile.
     *            </p>
     */
    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The name of a room profile.
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
     *            The name of a room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Profile withProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }

    /**
     * <p>
     * Retrieves if the profile is default or not.
     * </p>
     *
     * @return <p>
     *         Retrieves if the profile is default or not.
     *         </p>
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * <p>
     * Retrieves if the profile is default or not.
     * </p>
     *
     * @return <p>
     *         Retrieves if the profile is default or not.
     *         </p>
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * <p>
     * Retrieves if the profile is default or not.
     * </p>
     *
     * @param isDefault <p>
     *            Retrieves if the profile is default or not.
     *            </p>
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Retrieves if the profile is default or not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isDefault <p>
     *            Retrieves if the profile is default or not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Profile withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * <p>
     * The address of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return <p>
     *         The address of a room profile.
     *         </p>
     */
    public String getAddress() {
        return address;
    }

    /**
     * <p>
     * The address of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param address <p>
     *            The address of a room profile.
     *            </p>
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The address of a room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param address <p>
     *            The address of a room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Profile withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * <p>
     * The time zone of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The time zone of a room profile.
     *         </p>
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * <p>
     * The time zone of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param timezone <p>
     *            The time zone of a room profile.
     *            </p>
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone of a room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param timezone <p>
     *            The time zone of a room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Profile withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * <p>
     * The distance unit of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>METRIC, IMPERIAL
     *
     * @return <p>
     *         The distance unit of a room profile.
     *         </p>
     * @see DistanceUnit
     */
    public String getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * <p>
     * The distance unit of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>METRIC, IMPERIAL
     *
     * @param distanceUnit <p>
     *            The distance unit of a room profile.
     *            </p>
     * @see DistanceUnit
     */
    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    /**
     * <p>
     * The distance unit of a room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>METRIC, IMPERIAL
     *
     * @param distanceUnit <p>
     *            The distance unit of a room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DistanceUnit
     */
    public Profile withDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
        return this;
    }

    /**
     * <p>
     * The distance unit of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>METRIC, IMPERIAL
     *
     * @param distanceUnit <p>
     *            The distance unit of a room profile.
     *            </p>
     * @see DistanceUnit
     */
    public void setDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
    }

    /**
     * <p>
     * The distance unit of a room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>METRIC, IMPERIAL
     *
     * @param distanceUnit <p>
     *            The distance unit of a room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DistanceUnit
     */
    public Profile withDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
        return this;
    }

    /**
     * <p>
     * The temperature unit of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAHRENHEIT, CELSIUS
     *
     * @return <p>
     *         The temperature unit of a room profile.
     *         </p>
     * @see TemperatureUnit
     */
    public String getTemperatureUnit() {
        return temperatureUnit;
    }

    /**
     * <p>
     * The temperature unit of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAHRENHEIT, CELSIUS
     *
     * @param temperatureUnit <p>
     *            The temperature unit of a room profile.
     *            </p>
     * @see TemperatureUnit
     */
    public void setTemperatureUnit(String temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
    }

    /**
     * <p>
     * The temperature unit of a room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAHRENHEIT, CELSIUS
     *
     * @param temperatureUnit <p>
     *            The temperature unit of a room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TemperatureUnit
     */
    public Profile withTemperatureUnit(String temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
        return this;
    }

    /**
     * <p>
     * The temperature unit of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAHRENHEIT, CELSIUS
     *
     * @param temperatureUnit <p>
     *            The temperature unit of a room profile.
     *            </p>
     * @see TemperatureUnit
     */
    public void setTemperatureUnit(TemperatureUnit temperatureUnit) {
        this.temperatureUnit = temperatureUnit.toString();
    }

    /**
     * <p>
     * The temperature unit of a room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAHRENHEIT, CELSIUS
     *
     * @param temperatureUnit <p>
     *            The temperature unit of a room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TemperatureUnit
     */
    public Profile withTemperatureUnit(TemperatureUnit temperatureUnit) {
        this.temperatureUnit = temperatureUnit.toString();
        return this;
    }

    /**
     * <p>
     * The wake word of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA, AMAZON, ECHO, COMPUTER
     *
     * @return <p>
     *         The wake word of a room profile.
     *         </p>
     * @see WakeWord
     */
    public String getWakeWord() {
        return wakeWord;
    }

    /**
     * <p>
     * The wake word of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA, AMAZON, ECHO, COMPUTER
     *
     * @param wakeWord <p>
     *            The wake word of a room profile.
     *            </p>
     * @see WakeWord
     */
    public void setWakeWord(String wakeWord) {
        this.wakeWord = wakeWord;
    }

    /**
     * <p>
     * The wake word of a room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA, AMAZON, ECHO, COMPUTER
     *
     * @param wakeWord <p>
     *            The wake word of a room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WakeWord
     */
    public Profile withWakeWord(String wakeWord) {
        this.wakeWord = wakeWord;
        return this;
    }

    /**
     * <p>
     * The wake word of a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA, AMAZON, ECHO, COMPUTER
     *
     * @param wakeWord <p>
     *            The wake word of a room profile.
     *            </p>
     * @see WakeWord
     */
    public void setWakeWord(WakeWord wakeWord) {
        this.wakeWord = wakeWord.toString();
    }

    /**
     * <p>
     * The wake word of a room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA, AMAZON, ECHO, COMPUTER
     *
     * @param wakeWord <p>
     *            The wake word of a room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WakeWord
     */
    public Profile withWakeWord(WakeWord wakeWord) {
        this.wakeWord = wakeWord.toString();
        return this;
    }

    /**
     * <p>
     * The locale of a room profile. (This is currently available only to a
     * limited preview audience.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The locale of a room profile. (This is currently available only
     *         to a limited preview audience.)
     *         </p>
     */
    public String getLocale() {
        return locale;
    }

    /**
     * <p>
     * The locale of a room profile. (This is currently available only to a
     * limited preview audience.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param locale <p>
     *            The locale of a room profile. (This is currently available
     *            only to a limited preview audience.)
     *            </p>
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale of a room profile. (This is currently available only to a
     * limited preview audience.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param locale <p>
     *            The locale of a room profile. (This is currently available
     *            only to a limited preview audience.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Profile withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * <p>
     * The setup mode of a room profile.
     * </p>
     *
     * @return <p>
     *         The setup mode of a room profile.
     *         </p>
     */
    public Boolean isSetupModeDisabled() {
        return setupModeDisabled;
    }

    /**
     * <p>
     * The setup mode of a room profile.
     * </p>
     *
     * @return <p>
     *         The setup mode of a room profile.
     *         </p>
     */
    public Boolean getSetupModeDisabled() {
        return setupModeDisabled;
    }

    /**
     * <p>
     * The setup mode of a room profile.
     * </p>
     *
     * @param setupModeDisabled <p>
     *            The setup mode of a room profile.
     *            </p>
     */
    public void setSetupModeDisabled(Boolean setupModeDisabled) {
        this.setupModeDisabled = setupModeDisabled;
    }

    /**
     * <p>
     * The setup mode of a room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param setupModeDisabled <p>
     *            The setup mode of a room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Profile withSetupModeDisabled(Boolean setupModeDisabled) {
        this.setupModeDisabled = setupModeDisabled;
        return this;
    }

    /**
     * <p>
     * The max volume limit of a room profile.
     * </p>
     *
     * @return <p>
     *         The max volume limit of a room profile.
     *         </p>
     */
    public Integer getMaxVolumeLimit() {
        return maxVolumeLimit;
    }

    /**
     * <p>
     * The max volume limit of a room profile.
     * </p>
     *
     * @param maxVolumeLimit <p>
     *            The max volume limit of a room profile.
     *            </p>
     */
    public void setMaxVolumeLimit(Integer maxVolumeLimit) {
        this.maxVolumeLimit = maxVolumeLimit;
    }

    /**
     * <p>
     * The max volume limit of a room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxVolumeLimit <p>
     *            The max volume limit of a room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Profile withMaxVolumeLimit(Integer maxVolumeLimit) {
        this.maxVolumeLimit = maxVolumeLimit;
        return this;
    }

    /**
     * <p>
     * The PSTN setting of a room profile.
     * </p>
     *
     * @return <p>
     *         The PSTN setting of a room profile.
     *         </p>
     */
    public Boolean isPSTNEnabled() {
        return pSTNEnabled;
    }

    /**
     * <p>
     * The PSTN setting of a room profile.
     * </p>
     *
     * @return <p>
     *         The PSTN setting of a room profile.
     *         </p>
     */
    public Boolean getPSTNEnabled() {
        return pSTNEnabled;
    }

    /**
     * <p>
     * The PSTN setting of a room profile.
     * </p>
     *
     * @param pSTNEnabled <p>
     *            The PSTN setting of a room profile.
     *            </p>
     */
    public void setPSTNEnabled(Boolean pSTNEnabled) {
        this.pSTNEnabled = pSTNEnabled;
    }

    /**
     * <p>
     * The PSTN setting of a room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pSTNEnabled <p>
     *            The PSTN setting of a room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Profile withPSTNEnabled(Boolean pSTNEnabled) {
        this.pSTNEnabled = pSTNEnabled;
        return this;
    }

    /**
     * <p>
     * The ARN of the address book.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the address book.
     *         </p>
     */
    public String getAddressBookArn() {
        return addressBookArn;
    }

    /**
     * <p>
     * The ARN of the address book.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param addressBookArn <p>
     *            The ARN of the address book.
     *            </p>
     */
    public void setAddressBookArn(String addressBookArn) {
        this.addressBookArn = addressBookArn;
    }

    /**
     * <p>
     * The ARN of the address book.
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
     * @param addressBookArn <p>
     *            The ARN of the address book.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Profile withAddressBookArn(String addressBookArn) {
        this.addressBookArn = addressBookArn;
        return this;
    }

    /**
     * <p>
     * Meeting room settings of a room profile.
     * </p>
     *
     * @return <p>
     *         Meeting room settings of a room profile.
     *         </p>
     */
    public MeetingRoomConfiguration getMeetingRoomConfiguration() {
        return meetingRoomConfiguration;
    }

    /**
     * <p>
     * Meeting room settings of a room profile.
     * </p>
     *
     * @param meetingRoomConfiguration <p>
     *            Meeting room settings of a room profile.
     *            </p>
     */
    public void setMeetingRoomConfiguration(MeetingRoomConfiguration meetingRoomConfiguration) {
        this.meetingRoomConfiguration = meetingRoomConfiguration;
    }

    /**
     * <p>
     * Meeting room settings of a room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param meetingRoomConfiguration <p>
     *            Meeting room settings of a room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Profile withMeetingRoomConfiguration(MeetingRoomConfiguration meetingRoomConfiguration) {
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
        if (getAddress() != null)
            sb.append("Address: " + getAddress() + ",");
        if (getTimezone() != null)
            sb.append("Timezone: " + getTimezone() + ",");
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
        if (getAddressBookArn() != null)
            sb.append("AddressBookArn: " + getAddressBookArn() + ",");
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
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
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
        hashCode = prime * hashCode
                + ((getAddressBookArn() == null) ? 0 : getAddressBookArn().hashCode());
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

        if (obj instanceof Profile == false)
            return false;
        Profile other = (Profile) obj;

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
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
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
        if (other.getAddressBookArn() == null ^ this.getAddressBookArn() == null)
            return false;
        if (other.getAddressBookArn() != null
                && other.getAddressBookArn().equals(this.getAddressBookArn()) == false)
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
