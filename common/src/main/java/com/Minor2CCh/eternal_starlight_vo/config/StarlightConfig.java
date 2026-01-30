package com.Minor2CCh.eternal_starlight_vo.config;


public class StarlightConfig {
    private Boolean ReduceOres = false;
    private Boolean ExtraOrePerBiome = true;
    private Boolean GenerateQuartz = true;
    public void fillDefaults() {
        if (ReduceOres == null)
            ReduceOres = false;
        if (ExtraOrePerBiome == null)
            ExtraOrePerBiome = true;
        if (GenerateQuartz == null)
            GenerateQuartz = true;
    }
    public boolean getReduceOres() {
        return this.ReduceOres;
    }
    public boolean getExtraOrePerBiome() {
        return this.ExtraOrePerBiome;
    }
    public boolean getGenerateQuartz() {
        return this.GenerateQuartz;
    }
}
