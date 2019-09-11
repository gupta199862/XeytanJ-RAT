package com.melardev.xeytanj.logger;

public interface ILogger {
    public void debug(String s);
    public void wran(String s);
    public void error(String s);
    public void errorFormat(String s, String... args);
    public void trace(String s);

    void traceCurrentMethodName();
}
