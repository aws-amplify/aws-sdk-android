package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.mobileconnectors.s3.receiver.NetworkInfoReceiver;

/**
 * Created by <a href="mailto:Dmitry.Gorohov@ebuilder.com">Dmitry Gorohov</a>
 */
public class TransferConfiguration {

    public TransferConfiguration() {
        connectionCheckType = NetworkInfoReceiver.Type.ANY;
    }

    /**
     * Type of network connection validator.
     */
    private NetworkInfoReceiver.Type connectionCheckType;

    public NetworkInfoReceiver.Type getConnectionCheckType() {
        return connectionCheckType;
    }

    public void setConnectionCheckType(final NetworkInfoReceiver.Type connectionCheckType) {
        this.connectionCheckType = connectionCheckType;
    }

    public TransferConfiguration withConnectionCheckType(final NetworkInfoReceiver.Type connectionCheckType) {
        this.connectionCheckType = connectionCheckType;
        return this;
    }
}
