package com.Minor2CCh.eternal_starlight_vo.config;

import com.Minor2CCh.eternal_starlight_vo.Eternal_starlight_vo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.loader.api.FabricLoader;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class StarlightConfigLoader {
    public static File DIR = FabricLoader.getInstance().getConfigDir().toFile();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final String FILENAME = Eternal_starlight_vo.MOD_ID+".json";
    private static final Path CONFIG_PATH = Path.of(new File(DIR,FILENAME).getPath());
    private static StarlightConfig modConfig;
    public static void load(){
        System.out.println(CONFIG_PATH);
        if (Files.exists(CONFIG_PATH)) {
            try (Reader reader = Files.newBufferedReader(CONFIG_PATH)) {
                modConfig = GSON.fromJson(reader, StarlightConfig.class);
            } catch (IOException e) {
                System.err.println("Failed to load config: " + e.getMessage());
                modConfig = new StarlightConfig();
            }
            modConfig.fillDefaults(); // ここで新フィールド補完
        } else {
            modConfig = new StarlightConfig();
        }
        save(); // 初回生成
    }
    public static void save() {
        try {
            Files.createDirectories(CONFIG_PATH.getParent());
            try (Writer writer = Files.newBufferedWriter(CONFIG_PATH)) {
                GSON.toJson(modConfig, writer);
                //System.out.println("Create Success:"+CONFIG_PATH);
            }
        } catch (IOException e) {
            System.err.println("Failed to save config: " + e.getMessage());
        }
    }
    public static StarlightConfig getConfig() {
        return modConfig;
    }

}
