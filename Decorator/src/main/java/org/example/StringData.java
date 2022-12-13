package org.example;

import lombok.AllArgsConstructor;

import java.nio.charset.StandardCharsets;

@lombok.Data
@AllArgsConstructor
public class StringData implements Data {
    private String data;

    @Override
    public byte[] toBytes() {
        return data.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public Data fromBytes(byte[] bytes) {
        return new StringData(new String(bytes, StandardCharsets.UTF_8));
    }
}
