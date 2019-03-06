package com.amazonaws.mobile.client;

import com.amazonaws.mobile.client.internal.ReturningRunnable;
import com.amazonaws.mobile.client.results.Device;
import com.amazonaws.mobile.client.results.ListDevicesResult;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoDevice;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider;
import com.amazonaws.services.cognitoidentityprovider.model.AttributeType;
import com.amazonaws.services.cognitoidentityprovider.model.DeviceRememberedStatusType;
import com.amazonaws.services.cognitoidentityprovider.model.DeviceType;
import com.amazonaws.services.cognitoidentityprovider.model.ForgetDeviceRequest;
import com.amazonaws.services.cognitoidentityprovider.model.GetDeviceRequest;
import com.amazonaws.services.cognitoidentityprovider.model.GetDeviceResult;
import com.amazonaws.services.cognitoidentityprovider.model.ListDevicesRequest;
import com.amazonaws.services.cognitoidentityprovider.model.UpdateDeviceStatusRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DeviceOperations {
    private final AWSMobileClient mobileClient;
    private final AmazonCognitoIdentityProvider userpoolLL;

    DeviceOperations(final AWSMobileClient mobileClient,
                     final AmazonCognitoIdentityProvider userpoolLL) {
        this.mobileClient = mobileClient;
        this.userpoolLL = userpoolLL;
    }

    /**
     * Retrieves the device information for this device.
     *
     * @return device details
     */
    public Device get() throws Exception {
        return _getDevice(null).await();
    }

    /**
     * Retrieves the device information for this device.
     *
     * @return device details
     */
    public void get(final Callback<Device> callback) {
        _getDevice(null).async(callback);
    }

    /**
     * Retrieves the device information for the device id provided.
     *
     * @return device details
     */
    public Device get(final String deviceId) throws Exception {
        return _getDevice(deviceId).await();
    }

    /**
     * Retrieves the device information for the device id provided.
     *
     * @return device details
     */
    public void get(final String deviceId, final Callback<Device> callback) {
        _getDevice(deviceId).async(callback);
    }

    private ReturningRunnable<Device> _getDevice(final String deviceKey) {
        return new ReturningRunnable<Device>() {
            @Override
            public Device run() throws Exception {
                CognitoDevice cognitoDevice = getCognitoDevice(deviceKey);

                final GetDeviceRequest getDeviceRequest = new GetDeviceRequest();
                getDeviceRequest.setAccessToken(mobileClient.getTokens().getAccessToken().getTokenString());
                getDeviceRequest.setDeviceKey(cognitoDevice.getDeviceKey());
                final GetDeviceResult getDeviceResult = userpoolLL.getDevice(getDeviceRequest);

                return marshallDeviceTypeToDevice(getDeviceResult.getDevice());
            }
        };
    }

    /**
     * Lists the devices attached to the user's account.
     *
     * @return a device list with a pagination token to retrieve more if applicable
     */
    public ListDevicesResult list() throws Exception {
        return _listDevices(60, null).await();
    }

    /**
     * Lists the devices attached to the user's account.
     *
     * @return a device list with a pagination token to retrieve more if applicable
     */
    public void list(final Callback<ListDevicesResult> callback) {
        _listDevices(60, null).async(callback);
    }

    /**
     * Lists the devices attached to the user's account.
     *
     * @param limit the number of devices to return per page. Max allows by service is 60.
     * @param paginationToken the string returned by a previous list call to fetched the next
     *                        page of results.
     * @return
     */
    public ListDevicesResult list(final Integer limit, final String paginationToken) throws Exception {
        return _listDevices(limit, paginationToken).await();
    }

    /**
     * Lists the devices attached to the user's account.
     *
     * @param limit the number of devices to return per page. Max allows by service is 60.
     * @param paginationToken the string returned by a previous list call to fetched the next
     *                        page of results.
     * @return
     */
    public void list(final Integer limit,
                     final String paginationToken,
                     Callback<ListDevicesResult> callback) {
        _listDevices(limit, paginationToken).async(callback);
    }

    private ReturningRunnable<ListDevicesResult> _listDevices(final Integer limit,
                                                              final String paginationToken) {
        return new ReturningRunnable<ListDevicesResult>() {
            @Override
            public ListDevicesResult run() throws Exception {
                final ListDevicesRequest listDevicesRequest = new ListDevicesRequest();
                listDevicesRequest.setAccessToken(mobileClient.getTokens().getAccessToken().getTokenString());
                listDevicesRequest.setLimit(limit);
                listDevicesRequest.setPaginationToken(paginationToken);
                final com.amazonaws.services.cognitoidentityprovider.model.ListDevicesResult listDevicesResult =
                        userpoolLL.listDevices(listDevicesRequest);
                final ArrayList<Device> devices = new ArrayList<Device>(limit);
                for (DeviceType deviceType : listDevicesResult.getDevices()) {
                    devices.add(marshallDeviceTypeToDevice(deviceType));
                }
                return new ListDevicesResult(devices, listDevicesResult.getPaginationToken());
            }
        };
    }

    private Device marshallDeviceTypeToDevice(DeviceType deviceType) {
        Map<String, String> deviceAttributes = new HashMap<String, String>();
        for (AttributeType attributeType : deviceType.getDeviceAttributes()) {
            deviceAttributes.put(attributeType.getName(), attributeType.getValue());
        }
        return new Device(deviceType.getDeviceKey(), deviceAttributes,
                deviceType.getDeviceCreateDate(),
                deviceType.getDeviceLastModifiedDate(),
                deviceType.getDeviceLastAuthenticatedDate());
    }

    /**
     * Update this device status to be remembered or not remembered
     *
     * @param rememberDevice true to set the device as remembered, false otherwise
     * @throws Exception
     */
    public void updateStatus(final boolean rememberDevice) throws Exception {
        _rememberDevice(null, rememberDevice).await();
    }

    /**
     * Update this device status to be remembered or not remembered
     *
     * @param rememberDevice true to set the device as remembered, false otherwise
     * @throws Exception
     */
    public void updateStatus(final boolean rememberDevice, final Callback<Void> callback) {
        _rememberDevice(null, rememberDevice).async(callback);
    }

    /**
     * Update the device status to be remembered or not remembered
     *
     * @param rememberDevice true to set the device as remembered, false otherwise
     * @throws Exception
     */
    public void updateStatus(final String deviceKey, final boolean rememberDevice) throws Exception {
        _rememberDevice(deviceKey, rememberDevice).await();
    }

    public void updateStatus(final String deviceKey, final boolean rememberDevice, final Callback<Void> callback) {
        _rememberDevice(deviceKey, rememberDevice).async(callback);
    }

    private ReturningRunnable<Void> _rememberDevice(final String deviceKey,
                                                    final boolean rememberDevice) {
        return new ReturningRunnable<Void>() {
            @Override
            public Void run() throws Exception {
                CognitoDevice cognitoDevice = getCognitoDevice(deviceKey);

                final UpdateDeviceStatusRequest updateDeviceStatusRequest =
                        new UpdateDeviceStatusRequest()
                                .withAccessToken(mobileClient.getTokens().getAccessToken().getTokenString())
                                .withDeviceKey(cognitoDevice.getDeviceKey())
                                .withDeviceRememberedStatus(rememberDevice ?
                                        DeviceRememberedStatusType.Remembered :
                                        DeviceRememberedStatusType.Not_remembered);

                userpoolLL.updateDeviceStatus(updateDeviceStatusRequest);
                return null;
            }
        };
    }

    /**
     * Forget the current device. The device will no longer be tracked.
     * Note: Calling {@link #updateStatus(boolean)} after {@link #forget()} will fail.
     * The user needs to sign-out and sign-in again to be able to update the device status.
     */
    public void forget() throws Exception {
        _forgetDevice(null).await();
    }

    /**
     * Forget the current device. The device will no longer be tracked.
     * Note: Calling {@link #updateStatus(boolean)} after {@link #forget()} will fail.
     * The user needs to sign-out and sign-in again to be able to update the device status.
     */
    public void forget(final Callback<Void> callback) {
        _forgetDevice(null).async(callback);
    }

    /**
     * Forget the device identified by the deviceKey. The device will no longer be tracked.
     * Note: Calling {@link #updateStatus(boolean)} after {@link #forget()} will fail.
     * The user needs to sign-out and sign-in again to be able to update the device status.
     *
     * @param deviceKey the device identifier
     */
    public void forget(final String deviceKey) throws Exception {
        _forgetDevice(deviceKey).await();
    }

    /**
     * Forget the device identified by the deviceKey. The device will no longer be tracked.
     * Note: Calling {@link #updateStatus(boolean)} after {@link #forget()} will fail.
     * The user needs to sign-out and sign-in again to be able to update the device status.
     *
     * @param deviceKey the device identifier
     */
    public void forget(final String deviceKey, final Callback<Void> callback) {
        _forgetDevice(deviceKey).async(callback);
    }

    private ReturningRunnable<Void> _forgetDevice(final String deviceKey) {
        return new ReturningRunnable<Void>() {
            @Override
            public Void run() throws Exception {
                CognitoDevice cognitoDevice = getCognitoDevice(deviceKey);

                final ForgetDeviceRequest forgetDeviceRequest = new ForgetDeviceRequest()
                        .withAccessToken(mobileClient.getTokens().getAccessToken().getTokenString())
                        .withDeviceKey(cognitoDevice.getDeviceKey());

                userpoolLL.forgetDevice(forgetDeviceRequest);
                return null;
            }
        };
    }

    /**
     * Retrieves an empty device object. If the deviceKey is null, the current device's deviceKey
     * is used.
     *
     * @param deviceKey device identifier
     * @return empty device object with deviceKey and environment variables populated
     */
    private CognitoDevice getCognitoDevice(String deviceKey) {
        return new CognitoDevice(deviceKey != null ? deviceKey :
                mobileClient.userpool.getCurrentUser().thisDevice().getDeviceKey(),
                null,
                null,
                null,
                null,
                mobileClient.userpool.getCurrentUser(),
                mobileClient.mContext
        );
    }

}
