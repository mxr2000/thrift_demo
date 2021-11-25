package com.mxr.thrift.client;

import com.mxr.thrift.sdk.helloService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

public class Client {
    public static void main(String[] args) {
        System.out.println("客户端启动....");
        try (TTransport transport = new TSocket("localhost", 9898)) {
            // 协议要和服务端一致
            TProtocol protocol = new TBinaryProtocol(transport);
            helloService.Client client = new helloService.Client(protocol);
            transport.open();
            String result = client.getMessage("哈哈");
            System.out.println(result);
        } catch (TException e) {
            e.printStackTrace();
        }
    }
}
