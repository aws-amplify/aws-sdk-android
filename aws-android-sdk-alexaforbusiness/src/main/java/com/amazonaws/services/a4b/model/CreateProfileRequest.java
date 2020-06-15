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
 * Creates a new room profile with the specified details.
 * </p>
 */
public class CreateProfileRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The time zone used by a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String timezone;

    /**
     * <p>
     * The valid address for the room.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private String address;

    /**
     * <p>
     * The distance unit to be used by devices in the profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>METRIC, IMPERIAL
     */
    private String distanceUnit;

    /**
     * <p>
     * The temperature unit to be used by devices in the profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAHRENHEIT, CELSIUS
     */
    private String temperatureUnit;

    /**
     * <p>
     * A wake word for Alexa, Echo, Amazon, or a computer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA, AMAZON, ECHO, COMPUTER
     */
    private String wakeWord;

    /**
     * <p>
     * The locale of the room profile. (This is currently only available to a
     * limited preview audience.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String locale;

    /**
     * <p>
     * The user-specified token that is used during the creation of a profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * Whether room profile setup is enabled.
     * </p>
     */
    private Boolean setupModeDisabled;

    /**
     * <p>
     * The maximum volume limit for a room profile.
     * </p>
     */
    private Integer maxVolumeLimit;

    /**
     * <p>
     * Whether PSTN calling is enabled.
     * </p>
     */
    private Boolean pSTNEnabled;

    /**
     * <p>
     * The meeting room settings of a room profile.
     * </p>
     */
    private CreateMeetingRoomConfiguration meetingRoomConfiguration;

    /**
     * <p>
     * The tags for the profile.
     * </p>
     */
    private java.util.List<Tag> tags;

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
    public CreateProfileRequest withProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }

    /**
     * <p>
     * The time zone used by a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The time zone used by a room profile.
     *         </p>
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * <p>
     * The time zone used by a room profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param timezone <p>
     *            The time zone used by a room profile.
     *            </p>
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone used by a room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param timezone <p>
     *            The time zone used by a room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProfileRequest withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * <p>
     * The valid address for the room.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return <p>
     *         The valid address for the room.
     *         </p>
     */
    public String getAddress() {
        return address;
    }

    /**
     * <p>
     * The valid address for the room.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param address <p>
     *            The valid address for the room.
     *            </p>
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The valid address for the room.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param address <p>
     *            The valid address for the room.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProfileRequest withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * <p>
     * The distance unit to be used by devices in the profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>METRIC, IMPERIAL
     *
     * @return <p>
     *         The distance unit to be used by devices in the profile.
     *         </p>
     * @see DistanceUnit
     */
    public String getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * <p>
     * The distance unit to be used by devices in the profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>METRIC, IMPERIAL
     *
     * @param distanceUnit <p>
     *            The distance unit to be used by devices in the profile.
     *            </p>
     * @see DistanceUnit
     */
    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    /**
     * <p>
     * The distance unit to be used by devices in the profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>METRIC, IMPERIAL
     *
     * @param distanceUnit <p>
     *            The distance unit to be used by devices in the profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DistanceUnit
     */
    public CreateProfileRequest withDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
        return this;
    }

    /**
     * <p>
     * The distance unit to be used by devices in the profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>METRIC, IMPERIAL
     *
     * @param distanceUnit <p>
     *            The distance unit to be used by devices in the profile.
     *            </p>
     * @see DistanceUnit
     */
    public void setDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
    }

    /**
     * <p>
     * The distance unit to be used by devices in the profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>METRIC, IMPERIAL
     *
     * @param distanceUnit <p>
     *            The distance unit to be used by devices in the profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DistanceUnit
     */
    public CreateProfileRequest withDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
        return this;
    }

    /**
     * <p>
     * The temperature unit to be used by devices in the profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAHRENHEIT, CELSIUS
     *
     * @return <p>
     *         The temperature unit to be used by devices in the profile.
     *         </p>
     * @see TemperatureUnit
     */
    public String getTemperatureUnit() {
        return temperatureUnit;
    }

    /**
     * <p>
     * The temperature unit to be used by devices in the profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAHRENHEIT, CELSIUS
     *
     * @param temperatureUnit <p>
     *            The temperature unit to be used by devices in the profile.
     *            </p>
     * @see TemperatureUnit
     */
    public void setTemperatureUnit(String temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
    }

    /**
     * <p>
     * The temperature unit to be used by devices in the profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAHRENHEIT, CELSIUS
     *
     * @param temperatureUnit <p>
     *            The temperature unit to be used by devices in the profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TemperatureUnit
     */
    public CreateProfileRequest withTemperatureUnit(String temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
        return this;
    }

    /**
     * <p>
     * The temperature unit to be used by devices in the profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAHRENHEIT, CELSIUS
     *
     * @param temperatureUnit <p>
     *            The temperature unit to be used by devices in the profile.
     *            </p>
     * @see TemperatureUnit
     */
    public void setTemperatureUnit(TemperatureUnit temperatureUnit) {
        this.temperatureUnit = temperatureUnit.toString();
    }

    /**
     * <p>
     * The temperature unit to be used by devices in the profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAHRENHEIT, CELSIUS
     *
     * @param temperatureUnit <p>
     *            The temperature unit to be used by devices in the profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TemperatureUnit
     */
    public CreateProfileRequest withTemperatureUnit(TemperatureUnit temperatureUnit) {
        this.temperatureUnit = temperatureUnit.toString();
        return this;
    }

    /**
     * <p>
     * A wake word for Alexa, Echo, Amazon, or a computer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA, AMAZON, ECHO, COMPUTER
     *
     * @return <p>
     *         A wake word for Alexa, Echo, Amazon, or a computer.
     *         </p>
     * @see WakeWord
     */
    public String getWakeWord() {
        return wakeWord;
    }

    /**
     * <p>
     * A wake word for Alexa, Echo, Amazon, or a computer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA, AMAZON, ECHO, COMPUTER
     *
     * @param wakeWord <p>
     *            A wake word for Alexa, Echo, Amazon, or a computer.
     *            </p>
     * @see WakeWord
     */
    public void setWakeWord(String wakeWord) {
        this.wakeWord = wakeWord;
    }

    /**
     * <p>
     * A wake word for Alexa, Echo, Amazon, or a computer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA, AMAZON, ECHO, COMPUTER
     *
     * @param wakeWord <p>
     *            A wake word for Alexa, Echo, Amazon, or a computer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WakeWord
     */
    public CreateProfileRequest withWakeWord(String wakeWord) {
        this.wakeWord = wakeWord;
        return this;
    }

    /**
     * <p>
     * A wake word for Alexa, Echo, Amazon, or a computer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA, AMAZON, ECHO, COMPUTER
     *
     * @param wakeWord <p>
     *            A wake word for Alexa, Echo, Amazon, or a computer.
     *            </p>
     * @see WakeWord
     */
    public void setWakeWord(WakeWord wakeWord) {
        this.wakeWord = wakeWord.toString();
    }

    /**
     * <p>
     * A wake word for Alexa, Echo, Amazon, or a computer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALEXA, AMAZON, ECHO, COMPUTER
     *
     * @param wakeWord <p>
     *            A wake word for Alexa, Echo, Amazon, or a computer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WakeWord
     */
    public CreateProfileRequest withWakeWord(WakeWord wakeWord) {
        this.wakeWord = wakeWord.toString();
        return this;
    }

    /**
     * <p>
     * The locale of the room profile. (This is currently only available to a
     * limited preview audience.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The locale of the room profile. (This is currently only available
     *         to a limited preview audience.)
     *         </p>
     */
    public String getLocale() {
        return locale;
    }

    /**
     * <p>
     * The locale of the room profile. (This is currently only available to a
     * limited preview audience.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param locale <p>
     *            The locale of the room profile. (This is currently only
     *            available to a limited preview audience.)
     *            </p>
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale of the room profile. (This is currently only available to a
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
     *            The locale of the room profile. (This is currently only
     *            available to a limited preview audience.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProfileRequest withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * <p>
     * The user-specified token that is used during the creation of a profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         The user-specified token that is used during the creation of a
     *         profile.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * The user-specified token that is used during the creation of a profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param clientRequestToken <p>
     *            The user-specified token that is used during the creation of a
     *            profile.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The user-specified token that is used during the creation of a profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param clientRequestToken <p>
     *            The user-specified token that is used during the creation of a
     *            profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProfileRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * Whether room profile setup is enabled.
     * </p>
     *
     * @return <p>
     *         Whether room profile setup is enabled.
     *         </p>
     */
    public Boolean isSetupModeDisabled() {
        return setupModeDisabled;
    }

    /**
     * <p>
     * Whether room profile setup is enabled.
     * </p>
     *
     * @return <p>
     *         Whether room profile setup is enabled.
     *         </p>
     */
    public Boolean getSetupModeDisabled() {
        return setupModeDisabled;
    }

    /**
     * <p>
     * Whether room profile setup is enabled.
     * </p>
     *
     * @param setupModeDisabled <p>
     *            Whether room profile setup is enabled.
     *            </p>
     */
    public void setSetupModeDisabled(Boolean setupModeDisabled) {
        this.setupModeDisabled = setupModeDisabled;
    }

    /**
     * <p>
     * Whether room profile setup is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param setupModeDisabled <p>
     *            Whether room profile setup is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProfileRequest withSetupModeDisabled(Boolean setupModeDisabled) {
        this.setupModeDisabled = setupModeDisabled;
        return this;
    }

    /**
     * <p>
     * The maximum volume limit for a room profile.
     * </p>
     *
     * @return <p>
     *         The maximum volume limit for a room profile.
     *         </p>
     */
    public Integer getMaxVolumeLimit() {
        return maxVolumeLimit;
    }

    /**
     * <p>
     * The maximum volume limit for a room profile.
     * </p>
     *
     * @param maxVolumeLimit <p>
     *            The maximum volume limit for a room profile.
     *            </p>
     */
    public void setMaxVolumeLimit(Integer maxVolumeLimit) {
        this.maxVolumeLimit = maxVolumeLimit;
    }

    /**
     * <p>
     * The maximum volume limit for a room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxVolumeLimit <p>
     *            The maximum volume limit for a room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProfileRequest withMaxVolumeLimit(Integer maxVolumeLimit) {
        this.maxVolumeLimit = maxVolumeLimit;
        return this;
    }

    /**
     * <p>
     * Whether PSTN calling is enabled.
     * </p>
     *
     * @return <p>
     *         Whether PSTN calling is enabled.
     *         </p>
     */
    public Boolean isPSTNEnabled() {
        return pSTNEnabled;
    }

    /**
     * <p>
     * Whether PSTN calling is enabled.
     * </p>
     *
     * @return <p>
     *         Whether PSTN calling is enabled.
     *         </p>
     */
    public Boolean getPSTNEnabled() {
        return pSTNEnabled;
    }

    /**
     * <p>
     * Whether PSTN calling is enabled.
     * </p>
     *
     * @param pSTNEnabled <p>
     *            Whether PSTN calling is enabled.
     *            </p>
     */
    public void setPSTNEnabled(Boolean pSTNEnabled) {
        this.pSTNEnabled = pSTNEnabled;
    }

    /**
     * <p>
     * Whether PSTN calling is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pSTNEnabled <p>
     *            Whether PSTN calling is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProfileRequest withPSTNEnabled(Boolean pSTNEnabled) {
        this.pSTNEnabled = pSTNEnabled;
        return this;
    }

    /**
     * <p>
     * The meeting room settings of a room profile.
     * </p>
     *
     * @return <p>
     *         The meeting room settings of a room profile.
     *         </p>
     */
    public CreateMeetingRoomConfiguration getMeetingRoomConfiguration() {
        return meetingRoomConfiguration;
    }

    /**
     * <p>
     * The meeting room settings of a room profile.
     * </p>
     *
     * @param meetingRoomConfiguration <p>
     *            The meeting room settings of a room profile.
     *            </p>
     */
    public void setMeetingRoomConfiguration(CreateMeetingRoomConfiguration meetingRoomConfiguration) {
        this.meetingRoomConfiguration = meetingRoomConfiguration;
    }

    /**
     * <p>
     * The meeting room settings of a room profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param meetingRoomConfiguration <p>
     *            The meeting room settings of a room profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProfileRequest withMeetingRoomConfiguration(
            CreateMeetingRoomConfiguration meetingRoomConfiguration) {
        this.meetingRoomConfiguration = meetingRoomConfiguration;
        return this;
    }

    /**
     * <p>
     * The tags for the profile.
     * </p>
     *
     * @return <p>
     *         The tags for the profile.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the profile.
     * </p>
     *
     * @param tags <p>
     *            The tags for the profile.
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
     * The tags for the profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProfileRequest withTags(Tag... tags) {
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
     * The tags for the profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProfileRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getProfileName() != null)
            sb.append("ProfileName: " + getProfileName() + ",");
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getSetupModeDisabled() != null)
            sb.append("SetupModeDisabled: " + getSetupModeDisabled() + ",");
        if (getMaxVolumeLimit() != null)
            sb.append("MaxVolumeLimit: " + getMaxVolumeLimit() + ",");
        if (getPSTNEnabled() != null)
            sb.append("PSTNEnabled: " + getPSTNEnabled() + ",");
        if (getMeetingRoomConfiguration() != null)
            sb.append("MeetingRoomConfiguration: " + getMeetingRoomConfiguration() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode
                + ((getDistanceUnit() == null) ? 0 : getDistanceUnit().hashCode());
        hashCode = prime * hashCode
                + ((getTemperatureUnit() == null) ? 0 : getTemperatureUnit().hashCode());
        hashCode = prime * hashCode + ((getWakeWord() == null) ? 0 : getWakeWord().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProfileRequest == false)
            return false;
        CreateProfileRequest other = (CreateProfileRequest) obj;

        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null
                && other.getProfileName().equals(this.getProfileName()) == false)
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
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
