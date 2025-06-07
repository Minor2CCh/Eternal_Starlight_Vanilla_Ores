package com.Minor2CCh.eternal_starlight_vo.config;

import com.Minor2CCh.eternal_starlight_vo.Eternal_starlight_vo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import net.fabricmc.loader.api.FabricLoader;
import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;

public class StarlightConfig {
    public static File DIR = FabricLoader.getInstance().getConfigDir().toFile();
    public static File FILE = new File(DIR, (Eternal_starlight_vo.MOD_ID+".json"));

    private static Map<String, Object> CONFIG_MAP = new LinkedHashMap<>();

    public static void initialize(){
        setDefault();
        if (!load())
            System.out.println("SaveSuccess:"+save());
    }
    public static Object get(String key) {
        return CONFIG_MAP.get(key);
    }
    public static void setDefault() {
        setBoolean("ReduceOres", false);
        setBoolean("ExtraOrePerBiome", true);
    }
    public static void setBoolean(String key, boolean value) {
        CONFIG_MAP.put(key, value);
    }
    public static Boolean getBoolean(String key) {
        Object value = get(key);
        if (value instanceof Integer i) {
            return i != 0;
        }
        if (value instanceof Boolean)
            return (Boolean) value;
        if (value instanceof String)
            return Boolean.getBoolean((String) value);

        return null;
    }
    public static Boolean getBoolean(String key, Boolean defaultBoolean) {
        Boolean retBoolean = getBoolean(key);
        return retBoolean == null ? defaultBoolean : retBoolean;
    }
    public static boolean save() {
        if (!DIR.exists()){
            DIR.mkdirs();
        }
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(CONFIG_MAP);
        return fileWriteContents(FILE, json);
    }

    public static boolean load() {
        if (!DIR.exists()){
            DIR.mkdirs();
        }
        if (FILE.exists()) {
            String json = fileReadContents(FILE);
            Gson gson = new Gson();
            Type jsonMap = new TypeToken<LinkedHashMap<String, Object>>() {
            }.getType();
            CONFIG_MAP = gson.fromJson(json, jsonMap);
            return true;
        }

        return false;
    }
    public static boolean fileWriteContents(File file, String contents) {
        try {
            PrintWriter writer = new PrintWriter(
                    new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8)));
            writer.println(contents);
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    public static String fileReadContents(File file) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
            String line;
            StringBuilder contents = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                contents.append(line).append("\n");
            }
            reader.close();
            return contents.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
