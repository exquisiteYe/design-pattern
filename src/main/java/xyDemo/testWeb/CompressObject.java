package xyDemo.testWeb;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class CompressObject {
    public static byte[] writeCompressObject(Object obj) throws IOException {
        byte[] byteDate = null;
        ByteArrayOutputStream o = new ByteArrayOutputStream();
        GZIPOutputStream gzout = new GZIPOutputStream(o);
        ObjectOutputStream out = new ObjectOutputStream(gzout);
        out.writeObject(obj);
        out.flush();
        out.close();
        gzout.close();
        byteDate = o.toByteArray();
        o.close();
        return byteDate;
    }

    public static Object readCompressObject(byte[] byteDate) throws IOException, ClassNotFoundException {
        Object obj = null;
        ByteArrayInputStream i = new ByteArrayInputStream(byteDate);
        GZIPInputStream gzin = new GZIPInputStream(i);
        ObjectInputStream in = new ObjectInputStream(gzin);
        obj = in.readObject();
        i.close();
        gzin.close();
        in.close();
        return obj;
    }

    public static void main(String[] args) {
        testListMap();

    }

    public static void testDog() {
        try {
            Dog xiaoDingDang = new Dog("小叮当", 2, "yellow");
            byte[] bytes = CompressObject.writeCompressObject(xiaoDingDang);
            Object deXDD = readCompressObject(bytes);
            Dog newXDD = (Dog) deXDD;
            System.out.println(newXDD.toString());

        } catch (IOException | ClassNotFoundException e) {

        }
    }
    public static void testListMap(){
        try {
            Dog xiaoDingDang = new Dog("小叮当", 2, "yellow");
            List<Map<String, Object>> data = new ArrayList<>();
            Map<String, Object> map = new HashMap<>();
            map.put("1", xiaoDingDang);
            map.put("2", 2);
            map.put("3", "stringss");
            data.add(map);
            byte[] bytes = CompressObject.writeCompressObject(data);
            List<Map<String, Object>> listMap = (List<Map<String, Object>>) readCompressObject(bytes);
            System.out.println(listMap.toString());

        } catch (IOException | ClassNotFoundException e) {

        }
    }
}
