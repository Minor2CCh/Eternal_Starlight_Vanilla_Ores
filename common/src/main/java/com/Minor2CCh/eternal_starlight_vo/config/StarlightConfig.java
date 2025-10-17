package com.Minor2CCh.eternal_starlight_vo.config;


public class StarlightConfig {
    public Boolean ReduceOres = false;
    public Boolean ExtraOrePerBiome = true;
    public Boolean GenerateQuartz = true;
    public void fillDefaults() {
        if (ReduceOres == null)
            ReduceOres = false;
        if (ExtraOrePerBiome == null)
            ExtraOrePerBiome = true;
        if (GenerateQuartz == null)
            GenerateQuartz = true;
    }
}
