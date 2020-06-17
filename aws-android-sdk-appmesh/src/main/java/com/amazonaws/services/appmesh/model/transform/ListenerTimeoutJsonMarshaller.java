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

package com.amazonaws.services.appmesh.model.transform;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ListenerTimeout
 */
class ListenerTimeoutJsonMarshaller {

    public void marshall(ListenerTimeout listenerTimeout, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (listenerTimeout.getGrpc() != null) {
            GrpcTimeout grpc = listenerTimeout.getGrpc();
            jsonWriter.name("grpc");
            GrpcTimeoutJsonMarshaller.getInstance().marshall(grpc, jsonWriter);
        }
        if (listenerTimeout.getHttp() != null) {
            HttpTimeout http = listenerTimeout.getHttp();
            jsonWriter.name("http");
            HttpTimeoutJsonMarshaller.getInstance().marshall(http, jsonWriter);
        }
        if (listenerTimeout.getHttp2() != null) {
            HttpTimeout http2 = listenerTimeout.getHttp2();
            jsonWriter.name("http2");
            HttpTimeoutJsonMarshaller.getInstance().marshall(http2, jsonWriter);
        }
        if (listenerTimeout.getTcp() != null) {
            TcpTimeout tcp = listenerTimeout.getTcp();
            jsonWriter.name("tcp");
            TcpTimeoutJsonMarshaller.getInstance().marshall(tcp, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ListenerTimeoutJsonMarshaller instance;

    public static ListenerTimeoutJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListenerTimeoutJsonMarshaller();
        return instance;
    }
}
