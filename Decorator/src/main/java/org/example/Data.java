package org.example;

public interface Data {
    byte[] toBytes();
    Data fromBytes(byte[] bytes);
}
