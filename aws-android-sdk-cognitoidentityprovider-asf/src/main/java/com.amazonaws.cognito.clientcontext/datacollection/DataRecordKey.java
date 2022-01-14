/*
 * Copyright 2017-2022 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.cognito.clientcontext.datacollection;

/**
 * Constants in this class contains the fields that are extracted from the
 * device. It enlists the constants used as a key for user context data fields.
 */
public class DataRecordKey {

    /*
     * Keys for application related data.
     */

    /**
     * Name of the application using user pools.
     */
    public static final String APP_NAME = "ApplicationName";
    /**
     * Target SDK version for the application.
     */
    public static final String APP_TARGET_SDK = "ApplicationTargetSdk";
    /**
     * Version of the application installed on device.
     */
    public static final String APP_VERSION = "ApplicationVersion";

    /*
     * Keys for device build information related data. Refer android
     * documentation-https://developer.android.com/reference/android/os/Build.
     * html
     */

    /**
     * Boot-loader version of the system
     */
    public static final String BOOTLOADER = "Bootloader";
    /**
     * The consumer-visible brand with which the product/hardware will be
     * associated
     */
    public static final String BRAND = "DeviceBrand";
    /**
     * A string that uniquely identifies this build on device.
     */
    public static final String FINGERPRINT = "DeviceFingerprint";
    /**
     * Name of the underlying device hardware.
     */
    public static final String HARDWARE = "DeviceHardware";
    /**
     * The manufacturer of the product/hardware.
     */
    public static final String MANUFACTURER = "DeviceManufacturer";
    /**
     * The end-user-visible name for the end product.
     */
    public static final String MODEL = "DeviceName";
    /**
     * The name of the overall product.
     */
    public static final String PRODUCT = "Product";
    /**
     * The type of build, like "user" or "eng".
     */
    public static final String BUILD_TYPE = "BuildType";
    /**
     * The user-visible version string for Android release.
     */
    public static final String VERSION_RELEASE = "DeviceOsReleaseVersion";
    /**
     * The user-visible SDK version of the framework
     */
    public static final String VERSION_SDK = "DeviceSdkVersion";

    /*
     * Keys for device related information.
     */

    /**
     * DeviceId that Cognito has associated with the device
     */
    public static final String DEVICE_AGENT = "DeviceId";

    /**
     * Third party device id provided on the device
     */
    public static final String THIRD_PARTY_DEVICE_AGENT = "ThirdPartyDeviceId";

    /**
     * Platform like Android, iOS or JS.
     */
    public static final String PLATFORM = "Platform";
    /**
     * Device time zone.
     */
    public static final String TIMEZONE = "ClientTimezone";
    /**
     * Device display dimensions.
     */
    public static final String DEVICE_HEIGHT = "ScreenHeightPixels";
    public static final String DEVICE_WIDTH = "ScreenWidthPixels";
    /**
     * Language on device.
     */
    public static final String DEVICE_LANGUAGE = "DeviceLanguage";

    /*
     * Keys for telephony data from device. Refer
     * documentation-https://developer.android.com/reference/android/telephony/
     * TelephonyManager.html
     */

    /**
     * Does device has SIM card
     */
    public static final String HAS_ICC_CARD = "HasSimCard";
    /**
     * Is device network on roaming mode.
     */
    public static final String IS_NETWORK_ROAMING = "IsNetworkRoaming";
    /**
     * Device network operator.
     */
    public static final String NETWORK_OPERATOR = "Carrier";
    /**
     * Constant identifying Network type for current data connection.
     */
    public static final String NETWORK_TYPE = "NetworkType";
    /**
     * Constant that indicates the type of radio used to transmit voice calls
     * like GSM / CDMA / SIP
     */
    public static final String PHONE_TYPE = "PhoneType";
    /**
     * SIM provider's country code.
     */
    public static final String SIM_COUNTRY_ISO = "SimCountry";
    /**
     * provider of the SIM.
     */
    public static final String SIM_OPERATOR = "SimOperator";
}