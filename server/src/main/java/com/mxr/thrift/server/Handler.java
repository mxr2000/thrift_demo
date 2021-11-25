package com.mxr.thrift.server;

import com.mxr.thrift.sdk.helloService;
import org.apache.thrift.TException;

public class Handler implements helloService.Iface{
    @Override
    public String getMessage(String msg) throws TException {
        return msg;
    }
}
