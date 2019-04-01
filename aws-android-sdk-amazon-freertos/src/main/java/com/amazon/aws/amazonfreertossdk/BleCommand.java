package com.amazon.aws.amazonfreertossdk;

import lombok.Getter;

/**
 * This class defines the BLE command that is sent from SDK to device.
 */
@Getter
public class BleCommand {
    enum CommandType {
        WRITE_DESCRIPTOR,
        WRITE_CHARACTERISTIC,
        READ_CHARACTERISTIC
    }

    /**
     * The type of the BLE command.
     */
    private CommandType type;

    /**
     * The characteristic uuid of the BLE command.
     */
    private String characteristicUuid;

    /**
     * The service uuid of the BLE command.
     */
    private String serviceUuid;

    /**
     * The data to be sent with the BLE command.
     */
    private byte[] data;

    /**
     * Construct a BLE command with data.
     * @param t the BLE command type.
     * @param cUuid the characteristic uuid.
     * @param sUuid the service uuid.
     * @param d the data to be sent with the BLE command.
     */
    public BleCommand(CommandType t, String cUuid, String sUuid, byte[] d) {
        type = t;
        characteristicUuid = cUuid;
        serviceUuid = sUuid;
        data = d;
    }

    /**
     * Construct a BLE command without any data.
     * @param t the BLE command type.
     * @param cUuid the characteristic uuid.
     * @param sUuid the service uuid.
     */
    public BleCommand(CommandType t, String cUuid, String sUuid) {
        type = t;
        characteristicUuid = cUuid;
        serviceUuid = sUuid;
        data = null;
    }
}
